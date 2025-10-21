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
public class ModelNYCPT2TenderBogie extends FVTMFormatBase {

	public ModelNYCPT2TenderBogie(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_Bogie();
	}

	private final void initGroup_Bogie(){
		TurboList Bogie = new TurboList("Bogie");
		Bogie.add(new ModelRendererTurbo(Bogie, 284, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.3125f, 0.1875f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.125f, 0.1875f, -0.3125f)
			.setRotationPoint(-13.375f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 283, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-13.5625f, 3.875f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 302, 111, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.9375f, 6, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 21, 166, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(-7.9375f, 6, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 468, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -1.1875f, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.25f, 2.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 468, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, -0.375f, -0.25f, 0)
			.setRotationPoint(0.25f, 2.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 468, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5625f, 0, 0.8125f, -0.5625f, 0, 0.8125f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(0.25f, 3.4375f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 441, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, 0, -0.375f, -0.6875f, 0)
			.setRotationPoint(0.25f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 251, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(5.875f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 502, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(10, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 235, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -1, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(9, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 16, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.1875f, 0, 0, -0.125f, 0, -0.3125f, 0, 0, 0, 0, 0.1875f, 0, 0.1875f, 0.1875f, 0, -0.125f, 0.1875f, -0.3125f, 0, 0.1875f, 0)
			.setRotationPoint(12.375f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 139, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.625f, 0, 0, -1.1875f, 0, 0, -1.1875f, 0, 0, -0.625f, 0, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-10.25f, 2.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 480, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0, 0.125f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, 0.125f, -0.25f, 0)
			.setRotationPoint(-11.25f, 2.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 455, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.8125f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, 0.8125f, -0.5625f, 0)
			.setRotationPoint(-11.25f, 3.4375f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 468, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.6875f, 0, 0.125f, -0.6875f, 0)
			.setRotationPoint(-12.25f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 441, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0)
			.setRotationPoint(-6.125f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -1, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-6.875f, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 503, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0)
			.setRotationPoint(-13, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 251, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-10, 4.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 235, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0)
			.setRotationPoint(-0.5f, 2.6875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 16, 103, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(8, 0).setScale(0.8125f, 0.8125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0, 3.75f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 305, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, -0.5625f, 0.0625f, 0, -0.5625f, 0.0625f)
			.setRotationPoint(5.34375f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 465, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.5625f, 0, -0.8125f, -0.5625f, 0, -0.8125f, -0.5625f, 0.0625f, 0, -0.5625f, 0.0625f)
			.setRotationPoint(-10.53125f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(10, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 300, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, 0, 0, 0, 0, 0, -0.125f, -0.375f, 0.375f, -2, -0.375f, 0.375f, -2, 0, 0, -0.125f, 0)
			.setRotationPoint(10.1875f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 438, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.8125f, -0.3125f, 0)
			.setRotationPoint(-11, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 506, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0.375f, 0, 0, 0.375f, -2, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, 0, 0.375f, -2, 0)
			.setRotationPoint(-11.1875f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.8125f, -0.3125f, 0)
			.setRotationPoint(-6.6875f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 230, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0.1875f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0.1875f, 0)
			.setRotationPoint(-6.5f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 491, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-6, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 230, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -1, 0, 0, -1, 0, 0, -0.3125f, 0)
			.setRotationPoint(-5, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 506, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(5.6875f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 229, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.5f, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 446, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.3125f, 0)
			.setRotationPoint(5, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 430, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -1, 0)
			.setRotationPoint(4, 5.0625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 368, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0)
			.setRotationPoint(-1.5f, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 468, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 16, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-1.5f, 5.3125f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 240, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-1, 6.5625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 212, 106, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.9375f, 6, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 465, 37, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.9375f, 6, -6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 151, 114, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(7.9375f, 6, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 219, 25, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.9375f, 6, -6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 194, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -4.5f, 0, 0, -4.25f, 0, 0, -4.25f, 0, 0, -4.5f, 0, 0, -0.375f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(-5.625f, 5.3125f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 169, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-5.625f, 6.4375f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 213, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(-5.0625f, 2.5625f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 16, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(-11.8125f, 2.5625f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(10.8125f, 2.5625f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 16, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(4.0625f, 2.5625f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 228, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0.125f, 0.125f, 0, 0.375f, 0.125f, 0, 0.375f, 0.125f, 0, 0.125f, 0.125f, 0, -3.625f, 0, 0, -3.375f, 0, 0, -3.375f, 0, 0, -3.625f, 0, 0)
			.setRotationPoint(-12.0625f, 3.125f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0.125f, 0.125f, 0, 0.375f, 0.125f, 0, 0.375f, 0.125f, 0, 0.125f, 0.125f, 0, -3.625f, 0, 0, -3.375f, 0, 0, -3.375f, 0, 0, -3.625f, 0, 0)
			.setRotationPoint(3.8125f, 3.125f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 466, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -4.5f, 0, 0, -4.25f, 0, 0, -4.25f, 0, 0, -4.5f, 0, 0, -0.375f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.375f, 0.125f, 0)
			.setRotationPoint(-5.625f, 5.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 441, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-5.625f, 6.4375f, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(-5.0625f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 16, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(-11.8125f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(4.0625f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 228, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0.125f, 0.125f, 0, 0.375f, 0.125f, 0, 0.375f, 0.125f, 0, 0.125f, 0.125f, 0, -3.625f, 0, 0, -3.375f, 0, 0, -3.375f, 0, 0, -3.625f, 0, 0)
			.setRotationPoint(-12.0625f, 3.125f, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0.125f, 0.125f, 0, 0.375f, 0.125f, 0, 0.375f, 0.125f, 0, 0.125f, 0.125f, 0, -3.625f, 0, 0, -3.375f, 0, 0, -3.375f, 0, 0, -3.625f, 0, 0)
			.setRotationPoint(3.8125f, 3.125f, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 469, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1.1875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -1.1875f, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.25f, 2.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 194, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, -0.375f, -0.25f, 0)
			.setRotationPoint(0.25f, 2.6875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 169, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5625f, 0, 0.8125f, -0.5625f, 0, 0.8125f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(0.25f, 3.4375f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 404, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, 0, -0.375f, -0.6875f, 0)
			.setRotationPoint(0.25f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 446, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(5.875f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 11, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(10, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 430, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -1, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(9, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 507, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, -0.3125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -0.125f, 0.1875f, -0.3125f, 0.1875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(12.375f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 469, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.625f, 0, 0, -1.1875f, 0, 0, -1.1875f, 0, 0, -0.625f, 0, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-10.25f, 2.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 468, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0, 0.125f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, 0.125f, -0.25f, 0)
			.setRotationPoint(-11.25f, 2.6875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 213, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.8125f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, 0.8125f, -0.5625f, 0)
			.setRotationPoint(-11.25f, 3.4375f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 465, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.6875f, 0, 0.125f, -0.6875f, 0)
			.setRotationPoint(-12.25f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 465, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0)
			.setRotationPoint(-6.125f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 219, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -1, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-6.875f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 11, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0)
			.setRotationPoint(-13, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 228, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-10, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 507, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, -0.125f, 0.1875f, -0.3125f, 0, 0.1875f, 0, 0, 0.1875f, 0, 0.1875f, 0.1875f, 0)
			.setRotationPoint(-13.375f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 491, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0)
			.setRotationPoint(-0.5f, 2.6875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 446, 31, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(1).setSegments(8, 0).setScale(0.8125f, 0.8125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0, 3.75f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 424, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0.1875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(12.375f, 3.875f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 469, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0.0625f, -0.8125f, 0, 0.0625f, -0.8125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0.0625f, -0.8125f, -0.5625f, 0.0625f, -0.8125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(5.34375f, 7.75f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 469, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0.0625f, -0.8125f, 0, 0.0625f, -0.8125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0.0625f, -0.8125f, -0.5625f, 0.0625f, -0.8125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-10.53125f, 7.75f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 430, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(10, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 228, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.125f, 0, 0.375f, -2, 0, 0.375f, -2, -0.375f, 0, -0.125f, -0.375f)
			.setRotationPoint(10.1875f, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.8125f, -0.3125f, 0)
			.setRotationPoint(-11, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 491, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, -2, 0, 0, -0.125f, 0, 0, -0.125f, -0.375f, 0.375f, -2, -0.375f)
			.setRotationPoint(-11.1875f, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 507, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.8125f, -0.3125f, 0)
			.setRotationPoint(-6.6875f, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 455, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0.1875f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0.1875f, 0)
			.setRotationPoint(-6.5f, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 228, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-6, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -1, 0, 0, -1, 0, 0, -0.3125f, 0)
			.setRotationPoint(-5, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 491, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(5.6875f, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 455, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.5f, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 228, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.3125f, 0)
			.setRotationPoint(5, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -1, 0)
			.setRotationPoint(4, 5.0625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 12, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-1, 6.5625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 507, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f, -0.0625f, 0.125f, -0.0625f)
			.setRotationPoint(10.8125f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 451, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f)
			.setRotationPoint(5.9375f, 4.75f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 440, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f)
			.setRotationPoint(5.9375f, 4.875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 429, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f)
			.setRotationPoint(5.9375f, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 283, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f)
			.setRotationPoint(5.9375f, 6.625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 272, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f)
			.setRotationPoint(5.9375f, 4.75f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 261, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f)
			.setRotationPoint(5.9375f, 4.875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 196, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f)
			.setRotationPoint(5.9375f, 4.375f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 65, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f)
			.setRotationPoint(5.9375f, 6.625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 54, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f)
			.setRotationPoint(-9.9375f, 4.75f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 43, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f)
			.setRotationPoint(-9.9375f, 4.875f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 379, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f)
			.setRotationPoint(-9.9375f, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 185, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f)
			.setRotationPoint(-9.9375f, 6.625f, -8).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 32, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f)
			.setRotationPoint(-9.9375f, 4.75f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 21, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f)
			.setRotationPoint(-9.9375f, 4.875f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 249, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f)
			.setRotationPoint(-9.9375f, 4.375f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 484, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f, -1.25f, -0.25f, -0.0625f)
			.setRotationPoint(-9.9375f, 6.625f, 7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 296, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 6.5625f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 291, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 4.5625f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 249, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 5.3125f, -6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 235, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 5.8125f, -6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 230, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 6.3125f, -6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 225, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 6.5625f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 220, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 4.5625f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 215, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 4.8125f, 6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 210, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 5.3125f, 6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 205, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 5.8125f, 6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 200, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 6.3125f, 6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 195, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 6.5625f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 156, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 4.5625f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 151, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 4.8125f, -6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 146, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 5.3125f, -6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 141, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 5.8125f, -6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 136, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 6.3125f, -6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 131, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 6.5625f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 126, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 4.5625f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 76, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 4.8125f, 6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 71, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 5.3125f, 6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 46, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 5.8125f, 6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 41, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(11.3125f, 6.3125f, 6.6875f).setRotationAngle(0, 0, -10)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 446, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 14, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0)
			.setRotationPoint(-2, 2.6875f, -7).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 434, 164, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 1, 1, 4, null)
			.setRotationPoint(0, 1.6875f, 0).setRotationAngle(0, 0, 0)
		);
		Bogie.add(new ModelRendererTurbo(Bogie, 286, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-11.3125f, 4.8125f, -6.6875f).setRotationAngle(0, 0, -10)
		);
		groups.add(Bogie);
	}

}
