package pinoypicnic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pinoypicnic.PinoyPicnic;

public class ModItems {
    public static final Item CHICKEN_ADOBO = registerItem("chicken_adobo", new Item(new FabricItemSettings().food(ModFoodComponents.CHICKEN_ADOBO)));
    public static final Item PORK_ADOBO = registerItem("pork_adobo", new Item(new FabricItemSettings().food(ModFoodComponents.PORK_ADOBO)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PinoyPicnic.MOD_ID, name), item);
    }
    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(CHICKEN_ADOBO);
        entries.add(PORK_ADOBO);
    }
    public static void registerModItems() {
        PinoyPicnic.LOGGER.info("Registering Mod Items for " + PinoyPicnic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
