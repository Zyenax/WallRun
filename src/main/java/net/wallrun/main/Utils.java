package net.wallrun.main;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;

public class Utils implements Listener{
	
	@SuppressWarnings("unused")
	private static WallRun plugin;

	public Utils(WallRun hub) {
		Utils.plugin = hub;
	}

	public static String color(String string){
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
	public static int randomNum(int Low, int High){
		Random r = new Random();
		int R = r.nextInt(High-Low) + Low;
		return R;
	}
	
}
