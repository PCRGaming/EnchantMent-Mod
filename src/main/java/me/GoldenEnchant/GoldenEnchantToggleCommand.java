package me.GoldenEnchant;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class GoldenEnchantToggleCommand extends CommandBase {

	public static boolean goldToggled = true;

	@Override
	public String getCommandName() {
		return "ge";
	}

	@Override
	public String getCommandUsage(ICommandSender arg0) {
		return null;
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 0;
	}

	@Override
	public void processCommand(ICommandSender arg0, String[] arg1) throws CommandException {
		EntityPlayer player = (EntityPlayer) arg0;
		goldToggled = !goldToggled;
		player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Golden enchants have been set to " + EnumChatFormatting.DARK_GREEN + goldToggled + EnumChatFormatting.DARK_GREEN + ". "));


}}
