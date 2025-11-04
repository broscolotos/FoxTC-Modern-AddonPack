package tcmodern.common.core.handler;

import tcmodern.common.TCModern;
import tcmodern.common.entities.diesel.*;
import tcmodern.common.entities.freight.hoppers.*;
import tcmodern.common.entities.freight.tanks.*;
import tcmodern.common.entities.passenger.*;
import tcmodern.common.entities.steam.*;
import tcmodern.common.entities.tender.*;
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
                TCModernRollingStockItems.L3aMohawk.item,
                new TrainRecord("L3a Mohawk", EntityL3aMohawk.class, TCModernRollingStockItems.L3aMohawk.item,
                        EnumTrainType.Steam, 0, new String[] {"White", "LightGrey", "Black", "Grey", "Blue", "LightBlue"}, 10,
                        0, .95, 164, 4120, 60, 160,
                        0.65, -5, 10000, 200),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NYC46ft4inTender.item,
                new TrainRecord("NYC 46ft 4in Tender", EntityNYC46ft4inTender.class, TCModernRollingStockItems.NYC46ft4inTender.item,
                        "tender", 1.5, new String[]{"Black"}, 14,
                        0, 0, 0, 0, 0, 0, 0, 0, 20000, 0),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NYC40ft3inTender.item,
                new TrainRecord("NYC 40ft 3in Tender", EntityNYC40ft3inTender.class, TCModernRollingStockItems.NYC40ft3inTender.item,
                        "tender", 1.5, new String[]{"Black"}, 14,
                        0, 0, 0, 0, 0, 0, 0, 0, 24000, 0),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NYCPT2Tender.item,
                new TrainRecord("NYC PT2 Tender", EntityNYCPT2Tender.class, TCModernRollingStockItems.NYCPT2Tender.item,
                        "tender", 1.5, new String[]{"Black", "Blue"}, 12,
                        0, 0, 0, 0, 0, 0, 0, 0, 32000, 0),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightTailCar.item,
                new TrainRecord("Heavyweight Tail Car", EntityHeavyweightTailCar.class, TCModernRollingStockItems.HeavyweightTailCar.item,
                        EnumTrainType.Passenger, 1, new String[]{"Blue"},8),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightColonistCar.item,
                new TrainRecord("Heavyweight Colonist Car", EntityHeavyweightColonistCar.class, TCModernRollingStockItems.HeavyweightColonistCar.item,
                        EnumTrainType.Passenger, 1, new String[]{"Blue", "LightBlue", "Skin16"},8),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightDinerCar.item,
                new TrainRecord("Heavyweight Diner Car", EntityHeavyweightDinerCar.class, TCModernRollingStockItems.HeavyweightDinerCar.item,
                        EnumTrainType.Passenger, 1, new String[]{"Blue", "LightBlue"},8),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightCombineCar.item,
                new TrainRecord("Heavyweight Combine Car", EntityHeavyweightCombineCar.class, TCModernRollingStockItems.HeavyweightCombineCar.item,
                        "passenger/combine", 1, new String[]{"Blue"},8).setCargoCapacity(27),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightBaggageCar.item,
                new TrainRecord("Heavyweight Baggage Car", EntityHeavyweightBaggageCar.class, TCModernRollingStockItems.HeavyweightBaggageCar.item,
                        "freight", 1, new String[]{"Blue"},8).setCargoCapacity(54),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.AC44CW.item,
                new TrainRecord("AC44CW", EntityAC44CW.class, TCModernRollingStockItems.AC44CW.item, EnumTrainType.Diesel,
                        0, new String[]{"Red", "Blue", "Cyan", "Grey", "LightBlue", "LightGrey", "Pink"}, 8, 0, 0.95, 119, 4400,
                        45, 180, 0.8, -6.625f, 21000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.Tamu8000.item,
                new TrainRecord("Tamu 8000").setEntityClass(EntityTamu8000.class).setItem(TCModernRollingStockItems.Tamu8000.item)
                        .setTrainType(EnumTrainType.Tankcar).setMass(1.5).setColors(new String[]{"White"}).setGuiRenderScale(14).setTankCapacity(13000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.WoodenHopper40Ton.item,
                new TrainRecord("40 Ton Wooden Hopper", Entity40TonWoodenHopper.class, TCModernRollingStockItems.WoodenHopper40Ton.item,
                        EnumTrainType.OpenTopHopper, 1.5, new String[]{"Brown"}, 14, 27),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.AlleghenyMain.item,
                new TrainRecord("C&O Allegheny", EntityAllegheny.class, TCModernRollingStockItems.AlleghenyMain.item,
                        EnumTrainType.Steam, 0, new String[]{"Black"}, 7, 0).setWaterConsumption(200)
                        .setTankCapacity(20000).setBogieLocoPosition(-4.5).setAccelerationRate(0.65).setHeatingTime(160).setFuelConsumption(60)
                        .setMHP(7500).setMaxSpeed(110).setBrakeRate(0.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.AlleghenyFront.item,
                new TrainRecord("C&O Allegheny Front", EntityAlleghenyFront.class, TCModernRollingStockItems.AlleghenyFront.item,
                        EnumTrainType.Steam, 0, new String[]{"Black"}, 13, 0).setWaterConsumption(1)
                        .setTankCapacity(10000).setBogieLocoPosition(-3.0).setAccelerationRate(0.65).setHeatingTime(160).setFuelConsumption(1)
                        .setMHP(7500).setMaxSpeed(110).setBrakeRate(0.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.CnOTender.item,
                new TrainRecord("C&O Tender", EntityCnOTender.class, TCModernRollingStockItems.CnOTender.item,
                        "tender", 1.5, new String[]{"Black"}, 14).setTankCapacity(20000),
                Instance()
        );
    }
}
