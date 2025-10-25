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
public class Model40TonWoodenHopperBogie extends FVTMFormatBase {

	public Model40TonWoodenHopperBogie(){
		super();
		textureX = 256;
		textureY = 64;
		addToCreators("Rodn56");
		addToCreators("broscolotos");
		//
		initGroup_wheels();
		initGroup_truck3();
		initGroup_clipboard();
	}

	private final void initGroup_wheels(){
		TurboList wheels = new TurboList("wheels");
		wheels.add(new ModelRendererTurbo(wheels, 82, 0, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(6.6875f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		wheels.add(new ModelRendererTurbo(wheels, 67, 0, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(6.6875f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		groups.add(wheels);
	}


	private final void initGroup_truck3(){
		TurboList truck3 = new TurboList("truck3");
		truck3.add(new ModelRendererTurbo(truck3, 104, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 161, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-0.75f, 6.25f, 8.25f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 140, 8, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(0, 2.5f, 0).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 112, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2, 8, 6).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 97, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(1.5f, 4.5f, 6).setRotationAngle(0, 0, -0.25f)
		);
		truck3.add(new ModelRendererTurbo(truck3, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-1.5f, 4.5f, -9).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 164, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2, 4, -8.5f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 97, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2, 8, -9.5f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 248, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2, 4.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 233, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(1.5f, 4.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 151, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.5f, 7.5625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 138, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.375f, -0.625f, -0.5f, -0.375f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(4.875f, 5.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 232, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.4375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4375f, 0, 0, -0.0625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.0625f, 0)
			.setRotationPoint(2, 7.5625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 221, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.0625f, -0.5f, 0, -0.0625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(1.5f, 4.125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 156, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(0.75f, 6.25f, 8.25f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 151, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 7.75f, 8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 146, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 7.5f, 8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 141, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 7.25f, 8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 136, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 7, 8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 111, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 6.75f, 8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 73, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 6.5f, 8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 68, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 7.75f, 8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 63, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 7.5f, 8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 58, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 7.25f, 8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 53, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 7, 8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 35, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 6.75f, 8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 30, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 6.5f, 8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 48, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-0.75f, 6.25f, -8.25f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 43, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(0.75f, 6.25f, -8.25f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 25, 14, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 7.75f, -8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 131, 13, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 7.5f, -8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 79, 13, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 7.25f, -8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 10, 13, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 7, -8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 224, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 6.75f, -8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 219, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.75f, 6.5f, -8.25f).setRotationAngle(0, 0, 8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 214, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 7.75f, -8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 209, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 7.5f, -8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 204, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 7.25f, -8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 199, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 7, -8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 194, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 6.75f, -8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 189, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-0.75f, 6.5f, -8.25f).setRotationAngle(0, 0, -8)
		);
		truck3.add(new ModelRendererTurbo(truck3, 184, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 13, 8, 1, 1, 4, null)
			.setRotationPoint(6.6875f, 6.5f, 6.5f).setRotationAngle(-90, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 131, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0.25f, 0.125f, -0.5f, 0.25f, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.625f, 5.4375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 122, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f, 0, 0, 0, 0, 0, 0, -0.8125f, 0.25f, 0.125f, -0.8125f, 0.25f, 0.125f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(5.625f, 6.9375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		truck3.add(new ModelRendererTurbo(truck3, 88, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(5.625f, 7.125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		groups.add(truck3);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.1875f, -0.625f, -0.5f, 0.1875f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(4.5f, 4.6875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.375f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.375f, -0.25f, 0)
			.setRotationPoint(3.875f, 5.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.375f, -0.375f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, -0.375f, -0.375f, 0, -0.375f, -0.25f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.375f, -0.25f, 0)
			.setRotationPoint(1.625f, 7.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.375f, -1.8125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.375f, -1.8125f, 0, -0.375f, 1.3125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, 1.3125f, 0)
			.setRotationPoint(2.25f, 5.3125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f)
			.setRotationPoint(-1.75f, 3.9375f, -7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f)
			.setRotationPoint(1.75f, 3.9375f, -7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f)
			.setRotationPoint(8.125f, 4.5f, -7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f)
			.setRotationPoint(-1.75f, 8.4375f, -7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f)
			.setRotationPoint(1.75f, 8.4375f, -7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-2, 4, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.375f, -0.375f, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.375f, -0.25f, -0.5f)
			.setRotationPoint(1.625f, 7.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f)
			.setRotationPoint(-1.75f, 3.9375f, 7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f)
			.setRotationPoint(1.75f, 3.9375f, 7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 8, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f)
			.setRotationPoint(-1.75f, 8.4375f, 7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 0, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f)
			.setRotationPoint(1.75f, 8.4375f, 7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-2.625f, 3.9375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-2.625f, 3.9375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0.25f, 0, -0.3125f, 0.25f)
			.setRotationPoint(-2.5625f, 3.9375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(2.125f, 3.9375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(2.125f, 3.9375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0.25f, 0, -0.3125f, 0.25f)
			.setRotationPoint(2.1875f, 3.9375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f)
			.setRotationPoint(5.1875f, 4.5f, -7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4.5f, 7.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(4.875f, 5.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.4375f, -0.5f, 0, -0.0625f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.0625f, -0.5f)
			.setRotationPoint(2, 7.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.5f, -0.5f, -0.625f, -0.5f)
			.setRotationPoint(1.5f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(5.625f, 5.4375f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.8125f, 0, 0.125f, -0.8125f, 0, 0.125f, -0.8125f, 0.25f, 0, -0.8125f, 0.25f)
			.setRotationPoint(5.625f, 6.9375f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(5.625f, 7.125f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(4.5f, 4.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.375f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.375f, -0.25f, -0.5f)
			.setRotationPoint(3.875f, 5.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.375f, -1.8125f, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, -1.8125f, -0.5f, -0.375f, 1.3125f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.375f, 1.3125f, -0.5f)
			.setRotationPoint(2.25f, 5.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f)
			.setRotationPoint(8.125f, 4.5f, 7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f)
			.setRotationPoint(5.1875f, 4.5f, 7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8.5f, 7.5625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 13, 8, 1, 1, 4, null)
			.setRotationPoint(-6.6875f, 6.5f, 6.5f).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0)
			.setRotationPoint(-7.625f, 5.4375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, -0.8125f, 0, 0.125f, -0.8125f, 0)
			.setRotationPoint(-7.625f, 6.9375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0)
			.setRotationPoint(-7.625f, 7.125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 0, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(-6.6875f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(-6.6875f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0.1875f, -0.625f, 0)
			.setRotationPoint(-8.5f, 4.6875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f)
			.setRotationPoint(-8.125f, 4.5f, -7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 10, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f)
			.setRotationPoint(-5.1875f, 4.5f, -7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-8.5f, 7.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.375f, -0.625f, -0.5f)
			.setRotationPoint(-8.875f, 5.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, 0.125f, -0.5f, 0.25f)
			.setRotationPoint(-7.625f, 5.4375f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0.25f, 0.125f, -0.8125f, 0.25f)
			.setRotationPoint(-7.625f, 6.9375f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0)
			.setRotationPoint(-7.625f, 7.125f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0.1875f, -0.625f, -0.5f)
			.setRotationPoint(-8.5f, 4.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 10, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f)
			.setRotationPoint(-8.125f, 4.5f, 7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 9, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f)
			.setRotationPoint(-5.1875f, 4.5f, 7.25f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.375f, -0.625f, 0)
			.setRotationPoint(-8.875f, 5.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.0625f, -0.5f, 0, -0.0625f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-5, 7.5625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.5625f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-4.5f, 4.125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.625f, 0)
			.setRotationPoint(-4.875f, 5.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.125f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, 0, 0.125f, 0, 0, -0.625f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.625f, 0)
			.setRotationPoint(-2.625f, 7.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.5f, -0.375f, -1.8125f, -0.5f, -0.375f, -1.8125f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, 1.3125f, -0.5f, -0.375f, 1.3125f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4.25f, 5.3125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.125f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, 0, 0.125f, -0.5f, 0, -0.625f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-2.625f, 7.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-5, 7.5625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.5625f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5625f, -0.5f, 0, -0.0625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, -0.5f, 0, -0.0625f, -0.5f)
			.setRotationPoint(-4.5f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-4.875f, 5.0625f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.375f, -1.8125f, 0, -0.375f, -1.8125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.375f, 1.3125f, 0, -0.375f, 1.3125f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-4.25f, 5.3125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

}
