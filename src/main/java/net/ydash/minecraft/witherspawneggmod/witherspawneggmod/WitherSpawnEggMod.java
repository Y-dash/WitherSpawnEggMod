package net.ydash.minecraft.witherspawneggmod.witherspawneggmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraft.entity.EntityType.WITHER;

@Mod("wither-spawn-egg-mod")
public class WitherSpawnEggMod {

    public WitherSpawnEggMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            itemRegistryEvent.getRegistry().registerAll(Items.WITHER_SPAWN_EGG);
        }
    }

    public static class Items {
        public static final SpawnEggItem WITHER_SPAWN_EGG = (SpawnEggItem) new SpawnEggItem(WITHER, 0x000000FF, 0x000000FF, new net.minecraft.item.Item.Properties()
                .group(ItemGroup.MISC))
                .setRegistryName("wither_spawn_egg");
    }
}
