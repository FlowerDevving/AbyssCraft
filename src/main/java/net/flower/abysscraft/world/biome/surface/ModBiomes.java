package net.flower.abysscraft.world.biome.surface;

import net.flower.abysscraft.Abysscraft;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final RegistryKey<Biome> CHARRED_VAULT = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(Abysscraft.MOD_ID, "charred_vault"));
}
