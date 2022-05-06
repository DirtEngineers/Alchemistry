package com.smashingmods.alchemistry.common.block.oldblocks.blockentity;

import com.smashingmods.alchemistry.api.blockentity.handler.AutomationStackHandler;
import com.smashingmods.alchemistry.api.blockentity.handler.ModItemStackHandler;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;

public interface InventoryBlockEntity {

    ModItemStackHandler getInputHandler();

    ModItemStackHandler getOutputHandler();

    AutomationStackHandler getAutomationInputHandler(IItemHandlerModifiable inv);

    AutomationStackHandler getAutomationOutputHandler(IItemHandlerModifiable inv);

    LazyOptional<IItemHandler> getExternalInventory();

    @SuppressWarnings("unused")
    CombinedInvWrapper getAutomationInventory();
}