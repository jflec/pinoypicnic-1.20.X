package pinoypicnic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pinoypicnic.PinoyPicnic;

public class ModItemGroup {
    public static final ItemGroup PINOYPICNIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PinoyPicnic.MOD_ID, "pinoypicnic_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pinoypicnic_group"))
                    .icon(() -> new ItemStack(ModItems.CHICKEN_ADOBO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CHICKEN_ADOBO);
                        entries.add(ModItems.PORK_ADOBO);

            }).build());
    public static void registerItemGroups() {

    }
}
