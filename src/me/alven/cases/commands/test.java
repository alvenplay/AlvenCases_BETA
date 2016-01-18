package me.alven.cases.commands;

import me.alven.cases.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class test implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lab, String[] args) {

		Main.getInst().getServer().getScheduler().scheduleSyncDelayedTask(Main.getInst(), new Runnable(){
		    public void run(){
		        System.out.println("TEST");
		    }
		},20);
		
		return false;
	}

}
