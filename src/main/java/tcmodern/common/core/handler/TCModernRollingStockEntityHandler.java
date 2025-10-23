package tcmodern.common.core.handler;

import tcmodern.common.TCModern;
import tcmodern.common.entities.passenger.EntityHeavyweightColonistCar;
import tcmodern.common.entities.passenger.EntityHeavyweightTailCar;
import tcmodern.common.entities.steam.EntityL3aMohawk;
import tcmodern.common.entities.tender.EntityNYC40ft3inTender;
import tcmodern.common.entities.tender.EntityNYC46ft4inTender;
import tcmodern.common.entities.tender.EntityNYCPT2Tender;
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
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NYC46ft4inTender.item,
                new TrainRecord("NYC 46ft 4in Tender", EntityNYC46ft4inTender.class, TCModernRollingStockItems.NYC46ft4inTender.item,
                        "tender", 1.5, new String[]{"Black"}, 18,
                        0, 0, 0, 0, 0, 0, 0, 0, 20000, 0),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NYC40ft3inTender.item,
                new TrainRecord("NYC 40ft 3in Tender", EntityNYC40ft3inTender.class, TCModernRollingStockItems.NYC40ft3inTender.item,
                        "tender", 1.5, new String[]{"Black"}, 18,
                        0, 0, 0, 0, 0, 0, 0, 0, 24000, 0),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NYCPT2Tender.item,
                new TrainRecord("NYC PT2 Tender", EntityNYCPT2Tender.class, TCModernRollingStockItems.NYCPT2Tender.item,
                        "tender", 1.5, new String[]{"Black", "Blue"}, 14,
                        0, 0, 0, 0, 0, 0, 0, 0, 32000, 0),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightTailCar.item,
                new TrainRecord("Heavyweight Tail Car", EntityHeavyweightTailCar.class, TCModernRollingStockItems.HeavyweightTailCar.item,
                        EnumTrainType.Passenger, 1, new String[]{"Blue"},18),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightColonistCar.item,
                new TrainRecord("Heavyweight Colonist Car", EntityHeavyweightColonistCar.class, TCModernRollingStockItems.HeavyweightColonistCar.item,
                        EnumTrainType.Passenger, 1, new String[]{"Blue"},18),
                Instance()
        );
    }
}
