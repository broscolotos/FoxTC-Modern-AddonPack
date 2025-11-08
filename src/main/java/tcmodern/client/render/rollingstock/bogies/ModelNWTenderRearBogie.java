//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.bogies;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */

public class ModelNWTenderRearBogie extends FVTMFormatBase {

	public ModelNWTenderRearBogie(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("Riggs64");
		//
		initGroup_RearBogie();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_RearBogie(){
		TurboList RearBogie = new TurboList("RearBogie");
		RearBogie.add(new ModelRendererTurbo(RearBogie, 377, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.75f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 409, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 473, 17, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(18.75f, 4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 57, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(21.75f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 121, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 153, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(20.75f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 185, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(31.75f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 524")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 217, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 249, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 281, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(30.75f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 313, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(41.75f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 345, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 377, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 409, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(40.75f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.25f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 532")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 113, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(29.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 121, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(33.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 129, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(39.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 145, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 161, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 5.1100006f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 177, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 4.75f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 541")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 185, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 4.3999996f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 193, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 4.0600014f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 209, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 3.6800003f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 217, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 3.3100014f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 225, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(25.850006f, 3.83f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 546")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 249, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 5.1100006f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 257, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 4.75f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 273, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 4.3999996f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 281, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 4.0600014f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 289, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 3.6800003f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 305, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 3.3100014f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 313, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(35.850006f, 3.83f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 321, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.25f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 337, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 353, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 369, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 377, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.25f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 385, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 560")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 401, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 417, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 562")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 433, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.25f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 441, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 564")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 449, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(22.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 565")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 457, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(19.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 465, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(19.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 567")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 473, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 481, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(22.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 489, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(22.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 570")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 497, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 571")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 505, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(18.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 572")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 1, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(18.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 9, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 574")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 17, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(22.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 575")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 25, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 577")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 41, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(32.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 578")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 49, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(32.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 57, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(29.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 65, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(29.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(28.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 582")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 113, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(32.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 585")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 121, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 586")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 129, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(42.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 145, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(42.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 153, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(39.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 161, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(39.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 177, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(38.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 185, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 209, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(42.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 193, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(21.5f, 4, -7.1000004f).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 217, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(32.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 595")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 225, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 596")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 241, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(28.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 597")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 249, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(42.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 598")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 257, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 273, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(38.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 600")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 281, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, 4, -7.1000004f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 289, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.5f, 4, -7.1000004f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, -1, 0)
			.setRotationPoint(18.75f, 8, -7).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 34, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.7f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.7f, 0)
			.setRotationPoint(31.75f, 8, -7).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 345, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 378")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 353, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.25f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 361, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.75f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 380")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 377, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 383")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 409, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 387")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 417, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 425, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 389")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 1, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0)
			.setRotationPoint(13.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 489, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, 4, -5).setRotationAngle(0, 0, 0).setName("Box 393")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.25f, 4, -5).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 57, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(16.25f, 5, -5).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(15.25f, 5, -5).setRotationAngle(0, 0, 0).setName("Box 396")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 441, 17, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(38.75f, 4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 457, 17, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(28.75f, 4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 433, 33, textureX, textureY).addBox(0, 0, 0, 25, 4, 0)
			.setRotationPoint(19.25f, 4, -6.5f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 289, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29.25f, 2, -2.5f).setRotationAngle(0, 0, 0).setName("Box 654")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29.25f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 449, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 398")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 137, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40.75f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 489, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 5.1100006f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 497, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 4.75f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 505, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 4.3999996f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 1, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 4.0600014f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 9, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 3.6800003f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 17, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(36.25f, 3.3100014f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 25, 25, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(18.75f, 4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 41, 25, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(38.75f, 4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 57, 25, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(28.75f, 4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 305, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 3.3100014f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 313, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 3.6800003f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 321, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 4.0600014f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 337, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 4.3999996f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 345, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 4.75f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 353, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 5.1100006f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 313, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.25f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 355")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 369, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 356")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 489, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 358")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 497, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.25f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 359")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 1, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.25f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 361")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 9, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 362")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 17, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35.25f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 363")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 364")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 41, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.25f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.75f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 369")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 193, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 353, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.25f, 6, -6).setRotationAngle(0, 0, 0).setName("Box 382")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 385, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 384")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 393, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 385")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 401, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 432, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.7f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.7f, 0)
			.setRotationPoint(31.75f, 8, 6).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 466, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, -1, 0)
			.setRotationPoint(18.75f, 8, 6).setRotationAngle(0, 0, 0).setName("Box 391")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 369, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(35.850006f, 3.83f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 377, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(25.850006f, 3.83f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 385, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 401, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(18.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 409, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(22.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 489, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(22.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 417, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 622")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 497, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(18.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 505, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(19.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 65, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 73, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(22.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(22.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 627")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 628")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(19.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 629")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 105, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 630")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 113, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(28.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 631")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 121, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(32.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 632")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 129, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(32.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 633")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 137, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 145, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(28.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 635")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 153, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(29.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 636")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 161, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 637")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(32.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 177, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(32.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 185, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 193, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(29.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 201, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 209, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(38.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 217, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(42.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 644")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 225, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(42.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 645")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 233, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 646")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 241, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(38.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 249, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(39.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 648")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 257, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 649")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 265, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(42.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 650")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 273, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(42.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 651")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 281, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 289, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(39.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 653")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 257, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 353")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 265, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 354")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 401, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.25f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 357")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 505, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(33.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 360")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 49, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(29.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 57, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(39.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 367")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 368")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 289, 57, textureX, textureY).addBox(0, 0, 0, 25, 4, 0)
			.setRotationPoint(19.25f, 4, 6.5f).setRotationAngle(0, 0, 0).setName("Box 371")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 65, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, 4, 6.1f).setRotationAngle(0, 0, 0).setName("Box 372")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 129, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.5f, 4, 6.1f).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 137, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(21.5f, 4, 6.1f).setRotationAngle(0, 0, 0).setName("Box 374")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 161, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 375")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 225, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.25f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 376")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 233, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.75f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 377")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 369, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(44.25f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 381")
		);
		groups.add(RearBogie);
	}

}
