//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.freight.tanks;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelTamu8000 extends FVTMFormatBase {

	public ModelTamu8000(){
		super();
		textureX = 256;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_Sus3();
		initGroup_Sus2();
		initGroup_Sus1();
		initGroup_BrakeLeft();
		initGroup_group0();
		initGroup_clipboard();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, false, true);
		}
	}

	private final void initGroup_Sus3(){
		TurboList Sus3 = new TurboList("Sus3");
		Sus3.add(new ModelRendererTurbo(Sus3, 100, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5625f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-18, 7.4375f, 6).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 21, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, -1.4375f, -0.5f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, 0, -1.4375f, -0.5f, 0)
			.setRotationPoint(-19.4375f, 2.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 246, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.875f, -0.5f, -1.4375f, -0.5f, -0.5f, -1.4375f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(-14.5625f, 2.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 180, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0.1875f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0.5f, -0.0625f, -0.25f, 0.5f)
			.setRotationPoint(-17, 4.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 194, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, -0.0625f, -0.0625f, -0.625f, -0.0625f)
			.setRotationPoint(-17, 7.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 21, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0.4375f, -0.0625f, -0.875f, 0.4375f, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0.125f)
			.setRotationPoint(-17, 5.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 98, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, -1, 0, -0.0625f, -1, 0, -0.0625f, -1, 0.5f, -0.0625f, -1, 0.5f, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0.4375f, -0.0625f, 0.125f, 0.4375f)
			.setRotationPoint(-17, 5.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 187, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.0625f, -0.125f, -0.0625f, 0.0625f, -0.125f, -0.0625f, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, 0.375f, 0.0625f, -0.25f, 0.375f)
			.setRotationPoint(-17, 4.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 180, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0625f, -0.875f, -0.0625f, 0.0625f, -0.875f, -0.0625f, 0.0625f, -0.875f, 0.3125f, 0.0625f, -0.875f, 0.3125f, 0.0625f, 0, -0.0625f, 0.0625f, 0, -0.0625f, 0.0625f, 0, 0.125f, 0.0625f, 0, 0.125f)
			.setRotationPoint(-17, 5.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 197, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0625f, -1, -0.0625f, 0.0625f, -1, -0.0625f, 0.0625f, -1, 0.375f, 0.0625f, -1, 0.375f, 0.0625f, 0.125f, -0.0625f, 0.0625f, 0.125f, -0.0625f, 0.0625f, 0.125f, 0.3125f, 0.0625f, 0.125f, 0.3125f)
			.setRotationPoint(-17, 5.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 35, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.125f, -0.1875f, -0.5f, -0.125f)
			.setRotationPoint(-17, 4.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 132, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.375f, -0.125f, 0.125f, -0.375f)
			.setRotationPoint(-16.5f, 3.8125f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 245, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-18, 7.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 28, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, -0.8125f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(-23.1875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 21, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-21.1875f, 3.8125f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 186, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-19.1875f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 143, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(-10.8125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 191, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(-12.8125f, 3.8125f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 85, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(-15.8125f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 184, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0.125f, -0.5f, 0, -0.8125f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(-22.1875f, 4.125f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 177, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0.0625f, -0.5f, 0, -0.75f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-20.0625f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 170, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.6875f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, 0.125f, -0.6875f, -0.5f)
			.setRotationPoint(-11.8125f, 4.125f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 163, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.6875f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0.125f, -0.6875f, -0.5f)
			.setRotationPoint(-13.9375f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 153, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.03125f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.03125f, -0.5f, -0.25f, -0.65625f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, -0.25f, -0.65625f, -0.5f)
			.setRotationPoint(-16.0625f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 35, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.6875f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, 0.25f, -0.6875f, -0.5f)
			.setRotationPoint(-12.9375f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 28, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.6875f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0.125f, -0.6875f, -0.5f)
			.setRotationPoint(-15.1875f, 4.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 21, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, -0.03125f, 0, -0.25f, -0.03125f, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, -0.25f, -0.65625f, 0, -0.25f, -0.65625f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(-17.9375f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 147, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, -0.8125f, 0, 0.25f, -0.6875f, 0, 0.25f, -0.6875f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(-21.0625f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 103, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0.0625f, -0.5f, 0, -0.75f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-18.8125f, 4.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 250, 107, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-23.1875f, 3.625f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 245, 107, textureX, textureY).addCylinder(0, 0.875f, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-23.1875f, 3.625f, 6.875f).setRotationAngle(0, 0, 61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 59, 107, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(-23.1875f, 3.625f, 6.5625f).setRotationAngle(0, 0, 61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 54, 107, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(-23.1875f, 3.625f, 6).setRotationAngle(0, 0, 61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 40, 107, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-8.8125f, 3.625f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 35, 107, textureX, textureY).addCylinder(0, 0.875f, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-8.8125f, 3.625f, 6.875f).setRotationAngle(0, 0, -61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 30, 107, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(-8.8125f, 3.625f, 6.5625f).setRotationAngle(0, 0, -61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 25, 107, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(-8.8125f, 3.625f, 6).setRotationAngle(0, 0, -61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 240, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, 0.625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, -0.0625f, -0.0625f, 0)
			.setRotationPoint(-24.75f, 3.1875f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 20, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.375f, -0.75f, -0.375f, -0.3125f, -0.6875f, -0.375f, -0.3125f, -0.6875f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-24.75f, 4.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 158, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, 0, -0.5f, -0.6875f, 0)
			.setRotationPoint(-24.5625f, 4.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 153, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.375f, 0.625f, -0.0625f, -0.375f, 0.625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.0625f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(-8.25f, 3.1875f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 136, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.0625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.6875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, 0, -0.3125f, -0.6875f, 0)
			.setRotationPoint(-8.25f, 4.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 0, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.375f, -0.5f, -0.0625f, -0.375f, -0.5f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.75f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, 0, -0.3125f, -0.75f, 0)
			.setRotationPoint(-8.4375f, 4.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 45, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5625f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(14, 7.4375f, 6).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 248, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, -1.4375f, -0.5f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, 0, -1.4375f, -0.5f, 0)
			.setRotationPoint(12.5625f, 2.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 241, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.875f, -0.5f, -1.4375f, -0.5f, -0.5f, -1.4375f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(17.4375f, 2.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 96, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0.1875f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0.5f, -0.0625f, -0.25f, 0.5f)
			.setRotationPoint(15, 4.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 64, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, -0.0625f, -0.0625f, -0.625f, -0.0625f)
			.setRotationPoint(15, 7.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 57, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0.4375f, -0.0625f, -0.875f, 0.4375f, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0.125f)
			.setRotationPoint(15, 5.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 212, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, -1, 0, -0.0625f, -1, 0, -0.0625f, -1, 0.5f, -0.0625f, -1, 0.5f, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0.4375f, -0.0625f, 0.125f, 0.4375f)
			.setRotationPoint(15, 5.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 205, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.0625f, -0.125f, -0.0625f, 0.0625f, -0.125f, -0.0625f, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, 0.375f, 0.0625f, -0.25f, 0.375f)
			.setRotationPoint(15, 4.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 116, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0625f, -0.875f, -0.0625f, 0.0625f, -0.875f, -0.0625f, 0.0625f, -0.875f, 0.3125f, 0.0625f, -0.875f, 0.3125f, 0.0625f, 0, -0.0625f, 0.0625f, 0, -0.0625f, 0.0625f, 0, 0.125f, 0.0625f, 0, 0.125f)
			.setRotationPoint(15, 5.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 75, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0625f, -1, -0.0625f, 0.0625f, -1, -0.0625f, 0.0625f, -1, 0.375f, 0.0625f, -1, 0.375f, 0.0625f, 0.125f, -0.0625f, 0.0625f, 0.125f, -0.0625f, 0.0625f, 0.125f, 0.3125f, 0.0625f, 0.125f, 0.3125f)
			.setRotationPoint(15, 5.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 235, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.125f, -0.1875f, -0.5f, -0.125f)
			.setRotationPoint(15, 4.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 249, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.375f, -0.125f, 0.125f, -0.375f)
			.setRotationPoint(15.5f, 3.8125f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 24, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(14, 7.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 35, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, -0.8125f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(8.8125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 212, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(10.8125f, 3.8125f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 246, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(12.8125f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 113, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(21.1875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 113, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(19.1875f, 3.8125f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 246, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(16.1875f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 100, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0.125f, -0.5f, 0, -0.8125f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(9.8125f, 4.125f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 85, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0.0625f, -0.5f, 0, -0.75f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(11.9375f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 248, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.6875f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, 0.125f, -0.6875f, -0.5f)
			.setRotationPoint(20.1875f, 4.125f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 49, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.6875f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0.125f, -0.6875f, -0.5f)
			.setRotationPoint(18.0625f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 249, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.03125f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.03125f, -0.5f, -0.25f, -0.65625f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, -0.25f, -0.65625f, -0.5f)
			.setRotationPoint(15.9375f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 87, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.6875f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, 0.25f, -0.6875f, -0.5f)
			.setRotationPoint(19.0625f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 87, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.6875f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0.125f, -0.6875f, -0.5f)
			.setRotationPoint(16.8125f, 4.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 115, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, -0.03125f, 0, -0.25f, -0.03125f, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, -0.25f, -0.65625f, 0, -0.25f, -0.65625f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(14.0625f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 249, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, -0.8125f, 0, 0.25f, -0.6875f, 0, 0.25f, -0.6875f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(10.9375f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 249, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0.0625f, -0.5f, 0, -0.75f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(13.1875f, 4.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 235, 104, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(8.8125f, 3.625f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 230, 104, textureX, textureY).addCylinder(0, 0.875f, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(8.8125f, 3.625f, 6.875f).setRotationAngle(0, 0, 61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 60, 104, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(8.8125f, 3.625f, 6.5625f).setRotationAngle(0, 0, 61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 55, 104, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(8.8125f, 3.625f, 6).setRotationAngle(0, 0, 61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 50, 104, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(23.1875f, 3.625f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 45, 104, textureX, textureY).addCylinder(0, 0.875f, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(23.1875f, 3.625f, 6.875f).setRotationAngle(0, 0, -61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 40, 104, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(23.1875f, 3.625f, 6.5625f).setRotationAngle(0, 0, -61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 35, 104, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(23.1875f, 3.625f, 6).setRotationAngle(0, 0, -61.5f)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 30, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, 0.625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, -0.0625f, -0.0625f, 0)
			.setRotationPoint(7.25f, 3.1875f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 25, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.375f, -0.75f, -0.375f, -0.3125f, -0.6875f, -0.375f, -0.3125f, -0.6875f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(7.25f, 4.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 149, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, 0, -0.5f, -0.6875f, 0)
			.setRotationPoint(7.4375f, 4.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 132, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.375f, 0.625f, -0.0625f, -0.375f, 0.625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.0625f, -0.0625f, 0, -0.3125f, -0.0625f, 0)
			.setRotationPoint(23.75f, 3.1875f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 20, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.0625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.6875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, 0, -0.3125f, -0.6875f, 0)
			.setRotationPoint(23.75f, 4.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Sus3.add(new ModelRendererTurbo(Sus3, 157, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.375f, -0.5f, -0.0625f, -0.375f, -0.5f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.75f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, 0, -0.3125f, -0.75f, 0)
			.setRotationPoint(23.5625f, 4.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		groups.add(Sus3);
	}

	private final void initGroup_Sus2(){
		TurboList Sus2 = new TurboList("Sus2");
		Sus2.add(new ModelRendererTurbo(Sus2, 245, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.5f, -0.5625f, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(14, 7.4375f, -7).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 230, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, -1.4375f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -1.4375f, -0.5f, -0.5f)
			.setRotationPoint(12.5625f, 2.3125f, -7).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 246, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -1.4375f, -0.5f, 0, -1.4375f, -0.5f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(17.4375f, 2.3125f, -7).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 66, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.25f, 0.5f, -0.0625f, -0.25f, 0.5f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0)
			.setRotationPoint(15, 4.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 171, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.625f, -0.0625f, -0.0625f, -0.625f, -0.0625f, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0)
			.setRotationPoint(15, 7.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 164, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, -0.875f, 0.4375f, -0.0625f, -0.875f, 0.4375f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0)
			.setRotationPoint(15, 5.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 54, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, -1, 0.5f, -0.0625f, -1, 0.5f, -0.0625f, -1, 0, -0.0625f, -1, 0, -0.0625f, 0.125f, 0.4375f, -0.0625f, 0.125f, 0.4375f, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0)
			.setRotationPoint(15, 5.6875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 246, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.125f, -0.0625f, 0.0625f, -0.125f, -0.0625f, 0.0625f, -0.25f, 0.375f, 0.0625f, -0.25f, 0.375f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, -0.0625f)
			.setRotationPoint(15, 4.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 47, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0625f, -0.875f, 0.3125f, 0.0625f, -0.875f, 0.3125f, 0.0625f, -0.875f, -0.0625f, 0.0625f, -0.875f, -0.0625f, 0.0625f, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.0625f, 0.0625f, 0, -0.0625f)
			.setRotationPoint(15, 5.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 40, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0625f, -1, 0.375f, 0.0625f, -1, 0.375f, 0.0625f, -1, -0.0625f, 0.0625f, -1, -0.0625f, 0.0625f, 0.125f, 0.3125f, 0.0625f, 0.125f, 0.3125f, 0.0625f, 0.125f, -0.0625f, 0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(15, 5.6875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 33, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.1875f, -0.5f, -0.125f, -0.1875f, -0.5f, -0.125f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(15, 4.4375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 159, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.125f, -0.375f, -0.125f, 0.125f, -0.375f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0)
			.setRotationPoint(15.5f, 3.8125f, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 111, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(14, 7.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 171, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.125f, 0, 0, -0.8125f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, 0, 0, -0.8125f, 0)
			.setRotationPoint(8.8125f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 164, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.0625f, 0, 0, -0.75f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, 0, 0, -0.75f, 0)
			.setRotationPoint(10.8125f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 85, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.0625f, 0, 0, -0.75f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, 0, 0, -0.75f, 0)
			.setRotationPoint(12.8125f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 246, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, 0, 0, 0, -0.6875f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, 0, -0.6875f, 0)
			.setRotationPoint(21.1875f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 54, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0, 0, 0, 0, -0.6875f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.6875f, 0)
			.setRotationPoint(19.1875f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 186, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0, 0, 0, 0, -0.6875f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.6875f, 0)
			.setRotationPoint(16.1875f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 47, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0.125f, 0, 0, -0.8125f, -0.5f, 0.125f, -0.6875f, -0.5f, 0.125f, -0.6875f, 0, 0, -0.8125f, 0)
			.setRotationPoint(9.8125f, 4.125f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 40, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0.0625f, 0, 0, -0.75f, -0.5f, 0.125f, -0.6875f, -0.5f, 0.125f, -0.6875f, 0, 0, -0.75f, 0)
			.setRotationPoint(11.9375f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 33, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.125f, 0, 0, 0.125f, -0.6875f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, 0.125f, -0.6875f, 0)
			.setRotationPoint(20.1875f, 4.125f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 171, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0.125f, 0, 0, 0.125f, -0.6875f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0.125f, -0.6875f, 0)
			.setRotationPoint(18.0625f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 164, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.03125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.03125f, 0, -0.25f, -0.65625f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, 0, -0.25f, -0.65625f, 0)
			.setRotationPoint(15.9375f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 246, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, -0.6875f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, 0.25f, -0.6875f, 0)
			.setRotationPoint(19.0625f, 4.5f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 131, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0.125f, 0, 0, 0.125f, -0.6875f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0.125f, -0.6875f, 0)
			.setRotationPoint(16.8125f, 4.5625f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 194, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.25f, -0.03125f, -0.5f, -0.25f, -0.03125f, 0, 0, 0, 0, 0, -0.6875f, -0.5f, -0.25f, -0.65625f, -0.5f, -0.25f, -0.65625f, 0, 0, -0.6875f, 0)
			.setRotationPoint(14.0625f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 187, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0.125f, 0, 0, -0.8125f, -0.5f, 0.25f, -0.6875f, -0.5f, 0.25f, -0.6875f, 0, 0, -0.8125f, 0)
			.setRotationPoint(10.9375f, 4.5f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 98, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0.0625f, 0, 0, -0.75f, -0.5f, 0.125f, -0.6875f, -0.5f, 0.125f, -0.6875f, 0, 0, -0.75f, 0)
			.setRotationPoint(13.1875f, 4.5625f, -8).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 154, 108, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(8.8125f, 3.625f, -7.625f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 137, 108, textureX, textureY).addCylinder(0, 0.875f, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(8.8125f, 3.625f, -7.625f).setRotationAngle(0, 0, 61.5f)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 94, 108, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f)
			.setRotationPoint(8.8125f, 3.625f, -7.5625f).setRotationAngle(0, 0, 61.5f)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 89, 108, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f)
			.setRotationPoint(8.8125f, 3.625f, -7).setRotationAngle(0, 0, 61.5f)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 84, 108, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(23.1875f, 3.625f, -7.625f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 79, 108, textureX, textureY).addCylinder(0, 0.875f, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(23.1875f, 3.625f, -7.625f).setRotationAngle(0, 0, -61.5f)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 74, 108, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f)
			.setRotationPoint(23.1875f, 3.625f, -7.5625f).setRotationAngle(0, 0, -61.5f)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 69, 108, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f)
			.setRotationPoint(23.1875f, 3.625f, -7).setRotationAngle(0, 0, -61.5f)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 64, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, 0.625f, -0.0625f, -0.375f, -0.0625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f)
			.setRotationPoint(7.25f, 3.1875f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 45, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.375f, -0.75f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(7.25f, 4.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 14, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, -0.5f, -0.0625f, -0.375f, -0.5f, -0.6875f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.375f, -0.5f, -0.6875f, -0.375f)
			.setRotationPoint(7.4375f, 4.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 9, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, 0.625f, -0.0625f, 0, 0.625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f)
			.setRotationPoint(23.75f, 3.1875f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 0, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.6875f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.375f, -0.3125f, -0.6875f, -0.375f)
			.setRotationPoint(23.75f, 4.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus2.add(new ModelRendererTurbo(Sus2, 149, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.75f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.375f, -0.3125f, -0.75f, -0.375f)
			.setRotationPoint(23.5625f, 4.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		groups.add(Sus2);
	}

	private final void initGroup_Sus1(){
		TurboList Sus1 = new TurboList("Sus1");
		Sus1.add(new ModelRendererTurbo(Sus1, 65, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.5f, -0.5625f, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-18, 7.4375f, -7).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 237, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, -1.4375f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -1.4375f, -0.5f, -0.5f)
			.setRotationPoint(-19.4375f, 2.3125f, -7).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 21, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -1.4375f, -0.5f, 0, -1.4375f, -0.5f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-14.5625f, 2.3125f, -7).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 14, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.25f, 0.5f, -0.0625f, -0.25f, 0.5f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0)
			.setRotationPoint(-17, 4.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 7, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.625f, -0.0625f, -0.0625f, -0.625f, -0.0625f, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0)
			.setRotationPoint(-17, 7.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 0, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, -0.875f, 0.4375f, -0.0625f, -0.875f, 0.4375f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0)
			.setRotationPoint(-17, 5.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 153, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, -1, 0.5f, -0.0625f, -1, 0.5f, -0.0625f, -1, 0, -0.0625f, -1, 0, -0.0625f, 0.125f, 0.4375f, -0.0625f, 0.125f, 0.4375f, -0.0625f, 0.125f, 0, -0.0625f, 0.125f, 0)
			.setRotationPoint(-17, 5.6875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 146, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.125f, -0.0625f, 0.0625f, -0.125f, -0.0625f, 0.0625f, -0.25f, 0.375f, 0.0625f, -0.25f, 0.375f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, -0.0625f)
			.setRotationPoint(-17, 4.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 139, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0625f, -0.875f, 0.3125f, 0.0625f, -0.875f, 0.3125f, 0.0625f, -0.875f, -0.0625f, 0.0625f, -0.875f, -0.0625f, 0.0625f, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.0625f, 0.0625f, 0, -0.0625f)
			.setRotationPoint(-17, 5.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 132, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0625f, -1, 0.375f, 0.0625f, -1, 0.375f, 0.0625f, -1, -0.0625f, 0.0625f, -1, -0.0625f, 0.0625f, 0.125f, 0.3125f, 0.0625f, 0.125f, 0.3125f, 0.0625f, 0.125f, -0.0625f, 0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(-17, 5.6875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 244, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.1875f, -0.5f, -0.125f, -0.1875f, -0.5f, -0.125f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-17, 4.4375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 234, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.125f, -0.375f, -0.125f, 0.125f, -0.375f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0)
			.setRotationPoint(-16.5f, 3.8125f, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 205, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-18, 7.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 237, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.125f, 0, 0, -0.8125f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, 0, 0, -0.8125f, 0)
			.setRotationPoint(-23.1875f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 237, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.0625f, 0, 0, -0.75f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, 0, 0, -0.75f, 0)
			.setRotationPoint(-21.1875f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 85, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.0625f, 0, 0, -0.75f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, 0, 0, -0.75f, 0)
			.setRotationPoint(-19.1875f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 120, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, 0, 0, 0, -0.6875f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-10.8125f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 113, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0, 0, 0, 0, -0.6875f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-12.8125f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 48, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0, 0, 0, 0, -0.6875f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-15.8125f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 106, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0.125f, 0, 0, -0.8125f, -0.5f, 0.125f, -0.6875f, -0.5f, 0.125f, -0.6875f, 0, 0, -0.8125f, 0)
			.setRotationPoint(-22.1875f, 4.125f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 99, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0.0625f, 0, 0, -0.75f, -0.5f, 0.125f, -0.6875f, -0.5f, 0.125f, -0.6875f, 0, 0, -0.75f, 0)
			.setRotationPoint(-20.0625f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 86, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.125f, 0, 0, 0.125f, -0.6875f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, 0.125f, -0.6875f, 0)
			.setRotationPoint(-11.8125f, 4.125f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 79, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0.125f, 0, 0, 0.125f, -0.6875f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0.125f, -0.6875f, 0)
			.setRotationPoint(-13.9375f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 72, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.03125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.03125f, 0, -0.25f, -0.65625f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, 0, -0.25f, -0.65625f, 0)
			.setRotationPoint(-16.0625f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 171, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, -0.6875f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, 0.25f, -0.6875f, 0)
			.setRotationPoint(-12.9375f, 4.5f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 164, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0.125f, 0, 0, 0.125f, -0.6875f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0.125f, -0.6875f, 0)
			.setRotationPoint(-15.1875f, 4.5625f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 87, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.25f, -0.03125f, -0.5f, -0.25f, -0.03125f, 0, 0, 0, 0, 0, -0.6875f, -0.5f, -0.25f, -0.65625f, -0.5f, -0.25f, -0.65625f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-17.9375f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 80, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0.125f, 0, 0, -0.8125f, -0.5f, 0.25f, -0.6875f, -0.5f, 0.25f, -0.6875f, 0, 0, -0.8125f, 0)
			.setRotationPoint(-21.0625f, 4.5f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 73, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0.0625f, 0, 0, -0.75f, -0.5f, 0.125f, -0.6875f, -0.5f, 0.125f, -0.6875f, 0, 0, -0.75f, 0)
			.setRotationPoint(-18.8125f, 4.5625f, -8).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 229, 108, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-23.1875f, 3.625f, -7.625f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 224, 108, textureX, textureY).addCylinder(0, 0.875f, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-23.1875f, 3.625f, -7.625f).setRotationAngle(0, 0, 61.5f)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 219, 108, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f)
			.setRotationPoint(-23.1875f, 3.625f, -7.5625f).setRotationAngle(0, 0, 61.5f)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 214, 108, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f)
			.setRotationPoint(-23.1875f, 3.625f, -7).setRotationAngle(0, 0, 61.5f)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 209, 108, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-8.8125f, 3.625f, -7.625f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 204, 108, textureX, textureY).addCylinder(0, 0.875f, 0, 1, 1, 8, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-8.8125f, 3.625f, -7.625f).setRotationAngle(0, 0, -61.5f)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 199, 108, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f)
			.setRotationPoint(-8.8125f, 3.625f, -7.5625f).setRotationAngle(0, 0, -61.5f)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 194, 108, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.9375f, -0.3125f, -0.0625f, -0.9375f)
			.setRotationPoint(-8.8125f, 3.625f, -7).setRotationAngle(0, 0, -61.5f)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 189, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, 0.625f, -0.0625f, -0.375f, -0.0625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f)
			.setRotationPoint(-24.75f, 3.1875f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 184, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.375f, -0.75f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(-24.75f, 4.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 179, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, -0.375f, -0.5f, -0.0625f, -0.375f, -0.5f, -0.6875f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.375f, -0.5f, -0.6875f, -0.375f)
			.setRotationPoint(-24.5625f, 4.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 174, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, 0.625f, -0.0625f, 0, 0.625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f)
			.setRotationPoint(-8.25f, 3.1875f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 169, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.6875f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.375f, -0.3125f, -0.6875f, -0.375f)
			.setRotationPoint(-8.25f, 4.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		Sus1.add(new ModelRendererTurbo(Sus1, 164, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, -0.375f, -0.3125f, -0.0625f, -0.375f, -0.3125f, -0.75f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.375f, -0.3125f, -0.75f, -0.375f)
			.setRotationPoint(-8.4375f, 4.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		groups.add(Sus1);
	}

	private final void initGroup_BrakeLeft(){
		TurboList BrakeLeft = new TurboList("BrakeLeft");
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 144, 102, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.4375))
			.setRotationPoint(-5.1875f, 6.625f, 6.375f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 15, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1.3125f, 0, -0.25f, 0.8125f, 0, -0.25f, 0.8125f, 0, -0.25f, -1.3125f, 0, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f)
			.setRotationPoint(-5.4375f, 3.1875f, 9.625f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 10, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.8125f, 0, -0.25f, -1.3125f, 0, -0.25f, -1.3125f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f)
			.setRotationPoint(-5.9375f, 3.1875f, 9.625f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 5, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f)
			.setRotationPoint(-23.625f, 3.3125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f)
			.setRotationPoint(-23.625f, 3.6875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 249, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f)
			.setRotationPoint(-23.625f, 4.0625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 230, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f)
			.setRotationPoint(-23.625f, 4.4375f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 58, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f)
			.setRotationPoint(-23.625f, 4.8125f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 53, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f)
			.setRotationPoint(-23.625f, 5.1875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 48, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f)
			.setRotationPoint(-23.625f, 5.9375f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 43, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f)
			.setRotationPoint(-23.625f, 5.5625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 38, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.375f)
			.setRotationPoint(-23.625f, 3.0625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 33, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.375f)
			.setRotationPoint(-23.625f, 7.3125f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 28, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.375f, -0.4375f, -0.25f, -0.375f, -0.4375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f)
			.setRotationPoint(-23.625f, 7.3125f, 10.625f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 66, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.4375f, -0.3125f, -0.25f, -0.4375f, -0.3125f, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.8125f, -0.5625f)
			.setRotationPoint(-23.625f, 7.0625f, 11.125f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 57, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.5f, -0.1875f, -0.25f, -0.5f, -0.1875f, -0.25f, -0.6875f, -0.625f, -0.25f, -0.6875f, -0.625f)
			.setRotationPoint(-23.625f, 7.3125f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 71, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.375f, -0.4375f, -0.25f, -0.375f, -0.4375f)
			.setRotationPoint(-23.625f, 3.0625f, 10.625f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 110, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.4375f, -0.3125f, -0.25f, -0.4375f, -0.3125f, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.1875f, -0.6875f)
			.setRotationPoint(-23.625f, 3.3125f, 11.125f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 216, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.1875f, -0.25f, -0.5f, -0.1875f, -0.25f, -0.6875f, -0.625f, -0.25f, -0.6875f, -0.625f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.1875f, -0.6875f)
			.setRotationPoint(-23.625f, 3.0625f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 139, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.0625f, -0.3125f, -0.25f, 0.0625f, -0.3125f, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.3125f, -0.25f, 0.0625f, -0.3125f, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.5625f)
			.setRotationPoint(-23.625f, 4.1875f, 11.125f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 118, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f)
			.setRotationPoint(-23.625f, 6.3125f, 10.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 152, 25, textureX, textureY)
			.addShapeBox(-18.5f, -0.5f, 0, 19, 1, 1, 0, -0.5f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f)
			.setRotationPoint(-5.1875f, 6.625f, 10.125f).setRotationAngle(0, 0, 8.5625f)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 84, 37, textureX, textureY)
			.addShapeBox(-22, -0.5f, 0, 4, 1, 1, 0, -0.296875f, -0.453125f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.296875f, -0.453125f, -0.375f, -0.375f, -0.046875f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.375f, -0.046875f, -0.375f)
			.setRotationPoint(-5.1875f, 6.625f, 10.125f).setRotationAngle(0, 0, 8.5625f)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 244, 99, textureX, textureY).addCylinder(0, 0, -1, 1, 5, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.0625))
			.setRotationPoint(-5.1875f, 6.625f, 7).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 251, 93, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -4.375f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.1875f, 6.625f, 10.5f).setRotationAngle(0, 0, -90)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 159, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1.3125f, 0, -0.25f, 0.8125f, 0, -0.25f, 0.8125f, 0, -0.25f, -1.3125f, 0, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f)
			.setRotationPoint(-5.4375f, 3.1875f, 6.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 28, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.8125f, 0, -0.25f, -1.3125f, 0, -0.25f, -1.3125f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f)
			.setRotationPoint(-5.9375f, 3.1875f, 6.25f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 93, 86, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, 0, -4.375f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.1875f, 6.625f, 10.5f).setRotationAngle(0, 0, 90)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 216, 49, textureX, textureY)
			.addShapeBox(-0.5f, -1, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-5.1875f, 6.625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 138, 72, textureX, textureY).addCylinder(0, -1, -1, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-5.1875f, 6.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 241, 67, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -4.625f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.375f, 0.375f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.1875f, 5.625f, 10.5f).setRotationAngle(0, 0, 176)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 76, 50, textureX, textureY)
			.addShapeBox(-0.5f, -6, 0, 1, 6, 1, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f)
			.setRotationPoint(-5.1875f, 5.625f, 5.5f).setRotationAngle(0, 0, -94)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 24, 47, textureX, textureY)
			.addShapeBox(-0.5f, -1, 0, 1, 1, 1, 0, 0.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0.0625f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f)
			.setRotationPoint(-11.4375f, 6, 5.5f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 24, 44, textureX, textureY)
			.addShapeBox(-0.6875f, -2, 0, 1, 1, 1, 0, 0.125f, -0.4375f, -0.3125f, -0.375f, -0.4375f, -0.3125f, -0.375f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f)
			.setRotationPoint(-11.4375f, 6, 5.5f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 165, 43, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, 0.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0.0625f, 0, -0.3125f)
			.setRotationPoint(-11.4375f, 6, 5.5f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 250, 41, textureX, textureY)
			.addShapeBox(-0.6875f, 1, 0, 1, 1, 1, 0, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, 0.125f, -0.4375f, -0.3125f, -0.375f, -0.4375f, -0.3125f, -0.375f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f)
			.setRotationPoint(-11.4375f, 6, 5.5f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 69, 41, textureX, textureY)
			.addShapeBox(-0.3125f, 0.8125f, 0, 1, 1, 1, 0, -0.25f, -0.125f, -0.34375f, -0.375f, -0.1875f, -0.34375f, -0.375f, -0.1875f, -0.34375f, -0.25f, -0.125f, -0.34375f, -0.25f, -0.25f, -0.34375f, -0.375f, -0.3125f, -0.34375f, -0.375f, -0.3125f, -0.34375f, -0.25f, -0.25f, -0.34375f)
			.setRotationPoint(-11.4375f, 6, 5.5f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 60, 38, textureX, textureY).newCylinderBuilder()
			.setPosition(-0.3125f, -1.25f, -1.15625f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-11.4375f, 6, 7).setRotationAngle(0, 0, 180)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 191, 31, textureX, textureY)
			.addShapeBox(-0.3125f, -1.6875f, 0, 1, 1, 1, 0, -0.25f, -0.125f, -0.34375f, -0.375f, -0.1875f, -0.34375f, -0.375f, -0.1875f, -0.34375f, -0.25f, -0.125f, -0.34375f, -0.25f, -0.25f, -0.34375f, -0.375f, -0.3125f, -0.34375f, -0.375f, -0.3125f, -0.34375f, -0.25f, -0.25f, -0.34375f)
			.setRotationPoint(-11.4375f, 6, 5.5f).setRotationAngle(0, 0, 0)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 152, 31, textureX, textureY).newCylinderBuilder()
			.setPosition(-0.3125f, 1.25f, -1.15625f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-11.4375f, 6, 7).setRotationAngle(0, 0, 180)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 60, 26, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.15625f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.71875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.4375f, 3.5f, -7.4375f).setRotationAngle(0, 0, 104)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 40, 21, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0.28125f, -0.4375f, -0.25f, 0.28125f, -0.4375f, -0.25f, 0.28125f, -0.4375f, -0.25f, 0.28125f, -0.4375f)
			.setRotationPoint(-11.4375f, 3.5f, 5.71875f).setRotationAngle(0, 0, -14)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 100, 18, textureX, textureY).newCylinderBuilder()
			.setPosition(-1.28125f, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-11.4375f, 3.5f, 6.15625f).setRotationAngle(0, 0, -104)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 89, 18, textureX, textureY)
			.addShapeBox(-0.5f, -0.375f, 0, 1, 2, 1, 0, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f)
			.setRotationPoint(-9.4375f, 3.5f, 5.5f).setRotationAngle(0, 0, -14)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 40, 18, textureX, textureY)
			.addShapeBox(-0.5f, 1.625f, 0, 1, 1, 1, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f)
			.setRotationPoint(-9.4375f, 3.5f, 5.5f).setRotationAngle(0, 0, -14)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 250, 3, textureX, textureY)
			.addShapeBox(-0.5f, 1.75f, 0.3125f, 1, 1, 1, 0, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f)
			.setRotationPoint(-9.4375f, 3.5f, 5.5f).setRotationAngle(0, 0, -14)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 0, 3, textureX, textureY)
			.addShapeBox(-0.5f, 2.9375f, 0, 1, 1, 1, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f)
			.setRotationPoint(-9.4375f, 3.5f, 5.5f).setRotationAngle(0, 0, -14)
		);
		BrakeLeft.add(new ModelRendererTurbo(BrakeLeft, 0, 0, textureX, textureY)
			.addShapeBox(-0.5f, 1.75f, -0.3125f, 1, 1, 1, 0, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f)
			.setRotationPoint(-9.4375f, 3.5f, 5.5f).setRotationAngle(0, 0, -14)
		);
		groups.add(BrakeLeft);
	}

	private final void initGroup_group0(){
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.0625f, 2, 6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 2, -6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.0625f, 2, -6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 1, 2, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f)
			.setRotationPoint(-29, 2.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f)
			.setRotationPoint(-28, 3.3125f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-28.5f, 6.75f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-28.5f, 7.125f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f)
			.setRotationPoint(27, 3.3125f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(26.5f, 6.75f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(26.5f, 7.125f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, 0.03125f, 0, 0, 0.03125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.03125f, -0.5f, 0, 0.03125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-26.75f, 1.8125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0.25f, 0.25f, -0.3125f, 0.25f, 0.25f, -0.3125f, 0.25f, -0.875f, -0.3125f, 0.25f, -0.875f)
			.setRotationPoint(1.125f, 2.6875f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0.25f, 0.25f, -0.3125f, 0.25f, 0.25f, -0.3125f, 0.25f, -0.875f, -0.3125f, 0.25f, -0.875f)
			.setRotationPoint(-2.125f, 2.6875f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.625f, -0.1875f, 0, -0.625f, -0.5625f, -0.625f, 0, -0.5625f, -0.625f, 0, -0.5625f, -0.625f, -0.625f, -0.5625f, -0.625f, -0.625f)
			.setRotationPoint(-2, 4.9375f, -10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.25f, -0.875f, -0.3125f, 0.25f, -0.875f, -0.3125f, 0.25f, 0.25f, -0.3125f, 0.25f, 0.25f)
			.setRotationPoint(1.125f, 2.6875f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.25f, -0.875f, -0.3125f, 0.25f, -0.875f, -0.3125f, 0.25f, 0.25f, -0.3125f, 0.25f, 0.25f)
			.setRotationPoint(-2.125f, 2.6875f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.1875f, 0, -0.625f, -0.1875f, 0, -0.625f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.5625f, -0.625f, -0.625f, -0.5625f, -0.625f, -0.625f, -0.5625f, -0.625f, 0, -0.5625f, -0.625f, 0)
			.setRotationPoint(-2, 4.9375f, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-23.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-17.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-11.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(22.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(16.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(10.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-5.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(4.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-0.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 121, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 1, null)
			.setRotationPoint(-16, 6, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 121, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 1, null)
			.setRotationPoint(16, 6, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(-29.5f, 2.3125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f)
			.setRotationPoint(29, 2.15625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f)
			.setRotationPoint(-33, 2.15625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-29.5f, 3.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f)
			.setRotationPoint(-29.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-29.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(28.5f, 3.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f)
			.setRotationPoint(28.5f, 2.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(28.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 2, 6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(-29.5f, 2.3125f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(-29.5f, 2.3125f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 3.3125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 3.6875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 4.0625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 4.4375f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 4.8125f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 5.1875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 5.9375f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 5.5625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f)
			.setRotationPoint(22.625f, 3.0625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f)
			.setRotationPoint(22.625f, 7.3125f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.375f, -0.4375f, -0.25f, -0.375f, -0.4375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f)
			.setRotationPoint(22.625f, 7.3125f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.4375f, -0.3125f, -0.25f, -0.4375f, -0.3125f)
			.setRotationPoint(22.625f, 7.0625f, -12.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.6875f, -0.625f, -0.25f, -0.6875f, -0.625f, -0.25f, -0.5f, -0.1875f, -0.25f, -0.5f, -0.1875f)
			.setRotationPoint(22.625f, 7.3125f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.375f, -0.4375f, -0.25f, -0.375f, -0.4375f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f)
			.setRotationPoint(22.625f, 3.0625f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.4375f, -0.3125f, -0.25f, -0.4375f, -0.3125f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, -0.25f)
			.setRotationPoint(22.625f, 3.3125f, -12.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.6875f, -0.625f, -0.25f, -0.6875f, -0.625f, -0.25f, -0.5f, -0.1875f, -0.25f, -0.5f, -0.1875f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.1875f, -0.6875f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f)
			.setRotationPoint(22.625f, 3.0625f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.3125f, -0.25f, 0.0625f, -0.3125f, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.3125f, -0.25f, 0.0625f, -0.3125f)
			.setRotationPoint(22.625f, 4.1875f, -12.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.5f, -0.25f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.5f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f)
			.setRotationPoint(22.625f, 6.3125f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 120, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.4375))
			.setRotationPoint(5.1875f, 6.625f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.8125f, 0, -0.25f, -1.3125f, 0, -0.25f, -1.3125f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f)
			.setRotationPoint(4.4375f, 3.1875f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1.3125f, 0, -0.25f, 0.8125f, 0, -0.25f, 0.8125f, 0, -0.25f, -1.3125f, 0, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f)
			.setRotationPoint(4.9375f, 3.1875f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 120, textureX, textureY).addCylinder(0, 0, -1, 1, 5, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.0625))
			.setRotationPoint(5.1875f, 6.625f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 119, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -4.375f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(5.1875f, 6.625f, -2).setRotationAngle(0, 0, -90)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.8125f, 0, -0.25f, -1.3125f, 0, -0.25f, -1.3125f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f)
			.setRotationPoint(4.4375f, 3.1875f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1.3125f, 0, -0.25f, 0.8125f, 0, -0.25f, 0.8125f, 0, -0.25f, -1.3125f, 0, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f, -0.25f, -0.5625f, -0.25f)
			.setRotationPoint(4.9375f, 3.1875f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 119, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, 0, -4.375f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(5.1875f, 6.625f, -2).setRotationAngle(0, 0, 90)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 119, textureX, textureY)
			.addShapeBox(-0.5f, -1, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(5.1875f, 6.625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 119, textureX, textureY).addCylinder(0, -1, -1, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(5.1875f, 6.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 119, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -4.625f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.375f, 0.375f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(5.1875f, 5.625f, -1.5f).setRotationAngle(0, 0, 4)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 119, textureX, textureY)
			.addShapeBox(-0.5f, -6, 0, 1, 6, 1, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f)
			.setRotationPoint(5.1875f, 5.625f, -6.5f).setRotationAngle(0, 0, 94)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 119, textureX, textureY)
			.addShapeBox(-0.5f, -1, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f)
			.setRotationPoint(11.4375f, 6, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 119, textureX, textureY)
			.addShapeBox(-0.3125f, -2, 0, 1, 1, 1, 0, -0.375f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, -0.375f, -0.4375f, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f)
			.setRotationPoint(11.4375f, 6, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 118, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(11.4375f, 6, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 118, textureX, textureY)
			.addShapeBox(-0.3125f, 1, 0, 1, 1, 1, 0, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.125f, 0, -0.3125f, -0.375f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, 0.125f, -0.4375f, -0.3125f, -0.375f, -0.4375f, -0.3125f)
			.setRotationPoint(11.4375f, 6, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 118, textureX, textureY)
			.addShapeBox(-0.6875f, 0.8125f, 0, 1, 1, 1, 0, -0.375f, -0.1875f, -0.34375f, -0.25f, -0.125f, -0.34375f, -0.25f, -0.125f, -0.34375f, -0.375f, -0.1875f, -0.34375f, -0.375f, -0.3125f, -0.34375f, -0.25f, -0.25f, -0.34375f, -0.25f, -0.25f, -0.34375f, -0.375f, -0.3125f, -0.34375f)
			.setRotationPoint(11.4375f, 6, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 118, textureX, textureY).newCylinderBuilder()
			.setPosition(-0.3125f, -1.25f, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.4375f, 6, -6.15625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 118, textureX, textureY).newCylinderBuilder()
			.setPosition(-0.3125f, 1.25f, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.4375f, 6, -6.15625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 118, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.71875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-11.4375f, 3.5f, 6).setRotationAngle(0, 0, 76)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 118, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0.28125f, -0.4375f, -0.25f, 0.28125f, -0.4375f, -0.25f, 0.28125f, -0.4375f, -0.25f, 0.28125f, -0.4375f)
			.setRotationPoint(11.4375f, 3.5f, -6.71875f).setRotationAngle(0, 0, 14)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 118, textureX, textureY).newCylinderBuilder()
			.setPosition(-1.28125f, 0, 1.5625f).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.4375f, 3.5f, -7.84375f).setRotationAngle(0, 0, -76)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 118, textureX, textureY)
			.addShapeBox(-0.5f, -0.375f, 0, 1, 2, 1, 0, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f)
			.setRotationPoint(9.4375f, 3.5f, -6.5f).setRotationAngle(0, 0, 14)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 118, textureX, textureY)
			.addShapeBox(-0.5f, 1.625f, 0, 1, 1, 1, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f)
			.setRotationPoint(9.4375f, 3.5f, -6.5f).setRotationAngle(0, 0, 14)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 118, textureX, textureY)
			.addShapeBox(-0.5f, 1.75f, 0.3125f, 1, 1, 1, 0, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f)
			.setRotationPoint(9.4375f, 3.5f, -6.5f).setRotationAngle(0, 0, 14)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 118, textureX, textureY)
			.addShapeBox(-0.5f, 2.9375f, 0, 1, 1, 1, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f, -0.25f, -0.875f, -0.125f)
			.setRotationPoint(9.4375f, 3.5f, -6.5f).setRotationAngle(0, 0, 14)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 118, textureX, textureY)
			.addShapeBox(-0.5f, 1.75f, -0.3125f, 1, 1, 1, 0, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f, -0.4375f)
			.setRotationPoint(9.4375f, 3.5f, -6.5f).setRotationAngle(0, 0, 14)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 118, textureX, textureY)
			.addShapeBox(-0.6875f, -1.6875f, 0, 1, 1, 1, 0, -0.375f, -0.1875f, -0.34375f, -0.25f, -0.125f, -0.34375f, -0.25f, -0.125f, -0.34375f, -0.375f, -0.1875f, -0.34375f, -0.375f, -0.3125f, -0.34375f, -0.25f, -0.25f, -0.34375f, -0.25f, -0.25f, -0.34375f, -0.375f, -0.3125f, -0.34375f)
			.setRotationPoint(11.4375f, 6, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 28, textureX, textureY)
			.addShapeBox(-18.5f, -0.5f, 0, 19, 1, 1, 0, -0.5f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f)
			.setRotationPoint(5.1875f, 6.625f, -11.125f).setRotationAngle(0, 0, 171.4375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 56, textureX, textureY)
			.addShapeBox(-22, -0.5f, 0, 4, 1, 1, 0, -0.375f, -0.046875f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.375f, -0.046875f, -0.375f, -0.296875f, -0.453125f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.296875f, -0.453125f, -0.375f)
			.setRotationPoint(5.1875f, 6.625f, -11.125f).setRotationAngle(0, 0, 171.4375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 94, textureX, textureY).addCylinder(0, 0, 0, 8, 49, 20, 1, 1, 2, null)
			.setRotationPoint(-24.46875f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 90, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.9375f, 1, 3, null)
			.setRotationPoint(-25.46875f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 90, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.875f, 0.9375f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-25.96875f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 90, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.6875f, 0.875f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-26.46875f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 83, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.0625f, 0.6875f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-26.71875f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 77, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 1, 0.9375f, 3, null)
			.setRotationPoint(24.53125f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 76, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.9375f, 0.875f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(25.53125f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 72, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.875f, 0.6875f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(26.03125f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 72, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.6875f, 0.0625f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(26.53125f, -6.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 60, textureX, textureY).addCylinder(0, 0, 0, 5, 6, 16, 1, 1, 4, null)
			.setRotationPoint(0, -18.5625f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 49, textureX, textureY).addCylinder(0, 0, 0, 5, 1, 16, 0.9375f, 1, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(0, -18.8125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 49, textureX, textureY).addCylinder(0, 0, 0, 5, 1, 16, 0.5625f, 0.9375f, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(0, -19.3125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 49, textureX, textureY).addCylinder(0, 0, 0, 5, 1, 16, 0.59375f, 0.59375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(0, -19.5625f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 45, textureX, textureY).addCylinder(0, 0, 0, 5, 1, 16, 0.59375f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(0, -19.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY).addCylinder(0, 0, 0, 5, 1, 16, 0.5625f, 0.59375f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(0, -19.625f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 26, textureX, textureY).addCylinder(0, 0, 0, 5, 1, 16, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, -19.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 25, textureX, textureY).addCylinder(0, 0, 0, 5, 1, 16, 0.4375f, 0.5625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, -19.875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 25, textureX, textureY).addCylinder(0, 0, 0, 5, 1, 16, 0.125f, 0.4375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, -20, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 118, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(0, -20.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 117, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, null)
			.setRotationPoint(0, -21.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 117, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(0, -21.3125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 59, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5f).setLength(1).setSegments(8, 0).setScale(0.75f, 0.75f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.625, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0, -21.3125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 98, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, -1, 1, 1, 2, 0, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f)
			.setRotationPoint(0, -21.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 98, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, -1, 1, 1, 2, 0, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f)
			.setRotationPoint(0, -21.375f, 0).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 98, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, -1, 1, 1, 2, 0, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f)
			.setRotationPoint(0, -21.375f, 0).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 97, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, -1, 1, 1, 2, 0, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f)
			.setRotationPoint(0, -21.375f, 0).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 17, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0)
			.setRotationPoint(-5.5f, -13.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, -0.5f)
			.setRotationPoint(-5.75f, -13.0625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -1.875f, 0, -0.125f, -1.875f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, 1.0625f, 0, -0.125f, 1.0625f, 0)
			.setRotationPoint(-5.75f, -13.0625f, -7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.6875f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(-5.75f, -11.5625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, -0.5f)
			.setRotationPoint(4.75f, -13.0625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -1.875f, 0, -0.125f, -1.875f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, 1.0625f, 0, -0.125f, 1.0625f, 0)
			.setRotationPoint(4.75f, -13.0625f, -7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.6875f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(4.75f, -11.5625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, -0.5f)
			.setRotationPoint(-0.5f, -13.0625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -1.875f, 0, -0.125f, -1.875f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, 1.0625f, 0, -0.125f, 1.0625f, 0)
			.setRotationPoint(-0.5f, -13.0625f, -7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.6875f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(-0.5f, -11.5625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-5.75f, -13.0625f, 7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -1.875f, 0, -0.125f, -1.875f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, 1.0625f, 0, -0.125f, 1.0625f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-5.75f, -13.0625f, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-5.75f, -11.5625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(4.75f, -13.0625f, 7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -1.875f, 0, -0.125f, -1.875f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, 1.0625f, 0, -0.125f, 1.0625f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(4.75f, -13.0625f, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(4.75f, -11.5625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, -0.5f, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-0.5f, -13.0625f, 7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -1.875f, 0, -0.125f, -1.875f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, 1.0625f, 0, -0.125f, 1.0625f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-0.5f, -13.0625f, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.6875f, -0.8125f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-0.5f, -11.5625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 72, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(8, 0).setLength(1).setSegments(20, 10).setScale(1.015625f, 1.015625f).setDirection(2)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-22.46875f, -6.6875f, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 65, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(8, 0).setLength(1).setSegments(20, 10).setScale(1.015625f, 1.015625f).setDirection(2)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(21.46875f, -6.6875f, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 17, 0, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(21.46875f, -7.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 22, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0)
			.setRotationPoint(-29, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0)
			.setRotationPoint(-22.46875f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 22, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0)
			.setRotationPoint(27, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0)
			.setRotationPoint(21.46875f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0)
			.setRotationPoint(-11.46875f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0)
			.setRotationPoint(10.46875f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0.03125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.03125f, 0, 0, 0.03125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.03125f, -0.5f, 0)
			.setRotationPoint(22.75f, 1.8125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 6, 0, 0.03125f, 0, 0, -0.53125f, 0, 0, -0.53125f, 0, 0, 0.03125f, 0, 0, 0.03125f, -0.5f, 0, -0.53125f, -0.5f, 0, -0.53125f, -0.5f, 0, 0.03125f, -0.5f, 0)
			.setRotationPoint(-21.1875f, 1.8125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 6, 0, -0.53125f, 0, 0, 0.03125f, 0, 0, 0.03125f, 0, 0, -0.53125f, 0, 0, -0.53125f, -0.5f, 0, 0.03125f, -0.5f, 0, 0.03125f, -0.5f, 0, -0.53125f, -0.5f, 0)
			.setRotationPoint(11.1875f, 1.8125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 6, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-10.21875f, 1.8125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0.03125f, 0, 0, 0.03125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.03125f, -0.5f, 0, 0.03125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-26.75f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.03125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.03125f, 0, 0, 0.03125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.03125f, -0.5f, 0)
			.setRotationPoint(22.75f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, 0.03125f, 0, 0, -0.53125f, 0, 0, -0.53125f, 0, 0, 0.03125f, 0, 0, 0.03125f, -0.5f, 0, -0.53125f, -0.5f, 0, -0.53125f, -0.5f, 0, 0.03125f, -0.5f, 0)
			.setRotationPoint(-21.1875f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.53125f, 0, 0, 0.03125f, 0, 0, 0.03125f, 0, 0, -0.53125f, 0, 0, -0.53125f, -0.5f, 0, 0.03125f, -0.5f, 0, 0.03125f, -0.5f, 0, -0.53125f, -0.5f, 0)
			.setRotationPoint(11.1875f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-10.21875f, 1.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0.03125f, 0, 0, 0.03125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.03125f, -0.5f, 0, 0.03125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-26.75f, 1.8125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.03125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.03125f, 0, 0, 0.03125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.03125f, -0.5f, 0)
			.setRotationPoint(22.75f, 1.8125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, 0.03125f, 0, 0, -0.53125f, 0, 0, -0.53125f, 0, 0, 0.03125f, 0, 0, 0.03125f, -0.5f, 0, -0.53125f, -0.5f, 0, -0.53125f, -0.5f, 0, 0.03125f, -0.5f, 0)
			.setRotationPoint(-21.1875f, 1.8125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.53125f, 0, 0, 0.03125f, 0, 0, 0.03125f, 0, 0, -0.53125f, 0, 0, -0.53125f, -0.5f, 0, 0.03125f, -0.5f, 0, 0.03125f, -0.5f, 0, -0.53125f, -0.5f, 0)
			.setRotationPoint(11.1875f, 1.8125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-10.21875f, 1.8125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 1, 2, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-29, 2.3125f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 1, 6, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-29, 2.3125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-23.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-17.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-11.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(22.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(16.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(10.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-5.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(4.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0)
			.setRotationPoint(-0.5f, 2.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(28.5f, 2.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(28.5f, 2.3125f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-29.5f, 2.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-29.5f, 2.3125f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f, -0.3125f, 0, -1, -0.3125f, 0, -1)
			.setRotationPoint(1.125f, -10.1875f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f, -0.3125f, 0, -1, -0.3125f, 0, -1)
			.setRotationPoint(-2.125f, -10.1875f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0.25f, -0.3125f, 0, 0.25f, -0.3125f, 0, -0.875f, -0.3125f, 0, -0.875f)
			.setRotationPoint(1.125f, -13.1875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0.25f, -0.3125f, 0, 0.25f, -0.3125f, 0, -0.875f, -0.3125f, 0, -0.875f)
			.setRotationPoint(-2.125f, -13.1875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, -0.9375f, -0.3125f, 0, -0.9375f)
			.setRotationPoint(1.125f, -15.1875f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, -0.9375f, -0.3125f, 0, -0.9375f)
			.setRotationPoint(-2.125f, -15.1875f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.65625f)
			.setRotationPoint(-2, -1.1875f, -9.40625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.65625f)
			.setRotationPoint(-2, -4.1875f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.65625f)
			.setRotationPoint(-2, -7.1875f, -9.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.65625f)
			.setRotationPoint(-2, -10.1875f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -1, -0.3125f, 0, -1, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f)
			.setRotationPoint(1.125f, -10.1875f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -1, -0.3125f, 0, -1, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f)
			.setRotationPoint(-2.125f, -10.1875f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0.25f, -0.3125f, 0, 0.25f)
			.setRotationPoint(1.125f, -13.1875f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0.25f, -0.3125f, 0, 0.25f)
			.setRotationPoint(-2.125f, -13.1875f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.9375f, -0.3125f, 0, -0.9375f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f)
			.setRotationPoint(1.125f, -15.1875f, 7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.9375f, -0.3125f, 0, -0.9375f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f)
			.setRotationPoint(-2.125f, -15.1875f, 7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.03125f)
			.setRotationPoint(-2, -1.1875f, 8.40625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.03125f)
			.setRotationPoint(-2, -4.1875f, 8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.03125f)
			.setRotationPoint(-2, -7.1875f, 8.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.65625f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.03125f, -0.03125f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.65625f, -0.21875f, -0.65625f, -0.03125f, -0.21875f, -0.65625f, -0.03125f)
			.setRotationPoint(-2, -10.1875f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 113, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 3, null)
			.setRotationPoint(4.75f, -16.8125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 112, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1.0625f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(5.75f, -16.8125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 112, textureX, textureY)
			.addShapeBox(-0.5f, -1, -1, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(5.8125f, -16.8125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 112, textureX, textureY)
			.addShapeBox(-0.5f, -1, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(5.8125f, -16.8125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 112, textureX, textureY)
			.addShapeBox(-0.5f, 0, -1, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(5.8125f, -16.8125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 112, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(5.8125f, -16.8125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(28.5f, -2.8125f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(28.5f, -3.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(28.5f, -3.4375f, -10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.0625f, -0.5f, -0.375f, -0.0625f, -0.5f)
			.setRotationPoint(28.5f, -3.4375f, -9.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -4.6875f, -0.625f, -0.375f, -4.6875f, -0.625f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 3.9375f, -0.75f, -0.375f, 3.9375f, -0.75f)
			.setRotationPoint(28.5f, -3.125f, -9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(28.5f, 1.1875f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(28.5f, -2.8125f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(28.5f, -3.4375f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(28.5f, -3.4375f, 9.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.0625f, -0.5f, -0.375f, -0.0625f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(28.5f, -3.4375f, 8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.375f, -4.6875f, -0.625f, -0.375f, -4.6875f, -0.625f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 3.9375f, -0.75f, -0.375f, 3.9375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(28.5f, -3.125f, 5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(28.5f, 1.1875f, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-29.5f, -2.8125f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-29.5f, -3.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-29.5f, -3.4375f, -10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.0625f, -0.5f, -0.375f, -0.0625f, -0.5f)
			.setRotationPoint(-29.5f, -3.4375f, -9.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -4.6875f, -0.625f, -0.375f, -4.6875f, -0.625f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 3.9375f, -0.75f, -0.375f, 3.9375f, -0.75f)
			.setRotationPoint(-29.5f, -3.125f, -9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-29.5f, 1.1875f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-29.5f, -2.8125f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-29.5f, -3.4375f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-29.5f, -3.4375f, 9.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.0625f, -0.5f, -0.375f, -0.0625f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-29.5f, -3.4375f, 8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.375f, -4.6875f, -0.625f, -0.375f, -4.6875f, -0.625f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 3.9375f, -0.75f, -0.375f, 3.9375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-29.5f, -3.125f, 5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-29.5f, 1.1875f, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(25.5f, -2.8125f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(25.5f, -3.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(23.875f, -3.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(25.5f, -2.8125f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(25.5f, -3.4375f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(23.875f, -3.4375f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-26.5f, -2.8125f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-26.5f, -3.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-25.875f, -3.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-26.5f, -2.8125f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-26.5f, -3.4375f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-25.875f, -3.4375f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(7.125f, -1.1875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(14, -1.1875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-15.0625f, -1.6875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-8.125f, -1.1875f, 8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-15, -1.1875f, 8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.0625f, -1.6875f, 9.635f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.0625f, -1.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.0625f, -1.6875f, -9.635f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f)
			.setRotationPoint(-1, -16.3125f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 17, 0, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(10.46875f, -7.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 17, 0, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-22.46875f, -7.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 17, 0, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-11.46875f, -7.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 25, textureX, textureY)
			.addShapeBox(-7, 0, 0, 14, 2, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -7.6875f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 32, textureX, textureY)
			.addShapeBox(-7, 0, 0, 14, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -7.6875f, -8.0725f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 21, textureX, textureY)
			.addShapeBox(-7, 0, 0, 14, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(0, -7.6875f, 7.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 29, textureX, textureY)
			.addShapeBox(-7, 0, 0, 14, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -7.6875f, 8.0725f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-24.25f, -2.8125f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-24.25f, -3.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-24.25f, -2.8125f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(-24.25f, -3.4375f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(23.25f, -2.8125f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(23.25f, -3.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(23.25f, -2.8125f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.4375f, -0.4375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(23.25f, -3.4375f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-29.5f, 2.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-29.5f, 2.25f, -8).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

}
