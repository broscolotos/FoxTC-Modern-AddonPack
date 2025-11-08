//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWY6bFrontBogie extends FVTMFormatBase {

	public ModelNWY6bFrontBogie(){
		super();
		textureX = 512;
		textureY = 1024;
		addToCreators("Riggs64");
		//
		initGroup_FrontBogie();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_FrontBogie(){
		TurboList FrontBogie = new TurboList("FrontBogie");
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 113, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0.5f, -1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-76, 7.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 596")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 377, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-75, 7.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 597")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 129, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76, 6, -9.5f).setRotationAngle(0, 0, 0).setName("Box 644")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 145, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0.2f, 0)
			.setRotationPoint(-75, 5.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 645")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 153, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.2f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0.2f, 0)
			.setRotationPoint(-75, 5.5f, 0.51f).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 161, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76, 6, 0.51f).setRotationAngle(0, 0, 0).setName("Box 648")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 329, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 1, 0, 0.5f, -1, 0, 0.5f, 0, 0, 0, 0, 0, -1, 1, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(-68.5f, 7.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 345, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 1, 0, -1, -1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 1, 0, 0.5f, -1, 0, 0.5f, 0)
			.setRotationPoint(-68.5f, 5.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 313, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-74, 2.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 305, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-72.25f, 7, -11).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 337, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-71.25f, 7, -11).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 369, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.25f, 6, -11).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 401, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.25f, 6, -11).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 417, 81, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-72.25f, 6.05f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 433, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.75f, 5.05f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 449, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-73.25f, 6.05f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 465, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.25f, 6.05f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 481, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-71.2f, 4.8999996f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 1, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-71.2f, 4.45f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 17, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-71.2f, 4, 1.71f).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 33, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-71.2f, 3.5500002f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 49, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-72.3f, 3.5500002f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 65, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-72.3f, 4.45f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 81, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-72.3f, 4.8999996f, 1.71f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 97, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-72.3f, 4, 1.71f).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 113, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -0.5f, 0, -0.5f, -1.8f, 0, -0.5f, -1.8f, 0, 0, -0.5f, 0, 0, 0.7f, -0.5f, -0.5f, -3, -0.5f, -0.5f, -3, -0.5f, 0, 0.7f, -0.5f, 0)
			.setRotationPoint(-73.25f, 4, 1.74f).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 129, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.45f, 0, -0.5f, -0.45f, 0, -0.5f, -0.45f, 0, 0, -0.45f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-72.75f, 3.5f, 1.74f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 145, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1.8f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1.8f, 0, 0, -3, -0.5f, -0.5f, 0.7f, -0.5f, -0.5f, 0.7f, -0.5f, 0, -3, -0.5f, 0)
			.setRotationPoint(-72.25f, 4, 1.74f).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 233, 113, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-74.25f, 4, 2.01f).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 297, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-74, 5.5f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 281, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.2f, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-69.5f, 5, 1.25f).setRotationAngle(0, 0, 0).setName("Box 654")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 313, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.8f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-74, 5, 1.25f).setRotationAngle(0, 0, 0).setName("Box 655")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 71, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-69, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 103, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-74, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 668")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 240, 579, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-71.95f, 3.8000002f, 2.35f).setRotationAngle(0, 0, 0).setName("Box 2048")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 240, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-70.85f, 3.8000002f, 2.35f).setRotationAngle(0, 0, 0).setName("Box 2049")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 177, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-73.25f, 6.05f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 622")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 297, 89, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-72.25f, 6.05f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 329, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.75f, 5.05f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 345, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.25f, 6.05f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 465, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -0.5f, 0, 0, -1.8f, 0, 0, -1.8f, 0, -0.5f, -0.5f, 0, -0.5f, 0.7f, -0.5f, 0, -3, -0.5f, 0, -3, -0.5f, -0.5f, 0.7f, -0.5f, -0.5f)
			.setRotationPoint(-73.25f, 4, -10.76f).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 481, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.45f, 0, 0, -0.45f, 0, 0, -0.45f, 0, -0.5f, -0.45f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-72.75f, 3.5f, -10.76f).setRotationAngle(0, 0, 0).setName("Box 635")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 497, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1.8f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.8f, 0, -0.5f, -3, -0.5f, 0, 0.7f, -0.5f, 0, 0.7f, -0.5f, -0.5f, -3, -0.5f, -0.5f)
			.setRotationPoint(-72.25f, 4, -10.76f).setRotationAngle(0, 0, 0).setName("Box 636")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 105, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(-54.5f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 17, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0)
			.setRotationPoint(-65.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 49, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0)
			.setRotationPoint(-65.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 1, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, 5.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 225, 579, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-71.95f, 3.8000002f, -10.65f).setRotationAngle(0, 0, 0).setName("Box 2050")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 225, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-70.85f, 3.8000002f, -10.65f).setRotationAngle(0, 0, 0).setName("Box 2051")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 313, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0.5f, 1, 0, 0.5f, 0)
			.setRotationPoint(-68.5f, 5.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 431, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-74, 3.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 281, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-74, 2.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 471, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-69, 3.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 361, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-75, 7.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 595")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 161, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 1, 0)
			.setRotationPoint(-74, 3.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 353, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-71.2f, 4.8999996f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 361, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-71.2f, 4.45f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 627")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 401, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-71.2f, 4, -10.71f).setRotationAngle(0, 0, 0).setName("Box 628")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 409, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-71.2f, 3.5500002f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 629")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 417, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-72.3f, 3.5500002f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 630")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 433, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-72.3f, 4, -10.71f).setRotationAngle(0, 0, 0).setName("Box 631")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 441, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-72.3f, 4.45f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 632")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 449, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-72.3f, 4.8999996f, -10.71f).setRotationAngle(0, 0, 0).setName("Box 633")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 201, 113, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-74.25f, 4, -10.01f).setRotationAngle(0, 0, 0).setName("Box 637")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 265, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-74, 5.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 97, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, 0, 0, -1, 0)
			.setRotationPoint(-70.5f, 3.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 113, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 1, 0)
			.setRotationPoint(-74, 3.5f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 121, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, 0, 0, -1, 0)
			.setRotationPoint(-70.5f, 3.5f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 177, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0.5f, 1, 0, 0.5f, 0, 0, 0, 0, 0, -1, -1, 0, -1, 1, 0, 0, 0)
			.setRotationPoint(-68.5f, 7.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 651")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 217, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.8f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-74, 5, -10.75f).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 249, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.2f, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-69.5f, 5, -10.75f).setRotationAngle(0, 0, 0).setName("Box 653")
		);
		groups.add(FrontBogie);
	}

}
