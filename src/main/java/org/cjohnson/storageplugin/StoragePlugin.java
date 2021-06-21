package org.cjohnson.storageplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.cjohnson.storageplugin.command.StoragePluginCommand;

@SuppressWarnings("unused")
public class StoragePlugin extends JavaPlugin {
    public static String PLUGIN_NAME = StoragePlugin.class.getName();
    public static String PLUGIN_VERSION = "1.0.0-rev001-SNAPSHOT";

    @Override
    @SuppressWarnings("ConstantConditions")
    public void onEnable() {
        this.getCommand(StoragePluginCommand.ALIAS).setExecutor(new StoragePluginCommand());
    }

    @Override
    public void onDisable() {

    }


}
