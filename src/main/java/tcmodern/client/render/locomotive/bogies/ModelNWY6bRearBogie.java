//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWY6bRearBogie extends FVTMFormatBase {

	public ModelNWY6bRearBogie(){
		super();
		textureX = 512;
		textureY = 1024;
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
		RearBogie.add(new ModelRendererTurbo(RearBogie, 193, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(69.5f, 7.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(70.5f, 7.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 177, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66.75f, 6, -11).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 209, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65.75f, 6, -11).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 241, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(65.75f, 7, -11).setRotationAngle(0, 0, 0).setName("Box 546")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 273, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(66.75f, 7, -11).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 73, 81, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(65.75f, 6.05f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 565")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(67.75f, 6.05f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65.25f, 5.05f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 567")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 113, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(64.75f, 6.05f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 129, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(65.7f, 4.8999996f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 145, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(65.7f, 4.45f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 570")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 161, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(65.7f, 4, 1.71f).setRotationAngle(0, 0, 0).setName("Box 571")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(65.7f, 3.5500002f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 572")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 177, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(66.8f, 3.5500002f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 193, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(66.8f, 4, 1.71f).setRotationAngle(0, 0, 0).setName("Box 574")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 209, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(66.8f, 4.45f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 575")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 225, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(66.8f, 4.8999996f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 257, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.45f, 0, -0.5f, -0.45f, 0, -0.5f, -0.45f, 0, 0, -0.45f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(65.25f, 3.5f, 1.74f).setRotationAngle(0, 0, 0).setName("Box 578")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 273, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -0.5f, 0, -0.5f, -1.8f, 0, -0.5f, -1.8f, 0, 0, -0.5f, 0, 0, 0.7f, -0.5f, -0.5f, -3, -0.5f, -0.5f, -3, -0.5f, 0, 0.7f, -0.5f, 0)
			.setRotationPoint(64.75f, 4, 1.74f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 497, 81, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(63.75f, 4, 2.01f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 393, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64, 2.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 159, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 669")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 191, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(64, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 670")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 465, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(64, 5.5f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 675")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 235, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(67.15f, 3.8000002f, 2.35f).setRotationAngle(0, 0, 0).setName("Box 2054")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 235, 579, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(66.05f, 3.8000002f, 2.35f).setRotationAngle(0, 0, 0).setName("Box 2055")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 185, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 1, 1, 0, 2, 0, 0, 2, 0, 0, 1, -1)
			.setRotationPoint(61, 5.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 313, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(55, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 329, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4)
			.setRotationPoint(56, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 241, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1.8f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1.8f, 0, 0, -3, -0.5f, -0.5f, 0.7f, -0.5f, -0.5f, 0.7f, -0.5f, 0, -3, -0.5f, 0)
			.setRotationPoint(65.75f, 4, 1.74f).setRotationAngle(0, 0, 0).setName("Box 577")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 297, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(54, 5.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4)
			.setRotationPoint(56, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 409, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(69.5f, 5.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 425, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(70.5f, 6, 0.5f).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 433, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, 0, 0, -1, 0)
			.setRotationPoint(67.5f, 3.5f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 671")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 441, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 1, 0)
			.setRotationPoint(64, 3.5f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 672")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 449, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.8f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(64, 5, 1.25f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 457, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.2f, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(68.5f, 5, 1.25f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 185, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 1, -1, 0, 2, 0, 0, 2, 0, 0, 1, 1)
			.setRotationPoint(61, 5.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1874")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(69.5f, 7.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 217, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64, 2.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 81, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(63.75f, 4, -10.01f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 401, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(66.8f, 4.8999996f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 417, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(66.8f, 4.45f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 433, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(66.8f, 4, -10.71f).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 449, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(65.7f, 4.8999996f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 465, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(65.7f, 4.45f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 481, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(65.7f, 4, -10.71f).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 497, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(66.8f, 3.5500002f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 505, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(65.7f, 3.5500002f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 560")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 7, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 3.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 39, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(64, 3.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 657")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 329, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 1, 0)
			.setRotationPoint(64, 3.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 337, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.8f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(64, 5, -10.75f).setRotationAngle(0, 0, 0).setName("Box 659")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 361, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, 0, 0, -1, 0)
			.setRotationPoint(67.5f, 3.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 660")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 345, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.2f, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(68.5f, 5, -10.75f).setRotationAngle(0, 0, 0).setName("Box 661")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 369, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(64, 5.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 662")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 393, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0.2f, 0, 0, 0.2f, 0, -0.5f, 0, 0)
			.setRotationPoint(69.5f, 5.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 663")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 401, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(70.5f, 6, -9.5f).setRotationAngle(0, 0, 0).setName("Box 664")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 345, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.45f, 0, 0, -0.45f, 0, 0, -0.45f, 0, -0.5f, -0.45f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(65.25f, 3.5f, -10.76f).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 361, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -0.5f, 0, 0, -1.8f, 0, 0, -1.8f, 0, -0.5f, -0.5f, 0, -0.5f, 0.7f, -0.5f, 0, -3, -0.5f, 0, -3, -0.5f, -0.5f, 0.7f, -0.5f, -0.5f)
			.setRotationPoint(64.75f, 4, -10.76f).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 377, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1.8f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.8f, 0, -0.5f, -3, -0.5f, 0, 0.7f, -0.5f, 0, 0.7f, -0.5f, -0.5f, -3, -0.5f, -0.5f)
			.setRotationPoint(65.75f, 4, -10.76f).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 1, 81, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(65.75f, 6.05f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 17, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65.25f, 5.05f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 562")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 49, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(64.75f, 6.05f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 65, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(67.75f, 6.05f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 564")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 230, 579, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(66.05f, 3.8000002f, -10.65f).setRotationAngle(0, 0, 0).setName("Box 2052")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 230, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(67.15f, 3.8000002f, -10.65f).setRotationAngle(0, 0, 0).setName("Box 2053")
		);
		groups.add(RearBogie);
	}

}
