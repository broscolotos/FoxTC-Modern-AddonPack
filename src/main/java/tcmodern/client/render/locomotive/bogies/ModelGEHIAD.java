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
public class ModelGEHIAD extends FVTMFormatBase {

	public ModelGEHIAD(){
		super();
		textureX = 256;
		textureY = 128;
		addToCreators("broscolotos");
		//
		initGroup_Truck10();
		initGroup_Truck11();
		initGroup_clipboard();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true);
		}
	}

	private final void initGroup_Truck10(){
		TurboList Truck1 = new TurboList("Truck1");
		Truck1.add(new ModelRendererTurbo(Truck1, 25, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-16.3125f, 7.5f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 207, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-16.4375f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 186, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, -0.5625f, -1.0625f, 0, -0.5625f, -1.0625f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-15.4375f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 176, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, -0.625f, -1.25f, 0, -0.625f, -1.25f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-15, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 139, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.0625f, -0.25f, 0, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-14.75f, 6.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 132, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-14.5f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 5, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-14.3125f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 195, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0)
			.setRotationPoint(-13.9375f, 4.9375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 155, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-9.4375f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 66, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5625f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.5625f, 0.1875f, 0.0625f, -0.5625f, -1.0625f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, -0.5625f, -1.0625f, 0.0625f)
			.setRotationPoint(-10.4375f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 242, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.75f, 0.25f, 0.0625f, -0.625f, -1.25f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, -0.625f, -1.25f, 0.0625f)
			.setRotationPoint(-10.875f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 228, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(-11.125f, 6.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 127, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(-11.375f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 120, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(-11.5625f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 138, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0)
			.setRotationPoint(-14.9375f, 7.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 123, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0)
			.setRotationPoint(-14.9375f, 6.9375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 230, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-1.8125f, 7.5f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 113, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-1.9375f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 106, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, -0.5625f, -1.0625f, 0, -0.5625f, -1.0625f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-0.9375f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 59, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, -0.625f, -1.25f, 0, -0.625f, -1.25f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-0.5f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 52, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.0625f, -0.25f, 0, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-0.25f, 6.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 45, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(0, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 38, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(0.1875f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 89, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0)
			.setRotationPoint(0.5625f, 4.9375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 31, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(5.0625f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 24, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5625f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.5625f, 0.1875f, 0.0625f, -0.5625f, -1.0625f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, -0.5625f, -1.0625f, 0.0625f)
			.setRotationPoint(4.0625f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.75f, 0.25f, 0.0625f, -0.625f, -1.25f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, -0.625f, -1.25f, 0.0625f)
			.setRotationPoint(3.625f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 202, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(3.375f, 6.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 195, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(3.125f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 171, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(2.9375f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 108, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0)
			.setRotationPoint(-0.4375f, 7.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 17, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0)
			.setRotationPoint(-0.4375f, 6.9375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 209, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(12.6875f, 7.5f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 150, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(12.5625f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 99, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, -0.5625f, -1.0625f, 0, -0.5625f, -1.0625f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(13.5625f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 92, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, -0.625f, -1.25f, 0, -0.625f, -1.25f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(14, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 85, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.0625f, -0.25f, 0, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(14.25f, 6.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 78, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(14.5f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 71, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(14.6875f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 78, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0)
			.setRotationPoint(15.0625f, 4.9375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 17, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(19.5625f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 237, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5625f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.5625f, 0.1875f, 0.0625f, -0.5625f, -1.0625f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, -0.5625f, -1.0625f, 0.0625f)
			.setRotationPoint(18.5625f, 7.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 223, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.75f, 0.25f, 0.0625f, -0.625f, -1.25f, 0, 0, -0.875f, 0, 0, -0.875f, 0.0625f, -0.625f, -1.25f, 0.0625f)
			.setRotationPoint(18.125f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 216, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(17.875f, 6.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 209, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(17.625f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 188, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f)
			.setRotationPoint(17.4375f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 95, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0)
			.setRotationPoint(14.0625f, 7.3125f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 80, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0)
			.setRotationPoint(14.0625f, 6.9375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 33, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0)
			.setRotationPoint(-13.9375f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 143, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-16.5625f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 124, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -1.6875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.6875f, -0.25f, 0)
			.setRotationPoint(-16.5625f, 5.375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 181, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.5625f, -1.0625f, 0, -0.5625f, -1.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-14.5625f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 207, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0)
			.setRotationPoint(-16.625f, 2, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 164, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -1.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5625f, -1.0625f, 0)
			.setRotationPoint(-11.3125f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 22, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-10.3125f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 157, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-10.3125f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 27, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-10.3125f, 3.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 66, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.5625f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 188, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 1.0625f, -0.0625f, 0, 1.0625f, -0.0625f, 0, 1.0625f, -0.0625f, 0, 1.0625f, -0.0625f, 0)
			.setRotationPoint(-1.9375f, 2.25f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 71, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0)
			.setRotationPoint(-1.9375f, 2.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 10, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.5625f, -0.6875f, 0, -0.5625f, -0.6875f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-0.0625f, 3.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 249, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.6875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.5625f, -0.6875f, 0)
			.setRotationPoint(3.1875f, 3.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 242, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(4.1875f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 232, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(-1.0625f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 232, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(0.5625f, 3.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 67, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.1875f, 3.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 143, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.9375f, 0, -0.5625f, -0.0625f, 0, -0.5625f, -0.0625f, 0, 0, 0.9375f, 0)
			.setRotationPoint(14.4375f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 136, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.0625f, 0, 0, 0.9375f, 0, 0, 0.9375f, 0, -0.5625f, -0.0625f, 0)
			.setRotationPoint(17.6875f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 129, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(18.6875f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 122, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(13.4375f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 148, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0)
			.setRotationPoint(15.0625f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 115, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -1, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -1, -0.6875f, 0)
			.setRotationPoint(17.25f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 180, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0)
			.setRotationPoint(13.75f, 2, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 69, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.25f, -0.375f, 0)
			.setRotationPoint(11.4375f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 108, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(10.6875f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 71, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 1.5f, -0.125f, 0, 1.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(18.6875f, 2.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 221, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(18.6875f, 3.4375f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 9, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0)
			.setRotationPoint(-16.5625f, 5.25f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 145, 69, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(-9.375f, 5.375f, 8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 36, 69, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 7.0625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 31, 69, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 6.6875f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 69, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 6.3125f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 230, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 5.9375f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 225, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 5.5625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 220, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(-15.5f, 5.375f, 8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 155, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 7.0625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 140, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 6.6875f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 135, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 6.3125f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 130, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 5.9375f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 116, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 5.5625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 101, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, -0.5f, 0, 0.1875f, -0.5f, 0, 0.1875f, -0.5f, -0.5f, 0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-13, 2, 9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 76, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, -0.125f, -0.3125f, -0.5f, -0.125f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(-12.5f, 2, 9.375f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 215, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, -0.125f, -0.3125f, -0.5f, -0.125f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(-13.5f, 2, 9.375f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 202, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f)
			.setRotationPoint(-13, 2, 9.875f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 197, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-12.5f, 6, 9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 192, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f)
			.setRotationPoint(-12.5f, 5.75f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 187, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f)
			.setRotationPoint(-13.5f, 5.75f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 170, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f)
			.setRotationPoint(-13, 5.75f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 111, 67, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f)
			.setRotationPoint(-13, 2.25f, 10.125f).setRotationAngle(-12.1875f, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 96, 67, textureX, textureY)
			.addShapeBox(0, -0.125f, -0.5f, 1, 4, 1, 0, -0.375f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f)
			.setRotationPoint(-13, 2.25f, 10.125f).setRotationAngle(-12.1875f, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 71, 67, textureX, textureY)
			.addShapeBox(0, 3.3125f, -0.5f, 1, 1, 1, 0, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f)
			.setRotationPoint(-13, 2.25f, 10.125f).setRotationAngle(-12.1875f, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 66, 66, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.28125f, -0.25f, -0.25f, -0.28125f, -0.25f, -0.25f, -0.28125f, -0.25f, -0.25f, -0.28125f, -0.25f)
			.setRotationPoint(-13, 2.25f, 10.125f).setRotationAngle(-12.1875f, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 61, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(5.125f, 5.375f, 8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 56, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 7.0625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 46, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 6.6875f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 26, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 6.3125f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 15, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 5.9375f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 10, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 5.5625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 5, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(-1, 5.375f, 8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 248, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 7.0625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 210, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 6.6875f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 182, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 6.3125f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 177, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 5.9375f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 161, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 5.5625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 106, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(19.625f, 5.375f, 8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 91, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 7.0625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 86, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 6.6875f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 81, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 6.3125f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 41, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 5.9375f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 150, 65, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 5.5625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 125, 65, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(13.5f, 5.375f, 8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 36, 65, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 7.0625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 31, 65, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 6.6875f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 65, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 6.3125f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 225, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 5.9375f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 220, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 5.5625f, 8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 215, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, -0.5f, 0, 0.1875f, -0.5f, 0, 0.1875f, -0.5f, -0.5f, 0.1875f, -0.5f, -0.5f)
			.setRotationPoint(16, 2, 9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 205, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f)
			.setRotationPoint(16.5f, 5.75f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 194, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f)
			.setRotationPoint(15.5f, 5.75f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 189, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f)
			.setRotationPoint(16, 5.75f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 166, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(2, 6, 9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 156, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(16.5f, 6, 9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 145, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 3, new Vec3f(-0.125, 0.0, 0.0))
			.setRotationPoint(-15.625f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 140, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-13.75f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 135, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-15.6875f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 130, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.5625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-15.75f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 120, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.5625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-13.6875f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 115, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.3125f, 3, new Vec3f(-0.1875, 0.0, 0.0))
			.setRotationPoint(-13.625f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 101, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.25f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-12.8125f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 96, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, -0.125f, -0.3125f, -0.5f, -0.125f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(16.5f, 2, 9.375f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 70, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, -0.125f, -0.3125f, -0.5f, -0.125f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(15.5f, 2, 9.375f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 61, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f)
			.setRotationPoint(16, 2, 9.875f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 56, 64, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f)
			.setRotationPoint(16, 2.25f, 10.125f).setRotationAngle(-12.1875f, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 51, 64, textureX, textureY)
			.addShapeBox(0, -0.125f, -0.5f, 1, 4, 1, 0, -0.375f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f)
			.setRotationPoint(16, 2.25f, 10.125f).setRotationAngle(-12.1875f, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 26, 64, textureX, textureY)
			.addShapeBox(0, 3.3125f, -0.5f, 1, 1, 1, 0, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f)
			.setRotationPoint(16, 2.25f, 10.125f).setRotationAngle(-12.1875f, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 230, 63, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.28125f, -0.25f, -0.25f, -0.28125f, -0.25f, -0.25f, -0.28125f, -0.25f, -0.25f, -0.28125f, -0.25f)
			.setRotationPoint(16, 2.25f, 10.125f).setRotationAngle(-12.1875f, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 200, 63, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(-12.75f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 172, 63, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-12.1875f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 246, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.1875f, -0.1875f, -0.1875f, 0.3125f, -0.1875f, -0.1875f, 0.3125f, -0.1875f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.1875f, -0.6875f, -0.1875f, 0.3125f, -0.6875f, -0.1875f, 0.3125f, -0.6875f, -0.6875f, -0.1875f, -0.6875f, -0.6875f)
			.setRotationPoint(-12.3125f, 2.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 110, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f)
			.setRotationPoint(-9.3125f, 2.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 91, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.625f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(-8.875f, 2.625f, 8.6875f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 179, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.6875f, 0.3125f, -0.1875f, -0.6875f, 0.3125f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.6875f, 0.3125f, -0.6875f, -0.6875f)
			.setRotationPoint(13.3125f, 2.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 86, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.125f, -0.125f, -0.3125f, -0.125f, -0.125f, -0.3125f, -0.125f, -0.625f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.625f, -0.125f, -0.3125f, -0.625f, -0.125f, -0.3125f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f)
			.setRotationPoint(12.3125f, 2.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 81, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.625f, -0.1875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.625f, -0.6875f, 0)
			.setRotationPoint(11.875f, 2.625f, 8.6875f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 76, 63, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 3, new Vec3f(-0.125, 0.0, 0.0))
			.setRotationPoint(17.75f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 46, 63, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(17.6875f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 15, 63, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.5625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(19.625f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 10, 63, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.3125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(19.6875f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 5, 63, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(17.625f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 248, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.5625f, 3, new Vec3f(-0.1875, 0.0, 0.0))
			.setRotationPoint(16.8125f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 210, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.3125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(16.75f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 180, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(16.1875f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 161, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(16.125f, 2.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 151, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.1875f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.6875f, -0.1875f, -0.6875f, -0.6875f)
			.setRotationPoint(-16.25f, 2.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 125, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.6875f, -0.375f, -0.1875f, -0.6875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.6875f)
			.setRotationPoint(-16.5625f, 2.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 66, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.6875f, -0.375f, -0.1875f, -0.6875f, -0.375f, -0.125f, -0.1875f, -0.5f, -0.125f, -0.1875f, -0.5f, -0.125f, -0.6875f, -0.375f, -0.125f, -0.6875f)
			.setRotationPoint(-16.5625f, 1.9375f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, -0.1875f, -0.4375f, -0.375f, -0.1875f, -0.4375f, -0.375f, -0.6875f, -0.4375f, -0.375f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f)
			.setRotationPoint(-16.5625f, 1.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 226, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f)
			.setRotationPoint(-16.5f, 1.5f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 215, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.1875f, -0.5f, -0.3125f, -0.1875f, -0.5f, -0.3125f, -0.6875f, -0.375f, -0.375f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5625f, -0.1875f, -0.5f, -0.5625f, -0.6875f, -0.375f, -0.5f, -0.6875f)
			.setRotationPoint(-16.375f, 1.5f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 208, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.6875f, -0.375f, -0.375f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f)
			.setRotationPoint(-16.25f, 1.4375f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 101, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, -0.375f, -0.1875f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, -1.125f, -0.375f, -0.375f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, -1.125f, -0.375f, -0.5f, -0.6875f)
			.setRotationPoint(-13.125f, 1.4375f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 167, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.375f, -0.6875f, -0.0625f, -0.375f, -0.6875f, -0.0625f, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.6875f, -0.0625f, -0.5f, -0.6875f)
			.setRotationPoint(-11.6875f, 1.4375f, 8.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 49, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 1, 0, 0.5f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.375f, -0.6875f, 0.5f, -0.375f, -0.6875f, 0.5f, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.6875f, 0.5f, -0.5f, -0.6875f)
			.setRotationPoint(-9.1875f, 2, 8.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 156, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.1875f, 0, -0.9375f, -0.1875f, 0, -0.9375f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.5f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(-10.6875f, 1.4375f, 8.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 146, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.6875f, -0.5f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.6875f)
			.setRotationPoint(19.25f, 2.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 120, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.6875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.6875f)
			.setRotationPoint(19.5625f, 2.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 115, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.6875f, -0.5f, -0.125f, -0.1875f, -0.375f, -0.125f, -0.1875f, -0.375f, -0.125f, -0.6875f, -0.5f, -0.125f, -0.6875f)
			.setRotationPoint(19.5625f, 1.9375f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 106, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, -0.1875f, -0.4375f, -0.375f, -0.1875f, -0.4375f, -0.375f, -0.6875f, -0.4375f, -0.375f, -0.6875f, -0.5f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.6875f)
			.setRotationPoint(19.5625f, 1.625f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 101, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.6875f)
			.setRotationPoint(19.5f, 1.5f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 61, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.3125f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.6875f, -0.5f, -0.3125f, -0.6875f, -0.5f, -0.5625f, -0.1875f, -0.375f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5625f, -0.6875f)
			.setRotationPoint(19.375f, 1.5f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 197, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.6875f)
			.setRotationPoint(16.25f, 1.4375f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 94, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.375f, 0.25f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.6875f, -0.5f, -0.375f, -1.125f, -0.5f, -0.5f, 0.25f, -0.375f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5f, -1.125f)
			.setRotationPoint(15.125f, 1.4375f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 56, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.5f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.1875f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f)
			.setRotationPoint(14.8125f, 1.4375f, 8.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 51, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.9375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.375f, -0.6875f, 0, -0.9375f, -0.6875f, 0, 0.0625f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.6875f, 0, 0.0625f, -0.6875f)
			.setRotationPoint(13.8125f, 1.4375f, 8.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 50, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-16.3125f, 7.5f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 59, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-16.4375f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 52, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, -0.5625f, 0.1875f, 0.0625f, -0.5625f, 0.1875f, 0, 0, 0, 0, 0, -0.875f, 0.0625f, -0.5625f, -1.0625f, 0.0625f, -0.5625f, -1.0625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-15.4375f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 45, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, -0.75f, 0.25f, 0.0625f, -0.75f, 0.25f, 0, 0, 0, 0, 0, -0.875f, 0.0625f, -0.625f, -1.25f, 0.0625f, -0.625f, -1.25f, 0, 0, -0.875f, 0)
			.setRotationPoint(-15, 7.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 38, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-14.75f, 6.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 31, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0, -0.1875f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-14.5f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 24, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-14.3125f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 186, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0)
			.setRotationPoint(-13.9375f, 4.9375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-9.4375f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 204, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5625f, 0.1875f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, -0.5625f, 0.1875f, 0, -0.5625f, -1.0625f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, -0.5625f, -1.0625f, 0)
			.setRotationPoint(-10.4375f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 197, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, -0.75f, 0.25f, 0, -0.625f, -1.25f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, -0.625f, -1.25f, 0)
			.setRotationPoint(-10.875f, 7.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 176, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(-11.125f, 6.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 169, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(-11.375f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 152, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(-11.5625f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 30, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0)
			.setRotationPoint(-14.9375f, 7.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 17, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0)
			.setRotationPoint(-14.9375f, 6.9375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 73, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-1.8125f, 7.5f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 87, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-1.9375f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 80, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, -0.5625f, 0.1875f, 0.0625f, -0.5625f, 0.1875f, 0, 0, 0, 0, 0, -0.875f, 0.0625f, -0.5625f, -1.0625f, 0.0625f, -0.5625f, -1.0625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-0.9375f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 73, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, -0.75f, 0.25f, 0.0625f, -0.75f, 0.25f, 0, 0, 0, 0, 0, -0.875f, 0.0625f, -0.625f, -1.25f, 0.0625f, -0.625f, -1.25f, 0, 0, -0.875f, 0)
			.setRotationPoint(-0.5f, 7.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 17, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.25f, 6.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 227, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0, -0.1875f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(0, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 220, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(0.1875f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 175, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0)
			.setRotationPoint(0.5625f, 4.9375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 190, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(5.0625f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 5, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5625f, 0.1875f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, -0.5625f, 0.1875f, 0, -0.5625f, -1.0625f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, -0.5625f, -1.0625f, 0)
			.setRotationPoint(4.0625f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 183, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, -0.75f, 0.25f, 0, -0.625f, -1.25f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, -0.625f, -1.25f, 0)
			.setRotationPoint(3.625f, 7.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 68, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(3.375f, 6.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 147, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(3.125f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 140, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(2.9375f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 207, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0)
			.setRotationPoint(-0.4375f, 7.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 180, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0)
			.setRotationPoint(-0.4375f, 6.9375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 52, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(12.6875f, 7.5f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 133, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(12.5625f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 126, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, -0.5625f, 0.1875f, 0.0625f, -0.5625f, 0.1875f, 0, 0, 0, 0, 0, -0.875f, 0.0625f, -0.5625f, -1.0625f, 0.0625f, -0.5625f, -1.0625f, 0, 0, -0.875f, 0)
			.setRotationPoint(13.5625f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 119, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, -0.75f, 0.25f, 0.0625f, -0.75f, 0.25f, 0, 0, 0, 0, 0, -0.875f, 0.0625f, -0.625f, -1.25f, 0.0625f, -0.625f, -1.25f, 0, 0, -0.875f, 0)
			.setRotationPoint(14, 7.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 112, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(14.25f, 6.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 105, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0, -0.1875f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(14.5f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 98, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, 0, -0.375f, 0.0625f, -0.875f, -0.375f, 0.0625f, -0.875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(14.6875f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 137, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0)
			.setRotationPoint(15.0625f, 4.9375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 61, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(19.5625f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 54, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5625f, 0.1875f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, -0.5625f, 0.1875f, 0, -0.5625f, -1.0625f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, -0.5625f, -1.0625f, 0)
			.setRotationPoint(18.5625f, 7.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 47, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, -0.75f, 0.25f, 0, -0.625f, -1.25f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, -0.625f, -1.25f, 0)
			.setRotationPoint(18.125f, 7.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 40, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(17.875f, 6.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 33, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(17.625f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 26, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.875f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0, -0.875f, -0.375f, 0)
			.setRotationPoint(17.4375f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 151, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0)
			.setRotationPoint(14.0625f, 7.3125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 122, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0)
			.setRotationPoint(14.0625f, 6.9375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 56, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0)
			.setRotationPoint(14.5625f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 126, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0)
			.setRotationPoint(-13.9375f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 224, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-16.5625f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 183, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -1.6875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.6875f, -0.25f, 0)
			.setRotationPoint(-16.5625f, 5.375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0)
			.setRotationPoint(-15.5625f, 6.125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 237, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.5625f, -1.0625f, 0, -0.5625f, -1.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-14.5625f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 151, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0)
			.setRotationPoint(-16.625f, 2, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 213, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -1.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5625f, -1.0625f, 0)
			.setRotationPoint(-11.3125f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 115, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-10.3125f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 206, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-10.3125f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 199, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0)
			.setRotationPoint(-10.3125f, 6.125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 42, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-10.3125f, 3.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 178, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.5625f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 234, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 1.0625f, -0.0625f, 0, 1.0625f, -0.0625f, 0, 1.0625f, -0.0625f, 0, 1.0625f, -0.0625f, 0)
			.setRotationPoint(-1.9375f, 2.25f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 234, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0)
			.setRotationPoint(-1.9375f, 2.0625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 171, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0)
			.setRotationPoint(-1.0625f, 6.125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 164, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.5625f, -0.6875f, 0, -0.5625f, -0.6875f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-0.0625f, 3.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 157, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.6875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.5625f, -0.6875f, 0)
			.setRotationPoint(3.1875f, 3.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 91, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0)
			.setRotationPoint(4.1875f, 6.125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 84, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(4.1875f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 77, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(-1.0625f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 104, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(0.5625f, 3.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 17, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.1875f, 3.1875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 19, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0)
			.setRotationPoint(13.4375f, 6.125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 12, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.9375f, 0, -0.5625f, -0.0625f, 0, -0.5625f, -0.0625f, 0, 0, 0.9375f, 0)
			.setRotationPoint(14.4375f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 245, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.0625f, 0, 0, 0.9375f, 0, 0, 0.9375f, 0, -0.5625f, -0.0625f, 0)
			.setRotationPoint(17.6875f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 230, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0)
			.setRotationPoint(18.6875f, 6.125f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 223, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(18.6875f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 192, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.6875f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(13.4375f, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 13, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0)
			.setRotationPoint(15.0625f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 122, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -1.0625f, 0, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0)
			.setRotationPoint(13.75f, 2, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 245, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.25f, -0.375f, 0)
			.setRotationPoint(11.4375f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 185, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(10.6875f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 174, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 1.5f, -0.125f, 0, 1.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(18.6875f, 2.5625f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 43, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(18.6875f, 3.4375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 165, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0)
			.setRotationPoint(-16.5625f, 5.25f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 41, 61, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(-9.375f, 5.375f, -8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 36, 61, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 7.0625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 31, 61, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 6.6875f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 205, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 6.3125f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 195, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 5.9375f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 190, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-9.375f, 5.5625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 185, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(-15.5f, 5.375f, -8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 141, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 7.0625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 136, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 6.6875f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 131, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 6.3125f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 96, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 5.9375f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 26, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-15.5f, 5.5625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 231, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-12.5f, 6, -9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 221, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(5.125f, 5.375f, -8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 175, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 7.0625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 91, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 6.6875f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 86, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 6.3125f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 81, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 5.9375f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 76, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(5.125f, 5.5625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 71, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(-1, 5.375f, -8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 15, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 7.0625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 10, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 6.6875f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 5, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 6.3125f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 248, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 5.9375f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 211, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-1, 5.5625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 200, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(19.625f, 5.375f, -8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 180, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 7.0625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 163, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 6.6875f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 152, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 6.3125f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 126, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 5.9375f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 66, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(19.625f, 5.5625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 46, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(13.5f, 5.375f, -8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 7.0625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 226, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 6.6875f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 170, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 6.3125f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 158, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 5.9375f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 147, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(13.5f, 5.5625f, -8).setRotationAngle(0, 0, 5)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 121, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(2, 6, -9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 116, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(16.5f, 6, -9.0625f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 111, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 3, new Vec3f(-0.125, 0.0, 0.0))
			.setRotationPoint(-15.625f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 106, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-13.75f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 101, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-15.6875f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 61, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.5625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-15.75f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 56, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.5625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-13.6875f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 51, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.3125f, 3, new Vec3f(-0.1875, 0.0, 0.0))
			.setRotationPoint(-13.625f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 41, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.25f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-12.8125f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 36, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(-12.75f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 31, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-12.1875f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 150, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.1875f, -0.1875f, -0.6875f, 0.3125f, -0.1875f, -0.6875f, 0.3125f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.6875f, -0.6875f, 0.3125f, -0.6875f, -0.6875f, 0.3125f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.1875f)
			.setRotationPoint(-12.3125f, 2.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 26, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.125f, -0.625f, -0.1875f, -0.125f, -0.625f, -0.1875f, -0.125f, -0.125f, -0.3125f, -0.125f, -0.125f, -0.3125f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.125f, -0.3125f, -0.625f, -0.125f)
			.setRotationPoint(-9.3125f, 2.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 232, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.1875f, 0, -0.625f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(-8.875f, 2.625f, -9.6875f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 17, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.1875f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.1875f, -0.1875f, -0.1875f, 0.3125f, -0.1875f, -0.1875f, 0.3125f, -0.6875f, -0.6875f, -0.1875f, -0.6875f, -0.6875f, -0.1875f, -0.6875f, -0.1875f, 0.3125f, -0.6875f, -0.1875f)
			.setRotationPoint(13.3125f, 2.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 221, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.125f, -0.1875f, -0.125f, -0.125f, -0.1875f, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.3125f, -0.625f, -0.125f, -0.1875f, -0.625f, -0.125f)
			.setRotationPoint(12.3125f, 2.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 175, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.625f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(11.875f, 2.625f, -9.6875f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 216, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 3, new Vec3f(-0.125, 0.0, 0.0))
			.setRotationPoint(17.75f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 206, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(17.6875f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 195, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.5625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(19.625f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 190, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.3125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(19.6875f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 185, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(17.625f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 142, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.5625f, 3, new Vec3f(-0.1875, 0.0, 0.0))
			.setRotationPoint(16.8125f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 137, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.3125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(16.75f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 132, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(16.1875f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 96, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(16.125f, 2.875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 91, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.1875f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.1875f)
			.setRotationPoint(-16.25f, 2.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 86, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.5f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f)
			.setRotationPoint(-16.5625f, 2.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 81, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.6875f, -0.5f, -0.1875f, -0.1875f, -0.375f, -0.1875f, -0.1875f, -0.375f, -0.125f, -0.6875f, -0.5f, -0.125f, -0.6875f, -0.5f, -0.125f, -0.1875f, -0.375f, -0.125f, -0.1875f)
			.setRotationPoint(-16.5625f, 1.9375f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 76, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, -0.6875f, -0.4375f, -0.375f, -0.6875f, -0.4375f, -0.375f, -0.1875f, -0.4375f, -0.375f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.1875f)
			.setRotationPoint(-16.5625f, 1.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 71, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.1875f)
			.setRotationPoint(-16.5f, 1.5f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 13, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.6875f, -0.5f, -0.3125f, -0.6875f, -0.5f, -0.3125f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5625f, -0.6875f, -0.5f, -0.5625f, -0.1875f, -0.375f, -0.5f, -0.1875f)
			.setRotationPoint(-16.375f, 1.5f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 234, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.6875f, -0.5f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.1875f)
			.setRotationPoint(-16.25f, 1.4375f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 72, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, -0.375f, -0.6875f, -0.5f, -0.375f, -1.125f, -0.5f, -0.375f, 0.25f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.5f, -0.6875f, -0.5f, -0.5f, -1.125f, -0.5f, -0.5f, 0.25f, -0.375f, -0.5f, -0.1875f)
			.setRotationPoint(-13.125f, 1.4375f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 5, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.375f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.1875f, -0.0625f, -0.375f, -0.1875f, -0.0625f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.1875f, -0.0625f, -0.5f, -0.1875f)
			.setRotationPoint(-11.6875f, 1.4375f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 1, 0, 0.5f, -0.375f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.1875f, 0.5f, -0.375f, -0.1875f, 0.5f, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.1875f, 0.5f, -0.5f, -0.1875f)
			.setRotationPoint(-9.1875f, 2, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 248, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.6875f, 0, -0.9375f, -0.6875f, 0, -0.9375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.5f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, -0.5f, -0.1875f)
			.setRotationPoint(-10.6875f, 1.4375f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 211, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, -0.6875f, -0.1875f, -0.1875f, -0.6875f, -0.1875f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.1875f, -0.5f, -0.6875f, -0.6875f, -0.1875f, -0.6875f, -0.6875f, -0.1875f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f)
			.setRotationPoint(19.25f, 2.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 201, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, -0.6875f, -0.375f, -0.1875f, -0.6875f, -0.375f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.1875f, -0.5f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.6875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f)
			.setRotationPoint(19.5625f, 2.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 180, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, -0.6875f, -0.375f, -0.1875f, -0.6875f, -0.375f, -0.1875f, -0.1875f, -0.5f, -0.1875f, -0.1875f, -0.5f, -0.125f, -0.6875f, -0.375f, -0.125f, -0.6875f, -0.375f, -0.125f, -0.1875f, -0.5f, -0.125f, -0.1875f)
			.setRotationPoint(19.5625f, 1.9375f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 165, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.375f, -0.6875f, -0.4375f, -0.375f, -0.6875f, -0.4375f, -0.375f, -0.1875f, -0.4375f, -0.375f, -0.1875f, -0.5f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f)
			.setRotationPoint(19.5625f, 1.625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 153, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.6875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f)
			.setRotationPoint(19.5f, 1.5f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 127, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.3125f, -0.6875f, -0.375f, -0.375f, -0.6875f, -0.375f, -0.375f, -0.1875f, -0.5f, -0.3125f, -0.1875f, -0.5f, -0.5625f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5625f, -0.1875f)
			.setRotationPoint(19.375f, 1.5f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 168, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.375f, -0.6875f, -0.375f, -0.375f, -0.6875f, -0.375f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f)
			.setRotationPoint(16.25f, 1.4375f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 218, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.375f, -1.125f, -0.375f, -0.375f, -0.6875f, -0.375f, -0.375f, -0.1875f, -0.5f, -0.375f, 0.25f, -0.5f, -0.5f, -1.125f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.1875f, -0.5f, -0.5f, 0.25f)
			.setRotationPoint(15.125f, 1.4375f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 66, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.6875f, -0.1875f, -0.375f, -0.6875f, -0.1875f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.1875f, 0, -0.5f, -0.1875f)
			.setRotationPoint(14.8125f, 1.4375f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.9375f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.1875f, 0, -0.9375f, -0.1875f, 0, 0.0625f, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.1875f, 0, 0.0625f, -0.1875f)
			.setRotationPoint(13.8125f, 1.4375f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 206, 18, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.5f, 6, 6).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 189, 18, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2, 6, 6).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 172, 18, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.5f, 6, 6).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 63, 17, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 46, 17, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2, 6, -6).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 17, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 21, 55, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.0625f, 1.0625f, 0, null)
			.setRotationPoint(-12.5f, 6, -7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 243, 54, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.0625f, 1.0625f, 0, null)
			.setRotationPoint(2, 6, -7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 238, 54, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.0625f, 1.0625f, 0, null)
			.setRotationPoint(16.5f, 6, -7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15, 4.5f, -5).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 161, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 4, -5).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 217, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.5f, 4.5f, -5).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 132, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5f, 4, -5).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 190, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14, 4.5f, -5).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 103, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 4, -5).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 162, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.90625f, 3.1875f, -2).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 238, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 5, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(8.90625f, 3.1875f, 2).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 223, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 5, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.90625f, 3.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 155, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 4, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 2.1875f, -2).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 138, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, 0, 0, 0, 0, -4.28125f, 0, 0, 4.28125f, 0, 0, 0, 0, 0, 0, 0, 0, -4.28125f, 0, 0, 4.28125f, 0, 0)
			.setRotationPoint(-2, 3.1875f, 2).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 121, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 5, 0, 4.28125f, 0, 0, -4.28125f, 0, 0, 0, 0, 0, 0, 0, 0, 4.28125f, 0, 0, -4.28125f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 3.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 80, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 18, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, -2, 0, 0.25f, -2, 0, 0.25f, 0)
			.setRotationPoint(22.8125f, 3.4375f, -9).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 134, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 1.5f, 5).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 127, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 1, 5).setRotationAngle(0, 0, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 120, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 2.5f, 5).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 113, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 2, 5).setRotationAngle(0, 0, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 106, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 2, 5).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 99, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 1.5f, 5).setRotationAngle(0, 0, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 65, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 3, 5).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 58, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 1, 5).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 51, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 0.5f, 5).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 44, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 1.5f, -6).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 7, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 1, -6).setRotationAngle(0, 0, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 2.5f, -6).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 240, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 211, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 204, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 1.5f, -6).setRotationAngle(0, 0, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 180, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 173, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-4.5f, 1, -6).setRotationAngle(0, 0, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 166, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 0.5f, -6).setRotationAngle(0, 0, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 134, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(9.0625f, 1.5f, 3).setRotationAngle(0, -9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 115, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.0625f, 1, 3).setRotationAngle(0, -9, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 106, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(9.0625f, 2.5f, 3).setRotationAngle(0, -9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 97, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.0625f, 2, 3).setRotationAngle(0, -9, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 62, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(9.0625f, 2, 3).setRotationAngle(0, -9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 53, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.0625f, 1.5f, 3).setRotationAngle(0, -9, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 44, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(9.0625f, 3, 3).setRotationAngle(0, -9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(9.0625f, 1, 3).setRotationAngle(0, -9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 240, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.0625f, 0.5f, 3).setRotationAngle(0, -9, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 215, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(8.5625f, 1.5f, -6).setRotationAngle(0, 9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 206, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5625f, 1, -6).setRotationAngle(0, 9, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 156, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(8.5625f, 2.5f, -6).setRotationAngle(0, 9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 233, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5625f, 2, -6).setRotationAngle(0, 9, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 133, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(8.5625f, 2, -6).setRotationAngle(0, 9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5625f, 1.5f, -6).setRotationAngle(0, 9, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 103, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(8.5625f, 3, -6).setRotationAngle(0, 9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(8.5625f, 1, -6).setRotationAngle(0, 9, 0).setName("Box 471cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 103, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5625f, 0.5f, -6).setRotationAngle(0, 9, 0).setName("Box 472cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 228, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(10.375f, 4, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 160, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(10.375f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 895cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 148, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(9.875f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 896cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 122, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(11.375f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 898cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 117, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(10.375f, 5.3500004f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 988cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 112, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, -0.85f, 0, 0, -0.85f, 0, 0, -0.85f, -0.4f, -0.5f, -0.85f, -0.4f)
			.setRotationPoint(10.875f, 5.9300003f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 989cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 107, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.4f, -0.5f, -0.7f, -0.4f, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f)
			.setRotationPoint(10.875f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 990cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 102, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.4f, -0.5f, -0.7f, -0.4f)
			.setRotationPoint(10.875f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 991cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 61, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(11.375f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 56, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(11.375f, 6.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 51, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(11.375f, 4.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 994cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 114, 15, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 4, 1, 1, 0, 0, -0.3125f, 0, 0.5f, -0.3125f, 0, 0.5f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, 0, 0.5f, -0.3125f, 0, 0.5f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f)
			.setRotationPoint(7.5f, 7.75f, 6.0874996f).setRotationAngle(0, 0, 3).setName("Box 982cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 46, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(10.375f, 6, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 41, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(10.724998f, 8.15f, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 36, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(7.125f, 4, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 31, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(7.125f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 895cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 26, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(7.625f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 896cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 9, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(6.125f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 898cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 233, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(7.125f, 5.3500004f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 988cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 223, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, -0.85f, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.4f, 0, -0.85f, -0.4f)
			.setRotationPoint(6.625f, 5.9300003f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 989cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 207, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.4f, 0, -0.7f, -0.4f, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(6.625f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 990cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 197, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.4f, 0, -0.7f, -0.4f)
			.setRotationPoint(6.625f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 991cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 192, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(6.125f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 187, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(6.125f, 6.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 176, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(6.125f, 4.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 994cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 171, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.35f, 0, 0, -0.85f, 0, 0, -0.85f, 0, -0.5f, 0.35f, 0, -0.5f)
			.setRotationPoint(7.125f, 5.8999996f, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 143, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(6.7750015f, 7.8999996f, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 138, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(10.375f, 4, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 893")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 133, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(10.375f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 895")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 97, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(9.875f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 896")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 92, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(11.375f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 898")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 87, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(10.375f, 5.3500004f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 988")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 82, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, -0.85f, 0, 0, -0.85f, 0, 0, -0.85f, -0.4f, -0.5f, -0.85f, -0.4f)
			.setRotationPoint(10.875f, 5.9300003f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 989")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 77, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.4f, -0.5f, -0.7f, -0.4f, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f)
			.setRotationPoint(10.875f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 72, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.4f, -0.5f, -0.7f, -0.4f)
			.setRotationPoint(10.875f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 991")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 16, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(11.375f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 4, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(11.375f, 6.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 250, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(11.375f, 4.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 103, 15, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 4, 1, 1, 0, 0, -0.3125f, 0, 0.5f, -0.3125f, 0, 0.5f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, 0, 0.5f, -0.3125f, 0, 0.5f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f)
			.setRotationPoint(7.5f, 7.75f, -6.3374996f).setRotationAngle(0, 0, 3).setName("Box 982")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 218, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(10.375f, 6, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 213, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(10.724998f, 8.15f, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 202, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(7.125f, 4, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 182, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(7.125f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 895cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 166, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(7.625f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 896cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 156, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(6.125f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 898cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 128, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(7.125f, 5.3500004f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 988cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 67, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, -0.85f, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.4f, 0, -0.85f, -0.4f)
			.setRotationPoint(6.625f, 5.9300003f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 989cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 245, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.4f, 0, -0.7f, -0.4f, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(6.625f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 990cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 240, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.4f, 0, -0.7f, -0.4f)
			.setRotationPoint(6.625f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 991cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 229, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(6.125f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 161, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(6.125f, 6.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 151, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(6.125f, 4.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 994cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 123, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.9f, 0, -0.85f, 0.9f, 0, -0.85f, 0.9f, -0.5f, 0.35f, 0.9f, -0.5f)
			.setRotationPoint(7.125f, 6, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 118, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(6.7750015f, 7.8999996f, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 113, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-7.375f, 4, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 108, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-7.375f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 895cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 103, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-6.875f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 896cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 62, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-8.375f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 898cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 57, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(-7.375f, 5.3500004f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 988cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 52, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, -0.85f, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.4f, 0, -0.85f, -0.4f)
			.setRotationPoint(-7.875f, 5.9300003f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 989cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 47, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.4f, 0, -0.7f, -0.4f, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-7.875f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 990cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 42, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.4f, 0, -0.7f, -0.4f)
			.setRotationPoint(-7.875f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 991cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 37, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-8.375f, 5.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 32, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(-8.375f, 6.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 27, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-8.375f, 4.5f, 6.012501f).setRotationAngle(0, 0, 0).setName("Box 994cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 22, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(-7.375f, 6, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(-7.7249985f, 8.15f, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 224, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-7.375f, 4, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 198, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-7.375f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 895cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 193, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-6.875f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 896cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 170, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-8.375f, 5, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 898cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 98, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(-7.375f, 5.3500004f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 988cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 93, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, -0.85f, 0, -0.5f, -0.85f, 0, -0.5f, -0.85f, -0.4f, 0, -0.85f, -0.4f)
			.setRotationPoint(-7.875f, 5.9300003f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 989cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 88, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.4f, 0, -0.7f, -0.4f, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-7.875f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 990cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 83, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.4f, 0, -0.7f, -0.4f)
			.setRotationPoint(-7.875f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 991cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 78, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-8.375f, 5.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 73, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(-8.375f, 6.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 17, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-8.375f, 4.5f, -6.512501f).setRotationAngle(0, 0, 0).setName("Box 994cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 12, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(-7.375f, 6, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 249, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(-7.7249985f, 8.15f, -6.4624996f).setRotationAngle(0, 0, 0).setName("Box 993cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 244, 11, textureX, textureY)
			.addShapeBox(-0.375f, -0.5f, 0, 4, 1, 1, 0, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, 0.5f, -0.3125f, -0.75f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, 0.5f, -0.3125f, -0.75f)
			.setRotationPoint(-6.5625f, 7.8125f, 6.0874996f).setRotationAngle(0, 0, -10).setName("Box 982cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 244, 8, textureX, textureY)
			.addShapeBox(-0.375f, -0.5f, 0, 4, 1, 1, 0, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, 0.5f, -0.3125f, -0.75f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, 0.5f, -0.3125f, -0.75f)
			.setRotationPoint(-6.5625f, 7.8125f, -6.3374996f).setRotationAngle(0, 0, -10).setName("Box 982cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 235, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0.125f, 0, -0.5f, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f)
			.setRotationPoint(-3.1875f, 5.625f, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 219, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, -0.875f, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f, -0.5f, -0.125f, -0.875f, -0.5f)
			.setRotationPoint(-3.1875f, 7.4375f, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 214, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0.125f, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, -0.5f, 0.125f, 0.125f, -0.5f, 0.125f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, 0.125f, -0.375f, -0.5f)
			.setRotationPoint(-3.1875f, 5, 5.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 140, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-7.375f, 3.5f, 6.4624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 121, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f)
			.setRotationPoint(10.375f, 3.5f, 6.4624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 112, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(7.125f, 3.5f, 6.4624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 103, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-7.375f, 3.5f, -7.4624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 59, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(10.375f, 3.5f, -7.4624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		groups.add(Truck1);
	}

	private final void initGroup_Truck11(){
		TurboList Truck1 = new TurboList("Truck1");
		Truck1.add(new ModelRendererTurbo(Truck1, 50, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(7.125f, 3.5f, -7.4624996f).setRotationAngle(0, 0, 0).setName("Box 893cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 146, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.125f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0.125f, 0, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-3.1875f, 5.625f, -6.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 6, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.125f, -0.875f, -0.5f, -0.625f, -0.875f, -0.5f, -0.625f, -0.875f, 0, -0.125f, -0.875f, 0)
			.setRotationPoint(-3.1875f, 7.4375f, -6.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 212, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0.125f, -0.5f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, 0.125f, -0.375f, 0)
			.setRotationPoint(-3.1875f, 5, -6.9624996f).setRotationAngle(0, 0, 0).setName("Box 992cp")
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 159, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(1.0625f, 1.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 24, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.0625f, 1.0625f, 7.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 223, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.8125f, 1.0625f, 7.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 92, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.9375f, 1.0625f, 7.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 248, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.0625f, 1.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 93, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.0625f, 1.0625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Truck1.add(new ModelRendererTurbo(Truck1, 92, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.8125f, 1.0625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		groups.add(Truck1);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0)
			.setRotationPoint(14.5625f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0)
			.setRotationPoint(0.0625f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0)
			.setRotationPoint(0.0625f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0)
			.setRotationPoint(-14.4375f, 5.0625f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0, 0.28125f, -0.125f, 0)
			.setRotationPoint(-14.4375f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -1, -0.6875f, 0, -1, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(14.875f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -1, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -1, -0.6875f, 0)
			.setRotationPoint(-11.75f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -1, -0.6875f, 0, -1, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-14.125f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -1, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -1, -0.6875f, 0)
			.setRotationPoint(2.75f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -1, -0.6875f, 0, -1, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(0.375f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -1, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -1, -0.6875f, 0)
			.setRotationPoint(17.25f, 4.1875f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -1, -0.6875f, 0, -1, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(14.875f, 4.1875f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -1, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -1, -0.6875f, 0)
			.setRotationPoint(-11.75f, 4.1875f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -1, -0.6875f, 0, -1, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-14.125f, 4.1875f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -1, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -1, -0.6875f, 0)
			.setRotationPoint(2.75f, 4.1875f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -1, -0.6875f, 0, -1, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(0.375f, 4.1875f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0)
			.setRotationPoint(-15.5625f, 6.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0)
			.setRotationPoint(-10.3125f, 6.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0)
			.setRotationPoint(-1.0625f, 6.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0)
			.setRotationPoint(4.1875f, 6.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0)
			.setRotationPoint(13.4375f, 6.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.375f, 0)
			.setRotationPoint(18.6875f, 6.125f, 7).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

}
