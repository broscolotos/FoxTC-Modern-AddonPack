//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCnOTenderFrontBogie extends FVTMFormatBase {

	public ModelCnOTenderFrontBogie(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("Riggs64");
		//
		initGroup_Truck();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Truck(){
		TurboList Truck = new TurboList("Truck");
		Truck.add(new ModelRendererTurbo(Truck, 336, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.225f, 0, 0, 0.225f)
			.setRotationPoint(41.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 292")
		);
		Truck.add(new ModelRendererTurbo(Truck, 183, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.225f, -0.3f, -0.3f, 0.225f)
			.setRotationPoint(40.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 293")
		);
		Truck.add(new ModelRendererTurbo(Truck, 323, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.175f, -0.3f, -0.3f, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(40.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 332")
		);
		Truck.add(new ModelRendererTurbo(Truck, 165, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.175f, 0, 0, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(41.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 333")
		);
		Truck.add(new ModelRendererTurbo(Truck, 164, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.225f, 0, 0, 0.225f)
			.setRotationPoint(31.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 380")
		);
		Truck.add(new ModelRendererTurbo(Truck, 461, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.225f, -0.3f, -0.3f, 0.225f)
			.setRotationPoint(30.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 381")
		);
		Truck.add(new ModelRendererTurbo(Truck, 465, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.175f, -0.3f, -0.3f, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(30.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 382")
		);
		Truck.add(new ModelRendererTurbo(Truck, 147, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.175f, 0, 0, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(31.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 383")
		);
		Truck.add(new ModelRendererTurbo(Truck, 493, 88, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(38.5f, 4, -6).setRotationAngle(0, 0, 0).setName("Box 396")
		);
		Truck.add(new ModelRendererTurbo(Truck, 139, 31, textureX, textureY).addBox(0, 0, 0, 29, 1, 1)
			.setRotationPoint(17, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 398")
		);
		Truck.add(new ModelRendererTurbo(Truck, 257, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0, -8, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		Truck.add(new ModelRendererTurbo(Truck, 126, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.5f, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		Truck.add(new ModelRendererTurbo(Truck, 480, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 401")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(43, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 402")
		);
		Truck.add(new ModelRendererTurbo(Truck, 376, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(44, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 403")
		);
		Truck.add(new ModelRendererTurbo(Truck, 461, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 404")
		);
		Truck.add(new ModelRendererTurbo(Truck, 266, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(38, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 405")
		);
		Truck.add(new ModelRendererTurbo(Truck, 361, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 406")
		);
		Truck.add(new ModelRendererTurbo(Truck, 378, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(34, 7.5f, -8).setRotationAngle(0, 0, 0).setName("Box 407")
		);
		Truck.add(new ModelRendererTurbo(Truck, 356, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 408")
		);
		Truck.add(new ModelRendererTurbo(Truck, 202, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(33, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 409")
		);
		Truck.add(new ModelRendererTurbo(Truck, 189, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(33, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 410")
		);
		Truck.add(new ModelRendererTurbo(Truck, 171, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		Truck.add(new ModelRendererTurbo(Truck, 153, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(28, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 412")
		);
		Truck.add(new ModelRendererTurbo(Truck, 351, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 413")
		);
		Truck.add(new ModelRendererTurbo(Truck, 56, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(24, 7.5f, -8).setRotationAngle(0, 0, 0).setName("Box 414")
		);
		Truck.add(new ModelRendererTurbo(Truck, 346, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 415")
		);
		Truck.add(new ModelRendererTurbo(Truck, 136, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(23, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 416")
		);
		Truck.add(new ModelRendererTurbo(Truck, 480, 88, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(29, 4, -7.95f).setRotationAngle(0, 0, 0).setName("Box 422")
		);
		Truck.add(new ModelRendererTurbo(Truck, 84, 88, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(39, 4, -7.95f).setRotationAngle(0, 0, 0).setName("Box 423")
		);
		Truck.add(new ModelRendererTurbo(Truck, 502, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40, 4, -8.95f).setRotationAngle(0, 0, 0).setName("Box 425")
		);
		Truck.add(new ModelRendererTurbo(Truck, 129, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40.5f, 4.5f, -9).setRotationAngle(0, 0, 0).setName("Box 426")
		);
		Truck.add(new ModelRendererTurbo(Truck, 341, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, 5, -9).setRotationAngle(0, 0, 0).setName("Box 427")
		);
		Truck.add(new ModelRendererTurbo(Truck, 332, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31, 5, -9).setRotationAngle(0, 0, 0).setName("Box 428")
		);
		Truck.add(new ModelRendererTurbo(Truck, 110, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.5f, 4.5f, -9).setRotationAngle(0, 0, 0).setName("Box 429")
		);
		Truck.add(new ModelRendererTurbo(Truck, 16, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, 4, -8.95f).setRotationAngle(0, 0, 0).setName("Box 430")
		);
		Truck.add(new ModelRendererTurbo(Truck, 315, 60, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
			.setRotationPoint(29.5f, 2, -2).setRotationAngle(0, 0, 0).setName("Box 495")
		);
		Truck.add(new ModelRendererTurbo(Truck, 378, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.5f, 2.5f, -7).setRotationAngle(0, 0, 0).setName("Box 496")
		);
		Truck.add(new ModelRendererTurbo(Truck, 447, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, 3.5f, -7).setRotationAngle(0, 0, 0).setName("Box 497")
		);
		Truck.add(new ModelRendererTurbo(Truck, 145, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.225f, -0.3f, -0.3f, 0.225f)
			.setRotationPoint(20.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 334")
		);
		Truck.add(new ModelRendererTurbo(Truck, 110, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.225f, 0, 0, 0.225f)
			.setRotationPoint(21.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 335")
		);
		Truck.add(new ModelRendererTurbo(Truck, 305, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.175f, -0.3f, -0.3f, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(20.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 336")
		);
		Truck.add(new ModelRendererTurbo(Truck, 129, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.175f, 0, 0, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(21.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 337")
		);
		Truck.add(new ModelRendererTurbo(Truck, 105, 87, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(28.5f, 4, -6).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		Truck.add(new ModelRendererTurbo(Truck, 13, 87, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(18.5f, 4, -6).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		Truck.add(new ModelRendererTurbo(Truck, 398, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.75f, 0, 0, 1, 0, 0, 1, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 418")
		);
		Truck.add(new ModelRendererTurbo(Truck, 391, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(18, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 419")
		);
		Truck.add(new ModelRendererTurbo(Truck, 263, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(18, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 420")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 87, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(19, 4, -7.95f).setRotationAngle(0, 0, 0).setName("Box 421")
		);
		Truck.add(new ModelRendererTurbo(Truck, 502, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, 4, -8.95f).setRotationAngle(0, 0, 0).setName("Box 424")
		);
		Truck.add(new ModelRendererTurbo(Truck, 258, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, 5, -9).setRotationAngle(0, 0, 0).setName("Box 431")
		);
		Truck.add(new ModelRendererTurbo(Truck, 381, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.5f, 4.5f, -9).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		Truck.add(new ModelRendererTurbo(Truck, 374, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(23, 4.25f, -8.25f).setRotationAngle(0, 90, 0).setName("Box 487")
		);
		Truck.add(new ModelRendererTurbo(Truck, 248, 124, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(26, 4.75f, -8.04f).setRotationAngle(0, 90, -45).setName("Box 492")
		);
		Truck.add(new ModelRendererTurbo(Truck, 320, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0)
			.setRotationPoint(26, 4.25f, -8.25f).setRotationAngle(0, 90, 0).setName("Box 493")
		);
		Truck.add(new ModelRendererTurbo(Truck, 239, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, -1.25f, 0, -1.25f, -1.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, 0.75f, 0, -1.25f, 0.75f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(28.25f, 3.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		Truck.add(new ModelRendererTurbo(Truck, 96, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.5f, 3.5f, -7).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		Truck.add(new ModelRendererTurbo(Truck, 362, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 417")
		);
		Truck.add(new ModelRendererTurbo(Truck, 213, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 6.3999996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		Truck.add(new ModelRendererTurbo(Truck, 208, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(26.25f, 4.950001f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		Truck.add(new ModelRendererTurbo(Truck, 203, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 6.75f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 435")
		);
		Truck.add(new ModelRendererTurbo(Truck, 198, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(24.949997f, 4.950001f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 436")
		);
		Truck.add(new ModelRendererTurbo(Truck, 193, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 6.75f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 437")
		);
		Truck.add(new ModelRendererTurbo(Truck, 188, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 6.3999996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 438")
		);
		Truck.add(new ModelRendererTurbo(Truck, 183, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 6.049999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		Truck.add(new ModelRendererTurbo(Truck, 147, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 5.709999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 440")
		);
		Truck.add(new ModelRendererTurbo(Truck, 139, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 5.369999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 441")
		);
		Truck.add(new ModelRendererTurbo(Truck, 130, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 5, -8.1f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		Truck.add(new ModelRendererTurbo(Truck, 125, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 4.6499996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 443")
		);
		Truck.add(new ModelRendererTurbo(Truck, 120, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 4.3100014f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 444")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 3.9700012f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 445")
		);
		Truck.add(new ModelRendererTurbo(Truck, 502, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 3.6000004f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 446")
		);
		Truck.add(new ModelRendererTurbo(Truck, 497, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 3.6000004f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 447")
		);
		Truck.add(new ModelRendererTurbo(Truck, 492, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 3.9700012f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 448")
		);
		Truck.add(new ModelRendererTurbo(Truck, 475, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 4.3100014f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 449")
		);
		Truck.add(new ModelRendererTurbo(Truck, 253, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 4.6499996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 450")
		);
		Truck.add(new ModelRendererTurbo(Truck, 226, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 5, -8.1f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		Truck.add(new ModelRendererTurbo(Truck, 221, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 5.369999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 452")
		);
		Truck.add(new ModelRendererTurbo(Truck, 156, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 5.709999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 453")
		);
		Truck.add(new ModelRendererTurbo(Truck, 328, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 6.049999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 454")
		);
		Truck.add(new ModelRendererTurbo(Truck, 323, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 3.6000004f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 455")
		);
		Truck.add(new ModelRendererTurbo(Truck, 315, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 3.9700012f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 456")
		);
		Truck.add(new ModelRendererTurbo(Truck, 310, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 4.3100014f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 457")
		);
		Truck.add(new ModelRendererTurbo(Truck, 305, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(34.949997f, 4.950001f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 458")
		);
		Truck.add(new ModelRendererTurbo(Truck, 297, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 4.6499996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 459")
		);
		Truck.add(new ModelRendererTurbo(Truck, 292, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 5, -8.1f).setRotationAngle(0, 0, 0).setName("Box 460")
		);
		Truck.add(new ModelRendererTurbo(Truck, 287, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 5.369999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 461")
		);
		Truck.add(new ModelRendererTurbo(Truck, 282, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 5.709999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 462")
		);
		Truck.add(new ModelRendererTurbo(Truck, 277, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 6.049999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 463")
		);
		Truck.add(new ModelRendererTurbo(Truck, 272, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 6.75f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 464")
		);
		Truck.add(new ModelRendererTurbo(Truck, 244, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 6.3999996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 465")
		);
		Truck.add(new ModelRendererTurbo(Truck, 175, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 3.6000004f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 466")
		);
		Truck.add(new ModelRendererTurbo(Truck, 170, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(36.25f, 4.950001f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		Truck.add(new ModelRendererTurbo(Truck, 165, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 3.9700012f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 468")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 4.3100014f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		Truck.add(new ModelRendererTurbo(Truck, 46, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 4.6499996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 470")
		);
		Truck.add(new ModelRendererTurbo(Truck, 41, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 5, -8.1f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		Truck.add(new ModelRendererTurbo(Truck, 36, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 5.369999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		Truck.add(new ModelRendererTurbo(Truck, 28, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 5.709999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		Truck.add(new ModelRendererTurbo(Truck, 23, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 6.049999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 474")
		);
		Truck.add(new ModelRendererTurbo(Truck, 18, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 6.3999996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 475")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 6.75f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(22.75f, 4.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 486")
		);
		Truck.add(new ModelRendererTurbo(Truck, 270, 86, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(38.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 289")
		);
		Truck.add(new ModelRendererTurbo(Truck, 257, 86, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(28.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 290")
		);
		Truck.add(new ModelRendererTurbo(Truck, 238, 86, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(18.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 291")
		);
		Truck.add(new ModelRendererTurbo(Truck, 488, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(44, 6.5f, 7).setRotationAngle(0, 0, 0).setName("Box 294")
		);
		Truck.add(new ModelRendererTurbo(Truck, 355, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(43, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 295")
		);
		Truck.add(new ModelRendererTurbo(Truck, 343, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 296")
		);
		Truck.add(new ModelRendererTurbo(Truck, 257, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0, -8, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, 2.5f, 7).setRotationAngle(0, 0, 0).setName("Box 298")
		);
		Truck.add(new ModelRendererTurbo(Truck, 502, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(40, 4, 7.95f).setRotationAngle(0, 0, 0).setName("Box 299")
		);
		Truck.add(new ModelRendererTurbo(Truck, 164, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(40.5f, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 300")
		);
		Truck.add(new ModelRendererTurbo(Truck, 483, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(41, 5, 8).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		Truck.add(new ModelRendererTurbo(Truck, 336, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 302")
		);
		Truck.add(new ModelRendererTurbo(Truck, 315, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(38, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		Truck.add(new ModelRendererTurbo(Truck, 471, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, 6.5f, 7).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		Truck.add(new ModelRendererTurbo(Truck, 480, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(34, 7.5f, 7).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		Truck.add(new ModelRendererTurbo(Truck, 466, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, 6.5f, 7).setRotationAngle(0, 0, 0).setName("Box 306")
		);
		Truck.add(new ModelRendererTurbo(Truck, 308, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(33, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 307")
		);
		Truck.add(new ModelRendererTurbo(Truck, 301, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(33, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		Truck.add(new ModelRendererTurbo(Truck, 405, 85, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(39, 4, 6.95f).setRotationAngle(0, 0, 0).setName("Box 331")
		);
		Truck.add(new ModelRendererTurbo(Truck, 502, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(20, 4, 7.95f).setRotationAngle(0, 0, 0).setName("Box 338")
		);
		Truck.add(new ModelRendererTurbo(Truck, 291, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(20.5f, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 339")
		);
		Truck.add(new ModelRendererTurbo(Truck, 264, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(21, 5, 8).setRotationAngle(0, 0, 0).setName("Box 340")
		);
		Truck.add(new ModelRendererTurbo(Truck, 259, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(18, 6.5f, 7).setRotationAngle(0, 0, 0).setName("Box 341")
		);
		Truck.add(new ModelRendererTurbo(Truck, 284, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(18, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 342")
		);
		Truck.add(new ModelRendererTurbo(Truck, 187, 85, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(19, 4, 6.95f).setRotationAngle(0, 0, 0).setName("Box 343")
		);
		Truck.add(new ModelRendererTurbo(Truck, 277, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.75f, 0, 0, 1, 0, 0, 1, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 344")
		);
		Truck.add(new ModelRendererTurbo(Truck, 200, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.5f, 2.5f, 7).setRotationAngle(0, 0, 0).setName("Box 345")
		);
		Truck.add(new ModelRendererTurbo(Truck, 147, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 346")
		);
		Truck.add(new ModelRendererTurbo(Truck, 202, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(23, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 347")
		);
		Truck.add(new ModelRendererTurbo(Truck, 239, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, 6.5f, 7).setRotationAngle(0, 0, 0).setName("Box 348")
		);
		Truck.add(new ModelRendererTurbo(Truck, 378, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(24, 7.5f, 7).setRotationAngle(0, 0, 0).setName("Box 349")
		);
		Truck.add(new ModelRendererTurbo(Truck, 190, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 350")
		);
		Truck.add(new ModelRendererTurbo(Truck, 256, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(28, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 351")
		);
		Truck.add(new ModelRendererTurbo(Truck, 152, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28, 6.5f, 7).setRotationAngle(0, 0, 0).setName("Box 352")
		);
		Truck.add(new ModelRendererTurbo(Truck, 426, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(30, 4, 7.95f).setRotationAngle(0, 0, 0).setName("Box 377")
		);
		Truck.add(new ModelRendererTurbo(Truck, 183, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(30.5f, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 378")
		);
		Truck.add(new ModelRendererTurbo(Truck, 147, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(31, 5, 8).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		Truck.add(new ModelRendererTurbo(Truck, 29, 84, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(29, 4, 6.95f).setRotationAngle(0, 0, 0).setName("Box 384")
		);
		Truck.add(new ModelRendererTurbo(Truck, 437, 7, textureX, textureY).addBox(0, 0, 0, 29, 1, 1)
			.setRotationPoint(17, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 385")
		);
		Truck.add(new ModelRendererTurbo(Truck, 130, 121, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(26, 4.75f, 9.46f).setRotationAngle(0, 90, -45).setName("Box 392")
		);
		Truck.add(new ModelRendererTurbo(Truck, 326, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(26, 4.25f, 9.25f).setRotationAngle(0, 90, 0).setName("Box 393")
		);
		Truck.add(new ModelRendererTurbo(Truck, 125, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -1.25f, 0, 0.75f, -1.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, 0.75f, 0, 0.75f, 0.75f, 0)
			.setRotationPoint(28.25f, 3.25f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		Truck.add(new ModelRendererTurbo(Truck, 120, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 3.6000004f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.45f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 3.9700012f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 310")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 4.3100014f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		Truck.add(new ModelRendererTurbo(Truck, 254, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 4.6499996f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		Truck.add(new ModelRendererTurbo(Truck, 231, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(34.949997f, 4.950001f, 6.55f).setRotationAngle(0, 0, 0).setName("Box 313")
		);
		Truck.add(new ModelRendererTurbo(Truck, 226, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 5, 6.8f).setRotationAngle(0, 0, 0).setName("Box 314")
		);
		Truck.add(new ModelRendererTurbo(Truck, 221, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.45f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 5.369999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 315")
		);
		Truck.add(new ModelRendererTurbo(Truck, 139, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 5.709999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		Truck.add(new ModelRendererTurbo(Truck, 391, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 6.049999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		Truck.add(new ModelRendererTurbo(Truck, 338, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 6.3999996f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 318")
		);
		Truck.add(new ModelRendererTurbo(Truck, 333, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(35.35f, 6.75f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 319")
		);
		Truck.add(new ModelRendererTurbo(Truck, 506, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(36.25f, 4.950001f, 6.55f).setRotationAngle(0, 0, 0).setName("Box 320")
		);
		Truck.add(new ModelRendererTurbo(Truck, 328, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 6.75f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 321")
		);
		Truck.add(new ModelRendererTurbo(Truck, 323, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 6.3999996f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 322")
		);
		Truck.add(new ModelRendererTurbo(Truck, 310, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 6.049999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 323")
		);
		Truck.add(new ModelRendererTurbo(Truck, 305, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 5.709999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 324")
		);
		Truck.add(new ModelRendererTurbo(Truck, 297, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 5.369999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 325")
		);
		Truck.add(new ModelRendererTurbo(Truck, 292, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 5, 6.8f).setRotationAngle(0, 0, 0).setName("Box 326")
		);
		Truck.add(new ModelRendererTurbo(Truck, 287, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 4.6499996f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 327")
		);
		Truck.add(new ModelRendererTurbo(Truck, 282, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 4.3100014f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 328")
		);
		Truck.add(new ModelRendererTurbo(Truck, 277, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 3.9700012f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 329")
		);
		Truck.add(new ModelRendererTurbo(Truck, 272, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.65f, 3.6000004f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 330")
		);
		Truck.add(new ModelRendererTurbo(Truck, 249, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(26.25f, 4.950001f, 6.55f).setRotationAngle(0, 0, 0).setName("Box 353")
		);
		Truck.add(new ModelRendererTurbo(Truck, 244, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 4.3100014f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 354")
		);
		Truck.add(new ModelRendererTurbo(Truck, 207, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 4.6499996f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 355")
		);
		Truck.add(new ModelRendererTurbo(Truck, 202, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 5, 6.8f).setRotationAngle(0, 0, 0).setName("Box 356")
		);
		Truck.add(new ModelRendererTurbo(Truck, 46, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 5.369999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 357")
		);
		Truck.add(new ModelRendererTurbo(Truck, 41, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 5.709999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 358")
		);
		Truck.add(new ModelRendererTurbo(Truck, 36, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 6.049999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 359")
		);
		Truck.add(new ModelRendererTurbo(Truck, 28, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 6.3999996f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 360")
		);
		Truck.add(new ModelRendererTurbo(Truck, 23, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 6.75f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 361")
		);
		Truck.add(new ModelRendererTurbo(Truck, 18, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 6.75f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 362")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 6.3999996f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 363")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 6.049999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 364")
		);
		Truck.add(new ModelRendererTurbo(Truck, 347, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 5.709999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		Truck.add(new ModelRendererTurbo(Truck, 239, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 5, 6.8f).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		Truck.add(new ModelRendererTurbo(Truck, 157, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(24.949997f, 4.950001f, 6.55f).setRotationAngle(0, 0, 0).setName("Box 367")
		);
		Truck.add(new ModelRendererTurbo(Truck, 152, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.45f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 5.369999f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 368")
		);
		Truck.add(new ModelRendererTurbo(Truck, 147, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 3.9700012f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 369")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.45f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 3.9700012f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		Truck.add(new ModelRendererTurbo(Truck, 130, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 4.3100014f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 371")
		);
		Truck.add(new ModelRendererTurbo(Truck, 125, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 4.6499996f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 372")
		);
		Truck.add(new ModelRendererTurbo(Truck, 120, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(25.349998f, 3.6000004f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.650002f, 3.6000004f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 375")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(22.75f, 4.25f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		Truck.add(new ModelRendererTurbo(Truck, 154, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(23, 4.25f, 9.25f).setRotationAngle(0, 90, 0).setName("Box 387")
		);
		Truck.add(new ModelRendererTurbo(Truck, 501, 117, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 3, null)
			.setRotationPoint(23.5f, 4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Truck.add(new ModelRendererTurbo(Truck, 496, 117, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 3, null)
			.setRotationPoint(23.5f, 4.75f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Truck.add(new ModelRendererTurbo(Truck, 119, 104, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(35, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 289cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 480, 103, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(35, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 289cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 103, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(25, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 289cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 461, 103, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(25, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 289cp")
		);
		groups.add(Truck);
	}

}
