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
public class ModelNYC3AxleTenderBogie extends FVTMFormatBase {

	public ModelNYC3AxleTenderBogie(){
		super();
		textureX = 256;
		textureY = 64;
		addToCreators("broscolotos");
		//
		initGroup_clipboard();
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(-14.125f, 0.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(-2.5f, 0.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(11.125f, 0.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(-14.125f, 0.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(-2.5f, 0.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(11.125f, 0.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.5f, 2.0625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-17.375f, 5.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.4375f, 0.4375f, 4, null)
			.setRotationPoint(-16.6875f, 3.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-16.6875f, 3.4375f, -7.5f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-16.6875f, 3.9375f, -7.5f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-16.6875f, 4.4375f, -7.5f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-16.6875f, 4.9375f, -7.5f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(-17.375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-17.375f, 5.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(-17.375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0.375f, -0.75f, 0)
			.setRotationPoint(16.375f, 5.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(16.375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0.375f, -0.75f, 0)
			.setRotationPoint(16.375f, 5.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(16.375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.4375f, 0.4375f, 4, null)
			.setRotationPoint(-16.6875f, 3.3125f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-16.6875f, 3.4375f, 7.5f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-16.6875f, 3.9375f, 7.5f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-16.6875f, 4.4375f, 7.5f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-16.6875f, 4.9375f, 7.5f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.4375f, 0.4375f, 4, null)
			.setRotationPoint(16.6875f, 3.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.6875f, 3.4375f, -7.5f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.6875f, 3.9375f, -7.5f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.6875f, 4.4375f, -7.5f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.6875f, 4.9375f, -7.5f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.4375f, 0.4375f, 4, null)
			.setRotationPoint(16.6875f, 3.3125f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.6875f, 3.4375f, 7.5f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 30, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.6875f, 3.9375f, 7.5f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 30, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.6875f, 4.4375f, 7.5f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 30, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.6875f, 4.9375f, 7.5f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 0, textureX, textureY)
			.addShapeBox(0, -4, 0, 35, 1, 1, 0, -1.4375f, 0, 0, -1.3125f, 0, 0, -1.3125f, 0, 0, -1.4375f, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5625f, 5.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f)
			.setRotationPoint(-15.625f, 8.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(-10.875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-10.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0, 0, -1.3125f, 0, 0, 0, 0)
			.setRotationPoint(-9.25f, 4.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0)
			.setRotationPoint(-7.3125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(-2.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0)
			.setRotationPoint(-3.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0)
			.setRotationPoint(-5.375f, 4.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0)
			.setRotationPoint(-7.3125f, 4.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(-8.1875f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0)
			.setRotationPoint(-8.1875f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.1875f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-8.1875f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(-5.4375f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0)
			.setRotationPoint(-5.4375f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.4375f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-5.4375f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-4.4375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-9.25f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-8.1875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-5.4375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f)
			.setRotationPoint(-3, 8.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(1.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(2.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0, 0, -1.3125f, 0, 0, 0, 0)
			.setRotationPoint(3.375f, 4.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0)
			.setRotationPoint(5.3125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(9.875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0)
			.setRotationPoint(9.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0)
			.setRotationPoint(7.25f, 4.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0)
			.setRotationPoint(5.3125f, 4.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(4.4375f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0)
			.setRotationPoint(4.4375f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(4.4375f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(4.4375f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(7.1875f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0)
			.setRotationPoint(7.1875f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(7.1875f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(7.1875f, 3.0625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(8.1875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(3.375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(4.4375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(7.1875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f)
			.setRotationPoint(9.625f, 8.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(-11.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-14.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(-15.375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(14.375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0)
			.setRotationPoint(-16.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.75f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-12.5f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-14.0625f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(-12.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.1875f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.8125f, 0, 0)
			.setRotationPoint(-12.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-13.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0)
			.setRotationPoint(-13.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(-12.1875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0)
			.setRotationPoint(-14.0625f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-13.1875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-12.25f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-14.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-14.25f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(1.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-2.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.125f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(0.125f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-1.4375f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(0.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(0.4375f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.8125f, 0, 0)
			.setRotationPoint(-0.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-1.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0)
			.setRotationPoint(-0.875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(0.4375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0)
			.setRotationPoint(-1.4375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-0.5625f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(0.375f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-2.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-1.625f, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(13.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(10.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(12.75f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(11.1875f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(12.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.0625f, 2.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.8125f, 0, 0)
			.setRotationPoint(12.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0)
			.setRotationPoint(11.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0)
			.setRotationPoint(11.75f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(13.0625f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0)
			.setRotationPoint(11.1875f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(12.0625f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(13, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(10.5f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(11, 3.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(15.125f, 2.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 0, textureX, textureY)
			.addShapeBox(0, -4, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(17.5625f, 6.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, -4, 0, 35, 1, 1, 0, -1.4375f, 0, 0, -1.3125f, 0, 0, -1.3125f, 0, 0, -1.4375f, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5625f, 5.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f)
			.setRotationPoint(-15.625f, 8.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(-10.875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-10.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0, 0, -1.3125f, 0, 0, 0, 0)
			.setRotationPoint(-9.25f, 4.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0)
			.setRotationPoint(-7.3125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(-2.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0)
			.setRotationPoint(-3.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0)
			.setRotationPoint(-5.375f, 4.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0)
			.setRotationPoint(-7.3125f, 4.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(-8.1875f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0)
			.setRotationPoint(-8.1875f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.1875f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-8.1875f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(-5.4375f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0)
			.setRotationPoint(-5.4375f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.4375f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-5.4375f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-4.4375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-9.25f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-8.1875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-5.4375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f)
			.setRotationPoint(-3, 8.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(1.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(2.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0, 0, -1.3125f, 0, 0, 0, 0)
			.setRotationPoint(3.375f, 4.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0)
			.setRotationPoint(5.3125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(9.875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0)
			.setRotationPoint(9.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -1.3125f, 0)
			.setRotationPoint(7.25f, 4.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0)
			.setRotationPoint(5.3125f, 4.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(4.4375f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0)
			.setRotationPoint(4.4375f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(4.4375f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(4.4375f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(7.1875f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0)
			.setRotationPoint(7.1875f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(7.1875f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(7.1875f, 3.0625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(8.1875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(3.375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(4.4375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(7.1875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f, -0.125f, -0.625f, 0.125f)
			.setRotationPoint(9.625f, 8.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(-11.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-14.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(-15.375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0)
			.setRotationPoint(14.375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0)
			.setRotationPoint(-16.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.75f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-12.5f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-14.0625f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(-12.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.1875f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.8125f, 0, 0)
			.setRotationPoint(-12.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-13.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0)
			.setRotationPoint(-13.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(-12.1875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0)
			.setRotationPoint(-14.0625f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-13.1875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-12.25f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-14.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-14.25f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(1.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-2.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.125f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(0.125f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-1.4375f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(0.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(0.4375f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.8125f, 0, 0)
			.setRotationPoint(-0.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-1.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0)
			.setRotationPoint(-0.875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(0.4375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0)
			.setRotationPoint(-1.4375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-0.5625f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(0.375f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-2.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-1.625f, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0)
			.setRotationPoint(13.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(10.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(12.75f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(11.1875f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(12.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, -0.75f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.0625f, 2.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.8125f, 0, 0)
			.setRotationPoint(12.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, 0, 0.3125f, 0)
			.setRotationPoint(11.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0.0625f, 0)
			.setRotationPoint(11.75f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0)
			.setRotationPoint(13.0625f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0)
			.setRotationPoint(11.1875f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(12.0625f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(13, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(10.5f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(11, 3.875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.4375f, 0, -0.125f, -2.25f, 0, -0.125f, -2.25f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(15.125f, 2.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 0, textureX, textureY)
			.addShapeBox(0, -4, 0, 1, 1, 16, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-18.5625f, 6.3125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 7, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.125f, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 4, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.375f, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 3, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.625f, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 3, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.125f, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 3, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.375f, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 0, textureX, textureY)
			.addShapeBox(0, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.625f, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.125f, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f)
			.setRotationPoint(-14.125f, 7.625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1.25f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-12.625f, 6, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.25f, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-12.625f, 6, 8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 17, 8, 1.25f, 1.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-12.625f, 6, -8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.5f, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f)
			.setRotationPoint(-1.5f, 7.625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1.25f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(0, 6, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.25f, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(0, 6, 8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 17, 8, 1.25f, 1.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(0, 6, -8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.125f, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f)
			.setRotationPoint(11.125f, 7.625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1.25f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(12.625f, 6, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.25f, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(12.625f, 6, 8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 17, 8, 1.25f, 1.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12.625f, 6, -8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.125f, 4.625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f)
			.setRotationPoint(-14.125f, 7.625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.5f, 4.625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f)
			.setRotationPoint(-1.5f, 7.625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.125f, 4.625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f, -0.125f, -0.375f, -0.0625f)
			.setRotationPoint(11.125f, 7.625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 0, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 1.25f, 1.25f, 4, null)
			.setRotationPoint(0, 0.625f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, 2.0625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -3, 0, 0)
			.setRotationPoint(-6.5f, 3.0625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -3, 0, 0)
			.setRotationPoint(-6.5f, 3.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-1, 2.0625f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 8, 0, 0, 0, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -2, 0, 0, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -2)
			.setRotationPoint(-2.5f, 1.625f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 8, 0, -0.5f, 0, 0, 0, 0, -2, 0, 0, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -2, 0, 0, -2, -0.5f, 0, 0)
			.setRotationPoint(0.5f, 1.625f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 1.625f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-14.5f, 5.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f)
			.setRotationPoint(-11.75f, 5.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f)
			.setRotationPoint(13.5f, 5.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(10.75f, 5.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f)
			.setRotationPoint(0.875f, 5.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-1.875f, 5.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-14.5f, 5.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f)
			.setRotationPoint(-11.75f, 5.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f)
			.setRotationPoint(13.5f, 5.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(10.75f, 5.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f)
			.setRotationPoint(0.875f, 5.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.125f, -0.625f, 0.5f, -0.125f, -0.625f, 0.5f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, -0.625f, 0.375f, -0.125f, -0.625f, 0.375f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-1.875f, 5.1875f, -8).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

}
