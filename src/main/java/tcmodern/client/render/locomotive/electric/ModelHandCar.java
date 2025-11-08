//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.electric;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelHandCar extends FVTMFormatBase {

	public ModelHandCar(){
		super();
		textureX = 128;
		textureY = 128;
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
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.5f, 0, -2).setRotationAngle(0, 0, -0).setName("Box 0")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 1, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(0.5f, -11, -5).setRotationAngle(0, 0, -0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, -12, -1).setRotationAngle(0, 0, -0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.5f, -12, -7).setRotationAngle(0, 0, -0).setName("Box 22")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.5f, -12, -7).setRotationAngle(0, 0, -0).setName("Box 23")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, 5, -7).setRotationAngle(0, 0, -0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 17, textureX, textureY)
			.addShapeBox(1, 0, 5, 11, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.5f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 17, textureX, textureY).addBox(1, 0, 5, 11, 3, 2)
			.setRotationPoint(-6.5f, -3, -10.5f).setRotationAngle(0, 0, -0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 1, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(8.5f, -12, 3).setRotationAngle(0, 0, -0).setName("Box 48")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 1, textureX, textureY)
			.addShapeBox(0, 0, -1, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, -12, -1).setRotationAngle(0, 0, -0).setName("Box 49")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, -12, -2).setRotationAngle(0, 0, -0).setName("Box 57")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, -12, 1).setRotationAngle(0, 0, -0).setName("Box 58")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 25, textureX, textureY)
			.addShapeBox(0, 0, -1, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.5f, 2, 7.05f).setRotationAngle(0, 0, -0).setName("Box 59")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 5, -7).setRotationAngle(0, 0, -0).setName("Box 25")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 39, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.5f, 3, -6).setRotationAngle(0, 0, -0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 39, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.5f, 3, 5).setRotationAngle(0, 0, -0).setName("Box 29")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-20.5f, 3, -6).setRotationAngle(0, 0, -0).setName("Box 26")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(19.5f, 3, -6).setRotationAngle(0, 0, -0).setName("Box 27")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.5f, 2, -6).setRotationAngle(0, 0, -0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.5f, 2, 5).setRotationAngle(0, 0, -0).setName("Box 29")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.5f, 2, -0.5f).setRotationAngle(0, 0, -0).setName("Box 30")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 2, -0.5f).setRotationAngle(0, 0, -0).setName("Box 31")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 2, 5).setRotationAngle(0, 0, -0).setName("Box 32")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 2, -6).setRotationAngle(0, 0, -0).setName("Box 33")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, 2, 5).setRotationAngle(0, 0, -0).setName("Box 34")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.5f, 2, 5).setRotationAngle(0, 0, -0).setName("Box 35")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.5f, 2, -6).setRotationAngle(0, 0, -0).setName("Box 36")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, 2, -6).setRotationAngle(0, 0, -0).setName("Box 37")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, 2, -1).setRotationAngle(0, 0, -0).setName("Box 38")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 2, -1).setRotationAngle(0, 0, -0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 49, textureX, textureY)
			.addShapeBox(0, 0, -1, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, 2, 7.05f).setRotationAngle(0, 0, -0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 49, textureX, textureY)
			.addShapeBox(0, 0, -1, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, 2, -5.05f).setRotationAngle(0, 0, -0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 49, textureX, textureY)
			.addShapeBox(0, 0, -1, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.5f, 2, -5.05f).setRotationAngle(0, 0, -0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.5f, 0, -10).setRotationAngle(0, 0, -0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.5f, 0, 2).setRotationAngle(0, 0, -0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, 0, -2).setRotationAngle(0, 0, -0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, -10, 4).setRotationAngle(0, 0, -0).setName("Box 45")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0)
			.setRotationPoint(-3.5f, -9, 4).setRotationAngle(0, 0, -0).setName("Box 46")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0)
			.setRotationPoint(-3.5f, -9, -5).setRotationAngle(0, 0, -0).setName("Box 47")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -9, -5).setRotationAngle(0, 0, -0).setName("Box 48")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -9, 4).setRotationAngle(0, 0, -0).setName("Box 49")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, -10, -5).setRotationAngle(0, 0, -0).setName("Box 50")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 11, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -3, -5.5f).setRotationAngle(0, 0, -0).setName("Box 51")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 11, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.5f, -3, -5.5f).setRotationAngle(0, 0, -0).setName("Box 52")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, -11, -1).setRotationAngle(0, 0, -0).setName("Box 53")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, 0, -1).setRotationAngle(0, 0, -0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 57, textureX, textureY)
			.addShapeBox(0, 0, -1, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, -3, -0.05000019f).setRotationAngle(0, 0, -0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, -9, -1.25f).setRotationAngle(0, 0, -0).setName("Box 56")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(1.5f, -9, -1.5f).setRotationAngle(0, 0, -0).setName("Box 58")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(1.5f, 1, -1.5f).setRotationAngle(0, 0, -0).setName("Box 59")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 97, textureX, textureY).addBox(0, 0, -1, 29, 4, 0)
			.setRotationPoint(-14.5f, 4, -0.25f).setRotationAngle(0, 0, -0).setName("Box 60")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.5f, 0.5f, -8).setRotationAngle(0, 0, -0).setName("Box 62")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.5f, 0.5f, 7).setRotationAngle(0, 0, -0).setName("Box 63")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 0.5f, 7).setRotationAngle(0, 0, -0).setName("Box 64")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, 0.5f, -8).setRotationAngle(0, 0, -0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, 1, 0).setRotationAngle(0, 0, -0).setName("Box 66")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.5f, -1, 0).setRotationAngle(0, 0, -0).setName("Box 67")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-0.5f, -12, -1.5f).setRotationAngle(0, 0, -0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.5f, 0, 0).setRotationAngle(0, 0, -0).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(4.5f, -7, -4).setRotationAngle(0, 0, -0).setName("Box 70")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-5.5f, -7, -4).setRotationAngle(0, 0, -0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -3.5f, 0, 0, 3, 0, 0, 3, 0, -0.5f, -3.5f, 0, -0.5f)
			.setRotationPoint(-2, -9, -4.5f).setRotationAngle(0, 0, -0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 3, 0, 0, -3.5f, 0, 0, -3.5f, 0, -0.5f, 3, 0, -0.5f)
			.setRotationPoint(1, -9, -5).setRotationAngle(0, 0, -0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f)
			.setRotationPoint(-0.5f, -6.5f, -5.25f).setRotationAngle(0, 0, -0).setName("Box 77")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -3.5f, 0, 0, 3, 0, 0, 3, 0, -0.5f, -3.5f, 0, -0.5f)
			.setRotationPoint(-2, -9, 4.5f).setRotationAngle(0, 0, -0).setName("Box 78")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f)
			.setRotationPoint(-0.5f, -6.5f, 3.75f).setRotationAngle(0, 0, -0).setName("Box 79")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 3, 0, 0, -3.5f, 0, 0, -3.5f, 0, -0.5f, 3, 0, -0.5f)
			.setRotationPoint(1, -9, 4).setRotationAngle(0, 0, -0).setName("Box 80")
		);
		groups.add(group0);
	}

}
