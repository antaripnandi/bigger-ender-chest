package com.biggerenderchest.mixin;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.level.block.EnderChestBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EnderChestBlock.class)
public class EnderChestBlockMixin {
    @Redirect(
        method = "*",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/inventory/ChestMenu;threeRows(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/Container;)Lnet/minecraft/world/inventory/ChestMenu;"
        ),
        require = 0
    )
    private ChestMenu createSixRowsEnderChestMenu(int syncId, Inventory playerInventory, Container container) {
        return ChestMenu.sixRows(syncId, playerInventory, container);
    }
}
