//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelL3aRearBogie extends FVTMFormatBase {

	public ModelL3aRearBogie(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_RearBogie();
	}

	private final void initGroup_RearBogie(){
		TurboList RearBogie = new TurboList("RearBogie");
		RearBogie.add(new ModelRendererTurbo(RearBogie, 378, 6, textureX, textureY)
			.addShapeBox(-3.5f, -3.5f, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.875f, 6.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 313, 6, textureX, textureY)
			.addShapeBox(-3.5f, -3.5f, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.875f, 6.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 328, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.375f, 2.625f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0.5f, 0.625f, -0.125f, 0.5f, 0.625f, 0, 0, 0, 0)
			.setRotationPoint(-26.125f, 6.125f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 15, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-22.625f, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 482, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1.375f, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.25f, -1.375f, 0, -0.25f, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, 0, -0.25f, 0.375f, 0)
			.setRotationPoint(-23.625f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 465, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, -0.125f, 0.625f, -0.125f, -0.125f, 0.625f, 0, 0, 0, 0, 0, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-22.25f, 3.25f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 460, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, 0, 0, -0.5f, 0, 0, 0.375f, -0.125f, -0.625f, 0.375f, -0.125f, -0.625f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-22.625f, 3.25f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 272, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.125f, 6.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 427, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-17.375f, 5.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 353, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.125f, -0.375f, 0.125f, -0.125f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-17.125f, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 455, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.375f, 5.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 434, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.125f, 0, -1, -0.125f, 0, -1, 0, 0, -0.75f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.375f, 5.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 409, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.25f, -1.375f, -0.125f, -0.25f, -1.375f, 0, 0, 0, 0, 0, 0.375f, -0.125f, -0.25f, 0.375f, -0.125f, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-15.5f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 356, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, 0.625f, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0.625f, 0, -0.125f, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, 0, -0.125f, -0.625f, 0)
			.setRotationPoint(-16.875f, 3.25f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 277, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, 0, -0.625f, 0.375f, 0)
			.setRotationPoint(-16.5f, 3.25f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 76, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.125f, 0.125f, -0.375f, -0.125f, 0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-15.5f, 5.125f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 158, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.375f, 2.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 272, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0.5f, 0.625f, -0.125f, 0.5f, 0.625f, 0, 0, 0, 0)
			.setRotationPoint(-26.125f, 6.125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 504, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-22.625f, 4.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 71, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1.375f, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.25f, -1.375f, 0, -0.25f, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, 0, -0.25f, 0.375f, 0)
			.setRotationPoint(-23.625f, 3.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 66, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, -0.125f, 0.625f, -0.125f, -0.125f, 0.625f, 0, 0, 0, 0, 0, -0.625f, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-22.25f, 3.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 61, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, 0, 0, -0.5f, 0, 0, 0.375f, -0.125f, -0.625f, 0.375f, -0.125f, -0.625f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-22.625f, 3.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 186, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.125f, 6.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 12, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.125f, 1, -0.25f, -0.125f, 1, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-17.375f, 5.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 237, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.125f, -0.375f, 0.125f, -0.125f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-17.125f, 4.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 158, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, -0.75f, -0.125f, -1, -0.75f, -0.125f, -1, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-17.375f, 5.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 56, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.25f, -1.375f, -0.125f, -0.25f, -1.375f, 0, 0, 0, 0, 0, 0.375f, -0.125f, -0.25f, 0.375f, -0.125f, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-15.5f, 3.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 43, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, 0.625f, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0.625f, 0, -0.125f, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, 0, -0.125f, -0.625f, 0)
			.setRotationPoint(-16.875f, 3.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 404, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, 0, -0.625f, 0.375f, 0)
			.setRotationPoint(-16.5f, 3.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 344, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.125f, 0.125f, -0.375f, -0.125f, 0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-15.5f, 5.125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.125f, 0, 0, 0.375f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.375f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-12.375f, 6.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.125f, 0, 0, 1.125f, 0, 0, -1.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 1.125f, 0, 0, -1.25f, 0, 0, 0)
			.setRotationPoint(-10.375f, 6.75f, 5.375f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.125f, 0, 0, 1.625f, 0, 0, -1.75f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 1.625f, 0, 0, -1.75f, 0, 0, 0)
			.setRotationPoint(-8.375f, 6.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.375f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.375f, 0, 0, -0.125f)
			.setRotationPoint(-12.375f, 6.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 369, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, 1.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -1.25f, 0, 0, 1.125f, 0, 0, -0.125f)
			.setRotationPoint(-10.375f, 6.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 389, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, -1.75f, 0, 0, 1.625f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -1.75f, 0, 0, 1.625f, 0, 0, -0.125f)
			.setRotationPoint(-8.375f, 6.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 369, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.125f, 0, 0, 1.375f, 0, 0, -1.5f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 1.375f, 0, 0, -1.5f, 0, 0, 0)
			.setRotationPoint(-6.375f, 6.75f, 2.375f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 294, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, 0, 0, 0.5f, 0, 0, -0.625f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.5f, 0, 0, -0.625f, 0, 0, 0)
			.setRotationPoint(-4.375f, 6.75f, 0.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 167, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, -0.375f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, -0.375f, 0, 0, 0)
			.setRotationPoint(-3.375f, 6.75f, 0.25f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 162, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 1.375f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -1.5f, 0, 0, 1.375f, 0, 0, -0.125f)
			.setRotationPoint(-6.375f, 6.75f, -3.375f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 162, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, 0.5f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -0.625f, 0, 0, 0.5f, 0, 0, -0.125f)
			.setRotationPoint(-4.375f, 6.75f, -1.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 157, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0.25f, 0, 0, -0.125f)
			.setRotationPoint(-3.375f, 6.75f, -1.25f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 499, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-2.375f, 6.75f, -0.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 494, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.125f)
			.setRotationPoint(-2.375f, 6.75f, 0).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 489, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0)
			.setRotationPoint(-1.375f, 6.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 130, 67, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.75f, 1.0E-15f).setLength(2).setSegments(8, 4).setScale(1, 1).setDirection(5)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-0.375f, 6.75f, 0).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 470, 139, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, null)
			.setRotationPoint(-18.875f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 377, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, -0.125f, -0.9375f, -0.375f, -0.125f, -1, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.625f, 4.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 289, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-20.625f, 4.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 284, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.9375f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(-18.125f, 4.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 136, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.375f, 0, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-18.125f, 4.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 277, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.125f, -0.375f, 0.125f, -0.125f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-17.75f, 5.9375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 162, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-19.6875f, 5.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 259, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.0625f, 6, 5.75f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 483, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(-21, 5.9375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 391, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.6875f, 0, 0)
			.setRotationPoint(-20.6875f, 6, 5.75f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 345, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5625f, -0.125f, 0, -0.5625f, -0.125f, 0, -0.5625f, 0, -0.5f, -0.5625f, 0)
			.setRotationPoint(-21.125f, 5.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 439, 131, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.703125f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-18.875f, 6.5f, 7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 174, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, 0, 0, 0, -0.125f, 0, -0.875f, -0.875f, -0.25f, -0.875f, -0.875f, -0.25f, -0.875f, 0, 0, -0.875f, -0.125f)
			.setRotationPoint(-26.125f, 6.125f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 283, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, -0.875f, -0.875f, 0, -1.125f, -0.875f, 0, -1.125f, 0, 0, -0.875f, 0)
			.setRotationPoint(-25.375f, 6.125f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 159, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, 0, 0.75f, -0.875f, 0, 0.75f, 0, 0, 0, 0, 0, -0.875f, -0.875f, 0, -1.625f, -0.875f, 0, -1.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-24.375f, 5.875f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 401, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.625f, 0.5f, -0.875f, -0.625f, 0.5f, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.625f, -1.375f, -0.875f, -0.625f, -1.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-22.625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 391, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.125f, 0.625f, -0.875f, -0.125f, 0.625f, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.125f, -1.5f, -0.875f, -0.125f, -1.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(-22.25f, 3.25f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 158, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.375f, -0.875f, -0.875f, -0.375f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-21.375f, 2.625f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 260, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.875f, -0.875f, -0.125f, -0.875f, -0.875f, -0.125f, 0, -0.125f, 0, 0, 0.625f, 0.375f, -0.875f, -1.625f, 0.5f, -0.875f, -1.625f, 0.5f, 0, 0.625f, 0.375f, 0)
			.setRotationPoint(-22.75f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 139, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, -1.125f, -0.875f, -0.25f, -0.875f, -0.875f, -0.25f, -0.875f, 0, 0.25f, -1.125f, 0)
			.setRotationPoint(-13.125f, 6.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 78, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0.75f, 0, 0, -1.625f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0, -1.625f, 0)
			.setRotationPoint(-14.375f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 337, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.875f, -0.625f, 0.125f, -0.875f, -0.625f, 0.125f, 0, 0, 0.75f, 0, 0, -1.625f, -0.875f, -0.625f, -1, -0.875f, -0.625f, -1, 0, 0, -1.625f, 0)
			.setRotationPoint(-14.75f, 5.875f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 337, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0.5f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, -1.375f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, -0.625f, -1.375f, 0)
			.setRotationPoint(-16.5f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 55, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0.625f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.125f, 0.625f, 0, -0.125f, -1.5f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, -0.125f, -1.5f, 0)
			.setRotationPoint(-16.875f, 3.25f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 55, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.125f, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, 0, -0.875f, -0.125f, 0, -1.625f, 0.5f, -0.875f, 0.625f, 0.375f, -0.875f, 0.625f, 0.375f, 0, -1.625f, 0.5f, 0)
			.setRotationPoint(-16.375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 112, 24, textureX, textureY)
			.addShapeBox(-0.25f, 0, 0, 2, 1, 1, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.625f, 0, 0, 0, 0, -0.875f, -0.875f, 0, -0.875f, -0.375f, 0, -0.875f, -0.625f, 0, -0.875f, 0)
			.setRotationPoint(-12.125f, 6.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.75f, -0.875f, -0.875f, -0.75f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-20, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 459, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-17.75f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 447, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(-17.375f, 4.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 438, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, -0.25f, 0, -0.625f, -0.625f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-21, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 426, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, -0.5f, 0, -0.75f, -0.5f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-21.375f, 4.75f, 6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 496, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.25f, 0, -0.875f, -0.25f, 0, 0, 0, 0, 0, 0, -0.875f, -1, -0.25f, -0.875f, -0.875f, -0.25f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26.125f, 6.125f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 149, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, -0.875f, -0.875f, 0, -1.125f, -0.875f, 0, -1.125f, 0, 0, -0.875f, 0)
			.setRotationPoint(-25.375f, 6.125f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 496, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, 0, 0.75f, -0.875f, 0, 0.75f, 0, 0, 0, 0, 0, -0.875f, -0.875f, 0, -1.625f, -0.875f, 0, -1.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-24.375f, 5.875f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 376, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.625f, 0.5f, -0.875f, -0.625f, 0.5f, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.625f, -1.375f, -0.875f, -0.625f, -1.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-22.625f, 3.75f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 270, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.125f, 0.625f, -0.875f, -0.125f, 0.625f, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.125f, -1.5f, -0.875f, -0.125f, -1.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(-22.25f, 3.25f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 158, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.375f, -0.875f, -0.875f, -0.375f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-21.375f, 2.625f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 396, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.875f, -0.875f, -0.125f, -0.875f, -0.875f, -0.125f, 0, -0.125f, 0, 0, 0.625f, 0.375f, -0.875f, -1.625f, 0.5f, -0.875f, -1.625f, 0.5f, 0, 0.625f, 0.375f, 0)
			.setRotationPoint(-22.75f, 3.75f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 376, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, -1.125f, -0.875f, -0.25f, -0.875f, -0.875f, -0.25f, -0.875f, 0, 0.25f, -1.125f, 0)
			.setRotationPoint(-13.125f, 6.75f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 188, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0.75f, 0, 0, -1.625f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0, -1.625f, 0)
			.setRotationPoint(-14.375f, 6.5f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 188, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.875f, -0.625f, 0.125f, -0.875f, -0.625f, 0.125f, 0, 0, 0.75f, 0, 0, -1.625f, -0.875f, -0.625f, -1, -0.875f, -0.625f, -1, 0, 0, -1.625f, 0)
			.setRotationPoint(-14.75f, 5.875f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 189, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0.5f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, -1.375f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, -0.625f, -1.375f, 0)
			.setRotationPoint(-16.5f, 3.75f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 27, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0.625f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.125f, 0.625f, 0, -0.125f, -1.5f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, -0.125f, -1.5f, 0)
			.setRotationPoint(-16.875f, 3.25f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 397, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.125f, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, 0, -0.875f, -0.125f, 0, -1.625f, 0.5f, -0.875f, 0.625f, 0.375f, -0.875f, 0.625f, 0.375f, 0, -1.625f, 0.5f, 0)
			.setRotationPoint(-16.375f, 3.75f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 480, 23, textureX, textureY)
			.addShapeBox(-0.25f, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.375f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.375f, 0, -0.875f, -0.875f)
			.setRotationPoint(-12.125f, 6.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 502, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.75f, -0.875f, -0.875f, -0.75f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-20, 4.5f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 376, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-17.75f, 4.5f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 188, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-20.625f, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 397, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.375f, 0, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-18.125f, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 376, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.125f, -0.375f, 0.125f, -0.125f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-17.75f, 5.9375f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 480, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-19.6875f, 5.6875f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 188, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.0625f, 6, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 7, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(-21, 5.9375f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 409, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.6875f, 0, 0)
			.setRotationPoint(-20.6875f, 6, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5625f, -0.125f, 0, -0.5625f, -0.125f, 0, -0.5625f, 0, -0.5f, -0.5625f, 0)
			.setRotationPoint(-21.125f, 5.25f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-21.125f, 7.375f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-21.125f, 7.375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 130, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.125f, 0, -1, -0.125f, 0, -1, 0, 0, -0.625f, 0)
			.setRotationPoint(-20.625f, 8.375f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 130, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.125f, 0, -1, -0.125f, 0, -1, 0, 0, -0.625f, 0)
			.setRotationPoint(-20.625f, 8.375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 243, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, 0, 0, -1, 0)
			.setRotationPoint(-18.125f, 8.375f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 80, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, 0, 0, -1, 0)
			.setRotationPoint(-18.125f, 8.375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 0, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, -0.125f, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, -0.125f, 0, 0)
			.setRotationPoint(-27.125f, 6.125f, -6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 12, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, 0, 0, 0, 1, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, 0, 1, -0.25f, 0)
			.setRotationPoint(-23.375f, 5.125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 341, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1, -0.75f, -0.125f, -0.25f, -0.75f, -0.125f, -0.25f, -0.75f, 0, -1, -0.75f, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.375f, 5.125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 1, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.125f, 1, -0.25f, -0.125f)
			.setRotationPoint(-23.375f, 5.125f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 284, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.125f, -1, -0.75f, -0.125f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-25.375f, 5.125f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 422, 138, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 0.75f, 0.75f, 0, null)
			.setRotationPoint(-18.875f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 263, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.25f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, -0.25f, 0, -0.625f, -0.625f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-21, 4.5f, -7.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, null)
			.setRotationPoint(-18.875f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 319, 50, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.703125f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(-18.875f, 6.5f, -8).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 337, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.875f, 0, -0.875f, -0.875f)
			.setRotationPoint(-17.375f, 4.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 226, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, -0.5f, -0.875f, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, -0.875f, -0.75f, -0.5f, -0.875f)
			.setRotationPoint(-21.375f, 4.75f, -7).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 61, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.375f, 0, -1, -0.375f, 0, -0.9375f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-20.625f, 4.625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 114, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.125f, -0.9375f, -0.375f, -0.125f)
			.setRotationPoint(-18.125f, 4.625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		groups.add(RearBogie);
	}

}
