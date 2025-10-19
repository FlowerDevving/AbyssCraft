package net.flower.abysscraft.world.dimension;

import net.flower.abysscraft.Abysscraft;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.Optional;
import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> ABYSS_KEY = RegistryKey.of(
            RegistryKeys.DIMENSION,
            Identifier.of(Abysscraft.MOD_ID, "abyss")
    );
    public static final RegistryKey<World> ABYSS_LEVEL_KEY = RegistryKey.of(
            RegistryKeys.WORLD,
            Identifier.of(Abysscraft.MOD_ID, "abyss")
    );
    public static final RegistryKey<DimensionType> ABYSS_DIM_TYPE = RegistryKey.of(
            RegistryKeys.DIMENSION_TYPE,
            Identifier.of(Abysscraft.MOD_ID, "abyss_type")
    );

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(ABYSS_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000L),        // fixedTime
                true,                           // hasSkyLight
                false,                           // hasCeiling
                false,                           // ultraWarm
                true,                            // natural
                1.0D,                            // coordinateScale
                true,                            // bedWorks
                false,                           // respawnAnchorWorks
                0,                               // minY
                256,                             // height
                256,                             // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID,    // effects
                1.0F,                            // ambientLight
                Optional.of(128),                // cloudHeight — new in 1.21.8
                new DimensionType.MonsterSettings(
                        false,                        // piglinSafe
                        false,                        // hasRaids
                        UniformIntProvider.create(0, 0), // monsterSpawnLightLevel
                        0                             // monsterSpawnBlockLightLimit
                )
        ));
    }
}
