// Doctor Alexander Tran VII
package me.GoldenEnchant;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.EnumChatFormatting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = TheMod.MODID, version = TheMod.VERSION, clientSideOnly = true)
public class TheMod {
	public static final String MODID = "EnchantMent Mod";
    public static final String VERSION = "1.0";

    static Map<String, String> t6Enchants = new HashMap<String, String>();
    static Pattern pattern = Pattern.compile("");

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	FMLCommonHandler.instance().bus().register(this);
    	MinecraftForge.EVENT_BUS.register(this);
//Enrichment Only (Pink)
t6Enchants.put("9Chance V","dChance V");
t6Enchants.put("9Syphon V","dSyphon V");
t6Enchants.put("9Triple Strike V","dTriple Strike V");
t6Enchants.put("9Thunderbolt VI","dThunderbolt VI");
t6Enchants.put("9Thunderbolt V","dThunderbolt V");
t6Enchants.put("9Respite V","dRespite V");
t6Enchants.put("9Prosecute VI","dProsecute VI");
t6Enchants.put("9Prosecute V","dProsecute V");
t6Enchants.put("9Titan Killer VII","dTitan Killer VII");
t6Enchants.put("9Titan Killer VI","dTitan Killer VI");
t6Enchants.put("9Titan Killer V","dTitan Killer V");
//Turbo Crop EnchantMent (Green)
t6Enchants.put("9Turbo-Potato V","2Turbo-Potato V");
t6Enchants.put("9Turbo-Cane V","2Turbo-Cane V");
t6Enchants.put("9Turbo-Carrot V","2Turbo-Carrot V");
t6Enchants.put("9Turbo-Pumpkin V","2Turbo-Pumpkin V");
t6Enchants.put("9Turbo-Cocoa V","2Turbo-Cocoa V");
t6Enchants.put("9Turbo-Wheat V","2Turbo-Wheat V");
t6Enchants.put("9Turbo-Melon V","2Turbo-Melon V");
t6Enchants.put("9Turbo-Cactus V","2Turbo-Cactus V");
t6Enchants.put("9Turbo-Mushroom V","2Turbo-Mushroom V");
t6Enchants.put("9Turbo-Warts V","2Turbo-Warts V");
//Ultimate Enchantments (Only the V makes it black)
t6Enchants.put("dBank V","dBank" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dChimera V","dChimera" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dCombo  ","dCombo" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dLast Stand V","dLast Stand V" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dLegion V","dLegion V" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dNo Pain No Gain V","dNo Pain No Gain" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dRend V","dRend" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dSwarm V","dSwarm" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dUltimate Jerry V","dUltimate Jerry" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dUltimate Wise V","dUltimate Wise" + EnumChatFormatting.WHITE +" V");
t6Enchants.put("dWisdom V","dWisdom" + EnumChatFormatting.WHITE +" V");
//T10 Enchants (Red)
t6Enchants.put("9Compact X", "4Compact X"); //1mil ores required
t6Enchants.put("9Expertise X", "4Expertise X");
t6Enchants.put("9Feather Falling X", "4Feather Falling X");
t6Enchants.put("9Infinite Quiver X", "4Infinite Quiver X");
//T7 Enchants (Red)
t6Enchants.put("9Blast Protection VII","4Blast Protection VII");
t6Enchants.put("9Critical VII","4Critical VII");
t6Enchants.put("9Ender Slayer VII","4Ender Slayer VII");
t6Enchants.put("9Fire Protection VII","4Fire Protection VII");
t6Enchants.put("9Giant Killer VII","4Giant Killer VII");
t6Enchants.put("9Growth VII","4Growth VII");
t6Enchants.put("9Luck VII","4Luck VII");
t6Enchants.put("9Power VII","4Power VII");
t6Enchants.put("9Protection VII","4Protection VII");
t6Enchants.put("9Sharpness VII","4Sharpness VII");
t6Enchants.put("9Smite VII","4Smite VII");
//T6 Enchants (Gold)
t6Enchants.put("9Angler VI", "6Angler VI");
t6Enchants.put("9Bane of Arthropods VI", "6Bane of Arthropods VI");
t6Enchants.put("9Blast Protection VI","6Blast Protection");
t6Enchants.put("9Caster VI", "6Caster VI");
t6Enchants.put("9Cleave VI","6Cleave VI");
t6Enchants.put("9Critical VI", "6Critical VI");
t6Enchants.put("9Cubism VI","6Cubism VI");
t6Enchants.put("9Efficiency VI", "6Efficiency VI");
t6Enchants.put("9Ender Slayer VI", "6Ender Slayer VI");
t6Enchants.put("9Execute VI","6Execute VI");
t6Enchants.put("9Frail VI", "6Frail VI");
t6Enchants.put("9Fire Protection VI","6Fire Protection VI");
t6Enchants.put("9Giant Killer VI", "6Giant Killer VI");
t6Enchants.put("9Growth VI", "6Growth VI");
t6Enchants.put("9Lethality VI", "6Lethality VI");
t6Enchants.put("9Luck VI", "6Luck VI");
t6Enchants.put("9Luck of the Sea VI", "6Luck of the Sea VI");
t6Enchants.put("9Lure VI", "6Lure VI");
t6Enchants.put("9Magnet VI", "6Magnet VI");
t6Enchants.put("9Power VI", "6Power VI");
t6Enchants.put("9Protection VI", "6Protection VI");
t6Enchants.put("9Sharpness VI", "6Sharpness VI");
t6Enchants.put("9Smite VI", "6Smite VI");
t6Enchants.put("9Spiked Hook VI", "6Spiked Hook VI");
t6Enchants.put("9Thunderlord VI", "6Thunderlord VI");
t6Enchants.put("9Vampirism VI", "6Vampirism VI");
t6Enchants.put("9Venomous VI","6Venomous VI");
//T5 Enchants (Gold)
t6Enchants.put("9Big Brain V","6Big Brain V");
t6Enchants.put("9Counter-Strike V","6Counter-Strike V");
t6Enchants.put("9Dragon Hunter V", "6Dragon Hunter V");
t6Enchants.put("9First Strike V","6First Strike V");
t6Enchants.put("9Life Steal V","6Life Steal V");
t6Enchants.put("9Looting V","6Looting V");
t6Enchants.put("9Overload V", "6Overload V");
t6Enchants.put("9Scavenger V", "3Scavenger V");
t6Enchants.put("9Vicious V","6Vicious V");
//T4 Enchants (Gold)
t6Enchants.put("9Experience IV", "6Experience IV");
t6Enchants.put("9Life Steal IV", "6Life Steal IV");
t6Enchants.put("9Looting IV", "6Looting IV");
t6Enchants.put("9Scavenger IV", "6Scavenger IV");
t6Enchants.put("9Snipe IV","6Snipe IV");
//T1 Enchants (Color)
t6Enchants.put("9Rainbow I","cR" + EnumChatFormatting.GOLD + "a" + EnumChatFormatting.YELLOW + "i" + EnumChatFormatting.GREEN + "n" + EnumChatFormatting.BLUE + "b" + EnumChatFormatting.DARK_PURPLE + "o" + EnumChatFormatting.LIGHT_PURPLE + "w" + EnumChatFormatting.WHITE + " I");
		String patternString = "(" + String.join("|", t6Enchants.keySet()) + ")";
		pattern = Pattern.compile(patternString);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ClientCommandHandler.instance.registerCommand(new GoldenEnchantToggleCommand());
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onTooltip(ItemTooltipEvent event) {
    	if (event.toolTip == null || !GoldenEnchantToggleCommand.goldToggled) return;

    	ItemStack item = event.itemStack;
    	for (int i = 0; i < event.toolTip.size(); i++) {
    		event.toolTip.set(i, returnGoldenEnchants(event.toolTip.get(i)));
    	}
    }

    public String returnGoldenEnchants(String line) {
    	Matcher matcher = TheMod.pattern.matcher(line);
    	StringBuffer out = new StringBuffer();

    	while (matcher.find()) {
    		matcher.appendReplacement(out, TheMod.t6Enchants.get(matcher.group(1)));
    	}
    	matcher.appendTail(out);

    	return out.toString();
    }

}
