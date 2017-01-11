package net.wallrun.main;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.scheduler.BukkitScheduler;

public class RunHandler implements Listener{
	
	public static HashMap<Player, Player> run = new HashMap<Player, Player>();
    private WallRun plugin;

    public RunHandler(WallRun listener) {
        this.plugin = listener;
    }
    
    //So do you see what is going on here?
    //so if a player tries to jump on bedrock they wallrun or something?
    // if the block to the left right back or front is bedrock send them at a velocity and make sure
    //that they arent in the hashmap and if they are then it doesnt do it but if they're not in it
    //it puts them in it and then makes them go through the air simulating a wallrun
    // what is hashmap
    //public static HashMap<Player, Player> run = new HashMap<Player, Player>();
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // that stores values like playerdata and other things you choose temporarily
    // ok
    //(!run.containsKey(player))
    // whats this
    // it checks if theyre in the hashmap
    // run is the name of the hasmap
    //public static HashMap<Player, Player> run = new HashMap<Player, Player>();
    //<Player, Player> run = new HashMap
    //run
    // ok
    // so a listener specifies the server to listen to \/ these methods? o ok o ko ko k so what are we doing now
    // a listener tells the main class to listen to anything that happens in this class and yes including these methods
    
    //ok so im gonna share a core plugin with you now and we are going to walk through it 
    //basically this core plugin has a lot of stuff to learn
    //ok?
    // ok
    
    // Why does it say containsKey what key???
    // key is a value so if it contains the players data
    //or if it contains the data you specified
    
    @EventHandler
    public void playermove(PlayerMoveEvent e) {
        final Player player = e.getPlayer();
        if (!run.containsKey(player)) {
            if ((player.getLocation().getBlock().getRelative(BlockFace.NORTH).getType() == Material.BEDROCK)) {
                player.setVelocity(player.getLocation().getDirection().multiply(0.8).setY(0.8));
                run.put(player, player);
                BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                scheduler.runTaskLater(plugin, new Runnable() {
                    public void run() {
                        run.remove(player);
                    }
                }, 3 * 20);
            } else if ((player.getLocation().getBlock().getRelative(BlockFace.WEST).getType() == Material.BEDROCK)) {
                player.setVelocity(player.getLocation().getDirection().multiply(0.8).setY(0.8));
                run.put(player, player);
                BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                scheduler.runTaskLater(plugin, new Runnable() {
                    public void run() {
                        run.remove(player);
                    }
                }, 3 * 20);
            } else if ((player.getLocation().getBlock().getRelative(BlockFace.EAST).getType() == Material.BEDROCK)) {
                player.setVelocity(player.getLocation().getDirection().multiply(0.8).setY(0.8));
                run.put(player, player);
                BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                scheduler.runTaskLater(plugin, new Runnable() {
                    public void run() {
                        run.remove(player);
                    }
                }, 3 * 20);
            } else if ((player.getLocation().getBlock().getRelative(BlockFace.SOUTH).getType() == Material.BEDROCK)) {
                player.setVelocity(player.getLocation().getDirection().multiply(0.8).setY(0.8));
                run.put(player, player);
                BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                scheduler.runTaskLater(plugin, new Runnable() {
                    public void run() {
                        run.remove(player);
                    }
                }, 3 * 20);
            }
        }
    }

} 
