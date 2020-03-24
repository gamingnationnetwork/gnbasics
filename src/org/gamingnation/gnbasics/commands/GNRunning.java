package org.gamingnation.gnbasics.commands;

import org.gamingnation.gnbasics.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GNRunning implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public GNRunning(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("gnrunning").setExecutor(this);
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		// TODO Auto-generated method stub
		
		//handles the correct response if the command was sent by the server.
		if (!(sender instanceof Player)) {
			sender.sendMessage("This server is running GNBasics");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(p.hasPermission("gnrunning.use")) {
			p.sendMessage("This server is running GNBasics");
			return true;
		} else {
			p.sendMessage("You don't have permission to run this command.");
		}
		
		return false;
	}
	
}
