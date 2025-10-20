package tcmodern.common.core.handler;

import tcmodern.common.TCModern;
import tcmodern.common.entities.steam.EntityL3aMohawk;
import tcmodern.common.library.TCModernRollingStockItems;
import train.common.Traincraft;
import train.common.library.EnumTrainType;
import train.common.library.register.TrainRecord;

public class TCModernRollingStockEntityHandler {
    private Object Instance() { return TCModern.instance; }

    public TCModernRollingStockEntityHandler() {
        /* Sample

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        // Put Calls to RegisterRollingStockEntity below this.

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.l3aMohawk.item,
                new TrainRecord("L3a Mohawk", EntityL3aMohawk.class, TCModernRollingStockItems.l3aMohawk.item,
                        EnumTrainType.Steam, 0, new String[] {"White", "LightGrey", "Black", "Grey", "Blue", "LightBlue"}, 7,
                        0, 97, 164, 4120, 60, 160,
                        0.65, -5, 10000, 200),
                Instance()
        );
    }
}
