//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.freight.hopper;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.Model40TonWoodenHopperBogie;
import tcmodern.common.entities.freight.hoppers.Entity40TonWoodenHopper;
import tcmodern.common.entities.tender.EntityNYCPT2Tender;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model40TonWoodenHopper extends FVTMFormatBase {

	public Model40TonWoodenHopper(){
		super();
		textureX = 256;
		textureY = 128;
		addToCreators("Rodn56");
		//
		initGroup_BrakeWheel();
		initGroup_Ladder1();
		initGroup_CarBody();
		initGroup_Tension();
		initGroup_BrakeWheel2();
		initGroup_Ladder2();
		initGroup_Loads();
	}

	private final void initGroup_BrakeWheel(){
		TurboList BrakeWheel = new TurboList("BrakeWheel");
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 93, 57, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.625, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.9375f, -6).setRotationAngle(0, 0, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 222, 47, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, -11, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 212, 47, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, 169, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 145, 45, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, -101, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 135, 45, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, 79, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 10, 43, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, -57, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 0, 43, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, 123, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 246, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, -147, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 11, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, 33, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 173, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, 1, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 159, 82, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(11).setSegments(8, 0).setScale(0.25f, 0.25f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, 3.0, 0.0)).setTopRotation(new Vec3f(0.0, -1.0, 0.0)).build()
			.setRotationPoint(24.5f, -12.875f, -6).setRotationAngle(0, 1, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.25f)
			.setRotationPoint(24, -6.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 235, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, 0, 0, -2, 0, 0, -2, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, 0, -2, -0.75f, 0, -2, -0.75f, 0, 0.25f, -0.75f, 0)
			.setRotationPoint(24.5f, -6.375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		BrakeWheel.add(new ModelRendererTurbo(BrakeWheel, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, -2.25f, 0, -0.25f, -2.25f, 0, -0.25f, 0.5f, 0, 0, 0.5f, -0.75f, 0, -2.25f, -0.75f, -0.25f, -2.25f, -0.75f, -0.25f, 0.5f, -0.75f, 0)
			.setRotationPoint(25, -6.375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(BrakeWheel);
	}

	private final void initGroup_Ladder1(){
		TurboList Ladder1 = new TurboList("Ladder1");
		Ladder1.add(new ModelRendererTurbo(Ladder1, 187, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.5f, -0.375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 248, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0.25f, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0)
			.setRotationPoint(-23.75f, -0.375f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 249, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0.25f)
			.setRotationPoint(-20.25f, -0.375f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 8, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.5f, -5.875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 108, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0.25f, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0)
			.setRotationPoint(-23.75f, -5.875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 205, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0.25f)
			.setRotationPoint(-20.25f, -5.875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 235, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.5f, -3.125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0.25f, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0)
			.setRotationPoint(-23.75f, -3.125f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 227, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0.25f)
			.setRotationPoint(-20.25f, -3.125f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.5f, -8.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 187, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0.25f, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0)
			.setRotationPoint(-23.75f, -8.625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 248, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0, -0.75f, 0.25f)
			.setRotationPoint(-20.25f, -8.625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 13, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21, 2.875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 227, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.25f, 2.875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 247, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-23.25f, 4.125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Ladder1.add(new ModelRendererTurbo(Ladder1, 12, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.25f, 3.875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(Ladder1);
	}

	private final void initGroup_CarBody(){
		TurboList CarBody = new TurboList("CarBody");
		CarBody.add(new ModelRendererTurbo(CarBody, 56, 50, textureX, textureY).addBox(0, 0, 0, 17, 2, 4)
			.setRotationPoint(-8.5f, 0.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 154, 81, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-16.5f, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 0, 25, textureX, textureY).addBox(0, 0, 0, 48, 1, 1)
			.setRotationPoint(-24, -11.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 0, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 47, 6, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-24, -10.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 56, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 4, 1, 0, 5, 0, -0.5f, 5, 0, -0.5f, 5, 0, -0.5f, 5, 0, -0.5f, 0, 0, 1.75f, 0, 0, 1.75f, 0, 0, 1.75f, 0, 0, 1.75f)
			.setRotationPoint(-8.5f, -3.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 114, 0, textureX, textureY).addBox(0, 0, 0, 56, 2, 2)
			.setRotationPoint(-28, 1.875f, -1).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 249, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-7, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 244, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-0.5f, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 239, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(6, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 234, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(15.5f, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 229, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(23, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 224, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-24, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 219, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-20.5f, -10.125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 214, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-24, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 209, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(19.5f, -10.125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 149, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-16.5f, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 144, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-7, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 139, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-0.5f, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 134, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(6, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 129, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(15.5f, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 124, 71, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(23, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 158, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 47, 5, 1, 0, -8, 0, 0, -7, 0, 0, -7, 0, 0, -8, 0, 0, -8, 0, 0, -7, 0, 0, -7, 0.5f, 0, -8, 0.5f, 0)
			.setRotationPoint(-24, -4.125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 119, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-7, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 114, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-7, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 47, 5, 1, 0, -8, 0, 0, -7, 0, 0, -7, 0, 0, -8, 0, 0, -8, 0, 0, -7, 0, 0, -7, 0.5f, 0, -8, 0.5f, 0)
			.setRotationPoint(-24, -4.125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 158, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 47, 6, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-24, -10.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 0, 22, textureX, textureY).addBox(0, 0, 0, 48, 1, 1)
			.setRotationPoint(-24, -11.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 109, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(6, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 101, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(12.5f, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 96, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-13.5f, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 91, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 86, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -10.125f, 10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 81, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(6, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 76, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-13.5f, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 204, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(12.5f, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 71, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 66, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 58, 69, textureX, textureY).addBox(0, 0, 0, 1, 11, 1)
			.setRotationPoint(23, -9.625f, -3.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 86, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(23, -11.125f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 53, 69, textureX, textureY).addBox(0, 0, 0, 1, 11, 1)
			.setRotationPoint(23, -9.625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 48, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f)
			.setRotationPoint(23, -9.625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 43, 69, textureX, textureY)
			.addShapeBox(0, 0, 8, 1, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f)
			.setRotationPoint(23, -9.625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 38, 69, textureX, textureY).addBox(0, 0, 0, 1, 11, 1)
			.setRotationPoint(-24, -9.625f, -3.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 181, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-24, -11.125f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 33, 69, textureX, textureY).addBox(0, 0, 0, 1, 11, 1)
			.setRotationPoint(-24, -9.625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 28, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f)
			.setRotationPoint(-24, -9.625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 23, 69, textureX, textureY)
			.addShapeBox(0, 0, 8, 1, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f)
			.setRotationPoint(-24, -9.625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 43, 69, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 11, 20, 0, -9.5f, 0.5f, 0, 9.5f, 0.5f, 0, 9.5f, 0.5f, 0, -9.5f, 0.5f, 0, 4, 0, 0, -4, 0, 0, -4, 0, 0, 4, 0, 0)
			.setRotationPoint(12.5f, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 11, 20, 0, 9.5f, 0.5f, 0, -9.5f, 0.5f, 0, -9.5f, 0.5f, 0, 9.5f, 0.5f, 0, -4, 0, 0, 4, 0, 0, 4, 0, 0, -4, 0, 0)
			.setRotationPoint(-13.5f, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 158, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 1.5f, 0, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(18.25f, -6.625f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 212, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 1.5f, 0, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(14.25f, -3.125f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 189, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(-15.25f, -3.125f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 135, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(-19.25f, -6.625f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 15, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(22.75f, -5.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 10, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(22.75f, -5.625f, 7.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 5, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(22.75f, -5.625f, -2).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 181, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(22.75f, -5.625f, 1).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 173, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-23.75f, -5.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 168, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-23.75f, -5.625f, -2).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 163, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-23.75f, -5.625f, 1).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 158, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-23.75f, -5.625f, 7.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 201, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(18.75f, -2.125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 196, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(18.75f, -2.125f, 7.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 191, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(18.75f, -2.125f, -2).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 186, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 5.5f, 0, 0, -5.5f, 0, 0, -5.5f, 0, 0, 5.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(18.75f, -2.125f, 1).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 0, 69, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(15.5f, -10.125f, -11).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 181, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-19.75f, -2.125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 249, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-19.75f, -2.125f, 7.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 244, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-19.75f, -2.125f, -2).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 18, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -5.5f, 0, 0, 5.5f, 0, 0, 5.5f, 0, 0, -5.5f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-19.75f, -2.125f, 1).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 79, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 23, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, 0.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 56, 43, textureX, textureY).addBox(0, 0, 0, 17, 2, 4)
			.setRotationPoint(-8.5f, 0.875f, 7.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 209, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 4, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-8.5f, 0.875f, -2).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 187, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-8.5f, 0.875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 187, 5, textureX, textureY)
			.addShapeBox(0, 0, -5.25f, 17, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-8.5f, 0.875f, 7.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 23, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, 0.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 187, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-7.25f, 2.875f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 235, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(6.25f, 2.875f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 187, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 1, 0, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-6.75f, 3.625f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 235, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.375f, -0.5f, -0.25f, 0, -1.875f, -0.25f, 0, -1.875f, -0.25f, -0.375f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0, 1.25f, -0.25f, 0, 1.25f, -0.25f, 0.5f, -0.5f, -0.25f)
			.setRotationPoint(-12, 2.375f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -1.875f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, 0, -1.875f, -0.25f, 0, 1.25f, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0, 1.25f, -0.25f)
			.setRotationPoint(7, 2.375f, -10).setRotationAngle(0, 0, 0)
		);
		CarBody.add(new ModelRendererTurbo(CarBody, 212, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-0.5f, -11.125f, -10).setRotationAngle(0, 0, 0)
		);
		groups.add(CarBody);
	}

	private final void initGroup_Tension(){
		TurboList Tension = new TurboList("Tension");
		Tension.add(new ModelRendererTurbo(Tension, 168, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-7.25f, 2.875f, 10).setRotationAngle(0, 0, 0)
		);
		Tension.add(new ModelRendererTurbo(Tension, 163, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(6.25f, 2.875f, 10).setRotationAngle(0, 0, 0)
		);
		Tension.add(new ModelRendererTurbo(Tension, 218, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 1, 0, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-6.75f, 3.625f, 10).setRotationAngle(0, 0, 0)
		);
		Tension.add(new ModelRendererTurbo(Tension, 235, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.375f, -0.5f, -0.25f, 0, -1.875f, -0.25f, 0, -1.875f, -0.25f, -0.375f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0, 1.25f, -0.25f, 0, 1.25f, -0.25f, 0.5f, -0.5f, -0.25f)
			.setRotationPoint(-12, 2.375f, 10).setRotationAngle(0, 0, 0)
		);
		Tension.add(new ModelRendererTurbo(Tension, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -1.875f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, 0, -1.875f, -0.25f, 0, 1.25f, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0, 1.25f, -0.25f)
			.setRotationPoint(7, 2.375f, 10).setRotationAngle(0, 0, 0)
		);
		groups.add(Tension);
	}

	private final void initGroup_BrakeWheel2(){
		TurboList BrakeWheel2 = new TurboList("BrakeWheel2");
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 164, 82, textureX, textureY).addCylinder(0, 0, 0, 1, 11, 8, 0.25f, 0.25f, 4, new Vec3f(0.0, 3.0, 0.0))
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, 1, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 235, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, -0.25f, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.5f)
			.setRotationPoint(-25.25f, -6.625f, 2.75f).setRotationAngle(0, 0, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 217, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-24.75f, -6.625f, 7).setRotationAngle(0, 0, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -2.25f, 0, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, -2.25f, 0, -0.25f, -2.25f, -0.75f, -0.25f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, -2.25f, -0.75f, -0.25f)
			.setRotationPoint(-27.25f, -6.625f, 7).setRotationAngle(0, 0, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 222, 54, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, -11, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 212, 54, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, 169, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 145, 52, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, -101, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 135, 52, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, 79, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 10, 50, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, -57, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 0, 50, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, 123, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 245, 47, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, -147, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 235, 47, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.5f).setLength(1).setSegments(16, 1).setScale(0.70703125f, 0.70703125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, 33, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 212, 61, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-24.5f, -12.875f, 7.5f).setRotationAngle(0, 1, 0)
		);
		BrakeWheel2.add(new ModelRendererTurbo(BrakeWheel2, 235, 57, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.625, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.5f, -12.9375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(BrakeWheel2);
	}

	private final void initGroup_Ladder2(){
		TurboList Ladder2 = new TurboList("Ladder2");
		Ladder2.add(new ModelRendererTurbo(Ladder2, 9, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(20, -1.375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 158, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(19.75f, -1.375f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 10, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(23.25f, -1.375f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(20, -6.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 5, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(19.75f, -6.875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(23.25f, -6.875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 244, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(20, -4.125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 150, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(19.75f, -4.125f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 145, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(23.25f, -4.125f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 235, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(20, -9.625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 140, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(19.75f, -9.625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 135, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(23.25f, -9.625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 95, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(22.5f, 2.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 95, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(20.25f, 2.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 99, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(20.25f, 4.125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Ladder2.add(new ModelRendererTurbo(Ladder2, 196, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(20.25f, 3.875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(Ladder2);
	}

	private final void initGroup_Loads(){
		TurboList Loads = new TurboList("Loads");
		Loads.add(new ModelRendererTurbo(Loads, 80, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 0, 19, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6875f, -4.3125f, -9.5f).setRotationAngle(0, 0, 0).setName("Load 2")
		);
		Loads.add(new ModelRendererTurbo(Loads, 139, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 0, 19, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.4375f, -1.625f, -9.5f).setRotationAngle(0, 0, 0).setName("Load 1")
		);
		Loads.add(new ModelRendererTurbo(Loads, 95, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 0, 19, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.4375f, -7.0625f, -9.5f).setRotationAngle(0, 0, 0).setName("Load 3")
		);
		Loads.add(new ModelRendererTurbo(Loads, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 0, 21, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.4375f, -11.0625f, -10.5f).setRotationAngle(0, 0, 0).setName("Load 4")
		);
		groups.add(Loads);
	}

	Model40TonWoodenHopperBogie bogie = new Model40TonWoodenHopperBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (TurboList l : groups) {
			for (ModelRendererTurbo t : l) {
				if (t.boxName != null && t.boxName.contains("Load")) {
					int cargo = ((Entity40TonWoodenHopper) entity).getAmmountOfCargo();
					float usage = (float)cargo / ((Entity40TonWoodenHopper) entity).cargoItems.length;
					if (t.boxName.contains("1") && usage != 0) {
						t.render(f5);
					}
					else if (t.boxName.contains("2") && usage > 0.25 && usage <= 0.5) {
						t.render(f5);
					}
					else if (t.boxName.contains("3") && usage > 0.5 && usage <= 0.75) {
						t.render(f5);
					}
					else if (t.boxName.contains("4") && usage > 0.75) {
						t.render(f5);
					}
				}
				else {
					t.render(f5);
				}
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/40_ton_hopper_bogie.png"));

		GL11.glPushMatrix();
		GL11.glTranslatef(0.8125f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.8125f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
