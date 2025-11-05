//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelGenericFreightBogie extends FVTMFormatBase {

	public ModelGenericFreightBogie(){
		super();
		textureX = 256;
		textureY = 64;
		addToCreators("broscolotos");
		//
		initGroup_Bogie1();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, false, true);
		}
	}

	private final void initGroup_Bogie1(){
		TurboList Bogie1 = new TurboList("Bogie1");
		Bogie1.add(new ModelRendererTurbo(Bogie1, 122, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 15, 8, 0.875f, 0.875f, 1, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-7.8125f, 6, -7.25f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 117, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.875f, 0.6875f, 1, new Vec3f(0.0, 0.0, 0.75))
			.setRotationPoint(-7.8125f, 6, -8.75f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 112, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.875f, 1, new Vec3f(0.0, 0.0, 0.75))
			.setRotationPoint(-7.8125f, 6, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 57, 0, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-7.8125f, 6, -6).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 37, 0, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-7.8125f, 6, 6).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 20, 0, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(7.8125f, 6, -6).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 107, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 15, 8, 0.875f, 0.875f, 1, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(7.8125f, 6, -7.25f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 101, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.875f, 0.6875f, 1, new Vec3f(0.0, 0.0, 0.75))
			.setRotationPoint(7.8125f, 6, -8.75f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 96, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.875f, 1, new Vec3f(0.0, 0.0, 0.75))
			.setRotationPoint(7.8125f, 6, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 110, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 4, 0, 0.25f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.25f, 0.75f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-2.375f, 4.4375f, -2).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 142, 7, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 1, 1, 5, new Vec3f(0.0, -0.125, 0.0))
			.setRotationPoint(0, 1.8125f, 0).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 94, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 5, 0, -0.25f, 0.75f, 0, 0.5f, 0.75f, 0, 0.5f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, -0.25f, 0, -0.5f,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-2.875f, 4.4375f, 2).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 197, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-10, 4.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 91, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, -0.8125f, -0.3125f, 0, 0.0625f, -0.3125f, 0, 0.0625f, -0.3125f, 0, -0.8125f, -0.3125f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-10, 5, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 168, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.8125f, 0, 0.125f, -0.8125f, 0, 0.125f, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(-10, 3.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 182, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.875f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.875f, -0.5f, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-10.5f, 3.1875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 143, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-9.5f, 2.6875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 225, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1, -0.6875f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -1, -0.6875f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0,
				new boolean[]{ true, false, false, true, false, false })
			.setRotationPoint(-9.5f, 2.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-8.9375f, 3.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 195, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -0.9375f, -0.8125f, 0, -0.9375f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.0625f, 0, -1, -0.0625f, 0, -1, -0.0625f, 0, 0, -0.0625f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-8.9375f, 3.625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 191, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, -0.5625f, -0.875f, 0, -0.5625f, -0.875f, 0, 0, -0.875f, 0, -0.3125f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.3125f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-7, 3.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 187, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.8125f, 0, -0.5625f, -0.8125f, 0, -0.5625f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.4375f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.4375f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-7, 3.6875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 192, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.125f, -0.625f, 0, -0.125f, -0.375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.125f, -0.375f, -0.4375f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-7.625f, 6.0625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 187, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.125f, -0.625f, 0, -0.125f, -0.0625f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, -0.125f, -0.0625f, -0.75f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-7.875f, 6.625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 173, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.4375f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-9, 6.0625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 114, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.6875f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.6875f, -0.75f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-8.75f, 6.625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 10, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.375f, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -0.125f, -0.375f, -0.9375f, -0.125f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-8.25f, 6.875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 101, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, -0.25f, -0.0625f, 0.125f, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-8.8125f, 4.9375f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 94, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f)
			.setRotationPoint(-8.8125f, 4.75f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 72, 19, textureX, textureY)
			.addShapeBox(-0.5f, -0.4375f, 0, 1, 1, 16, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-7.8125f, 6, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 53, 19, textureX, textureY)
			.addShapeBox(-0.5f, -0.1875f, 0, 1, 1, 16, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0, 0, 0, 0, -0.25f, -0.4375f, 0.125f, -0.5f, -0.4375f, 0.125f, -0.5f, -0.4375f, 0, -0.25f, -0.4375f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-7.8125f, 6, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 18, 19, textureX, textureY)
			.addShapeBox(-0.5f, -0.1875f, 0, 1, 1, 16, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.4375f, 0.125f, -0.25f, -0.4375f, 0.125f, -0.25f, -0.4375f, 0, -0.5f, -0.4375f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-7.8125f, 6, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 0, 19, textureX, textureY)
			.addShapeBox(-0.75f, 0.375f, 0, 1, 1, 16, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.5f, 0, 0, -0.625f, -0.75f, 0.125f, -0.125f, -0.75f, 0.125f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-7.8125f, 6, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 185, 0, textureX, textureY)
			.addShapeBox(-0.5f, -0.4375f, 0, 1, 1, 17, 0, -0.0625f, -0.0625f, 0.05f, -0.8125f, -0.0625f, 0.05f, -0.8125f, -0.0625f, -0.85f, -0.0625f, -0.0625f, -0.85f, -0.0625f, -0.8125f, 0.05f, -0.8125f, -0.8125f, 0.05f, -0.8125f, -0.8125f, -0.85f, -0.0625f, -0.8125f, -0.85f)
			.setRotationPoint(-7.8125f, 6, -8.05f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 148, 0, textureX, textureY)
			.addShapeBox(0.25f, -0.4375f, 0, 1, 1, 17, 0, -0.0625f, -0.0625f, 0.05f, -0.8125f, -0.0625f, 0.05f, -0.8125f, -0.0625f, -0.85f, -0.0625f, -0.0625f, -0.85f, -0.0625f, -0.8125f, 0.05f, -0.8125f, -0.8125f, 0.05f, -0.8125f, -0.8125f, -0.85f, -0.0625f, -0.8125f, -0.85f)
			.setRotationPoint(-7.8125f, 6, -8.05f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 111, 0, textureX, textureY)
			.addShapeBox(-0.125f, 0.375f, 0, 1, 1, 17, 0, -0.0625f, -0.0625f, 0.05f, -0.8125f, -0.0625f, 0.05f, -0.8125f, -0.0625f, -0.85f, -0.0625f, -0.0625f, -0.85f, -0.0625f, -0.8125f, 0.05f, -0.8125f, -0.8125f, 0.05f, -0.8125f, -0.8125f, -0.85f, -0.0625f, -0.8125f, -0.85f)
			.setRotationPoint(-7.8125f, 6, -8.05f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 30, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, 0, 0, -1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-6.6875f, 4.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 5, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, -0.125f, 0, 0, -0.125f, 0, 0, 0.1875f, 0, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, 0, 0, 0.1875f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-6.6875f, 4.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 183, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-6.5625f, 4.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 179, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, -0.0625f, 0, -0.8125f, -0.0625f, 0, 0, 0, 0, 0, -0.6875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.6875f, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-6.125f, 6.8125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 175, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5625f, -0.875f, 0, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-6.6875f, 5.1875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 167, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.5625f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-6.6875f, 5.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 163, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0,
				new boolean[]{ false, true, true, false, false, false })
			.setRotationPoint(-6.125f, 4.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 155, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-5.875f, 3.625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 151, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.0625f, -0.75f, 0, 0.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, 0.0625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-4.8125f, 3.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 27, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-5.5f, 5.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 24, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.3125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.3125f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-5.125f, 4.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 21, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.1875f, -0.6875f, 0, -0.1875f, -0.6875f, 0, 0, 0.125f, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-4.875f, 5.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 18, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6875f, 0, -0.5625f, -1, 0, -0.5625f, -1, 0, 0, -0.6875f, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-4.0625f, 5.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 147, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0, -0.5f, 0, 0.25f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, 0.25f, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-3.0625f, 5.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 143, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-3.0625f, 5.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 7, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, 0, -0.1875f, 0, 0, 0.125f, 0, -0.5625f, 0.375f, 0, -0.5625f, 0.375f, 0, 0, 0.125f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-3.1875f, 3, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.0625f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, 0, -0.0625f, 0, 0, 0.125f, 0, -0.3125f, 0.125f, 0, -0.3125f, 0.125f, 0, 0, 0.125f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-4.875f, 3, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 4, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.8125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-2.75f, 4.1875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 252, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.4375f, 0, -0.25f, 0.4375f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-3.375f, 6.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 135, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -0.5625f, -0.625f, 0, -0.5625f, -0.625f, 0, 0, -0.6875f, 0,
				new boolean[]{ false, true, true, false, false, false })
			.setRotationPoint(-2.625f, 6.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 192, 2, textureX, textureY)
			.addShapeBox(0, -0.1875f, 0, 4, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.375f, 0.125f, 0, 0.375f, 0.125f, 0, 0, 0.125f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-2.1875f, 7.875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 82, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -0.6875f, -0.8125f, 0, -0.6875f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, 0, -0.125f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-2.1875f, 5.625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 78, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.0625f, 0, -1, -0.0625f, 0, -1, -0.0625f, 0, 0, -0.0625f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-2.1875f, 5.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 248, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-2.625f, 4.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 74, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, 0, -0.8125f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-2.75f, 4, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 131, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-2.75f, 3.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 241, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.3125f, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0, 0.0625f, -0.3125f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(9, 5, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 72, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(9, 4.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 205, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.125f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.125f, -0.8125f, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0,
				new boolean[]{ false, true, true, false, false, false })
			.setRotationPoint(5, 3.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 168, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(4.5f, 3.1875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 180, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(4.5f, 2.6875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 131, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.375f, -0.75f, 0, -1, -0.6875f, 0, -1, -0.6875f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0,
				new boolean[]{ false, true, false, true, false, false })
			.setRotationPoint(4.5f, 2.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 70, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(7.9375f, 3.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 66, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.9375f, -0.8125f, 0, -1, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -1, -0.0625f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(7.9375f, 3.625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 62, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5625f, -0.875f, 0, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(6, 3.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 58, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.5625f, -0.8125f, 0, -0.5625f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(6, 3.6875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 54, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(5.5625f, 4.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 249, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.875f, 0, 0, -1, 0, 0, -1, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(5.6875f, 4.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 251, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.4375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.4375f, 0.1875f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(5.6875f, 4.9375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 50, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.0625f, 0, -0.8125f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.6875f, 0,
				new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(5.125f, 6.8125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 74, 0, textureX, textureY)
			.addShapeBox(-0.5f, -0.4375f, 0, 1, 1, 17, 0, -0.0625f, -0.0625f, 0.05f, -0.8125f, -0.0625f, 0.05f, -0.8125f, -0.0625f, -0.85f, -0.0625f, -0.0625f, -0.85f, -0.0625f, -0.8125f, 0.05f, -0.8125f, -0.8125f, 0.05f, -0.8125f, -0.8125f, -0.85f, -0.0625f, -0.8125f, -0.85f)
			.setRotationPoint(7.8125f, 6, -8.05f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 37, 0, textureX, textureY)
			.addShapeBox(0.25f, -0.4375f, 0, 1, 1, 17, 0, -0.0625f, -0.0625f, 0.05f, -0.8125f, -0.0625f, 0.05f, -0.8125f, -0.0625f, -0.85f, -0.0625f, -0.0625f, -0.85f, -0.0625f, -0.8125f, 0.05f, -0.8125f, -0.8125f, 0.05f, -0.8125f, -0.8125f, -0.85f, -0.0625f, -0.8125f, -0.85f)
			.setRotationPoint(7.8125f, 6, -8.05f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 0, 0, textureX, textureY)
			.addShapeBox(-0.125f, 0.375f, 0, 1, 1, 17, 0, -0.0625f, -0.0625f, 0.05f, -0.8125f, -0.0625f, 0.05f, -0.8125f, -0.0625f, -0.85f, -0.0625f, -0.0625f, -0.85f, -0.0625f, -0.8125f, 0.05f, -0.8125f, -0.8125f, 0.05f, -0.8125f, -0.8125f, -0.85f, -0.0625f, -0.8125f, -0.85f)
			.setRotationPoint(7.8125f, 6, -8.05f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 206, 4, textureX, textureY)
			.addShapeBox(-0.5f, -0.4375f, 0, 1, 1, 16, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(7.8125f, 6, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 205, 2, textureX, textureY)
			.addShapeBox(-0.5f, -0.1875f, 0, 1, 1, 16, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0, 0, 0, 0, -0.25f, -0.4375f, 0.125f, -0.5f, -0.4375f, 0.125f, -0.5f, -0.4375f, 0, -0.25f, -0.4375f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(7.8125f, 6, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 205, 0, textureX, textureY)
			.addShapeBox(-0.5f, -0.1875f, 0, 1, 1, 16, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.4375f, 0.125f, -0.25f, -0.4375f, 0.125f, -0.25f, -0.4375f, 0, -0.5f, -0.4375f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(7.8125f, 6, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 225, 0, textureX, textureY)
			.addShapeBox(-0.75f, 0.375f, 0, 1, 1, 16, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.5f, 0, 0, -0.625f, -0.75f, 0.125f, -0.125f, -0.75f, 0.125f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(7.8125f, 6, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 182, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.375f, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -0.125f, -0.375f, -0.9375f, -0.125f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(7.375f, 6.875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 49, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.4375f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(6.625f, 6.0625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 44, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.125f, -0.625f, 0, -0.125f, -0.375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.125f, -0.375f, -0.4375f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(8, 6.0625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 215, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.125f, -0.625f, 0, -0.125f, -0.0625f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, -0.125f, -0.0625f, -0.75f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(7.75f, 6.625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 210, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.6875f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.6875f, -0.75f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(6.875f, 6.625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 80, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, -0.25f, -0.0625f, 0.125f, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(6.8125f, 4.9375f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 73, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f)
			.setRotationPoint(6.8125f, 4.75f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 46, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, -0.5625f, -0.875f, 0, -0.5625f, -0.875f, 0, 0, -0.875f, 0, -0.3125f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.3125f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(5.6875f, 5.1875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 42, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.4375f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.4375f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(5.6875f, 5.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 242, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.25f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(4.5f, 5.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 38, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(5.125f, 4.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 34, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(4.875f, 3.625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 239, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.625f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(4.125f, 4.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 236, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -1, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5625f, -1, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(3.0625f, 5.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 233, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.6875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.1875f, -0.6875f, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(3.875f, 5.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 230, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.4375f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(2.375f, 6.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 30, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, -0.5625f, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(2.0625f, 5.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 26, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(2.0625f, 5.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 227, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.3125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.875f, -0.3125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(1.75f, 4.1875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 224, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.25f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5625f, -0.25f, 0, -0.5625f, 0.375f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5625f, 0.375f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(2.1875f, 3, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 146, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.3125f, -0.1875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.3125f, -0.1875f, 0, -0.3125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.3125f, 0.125f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(2.875f, 3, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 22, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0, 0, -0.75f, 0, -1.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, -1.0625f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(3.8125f, 3.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 202, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5625f, -0.625f, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(1.625f, 6.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 18, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.6875f, -0.8125f, 0, -0.875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.875f, -0.125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(1.1875f, 5.625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 199, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -1, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -1, -0.0625f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(1.1875f, 5.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 244, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(1.625f, 4.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 195, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, 0, -0.8125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(1.9375f, 4, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 109, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-2.125f, 3.75f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 243, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-2.125f, 4.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 141, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-2.625f, 4.5f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 136, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(0.875f, 4.5f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 232, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-1.625f, 4.5f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 131, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.125f, -0.625f, 0, -0.125f, -0.375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.125f, -0.375f, -0.4375f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-7.625f, 6.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 121, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.125f, -0.625f, 0, -0.125f, -0.0625f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, -0.125f, -0.0625f, -0.75f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-7.875f, 6.625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 109, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.4375f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-9, 6.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 104, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.6875f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.6875f, -0.75f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-8.75f, 6.625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 99, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.375f, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -0.125f, -0.375f, -0.9375f, -0.125f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-8.25f, 6.875f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 225, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, -0.25f, -0.0625f, 0.125f, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-8.8125f, 4.9375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 82, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.3125f, 0.125f, -0.9375f, 0, 0.125f, -0.9375f, 0, -0.25f, 0.125f, -0.3125f, -0.25f, 0.125f, -0.1875f, 0.125f, -0.9375f, -0.1875f, 0.125f, -0.9375f, -0.1875f, -0.25f, 0.125f, -0.1875f, -0.25f)
			.setRotationPoint(-8.8125f, 5.25f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 247, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, 0.125f, 0.125f, -0.3125f, 0.125f, 0.125f, -0.3125f, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.1875f, 0.125f, 0.125f, -0.1875f, 0.125f, 0.125f, -0.1875f, -0.25f, -0.9375f, -0.1875f, -0.25f)
			.setRotationPoint(-7.8125f, 5.25f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 212, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f)
			.setRotationPoint(-8.8125f, 4.75f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 235, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.375f, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, -0.125f, -0.375f, -0.9375f, -0.125f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(7.375f, 6.875f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 230, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.4375f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(6.625f, 6.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 225, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.125f, -0.625f, 0, -0.125f, -0.375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.125f, -0.375f, -0.4375f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(8, 6.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 205, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.125f, -0.625f, 0, -0.125f, -0.0625f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, -0.125f, -0.0625f, -0.75f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(7.75f, 6.625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 197, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.6875f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.6875f, -0.75f, -0.125f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(6.875f, 6.625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 205, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, 0.125f, -0.0625f, 0.125f, -0.25f, -0.0625f, 0.125f, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(6.8125f, 4.9375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 120, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f)
			.setRotationPoint(6.8125f, 4.75f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 178, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-10, 4.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 160, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, -0.8125f, -0.3125f, 0, 0.0625f, -0.3125f, 0, 0.0625f, -0.3125f, 0, -0.8125f, -0.3125f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-10, 5, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 243, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.8125f, 0, 0.125f, -0.8125f, 0, 0.125f, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(-10, 3.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 145, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.875f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.875f, -0.5f, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-10.5f, 3.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 180, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-9.5f, 2.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 168, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1, -0.6875f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -1, -0.6875f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0,
				new boolean[]{ true, false, false, true, false, false })
			.setRotationPoint(-9.5f, 2.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 191, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-8.9375f, 3.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 187, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -0.9375f, -0.8125f, 0, -0.9375f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.0625f, 0, -1, -0.0625f, 0, -1, -0.0625f, 0, 0, -0.0625f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-8.9375f, 3.625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 183, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, -0.5625f, -0.875f, 0, -0.5625f, -0.875f, 0, 0, -0.875f, 0, -0.3125f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.3125f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-7, 3.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 179, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.8125f, 0, -0.5625f, -0.8125f, 0, -0.5625f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.4375f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.4375f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-7, 3.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 221, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, 0, 0, -1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-6.6875f, 4.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 77, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, -0.125f, 0, 0, -0.125f, 0, 0, 0.1875f, 0, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, 0, 0, 0.1875f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-6.6875f, 4.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 175, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-6.5625f, 4.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 171, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, -0.0625f, 0, -0.8125f, -0.0625f, 0, 0, 0, 0, 0, -0.6875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.6875f, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-6.125f, 6.8125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 167, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5625f, -0.875f, 0, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-6.6875f, 5.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 163, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.5625f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-6.6875f, 5.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 159, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0,
				new boolean[]{ false, true, true, false, false, false })
			.setRotationPoint(-6.125f, 4.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 155, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-5.875f, 3.625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 151, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.0625f, -0.75f, 0, 0.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, 0.0625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-4.8125f, 3.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 218, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-5.5f, 5.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 215, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.3125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.3125f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-5.125f, 4.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 212, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.1875f, -0.6875f, 0, -0.1875f, -0.6875f, 0, 0, 0.125f, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-4.875f, 5.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 151, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -2, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-5.125f, 6.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 209, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6875f, 0, -0.5625f, -1, 0, -0.5625f, -1, 0, 0, -0.6875f, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-4.0625f, 5.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 147, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0, -0.5f, 0, 0.25f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, 0.25f, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-3.0625f, 5.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 143, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-3.0625f, 5.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 206, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, 0, -0.1875f, 0, 0, 0.125f, 0, -0.5625f, 0.375f, 0, -0.5625f, 0.375f, 0, 0, 0.125f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-3.1875f, 3, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 67, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.0625f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, 0, -0.0625f, 0, 0, 0.125f, 0, -0.3125f, 0.125f, 0, -0.3125f, 0.125f, 0, 0, 0.125f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-4.875f, 3, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 171, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.8125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-2.75f, 4.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 13, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.4375f, 0, -0.25f, 0.4375f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-3.375f, 6.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 139, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -0.5625f, -0.625f, 0, -0.5625f, -0.625f, 0, 0, -0.6875f, 0,
				new boolean[]{ false, true, true, false, false, false })
			.setRotationPoint(-2.625f, 6.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 155, 2, textureX, textureY)
			.addShapeBox(0, -0.1875f, 0, 4, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.375f, 0.125f, 0, 0.375f, 0.125f, 0, 0, 0.125f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-2.1875f, 7.875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 135, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -0.6875f, -0.8125f, 0, -0.6875f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, -0.5f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-2.1875f, 5.625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 237, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.0625f, 0, -1, -0.0625f, 0, -1, -0.0625f, -0.5f, 0, -0.0625f, -0.5f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-2.1875f, 5.75f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 62, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-2.625f, 4.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 233, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, 0, -0.8125f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-2.75f, 4, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 180, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-2.75f, 3.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 57, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.3125f, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0, 0.0625f, -0.3125f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(9, 5, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 44, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(9, 4.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 143, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.125f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.125f, -0.8125f, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0,
				new boolean[]{ false, true, true, false, false, false })
			.setRotationPoint(5, 3.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 131, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(4.5f, 3.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 131, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(4.5f, 2.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 243, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.375f, -0.75f, 0, -1, -0.6875f, 0, -1, -0.6875f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0,
				new boolean[]{ false, true, false, true, false, false })
			.setRotationPoint(4.5f, 2.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 229, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.9375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.9375f, -0.125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(7.9375f, 3.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 225, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.9375f, -0.8125f, 0, -1, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -1, -0.0625f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(7.9375f, 3.625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 205, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5625f, -0.875f, 0, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(6, 3.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 178, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.5625f, -0.8125f, 0, -0.5625f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(6, 3.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 156, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(5.5625f, 4.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 10, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.875f, 0, 0, -1, 0, 0, -1, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(5.6875f, 4.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 39, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.4375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.4375f, 0.1875f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(5.6875f, 4.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 87, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.0625f, 0, -0.8125f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.6875f, 0,
				new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(5.125f, 6.8125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 35, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, -0.5625f, -0.875f, 0, -0.5625f, -0.875f, 0, 0, -0.875f, 0, -0.3125f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.3125f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(5.6875f, 5.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 252, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.4375f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.4375f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(5.6875f, 5.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 246, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.25f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(4.5f, 5.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 131, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(5.125f, 4.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 161, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(4.875f, 3.625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 199, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.625f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(4.125f, 4.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 253, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -1, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5625f, -1, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(3.0625f, 5.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 188, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.6875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.1875f, -0.6875f, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(3.875f, 5.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 30, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -2, 0, 0, -2, 0, -0.25f, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(3.125f, 6.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 253, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.4375f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(2.375f, 6.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 161, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, -0.5625f, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(2.0625f, 5.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 50, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(2.0625f, 5.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 219, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.3125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.875f, -0.3125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(1.75f, 4.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 125, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.25f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5625f, -0.25f, 0, -0.5625f, 0.375f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5625f, 0.375f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(2.1875f, 3, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 25, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.3125f, -0.1875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.3125f, -0.1875f, 0, -0.3125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.3125f, 0.125f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(2.875f, 3, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 87, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0, 0, -0.75f, 0, -1.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, -1.0625f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(3.8125f, 3.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 127, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5625f, -0.625f, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(1.625f, 6.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 237, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.6875f, -0.8125f, 0, -0.875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.875f, -0.125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(1.1875f, 5.625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 110, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -1, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -1, -0.0625f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(1.1875f, 5.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 20, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(1.625f, 4.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 110, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, 0, -0.8125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(1.9375f, 4, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 154, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-2.125f, 3.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 191, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-2.125f, 4.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 196, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-2.625f, 4.5f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 159, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(0.875f, 4.5f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 119, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-1.625f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 0, 0, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(7.8125f, 6, 6).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 10, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -2, 0, 0, -2, 0, -0.25f, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(3.125f, 6.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 5, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -2, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-5.125f, 6.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, 0.125f, 0.125f, -0.3125f, 0.125f, 0.125f, -0.3125f, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, -0.1875f, 0.125f, 0.125f, -0.1875f, 0.125f, 0.125f, -0.1875f, -0.25f, -0.9375f, -0.1875f, -0.25f)
			.setRotationPoint(7.8125f, 5.25f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 192, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.3125f, 0.125f, -0.9375f, 0, 0.125f, -0.9375f, 0, -0.25f, 0.125f, -0.3125f, -0.25f, 0.125f, -0.1875f, 0.125f, -0.9375f, -0.1875f, 0.125f, -0.9375f, -0.1875f, -0.25f, 0.125f, -0.1875f, -0.25f)
			.setRotationPoint(6.8125f, 5.25f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 187, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.3125f, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, 0, 0.125f, 0.125f, -0.3125f, 0.125f, 0.125f, -0.1875f, -0.25f, -0.9375f, -0.1875f, -0.25f, -0.9375f, -0.1875f, 0.125f, 0.125f, -0.1875f, 0.125f)
			.setRotationPoint(-8.8125f, 5.25f, -7.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 173, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, -0.25f, 0.125f, -0.3125f, -0.25f, 0.125f, -0.3125f, 0.125f, -0.9375f, 0, 0.125f, -0.9375f, -0.1875f, -0.25f, 0.125f, -0.1875f, -0.25f, 0.125f, -0.1875f, 0.125f, -0.9375f, -0.1875f, 0.125f)
			.setRotationPoint(-7.8125f, 5.25f, -7.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 49, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, -0.25f, 0.125f, -0.3125f, -0.25f, 0.125f, -0.3125f, 0.125f, -0.9375f, 0, 0.125f, -0.9375f, -0.1875f, -0.25f, 0.125f, -0.1875f, -0.25f, 0.125f, -0.1875f, 0.125f, -0.9375f, -0.1875f, 0.125f)
			.setRotationPoint(7.8125f, 5.25f, -7.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 217, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.3125f, -0.25f, -0.9375f, 0, -0.25f, -0.9375f, 0, 0.125f, 0.125f, -0.3125f, 0.125f, 0.125f, -0.1875f, -0.25f, -0.9375f, -0.1875f, -0.25f, -0.9375f, -0.1875f, 0.125f, 0.125f, -0.1875f, 0.125f)
			.setRotationPoint(6.8125f, 5.25f, -7.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 74, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 5, 0, -0.25f, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.75f, 0, -0.25f, 0.75f, 0, -0.25f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, -0.25f, -0.5f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-2.875f, 4.4375f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 168, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-1.3125f, 5.75f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 94, 11, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.1875, 0.0))
			.setRotationPoint(-1.3125f, 5.8125f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 72, 11, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-1.3125f, 7.625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 215, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-1.3125f, 6.09375f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 210, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-1.3125f, 6.46875f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 136, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-1.3125f, 6.84375f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 131, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-1.3125f, 7.21875f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 121, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(0, 5.75f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 116, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.1875, 0.0))
			.setRotationPoint(0, 5.8125f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 111, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(0, 7.625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 106, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, 6.09375f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 101, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, 6.46875f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 85, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, 6.84375f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 80, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, 7.21875f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 248, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(1.3125f, 5.75f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 243, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.1875, 0.0))
			.setRotationPoint(1.3125f, 5.8125f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 235, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(1.3125f, 7.625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 230, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(1.3125f, 6.09375f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 225, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(1.3125f, 6.46875f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 205, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(1.3125f, 6.84375f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 183, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(1.3125f, 7.21875f, 7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 178, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-1.3125f, 5.75f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 156, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.1875, 0.0))
			.setRotationPoint(-1.3125f, 5.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 151, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-1.3125f, 7.625f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 67, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-1.3125f, 6.09375f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 62, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-1.3125f, 6.46875f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 57, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-1.3125f, 6.84375f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 45, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-1.3125f, 7.21875f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 40, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(0, 5.75f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 35, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.1875, 0.0))
			.setRotationPoint(0, 5.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 30, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(0, 7.625f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 25, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, 6.09375f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 20, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, 6.46875f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 10, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, 6.84375f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 5, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0, 7.21875f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 0, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(1.3125f, 5.75f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 196, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.1875, 0.0))
			.setRotationPoint(1.3125f, 5.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 191, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(1.3125f, 7.625f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 173, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(1.3125f, 6.09375f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 168, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(1.3125f, 6.46875f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 94, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(1.3125f, 6.84375f, -7).setRotationAngle(0, 0, 8)
		);
		Bogie1.add(new ModelRendererTurbo(Bogie1, 74, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(1.3125f, 7.21875f, -7).setRotationAngle(0, 0, 8)
		);
		groups.add(Bogie1);
	}

}
