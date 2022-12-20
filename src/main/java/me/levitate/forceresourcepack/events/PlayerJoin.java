package me.levitate.forceresourcepack.events;

import me.levitate.forceresourcepack.ForceResourcePack;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player plr = event.getPlayer();
        plr.setResourcePack(ForceResourcePack.getInstance().getConfig().getString("url"));
    }
}
