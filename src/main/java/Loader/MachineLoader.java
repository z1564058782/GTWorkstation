package Loader;

import Machine.WorkStation;
import net.minecraft.item.ItemStack;

public class MachineLoader {

    public static ItemStack WorkStationMain;

    public static void loaderMachines() {
        WorkStationMain = new WorkStation(25569, "WorkStation", "WorkStation").getStackForm(1);
    }
}
