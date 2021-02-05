package me.dreas.textcolor;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
	}
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		if(label.equalsIgnoreCase("textcolor")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;

				List<String> al = new ArrayList<>();
				 for(int i=0; i < args.length; i++){
					 String str = String.join(" ", args[i]);
					 al.add(str);
					 
					 }
				 String colorTexted = String.join(" ", al);

				player.chat(ChatColor.translateAlternateColorCodes('&', colorTexted));
				 
				return true;
			}
		}
		return false;
	}
}
