package dev._2lstudios.gameessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class CraftCMD implements CommandExecutor {
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender.hasPermission("essentials.craft")) {
            if (sender instanceof Player) {
                final Player player = (Player) sender;
                player.openWorkbench(player.getLocation(), true);
            } else {
                sender.sendMessage(ChatColor.RED + "No puedes ejecutar este comando desde la consola!");
            }
        } else {
            sender.sendMessage(ChatColor.RED + "Permisos insuficientes!");
        }
        return true;
    }
}
