package org.cjohnson.storageplugin.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.cjohnson.storageplugin.StoragePlugin;
import org.jetbrains.annotations.NotNull;

public class StoragePluginCommand implements CommandExecutor {
    public static final String ALIAS = "storageplugin";
    public static final String PLUGIN_MESSAGE = """
        &e%s &7version &e%s &7by &ecjohnson &7and &eschelcc
        &e/storageplugin help &7for help.
        &eGithub Repository &7at &ehttps://github.com/cjohnson/StoragePlugin
        """;

    /**
     * Executes the given command, returning its success.
     * <br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (args.length == 0) {
            displayPluginMessage(sender);
            return true;
        }

        return true;
    }

    public void displayPluginMessage(CommandSender sender) {
        String message =
            StoragePluginCommand.PLUGIN_MESSAGE
                .formatted(StoragePlugin.PLUGIN_NAME, StoragePlugin.PLUGIN_VERSION);
        message = ChatColor.translateAlternateColorCodes('&', message);
        sender.sendMessage(message);
    }
}
