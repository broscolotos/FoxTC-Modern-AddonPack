package tcmodern.common.library;

import net.minecraft.item.Item;
import train.common.library.TypeOfRollingStock;

import static train.common.library.TypeOfRollingStock.*;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum TCModernRollingStockItems {
    //minecraftTemplate("template-icon", STEAM, 100),
    //minecraftTemplateUntradeable("template-icon", STEAM)
    L3aMohawk("steam/L3aMohawk", STEAM, "l3aMohawk"),
    NYC46ft4inTender("tender/NYC46ft", FREIGHT, "NYC46ft4inTender"),
    NYC40ft3inTender("tender/NYC46ft", FREIGHT, "NYC40ft3inTender"),
    NYCPT2Tender("tender/NYCPT2", FREIGHT, "NYCPT2Tender"),
    HeavyweightTailCar("passenger/heavyweightTail", PASSENGER, "HeavyweightTailCar"),
    HeavyweightColonistCar("passenger/heavyweightColonist", PASSENGER, "HeavyweightColonistCar"),
    HeavyweightDinerCar("passenger/heavyweightDiner", PASSENGER, "HeavyweightDinerCar"),
    HeavyweightCombineCar("passenger/heavyweightCombine", PASSENGER, "HeavyweightCombineCar"),
    HeavyweightBaggageCar("passenger/heavyweightBaggage", FREIGHT, "HeavyweightBaggageCar"),
    AC44CW("diesel/AC44CW", DIESEL, "AC44CW"),
    Tamu8000("freight/tanks/Tamu8000", FREIGHT, "Tamu8000"),
    WoodenHopper40Ton("freight/hoppers/40TonWoodenHopper", FREIGHT, "40TonWoodenHopper"),
    AlleghenyMain("steam/Allegheny", STEAM, "Allegheny"),
    AlleghenyFront("steam/Allegheny", STEAM, "AlleghenyFront"),
    CnOTender("tender/CnOTender", FREIGHT, "CnO Tender"),
    Hopper100Ton("freight/hoppers/100TonHopper", FREIGHT, "100TonHopper"),
    PRRT1("steam/PRRT1", STEAM, "PRR T1"),
    PRRCoastToCoastTender("tender/PRRCoastToCoast", FREIGHT, "PRR Coast To Coast"),
    NorthwesternEl24("electric/NorthwesternEl24", ELECTRIC, "Northwestern El24"),
    NWClassAMain("steam/NWClassA", STEAM, "N&W Class A"),
    NWClassAFront("steam/NWClassA", STEAM, "N&W Class A Front"),
    NWY6bMain("steam/NWY6b", STEAM, "N&W Y6b"),
    NWY6bFront("steam/NWY6b", STEAM, "N&W Y6b Front"),
    NWTender("tender/NWTender", FREIGHT, "N&W Tender"),
    HandCar("other/Handcar", ELECTRIC, "Handcar"),
    RadioFlyer("other/RadioFlyer", ELECTRIC, "Radio Flyer Handcar"),
    EMDModel40("diesel/EMDModel40", DIESEL, "EMD Model 40"),
    EMCE3A("diesel/EMCE3B", DIESEL, "EMC E3A"),
    EMCE3B("diesel/EMCE3B", DIESEL, "EMC E3B"),
    EMDF3A("diesel/EMDF3A", DIESEL, "EMD F3A"),
    EMDF3B("diesel/EMDE3B", DIESEL, "EMD F3B"),
    F40ph("diesel/F40ph", DIESEL, "F40ph"),
    GEU18B("diesel/GEU18B", DIESEL, "GE U18B"),
    ;


    /**
     * @param iconName
     * @param typeOfRollingStock the type of rollingstock
     * @param amountForEmerald amount for Emerald
     */
    TCModernRollingStockItems(String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, int amountForEmerald) {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = (byte) amountForEmerald;
    }

    TCModernRollingStockItems(String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, int amountForEmerald, String itemName) {
        this.iconName = iconName;
        this.itemName = itemName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = (byte) amountForEmerald;
    }

    /** USED FOR ROLLINGSTOCK THAT IS NOT ALLOWED TO BE TRADED FOR
     * @param iconName
     * @param typeOfRollingStock the type of rollingstock
     */

    TCModernRollingStockItems(String iconName, TypeOfRollingStock typeOfRollingStock) {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = -1;
    }

    TCModernRollingStockItems(String iconName, TypeOfRollingStock typeOfRollingStock, String name) {
        this.iconName = iconName;
        this.itemName = name;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = -1;
    }

    public Item item;
    public String itemName;
    public final String iconName;
    public final TypeOfRollingStock TypeOfRollingStock;

    /**
     * amount for emerald. For ItemRollingStock, it is the price for one train
     */
    public byte amountForEmerald;
}
