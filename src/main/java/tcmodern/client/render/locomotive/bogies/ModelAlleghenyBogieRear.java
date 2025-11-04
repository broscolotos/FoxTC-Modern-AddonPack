//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelAlleghenyBogieRear extends FVTMFormatBase {

	public ModelAlleghenyBogieRear(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		addToCreators("Riggs64");
		//
		initGroup_RearTruck();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_RearTruck(){
		TurboList RearTruck = new TurboList("RearTruck");
		RearTruck.add(new ModelRendererTurbo(RearTruck, 367, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-84.3125f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 355, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-72.5625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 348, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60.8125f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 341, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-84.3125f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 375, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-72.5625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 401, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60.8125f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 321, 276, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-44.5625f, 5.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 642cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 400, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0,
				new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(-45.5625f, 6.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 639cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 494, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 1, 1.25f, -0.5f, 0, -4, -0.5f, 0, 4, 0, 1, -1.5f, 0, 0.5f, 1.25f, -0.5f, 0, -4, -0.5f, 0, 4, 0, 0.5f, -1.5f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-53.0625f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 468, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 1, -1.5f, -0.5f, 0, 4, -0.5f, 0, -4, 0, 1, 1.25f, 0, 0.5f, -1.5f, -0.5f, 0, 4, -0.5f, 0, -4, 0, 0.5f, 1.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-53.0625f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 494, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0.125f, 1, -0.5f, -1.125f, -4.25f, -0.5f, -1.125f, 4, 0, 0.125f, -1.5f, 0, -1, 1, -0.5f, 0.125f, -4.25f, -0.5f, 0.125f, 4, 0, -1, -1.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-53.0625f, 5.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 494, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0.125f, 1, -0.5f, -1, -4.25f, -0.5f, -1, 4, 0, 0.125f, -1.5f, 0, -1, 1.25f, -0.5f, 0, -4, -0.5f, 0, 4, 0, -1, -1.5f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-53.0625f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 494, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0.125f, -1.5f, -0.5f, -1.125f, 4, -0.5f, -1.125f, -4.25f, 0, 0.125f, 1, 0, -1, -1.5f, -0.5f, 0.125f, 4, -0.5f, 0.125f, -4.25f, 0, -1, 1,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-53.0625f, 5.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 494, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0.125f, -1.5f, -0.5f, -1, 4, -0.5f, -1, -4.25f, 0, 0.125f, 1, 0, -1, -1.5f, -0.5f, 0, 4, -0.5f, 0, -4, 0, -1, 1.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-53.0625f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 357, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-54.0625f, 4.375f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 26, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.375f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-54.0625f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 497, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, 0, 0.125f, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-55.0625f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 9, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, 0, 0.125f, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-55.0625f, 4.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.5f, 0, 0.375f, -0.5f, 0, -1.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -1.25f, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-55.9375f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 6, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.5f, 0, 0.375f, -0.5f, 0, -1.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -1.25f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-55.9375f, 3.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 455, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0.5f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0.5f, 0, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-85.1875f, 0.375f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 455, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0.5f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.1875f, 0.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 453, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.375f, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-57.4375f, 0.75f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 3, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.5f, 0, -0.5f, -0.5f, 0, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.375f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.4375f, 0.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 104, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.5f, 0, 0.125f, -0.5f, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -1, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-56.6875f, 1.75f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.5f, 0, 0.125f, -0.5f, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -1, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-56.6875f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 257, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-90.0625f, 4.375f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 482, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-90.0625f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 52, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, -1, 0, 0, -1, -0.5f, 0, 0, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-89.0625f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 249, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, -1, 0, 0, -1, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-89.0625f, 4.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 26, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, 0, 0, 0.375f, 0, 0, 0.375f, -0.5f, -0.125f, -0.875f, -0.5f, -0.125f, 0, 0, 0, -1.25f, 0, 0, -1.25f, -0.5f, -0.125f, 0, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-88.1875f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 246, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, 0, 0, 0.375f, 0, 0, 0.375f, -0.5f, -0.125f, -0.875f, -0.5f, -0.125f, 0, 0, 0, -1.25f, 0, 0, -1.25f, -0.25f, -0.125f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-88.1875f, 3.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 11, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.25f, 0, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-86.6875f, 0.75f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 243, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, -0.25f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-86.6875f, 0.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 231, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, 0, 0, 0, -1, 0, 0, -1, -0.5f, -0.25f, 0, -0.5f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-87.4375f, 1.75f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 240, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, 0, 0, 0, -1, 0, 0, -1, -0.25f, -0.25f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-87.4375f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 455, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0.75f, 0, 0, 1, 0, 0, 1, 0, -0.25f, 0.75f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.6875f, 0.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.8125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 491, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, 0, 0, -0.5f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.375f, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-54.0625f, 4.375f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 509, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, 0, 0, 0.125f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-55.0625f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 192, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, -0.5f, -0.125f, -0.875f, -0.5f, -0.125f, -0.875f, 0, 0, 0.375f, 0, 0, -1.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -1.25f, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-55.9375f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 428, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, -0.5f, -0.875f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-86.1875f, 0.375f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, -0.875f, 0, 0, -0.5f, 0, 0, -0.375f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.375f, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-57.4375f, 0.75f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 244, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, -0.875f, 0, 0, 0.125f, 0, 0, -1, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -1, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-56.6875f, 1.75f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 473, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-90.0625f, 4.375f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 331, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, -0.875f, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-89.0625f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 323, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, 0, -0.125f, -0.875f, 0, -0.125f, 0, -0.5f, 0, -1.25f, -0.5f, 0, -1.25f, 0, -0.125f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-88.1875f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 270, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.875f, 0, -0.25f, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, -0.25f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-86.6875f, 0.75f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 331, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, -0.25f, -0.875f, 0, -0.25f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.25f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-87.4375f, 1.75f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 237, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, 0, 0, -0.5f, 0, 0, -0.375f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.375f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-54.0625f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 437, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, 0, 0, 0.125f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-55.0625f, 4.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 434, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, -0.5f, -0.125f, -0.875f, -0.5f, -0.125f, -0.875f, 0, 0, 0.375f, 0, 0, -1.25f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0, -1.25f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-55.9375f, 3.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 232, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, -0.5f, -0.875f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-86.1875f, 0.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 123, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, -0.875f, 0, 0, -0.5f, 0, 0, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.375f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.4375f, 0.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 120, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, -0.875f, 0, 0, 0.125f, 0, 0, -1, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -1, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-56.6875f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 45, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-90.0625f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 42, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, -0.875f, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-89.0625f, 4.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 39, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.875f, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, 0, -0.125f, -0.875f, 0, -0.125f, 0, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, 0, -0.125f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-88.1875f, 3.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 485, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.875f, 0, -0.25f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, -0.25f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-86.6875f, 0.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 482, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, -0.25f, -0.875f, 0, -0.25f, 0, -0.25f, 0, -1, -0.25f, 0, -1, 0, -0.25f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-87.4375f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 291, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0, -0.625f, -0.25f, 0.25f, -0.625f, -0.25f, 0.25f, -0.625f, 0, 0, -0.625f, 0, 0.75f, 0, -0.25f, 1, 0, -0.25f, 1, 0, 0, 0.75f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.6875f, 0.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 220, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.8125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0.5f, 0, -0.25f, -1, 0, -0.25f, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-86.0625f, 4.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 497, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0.25f, -0.25f, -1.125f, 0.25f, -0.25f, -1.125f, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.8125f, 3.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 337, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-86.0625f, 4.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 182, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0.25f, 0, -1.125f, 0.25f, 0, -1.125f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.8125f, 3.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 414, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.75f, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, -0.5f, -0.625f, 0, 0.75f, -0.625f, 0, 0.75f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.5625f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 351, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.75f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, -0.25f, 0.75f, -0.625f, -0.25f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0.75f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.5625f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 46, 282, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-59.8125f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 41, 282, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-71.5625f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 36, 282, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-83.3125f, 5.5f, -6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 104, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-63.3125f, 3, -6.01f).setRotationAngle(0, 0, 0).setName("Box 637cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 497, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-63.3125f, 3, 6.01f).setRotationAngle(0, 0, 0).setName("Box 637cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-75.0625f, 3, -6.01f).setRotationAngle(0, 0, 0).setName("Box 637cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 497, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-75.0625f, 3, 6.01f).setRotationAngle(0, 0, 0).setName("Box 637cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 436, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-87.8125f, 1, -6.01f).setRotationAngle(0, 0, 0).setName("Box 637cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 389, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-87.8125f, 1, 6.01f).setRotationAngle(0, 0, 0).setName("Box 637cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-56.0625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 67, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-56.0625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 316, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.8125f, 0, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-59.3125f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 312, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.8125f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-59.3125f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 316, 276, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, -0.25f, 0.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-59.0625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 288, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-56.5625f, 6.5f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 278, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(-56.5625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 408, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(-57.5625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 19, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0.5f, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(-56.5625f, 6.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 408, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, -0.5f, 0.5f, 0,
				new boolean[]{ true, false, true, false, false, false })
			.setRotationPoint(-57.5625f, 6.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 308, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-61.25f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 304, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-61.25f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, 0, -0.75f, -0.625f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-62.25f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 476, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-56.5625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 473, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-57.5625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 323, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0.5f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-56.5625f, 6.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 395, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-57.5625f, 6.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 283, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-56.5625f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 210, 276, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-59.0625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 481, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-59.3125f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 474, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-59.3125f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 470, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.75f, -0.625f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-62.25f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 346, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-61.25f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 342, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -1, -0.8125f, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-61.25f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 329, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.3125f, 0.5f, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-61.8125f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 439, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, -0.3125f, 0.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-61.8125f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 467, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, -0.5f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-63.75f, 5.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 240, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-63.75f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 237, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0.125f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-62.5f, 5.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 182, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-62.5f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 179, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-63.75f, 5.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 320, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-63.75f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 317, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-62.5f, 5.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 314, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-62.5f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 272, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.625f, 0.625f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-62.625f, 5.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 267, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.625f, 0.625f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-62.625f, 5.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 311, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, -0.5f, 0.25f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-62.5f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 435, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-62.5f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 245, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1.25f, -0.25f, 0.5f, -1.25f, -0.25f, 0.5f, -1.25f, 0, 0, -1.25f, 0, 0, -1.125f, -0.25f, 0.5f, -0.125f, -0.25f, 0.5f, -0.125f, 0, 0, -1.125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-65, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 238, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, -0.25f, 0, -1.125f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-65, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 277, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0, 0, 0, 0, -1.125f, -0.25f, 0.375f, -1.125f, -0.25f, 0.375f, -1.125f, 0, 0, -1.125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-66.375f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 46, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, 0, 0.375f, -1.125f, 0, 0.375f, -1.125f, -0.25f, 0, -1.125f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-66.375f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 414, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, 0, 0, 0.25f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-65, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 375, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-65, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 409, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, 0, 0, 0.25f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-68.125f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 351, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-68.125f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 46, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-69.875f, 5.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 43, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.375f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 371, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-69.875f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 368, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-68.625f, 5.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 365, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-68.625f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 148, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-70.375f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 39, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, -0.125f, 0, 0.5f, -1.125f, 0, 0.5f, -1.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-69.875f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 231, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1.25f, -0.25f, 0.5f, -1.25f, -0.25f, 0.5f, -1.25f, 0, 0, -1.25f, 0, 0, -0.125f, -0.25f, 0.5f, -1.125f, -0.25f, 0.5f, -1.125f, 0, 0, -0.125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-69.875f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 262, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.625f, 0.625f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-68.75f, 5.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 362, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-69.875f, 5.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 359, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-69.875f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 356, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-68.625f, 5.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 461, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-68.625f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 257, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.625f, 0.625f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-68.75f, 5.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 458, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, 0, -0.75f, -0.625f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.875f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 205, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.75f, -0.625f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.875f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, -0.3125f, 0.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-70.875f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 409, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.3125f, 0.5f, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-70.875f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 338, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.8125f, 0, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-71.125f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 103, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.8125f, 0, 0,
				new boolean[]{ true, false, false, true, false, false })
			.setRotationPoint(-71.125f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 334, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-71.125f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 330, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-71.125f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 394, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.3125f, 0.5f, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-73.5625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 98, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, 0, -0.75f, -0.625f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-74, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 167, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.75f, -0.625f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-74, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 484, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-73, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 97, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-73, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 402, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-73, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 356, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -1, -0.8125f, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-73, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 157, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, -0.3125f, 0.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-73.5625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 164, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, -0.5f, 0.25f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-74.25f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 161, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-74.25f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 151, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1.25f, -0.25f, 0.5f, -1.25f, -0.25f, 0.5f, -1.25f, 0, 0, -1.25f, 0, 0, -1.125f, -0.25f, 0.5f, -0.125f, -0.25f, 0.5f, -0.125f, 0, 0, -1.125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-76.75f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 16, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, -0.25f, 0, -1.125f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-76.75f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 158, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-75.5f, 5.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 151, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-75.5f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 148, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-74.25f, 5.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 145, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-74.25f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 109, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, 0, 0, 0.25f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-76.75f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 142, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-75.5f, 5.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 139, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-75.5f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 136, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-74.25f, 5.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 98, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-74.25f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-76.75f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 108, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.625f, 0.625f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-74.375f, 5.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 103, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.625f, 0.625f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-74.375f, 5.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 357, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0, 0, 0, 0, -1.125f, -0.25f, 0.375f, -1.125f, -0.25f, 0.375f, -1.125f, 0, 0, -1.125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-78.125f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 509, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, 0, 0.375f, -1.125f, 0, 0.375f, -1.125f, -0.25f, 0, -1.125f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-78.125f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 93, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.625f, 0.625f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-80.5f, 5.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 88, 276, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.625f, 0.625f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-80.5f, 5.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 95, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-81.625f, 5.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 71, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, -0.5f, 0.25f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-82.125f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 175, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-81.625f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 279, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-80.375f, 5.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 204, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-80.375f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 360, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, 0, 0, 0.25f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-79.875f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 191, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-81.625f, 5.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 188, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-82.125f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 185, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.25f, -0.5f, 0.125f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-81.625f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 78, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-80.375f, 5.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 382, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.25f, 0.125f, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-80.375f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 172, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-79.875f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 486, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1.25f, -0.25f, 0.5f, -1.25f, -0.25f, 0.5f, -1.25f, 0, 0, -1.25f, 0, 0, -0.125f, -0.25f, 0.5f, -1.125f, -0.25f, 0.5f, -1.125f, 0, 0, -0.125f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-81.625f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 476, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, -0.125f, 0, 0.5f, -1.125f, 0, 0.5f, -1.125f, -0.25f, 0, -0.125f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-81.625f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 403, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.625f, -0.25f, -0.4375f, -0.625f, -0.25f, -0.4375f, -0.625f, 0, -0.5f, -0.625f, 0, 0.5f, 0, -0.25f, -0.4375f, 0, -0.25f, -0.4375f, 0, 0, 0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-89.5625f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 343, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, 0, -0.75f, -0.625f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.75f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 340, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, 0, -0.75f, -0.625f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-82.625f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 468, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, 0.5f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.25f, 0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-89.5625f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 315, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.75f, -0.625f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.75f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 312, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.75f, -0.625f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-82.625f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 114, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.8125f, 0, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-82.875f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 5, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.8125f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-82.875f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 97, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-82.875f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 402, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-82.875f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 365, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-84.75f, 5.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 304, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, -0.25f, -1, -0.8125f, -0.25f, -1, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-84.75f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 177, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0, -1, -0.8125f, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-84.75f, 5.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 318, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -1, -0.8125f, 0, -1, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-84.75f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 72, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, -0.3125f, 0.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-82.625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 428, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.3125f, 0.5f, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-82.625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 476, 275, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-86.3125f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 460, 275, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, -0.25f, 0.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-86.3125f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, true, true })
			.setRotationPoint(-86.5625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 309, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-87.5625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 306, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-86.5625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 303, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-87.5625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 402, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0.5f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-86.5625f, 6.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 435, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-87.5625f, 6.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 376, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0.5f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-86.5625f, 6.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 46, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, -0.5f, 0.5f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-87.5625f, 6.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 468, 275, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-86.5625f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 311, 275, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-86.5625f, 6.5f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 220, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-90.0625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 78, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-90.0625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 298, 275, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-92.0625f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 385, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, -0.25f, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, 0.5f, 0.75f, 0, 0.5f, 0.75f, -0.25f, 0.5f, 0)
			.setRotationPoint(-93.0625f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 196, 275, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(-92.0625f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 124, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-84.8125f, 3.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 195, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-81.8125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 167, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.0625f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 337, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-84.8125f, 3.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 409, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-81.8125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 303, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.0625f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 167, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-88.5625f, 4.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 53, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.125f, 0, 0, 0.625f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0.625f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-86.5625f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 390, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, 0, -0.375f, 0.25f, 0, 0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-87.5625f, 3.125f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 489, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-88.5625f, 4.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 507, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.125f, 0, -0.25f, 0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.625f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-86.5625f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 122, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, -0.375f, 0.25f, -0.25f, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-87.5625f, 3.125f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 300, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-58.8125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 297, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-59.8125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 211, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-58.8125f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 489, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-59.8125f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 253, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-60.8125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 46, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-61.8125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 20, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-60.8125f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 327, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-61.8125f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 409, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-60.3125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 360, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.5625f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 448, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-71.5625f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 227, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.5625f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 383, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-71.5625f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 20, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-72.5625f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 14, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-73.5625f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 383, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-72.5625f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 46, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-73.5625f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 104, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-72.0625f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 383, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-82.3125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 430, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-83.3125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 176, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-82.3125f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 20, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-83.3125f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 430, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-84.3125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 350, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.3125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 324, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-84.3125f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 176, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.3125f, 2.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 165, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-83.8125f, 1.875f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 324, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-58.8125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 488, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-59.8125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 324, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-58.8125f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 509, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-59.8125f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 165, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-60.8125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 509, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-61.8125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 214, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-60.8125f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 324, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-61.8125f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 214, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-60.3125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 98, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.5625f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 324, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-71.5625f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 214, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-70.5625f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 400, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-71.5625f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 291, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-72.5625f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 285, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-73.5625f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 277, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-72.5625f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 177, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-73.5625f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 115, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-72.0625f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 471, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-82.3125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 465, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-83.3125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 118, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-82.3125f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-83.3125f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 319, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-84.3125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 509, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.3125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 348, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-84.3125f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 282, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-85.3125f, 2.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 363, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-83.8125f, 1.875f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 293, 275, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-58.8125f, 2.875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 178, 275, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-60.8125f, 2.875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 62, 275, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-70.5625f, 2.875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 10, 275, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-72.5625f, 2.875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 5, 275, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-82.3125f, 2.875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 275, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-84.3125f, 2.875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 507, 274, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-58.8125f, 2.875f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 497, 274, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-60.8125f, 2.875f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 486, 274, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-70.5625f, 2.875f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 481, 274, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-72.5625f, 2.875f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 443, 274, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-82.3125f, 2.875f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 433, 274, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(4, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-84.3125f, 2.875f, 6).setRotationAngle(0, 0, 0)
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 319, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-72.0625f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 319, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-71.3125f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 271, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -1, -0.3125f, 0, -1, -0.3125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3125f, 0, 0, -0.3125f,
				new boolean[]{ true, true, false, true, true, true })
			.setRotationPoint(-71.8125f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 319, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-60.3125f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 319, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-59.5625f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 232, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -1, -0.3125f, 0, -1, -0.3125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3125f, 0, 0, -0.3125f,
				new boolean[]{ true, true, false, true, true, true })
			.setRotationPoint(-60.0625f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 509, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-83.8125f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 384, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-83.0625f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 385, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -1, -0.3125f, 0, -1, -0.3125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3125f, 0, 0, -0.3125f,
				new boolean[]{ true, true, false, true, true, true })
			.setRotationPoint(-83.5625f, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 226, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-83.8125f, 6.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 219, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-72.0625f, 6.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 408, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-60.3125f, 6.75f, 7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 200, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-83.8125f, 6.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 193, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-72.0625f, 6.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 292, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-60.3125f, 6.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 509, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-83.8125f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 509, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-83.0625f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 510, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.3125f, -0.5f, -1, -0.3125f, -0.5f, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, true })
			.setRotationPoint(-83.5625f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 273, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-72.0625f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 273, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-71.3125f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 510, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.3125f, -0.5f, -1, -0.3125f, -0.5f, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, true })
			.setRotationPoint(-71.8125f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 482, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-60.3125f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 482, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-59.5625f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 385, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.3125f, -0.5f, -1, -0.3125f, -0.5f, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, true })
			.setRotationPoint(-60.0625f, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 218, 285, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-84.25f, 5.5625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 18, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-84.25f, 6.625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 265, 279, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-84.25f, 7.6875f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 85, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-82.625f, 5.5625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 0, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-82.625f, 6.625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 458, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-82.625f, 7.6875f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 200, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-72.5f, 5.5625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-72.5f, 6.625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 178, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-72.5f, 7.6875f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 34, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-70.875f, 5.5625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 130, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-70.875f, 6.625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 130, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-70.875f, 7.6875f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 467, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-60.75f, 5.5625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 367, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-60.75f, 6.625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 130, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-60.75f, 7.6875f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-59.125f, 5.5625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-59.125f, 6.625f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, -0.75f, -0.75f, -0.875f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-59.125f, 7.6875f, -7.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 507, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, 0, -1, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-92.0625f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 135, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -1, -0.25f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, 0, 0, -0.25f,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-92.0625f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 479, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, -0.25f, 0, -0.875f, -0.5f, 0, -0.875f, 0, 0, -1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-92.0625f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 62, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -1, 0, 0, 0, -0.25f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-92.0625f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		RearTruck.add(new ModelRendererTurbo(RearTruck, 285, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-86.5625f, 5.5f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		groups.add(RearTruck);
	}

}
