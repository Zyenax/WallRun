package net.wallrun.main;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class WallRun extends JavaPlugin implements Listener {
	
	public static String name = Utils.color("&8&l[&c&lWallRun&8&l] ");

	public void onEnable(){
		Listeners();
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(Utils.color(name + "&a&lHas been enabled!"));
	}
	
	public void onDisable(){
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(Utils.color(name + "&c&lHas been disabled!"));
	}
	
	public void Listeners(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new RunHandler(this), this);
		pm.registerEvents(new Utils(this), this);
	}

}
