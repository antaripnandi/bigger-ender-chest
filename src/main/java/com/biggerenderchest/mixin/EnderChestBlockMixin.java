package com.biggerenderchest.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.level.block.EnderChestBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EnderChestBlock.class)
public class EnderChestBlockMixin {

    @ModifyArg(
        method = {"useWithoutItem", "use"},
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/entity/player/Player;openMenu(Lnet/minecraft/world/MenuProvider;)Ljava/util/OptionalInt;"
        ),
        require = 0
    )
    private MenuProvider biggerenderchest$replaceMenuProvider(MenuProvider original) {
        return new SimpleMenuProvider(
            (syncId, playerInventory, player) -> ChestMenu.sixRows(syncId, playerInventory, player.getEnderChestInventory()),
            Component.translatable("container.enderchest")
        );
    }

    @Redirect(
        method = {
            "lambda$useWithoutItem$0",
            "lambda$use$0",
            "*"
        },
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/inventory/ChestMenu;threeRows(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/Container;)Lnet/minecraft/world/inventory/ChestMenu;"
        ),
        require = 0
    )
    private ChestMenu biggerenderchest$createSixRowsEnderChestMenu(int syncId, Inventory playerInventory, Container container) {
        return ChestMenu.sixRows(syncId, playerInventory, container);
    }
}
