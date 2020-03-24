package org.gamingnation.gnbasics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.gamingnation.gnbasics.Main;

public class GFly implements CommandExecutor{
	
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public GFly(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("gfly").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		// TODO Auto-generated method stub
		
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players can run this command!");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(p.hasPermission("gfly.use")) {
			//do stuff
			
			if(!(p.getAllowFlight())) {
				p.setAllowFlight(true);
				p.sendMessage("Flying has been enabled.");
				return true;
			} else {
				p.setAllowFlight(false);
				p.sendMessage("Flying has been disabled.");
				return true;
			}
			
		} else {
			p.sendMessage("You don't have permission to run this command.");
		}
		
		return false;
	}

}
