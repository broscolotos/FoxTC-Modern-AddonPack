//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.passenger;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelPullmanPalaceBogie;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelHeavyweightBaggageCar extends FVTMFormatBase {

	public ModelHeavyweightBaggageCar(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_stripes();
		initGroup_skirt();
		initGroup_clipboard0();
		initGroup_clipboard1();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_stripes(){
		TurboList stripes = new TurboList("stripes");
		stripes.add(new ModelRendererTurbo(stripes, 330, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 2, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -2.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 452, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 2, 0, 0, 0.01f, 0, 0, 0.385f, 0, 0, 0.385f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0.385f, 0, 0, 0.385f, 0, 0, 0.01f, 0, 0)
			.setRotationPoint(-14.6875f, -2.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 349, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 2, 0, 0, 0.01f, 0, 0, 0, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0, 0, 0, 0, 0, 0, 0.01f, 0, 0)
			.setRotationPoint(30.0625f, -2.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 349, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 2, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -2.5f, -11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 452, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 2, 0, 0, 0.01f, 0, 0, 0.385f, 0, 0, 0.385f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0.385f, 0, 0, 0.385f, 0, 0, 0.01f, 0, 0)
			.setRotationPoint(-14.6875f, -2.5f, -11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 349, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 2, 0, 0, 0.01f, 0, 0, 0, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0, 0, 0, 0, 0, 0, 0.01f, 0, 0)
			.setRotationPoint(30.0625f, -2.5f, -11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, -11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(stripes);
	}

	private final void initGroup_skirt(){
		TurboList skirt = new TurboList("skirt");
		skirt.add(new ModelRendererTurbo(skirt, 0, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 6, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(30.0625f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 45, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(43.6875f, -2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 74, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(43.6875f, 2.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 410, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.0625f, -2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 178, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(64.0625f, 2.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 68, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(49.3125f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 72, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(69.6875f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 452, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6875f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 37, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 37, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.0625f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 279, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 6, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.6875f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 178, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.3125f, -2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 104, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-49.3125f, 2.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 161, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.6875f, -2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 221, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-69.6875f, 2.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 410, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.3125f, -0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 341, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-28.4375f, -0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 454, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.0625f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 432, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(21.6875f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 429, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.6875f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 0, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.0625f, 0.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.0625f, 0.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 431, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.3125f, -3.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 87, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.3125f, -3.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 431, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(23.3125f, -0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 104, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.6875f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 508, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.0625f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 208, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.0625f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.6875f, 0.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.6875f, 0.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 500, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.4375f, -3.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 500, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.4375f, -3.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 452, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-21.4375f, -0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 253, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.0625f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 250, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(21.6875f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 247, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.6875f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 306, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.0625f, 0.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 61, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.0625f, 0.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 0, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.3125f, -3.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 194, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.3125f, -3.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 178, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(23.3125f, -0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 77, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.6875f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 74, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.0625f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 71, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.0625f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 438, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.6875f, 0.4375f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 213, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.6875f, 0.4375f, 10.885f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 183, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.4375f, -3.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 134, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.4375f, -3.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 89, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-21.4375f, -0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 18, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.3125f, -0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 501, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-28.4375f, -0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 250, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 6, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(30.0625f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 61, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(43.6875f, -2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 296, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(43.6875f, 2.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 208, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.0625f, -2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 296, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(64.0625f, 2.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 412, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(49.3125f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 463, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(69.6875f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 445, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6875f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 458, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 172, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.0625f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 221, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 6, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.6875f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 296, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.3125f, -2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 330, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-49.3125f, 2.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 498, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.6875f, -2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		skirt.add(new ModelRendererTurbo(skirt, 495, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-69.6875f, 2.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(skirt);
	}

	private final void initGroup_clipboard0(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-84.9375f, 3, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-79.1875f, 3, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.9375f, 5.25f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-79.1875f, 5.25f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 6.5f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 4.875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 3.375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.6875f, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(30.0625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.6875f, 2.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 8, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(49.3125f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 8, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(69.6875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(43.6875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 56, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(30.0625f, -2.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(64.0625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(49.0625f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(43.6875f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(43.6875f, -3.125f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(43.6875f, -10.1875f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(69.4375f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(64.0625f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(64.0625f, -3.125f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(64.0625f, -10.1875f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(30.0625f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 8, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(49.3125f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 8, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(69.6875f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(43.6875f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 56, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(30.0625f, -2.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(64.0625f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(49.0625f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(43.6875f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(43.6875f, -3.125f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(43.6875f, -10.1875f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(69.4375f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(64.0625f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(64.0625f, -3.125f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(64.0625f, -10.1875f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-30.0625f, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-43.6875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 8, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-64.0625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 8, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-86.5625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-49.3125f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 56, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-86.5625f, -2.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-69.6875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-43.9375f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-49.3125f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-49.3125f, -3.125f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-49.3125f, -10.1875f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-64.3125f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-69.6875f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-69.6875f, -3.125f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-69.6875f, -10.1875f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-43.6875f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 8, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-64.0625f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 8, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-86.5625f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-49.3125f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 56, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-86.5625f, -2.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-69.6875f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-43.9375f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-49.3125f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-49.3125f, -3.125f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-49.3125f, -10.1875f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-64.3125f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-69.6875f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-69.6875f, -3.125f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-69.6875f, -10.1875f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-30.0625f, 2.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -13, 11.02f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -13, -11.02f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(30.0625f, 2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-14.6875f, 2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-87.0625f, 2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(30.0625f, 2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-14.6875f, 2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-87.0625f, 2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -14, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.5625f, -15.5f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, -1, -0.5f, 0.5f, -1, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.5625f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(83.0625f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(82.5625f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0.5f, -1, -0.625f, 0.5f, -1, -0.625f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.1875f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.1875f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 136, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.1875f, -15.875f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 149, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.1875f, -15.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.0625f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(84.5625f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(82.8125f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 149, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 142, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 149, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 149, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(85.6875f, -16.375f, -9.375f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-83.1875f, -16.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -16.875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, -0.125f, -0.625f, -0.5f, -0.125f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 148, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(83.8125f, -16.875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -16.875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -15.875f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.8125f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -15.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.6875f, -16.875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -16.375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.6875f, -16.875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.6875f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -16.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(-85.5625f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(-85.6875f, -16.375f, -8.5f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-86.0625f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-85.5625f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -14, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.5f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-83.1875f, -16.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-83.1875f, -16.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-83.1875f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-84.6875f, -16.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-85.5625f, -16.375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-84.6875f, -16.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-84.6875f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-85.5625f, -16.375f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(-85.5625f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(-84.6875f, -16.375f, 8.5f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-86.0625f, -15.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-86.0625f, -15.875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f)
			.setRotationPoint(-86.0625f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-83.1875f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-84.8125f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-85.5625f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-87.0625f, -14, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f)
			.setRotationPoint(-86.5625f, -15.5f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.5f, 0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-87.0625f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86.5625f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0.5f, 0.5f, -0.625f, 0.5f, 0.5f, -0.625f, 0.5f, -1, 0, 0.5f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-83.1875f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-83.1875f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-86.0625f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0.5f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-85.5625f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 147, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f)
			.setRotationPoint(83.8125f, -16.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 147, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f)
			.setRotationPoint(84.6875f, -16.375f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(82.6875f, -16.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f)
			.setRotationPoint(82.6875f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 140, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(84.6875f, -16.375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 147, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(84.6875f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 147, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(84.6875f, -16.375f, 9.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f)
			.setRotationPoint(82.8125f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(84.5625f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(85.0625f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 125, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f)
			.setRotationPoint(85.1875f, -15.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 147, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(85.1875f, -15.875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f)
			.setRotationPoint(83.0625f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(82.5625f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -1, 0, 0.5f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(86.0625f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(85.5625f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f)
			.setRotationPoint(86.0625f, -14, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f)
			.setRotationPoint(85.5625f, -15.5f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.0625f, -18, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.553f, -0.625f, 0, -1.553f, -0.625f, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1.553f, -0.375f, 0, -1.553f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(85.5625f, -16.875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -1.125f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(-86.0625f, -18, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.553f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.553f, -0.625f, -0.625f, -1.553f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.553f, -0.375f, -0.625f)
			.setRotationPoint(-87.5625f, -16.875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-79.0625f, -19.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(79.0625f, -19.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(82.5625f, -18.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-83.0625f, -19.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(-84.5625f, -18.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(-87.0625f, -14.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(-87.0625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f)
			.setRotationPoint(-86.5625f, -16.125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-86.6875f, -16.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -14.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0.875f, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(85.5625f, -16.125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.5f, 1.125f, -0.375f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.6875f, -16.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.0625f, -18, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.553f, -0.625f, 0, -1.553f, -0.625f, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1.553f, -0.375f, 0, -1.553f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(85.5625f, -16.875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -1.125f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(-86.0625f, -18, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.553f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -1.553f, -0.625f, -0.5f, -1.553f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -1.553f, -0.375f, -0.5f)
			.setRotationPoint(-87.5625f, -16.875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-79.0625f, -19.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(79.0625f, -19.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(82.5625f, -18.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-83.0625f, -19.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(-84.5625f, -18.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(-87.0625f, -14.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(-87.0625f, -16.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f)
			.setRotationPoint(-86.5625f, -16.125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-86.6875f, -16.625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -14.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -16.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0.875f, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(85.5625f, -16.125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.5f, 1.125f, -0.375f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.6875f, -16.625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -15, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0)
			.setRotationPoint(83.5625f, -17.375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(85.6875f, -16, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -1.125f, 0, 0)
			.setRotationPoint(85.0625f, -17, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.0625f, -17.875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 1, 13, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-79.0625f, -19.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-82.5625f, -19.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.0625f, -18.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -17.375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(78.5625f, -19.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0)
			.setRotationPoint(82.0625f, -18.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, -17.875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -15, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-86.6875f, -16, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0.625f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0.625f, 0, 0)
			.setRotationPoint(-86.0625f, -17, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(88.5625f, -11, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(88.5625f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -12, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.5625f, -12.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -13.5f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -14, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(86.8125f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(84.5625f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, 2, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(87.0625f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(87.0625f, -11, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(87.0625f, -11.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, 2, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.8125f, -11, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.8125f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.5625f, -11, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.5625f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-88.5625f, -11.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -12, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.8125f, -12.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -13.5f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -14, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.8125f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 3, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 2.75f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 3, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 2.75f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-84.9375f, 3, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-79.1875f, 3, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 3, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 2.75f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 3, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 2.75f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.6875f, 3, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(84.4375f, 3, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(-84.9375f, 3, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 2.75f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(-79.1875f, 3, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 2.75f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(78.6875f, 3, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(84.4375f, 3, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(78.6875f, 3, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 2.75f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(84.4375f, 3, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 2.75f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-84.9375f, 5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-79.1875f, 5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(78.6875f, 5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(84.4375f, 5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(78.6875f, 5.25f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.4375f, 5.25f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 3.375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 6.5f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 6.5f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 3.375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 6.5f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 4.875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 3.375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 2.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0)
			.setRotationPoint(-46.625f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -3.75f, 0)
			.setRotationPoint(-45.625f, 3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 2.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 6.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 6.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 4, 9, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.625f, 3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 4, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 4, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 4, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 4, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -3.75f, 0, 0, -3.75f, 0, 0, 0.25f, 0)
			.setRotationPoint(29.625f, 3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 2.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 2.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(45.625f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.875f, 3, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.625f, 3, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-22.875f, 6, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-14.875f, 6, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(22.625f, 6, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-23.125f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-19.125f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-15.125f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-11.125f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(22.375f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(25.375f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 135, textureX, textureY).addCylinder(0, 0, 0, 2, 6, 8, 1, 1, 3, null)
			.setRotationPoint(-36.625f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 135, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-36.875f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 119, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-37.125f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 119, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-31.375f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 118, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-31.125f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.125f, 3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.875f, 3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.125f, 3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.875f, 3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 1, 21, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.5625f, 2.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 2, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 14, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -0.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-87.0625f, -11, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-87.0625f, -11, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-87.0625f, -11, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(-87.0625f, -5.125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-87.0625f, -9.75f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-87.0625f, -9.75f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-87.0625f, -9.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-87.0625f, -5.3125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 2, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 14, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6875f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, -0.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.5625f, -11, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(86.5625f, -11, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.5625f, -11, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(86.5625f, -5.125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(86.5625f, -9.75f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(86.5625f, -9.75f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(86.5625f, -9.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(86.5625f, -5.3125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 119, textureX, textureY)
			.addShapeBox(-3, 0, -3, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 100, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 98, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 97, textureX, textureY)
			.addShapeBox(-2.5f, 5.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(82.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 97, textureX, textureY)
			.addShapeBox(-2.5f, 5.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(82.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 144, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, -3.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 144, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, 2.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 144, textureX, textureY)
			.addShapeBox(2.5f, 0.5f, 2.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 130, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 130, textureX, textureY)
			.addShapeBox(2.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 130, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, -3.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 125, textureX, textureY)
			.addShapeBox(-2.5f, 4.5f, 2.49f, 5, 1, 1, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 125, textureX, textureY)
			.addShapeBox(-2.5f, 4.5f, 2.5f, 5, 1, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 129, textureX, textureY)
			.addShapeBox(-3.5f, 4.5f, -2.5f, 1, 1, 5, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 128, textureX, textureY)
			.addShapeBox(-3.49f, 0.5f, -2.5f, 1, 1, 5, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 118, textureX, textureY)
			.addShapeBox(-3, 0, -3, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 94, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 94, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 17, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 14, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 144, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, -3.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 143, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, 2.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 143, textureX, textureY)
			.addShapeBox(2.5f, 0.5f, -3.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 128, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 125, textureX, textureY)
			.addShapeBox(2.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 125, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 125, textureX, textureY)
			.addShapeBox(-2.5f, 4.5f, -3.49f, 5, 1, 1, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 124, textureX, textureY)
			.addShapeBox(-2.5f, 4.5f, -3.5f, 5, 1, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 125, textureX, textureY)
			.addShapeBox(-3.5f, 4.5f, -2.5f, 1, 1, 5, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 122, textureX, textureY)
			.addShapeBox(-3.49f, 0.5f, -2.5f, 1, 1, 5, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.625f, -0.5f, -0.0625f, -0.625f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(14.6875f, -11, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.375f, -0.5f, -0.0625f, -0.375f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(16.0625f, -11, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.625f, -0.5f, -0.0625f, -0.625f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(28.6875f, -11, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.625f, -0.5f, -0.0625f, -0.625f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(21.6875f, -5, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.375f, -0.5f, -0.0625f, -0.375f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(16.0625f, -6.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 6, 1, 0, 0, 0, -0.124f, -0.375f, 0, -0.124f, -0.375f, 0, -0.874f, 0, 0, -0.874f, 0, -0.5f, -0.124f, -0.375f, -0.5f, -0.124f, -0.375f, -0.5f, -0.874f, 0, -0.5f, -0.874f)
			.setRotationPoint(16.0625f, -5, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(18.0625f, -9.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(20.6875f, -9.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(23.4375f, -9.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(26.0625f, -9.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(29.0625f, 2, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f)
			.setRotationPoint(29.0625f, 2.4899998f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(29.0625f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(14.0625f, 2, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f)
			.setRotationPoint(14.0625f, 2.4899998f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(14.6875f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(27.6875f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(22.3125f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(23.4375f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(23.4375f, 0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(20.6875f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(15.3125f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(16.4375f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(16.4375f, 0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(27.875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(25.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(25.25f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(23.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(22.625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(20.3125f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(19.875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(17.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(17.25f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(15.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(26.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(26.6875f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(24.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(24.0625f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(21.4375f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(21.4375f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(18.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(18.6875f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.0625f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.625f, -0.5f, -0.0625f, -0.625f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(-30.0625f, -11, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.375f, -0.5f, -0.0625f, -0.375f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(-28.6875f, -11, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.625f, -0.5f, -0.0625f, -0.625f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(-16.0625f, -11, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.625f, -0.5f, -0.0625f, -0.625f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(-23.0625f, -5, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.0625f, -0.375f, -0.5f, -0.0625f, -0.375f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(-28.6875f, -6.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 6, 1, 0, 0, 0, -0.124f, -0.375f, 0, -0.124f, -0.375f, 0, -0.874f, 0, 0, -0.874f, 0, -0.5f, -0.124f, -0.375f, -0.5f, -0.124f, -0.375f, -0.5f, -0.874f, 0, -0.5f, -0.874f)
			.setRotationPoint(-28.6875f, -5, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-26.6875f, -9.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-24.0625f, -9.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-21.3125f, -9.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-18.6875f, -9.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-15.6875f, 2, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f)
			.setRotationPoint(-15.6875f, 2.4899998f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(-15.6875f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-30.6875f, 2, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f)
			.setRotationPoint(-30.6875f, 2.4899998f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-30.0625f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-17.0625f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-22.4375f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-21.3125f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-21.3125f, 0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-24.0625f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-29.4375f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-28.3125f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-28.3125f, 0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-16.875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-19.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-19.5f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-21.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-22.125f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-24.4375f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-24.875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-27.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-27.5f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-29.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-18.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-18.0625f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-20.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-20.6875f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(-23.3125f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(-23.3125f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-26.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-26.0625f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-28.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-28.6875f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(23.0625f, 0.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(16.0625f, 0.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-21.6875f, 0.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-28.6875f, 0.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(23.0625f, 0.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(16.0625f, 0.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-21.6875f, 0.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-28.6875f, 0.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(14.0625f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(-30.6875f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(14.0625f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(-30.6875f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(14.6875f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(16.0625f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(28.6875f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(21.6875f, -5, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(16.0625f, -6.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 6, 1, 0, 0, 0, -0.874f, -0.375f, 0, -0.874f, -0.375f, 0, -0.124f, 0, 0, -0.124f, 0, -0.5f, -0.874f, -0.375f, -0.5f, -0.874f, -0.375f, -0.5f, -0.124f, 0, -0.5f, -0.124f)
			.setRotationPoint(16.0625f, -5, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(18.0625f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(20.6875f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(23.4375f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(26.0625f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(29.0625f, 2, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(29.0625f, 2.4899998f, -11.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(29.0625f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(14.0625f, 2, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(14.0625f, 2.4899998f, -11.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(14.6875f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(27.6875f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(22.3125f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(23.4375f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(23.4375f, 0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(20.6875f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(15.3125f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(16.4375f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(16.4375f, 0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(27.875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(25.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 509, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(25.25f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(23.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(22.625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(20.3125f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(19.875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(17.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(17.25f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard1(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(15.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(26.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(26.6875f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(24.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(24.0625f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(21.4375f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(21.4375f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(18.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(18.6875f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.0625f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-30.0625f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-28.6875f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-16.0625f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-23.0625f, -5, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-28.6875f, -6.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 6, 1, 0, 0, 0, -0.874f, -0.375f, 0, -0.874f, -0.375f, 0, -0.124f, 0, 0, -0.124f, 0, -0.5f, -0.874f, -0.375f, -0.5f, -0.874f, -0.375f, -0.5f, -0.124f, 0, -0.5f, -0.124f)
			.setRotationPoint(-28.6875f, -5, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-26.6875f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-24.0625f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-21.3125f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-18.6875f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-15.6875f, 2, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-15.6875f, 2.4899998f, -11.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(-15.6875f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-30.6875f, 2, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-30.6875f, 2.4899998f, -11.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-30.0625f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-17.0625f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-22.4375f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-21.3125f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-21.3125f, 0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-24.0625f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-29.4375f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-28.3125f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-28.3125f, 0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-16.875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-19.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-19.5f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-21.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-22.125f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-24.4375f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-24.875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-27.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-27.5f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(-29.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-18.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-18.0625f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-20.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-20.6875f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(-23.3125f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(-23.3125f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-26.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-26.0625f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-28.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}


	ModelPullmanPalaceBogie bogie = new ModelPullmanPalaceBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/pullman_palace_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(3.875f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(-3.875f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
