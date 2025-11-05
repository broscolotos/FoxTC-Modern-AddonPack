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
public class ModelPRRT1RearBogie extends FVTMFormatBase {

	public ModelPRRT1RearBogie(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		addToCreators("MrRailroadRunner");
		//
		initGroup_Rear_Bogie();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Rear_Bogie(){
		TurboList Rear_Bogie = new TurboList("Rear_Bogie");
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 49, 153, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(43, 3, -6).setRotationAngle(0, 0, 0).setName("Box 13")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 153, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(43, 3, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 235, 150, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(53, 3, -6).setRotationAngle(0, 0, 0).setName("Box 15")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 270, 129, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(53, 3, 6).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 325, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, 0, 0, 0, 0, 0, 0.5f, -0.0625f, 0.25f, 0.5f, -0.0625f, 0.25f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(60, 6, -8).setRotationAngle(0, 0, 0).setName("Box 398")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 503, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.0625f, 0.5f, 0, -0.0625f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, 5, -8).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 496, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.0625f, -0.25f, -0.5f, -0.0625f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 477, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, 4, -8).setRotationAngle(0, 0, 0).setName("Box 401")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 397, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.5f, 0, -0.0625f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, 3, -8).setRotationAngle(0, 0, 0).setName("Box 402")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 392, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.0625f, -1, -0.375f, -0.0625f, -1, -0.375f, 0, 0, -0.375f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60, 2, -8).setRotationAngle(0, 0, 0).setName("Box 403")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 282, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, -1, -0.375f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42, 2, -8).setRotationAngle(0, 0, 0).setName("Box 405")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 78, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(42, 3, -8).setRotationAngle(0, 0, 0).setName("Box 406")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 82, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.5f, 0, 0, 0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.125f, 0, 0)
			.setRotationPoint(41, 4, -8).setRotationAngle(0, 0, 0).setName("Box 407")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 75, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, 0.75f, -0.75f, 0, 1.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(41, 4.75f, -8).setRotationAngle(0, 0, 0).setName("Box 408")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 57, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(41, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 409")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 187, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 3, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(43, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 43, 239, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(46.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 38, 239, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(56.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 347, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0.5f, -0.0625f, 0, 0.5f, -0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0)
			.setRotationPoint(63.25f, 6, -8).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 260, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(64.5f, 6, -6.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 255, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, -1, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(64.25f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 250, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.0625f, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.0625f)
			.setRotationPoint(63.25f, 6, 7).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 227, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0.5f, 0, 0.25f, 0.5f, 0)
			.setRotationPoint(64.5f, 6, 5.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 222, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -1, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(64.25f, 6, 6.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 316, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, -0.0625f, 0, 0.5f, -0.0625f)
			.setRotationPoint(60, 6, 7).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 50, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60, 5, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 39, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 400cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 32, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60, 4, 7).setRotationAngle(0, 0, 0).setName("Box 401cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 217, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60, 3, 7).setRotationAngle(0, 0, 0).setName("Box 402cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 194, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60, 2, 7).setRotationAngle(0, 0, 0).setName("Box 403cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 207, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.0625f, 0, 0.5f, -0.0625f)
			.setRotationPoint(39.5f, 6, 7).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 189, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, -1, -0.375f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(42, 2, 7).setRotationAngle(0, 0, 0).setName("Box 405cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 184, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.5f, 0, -0.0625f)
			.setRotationPoint(42, 3, 7).setRotationAngle(0, 0, 0).setName("Box 406cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 25, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.125f, 0, -0.0625f)
			.setRotationPoint(41, 4, 7).setRotationAngle(0, 0, 0).setName("Box 407cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 462, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.0625f, 0.75f, -0.75f, -0.0625f, 1.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 1.5f, 0, -0.0625f)
			.setRotationPoint(41, 4.75f, 7).setRotationAngle(0, 0, 0).setName("Box 408cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 224, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.0625f, 0.125f, -0.5f, -0.0625f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.75f, 0, -0.0625f)
			.setRotationPoint(41, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 409cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 488, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.0625f, 0.5f, -0.75f, -0.0625f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.5f, 0, -0.0625f)
			.setRotationPoint(40, 5, 7).setRotationAngle(0, 0, 0).setName("Box 410cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 486, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(64.5f, 6, -5.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 176, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, -1, 1, 0, -0.75f, 0, 0, -0.75f, -0.0625f, -0.25f, -1, -1, -0.25f, 0, 1, 0, 0, 0, 0, 0, -0.0625f, -0.25f, 0, -1)
			.setRotationPoint(36.5f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 410cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 432, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 1, -0.25f, 0, 0, -0.25f, 0, -0.0625f, 0, 0, -1, 0, 0.5f, 1, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.0625f, 0, 0.5f, -1)
			.setRotationPoint(36.75f, 6, 7).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 500, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(39.5f, 6, -8).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 430, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(40, 5, -8).setRotationAngle(0, 0, 0).setName("Box 410cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 281, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, -1, -1, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.25f, -1, 1, -0.25f, 0, -1, 0, 0, -0.0625f, 0, 0, 0, -0.25f, 0, 1)
			.setRotationPoint(36.5f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 410cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 170, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -1, -0.25f, 0, -0.0625f, -0.25f, 0, 0, 0, 0, 1, 0, 0.5f, -1, -0.25f, 0.5f, -0.0625f, -0.25f, 0.5f, 0, 0, 0.5f, 1)
			.setRotationPoint(36.75f, 6, -8).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 139, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -1.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1.75f, 0, 0.5f, -1.75f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 1.75f)
			.setRotationPoint(34.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 9, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 1.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1.75f, 0, 0.5f, 1.75f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, -1.75f)
			.setRotationPoint(34.25f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 217, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 2.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -2.25f, 0, 0.5f, 2.25f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, -2.25f)
			.setRotationPoint(31.75f, 6, 4.25f).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 123, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -2.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 2.25f, 0, 0.5f, -2.25f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 2.25f)
			.setRotationPoint(31.75f, 6, -5.25f).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 49, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -2, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 2, 0, 0.5f, -2, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0.5f, 2)
			.setRotationPoint(29, 6, -3).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 9, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 2, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -2, 0, 0.5f, 2, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0.5f, -2)
			.setRotationPoint(29, 6, 2).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 470, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(3).setSegments(8, 4).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, 0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(29, 5, 0).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 82, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 3, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(43, 2.5f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.5f, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 465, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(46.5f, 4.6875f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 460, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(46.5f, 4.625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 442, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(46.5f, 7.3125f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 437, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(46.5f, 7.375f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 426, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5f, 4.6875f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 369, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(45.5f, 4.625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 343, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(45.5f, 7.3125f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 338, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(45.5f, 7.375f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 351, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(45.5f, 5.3125f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 344, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(45.5f, 7.125f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 333, 230, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 0.0625f, 8, 1, 1, 0, null)
			.setRotationPoint(46.5f, 6.5f, 8).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 328, 230, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 8, 1, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(46.5f, 6.5f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 337, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(55.5f, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 88, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(56.5f, 4.6875f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 83, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(56.5f, 4.625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 78, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(56.5f, 7.3125f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 69, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(56.5f, 7.375f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 64, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, 4.6875f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 32, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(55.5f, 4.625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 396, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(55.5f, 7.3125f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 258, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(55.5f, 7.375f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 496, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(55.5f, 5.3125f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 477, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(55.5f, 7.125f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 59, 230, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 0.0625f, 8, 1, 1, 0, null)
			.setRotationPoint(56.5f, 6.5f, 8).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 15, 230, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 8, 1, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(56.5f, 6.5f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f)
			.setRotationPoint(45, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 344, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f)
			.setRotationPoint(55, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 411, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f)
			.setRotationPoint(43, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 404, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f)
			.setRotationPoint(48, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 397, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f)
			.setRotationPoint(53, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 14, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f)
			.setRotationPoint(58, 5.75f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 253, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, -0.0625f, 0, 0.375f, -0.0625f, 0, 0.375f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.0625f, 0, 0.375f, -0.0625f)
			.setRotationPoint(50, 6, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 10, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f)
			.setRotationPoint(51, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 5, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.25f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(50.25f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.0625f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.0625f, 0, 0.0625f, -0.0625f)
			.setRotationPoint(50.5f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 282, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.125f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.0625f, 0, -0.125f, -0.0625f)
			.setRotationPoint(50.75f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 161, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.0625f, 0, 0, 0.25f, 0, 0, 0.25f, -0.0625f, -0.75f, 0.0625f, -0.0625f)
			.setRotationPoint(51.75f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 49, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(51.5f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 44, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, -0.75f, -0.25f, -0.0625f)
			.setRotationPoint(51.25f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 210, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f)
			.setRotationPoint(50, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 205, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f)
			.setRotationPoint(50, 5.0625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 200, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(50, 4.625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 195, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f)
			.setRotationPoint(50, 4.5625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 190, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f)
			.setRotationPoint(42.25f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 185, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f)
			.setRotationPoint(42.25f, 5.0625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 176, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(42.25f, 4.625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 171, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(42.25f, 4.5625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 166, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, -0.0625f, -0.75f, 0.375f, -0.0625f, -0.75f, 0.25f, 0, 0, 0.375f, 0, 0, 0.375f, -0.0625f, -0.75f, 0.25f, -0.0625f)
			.setRotationPoint(52, 6, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 161, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f)
			.setRotationPoint(52, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 59, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f)
			.setRotationPoint(52, 5.0625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 49, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(52, 4.625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 414, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(52, 4.5625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 359, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f)
			.setRotationPoint(59.75f, 5, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 328, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f)
			.setRotationPoint(59.75f, 5.0625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 319, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(59.75f, 4.625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 86, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f)
			.setRotationPoint(59.75f, 4.5625f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 355, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(62, 5, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 175, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(61.75f, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 59, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(61.5f, 4, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 50, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(61, 3, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 32, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0.125f, 0, -1, 0.125f, 0, 0, 0, 0, -1, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(60, 2.375f, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 107, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(43, 2.375f, 7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 23, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(39.875f, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 211, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(40.5f, 4, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 206, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(41, 3, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 190, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0.125f, 0, 0, 0, 0, 0, 0, 0, -1, 0.125f, 0, 0.125f, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0.125f, -0.375f, 0)
			.setRotationPoint(42, 2.375f, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 185, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.125f, 0.015625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0.015625f, -0.109375f)
			.setRotationPoint(39.25f, 4.75f, 7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 7, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(43, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 504, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 39, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(53, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 32, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58, 5.75f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 136, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, -0.0625f, -0.75f, 0.375f, -0.0625f, -0.75f, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, -0.0625f, -0.75f, 0.25f, -0.0625f, -0.75f, 0.25f, 0, 0, 0.375f, 0)
			.setRotationPoint(50, 6, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 45, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(51, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 418, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.0625f, -0.75f, 0.0625f, -0.0625f, -0.75f, 0.0625f, 0, 0, 0.25f, 0)
			.setRotationPoint(50.25f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 8, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.0625f, -0.75f, -0.125f, -0.0625f, -0.75f, -0.125f, 0, 0, 0.0625f, 0)
			.setRotationPoint(50.5f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, -0.125f, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f, 0, 0, -0.125f, 0)
			.setRotationPoint(50.75f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 328, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(51.75f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 319, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.0625f, 0, 0.0625f, -0.0625f, 0, 0.0625f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(51.5f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 131, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(51.25f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 25, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.5f, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 111, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(50, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 106, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(50, 5.0625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 101, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(50, 4.625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 96, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(50, 4.5625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 91, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(42.25f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 86, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(42.25f, 5.0625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 28, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(42.25f, 4.625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 464, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(42.25f, 4.5625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 459, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.375f, -0.0625f, 0, 0.375f, -0.0625f, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.25f, -0.0625f, 0, 0.375f, -0.0625f, 0, 0.375f, 0, -0.75f, 0.25f, 0)
			.setRotationPoint(52, 6, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 454, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(52, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 449, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(52, 5.0625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 444, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(52, 4.625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 431, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(52, 4.5625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 414, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(59.75f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 395, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(59.75f, 5.0625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 390, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(59.75f, 4.625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 385, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(59.75f, 4.5625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 293, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(46.5f, 4.6875f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 45, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(46.5f, 4.625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 4, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(46.5f, 7.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 436, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(46.5f, 7.375f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 426, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5f, 4.6875f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 421, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(45.5f, 4.625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 136, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(45.5f, 7.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 32, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(45.5f, 7.375f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 384, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(45.5f, 5.3125f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 178, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(45.5f, 7.125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 59, 218, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 0.0625f, 8, 1, 1, 0, null)
			.setRotationPoint(46.5f, 6.5f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 50, 218, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 8, 0.9375f, 1, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(46.5f, 6.5f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 382, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(55.5f, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 9, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(56.5f, 4.6875f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 131, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(56.5f, 4.625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 276, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(56.5f, 7.3125f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 249, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(56.5f, 7.375f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 45, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, 4.6875f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 28, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(55.5f, 4.625f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 5, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(55.5f, 7.3125f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 492, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(55.5f, 7.375f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 185, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(55.5f, 5.3125f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 84, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(55.5f, 7.125f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 216, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 0.0625f, 8, 1, 1, 0, null)
			.setRotationPoint(56.5f, 6.5f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 432, 215, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 8, 0.9375f, 1, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(56.5f, 6.5f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 373, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(55, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 427, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(62, 5, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 422, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(61.75f, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 507, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(61.5f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 360, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(61, 3, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 355, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0.125f, 0, -1, 0.125f, 0, 0, 0, 0, -1, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(60, 2.375f, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 475, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(43, 2.375f, -8).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 156, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(39.875f, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 151, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(40.5f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 146, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(41, 3, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 141, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0.125f, 0, 0, 0, 0, 0, 0, 0, -1, 0.125f, 0, 0.125f, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0.125f, -0.375f, 0)
			.setRotationPoint(42, 2.375f, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 80, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.125f, 0.015625f, -0.109375f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0.015625f, 0)
			.setRotationPoint(39.25f, 4.75f, -8).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 420, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(39.5f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 61, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(51, 4, -7).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		groups.add(Rear_Bogie);
	}

}
