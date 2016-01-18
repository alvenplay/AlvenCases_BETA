package me.alven.cases;

import me.alven.cases.commands.test;
import me.alven.cases.listener.Case;
import me.alven.cases.listener.StandardMenu;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		instance = this;
		
		getCommand("test").setExecutor(new test());

		getServer().getPluginManager().registerEvents(new Case(), this);
		getServer().getPluginManager().registerEvents(new StandardMenu(), this);
		
	}
	public void onDisable() {
		
	}
//-------------------------------------
	private static Main instance;
	public static Main getInst() {
		return instance;
	}
}
