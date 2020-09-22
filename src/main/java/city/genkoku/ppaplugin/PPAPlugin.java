package city.genkoku.ppaplugin;

import net.md_5.bungee.api.plugin.Plugin;

public final class PPAPlugin extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Lets POOP!");
        getProxy().getPluginManager().registerCommand(this, new PPAPcmd("ppap"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Goodbye POOP!");
    }
}
