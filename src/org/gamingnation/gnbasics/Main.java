package org.gamingnation.gnbasics;

import org.bukkit.plugin.java.JavaPlugin;
import org.gamingnation.gnbasics.commands.GFly;
import org.gamingnation.gnbasics.commands.GNRunning;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		//This is where you write the commands that have been implemented
		//Format: new commandName(this);
		new GNRunning(this);
		new GFly(this);
	}
	
}
