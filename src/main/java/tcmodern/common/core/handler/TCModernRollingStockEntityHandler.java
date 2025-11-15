package tcmodern.common.core.handler;

import tcmodern.common.TCModern;
import tcmodern.common.entities.diesel.*;
import tcmodern.common.entities.electric.EntityHandcar;
import tcmodern.common.entities.electric.EntityNorthwesternEl24;
import tcmodern.common.entities.electric.EntityRadioFlyer;
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
                        EnumTrainType.Passenger, 1, new String[]{"Green", "Blue"},8),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightColonistCar.item,
                new TrainRecord("Heavyweight Colonist Car", EntityHeavyweightColonistCar.class, TCModernRollingStockItems.HeavyweightColonistCar.item,
                        EnumTrainType.Passenger, 1, new String[]{"Green", "Blue", "LightBlue", "Skin16"},8),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightDinerCar.item,
                new TrainRecord("Heavyweight Diner Car", EntityHeavyweightDinerCar.class, TCModernRollingStockItems.HeavyweightDinerCar.item,
                        EnumTrainType.Passenger, 1, new String[]{"Green", "Blue", "LightBlue"},8),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightCombineCar.item,
                new TrainRecord("Heavyweight Combine Car", EntityHeavyweightCombineCar.class, TCModernRollingStockItems.HeavyweightCombineCar.item,
                        "passenger/combine", 1, new String[]{"Green", "Blue"},8).setCargoCapacity(27),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HeavyweightBaggageCar.item,
                new TrainRecord("Heavyweight Baggage Car", EntityHeavyweightBaggageCar.class, TCModernRollingStockItems.HeavyweightBaggageCar.item,
                        "freight", 1, new String[]{"Green", "Blue"},8).setCargoCapacity(54),
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
                        EnumTrainType.OpenTopHopper, 1.5, new String[]{"Brown", "Skin16", "Green", "Red", "Grey", "LightGrey"}, 14, 27),
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
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.Hopper100Ton.item,
                new TrainRecord("100 Ton Hopper", Entity100TonHopper.class, TCModernRollingStockItems.Hopper100Ton.item,
                        EnumTrainType.OpenTopHopper, 4, new String[]{"Black", "Yellow"}, 11, 54),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.PRRT1.item,
                new TrainRecord("PRR T1", EntityPRRT1.class, TCModernRollingStockItems.PRRT1.item,
                        EnumTrainType.Steam, 0, new String[]{"Green"}, 7, 0).setWaterConsumption(200)
                        .setTankCapacity(10000).setBogieLocoPosition(-6.5).setAccelerationRate(0.65).setHeatingTime(160).setFuelConsumption(60)
                        .setMHP(6500).setMaxSpeed(225).setBrakeRate(0.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.PRRCoastToCoastTender.item,
                new TrainRecord("PRR Coast To Coast Tender", EntityPRRCoastToCoastTender.class, TCModernRollingStockItems.PRRCoastToCoastTender.item,
                        "tender", 1.5, new String[]{"Green"}, 14).setTankCapacity(20000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NorthwesternEl24.item,
                new TrainRecord("Northwestern El24", EntityNorthwesternEl24.class, TCModernRollingStockItems.NorthwesternEl24.item,
                        EnumTrainType.Electric, 0, new String[]{"Green"}, 12).setMHP(1327).setMaxSpeed(89).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.95).setBogieLocoPosition(-5.25),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NWClassAMain.item,
                new TrainRecord("N&W Class A", EntityNWClassAMain.class, TCModernRollingStockItems.NWClassAMain.item,
                        EnumTrainType.Steam, 0, new String[]{"Black"}, 10).setWaterConsumption(200)
                        .setTankCapacity(18000).setBogieLocoPosition(-3.375).setAccelerationRate(0.65).setHeatingTime(160)
                        .setFuelConsumption(60).setMHP(6300).setMaxSpeed(110).setBrakeRate(0.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NWClassAFront.item,
                new TrainRecord("N&W Class A Front", EntityNWClassAFront.class, TCModernRollingStockItems.NWClassAFront.item,
                        EnumTrainType.Steam, 0, new String[]{"Black"}, 13, 0).setWaterConsumption(1)
                        .setTankCapacity(10000).setBogieLocoPosition(-2.5).setAccelerationRate(0.65).setHeatingTime(160)
                        .setFuelConsumption(1).setMHP(6300).setMaxSpeed(110).setBrakeRate(0.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NWY6bMain.item,
                new TrainRecord("N&W Y6b", EntityNWY6bMain.class, TCModernRollingStockItems.NWY6bMain.item,
                        EnumTrainType.Steam, 0, new String[]{"Black"}, 10).setWaterConsumption(200)
                        .setTankCapacity(17000).setBogieLocoPosition(-3).setAccelerationRate(0.65).setHeatingTime(160)
                        .setFuelConsumption(60).setMHP(5600).setMaxSpeed(80).setBrakeRate(0.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NWY6bFront.item,
                new TrainRecord("N&W Y6b Front", EntityNWY6bFront.class, TCModernRollingStockItems.NWY6bFront.item,
                        EnumTrainType.Steam, 0, new String[]{"Black"}, 13, 0).setWaterConsumption(1)
                        .setTankCapacity(10000).setBogieLocoPosition(-3).setAccelerationRate(0.65).setHeatingTime(160)
                        .setFuelConsumption(1).setMHP(5600).setMaxSpeed(80).setBrakeRate(0.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.NWTender.item,
                new TrainRecord("N&W Tender", EntityNWTender.class, TCModernRollingStockItems.NWTender.item,
                        "tender", 1.5, new String[]{"Black"}, 14).setTankCapacity(20000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.EMDModel40.item,
                new TrainRecord("EMD Model 40", EntityModel40.class, TCModernRollingStockItems.EMDModel40.item, EnumTrainType.Diesel,
                        0, new String[]{"Orange"}, 16).setBrakeRate(0.95).setMaxSpeed(49).setMHP(300)
                        .setFuelConsumption(45).setHeatingTime(180).setAccelerationRate(0.9).setBogieLocoPosition(-1.625)
                        .setTankCapacity(4000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.HandCar.item,
                new TrainRecord("Handcar", EntityHandcar.class, TCModernRollingStockItems.HandCar.item,
                        EnumTrainType.Electric, 0, new String[]{"Brown"}, 18).setMHP(20).setMaxSpeed(30).setFuelConsumption(1)
                        .setHeatingTime(1).setAccelerationRate(0.3).setBrakeRate(0.999).setBogieLocoPosition(-0.4),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.RadioFlyer.item,
                new TrainRecord("Radio Flyer Handcar", EntityRadioFlyer.class, TCModernRollingStockItems.RadioFlyer.item,
                        EnumTrainType.Electric, 0, new String[]{"Red"}, 18).setMHP(20).setMaxSpeed(30).setFuelConsumption(1)
                        .setHeatingTime(1).setAccelerationRate(0.3).setBrakeRate(0.999).setBogieLocoPosition(-0.4),
                Instance()
        );
        //edit
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.EMCE3A.item,
                new TrainRecord("EMC E3A", EntityEMCE3A.class, TCModernRollingStockItems.EMCE3A.item, EnumTrainType.Diesel,
                        0, new String[]{"White"}, 8, 0, 0.95, 188, 2100,
                        45, 180, 0.8, -6.0625f, 15000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.EMCE3B.item,
                new TrainRecord("EMC E3B", EntityEMCE3B.class, TCModernRollingStockItems.EMCE3B.item, EnumTrainType.Diesel,
                        0, new String[]{"White"}, 8, 0, 0.95, 188, 2100,
                        45, 180, 0.8, -5.9375f, 15000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.EMDF3A.item,
                new TrainRecord("EMD F3A", EntityEMDF3A.class, TCModernRollingStockItems.EMDF3A.item, EnumTrainType.Diesel,
                        0, new String[]{"Green", "Black", "Skin16", "Skin18", "Skin17", "Skin19", "Skin21", "Skin20", "Skin22", "Skin24", "Skin23"}, 11, 0, 0.95, 133, 1500,
                        45, 180, 0.8, -4.3125f, 10000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.EMDF3B.item,
                new TrainRecord("EMD F3B", EntityEMDF3B.class, TCModernRollingStockItems.EMDF3B.item, EnumTrainType.Diesel,
                        0, new String[]{"Green", "Black", "Skin16", "Skin17", "Skin18"}, 11, 0, 0.95, 133, 1500,
                        45, 180, 0.8, -4.3125f, 10000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.F40ph.item,
                new TrainRecord("F40ph", EntityF40ph.class, TCModernRollingStockItems.F40ph.item, EnumTrainType.Diesel,
                        0, new String[]{"Grey", "LightGrey"}, 11, 0, 0.95, 103, 3000,
                        45, 180, 0.8, -4.3125f, 10000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                TCModernRollingStockItems.GEU18B.item,
                new TrainRecord("GE U18B", EntityGEU18B.class, TCModernRollingStockItems.GEU18B.item, EnumTrainType.Diesel,
                        0, new String[]{"Black", "Red", "Pink"}, 11, 0, 0.95, 113, 1800,
                        45, 180, 0.8, -4.0625f, 10000),
                Instance()
        );
    }
}
