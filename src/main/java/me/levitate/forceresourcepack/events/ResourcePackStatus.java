package me.levitate.forceresourcepack.events;

import me.levitate.forceresourcepack.ForceResourcePack;
import me.levitate.forceresourcepack.utilities.Utils;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

public class ResourcePackStatus implements Listener {
    @EventHandler
    public void onResourcePackStatus(PlayerResourcePackStatusEvent event) {
        Player plr = event.getPlayer();

        if (event.getStatus() == PlayerResourcePackStatusEvent.Status.DECLINED || event.getStatus() == PlayerResourcePackStatusEvent.Status.FAILED_DOWNLOAD) {
            plr.kickPlayer(Utils.translateColor(ForceResourcePack.getInstance().getConfig().getString("kick-msg")));
        }
    }
}
