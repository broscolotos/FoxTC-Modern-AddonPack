//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.steam;


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.locomotive.bogies.ModelL3aFrontBogie;
import tcmodern.client.render.locomotive.bogies.ModelL3aRearBogie;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;
import train.client.renderhelper.ModelRenderHelper;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelL3aMohawk extends FVTMFormatBase {

	public ModelL3aMohawk(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_wheels();
		initGroup_ValveGearLeft();
		initGroup_ValveGearRight();
		initGroup_Deflectors();
		initGroup_clipboard0();
		initGroup_clipboard1();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, false, true);
		}
	}

	private final void initGroup_wheels(){
		TurboList wheels = new TurboList("wheels");
		wheels.add(new ModelRendererTurbo(wheels, 443, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.6875f, -2, 6.01f).setRotationAngle(0, 0, 0)
		);
		wheels.add(new ModelRendererTurbo(wheels, 418, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.6875f, -2, 6.01f).setRotationAngle(0, 0, 0)
		);
		wheels.add(new ModelRendererTurbo(wheels, 0, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.3125f, -2, 6.01f).setRotationAngle(0, 0, 0)
		);
		wheels.add(new ModelRendererTurbo(wheels, 307, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.3125f, -2, 6.01f).setRotationAngle(0, 0, 0)
		);
		wheels.add(new ModelRendererTurbo(wheels, 163, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.6875f, -2, -6.01f).setRotationAngle(0, 0, 0)
		);
		wheels.add(new ModelRendererTurbo(wheels, 138, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.6875f, -2, -6.01f).setRotationAngle(0, 0, 0)
		);
		wheels.add(new ModelRendererTurbo(wheels, 113, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.3125f, -2, -6.01f).setRotationAngle(0, 0, 0)
		);
		wheels.add(new ModelRendererTurbo(wheels, 483, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.3125f, -2, -6.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(wheels);
	}

	private final void initGroup_ValveGearLeft(){
		TurboList ValveGearLeft = new TurboList("ValveGearLeft");
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 38, 102, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 4, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, 8.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 418, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(30.5f, -1.375f, 8.875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 136, 152, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(30.4375f, -1, 9.03125f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 253, 152, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(27.375f, 4.125f, 9.59375f).setRotationAngle(0, 0, 9)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 0, 3, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 9, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(22.773438f, 0.6875f, 9.4375f).setRotationAngle(0, 0, -10.5f).setName("Box 1083cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 181, 152, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(22.25f, -3.5625f, 9.6875f).setRotationAngle(0, 0, -18)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 27, 152, textureX, textureY)
			.addShapeBox(0.6875f, -0.5f, 0, 1, 1, 1, 0, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, 8.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 22, 152, textureX, textureY)
			.addShapeBox(-0.5625f, 0.09375f, 0, 1, 1, 1, 0, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, 8.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 10, 152, textureX, textureY)
			.addShapeBox(-0.5625f, -1.09375f, 0, 1, 1, 1, 0, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, 8.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 5, 152, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, 8.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 0, 152, textureX, textureY)
			.addShapeBox(-0.6875f, -0.875f, 0, 1, 1, 1, 0, 0, -0.6875f, -0.3125f, -0.9375f, -0.5f, -0.3125f, -0.9375f, -0.5f, -0.3125f, 0, -0.6875f, -0.3125f, 0, 0.0625f, -0.3125f, -0.9375f, 0.25f, -0.3125f, -0.9375f, 0.25f, -0.3125f, 0, 0.0625f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, 8.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 507, 151, textureX, textureY).addCylinder(1, 2.78125f, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(20.8125f, -0.4375f, 9.21875f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 483, 151, textureX, textureY)
			.addShapeBox(-1, -1.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(22.037498f, 3.46875f, 9.4375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 470, 151, textureX, textureY)
			.addShapeBox(-2, -1.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f)
			.setRotationPoint(22.037498f, 3.46875f, 9.4375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 455, 151, textureX, textureY)
			.addShapeBox(-2, -1.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, 7.9375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 450, 151, textureX, textureY)
			.addShapeBox(-1, -1.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, 7.9375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 442, 151, textureX, textureY)
			.addShapeBox(-1, -1.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(22.037498f, 3.46875f, 8.1875f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 427, 151, textureX, textureY)
			.addShapeBox(-0.875f, -1.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, 8.1875f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 409, 151, textureX, textureY)
			.addShapeBox(-1, -1.5f, -0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, 9.4375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 316, 151, textureX, textureY)
			.addShapeBox(-0.875f, -1.5f, -0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, 9.4375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 345, 151, textureX, textureY).addCylinder(-3.1875f, 0, 0, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(22.25f, -3.5625f, 9.4375f).setRotationAngle(0, 0, -18)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 307, 151, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(22.25f, -3.5625f, 9.375f).setRotationAngle(0, 0, -18)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 201, 151, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(22.25f, -3.5625f, 9.4375f).setRotationAngle(0, 0, -18)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 427, 15, textureX, textureY)
			.addShapeBox(-3.0625f, 0, 0, 3, 1, 1, 0, -0.25f, -0.4375f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.25f, -0.375f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 196, 151, textureX, textureY)
			.addShapeBox(-3.5625f, 0.6875f, 0, 1, 1, 1, 0, -0.3125f, 0.03125f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.3125f, 0.03125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.8125f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 162, 151, textureX, textureY)
			.addShapeBox(0.25f, 0.375f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.25f, -1.25f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.25f, -1.25f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 157, 151, textureX, textureY)
			.addShapeBox(0.4375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.4375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.4375f, 0, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 120, 151, textureX, textureY)
			.addShapeBox(0.625f, 1.6875f, 0, 1, 2, 1, 0, -0.25f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 77, 151, textureX, textureY)
			.addShapeBox(0.5625f, 3.5f, 0, 1, 1, 1, 0, -0.25f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.25f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 478, 150, textureX, textureY)
			.addShapeBox(-0.375f, 3.1875f, 0, 1, 1, 1, 0, -0.25f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.25f, 0, -0.38f, -0.375f, -0.0625f, -0.38f, -0.4375f, -0.0625f, -0.38f, -0.4375f, -0.0625f, -0.38f, -0.375f, -0.0625f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 465, 150, textureX, textureY)
			.addShapeBox(-0.4375f, 2.375f, 0, 1, 1, 1, 0, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 460, 150, textureX, textureY)
			.addShapeBox(-0.5625f, 1.75f, 0, 1, 1, 1, 0, 0.0625f, 0, -0.38f, -0.875f, 0, -0.38f, -0.875f, 0, -0.38f, 0.0625f, 0, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 437, 150, textureX, textureY)
			.addShapeBox(-0.9375f, 1.125f, 0, 1, 1, 1, 0, 0.25f, -0.1875f, -0.38f, -1.25f, 0, -0.38f, -1.25f, 0, -0.38f, 0.25f, -0.1875f, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 404, 150, textureX, textureY)
			.addShapeBox(-1.9375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.125f, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0.125f, -0.38f, -0.25f, -0.9375f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.9375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 394, 150, textureX, textureY)
			.addShapeBox(-3.125f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.0625f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.0625f, -0.38f, -0.1875f, -0.875f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.875f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 389, 150, textureX, textureY)
			.addShapeBox(-2.5f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 384, 150, textureX, textureY)
			.addShapeBox(-0.125f, 1.8125f, 0, 1, 2, 1, 0, 0.125f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0.125f, -0.3125f, -0.4375f, -0.1875f, 0.0625f, -0.4375f, -0.0625f, 0.0625f, -0.4375f, -0.0625f, 0.0625f, -0.4375f, -0.1875f, 0.0625f, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 379, 150, textureX, textureY)
			.addShapeBox(-0.125f, 0.125f, 0, 1, 2, 1, 0, 0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.125f, 0, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 439, 12, textureX, textureY)
			.addShapeBox(-2.125f, -0.4375f, 0, 3, 1, 1, 0, -1.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -1.375f, -0.375f, -0.4375f, 0.5f, 0, -0.4375f, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, 0.5f, 0, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 364, 150, textureX, textureY)
			.addShapeBox(-1.1875f, 0.125f, 0, 1, 2, 1, 0, 0, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -1, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, 0, -1, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 505, 101, textureX, textureY)
			.addShapeBox(-3.125f, 0.125f, 0, 2, 1, 1, 0, -0.25f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.25f, 0, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 352, 150, textureX, textureY)
			.addShapeBox(-0.3125f, 1.5f, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.9375f, 0, -0.25f, 0.4375f, 0, -0.25f, 0.4375f, 0, -0.25f, -0.9375f, 0, -0.25f)
			.setRotationPoint(20.8125f, -0.4375f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 340, 150, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.4375f, 0.5f, -0.25f)
			.setRotationPoint(20.8125f, -0.4375f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 296, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -1.8125f, -0.125f, -0.25f, 1.3125f, -0.125f, -0.25f, 1.3125f, -0.125f, -0.25f, -1.8125f, -0.125f, -0.25f)
			.setRotationPoint(18.875f, -2.21875f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 291, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f)
			.setRotationPoint(18.6875f, -2.78125f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 275, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f)
			.setRotationPoint(18.6875f, -2.78125f, 8.6875f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 352, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(21.375f, -3.125f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 233, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.625f, 0, -0.5f, 0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(20.1875f, -3.125f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 73, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.125f, 0, 0, -1, 0, 0, -1, 0, 0.1875f, -0.125f, 0)
			.setRotationPoint(21.375f, -1.125f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 222, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(19.6875f, -2.5f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 217, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(20.6875f, -3.125f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 209, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.375f, 0, -0.5f, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.0625f, 0)
			.setRotationPoint(19.1875f, -2.5f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 191, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.3125f, -0.0625f, 0)
			.setRotationPoint(18.6875f, -2.5f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 80, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, -3.125f, 4.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 186, 150, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5625f, 0.5625f).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(22.25f, -3.5625f, 10.375f).setRotationAngle(0, 0, 90)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 140, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(21.6875f, -3.5625f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 104, 150, textureX, textureY).addCylinder(-2.6875f, 2.5f, -0.1875f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(22.625f, -3.5625f, 9.4375f).setRotationAngle(0, 0, -18)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 99, 150, textureX, textureY).addCylinder(-2.6875f, 2.5f, 0.375f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5625))
			.setRotationPoint(22.625f, -3.5625f, 9.5f).setRotationAngle(0, 0, -18)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 72, 150, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(19.625f, 0, 11.375f).setRotationAngle(0, 0, -4)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 67, 150, textureX, textureY)
			.addShapeBox(-0.5f, -3, -0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(19.625f, 0, 10.625f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 57, 150, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(19.625f, 0, 9.875f).setRotationAngle(0, 0, -4)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 52, 150, textureX, textureY)
			.addShapeBox(-0.5f, -3, -0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(19.625f, 0, 9.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 497, 149, textureX, textureY)
			.addShapeBox(-0.5f, -4.125f, -0.0625f, 1, 1, 1, 0, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.0625f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f)
			.setRotationPoint(19.625f, 0, 10.375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 446, 149, textureX, textureY)
			.addShapeBox(-0.5f, -4.625f, -0.0625f, 1, 1, 1, 0, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.0625f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f)
			.setRotationPoint(19.625f, 0, 10.375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 432, 149, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f)
			.setRotationPoint(19.625f, 0, 10).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 415, 149, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -1, -0.125f, 0, -1)
			.setRotationPoint(19.625f, 0, 10.25f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 399, 149, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0)
			.setRotationPoint(19.625f, 0, 10.25f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 374, 149, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.25f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -1, -0.125f, 0, -1, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(19.625f, 0, 10).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 312, 149, textureX, textureY)
			.addShapeBox(-0.5f, -5.4375f, 0.6875f, 1, 1, 1, 0, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, 0.0625f, -0.125f, -0.875f, 0.0625f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f)
			.setRotationPoint(19.625f, 0, 9.625f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 181, 149, textureX, textureY)
			.addShapeBox(-0.5f, -5.5625f, 1.875f, 1, 1, 1, 0, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f)
			.setRotationPoint(19.625f, 0, 7.875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 369, 149, textureX, textureY).addCylinder(0, -4.8125f, 2.1875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(19.625f, 0, 7.875f).setRotationAngle(0, 0, -4)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 359, 149, textureX, textureY).addCylinder(6.78125f, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(12.5f, -4.8046875f, 9.875f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 286, 149, textureX, textureY).addCylinder(0, -2.4375f, 1.1875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(19.625f, 0, 8.9375f).setRotationAngle(0, 0, -4)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 167, 149, textureX, textureY)
			.addShapeBox(-0.484375f, 0, -0.015625f, 1, 2, 1, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.25f)
			.setRotationPoint(19.4375f, -2.4375f, 9.5625f).setRotationAngle(0, 0, -35).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 263, 149, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(22.25f, -3.5625f, 10).setRotationAngle(0, 0, -18)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 225, 59, textureX, textureY)
			.addShapeBox(-13, -1.5f, 0.375f, 12, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(22.037498f, 3.46875f, 8.6875f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 339, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, -0.3125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.3125f, -0.375f, 0)
			.setRotationPoint(13.375f, -2.5f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 503, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f)
			.setRotationPoint(13.0625f, -2.5f, 8.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 258, 149, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(12, -1.3125f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 94, 149, textureX, textureY)
			.addShapeBox(-0.5f, -4, 0, 1, 4, 1, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, -1.3125f, 8.8125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 228, 149, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(12, -4.8125f, 9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 89, 149, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(12, -4.8046875f, 9.875f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 97, 19, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 7, 1, 1, 0, 0, -0.375f, -0.375f, 0.21875f, -0.375f, -0.40625f, 0.21875f, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.375f, 0.21875f, -0.375f, -0.40625f, 0.21875f, -0.375f, -0.4375f, 0, -0.375f, -0.4375f)
			.setRotationPoint(12.5f, -5.3125f, 9.5f).setRotationAngle(0, 0, 0).setName(" aBox 1080cp 3")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 168, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(9.8125f, -2.1875f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 332, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(9.8125f, -2.8125f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 48, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.6875f, -2.125f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 84, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f)
			.setRotationPoint(11.6875f, -1.125f, 4.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 62, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(25.375f, -1.25f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 43, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(25.375f, -1.25f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 32, 149, textureX, textureY).addCylinder(-13.3046875f, 0, 0, 1, 1, 8, 1, 1, 1, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(22.037498f, 2.59375f, 9).setRotationAngle(0, 0, -8.25f)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 297, 130, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, -0.8125f, -0.125f, -0.875f, -0.8125f, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 2.25f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 260, 130, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, -0.6875f, -0.125f, -0.875f, -0.6875f, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.6875f, -0.125f, 0, -0.6875f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 2.125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 200, 130, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.8125f, 0, -0.875f, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f)
			.setRotationPoint(25.375f, 2.25f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 187, 130, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(25.375f, 2.125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 128, 130, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 64, 130, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, 0, -0.8125f, 0, -0.5625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.5625f, 0, 0)
			.setRotationPoint(25.375f, 2.6875f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 332, 97, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 4, 1, 1, 0, 0, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -1, 0, 0, -1, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(25.9375f, 2.8125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 25, 96, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 2, 2, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(26.8125f, 3.8125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 0, 130, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, -0.8125f, -0.125f, -0.875f, -0.8125f, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 5.125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 174, 129, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, -0.6875f, -0.125f, -0.875f, -0.6875f, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.6875f, -0.125f, 0, -0.6875f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 5.25f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 115, 129, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.8125f, 0, -0.875f, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f)
			.setRotationPoint(25.375f, 5.125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 475, 128, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(25.375f, 5.25f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 115, 126, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 5, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 270, 125, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, -0.5625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.5625f, 0, 0, 0, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(25.375f, 5.5625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 223, 87, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 4, 1, 1, 0, -0.875f, 0, 0, -1, 0, 0, -1, 0, 0, -0.875f, 0, 0, 0, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(25.9375f, 5.4375f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 27, 149, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(28.9375f, 4.125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 22, 149, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.9375f, -0.0625f, 0.25f, -0.9375f, -0.0625f, 0.25f, -0.9375f, -0.0625f, 0, -0.9375f, -0.0625f)
			.setRotationPoint(28.9375f, 4.0625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 5, 149, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, -0.0625f, -0.0625f, -0.25f, -0.0625f, -0.0625f, 0, 0, -0.0625f, 0, -0.9375f, -0.0625f, -0.25f, -0.9375f, -0.0625f, -0.25f, -0.9375f, -0.0625f, 0, -0.9375f, -0.0625f)
			.setRotationPoint(28.9375f, 4, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 0, 149, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, -0.9375f, -0.0625f, 0.25f, -0.9375f, -0.0625f, 0.25f, -0.9375f, -0.0625f, 0, -0.9375f, -0.0625f, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(28.9375f, 4.1875f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 507, 148, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, -0.9375f, -0.0625f, -0.25f, -0.9375f, -0.0625f, -0.25f, -0.9375f, -0.0625f, 0, -0.9375f, -0.0625f, 0, 0, -0.0625f, -0.25f, -0.0625f, -0.0625f, -0.25f, -0.0625f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(28.9375f, 4.25f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 502, 148, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.1875f, 1.1875f, 1, null)
			.setRotationPoint(7.3125f, 7.5f, 10).setRotationAngle(0, 0, -62.5f)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 214, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f)
			.setRotationPoint(25.3125f, 1.75f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 474, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f)
			.setRotationPoint(24.3125f, 1.75f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 456, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f)
			.setRotationPoint(23.3125f, 1.75f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 165, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f)
			.setRotationPoint(24.3125f, 2.625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 451, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.25f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.375f, 0, -0.25f, -0.375f, -0.875f, -0.25f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.375f, -0.875f, -0.25f)
			.setRotationPoint(23.3125f, 2.625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 441, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.3125f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.3125f, -0.625f, -0.875f, -0.3125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.625f, -0.875f, -0.3125f)
			.setRotationPoint(22.6875f, 2.625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 300, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(25.3125f, 5.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 410, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.3125f)
			.setRotationPoint(24.3125f, 5.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 348, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.375f, -0.3125f)
			.setRotationPoint(23.3125f, 5.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 307, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(24.3125f, 4.625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 336, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.875f, -0.25f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.375f, -0.875f, -0.25f, -0.375f, 0, -0.25f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.375f, 0, -0.25f)
			.setRotationPoint(23.3125f, 4.625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 307, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.875f, -0.3125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.625f, -0.875f, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.3125f)
			.setRotationPoint(22.6875f, 4.625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 331, 148, textureX, textureY).addCylinder(-0.125f, 0, 0.5f, 1, 9, 6, 0.4375f, 0.4375f, 3, new Vec3f(0.375, 0.0, 0.0))
			.setRotationPoint(29.8125f, 4.125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 115, 40, textureX, textureY)
			.addShapeBox(-20, -0.5f, 0, 20, 1, 1, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(27.375f, 4.125f, 8.25f).setRotationAngle(0, 0, -9.5625f)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 469, 39, textureX, textureY)
			.addShapeBox(-20, -1.5f, 0, 20, 1, 1, 0, 0.25f, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f)
			.setRotationPoint(27.375f, 4.125f, 8.25f).setRotationAngle(0, 0, -9.5625f)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 298, 37, textureX, textureY)
			.addShapeBox(-20, 0.5f, 0, 20, 1, 1, 0, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, -0.875f, -0.125f)
			.setRotationPoint(27.375f, 4.125f, 8.25f).setRotationAngle(0, 0, -9.5625f)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 427, 12, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 3, 1, 1, 0, 0, 0.6875f, -0.25f, 0.375f, 0.25f, -0.25f, 0.375f, 0.25f, -0.25f, 0, 0.6875f, -0.25f, 0, 0.6875f, -0.25f, 0.375f, 0.25f, -0.25f, 0.375f, 0.25f, -0.25f, 0, 0.6875f, -0.25f)
			.setRotationPoint(7.3125f, 7.5f, 9.875f).setRotationAngle(0, 0, -62.5f)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 326, 148, textureX, textureY).addCylinder(3.375f, 0, 0, 1, 1, 8, 1, 1, 1, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(7.3125f, 7.5f, 9.75f).setRotationAngle(0, 0, -62.5f)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 321, 148, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.875f, 0.875f, 0, null)
			.setRotationPoint(-7.5625f, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 175, 6, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 39, 1, 1, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-18.6875f, 7.5f, 5.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 394, 3, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 39, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-18.6875f, 7.5f, 5.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 313, 3, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 39, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-18.6875f, 7.5f, 5.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 302, 148, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(20.3125f, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 281, 148, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 8, 1, 1, 1, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(7.3125f, 7.5f, 6.125f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 270, 148, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(-5.6875f, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 253, 148, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(-18.6875f, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 436, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0.0625f, 0, -0.1875f, 0.0625f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(31.125f, -2.4375f, 5.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 297, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.3125f, -0.625f, 0, 0.3125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(30.6875f, -2.8125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 470, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.5f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.0625f, 0, -0.625f, 0, 0.3125f, -0.625f, 0, 0.3125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(30.6875f, -3.1875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 332, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, -0.0625f, 0.4375f, 0, -0.0625f, 0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.25f, -0.0625f, 0.4375f, 0.25f, -0.0625f, 0.4375f, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(31.1875f, -4.4375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 332, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.1875f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, -0.1875f, 0, -0.125f, 0, -0.8125f, -0.0625f, 0.4375f, -0.8125f, -0.0625f, 0.4375f, -0.8125f, -0.0625f, 0, -0.8125f, -0.0625f)
			.setRotationPoint(31.1875f, -4.625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 332, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.1875f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.1875f, -0.8125f, -0.125f, 0.25f, -0.8125f, -0.125f, 0.25f, -0.8125f, -0.125f, -0.1875f, -0.8125f, -0.125f)
			.setRotationPoint(31.1875f, -4.8125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 0, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.3125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.1875f, -0.875f, -0.125f, 0.25f, -0.875f, -0.125f, 0.25f, -0.875f, -0.125f, -0.1875f, -0.875f, -0.125f)
			.setRotationPoint(31.1875f, -4.9375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 73, 93, textureX, textureY)
			.addShapeBox(-1.75f, -0.5f, 0, 2, 1, 1, 0, -0.5f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f)
			.setRotationPoint(32.875f, -3.875f, 7.8125f).setRotationAngle(0, 0, -7).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 176, 148, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 3, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(31.75f, -3.75f, 8.0625f).setRotationAngle(0, 0, -12).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 162, 148, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f)
			.setRotationPoint(31.40625f, -1, 8.3125f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 121, 148, textureX, textureY)
			.addShapeBox(-0.5f, -0.75f, 0, 1, 1, 1, 0, -1.375f, 0.1875f, -0.375f, 0.4375f, 0, -0.375f, 0.4375f, 0, -0.375f, -1.375f, 0.1875f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f)
			.setRotationPoint(31.40625f, -1, 8.3125f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 116, 148, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(32.875f, -3.875f, 8).setRotationAngle(0, 0, -7)
		);
		ValveGearLeft.add(new ModelRendererTurbo(ValveGearLeft, 485, 147, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(31.40625f, -1, 8.625f).setRotationAngle(0, 0, 0)
		);
		groups.add(ValveGearLeft);
	}

	private final void initGroup_ValveGearRight(){
		TurboList ValveGearRight = new TurboList("ValveGearRight");
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 492, 143, textureX, textureY).addCylinder(-0.125f, 0, 0, 1, 9, 6, 0.4375f, 0.4375f, 3, new Vec3f(0.375, 0.0, 0.0))
			.setRotationPoint(29.8125f, 4.125f, -8.75f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 162, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f)
			.setRotationPoint(25.3125f, 1.75f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 328, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f)
			.setRotationPoint(24.3125f, 2.625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 162, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(25.3125f, 5.5f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 325, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(24.3125f, 4.625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 62, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.3125f)
			.setRotationPoint(24.3125f, 5.5f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 57, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.375f, -0.3125f)
			.setRotationPoint(23.3125f, 5.5f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 52, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.875f, -0.25f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.375f, -0.875f, -0.25f, -0.375f, 0, -0.25f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.375f, 0, -0.25f)
			.setRotationPoint(23.3125f, 4.625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 497, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.875f, -0.3125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.625f, -0.875f, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.3125f)
			.setRotationPoint(22.6875f, 4.625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 157, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f)
			.setRotationPoint(24.3125f, 1.75f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 141, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f)
			.setRotationPoint(23.3125f, 1.75f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 75, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.25f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.375f, 0, -0.25f, -0.375f, -0.875f, -0.25f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.375f, -0.875f, -0.25f)
			.setRotationPoint(23.3125f, 2.625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 70, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.3125f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.3125f, -0.625f, -0.875f, -0.3125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.625f, -0.875f, -0.3125f)
			.setRotationPoint(22.6875f, 2.625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 140, 111, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.8125f, 0, -0.875f, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f)
			.setRotationPoint(25.375f, 2.25f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 404, 104, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(25.375f, 2.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 174, 104, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, -0.8125f, -0.125f, -0.875f, -0.8125f, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 2.25f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 404, 101, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, -0.6875f, -0.125f, -0.875f, -0.6875f, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.6875f, -0.125f, 0, -0.6875f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 2.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 65, 100, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 2.5f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 404, 98, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, 0, -0.8125f, 0, -0.5625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.5625f, 0, 0)
			.setRotationPoint(25.375f, 2.6875f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 482, 72, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 4, 1, 1, 0, 0, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -1, 0, 0, -1, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(25.9375f, 2.8125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 15, 85, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 2, 2, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(26.8125f, 3.8125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 186, 53, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, -0.5625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.5625f, 0, 0, 0, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(25.375f, 5.5625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 339, 55, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 4, 1, 1, 0, -0.875f, 0, 0, -1, 0, 0, -1, 0, 0, -0.875f, 0, 0, 0, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(25.9375f, 5.4375f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 386, 144, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(28.9375f, 4.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 381, 144, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.9375f, -0.0625f, 0.25f, -0.9375f, -0.0625f, 0.25f, -0.9375f, -0.0625f, 0, -0.9375f, -0.0625f)
			.setRotationPoint(28.9375f, 4.0625f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 296, 144, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, -0.0625f, -0.0625f, -0.25f, -0.0625f, -0.0625f, 0, 0, -0.0625f, 0, -0.9375f, -0.0625f, -0.25f, -0.9375f, -0.0625f, -0.25f, -0.9375f, -0.0625f, 0, -0.9375f, -0.0625f)
			.setRotationPoint(28.9375f, 4, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 224, 96, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.8125f, 0, -0.875f, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f)
			.setRotationPoint(25.375f, 5.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 376, 93, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(25.375f, 5.25f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 113, 77, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, -0.8125f, -0.125f, -0.875f, -0.8125f, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 5.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 328, 75, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.875f, -0.6875f, -0.125f, -0.875f, -0.6875f, -0.125f, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.6875f, -0.125f, 0, -0.6875f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 5.25f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 380, 64, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 1, 1, 0, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, 5, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 103, 36, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 4, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, -9.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 171, 143, textureX, textureY)
			.addShapeBox(0.6875f, -0.5f, 0, 1, 1, 1, 0, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, -9.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 414, 142, textureX, textureY)
			.addShapeBox(-0.5625f, 0.09375f, 0, 1, 1, 1, 0, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, -9.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 377, 142, textureX, textureY)
			.addShapeBox(-0.5625f, -1.09375f, 0, 1, 1, 1, 0, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, -9.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 287, 142, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, -9.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 282, 142, textureX, textureY)
			.addShapeBox(-0.6875f, -0.875f, 0, 1, 1, 1, 0, 0, -0.6875f, -0.3125f, -0.9375f, -0.5f, -0.3125f, -0.9375f, -0.5f, -0.3125f, 0, -0.6875f, -0.3125f, 0, 0.0625f, -0.3125f, -0.9375f, 0.25f, -0.3125f, -0.9375f, 0.25f, -0.3125f, 0, 0.0625f, -0.3125f)
			.setRotationPoint(27.375f, 4.125f, -9.9375f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 291, 144, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, -0.9375f, -0.0625f, 0.25f, -0.9375f, -0.0625f, 0.25f, -0.9375f, -0.0625f, 0, -0.9375f, -0.0625f, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(28.9375f, 4.1875f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 277, 144, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0, -0.9375f, -0.0625f, -0.25f, -0.9375f, -0.0625f, -0.25f, -0.9375f, -0.0625f, 0, -0.9375f, -0.0625f, 0, 0, -0.0625f, -0.25f, -0.0625f, -0.0625f, -0.25f, -0.0625f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(28.9375f, 4.25f, -9.25f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 229, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(30.5f, -1.375f, -10.875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 213, 143, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(30.4375f, -1, -10.03125f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 226, 142, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 3, 1, 0, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(31.75f, -3.75f, -9.0625f).setRotationAngle(0, 0, -12).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 116, 142, textureX, textureY)
			.addShapeBox(-0.5f, -0.75f, 0, 1, 1, 1, 0, -1.375f, 0.1875f, -0.375f, 0.4375f, 0, -0.375f, 0.4375f, 0, -0.375f, -1.375f, 0.1875f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f)
			.setRotationPoint(31.40625f, -1, -9.3125f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 113, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.0625f, 0, -0.1875f, 0.0625f)
			.setRotationPoint(31.125f, -2.4375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 113, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.3125f, -0.625f, 0, 0.3125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(30.6875f, -2.8125f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 33, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.5f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.0625f, 0, -0.625f, 0, 0.3125f, -0.625f, 0, 0.3125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(30.6875f, -3.1875f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 501, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, -0.0625f, 0.4375f, 0, -0.0625f, 0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.25f, -0.0625f, 0.4375f, 0.25f, -0.0625f, 0.4375f, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(31.1875f, -4.4375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 501, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.1875f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, -0.1875f, 0, -0.125f, 0, -0.8125f, -0.0625f, 0.4375f, -0.8125f, -0.0625f, 0.4375f, -0.8125f, -0.0625f, 0, -0.8125f, -0.0625f)
			.setRotationPoint(31.1875f, -4.625f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 214, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.1875f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, -0.1875f, 0, -0.125f, -0.1875f, -0.8125f, -0.125f, 0.25f, -0.8125f, -0.125f, 0.25f, -0.8125f, -0.125f, -0.1875f, -0.8125f, -0.125f)
			.setRotationPoint(31.1875f, -4.8125f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 345, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.3125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.1875f, -0.875f, -0.125f, 0.25f, -0.875f, -0.125f, 0.25f, -0.875f, -0.125f, -0.1875f, -0.875f, -0.125f)
			.setRotationPoint(31.1875f, -4.9375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 15, 82, textureX, textureY)
			.addShapeBox(-1.75f, -0.5f, 0, 2, 1, 1, 0, -0.5f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f)
			.setRotationPoint(32.875f, -3.875f, -8.8125f).setRotationAngle(0, 0, -7).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 100, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(21.375f, -3.125f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 380, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(25.375f, -3.125f, -10.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 437, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(25.375f, -1.25f, -9.25f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 432, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(25.375f, -1.25f, -5.25f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 0, 0, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 9, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(22.773438f, 0.6875f, -10.4375f).setRotationAngle(0, 0, -10.5f).setName("Box 1083cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 469, 36, textureX, textureY)
			.addShapeBox(-20, -0.5f, 0, 20, 1, 1, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(27.375f, 4.125f, -9.25f).setRotationAngle(0, 0, -9.5625f)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 469, 33, textureX, textureY)
			.addShapeBox(-20, -1.5f, 0, 20, 1, 1, 0, 0.25f, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f)
			.setRotationPoint(27.375f, 4.125f, -9.25f).setRotationAngle(0, 0, -9.5625f)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 69, 24, textureX, textureY)
			.addShapeBox(-20, 0.5f, 0, 20, 1, 1, 0, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, -0.875f, -0.125f)
			.setRotationPoint(27.375f, 4.125f, -9.25f).setRotationAngle(0, 0, -9.5625f)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 171, 147, textureX, textureY)
			.addShapeBox(0.4375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.4375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.4375f, 0, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 157, 147, textureX, textureY)
			.addShapeBox(0.625f, 1.6875f, 0, 1, 2, 1, 0, -0.25f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 141, 147, textureX, textureY)
			.addShapeBox(0.5625f, 3.5f, 0, 1, 1, 1, 0, -0.25f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.25f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 103, 147, textureX, textureY)
			.addShapeBox(-0.375f, 3.1875f, 0, 1, 1, 1, 0, -0.25f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.25f, 0, -0.38f, -0.375f, -0.0625f, -0.38f, -0.4375f, -0.0625f, -0.38f, -0.4375f, -0.0625f, -0.38f, -0.375f, -0.0625f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 98, 147, textureX, textureY)
			.addShapeBox(-0.4375f, 2.375f, 0, 1, 1, 1, 0, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 71, 147, textureX, textureY)
			.addShapeBox(-0.5625f, 1.75f, 0, 1, 1, 1, 0, 0.0625f, 0, -0.38f, -0.875f, 0, -0.38f, -0.875f, 0, -0.38f, 0.0625f, 0, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 395, 146, textureX, textureY)
			.addShapeBox(-0.125f, 1.8125f, 0, 1, 2, 1, 0, 0.125f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0.125f, -0.3125f, -0.4375f, -0.1875f, 0.0625f, -0.4375f, -0.0625f, 0.0625f, -0.4375f, -0.0625f, 0.0625f, -0.4375f, -0.1875f, 0.0625f, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 58, 147, textureX, textureY)
			.addShapeBox(-0.9375f, 1.125f, 0, 1, 1, 1, 0, 0.25f, -0.1875f, -0.38f, -1.25f, 0, -0.38f, -1.25f, 0, -0.38f, 0.25f, -0.1875f, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 390, 146, textureX, textureY)
			.addShapeBox(-0.125f, 0.125f, 0, 1, 2, 1, 0, 0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.125f, 0, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 316, 146, textureX, textureY)
			.addShapeBox(-1.1875f, 0.125f, 0, 1, 2, 1, 0, 0, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -1, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, 0, -1, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 12, 12, textureX, textureY)
			.addShapeBox(-3.0625f, 0, 0, 3, 1, 1, 0, -0.25f, -0.4375f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.25f, -0.375f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 190, 147, textureX, textureY)
			.addShapeBox(-3.5625f, 0.6875f, 0, 1, 1, 1, 0, -0.3125f, 0.03125f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.3125f, 0.03125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.8125f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 185, 147, textureX, textureY)
			.addShapeBox(0.25f, 0.375f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.25f, -1.25f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.25f, -1.25f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 0, 12, textureX, textureY)
			.addShapeBox(-2.125f, -0.4375f, 0, 3, 1, 1, 0, -1.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -1.375f, -0.375f, -0.4375f, 0.5f, 0, -0.4375f, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, 0.5f, 0, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 53, 147, textureX, textureY)
			.addShapeBox(-1.9375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.125f, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0.125f, -0.38f, -0.25f, -0.9375f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.9375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 497, 146, textureX, textureY)
			.addShapeBox(-3.125f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.0625f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.0625f, -0.38f, -0.1875f, -0.875f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.875f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 400, 146, textureX, textureY)
			.addShapeBox(-2.5f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 26, 93, textureX, textureY)
			.addShapeBox(-3.125f, 0.125f, 0, 2, 1, 1, 0, -0.25f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.25f, 0, -0.4375f)
			.setRotationPoint(22.25f, -3.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 73, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.125f, 0, 0, -1, 0, 0, -1, 0, 0.1875f, -0.125f, 0)
			.setRotationPoint(21.375f, -1.125f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 66, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(20.6875f, -3.125f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 442, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(21.6875f, -3.5625f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 136, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.625f, 0, -0.5f, 0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(20.1875f, -3.125f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 79, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(19.6875f, -2.5f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 48, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.375f, 0, -0.5f, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.0625f, 0)
			.setRotationPoint(19.1875f, -2.5f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 464, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.3125f, -0.0625f, 0)
			.setRotationPoint(18.6875f, -2.5f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 246, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, -0.3125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.3125f, -0.375f, 0)
			.setRotationPoint(13.375f, -2.5f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 503, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f)
			.setRotationPoint(13.0625f, -2.5f, -11.375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 223, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(9.8125f, -2.1875f, -9.25f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 223, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(9.8125f, -2.8125f, -9.25f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 0, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(11.6875f, -2.125f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 454, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(11.6875f, -1.125f, -5.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 480, 144, textureX, textureY)
			.addShapeBox(-0.5f, -4, 0, 1, 4, 1, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(12, -1.3125f, -9.8125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 229, 14, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 7, 1, 1, 0, 0, -0.375f, -0.4375f, 0.21875f, -0.375f, -0.4375f, 0.21875f, -0.375f, -0.40625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.4375f, 0.21875f, -0.375f, -0.4375f, 0.21875f, -0.375f, -0.40625f, 0, -0.375f, -0.375f)
			.setRotationPoint(12.5f, -5.3125f, -10.5f).setRotationAngle(0, 0, 0).setName(" aBox 1080cp 3cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 306, 145, textureX, textureY)
			.addShapeBox(-0.5f, -4.625f, 0.0625f, 1, 1, 1, 0, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.1875f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f)
			.setRotationPoint(19.625f, 0, -11.375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 121, 145, textureX, textureY)
			.addShapeBox(-0.5f, -5.4375f, 0.3125f, 1, 1, 1, 0, -0.125f, -0.875f, 0.0625f, -0.125f, -0.875f, 0.0625f, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, 0.1875f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f)
			.setRotationPoint(19.625f, 0, -11.625f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 116, 145, textureX, textureY)
			.addShapeBox(-0.5f, -5.5625f, -1.875f, 1, 1, 1, 0, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f)
			.setRotationPoint(19.625f, 0, -8.875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 364, 145, textureX, textureY)
			.addShapeBox(-0.5f, -3, 0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(19.625f, 0, -11.625f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 354, 145, textureX, textureY)
			.addShapeBox(-0.5f, -3, 0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(19.625f, 0, -10.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 349, 145, textureX, textureY)
			.addShapeBox(-0.5f, -4.125f, 0.0625f, 1, 1, 1, 0, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.1875f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f)
			.setRotationPoint(19.625f, 0, -11.375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 301, 145, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, -0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0)
			.setRotationPoint(19.625f, 0, -11).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 282, 145, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0, 1, 1, 1, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -1, -0.125f, 0, -1, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(19.625f, 0, -11.25f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 175, 145, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, -0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f)
			.setRotationPoint(19.625f, 0, -11.25f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 167, 145, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, -0.25f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -1, -0.125f, 0, -1)
			.setRotationPoint(19.625f, 0, -11).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 0, 145, textureX, textureY)
			.addShapeBox(-0.484375f, 0, 0.015625f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.625f)
			.setRotationPoint(19.4375f, -2.4375f, -10.5625f).setRotationAngle(0, 0, -35).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 311, 146, textureX, textureY)
			.addShapeBox(-0.3125f, 1.5f, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.9375f, 0, -0.25f, 0.4375f, 0, -0.25f, 0.4375f, 0, -0.25f, -0.9375f, 0, -0.25f)
			.setRotationPoint(20.8125f, -0.4375f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 287, 146, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.4375f, 0.5f, -0.25f)
			.setRotationPoint(20.8125f, -0.4375f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 235, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -1.8125f, -0.125f, -0.25f, 1.3125f, -0.125f, -0.25f, 1.3125f, -0.125f, -0.25f, -1.8125f, -0.125f, -0.25f)
			.setRotationPoint(18.875f, -2.21875f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 230, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.4375f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.5625f, -0.4375f, -0.4375f, -0.5625f)
			.setRotationPoint(18.6875f, -2.78125f, -10.125f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 180, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.4375f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.5625f, -0.4375f, -0.4375f, -0.5625f)
			.setRotationPoint(18.6875f, -2.78125f, -9.6875f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 405, 147, textureX, textureY)
			.addShapeBox(-1, -1.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, -10.4375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 343, 147, textureX, textureY)
			.addShapeBox(-1, -1.5f, -0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(22.037498f, 3.46875f, -8.9375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 297, 147, textureX, textureY)
			.addShapeBox(-1, -1.5f, -0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, -9.1875f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 292, 147, textureX, textureY)
			.addShapeBox(-0.875f, -1.5f, -0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, -9.1875f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 276, 147, textureX, textureY)
			.addShapeBox(-1, -1.5f, 0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(22.037498f, 3.46875f, -10.4375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 223, 147, textureX, textureY)
			.addShapeBox(-0.875f, -1.5f, 0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, -10.4375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 384, 147, textureX, textureY)
			.addShapeBox(-2, -1.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(22.037498f, 3.46875f, -10.4375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 379, 147, textureX, textureY)
			.addShapeBox(-2, -1.5f, -0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f)
			.setRotationPoint(22.037498f, 3.46875f, -8.9375f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 158, 58, textureX, textureY)
			.addShapeBox(-13, -1.5f, -0.375f, 12, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(22.037498f, 3.46875f, -9.6875f).setRotationAngle(0, 0, -9.25f).setName("Box 1081cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 439, 9, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 3, 1, 1, 0, 0, 0.6875f, -0.25f, 0.375f, 0.25f, -0.25f, 0.375f, 0.25f, -0.25f, 0, 0.6875f, -0.25f, 0, 0.6875f, -0.25f, 0.375f, 0.25f, -0.25f, 0.375f, 0.25f, -0.25f, 0, 0.6875f, -0.25f)
			.setRotationPoint(7.3125f, 7.5f, -10.875f).setRotationAngle(0, 0, -62.5f)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 175, 3, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 39, 1, 1, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-18.6875f, 7.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 394, 0, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 39, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-18.6875f, 7.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 313, 0, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 39, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-18.6875f, 7.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 427, 143, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(20.3125f, 7.5f, -7.125f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 236, 142, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(27.375f, 4.125f, -9.71875f).setRotationAngle(0, 0, 9)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 231, 142, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(32.875f, -3.875f, -8.5f).setRotationAngle(0, 0, -7)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 136, 142, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(31.40625f, -1, -9.125f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 121, 142, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.375f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f, -0.1875f, -0.5f, -0.375f)
			.setRotationPoint(31.40625f, -1, -9.3125f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 469, 147, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(22.25f, -3.5625f, -10.1875f).setRotationAngle(0, 0, -18)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 427, 147, textureX, textureY).addCylinder(1, 2.78125f, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(20.8125f, -0.4375f, -9.90625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 195, 147, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(22.25f, -3.5625f, -9.6875f).setRotationAngle(0, 0, -18)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 414, 145, textureX, textureY).addCylinder(-2.6875f, 2.5f, -0.1875f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(22.625f, -3.5625f, -9.6875f).setRotationAngle(0, 0, -18)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 374, 145, textureX, textureY).addCylinder(-2.6875f, 2.5f, -0.375f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5625))
			.setRotationPoint(22.625f, -3.5625f, -9.9375f).setRotationAngle(0, 0, -18)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 200, 147, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(22.25f, -3.5625f, -10).setRotationAngle(0, 0, -18)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 447, 145, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5625f, 0.5625f).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(22.25f, -3.5625f, -11.375f).setRotationAngle(0, 0, 90)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 369, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(19.625f, 0, -11.625f).setRotationAngle(0, 0, -4)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 359, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(19.625f, 0, -10.375f).setRotationAngle(0, 0, -4)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 507, 144, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(22.25f, -3.5625f, -10.375f).setRotationAngle(0, 0, -18)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 205, 147, textureX, textureY).addCylinder(-3.1875f, 0, 0, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(22.25f, -3.5625f, -9.6875f).setRotationAngle(0, 0, -18)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 43, 145, textureX, textureY).addCylinder(0, -4.8125f, -2.1875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(19.625f, 0, -8.25f).setRotationAngle(0, 0, -4)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 22, 145, textureX, textureY).addCylinder(6.78125f, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(12.5f, -4.8046875f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 5, 145, textureX, textureY).addCylinder(0, -2.4375f, -1.1875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(19.625f, 0, -9.125f).setRotationAngle(0, 0, -4)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 502, 144, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(12, -1.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 475, 144, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(12, -4.8125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 459, 144, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(12, -4.8046875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 409, 144, textureX, textureY).addCylinder(-13.3046875f, 0, 0, 1, 1, 8, 1, 1, 1, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(22.037498f, 2.59375f, -10.25f).setRotationAngle(0, 0, -8.25f)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 162, 144, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.1875f, 1.1875f, 1, null)
			.setRotationPoint(7.3125f, 7.5f, -11).setRotationAngle(0, 0, -62.5f)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 487, 143, textureX, textureY).addCylinder(3.375f, 0, 0, 1, 1, 8, 1, 1, 1, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(7.3125f, 7.5f, -11).setRotationAngle(0, 0, -62.5f)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 218, 143, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 8, 1, 1, 1, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(7.3125f, 7.5f, -10).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 470, 143, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.875f, 0.875f, 0, null)
			.setRotationPoint(-7.5625f, 7.5f, -7).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 404, 143, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(-5.6875f, 7.5f, -7.125f).setRotationAngle(0, 0, 0)
		);
		ValveGearRight.add(new ModelRendererTurbo(ValveGearRight, 344, 143, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(-18.6875f, 7.5f, -7.125f).setRotationAngle(0, 0, 0)
		);
		groups.add(ValveGearRight);
	}

	private final void initGroup_Deflectors(){
		TurboList Deflectors = new TurboList("Deflectors");
		Deflectors.add(new ModelRendererTurbo(Deflectors, 489, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 20, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -10.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -10.125f, 0)
			.setRotationPoint(44.8125f, -16, 10).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 83, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 20, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -10.125f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -10.125f, -0.75f)
			.setRotationPoint(44.8125f, -16, -11).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 224, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 10, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(34.8125f, -16.25f, -11).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 17, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(51.8125f, -16, -11).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 5, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, 0.5f, 0.5f, -0.75f)
			.setRotationPoint(51.8125f, -17.5f, -11).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 475, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(34.8125f, -17, -11).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 0, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(51.3125f, -18, -10.75f).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 475, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(34.8125f, -17.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 247, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 10, 1, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(34.8125f, -16.25f, 10).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 111, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.8125f, -16, 10).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 48, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, 0.5f, 0.5f, 0)
			.setRotationPoint(51.8125f, -17.5f, 10).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 300, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(34.8125f, -17, 10).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 22, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.5f, -1, -0.75f, -0.5f, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.3125f, -18, 9.75f).setRotationAngle(0, 0, 0)
		);
		Deflectors.add(new ModelRendererTurbo(Deflectors, 25, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(34.8125f, -17.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(Deflectors);
	}

	private final void initGroup_clipboard0(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -2.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(52.8125f, 4.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(52.8125f, 4.625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(52.8125f, 4.625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.8125f, 4.625f, -1).setRotationAngle(0, 0, 57).setName("Coupler F")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1.25f, 0, 0, -1.25f, 0)
			.setRotationPoint(52.8125f, 4.625f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -1.25f, -0.5f, -0.5f, -1.25f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(52.8125f, 4.625f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, 0, 0, -5.5f, 0, 0, -0.5f, 0, -0.5f, -4.5f, 0, -0.5f, 0, -0.5f, 0, -5.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -4.5f, -0.5f, -0.5f)
			.setRotationPoint(52.8125f, 8.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 5, 0, -4.5f, 0, -0.5f, -0.5f, 0, -0.5f, -5.5f, 0, 0, 0, 0, 0, -4.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -5.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(52.8125f, 8.625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.3125f, 8.625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.265625f, 0, -0.5f, -0.234375f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -1.234375f, -0.5f, -0.5f, 0.734375f, -0.5f, -0.5f, 0.1875f, -0.5f, 0, -0.6875f, -0.5f, 0)
			.setRotationPoint(53.5f, 5.125f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.28125f, 0, -0.5f, -0.21875f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -1.734375f, -0.5f, -0.5f, 1.234375f, -0.5f, -0.5f, 0.6875f, -0.5f, 0, -1.1875f, -0.5f, 0)
			.setRotationPoint(53.96875f, 5.125f, 2.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.28125f, 0, -0.5f, -0.21875f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -2.21875f, -0.5f, -0.5f, 1.71875f, -0.5f, -0.5f, 1.15625f, -0.5f, 0, -1.65625f, -0.5f, 0)
			.setRotationPoint(54.453125f, 5.125f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.28125f, 0, -0.5f, -0.21875f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -2.703125f, -0.5f, -0.5f, 2.203125f, -0.5f, -0.5f, 1.65625f, -0.5f, 0, -2.15625f, -0.5f, 0)
			.setRotationPoint(54.953125f, 5.125f, 0.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.46875f, 0, -0.5f, -0.03125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.9375f, -0.5f, -0.5f, 0.4375f, -0.5f, -0.5f, -0.125f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(52.8125f, 5.125f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.03125f, 0, -0.5f, -0.46875f, 0, -0.5f, -0.375f, -0.5f, 0, -0.125f, -0.5f, 0, 0.4375f, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f)
			.setRotationPoint(52.8125f, 5.125f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.234375f, 0, -0.5f, -0.265625f, 0, -0.5f, -0.6875f, -0.5f, 0, 0.1875f, -0.5f, 0, 0.734375f, -0.5f, -0.5f, -1.234375f, -0.5f, -0.5f)
			.setRotationPoint(53.5f, 5.125f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.21875f, 0, -0.5f, -0.28125f, 0, -0.5f, -1.1875f, -0.5f, 0, 0.6875f, -0.5f, 0, 1.234375f, -0.5f, -0.5f, -1.734375f, -0.5f, -0.5f)
			.setRotationPoint(53.96875f, 5.125f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.21875f, 0, -0.5f, -0.28125f, 0, -0.5f, -1.65625f, -0.5f, 0, 1.15625f, -0.5f, 0, 1.71875f, -0.5f, -0.5f, -2.21875f, -0.5f, -0.5f)
			.setRotationPoint(54.453125f, 5.125f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.21875f, 0, -0.5f, -0.28125f, 0, -0.5f, -2.15625f, -0.5f, 0, 1.65625f, -0.5f, 0, 2.203125f, -0.5f, -0.5f, -2.703125f, -0.5f, -0.5f)
			.setRotationPoint(54.953125f, 5.125f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.8125f, 8.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, -0.875f, 0.5f, 0, -0.875f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.65625f, -0.5f, -0.875f, 0.15625f, -0.5f, -0.875f)
			.setRotationPoint(57.8125f, 8.125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, -0.875f, -1, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0, 0.15625f, -0.5f, -0.875f, -0.65625f, -0.5f, -0.875f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.8125f, 8.125f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0)
			.setRotationPoint(53.8125f, 5.625f, -1).setRotationAngle(0, 0, 0).setName("Coupler Fcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.3125f, 7, -7.4375f).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.3125f, 7, -7.4375f).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.3125f, 8, -7.4375f).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.3125f, 7, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.3125f, 7, 5.4375f).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.3125f, 7, 7.4375f).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.3125f, 8, 5.4375f).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.3125f, 7, 5.4375f).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(51.8125f, 3.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(51.8125f, 4.625f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(51.8125f, 4.625f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 22, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(49.8125f, 3.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 14, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(50.8125f, -2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 10, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(49.1875f, -1.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(48.1875f, -1.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -7, 0, 0, 7, 0, 0, 7, 0, -0.75f, -7, 0, -0.75f)
			.setRotationPoint(42.8125f, -7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(42.8125f, -7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -7, 0, 0, 7, 0, 0, 7, 0, -0.75f, -7, 0, -0.75f)
			.setRotationPoint(42.8125f, -7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0.0625f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0.0625f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(44.4375f, -4.5f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0.0625f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0.0625f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(46.3125f, -1.75f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0.0625f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0.0625f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(48.1875f, 1, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -5, 0.125f, 0, 4.5f, 0.125f, 0, 4.5f, 0.125f, -0.5f, -5, 0.125f, -0.5f)
			.setRotationPoint(46.3125f, -6.125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0, -0.5f, 0, 0, 4, -3.625f, -0.5f, -4.5f, -3.625f, -0.5f, -5, 0.125f, 0, 4.5f, 0.125f, 0, 4.5f, 0.125f, -0.5f, -5, 0.125f, -0.5f)
			.setRotationPoint(46.3125f, -6.125f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f, -1, -0.5f, -0.25f, -1, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, -1, -0.5f, -0.25f)
			.setRotationPoint(50.3125f, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 11, 1, 0, -0.25f, 0, -0.25f, 0, -4.75f, -0.25f, 0, -4.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, -6.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -6.5f, -0.25f)
			.setRotationPoint(45.3125f, -6.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -5, 0.125f, 0, 4.5f, 0.125f, 0, 4.5f, 0.125f, -0.5f, -5, 0.125f, -0.5f)
			.setRotationPoint(46.3125f, -6.125f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, -4.5f, -3.625f, -0.5f, 4, -3.625f, -0.5f, -0.5f, 0, 0, 0, 0, 0, -5, 0.125f, -0.5f, 4.5f, 0.125f, -0.5f, 4.5f, 0.125f, 0, -5, 0.125f, 0)
			.setRotationPoint(46.3125f, -6.125f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -1, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, -1, -0.5f, -0.25f)
			.setRotationPoint(50.3125f, -2.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 11, 1, 0, -0.25f, 0, -0.25f, 0, -4.75f, -0.25f, 0, -4.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, -6.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -6.5f, -0.25f)
			.setRotationPoint(45.3125f, -6.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0.0625f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0.0625f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(44.4375f, -4.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0.0625f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0.0625f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(46.3125f, -1.75f, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0.0625f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0.0625f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(48.1875f, 1, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -7, 0, 0, 7, 0, 0, 7, 0, -0.75f, -7, 0, -0.75f)
			.setRotationPoint(42.8125f, -7, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(42.8125f, -7, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -7, 0, 0, 7, 0, 0, 7, 0, -0.75f, -7, 0, -0.75f)
			.setRotationPoint(42.8125f, -7, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f)
			.setRotationPoint(34.625f, -1, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.625f, -0.125f, 0, 0.625f)
			.setRotationPoint(34.625f, 0, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.625f, -0.125f, 0, 0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.625f, -0.125f, 0, 0.625f)
			.setRotationPoint(34.625f, 1, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.625f, -0.125f, 0, 0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f)
			.setRotationPoint(34.625f, 3, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f)
			.setRotationPoint(34.625f, 4, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.40625f, -0.359375f, -0.125f, -0.40625f, -0.359375f)
			.setRotationPoint(34.625f, 5, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 21, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34.625f, 0, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 13, 0, -0.125f, -0.125f, 0.125f, -0.125f, -0.125f, 0.125f, -0.125f, -0.125f, 0.125f, -0.125f, -0.125f, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f)
			.setRotationPoint(34.625f, -1, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 4, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f)
			.setRotationPoint(34.625f, -1, 6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 11, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f)
			.setRotationPoint(34.625f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 11, 0, -0.125f, 0.375f, -0.375f, -0.125f, 0.375f, -0.375f, -0.125f, 0.375f, -0.375f, -0.125f, 0.375f, -0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34.625f, -2.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 13, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.875f, 0.125f, -0.125f, -0.875f, 0.125f, -0.125f, -0.875f, 0.125f, -0.125f, -0.875f, 0.125f)
			.setRotationPoint(34.625f, -1, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 10, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, -1.875f, -0.125f, -0.5f, -1.875f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(34.625f, 3, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 8, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.375f, -1.625f, -0.125f, -0.375f, -1.625f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(34.625f, 3.5f, 2.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 6, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.375f, -1, -0.125f, -0.375f, -1, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0)
			.setRotationPoint(34.625f, 4.125f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 5, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -1.0625f, -0.125f, -0.25f, -1.0625f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0)
			.setRotationPoint(34.625f, 4.75f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 10, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -1.875f, -0.125f, -0.5f, -1.875f)
			.setRotationPoint(34.625f, 3, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 8, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -1.625f, -0.125f, -0.375f, -1.625f)
			.setRotationPoint(34.625f, 3.5f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 6, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -1, -0.125f, -0.375f, -1)
			.setRotationPoint(34.625f, 4.125f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 5, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -1.0625f, -0.125f, -0.25f, -1.0625f)
			.setRotationPoint(34.625f, 4.75f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 4, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34.625f, -1, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34.625f, -1, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.625f, -0.125f, 0, 0.625f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34.625f, 0, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.125f, 0, 0.625f, -0.125f, 0, 0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.625f, -0.125f, 0, 0.625f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34.625f, 1, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0.625f, -0.125f, 0, 0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34.625f, 3, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(34.625f, 4, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.40625f, -0.359375f, -0.125f, -0.40625f, -0.359375f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(34.625f, 5, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.625f, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f)
			.setRotationPoint(51.1875f, -0.5625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.625f, 1, 5, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f)
			.setRotationPoint(51.1875f, -0.5625f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.625f, 1, 12, 1, 0, 4.625f, 0, -0.375f, -5.25f, 0, -0.375f, -5.25f, 0, -0.375f, 4.625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(51.1875f, -12.5625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.625f, 1, 12, 1, 0, 4.625f, 0, -0.375f, -5.25f, 0, -0.375f, -5.25f, 0, -0.375f, 4.625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(51.1875f, -12.5625f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(48.1875f, -8.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(51.0625f, -7.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.5f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f)
			.setRotationPoint(51.0625f, -7.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.625f, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.625f, -0.375f, -0.25f)
			.setRotationPoint(51.0625f, -6.875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.75f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.75f, -0.125f, -0.25f)
			.setRotationPoint(51.0625f, -6.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, -0.25f, -1, -0.875f, -0.25f, -1, -0.875f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(48.1875f, -7.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0.375f, -0.5f, -0.625f, 0.375f, -0.5f, -0.625f, 0.375f, -0.5f, 0, 0.375f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(49.6875f, -9, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.015625f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.515625f, 0, 0, -0.015625f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.515625f, 0, 0)
			.setRotationPoint(49.3125f, -10.25f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, -2, -1, 0, 0, -1, 0)
			.setRotationPoint(49.3125f, -10.25f, -1.135f).setRotationAngle(0, 0, 0).setName("Lamp Num Board R")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 13, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.260002f, -9.75f, 0).setRotationAngle(0, 0, 0).setName("Lamp Beam")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.515625f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.015625f, 0, 0, -0.515625f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.015625f, 0, 0)
			.setRotationPoint(49.3125f, -10.25f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, -2, -1, 0, 0, -1, 0)
			.setRotationPoint(49.3125f, -10.25f, 1.135f).setRotationAngle(0, 0, 0).setName("Lamp Num Board L")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(22.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(112.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(135, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(67.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(157.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(180, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(270, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(202.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(292.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(225, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(315, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(247.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 160, textureX, textureY)
			.addShapeBox(0, -0.5f, 3.25f, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47.4375f, -10, 0).setRotationAngle(337.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(42.75f, -19.1875f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0)
			.setRotationPoint(42.75f, -18.1875f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.125f, -0.875f, -0.75f, -0.125f, -0.875f, -0.75f, -0.125f, -0.875f, -0.75f, -0.125f, -0.875f, -0.75f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f)
			.setRotationPoint(42.75f, -19.4375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f)
			.setRotationPoint(44.3125f, -19.0625f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(41.8125f, -19.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(41.8125f, -19.0625f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f)
			.setRotationPoint(41.8125f, -18.0625f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -1.0625f, -0.3125f, -0.3125f, -1.0625f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0.4375f, -0.3125f)
			.setRotationPoint(41.8125f, -17.6875f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.4375f, 0)
			.setRotationPoint(41.8125f, -16.9375f, 3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.25f, -1.3125f, -0.3125f, 0.25f, -1.3125f, -0.3125f, 0.25f, 0.6875f, -0.3125f, 0.25f, 0.6875f)
			.setRotationPoint(41.8125f, -15.5f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(41.8125f, -16.1875f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(41.4375f, -14.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.3125f, -0.5625f, -0.0625f, -0.3125f, -0.3125f, -0.0625f, -0.3125f, -0.3125f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.5625f, -0.0625f, -0.3125f, -0.3125f, -0.0625f, -0.3125f, -0.3125f, 0, -0.3125f, -0.0625f)
			.setRotationPoint(30.8125f, -14.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f)
			.setRotationPoint(30.125f, -14.5625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -1.1875f, -0.3125f, 0, -1.1875f, -0.3125f, 0, 0.5625f, -0.3125f, 0, 0.5625f)
			.setRotationPoint(29.75f, -13.875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, -0.0625f)
			.setRotationPoint(29.75f, -11.875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.4375f, -0.3125f, -0.375f, -0.4375f)
			.setRotationPoint(29.75f, -9.875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-1.9375f, -13.5f, 7.25f).setRotationAngle(-72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-12.9375f, -13.5f, 7.25f).setRotationAngle(-72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-30.9375f, -13.5f, 7.25f).setRotationAngle(-72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-22.9375f, -13.5f, 7.25f).setRotationAngle(-72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-40.3125f, -14.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(10.3125f, -13.5f, 7.1875f).setRotationAngle(-72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(23.5625f, -13.5f, 7).setRotationAngle(-72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(37.1875f, -13.5f, 6.875f).setRotationAngle(-72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 104, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 7, 1, 1, 0, 0, -0.375f, -0.375f, 0.375f, -0.375f, -0.375f, 0.375f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.375f, -0.375f, -0.375f, 0.375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-42.3125f, -14.5f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 22, textureX, textureY)
			.addShapeBox(0, -0.5625f, -0.625f, 33, 1, 1, 0, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-32.5f, -13.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 47, textureX, textureY)
			.addShapeBox(0, -0.5625f, -0.625f, 16, 1, 1, 0, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(29.6875f, -13.5f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 33, textureX, textureY)
			.addShapeBox(0, -0.5625f, -0.625f, 29, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.375f)
			.setRotationPoint(0.6875f, -13.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 115, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 2, 1, 1, 0, 0, -0.375f, -0.375f, 0.4375f, -1.3125f, -0.5f, 0.4375f, -1.3125f, -0.25f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.4375f, 0.5625f, -0.5f, 0.4375f, 0.5625f, -0.25f, 0, -0.375f, -0.375f)
			.setRotationPoint(-34.9375f, -14.5f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 159, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.625f, 1, 1, 1, 0, 0.3125f, 0.125f, -0.375f, -1.3125f, 0.375f, -0.375f, -1.3125f, 0.375f, -0.375f, 0.3125f, 0.125f, -0.375f, -0.375f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(46.1875f, -12.8125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(40.1875f, -13.5f, -6.875f).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 50, textureX, textureY)
			.addShapeBox(0, -0.5625f, -0.625f, 16, 1, 1, 0, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(29.6875f, -13.5f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 159, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.625f, 1, 1, 1, 0, 0.3125f, 0.125f, -0.375f, -1.3125f, 0.375f, -0.375f, -1.3125f, 0.375f, -0.375f, 0.3125f, 0.125f, -0.375f, -0.375f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(46.1875f, -12.8125f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 163, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(10.3125f, -13.5f, -7.125f).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 163, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(22.5625f, -13.5f, -7).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 33, textureX, textureY)
			.addShapeBox(0, -0.5625f, -0.625f, 29, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, -0.375f)
			.setRotationPoint(0.6875f, -13.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 163, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-1.9375f, -13.5f, -7.25f).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 163, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-12.9375f, -13.5f, -7.25f).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 163, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-30.9375f, -13.5f, -7.25f).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 163, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-22.9375f, -13.5f, -7.25f).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY)
			.addShapeBox(0, -0.5625f, -0.625f, 33, 1, 1, 0, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-32.5f, -13.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 163, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f)
			.setRotationPoint(-40.3125f, -14.3125f, -7.125f).setRotationAngle(-50, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 105, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 7, 1, 1, 0, 0, -0.375f, -0.375f, 0.375f, -0.375f, -0.375f, 0.375f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.375f, -0.375f, -0.375f, 0.375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-42.3125f, -14.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 115, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 2, 1, 1, 0, 0, -0.375f, -0.375f, 0.4375f, -1.3125f, -0.25f, 0.4375f, -1.3125f, -0.5f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.4375f, 0.5625f, -0.25f, 0.4375f, 0.5625f, -0.5f, 0, -0.375f, -0.375f)
			.setRotationPoint(-34.9375f, -14.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(9.8125f, -6.3125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.4375f, -0.125f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.4375f, -0.125f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f)
			.setRotationPoint(42, -6.3125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.5f, -0.3125f, -0.0625f, -0.125f, -0.3125f, -0.0625f, -0.125f, -0.3125f, -0.125f, -0.5f, -0.3125f, -0.125f, -0.5f, -0.3125f, -0.0625f, -0.125f, -0.3125f, -0.0625f, -0.125f, -0.3125f, -0.125f, -0.5f, -0.3125f, -0.125f)
			.setRotationPoint(42, -6.3125f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 11, 0, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(9.8125f, -7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 22, 0, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-26.9375f, -8.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-26.4375f, -7.8125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(9.125f, -7.8125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(9.125f, -7, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f)
			.setRotationPoint(9.125f, -6.3125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-41.6875f, -6.1875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-27.125f, -7.8125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f)
			.setRotationPoint(-27.125f, -7, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-27.125f, -6.1875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-42.375f, -6.1875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f)
			.setRotationPoint(-42.375f, -5.625f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-47.9375f, -3.0625f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-42.375f, -3.0625f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f)
			.setRotationPoint(-48.4375f, -3.0625f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.125f, -0.3125f, -0.0625f, -0.5f, -0.3125f, -0.0625f, -0.5f, -0.3125f, -0.125f, -0.125f, -0.3125f, -0.125f, -0.125f, -0.3125f, -0.0625f, -0.5f, -0.3125f, -0.0625f, -0.5f, -0.3125f, -0.125f, -0.125f, -0.3125f, -0.125f)
			.setRotationPoint(-48.4375f, -3.0625f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-47.4375f, -3.0625f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f)
			.setRotationPoint(-47.9375f, -3.0625f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.125f, -0.3125f, -0.0625f, -0.5f, -0.3125f, -0.0625f, -0.5f, -0.3125f, -0.125f, -0.125f, -0.3125f, -0.125f, -0.125f, -0.3125f, -0.0625f, -0.5f, -0.3125f, -0.0625f, -0.5f, -0.3125f, -0.125f, -0.125f, -0.3125f, -0.125f)
			.setRotationPoint(-47.9375f, -3.0625f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-41.1875f, -5.6875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-41.875f, -5.6875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0.375f, -0.75f, -0.3125f, 0.375f, -0.75f, -0.3125f, 0.375f, 0.125f, -0.3125f, 0.375f, 0.125f)
			.setRotationPoint(-41.875f, -5.125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-41.875f, -3.0625f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-26.125f, -7.875f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f)
			.setRotationPoint(-26.125f, -5.6875f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f)
			.setRotationPoint(-26.125f, -7.1875f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.4375f, -0.125f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.4375f, -0.125f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f)
			.setRotationPoint(-26.3125f, -5.6875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f)
			.setRotationPoint(-26.125f, -5.6875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-25.4375f, -7.875f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(9.125f, -7.875f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(9.125f, -7.0625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(9.125f, -6.375f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(9.125f, -6.375f, -9.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f)
			.setRotationPoint(-11, -7.625f, -10.6875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f)
			.setRotationPoint(6, -7.625f, -10.6875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 10, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.3125f, -0.125f, 0)
			.setRotationPoint(44.1875f, -1.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 9, 10, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(41.5625f, -5.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 10, 0, -0.3125f, 0, 0, -3.125f, 0, 0, -3.125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(44.1875f, -5.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 10, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, 0, -0.75f, 0)
			.setRotationPoint(40.5f, -5.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 11, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0.25f, -0.375f, -0.125f, 0.25f, -0.375f, -0.125f, 0.25f, -0.375f, -0.125f, 0.25f, -0.375f)
			.setRotationPoint(34.625f, -4.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 11, 0, -0.125f, 0.125f, 0.1875f, -0.125f, 0.125f, 0.1875f, -0.125f, 0.125f, 0.1875f, -0.125f, 0.125f, 0.1875f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f)
			.setRotationPoint(34.625f, -5.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 9, 10, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(28.9375f, -5.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 10, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.0625f, -0.125f, 0)
			.setRotationPoint(34.75f, -5.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 10, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.5f, 0)
			.setRotationPoint(26.9375f, -1.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(27.9375f, -5.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 10, 0, 0, -2.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, -2.375f, 0, 0, 1.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 1.5f, 0)
			.setRotationPoint(24.3125f, -0.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 10, 0, 0, -1.625f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1.5f, 0, 0, 0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.625f, 0)
			.setRotationPoint(23.3125f, 0.875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-19.1875f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-18.1875f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-15.6875f, -1.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f)
			.setRotationPoint(-21.1875f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-22.6875f, -1.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-6.1875f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-5.1875f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-2.6875f, -1.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f)
			.setRotationPoint(-8.1875f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-9.6875f, -1.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(6.8125f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(7.8125f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(10.3125f, -1.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f)
			.setRotationPoint(4.8125f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(3.3125f, -1.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(19.8125f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(20.8125f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(23.3125f, -1.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f)
			.setRotationPoint(17.8125f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(16.3125f, -1.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(-6.1875f, 0, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(-19.1875f, 0, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(6.8125f, 0, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(19.8125f, 0, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f)
			.setRotationPoint(6.8125f, -1.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f)
			.setRotationPoint(-6.1875f, -1.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f)
			.setRotationPoint(-19.1875f, -1.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f)
			.setRotationPoint(19.8125f, -1.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.625f, 0, -0.25f)
			.setRotationPoint(-23.1875f, -2.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.625f, 0, -0.25f)
			.setRotationPoint(23.1875f, -2.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(-2.8125f, -2.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(2.6875f, -2.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(10.1875f, -2.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(15.6875f, -2.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(-15.8125f, -2.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(-10.3125f, -2.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 43, textureX, textureY)
			.addShapeBox(-0.375f, -2.1875f, 0.5f, 1, 1, 19, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(12, -1.3125f, -9.8125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 94, textureX, textureY)
			.addShapeBox(0, -0.4375f, 0, 1, 1, 3, 0, -0.1875f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.1875f, -0.125f, 0)
			.setRotationPoint(-15.875f, -3.0625f, -7.8125f).setRotationAngle(25, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 87, textureX, textureY)
			.addShapeBox(0, -0.4375f, 0, 1, 1, 3, 0, -0.1875f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.1875f, -0.125f, 0)
			.setRotationPoint(-11.875f, -3.0625f, -7.8125f).setRotationAngle(25, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8.6875f, 1, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-21.6875f, 1, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.3125f, 1, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.3125f, 1, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.6875f, 5, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.6875f, 1, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.6875f, 5, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.6875f, 1, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.3125f, 5, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.3125f, 1, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.8125f, 3.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.8125f, 3.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.8125f, 3.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.8125f, 3.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.1875f, 3.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.1875f, 3.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.1875f, 3.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.1875f, 3.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.6875f, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.6875f, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.6875f, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.6875f, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.3125f, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.3125f, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.3125f, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.3125f, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.6875f, 5.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.6875f, 5.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.6875f, 5.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.6875f, 5.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.3125f, 5.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.3125f, 5.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.3125f, 5.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.3125f, 5.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(16.3125f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-9.6875f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(16.3125f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(-9.6875f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(10.3125f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(10.3125f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(3.3125f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(3.3125f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-2.6875f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-2.6875f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-15.6875f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-15.6875f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(14.3125f, 3.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(13.3125f, 2.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(12.3125f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(12.3125f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f)
			.setRotationPoint(11.3125f, 3.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-11.6875f, 3.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(1.3125f, 3.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0.3125f, 2.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(-0.6875f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-0.6875f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-12.6875f, 2.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(-13.6875f, 2.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-13.6875f, 3.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f)
			.setRotationPoint(-14.6875f, 3.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f)
			.setRotationPoint(-1.6875f, 3.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-26.9375f, 3.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-27.9375f, 3.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-28.9375f, 3.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 3, 1, 0, 0, -0.75f, 0, -0.125f, -2.375f, 0, -0.125f, -2.375f, 0, 0, -0.75f, 0, 0, -0.5f, 0, -0.125f, 1.5f, 0, -0.125f, 1.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.8125f, 2, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.8125f, 2, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0)
			.setRotationPoint(-53.8125f, -3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -0.125f, 0)
			.setRotationPoint(-55.8125f, -3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-45.8125f, 2, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-48.8125f, -3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.8125f, 1, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-55.8125f, 2, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 15, 0, 0, 0, 3, -0.75f, 0, 3, -0.75f, 0, 3, 0, 0, 3, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-56.0625f, -2.875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0)
			.setRotationPoint(-53.8125f, -3, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -0.125f, 0)
			.setRotationPoint(-55.8125f, -3, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-48.8125f, 1, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-26.9375f, 3.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-27.9375f, 3.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-28.9375f, 3.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 3, 1, 0, 0, -0.75f, 0, -0.125f, -2.375f, 0, -0.125f, -2.375f, 0, 0, -0.75f, 0, 0, -0.5f, 0, -0.125f, 1.5f, 0, -0.125f, 1.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.8125f, 2, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.8125f, 2, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-45.8125f, 2, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-48.8125f, -3, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(-6.1875f, 0, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(-19.1875f, 0, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(6.8125f, 0, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(19.8125f, 0, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f)
			.setRotationPoint(6.8125f, -1.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f)
			.setRotationPoint(-6.1875f, -1.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f)
			.setRotationPoint(-19.1875f, -1.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, -0.5f, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f)
			.setRotationPoint(19.8125f, -1.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-19.1875f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-18.1875f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-15.6875f, -1.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f)
			.setRotationPoint(-21.1875f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-22.6875f, -1.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-6.1875f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-5.1875f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-2.6875f, -1.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f)
			.setRotationPoint(-8.1875f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-9.6875f, -1.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(6.8125f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(7.8125f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(10.3125f, -1.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f)
			.setRotationPoint(4.8125f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(3.3125f, -1.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(19.8125f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(20.8125f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(23.3125f, -1.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.625f, -0.25f)
			.setRotationPoint(17.8125f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(16.3125f, -1.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(-2.8125f, -2.25f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(2.6875f, -2.25f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(10.1875f, -2.25f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(15.6875f, -2.25f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(-15.8125f, -2.25f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(-10.3125f, -2.25f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.625f, 0, -0.25f)
			.setRotationPoint(-23.1875f, -2.25f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-22.6875f, -0.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0, 0, 0.125f, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -1.125f, 0, 0, -1.125f, 0)
			.setRotationPoint(-22.6875f, -0.125f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-22.6875f, -0.25f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -1.1875f, 0, 0, -1.1875f, 0)
			.setRotationPoint(-22.6875f, -0.4375f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.125f, 0, -0.375f, 0.125f, 0, -0.375f, 0, 0, 0, 0, 0, 0, -1.125f, 0, -0.375f, -1.125f, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-22.6875f, -0.125f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.1875f, 0, -0.375f, 0.1875f, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.6875f, -0.25f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, 0, -0.375f, 0.1875f, 0, -0.375f, 0, 0, 0, 0, 0, 0, -1.1875f, 0, -0.375f, -1.1875f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-22.6875f, -0.4375f, -5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, -0.625f, 0, -0.25f)
			.setRotationPoint(23.1875f, -2.25f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(23.6875f, -0.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0, 0, 0.125f, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -1.125f, 0, 0, -1.125f, 0)
			.setRotationPoint(23.6875f, -0.125f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(23.6875f, -0.25f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -1.1875f, 0, 0, -1.1875f, 0)
			.setRotationPoint(23.6875f, -0.4375f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.125f, 0, -0.375f, 0.125f, 0, -0.375f, 0, 0, 0, 0, 0, 0, -1.125f, 0, -0.375f, -1.125f, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(23.6875f, -0.125f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.1875f, 0, -0.375f, 0.1875f, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.6875f, -0.25f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, 0, -0.375f, 0.1875f, 0, -0.375f, 0, 0, 0, 0, 0, 0, -1.1875f, 0, -0.375f, -1.1875f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(23.6875f, -0.4375f, -5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.3125f, 1, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.3125f, 1, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8.6875f, 1, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-21.6875f, 1, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.3125f, 5, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.3125f, 1, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.6875f, 5, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.6875f, 1, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.6875f, 5, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.6875f, 1, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(13.3125f, 2.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(14.3125f, 3.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(1.3125f, 3.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-11.6875f, 3.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(12.3125f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(12.3125f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0.3125f, 2.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(-0.6875f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-0.6875f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-12.6875f, 2.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(-13.6875f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-13.6875f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f)
			.setRotationPoint(11.3125f, 3.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f)
			.setRotationPoint(-1.6875f, 3.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f)
			.setRotationPoint(-14.6875f, 3.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(16.3125f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(-9.6875f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(16.3125f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(-9.6875f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(10.3125f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(10.3125f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0)
			.setRotationPoint(3.3125f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(3.3125f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-2.6875f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-2.6875f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-15.6875f, 3.875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-15.6875f, 2.125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(10.5625f, -0.25f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(16.0625f, -0.25f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-2.4375f, -0.25f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(3.0625f, -0.25f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-15.4375f, -0.25f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-9.9375f, -0.25f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-15.4375f, -0.25f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-9.9375f, -0.25f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-2.4375f, -0.25f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(3.0625f, -0.25f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(10.5625f, -0.25f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(16.0625f, -0.25f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 2, 14, 0, -0.125f, 0, -1, 1, -2.245f, -1, 1, -2.245f, -1, -0.125f, 0, -1, -2.625f, 0, -1.5f, 0, 1, -1.5f, 0, 1, -1.5f, -2.625f, 0, -1.5f)
			.setRotationPoint(-46.6875f, 0.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 5, 14, 0, -0.125f, 0, -1.5f, 0.5f, -1, -1.5f, 0.5f, -1, -1.5f, -0.125f, 0, -1.5f, -6.625f, 0, -3.25f, -5.75f, 0, -3.25f, -5.75f, 0, -3.25f, -6.625f, 0, -3.25f)
			.setRotationPoint(-44.1875f, 2.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.625f, -0.1875f, -0.375f, -0.625f, -0.1875f, -0.375f, -0.625f, -0.1875f, 0, -0.625f, -0.1875f)
			.setRotationPoint(-37.5625f, 7.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 5, 16, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.625f, -2.25f, -0.25f, -2.625f, 0.375f, -0.25f, -2.625f, 0.375f, -0.25f, 0.625f, -2.25f, -0.25f)
			.setRotationPoint(-46.9375f, -3.75f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 16, 0, -0.75f, 2.625f, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.75f, 2.625f, 0, -0.75f, -2.875f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.75f, -2.875f, 0)
			.setRotationPoint(-48.4375f, 1.625f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 2, 14, 0, -0.125f, 0, -0.25f, 0.125f, -2, -0.25f, 0.125f, -2, -0.25f, -0.125f, 0, -0.25f, -0.125f, -1, -1, 0.125f, 1.375f, -1, 0.125f, 1.375f, -1, -0.125f, -1, -1)
			.setRotationPoint(-46.6875f, -0.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 22, 0, 0, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-42.3125f, -6.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 7, 16, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-42.9375f, -10.75f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58.3125f, -3.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 12, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, -0.25f, -0.5f, -0.875f, -0.25f, -0.5f, -0.875f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-58.3125f, -14.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 12, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, -0.25f, -0.5f, -0.875f, -0.25f, -0.5f, -0.875f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-58.3125f, -14.5f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 2, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.375f, 0.5f, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.375f, 0.5f)
			.setRotationPoint(-63.3125f, -19.0625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 2, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, 0, 0.25f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0.125f, 0, 0, -0.25f, 0)
			.setRotationPoint(-63.3125f, -19.0625f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, -0.3125f, 0.25f, 0, 0.0625f, 0.25f, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0.3125f, 0.25f, 0, -0.0625f, 0.25f)
			.setRotationPoint(-63.3125f, -18.9375f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 3, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, -1.375f, 0.3125f, 0, -0.9375f, 0.3125f, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 1.375f, 0.3125f, 0, 0.9375f, 0.3125f)
			.setRotationPoint(-63.3125f, -18.625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 2, 0, 0, 0.25f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, 0, 0.375f, 0, 0, -0.25f, 0, -0.5f, 0.125f, 0, -0.5f, 0, 0, 0, -0.375f, 0)
			.setRotationPoint(-63.3125f, -19.0625f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0.0625f, 0.25f, -0.5f, -0.3125f, 0.25f, -0.5f, 0, 0, 0, 0.375f, 0, 0, -0.0625f, 0.25f, -0.5f, 0.3125f, 0.25f, -0.5f, 0, 0, 0, -0.375f, 0)
			.setRotationPoint(-63.3125f, -18.9375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 3, 0, 0, -0.9375f, 0.3125f, -0.5f, -1.375f, 0.3125f, -0.5f, 0, 0, 0, 0.375f, 0, 0, 0.9375f, 0.3125f, -0.5f, 1.375f, 0.3125f, -0.5f, 0, 0, 0, -0.375f, 0)
			.setRotationPoint(-63.3125f, -18.625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 2, 1, 0, 0.5f, 0, -2.0625f, 0, 0, -2.0625f, 0, 0, 1.5625f, 0.5f, 0, 1.5625f, 0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0.5f, -0.625f, -0.5f)
			.setRotationPoint(-62.8125f, -17.25f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 2, 1, 0, 0.5f, 0, -3.3125f, 0, 0, -3.3125f, 0, 0, 2.8125f, 0.5f, 0, 2.8125f, 0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0.5f, -0.625f, -0.5f)
			.setRotationPoint(-62.8125f, -18.625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0.5f, -0.3125f, 0.25f, 0, -0.3125f, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.6875f, -0.25f, 0, -0.6875f, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0)
			.setRotationPoint(-62.8125f, -18.9375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.875f, 0, 0.5f, -0.875f, 0)
			.setRotationPoint(-62.8125f, -18.9375f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.5f, 0.5f, 0.125f, 0.5f, 0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.5f, 0.5f, -0.875f, 0.5f)
			.setRotationPoint(-62.8125f, -18.9375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 1, 0, 0, 0, 0.625f, 0.5f, 0, 0.625f, 0.5f, 0, -1.125f, 0, 0, -1.125f, 0, -0.625f, -0.5f, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-58.3125f, -15.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 2, 1, 0, 0.5f, 0, 1.5625f, 0, 0, 1.5625f, 0, 0, -2.0625f, 0.5f, 0, -2.0625f, 0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-62.8125f, -17.25f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 2, 1, 0, 0.5f, 0, 2.8125f, 0, 0, 2.8125f, 0, 0, -3.3125f, 0.5f, 0, -3.3125f, 0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-62.8125f, -18.625f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.3125f, 0.25f, 0.5f, -0.3125f, 0.25f, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.6875f, -0.25f, 0.5f, -0.6875f, -0.25f)
			.setRotationPoint(-62.8125f, -18.9375f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0)
			.setRotationPoint(-62.8125f, -18.9375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, -1.125f, 0, 0, -1.125f, 0, -1.375f, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, 0, 0, -1.375f, -0.5f)
			.setRotationPoint(-58.8125f, -15.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, -1.125f, 0, 0, -1.125f, 0, -1.875f, 0.5f, -0.5f, -1.375f, 0, -0.5f, -1.375f, -0.5f, 0, -1.875f, -1)
			.setRotationPoint(-59.3125f, -15.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, -1.125f, 0, 0, -1.125f, 0, -2, 0.625f, -0.5f, -1.875f, 0.5f, -0.5f, -1.875f, -1, 0, -2, -1.125f)
			.setRotationPoint(-59.8125f, -15.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 1, 0, 0, 0, -1.125f, 0.5f, 0, -1.125f, 0.5f, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-58.3125f, -15.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1.125f, -0.5f, 0, -1.125f, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, -1.375f, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f, -0.5f, 0, -1.375f, 0)
			.setRotationPoint(-58.8125f, -15.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1.125f, -0.5f, 0, -1.125f, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, -1.875f, -1, -0.5f, -1.375f, -0.5f, -0.5f, -1.375f, 0, 0, -1.875f, 0.5f)
			.setRotationPoint(-59.3125f, -15.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1.125f, -0.5f, 0, -1.125f, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, -2, -1.125f, -0.5f, -1.875f, -1, -0.5f, -1.875f, 0.5f, 0, -2, 0.625f)
			.setRotationPoint(-59.8125f, -15.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 20, 0, -0.5f, 0, -2.0625f, 0, 0, -2.0625f, 0, 0, -2.3125f, -0.5f, 0, -2.3125f, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f)
			.setRotationPoint(-43.3125f, -17.25f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 16, 0, -0.5f, 0, -3.3125f, 0, 0, -3.3125f, 0, 0, -3.6875f, -0.5f, 0, -3.6875f, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f)
			.setRotationPoint(-43.3125f, -18.625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, -1.25f, 0, 0, -1.25f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-42.8125f, -18.9375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, -2.5f, 0, 0, -2.5f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-42.8125f, -19.0625f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 22, 0, 0, 0, -1.125f, -0.5f, 0, -1.125f, -0.5f, 0, -1.125f, 0, 0, -1.125f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-42.8125f, -15.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 16, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-43.3125f, -14.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f)
			.setRotationPoint(-43.3125f, -14.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.875f, -0.25f)
			.setRotationPoint(-43.3125f, -14.5f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(-43.3125f, -14.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 16, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, 1.125f, -0.375f, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, 1.125f, -0.375f, 0.25f)
			.setRotationPoint(-46.3125f, -10, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-43.3125f, -9.375f, 8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 12, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-46.8125f, -14.5f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-56.8125f, -14.5f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-56.8125f, -7.875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-50.9375f, -12.875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-54.625f, -12.875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.375f, 0.1875f, 0, -0.375f, 0.1875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0.1875f, -0.5f, -0.375f, 0.1875f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-56.8125f, -10.625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0.625f, 0, -0.375f, 0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0.625f, -0.5f, -0.375f, 0.625f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-50.4375f, -10.625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0.1875f, 0, -0.375f, 0.1875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0.1875f, -0.5f, -0.375f, 0.1875f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-54.125f, -10.625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-58.3125f, -7.875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f)
			.setRotationPoint(-42.3125f, -18.9375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 1.625f, 0, 0, 1.625f, 0, 0, -2.125f, 0, 0, -2.125f, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-42.3125f, -18.3125f, 4.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f)
			.setRotationPoint(-42.3125f, -18.9375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.25f, 0, 0, -1.25f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-42.3125f, -16.875f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-42.3125f, -15.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -2.125f, 0, 0, -2.125f, 0, 0, 1.625f, 0, 0, 1.625f, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f)
			.setRotationPoint(-42.3125f, -18.3125f, -5.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-42.3125f, -18.9375f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-42.3125f, -16.875f, -6.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.625f, 0, -0.625f, 0.625f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-36.3125f, -15.5f, -5.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 1.375f, 0, -0.625f, 1.375f, 0, -0.625f, 0.75f, 0, -0.625f, 0.75f)
			.setRotationPoint(-36.3125f, -16.875f, -4.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5625f, 2.3125f, 0, -0.5625f, 2.3125f, 0, -0.5625f, 1.3125f, 0, -0.5625f, 1.3125f)
			.setRotationPoint(-36.3125f, -18.3125f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 1.4375f, 0, -0.5f, 1.4375f, 0, -0.5f, 1.9375f, 0, -0.5f, 1.9375f)
			.setRotationPoint(-36.3125f, -18.8125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard1(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-42.3125f, -15.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-43.3125f, -14.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-43.3125f, -14.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(-43.3125f, -14.5f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-43.3125f, -9.375f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-58.3125f, -7.875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 12, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-46.8125f, -14.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-56.8125f, -14.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-56.8125f, -7.875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-50.9375f, -12.875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-54.625f, -12.875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.375f, 0.1875f, 0, -0.375f, 0.1875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0.1875f, -0.5f, -0.375f, 0.1875f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-56.8125f, -10.625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0.625f, 0, -0.375f, 0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0.625f, -0.5f, -0.375f, 0.625f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-50.4375f, -10.625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0.1875f, 0, -0.375f, 0.1875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0.1875f, -0.5f, -0.375f, 0.1875f, -0.5f, -0.375f, 0, -0.5f, -0.375f)
			.setRotationPoint(-54.125f, -10.625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 11, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(-26.9375f, -16.2375f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1183")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 509, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(-26.9375f, -16.2375f, 5.125f).setRotationAngle(0, 0, 0).setName("Box 1184")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(-29.6875f, -16.2375f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1185")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(-29.6875f, -16.2375f, 5.125f).setRotationAngle(0, 0, 0).setName("Box 1186")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(-29.6875f, -18.8625f, 4.9375f).setRotationAngle(0, 0, 0).setName("Box 1187")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0.1875f, 0, -0.6f, 0.1875f, 0, -0.6f, -0.5625f, 0, -0.6f, -0.5625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(-29.6875f, -19.3625f, 4.9375f).setRotationAngle(0, 0, 0).setName("Box 1559")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f)
			.setRotationPoint(-29.6875f, -17.55f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 1178cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0.6875f, 0, 0, 0.6875f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f)
			.setRotationPoint(-29.6875f, -16.675f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 1179cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0.6875f, 0, 0, 0.6875f)
			.setRotationPoint(-29.6875f, -18.425f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 1179cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 152, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-28.9375f, -17.55f, 5.0625f).setRotationAngle(0, 0, 0).setName("Box 1177")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f)
			.setRotationPoint(-27.9375f, -17.55f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 1178")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0.6875f, 0, 0, 0.6875f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f)
			.setRotationPoint(-27.9375f, -16.675f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 1179")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0.6875f, 0, 0, 0.6875f)
			.setRotationPoint(-27.9375f, -18.425f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 1179cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 158, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-18.96875f, -17.7969f, -2.625f).setRotationAngle(0, 0, 18).setName("Box 221cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 158, textureX, textureY)
			.addShapeBox(0.25f, -0.5f, 0, 1, 1, 1, 0, -0.125f, -0.125f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0)
			.setRotationPoint(-18.96875f, -17.7969f, -2.625f).setRotationAngle(0, 0, 18).setName("Box 221cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-20.8125f, -7.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f)
			.setRotationPoint(-21.5f, -7.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(-21.5f, -7.8125f, 7.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f)
			.setRotationPoint(-21.5f, -6.5f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-21.5f, -7.15625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-21.125f, -7.15625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(-13.75f, -7.15625f, 6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-13.75f, -7.15625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.40625f, -0.3125f, -0.3125f, -0.40625f, -0.3125f, -0.3125f, -0.40625f, -0.3125f, -0.3125f, -0.40625f, -0.3125f)
			.setRotationPoint(-21.5f, -6.78125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-13.75f, -6.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(-13.75f, -6.5f, 9.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-13.75f, -6.5f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-21.125f, -6.5f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-14.6875f, -7.625f, 9.875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-20.5625f, -7.625f, 9.875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f)
			.setRotationPoint(-11, -7.625f, 7.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f)
			.setRotationPoint(6, -7.625f, 7.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-13.0625f, -6.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(7.75f, -7.8125f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.3125f, -0.4375f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(7.75f, -7.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(7.75f, -7.8125f, 9.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 11, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(9.9375f, -8.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 11, 0, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(32.8125f, -7, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.3125f, -18.125f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.3125f, -18.125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.29f, -0.29f, 0, 0, 0, 0, 0, -0.29f, -0.29f, -0.53125f, -0.29f, -0.53125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.29f, 0, -0.29f)
			.setRotationPoint(13.3125f, -19.125f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(16.3125f, -20.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, -0.875f, 0, 0, -0.875f, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(16.3125f, -20.125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -1, 0, 0, -1, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0)
			.setRotationPoint(16.3125f, -20.125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.3125f, -19.125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.3125f, -18.125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.29f, -0.29f, 0, -0.53125f, -0.29f, -0.53125f, 0, -0.29f, -0.29f, 0, 0, 0, 0, 0, 0, -0.29f, 0, -0.29f, 0, 0, 0)
			.setRotationPoint(23.3125f, -19.125f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.29f, -0.29f, -0.53125f, -0.29f, -0.53125f, -0.29f, -0.29f, 0, 0, 0, 0, 0, 0, 0, -0.29f, 0, -0.29f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.3125f, -19.125f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 135, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0.0625f, -0.4375f, -0.4375f, 0.0625f, -0.4375f, -0.4375f, 0.0625f, -0.4375f, -0.4375f, 0.0625f, -0.4375f, -0.4375f, 0.0625f, -0.4375f, -0.4375f, 0.0625f, -0.4375f, -0.4375f, 0.0625f, -0.4375f, -0.4375f, 0.0625f)
			.setRotationPoint(32.5625f, -19, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f)
			.setRotationPoint(32.0625f, -19.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(32.0625f, -20.25f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.9375f, -0.4375f, -0.4375f, -0.9375f, -0.4375f, -0.4375f, -0.9375f, -0.4375f, -0.4375f, -0.9375f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f)
			.setRotationPoint(32.0625f, -20.375f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, -0.5f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f)
			.setRotationPoint(32.0625f, -20.4375f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f)
			.setRotationPoint(32.0625f, -19.25f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.3125f, -0.375f, -0.5f, -0.3125f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(32.0625f, -19, -0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(32.0625f, -18.5f, -0.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f)
			.setRotationPoint(32.0625f, -19.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(32.0625f, -20.25f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.9375f, -0.4375f, -0.4375f, -0.9375f, -0.4375f, -0.4375f, -0.9375f, -0.4375f, -0.4375f, -0.9375f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f)
			.setRotationPoint(32.0625f, -20.375f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, -0.5f, -0.5f, -0.9375f, -0.5f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f)
			.setRotationPoint(32.0625f, -20.4375f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(32.0625f, -19.25f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.3125f, -0.375f, -0.5f, -0.3125f)
			.setRotationPoint(32.0625f, -19, 2.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(32.0625f, -18.5f, 2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.3125f, -0.375f, -0.5f, -0.3125f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f)
			.setRotationPoint(32.0625f, -18, 2.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f)
			.setRotationPoint(32.0625f, -17.75f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(40.1875f, -10.5f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(37.1875f, -10.5f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.25f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.375f, 0, -0.5625f, -0.25f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.5625f, -0.375f)
			.setRotationPoint(36.1875f, -10.5f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f)
			.setRotationPoint(35.5f, -10.75f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.125f, -0.5625f, 0, -0.125f, -0.5625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(35.5f, -11.4375f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0.25f, -0.3125f, 0, 0.25f, -0.3125f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(35.25f, -13.4375f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f, -0.3125f, 0, -1, -0.3125f, 0, -1, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(35.25f, -14.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(35.25f, -15.125f, 5.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0.9375f, -0.3125f, -0.3125f, 0.9375f, -0.3125f, -0.3125f, -0.375f, -0.25f, -0.3125f, -0.375f, -0.25f, -0.3125f, -1.5625f, -0.3125f, -0.3125f, -1.5625f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(35.25f, -15.125f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0.5f, -0.3125f, -0.3125f, 0.5f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -1.1875f, -0.3125f, -0.3125f, -1.1875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(35.25f, -16.4375f, 3.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -1.0625f, -0.3125f, -0.3125f, -1.0625f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(35.25f, -17.3125f, 0.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, -0.375f, -0.25f, -0.3125f, -0.375f, -0.25f, -0.3125f, 0.9375f, -0.3125f, -0.3125f, 0.9375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -1.5625f, -0.3125f, -0.3125f, -1.5625f, -0.3125f)
			.setRotationPoint(35.25f, -15.125f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, 0.5f, -0.3125f, -0.3125f, 0.5f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -1.1875f, -0.3125f, -0.3125f, -1.1875f, -0.3125f)
			.setRotationPoint(35.25f, -16.4375f, -5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -1.0625f, -0.3125f, -0.3125f, -1.0625f, -0.3125f)
			.setRotationPoint(35.25f, -17.3125f, -3.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(35.25f, -18, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(30.3125f, -10.5f, -7.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(30.3125f, -10.5f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.25f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.25f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(34.3125f, -10.5f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(35, -10.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.125f, -0.5625f, 0, -0.125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(35, -11.4375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0.25f, -0.3125f, 0, 0.25f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(35.25f, -13.4375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -1, -0.3125f, 0, -1, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(35.25f, -14.4375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.375f, -0.375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(35.25f, -15.125f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 158, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(33.125f, -13.734375f, -6.15625f).setRotationAngle(63, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 158, textureX, textureY)
			.addShapeBox(0, -0.5f, -1, 1, 1, 1, 0, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.828125f, -0.25f, -0.25f, -0.828125f, -0.25f, -0.25f, -0.828125f, -0.25f, -0.25f, -0.828125f, -0.25f)
			.setRotationPoint(33.125f, -13.734375f, -6.15625f).setRotationAngle(63, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 158, textureX, textureY)
			.addShapeBox(0, -0.5f, -1.5f, 1, 1, 1, 0, -0.25f, 0.25f, -0.4375f, -0.25f, 0.25f, -0.4375f, -0.25f, -0.0625f, -0.25f, -0.25f, -0.0625f, -0.25f, -0.25f, -1.078125f, -0.125f, -0.25f, -1.078125f, -0.125f, -0.25f, -0.828125f, -0.25f, -0.25f, -0.828125f, -0.25f)
			.setRotationPoint(33.125f, -13.734375f, -6.15625f).setRotationAngle(63, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 0, textureX, textureY)
			.addShapeBox(0, -0.5625f, 0, 42, 1, 1, 0, 0, -0.375f, 0.1875f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.9375f, 0, -0.375f, 0.1875f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.9375f)
			.setRotationPoint(-8.8125f, -12.9375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 158, textureX, textureY)
			.addShapeBox(0, -0.5625f, 0, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-10.25f, -12.9375f, -8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 157, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(21.4375f, -12.9375f, -7.125f).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 157, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(6.375f, -12.9375f, -7.3125f).setRotationAngle(72.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 158, textureX, textureY)
			.addShapeBox(0, -0.5625f, 0, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0.4375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-10.1875f, -14.5625f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 157, textureX, textureY)
			.addShapeBox(-0.5f, -0.03125f, -0.5f, 1, 2, 1, 0, -0.40625f, 0, -0.40625f, -0.40625f, 0, -0.40625f, -0.40625f, 0, -0.40625f, -0.40625f, 0, -0.40625f, -0.40625f, 0.15625f, -0.40625f, -0.40625f, 0.15625f, -0.40625f, -0.40625f, 0.15625f, -0.40625f, -0.40625f, 0.15625f, -0.40625f)
			.setRotationPoint(-8.9375f, -14.4375f, -6.8125f).setRotationAngle(-25, 0, 38)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 27, textureX, textureY)
			.addShapeBox(0, -0.5625f, 0, 32, 1, 1, 0, 0, -0.375f, -0.375f, 0.4375f, -0.375f, -0.375f, 0.4375f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.4375f, -0.375f, -0.375f, 0.4375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-42.625f, -14.5625f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 157, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-15.9375f, -14.53125f, -6.6875f).setRotationAngle(60.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 157, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f)
			.setRotationPoint(-33.9375f, -14.5625f, -6.6875f).setRotationAngle(60.5f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -1.0625f, 0, -0.1875f, -1.0625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, 0.5f, 0, -0.1875f, 0.5f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(19.9375f, -17.125f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -1.0625f, 0, -0.1875f, -1.0625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, 0.5f, 0, -0.1875f, 0.5f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(17.3125f, -17.125f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -1.1875f, 0, -0.3125f, -1.1875f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0.625f, 0, -0.3125f, 0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(19.9375f, -16.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -1.1875f, 0, -0.3125f, -1.1875f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0.625f, 0, -0.3125f, 0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(17.3125f, -16.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -1.625f, 0, -0.3125f, -1.625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0.625f, -0.5f, -0.3125f, 0.625f, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(19.9375f, -15.375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -1.625f, 0, -0.3125f, -1.625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0.625f, -0.5f, -0.3125f, 0.625f, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(17.3125f, -15.375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.6875f, -0.5f, -0.1875f, 0.0625f, -0.5f, -0.1875f, 0.0625f, -0.5f, -0.4375f, -0.8125f, -0.5f, -0.4375f)
			.setRotationPoint(18.0625f, -11, -8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.4375f, -0.25f, -0.8125f, -0.1875f, -0.25f, -0.8125f, -0.1875f, -0.25f, 0.1875f, -0.4375f, -0.25f, 0.1875f)
			.setRotationPoint(18.4375f, -9.5f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.5625f, -0.5f, 0.4375f, -0.0625f, -0.5f, 0.4375f, -0.0625f, -0.5f, -1.0625f, -0.5625f, -0.5f, -1.0625f)
			.setRotationPoint(19.9375f, -13.75f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.5625f, -0.5f, 0.4375f, -0.0625f, -0.5f, 0.4375f, -0.0625f, -0.5f, -1.0625f, -0.5625f, -0.5f, -1.0625f)
			.setRotationPoint(17.3125f, -13.75f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.0625f, -0.5f, -0.0625f, 0.4375f, -0.5f, -0.0625f, 0.4375f, -0.5f, -0.5625f, -1.1875f, -0.5f, -0.5625f)
			.setRotationPoint(20.1875f, -12.25f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.8125f, -0.75f, -0.1875f, 0.1875f, -0.75f, -0.1875f, 0.1875f, -0.75f, -0.4375f, -0.9375f, -0.75f, -0.4375f)
			.setRotationPoint(17.5625f, -12.25f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -2.4375f, 0, -1.0625f, 1.8125f, 0, -1.0625f, 1.8125f, 0, 0.4375f, -2.4375f, 0, 0.4375f)
			.setRotationPoint(20.9375f, -9.75f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -2.4375f, 0, -2.5625f, 1.6875f, -0.25f, -2.5625f, 1.6875f, -0.25f, 1.9375f, -2.4375f, 0, 1.9375f)
			.setRotationPoint(23.0625f, -6.75f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5625f, -0.4375f, -0.3125f, -0.25f, -1.4375f, -2.3125f, -0.25f, -1.4375f, 1.6875f, -0.5625f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.25f, 0.6875f, -2.3125f, -0.25f, 0.6875f, 1.6875f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(25.1875f, -4.4375f, -5.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f)
			.setRotationPoint(17.1875f, -9.75f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(17.1875f, -10.25f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(14.6875f, -10.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(14.1875f, -12.25f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(14.1875f, -13, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(14.6875f, -13, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(27.1875f, -13, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -3.25f, -0.25f, -0.5f, 2.75f, -0.25f, -0.5f, 2.75f, -0.25f, 0, -3.25f, -0.25f, 0)
			.setRotationPoint(27.1875f, -12.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(30.1875f, -9, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -1.0625f, 0, -0.1875f, -1.0625f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.5f, 0, -0.1875f, 0.5f, 0)
			.setRotationPoint(19.9375f, -17.125f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.1875f, 0, -0.3125f, -1.1875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.625f, 0, -0.3125f, 0.625f, 0)
			.setRotationPoint(19.9375f, -16.25f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.625f, 0, -0.3125f, -1.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.625f, -0.5f, -0.3125f, 0.625f, -0.5f)
			.setRotationPoint(19.9375f, -15.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.5625f, -0.5f, -1.0625f, -0.0625f, -0.5f, -1.0625f, -0.0625f, -0.5f, 0.4375f, -0.5625f, -0.5f, 0.4375f)
			.setRotationPoint(19.9375f, -13.75f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.0625f, -0.5f, -0.5625f, 0.4375f, -0.5f, -0.5625f, 0.4375f, -0.5f, -0.0625f, -1.0625f, -0.5f, -0.0625f)
			.setRotationPoint(20.1875f, -12.25f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -2.4375f, 0, 0.4375f, 1.8125f, 0, 0.4375f, 1.8125f, 0, -1.0625f, -2.4375f, 0, -1.0625f)
			.setRotationPoint(20.9375f, -9.75f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -2.4375f, 0, 1.9375f, 1.6875f, -0.25f, 1.9375f, 1.6875f, -0.25f, -2.5625f, -2.4375f, 0, -2.5625f)
			.setRotationPoint(23.0625f, -6.75f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5625f, -0.4375f, -0.3125f, -0.25f, -1.4375f, 1.6875f, -0.25f, -1.4375f, -2.3125f, -0.5625f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.25f, 0.6875f, 1.6875f, -0.25f, 0.6875f, -2.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(25.1875f, -4.4375f, 4.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -1.0625f, 0, -0.1875f, -1.0625f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.5f, 0, -0.1875f, 0.5f, 0)
			.setRotationPoint(19, -17.125f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.1875f, 0, -0.3125f, -1.1875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.625f, 0, -0.3125f, 0.625f, 0)
			.setRotationPoint(19, -16.25f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.625f, 0, -0.3125f, -1.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.625f, -0.5f, -0.3125f, 0.625f, -0.5f)
			.setRotationPoint(19, -15.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.5625f, 0, -0.8125f, -0.0625f, 0, -0.8125f, -0.0625f, 0, 0.1875f, -0.5625f, 0, 0.1875f)
			.setRotationPoint(19, -13.75f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f)
			.setRotationPoint(19.25f, -13.0625f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -1.0625f, 0, -0.1875f, -1.0625f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.5f, 0, -0.1875f, 0.5f, 0)
			.setRotationPoint(16.375f, -17.125f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.1875f, 0, -0.3125f, -1.1875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.625f, 0, -0.3125f, 0.625f, 0)
			.setRotationPoint(16.375f, -16.25f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.625f, 0, -0.3125f, -1.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.625f, -0.5f, -0.3125f, 0.625f, -0.5f)
			.setRotationPoint(16.375f, -15.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.5625f, 0, -0.8125f, -0.0625f, 0, -0.8125f, -0.0625f, 0, 0.1875f, -0.5625f, 0, 0.1875f)
			.setRotationPoint(16.375f, -13.75f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, 0.25f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f)
			.setRotationPoint(16.625f, -13.0625f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -1.0625f, 0, -0.1875f, -1.0625f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.5f, 0, -0.1875f, 0.5f, 0)
			.setRotationPoint(17.3125f, -17.125f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.1875f, 0, -0.3125f, -1.1875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.625f, 0, -0.3125f, 0.625f, 0)
			.setRotationPoint(17.3125f, -16.25f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -1.625f, 0, -0.3125f, -1.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.625f, -0.5f, -0.3125f, 0.625f, -0.5f)
			.setRotationPoint(17.3125f, -15.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.5625f, -0.5f, -1.0625f, -0.0625f, -0.5f, -1.0625f, -0.0625f, -0.5f, 0.4375f, -0.5625f, -0.5f, 0.4375f)
			.setRotationPoint(17.3125f, -13.75f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.8125f, -0.75f, -0.4375f, 0.1875f, -0.75f, -0.4375f, 0.1875f, -0.75f, -0.1875f, -0.8125f, -0.75f, -0.1875f)
			.setRotationPoint(17.5625f, -12.25f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.6875f, -0.5f, -0.4375f, 0.0625f, -0.5f, -0.4375f, 0.0625f, -0.5f, -0.1875f, -0.6875f, -0.5f, -0.1875f)
			.setRotationPoint(18.0625f, -11, 7.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.4375f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, -0.625f, -0.4375f, -0.25f, -0.625f)
			.setRotationPoint(18.4375f, -9.5f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 131, textureX, textureY).addCylinder(0, 0, 0, 3, 8, 12, 0.9166667f, 0.9166667f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(34.375f, 4.125f, -8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 133, textureX, textureY).addCylinder(0, 0, 0, 2, 9, 10, 0.9375f, 0.9375f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(33.875f, -0.375f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 131, textureX, textureY).addCylinder(0, 0, 0, 3, 8, 12, 0.9166667f, 0.9166667f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(34.375f, 4.125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 160, textureX, textureY).addCylinder(0, 0, 0, 1, 8, 8, 1, 1, 4, null)
			.setRotationPoint(38.125f, -6, -4).setRotationAngle(-45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 160, textureX, textureY).addCylinder(0, 0, 0, 1, 8, 8, 1, 1, 4, null)
			.setRotationPoint(38.125f, -6, 4).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 133, textureX, textureY).addCylinder(0, 0, 0, 2, 9, 12, 0.9375f, 0.9375f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(33.875f, -0.375f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 80, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(7, 6.9375f).setLength(7).setSegments(20, 6).setScale(1.078125f, 1.078125f).setDirection(3)
			.setTopOffset(new Vec3f(0.125, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(29.6875f, -10, 0).setRotationAngle(-126, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 133, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.625f).setLength(2).setSegments(10, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.25, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(38.53125f, -19.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 133, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.625f).setLength(1).setSegments(10, 0).setScale(1, 1.25f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(38.53125f, -17.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 133, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.4775f).setLength(1).setSegments(10, 0).setScale(1.0625f, 1.0625f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(38.53125f, -19.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 9, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.53125f, -17.5f, 0).setRotationAngle(0, 0, 0).setName("Smokey Boi")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 165, textureX, textureY).addCylinder(-0.5f, 0, 0, 1, 1, 8, 1.375f, 1.5625f, 2, new Vec3f(0.6875, 0.0, 0.0))
			.setRotationPoint(51.75f, -9.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 165, textureX, textureY).addCylinder(-0.5f, 0, 0, 1, 1, 8, 1.5625f, 1.375f, 2, new Vec3f(0.625, 0.0, 0.0))
			.setRotationPoint(51.4375f, -9.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 165, textureX, textureY).addCylinder(-0.5f, 0, 0, 1, 1, 8, 1.375f, 0.9375f, 2, new Vec3f(0.625, 0.0, 0.0))
			.setRotationPoint(51.0625f, -9.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 165, textureX, textureY).addCylinder(-0.5f, 0, 0, 1, 1, 8, 0.9375f, 0.6875f, 2, new Vec3f(0.625, 0.0, 0.0))
			.setRotationPoint(50.6875f, -9.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 165, textureX, textureY).addCylinder(-0.5f, 0, 0, 1, 2, 8, 0.6875f, 0.6875f, 2, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(49.3125f, -9.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 162, textureX, textureY).newCylinderBuilder()
			.setPosition(-0.5f, 0, 0).setRadius(1, 0.90625f).setLength(1).setSegments(8, 0).setScale(1.375f, 1.375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.9375, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(52.75f, -9.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 165, textureX, textureY).addCylinder(-0.5f, 0, 0, 1, 1, 8, 1.375f, 1.375f, 2, new Vec3f(0.6875, 0.0, 0.0))
			.setRotationPoint(51.76f, -9.75f, 0).setRotationAngle(0, 0, 0).setName("LAMP")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 120, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 12, 1.1875f, 1, 3, null)
			.setRotationPoint(46.8125f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 120, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 12, 1, 0.8125f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(47.8125f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 119, textureX, textureY).addCylinder(-0.5f, 0, 0, 4, 1, 12, 0.5f, 0, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(49, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 118, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 12, 0.8125f, 0.5f, 3, new Vec3f(-0.5625, 0.0, 0.0))
			.setRotationPoint(48.0625f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 67, textureX, textureY).addCylinder(0, 0, 0, 8, 29, 20, 1, 0.9375f, 3, null)
			.setRotationPoint(0.6875f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 78, textureX, textureY).addCylinder(0, 0, 0, 7, 17, 20, 1.0714287f, 1.0714287f, 3, new Vec3f(0.125, 0.0, 0.0))
			.setRotationPoint(29.6875f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 62, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.9921875f, 0.9906875f, 3, new Vec3f(-0.0625, 0.0, 0.0))
			.setRotationPoint(7.6875f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 61, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.9780625f, 0.9760625f, 3, new Vec3f(-0.0625, 0.0, 0.0))
			.setRotationPoint(14.5f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 60, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 0.9503125f, 0.9483125f, 3, new Vec3f(-0.0625, 0.0, 0.0))
			.setRotationPoint(27.375f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 59, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(8, 7.96875f).setLength(9).setSegments(20, 1).setScale(0.97265625f, 0.953125f).setDirection(3)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(14.3125f, -10, 0).setRotationAngle(144, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 59, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(8, 7.96875f).setLength(9).setSegments(20, 1).setScale(0.97265625f, 0.953125f).setDirection(3)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(14.3125f, -10, 0).setRotationAngle(-126, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 70, textureX, textureY).addCylinder(0, 0, 0, 8, 43, 20, 1, 1, 3, null)
			.setRotationPoint(-42.3125f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 65, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 1.0078125f, 1.0078125f, 3, new Vec3f(-0.0625, 0.0, 0.0))
			.setRotationPoint(-25.625f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 64, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 1.0078125f, 1.0078125f, 3, new Vec3f(-0.0625, 0.0, 0.0))
			.setRotationPoint(-16.4375f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 62, textureX, textureY).addCylinder(0, 0, 0, 8, 1, 20, 1.0078125f, 1.0078125f, 3, new Vec3f(-0.0625, 0.0, 0.0))
			.setRotationPoint(-7.1875f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 60, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(8, 0).setLength(3).setSegments(20, 10).setScale(1, 1).setDirection(2)
			.setTopOffset(null).setTopRotation(new Vec3f(-15.0, 0.0, 0.0)).build()
			.setRotationPoint(-45.75f, -10, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 158, textureX, textureY).addCylinder(0, -0.5625f, -7.5f, 1, 1, 8, 0.5625f, 0.5625f, 0, null)
			.setRotationPoint(33.625f, -10, 0).setRotationAngle(-27, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 165, textureX, textureY).addCylinder(0, -0.4375f, 0, 1, 1, 8, 0.078125f, 0.078125f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 165, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.46875f, 0).setRadius(1, 0.5f).setLength(1).setSegments(8, 0).setScale(0.0390625f, 0.078125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.96875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 165, textureX, textureY).addCylinder(0, -0.5f, 0, 1, 1, 8, 0.0078125f, 0.0390625f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 165, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.125f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.546875f, 0.625f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 165, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.25f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.390625f, 0.546875f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 165, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.375f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.078125f, 0.390625f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 165, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.75f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.625f, 0.703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 165, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.625f, 0.625f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.25, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 165, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 1.25f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.859375f, 0.9375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 165, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 1, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.703125f, 0.859375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(32.5625f, -19, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 154, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(17.6875f, -9.25f, 7.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 139, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(3).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(23.3125f, -18.125f, 3).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 128, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(3).setSegments(8, 2).setScale(1, 1).setDirection(5)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(23.3125f, -18.125f, -3).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 119, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(3).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(14.3125f, -18.125f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 110, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(3).setSegments(8, 2).setScale(1, 1).setDirection(5)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(14.3125f, -18.125f, -3).setRotationAngle(0, 180, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 139, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(9).setSegments(8, 2).setScale(1, 1).setDirection(2)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(23.3125f, -18.125f, 3).setRotationAngle(0, 0, -180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 139, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(6).setSegments(8, 2).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(23.3125f, -18.125f, -3).setRotationAngle(0, 0, -180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 139, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(9).setSegments(8, 2).setScale(1, 1).setDirection(3)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(23.3125f, -18.125f, -3).setRotationAngle(0, 0, -180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 137, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(6).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(14.3125f, -18.125f, -3).setRotationAngle(0, 0, -180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.53125f, -0.29f, -0.53125f, 0, -0.29f, -0.29f, 0, 0, 0, -0.29f, -0.29f, 0, -0.29f, 0, -0.29f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.3125f, -19.125f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 124, textureX, textureY).addCylinder(0, 0, 0, 3, 3, 10, 1.25f, 1.25f, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(0.3125f, -19.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 123, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 10, 1.2109375f, 1.25f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.3125f, -19.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 123, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 10, 1.09375f, 1.2109375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.3125f, -19.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 123, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 10, 0.8984375f, 1.09375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(0.3125f, -19.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 108, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 10, 1, 1, 4, null)
			.setRotationPoint(-11.9375f, -19, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 107, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.9375f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-11.9375f, -19.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 107, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.84375f, 0.9375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-11.9375f, -19.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 103, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.65625f, 0.84375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-11.9375f, -19.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 7, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, -18, -2.125f).setRotationAngle(0, 0, 0).setName("Whistle Steam Boi")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 160, textureX, textureY).addCylinder(-1.53125f, 0, 0, 1, 1, 6, 0.28333333f, 0.28333333f, 2, new Vec3f(0.84375, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 160, textureX, textureY).addCylinder(-1.6875f, 0, 0, 1, 1, 6, 0.28333333f, 0.375f, 2, new Vec3f(0.875, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 160, textureX, textureY).addCylinder(-1.8125f, 0, 0, 1, 1, 6, 0.375f, 0.375f, 2, new Vec3f(0.875, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 160, textureX, textureY).addCylinder(-1.9375f, 0, 0, 1, 1, 6, 0.125f, 0.125f, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 160, textureX, textureY).addCylinder(-2.1875f, 0, 0, 1, 1, 6, 0.375f, 0.375f, 2, new Vec3f(0.3125, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 160, textureX, textureY).addCylinder(-2.875f, 0, 0, 1, 1, 6, 0.375f, 0.28333333f, 2, new Vec3f(0.9375, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 160, textureX, textureY).addCylinder(-2.9375f, 0, 0, 1, 1, 6, 0.28333333f, 0.175f, 2, new Vec3f(0.859375, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 160, textureX, textureY).addCylinder(-3.078125f, 0, 0, 1, 1, 6, 0.175f, 0.0937f, 2, new Vec3f(0.921875, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 159, textureX, textureY).addCylinder(-3.234375f, 0, 0, 1, 1, 6, 0.172f, 0.14f, 2, new Vec3f(0.921875, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 159, textureX, textureY).addCylinder(-3.3125f, 0, 0, 1, 1, 6, 0.14f, 0.14f, 2, new Vec3f(0.890625, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 159, textureX, textureY).addCylinder(-3.421875f, 0, 0, 1, 1, 6, 0.14f, 0.1015625f, 2, new Vec3f(0.96875, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 159, textureX, textureY).addCylinder(-3.453125f, 0, 0, 1, 1, 6, 0.1015625f, 0.03125f, 2, new Vec3f(0.96875, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 159, textureX, textureY).addCylinder(-3.15625f, 0, 0, 1, 1, 6, 0.0937f, 0.172f, 2, new Vec3f(0.921875, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 159, textureX, textureY).addCylinder(-1.375f, 0, 0, 1, 1, 6, 0.37708333f, 0.28333333f, 2, new Vec3f(0.84375, 0.0, 0.0))
			.setRotationPoint(-18.96875f, -17.7969f, -2.125f).setRotationAngle(0, 0, 18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-18.6875f, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-5.6875f, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(7.3125f, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(20.3125f, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 78, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(-5.6875f, 4, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 70, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(-5.6875f, 4, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(-18.6875f, 4, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 55, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(-18.6875f, 4, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(20.3125f, 4, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 49, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(20.3125f, 4, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 50, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(7.3125f, 4, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 47, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 0, new Vec3f(0.0, 0.0, 0.125))
			.setRotationPoint(7.3125f, 4, 4.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-9.4375f, 3.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-14.9375f, 3.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(3.5625f, 3.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-1.9375f, 3.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(16.5625f, 3.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(11.0625f, 3.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(16.5625f, 3.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(11.0625f, 3.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(3.5625f, 3.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-1.9375f, 3.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-9.4375f, 3.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 169, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-14.9375f, 3.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 177, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-14.9375f, -0.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 182, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-9.4375f, -0.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 182, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-1.9375f, -0.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 178, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(3.5625f, -0.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 178, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(11.0625f, -0.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 174, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(16.5625f, -0.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 170, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-14.9375f, -0.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 174, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-9.4375f, -0.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 170, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-1.9375f, -0.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 173, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(3.5625f, -0.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 177, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(11.0625f, -0.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 181, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(16.5625f, -0.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(8.125f, -7.8125f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.0625f, -0.3125f, -0.3125f, -0.0625f, -0.3125f, -0.3125f, -0.0625f, -0.3125f, -0.3125f, -0.0625f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(8.125f, -7.1875f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.4375f, -0.4375f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(8.125f, -6.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(7.75f, -6.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 133, textureX, textureY).addCylinder(0, 0, 0, 2, 20, 8, 0.78125f, 0.78125f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-11.75f, -6, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 44, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.78125f, 0.71875f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(7.75f, -6, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 43, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.71875f, 0.53125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(7.875f, -6, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 43, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.53125f, 0.21875f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(8, -6, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 132, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.0625f).setLength(1).setSegments(8, 4).setScale(0.84375f, 0.84375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-10.75f, -6, 9).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 132, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.0625f).setLength(1).setSegments(8, 4).setScale(0.84375f, 0.84375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(6.25f, -6, 9).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 47, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.71875f, 0.78125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-11.875f, -6, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 45, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.53125f, 0.71875f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-12, -6, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 44, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.21875f, 0.53125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-12.125f, -6, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 153, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 30.0, 0.0)).build()
			.setRotationPoint(-41.7985f, 0.01200104f, 9.408001f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 153, textureX, textureY).addCylinder(0, 0, 0, 1, 7, 8, 0.5f, 0.5f, 3, new Vec3f(0.389, 0.012, 0.0))
			.setRotationPoint(-49.1875f, 0.5f, 9.408001f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 153, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 20.0, 0.0)).build()
			.setRotationPoint(-49.1875f, 1, 9.408001f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 152, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 20.0, 0.0)).build()
			.setRotationPoint(-49.1875f, 1, 9.408001f).setRotationAngle(0, 0, -20)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 152, textureX, textureY).addCylinder(0, 0.5f, 0, 1, 5, 8, 0.5f, 0.5f, 3, new Vec3f(0.389, 0.012, -0.875))
			.setRotationPoint(-41.7985f, 0.01200104f, 9.408001f).setRotationAngle(0, 0, -30)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 153, textureX, textureY).newCylinderBuilder()
			.setPosition(0.5f, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -1.0)).setTopRotation(new Vec3f(30.0, 0.0, 0.0)).build()
			.setRotationPoint(-22.3125f, -3, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 153, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 0.5f, 0.5f, 3, new Vec3f(0.3125, -0.6941, -0.033001))
			.setRotationPoint(-36.625f, -2.3059006f, 8.533001f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 152, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 30.0, 0.0)).build()
			.setRotationPoint(-36.625397f, -1.8059006f, 8.533001f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 152, textureX, textureY).newCylinderBuilder()
			.setPosition(0.5f, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -1.0)).setTopRotation(new Vec3f(30.0, 0.0, 0.0)).build()
			.setRotationPoint(-22.3125f, -3, 8).setRotationAngle(0, -30, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 152, textureX, textureY).newCylinderBuilder()
			.setPosition(0.5f, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -1.0)).setTopRotation(new Vec3f(30.0, 0.0, 0.0)).build()
			.setRotationPoint(-22.3125f, -3, 8).setRotationAngle(0, -60, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 152, textureX, textureY).addCylinder(0.5f, 0, 0, 1, 5, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 1.0, 0.0))
			.setRotationPoint(-22.3125f, -4, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 18, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.375f, 0.375f, 5, new Vec3f(0.0, 0.75, 0.0))
			.setRotationPoint(-21.3125f, 5.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 157, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 27.0, 0.0)).build()
			.setRotationPoint(-45.7985f, 3.012001f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 157, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 27.0, 0.0)).build()
			.setRotationPoint(-45.7985f, 3.012001f, -8.625f).setRotationAngle(0, 0, -27)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 157, textureX, textureY).addCylinder(0, 0, 0, 1, 7, 8, 0.5f, 0.5f, 3, new Vec3f(0.389, 0.012, 0.0))
			.setRotationPoint(-53.1875f, 3.5f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 157, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 20.0, 0.0)).build()
			.setRotationPoint(-53.1875f, 4, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 157, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 20.0, 0.0)).build()
			.setRotationPoint(-53.1875f, 4, -8.625f).setRotationAngle(0, 0, -20)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 0.5f, 0.5f, 3, new Vec3f(0.0, -0.4375, -0.3915))
			.setRotationPoint(-40.875f, -2.5625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 27.0, 0.0)).build()
			.setRotationPoint(-40.875f, -2.0625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 27.0, 0.0)).build()
			.setRotationPoint(-40.875f, -2.0625f, -8.625f).setRotationAngle(0, 0, -27)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 157, textureX, textureY).addCylinder(-7, -0.5f, 0, 1, 7, 8, 0.5f, 0.5f, 3, null)
			.setRotationPoint(-40.875f, -2.0625f, -8.625f).setRotationAngle(0, 0, -54)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 158, textureX, textureY).addCylinder(-19.5625f, -0.03125f, 0, 1, 19, 8, 0.3125f, 0.3125f, 3, new Vec3f(0.125, 0.0, 1.0))
			.setRotationPoint(-19.8125f, -2.375f, -8.8125f).setRotationAngle(0, 0, 11.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 158, textureX, textureY).addCylinder(0, 0, -0.5f, 1, 2, 8, 0.5f, 0.5f, 4, new Vec3f(0.0, 0.23366, 0.0))
			.setRotationPoint(-26.375f, -5.7336597f, -8.5165f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0.5f, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(-26.875f, -3.5f, -9.0165f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0.5f, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(-26.875f, -3.5f, -9.0165f).setRotationAngle(0, 0, 90)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0.5f).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 25.0)).build()
			.setRotationPoint(-26.375f, -7.0625f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 158, textureX, textureY).addCylinder(0, 0, 0.5f, 1, 1, 8, 0.5f, 0.5f, 4, null)
			.setRotationPoint(-26.375f, -7.0625f, -9).setRotationAngle(-25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -0.5f).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 25.0)).build()
			.setRotationPoint(-26.375f, -5.7336597f, -8.5165f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 48, 8, 0.5f, 0.5f, 3, new Vec3f(-0.375, 0.0, 0.25))
			.setRotationPoint(-25.875f, -9.5625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(-25.875f, -9.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(-25.875f, -9.0625f, -8.5f).setRotationAngle(0, 0, -45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.5f, 0.5f, 4, null)
			.setRotationPoint(-26.375f, -9.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.3125f, 0.3125f, 3, new Vec3f(-0.5625, 0.0, 0.0))
			.setRotationPoint(-19.375f, -2.375f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 3, new Vec3f(-0.5625, 0.0, 0.0))
			.setRotationPoint(-19.8125f, -2.375f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.375f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5625, 0.125, 0.0)).setTopRotation(new Vec3f(0.0, 8.5, 0.0)).build()
			.setRotationPoint(-20.25f, -2.5f, -7.8125f).setRotationAngle(0, 0, 8.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.9375f, 0.9375f, 3, new Vec3f(-0.5625, 0.0, 0.0))
			.setRotationPoint(-18.9375f, -2.625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 55, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 4).setScale(0.9375f, 0.9375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.3125, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-19.625f, -2.625f, -7.8125f).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 3, new Vec3f(-0.5625, 0.0, 0.0))
			.setRotationPoint(-18.5f, -2.75f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 0.9375f, 3, new Vec3f(-0.5625, 0.125, 0.0))
			.setRotationPoint(-18.0625f, -2.75f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.9375f, 0.8125f, 3, new Vec3f(-0.125, -0.0625, 0.0))
			.setRotationPoint(-17.625f, -2.625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.3125f, 1.3125f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-11.75f, -3.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 8, 1.125f, 1.125f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(-15.3125f, -3.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.3125f, 1.3125f, 3, new Vec3f(-0.5625, 0.0, 0.0))
			.setRotationPoint(-15.75f, -3.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 133, textureX, textureY).addCylinder(0, 0, 0, 2, 20, 8, 0.78125f, 0.78125f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-11.75f, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 83, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.71875f, 0.78125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-11.875f, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 83, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.53125f, 0.71875f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-12, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 83, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.21875f, 0.53125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-12.125f, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 132, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.0625f).setLength(1).setSegments(8, 4).setScale(0.84375f, 0.84375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-10.75f, -6, -9).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 0.625f, 3, null)
			.setRotationPoint(-11.25f, -3.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.5625f, 3, new Vec3f(-0.5625, 0.0, 0.0))
			.setRotationPoint(-10.25f, -3.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 20, 8, 0.375f, 0.375f, 3, new Vec3f(0.1875, 0.0, 0.0))
			.setRotationPoint(-9.8125f, -3.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 159, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(0.3125, 0.0, 0.0))
			.setRotationPoint(10.3125f, -3.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 81, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.78125f, 0.71875f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(7.75f, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 132, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.0625f).setLength(1).setSegments(8, 4).setScale(0.84375f, 0.84375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(6.25f, -6, -9).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 75, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.71875f, 0.53125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(7.875f, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 72, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.53125f, 0.21875f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(8, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(22.25f, -9.5625f, -7.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -0.5f).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(21.75f, -9.5625f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -0.5f).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(21.75f, -9.5625f, -7.75f).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(22.25f, -9.5625f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, -1, 0, 0, -1, 0, 0, -1, -3, 0, -1, -3)
				.setRotationPoint(52.07f, -8, -1.5f).setRotationAngle(0, 0, 0)
				.setName("Lamp Num Board Lcp")
		);
		groups.add(clipboard);
	}


	ModelL3aRearBogie rear = new ModelL3aRearBogie();
	ModelL3aFrontBogie front = new ModelL3aFrontBogie();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			ModelRenderHelper.renderModelWithRollingStockLightControls(l.toArray(arr), entity, f5);
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.30859375f,0,0);
		rear.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslatef(2.478515625f,0,0);
		front.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
