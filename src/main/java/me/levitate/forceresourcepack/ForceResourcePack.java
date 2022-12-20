package me.levitate.forceresourcepack;

import me.levitate.forceresourcepack.events.PlayerJoin;
import me.levitate.forceresourcepack.events.ResourcePackStatus;
import org.bukkit.plugin.java.JavaPlugin;

public final class ForceResourcePack extends JavaPlugin {
    private static ForceResourcePack instance;

    @Override
    public void onEnable() {
        instance = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new ResourcePackStatus(), this);
    }

    public static ForceResourcePack getInstance() {
        return instance;
    }
}
