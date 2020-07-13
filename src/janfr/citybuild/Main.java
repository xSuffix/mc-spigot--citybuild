package janfr.citybuild;

import janfr.citybuild.commands.CmdCity;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin Citybuild has been enabled!");
        getCommand("city").setExecutor(new CmdCity());
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Citybuild has been disabled!");
    }

}
