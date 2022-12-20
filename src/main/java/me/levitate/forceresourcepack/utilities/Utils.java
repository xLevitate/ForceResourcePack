package me.levitate.forceresourcepack.utilities;

import org.bukkit.ChatColor;

public class Utils {
    public static String translateColor(String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }
}
