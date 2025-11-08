//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model3aBlomberg extends FVTMFormatBase {

	public Model3aBlomberg(){
		super();
		textureX = 256;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_Truck();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_Truck(){
		TurboList Truck = new TurboList("Truck");
		Truck.add(new ModelRendererTurbo(Truck, 82, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		Truck.add(new ModelRendererTurbo(Truck, 44, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		Truck.add(new ModelRendererTurbo(Truck, 20, 36, textureX, textureY).addBox(0, 0, 0, 1, 2, 14)
			.setRotationPoint(-3, 2.75f, -7).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		Truck.add(new ModelRendererTurbo(Truck, 227, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 2.75f, -3).setRotationAngle(0, 0, 0).setName("Box 435")
		);
		Truck.add(new ModelRendererTurbo(Truck, 98, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 14)
			.setRotationPoint(2, 2.75f, -7).setRotationAngle(0, 0, 0).setName("Box 436")
		);
		Truck.add(new ModelRendererTurbo(Truck, 107, 0, textureX, textureY).addBox(0, 0, 0, 42, 2, 11)
			.setRotationPoint(-21, 4.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 437")
		);
		Truck.add(new ModelRendererTurbo(Truck, 40, 20, textureX, textureY).addBox(0, 0, 0, 6, 2, 1)
			.setRotationPoint(-12, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		Truck.add(new ModelRendererTurbo(Truck, 177, 69, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-21.75f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 449")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 450")
		);
		Truck.add(new ModelRendererTurbo(Truck, 172, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-21, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		Truck.add(new ModelRendererTurbo(Truck, 60, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 452")
		);
		Truck.add(new ModelRendererTurbo(Truck, 159, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-20, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 453")
		);
		Truck.add(new ModelRendererTurbo(Truck, 101, 45, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-19, 5.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 454")
		);
		Truck.add(new ModelRendererTurbo(Truck, 154, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 455")
		);
		Truck.add(new ModelRendererTurbo(Truck, 7, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(0, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		Truck.add(new ModelRendererTurbo(Truck, 182, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-2, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		Truck.add(new ModelRendererTurbo(Truck, 149, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 497")
		);
		Truck.add(new ModelRendererTurbo(Truck, 94, 45, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-19, 5.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		Truck.add(new ModelRendererTurbo(Truck, 130, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-20, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		Truck.add(new ModelRendererTurbo(Truck, 85, 69, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-21.75f, 4, 7).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		Truck.add(new ModelRendererTurbo(Truck, 80, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-21, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		Truck.add(new ModelRendererTurbo(Truck, 40, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 2.5f, 7).setRotationAngle(0, 0, 0).setName("Box 502")
		);
		Truck.add(new ModelRendererTurbo(Truck, 195, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		Truck.add(new ModelRendererTurbo(Truck, 175, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(-18, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		Truck.add(new ModelRendererTurbo(Truck, 111, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(-19, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		Truck.add(new ModelRendererTurbo(Truck, 74, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-20, 8.5f, -8).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 42, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1)
			.setRotationPoint(-21, 6.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		Truck.add(new ModelRendererTurbo(Truck, 60, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-22.75f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		Truck.add(new ModelRendererTurbo(Truck, 64, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(-18, 3.75f, -8.5f).setRotationAngle(0, 90, 0).setName("Box 573")
		);
		Truck.add(new ModelRendererTurbo(Truck, 57, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(-18, 3.75f, -7.5f).setRotationAngle(0, 90, 0).setName("Box 574")
		);
		Truck.add(new ModelRendererTurbo(Truck, 47, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 2.75f, -7.5f).setRotationAngle(0, 90, 0).setName("Box 575")
		);
		Truck.add(new ModelRendererTurbo(Truck, 37, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 2.75f, -8.5f).setRotationAngle(0, 90, 0).setName("Box 576")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-20, 8.5f, 7).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		Truck.add(new ModelRendererTurbo(Truck, 20, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 2.75f, 9.5f).setRotationAngle(0, 90, 0).setName("Box 595")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 2.75f, 8.5f).setRotationAngle(0, 90, 0).setName("Box 596")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(-18, 3.75f, 8.5f).setRotationAngle(0, 90, 0).setName("Box 597")
		);
		Truck.add(new ModelRendererTurbo(Truck, 243, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(-18, 3.75f, 9.5f).setRotationAngle(0, 90, 0).setName("Box 598")
		);
		Truck.add(new ModelRendererTurbo(Truck, 210, 19, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-21.5f, 3, -5.9700003f).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		Truck.add(new ModelRendererTurbo(Truck, 189, 19, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-21.5f, 3, 5.9700003f).setRotationAngle(0, 0, 0).setName("Box 668")
		);
		Truck.add(new ModelRendererTurbo(Truck, 20, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 4, -8).setRotationAngle(0, 0, 0).setName("Box 788")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17, 5, -8).setRotationAngle(0, 0, 0).setName("Box 789")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(-17, 4, -8).setRotationAngle(0, 0, 0).setName("Box 790")
		);
		Truck.add(new ModelRendererTurbo(Truck, 243, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-20, 5, -8).setRotationAngle(0, 0, 0).setName("Box 791")
		);
		Truck.add(new ModelRendererTurbo(Truck, 98, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 1.9375f, -8).setRotationAngle(0, 0, 0).setName("Box 796")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 17, textureX, textureY).addBox(0, 0, 0, 6, 2, 1)
			.setRotationPoint(-12, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 799")
		);
		Truck.add(new ModelRendererTurbo(Truck, 222, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 4, 7).setRotationAngle(0, 0, 0).setName("Box 806")
		);
		Truck.add(new ModelRendererTurbo(Truck, 217, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-20, 5, 7).setRotationAngle(0, 0, 0).setName("Box 807")
		);
		Truck.add(new ModelRendererTurbo(Truck, 171, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 808")
		);
		Truck.add(new ModelRendererTurbo(Truck, 212, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(-17, 4, 7).setRotationAngle(0, 0, 0).setName("Box 809")
		);
		Truck.add(new ModelRendererTurbo(Truck, 207, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17, 5, 7).setRotationAngle(0, 0, 0).setName("Box 810")
		);
		Truck.add(new ModelRendererTurbo(Truck, 144, 68, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-16.5f, 3.75f, -7.79f).setRotationAngle(0, 90, -45).setName("Box 815")
		);
		Truck.add(new ModelRendererTurbo(Truck, 236, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0)
			.setRotationPoint(-15.5f, 3.25f, -8).setRotationAngle(0, 90, 0).setName("Box 825")
		);
		Truck.add(new ModelRendererTurbo(Truck, 229, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-15.5f, 3.25f, 9).setRotationAngle(0, 90, 0).setName("Box 827")
		);
		Truck.add(new ModelRendererTurbo(Truck, 125, 68, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-16.5f, 3.75f, 9.21f).setRotationAngle(0, 90, -45).setName("Box 828")
		);
		Truck.add(new ModelRendererTurbo(Truck, 222, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, -0.75f, 0.25f, 0.5f, -0.75f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1, 0.25f, 0.25f, 0.5f, 0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-14.25f, 3.25f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 829")
		);
		Truck.add(new ModelRendererTurbo(Truck, 195, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(-16, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 848")
		);
		Truck.add(new ModelRendererTurbo(Truck, 140, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(-16, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 849")
		);
		Truck.add(new ModelRendererTurbo(Truck, 75, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, 4.25f, -8).setRotationAngle(0, 0, 0).setName("Box 851")
		);
		Truck.add(new ModelRendererTurbo(Truck, 15, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 852")
		);
		Truck.add(new ModelRendererTurbo(Truck, 251, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-13, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 854")
		);
		Truck.add(new ModelRendererTurbo(Truck, 238, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(-13, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 855")
		);
		Truck.add(new ModelRendererTurbo(Truck, 188, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-13, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 856")
		);
		Truck.add(new ModelRendererTurbo(Truck, 168, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 857")
		);
		Truck.add(new ModelRendererTurbo(Truck, 163, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(-6, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 858")
		);
		Truck.add(new ModelRendererTurbo(Truck, 139, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-6, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 859")
		);
		Truck.add(new ModelRendererTurbo(Truck, 134, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 860")
		);
		Truck.add(new ModelRendererTurbo(Truck, 120, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-6, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 861")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 862")
		);
		Truck.add(new ModelRendererTurbo(Truck, 110, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 4.25f, -8).setRotationAngle(0, 0, 0).setName("Box 863")
		);
		Truck.add(new ModelRendererTurbo(Truck, 81, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-19, 3.6499996f, -8.6f).setRotationAngle(0, 0, 0).setName("Box 873")
		);
		Truck.add(new ModelRendererTurbo(Truck, 79, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-19, 2.6499996f, -8.6f).setRotationAngle(0, 0, 0).setName("Box 874")
		);
		Truck.add(new ModelRendererTurbo(Truck, 105, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, -0.8f, 0.2f, 0, -0.8f, 0, -0.8f, 0, -0.2f, -0.8f, 0, 0, -0.8f, -0.8f, 0.2f, -0.8f, -0.8f)
			.setRotationPoint(-19.2f, 3.6499996f, -8.4f).setRotationAngle(-90, 0, -90).setName("Box 875")
		);
		Truck.add(new ModelRendererTurbo(Truck, 100, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(-13, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 879")
		);
		Truck.add(new ModelRendererTurbo(Truck, 95, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-13, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 880")
		);
		Truck.add(new ModelRendererTurbo(Truck, 90, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 881")
		);
		Truck.add(new ModelRendererTurbo(Truck, 70, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 882")
		);
		Truck.add(new ModelRendererTurbo(Truck, 65, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-13, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 883")
		);
		Truck.add(new ModelRendererTurbo(Truck, 60, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, 4.25f, 7).setRotationAngle(0, 0, 0).setName("Box 884")
		);
		Truck.add(new ModelRendererTurbo(Truck, 55, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 885")
		);
		Truck.add(new ModelRendererTurbo(Truck, 50, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-6, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 886")
		);
		Truck.add(new ModelRendererTurbo(Truck, 45, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(-6, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 887")
		);
		Truck.add(new ModelRendererTurbo(Truck, 40, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-6, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 888")
		);
		Truck.add(new ModelRendererTurbo(Truck, 35, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 889")
		);
		Truck.add(new ModelRendererTurbo(Truck, 30, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 4.25f, 7).setRotationAngle(0, 0, 0).setName("Box 890")
		);
		Truck.add(new ModelRendererTurbo(Truck, 43, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-19, 3.6499996f, 8.4f).setRotationAngle(0, 0, 0).setName("Box 891")
		);
		Truck.add(new ModelRendererTurbo(Truck, 25, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, -0.8f, 0.2f, 0, -0.8f, 0, -0.8f, 0, -0.2f, -0.8f, 0, 0, -0.8f, -0.8f, 0.2f, -0.8f, -0.8f)
			.setRotationPoint(-19.2f, 3.6499996f, 8.6f).setRotationAngle(-90, 0, -90).setName("Box 892")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-19, 2.6499996f, 8.4f).setRotationAngle(0, 0, 0).setName("Box 893")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 67, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-8.125f, 3.4500008f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 899")
		);
		Truck.add(new ModelRendererTurbo(Truck, 233, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-7.875f, 3.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 900")
		);
		Truck.add(new ModelRendererTurbo(Truck, 6, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-10.5f, 7.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 901")
		);
		Truck.add(new ModelRendererTurbo(Truck, 242, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f)
			.setRotationPoint(-10.5f, 7.2299995f, 5).setRotationAngle(0, 0, 0).setName("Box 902")
		);
		Truck.add(new ModelRendererTurbo(Truck, 228, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-10.625f, 3.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 905")
		);
		Truck.add(new ModelRendererTurbo(Truck, 193, 66, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-10.875f, 3.4500008f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 906")
		);
		Truck.add(new ModelRendererTurbo(Truck, 181, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-10.5f, 3.8500004f, 8).setRotationAngle(0, 0, 0).setName("Box 909")
		);
		Truck.add(new ModelRendererTurbo(Truck, 183, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-18.35f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		Truck.add(new ModelRendererTurbo(Truck, 178, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-17.95f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 387")
		);
		Truck.add(new ModelRendererTurbo(Truck, 173, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-17.95f, 4.0600004f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		Truck.add(new ModelRendererTurbo(Truck, 158, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-17.95f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 389")
		);
		Truck.add(new ModelRendererTurbo(Truck, 153, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-17.95f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		Truck.add(new ModelRendererTurbo(Truck, 148, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-19.45f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 915")
		);
		Truck.add(new ModelRendererTurbo(Truck, 129, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-19.05f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 916")
		);
		Truck.add(new ModelRendererTurbo(Truck, 85, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-19.05f, 4.0600004f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 917")
		);
		Truck.add(new ModelRendererTurbo(Truck, 80, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-19.05f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 918")
		);
		Truck.add(new ModelRendererTurbo(Truck, 20, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.5f)
			.setRotationPoint(-19.05f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 919")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-18.35f, 4.75f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 940")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-17.95f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 941")
		);
		Truck.add(new ModelRendererTurbo(Truck, 247, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-17.95f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 942")
		);
		Truck.add(new ModelRendererTurbo(Truck, 242, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-17.95f, 4.0600014f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 943")
		);
		Truck.add(new ModelRendererTurbo(Truck, 223, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-17.95f, 3.7200012f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 944")
		);
		Truck.add(new ModelRendererTurbo(Truck, 218, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-19.45f, 4.75f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 945")
		);
		Truck.add(new ModelRendererTurbo(Truck, 213, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-19.05f, 3.7200012f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		Truck.add(new ModelRendererTurbo(Truck, 208, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-19.05f, 4.0600014f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 947")
		);
		Truck.add(new ModelRendererTurbo(Truck, 143, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-19.05f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 948")
		);
		Truck.add(new ModelRendererTurbo(Truck, 124, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-19.05f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 949")
		);
		Truck.add(new ModelRendererTurbo(Truck, 39, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0)
			.setRotationPoint(-18.5f, 6, -9.4f).setRotationAngle(0, 0, 0).setName("Box 885")
		);
		Truck.add(new ModelRendererTurbo(Truck, 75, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-13.25f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 893")
		);
		Truck.add(new ModelRendererTurbo(Truck, 15, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-13.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 895")
		);
		Truck.add(new ModelRendererTurbo(Truck, 189, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-12.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 896")
		);
		Truck.add(new ModelRendererTurbo(Truck, 138, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-14.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 898")
		);
		Truck.add(new ModelRendererTurbo(Truck, 133, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-13.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 926")
		);
		Truck.add(new ModelRendererTurbo(Truck, 119, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-14.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 927")
		);
		Truck.add(new ModelRendererTurbo(Truck, 114, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-13.25f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 928")
		);
		Truck.add(new ModelRendererTurbo(Truck, 109, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-12.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		Truck.add(new ModelRendererTurbo(Truck, 104, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(-23.75f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 938")
		);
		Truck.add(new ModelRendererTurbo(Truck, 99, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-22.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 940")
		);
		Truck.add(new ModelRendererTurbo(Truck, 94, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(-22.75f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 941")
		);
		Truck.add(new ModelRendererTurbo(Truck, 89, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-22.75f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 942")
		);
		Truck.add(new ModelRendererTurbo(Truck, 70, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-23.75f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		Truck.add(new ModelRendererTurbo(Truck, 65, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-23.75f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 961")
		);
		Truck.add(new ModelRendererTurbo(Truck, 60, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(-13.25f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 988")
		);
		Truck.add(new ModelRendererTurbo(Truck, 55, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-14.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		Truck.add(new ModelRendererTurbo(Truck, 50, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(-14.25f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		Truck.add(new ModelRendererTurbo(Truck, 45, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-14.25f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		Truck.add(new ModelRendererTurbo(Truck, 40, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(-23.75f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1009")
		);
		Truck.add(new ModelRendererTurbo(Truck, 35, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-22.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1013")
		);
		Truck.add(new ModelRendererTurbo(Truck, 30, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-22.75f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1014")
		);
		Truck.add(new ModelRendererTurbo(Truck, 25, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(-22.75f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1015")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-14.25f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1016")
		);
		Truck.add(new ModelRendererTurbo(Truck, 238, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-14.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1017")
		);
		Truck.add(new ModelRendererTurbo(Truck, 233, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(-14.25f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1018")
		);
		Truck.add(new ModelRendererTurbo(Truck, 228, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(-13.25f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1022")
		);
		Truck.add(new ModelRendererTurbo(Truck, 227, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.2f, -0.8f, 0, -0.2f, -0.8f, 0, -0.2f, -0.8f, -0.8f, -0.2f, -0.8f, -0.8f)
			.setRotationPoint(-13.5f, 7.75f, -5.85f).setRotationAngle(0, 0, 0).setName("Box 982")
		);
		Truck.add(new ModelRendererTurbo(Truck, 96, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.2f, -0.8f, 0, -0.2f, -0.8f, 0, -0.2f, -0.8f, -0.8f, -0.2f, -0.8f, -0.8f)
			.setRotationPoint(-13.5f, 7.75f, 5.6499996f).setRotationAngle(0, 0, 0).setName("Box 983")
		);
		Truck.add(new ModelRendererTurbo(Truck, 184, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(-23.75f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		Truck.add(new ModelRendererTurbo(Truck, 179, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(-23.4f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 991")
		);
		Truck.add(new ModelRendererTurbo(Truck, 174, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-22.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		Truck.add(new ModelRendererTurbo(Truck, 159, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(-23.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		Truck.add(new ModelRendererTurbo(Truck, 154, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-24.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		Truck.add(new ModelRendererTurbo(Truck, 149, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(-23.4f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 995")
		);
		Truck.add(new ModelRendererTurbo(Truck, 20, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(-23.75f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 996")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-22.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 997")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(-23.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 998")
		);
		Truck.add(new ModelRendererTurbo(Truck, 250, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-24.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 999")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(-13.25f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		Truck.add(new ModelRendererTurbo(Truck, 223, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(-13.6f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		Truck.add(new ModelRendererTurbo(Truck, 218, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(-13.25f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		Truck.add(new ModelRendererTurbo(Truck, 213, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(-13.6f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 995")
		);
		Truck.add(new ModelRendererTurbo(Truck, 215, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(-9, 5.1000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		Truck.add(new ModelRendererTurbo(Truck, 175, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(-9, 5.3500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		Truck.add(new ModelRendererTurbo(Truck, 131, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(-9, 5.6000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 367")
		);
		Truck.add(new ModelRendererTurbo(Truck, 112, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(-9, 5.8500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 368")
		);
		Truck.add(new ModelRendererTurbo(Truck, 103, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(-9, 5.6499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 369")
		);
		Truck.add(new ModelRendererTurbo(Truck, 94, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(-9, 5.8999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		Truck.add(new ModelRendererTurbo(Truck, 160, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(-9, 6.1499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 371")
		);
		Truck.add(new ModelRendererTurbo(Truck, 143, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(-9, 6.3999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 372")
		);
		Truck.add(new ModelRendererTurbo(Truck, 136, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(-10, 5.1000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		Truck.add(new ModelRendererTurbo(Truck, 120, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(-10, 5.3500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 374")
		);
		Truck.add(new ModelRendererTurbo(Truck, 75, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(-10, 5.6000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 375")
		);
		Truck.add(new ModelRendererTurbo(Truck, 66, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(-10, 5.8500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 376")
		);
		Truck.add(new ModelRendererTurbo(Truck, 57, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(-10, 5.6499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 377")
		);
		Truck.add(new ModelRendererTurbo(Truck, 37, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(-10, 5.8999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 378")
		);
		Truck.add(new ModelRendererTurbo(Truck, 113, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(-10, 6.1499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		Truck.add(new ModelRendererTurbo(Truck, 83, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(-10, 6.3999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 380")
		);
		Truck.add(new ModelRendererTurbo(Truck, 76, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-9, 5.1000004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		Truck.add(new ModelRendererTurbo(Truck, 42, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-10, 5.1000004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 393")
		);
		Truck.add(new ModelRendererTurbo(Truck, 25, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-10, 5.3500004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 396")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-9, 5.3500004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		Truck.add(new ModelRendererTurbo(Truck, 20, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-9, 5.6000004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-10, 5.6000004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 401")
		);
		Truck.add(new ModelRendererTurbo(Truck, 247, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-10, 5.8500004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 403")
		);
		Truck.add(new ModelRendererTurbo(Truck, 175, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-9, 5.8500004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 404")
		);
		Truck.add(new ModelRendererTurbo(Truck, 161, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-9, 5.6499996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 407")
		);
		Truck.add(new ModelRendererTurbo(Truck, 236, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-10, 5.6499996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 408")
		);
		Truck.add(new ModelRendererTurbo(Truck, 155, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-10, 5.8999996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-9, 5.8999996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 412")
		);
		Truck.add(new ModelRendererTurbo(Truck, 248, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-9, 6.1499996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 415")
		);
		Truck.add(new ModelRendererTurbo(Truck, 202, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-10, 6.1499996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 416")
		);
		Truck.add(new ModelRendererTurbo(Truck, 165, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-10, 6.3999996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 419")
		);
		Truck.add(new ModelRendererTurbo(Truck, 155, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-9, 6.3999996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 420")
		);
		Truck.add(new ModelRendererTurbo(Truck, 143, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 15, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-12, 5.25f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 989cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 208, 62, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-8.125f, 3.4500008f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 899cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 203, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-7.875f, 3.25f, -8.7f).setRotationAngle(0, 0, 0).setName("Box 900cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 230, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-10.5f, 7.25f, -8.7f).setRotationAngle(0, 0, 0).setName("Box 901cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-10.5f, 7.2299995f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 902cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 198, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-10.625f, 3.25f, -8.7f).setRotationAngle(0, 0, 0).setName("Box 905cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 193, 62, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-10.875f, 3.4500008f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 906cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 216, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-10.5f, 3.8500004f, -9).setRotationAngle(0, 0, 0).setName("Box 909cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 169, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 509cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 195, 42, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-1, 5.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 510cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 164, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 511cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 37, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(0, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 566cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(-1, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 567cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 155, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 568cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 569cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 21, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-2, 8.5f, 7).setRotationAngle(0, 0, 0).setName("Box 589cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 144, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2, 5, 7).setRotationAngle(0, 0, 0).setName("Box 801cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 129, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 4, 7).setRotationAngle(0, 0, 0).setName("Box 802cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 124, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(1, 5, 7).setRotationAngle(0, 0, 0).setName("Box 803cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 15, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(1, 4, 7).setRotationAngle(0, 0, 0).setName("Box 804cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 188, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(0.04999924f, 4.0600004f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 930cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 139, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(0.04999924f, 3.7200003f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 931cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 134, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-0.35000038f, 4.75f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 932cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 119, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(0.04999924f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 933cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 114, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(0.04999924f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 934cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 109, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-1.4500008f, 4.75f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 935cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 104, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-1.0499992f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 936cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 99, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-1.0499992f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 937cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 94, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-1.0499992f, 4.0600004f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 938cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 89, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-1.0499992f, 3.7200003f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 939cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0)
			.setRotationPoint(-0.5f, 6, -9.4f).setRotationAngle(0, 0, 0).setName("Box 884cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 241, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 2.5f, 7).setRotationAngle(0, 0, 0).setName("Box 507cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 79, 17, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-3.5f, 3, 5.9700003f).setRotationAngle(0, 0, 0).setName("Box 667cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 230, 21, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-2, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 805cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 146, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 442cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 21, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-2, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 443cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 84, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 444cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 182, 42, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-1, 5.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 445cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 79, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 446cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 98, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-2, 8.5f, -8).setRotationAngle(0, 0, 0).setName("Box 554cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 60, 16, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-3.5f, 3, -5.9700003f).setRotationAngle(0, 0, 0).setName("Box 666cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 74, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2, 5, -8).setRotationAngle(0, 0, 0).setName("Box 783cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 69, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 4, -8).setRotationAngle(0, 0, 0).setName("Box 785cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 64, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(1, 5, -8).setRotationAngle(0, 0, 0).setName("Box 786cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 59, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(1, 4, -8).setRotationAngle(0, 0, 0).setName("Box 787cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 54, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(0.04999924f, 4.0600004f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 920cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 49, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(0.04999924f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 921cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 44, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-0.35000038f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 922cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 39, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.5f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(0.04999924f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 923cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 34, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.5f)
			.setRotationPoint(0.04999924f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 924cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 29, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-1.4500008f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 925cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 24, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-1.0499992f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 926cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-1.0499992f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 927cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 241, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.5f)
			.setRotationPoint(-1.0499992f, 4.0600004f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 928cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 236, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-1.0499992f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 929cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 231, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-6.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 931cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 183, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-4.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 932cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 178, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(-5.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 933cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 173, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-5.75f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 934cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 160, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(-5.75f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1023cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 155, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-4.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1027cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 150, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(-4.75f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1028cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-4.75f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1029cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(3.75f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1030cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 251, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(3.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1031cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 246, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(3.75f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1032cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 226, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(4.75f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1036cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 221, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(5.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 985cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 216, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(3.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 986cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 211, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(4.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 987cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 206, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(4.75f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 988cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 201, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(4.4000015f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 989cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 196, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(-5.4000015f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 996cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 168, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(-5.75f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 997cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 145, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(4.75f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 948cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 191, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(3.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 950cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 140, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(5.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 951cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(4.75f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1005cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 120, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(3.75f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1006cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(3.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1007cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 110, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(3.75f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1008cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 105, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(4.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 984cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 100, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(-5.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 900cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 95, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-4.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 908cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 90, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-5.75f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 909cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 85, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-6.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 910cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 80, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(4.4000015f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 952cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 75, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(-5.75f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 995cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 70, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-4.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 999cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 65, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-4.75f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1000cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 60, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(-4.75f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1001cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 55, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(-5.75f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 990cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 50, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(-5.4000015f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 991cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 45, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(4.25f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 934cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 40, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(4.25f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 909cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 227, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.2f, -0.8f, 0, -0.2f, -0.8f, 0, -0.2f, -0.8f, -0.8f, -0.2f, -0.8f, -0.8f)
			.setRotationPoint(4.5f, 7.75f, -5.85f).setRotationAngle(0, 0, 0).setName("Box 982cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 96, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.2f, -0.8f, 0, -0.2f, -0.8f, 0, -0.2f, -0.8f, -0.8f, -0.2f, -0.8f, -0.8f)
			.setRotationPoint(4.5f, 7.75f, 5.6499996f).setRotationAngle(0, 0, 0).setName("Box 983cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 218, 31, textureX, textureY).addBox(0, 0, 0, 3, 2, 1)
			.setRotationPoint(-5, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 439cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 239, 29, textureX, textureY).addBox(0, 0, 0, 3, 2, 1)
			.setRotationPoint(-5, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 799cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 9, 29, textureX, textureY).addBox(0, 0, 0, 3, 2, 1)
			.setRotationPoint(2, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 439cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 230, 27, textureX, textureY).addBox(0, 0, 0, 3, 2, 1)
			.setRotationPoint(2, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 799cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 26, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 2.25f, -8).setRotationAngle(0, 0, 0).setName("Box 796cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2, 2.25f, -8).setRotationAngle(0, 0, 0).setName("Box 796cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 98, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 1.9375f, 7).setRotationAngle(0, 0, 0).setName("Box 796cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 49, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 2.25f, 7).setRotationAngle(0, 0, 0).setName("Box 796cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 124, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2, 2.25f, 7).setRotationAngle(0, 0, 0).setName("Box 796cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 35, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.2f, 0, 0, 0.05f, 0, 0, 0.05f, -0.4f, -0.5f, -0.2f, -0.4f)
			.setRotationPoint(-5.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 30, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, 0.05f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0.05f, -0.4f)
			.setRotationPoint(4.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 25, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.2f, 0, 0, 0.05f, 0, 0, 0.05f, -0.4f, -0.5f, -0.2f, -0.4f)
			.setRotationPoint(-23.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, 0.05f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0.05f, -0.4f)
			.setRotationPoint(-13.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 242, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.2f, 0, 0, 0.05f, 0, 0, 0.05f, -0.4f, -0.5f, -0.2f, -0.4f)
			.setRotationPoint(-5.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 237, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, 0.05f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0.05f, -0.4f)
			.setRotationPoint(4.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 232, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.2f, 0, 0, 0.05f, 0, 0, 0.05f, -0.4f, -0.5f, -0.2f, -0.4f)
			.setRotationPoint(-23.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 186, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, 0.05f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0.05f, -0.4f)
			.setRotationPoint(-13.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 131, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.5f, -0.75f, 0.25f, -1, -0.75f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.5f, 0.25f, 0.25f, -1, 0.25f, 0.25f)
			.setRotationPoint(-14.25f, 3.25f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 829cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 181, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.25f, -1, -0.75f, 0.25f, -1, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0.25f, -1, 0.25f, 0.25f)
			.setRotationPoint(-6.25f, 3.25f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 829cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 176, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.25f, -1, -0.75f, 0.25f, -1, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0.25f, -1, 0.25f, 0.25f)
			.setRotationPoint(3.75f, 3.25f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 829cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 164, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.25f, -1, -0.75f, 0.25f, -1, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0.25f, -1, 0.25f, 0.25f)
			.setRotationPoint(-6.25f, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 829cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 159, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.25f, -1, -0.75f, 0.25f, -1, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0.25f, -1, 0.25f, 0.25f)
			.setRotationPoint(3.75f, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 829cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 154, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 885cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 149, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(5, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 886cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 249, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(5, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 887cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 171, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(5, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 888cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 145, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 889cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 140, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 4.25f, 7).setRotationAngle(0, 0, 0).setName("Box 890cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 40, 16, textureX, textureY).addBox(0, 0, 0, 6, 2, 1)
			.setRotationPoint(6, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 799cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 55, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(9.875f, 3.4499998f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 899cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 130, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(10.125f, 3.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 900cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 66, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(7.5f, 7.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 901cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 21, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f)
			.setRotationPoint(7.5f, 7.2299995f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 902cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 125, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(7.375f, 3.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 905cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 120, 55, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(7.125f, 3.4499998f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 906cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 171, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(7.5f, 3.8500004f, 8).setRotationAngle(0, 0, 0).setName("Box 909cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 108, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(9, 5.1000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 365cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 101, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(9, 5.3500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 366cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 210, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(9, 5.6000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 367cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 198, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(9, 5.8500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 368cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 189, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(9, 5.6499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 369cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 85, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(9, 5.8999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 370cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 94, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(9, 6.1499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 371cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 71, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(9, 6.3999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 372cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 64, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(8, 5.1000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 373cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 57, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(8, 5.3500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 374cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 60, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(8, 5.6000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 375cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 40, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(8, 5.8500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 376cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 27, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(8, 5.6499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 377cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(8, 5.8999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 378cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 37, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(8, 6.1499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 379cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 20, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(8, 6.3999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 380cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 199, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 15, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(6, 5.25f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 989cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(5, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 858cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 110, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(5, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 859cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 105, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 860cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 100, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(5, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 861cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 95, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 862cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 90, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 4.25f, -8).setRotationAngle(0, 0, 0).setName("Box 863cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 96, 6, textureX, textureY).addBox(0, 0, 0, 6, 2, 1)
			.setRotationPoint(6, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 439cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 85, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 4.25f, -8).setRotationAngle(0, 0, 0).setName("Box 851cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 80, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 852cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 75, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(12, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 854cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 70, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(12, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 855cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 65, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(12, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 856cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 60, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 857cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 55, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(12, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 879cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 50, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(12, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 880cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 45, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 881cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 40, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 882cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 35, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(12, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 883cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 30, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 4.25f, 7).setRotationAngle(0, 0, 0).setName("Box 884cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(9, 5.1000004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 392cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 243, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(8, 5.1000004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 393cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 236, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(8, 5.3500004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 396cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 229, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(9, 5.3500004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 397cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(9, 5.6000004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 400cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 98, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(8, 5.6000004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 401cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 79, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(8, 5.8500004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 403cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 21, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(9, 5.8500004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(9, 5.6499996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 407cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 48, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(8, 5.6499996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 408cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 8, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(8, 5.8999996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 123, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(9, 5.8999996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 412cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 222, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(9, 6.1499996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 415cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 215, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(8, 6.1499996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 416cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 175, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(8, 6.3999996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 419cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 160, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(9, 6.3999996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 420cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 25, 55, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(9.875f, 3.4499998f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 899cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 20, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(10.125f, 3.25f, -8.7f).setRotationAngle(0, 0, 0).setName("Box 900cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 239, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(7.5f, 7.25f, -8.7f).setRotationAngle(0, 0, 0).setName("Box 901cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 238, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(7.5f, 7.2299995f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 902cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 15, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(7.375f, 3.25f, -8.7f).setRotationAngle(0, 0, 0).setName("Box 905cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 55, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(7.125f, 3.4499998f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 906cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 230, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(7.5f, 3.8500004f, -9).setRotationAngle(0, 0, 0).setName("Box 909cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 146, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0)
			.setRotationPoint(13, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 850")
		);
		Truck.add(new ModelRendererTurbo(Truck, 189, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0)
			.setRotationPoint(13, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 793")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		Truck.add(new ModelRendererTurbo(Truck, 145, 40, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(17, 5.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(19, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		Truck.add(new ModelRendererTurbo(Truck, 210, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(18, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		Truck.add(new ModelRendererTurbo(Truck, 190, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(17, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 567")
		);
		Truck.add(new ModelRendererTurbo(Truck, 115, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		Truck.add(new ModelRendererTurbo(Truck, 78, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		Truck.add(new ModelRendererTurbo(Truck, 203, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(16, 8.5f, 7).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16, 5, 7).setRotationAngle(0, 0, 0).setName("Box 801")
		);
		Truck.add(new ModelRendererTurbo(Truck, 240, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 4, 7).setRotationAngle(0, 0, 0).setName("Box 802")
		);
		Truck.add(new ModelRendererTurbo(Truck, 235, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19, 5, 7).setRotationAngle(0, 0, 0).setName("Box 803")
		);
		Truck.add(new ModelRendererTurbo(Truck, 230, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(19, 4, 7).setRotationAngle(0, 0, 0).setName("Box 804")
		);
		Truck.add(new ModelRendererTurbo(Truck, 225, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(18.05f, 4.0600004f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 930")
		);
		Truck.add(new ModelRendererTurbo(Truck, 167, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(18.05f, 3.7200003f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 931")
		);
		Truck.add(new ModelRendererTurbo(Truck, 162, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(17.650002f, 4.75f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 932")
		);
		Truck.add(new ModelRendererTurbo(Truck, 157, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(18.05f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 933")
		);
		Truck.add(new ModelRendererTurbo(Truck, 152, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(18.05f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 934")
		);
		Truck.add(new ModelRendererTurbo(Truck, 220, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(16.55f, 4.75f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 935")
		);
		Truck.add(new ModelRendererTurbo(Truck, 215, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(16.95f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 936")
		);
		Truck.add(new ModelRendererTurbo(Truck, 205, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(16.95f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 937")
		);
		Truck.add(new ModelRendererTurbo(Truck, 200, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(16.95f, 4.0600004f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 938")
		);
		Truck.add(new ModelRendererTurbo(Truck, 195, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(16.95f, 3.7200003f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 939")
		);
		Truck.add(new ModelRendererTurbo(Truck, 168, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, -0.8125f, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0)
			.setRotationPoint(17.5f, 6, -9.4f).setRotationAngle(0, 0, 0).setName("Box 884")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 2.5f, 7).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		Truck.add(new ModelRendererTurbo(Truck, 203, 3, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(16, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 805")
		);
		Truck.add(new ModelRendererTurbo(Truck, 138, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.5f, -0.75f, 0.25f, -1, -0.75f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.5f, 0.25f, 0.25f, -1, 0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(13.25f, 3.25f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 829cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 250, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(20, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		Truck.add(new ModelRendererTurbo(Truck, 148, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(11.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 931")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(13.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 932")
		);
		Truck.add(new ModelRendererTurbo(Truck, 240, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(12.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 933")
		);
		Truck.add(new ModelRendererTurbo(Truck, 235, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(12.25f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 934")
		);
		Truck.add(new ModelRendererTurbo(Truck, 230, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(12.599998f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 996")
		);
		Truck.add(new ModelRendererTurbo(Truck, 225, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(12.25f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 997")
		);
		Truck.add(new ModelRendererTurbo(Truck, 111, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.2f, 0, 0, 0.05f, 0, 0, 0.05f, -0.4f, -0.5f, -0.2f, -0.4f)
			.setRotationPoint(12.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 84, 50, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(20.75f, 4, 7).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		Truck.add(new ModelRendererTurbo(Truck, 21, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(21.75f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 562")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 16, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(14.5f, 3, 5.9700003f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		Truck.add(new ModelRendererTurbo(Truck, 79, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(22.75f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 973")
		);
		Truck.add(new ModelRendererTurbo(Truck, 74, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(12.25f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1023")
		);
		Truck.add(new ModelRendererTurbo(Truck, 250, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(13.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1027")
		);
		Truck.add(new ModelRendererTurbo(Truck, 205, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(13.25f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1028")
		);
		Truck.add(new ModelRendererTurbo(Truck, 200, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(13.25f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1029")
		);
		Truck.add(new ModelRendererTurbo(Truck, 195, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(21.75f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1030")
		);
		Truck.add(new ModelRendererTurbo(Truck, 185, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(21.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1031")
		);
		Truck.add(new ModelRendererTurbo(Truck, 180, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(21.75f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1032")
		);
		Truck.add(new ModelRendererTurbo(Truck, 99, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, 0.05f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0.05f, -0.4f)
			.setRotationPoint(22.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1035")
		);
		Truck.add(new ModelRendererTurbo(Truck, 94, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(22.75f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1036")
		);
		Truck.add(new ModelRendererTurbo(Truck, 62, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(23.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 985")
		);
		Truck.add(new ModelRendererTurbo(Truck, 57, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(21.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 986")
		);
		Truck.add(new ModelRendererTurbo(Truck, 11, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(22.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 987")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(22.75f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 988")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(22.400002f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 989")
		);
		Truck.add(new ModelRendererTurbo(Truck, 119, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 2.75f, 9.5f).setRotationAngle(0, 90, 0).setName("Box 812")
		);
		Truck.add(new ModelRendererTurbo(Truck, 104, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(17, 3.6499996f, 8.4f).setRotationAngle(0, 0, 0).setName("Box 894")
		);
		Truck.add(new ModelRendererTurbo(Truck, 240, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, -0.8f, 0, 0, -0.8f, -0.2f, 0, 0, 0, 0, 0, 0.2f, -0.8f, -0.8f, 0, -0.8f, -0.8f, -0.2f, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(18.2f, 3.6499996f, 8.6f).setRotationAngle(-90, 0, -90).setName("Box 895")
		);
		Truck.add(new ModelRendererTurbo(Truck, 27, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(13.5f, 3.25f, 9).setRotationAngle(0, 90, 0).setName("Box 896")
		);
		Truck.add(new ModelRendererTurbo(Truck, 235, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(15.5f, 3.75f, 9.21f).setRotationAngle(0, 90, -45).setName("Box 897")
		);
		Truck.add(new ModelRendererTurbo(Truck, 204, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 2.75f, 8.5f).setRotationAngle(0, 90, 0).setName("Box 811")
		);
		Truck.add(new ModelRendererTurbo(Truck, 155, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(16, 3.75f, 9.5f).setRotationAngle(0, 90, 0).setName("Box 813")
		);
		Truck.add(new ModelRendererTurbo(Truck, 121, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(16, 3.75f, 8.5f).setRotationAngle(0, 90, 0).setName("Box 814")
		);
		Truck.add(new ModelRendererTurbo(Truck, 210, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 2.75f, -7.5f).setRotationAngle(0, 90, 0).setName("Box 577")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(16, 3.75f, -7.5f).setRotationAngle(0, 90, 0).setName("Box 578")
		);
		Truck.add(new ModelRendererTurbo(Truck, 30, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 2.75f, -8.5f).setRotationAngle(0, 90, 0).setName("Box 579")
		);
		Truck.add(new ModelRendererTurbo(Truck, 150, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(16, 3.75f, -8.5f).setRotationAngle(0, 90, 0).setName("Box 580")
		);
		Truck.add(new ModelRendererTurbo(Truck, 230, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(15.5f, 3.75f, -7.79f).setRotationAngle(0, 90, -45).setName("Box 870")
		);
		Truck.add(new ModelRendererTurbo(Truck, 249, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(13.5f, 3.25f, -8).setRotationAngle(0, 90, 0).setName("Box 871")
		);
		Truck.add(new ModelRendererTurbo(Truck, 225, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, -0.8f, 0, 0, -0.8f, -0.2f, 0, 0, 0, 0, 0, 0.2f, -0.8f, -0.8f, 0, -0.8f, -0.8f, -0.2f, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(18.2f, 3.6499996f, -8.4f).setRotationAngle(-90, 0, -90).setName("Box 877")
		);
		Truck.add(new ModelRendererTurbo(Truck, 248, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(17, 3.6499996f, -8.6f).setRotationAngle(0, 0, 0).setName("Box 878")
		);
		Truck.add(new ModelRendererTurbo(Truck, 111, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1, -0.75f, 0.25f, 0.5f, -0.75f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1, 0.25f, 0.25f, 0.5f, 0.25f, 0.25f)
			.setRotationPoint(13.25f, 3.25f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 829cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		Truck.add(new ModelRendererTurbo(Truck, 203, 0, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(16, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 443")
		);
		Truck.add(new ModelRendererTurbo(Truck, 220, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 444")
		);
		Truck.add(new ModelRendererTurbo(Truck, 248, 0, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(17, 5.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 445")
		);
		Truck.add(new ModelRendererTurbo(Truck, 215, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(19, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 446")
		);
		Truck.add(new ModelRendererTurbo(Truck, 175, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(20, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 447")
		);
		Truck.add(new ModelRendererTurbo(Truck, 122, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(20.75f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 448")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(16, 8.5f, -8).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		Truck.add(new ModelRendererTurbo(Truck, 117, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16, 5, -8).setRotationAngle(0, 0, 0).setName("Box 783")
		);
		Truck.add(new ModelRendererTurbo(Truck, 107, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 4, -8).setRotationAngle(0, 0, 0).setName("Box 785")
		);
		Truck.add(new ModelRendererTurbo(Truck, 70, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19, 5, -8).setRotationAngle(0, 0, 0).setName("Box 786")
		);
		Truck.add(new ModelRendererTurbo(Truck, 6, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(19, 4, -8).setRotationAngle(0, 0, 0).setName("Box 787")
		);
		Truck.add(new ModelRendererTurbo(Truck, 112, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(18.05f, 4.0600004f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 920")
		);
		Truck.add(new ModelRendererTurbo(Truck, 85, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(18.05f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 921")
		);
		Truck.add(new ModelRendererTurbo(Truck, 80, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.5f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(18.05f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 923")
		);
		Truck.add(new ModelRendererTurbo(Truck, 75, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.5f)
			.setRotationPoint(18.05f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 924")
		);
		Truck.add(new ModelRendererTurbo(Truck, 27, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(16.95f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 926")
		);
		Truck.add(new ModelRendererTurbo(Truck, 250, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(16.95f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 927")
		);
		Truck.add(new ModelRendererTurbo(Truck, 205, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.5f)
			.setRotationPoint(16.95f, 4.0600004f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 928")
		);
		Truck.add(new ModelRendererTurbo(Truck, 200, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(16.95f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		Truck.add(new ModelRendererTurbo(Truck, 195, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, 0.05f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0.05f, -0.4f)
			.setRotationPoint(22.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 187, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(22.75f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 948")
		);
		Truck.add(new ModelRendererTurbo(Truck, 182, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(22.75f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 949")
		);
		Truck.add(new ModelRendererTurbo(Truck, 167, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(21.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 950")
		);
		Truck.add(new ModelRendererTurbo(Truck, 155, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(23.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 951")
		);
		Truck.add(new ModelRendererTurbo(Truck, 131, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(22.75f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1005")
		);
		Truck.add(new ModelRendererTurbo(Truck, 108, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(21.75f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1006")
		);
		Truck.add(new ModelRendererTurbo(Truck, 71, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(21.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1007")
		);
		Truck.add(new ModelRendererTurbo(Truck, 109, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(22.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 984")
		);
		Truck.add(new ModelRendererTurbo(Truck, 100, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(22.400002f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 952")
		);
		Truck.add(new ModelRendererTurbo(Truck, 72, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(17.650002f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 922")
		);
		Truck.add(new ModelRendererTurbo(Truck, 63, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(16.55f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 925")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.2f, 0, 0, 0.05f, 0, 0, 0.05f, -0.4f, -0.5f, -0.2f, -0.4f)
			.setRotationPoint(12.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1035cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 167, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(12.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 900")
		);
		Truck.add(new ModelRendererTurbo(Truck, 230, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(13.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 908")
		);
		Truck.add(new ModelRendererTurbo(Truck, 251, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(12.25f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 909")
		);
		Truck.add(new ModelRendererTurbo(Truck, 195, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(11.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 910")
		);
		Truck.add(new ModelRendererTurbo(Truck, 181, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(12.25f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 995")
		);
		Truck.add(new ModelRendererTurbo(Truck, 71, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(13.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 999")
		);
		Truck.add(new ModelRendererTurbo(Truck, 251, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(13.25f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1000")
		);
		Truck.add(new ModelRendererTurbo(Truck, 126, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(13.25f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1001")
		);
		Truck.add(new ModelRendererTurbo(Truck, 32, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(12.25f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		Truck.add(new ModelRendererTurbo(Truck, 227, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(12.599998f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 991")
		);
		Truck.add(new ModelRendererTurbo(Truck, 227, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(21.75f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1008")
		);
		Truck.add(new ModelRendererTurbo(Truck, 171, 14, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(14.5f, 3, -5.9700003f).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		groups.add(Truck);
	}

}
