//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.passenger;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelPullmanPalaceBogie;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelHeavyweightColonistCar extends FVTMFormatBase {

	public ModelHeavyweightColonistCar(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		//
		initGroup_stripes();
		initGroup_walls();
		initGroup_group40();
		initGroup_group41();
		initGroup_group42();
		initGroup_clipboard();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_stripes(){
		TurboList stripes = new TurboList("stripes");
		stripes.add(new ModelRendererTurbo(stripes, 0, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 157, 2, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-78.8125f, -2.9375f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 506, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -2.9375f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 489, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(85.0625f, -2.9375f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 0, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 157, 2, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-78.8125f, -2.9375f, -11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 16, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -2.9375f, -11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(85.0625f, -2.9375f, -11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(stripes);
	}

	private final void initGroup_walls(){
		TurboList walls = new TurboList("walls");
		walls.add(new ModelRendererTurbo(walls, 0, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 157, 6, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-78.8125f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		walls.add(new ModelRendererTurbo(walls, 465, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		walls.add(new ModelRendererTurbo(walls, 74, 266, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(85.0625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		walls.add(new ModelRendererTurbo(walls, 0, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 157, 6, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-78.8125f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		walls.add(new ModelRendererTurbo(walls, 455, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		walls.add(new ModelRendererTurbo(walls, 330, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(85.0625f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(walls);
	}

	private final void initGroup_group40(){
		TurboList group4 = new TurboList("group4");
		group4.add(new ModelRendererTurbo(group4, 48, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-54.4375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 37, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-54.4375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 500, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-54.4375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 163, 246, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-50.4375f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 139, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-54.4375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 445, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-53.9375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 157, 246, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-53.9375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-54.75f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 207, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-44.9375f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 151, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-41.4375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 116, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-44.9375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 489, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-44.9375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 478, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-44.9375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 302, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-42.4375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(-44.9375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 131, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-41.625f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 382, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-41.3125f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 304, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-41.3125f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 293, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-41.3125f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 145, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-37.3125f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 93, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-41.3125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 114, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-40.8125f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 53, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-40.8125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 253, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(-31.8125f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 201, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.8125f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 179, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-31.8125f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 36, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-31.8125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 97, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29.3125f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 47, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-31.8125f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 24, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-28.3125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 161, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-28.5f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 168, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-28.1875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 157, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-28.1875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 114, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-28.1875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 188, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-27.6875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 18, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.1875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-28.1875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 12, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-27.6875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 103, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.6875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 92, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-18.6875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 11, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(-18.6875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 6, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-18.6875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 481, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-18.6875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16.1875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 375, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-15.1875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-15.375f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-15.0625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 467, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-15.0625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 456, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-15.0625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-11.0625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 298, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-15.0625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 238, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.5625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 424, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-14.5625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 424, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(-5.5625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 371, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.5625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-5.5625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 255, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-5.5625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 80, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.0625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.5625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 345, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-2.0625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-2.25f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 292, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.4375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 339, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(2.0625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-1.4375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-1.9375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 349, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-1.9375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 338, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-1.9375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 327, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-1.9375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 327, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(7.5625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 321, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.0625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 221, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(10.0625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 20, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(7.5625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 282, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(7.5625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 271, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(7.5625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 81, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(7.5625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 60, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(10.875f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 284, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(15.1875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 383, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(11.1875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 34, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(11.6875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 87, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.6875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(11.1875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 316, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(11.1875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 243, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(11.1875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 81, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(20.6875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 407, 242, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.1875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 410, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(20.6875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(20.6875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 191, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(20.6875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 147, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(20.6875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 17, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(23.1875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 270, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(24, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(24.3125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 136, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(24.3125f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 125, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(24.3125f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 70, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(24.3125f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 401, 242, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(28.3125f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 201, 242, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.8125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 151, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(24.8125f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(33.8125f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 48, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(33.8125f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 37, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(33.8125f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 120, 242, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(33.8125f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 250, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(33.8125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 253, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(36.3125f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 369, 240, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(37.3125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 255, 240, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(33.8125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 494, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(37.3125f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(36.3125f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 227, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(33.8125f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 499, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(33.8125f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 488, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(33.8125f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(33.8125f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 361, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(24, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 488, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(28.3125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 482, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.8125f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 15, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(24.3125f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 344, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(24.8125f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 446, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(24.3125f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(24.3125f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(24.3125f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 394, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(20.6875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 305, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(20.6875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 294, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(20.6875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 208, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(20.6875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 70, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(23.1875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 476, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(20.6875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 470, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(24.1875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(15.1875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.6875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 449, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(11.1875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 180, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(11.1875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 169, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(11.1875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 158, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(11.1875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 327, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(11.6875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 204, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(10.875f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 114, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(7.5625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 103, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(7.5625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 92, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(7.5625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 293, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(7.5625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(7.5625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 178, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(10.0625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 226, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.0625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 11, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-1.9375f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-1.9375f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-1.9375f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 424, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-1.9375f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 189, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(2.0625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-1.4375f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 139, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-1.4375f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 394, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-2.25f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 282, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-3.0625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 133, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-2.0625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(-5.5625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 362, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.5625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-5.5625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 127, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.5625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-5.5625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 67, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-11.0625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 238, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-14.5625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-15.0625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 283, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-15.0625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 272, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-15.0625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 81, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-15.0625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 161, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-14.5625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-15.375f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 389, 238, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-18.6875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 383, 238, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-15.1875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 494, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-16.1875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 173, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-18.6875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 70, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.6875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 159, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-18.6875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 108, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(-18.6875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 50, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-27.6875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 238, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.1875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 237, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-27.6875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 97, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-28.1875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 11, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-28.1875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-28.1875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 146, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-28.1875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 449, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-28.5f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 183, 237, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-31.8125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 41, 237, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-28.3125f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 432, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-29.3125f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(-31.8125f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 362, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.8125f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-31.8125f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 119, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-31.8125f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 35, 237, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-37.3125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 501, 236, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-40.8125f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 117, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-54.75f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-53.9375f, -2.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 100, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-41.625f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 272, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-58.5625f, -3.6875f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 261, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.5625f, -2.9375f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 39, 146, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.5)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-58.0625f, -2.6875f, -4.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 458, 125, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.5)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-63.9375f, -2.6875f, -4.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 86, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-41.3125f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-41.3125f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-41.3125f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 83, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-40.8125f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 449, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-41.3125f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 264, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-56.0625f, -3.1875f, -8.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 198, 264, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-56.0625f, -3.1875f, -7.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 193, 264, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-56.0625f, -3.1875f, -5.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 495, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.0625f, -3.9375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 186, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-57.5625f, -3.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 17, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-65.4375f, -2.9375f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-65.9375f, -3.6875f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-65.4375f, -3.4375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 188, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.875f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-64.4375f, -3.4375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 169, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.875f, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-64.4375f, -3.4375f, -6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-65.4375f, -3.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 5, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-66.0625f, -2.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.25f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.6875f, -0.375f, 0, -0.6875f)
			.setRotationPoint(-58.3125f, -2.9375f, 4.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 402, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.8125f, -4.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.3125f, -4.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 380, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.3125f, -1.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 314, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.5625f, -4.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.3125f, -2.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 165, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.5625f, -5.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 71, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-59.0625f, -5.4375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 323, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -14.4375f, -10.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 299, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.5625f, -15.9375f, -9.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 281, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, -1, -0.5f, 0.5f, -1, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 276, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.5625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 90, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(83.0625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 195, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(82.5625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0.5f, -1, -0.625f, 0.5f, -1, -0.625f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.1875f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.1875f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 290, 226, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.1875f, -16.3125f, -9.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 266, 263, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.1875f, -16.3125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 252, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.0625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 242, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(84.5625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(82.8125f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 237, 263, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.8125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 184, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.8125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 263, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 222, 263, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(85.6875f, -16.8125f, -9.375f).setRotationAngle(0, -90, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-83.1875f, -17.3125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, -0.125f, -0.625f, -0.5f, -0.125f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 213, 263, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(83.8125f, -17.3125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 504, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 247, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -16.3125f, -9.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 494, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.8125f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 183, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -16.3125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 164, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 159, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 154, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.6875f, -17.3125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 112, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -16.8125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 50, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.6875f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 144, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.6875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 327, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -16.8125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 107, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(-85.5625f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 98, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(-85.6875f, -16.8125f, -8.5f).setRotationAngle(0, 90, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 158, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-86.0625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 303, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-85.5625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 250, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -14.4375f, -10.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 196, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.9375f, -9.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 93, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-83.1875f, -17.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-83.1875f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-83.1875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 83, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-84.6875f, -17.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 78, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-85.5625f, -16.8125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-84.6875f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-84.6875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-85.5625f, -16.8125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 73, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(-85.5625f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 34, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(-84.6875f, -16.8125f, 8.5f).setRotationAngle(0, -90, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 179, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-86.0625f, -16.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-86.0625f, -16.3125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 450, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f)
			.setRotationPoint(-86.0625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-83.1875f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 504, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-84.8125f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 433, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-85.5625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 239, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-87.0625f, -14.4375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 170, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f)
			.setRotationPoint(-86.5625f, -15.9375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.5f, 0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-87.0625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 416, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86.5625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0.5f, 0.5f, -0.625f, 0.5f, 0.5f, -0.625f, 0.5f, -1, 0, 0.5f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-83.1875f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-83.1875f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 314, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-86.0625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 464, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0.5f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-85.5625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 262, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f)
			.setRotationPoint(83.8125f, -17.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 399, 262, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f)
			.setRotationPoint(84.6875f, -16.8125f, 7.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 494, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(82.6875f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 60, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f)
			.setRotationPoint(82.6875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 260, 179, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(84.6875f, -16.8125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 262, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(84.6875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 262, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(84.6875f, -16.8125f, 9.375f).setRotationAngle(0, 90, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f)
			.setRotationPoint(82.8125f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 300, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(84.5625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 290, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(85.0625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 149, 226, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f)
			.setRotationPoint(85.1875f, -16.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 271, 262, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(85.1875f, -16.3125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 215, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f)
			.setRotationPoint(83.0625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 188, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(82.5625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 261, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -1, 0, 0.5f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(86.0625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 227, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(85.5625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 198, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f)
			.setRotationPoint(86.0625f, -14.4375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 51, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f)
			.setRotationPoint(85.5625f, -15.9375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 148, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(37.3125f, -15.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 27, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(37.3125f, -15.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 18, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(37.3125f, -16.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 137, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(37.3125f, -14.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 126, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-54.5625f, -15.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 9, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-54.5625f, -15.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-54.5625f, -16.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-54.5625f, -14.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 48, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(77.1875f, -15.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 429, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(77.1875f, -15.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 86, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(77.1875f, -16.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 37, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(77.1875f, -14.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(64, -14.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 260, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f)
			.setRotationPoint(64, -15.8125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 31, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 1.125f)
			.setRotationPoint(64, -16.8125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 495, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-77.6875f, -15.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-77.6875f, -15.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 305, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.6875f, -16.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 484, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-77.6875f, -14.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 60, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-66.25f, -14.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 348, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f)
			.setRotationPoint(-66.25f, -15.8125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 434, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 1.125f)
			.setRotationPoint(-66.25f, -16.8125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 442, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-41.4375f, -15.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-41.4375f, -15.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 45, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-41.4375f, -16.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 391, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-41.4375f, -14.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 312, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-15.1875f, -15.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 36, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-15.1875f, -15.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 500, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-15.1875f, -16.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 301, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-15.1875f, -14.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 187, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-2.0625f, -15.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 491, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-2.0625f, -15.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 482, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-2.0625f, -16.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 176, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-2.0625f, -14.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 424, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(77.1875f, -15.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 473, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(77.1875f, -15.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(77.1875f, -16.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 290, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(77.1875f, -14.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.6875f, -15.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 299, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.6875f, -15.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 290, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.6875f, -16.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 207, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-77.6875f, -14.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-66.25f, -14.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 62, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, 0.5f)
			.setRotationPoint(-66.25f, -15.8125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 450, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 1.125f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f)
			.setRotationPoint(-66.25f, -16.8125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 151, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(64, -14.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 273, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, 0.5f)
			.setRotationPoint(64, -15.8125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 1.125f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f)
			.setRotationPoint(64, -16.8125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 343, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 79, 1, 4, 0, 0, -0.5f, 0.375f, -0.25f, -0.5f, 0.375f, -0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.4375f, -13.9375f, -10.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 345, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 79, 1, 4, 0, 0, -0.5f, 0.375f, -0.25f, -0.5f, 0.375f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-41.4375f, -13.4375f, -10.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 4, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0.125f, -0.1875f, 0, 0.125f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f)
			.setRotationPoint(-14.75f, -13.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 330, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 4, 0, 0, -0.5f, 0.375f, 0.25f, -0.5f, 0.375f, 0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.375f, 0.25f, 0, 0.375f, 0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(37.9375f, -13.4375f, -10.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 448, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 4, 0, 0, -0.5f, 0.375f, 0.25f, -0.5f, 0.375f, 0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.375f, 0.25f, 0, 0.375f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(37.9375f, -13.9375f, -10.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 208, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(63.375f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 149, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(50.25f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 9, 200, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(50.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 410, 198, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(50.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 205, 198, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(37.75f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 141, 198, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(37.75f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 400, 142, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(50.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 463, 141, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(37.75f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 178, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(50.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 260, 176, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(37.75f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 310, 173, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(50.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 411, 172, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(37.75f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 141, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(50.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 261, 141, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(37.75f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 144, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-15.375f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 141, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-27.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 87, 141, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-27.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 197, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-27.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 171, 194, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-27.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 401, 171, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-27.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 50, 171, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-27.875f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 29, 141, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-41, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 372, 140, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-41, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 493, 192, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-41, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 371, 187, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-41, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 310, 170, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-41, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 90, 170, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-41, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 139, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-28.5f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 130, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-41.625f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 401, 139, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-14.75f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 188, 185, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-14.75f, -16.6875f, -5.875f).setRotationAngle(60, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 176, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-14.75f, -16.6875f, -5.875f).setRotationAngle(60, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 290, 139, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-14.75f, -16.6875f, -5.875f).setRotationAngle(60, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 9, 169, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-14.75f, -16.6875f, -5.875f).setRotationAngle(60, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 401, 168, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-14.75f, -16.6875f, -5.875f).setRotationAngle(60, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 479, 138, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(24.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 261, 138, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(11.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 138, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-1.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 68, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(24, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(10.875f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 54, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-2.25f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 432, 170, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(24.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 411, 169, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(11.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 151, 168, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-1.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 166, 168, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(24.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 166, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(11.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 166, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-1.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 203, 138, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(24.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 432, 167, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(24.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 72, 161, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(24.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 174, 138, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(11.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 394, 165, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(11.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 62, 161, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(11.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 145, 138, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-1.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 303, 164, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-1.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 52, 161, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-1.625f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 411, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(37.125f, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 310, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(37.125f, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 434, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 13, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f)
			.setRotationPoint(37.125f, -16.9375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 461, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f)
			.setRotationPoint(37.125f, -19.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 148, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(37.375f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 50, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(37.375f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 249, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(37.375f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 178, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(37.125f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 250, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(37.375f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 220, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(37.375f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 90, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(37.375f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 226, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(37.375f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 49, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(37.375f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 44, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(37.375f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 303, 236, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(46.9375f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 107, 233, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(50.4375f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 101, 233, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(41.4375f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 95, 233, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(37.9375f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 464, 232, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(46.9375f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 458, 232, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(50.4375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 452, 232, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(41.4375f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 418, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(37.9375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 363, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.0625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 357, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(63.5625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 297, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(54.5625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 291, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(51.0625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 249, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.0625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 195, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(63.5625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 177, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(54.5625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 171, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(51.0625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 401, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(37.9375f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 50, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(37.9375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(51.0625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(51.0625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 184, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(50.25f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 141, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(50.25f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 124, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(49.4375f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 107, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(62.5625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 90, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(49.4375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(62.5625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 389, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(46.9375f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(37.4375f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 331, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(46.9375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(37.4375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(60.0625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 393, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(50.5625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 381, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(60.0625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 487, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(50.5625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 169, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(46.9375f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 158, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(46.9375f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 119, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(60.0625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 108, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(60.0625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 97, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(37.4375f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 11, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(37.4375f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(50.5625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(50.5625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 283, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(37.4375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 272, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(37.4375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 261, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(50.5625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 86, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(50.5625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(46.9375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 406, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(46.9375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 250, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(60.0625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(60.0625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 148, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(37.4375f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(50.5625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 48, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(37.4375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 37, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(50.5625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 498, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(46.9375f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 487, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(60.0625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 446, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(46.9375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.125f, -0.5f, -0.75f)
			.setRotationPoint(60.0625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 167, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(63.375f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 494, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(63.375f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 92, 1, 4, 0, 0, -0.5f, 0.25f, -0.125f, -0.5f, 0.25f, -0.125f, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-54.5625f, -13.9375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 391, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 4, 0, 0, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(37.9375f, -13.9375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 92, 1, 4, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-54.5625f, -13.4375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 330, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 4, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(37.9375f, -13.4375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 161, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(37.75f, -16.6875f, 5.875f).setRotationAngle(-40, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 160, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(37.75f, -16.6875f, 5.875f).setRotationAngle(-40, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 324, 162, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(37.75f, -16.6875f, 5.875f).setRotationAngle(-40, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 324, 159, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(37.75f, -16.6875f, 5.875f).setRotationAngle(-40, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 116, 138, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(37.75f, -16.6875f, 5.875f).setRotationAngle(-40, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 87, 138, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(37.75f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 4.625f, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(37.75f, -13.9375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(50.4375f, -15.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(group4);
	}

	private final void initGroup_group41(){
		TurboList group4 = new TurboList("group4");
		group4.add(new ModelRendererTurbo(group4, 199, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(50.4375f, -15.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 179, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(50.4375f, -16.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 239, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(50.4375f, -14.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 58, 138, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(50.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 29, 138, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(50.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 374, 157, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(50.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 449, 153, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(50.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 155, 160, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(50.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 271, 159, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(50.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 20, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-54.75f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 138, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(24.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 137, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(24.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 153, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(24.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 152, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(24.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 36, 159, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(24.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 399, 158, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(24.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 344, 136, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(11.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 136, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(11.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 173, 152, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(11.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 146, 152, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(11.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 314, 158, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(11.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 72, 158, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(11.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 133, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-1.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 469, 85, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 119, 152, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 152, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 157, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 155, 157, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-1.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 467, 128, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-14.75f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 364, 85, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.75f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 476, 149, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.75f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 389, 130, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.75f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 325, 150, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.75f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 283, 150, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-14.75f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 418, 127, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-27.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 335, 85, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 130, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 331, 130, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 50, 150, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 15, 150, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-27.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 467, 123, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-41, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 79, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-41, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 447, 122, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-41, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 115, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-41, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 465, 148, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-41, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 449, 148, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-41, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 418, 122, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-54.125f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 76, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-54.125f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 115, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-54.125f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 393, 115, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-54.125f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 148, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-54.125f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 293, 148, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-54.125f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 15, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(24, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 10, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(10.875f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 5, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-2.25f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 500, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-15.375f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 495, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-28.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 485, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-41.625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 475, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(63.375f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 445, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(50.25f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 62, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.0625f, -18.4375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.553f, -0.625f, 0, -1.553f, -0.625f, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1.553f, -0.375f, 0, -1.553f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(85.5625f, -17.3125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 52, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1.125f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.0625f, -18.4375f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 394, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.553f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.553f, -0.625f, -0.625f, -1.553f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.553f, -0.375f, -0.625f)
			.setRotationPoint(-87.5625f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-79.0625f, -19.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(79.0625f, -19.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(82.5625f, -19.1875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-83.0625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 271, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.75f, -0.625f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f)
			.setRotationPoint(-84.5625f, -19.1875f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 394, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -15.1875f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 385, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -16.6875f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 376, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.125f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -16.5625f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f)
			.setRotationPoint(-86.6875f, -17.0625f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 361, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -15.1875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 203, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 188, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0.875f, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(85.5625f, -16.5625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 216, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.5f, 1.125f, -0.375f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.6875f, -17.0625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 12, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(62.1875f, -17.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 434, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.25f, 0, 0, -0.75f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.75f, 0)
			.setRotationPoint(61.1875f, -17.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 278, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.5f, 0, 0, -1, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(60.1875f, -17.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 73, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.75f, 0, 0, -1.25f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -1.25f, 0)
			.setRotationPoint(59.1875f, -17.9375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 363, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.5f, 0, 0, -1, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(58.1875f, -18.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 212, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.25f, 0, 0, -0.75f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.75f, 0)
			.setRotationPoint(57.1875f, -19.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 185, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0.25f, 0, 0.5f, -0.75f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0.5f, -0.75f, 0)
			.setRotationPoint(56.1875f, -19.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 393, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 12, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(51.6875f, -19.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 379, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 12, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-77.0625f, -17.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 158, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-62.0625f, -17.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 131, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-61.0625f, -17.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 104, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(-60.0625f, -17.9375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 46, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-59.0625f, -18.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58.0625f, -19.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-57.0625f, -19.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 12, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-55.5625f, -19.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-77.875f, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 293, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-77.875f, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 13, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f)
			.setRotationPoint(-77.875f, -16.9375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 336, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f)
			.setRotationPoint(-77.875f, -19.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-77.875f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-77.625f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 28, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.625f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 170, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-77.625f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 21, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.625f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 161, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(-77.625f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 174, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-77.625f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 29, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-77.625f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-77.625f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 109, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-77.625f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 36, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.0625f, -18.4375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.553f, -0.625f, 0, -1.553f, -0.625f, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1.553f, -0.375f, 0, -1.553f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(85.5625f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 399, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1.125f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.0625f, -18.4375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 189, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.553f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.553f, -0.625f, -0.625f, -1.553f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.553f, -0.375f, -0.625f)
			.setRotationPoint(-87.5625f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-79.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 362, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(79.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 410, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(82.5625f, -19.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-83.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 227, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.75f, -0.625f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f)
			.setRotationPoint(-84.5625f, -19.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -15.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 490, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.125f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -16.5625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 173, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f)
			.setRotationPoint(-86.6875f, -17.0625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 470, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -15.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 465, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 440, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0.875f, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(85.5625f, -16.5625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 352, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.5f, 1.125f, -0.375f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.6875f, -17.0625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 402, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 13, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f)
			.setRotationPoint(77, -16.9375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 419, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f)
			.setRotationPoint(77, -19.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 281, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(77, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 243, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(77, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 226, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(77, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 14, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(77.25f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 152, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(77.25f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 7, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(77.25f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 325, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(77.25f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 423, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(77.25f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 371, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(77.25f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 283, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(77.25f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 113, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(77.25f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 45, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(77.25f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 462, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 19, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(70.8125f, -16.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 336, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 19, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.375f, -0.25f, -0.5f, 0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(70.8125f, -16.6875f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 320, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(64.8125f, -16.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 253, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(64.8125f, -16.6875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(64.8125f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(69.0625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 161, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(66.5625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 104, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(66.0625f, -10.5625f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 350, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(64.8125f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 343, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(69.0625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(66.5625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 95, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(66.0625f, -10.5625f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 82, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(64.8125f, -0.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 218, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(64.8125f, -0.6875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 411, 260, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(1).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(76.6875f, -2.1875f, -5.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 350, 260, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(2).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.75, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(76.6875f, -1.6875f, -5.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 345, 260, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(1).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(76.6875f, -2.1875f, 5.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 340, 260, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(2).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.75, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(76.6875f, -1.6875f, 5.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 335, 260, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(3).setSegments(8, 16).setScale(1.25f, 1.375f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(75.4375f, -0.9375f, -9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 123, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.625f).setLength(1).setSegments(8, 6).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(75.4375f, -1.0625f, -9).setRotationAngle(0, 225, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 330, 260, textureX, textureY).addCylinder(1, 0, 0, 1, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(76.5625f, -1.1875f, -9).setRotationAngle(0, 180, -100)
		);
		group4.add(new ModelRendererTurbo(group4, 325, 260, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(3).setSegments(8, 16).setScale(1.25f, 1.375f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(75.4375f, -0.9375f, 9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 76, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.625f).setLength(1).setSegments(8, 6).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(75.4375f, -1.0625f, 9).setRotationAngle(0, 225, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 320, 260, textureX, textureY).addCylinder(1, 0, 0, 1, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(76.5625f, -1.1875f, 9).setRotationAngle(0, 180, -100)
		);
		group4.add(new ModelRendererTurbo(group4, 50, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f)
			.setRotationPoint(76.1875f, -2.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 15, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f)
			.setRotationPoint(76.1875f, -2.4375f, -5.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f)
			.setRotationPoint(76.1875f, -2.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 310, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f)
			.setRotationPoint(75.5625f, -2.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 27, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.625f, 0, 0, -0.375f, 0, 0, 0.25f, -0.75f, 0, 0, -1, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -1, -0.75f, 0)
			.setRotationPoint(74.8125f, -2.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 286, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, 0.375f, 0.25f, 0)
			.setRotationPoint(76.1875f, -3.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 281, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, 0.375f, 0.25f, 0)
			.setRotationPoint(76.1875f, -3.6875f, -5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 465, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.625f, -0.75f, 0, 0.375f, -0.75f, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.625f, -0.75f, 0.25f, 0.375f)
			.setRotationPoint(74.8125f, -3.6875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 267, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f)
			.setRotationPoint(76.1875f, -3.4375f, -7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 236, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f)
			.setRotationPoint(76.1875f, -3.4375f, -5).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 18, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(75.8125f, -3.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 231, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f)
			.setRotationPoint(76.1875f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 223, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f)
			.setRotationPoint(76.0625f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 213, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f)
			.setRotationPoint(76.0625f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 135, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f)
			.setRotationPoint(76.1875f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 126, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f)
			.setRotationPoint(76.0625f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f)
			.setRotationPoint(76.0625f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 83, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f)
			.setRotationPoint(76.1875f, -4.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 78, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, 0.1875f, -0.4375f, 0, 0.0625f, -0.4375f, 0, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.75f, -1.0625f, -0.4375f, 0, -0.9375f, -0.4375f)
			.setRotationPoint(76.8125f, -4.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 64, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, 0.1875f, -0.4375f, 0, -0.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f)
			.setRotationPoint(76.5625f, -4.3125f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 506, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f)
			.setRotationPoint(76.1875f, -4.6875f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 450, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, 0.1875f, -0.4375f, 0, 0.0625f, -0.4375f, 0, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.75f, -1.0625f, -0.4375f, 0, -0.9375f, -0.4375f)
			.setRotationPoint(76.8125f, -4.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, 0.1875f, -0.4375f, 0, -0.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f)
			.setRotationPoint(76.5625f, -4.3125f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 406, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f)
			.setRotationPoint(76.1875f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 401, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f)
			.setRotationPoint(76.0625f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 390, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f)
			.setRotationPoint(76.0625f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 381, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f)
			.setRotationPoint(76.1875f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 262, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f)
			.setRotationPoint(76.0625f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 184, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f)
			.setRotationPoint(76.0625f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 449, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f)
			.setRotationPoint(76.1875f, -2.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 9, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.625f, 0, 0, -0.375f, 0, 0, 0.25f, -0.75f, 0, 0, -1, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -1, -0.75f, 0)
			.setRotationPoint(74.8125f, -2.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f)
			.setRotationPoint(76.1875f, -2.4375f, 5.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 140, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f)
			.setRotationPoint(76.1875f, -2.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f)
			.setRotationPoint(75.5625f, -2.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 501, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f)
			.setRotationPoint(76.1875f, -3.4375f, 3.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 207, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f)
			.setRotationPoint(76.1875f, -3.4375f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(75.8125f, -3.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 296, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, 0.375f, 0.25f, 0)
			.setRotationPoint(76.1875f, -3.6875f, 3.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 202, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, 0.375f, 0.25f, 0)
			.setRotationPoint(76.1875f, -3.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 293, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.625f, -0.75f, 0, 0.375f, -0.75f, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.625f, -0.75f, 0.25f, 0.375f)
			.setRotationPoint(74.8125f, -3.6875f, 4.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 16, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(64, -13.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(64, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -15.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 346, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0)
			.setRotationPoint(83.5625f, -17.8125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 344, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(85.6875f, -16.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -1.125f, 0, 0)
			.setRotationPoint(85.0625f, -17.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.0625f, -18.3125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 1, 13, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-79.0625f, -20.1875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-82.5625f, -19.6875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.0625f, -18.9375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -17.8125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 458, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(78.5625f, -19.6875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0)
			.setRotationPoint(82.0625f, -18.9375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 464, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, -18.3125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -15.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 406, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-86.6875f, -16.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0.625f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0.625f, 0, 0)
			.setRotationPoint(-86.0625f, -17.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 185, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-77.0625f, -2.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 227, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-77.0625f, -2.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.25f, 0.375f, -0.75f, -0.25f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-77.0625f, -2.4375f, -5.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 176, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-76.4375f, -2.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 155, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-77.0625f, -3.4375f, -7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 24, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-77.0625f, -3.4375f, -5).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 429, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -1, -0.75f, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-76.6875f, -3.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 15, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.0625f, -3.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 6, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.0625f, -3.6875f, -5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 86, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.375f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-75.6875f, -2.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 394, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0.375f, 0, 0, 0.625f, 0, 0.25f, 0.25f, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.375f, 0, 0.25f, 0.625f)
			.setRotationPoint(-75.6875f, -3.6875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 42, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 506, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.9375f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 497, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.9375f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 488, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 479, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.9375f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 296, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.9375f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 256, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 226, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, 0, -0.9375f, -0.4375f, 0, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.6875f, -4.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 205, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.4375f, -4.3125f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 295, 259, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(3).setSegments(8, 16).setScale(1.25f, 1.375f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.5625f, -0.9375f, 9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 414, 71, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.625f).setLength(1).setSegments(8, 6).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.5625f, -1.0625f, 9).setRotationAngle(0, 45, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 276, 259, textureX, textureY).addCylinder(1, 0, 0, 1, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-76.6875f, -1.1875f, 9).setRotationAngle(0, 0, -100)
		);
		group4.add(new ModelRendererTurbo(group4, 247, 259, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(3).setSegments(8, 16).setScale(1.25f, 1.375f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.5625f, -0.9375f, -9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.625f).setLength(1).setSegments(8, 6).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.5625f, -1.0625f, -9).setRotationAngle(0, 45, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 242, 259, textureX, textureY).addCylinder(1, 0, 0, 1, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-76.6875f, -1.1875f, -9).setRotationAngle(0, 0, -100)
		);
		group4.add(new ModelRendererTurbo(group4, 198, 259, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(1).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-76.5625f, -2.1875f, 5.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 121, 259, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(2).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(-0.75, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-76.5625f, -1.6875f, 5.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 103, 259, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(1).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-76.5625f, -2.1875f, -5.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 39, 259, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(2).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(-0.75, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-76.5625f, -1.6875f, -5.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-77.0625f, -2.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 216, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.25f, 0.375f, -0.75f, -0.25f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-77.0625f, -2.4375f, 5.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 185, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-77.0625f, -2.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 176, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-76.4375f, -2.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 167, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-77.0625f, -3.4375f, 3.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 158, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-77.0625f, -3.4375f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 44, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -1, -0.75f, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-76.6875f, -3.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 327, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.375f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-75.6875f, -2.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0.375f, 0, 0, 0.625f, 0, 0.25f, 0.25f, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.375f, 0, 0.25f, 0.625f)
			.setRotationPoint(-75.6875f, -3.6875f, 4.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 119, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.0625f, -3.6875f, 3.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.0625f, -3.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 24, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 15, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 6, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.9375f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.9375f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 170, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.9375f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 119, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.9375f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 283, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4.6875f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, 0, -0.9375f, -0.4375f, 0, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.6875f, -4.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 297, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.4375f, -4.3125f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 219, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 19, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-77.0625f, -16.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 24, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 19, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-77.0625f, -16.6875f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 421, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-72.0625f, -16.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-72.0625f, -16.6875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 76, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-70.3125f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 410, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-70.3125f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 336, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-72.0625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 329, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-67.8125f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 322, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-72.0625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 284, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-67.8125f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 464, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-70.8125f, -10.5625f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 455, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-70.8125f, -10.5625f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 497, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-72.0625f, -0.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 426, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-72.0625f, -0.6875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 460, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-66.25f, -13.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 367, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-66.25f, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 277, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(88.5625f, -11.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 270, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(88.5625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 153, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -12.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 50, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.5625f, -12.6875f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 313, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -13.9375f, -4.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 189, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -14.4375f, -1.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(86.8125f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 260, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(84.5625f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 448, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, 1.5625f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 263, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(87.0625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 219, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(87.0625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 429, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(87.0625f, -11.9375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 281, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, 1.5625f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 212, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.8125f, -11.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 242, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.8125f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 164, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.5625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 157, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.5625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 38, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-88.5625f, -11.9375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 397, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -12.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 323, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.8125f, -12.6875f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 410, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -13.9375f, -4.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 173, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -14.4375f, -1.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.8125f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 409, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 460, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 2.5625f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 457, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 2.3125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 455, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 2.5625f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 15, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 2.3125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 162, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-84.9375f, 2.5625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 146, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-79.1875f, 2.5625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 305, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 2.5625f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 178, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 2.3125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 218, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 2.5625f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 156, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 2.3125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 135, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.6875f, 2.5625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 119, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(84.4375f, 2.5625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 77, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-84.9375f, 2.5625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-79.1875f, 2.5625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 193, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(-84.9375f, 2.5625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 9, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 2.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 179, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(-79.1875f, 2.5625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 2.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(78.6875f, 2.5625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 389, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(84.4375f, 2.5625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 169, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(78.6875f, 2.5625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 2.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 116, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(84.4375f, 2.5625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 238, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 2.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-84.9375f, 4.8125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 331, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-79.1875f, 4.8125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(78.6875f, 4.8125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(84.4375f, 4.8125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 393, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.9375f, 4.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 423, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-79.1875f, 4.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 397, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(78.6875f, 4.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 381, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.4375f, 4.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 457, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 6.0625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 498, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 2.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 6.0625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 457, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 4.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 2.9375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 498, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 6.0625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 457, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 2.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 6.0625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 498, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 4.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 2.9375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 1.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 364, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0)
			.setRotationPoint(-46.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 379, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -3.75f, 0)
			.setRotationPoint(-45.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 459, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 1.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 368, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 5.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 368, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 5.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 4, 9, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 111, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 287, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 2.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 98, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 302, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 34, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 344, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 2.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 430, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 327, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -3.75f, 0, 0, -3.75f, 0, 0, 0.25f, 0)
			.setRotationPoint(29.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 424, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 1.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 389, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 1.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(45.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.875f, 2.5625f, 5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 465, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.625f, 2.5625f, 5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 308, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-22.875f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 297, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-14.875f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 376, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(22.625f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 161, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-23.125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 188, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-19.125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 201, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-15.125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-11.125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(22.375f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 506, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(25.375f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 420, 220, textureX, textureY).addCylinder(0, 0, 0, 2, 6, 8, 1, 1, 3, null)
			.setRotationPoint(-36.625f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 369, 220, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-36.875f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 220, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-37.125f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 166, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-31.375f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 405, 121, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-31.125f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 418, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.125f, 2.5625f, 9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.875f, 2.5625f, 9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 357, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.125f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 300, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.875f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 1, 21, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.5625f, 2.0625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 113, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 16, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.8125f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 425, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.8125f, 1.5625f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(78.8125f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 81, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(83.0625f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 376, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(80.5625f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 476, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(78.8125f, -0.6875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(80.0625f, -5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 111, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(80.0625f, -6.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 109, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(80.0625f, -11.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 257, 257, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(80.5625f, -10.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 252, 257, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(82.875f, -10.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(69.1875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 342, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(76.4375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(62.5625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 324, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(49.4375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 281, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(36.3125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 272, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(23.1875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 263, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(10.0625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 211, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-3.0625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 77, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-16.1875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 411, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-29.3125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 402, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-42.4375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 430, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-71.4375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 6, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-78.8125f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.8125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 170, 2, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 74, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 16, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 411, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.8125f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-80.5625f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 409, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-83.0625f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-84.8125f, -0.6875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, 1.5625f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 467, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-83.5625f, -5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 106, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -6.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 409, 106, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -11.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 93, 257, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-80.75f, -10.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 73, 257, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-83.0625f, -10.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 397, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(56.3125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(43.1875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 235, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(30.0625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 228, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.9375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 188, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(3.8125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 141, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-9.3125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-22.4375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 127, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.5625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 67, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-48.6875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.125f, -0.375f, -0.8125f, -0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(71.5625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 189, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(64.9375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 178, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.3125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 119, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.0625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 108, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(45.1875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 97, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(38.9375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 11, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(32.0625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(25.8125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(12.6875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 286, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(5.8125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 275, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.4375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 264, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.5625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 86, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.6875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.8125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 406, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.6875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 204, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.9375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 148, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.6875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(75.25f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 491, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(75.25f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 486, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(68.625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 481, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(68.625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 476, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(62, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(62, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 445, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(55.75f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(55.75f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 396, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(48.875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48.875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 271, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(42.625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(42.625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 227, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(35.75f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 188, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(35.75f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 174, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(29.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 136, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(29.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 131, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(22.625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 126, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(22.625f, -8.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 68, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(16.375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(16.375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(9.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(9.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 440, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(3.25f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 391, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(3.25f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 386, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-3.625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 381, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-3.625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 310, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-9.875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 295, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-9.875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 290, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-16.75f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 279, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-16.75f, -9.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 266, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-23, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 242, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-23, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 237, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-29.875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 222, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-29.875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 213, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-36.125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 102, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-36.125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 63, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-43, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 461, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-43, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-49.25f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 305, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-49.25f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 247, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-72, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 195, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-72, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(group4);
	}

	private final void initGroup_group42(){
		TurboList group4 = new TurboList("group4");
		group4.add(new ModelRendererTurbo(group4, 183, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(71.5625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 169, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(71.5625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 107, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(64.9375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 97, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(64.9375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 40, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(58.3125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 35, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.3125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 30, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(52.0625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 500, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.0625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 456, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(45.1875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 430, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(45.1875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 362, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(38.9375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 300, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(38.9375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 261, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(32.0625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 178, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(32.0625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 112, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(25.8125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 447, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(25.8125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 418, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(18.9375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(18.9375f, -8.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 357, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(12.6875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 270, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(12.6875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 73, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(5.8125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(5.8125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 275, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-0.4375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 243, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.4375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 218, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-7.3125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 213, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 507, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-13.5625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 265, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.5625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 238, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-20.4375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 108, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.4375f, -9.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 103, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-26.6875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 98, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.6875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 93, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-33.5625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 30, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 462, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-39.8125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 457, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.8125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 452, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-46.6875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 447, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.6875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 430, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-52.9375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 418, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.9375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 362, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-75.6875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 357, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.6875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, -0.125f, 0.3125f, -0.8125f, -0.125f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(71.5625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(64.9375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 48, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(58.3125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 37, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(52.0625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(45.1875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(38.9375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 193, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(32.0625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(25.8125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 268, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(18.9375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(12.6875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 86, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(5.8125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-0.4375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 406, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-7.3125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 205, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-13.5625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 148, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-20.4375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-26.6875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-33.5625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 258, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-39.8125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 312, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-46.6875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 258, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-52.9375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 171, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-75.6875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, -0.125f, -0.1875f, -0.8125f, -0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(71.5625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 124, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(64.9375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 107, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(58.3125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 500, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(52.0625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 312, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.1875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 124, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(38.9375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 107, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(32.0625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(25.8125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 90, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(12.6875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 54, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(5.8125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 231, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-0.4375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 27, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.5625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 476, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.6875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 263, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.5625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 248, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.8125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 231, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.6875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 27, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.9375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 354, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.6875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, -0.125f, -0.1875f, -0.8125f, -0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(71.5625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(64.9375f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 263, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(58.3125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 214, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(52.0625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 144, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.1875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 371, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(38.9375f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 354, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(32.0625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 171, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(25.8125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 277, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(12.6875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(5.8125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-0.4375f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 214, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 442, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.5625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 171, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.6875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 127, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.5625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 110, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.8125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 93, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.6875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 43, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.9375f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.6875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 442, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(18.9375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 127, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(18.9375f, -7.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 110, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(18.9375f, -9.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 93, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-20.4375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 60, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-20.4375f, -8.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.4375f, -10.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 270, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 71, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 205, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-87.0625f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-87.0625f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 120, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-87.0625f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 358, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(-87.0625f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 295, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-87.0625f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 290, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-87.0625f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-87.0625f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-87.0625f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 170, 2, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 241, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-29.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 232, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(49.4375f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 190, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(36.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 143, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(23.1875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(10.0625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 125, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-3.0625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 68, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-16.1875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 8, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(62.5625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 8, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-60.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-42.4375f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 495, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 8, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-71.4375f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 60, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 16, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.8125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 445, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(56.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 390, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(43.1875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 383, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.9375f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 308, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(3.8125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-9.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 43, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-22.4375f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 36, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-48.6875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 501, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.5625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 504, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(30.0625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 446, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(75.6875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 494, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(78.8125f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 487, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(83.0625f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 396, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(80.5625f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(78.8125f, -0.6875f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 421, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(80.0625f, -5.5625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 55, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(80.0625f, -6.625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 52, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(80.0625f, -11.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 248, 248, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(80.5625f, -10.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 195, 248, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(82.875f, -10.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 381, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.8125f, 1.5625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 6, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-78.8125f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 393, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.8125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 369, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, 1.5625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.8125f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 473, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-80.5625f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-83.0625f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-84.8125f, -0.6875f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-83.5625f, -5.5625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 19, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -6.625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 16, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -11.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 174, 248, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-83.0625f, -10.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 169, 248, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-80.75f, -10.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 376, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 16, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(58.3125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 177, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(52.0625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(45.1875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 117, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(38.9375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 100, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(32.0625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 60, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(25.8125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 43, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(18.9375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 26, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(12.6875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 487, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(5.8125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-0.4375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 236, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-7.3125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 289, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-13.5625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-20.4375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 177, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-26.6875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(71.4375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 117, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-64.5625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 100, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-52.9375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 9, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-46.6875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 26, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-33.5625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 487, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-39.8125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 236, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-75.6875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 470, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(58.3125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(52.0625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 82, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.1875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 218, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(38.9375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(32.0625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 470, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(18.9375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 180, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(12.6875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 132, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(5.8125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 109, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-0.4375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.5625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 294, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-20.4375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 248, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.6875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 180, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(71.4375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 132, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.9375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 109, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.6875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 16, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.5625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 248, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.8125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 293, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.8125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(58.3125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(52.0625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 363, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.1875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 335, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(38.9375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 266, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(32.0625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 243, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(18.9375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(12.6875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 104, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(5.8125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 335, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-0.4375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 266, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.5625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 243, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-20.4375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.6875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 104, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(71.4375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 15, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.9375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.6875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.5625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 113, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(58.3125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 73, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.3125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(52.0625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 276, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.0625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 271, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(45.1875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 213, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(45.1875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 59, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(38.9375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 266, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(38.9375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 261, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(32.0625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 54, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(32.0625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 243, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(18.9375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(18.9375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 218, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(12.6875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(12.6875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 507, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(5.8125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(5.8125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 238, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-0.4375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 330, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.4375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 30, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-13.5625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 246, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.5625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 447, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-20.4375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 144, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.4375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 430, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-26.6875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 133, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.6875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(71.4375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 66, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(71.4375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 507, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-64.5625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 55, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-64.5625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 447, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-52.9375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 44, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.9375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 507, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-46.6875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 491, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.6875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 303, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-33.5625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 308, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 183, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-39.8125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.8125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 457, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-75.6875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 183, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.6875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-64.5625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 375, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.6875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 346, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-64.5625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.6875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 506, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(62, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(62, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 214, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(55.75f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 37, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(55.75f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 296, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(48.875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48.875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(42.625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(42.625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 445, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(35.75f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(35.75f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 97, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(29.5f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 187, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(29.5f, -10.3125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 54, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(22.625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 146, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(22.625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 455, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(16.375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 141, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(16.375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 329, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(9.5f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(9.5f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 388, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(3.25f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 248, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(3.25f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 198, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-3.625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-3.625f, -9.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-9.875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 302, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-9.875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 221, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-16.75f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-16.75f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 151, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-23, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 70, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-23, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 388, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(75.125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 203, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(75.125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60.875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 461, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-60.875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 339, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-49.25f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 281, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-49.25f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 233, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-43, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 507, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-43, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 165, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-29.875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 31, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-29.875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 442, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-36.125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 434, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-36.125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 450, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-72, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 323, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-72, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.3125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.0625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 437, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(45.1875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 408, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(38.9375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 317, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(32.0625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(25.8125f, -10.9375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 364, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(18.9375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(12.6875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(5.8125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.4375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 364, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.5625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.4375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.6875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 378, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(71.4375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 364, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-64.5625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.9375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.6875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 498, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 498, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.8125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.6875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(25.8125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 374, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(25.8125f, -10.3125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-7.3125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 465, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -9.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 379, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(25.8125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 379, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(25.8125f, -8.6875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -8.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -10.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 336, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 207, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 414, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 369, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.5625f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 502, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(86.5625f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 256, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.5625f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(86.5625f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 10, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(86.5625f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 161, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(86.5625f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 387, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(86.5625f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		groups.add(group4);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -13.4375f, -11.02f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -13.4375f, 11.02f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 1, 0, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.8125f, 1.5625f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, 1.5625f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.0625f, -11.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.8125f, -11.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -12.1875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.8125f, 1.5625f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.5625f, -11.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.8125f, -11.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.8125f, -12.1875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 1, 0, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.8125f, 1.5625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, 1.5625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.0625f, -11.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.8125f, -11.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -12.1875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.8125f, 1.5625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.5625f, -11.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.8125f, -11.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.8125f, -12.1875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.8125f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(80.5625f, -3.6875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(80.5625f, -0.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 266, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.8125f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(80.5625f, -3.6875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 268, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(80.5625f, -0.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-85.0625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-80.8125f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-83.5625f, -3.6875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-83.5625f, -0.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-85.0625f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-80.8125f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-83.5625f, -3.6875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-83.5625f, -0.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	ModelPullmanPalaceBogie bogie = new ModelPullmanPalaceBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/pullman_palace_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(3.875f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(-3.875f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

}
