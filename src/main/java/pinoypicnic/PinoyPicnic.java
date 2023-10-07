package pinoypicnic;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pinoypicnic.item.ModItemGroup;
import pinoypicnic.item.ModItems;

public class PinoyPicnic implements ModInitializer {
	public static final String MOD_ID = "pinoypicnic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}