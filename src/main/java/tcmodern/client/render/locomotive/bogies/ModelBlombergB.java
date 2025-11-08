//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelBlombergB extends FVTMFormatBase {

	public ModelBlombergB(){
		super();
		textureX = 128;
		textureY = 128;
		addToCreators("Riggs64");
		//
		initGroup_group0();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 69, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 68, textureX, textureY).addBox(0, 0, 0, 1, 2, 14)
			.setRotationPoint(-3, 2.75f, -7).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 2.75f, -3).setRotationAngle(0, 0, 0).setName("Box 435")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 66, textureX, textureY).addBox(0, 0, 0, 1, 2, 14)
			.setRotationPoint(2, 2.75f, -7).setRotationAngle(0, 0, 0).setName("Box 436")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 13, textureX, textureY).addBox(0, 0, 0, 26, 2, 11)
			.setRotationPoint(-13, 4.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 437")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 27, textureX, textureY).addBox(0, 0, 0, 6, 2, 1)
			.setRotationPoint(-3, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 41, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(8, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 443")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(8, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 444")
		);
		group0.add(new ModelRendererTurbo(group0, 67, 74, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(9, 5.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 445")
		);
		group0.add(new ModelRendererTurbo(group0, 68, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 446")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(12, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 447")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 99, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(12.75f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 448")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 99, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-13.75f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 449")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 450")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-13, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 452")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-12, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 453")
		);
		group0.add(new ModelRendererTurbo(group0, 60, 74, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-11, 5.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 454")
		);
		group0.add(new ModelRendererTurbo(group0, 58, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 455")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(0, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 118, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-2, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 497")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 74, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-11, 5.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-12, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 98, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-13.75f, 4, 7).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-13, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 2.5f, 7).setRotationAngle(0, 0, 0).setName("Box 502")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 2.5f, 7).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(8, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 74, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(9, 5.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 5.5f, 7).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(12, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 97, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(12.75f, 4, 7).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(-10, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(-11, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-12, 8.5f, -8).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(8, 8.5f, -8).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1)
			.setRotationPoint(-13, 6.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(10, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(9, 6.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 567")
		);
		group0.add(new ModelRendererTurbo(group0, 22, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(-10, 3.75f, -8.5f).setRotationAngle(0, 90, 0).setName("Box 573")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(-10, 3.75f, -7.5f).setRotationAngle(0, 90, 0).setName("Box 574")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 2.75f, -7.5f).setRotationAngle(0, 90, 0).setName("Box 575")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 2.75f, -8.5f).setRotationAngle(0, 90, 0).setName("Box 576")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 2.75f, -7.5f).setRotationAngle(0, 90, 0).setName("Box 577")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(8, 3.75f, -7.5f).setRotationAngle(0, 90, 0).setName("Box 578")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 2.75f, -8.5f).setRotationAngle(0, 90, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(8, 3.75f, -8.5f).setRotationAngle(0, 90, 0).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(8, 8.5f, 7).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-12, 8.5f, 7).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 2.75f, 9.5f).setRotationAngle(0, 90, 0).setName("Box 595")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 2.75f, 8.5f).setRotationAngle(0, 90, 0).setName("Box 596")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(-10, 3.75f, 8.5f).setRotationAngle(0, 90, 0).setName("Box 597")
		);
		group0.add(new ModelRendererTurbo(group0, 84, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(-10, 3.75f, 9.5f).setRotationAngle(0, 90, 0).setName("Box 598")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 27, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-13.5f, 3, -5.97f).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 27, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(6.5f, 3, -5.97f).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 27, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(6.5f, 3, 5.97f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 25, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-13.5f, 3, 5.97f).setRotationAngle(0, 0, 0).setName("Box 668")
		);
		group0.add(new ModelRendererTurbo(group0, 98, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, 5, -8).setRotationAngle(0, 0, 0).setName("Box 783")
		);
		group0.add(new ModelRendererTurbo(group0, 93, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 4, -8).setRotationAngle(0, 0, 0).setName("Box 785")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(11, 5, -8).setRotationAngle(0, 0, 0).setName("Box 786")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(11, 4, -8).setRotationAngle(0, 0, 0).setName("Box 787")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 4, -8).setRotationAngle(0, 0, 0).setName("Box 788")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9, 5, -8).setRotationAngle(0, 0, 0).setName("Box 789")
		);
		group0.add(new ModelRendererTurbo(group0, 68, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(-9, 4, -8).setRotationAngle(0, 0, 0).setName("Box 790")
		);
		group0.add(new ModelRendererTurbo(group0, 28, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-12, 5, -8).setRotationAngle(0, 0, 0).setName("Box 791")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0)
			.setRotationPoint(4, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 793")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 2.25f, -8).setRotationAngle(0, 0, 0).setName("Box 796")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 0, textureX, textureY).addBox(0, 0, 0, 6, 2, 1)
			.setRotationPoint(-3, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 799")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 2.25f, 7).setRotationAngle(0, 0, 0).setName("Box 800")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, 5, 7).setRotationAngle(0, 0, 0).setName("Box 801")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 4, 7).setRotationAngle(0, 0, 0).setName("Box 802")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(11, 5, 7).setRotationAngle(0, 0, 0).setName("Box 803")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(11, 4, 7).setRotationAngle(0, 0, 0).setName("Box 804")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 35, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(8, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 805")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 4, 7).setRotationAngle(0, 0, 0).setName("Box 806")
		);
		group0.add(new ModelRendererTurbo(group0, 58, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-12, 5, 7).setRotationAngle(0, 0, 0).setName("Box 807")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 808")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(-9, 4, 7).setRotationAngle(0, 0, 0).setName("Box 809")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9, 5, 7).setRotationAngle(0, 0, 0).setName("Box 810")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 2.75f, 8.5f).setRotationAngle(0, 90, 0).setName("Box 811")
		);
		group0.add(new ModelRendererTurbo(group0, 67, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 2.75f, 9.5f).setRotationAngle(0, 90, 0).setName("Box 812")
		);
		group0.add(new ModelRendererTurbo(group0, 60, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0)
			.setRotationPoint(8, 3.75f, 9.5f).setRotationAngle(0, 90, 0).setName("Box 813")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.4f, 0, -0.2f, -0.4f, 0, 0, 0, 0)
			.setRotationPoint(8, 3.75f, 8.5f).setRotationAngle(0, 90, 0).setName("Box 814")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 95, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-8.5f, 3.75f, -7.79f).setRotationAngle(0, 90, -45).setName("Box 815")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0)
			.setRotationPoint(-7.5f, 3.25f, -8).setRotationAngle(0, 90, 0).setName("Box 825")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-7.5f, 3.25f, 9).setRotationAngle(0, 90, 0).setName("Box 827")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 95, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-8.5f, 3.75f, 9.21f).setRotationAngle(0, 90, -45).setName("Box 828")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-2.5f, 3.25f, -8.8f).setRotationAngle(0, 0, 0).setName("Box 837")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 7.25f, -8.8f).setRotationAngle(0, 0, 0).setName("Box 839")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(2, 3.25f, -8.8f).setRotationAngle(0, 0, 0).setName("Box 840")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 95, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-2.75f, 3.4499998f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 844")
		);
		group0.add(new ModelRendererTurbo(group0, 115, 94, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(1.75f, 3.4499998f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 845")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(-8, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 848")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(-8, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 849")
		);
		group0.add(new ModelRendererTurbo(group0, 56, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0)
			.setRotationPoint(4, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 850")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 4.25f, -8).setRotationAngle(0, 0, 0).setName("Box 851")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 852")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 854")
		);
		group0.add(new ModelRendererTurbo(group0, 92, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(-4, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 855")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-4, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 856")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 857")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(3, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 858")
		);
		group0.add(new ModelRendererTurbo(group0, 72, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(3, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 859")
		);
		group0.add(new ModelRendererTurbo(group0, 67, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 860")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(3, 3.75f, -8).setRotationAngle(0, 0, 0).setName("Box 861")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(3, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 862")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 4.25f, -8).setRotationAngle(0, 0, 0).setName("Box 863")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 92, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(7.5f, 3.75f, -7.79f).setRotationAngle(0, 90, -45).setName("Box 870")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(5.5f, 3.25f, -8).setRotationAngle(0, 90, 0).setName("Box 871")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1, -0.25f, 0.25f, 0.5f, -0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1, -0.25f, 0.25f, 0.5f, -0.25f, 0.25f)
			.setRotationPoint(5.25f, 3.25f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 872")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-11, 3.6499996f, -8.6f).setRotationAngle(0, 0, 0).setName("Box 873")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-11, 2.6499996f, -8.6f).setRotationAngle(0, 0, 0).setName("Box 874")
		);
		group0.add(new ModelRendererTurbo(group0, 58, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, -0.8f, 0.2f, 0, -0.8f, 0, -0.8f, 0, -0.2f, -0.8f, 0, 0, -0.8f, -0.8f, 0.2f, -0.8f, -0.8f)
			.setRotationPoint(-11.2f, 3.6499996f, -8.4f).setRotationAngle(-90, 0, -90).setName("Box 875")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, -0.8f, 0, 0, -0.8f, -0.2f, 0, 0, 0, 0, 0, 0.2f, -0.8f, -0.8f, 0, -0.8f, -0.8f, -0.2f, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(10.2f, 3.6499996f, -8.4f).setRotationAngle(-90, 0, -90).setName("Box 877")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(9, 3.6499996f, -8.6f).setRotationAngle(0, 0, 0).setName("Box 878")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(-4, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 879")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 880")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 881")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 882")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-4, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 883")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 4.25f, 7).setRotationAngle(0, 0, 0).setName("Box 884")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 885")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(3, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 886")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(3, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 887")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(3, 3.75f, 7).setRotationAngle(0, 0, 0).setName("Box 888")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(3, 3.25f, 7).setRotationAngle(0, 0, 0).setName("Box 889")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 4.25f, 7).setRotationAngle(0, 0, 0).setName("Box 890")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-11, 3.6499996f, 8.4f).setRotationAngle(0, 0, 0).setName("Box 891")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, -0.8f, 0.2f, 0, -0.8f, 0, -0.8f, 0, -0.2f, -0.8f, 0, 0, -0.8f, -0.8f, 0.2f, -0.8f, -0.8f)
			.setRotationPoint(-11.2f, 3.6499996f, 8.6f).setRotationAngle(-90, 0, -90).setName("Box 892")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-11, 2.6499996f, 8.4f).setRotationAngle(0, 0, 0).setName("Box 893")
		);
		group0.add(new ModelRendererTurbo(group0, 67, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(9, 3.6499996f, 8.4f).setRotationAngle(0, 0, 0).setName("Box 894")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, -0.8f, 0, 0, -0.8f, -0.2f, 0, 0, 0, 0, 0, 0.2f, -0.8f, -0.8f, 0, -0.8f, -0.8f, -0.2f, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(10.2f, 3.6499996f, 8.6f).setRotationAngle(-90, 0, -90).setName("Box 895")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(5.5f, 3.25f, 9).setRotationAngle(0, 90, 0).setName("Box 896")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 91, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(7.5f, 3.75f, 9.21f).setRotationAngle(0, 90, -45).setName("Box 897")
		);
		group0.add(new ModelRendererTurbo(group0, 71, 91, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(1.75f, 3.4499998f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 899")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(2, 3.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 900")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 7.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 901")
		);
		group0.add(new ModelRendererTurbo(group0, 85, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-2, 7.2299995f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 902")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-2.5f, 3.25f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 905")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 89, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-2.75f, 3.4499998f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 906")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-2, 3.8500004f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 908")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-2, 3.8500004f, 8).setRotationAngle(0, 0, 0).setName("Box 909")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-10.35f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		group0.add(new ModelRendererTurbo(group0, 67, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-9.95f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 387")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-9.95f, 4.0599995f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-9.95f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 389")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-9.95f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-11.45f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 915")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-11.05f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 916")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-11.05f, 4.0599995f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 917")
		);
		group0.add(new ModelRendererTurbo(group0, 29, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-11.05f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 918")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.5f)
			.setRotationPoint(-11.05f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 919")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(10.05f, 4.0599995f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 920")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(10.05f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 921")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(9.65f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 922")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.5f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(10.05f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 923")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.5f)
			.setRotationPoint(10.05f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 924")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(8.55f, 4.75f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 925")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(8.95f, 4.75f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 926")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(8.95f, 4.3999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 927")
		);
		group0.add(new ModelRendererTurbo(group0, 92, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.5f)
			.setRotationPoint(8.95f, 4.0599995f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 928")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(8.95f, 3.7200003f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(10.05f, 4.0599995f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 930")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(10.05f, 3.7200003f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 931")
		);
		group0.add(new ModelRendererTurbo(group0, 72, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(9.65f, 4.75f, 6.35f).setRotationAngle(0, 0, 0).setName("Box 932")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(10.05f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 933")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(10.05f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(8.55f, 4.75f, 6.35f).setRotationAngle(0, 0, 0).setName("Box 935")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(8.95f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 936")
		);
		group0.add(new ModelRendererTurbo(group0, 68, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(8.95f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 937")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(8.95f, 4.0599995f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 938")
		);
		group0.add(new ModelRendererTurbo(group0, 58, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(8.95f, 3.7200003f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 939")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-10.35f, 4.75f, 6.35f).setRotationAngle(0, 0, 0).setName("Box 940")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-9.95f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 941")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-9.95f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 942")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-9.95f, 4.0599995f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 943")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-9.95f, 3.7200003f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 944")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-11.45f, 4.75f, 6.35f).setRotationAngle(0, 0, 0).setName("Box 945")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-11.05f, 3.7200003f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-11.05f, 4.0599995f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 947")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-11.05f, 4.3999996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 948")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-11.05f, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 949")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, -0.8f, -0.05f, -0.05f, -0.8f, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, -0.8f, -0.05f, -0.05f, -0.8f)
			.setRotationPoint(-10.5f, 6, -8.6f).setRotationAngle(0, 0, 0).setName("Box 882")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 1, 0, -0.5f, 1, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-5.25f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 893")
		);
		group0.add(new ModelRendererTurbo(group0, 98, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-5.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 895")
		);
		group0.add(new ModelRendererTurbo(group0, 93, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-4.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 896")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-6.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 898")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(4.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 900")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(5.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 908")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 1, 0, 0, 1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(4.25f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 909")
		);
		group0.add(new ModelRendererTurbo(group0, 29, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(3.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 910")
		);
		group0.add(new ModelRendererTurbo(group0, 118, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-5.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 926")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-6.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 927")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 1, -0.5f, 0, 1, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-5.25f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 928")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-4.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(3.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 931")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(5.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 932")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(4.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 933")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 1, -0.5f, -0.5f, 1, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(4.25f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(-15.75f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 938")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-14.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 940")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(-14.75f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 941")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-14.75f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 942")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-15.75f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(14.75f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 948")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(14.75f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 949")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(13.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 950")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(15.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 951")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(14.4f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 952")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-15.75f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 961")
		);
		group0.add(new ModelRendererTurbo(group0, 119, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(14.75f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 973")
		);
		group0.add(new ModelRendererTurbo(group0, 35, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(-5.25f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 988")
		);
		group0.add(new ModelRendererTurbo(group0, 114, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-6.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(-6.25f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-6.25f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		group0.add(new ModelRendererTurbo(group0, 104, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(4.25f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 995")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(5.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 999")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(5.25f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1000")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(5.25f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1001")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(14.75f, 5.8500004f, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1005")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(13.75f, 7, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1006")
		);
		group0.add(new ModelRendererTurbo(group0, 60, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(13.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1007")
		);
		group0.add(new ModelRendererTurbo(group0, 119, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(13.75f, 5, -6.05f).setRotationAngle(0, 0, 0).setName("Box 1008")
		);
		group0.add(new ModelRendererTurbo(group0, 114, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(-15.75f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1009")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-14.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1013")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-14.75f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1014")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(-14.75f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1015")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-6.25f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1016")
		);
		group0.add(new ModelRendererTurbo(group0, 104, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-6.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1017")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(-6.25f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1018")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(-5.25f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1022")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.35f, 0, 0, -0.35f, -0.4f, -0.8f, -0.55f, -0.4f, -0.8f, -0.25f, 0, 0, -0.05f, 0, 0, -0.05f, -0.4f, -0.8f, -0.25f, -0.4f)
			.setRotationPoint(4.25f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1023")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(5.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1027")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f)
			.setRotationPoint(5.25f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1028")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.4f, -0.7f, -0.5f, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(5.25f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1029")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(13.75f, 5, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1030")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(13.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1031")
		);
		group0.add(new ModelRendererTurbo(group0, 22, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0.3f, 0, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.4f, 0.3f, 0, -0.4f)
			.setRotationPoint(13.75f, 7, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1032")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, -1, 0, -0.5f, -1.2f, 0, -0.5f, -1.2f, -0.4f, 0, -1, -0.4f)
			.setRotationPoint(14.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1035")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.35f, 0, -0.8f, -0.55f, 0, -0.8f, -0.55f, -0.4f, 0, -0.35f, -0.4f, 0, -0.05f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.4f, 0, -0.05f, -0.4f)
			.setRotationPoint(14.75f, 5.8500004f, 5.45f).setRotationAngle(0, 0, 0).setName("Box 1036")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.2f, -0.8f, 0, -0.2f, -0.8f, 0, -0.2f, -0.8f, -0.8f, -0.2f, -0.8f, -0.8f)
			.setRotationPoint(-5.5f, 7.75f, -5.85f).setRotationAngle(0, 0, 0).setName("Box 982")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.2f, -0.8f, 0, -0.2f, -0.8f, 0, -0.2f, -0.8f, -0.8f, -0.2f, -0.8f, -0.8f)
			.setRotationPoint(-5.5f, 7.75f, 5.65f).setRotationAngle(0, 0, 0).setName("Box 983")
		);
		group0.add(new ModelRendererTurbo(group0, 115, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(14.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 984")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(15.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 985")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(13.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 986")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.5f, 0.15f, 0, -0.5f, 0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(14.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 987")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(14.75f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 988")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(14.4f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 989")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(-15.75f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(-15.4f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 991")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-14.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(-15.75f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-16.25f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(-15.4f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 995")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(-15.75f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 996")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9f, -0.3f, 0, -0.9f, -0.3f, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, -0.9f, -0.15f, 0, -0.9f, -0.15f, -0.5f, 0, 0.15f, -0.5f)
			.setRotationPoint(-14.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 997")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.5f, 0.15f, -0.5f)
			.setRotationPoint(-15.75f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 998")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9f, -0.3f, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, -0.3f, -0.5f, -0.9f, -0.15f, 0, 0, 0.15f, 0, 0, 0.15f, -0.5f, -0.9f, -0.15f, -0.5f)
			.setRotationPoint(-16.25f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 999")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0)
			.setRotationPoint(-3, 4.75f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 989")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(4.25f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(4.6f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 991")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(-5.25f, 6.5f, -6).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(-5.6f, 7.6499996f, -6).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, 0, -0.5f, -0.15f, 0, -0.5f, -0.15f, -0.5f, 0, -0.15f, -0.5f, 0.35f, 0.15f, 0, -0.85f, 0.15f, 0, -0.85f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(-5.25f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.1f, -0.9f, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, -0.5f, -0.1f, -0.9f, -0.5f)
			.setRotationPoint(-5.6f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 995")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.6f, -0.9f, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, -0.5f, -0.6f, -0.9f, -0.5f)
			.setRotationPoint(4.6f, 7.6499996f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 996")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -0.5f, -0.5f, -0.15f, -0.5f, -0.85f, 0.15f, 0, 0.35f, 0.15f, 0, 0.35f, 0.15f, -0.5f, -0.85f, 0.15f, -0.5f)
			.setRotationPoint(4.25f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 997")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(1, 6.3999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 357")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(1, 6.1499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 358")
		);
		group0.add(new ModelRendererTurbo(group0, 26, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(1, 5.8999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 359")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(1, 5.8500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 360")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(1, 5.6499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 361")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(1, 5.6000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 362")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(1, 5.3500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 363")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(1, 5.1000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 364")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(0, 5.1000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(0, 5.3500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(0, 5.6000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 367")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(0, 5.8500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 368")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(0, 5.6499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 369")
		);
		group0.add(new ModelRendererTurbo(group0, 6, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(0, 5.8999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(0, 6.1499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 371")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(0, 6.3999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 372")
		);
		group0.add(new ModelRendererTurbo(group0, 67, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(-1, 5.1000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		group0.add(new ModelRendererTurbo(group0, 60, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(-1, 5.3500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 374")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(-1, 5.6000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 375")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(-1, 5.8500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 376")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(-1, 5.6499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 377")
		);
		group0.add(new ModelRendererTurbo(group0, 68, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(-1, 5.8999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 378")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(-1, 6.1499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(-1, 6.3999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 380")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(-2, 5.1000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 381")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(-2, 5.3500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 382")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f)
			.setRotationPoint(-2, 5.6000004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 383")
		);
		group0.add(new ModelRendererTurbo(group0, 26, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0)
			.setRotationPoint(-2, 5.8500004f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 384")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(-2, 5.6499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 385")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(-2, 5.8999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0)
			.setRotationPoint(-2, 6.1499996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 387")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f)
			.setRotationPoint(-2, 6.3999996f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2, 7.2299995f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 389")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-2, 5.8500004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(1, 5.1000004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 391")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(0, 5.1000004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-1, 5.1000004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 393")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-2, 5.1000004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-2, 5.3500004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-1, 5.3500004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 396")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(0, 5.3500004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(1, 5.3500004f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 398")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(1, 5.6000004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(0, 5.6000004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-1, 5.6000004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 401")
		);
		group0.add(new ModelRendererTurbo(group0, 6, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-2, 5.6000004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 402")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(-1, 5.8500004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 403")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(0, 5.8500004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 404")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f)
			.setRotationPoint(1, 5.8500004f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 405")
		);
		group0.add(new ModelRendererTurbo(group0, 68, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(1, 5.6499996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 406")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(0, 5.6499996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 407")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-1, 5.6499996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 408")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-2, 5.6499996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 409")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-2, 5.8999996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 410")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-1, 5.8999996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(0, 5.8999996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 412")
		);
		group0.add(new ModelRendererTurbo(group0, 119, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(1, 5.8999996f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 413")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(1, 6.1499996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 414")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(0, 6.1499996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 415")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-1, 6.1499996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 416")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, 0, -0.05f, -0.6f, 0, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-2, 6.1499996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 417")
		);
		group0.add(new ModelRendererTurbo(group0, 68, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-2, 6.3999996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 418")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(-1, 6.3999996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 419")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(0, 6.3999996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 420")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.05f, -0.6f, -0.5f, -0.05f, -0.6f, -0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.8f, 0.5f, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0.5f, -0.05f, 0, 0.5f)
			.setRotationPoint(1, 6.3999996f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 421")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-14.75f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-14.75f, 4, 4).setRotationAngle(0, 0, 0).setName("Box 374")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.75f, 5, -4).setRotationAngle(0, 0, 0).setName("Box 375")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.75f, 5, -4).setRotationAngle(0, 0, 0).setName("Box 376")
		);
		group0.add(new ModelRendererTurbo(group0, 114, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(13.75f, 4, -8).setRotationAngle(0, 0, 0).setName("Box 377")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(13.75f, 4, 4).setRotationAngle(0, 0, 0).setName("Box 378")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0.25f, -1, -0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0.25f, -1, -0.25f, 0.25f)
			.setRotationPoint(-6.25f, 3.25f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, -0.25f, 0.25f, 0.5f, -0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1, -0.25f, 0.25f, 0.5f, -0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-6.25f, 3.25f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 380")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.5f, -0.25f, 0.25f, -1, -0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0.25f, -1, -0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(5.25f, 3.25f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 381")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -1.2f, 0, 0, -1, 0, 0, -1, -0.4f, -0.5f, -1.2f, -0.4f)
			.setRotationPoint(4.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 377")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -1.2f, 0, 0, -1, 0, 0, -1, -0.4f, -0.5f, -1.2f, -0.4f)
			.setRotationPoint(-15.25f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 378")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, -1, 0, -0.5f, -1.2f, 0, -0.5f, -1.2f, -0.4f, 0, -1, -0.4f)
			.setRotationPoint(-5.75f, 6, 5.45f).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -1.2f, 0, 0, -1, 0, 0, -1, -0.4f, -0.5f, -1.2f, -0.4f)
			.setRotationPoint(-15.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 380")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, -1, 0, -0.5f, -1.2f, 0, -0.5f, -1.2f, -0.4f, 0, -1, -0.4f)
			.setRotationPoint(-5.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 381")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.4f, 0, 0, -0.4f, 0, -1, 0, -0.5f, -1.2f, 0, -0.5f, -1.2f, -0.4f, 0, -1, -0.4f)
			.setRotationPoint(14.25f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 382")
		);
		group0.add(new ModelRendererTurbo(group0, 84, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -1.2f, 0, 0, -1, 0, 0, -1, -0.4f, -0.5f, -1.2f, -0.4f)
			.setRotationPoint(4.75f, 6, -6.05f).setRotationAngle(0, 0, 0).setName("Box 383")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, -0.8f, -0.05f, -0.05f, -0.8f, -0.05f, -0.05f, 0, -0.05f, -0.05f, 0, -0.05f, -0.05f, -0.8f, -0.05f, -0.05f, -0.8f)
			.setRotationPoint(9.5f, 6, -8.6f).setRotationAngle(0, 0, 0).setName("Box 384")
		);
		groups.add(group0);
	}

}
