package com.tman0.lots;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.google.common.base.Joiner;
import com.tman0.lots.commands.Delete;
import com.tman0.lots.commands.Sql;

public class L implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias,String[] args) {
		if(args[0].toLowerCase() == "define")
		{
			sender.sendMessage(Lots.MessageTemplate + " Working on it...");
		}
		else if(args[0].toLowerCase() == "request")
		{
			sender.sendMessage(Lots.MessageTemplate + " Function not yet implemented. Please pester tman0 to do this.");
		}
		else if(args[0].toLowerCase() == "sell")
		{
			sender.sendMessage(Lots.MessageTemplate + " Function not yet implemented. Please pester tman0 to do this.");
		}
		else if(args[0].toLowerCase() == "reserve")
		{
			sender.sendMessage(Lots.MessageTemplate + " Function not yet implemented. Please pester tman0 to do this.");
		}
		else if(args[0].toLowerCase() == "delete")
		{
			if(args[1].toLowerCase() == "city") Delete.Execute(sender, true, args[2]);
			else if(args[1].toLowerCase() == "lot") Delete.Execute(sender, false, args[2]);
		}
		else if(args[0].toLowerCase() == "sql")
		{
			Sql.Execute(sender, Joiner.on("").join(args));
		}
		else if(args[0].toLowerCase() == "assign")
		{
			sender.sendMessage(Lots.MessageTemplate + " Function not yet implemented. Please pester tman0 to do this.");
		}
		else if(args[0].toLowerCase() == "add")
		{
			sender.sendMessage(Lots.MessageTemplate + " Function not yet implemented. Please pester tman0 to do this.");
		}
		else if(args[0].toLowerCase() == "flag")
		{
			sender.sendMessage(Lots.MessageTemplate + " Function not yet implemented. Please pester tman0 to do this.");
		}
		else if(args[0].toLowerCase() == "list")
		{
			sender.sendMessage(Lots.MessageTemplate + " Function not yet implemented. Please pester tman0 to do this.");
		}
		else
		{
			if(sender.isOp()) sender.sendMessage(Lots.MessageTemplate + " Usage: /l <define|request|sell|reserve|delete|sql|assign|add|flag|list>");
			else sender.sendMessage(Lots.MessageTemplate + "Usage: /l <request|sell|reserve|add|flag|list>");
		}
		
		return true;
	}

}
