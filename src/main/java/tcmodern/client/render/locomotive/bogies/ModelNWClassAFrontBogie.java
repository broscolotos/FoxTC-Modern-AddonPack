//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWClassAFrontBogie extends FVTMFormatBase {

	public ModelNWClassAFrontBogie(){
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
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 1, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 1, 0, 0, 0, 0, 2, 0, 0, 1, -1, 0, 1, 1, 0, 2, 0)
			.setRotationPoint(-61.1f, 5.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 505, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-61.6f, 3.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 57, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-64.85f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 89, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-63.85f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 121, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63.85f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 161, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.85f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 321, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-65.85f, 6.05f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 622")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 329, 33, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-64.85f, 6.05f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 393, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.35f, 5.05f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 337, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-62.85f, 6.05f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 433, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-63.8f, 4.9f, -6.71f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 449, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-63.8f, 4.45f, -6.71f).setRotationAngle(0, 0, 0).setName("Box 627")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 457, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-63.8f, 4, -6.71f).setRotationAngle(0, 0, 0).setName("Box 628")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 465, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-63.8f, 3.55f, -6.71f).setRotationAngle(0, 0, 0).setName("Box 629")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 497, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-64.9f, 3.55f, -6.71f).setRotationAngle(0, 0, 0).setName("Box 630")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 505, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-64.9f, 4, -6.71f).setRotationAngle(0, 0, 0).setName("Box 631")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 1, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-64.9f, 4.45f, -6.71f).setRotationAngle(0, 0, 0).setName("Box 632")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 9, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-64.9f, 4.9f, -6.71f).setRotationAngle(0, 0, 0).setName("Box 633")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 25, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -0.5f, 0, 0, -1.8f, 0, 0, -1.8f, 0, -0.5f, -0.5f, 0, -0.5f, 0.7f, -0.5f, 0, -3, -0.5f, 0, -3, -0.5f, -0.5f, 0.7f, -0.5f, -0.5f)
			.setRotationPoint(-65.85f, 4, -6.76f).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 41, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.45f, 0, 0, -0.45f, 0, 0, -0.45f, 0, -0.5f, -0.45f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-65.35f, 3.5f, -6.76f).setRotationAngle(0, 0, 0).setName("Box 635")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 57, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1.8f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.8f, 0, -0.5f, -3, -0.5f, 0, 0.7f, -0.5f, 0, 0.7f, -0.5f, -0.5f, -3, -0.5f, -0.5f)
			.setRotationPoint(-64.85f, 4, -6.76f).setRotationAngle(0, 0, 0).setName("Box 636")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 81, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(-46.1f, 5.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 145, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -1, 0, 0, 0, -4, 0, 0, 4, 0, -1, 0, 0, 1, 0, 0, 0, -4, 0, 0, 4, 0, 1, 0)
			.setRotationPoint(-58.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 89, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-45.1f, 5.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 17, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-64.55f, 3.8f, -6.65f).setRotationAngle(0, 0, 0).setName("Box 2050")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 25, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-63.45f, 3.8f, -6.65f).setRotationAngle(0, 0, 0).setName("Box 2051")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 225, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-66.6f, 5.5f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 297, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.2f, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-62.1f, 5, -6.75f).setRotationAngle(0, 0, 0).setName("Box 653")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 465, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-66.6f, 3.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 25, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.6f, 2.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 41, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.6f, 7.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 595")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 281, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0.5f, -1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-68.6f, 7.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 596")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 193, 41, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-67.35f, 3, -6.01f).setRotationAngle(0, 0, 0).setName("Box 637")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 289, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 1, 0)
			.setRotationPoint(-66.6f, 3.5f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 185, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, 0, 0, -1, 0)
			.setRotationPoint(-63.1f, 3.5f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 97, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-68.6f, 6, -5.5f).setRotationAngle(0, 0, 0).setName("Box 644")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 289, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.8f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-66.6f, 5, -6.75f).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 321, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-61.6f, 3.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 129, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0.2f, 0)
			.setRotationPoint(-67.6f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 645")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 49, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.6f, 7.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 597")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 57, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.6f, 2.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 81, 33, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-64.85f, 6.05f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 89, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.35f, 5.05f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 129, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-63.8f, 4.9f, 5.71f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 145, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-63.8f, 4.45f, 5.71f).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 169, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-63.8f, 4, 5.71f).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 185, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(-63.8f, 3.55f, 5.71f).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 193, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-64.9f, 3.55f, 5.71f).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 201, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-64.9f, 4.45f, 5.71f).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 225, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-64.9f, 4.9f, 5.71f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 233, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0)
			.setRotationPoint(-64.9f, 4, 5.71f).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 257, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 1, 0)
			.setRotationPoint(-66.6f, 3.5f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 265, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, 0, 0, -1, 0)
			.setRotationPoint(-63.1f, 3.5f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 273, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.2f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0.2f, 0)
			.setRotationPoint(-67.6f, 5.5f, 4.51f).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 281, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-68.6f, 6, 4.51f).setRotationAngle(0, 0, 0).setName("Box 648")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 313, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.8f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-66.6f, 5, 5.25f).setRotationAngle(0, 0, 0).setName("Box 655")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 329, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-66.6f, 3.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 668")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 209, 41, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-67.35f, 3, 6.01f).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 241, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-66.6f, 5.5f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 201, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 1, 0, -1, -1, 0, 0, 0, 0, 2, 0, 0, 1, 1, 0, 1, -1, 0, 2, 0)
			.setRotationPoint(-61.1f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1963")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 49, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -1, 0, 0, 0, 4, 0, 0, -4, 0, -1, 0, 0, 1, 0, 0, 0, 4, 0, 0, -4, 0, 1, 0)
			.setRotationPoint(-58.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1964")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 305, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.2f, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-62.1f, 5, 5.25f).setRotationAngle(0, 0, 0).setName("Box 654")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 241, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -0.5f, 0, -0.5f, -1.8f, 0, -0.5f, -1.8f, 0, 0, -0.5f, 0, 0, 0.7f, -0.5f, -0.5f, -3, -0.5f, -0.5f, -3, -0.5f, 0, 0.7f, -0.5f, 0)
			.setRotationPoint(-65.85f, 4, 5.74f).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 257, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.45f, 0, -0.5f, -0.45f, 0, -0.5f, -0.45f, 0, 0, -0.45f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-65.35f, 3.5f, 5.74f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 273, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1.8f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1.8f, 0, 0, -3, -0.5f, -0.5f, 0.7f, -0.5f, -0.5f, 0.7f, -0.5f, 0, -3, -0.5f, 0)
			.setRotationPoint(-64.85f, 4, 5.74f).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 1, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-64.55f, 3.8f, 6.35f).setRotationAngle(0, 0, 0).setName("Box 2048")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 9, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-63.45f, 3.8f, 6.35f).setRotationAngle(0, 0, 0).setName("Box 2049")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 113, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-65.85f, 6.05f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 121, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-62.85f, 6.05f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		groups.add(FrontBogie);
	}

}
