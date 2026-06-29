package Loader;

import gregtech.api.casing.Casings;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTModHandler;

import static Loader.MachineLoader.WorkStationMain;

public class CraftingLoader {

    public CraftingLoader() {
        registerMachineRecipe();
    }

    private static final long bits = GTModHandler.RecipeBits.NOT_REMOVABLE | GTModHandler.RecipeBits.REVERSIBLE
        | GTModHandler.RecipeBits.BUFFERED;

    private static final long bitsd = GTModHandler.RecipeBits.DISMANTLEABLE | bits;

    private static void registerMachineRecipe() {
        GTModHandler.addCraftingRecipe(
            WorkStationMain,
            bitsd,
            new Object[] { "CCC", "CMC", "CCC", 'M', Casings.ULVMachineCasing, 'C',
                OrePrefixes.circuit.get(Materials.ULV) });
    }
}
