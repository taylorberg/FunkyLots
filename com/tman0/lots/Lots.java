package com.tman0.lots;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

public class Lots extends JavaPlugin {
	
	public static WorldGuardPlugin WorldGuard;
	public static PluginManager pm;
	public static L l = new L();
	public static String MessageTemplate = ChatColor.GRAY + "[" + ChatColor.RED + "Lots" + ChatColor.GRAY + "]" + ChatColor.GREEN;
	
	@Override
	public void onDisable() 
	{
		Bukkit.getLogger().info("[Lots] Shutting down...");
	}

	@Override
	public void onEnable() 
	{
		Bukkit.getLogger().info("[Lots] Starting up...");
		WorldGuard = (WorldGuardPlugin) Bukkit.getPluginManager().getPlugin("WorldGuard");
		if(WorldGuard == null)
		{
			Bukkit.getLogger().info("[Lots] Can't find WorldGuard! Not loading.");
		}
		pm = Bukkit.getPluginManager();
		// ** Register Events **
		// ** End Register Events **
		// ** Register Executor **
		this.getCommand("l").setExecutor(l);
	}
}
