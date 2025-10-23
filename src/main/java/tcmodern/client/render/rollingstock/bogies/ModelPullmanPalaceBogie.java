//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.bogies;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelPullmanPalaceBogie extends FVTMFormatBase {

	public ModelPullmanPalaceBogie(){
		super();
		textureX = 128;
		textureY = 128;
		addToCreators("broscolotos");
		//
		initGroup_new_group0();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_new_group0(){
		TurboList new_group0 = new TurboList("new_group0");
		new_group0.add(new ModelRendererTurbo(new_group0, 9, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, 0, -0.75f, 0, -1.21875f, -0.75f, 0, -1.21875f, 0, 0, 0, 0, 0, -1.625f, -0.75f, 0, -0.40625f, -0.75f, 0, -0.40625f, 0, 0, -1.625f, 0)
			.setRotationPoint(1.59375f, 3.0625f, 2).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, 0, -0.75f, 0, -1.21875f, -0.75f, 0, -1.21875f, 0, 0, 0, 0, 0, -1.625f, -0.75f, 0, -0.40625f, -0.75f, 0, -0.40625f, 0, 0, -1.625f, 0)
			.setRotationPoint(1.59375f, 3.0625f, -3.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 115, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -1.21875f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -1.21875f, 0, 0, -0.40625f, -0.75f, 0, -1.625f, -0.75f, 0, -1.625f, 0, 0, -0.40625f, 0)
			.setRotationPoint(-4.59375f, 3.0625f, 2).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 106, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -1.21875f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -1.21875f, 0, 0, -0.40625f, -0.75f, 0, -1.625f, -0.75f, 0, -1.625f, 0, 0, -0.40625f, 0)
			.setRotationPoint(-4.59375f, 3.0625f, -3.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 97, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -1, -0.75f, 0, -0.40625f, -0.75f, 0, -0.40625f, 0, 0, -1, 0, 0, -0.625f, -0.75f, 0, -1.21875f, -0.75f, 0, -1.21875f, 0, 0, -0.625f, 0)
			.setRotationPoint(1.59375f, 4.125f, 2).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 88, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -0.40625f, -0.75f, 0, -1, -0.75f, 0, -1, 0, 0, -0.40625f, 0, 0, -1.21875f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, 0, -1.21875f, 0)
			.setRotationPoint(-4.59375f, 4.125f, 2).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 79, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -1, -0.75f, 0, -0.40625f, -0.75f, 0, -0.40625f, 0, 0, -1, 0, 0, -0.625f, -0.75f, 0, -1.21875f, -0.75f, 0, -1.21875f, 0, 0, -0.625f, 0)
			.setRotationPoint(1.59375f, 4.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 70, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -0.40625f, -0.75f, 0, -1, -0.75f, 0, -1, 0, 0, -0.40625f, 0, 0, -1.21875f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, 0, -1.21875f, 0)
			.setRotationPoint(-4.59375f, 4.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 61, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, 0, -0.5f, 0, -0.34375f, -0.5f, 0, -0.34375f, 0, 0, 0, 0, 0, -1.625f, -0.5f, 0, -1.28125f, -0.5f, 0, -1.28125f, 0, 0, -1.625f, 0)
			.setRotationPoint(11.125f, 3.40625f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 48, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -0.34375f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.34375f, 0, 0, -1.28125f, -0.5f, 0, -1.625f, -0.5f, 0, -1.625f, 0, 0, -1.28125f, 0)
			.setRotationPoint(7.875f, 3.40625f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 23, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(10.125f, 3.40625f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, 0, -0.5f, 0, -0.34375f, -0.5f, 0, -0.34375f, 0, 0, 0, 0, 0, -1.625f, -0.5f, 0, -1.28125f, -0.5f, 0, -1.28125f, 0, 0, -1.625f, 0)
			.setRotationPoint(11.125f, 3.40625f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 30, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -0.34375f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.34375f, 0, 0, -1.28125f, -0.5f, 0, -1.625f, -0.5f, 0, -1.625f, 0, 0, -1.28125f, 0)
			.setRotationPoint(7.875f, 3.40625f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 9, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(10.125f, 3.40625f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 48, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, 0, -0.5f, 0, -0.34375f, -0.5f, 0, -0.34375f, 0, 0, 0, 0, 0, -1.625f, -0.5f, 0, -1.28125f, -0.5f, 0, -1.28125f, 0, 0, -1.625f, 0)
			.setRotationPoint(-10.90625f, 3.40625f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -0.34375f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.34375f, 0, 0, -1.28125f, -0.5f, 0, -1.625f, -0.5f, 0, -1.625f, 0, 0, -1.28125f, 0)
			.setRotationPoint(-14.15625f, 3.40625f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 113, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-11.90625f, 3.40625f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 30, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, 0, -0.5f, 0, -0.34375f, -0.5f, 0, -0.34375f, 0, 0, 0, 0, 0, -1.625f, -0.5f, 0, -1.28125f, -0.5f, 0, -1.28125f, 0, 0, -1.625f, 0)
			.setRotationPoint(-10.90625f, 3.40625f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 25, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1.875f, 1, 0, 0, -0.34375f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.34375f, 0, 0, -1.28125f, -0.5f, 0, -1.625f, -0.5f, 0, -1.625f, 0, 0, -1.28125f, 0)
			.setRotationPoint(-14.15625f, 3.40625f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 102, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-11.90625f, 3.40625f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 31, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5625f, -0.5f, -0.75f, -0.5625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6.03125f, 4.28125f, 2).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 7, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5625f, -0.5f, -0.75f, -0.5625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6.03125f, 4.28125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.5625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(6.4375f, 3.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 115, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.5625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(6.4375f, 3.75f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 108, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.5625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-15.59375f, 3.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 101, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.5625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-15.59375f, 3.75f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 94, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(4.03125f, 4.28125f, 2).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 87, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(4.03125f, 4.28125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 74, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5625f, -0.75f, 0)
			.setRotationPoint(13.5625f, 3.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 67, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5625f, -0.75f, 0)
			.setRotationPoint(13.5625f, 3.75f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 60, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5625f, -0.75f, 0)
			.setRotationPoint(-8.46875f, 3.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 53, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5625f, -0.75f, 0)
			.setRotationPoint(-8.46875f, 3.75f, 2.625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 45, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(6.40625f, 4, -6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-7.40625f, 4, -6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(14.59375f, 4, -6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 70, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-15.65625f, 4, -6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1.875f, 1, 0, -0.1875f, -2, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.1875f, -2, 0, -0.5f, 0.375f, -0.625f, 0, -1.3125f, -0.625f, 0, -1.3125f, 0, -0.5f, 0.375f, 0)
			.setRotationPoint(-5.1875f, 3.21875f, -9).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 16, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(-1.1875f, 3.21875f, -9).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 70, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1.875f, 1, 0, 0, 0, -0.625f, -0.1875f, -2, -0.625f, -0.1875f, -2, 0, 0, 0, 0, 0, -1.3125f, -0.625f, -0.5f, 0.375f, -0.625f, -0.5f, 0.375f, 0, 0, -1.3125f, 0)
			.setRotationPoint(1.1875f, 3.21875f, -9).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 46, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.625f, -0.78125f, 0, -0.625f, -0.78125f, 0, 0, 0, 0, 0, 0, -0.75f, -0.625f, -0.46875f, -0.75f, -0.625f, -0.46875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-6.21875f, 5.21875f, -9).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 24, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.78125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.78125f, 0, 0, -0.46875f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -0.46875f, -0.75f, 0)
			.setRotationPoint(4.21875f, 5.21875f, -9).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 97, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, 6, 7.25f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 63, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, 6, 7.25f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 4, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, 6, 7.25f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 83, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 0.5f, 0.5f, 0, null)
			.setRotationPoint(11, 6.5f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 68, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 0.5f, 0.5f, 0, null)
			.setRotationPoint(0, 6.5f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 108, 67, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 0.5f, 0.5f, 0, null)
			.setRotationPoint(-11, 6.5f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 92, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-11.5f, 6, 7.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 19, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-0.5f, 6, 7.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 14, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(10.5f, 6, 7.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 87, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 17, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.21875f, 5.46875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 48, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 17, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(4.71875f, 5.46875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 17, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(4.71875f, 4.53125f, -3.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(4.71875f, 4.53125f, 2.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 116, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-6.21875f, 4.53125f, -3.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 109, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-6.21875f, 4.53125f, 2.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 15, 23, textureX, textureY)
			.addShapeBox(-3.5f, -3.5f, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 6.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 23, textureX, textureY)
			.addShapeBox(-3.5f, -3.5f, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 6.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 110, 19, textureX, textureY)
			.addShapeBox(-3.5f, -3.5f, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 6.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 95, 19, textureX, textureY)
			.addShapeBox(-3.5f, -3.5f, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 6.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 80, 19, textureX, textureY)
			.addShapeBox(-3.5f, -3.5f, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 6.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 86, 0, textureX, textureY)
			.addShapeBox(-3.5f, -3.5f, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 6.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 121, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.5f, 1.5f, 4, null)
			.setRotationPoint(0, 2.125f, 0).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 61, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-1.59375f, 3.0625f, -3).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 109, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 6, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.1875f, -0.5f, 0, 0.1875f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.59375f, 3.875f, -3).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 45, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, -0.125f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, -0.125f, 0, 0, 0, -0.875f, 0, 0.1875f, -0.875f, 0, 0.1875f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-1.59375f, 3.75f, -3).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 16, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, -0.125f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, -0.125f, -0.6875f, 0)
			.setRotationPoint(-1.59375f, 3.4375f, -3).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 109, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.875f, 0, 0.1875f, -0.875f, 0, 0.1875f, -0.875f, 0, 0, -0.875f, 0, -0.125f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-1.59375f, 2.4375f, -3).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 78, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0, 0)
			.setRotationPoint(7.4375f, 7.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 73, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0.125f, 0, 0, -0.0625f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.0625f, 0)
			.setRotationPoint(7.9375f, 7.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 102, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6875f, 0, -0.5f, 0.6875f, 0, -0.5f, 0.6875f, 0, 0, -0.6875f, 0, 0, 1.0625f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, 1.0625f, 0)
			.setRotationPoint(8.4375f, 6.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 59, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, -0.25f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, 0)
			.setRotationPoint(9.9375f, 5.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 54, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, -0.4375f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.4375f, 0)
			.setRotationPoint(10.1875f, 5.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 49, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.5f, 0)
			.setRotationPoint(10.4375f, 5.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 44, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(10.6875f, 5.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, -0.5625f, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, -0.5625f, 0)
			.setRotationPoint(11.4375f, 5.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 34, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, 0, 0, 0, 0, -0.625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, -0.5625f, 0, 0, -0.625f, 0)
			.setRotationPoint(11.625f, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -1.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.375f, 0)
			.setRotationPoint(2.4375f, 7.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 9, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.0625f, 0)
			.setRotationPoint(-8.4375f, 7.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.625f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0.625f, 0, -0.5f, -0.25f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-8.9375f, 7.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 95, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, 0.6875f, 0, -0.5f, -0.9375f, 0, 0, 1.0625f, 0, 0, 1.0625f, 0, -0.5f, -0.9375f, 0)
			.setRotationPoint(-10.4375f, 6.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 116, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-10.9375f, 5.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 103, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, -0.625f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-11.1875f, 5.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 98, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.0625f, 0, -0.75f, -0.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-11.4375f, 5.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 88, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.25f, -0.5625f, 0)
			.setRotationPoint(-11.6875f, 5.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 83, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.5f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.8125f, -0.5f, 0)
			.setRotationPoint(-12.4375f, 5.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.5625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.8125f, -0.5625f, 0)
			.setRotationPoint(-12.625f, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 70, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.375f, 0, -1.5f, -0.375f, 0, 0, 0, 0)
			.setRotationPoint(-7.4375f, 7.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 68, 65, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 7.125f, -7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 24, 65, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 5.6875f, -7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 111, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, -0.4375f, -0.5f, 0, 0.78125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.78125f, 0, 0)
			.setRotationPoint(-3.5625f, 6.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 93, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.5f, 0, 0.4375f, -0.5f, 0, 0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-3.0625f, 6.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 19, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-2.625f, 5.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 14, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.5625f, 0, 0.4375f, -0.5625f, 0, 0.4375f, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-2.25f, 5.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 5, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0.78125f, 0, 0, 0.78125f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.5625f, 6.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 122, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0.4375f, -0.5f, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.0625f, 6.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 63, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, 0, 0.375f, -0.5f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.625f, 5.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 58, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.4375f, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, -0.5625f, 0, 0.4375f, -0.5625f, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.25f, 5.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 53, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.625f, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0.5f, -0.625f, 0, 0.5f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, 0.5f, 0.0625f, 0)
			.setRotationPoint(0.8125f, 4.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 48, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(-0.6875f, 5.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 43, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, -1, -0.75f, 0, -0.375f, 0.0625f, 0, 0.5f, 0.0625f, 0, 0.5f, 0.0625f, 0, -0.375f, 0.0625f, 0)
			.setRotationPoint(-1.8125f, 4.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 38, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0.5625f, 0, -0.5f, 0.5625f, 0, 0, -0.8125f, 0, 0.5f, -0.8125f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8125f, -0.5f, 0)
			.setRotationPoint(-8.0625f, 7.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 33, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0.5625f, 0, -0.5f, 0.5625f, 0, 0, -0.8125f, 0, 0.5f, -0.8125f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.8125f, -0.5f, 0)
			.setRotationPoint(6.4375f, 7.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5625f, 0, -0.5f, -0.8125f, 0, 0, -0.8125f, 0, 0.5f, 0.5625f, 0, 0, 0, -0.5f, -0.5f, -0.8125f, -0.5f, -0.5f, -0.8125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-7.4375f, 7.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 117, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5625f, 0, -0.5f, -0.8125f, 0, 0, -0.8125f, 0, 0.5f, 0.5625f, 0, 0, 0, -0.5f, -0.5f, -0.8125f, -0.5f, -0.5f, -0.8125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(7.0625f, 7.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 107, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5625f, -0.5f, -0.8125f, -0.5625f, -0.5f, -0.8125f, -0.5625f, 0, 0, -0.5625f, 0, 0.5625f, 0, -0.5f, -0.8125f, 0, 0, -0.8125f, 0, 0.5f, 0.5625f, 0, 0)
			.setRotationPoint(-7.4375f, 4.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 102, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5625f, -0.5f, -0.8125f, -0.5625f, -0.5f, -0.8125f, -0.5625f, 0, 0, -0.5625f, 0, 0.5625f, 0, -0.5f, -0.8125f, 0, 0, -0.8125f, 0, 0.5f, 0.5625f, 0, 0)
			.setRotationPoint(7.0625f, 4.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 89, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, 0, 0, 0.5625f, 0, -0.5f, 0.5625f, 0, 0, -0.8125f, 0, 0.5f)
			.setRotationPoint(-8.0625f, 4.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 84, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, 0, 0, 0.5625f, 0, -0.5f, 0.5625f, 0, 0, -0.8125f, 0, 0.5f)
			.setRotationPoint(6.4375f, 4.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 88, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.59375f, 0, 0.25f, -0.59375f, 0, 0.25f, -0.59375f, 0, 0, -0.59375f, 0)
			.setRotationPoint(-6.59375f, 7.34375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 81, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-6.28125f, 5.96875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 74, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.59375f, 0, 0.25f, -0.59375f, 0, 0.25f, -0.59375f, 0, 0, -0.59375f, 0)
			.setRotationPoint(4.34375f, 7.34375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 32, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(4.65625f, 5.96875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-15.65625f, 4, -7.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 79, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-11.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 74, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, -0.5f, 0, -0.125f, -0.5f, 0, 0.25f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-9.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 97, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.3125f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-9.25f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 69, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.3125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.3125f, -0.5f, -0.75f, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, -0.75f, -0.125f, -0.5f)
			.setRotationPoint(-13.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 28, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, -0.75f, -0.5625f, -0.5f, -0.75f, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.375f, -0.5f)
			.setRotationPoint(-13.75f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 23, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-0.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 10, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, -0.5f, 0, -0.125f, -0.5f, 0, 0.25f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(1.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 112, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.3125f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(1.75f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 18, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.3125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.3125f, -0.5f, -0.75f, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, -0.75f, -0.125f, -0.5f)
			.setRotationPoint(-2.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 5, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, -0.75f, -0.5625f, -0.5f, -0.75f, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.375f, -0.5f)
			.setRotationPoint(-2.75f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 123, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(10.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 64, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, -0.5f, 0, -0.125f, -0.5f, 0, 0.25f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(12.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.3125f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(12.75f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 118, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.3125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.3125f, -0.5f, -0.75f, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, -0.75f, -0.125f, -0.5f)
			.setRotationPoint(8.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 107, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, -0.75f, -0.5625f, -0.5f, -0.75f, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.375f, -0.5f)
			.setRotationPoint(8.25f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 102, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, -0.875f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, -0.875f, -0.875f, -0.5f, -0.875f, -0.4375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.4375f, -0.5f)
			.setRotationPoint(-14, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 93, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, -0.875f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, -0.875f, -0.875f, -0.5f, -0.875f, -0.4375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.4375f, -0.5f)
			.setRotationPoint(-3, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 88, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, -0.875f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, -0.875f, -0.875f, -0.5f, -0.875f, -0.4375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.4375f, -0.5f)
			.setRotationPoint(8, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 83, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5625f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.375f, 0, -0.875f, -0.4375f, 0, -0.875f, -0.4375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(-9, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 78, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5625f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.375f, 0, -0.875f, -0.4375f, 0, -0.875f, -0.4375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(2, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 73, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5625f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.375f, 0, -0.875f, -0.4375f, 0, -0.875f, -0.4375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(13, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 59, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-10.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 54, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(0.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 49, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(11.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 44, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-12.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-1.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 34, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(9.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f)
			.setRotationPoint(-11.5f, 5, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 24, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0.875f, -1, -0.75f, 0.875f, -1, -0.75f, -1.375f, 0, -0.75f, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f)
			.setRotationPoint(-11.5f, 4.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 14, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f)
			.setRotationPoint(-11.5f, 5, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 9, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0.875f, 0, -0.75f, 0.875f, 0, -0.75f, -1.375f, -1, -0.75f, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f)
			.setRotationPoint(-11.5f, 4.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 113, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f)
			.setRotationPoint(-11.5f, 7, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 68, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.875f, -0.75f, 0, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, -0.5f, 0.875f, -1, -0.5f, 0.875f, -1, -0.5f, -1.375f, 0, -0.5f, -1.375f)
			.setRotationPoint(-11.5f, 7.125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 19, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f)
			.setRotationPoint(-11.5f, 7, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 123, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f, -1, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, -0.5f, -1.375f, -1, -0.5f, -1.375f)
			.setRotationPoint(-11.5f, 7.125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 98, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f)
			.setRotationPoint(-0.5f, 5, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 5, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0.875f, -1, -0.75f, 0.875f, -1, -0.75f, -1.375f, 0, -0.75f, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f)
			.setRotationPoint(-0.5f, 4.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f)
			.setRotationPoint(-0.5f, 5, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 109, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0.875f, 0, -0.75f, 0.875f, 0, -0.75f, -1.375f, -1, -0.75f, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f)
			.setRotationPoint(-0.5f, 4.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 93, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f)
			.setRotationPoint(-0.5f, 7, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 88, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.875f, -0.75f, 0, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, -0.5f, 0.875f, -1, -0.5f, 0.875f, -1, -0.5f, -1.375f, 0, -0.5f, -1.375f)
			.setRotationPoint(-0.5f, 7.125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 83, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f)
			.setRotationPoint(-0.5f, 7, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 78, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f, -1, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, -0.5f, -1.375f, -1, -0.5f, -1.375f)
			.setRotationPoint(-0.5f, 7.125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 64, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f)
			.setRotationPoint(10.5f, 5, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 59, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0.875f, -1, -0.75f, 0.875f, -1, -0.75f, -1.375f, 0, -0.75f, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f)
			.setRotationPoint(10.5f, 4.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 54, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f)
			.setRotationPoint(10.5f, 5, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 49, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0.875f, 0, -0.75f, 0.875f, 0, -0.75f, -1.375f, -1, -0.75f, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f)
			.setRotationPoint(10.5f, 4.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 44, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f)
			.setRotationPoint(10.5f, 7, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.875f, -0.75f, 0, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, -0.5f, 0.875f, -1, -0.5f, 0.875f, -1, -0.5f, -1.375f, 0, -0.5f, -1.375f)
			.setRotationPoint(10.5f, 7.125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f)
			.setRotationPoint(10.5f, 7, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 15, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f, -1, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, -0.5f, -1.375f, -1, -0.5f, -1.375f)
			.setRotationPoint(10.5f, 7.125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 118, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f)
			.setRotationPoint(-10.5f, 6.25f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 104, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f)
			.setRotationPoint(-12.5f, 6.25f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 73, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f)
			.setRotationPoint(0.5f, 6.25f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 34, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f)
			.setRotationPoint(-1.5f, 6.25f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 24, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f)
			.setRotationPoint(11.5f, 6.25f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 10, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f)
			.setRotationPoint(9.5f, 6.25f, -8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 123, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-11.5f, 6, -8.25f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 113, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-0.5f, 6, -8.25f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 99, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(10.5f, 6, -8.25f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 5, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-11.5f, 6, -8.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 30, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-0.5f, 6, -8.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 25, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(10.5f, 6, -8.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 34, 69, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(11, 6.5f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, new Vec3f(0.0, 0.3125, 0.0))
			.setRotationPoint(-7.25f, 5.8125f, -7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 108, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 5.8125f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 94, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 6.0625f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 89, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 6.3125f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 84, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 6.5625f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 79, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 6.8125f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 69, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 7.0625f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 64, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 7.125f, -7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 59, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 5.6875f, -7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 54, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, new Vec3f(0.0, 0.3125, 0.0))
			.setRotationPoint(7.25f, 5.8125f, -7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 49, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 5.8125f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 44, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 6.0625f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 6.3125f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 20, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 6.5625f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 15, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 6.8125f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 119, 50, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 7.0625f, -7).setRotationAngle(0, 0, -6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-15.65625f, 4, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 86, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1.875f, 1, 0, -0.1875f, -2, 0, 0, 0, 0, 0, 0, -0.625f, -0.1875f, -2, -0.625f, -0.5f, 0.375f, 0, 0, -1.3125f, 0, 0, -1.3125f, -0.625f, -0.5f, 0.375f, -0.625f)
			.setRotationPoint(-5.1875f, 3.21875f, 8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f)
			.setRotationPoint(-1.1875f, 3.21875f, 8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1.875f, 1, 0, 0, 0, 0, -0.1875f, -2, 0, -0.1875f, -2, -0.625f, 0, 0, -0.625f, 0, -1.3125f, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, -0.625f, 0, -1.3125f, -0.625f)
			.setRotationPoint(1.1875f, 3.21875f, 8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 25, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.78125f, 0, 0, -0.78125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.46875f, -0.75f, 0, -0.46875f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-6.21875f, 5.21875f, 8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 18, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.78125f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.78125f, 0, -0.625f, -0.46875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, -0.46875f, -0.75f, -0.625f)
			.setRotationPoint(4.21875f, 5.21875f, 8).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.59375f, 0, 0.25f, -0.59375f, 0, 0.25f, -0.59375f, 0, 0, -0.59375f, 0)
			.setRotationPoint(-6.59375f, 7.34375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 34, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-6.28125f, 5.96875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 58, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.59375f, 0, 0.25f, -0.59375f, 0, 0.25f, -0.59375f, 0, 0, -0.59375f, 0)
			.setRotationPoint(4.34375f, 7.34375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 35, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(4.65625f, 5.96875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 103, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-11.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 74, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.125f, -0.5f, -0.75f, -0.3125f, -0.5f, -0.75f, -0.3125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f, -0.125f, 0, 0, 0.25f, 0)
			.setRotationPoint(-9.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 10, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.3125f, -0.5f, -0.75f, -0.5625f, -0.5f, -0.75f, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.375f, -0.5f, -0.75f, -0.375f, 0, 0, -0.125f, 0)
			.setRotationPoint(-9.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 114, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.3125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.125f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-13.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 34, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5625f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.375f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-13.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 5, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-0.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.125f, -0.5f, -0.75f, -0.3125f, -0.5f, -0.75f, -0.3125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f, -0.125f, 0, 0, 0.25f, 0)
			.setRotationPoint(1.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.3125f, -0.5f, -0.75f, -0.5625f, -0.5f, -0.75f, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.375f, -0.5f, -0.75f, -0.375f, 0, 0, -0.125f, 0)
			.setRotationPoint(1.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 109, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.3125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.125f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-2.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 70, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5625f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.375f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-2.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 65, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(10.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 60, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.125f, -0.5f, -0.75f, -0.3125f, -0.5f, -0.75f, -0.3125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f, -0.125f, 0, 0, 0.25f, 0)
			.setRotationPoint(12.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 55, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.3125f, -0.5f, -0.75f, -0.5625f, -0.5f, -0.75f, -0.5625f, 0, 0, -0.3125f, 0, 0, -0.125f, -0.5f, -0.75f, -0.375f, -0.5f, -0.75f, -0.375f, 0, 0, -0.125f, 0)
			.setRotationPoint(12.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 50, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.3125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.125f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(8.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 45, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5625f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.375f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(8.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 24, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, -0.875f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, -0.875f, -0.875f, 0, -0.875f, -0.4375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, -0.875f, -0.4375f, 0)
			.setRotationPoint(-14, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 19, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, -0.875f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, -0.875f, -0.875f, 0, -0.875f, -0.4375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, -0.875f, -0.4375f, 0)
			.setRotationPoint(-3, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 14, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, -0.875f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, -0.875f, -0.875f, 0, -0.875f, -0.4375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, -0.875f, -0.4375f, 0)
			.setRotationPoint(8, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 123, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5625f, -0.5f, -0.875f, -0.875f, -0.5f, -0.875f, -0.875f, 0, 0, -0.5625f, 0, 0, -0.375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-9, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 118, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5625f, -0.5f, -0.875f, -0.875f, -0.5f, -0.875f, -0.875f, 0, 0, -0.5625f, 0, 0, -0.375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, 0, 0, -0.375f, 0)
			.setRotationPoint(2, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 104, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5625f, -0.5f, -0.875f, -0.875f, -0.5f, -0.875f, -0.875f, 0, 0, -0.5625f, 0, 0, -0.375f, -0.5f, -0.875f, -0.4375f, -0.5f, -0.875f, -0.4375f, 0, 0, -0.375f, 0)
			.setRotationPoint(13, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 99, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-10.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 94, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(0.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 89, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(11.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 84, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.125f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-12.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 79, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.125f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-1.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 40, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.125f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(9.5f, 4, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 35, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(-11.5f, 5, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 9, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -1.375f, -1, -0.75f, -1.375f, -1, -0.75f, 0.875f, 0, -0.75f, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(-11.5f, 4.875f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 4, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f)
			.setRotationPoint(-11.5f, 5, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 113, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, -1.375f, 0, -0.75f, -1.375f, 0, -0.75f, 0.875f, -1, -0.75f, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f)
			.setRotationPoint(-11.5f, 4.875f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 74, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f)
			.setRotationPoint(-11.5f, 7, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 30, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.375f, -0.75f, 0, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, -1.375f, -1, -0.5f, -1.375f, -1, -0.5f, 0.875f, 0, -0.5f, 0.875f)
			.setRotationPoint(-11.5f, 7.125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 69, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f)
			.setRotationPoint(-11.5f, 7, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 64, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f, -1, -0.5f, -1.375f, 0, -0.5f, -1.375f, 0, -0.5f, 0.875f, -1, -0.5f, 0.875f)
			.setRotationPoint(-11.5f, 7.125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 59, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(-0.5f, 5, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 54, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -1.375f, -1, -0.75f, -1.375f, -1, -0.75f, 0.875f, 0, -0.75f, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(-0.5f, 4.875f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 49, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f)
			.setRotationPoint(-0.5f, 5, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 44, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, -1.375f, 0, -0.75f, -1.375f, 0, -0.75f, 0.875f, -1, -0.75f, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f)
			.setRotationPoint(-0.5f, 4.875f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 25, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f)
			.setRotationPoint(-0.5f, 7, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 20, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.375f, -0.75f, 0, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, -1.375f, -1, -0.5f, -1.375f, -1, -0.5f, 0.875f, 0, -0.5f, 0.875f)
			.setRotationPoint(-0.5f, 7.125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 15, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f)
			.setRotationPoint(-0.5f, 7, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f, -1, -0.5f, -1.375f, 0, -0.5f, -1.375f, 0, -0.5f, 0.875f, -1, -0.5f, 0.875f)
			.setRotationPoint(-0.5f, 7.125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 109, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(10.5f, 5, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 104, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -1.375f, -1, -0.75f, -1.375f, -1, -0.75f, 0.875f, 0, -0.75f, 0.875f, 0, 0, -1.375f, -0.75f, 0, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(10.5f, 4.875f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 99, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f)
			.setRotationPoint(10.5f, 5, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 94, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, -1.375f, 0, -0.75f, -1.375f, 0, -0.75f, 0.875f, -1, -0.75f, 0.875f, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f)
			.setRotationPoint(10.5f, 4.875f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 89, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.375f, -0.5f, 0, -1.375f, -0.5f, 0, 0.875f, 0, 0, 0.875f, 0, -0.875f, -1.375f, -0.75f, -0.875f, -1.375f, -0.75f, -0.875f, 0.875f, 0, -0.875f, 0.875f)
			.setRotationPoint(10.5f, 7, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 84, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.375f, -0.75f, 0, -1.375f, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, -1.375f, -1, -0.5f, -1.375f, -1, -0.5f, 0.875f, 0, -0.5f, 0.875f)
			.setRotationPoint(10.5f, 7.125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.5f, 0, 0.875f, -0.75f, -0.875f, -1.375f, 0, -0.875f, -1.375f, 0, -0.875f, 0.875f, -0.75f, -0.875f, 0.875f)
			.setRotationPoint(10.5f, 7, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 10, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.875f, -0.75f, 0, 0.875f, -1, -0.5f, -1.375f, 0, -0.5f, -1.375f, 0, -0.5f, 0.875f, -1, -0.5f, 0.875f)
			.setRotationPoint(10.5f, 7.125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 122, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-10.5f, 6.25f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 117, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(-12.5f, 6.25f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 79, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(0.5f, 6.25f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 34, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(-1.5f, 6.25f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 5, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(11.5f, 6.25f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 74, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(9.5f, 6.25f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 69, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0, 0)
			.setRotationPoint(7.4375f, 7.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 64, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0.125f, 0, 0, -0.0625f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.0625f, 0)
			.setRotationPoint(7.9375f, 7.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 97, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6875f, 0, -0.5f, 0.6875f, 0, -0.5f, 0.6875f, 0, 0, -0.6875f, 0, 0, 1.0625f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, 1.0625f, 0)
			.setRotationPoint(8.4375f, 6.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 59, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, -0.25f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, 0)
			.setRotationPoint(9.9375f, 5.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 54, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, -0.4375f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.4375f, 0)
			.setRotationPoint(10.1875f, 5.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 49, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.5f, 0)
			.setRotationPoint(10.4375f, 5.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 44, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(10.6875f, 5.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, -0.5625f, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, -0.5625f, 0)
			.setRotationPoint(11.4375f, 5.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 24, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, 0, 0, 0, 0, -0.625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, -0.5625f, 0, 0, -0.625f, 0)
			.setRotationPoint(11.625f, 5.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 70, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -1.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.375f, 0)
			.setRotationPoint(2.4375f, 7.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 19, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.0625f, 0)
			.setRotationPoint(-8.4375f, 7.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 14, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.625f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0.625f, 0, -0.5f, -0.25f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-8.9375f, 7.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 58, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, 0.6875f, 0, -0.5f, -0.9375f, 0, 0, 1.0625f, 0, 0, 1.0625f, 0, -0.5f, -0.9375f, 0)
			.setRotationPoint(-10.4375f, 6.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-10.9375f, 5.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 113, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.0625f, 0, -0.75f, -0.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-11.4375f, 5.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 108, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.25f, -0.5625f, 0)
			.setRotationPoint(-11.6875f, 5.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 103, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.5f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.8125f, -0.5f, 0)
			.setRotationPoint(-12.4375f, 5.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 98, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.5625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.8125f, -0.5625f, 0)
			.setRotationPoint(-12.625f, 5.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 70, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.375f, 0, -1.5f, -0.375f, 0, 0, 0, 0)
			.setRotationPoint(-7.4375f, 7.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 93, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, -0.4375f, -0.5f, 0, 0.78125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.78125f, 0, 0)
			.setRotationPoint(-3.5625f, 6.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 88, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.5f, 0, 0.4375f, -0.5f, 0, 0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-3.0625f, 6.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 83, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-2.625f, 5.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.5625f, 0, 0.4375f, -0.5625f, 0, 0.4375f, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-2.25f, 5.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 9, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0.78125f, 0, 0, 0.78125f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.5625f, 6.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 120, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0.4375f, -0.5f, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.0625f, 6.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 78, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, 0, 0.375f, -0.5f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.625f, 5.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 34, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.4375f, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, -0.5625f, 0, 0.4375f, -0.5625f, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.25f, 5.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 29, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.625f, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0.5f, -0.625f, 0, 0.5f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, 0.5f, 0.0625f, 0)
			.setRotationPoint(0.8125f, 4.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 5, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(-0.6875f, 5.375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.75f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, -1, -0.75f, 0, -0.375f, 0.0625f, 0, 0.5f, 0.0625f, 0, 0.5f, 0.0625f, 0, -0.375f, 0.0625f, 0)
			.setRotationPoint(-1.8125f, 4.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 116, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0.5f, 0.5625f, 0, 0, 0.5625f, 0, -0.5f, -0.8125f, 0, 0, -0.8125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8125f, -0.5f, -0.5f)
			.setRotationPoint(-8.0625f, 7.25f, 6.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 111, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0.5f, 0.5625f, 0, 0, 0.5625f, 0, -0.5f, -0.8125f, 0, 0, -0.8125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8125f, -0.5f, -0.5f)
			.setRotationPoint(6.4375f, 7.25f, 6.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 106, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5625f, 0, 0, -0.8125f, 0, 0.5f, -0.8125f, 0, 0, 0.5625f, 0, -0.5f, 0, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-7.4375f, 7.25f, 6.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 101, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5625f, 0, 0, -0.8125f, 0, 0.5f, -0.8125f, 0, 0, 0.5625f, 0, -0.5f, 0, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(7.0625f, 7.25f, 6.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 96, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0.5625f, 0, 0, -0.8125f, 0, 0.5f, -0.8125f, 0, 0, 0.5625f, 0, -0.5f)
			.setRotationPoint(-7.4375f, 4.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 91, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0.5625f, 0, 0, -0.8125f, 0, 0.5f, -0.8125f, 0, 0, 0.5625f, 0, -0.5f)
			.setRotationPoint(7.0625f, 4.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 86, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, -0.8125f, -0.5625f, -0.5f, -0.8125f, 0, 0.5f, 0.5625f, 0, 0, 0.5625f, 0, -0.5f, -0.8125f, 0, 0)
			.setRotationPoint(-8.0625f, 4.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 8, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, -0.8125f, -0.5625f, -0.5f, -0.8125f, 0, 0.5f, 0.5625f, 0, 0, 0.5625f, 0, -0.5f, -0.8125f, 0, 0)
			.setRotationPoint(6.4375f, 4.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 73, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 7.125f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 68, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 63, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, new Vec3f(0.0, 0.3125, 0.0))
			.setRotationPoint(-7.25f, 5.8125f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 58, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 7.125f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 53, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 5.6875f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 48, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, new Vec3f(0.0, 0.3125, 0.0))
			.setRotationPoint(7.25f, 5.8125f, 7).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 43, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 5.8125f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 24, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 6.0625f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 19, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 6.3125f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 14, 37, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 6.5625f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 38, 36, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 6.8125f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 122, 35, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.25f, 7.0625f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 81, 35, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 5.8125f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 123, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 6.0625f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 74, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 6.3125f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 61, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 6.5625f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 99, 11, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 6.8125f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 122, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(7.25f, 7.0625f, 7).setRotationAngle(0, 0, 6)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 109, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(0, 6.5f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 45, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(-11, 6.5f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 16, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.375f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(11, 6.5f, 8.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 122, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.375f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(0, 6.5f, 8.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 109, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.375f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(-11, 6.5f, 8.375f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 39, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, -0.625f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-11.1875f, 5.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(new_group0);
	}

}
