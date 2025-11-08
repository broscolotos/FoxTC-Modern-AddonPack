package tcmodern.common.library;

import tcmodern.common.entities.diesel.*;
import tcmodern.common.entities.steam.*;
import train.common.library.sounds.SoundRecord;

public class TCModernSounds {

    //STEAM
    public static final SoundRecord L3AMohawk = new SoundRecord(EntityL3aMohawk.class, " ", 1F, "steam_run", 0.2F, 20, "steam_idle2", 0.2F, 24, true, "steambell_3", 19, new String[] {"nathan_5chime_1"});
    public static final SoundRecord PRRT1 = new SoundRecord(EntityPRRT1.class, " ", 1F, "steam_run", 0.2F, 20, "steam_idle2", 0.2F, 24, true, "steambell_3", 19, new String[] {"PRR_Passenger3Chime"});

    //DIESEL
    public static final SoundRecord AC4400CW = new SoundRecord(EntityAC44CW.class, "nathan_k5la_big_1", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 50, false, "ge_steelbell_1", 18);

}
