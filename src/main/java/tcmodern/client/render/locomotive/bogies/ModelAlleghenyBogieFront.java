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
public class ModelAlleghenyBogieFront extends FVTMFormatBase {

	public ModelAlleghenyBogieFront(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		addToCreators("Riggs64");
		//
		initGroup_FrontTruck();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_FrontTruck(){
		TurboList FrontTruck = new TurboList("FrontTruck");
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 95, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(45.9375f, 5.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 297, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, -4, 0, -1, 0.5f, 0, -1, -0.5f, 0, 0, 4, 0, 0, -4, 0, 1, 0.5f, 0, 1, -0.5f, 0, 0, 4,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(46.9375f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 297, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 4, 0, -1, -0.5f, 0, -1, 0.5f, 0, 0, -4, 0, 0, 4, 0, 1, -0.5f, 0, 1, 0.5f, 0, 0, -4,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(46.9375f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 0, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(44.9375f, 5.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 436, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(59.9375f, 7.5f, -6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 436, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(59.9375f, 7.5f, 5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 158, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(59.9375f, 7.5f, -5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 403, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(69.9375f, 7.5f, -5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 205, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(61.9375f, 3, -6.01f).setRotationAngle(0, 0, 0).setName("Box 637cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 263, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(61.9375f, 3, 6.01f).setRotationAngle(0, 0, 0).setName("Box 637cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 416, 294, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(65.4375f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 507, 279, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(65.4375f, 6.5f, -8).setRotationAngle(0, 0, 0)
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 497, 279, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.25f, 1.375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(65.4375f, 6.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 486, 279, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(65.4375f, 6.5f, 7.375f).setRotationAngle(0, 0, 0)
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 481, 279, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(65.4375f, 6.5f, 7).setRotationAngle(0, 0, 0)
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 476, 279, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(59.9375f, 3.5f, 5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 433, 279, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(69.9375f, 3.5f, 5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 298, 279, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(59.9375f, 3.5f, -6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 428, 278, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(69.9375f, 3.5f, -6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 305, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(60.9375f, 2.5f, 5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 195, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(60.9375f, 2.5f, -6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 168, 278, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(61.9375f, 3.5f, -6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 163, 278, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(67.9375f, 3.5f, -6).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 118, 278, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(61.9375f, 3.5f, 5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 67, 278, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(67.9375f, 3.5f, 5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 113, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(62.4375f, 3, -7.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(62.4375f, 3, 6.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 502, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, -0.5f, 0, 1, -0.5f, 0, 1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(61.4375f, 3.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 423, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(68.4375f, 3.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 83, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, -0.5f, 0, 1, -0.5f, 0, 1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(61.4375f, 3.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 326, 276, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(68.4375f, 3.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 479, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, -1.125f, 0, -0.125f, -1.125f, 0, -0.125f, -1.125f, 0, -0.125f, -1.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(61.9375f, 5, -7.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 497, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, -1.125f, 0, -0.125f, -1.125f, 0, -0.125f, -1.125f, 0, -0.125f, -1.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(61.9375f, 5, 6.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 394, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(68.4375f, 7.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 142, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(68.4375f, 7.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 26, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(61.4375f, 7.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 11, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0,
				new boolean[]{ true, true, true, false, false, false })
			.setRotationPoint(61.4375f, 7.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 460, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, -1.5f, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, -1.5f, 0, 1,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(59.9375f, 7.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 178, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, 1, 0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, 1, 0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(59.9375f, 7.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 71, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, 1, 0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, 1, 0.5f, 0, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(69.9375f, 7.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 64, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -1.5f, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, -1.5f, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(69.9375f, 7.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 26, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, -4, 0, 3, 0.5f, 0, 3, -0.5f, 0, 0, 4, 0, 0, -4, 0, -3, 0.5f, 0, -3, -0.5f, 0, 0, 4,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(46.9375f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 480, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, 4, 0, 3, -0.5f, 0, 3, 0.5f, 0, 0, -4, 0, 0, 4, 0, -3, -0.5f, 0, -3, 0.5f, 0, 0, -4,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(46.9375f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 641cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 232, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 0, 0, 0, -1, -4, 0, 2, 0.5f, 0, 2, -0.5f, 0, -1, 4, 0, 0, -4, -1, 1, 0.5f, -1, 1, -0.5f, 0, 0, 4,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(46.9375f, 5.5f, -5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		FrontTruck.add(new ModelRendererTurbo(FrontTruck, 114, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 0, 0, 0, -1, 4, 0, 2, -0.5f, 0, 2, 0.5f, 0, -1, -4, 0, 0, 4, -1, 1, -0.5f, -1, 1, 0.5f, 0, 0, -4,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(46.9375f, 5.5f, 5).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		groups.add(FrontTruck);
	}

}
