//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.parts;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelAC44CWCompressor extends FVTMFormatBase {

	public ModelAC44CWCompressor(){
		super();
		textureX = 32;
		textureY = 32;
		addToCreators("broscolotos");
		//
		initGroup_Airthingy();
	}

	private final void initGroup_Airthingy(){
		TurboList Airthingy = new TurboList("Airthingy");
		Airthingy.add(new ModelRendererTurbo(Airthingy, 0, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 8, 1, 1, 4, null)
			.setRotationPoint(-32, 0.25f, -10).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 25, 24, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 8, 1, 1, 4, null)
			.setRotationPoint(-32, 0.25f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 10, 26, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.1875f, 1.1875f, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(-32, 2.43749f, -10).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 0, 28, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.1875f, 1.1875f, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(-32, 2.4375f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 14, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(-32.875f, -1.6875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 7, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-32.875f, -0.9375f, -10.375f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-32.875f, -0.9375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.875f, -0.5625f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 15, 24, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.8125f, 0.8125f, 4, null)
			.setRotationPoint(-32, -0.3125f, -10).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 5, 23, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.8125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-32, -0.4375f, -10).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 25, 20, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-32, -0.5625f, -10).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 20, 22, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.8125f, 0.8125f, 4, null)
			.setRotationPoint(-32, -0.3125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 0, 24, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.8125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-32, -0.4375f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 15, 20, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-32, -0.5625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 10, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, 0.125, 0.0))
			.setRotationPoint(-30.25f, 0.8125f, -9.6875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 5, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.875f, 0.875f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-30.25f, 0.4375f, -9.6875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 25, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.6875f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-30.25f, 4.9375f, -9.6875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 20, 18, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.5625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-30.25f, 5.125f, -9.6875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 0, 20, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.875f, 0.875f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-30.25f, 3.1875f, -9.6875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 15, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-29.875f, -0.5625f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 5, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.25f, -0.75f, -0.125f, -0.25f, -0.75f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.5f, -0.375f, -0.75f, -0.5f, -0.375f, -0.75f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-29.875f, -0.1875f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 19, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f)
			.setRotationPoint(-32.5f, 5.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 10, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-30.25f, 5.75f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 5, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.1875))
			.setRotationPoint(-32, 5.75f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 20, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f)
			.setRotationPoint(-30.75f, 5.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 23, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-30.75f, 5.25f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 15, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-32.5f, 5.25f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 10, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(-31, 5.25f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 5, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(-32.75f, 5.25f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 15, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.4375f, -0.875f, -0.5f, -0.4375f, -0.875f, -0.5f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, -0.875f, -0.5f, -0.4375f, -0.875f, -0.5f, -0.4375f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(-33.125f, 5.25f, -11.375f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 19, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.4375f, -0.875f, -0.5f, -0.4375f, -0.875f, -0.5f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, -0.875f, -0.5f, -0.4375f, -0.875f, -0.5f, -0.4375f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(-31.375f, 5.25f, -11.375f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 24, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -0.25f, -0.875f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-33.125f, 3.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 15, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.4375f, -0.875f, -0.5f, -0.4375f, -0.875f, -0.5f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.0625f, -1.25f, -0.5f, -0.0625f, -1.25f, -0.5f, -0.0625f, 0.375f, -0.375f, -0.0625f, 0.375f)
			.setRotationPoint(-33.125f, 4.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 10, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.875f, -0.5f, -0.75f, -0.875f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -1.0625f, -0.5f, 0, -1.0625f, -0.5f, 0, 0.1875f, -0.375f, 0, 0.1875f)
			.setRotationPoint(-31.375f, 4.6875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 23, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.4375f, -0.4375f, -0.78125f, 0.1875f, -0.4375f, -0.78125f, 0.1875f, -0.4375f, -0.09375f, -0.4375f, -0.4375f, -0.09375f, -0.4375f, -0.4375f, -0.875f, 0.1875f, -0.4375f, -0.875f, 0.1875f, -0.4375f, 0, -0.4375f, -0.4375f, 0)
			.setRotationPoint(-33.0625f, 4.875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 5, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -1.0625f, -0.5f, -0.5f, -1.0625f, -0.5f, -0.5f, 0.1875f, -0.375f, -0.5f, 0.1875f)
			.setRotationPoint(-33.125f, 2.9375f, -11.9375f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, -0.875f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0)
			.setRotationPoint(-33.125f, 2.1875f, -11.9375f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 25, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -1, -1.25f, 0, -1, -1.25f, 0, 0.125f, 0.375f, 0, 0.125f, -0.375f, -0.5f, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-33.125f, 1.6875f, -11.9375f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 20, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-33.875f, 0.1875f, -11.8125f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 16, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.875f, -0.875f, -0.5f, -0.875f, -0.875f, -0.5f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-33.5f, 0.0625f, -11.8125f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 9, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.875f, -0.375f, 0.5f, -1.125f, -0.375f, 0.5f, 0.25f, 0, 0, 0, 0, -0.875f, -0.875f, -0.375f, -1.375f, -1.125f, -0.375f, -1.375f, 0.25f, 0, -0.875f, 0)
			.setRotationPoint(-32, 0.0625f, -11.8125f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 15, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.5f, -0.875f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-30.375f, -0.4375f, -11.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 10, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-33.125f, -0.5625f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 5, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.25f, -0.75f, -0.125f, -0.25f, -0.75f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.5f, -0.375f, -0.75f, -0.5f, -0.375f, -0.75f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-33.125f, -0.1875f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-33.5f, 0.4375f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 26, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-33.5f, 0.9375f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		Airthingy.add(new ModelRendererTurbo(Airthingy, 21, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-33.5f, 1.4375f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		groups.add(Airthingy);
	}

}
