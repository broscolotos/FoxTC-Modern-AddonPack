//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.electric;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelRadioFlyerHandcar extends FVTMFormatBase {

	public ModelRadioFlyerHandcar(){
		super();
		textureX = 256;
		textureY = 256;
		//
		initGroup_group0();
		addToCreators("Riggs64");
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY).addBox(0, 0, 0, 5, 5, 0)
			.setRotationPoint(4, 5, 5.95f).setRotationAngle(0, 0, -0).setName("Box 667")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 1, textureX, textureY).addBox(0, 0, 0, 5, 5, 0)
			.setRotationPoint(-7, 5, 5.95f).setRotationAngle(0, 0, -0).setName("Box 668")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 15)
			.setRotationPoint(6, 7, -7.5f).setRotationAngle(0, 0, -0).setName("Box 384")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 1, textureX, textureY).addBox(0, 0, 0, 5, 5, 0)
			.setRotationPoint(-7, 5, -5.95f).setRotationAngle(0, 0, -0).setName("Box 356")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 1, textureX, textureY).addBox(0, 0, 0, 5, 5, 0)
			.setRotationPoint(4, 5, -5.95f).setRotationAngle(0, 0, -0).setName("Box 357")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 1, textureX, textureY).addBox(0, 0, 0, 22, 1, 14)
			.setRotationPoint(-11, 4, -7).setRotationAngle(0, 0, -0).setName("Box 358")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 1, textureX, textureY).addBox(0, 0, 0, 22, 5, 1)
			.setRotationPoint(-11, 0, -8).setRotationAngle(0, 0, -0).setName("Box 359")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 1, textureX, textureY).addBox(0, 0, 0, 22, 5, 1)
			.setRotationPoint(-11, 0, 7).setRotationAngle(0, 0, -0).setName("Box 360")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 16, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-12, 0, -8).setRotationAngle(0, 0, -0).setName("Box 361")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 16, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(11, 0, -8).setRotationAngle(0, 0, -0).setName("Box 363")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 9, textureX, textureY).addBox(0, 0, 0, 22, 1, 1)
			.setRotationPoint(-11, 0, 8).setRotationAngle(0, 0, -0).setName("Box 364")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, -2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, -2)
			.setRotationPoint(-12, 0, 8).setRotationAngle(0, 0, -0).setName("Box 365")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 14)
			.setRotationPoint(-13, 0, -7).setRotationAngle(0, 0, -0).setName("Box 366")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-12, 0, -9).setRotationAngle(0, 0, -0).setName("Box 367")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 17, textureX, textureY).addBox(0, 0, 0, 22, 1, 1)
			.setRotationPoint(-11, 0, -9).setRotationAngle(0, 0, -0).setName("Box 368")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 14)
			.setRotationPoint(12, 0, -7).setRotationAngle(0, 0, -0).setName("Box 369")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, -2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, -2, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(11, 0, -9).setRotationAngle(0, 0, -0).setName("Box 370")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, -2, 0, 0, 0)
			.setRotationPoint(11, 0, 8).setRotationAngle(0, 0, -0).setName("Box 371")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 17, textureX, textureY).addBox(0, 0, 0, 7, 1, 10)
			.setRotationPoint(2, 3.5f, -5).setRotationAngle(0, 0, -0).setName("Box 372")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 7, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(-8, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 373")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, -4, -1.5f).setRotationAngle(0, 0, -0).setName("Box 374")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, -1.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.5f, -5, -1.5f).setRotationAngle(0, 0, -0).setName("Box 375")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 9, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-6, -3, 2).setRotationAngle(0, 0, -0).setName("Box 376")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-3, -3, 3).setRotationAngle(0, 0, -0).setName("Box 377")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 9, textureX, textureY).addBox(0, 0, 0, 2, 2, 4)
			.setRotationPoint(-6.5f, -3.5f, -2).setRotationAngle(0, 0, -0).setName("Box 378")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 9, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-9, -3, -3).setRotationAngle(0, 0, -0).setName("Box 380")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-9, -3, -4).setRotationAngle(0, 0, -0).setName("Box 381")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 17, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
			.setRotationPoint(-5.5f, 4.5f, -1).setRotationAngle(0, 0, -0).setName("Box 382")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 17, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
			.setRotationPoint(5.5f, 4.5f, -1).setRotationAngle(0, 0, -0).setName("Box 383")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 25, textureX, textureY).addBox(0, 0, 0, 14, 3, 0)
			.setRotationPoint(-6, 6, -2).setRotationAngle(0, 0, -0).setName("Box 384")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 10, textureX, textureY).addBox(0, 0, 0, 3, 4, 0)
			.setRotationPoint(-6, 5, 2).setRotationAngle(0, 0, -0).setName("Box 385")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 9, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-9, 5, -7).setRotationAngle(0, 0, -0).setName("Box 390")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 19, textureX, textureY).addBox(0, 0, 0, 1, 2, 12)
			.setRotationPoint(-9, 5, -6).setRotationAngle(0, 0, -0).setName("Box 391")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 25, textureX, textureY).addBox(0, 0, 0, 18, 1, 1)
			.setRotationPoint(-8, 8, -7).setRotationAngle(0, 0, -0).setName("Box 393")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(10, 8, -7).setRotationAngle(0, 0, -0).setName("Box 396")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-9, 8, -7).setRotationAngle(0, 0, -0).setName("Box 397")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 17, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10, 5, -7).setRotationAngle(0, 0, -0).setName("Box 398")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 25, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(-7, 5, -7).setRotationAngle(0, 0, -0).setName("Box 400")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 25, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(4, 5, -7).setRotationAngle(0, 0, -0).setName("Box 401")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 33, textureX, textureY).addBox(0, 0, 0, 18, 1, 1)
			.setRotationPoint(-8, 8, 6).setRotationAngle(0, 0, -0).setName("Box 403")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 17, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-9, 5, 6).setRotationAngle(0, 0, -0).setName("Box 404")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-9, 8, 6).setRotationAngle(0, 0, -0).setName("Box 405")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 33, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(-7, 5, 6).setRotationAngle(0, 0, -0).setName("Box 406")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 33, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(4, 5, 6).setRotationAngle(0, 0, -0).setName("Box 407")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(10, 8, 6).setRotationAngle(0, 0, -0).setName("Box 408")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 25, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10, 5, 6).setRotationAngle(0, 0, -0).setName("Box 409")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 33, textureX, textureY).addBox(0, 0, 0, 18, 3, 0)
			.setRotationPoint(-8, 5, 6.5f).setRotationAngle(0, 0, -0).setName("Box 410")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 33, textureX, textureY).addBox(0, 0, 0, 18, 3, 0)
			.setRotationPoint(-8, 5, -6.5f).setRotationAngle(0, 0, -0).setName("Box 411")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 33, textureX, textureY).addBox(0, 0, 0, 2, 1, 13)
			.setRotationPoint(-11, 6, -6.5f).setRotationAngle(0, 0, -0).setName("Box 412")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 33, textureX, textureY).addBox(0, 0, 0, 1, 1, 15)
			.setRotationPoint(-5, 7, -7.5f).setRotationAngle(0, 0, -0).setName("Box 415")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 25, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(5.5f, 6.5f, -7.25f).setRotationAngle(0, 0, -0).setName("Box 416")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 25, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-5.5f, 6.5f, -7.25f).setRotationAngle(0, 0, -0).setName("Box 417")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 33, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-5.5f, 6.5f, 6.25f).setRotationAngle(0, 0, -0).setName("Box 418")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 33, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(5.5f, 6.5f, 6.25f).setRotationAngle(0, 0, -0).setName("Box 419")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 25, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-11, 7, -6.5f).setRotationAngle(0, 0, -0).setName("Box 420")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 33, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-11, 7, 5.5f).setRotationAngle(0, 0, -0).setName("Box 429")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, 7, -0.5f).setRotationAngle(0, 0, -0).setName("Box 439")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 33, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-13, 9, -0.5f).setRotationAngle(0, 0, -0).setName("Box 443")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-11, 9, -5.5f).setRotationAngle(0, 0, -0).setName("Box 444")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 9, 0.5f).setRotationAngle(0, 0, -0).setName("Box 445")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-11, 7, -5.5f).setRotationAngle(0, 0, -0).setName("Box 446")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 7, 0.5f).setRotationAngle(0, 0, -0).setName("Box 447")
		);
		groups.add(group0);
	}

}
