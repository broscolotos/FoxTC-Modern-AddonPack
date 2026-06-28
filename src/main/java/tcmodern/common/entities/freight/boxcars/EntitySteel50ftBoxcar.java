package tcmodern.common.entities.freight.boxcars;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.enums.LockoutGroup;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecification;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.font.TransformAttribute;
import java.awt.geom.AffineTransform;
import java.util.*;

public class EntitySteel50ftBoxcar extends AbstractStandardFixedFreightCar {

    public EntitySteel50ftBoxcar(World world) { super(world); }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "ATSF Shock Control");
        InsertTexture(1, "Nickel Plate Road");
        InsertTexture(2, "Norfolk & Western");
        InsertTexture(3, "Soo Line");
        InsertTexture(4, "Blank");
        InsertTexture(5, "Clearwater Lakes (Big Logo)", LockoutGroup.CWL);
        InsertTexture(6, "Clearwater Lakes (Small Logo)", LockoutGroup.CWL);
        InsertTexture(7, "Clearwater Lakes (Small Logo)", LockoutGroup.CWL);
        InsertTexture(8, "Clearwater Lakes (Big Logo)", LockoutGroup.CWL);
        InsertTexture(9, "Clearwater Lakes (Small Logo)", LockoutGroup.CWL);
        InsertTexture(10, "Clearwater Lakes (Big Logo)", LockoutGroup.CWL);

        initOverlayTextures();
        Map<TextAttribute, Object> fontAttributes = new HashMap<>(2);
        fontAttributes.put(TextAttribute.SIZE, 28f);
        fontAttributes.put(TextAttribute.TRANSFORM, new TransformAttribute(AffineTransform.getTranslateInstance(1, -1)));

        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Car Number", 74, 8, 10, EnumOverlayFonts.OxygenSansSmall, fontAttributes, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(1595, 899), new Point(1711, 899) }
        )).setRestriction(OTSpecification.Restriction.WHITELIST, new HashSet<>(Arrays.asList(0, 4))); //ATSF / Blank

        fontAttributes = new HashMap<>(2);
        fontAttributes.put(TextAttribute.SIZE, 21f);
        fontAttributes.put(TextAttribute.TRANSFORM, new TransformAttribute(AffineTransform.getTranslateInstance(1, 0)));

        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Car Number", 74, 6, 10, EnumOverlayFonts.OxygenSansSmall, fontAttributes, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(1595, 898), new Point(1711, 898) }
        )).setRestriction(OTSpecification.Restriction.WHITELIST, new HashSet<>(Collections.singletonList(3))); //SOO


        fontAttributes = new HashMap<>(2);
        fontAttributes.put(TextAttribute.SIZE, 21f);
        fontAttributes.put(TextAttribute.TRANSFORM, new TransformAttribute(AffineTransform.getTranslateInstance(1, 1)));

        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Car Number", 48, 9, 7, EnumOverlayFonts.OxygenSansMid, fontAttributes, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(1595, 883), new Point(1711, 883) }
        )).setRestriction(OTSpecification.Restriction.WHITELIST, new HashSet<>(Collections.singletonList(1))); //NKP

        //TODO tune everything under this
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Car Number", 48, 9, 7, EnumOverlayFonts.OxygenSansMid, fontAttributes, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(1598, 876), new Point(1714, 876) }
        )).setRestriction(OTSpecification.Restriction.WHITELIST, new HashSet<>(Collections.singletonList(2))); //N&W

        fontAttributes = new HashMap<>(2);
        fontAttributes.put(TextAttribute.SIZE, 21f);
        fontAttributes.put(TextAttribute.TRANSFORM, new TransformAttribute(AffineTransform.getTranslateInstance(0, 1)));

        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Car Number", 47, 9, 10, EnumOverlayFonts.OxygenSansMid, fontAttributes, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(1606, 876), new Point(1722, 876) }
        )).setRestriction(OTSpecification.Restriction.WHITELIST, new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10))); //CWL(6)
    }

    @Override
    public String getInventoryName() { return "50ft Steel Boxcar"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.6875f; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/freight/ModelSteel50ftBoxcar.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelGenericFreightBogie, new Vec3f(-2.576171875f,0,0), null, null, DetailRegistry.textureGenericFreightBogieBlack)
                .addModel(DetailRegistry.modelGenericFreightBogie, new Vec3f(2.576171875f, 0, 0), null, null, DetailRegistry.textureGenericFreightBogieBlack);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID, EntitySteel50ftBoxcar.class,
                model,"steel50ft_", new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );
    }
}
