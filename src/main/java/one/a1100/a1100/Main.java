package one.a1100.a1100;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {
    PluginDescriptionFile pdf = this.getDescription();
    @Override
    public void onEnable() {
        getLogger().info(pdf.getName() + " " + pdf.getVersion() + " " + "enabled!");
        Objects.requireNonNull(getCommand("a1100a")).setExecutor(new CommandManager());
    }

    @Override
    public void onDisable() {
        getLogger().info(pdf.getName() + " " + pdf.getVersion() + " " + "disabled!");
    }

}
