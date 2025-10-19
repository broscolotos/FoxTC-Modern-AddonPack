package tcmodern.common.core.handler;

import tcmodern.common.TCModernFoxTC;

public class TCModernRollingStockEntityHandler {
    private Object Instance() {
        return TCModernFoxTC.instance;
    }

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
    }
}
