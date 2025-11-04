//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.steam;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.locomotive.bogies.ModelAlleghenyBogieFront;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelAlleghenyFront extends FVTMFormatBase {

	public ModelAlleghenyFront(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		addToCreators("Riggs64");
		//
		initGroup_ValveGearFrontRight();
		initGroup_ValveGearFrontLeft();
		initGroup_FRAME();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_ValveGearFrontRight(){
		TurboList ValveGearFrontRight = new TurboList("ValveGearFrontRight");
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 68, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(12.6875f, 6.8125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 428, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(11.9375f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 205, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(14.4375f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 220, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(27.1875f, 6.8125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 187, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(26.4375f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 168, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(28.9375f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 278, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(27.4375f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 375, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(41.6875f, 6.8125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 163, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(40.9375f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 118, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(43.4375f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 119, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(41.9375f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 61, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0.1875f, -0.1875f, 0, 0.1875f, -0.1875f, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.1875f, 0, 0.1875f, -0.1875f, 0, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(13.6875f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 798")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 61, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f)
			.setRotationPoint(12.6875f, 5.5625f, -10.09375f).setRotationAngle(0, 0, 0).setName("Box 807")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 337, 170, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 3, 1, 1, 0, -0.25f, 0.3125f, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, -0.25f, 0.3125f, -0.25f, -0.25f, 0.3125f, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, -0.25f, 0.3125f, -0.25f)
			.setRotationPoint(13.6875f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 1092")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 78, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(12.9375f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 434, 181, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 5, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 167, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(43.6875f, -3, -11.4375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 375, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(24.6875f, 6.8125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 253, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(24.6875f, 4.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 78, 274, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 7, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(44.25f, -2.625f, -10.59375f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 167, 171, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 2, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(40.625f, 2.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 130, 169, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(40.625f, 2.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 167, 168, textureX, textureY)
			.addShapeBox(-1.5f, -2.3125f, 0, 3, 1, 1, 0, 1.6875f, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 1.6875f, -0.6875f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f)
			.setRotationPoint(40.625f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 78, 181, textureX, textureY)
			.addShapeBox(-3.5f, -2.6875f, 0, 5, 1, 1, 0, -0.3125f, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, -0.3125f, -0.6875f, 0.375f, -0.3125f, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, -0.3125f, 0.0625f, 0.375f)
			.setRotationPoint(40.625f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 263, 160, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(37.625f, 2.5625f, -10.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 0, 181, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 5, 1, 1, 0, -0.3125f, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.3125f, -0.625f, 0.1875f, -0.3125f, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, -0.3125f, -0.1875f, 0.1875f)
			.setRotationPoint(40.625f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 363, 167, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 2, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(40.625f, 2.5625f, -8.8125f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 239, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0, 0.125f, -0.25f)
			.setRotationPoint(13.6875f, 5.5625f, -9.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 67, 274, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(40.3125f, 2.8125f, -10.3125f).setRotationAngle(0, 0, 9)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 94, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0.3125f, -0.5f, 0)
			.setRotationPoint(24.9375f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 408, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0.3125f, -0.5f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(24.9375f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 57, 274, textureX, textureY).addCylinder(3.5f, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(13.6875f, 6.0625f, -10.1875f).setRotationAngle(0, 0, -60)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 502, 273, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(15.4375f, 3.03125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 501, 171, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 4, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 423, 273, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(28.1875f, 1.90625f, -10.46875f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 326, 273, textureX, textureY)
			.addShapeBox(12, -0.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 321, 273, textureX, textureY)
			.addShapeBox(11, -0.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 210, 273, textureX, textureY)
			.addShapeBox(11, -0.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 200, 273, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 108, 273, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 103, 273, textureX, textureY)
			.addShapeBox(12.125f, -0.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 93, 273, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 88, 273, textureX, textureY)
			.addShapeBox(12.125f, -0.5f, 0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 83, 273, textureX, textureY).addCylinder(-3.1875f, 0, 0, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(29, -4.5f, -10.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 52, 273, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(29, -4.5f, -10.5625f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 316, 272, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.625f, 0.625f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(29, -4.5f, -10.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 337, 167, textureX, textureY)
			.addShapeBox(-3.0625f, 0, 0, 3, 1, 1, 0, -0.25f, -0.4375f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.25f, -0.375f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.375f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 311, 272, textureX, textureY)
			.addShapeBox(-3.5625f, 0.6875f, 0, 1, 1, 1, 0, -0.3125f, 0.03125f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.3125f, 0.03125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.8125f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 298, 272, textureX, textureY)
			.addShapeBox(0.25f, 0.375f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.25f, -1.25f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.25f, -1.25f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 293, 272, textureX, textureY)
			.addShapeBox(0.4375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.4375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.4375f, 0, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 288, 272, textureX, textureY)
			.addShapeBox(0.625f, 1.6875f, 0, 1, 2, 1, 0, -0.25f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 183, 272, textureX, textureY)
			.addShapeBox(0.5625f, 3.5f, 0, 1, 1, 1, 0, -0.25f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.25f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 178, 272, textureX, textureY)
			.addShapeBox(-0.375f, 3.1875f, 0, 1, 1, 1, 0, -0.25f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.25f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 62, 272, textureX, textureY)
			.addShapeBox(-0.4375f, 2.375f, 0, 1, 1, 1, 0, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 10, 272, textureX, textureY)
			.addShapeBox(-0.5625f, 1.75f, 0, 1, 1, 1, 0, 0.0625f, 0, -0.38f, -0.875f, 0, -0.38f, -0.875f, 0, -0.38f, 0.0625f, 0, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 5, 272, textureX, textureY)
			.addShapeBox(-0.9375f, 1.125f, 0, 1, 1, 1, 0, 0.25f, -0.1875f, -0.38f, -1.25f, 0, -0.38f, -1.25f, 0, -0.38f, 0.25f, -0.1875f, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 0, 272, textureX, textureY)
			.addShapeBox(-1.9375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.125f, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0.125f, -0.38f, -0.25f, -0.9375f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.9375f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 486, 271, textureX, textureY)
			.addShapeBox(-3.125f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.0625f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.0625f, -0.38f, -0.1875f, -0.875f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.875f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 481, 271, textureX, textureY)
			.addShapeBox(-2.5f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 476, 271, textureX, textureY)
			.addShapeBox(-0.125f, 1.8125f, 0, 1, 2, 1, 0, 0.125f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0.125f, -0.3125f, -0.4375f, -0.1875f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.1875f, 0, -0.4375f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 465, 271, textureX, textureY)
			.addShapeBox(-0.125f, 0.125f, 0, 1, 2, 1, 0, 0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.125f, 0, -0.4375f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 363, 164, textureX, textureY)
			.addShapeBox(-2.125f, -0.4375f, 0, 3, 1, 1, 0, -1.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -1.375f, -0.375f, -0.4375f, 0.5f, 0, -0.4375f, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, 0.5f, 0, -0.4375f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 460, 271, textureX, textureY)
			.addShapeBox(-1.1875f, 0.125f, 0, 1, 2, 1, 0, 0, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -1, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, 0, -1, -0.4375f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 120, 162, textureX, textureY)
			.addShapeBox(-3.125f, 0.125f, 0, 2, 1, 1, 0, -0.25f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.25f, 0, -0.4375f)
			.setRotationPoint(29, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 443, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.9375f, 0, -0.25f, 0.4375f, 0, -0.25f, 0.4375f, 0, -0.25f, -0.9375f, 0, -0.25f)
			.setRotationPoint(27, 0.21875f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 206, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.4375f, 0.5f, -0.25f)
			.setRotationPoint(26.8125f, -1.28125f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 122, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -1.4375f, -0.125f, -0.25f, 0.9375f, -0.125f, -0.25f, 0.9375f, -0.125f, -0.25f, -1.4375f, -0.125f, -0.25f)
			.setRotationPoint(25.625f, -3.15625f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 70, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.4375f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.5625f, -0.4375f, -0.4375f, -0.5625f)
			.setRotationPoint(25.4375f, -3.71875f, -10.6875f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 57, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.4375f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.5625f, -0.4375f, -0.4375f, -0.5625f)
			.setRotationPoint(25.4375f, -3.71875f, -10.25f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 375, 180, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 5, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(40.625f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 237, 155, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, -0.8125f, 0, -0.625f, -0.8125f, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(37.625f, 2.375f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 237, 152, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.3125f, -0.625f, 0.1875f, -0.3125f, -0.1875f, 0.375f, 0, -0.1875f, 0.375f, 0, -0.1875f, 0.375f, -0.3125f, -0.1875f, 0.375f)
			.setRotationPoint(37.625f, 2.375f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 237, 149, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 17, 1, 1, 0, -0.375f, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, -0.375f, -0.4375f, 0.1875f, -0.3125f, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, -0.3125f, -0.1875f, 0.1875f)
			.setRotationPoint(37.625f, 2.1875f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 351, 22, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 16, 1, 1, 0, 0.0625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.625f, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0.625f, -0.25f, 0.1875f)
			.setRotationPoint(38.625f, 1.875f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 201, 270, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(27.6875f, 1.21875f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 337, 164, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(40.625f, 2.5625f, -8.8125f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 237, 146, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(37.625f, 2.5625f, -9.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 211, 140, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, -0.8125f, 0, -0.625f, -0.8125f, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(37.625f, 2.375f, -9.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 26, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(28.125f, -4.0625f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 139, 270, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.625f, 0, -0.5f, 0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(26.9375f, -4.0625f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 300, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.125f, 0, 0, -1, 0, 0, -1, 0, 0.1875f, -0.125f, 0)
			.setRotationPoint(28.125f, -2.0625f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 507, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(26.4375f, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 502, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(27.4375f, -4.0625f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 497, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.375f, 0, -0.5f, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.0625f, 0)
			.setRotationPoint(25.9375f, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 433, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.3125f, -0.0625f, 0)
			.setRotationPoint(25.4375f, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 167, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(22.125f, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 428, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f)
			.setRotationPoint(22, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 38, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(18.75f, -3.75f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 501, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(18.75f, -3.125f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 189, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f)
			.setRotationPoint(32.125f, -4.0625f, -10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 423, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(32.125f, -2.0625f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 457, 159, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.3125f, 1.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 349, 158, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 1, 0, 0.125f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0.125f, -0.25f, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(38.3125f, 1.0625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 467, 146, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 2, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, -0.5f, 0)
			.setRotationPoint(38.3125f, 0.8125f, -9.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 196, 269, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 3, 1, 0, 0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5625f, 0.375f, -0.5f, -0.5625f, 0.375f, -1, -0.0625f, 0, -1, -0.0625f, 0, 0, -0.5625f, 0.375f, 0, -0.5625f)
			.setRotationPoint(39.3125f, 0.4375f, -5.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 171, 150, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 4, 0, 0.4375f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0.4375f, 0.4375f, 0, 0.4375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0.375f, 0, 0.4375f)
			.setRotationPoint(39.3125f, -0.0625f, -9.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 468, 176, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 5, 0, 0.4375f, -0.75f, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, -0.0625f, 0.4375f, -0.75f, -0.0625f, 0.4375f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.0625f, 0.4375f, 0, -0.0625f)
			.setRotationPoint(39.3125f, -1.0625f, -10.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 118, 269, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 1, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f)
			.setRotationPoint(38.5625f, -0.5625f, -10.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 98, 269, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 1, 0, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f)
			.setRotationPoint(38.5625f, -0.0625f, -10.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 441, 145, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 2, 0, 0.3125f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0.3125f, 0, 0.0625f, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0)
			.setRotationPoint(36.9375f, -0.0625f, -9.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 113, 269, textureX, textureY).addCylinder(-1, 0, 0, 1, 11, 8, 0.5f, 0.5f, 3, new Vec3f(0.4375, 0.0, 0.0))
			.setRotationPoint(44, 2.625f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 108, 269, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, null)
			.setRotationPoint(42.125f, 2.625f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 110, 131, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 17, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(29.523438f, -0.25f, -11).setRotationAngle(0, 0, -7).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 103, 269, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5625f, 0.5625f).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(29, -4.5f, -11.9375f).setRotationAngle(0, 0, 90)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 293, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(28.4375f, -4.5f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 93, 269, textureX, textureY).addCylinder(-2.6875f, 2.5f, -0.1875f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(29, -4.5f, -10.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 88, 269, textureX, textureY).addCylinder(-2.6875f, 2.5f, 0.375f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5625))
			.setRotationPoint(29, -4.5f, -11.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 83, 269, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(26, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 78, 269, textureX, textureY)
			.addShapeBox(-0.5f, -3, 0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(26, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 52, 269, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(26, -0.9375f, -10.9375f).setRotationAngle(0, 0, -4)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 321, 268, textureX, textureY)
			.addShapeBox(-0.5f, -3, 0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(26, -0.9375f, -10.75f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 288, 267, textureX, textureY)
			.addShapeBox(-0.5f, -4.125f, 0.0625f, 1, 1, 1, 0, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.1875f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f)
			.setRotationPoint(26, -0.9375f, -11.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 283, 267, textureX, textureY)
			.addShapeBox(-0.5f, -4.625f, 0.0625f, 1, 1, 1, 0, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.1875f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f)
			.setRotationPoint(26, -0.9375f, -11.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 272, 267, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.25f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0)
			.setRotationPoint(26, -0.9375f, -11.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 267, 267, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -1, -0.125f, 0, -1, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(26, -0.9375f, -11.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 262, 267, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.25f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f)
			.setRotationPoint(26, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 257, 267, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.375f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -1, -0.125f, 0, -1)
			.setRotationPoint(26, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 0, 158, textureX, textureY)
			.addShapeBox(-0.5f, -5.4375f, 0.0625f, 1, 1, 2, 0, -0.125f, -0.875f, -0.1875f, -0.125f, -0.875f, -0.1875f, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, 0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f)
			.setRotationPoint(26, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 389, 266, textureX, textureY)
			.addShapeBox(-0.5f, -5.5625f, 1.375f, 1, 1, 1, 0, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f)
			.setRotationPoint(26, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 316, 268, textureX, textureY).addCylinder(0, -4.8125f, 1.6875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(26, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 311, 268, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(20.9375f, -2.25f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 188, 268, textureX, textureY)
			.addShapeBox(-0.5f, -4, 0, 1, 4, 1, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(20.9375f, -2.25f, -9.875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 183, 268, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(25.664062f, -5.7421875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 178, 268, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(20.9375f, -5.75f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 66, 268, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(20.9375f, -5.7421875f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 205, 179, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 5, 1, 1, 0, 0, -0.375f, -0.4375f, -0.28125f, -0.375f, -0.4375f, -0.28125f, -0.375f, -0.40625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.4375f, -0.28125f, -0.375f, -0.4375f, -0.28125f, -0.375f, -0.40625f, 0, -0.375f, -0.375f)
			.setRotationPoint(21.4375f, -6.25f, -10.5625f).setRotationAngle(0, 0, 0).setName(" aBox 1080cp 0")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 297, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(18.75f, -3.125f, -9.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 64, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(18.75f, -3.75f, -9.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 52, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.375f, -0.75f, -0.1875f, -0.3125f, -0.75f, -0.1875f, -0.3125f, -0.75f, -0.1875f, -0.375f, -0.75f, -0.1875f, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f)
			.setRotationPoint(18.75f, -2.125f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 237, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.375f, -0.25f, -0.1875f)
			.setRotationPoint(18.75f, -3.125f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 211, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(18.75f, -3.375f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 200, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.375f, -0.25f, -0.1875f)
			.setRotationPoint(21.75f, -3.125f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 93, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(21.75f, -3.375f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 14, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(20.625f, -3.0625f, -8.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 61, 268, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(20.625f, -2.0625f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 135, 267, textureX, textureY)
			.addShapeBox(-1, -1.0625f, 0, 1, 2, 1, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(13.6875f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 170, 266, textureX, textureY)
			.addShapeBox(0, -1.0625f, 0, 1, 2, 1, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(13.6875f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 809cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 455, 65, textureX, textureY)
			.addShapeBox(0, -0.6875f, 0, 26, 1, 1, 0, 0, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f, 0, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f)
			.setRotationPoint(13.6875f, 5.5625f, -9.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 264, 65, textureX, textureY)
			.addShapeBox(0, 0.6875f, 0, 26, 1, 1, 0, 0, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f)
			.setRotationPoint(13.6875f, 5.5625f, -9.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 123, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(13.6875f, 5.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 0, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(13.6875f, 6.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 18, 266, textureX, textureY)
			.addShapeBox(-1.25f, -1.5f, 0, 1, 2, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f)
			.setRotationPoint(42.625f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 165, 266, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(40.3125f, 2.4375f, -9.3125f).setRotationAngle(0, 0, 9)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 148, 266, textureX, textureY).addCylinder(0, -2.4375f, 1.3125f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(26, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 10, 266, textureX, textureY)
			.addShapeBox(-0.484375f, 0, 0.015625f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.625f)
			.setRotationPoint(25.8125f, -3.375f, -11.125f).setRotationAngle(0, 0, -35).setName("Box 1082cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 140, 266, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(29, -4.5f, -10.9375f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 384, 265, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.625f, 0.625f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(29, -4.5f, -10.75f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 0, 21, textureX, textureY)
			.addShapeBox(4, -0.5f, 0, 6, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.5625f, 0, -0.1875f, 0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.5625f, 0, -0.1875f, 0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 489, 155, textureX, textureY)
			.addShapeBox(10, -0.5f, 0.375f, 2, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(15.4375f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 246, 265, textureX, textureY)
			.addShapeBox(0.6875f, -0.5f, 0, 1, 1, 1, 0, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 236, 265, textureX, textureY)
			.addShapeBox(-0.5625f, 0.09375f, 0, 1, 1, 1, 0, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 188, 265, textureX, textureY)
			.addShapeBox(-0.5625f, -1.09375f, 0, 1, 1, 1, 0, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 183, 265, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 178, 265, textureX, textureY)
			.addShapeBox(-0.6875f, -0.875f, 0, 1, 1, 1, 0, 0, -0.6875f, -0.3125f, -0.9375f, -0.5f, -0.3125f, -0.9375f, -0.5f, -0.3125f, 0, -0.6875f, -0.3125f, 0, 0.0625f, -0.3125f, -0.9375f, 0.25f, -0.3125f, -0.9375f, 0.25f, -0.3125f, 0, 0.0625f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 67, 265, textureX, textureY)
			.addShapeBox(-1, -0.625f, 0, 1, 1, 1, 0, 0.0625f, -0.625f, -0.1875f, -0.75f, -0.625f, -0.1875f, -0.75f, -0.625f, -0.1875f, 0.0625f, -0.625f, -0.1875f, 0, 0, -0.1875f, -0.75f, 0.375f, -0.1875f, -0.75f, 0.375f, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(13.6875f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 62, 265, textureX, textureY)
			.addShapeBox(-1, -0.75f, 0, 1, 1, 1, 0, 0, -0.375f, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, 0, -0.375f, -0.1875f, 0.0625f, -0.25f, -0.1875f, -0.75f, -0.25f, -0.1875f, -0.75f, -0.25f, -0.1875f, 0.0625f, -0.25f, -0.1875f)
			.setRotationPoint(13.6875f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 398, 155, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 1, 0, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f)
			.setRotationPoint(13.6875f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearFrontRight.add(new ModelRendererTurbo(ValveGearFrontRight, 57, 265, textureX, textureY)
			.addShapeBox(0.125f, -1, 0, 1, 2, 1, 0, -0.625f, -0.25f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.625f, -0.25f, -0.1875f, -0.625f, -0.25f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.625f, -0.25f, -0.1875f)
			.setRotationPoint(13.6875f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		groups.add(ValveGearFrontRight);
	}

	private final void initGroup_ValveGearFrontLeft(){
		TurboList ValveGearFrontLeft = new TurboList("ValveGearFrontLeft");
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 0, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(12.6875f, 6.8125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 52, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(11.9375f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 41, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(14.4375f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 441, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(27.1875f, 6.8125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 36, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(26.4375f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 31, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(28.9375f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 301, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(27.4375f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 274, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(41.6875f, 6.8125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 26, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(40.9375f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 5, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(43.4375f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 52, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(41.9375f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 425, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.1875f, 0, 0.1875f, -0.1875f, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.1875f, 0, 0.1875f, -0.1875f)
			.setRotationPoint(13.6875f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 104, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f)
			.setRotationPoint(12.6875f, 5.5625f, 6.09375f).setRotationAngle(0, 0, 0).setName("Box 807cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 92, 144, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 3, 1, 1, 0, -0.25f, 0.3125f, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, -0.25f, 0.3125f, -0.25f, -0.25f, 0.3125f, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, -0.25f, 0.3125f, -0.25f)
			.setRotationPoint(13.6875f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 1092cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 211, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(12.9375f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 460, 178, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 5, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 167, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(43.6875f, -3, 9.4375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 94, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(24.6875f, 6.8125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 489, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(24.6875f, 4.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 326, 264, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 7, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(44.25f, -2.625f, 9.59375f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 52, 144, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 2, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(40.625f, 2.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 396, 143, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(40.625f, 2.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 503, 142, textureX, textureY)
			.addShapeBox(-1.5f, -2.3125f, 0, 3, 1, 1, 0, 1.6875f, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 1.6875f, -0.6875f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f)
			.setRotationPoint(40.625f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 78, 178, textureX, textureY)
			.addShapeBox(-3.5f, -2.6875f, 0, 5, 1, 1, 0, -0.3125f, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, -0.3125f, -0.6875f, 0.375f, -0.3125f, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, -0.3125f, 0.0625f, 0.375f)
			.setRotationPoint(40.625f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 110, 128, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.625f, -0.3125f, -0.1875f, -0.625f)
			.setRotationPoint(37.625f, 2.5625f, 9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 375, 177, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 5, 1, 1, 0, -0.3125f, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.3125f, -0.625f, 0.1875f, -0.3125f, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, -0.3125f, -0.1875f, 0.1875f)
			.setRotationPoint(40.625f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 467, 142, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 2, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(40.625f, 2.5625f, 7.8125f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 455, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0, 0.125f, -0.25f)
			.setRotationPoint(13.6875f, 5.5625f, 8.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 321, 264, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(40.3125f, 2.8125f, 10.1875f).setRotationAngle(0, 0, 9)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 185, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0.3125f, -0.5f, 0)
			.setRotationPoint(24.9375f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 441, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0.3125f, -0.5f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(24.9375f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 316, 264, textureX, textureY).addCylinder(3.5f, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(13.6875f, 6.0625f, 9.5625f).setRotationAngle(0, 0, -60)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 311, 264, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(15.4375f, 3.03125f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 453, 145, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 4, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(15.4375f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 298, 264, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(28.1875f, 1.90625f, 9.78125f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 293, 264, textureX, textureY)
			.addShapeBox(12, -0.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(15.4375f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 288, 264, textureX, textureY)
			.addShapeBox(11, -0.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f)
			.setRotationPoint(15.4375f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 283, 264, textureX, textureY)
			.addShapeBox(11, -0.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, 8.5f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 272, 264, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, 8.5f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 267, 264, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(15.4375f, 3.03125f, 8.75f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 262, 264, textureX, textureY)
			.addShapeBox(12.125f, -0.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, 8.75f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 257, 264, textureX, textureY)
			.addShapeBox(12, -0.5f, -0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 14, 264, textureX, textureY)
			.addShapeBox(12.125f, -0.5f, -0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(15.4375f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 241, 264, textureX, textureY).addCylinder(-3.1875f, 0, 0, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(29, -4.5f, 10).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 231, 264, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(29, -4.5f, 9.9375f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 460, 263, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.625f, 0.625f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(29, -4.5f, 10).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 185, 142, textureX, textureY)
			.addShapeBox(-3.0625f, 0, 0, 3, 1, 1, 0, -0.25f, -0.4375f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.25f, -0.375f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.375f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 450, 263, textureX, textureY)
			.addShapeBox(-3.5625f, 0.6875f, 0, 1, 1, 1, 0, -0.3125f, 0.03125f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.3125f, 0.03125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.8125f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 170, 263, textureX, textureY)
			.addShapeBox(0.25f, 0.375f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.25f, -1.25f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.25f, -1.25f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 165, 263, textureX, textureY)
			.addShapeBox(0.4375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.4375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.4375f, 0, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 93, 263, textureX, textureY)
			.addShapeBox(0.625f, 1.6875f, 0, 1, 2, 1, 0, -0.25f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 88, 263, textureX, textureY)
			.addShapeBox(0.5625f, 3.5f, 0, 1, 1, 1, 0, -0.25f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.25f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 83, 263, textureX, textureY)
			.addShapeBox(-0.375f, 3.1875f, 0, 1, 1, 1, 0, -0.25f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.25f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 78, 263, textureX, textureY)
			.addShapeBox(-0.4375f, 2.375f, 0, 1, 1, 1, 0, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 361, 262, textureX, textureY)
			.addShapeBox(-0.5625f, 1.75f, 0, 1, 1, 1, 0, 0.0625f, 0, -0.38f, -0.875f, 0, -0.38f, -0.875f, 0, -0.38f, 0.0625f, 0, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 352, 262, textureX, textureY)
			.addShapeBox(-0.9375f, 1.125f, 0, 1, 1, 1, 0, 0.25f, -0.1875f, -0.38f, -1.25f, 0, -0.38f, -1.25f, 0, -0.38f, 0.25f, -0.1875f, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 347, 262, textureX, textureY)
			.addShapeBox(-1.9375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.125f, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0.125f, -0.38f, -0.25f, -0.9375f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.9375f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 342, 262, textureX, textureY)
			.addShapeBox(-3.125f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.0625f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.0625f, -0.38f, -0.1875f, -0.875f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.875f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 337, 262, textureX, textureY)
			.addShapeBox(-2.5f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 332, 262, textureX, textureY)
			.addShapeBox(-0.125f, 1.8125f, 0, 1, 2, 1, 0, 0.125f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0.125f, -0.3125f, -0.4375f, -0.1875f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.1875f, 0, -0.4375f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 148, 262, textureX, textureY)
			.addShapeBox(-0.125f, 0.125f, 0, 1, 2, 1, 0, 0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.125f, 0, -0.4375f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 207, 129, textureX, textureY)
			.addShapeBox(-2.125f, -0.4375f, 0, 3, 1, 1, 0, -1.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -1.375f, -0.375f, -0.4375f, 0.5f, 0, -0.4375f, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, 0.5f, 0, -0.4375f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 140, 262, textureX, textureY)
			.addShapeBox(-1.1875f, 0.125f, 0, 1, 2, 1, 0, 0, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -1, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, 0, -1, -0.4375f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 274, 151, textureX, textureY)
			.addShapeBox(-3.125f, 0.125f, 0, 2, 1, 1, 0, -0.25f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.25f, 0, -0.4375f)
			.setRotationPoint(29, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 434, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.9375f, 0, -0.25f, 0.4375f, 0, -0.25f, 0.4375f, 0, -0.25f, -0.9375f, 0, -0.25f)
			.setRotationPoint(27, 0.21875f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 408, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.4375f, 0.5f, -0.25f)
			.setRotationPoint(26.8125f, -1.28125f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 429, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -1.4375f, -0.125f, -0.25f, 0.9375f, -0.125f, -0.25f, 0.9375f, -0.125f, -0.25f, -1.4375f, -0.125f, -0.25f)
			.setRotationPoint(25.625f, -3.15625f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 403, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f)
			.setRotationPoint(25.4375f, -3.71875f, 9.6875f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 398, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f)
			.setRotationPoint(25.4375f, -3.71875f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 460, 175, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 5, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(40.625f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 110, 125, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.8125f, -0.3125f, -0.625f, -0.8125f, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.8125f, -0.3125f, -0.1875f, -0.8125f)
			.setRotationPoint(37.625f, 2.375f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 110, 122, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.3125f, -0.625f, 0.1875f, -0.3125f, -0.1875f, 0.375f, 0, -0.1875f, 0.375f, 0, -0.1875f, 0.375f, -0.3125f, -0.1875f, 0.375f)
			.setRotationPoint(37.625f, 2.375f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 110, 119, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 17, 1, 1, 0, -0.375f, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, -0.375f, -0.4375f, 0.1875f, -0.3125f, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, -0.3125f, -0.1875f, 0.1875f)
			.setRotationPoint(37.625f, 2.1875f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 351, 19, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 16, 1, 1, 0, 0.0625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.625f, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0.625f, -0.25f, 0.1875f)
			.setRotationPoint(38.625f, 1.875f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 393, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(27.6875f, 1.21875f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 26, 129, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(40.625f, 2.5625f, 7.8125f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 84, 113, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.625f, -0.3125f, -0.1875f, -0.625f)
			.setRotationPoint(37.625f, 2.5625f, 8.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 389, 112, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.8125f, -0.3125f, -0.625f, -0.8125f, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.8125f, -0.3125f, -0.1875f, -0.8125f)
			.setRotationPoint(37.625f, 2.375f, 8.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 443, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(28.125f, -4.0625f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 135, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.625f, 0, -0.5f, 0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(26.9375f, -4.0625f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 52, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.125f, 0, 0, -1, 0, 0, -1, 0, 0.1875f, -0.125f, 0)
			.setRotationPoint(28.125f, -2.0625f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 119, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(26.4375f, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 424, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(27.4375f, -4.0625f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 114, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.375f, 0, -0.5f, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.0625f, 0)
			.setRotationPoint(25.9375f, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 109, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.3125f, -0.0625f, 0)
			.setRotationPoint(25.4375f, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 441, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(22.125f, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 104, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f)
			.setRotationPoint(22, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 197, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(18.75f, -3.75f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 453, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(18.75f, -3.125f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 273, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.125f, -4.0625f, 5.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 18, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(32.125f, -2.0625f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 185, 149, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.3125f, 1.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 225, 143, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 1, 0, 0.125f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0.125f, -0.25f, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(38.3125f, 1.0625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 52, 140, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 2, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, -0.5f, 0)
			.setRotationPoint(38.3125f, 0.8125f, 7.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 9, 261, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 3, 1, 0, 0.375f, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, 0, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, 0, -0.5625f, 0, 0, -0.5625f, 0, -1, -0.0625f, 0.375f, -1, -0.0625f)
			.setRotationPoint(39.3125f, 0.4375f, 4.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 64, 140, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 4, 0, 0.4375f, 0, 0.4375f, 0.0625f, 0, 0.4375f, 0.0625f, 0, 0, 0.4375f, 0, 0, 0.375f, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(39.3125f, -0.0625f, 5.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 36, 173, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 5, 0, 0.4375f, -0.75f, -0.0625f, 0.0625f, -0.75f, -0.0625f, 0.0625f, -0.75f, 0, 0.4375f, -0.75f, 0, 0.4375f, 0, -0.0625f, 0.0625f, 0, -0.0625f, 0.0625f, 0, 0, 0.4375f, 0, 0)
			.setRotationPoint(39.3125f, -1.0625f, 5.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 210, 260, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 1, 0, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f)
			.setRotationPoint(38.5625f, -0.5625f, 9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 287, 259, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 1, 0, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f)
			.setRotationPoint(38.5625f, -0.0625f, 9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 185, 138, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 2, 0, 0.3125f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0.3125f, 0, 0.0625f, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0)
			.setRotationPoint(36.9375f, -0.0625f, 7.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 130, 262, textureX, textureY).addCylinder(-1, 0, 0, 1, 11, 8, 0.5f, 0.5f, 3, new Vec3f(0.4375, 0.0, 0.0))
			.setRotationPoint(44, 2.625f, 8.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 419, 261, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, null)
			.setRotationPoint(42.125f, 2.625f, 8.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 58, 107, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 17, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(29.523438f, -0.25f, 10).setRotationAngle(0, 0, -7).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 272, 260, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5625f, 0.5625f).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(29, -4.5f, 10.9375f).setRotationAngle(0, 0, 90)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 205, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(28.4375f, -4.5f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 267, 260, textureX, textureY).addCylinder(-2.6875f, 2.5f, -0.1875f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(29, -4.5f, 10).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 262, 260, textureX, textureY).addCylinder(-2.6875f, 2.5f, 0.375f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5625))
			.setRotationPoint(29, -4.5f, 10.0625f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 257, 260, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(26, -0.9375f, 11.9375f).setRotationAngle(0, 0, -4)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 246, 260, textureX, textureY)
			.addShapeBox(-0.5f, -3, -0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(26, -0.9375f, 11.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 241, 260, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(26, -0.9375f, 10.4375f).setRotationAngle(0, 0, -4)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 236, 260, textureX, textureY)
			.addShapeBox(-0.5f, -3, -0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(26, -0.9375f, 9.75f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 196, 258, textureX, textureY)
			.addShapeBox(-0.5f, -4.125f, -0.0625f, 1, 1, 1, 0, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.0625f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f)
			.setRotationPoint(26, -0.9375f, 10.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 186, 258, textureX, textureY)
			.addShapeBox(-0.5f, -4.625f, -0.0625f, 1, 1, 1, 0, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.0625f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f)
			.setRotationPoint(26, -0.9375f, 10.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 163, 258, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f)
			.setRotationPoint(26, -0.9375f, 10.5625f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 158, 258, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -1, -0.125f, 0, -1)
			.setRotationPoint(26, -0.9375f, 10.8125f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 153, 258, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0)
			.setRotationPoint(26, -0.9375f, 10.8125f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 69, 258, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.25f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -1, -0.125f, 0, -1, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(26, -0.9375f, 10.5625f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 479, 147, textureX, textureY)
			.addShapeBox(-0.5f, -5.4375f, -0.0625f, 1, 1, 2, 0, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, -0.1875f, -0.125f, -0.875f, -0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f)
			.setRotationPoint(26, -0.9375f, 10.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 348, 257, textureX, textureY)
			.addShapeBox(-0.5f, -5.5625f, 1.375f, 1, 1, 1, 0, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f)
			.setRotationPoint(26, -0.9375f, 8.4375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 231, 260, textureX, textureY).addCylinder(0, -4.8125f, 1.6875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(26, -0.9375f, 8.4375f).setRotationAngle(0, 0, -4)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 460, 259, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(20.9375f, -2.25f, 9.375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 455, 259, textureX, textureY)
			.addShapeBox(-0.5f, -4, 0, 1, 4, 1, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.9375f, -2.25f, 8.875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 450, 259, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(25.664062f, -5.7421875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 36, 259, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(20.9375f, -5.75f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 31, 259, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(20.9375f, -5.7421875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 189, 173, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 5, 1, 1, 0, 0, -0.375f, -0.375f, -0.28125f, -0.375f, -0.40625f, -0.28125f, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.375f, -0.28125f, -0.375f, -0.40625f, -0.28125f, -0.375f, -0.4375f, 0, -0.375f, -0.4375f)
			.setRotationPoint(21.4375f, -6.25f, 9.5625f).setRotationAngle(0, 0, 0).setName(" aBox 1080cp 1")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 197, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(18.75f, -3.125f, 8.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 245, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(18.75f, -3.75f, 8.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 88, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.375f, -0.75f, -0.1875f, -0.3125f, -0.75f, -0.1875f, -0.3125f, -0.75f, -0.1875f, -0.375f, -0.75f, -0.1875f, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f)
			.setRotationPoint(18.75f, -2.125f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 274, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.375f, -0.25f, -0.1875f)
			.setRotationPoint(18.75f, -3.125f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 175, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(18.75f, -3.375f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 479, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.375f, -0.25f, -0.1875f)
			.setRotationPoint(21.75f, -3.125f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 248, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(21.75f, -3.375f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 14, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.625f, -3.0625f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 296, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f)
			.setRotationPoint(20.625f, -2.0625f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 219, 258, textureX, textureY)
			.addShapeBox(-1, -1.0625f, 0, 1, 2, 1, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(13.6875f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 26, 258, textureX, textureY)
			.addShapeBox(0, -1.0625f, 0, 1, 2, 1, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(13.6875f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 809cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 264, 62, textureX, textureY)
			.addShapeBox(0, -0.6875f, 0, 26, 1, 1, 0, 0, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f, 0, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f)
			.setRotationPoint(13.6875f, 5.5625f, 8.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 455, 59, textureX, textureY)
			.addShapeBox(0, 0.6875f, 0, 26, 1, 1, 0, 0, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f)
			.setRotationPoint(13.6875f, 5.5625f, 8.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 364, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(13.6875f, 5.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 303, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(13.6875f, 6.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 14, 258, textureX, textureY)
			.addShapeBox(-1.25f, -1.5f, 0, 1, 2, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f)
			.setRotationPoint(42.625f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 5, 258, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(40.3125f, 2.4375f, 8.5625f).setRotationAngle(0, 0, 9)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 434, 257, textureX, textureY).addCylinder(0, -2.4375f, 1.1875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(26, -0.9375f, 9.5f).setRotationAngle(0, 0, -4)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 429, 257, textureX, textureY)
			.addShapeBox(-0.484375f, 0, -0.015625f, 1, 2, 1, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.25f)
			.setRotationPoint(25.8125f, -3.375f, 10.125f).setRotationAngle(0, 0, -35).setName("Box 1082cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 424, 257, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(29, -4.5f, 10.5625f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 419, 257, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.625f, 0.625f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(29, -4.5f, 10.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 0, 18, textureX, textureY)
			.addShapeBox(4, -0.5f, 0, 6, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(15.4375f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 158, 140, textureX, textureY)
			.addShapeBox(10, -0.5f, 0.375f, 2, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(15.4375f, 3.03125f, 9.25f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 283, 257, textureX, textureY)
			.addShapeBox(0.6875f, -0.5f, 0, 1, 1, 1, 0, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 214, 257, textureX, textureY)
			.addShapeBox(-0.5625f, 0.09375f, 0, 1, 1, 1, 0, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 209, 257, textureX, textureY)
			.addShapeBox(-0.5625f, -1.09375f, 0, 1, 1, 1, 0, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 171, 257, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 118, 257, textureX, textureY)
			.addShapeBox(-0.6875f, -0.875f, 0, 1, 1, 1, 0, 0, -0.6875f, -0.3125f, -0.9375f, -0.5f, -0.3125f, -0.9375f, -0.5f, -0.3125f, 0, -0.6875f, -0.3125f, 0, 0.0625f, -0.3125f, -0.9375f, 0.25f, -0.3125f, -0.9375f, 0.25f, -0.3125f, 0, 0.0625f, -0.3125f)
			.setRotationPoint(40.3125f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 113, 257, textureX, textureY)
			.addShapeBox(-1, -0.625f, 0, 1, 1, 1, 0, 0.0625f, -0.625f, -0.1875f, -0.75f, -0.625f, -0.1875f, -0.75f, -0.625f, -0.1875f, 0.0625f, -0.625f, -0.1875f, 0, 0, -0.1875f, -0.75f, 0.375f, -0.1875f, -0.75f, 0.375f, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(13.6875f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 108, 257, textureX, textureY)
			.addShapeBox(-1, -0.75f, 0, 1, 1, 1, 0, 0, -0.375f, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, 0, -0.375f, -0.1875f, 0.0625f, -0.25f, -0.1875f, -0.75f, -0.25f, -0.1875f, -0.75f, -0.25f, -0.1875f, 0.0625f, -0.25f, -0.1875f)
			.setRotationPoint(13.6875f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 148, 140, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 1, 0, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f)
			.setRotationPoint(13.6875f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearFrontLeft.add(new ModelRendererTurbo(ValveGearFrontLeft, 83, 257, textureX, textureY)
			.addShapeBox(0.125f, -1, 0, 1, 2, 1, 0, -0.625f, -0.25f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.625f, -0.25f, -0.1875f, -0.625f, -0.25f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.625f, -0.25f, -0.1875f)
			.setRotationPoint(13.6875f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		groups.add(ValveGearFrontLeft);
	}

	private final void initGroup_FRAME(){
		TurboList FRAME = new TurboList("FRAME");
		FRAME.add(new ModelRendererTurbo(FRAME, 154, 287, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(13.6875f, 3, -6.01f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 121, 287, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(28.1875f, 3, -6.01f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 361, 243, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(42.6875f, 3, -6.01f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 309, 214, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(13.6875f, 3, 6.01f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 283, 197, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(28.1875f, 3, 6.01f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 401, 168, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(42.6875f, 3, 6.01f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 200, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(47.5625f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(47.5625f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 507, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(47.5625f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 378, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(47.5625f, -1.375f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 369, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(47.4375f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 364, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(46.8125f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 297, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(47.4375f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 284, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(46.8125f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 297, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f,
				new boolean[]{ false, false, true, false, true, false })
			.setRotationPoint(47.4375f, -0.875f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 284, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(47.4375f, -0.875f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 145, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f,
				new boolean[]{ false, false, true, false, true, false })
			.setRotationPoint(46.8125f, -0.875f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 131, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(46.8125f, -0.875f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 127, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(47.4375f, -0.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 123, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(47.4375f, -0.875f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 101, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(46.8125f, -0.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 108, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(46.8125f, -0.875f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 97, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(46.8125f, -0.8125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 93, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(47.4375f, -0.8125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 89, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(46.8125f, -0.8125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 43, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(47.4375f, -0.8125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 78, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(47.4375f, -0.8125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 467, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(44.9375f, -0.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 441, 140, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(9.9375f, -0.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 52, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(44.9375f, 4.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 185, 138, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(9.9375f, 4.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 174, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(7.8125f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 129, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(7.8125f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 124, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(7.8125f, -1.375f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 60, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(7.8125f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 39, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(7.6875f, -0.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 29, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(7.0625f, -0.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 488, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(7.6875f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 483, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(7.0625f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 464, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(7.6875f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 441, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(7.0625f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 25, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f,
				new boolean[]{ false, false, true, false, true, false })
			.setRotationPoint(7.6875f, -0.875f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 10, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(7.6875f, -0.875f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 487, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f,
				new boolean[]{ false, false, true, false, true, false })
			.setRotationPoint(7.0625f, -0.875f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 483, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(7.0625f, -0.875f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 464, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(7.6875f, -0.875f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 441, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(7.0625f, -0.875f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 429, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(7.0625f, -0.8125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 358, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(7.6875f, -0.8125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 302, 283, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(7.0625f, -0.8125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 71, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(7.6875f, -0.8125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 375, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(7.6875f, -0.8125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 460, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(38.9375f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 434, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(38.9375f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 436, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(36.8125f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 334, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(36.8125f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 7, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(36.4375f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(31.4375f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 245, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(36.4375f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 238, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(31.4375f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 382, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(31.4375f, 0.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 323, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(31.4375f, 0.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 354, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(38.4375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(31.4375f, 4.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 329, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(31.4375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 505, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(34.9375f, 2.125f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 474, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.125f, 0, 0.125f, -0.125f, 0, -0.125f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.125f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(36.0625f, 2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 456, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.125f, 0.25f, 0.125f, -0.125f, 0.25f, 0.125f, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.125f, -0.125f, 0.25f, -0.125f, -0.125f, 0, -0.5f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(33.5625f, 2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 302, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(33.0625f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 231, 251, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(42.6875f, 3, -5.5625f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 212, 251, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(42.6875f, 3, 4.4375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 324, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(42.6875f, 3, -6).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 240, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(37.3125f, 2.375f, -5.75f).setRotationAngle(0, 0, 180)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 225, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(33.5625f, 2.375f, -5.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 220, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(37.3125f, 2.375f, 4.25f).setRotationAngle(0, 0, 180)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 215, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(33.5625f, 2.375f, 4.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 378, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(34.9375f, 2.125f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 371, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.125f, 0, 0.125f, -0.125f, 0, -0.125f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.125f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(36.0625f, 2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 368, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.125f, 0.25f, 0.125f, -0.125f, 0.25f, 0.125f, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.125f, -0.125f, 0.25f, -0.125f, -0.125f, 0, -0.5f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(33.5625f, 2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 35, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(31.4375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 501, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(38.4375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(31.4375f, 4.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 210, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(33.0625f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 179, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(24.4375f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 52, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(24.4375f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 78, 251, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(28.1875f, 3, -5.5625f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 59, 251, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(28.1875f, 3, 4.4375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 205, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(28.1875f, 3, -6).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 195, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(22.3125f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 190, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(22.3125f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 365, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(20.4375f, 2.125f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 362, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.125f, 0, 0.125f, -0.125f, 0, -0.125f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.125f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(21.5625f, 2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 329, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.125f, 0.25f, 0.125f, -0.125f, 0.25f, 0.125f, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.125f, -0.125f, 0.25f, -0.125f, -0.125f, 0, -0.5f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(19.0625f, 2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 47, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(20.4375f, 2.125f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 433, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.125f, 0, 0.125f, -0.125f, 0, -0.125f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.125f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(21.5625f, 2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 76, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.125f, 0.25f, 0.125f, -0.125f, 0.25f, 0.125f, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.125f, -0.125f, 0.25f, -0.125f, -0.125f, 0, -0.5f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(19.0625f, 2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 155, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(19.0625f, 2.375f, -5.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 119, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(22.8125f, 2.375f, 4.25f).setRotationAngle(0, 0, 180)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 114, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(19.0625f, 2.375f, 4.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 104, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(22.8125f, 2.375f, -5.75f).setRotationAngle(0, 0, 180)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 497, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(16.9375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 493, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(23.9375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 460, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(16.9375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 446, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(23.9375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 55, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(18.5625f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 478, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(18.5625f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 323, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(16.9375f, 4.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 415, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(16.9375f, 0.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 489, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(16.9375f, 0.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 316, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(21.9375f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 309, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(16.9375f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 163, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(21.9375f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 137, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(16.9375f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 463, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(16.9375f, 4.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(9.9375f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 467, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(9.9375f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 459, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(13.6875f, 3, -5.5625f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 452, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(13.6875f, 3, 4.4375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 50, 317, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(13.6875f, 3, -6).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 104, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(0.1875f, 5.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 418")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 114, 201, textureX, textureY)
			.addBox(0, 0, 0, 2, 4, 3, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(3.1875f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 424")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 1.25f, 1, -4, 0, 3, 0, 0, 3, -10, 1.25f, 1, -6, 1.25f, -1, -4, 0, -3, 0, 0, -3, -10, 1.25f, -1, -6,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(6.4375f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 422")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 9, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 1.25f, 0, -4, 0, 0, 0, 0, 0, -10, 1.25f, 0, -6, 1.25f, 0, -4, 0, 0, 0, 0, 0, -10, 1.25f, 0, -6,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(6.4375f, 4.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 423")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 214, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 1.25f, 0, -6, 0, 0, -10, 0, 0, 0, 1.25f, 0, -4, 1.25f, 0, -6, 0, 0, -10, 0, 0, 0, 1.25f, 0, -4,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(6.4375f, 4.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 426")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 205, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 1.25f, 1, -6, 0, 3, -10, 0, 3, 0, 1.25f, 1, -4, 1.25f, -1, -6, 0, -3, -10, 0, -3, 0, 1.25f, -1, -4,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(6.4375f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 427")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 349, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(0.1875f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 413cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 276, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0,
				new boolean[]{ true, false, false, false, true, true })
			.setRotationPoint(-0.8125f, 1.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 415")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 331, 266, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, false, false, true, true })
			.setRotationPoint(-0.8125f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 416")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 466, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0,
				new boolean[]{ true, false, false, false, true, true })
			.setRotationPoint(-0.8125f, 5.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 419")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 231, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, false, false, true, true })
			.setRotationPoint(-0.8125f, 5.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 421")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 469, 316, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-0.8125f, 1.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 417")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 35, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.875f, 0, 0, -1.875f, 0, -0.25f, 1, 0, -0.25f, 1.125f, 0, 0, -2, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(74.6875f, 6.25f, -2.375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 459, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.625f, 0, 0, -1.9375f, 0, -0.25f, 1.125f, 0, -0.25f, 1, 0, 0, -1.875f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(74.9375f, 6.25f, -0.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 158, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0.5f, 0, -0.6875f, 0.5f)
			.setRotationPoint(74.4375f, 8, 2.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 136, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0.5f, 0, -0.6875f, 0.5f)
			.setRotationPoint(74.4375f, 8, -9.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 237, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.1875f, 0, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f, 0.5f, 0, -0.1875f, 0.5f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(74.4375f, 7.1875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.1875f, 0, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f, 0.5f, 0, -0.1875f, 0.5f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(74.4375f, 7.1875f, 2.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 211, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.625f, 0, -0.25f, 0.25f, 0, -3.75f, 0.25f, 0, -3.25f, -0.625f, 0, 0.25f, -0.625f, -0.5f, -0.25f, 0.25f, -0.5f, -3.75f, 0.25f, -0.5f, -3.25f, -0.625f, -0.5f, 0.25f)
			.setRotationPoint(75.8125f, 8.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 489, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.8125f, -0.1875f, 0)
			.setRotationPoint(74.125f, 5.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 342, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(73.9375f, 2, -5.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 335, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(73.9375f, 2, 3.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 416, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.625f, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(73.9375f, 2, 7.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 383, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.625f, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(73.9375f, 2, -9).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 170, 316, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(75.6875f, 5.75f, 1.35f).setRotationAngle(0, 0, 0).setName("Box 517cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 271, 315, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(75.6875f, 3.75f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 515cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 425, 319, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 1, -0.5f, 0, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 1, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(75.6875f, 2.75f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 520cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 118, 249, textureX, textureY)
			.addBox(0, 0, 0, 2, 2, 2, 0, 1f, new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(75.6875f, 2, -1).setRotationAngle(0, 0, 0).setName("Box 414cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 266, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(75.6875f, 0.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 529cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 276, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0,
				new boolean[]{ false, true, false, false, true, true })
			.setRotationPoint(74.9375f, 3.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 76, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0,
				new boolean[]{ false, true, false, false, true, true })
			.setRotationPoint(74.9375f, 1.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 400cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 312, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0,
				new boolean[]{ false, true, false, false, false, true })
			.setRotationPoint(74.9375f, 1.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 397cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 286, 303, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0,
				new boolean[]{ false, true, false, false, false, true })
			.setRotationPoint(74.9375f, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 440, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(74.9375f, 1.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 394cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 100, 301, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(74.9375f, 1.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 395cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 127, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(74.9375f, 1.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 390cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 104, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(74.4375f, 0.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 392cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 421, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, -0.5f, -0.5f, -2, 0, -0.5f, -2, 0, 0, 1, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(75.6875f, 1.25f, 8).setRotationAngle(0, 0, 0).setName("Box 527cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 456, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, -0.5f, -0.5f, -2, 0, -0.5f, -2, 0, 0, 1, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(75.6875f, 1.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 528cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 504, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(75.6875f, 0.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1086cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 228, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(75.6875f, 0.25f, 8).setRotationAngle(0, 0, 0).setName("Box 1087cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 415, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(75.6875f, -0.25f, -9).setRotationAngle(0, 0, 0).setName("Box 525cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 451, 315, textureX, textureY)
			.addBox(0, 0, 0, 2, 3, 3, 0, 1f, new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(73.1875f, 1, -1.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 484, 286, textureX, textureY)
			.addBox(0, 0, 0, 1, 2, 25, 0, 1f, new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(72.6875f, 0, -12.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 251, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 25, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(73.6875f, 0, -12.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 158, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(73.6875f, 2, -10.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 111, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(73.8125f, 1.75f, 3.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 415, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(69.1875f, 2, -1.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.25f, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(59.4375f, 2, -5).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 130, 163, textureX, textureY)
			.addBox(0, 0, 0, 13.25f, 2, 10, 0, 1f, new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(59.4375f, 0, -5).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 187, 288, textureX, textureY)
			.addBox(0, 0, 0, 13.25f, 5, 6, 0, 1f, new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(59.625f, -4.25f, -3).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 330, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(74.3125f, -0.75f, -9.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 444, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(74.3125f, -0.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 467, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(74.3125f, -1, -9.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 374, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(73.1875f, -2, -4.875f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 307, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(73.1875f, -2, -3.375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 465, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(73.1875f, -2, 3.125f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 446, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(73.1875f, -2, 4.625f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 344, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(73.4375f, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 339, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(73.4375f, -8, -8.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 245, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(73.4375f, -8, 8.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 179, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(73.4375f, -8, 11.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 433, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(73.4375f, -2.25f, -11.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 426, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(73.4375f, -4.75f, -11.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 419, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(73.4375f, -7.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 104, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(73.4375f, -2.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 407, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(73.4375f, -4.75f, 8.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 400, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(73.4375f, -7.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 293, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(73.6875f, -3.5f, -12.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 289, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(73.6875f, -3.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 170, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.5f,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(73.6875f, -3.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 311, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.5f,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(73.6875f, -3.5f, 11.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 66, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(73.9375f, -3.5f, -12.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 105, 298, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(73.9375f, -3.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 230, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(73.9375f, -3.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 483, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(73.9375f, -3.5f, 12).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 165, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(74.1875f, -12.25f, -12.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 150, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(74.1875f, -12.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 279, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(74.1875f, -12.25f, 7.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 160, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(74.1875f, -12.25f, 12).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 437, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -9.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 250, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -8.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 245, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -9.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 240, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -8.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 145, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0, -0.75f, 0.5f, 0, -0.75f, -2, 0.5f, 0, 1.25f, 0.5f, 0, 1.25f, 0.5f, -0.75f, -2, 0.5f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.1875f, -16.75f, -12.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 109, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0, -0.75f, 0.5f, 0, -0.75f, -2, 0.5f, 0, 1.25f, 0.5f, 0, 1.25f, 0.5f, -0.75f, -2, 0.5f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.1875f, -16.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 235, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -9.75f, 8.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 230, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -8.75f, 8.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 225, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -9.75f, 11.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 220, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -8.75f, 11.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 99, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0, -0.75f, 0.5f, 0, -0.75f, -2, 0.5f, 0, 1.25f, 0.5f, 0, 1.25f, 0.5f, -0.75f, -2, 0.5f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.1875f, -16.75f, 7.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 89, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0, -0.75f, 0.5f, 0, -0.75f, -2, 0.5f, 0, 1.25f, 0.5f, 0, 1.25f, 0.5f, -0.75f, -2, 0.5f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.1875f, -16.75f, 12).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 84, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(71.6875f, -16.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 71, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(71.6875f, -16.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 20, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(70.9375f, -16.75f, -12.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 5, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(70.9375f, -16.75f, 12).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 79, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(66.9375f, -17, -12.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 66, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(66.9375f, -17, 12).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 164, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(67.1875f, -17, -12.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 296, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(67.1875f, -17, 12).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 443, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(71.6875f, -17, -7.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 271, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 6.25f, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -1, -0.75f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(66.9375f, -9.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 263, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 6.25f, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -1, -0.75f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(66.9375f, -9.75f, 11.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 474, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(72.1875f, -10, -0.125f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 508, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(72.1875f, -10, 3.875f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 66, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(72.1875f, -10, -4.125f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 262, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.5f, 0.25f, 11, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(71.6875f, -6.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(71.6875f, -9.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 357, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(72.6875f, -7, -7).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 259, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 3, -0.5f, 0, 3, -0.5f, 0, 3, 0, 0, 3,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(72.6875f, -8, -4).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 296, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 26, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0.25f, -1.5f, 0, 0.25f, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(65.9375f, -10.25f, -13).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 212, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(71.6875f, -10.9f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1618")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(70.1875f, -11.9f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1619")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 46, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(70.1875f, -12.4f, 2).setRotationAngle(0, 9.6875f, 0).setName("Box 1842cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 504, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(70.25f, -12.4f, -2.0625f).setRotationAngle(0, -10.8125f, 0).setName("Box 1843cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 393, 247, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 9, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(69.6875f, -6.125f, -4.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 297, 247, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 1, null)
			.setRotationPoint(55.375f, -3.75f, 10).setRotationAngle(90, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 290, 247, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 8, 8, 1, 1, 3, new Vec3f(0.3125, 0.0, 0.0))
			.setRotationPoint(59.625f, -2.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 283, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(-2, 1.75f, 0).setRadius(1.75f, 0).setLength(2).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(2.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(50.375f, -7.875f, 0).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 271, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(-2, 1.75f, 0).setRadius(1.75f, 0).setLength(2).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(2.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(50.375f, -7.875f, 0).setRotationAngle(0, 0, 45)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 264, 247, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(48.625f, -8.25f, 0).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 254, 294, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 20, 8, 1, 1, 3, new Vec3f(-0.6875, 0.0, 0.0))
			.setRotationPoint(50.375f, -6.125f, 0).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 257, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -1.75f, -1).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 1.0)).setTopRotation(new Vec3f(0.0, 0.0, -45.0)).build()
			.setRotationPoint(69.6875f, -4.375f, -4.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 193, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -1.75f, -1).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 1.0)).setTopRotation(new Vec3f(0.0, 0.0, -45.0)).build()
			.setRotationPoint(69.6875f, -4.375f, -4.75f).setRotationAngle(45, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 92, 247, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(69.6875f, -4.375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 85, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -1.0)).setTopRotation(new Vec3f(0.0, 0.0, 45.0)).build()
			.setRotationPoint(69.6875f, -4.375f, 4.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 66, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -1.0)).setTopRotation(new Vec3f(0.0, 0.0, 45.0)).build()
			.setRotationPoint(69.6875f, -4.375f, 4.75f).setRotationAngle(-45, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 40, 247, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(69.6875f, -4.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 33, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(1.75f, 0, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(67.9375f, -3.875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(1.75f, 0, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(67.9375f, -3.875f, 6.5f).setRotationAngle(0, 0, 45)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 14, 247, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 4, 8, 1, 1, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(57.125f, -6.5f, 10).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 7, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(57.125f, -4.75f, 10).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(57.125f, -4.75f, 10).setRotationAngle(0, 0, -45)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 245, 246, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(-45.0, 0.0, 0.0)).build()
			.setRotationPoint(61.625f, -6.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 238, 246, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(-45.0, 0.0, 0.0)).build()
			.setRotationPoint(61.625f, -6.5f, 8.25f).setRotationAngle(0, 45, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 231, 246, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -1.75f, -1).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 1.0)).setTopRotation(new Vec3f(0.0, 0.0, -25.0)).build()
			.setRotationPoint(63.375f, -4.75f, 8.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 219, 246, textureX, textureY).addCylinder(0, -1.75f, -8, 1.75f, 8, 8, 1, 1, 1, null)
			.setRotationPoint(63.375f, -4.75f, 8.25f).setRotationAngle(25, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 212, 246, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 1, null)
			.setRotationPoint(55.375f, -3.75f, -10).setRotationAngle(90, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 205, 246, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 4, 8, 1, 1, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(57.125f, -6.5f, -10).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 59, 246, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(57.125f, -4.75f, -10).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 316, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(57.125f, -4.75f, -10).setRotationAngle(0, 0, -45)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 309, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(61.625f, -6.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 459, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(61.625f, -6.5f, -8.25f).setRotationAngle(0, -45, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 452, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -1.0)).setTopRotation(new Vec3f(0.0, 0.0, 25.0)).build()
			.setRotationPoint(63.375f, -4.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 445, 244, textureX, textureY).addCylinder(0, -1.75f, 0, 1.75f, 8, 8, 1, 1, 1, null)
			.setRotationPoint(63.375f, -4.75f, -8.25f).setRotationAngle(-25, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 323, 244, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 8, 8, 1, 1, 3, new Vec3f(0.3125, 0.0, 0.0))
			.setRotationPoint(59.625f, -2.125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 118, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(1.75f, 0, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(67.9375f, -3.875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 111, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(1.75f, 0, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(67.9375f, -3.875f, -6.5f).setRotationAngle(0, 0, 45)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 225, textureX, textureY).addCylinder(0, 0, 0, 2, 11, 12, 0.9375f, 0.9375f, 3, new Vec3f(-0.25, 0.0, 0.0))
			.setRotationPoint(49.6875f, -2, -10.4375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 78, 194, textureX, textureY).addCylinder(-1, 0, 0, 3, 10, 12, 1, 1, 3, new Vec3f(0.4375, 0.0, 0.0))
			.setRotationPoint(50.4375f, 2.625f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 441, 224, textureX, textureY).addCylinder(0, 0, 0, 2, 11, 12, 0.9375f, 0.9375f, 3, new Vec3f(-0.25, 0.0, 0.0))
			.setRotationPoint(49.6875f, -2, 10.4375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 363, 193, textureX, textureY).addCylinder(-1, 0, 0, 3, 10, 12, 1, 1, 3, new Vec3f(0.4375, 0.0, 0.0))
			.setRotationPoint(50.4375f, 2.625f, 8.9375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 426, 315, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(55.375f, 0.0078125f, -12).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 421, 315, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(55.375f, 0.0078125f, 11.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 485, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 9, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0.5f, -0.125f, 0,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(51.625f, -2.5625f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 132, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 9, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0.5f, -0.375f, 0,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(51.625f, -3.1875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 104, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, -0.375f, 0, 0.5f, -0.375f, 0,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(51.625f, -3.8125f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 409, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.875f, 0.5f, -0.1875f, -0.875f, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.125f, 0.5f, -0.375f, -0.125f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(51.625f, -4.4375f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 326, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 7, 0, 0.5f, -0.25f, -1.125f, 0, -0.25f, -1.125f, 0, -0.25f, -3.4375f, 0.5f, -0.25f, -3.4375f, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0.125f, 0.5f, -0.375f, 0.125f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(51.625f, -4.875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 461, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 8, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.4375f, 0.5f, 0, 0.4375f, 0.5f, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, 0.5f, -0.5625f, 0,
				new boolean[]{ false, false, true, false, true, false })
			.setRotationPoint(51.625f, 1.1875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 337, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 7, 9, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0.5f, -0.125f, -0.125f)
			.setRotationPoint(51.625f, -4.25f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 272, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(51.125f, -0.6875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 265, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, false, true, true, false })
			.setRotationPoint(54.875f, 0.1875f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 99, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -1, 0.25f, -0.5f, -1, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, false, true, true, false })
			.setRotationPoint(54.875f, -0.3125f, 10.875f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 404, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, false, true, true, false })
			.setRotationPoint(54.875f, -0.3125f, 9.875f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 155, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, 0,
				new boolean[]{ true, true, true, false, true, true })
			.setRotationPoint(54.875f, -1.0625f, 10.625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 7, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0.3125f, 0.25f, -0.375f, 0.3125f, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, 0, 0.25f, -0.625f, 0.3125f, 0.25f, -0.625f, 0.3125f,
				new boolean[]{ true, true, true, false, true, true })
			.setRotationPoint(54.875f, -1.0625f, 11.625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 112, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(53.875f, 0.0078125f, 11.0625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 150, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.9375f, -0.75f, 0, -0.9375f, -0.75f, 0, 0, 0, 0, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(54.375f, -0.6875f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 285, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.9375f, -0.75f, 0, -0.9375f, -0.75f, 0, 0, 0, 0, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(56.125f, -0.6875f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 379, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(54.625f, -0.9375f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 99, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, -0.9375f, -0.75f, 0, -0.9375f, -0.75f, 0, 0, -0.0625f, -0.0625f, 0, 0, -0.75f, -0.9375f, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ true, true, false, true, true, false })
			.setRotationPoint(54.375f, -0.9375f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 466, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.9375f, -0.0625f, -0.0625f, -0.9375f, -0.0625f, -0.0625f, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, -0.75f, -0.75f, 0,
				new boolean[]{ false, true, false, true, true, false })
			.setRotationPoint(55.375f, -0.9375f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 75, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, -0.9375f, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.86328125f, -0.5f, 0, -0.86328125f, -0.5f, 0, -0.07421875f, 0, 0, -0.07421875f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(54.625f, 0.4375f, 11.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 230, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.9375f, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.0625f, -0.8828125f, -0.75f, 0, -0.86328125f, -0.75f, 0, -0.07421875f, -0.0625f, -0.0625f, -0.0546875f,
				new boolean[]{ true, false, true, false, true, false })
			.setRotationPoint(54.375f, 0.4375f, 11.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 488, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.86328125f, -0.0625f, -0.0625f, -0.8828125f, -0.0625f, -0.0625f, -0.0546875f, -0.75f, 0, -0.07421875f,
				new boolean[]{ false, true, true, false, true, false })
			.setRotationPoint(55.375f, 0.4375f, 11.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 130, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 9, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(51.625f, -2.5625f, -12.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 479, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 9, 0, 0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(51.625f, -3.1875f, -12.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 104, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.5f, -0.375f, 0.125f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(51.625f, -3.8125f, -12.5625f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 409, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0.5f, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(51.625f, -4.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 7, 0, 0.5f, -0.25f, -3.4375f, 0, -0.25f, -3.4375f, 0, -0.25f, -1.125f, 0.5f, -0.25f, -1.125f, 0.5f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(51.625f, -4.875f, -10.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 443, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 8, 0, 0.5f, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, 0.5f, -0.5625f, -0.5f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(51.625f, 1.1875f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 195, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(56.625f, -0.6875f, -12.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(54.875f, 0.1875f, -12.375f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 426, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, -1, 0.25f, -0.5f, -1, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(54.875f, -0.3125f, -11.875f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 245, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(54.875f, -0.3125f, -10.875f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 510, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, false, true, true })
			.setRotationPoint(54.875f, -1.0625f, -11.625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 510, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.375f, 0.3125f, 0.25f, -0.375f, 0.3125f, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.625f, 0.3125f, 0.25f, -0.625f, 0.3125f, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, 0,
				new boolean[]{ true, true, true, false, true, true })
			.setRotationPoint(54.875f, -1.0625f, -12.625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 95, 107, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(53.875f, 0.0078125f, -12.0625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 426, 303, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.125f, -0.5625f, -0.75f, -0.125f, -0.5625f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(54.375f, -0.6875f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 114, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.125f, -0.5625f, -0.75f, -0.125f, -0.5625f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(56.125f, -0.6875f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 398, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(54.625f, -0.9375f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 466, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.9375f, -0.0625f, -0.0625f, -0.9375f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f,
				new boolean[]{ true, false, false, true, false, true })
			.setRotationPoint(54.375f, -0.9375f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 230, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.9375f, -0.75f, 0, -0.9375f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, -0.75f, -0.75f, -0.9375f,
				new boolean[]{ false, true, false, true, false, true })
			.setRotationPoint(55.375f, -0.9375f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 333, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, 0, -0.07421875f, -0.5f, 0, -0.07421875f, -0.5f, 0, -0.86328125f, 0, 0, -0.86328125f,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(54.625f, 0.4375f, -12.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 172, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.0625f, -0.0546875f, -0.75f, 0, -0.07421875f, -0.75f, 0, -0.86328125f, -0.0625f, -0.0625f, -0.8828125f,
				new boolean[]{ true, false, true, false, false, true })
			.setRotationPoint(54.375f, 0.4375f, -12.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 228, 283, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, -0.75f, -0.75f, -0.9375f, -0.75f, 0, -0.07421875f, -0.0625f, -0.0625f, -0.0546875f, -0.0625f, -0.0625f, -0.8828125f, -0.75f, 0, -0.86328125f,
				new boolean[]{ false, true, true, false, false, true })
			.setRotationPoint(55.375f, 0.4375f, -12.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 272, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5625f, 0.5f, -0.125f, -0.5625f, 0.5f, -0.125f, -0.5f, 0, -0.125f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(51.125f, -0.6875f, -12.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 195, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5625f, 0.5f, -0.125f, -0.5625f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(56.625f, -0.6875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 298, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.625f, 0, -0.25f, -1.875f, 0, 0, 1, 0, 0, 1.125f, 0, -0.25f, -1.9375f, 0, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(74.9375f, 6.25f, -0.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 261, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.875f, 0, -0.25f, -2, 0, 0, 1.125f, 0, 0, 1, 0, -0.25f, -1.875f, 0, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(74.6875f, 6.25f, 1.375f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 441, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.25f, -0.8125f, 0)
			.setRotationPoint(74.6875f, 6.0625f, -3.5f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 503, 314, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 2, new Vec3f(1.0, 0.0, 0.0))
			.setRotationPoint(69.1875f, -12, 0).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 104, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(73.8125f, 1.75f, -5.75f).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 498, 314, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1.5f, 1, 2, new Vec3f(1.0, 0.0, 0.0))
			.setRotationPoint(70.1875f, -12, 0).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 493, 314, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.5f, 1.5f, 2, null)
			.setRotationPoint(72.1875f, -12, 0).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 506, 133, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.875f).setLength(2).setSegments(8, 4).setScale(1.5f, 1.5f).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(72.1875f, -12, 0).setRotationAngle(90, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 447, 179, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5f).setLength(1).setSegments(12, 4).setScale(0.9375f, 0.9375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.25, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(48.9375f, -2, -10.4375f).setRotationAngle(-120, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 488, 314, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, 0.25f, -0.4375f, -0.125f, 0.25f, -0.4375f, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.015625f, -0.15625f, -0.875f, -0.3125f, -0.1875f, -0.125f, -0.3125f, -0.1875f, -0.125f, -0.3125f, -0.34375f, -0.875f, -0.3125f, -0.34375f)
			.setRotationPoint(48.3125f, -2.1875f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 483, 314, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.25f, -0.4375f, -0.125f, 0.25f, -0.4375f, -0.875f, -0.3125f, -0.34375f, -0.125f, -0.3125f, -0.34375f, -0.125f, -0.3125f, -0.1875f, -0.875f, -0.3125f, -0.1875f)
			.setRotationPoint(48.3125f, -2.1875f, -9.375f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 218, 179, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5f).setLength(1).setSegments(12, 4).setScale(0.9375f, 0.9375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.25, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(48.9375f, -2, 10.4375f).setRotationAngle(-120, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 465, 314, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, 0.25f, -0.4375f, -0.125f, 0.25f, -0.4375f, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.015625f, -0.15625f, -0.875f, -0.3125f, -0.1875f, -0.125f, -0.3125f, -0.1875f, -0.125f, -0.3125f, -0.34375f, -0.875f, -0.3125f, -0.34375f)
			.setRotationPoint(48.3125f, -2.1875f, 8.375f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 454, 314, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.25f, -0.4375f, -0.125f, 0.25f, -0.4375f, -0.875f, -0.3125f, -0.34375f, -0.125f, -0.3125f, -0.34375f, -0.125f, -0.3125f, -0.1875f, -0.875f, -0.3125f, -0.1875f)
			.setRotationPoint(48.3125f, -2.1875f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 429, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 4, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(73.19751f, -7, -2).setRotationAngle(0, 0, 0)
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 446, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(42.1875f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 268, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(36.6875f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 188, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.1875f, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 179, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(37.6875f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 61, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.1875f, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 91, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(38.6875f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 52, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.1875f, -2.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 257, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(44.6875f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 467, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(44.6875f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 84, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(44.6875f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 374, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.6875f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 450, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.6875f, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 292, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.6875f, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 283, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.6875f, -2.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 52, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(22.1875f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 266, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(23.1875f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 504, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(24.1875f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(30.1875f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 257, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(30.1875f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 497, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(30.1875f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 307, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(13.1875f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 130, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.1875f, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 113, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.1875f, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 78, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.1875f, -2.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 11, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(7.6875f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 35, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(8.6875f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(9.6875f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 348, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(15.6875f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(15.6875f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 490, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(15.6875f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 293, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(42.1875f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 242, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(36.6875f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 9, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.1875f, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(37.6875f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 441, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.1875f, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 271, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(38.6875f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 400, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.1875f, -2.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 231, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(44.6875f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 385, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(44.6875f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 245, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(44.6875f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 288, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.6875f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 367, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.6875f, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 240, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.6875f, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 231, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.6875f, -2.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 163, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(22.1875f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 214, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(23.1875f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 231, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(24.1875f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 64, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(30.1875f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 205, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(30.1875f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 219, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(30.1875f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 200, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(13.1875f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 424, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.1875f, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 467, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.1875f, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 449, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.1875f, -2.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 268, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(7.6875f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 130, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(8.6875f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 212, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(9.6875f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 257, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(15.6875f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 113, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(15.6875f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 205, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(15.6875f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 195, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(20.4375f, 2, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 26, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(17.9375f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 8, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(17.9375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 4, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(22.9375f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 0, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(22.9375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 207, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(20.4375f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 202, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(20.4375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 190, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(20.4375f, 2, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 278, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(17.9375f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 178, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(17.9375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 174, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(22.9375f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 170, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(22.9375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 197, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(20.4375f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 192, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(20.4375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 174, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(34.9375f, 2, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 273, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(32.4375f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 269, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(32.4375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 263, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(37.4375f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 259, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(37.4375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 124, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(34.9375f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 119, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(34.9375f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 155, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(34.9375f, 2, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 19, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(32.4375f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 323, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(32.4375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 454, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(37.4375f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 52, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(37.4375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 114, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(34.9375f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 109, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(34.9375f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		FRAME.add(new ModelRendererTurbo(FRAME, 493, 323, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.3125f, 1.3125f, 2, new Vec3f(1.0, 0.0, 0.0))
				.setRotationPoint(72.1975f, -12, 0).setRotationAngle(0, 0, 0)
		);
		groups.add(FRAME);
	}

	ModelAlleghenyBogieFront bogie = new ModelAlleghenyBogieFront();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		/*for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			ModelRenderHelper.renderModelWithRollingStockLightControls(l.toArray(arr), entity, f5);
		}*/
		GL11.glPushMatrix();
		GL11.glTranslatef(0,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
