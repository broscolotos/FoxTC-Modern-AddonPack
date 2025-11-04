//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.bogies;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCnOTenderRearBogie extends FVTMFormatBase {

	public ModelCnOTenderRearBogie(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
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
		Truck.add(new ModelRendererTurbo(Truck, 454, 85, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-43.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		Truck.add(new ModelRendererTurbo(Truck, 435, 85, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-32.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		Truck.add(new ModelRendererTurbo(Truck, 419, 85, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-22.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		Truck.add(new ModelRendererTurbo(Truck, 220, 85, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-11.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 598")
		);
		Truck.add(new ModelRendererTurbo(Truck, 207, 85, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-22.5f, 4, -6).setRotationAngle(0, 0, 0).setName("Box 462")
		);
		Truck.add(new ModelRendererTurbo(Truck, 139, 85, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-32.5f, 4, -6).setRotationAngle(0, 0, 0).setName("Box 463")
		);
		Truck.add(new ModelRendererTurbo(Truck, 126, 85, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-43.5f, 4, -6).setRotationAngle(0, 0, 0).setName("Box 464")
		);
		Truck.add(new ModelRendererTurbo(Truck, 292, 83, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-11.5f, 4, -6).setRotationAngle(0, 0, 0).setName("Box 465")
		);
		Truck.add(new ModelRendererTurbo(Truck, 317, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.225f, 0, 0, 0.225f)
			.setRotationPoint(-8.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		Truck.add(new ModelRendererTurbo(Truck, 287, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.175f, -0.3f, -0.3f, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(-9.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		Truck.add(new ModelRendererTurbo(Truck, 254, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.175f, 0, 0, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(-8.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 146")
		);
		Truck.add(new ModelRendererTurbo(Truck, 282, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.225f, -0.3f, -0.3f, 0.225f)
			.setRotationPoint(-9.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		Truck.add(new ModelRendererTurbo(Truck, 247, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.225f, -0.3f, -0.3f, 0.225f)
			.setRotationPoint(-20.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 148")
		);
		Truck.add(new ModelRendererTurbo(Truck, 461, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.225f, 0, 0, 0.225f)
			.setRotationPoint(-19.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		Truck.add(new ModelRendererTurbo(Truck, 221, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.175f, 0, 0, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(-19.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		Truck.add(new ModelRendererTurbo(Truck, 36, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.175f, -0.3f, -0.3f, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(-20.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		Truck.add(new ModelRendererTurbo(Truck, 142, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.225f, -0.3f, -0.3f, 0.225f)
			.setRotationPoint(-30.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		Truck.add(new ModelRendererTurbo(Truck, 107, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.225f, 0, 0, 0.225f)
			.setRotationPoint(-29.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		Truck.add(new ModelRendererTurbo(Truck, 203, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.175f, 0, 0, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(-29.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 154")
		);
		Truck.add(new ModelRendererTurbo(Truck, 18, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.175f, -0.3f, -0.3f, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(-30.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		Truck.add(new ModelRendererTurbo(Truck, 273, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.225f, -0.3f, -0.3f, 0.225f)
			.setRotationPoint(-41.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		Truck.add(new ModelRendererTurbo(Truck, 238, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.225f, 0, 0, 0.225f, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.225f, 0, 0, 0.225f)
			.setRotationPoint(-40.5f, 7, -8.1f).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0.175f, 0, 0, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(-40.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		Truck.add(new ModelRendererTurbo(Truck, 373, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0.175f, -0.3f, -0.3f, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0, 0.175f, 0, 0, 0.175f)
			.setRotationPoint(-41.5f, 6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		Truck.add(new ModelRendererTurbo(Truck, 29, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.5f, 2.5f, -7).setRotationAngle(0, 0, 0).setName("Box 281")
		);
		Truck.add(new ModelRendererTurbo(Truck, 355, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, 3.5f, -7).setRotationAngle(0, 0, 0).setName("Box 282")
		);
		Truck.add(new ModelRendererTurbo(Truck, 435, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.5f, 3.5f, -7).setRotationAngle(0, 0, 0).setName("Box 283")
		);
		Truck.add(new ModelRendererTurbo(Truck, 335, 50, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
			.setRotationPoint(-26.5f, 2, -2).setRotationAngle(0, 0, 0).setName("Box 284")
		);
		Truck.add(new ModelRendererTurbo(Truck, 204, 58, textureX, textureY).addBox(0, 0, 0, 7, 2, 1)
			.setRotationPoint(-28, 5, 7.4f).setRotationAngle(0, 0, 0).setName("Box 629")
		);
		Truck.add(new ModelRendererTurbo(Truck, 401, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-27.5f, 7, 7.4f).setRotationAngle(0, 0, 0).setName("Box 630")
		);
		Truck.add(new ModelRendererTurbo(Truck, 396, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-22.5f, 7, 7.4f).setRotationAngle(0, 0, 0).setName("Box 631")
		);
		Truck.add(new ModelRendererTurbo(Truck, 382, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-32, 5, 7.4f).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		Truck.add(new ModelRendererTurbo(Truck, 229, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.5f, 7, 7.4f).setRotationAngle(0, 0, 0).setName("Box 635")
		);
		Truck.add(new ModelRendererTurbo(Truck, 374, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, 6, 7.4f).setRotationAngle(0, 0, 0).setName("Box 636")
		);
		Truck.add(new ModelRendererTurbo(Truck, 352, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17.5f, 7, 7.4f).setRotationAngle(0, 0, 0).setName("Box 637")
		);
		Truck.add(new ModelRendererTurbo(Truck, 226, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 6, 7.4f).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		Truck.add(new ModelRendererTurbo(Truck, 221, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 5, 7.4f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		Truck.add(new ModelRendererTurbo(Truck, 405, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(-30.5f, 4, 7.4f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		Truck.add(new ModelRendererTurbo(Truck, 212, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.5f, 2, 7.5500007f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		Truck.add(new ModelRendererTurbo(Truck, 193, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 2, 7.5500007f).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		Truck.add(new ModelRendererTurbo(Truck, 506, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 3, 7.5500007f).setRotationAngle(0, 0, 0).setName("Box 644")
		);
		Truck.add(new ModelRendererTurbo(Truck, 480, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-25.5f, 3, 7.5500007f).setRotationAngle(0, 0, 0).setName("Box 645")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0.05f, 0, 0, 0.05f, 0, 0, 0.05f, -0.875f, 0, 0.05f, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-31, 4, 7.4500003f).setRotationAngle(0, 0, 0).setName("Box 646")
		);
		Truck.add(new ModelRendererTurbo(Truck, 352, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0.05f, 0, 0, 0.05f, 0, 0, 0.05f, -0.875f, 0, 0.05f, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-21, 4, 7.4500003f).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		Truck.add(new ModelRendererTurbo(Truck, 238, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, 2.5f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 650")
		);
		Truck.add(new ModelRendererTurbo(Truck, 418, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 2.5f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 651")
		);
		Truck.add(new ModelRendererTurbo(Truck, 405, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, 5, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		Truck.add(new ModelRendererTurbo(Truck, 292, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.5f, 4, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 654")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-26.5f, 6, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 655")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29.5f, 3.5f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		Truck.add(new ModelRendererTurbo(Truck, 471, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, 5, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 657")
		);
		Truck.add(new ModelRendererTurbo(Truck, 153, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, 4, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		Truck.add(new ModelRendererTurbo(Truck, 23, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.5f, 6, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 659")
		);
		Truck.add(new ModelRendererTurbo(Truck, 248, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-32.5f, 2.5f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 660")
		);
		Truck.add(new ModelRendererTurbo(Truck, 509, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17.5f, 6, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		Truck.add(new ModelRendererTurbo(Truck, 466, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 5, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		Truck.add(new ModelRendererTurbo(Truck, 411, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, 4, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 668")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-19.5f, 2.5f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 669")
		);
		Truck.add(new ModelRendererTurbo(Truck, 170, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-20.5f, 4.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 249")
		);
		Truck.add(new ModelRendererTurbo(Truck, 461, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-20, 5, 8.5f).setRotationAngle(0, 0, 0).setName("Box 250")
		);
		Truck.add(new ModelRendererTurbo(Truck, 164, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-30.5f, 4.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 251")
		);
		Truck.add(new ModelRendererTurbo(Truck, 391, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-30, 5, 8.5f).setRotationAngle(0, 0, 0).setName("Box 252")
		);
		Truck.add(new ModelRendererTurbo(Truck, 364, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 6.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		Truck.add(new ModelRendererTurbo(Truck, 363, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-17, 5.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		Truck.add(new ModelRendererTurbo(Truck, 356, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, 4.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		Truck.add(new ModelRendererTurbo(Truck, 315, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-19, 3.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		Truck.add(new ModelRendererTurbo(Truck, 187, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-16, 7.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		Truck.add(new ModelRendererTurbo(Truck, 359, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 6.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		Truck.add(new ModelRendererTurbo(Truck, 349, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 5.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		Truck.add(new ModelRendererTurbo(Truck, 342, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 4.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		Truck.add(new ModelRendererTurbo(Truck, 343, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 6.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		Truck.add(new ModelRendererTurbo(Truck, 325, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-7, 5.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 622")
		);
		Truck.add(new ModelRendererTurbo(Truck, 193, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 4.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		Truck.add(new ModelRendererTurbo(Truck, 105, 82, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(-11, 4, 6.9500003f).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 1, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.5f, 2.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 1, 0, 0, 0, 0, -8, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 2.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		Truck.add(new ModelRendererTurbo(Truck, 502, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-10, 4, 7.9500003f).setRotationAngle(0, 0, 0).setName("Box 627")
		);
		Truck.add(new ModelRendererTurbo(Truck, 338, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -1.25f, 0, -1.25f, -1.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, 0.75f, 0, -1.25f, 0.75f, 0)
			.setRotationPoint(-16.25f, 3.25f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 273")
		);
		Truck.add(new ModelRendererTurbo(Truck, 119, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-15, 4.25f, 9.25f).setRotationAngle(0, 90, 0).setName("Box 274")
		);
		Truck.add(new ModelRendererTurbo(Truck, 333, 116, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14, 4.75f, 9.460001f).setRotationAngle(0, 90, -45).setName("Box 275")
		);
		Truck.add(new ModelRendererTurbo(Truck, 102, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-12, 4.25f, 9.25f).setRotationAngle(0, 90, 0).setName("Box 282")
		);
		Truck.add(new ModelRendererTurbo(Truck, 328, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-10.75f, 4.25f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 283")
		);
		Truck.add(new ModelRendererTurbo(Truck, 499, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.5f, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 247")
		);
		Truck.add(new ModelRendererTurbo(Truck, 323, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9, 5, 8).setRotationAngle(0, 0, 0).setName("Box 248")
		);
		Truck.add(new ModelRendererTurbo(Truck, 315, 116, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 3, null)
			.setRotationPoint(-13.5f, 4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Truck.add(new ModelRendererTurbo(Truck, 310, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 5, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		Truck.add(new ModelRendererTurbo(Truck, 305, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 4.6499996f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		Truck.add(new ModelRendererTurbo(Truck, 297, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 4.3100014f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		Truck.add(new ModelRendererTurbo(Truck, 292, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 3.9700012f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		Truck.add(new ModelRendererTurbo(Truck, 287, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 3.9700012f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		Truck.add(new ModelRendererTurbo(Truck, 282, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 4.3100014f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		Truck.add(new ModelRendererTurbo(Truck, 277, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 4.6499996f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		Truck.add(new ModelRendererTurbo(Truck, 272, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 5, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		Truck.add(new ModelRendererTurbo(Truck, 263, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-15.050003f, 4.950001f, 6.5500007f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		Truck.add(new ModelRendererTurbo(Truck, 258, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-13.75f, 4.950001f, 6.5500007f).setRotationAngle(0, 0, 0).setName("Box 235")
		);
		Truck.add(new ModelRendererTurbo(Truck, 253, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 6.3999996f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		Truck.add(new ModelRendererTurbo(Truck, 248, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 6.049999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		Truck.add(new ModelRendererTurbo(Truck, 243, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 6.3999996f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		Truck.add(new ModelRendererTurbo(Truck, 202, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 6.049999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		Truck.add(new ModelRendererTurbo(Truck, 188, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 5.709999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 174")
		);
		Truck.add(new ModelRendererTurbo(Truck, 183, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 5.369999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 175")
		);
		Truck.add(new ModelRendererTurbo(Truck, 41, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 5.369999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		Truck.add(new ModelRendererTurbo(Truck, 36, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 5.709999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		Truck.add(new ModelRendererTurbo(Truck, 28, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 6.75f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		Truck.add(new ModelRendererTurbo(Truck, 23, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 6.75f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		Truck.add(new ModelRendererTurbo(Truck, 10, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 3.6000004f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		Truck.add(new ModelRendererTurbo(Truck, 5, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 3.6000004f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 181")
		);
		Truck.add(new ModelRendererTurbo(Truck, 256, 98, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-15, 4.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 289cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 102, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-45, 3.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		Truck.add(new ModelRendererTurbo(Truck, 19, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 4.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		Truck.add(new ModelRendererTurbo(Truck, 463, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 5.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		Truck.add(new ModelRendererTurbo(Truck, 378, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 6.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		Truck.add(new ModelRendererTurbo(Truck, 378, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-38, 7.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38, 6.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		Truck.add(new ModelRendererTurbo(Truck, 271, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-39, 5.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		Truck.add(new ModelRendererTurbo(Truck, 264, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, 4.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		Truck.add(new ModelRendererTurbo(Truck, 401, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-44, 6.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		Truck.add(new ModelRendererTurbo(Truck, 257, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-44, 5.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		Truck.add(new ModelRendererTurbo(Truck, 245, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.75f, 0, 0, 1, 0, 0, 1, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, 4.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		Truck.add(new ModelRendererTurbo(Truck, 29, 79, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(-43, 4, 6.9500003f).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-42, 4, 7.9500003f).setRotationAngle(0, 0, 0).setName("Box 628")
		);
		Truck.add(new ModelRendererTurbo(Truck, 186, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-39, 4.25f, 9.25f).setRotationAngle(0, 90, 0).setName("Box 239")
		);
		Truck.add(new ModelRendererTurbo(Truck, 396, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -1.25f, 0, 0.75f, -1.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, 0.75f, 0, 0.75f, 0.75f, 0)
			.setRotationPoint(-33.75f, 3.25f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 240")
		);
		Truck.add(new ModelRendererTurbo(Truck, 489, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-36, 4.25f, 9.25f).setRotationAngle(0, 90, 0).setName("Box 241")
		);
		Truck.add(new ModelRendererTurbo(Truck, 355, 114, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-36, 4.75f, 9.460001f).setRotationAngle(0, 90, -45).setName("Box 242")
		);
		Truck.add(new ModelRendererTurbo(Truck, 148, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.5f, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		Truck.add(new ModelRendererTurbo(Truck, 239, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41, 5, 8).setRotationAngle(0, 0, 0).setName("Box 254")
		);
		Truck.add(new ModelRendererTurbo(Truck, 231, 114, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 3, null)
			.setRotationPoint(-38.5f, 4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Truck.add(new ModelRendererTurbo(Truck, 226, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-39.25f, 4.25f, 7.5000005f).setRotationAngle(0, 0, 0).setName("Box 238")
		);
		Truck.add(new ModelRendererTurbo(Truck, 221, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 6.75f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		Truck.add(new ModelRendererTurbo(Truck, 212, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 6.75f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 183")
		);
		Truck.add(new ModelRendererTurbo(Truck, 207, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-35.75f, 4.950001f, 6.5500007f).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		Truck.add(new ModelRendererTurbo(Truck, 46, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-37.050003f, 4.950001f, 6.5500007f).setRotationAngle(0, 0, 0).setName("Box 185")
		);
		Truck.add(new ModelRendererTurbo(Truck, 507, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 6.3999996f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 186")
		);
		Truck.add(new ModelRendererTurbo(Truck, 480, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 6.3999996f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 187")
		);
		Truck.add(new ModelRendererTurbo(Truck, 471, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 6.049999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 188")
		);
		Truck.add(new ModelRendererTurbo(Truck, 466, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 6.049999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 189")
		);
		Truck.add(new ModelRendererTurbo(Truck, 461, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 5.709999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 190")
		);
		Truck.add(new ModelRendererTurbo(Truck, 391, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 5.709999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 191")
		);
		Truck.add(new ModelRendererTurbo(Truck, 374, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 5.369999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 192")
		);
		Truck.add(new ModelRendererTurbo(Truck, 361, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 5.369999f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 193")
		);
		Truck.add(new ModelRendererTurbo(Truck, 202, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 5, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 194")
		);
		Truck.add(new ModelRendererTurbo(Truck, 188, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 5, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 195")
		);
		Truck.add(new ModelRendererTurbo(Truck, 183, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 4.6499996f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 196")
		);
		Truck.add(new ModelRendererTurbo(Truck, 174, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 4.6499996f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 197")
		);
		Truck.add(new ModelRendererTurbo(Truck, 169, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 3.6000004f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 198")
		);
		Truck.add(new ModelRendererTurbo(Truck, 164, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 3.9700012f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		Truck.add(new ModelRendererTurbo(Truck, 153, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 4.3100014f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		Truck.add(new ModelRendererTurbo(Truck, 148, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 3.6000004f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 201")
		);
		Truck.add(new ModelRendererTurbo(Truck, 143, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 3.9700012f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		Truck.add(new ModelRendererTurbo(Truck, 138, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 4.3100014f, 6.8000007f).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		Truck.add(new ModelRendererTurbo(Truck, 19, 94, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-37, 4.5f, 7.0000005f).setRotationAngle(0, 0, 0).setName("Box 289cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 1, 0, 0, 0, 0, -8, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		Truck.add(new ModelRendererTurbo(Truck, 102, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-19, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		Truck.add(new ModelRendererTurbo(Truck, 238, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		Truck.add(new ModelRendererTurbo(Truck, 425, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-7, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		Truck.add(new ModelRendererTurbo(Truck, 133, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		Truck.add(new ModelRendererTurbo(Truck, 378, 76, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(-11, 4, -7.95f).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		Truck.add(new ModelRendererTurbo(Truck, 278, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 4, -8.95f).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		Truck.add(new ModelRendererTurbo(Truck, 119, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 5, -9).setRotationAngle(0, 0, 0).setName("Box 257")
		);
		Truck.add(new ModelRendererTurbo(Truck, 442, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, 4.5f, -9).setRotationAngle(0, 0, 0).setName("Box 258")
		);
		Truck.add(new ModelRendererTurbo(Truck, 228, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		Truck.add(new ModelRendererTurbo(Truck, 114, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		Truck.add(new ModelRendererTurbo(Truck, 217, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-17, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		Truck.add(new ModelRendererTurbo(Truck, 29, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-16, 7.5f, -8).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		Truck.add(new ModelRendererTurbo(Truck, 41, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		Truck.add(new ModelRendererTurbo(Truck, 133, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		Truck.add(new ModelRendererTurbo(Truck, 301, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		Truck.add(new ModelRendererTurbo(Truck, 36, 113, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14, 4.75f, -8.04f).setRotationAngle(0, 90, -45).setName("Box 263")
		);
		Truck.add(new ModelRendererTurbo(Truck, 28, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-10.75f, 4.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		Truck.add(new ModelRendererTurbo(Truck, 161, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0)
			.setRotationPoint(-12, 4.25f, -8.25f).setRotationAngle(0, 90, 0).setName("Box 265")
		);
		Truck.add(new ModelRendererTurbo(Truck, 345, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-15, 4.25f, -8.25f).setRotationAngle(0, 90, 0).setName("Box 270")
		);
		Truck.add(new ModelRendererTurbo(Truck, 23, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, -1.25f, 0, 0.75f, -1.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, 0.75f, 0, 0.75f, 0.75f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-16.25f, 3.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 271")
		);
		Truck.add(new ModelRendererTurbo(Truck, 18, 113, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 3, null)
			.setRotationPoint(-13.5f, 4.75f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Truck.add(new ModelRendererTurbo(Truck, 7, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 6.75f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		Truck.add(new ModelRendererTurbo(Truck, 50, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 6.75f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		Truck.add(new ModelRendererTurbo(Truck, 383, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-13.75f, 4.950001f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		Truck.add(new ModelRendererTurbo(Truck, 194, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-15.050003f, 4.950001f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		Truck.add(new ModelRendererTurbo(Truck, 129, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 6.3999996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		Truck.add(new ModelRendererTurbo(Truck, 110, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 6.3999996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 231")
		);
		Truck.add(new ModelRendererTurbo(Truck, 507, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 6.049999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		Truck.add(new ModelRendererTurbo(Truck, 480, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 6.049999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 233")
		);
		Truck.add(new ModelRendererTurbo(Truck, 471, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 5.709999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		Truck.add(new ModelRendererTurbo(Truck, 466, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 5.709999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 235")
		);
		Truck.add(new ModelRendererTurbo(Truck, 461, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 5.369999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 236")
		);
		Truck.add(new ModelRendererTurbo(Truck, 379, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 5.369999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 237")
		);
		Truck.add(new ModelRendererTurbo(Truck, 374, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 5, -8.1f).setRotationAngle(0, 0, 0).setName("Box 238")
		);
		Truck.add(new ModelRendererTurbo(Truck, 266, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 5, -8.1f).setRotationAngle(0, 0, 0).setName("Box 239")
		);
		Truck.add(new ModelRendererTurbo(Truck, 202, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 4.6499996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 240")
		);
		Truck.add(new ModelRendererTurbo(Truck, 190, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 4.6499996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 241")
		);
		Truck.add(new ModelRendererTurbo(Truck, 174, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 3.6000004f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 242")
		);
		Truck.add(new ModelRendererTurbo(Truck, 169, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 3.9700012f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 243")
		);
		Truck.add(new ModelRendererTurbo(Truck, 164, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-13.350006f, 4.3100014f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 244")
		);
		Truck.add(new ModelRendererTurbo(Truck, 155, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 3.6000004f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 245")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 3.9700012f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 246")
		);
		Truck.add(new ModelRendererTurbo(Truck, 46, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-14.649994f, 4.3100014f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 247")
		);
		Truck.add(new ModelRendererTurbo(Truck, 405, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(-30.5f, 4, -8.4f).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		Truck.add(new ModelRendererTurbo(Truck, 493, 55, textureX, textureY).addBox(0, 0, 0, 7, 2, 1)
			.setRotationPoint(-28, 5, -8.4f).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		Truck.add(new ModelRendererTurbo(Truck, 41, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-27.5f, 7, -8.4f).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		Truck.add(new ModelRendererTurbo(Truck, 36, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-22.5f, 7, -8.4f).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		Truck.add(new ModelRendererTurbo(Truck, 28, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 5, -8.4f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		Truck.add(new ModelRendererTurbo(Truck, 23, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 6, -8.4f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		Truck.add(new ModelRendererTurbo(Truck, 23, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17.5f, 7, -8.4f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		Truck.add(new ModelRendererTurbo(Truck, 18, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-32, 5, -8.4f).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		Truck.add(new ModelRendererTurbo(Truck, 7, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, 6, -8.4f).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		Truck.add(new ModelRendererTurbo(Truck, 509, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.5f, 7, -8.4f).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		Truck.add(new ModelRendererTurbo(Truck, 231, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0.05f, -0.875f, 0, 0.05f, -0.875f, 0, 0.05f, 0, 0, 0.05f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, 4, -9.45f).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		Truck.add(new ModelRendererTurbo(Truck, 366, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0.05f, -0.875f, 0, 0.05f, -0.875f, 0, 0.05f, 0, 0, 0.05f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21, 4, -9.45f).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		Truck.add(new ModelRendererTurbo(Truck, 352, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-26.5f, 6, -8.5f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		Truck.add(new ModelRendererTurbo(Truck, 509, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17.5f, 6, -8.5f).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		Truck.add(new ModelRendererTurbo(Truck, 292, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 5, -8.5f).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		Truck.add(new ModelRendererTurbo(Truck, 467, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, 4, -8.5f).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-19.5f, 2.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		Truck.add(new ModelRendererTurbo(Truck, 338, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 2.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29.5f, 3.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		Truck.add(new ModelRendererTurbo(Truck, 238, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.5f, 4, -8.5f).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		Truck.add(new ModelRendererTurbo(Truck, 338, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, 5, -8.5f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		Truck.add(new ModelRendererTurbo(Truck, 338, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, 2.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-32.5f, 2.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		Truck.add(new ModelRendererTurbo(Truck, 74, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, 4, -8.5f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		Truck.add(new ModelRendererTurbo(Truck, 171, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, 5, -8.5f).setRotationAngle(0, 0, 0).setName("Box 134")
		);
		Truck.add(new ModelRendererTurbo(Truck, 509, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.5f, 6, -8.5f).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		Truck.add(new ModelRendererTurbo(Truck, 144, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.5f, 2, -8.55f).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		Truck.add(new ModelRendererTurbo(Truck, 135, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 2, -8.55f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		Truck.add(new ModelRendererTurbo(Truck, 370, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 3, -8.55f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		Truck.add(new ModelRendererTurbo(Truck, 316, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-25.5f, 3, -8.55f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		Truck.add(new ModelRendererTurbo(Truck, 307, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		Truck.add(new ModelRendererTurbo(Truck, 228, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 4.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		Truck.add(new ModelRendererTurbo(Truck, 292, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 259")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.5f, 4.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 260")
		);
		Truck.add(new ModelRendererTurbo(Truck, 468, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 1, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.5f, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		Truck.add(new ModelRendererTurbo(Truck, 283, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-44, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-44, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.75f, 0, 0, 1, 0, 0, 1, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		Truck.add(new ModelRendererTurbo(Truck, 216, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-45, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		Truck.add(new ModelRendererTurbo(Truck, 324, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 80")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-39, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		Truck.add(new ModelRendererTurbo(Truck, 244, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		Truck.add(new ModelRendererTurbo(Truck, 498, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-38, 7.5f, -8).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		Truck.add(new ModelRendererTurbo(Truck, 427, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		Truck.add(new ModelRendererTurbo(Truck, 504, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		Truck.add(new ModelRendererTurbo(Truck, 370, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		Truck.add(new ModelRendererTurbo(Truck, 231, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, 4, -8.95f).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		Truck.add(new ModelRendererTurbo(Truck, 68, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, 5, -9).setRotationAngle(0, 0, 0).setName("Box 261")
		);
		Truck.add(new ModelRendererTurbo(Truck, 493, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.5f, 4.5f, -9).setRotationAngle(0, 0, 0).setName("Box 262")
		);
		Truck.add(new ModelRendererTurbo(Truck, 486, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, -1.25f, 0, -1.25f, -1.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, 0.75f, 0, -1.25f, 0.75f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-33.75f, 3.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 272")
		);
		Truck.add(new ModelRendererTurbo(Truck, 504, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0)
			.setRotationPoint(-36, 4.25f, -8.25f).setRotationAngle(0, 90, 0).setName("Box 273")
		);
		Truck.add(new ModelRendererTurbo(Truck, 199, 92, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-36, 4.75f, -8.04f).setRotationAngle(0, 90, -45).setName("Box 274")
		);
		Truck.add(new ModelRendererTurbo(Truck, 144, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-39.25f, 4.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 279")
		);
		Truck.add(new ModelRendererTurbo(Truck, 493, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-39, 4.25f, -8.25f).setRotationAngle(0, 90, 0).setName("Box 280")
		);
		Truck.add(new ModelRendererTurbo(Truck, 507, 104, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 3, null)
			.setRotationPoint(-38.5f, 4.75f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Truck.add(new ModelRendererTurbo(Truck, 118, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 6.75f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		Truck.add(new ModelRendererTurbo(Truck, 97, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 6.75f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		Truck.add(new ModelRendererTurbo(Truck, 507, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-35.75f, 4.950001f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		Truck.add(new ModelRendererTurbo(Truck, 411, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-37.050003f, 4.950001f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		Truck.add(new ModelRendererTurbo(Truck, 199, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 6.3999996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		Truck.add(new ModelRendererTurbo(Truck, 506, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 6.3999996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 209")
		);
		Truck.add(new ModelRendererTurbo(Truck, 118, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 6.049999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 210")
		);
		Truck.add(new ModelRendererTurbo(Truck, 97, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 6.049999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 211")
		);
		Truck.add(new ModelRendererTurbo(Truck, 75, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 5.709999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 212")
		);
		Truck.add(new ModelRendererTurbo(Truck, 283, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 5.709999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		Truck.add(new ModelRendererTurbo(Truck, 152, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 5.369999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 214")
		);
		Truck.add(new ModelRendererTurbo(Truck, 118, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 5.369999f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		Truck.add(new ModelRendererTurbo(Truck, 76, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 5, -8.1f).setRotationAngle(0, 0, 0).setName("Box 216")
		);
		Truck.add(new ModelRendererTurbo(Truck, 118, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 5, -8.1f).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		Truck.add(new ModelRendererTurbo(Truck, 96, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 4.6499996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		Truck.add(new ModelRendererTurbo(Truck, 76, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 4.6499996f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		Truck.add(new ModelRendererTurbo(Truck, 207, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 3.6000004f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		Truck.add(new ModelRendererTurbo(Truck, 207, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 3.9700012f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 221")
		);
		Truck.add(new ModelRendererTurbo(Truck, 328, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-35.350006f, 4.3100014f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 3.6000004f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		Truck.add(new ModelRendererTurbo(Truck, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 3.9700012f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		Truck.add(new ModelRendererTurbo(Truck, 438, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.35f, 0, -0.2f, -0.35f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-36.649994f, 4.3100014f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		Truck.add(new ModelRendererTurbo(Truck, 19, 11, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-37, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 289cp")
		);
		Truck.add(new ModelRendererTurbo(Truck, 498, 0, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
			.setRotationPoint(-43, 4, -7.95f).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		Truck.add(new ModelRendererTurbo(Truck, 19, 0, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-15, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 289cp")
		);
		groups.add(Truck);
	}

}
