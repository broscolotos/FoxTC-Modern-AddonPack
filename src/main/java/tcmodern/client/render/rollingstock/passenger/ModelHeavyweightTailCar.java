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
public class ModelHeavyweightTailCar extends FVTMFormatBase {

	public ModelHeavyweightTailCar(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		//
		initGroup_Rails();
		initGroup_new_group0_();
		initGroup_group40();
		initGroup_group41();
		initGroup_stripe();
		initGroup_clipboard();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_Rails(){
		TurboList Rails = new TurboList("Rails");
		Rails.add(new ModelRendererTurbo(Rails, 314, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(84.5625f, -6.1875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 472, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0.1875f, -0.625f, -0.625f)
			.setRotationPoint(79.5f, -7.6875f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 309, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(84.8125f, -4.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 237, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(84.5625f, -4.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 225, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -6.1875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 217, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -4.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 171, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -4.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 471, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(80.8125f, -4.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 162, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(80.5625f, -4.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 460, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(82.5625f, -4.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 157, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(83.3125f, -4.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 444, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(80.5625f, -2.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 433, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(82.5625f, -2.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 130, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(84.8125f, -0.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 59, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(84.5625f, -0.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 38, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -0.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 25, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -0.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 417, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(80.8125f, -0.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 20, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(80.5625f, -0.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 406, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(82.5625f, -0.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 499, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(83.3125f, -0.8125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 484, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0.125f, 0, -0.3125f, 0.125f, 0, -0.3125f, 0.125f, -0.625f, 0.0625f, 0.125f, -0.625f, 0.0625f, 0.125f, 0, -0.3125f, 0.125f, 0, -0.3125f, 0.125f, -0.625f, 0.0625f, 0.125f, -0.625f)
			.setRotationPoint(82.125f, -3.1875f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 472, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0.1875f, -0.625f, -0.625f)
			.setRotationPoint(79.5f, 0.4375f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 390, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(80.5625f, -6.1875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 464, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.625f, 0, 0.125f, -0.625f)
			.setRotationPoint(82.8125f, -3.1875f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 451, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, -0.75f, -0.125f, -0.625f, -0.75f, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, -0.75f, -0.125f, -0.625f)
			.setRotationPoint(81.0625f, -3.1875f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 431, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(84.3125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 414, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(82.3125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 400, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(80.3125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 382, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.125f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.77f, 0, -0.125f, -0.77f, 3.5f, -0.375f, 0, -4.25f, -0.125f, 0, -4.25f, -0.125f, -0.77f, 3.5f, -0.375f, -0.77f)
			.setRotationPoint(84.0625f, -4.6875f, 10.51f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 377, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, -0.77f, -0.75f, -0.375f, -0.77f, -4.25f, -0.125f, 0, 3.5f, -0.375f, 0, 3.5f, -0.375f, -0.77f, -4.25f, -0.125f, -0.77f)
			.setRotationPoint(79.8125f, -4.6875f, 10.51f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 367, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(82.8125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 359, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(82.8125f, -6.6875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 304, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(82.9375f, -6.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 289, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(82.6875f, -6.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 256, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(83.8125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 145, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(83.8125f, -6.6875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 102, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(83.9375f, -6.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 82, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(83.6875f, -6.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 64, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(83.3125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 54, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(80.8125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 43, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(80.8125f, -6.6875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 15, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(80.9375f, -6.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 494, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(80.6875f, -6.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 489, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(81.8125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 479, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(81.8125f, -6.6875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 469, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(81.9375f, -6.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 446, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(81.6875f, -6.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 354, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(81.3125f, -7.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 327, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -7.9375f, 3.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 322, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 299, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -7.9375f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 278, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -7.9375f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 269, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -7.9375f, -3.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 247, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -7.9375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 242, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -13.9375f, 3.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 212, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -13.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 200, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -13.9375f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 179, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -13.9375f, -3.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 54, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.625f, -0.625f, 0.25f)
			.setRotationPoint(84.875f, -7.6875f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 167, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, -0.25f, 0, 0.125f, -0.25f)
			.setRotationPoint(85.5f, -3.1875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 140, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -6.1875f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 135, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -6.1875f, 8.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 117, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -4.8125f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 112, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(85.5625f, -4.8125f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 287, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.625f, -0.625f, 0.25f)
			.setRotationPoint(84.875f, 0.4375f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 92, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -0.8125f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 71, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(85.5625f, -0.8125f, 4.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 487, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85.5625f, -4.8125f, 5.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 34, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -4.8125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 0, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -4.8125f, 9.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 504, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(85.5625f, -4.8125f, 8.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 471, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85.5625f, -4.8125f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 474, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -4.8125f, 8.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 460, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -6.1875f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 444, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -6.1875f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 433, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85.5625f, -0.8125f, 5.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 460, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -0.8125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 455, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -0.8125f, 9.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 441, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(85.5625f, -0.8125f, 8.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 417, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85.5625f, -0.8125f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 436, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -0.8125f, 8.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 420, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(85.5625f, -2.8125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 410, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(85.5625f, -2.8125f, 7.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 405, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(85.53119f, -7.6875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 396, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(85.53119f, -6.1875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 373, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(85.53119f, -2.6875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 363, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(85.53119f, 0.5f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 185, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.625f, -0.625f, 0, 0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.625f, -0.625f, -0.625f, 0.625f)
			.setRotationPoint(84.875f, -7.6875f, -3.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 389, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.625f, -0.625f, 0, 0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.625f, -0.625f, -0.625f, 0.625f)
			.setRotationPoint(84.875f, 0.4375f, -3.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 503, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.375f, 0, -0.625f, -0.375f)
			.setRotationPoint(85.5f, -6.375f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 366, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.375f, 0, -0.625f, -0.375f)
			.setRotationPoint(85.5f, -0.875f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 497, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.625f, -0.625f, 0.25f)
			.setRotationPoint(84.875f, -7.6875f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 341, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, -0.25f, 0, 0.125f, -0.25f)
			.setRotationPoint(85.5f, -3.1875f, -7.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 317, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(85.53119f, -7.6875f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 312, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -6.1875f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 252, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -6.1875f, -4.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 237, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -4.8125f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 226, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(85.5625f, -4.8125f, -9.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 496, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.625f, -0.625f, 0.25f)
			.setRotationPoint(84.875f, 0.4375f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 174, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -0.8125f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 162, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(85.5625f, -0.8125f, -9.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 406, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85.5625f, -4.8125f, -8.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 157, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -4.8125f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 130, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -4.8125f, -4.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 60, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(85.5625f, -4.8125f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 390, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85.5625f, -4.8125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 39, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -4.8125f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 504, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -6.1875f, -8.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 505, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -6.1875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 365, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85.5625f, -0.8125f, -8.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 23, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -0.8125f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 499, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(85.5625f, -0.8125f, -4.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 485, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(85.5625f, -0.8125f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 504, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85.5625f, -0.8125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 450, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(85.5625f, -0.8125f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 431, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(85.5625f, -2.8125f, -8.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 415, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(85.5625f, -2.8125f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 383, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(85.53119f, -6.1875f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 378, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(85.53119f, -2.6875f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 368, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(85.53119f, 0.5f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 307, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.75f, -0.625f, 0.125f, -0.75f, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, -0.75f, -0.625f, 0.125f, -0.75f, -0.625f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(85.5f, -3.1875f, -7.1875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 259, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(85.5f, -3.1875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 207, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, 4.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 189, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.125f, -3.75f, -0.77f, -0.125f, -3.75f, -0.77f, -0.375f, 3, 0, -0.375f, 3, 0, -0.375f, -0.25f, -0.77f, -0.375f, -0.25f, -0.77f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(85.57251f, -4.6875f, 4.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 152, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 125, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, 8.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 67, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, 5.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 44, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, 7.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 426, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.375f, 3, -0.77f, -0.375f, 3, -0.77f, -0.125f, -3.75f, 0, -0.125f, -3.75f, 0, -0.125f, -0.5f, -0.77f, -0.125f, -0.5f, -0.77f, -0.375f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(85.57251f, -4.6875f, 7.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 391, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, -0.625f, 0, 0.125f, -0.625f)
			.setRotationPoint(85.5f, -6, 0.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 349, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, -0.625f, 0, 0.125f, -0.625f)
			.setRotationPoint(85.5f, -6, -0.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 336, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(85.5f, -7.3125f, -2.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 294, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(85.5f, -7.3125f, -1.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 284, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(85.5f, -7.3125f, 2.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 264, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(85.5f, -7.3125f, 1.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 232, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 221, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.125f, -3.75f, -0.77f, -0.125f, -3.75f, -0.77f, -0.375f, 3, 0, -0.375f, 3, 0, -0.375f, -0.25f, -0.77f, -0.375f, -0.25f, -0.77f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(85.57251f, -4.6875f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 195, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 184, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, -4.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 140, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 26, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(85.5625f, -7.3125f, -5.9375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 107, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.375f, 3, -0.77f, -0.375f, 3, -0.77f, -0.125f, -3.75f, 0, -0.125f, -3.75f, 0, -0.125f, -0.5f, -0.77f, -0.125f, -0.5f, -0.77f, -0.375f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(85.57251f, -4.6875f, -5.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 365, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(85.875f, -4.125f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 494, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(82.5625f, -6.1875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 6, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(84.5625f, -6.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 472, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0.1875f, -0.625f, -0.625f)
			.setRotationPoint(79.5f, -7.6875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 484, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(84.8125f, -4.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 464, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(84.5625f, -4.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 455, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -6.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 446, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -4.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 437, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -4.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 504, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(80.8125f, -4.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 428, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(80.5625f, -4.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 494, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(82.5625f, -4.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 349, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(83.3125f, -4.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 468, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(80.5625f, -2.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 468, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(82.5625f, -2.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 233, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(84.8125f, -0.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 190, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(84.5625f, -0.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 160, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -0.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 151, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(79.3125f, -0.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 504, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(80.8125f, -0.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 142, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(80.5625f, -0.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 490, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(82.5625f, -0.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 133, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(83.3125f, -0.8125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 124, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0.125f, 0, -0.3125f, 0.125f, 0, -0.3125f, 0.125f, -0.625f, 0.0625f, 0.125f, -0.625f, 0.0625f, 0.125f, 0, -0.3125f, 0.125f, 0, -0.3125f, 0.125f, -0.625f, 0.0625f, 0.125f, -0.625f)
			.setRotationPoint(82.125f, -3.1875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 504, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(82.5625f, -6.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0.1875f, -0.625f, -0.625f)
			.setRotationPoint(79.5f, 0.4375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 490, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(80.5625f, -6.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 67, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, -0.75f, -0.125f, -0.625f, -0.75f, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, -0.75f, -0.125f, -0.625f)
			.setRotationPoint(81.0625f, -3.1875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 176, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.625f, 0, 0.125f, -0.625f)
			.setRotationPoint(82.8125f, -3.1875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 97, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(84.3125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 87, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(82.3125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 77, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(80.3125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 49, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.125f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.77f, 0, -0.125f, -0.77f, 3.5f, -0.375f, 0, -4.25f, -0.125f, 0, -4.25f, -0.125f, -0.77f, 3.5f, -0.375f, -0.77f)
			.setRotationPoint(84.0625f, -4.6875f, -10.74f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 29, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, -0.77f, -0.75f, -0.375f, -0.77f, -4.25f, -0.125f, 0, 3.5f, -0.375f, 0, 3.5f, -0.375f, -0.77f, -4.25f, -0.125f, -0.77f)
			.setRotationPoint(79.8125f, -4.6875f, -10.74f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 463, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(82.8125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 478, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(82.8125f, -6.6875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 380, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(82.9375f, -6.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 230, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(82.6875f, -6.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 188, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(83.8125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 348, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(83.8125f, -6.6875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 454, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(83.9375f, -6.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 114, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(83.6875f, -6.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 105, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(83.3125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 177, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(80.8125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 238, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(80.8125f, -6.6875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 229, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(80.9375f, -6.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 372, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(80.6875f, -6.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 296, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(81.8125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 398, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(81.8125f, -6.6875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 194, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(81.9375f, -6.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 184, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(81.6875f, -6.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 170, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(81.3125f, -7.3125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 10, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -13.9375f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 5, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(85.5f, -13.9375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 507, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.75f, -0.625f, 0.125f, -0.75f, -0.625f, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, -0.75f, -0.625f, 0.125f, -0.75f, -0.625f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(85.5f, -3.1875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Rails.add(new ModelRendererTurbo(Rails, 15, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(85.5f, -3.1875f, 6.1875f).setRotationAngle(0, 0, 0)
		);
		groups.add(Rails);
	}

	private final void initGroup_new_group0_(){
		TurboList new_group0_ = new TurboList("new_group0_");
		new_group0_.add(new ModelRendererTurbo(new_group0_, 454, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-64.0625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 365, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-75.1875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 465, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-64.0625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 359, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-64.0625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 331, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-75.1875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 321, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.1875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 348, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-64.0625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 437, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.1875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 133, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-64.0625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 493, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.1875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 289, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60.375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 279, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-60.375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 274, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-71.5f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 248, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-71.5f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 420, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-64.0625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 256, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.1875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 331, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-52.4375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 167, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-46.1875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 150, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-39.3125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 133, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.4375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 20, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.1875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 403, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.3125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 386, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.3125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 246, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.4375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 184, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.1875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 216, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-52.4375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 179, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.4375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 147, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-46.1875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 112, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.1875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 102, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-39.3125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 92, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.3125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 82, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-48.75f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 72, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-48.75f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 55, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-42.5f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 35, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-42.5f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 18, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-35.625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 504, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-35.625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 116, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.4375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 99, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.1875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 37, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.3125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 229, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-26.1875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 331, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-33.0625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 167, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.1875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 386, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.0625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 304, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.1875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 116, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.0625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 480, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-26.1875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 475, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.1875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 470, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-33.0625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 455, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.0625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 445, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-22.5f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 435, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-22.5f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 401, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-29.375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 364, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-29.375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 99, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.1875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 54, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.0625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 37, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(0.0625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 321, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-6.8125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 304, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-13.0625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 287, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-19.9375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 260, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(0.0625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 243, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.0625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 473, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-19.9375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 260, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(0.0625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 243, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.0625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 473, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-19.9375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 354, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(0.0625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 344, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(0.0625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 326, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-13.0625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 316, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.0625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 269, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-19.9375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 227, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-19.9375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 170, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(3.75f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 165, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(3.75f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 135, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-3.125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 40, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-3.125f, -9.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 0, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-9.375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 499, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-9.375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 460, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-16.25f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 450, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-16.25f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 386, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(0.0625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 157, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.0625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 140, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-19.9375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 440, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-6.8125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 430, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-6.8125f, -9.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 123, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-6.8125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 106, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-6.8125f, -8.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 44, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-6.8125f, -10.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 27, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(45.6875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 403, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(39.4375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 369, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(32.5625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 352, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(26.3125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 209, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(19.4375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 192, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(13.1875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 174, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(6.3125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 466, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.6875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 386, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(39.4375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 157, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(32.5625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 140, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(19.4375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 123, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(13.1875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 106, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(6.3125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 44, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.6875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 27, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(39.4375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 449, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(32.5625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 369, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(19.4375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 352, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(13.1875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 88, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(6.3125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 421, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(45.6875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 416, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(45.6875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 396, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(39.4375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 387, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(39.4375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 374, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(32.5625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 369, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(32.5625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 311, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(19.4375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 260, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(19.4375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 255, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(13.1875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 236, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(13.1875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 211, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(6.3125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 191, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(6.3125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 160, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(49.375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 155, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(49.375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 130, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(43.125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 45, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(43.125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 24, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(36.25f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 349, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(36.25f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 125, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(30, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 14, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(30, -10.3125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 295, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(23.125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 290, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(23.125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 285, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(16.875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 280, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(16.875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 222, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(10, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 217, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(10, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 432, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(45.6875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 301, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(39.4375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 284, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(32.5625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 267, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(26.3125f, -10.9375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 250, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(19.4375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 10, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(13.1875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 140, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(6.3125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 175, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(26.3125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 113, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(26.3125f, -10.3125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 117, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(26.3125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 55, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(26.3125f, -8.6875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 32, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(58.8125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 342, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(52.5625f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 301, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(71.9375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 284, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(58.8125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 267, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(52.5625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 250, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(71.9375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 163, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(58.8125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 363, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(52.5625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 140, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(71.9375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 108, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(58.8125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 103, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.8125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 98, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(52.5625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 93, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.5625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 88, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(71.9375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 83, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(71.9375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 78, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(62.5f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 73, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(62.5f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 68, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(56.25f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 56, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(56.25f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 51, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(75.625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 36, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(75.625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 117, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.8125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 55, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.5625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 32, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(71.9375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.125f, -0.375f, -0.8125f, -0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(72.0625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 363, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(65.4375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 416, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.8125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 324, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.5625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 301, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(45.6875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 278, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(39.4375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 255, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(32.5625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 232, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(26.3125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 186, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(13.1875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 147, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(6.3125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 124, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(0.0625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 31, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(75.75f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 471, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(75.75f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 466, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(69.125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 365, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(69.125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 360, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(62.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 355, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(62.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 332, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(56.25f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 327, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(56.25f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 322, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(49.375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 317, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(49.375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 275, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(43.125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 270, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(43.125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 265, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(36.25f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 232, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(36.25f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 19, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(30, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 0, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(30, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 504, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(23.125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 499, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(23.125f, -8.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 477, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(16.875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 461, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(16.875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 456, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(10, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 451, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(10, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 446, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(3.75f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 441, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(3.75f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 436, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(72.0625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 431, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(72.0625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 426, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(65.4375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 421, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(65.4375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 402, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(58.8125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 397, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.8125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 392, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(52.5625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 387, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.5625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 344, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(45.6875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 312, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(45.6875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 307, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(39.4375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 260, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(39.4375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 227, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(32.5625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 212, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(32.5625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 207, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(26.3125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 155, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(26.3125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 134, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(19.4375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 46, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(19.4375f, -8.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 41, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(13.1875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 26, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(13.1875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 416, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(6.3125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 350, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(6.3125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 255, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(0.0625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 68, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(0.0625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, -0.125f, 0.3125f, -0.8125f, -0.125f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(72.0625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 55, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(65.4375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 32, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(58.8125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 439, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(52.5625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 416, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(45.6875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 347, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(39.4375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 324, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(32.5625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 301, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(26.3125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 278, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(19.4375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 255, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(13.1875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 232, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(6.3125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 186, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(0.0625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, -0.125f, -0.1875f, -0.8125f, -0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(72.0625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 377, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(65.4375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 147, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(58.8125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 124, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(52.5625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 104, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.6875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 78, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(39.4375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 55, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(32.5625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 32, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(26.3125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 216, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(13.1875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 400, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(6.3125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 377, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(0.0625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, -0.125f, -0.1875f, -0.8125f, -0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(72.0625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 220, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(65.4375f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 481, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(58.8125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 220, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(52.5625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 481, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.6875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 481, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(39.4375f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 481, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(32.5625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 498, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(26.3125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 482, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(13.1875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 471, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(6.3125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 455, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(0.0625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 444, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(19.4375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 428, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(19.4375f, -7.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 417, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(19.4375f, -9.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 315, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-6.8125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 498, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.0625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 345, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.1875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 331, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.0625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 315, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.3125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 498, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.1875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 345, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.4375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 331, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.1875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 14, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-3.125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 27, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-3.125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 464, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-9.375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 416, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-9.375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 148, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-16.25f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 14, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-16.25f, -9.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 68, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-22.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 485, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-22.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 27, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-29.375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 369, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-29.375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 464, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-35.625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 273, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-35.625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 250, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-42.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 265, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-42.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 144, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-48.75f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 298, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-48.75f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 507, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-71.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 32, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-71.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 488, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-6.8125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 169, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-6.8125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 263, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-13.0625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 54, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.0625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 478, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-19.9375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 287, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-19.9375f, -9.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 422, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-26.1875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 478, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.1875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 103, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-33.0625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 506, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.0625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 497, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-39.3125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 496, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.3125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 499, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-46.1875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 491, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.1875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 483, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-52.4375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 481, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.4375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 433, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-75.1875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 490, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.1875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 315, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-6.8125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 498, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-13.0625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 345, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-19.9375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 331, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-26.1875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 315, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-33.0625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 499, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-39.3125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 483, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-46.1875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 467, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-52.4375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 389, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-75.1875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 499, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-6.8125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 483, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.0625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 467, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.1875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 451, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.0625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 389, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.3125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 405, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.1875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 349, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.4375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 333, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.1875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 451, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-6.8125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 435, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.0625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 349, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.1875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 477, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.0625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 477, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.3125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 477, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.1875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 477, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.4375f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 500, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.1875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 500, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-19.9375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 375, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-19.9375f, -8.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 418, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-19.9375f, -10.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(new_group0_);
	}

	private final void initGroup_group40(){
		TurboList group4 = new TurboList("group4");
		group4.add(new ModelRendererTurbo(group4, 21, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-53.9375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-53.9375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 480, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-53.9375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 458, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-53.9375f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 447, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-53.9375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 444, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-49.9375f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-53.9375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 372, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-53.4375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 424, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-53.4375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-54.25f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 402, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-44.4375f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 397, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-40.9375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 147, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-44.4375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 436, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-44.4375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 425, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-44.4375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 375, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-44.4375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 344, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-44.4375f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 37, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-41.9375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 308, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-44.4375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 270, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-41.125f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 230, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-40.8125f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 198, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-40.8125f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 187, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-40.8125f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 155, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-40.8125f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 392, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-36.8125f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 124, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-40.8125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 212, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-40.3125f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 382, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-40.3125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 144, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-40.8125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 133, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-31.3125f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 63, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.3125f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 491, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-31.3125f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 414, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-31.3125f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 403, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.3125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 101, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-31.3125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 493, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-28.8125f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-31.3125f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-27.8125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 461, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-28, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 392, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-27.6875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 297, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-27.6875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 286, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-27.6875f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 244, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-27.6875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-27.1875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 303, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-23.6875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 62, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-27.6875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 293, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-27.1875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 219, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-27.6875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 176, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.1875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 107, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-18.1875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 96, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-18.1875f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 85, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-18.1875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 219, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-18.1875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 39, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-18.1875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 338, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-15.6875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 139, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-14.6875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 74, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.1875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 304, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-14.875f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 52, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-14.5625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 32, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-14.5625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 11, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-14.5625f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 470, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-14.5625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-10.5625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 16, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-14.5625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.0625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 114, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-14.0625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 365, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-14.5625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 354, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-5.0625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 334, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.0625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 275, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-5.0625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 264, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-5.0625f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.0625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 186, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-5.0625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 444, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2.5625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 109, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-5.0625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 95, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-1.5625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 246, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-1.75f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 202, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-0.9375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 85, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(2.5625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 80, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-0.9375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 455, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-1.4375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 501, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-1.4375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 481, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-1.4375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 459, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-1.4375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 448, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-1.4375f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 437, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-1.4375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 75, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(8.0625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 63, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(11.5625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(10.5625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 370, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(8.0625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 426, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(8.0625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 382, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(8.0625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(8.0625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 234, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(8.0625f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 209, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(8.0625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 427, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(11.375f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 58, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(15.6875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(11.6875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 78, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12.1875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 53, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(12.1875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 198, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(11.6875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 187, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(11.6875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 166, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(11.6875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 155, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(11.6875f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 144, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(11.6875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 28, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(21.1875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 10, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(24.6875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(21.1875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 133, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(21.1875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 64, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(21.1875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 42, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(21.1875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 22, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(21.1875f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 415, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(21.1875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 140, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(23.6875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 123, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(24.5f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(24.8125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(24.8125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 393, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(24.8125f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 344, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(24.8125f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 298, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(24.8125f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 287, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(24.8125f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 5, 249, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(28.8125f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(25.3125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 10, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(25.3125f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 254, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(34.3125f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 223, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(34.3125f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 105, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(34.3125f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 94, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(34.3125f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(34.3125f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 423, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(34.3125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 410, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(36.8125f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 461, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(37.8125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 83, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(34.3125f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(34.3125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 409, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(37.8125f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 174, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(36.8125f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 400, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(34.3125f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 53, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(34.3125f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 491, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(34.3125f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(34.3125f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 372, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(34.3125f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 361, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(34.3125f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 321, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(24.5f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 387, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(28.8125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 364, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(25.3125f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 331, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(24.8125f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 260, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(25.3125f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 276, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(24.8125f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 265, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(24.8125f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 177, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(24.8125f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 32, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(24.8125f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(24.8125f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 308, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(21.1875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 460, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(21.1875f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 449, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(21.1875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(21.1875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 427, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(21.1875f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 383, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(21.1875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 236, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(23.6875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 329, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(21.1875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 324, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(24.6875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(15.6875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 298, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(12.1875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 285, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(11.6875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 334, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(11.6875f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 244, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(11.6875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 233, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(11.6875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 213, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(11.6875f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 202, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(11.6875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 192, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(12.1875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 157, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(11.375f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 191, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(8.0625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 166, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(8.0625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 155, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(8.0625f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 144, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(8.0625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 133, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(8.0625f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 262, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(8.0625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 277, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(8.0625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 393, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(10.5625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 272, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(11.5625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 73, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-1.4375f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 43, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-1.4375f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 481, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-1.4375f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 239, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(-1.4375f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 416, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-1.4375f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 405, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-1.4375f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 267, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(2.5625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 376, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-0.9375f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 246, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-0.9375f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 106, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-1.75f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 89, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-2.5625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 241, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-1.5625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 394, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-5.0625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 351, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.0625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 288, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-5.0625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 255, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-5.0625f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 106, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.0625f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 224, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-5.0625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 216, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-5.0625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 209, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-10.5625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 199, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-14.0625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 170, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(-14.5625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 95, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-14.5625f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 84, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-14.5625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 62, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-14.5625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-14.5625f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-14.5625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 44, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-14.0625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 27, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-14.875f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-18.1875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 180, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-14.6875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 219, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-15.6875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 486, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-18.1875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 452, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.1875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-18.1875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 430, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-18.1875f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-18.1875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 245, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.1875f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 473, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-27.1875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 175, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-23.6875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-27.1875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 234, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-27.6875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 203, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-27.6875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 192, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-27.6875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 164, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-27.6875f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 154, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(-27.6875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 133, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-27.6875f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-28, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 434, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-31.3125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 429, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-27.8125f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 311, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-28.8125f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 74, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-31.3125f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 52, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.3125f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 419, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-31.3125f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 408, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-31.3125f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 131, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-31.3125f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 397, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.3125f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 414, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-36.8125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 359, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-40.3125f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 294, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-54.25f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 468, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-53.4375f, -2.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 277, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-41.125f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 352, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-58.0625f, -3.6875f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 308, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.0625f, -2.9375f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 314, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.5)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-57.5625f, -2.6875f, -4.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 262, 247, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.5)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-63.4375f, -2.6875f, -4.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 297, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-40.8125f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 108, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-40.8125f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 97, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-40.8125f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 108, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(-40.8125f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 86, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-40.8125f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 209, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-40.3125f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 63, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-40.8125f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 236, 247, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-55.5625f, -3.1875f, -8.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 231, 247, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-55.5625f, -3.1875f, -7.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 204, 247, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-55.5625f, -3.1875f, -5.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 478, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.5625f, -3.9375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 490, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-57.0625f, -3.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 148, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-64.9375f, -2.9375f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-65.4375f, -3.6875f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 244, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-64.9375f, -3.4375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 170, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.875f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-63.9375f, -3.4375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 165, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.875f, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-63.9375f, -3.4375f, -6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 22, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-64.9375f, -3.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 85, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 5, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-65.5625f, -2.9375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 129, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.25f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.6875f, -0.375f, 0, -0.6875f)
			.setRotationPoint(-57.8125f, -2.9375f, 4.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 11, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.3125f, -4.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 121, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.8125f, -4.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 104, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.8125f, -1.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 90, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.0625f, -4.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 70, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.8125f, -2.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 418, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.0625f, -5.9375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 149, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58.5625f, -5.4375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 492, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(84.9375f, -14.4375f, -10.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 379, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(84.4375f, -15.9375f, -9.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 38, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, -1, -0.5f, 0.5f, -1, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(84.9375f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(84.4375f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 118, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(81.9375f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(81.4375f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, 0.5f, -1, -0.25f, 0.5f, -1, -0.25f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-82.6875f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, -0.125f, -1, -0.25f, -0.125f, -1, -0.25f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-82.6875f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 199, 213, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(84.0625f, -16.3125f, -9.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 23, 247, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(84.0625f, -16.3125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 18, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(83.9375f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(83.4375f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 238, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(81.6875f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-82.6875f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 246, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(83.5625f, -16.8125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 461, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(81.5625f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 338, 183, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(83.5625f, -16.8125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 396, 246, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(83.5625f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 382, 246, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(84.5625f, -16.8125f, -9.375f).setRotationAngle(0, -90, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 164, 1, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-82.6875f, -17.3125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-82.6875f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-82.6875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 246, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -17.3125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 314, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(81.5625f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-82.6875f, -17.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-82.6875f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-82.6875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 304, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-84.1875f, -17.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 293, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-85.0625f, -16.8125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-84.1875f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-84.1875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 98, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-85.0625f, -16.8125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 219, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(-85.0625f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 95, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(-84.1875f, -16.8125f, 8.5f).setRotationAngle(0, -90, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 20, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-85.5625f, -16.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 85, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-85.5625f, -16.3125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 80, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f)
			.setRotationPoint(-85.5625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-82.6875f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 444, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-84.3125f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 75, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-85.0625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-86.5625f, -14.4375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f)
			.setRotationPoint(-86.0625f, -15.9375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.5f, 0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86.5625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 53, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86.0625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f, -0.25f, 0.5f, -1, 0, 0.5f, -1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-82.6875f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, -0.125f, 0.5f, -0.25f, -0.125f, 0.5f, -0.25f, -0.125f, -1, 0, -0.125f, -1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-82.6875f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 299, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-85.5625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 214, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0.5f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-85.0625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 28, 246, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f)
			.setRotationPoint(82.6875f, -17.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 13, 246, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f)
			.setRotationPoint(83.5625f, -16.8125f, 7.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 229, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(81.5625f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 338, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f)
			.setRotationPoint(81.5625f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 314, 179, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(83.5625f, -16.8125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 5, 246, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(83.5625f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 245, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(83.5625f, -16.8125f, 9.375f).setRotationAngle(0, 90, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 493, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f)
			.setRotationPoint(81.6875f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 391, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(83.4375f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 226, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(83.9375f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 478, 211, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f)
			.setRotationPoint(84.0625f, -16.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 125, 245, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(84.0625f, -16.3125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f)
			.setRotationPoint(81.9375f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 158, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(81.4375f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 100, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -1, 0, 0.5f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(84.9375f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 66, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(84.4375f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 362, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f)
			.setRotationPoint(84.9375f, -14.4375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 458, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f)
			.setRotationPoint(84.4375f, -15.9375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 277, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(77.1875f, -15.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 449, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(77.1875f, -15.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 440, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(77.1875f, -16.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 266, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(77.1875f, -14.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 223, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-77.1875f, -15.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 431, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-77.1875f, -15.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.1875f, -16.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 181, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-77.1875f, -14.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 403, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-65.75f, -14.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 267, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f)
			.setRotationPoint(-65.75f, -15.8125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 499, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 1.125f)
			.setRotationPoint(-65.75f, -16.8125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(77.1875f, -15.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(77.1875f, -15.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 343, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(77.1875f, -16.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 341, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(77.1875f, -14.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 485, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.1875f, -15.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.1875f, -15.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 227, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.1875f, -16.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 500, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-77.1875f, -14.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 250, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-65.75f, -14.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 233, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, 0.5f)
			.setRotationPoint(-65.75f, -15.8125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 1.125f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f)
			.setRotationPoint(-65.75f, -16.8125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 246, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(47.4375f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 498, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(50.9375f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 488, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(41.9375f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 456, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(38.4375f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 419, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(47.4375f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 372, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(50.9375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 346, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(41.9375f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 341, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(38.4375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 288, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(60.5625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 252, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(64.0625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 214, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(55.0625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 160, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(51.5625f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 48, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(60.5625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 43, 245, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(64.0625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 493, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(55.0625f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 473, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(3, 4, 5).build()
			.setRotationPoint(51.5625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 199, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(38.4375f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 164, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(38.4375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 393, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(51.5625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 376, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(51.5625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 147, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(50.75f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 130, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(50.75f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 113, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(49.9375f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 96, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(63.0625f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 51, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(49.9375f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 34, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(63.0625f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 62, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(47.4375f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 39, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(37.9375f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 16, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(47.4375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(37.9375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 470, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(60.5625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(51.0625f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 361, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(60.5625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 454, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(51.0625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 174, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(37.9375f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 42, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(51.0625f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 31, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(37.9375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(51.0625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 464, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(47.4375f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 453, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(60.5625f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 442, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(47.4375f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 431, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(60.5625f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 387, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(47.4375f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 259, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(47.4375f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 248, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(47.4375f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 237, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(60.5625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 216, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(60.5625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 205, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(60.5625f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 133, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(37.9375f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 76, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(37.9375f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 53, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(37.9375f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 420, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(51.0625f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 409, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(51.0625f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 398, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(51.0625f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(37.9375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(37.9375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 298, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(37.9375f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 164, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(51.0625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 105, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(51.0625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 478, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(51.0625f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(47.4375f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(47.4375f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 227, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(47.4375f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 182, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(60.5625f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 43, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(60.5625f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 32, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(60.5625f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 450, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(37.9375f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(51.0625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 388, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(37.9375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 254, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(51.0625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 243, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(47.4375f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 216, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(60.5625f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 205, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(47.4375f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 76, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(60.5625f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 17, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(63.875f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 182, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(63.875f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 427, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(82.9375f, -18.4375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 174, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.553f, -0.625f, 0, -1.553f, -0.625f, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1.553f, -0.375f, 0, -1.553f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(84.4375f, -17.3125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 150, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1.125f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-85.5625f, -18.4375f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 20, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.553f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.553f, -0.625f, -0.625f, -1.553f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.553f, -0.375f, -0.625f)
			.setRotationPoint(-87.0625f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 156, 3, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-78.5625f, -19.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 65, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(77.9375f, -19.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 10, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(81.4375f, -19.1875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 21, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-82.5625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 410, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.75f, -0.625f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f)
			.setRotationPoint(-84.0625f, -19.1875f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 464, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -15.1875f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -16.6875f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 436, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.125f, -0.25f, -0.625f)
			.setRotationPoint(-86.0625f, -16.5625f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 246, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f)
			.setRotationPoint(-86.1875f, -17.0625f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 409, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(84.9375f, -15.1875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 367, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.9375f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 359, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0.875f, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.4375f, -16.5625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 403, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.5f, 1.125f, -0.375f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(83.5625f, -17.0625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 375, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 12, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-76.5625f, -17.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 481, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-61.5625f, -17.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-60.5625f, -17.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 478, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(-59.5625f, -17.9375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-58.5625f, -18.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 456, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-57.5625f, -19.1875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 429, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-56.5625f, -19.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 456, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 12, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-55.0625f, -19.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 456, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-77.375f, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 359, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-77.375f, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 344, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 13, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f)
			.setRotationPoint(-77.375f, -16.9375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 402, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f)
			.setRotationPoint(-77.375f, -19.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-77.375f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-77.125f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 492, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.125f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 193, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-77.125f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 300, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.125f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 184, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(-77.125f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 336, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-77.125f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-77.125f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 184, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-77.125f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 123, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-77.125f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 236, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(82.9375f, -18.4375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 376, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.553f, -0.625f, 0, -1.553f, -0.625f, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1.553f, -0.375f, 0, -1.553f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(84.4375f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 54, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1.125f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-85.5625f, -18.4375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 78, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.553f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.553f, -0.625f, -0.625f, -1.553f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.553f, -0.375f, -0.625f)
			.setRotationPoint(-87.0625f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 156, 3, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-78.5625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 10, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(77.9375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(81.4375f, -19.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 493, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-82.5625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 294, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.75f, -0.625f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f)
			.setRotationPoint(-84.0625f, -19.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 242, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -15.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 209, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 204, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.125f, -0.25f, -0.625f)
			.setRotationPoint(-86.0625f, -16.5625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 432, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f)
			.setRotationPoint(-86.1875f, -17.0625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 199, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(84.9375f, -15.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 176, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.9375f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 166, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0.875f, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.4375f, -16.5625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 202, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.5f, 1.125f, -0.375f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(83.5625f, -17.0625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 13, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f)
			.setRotationPoint(77, -16.9375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 375, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f)
			.setRotationPoint(77, -19.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 105, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(77, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 2, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(77, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 334, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 2, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(77, -13.4375f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 409, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(77.25f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 154, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(77.25f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		groups.add(group4);
	}

	private final void initGroup_group41(){
		TurboList group4 = new TurboList("group4");
		group4.add(new ModelRendererTurbo(group4, 485, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(77.25f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 209, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(77.25f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 155, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(77.25f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 150, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(77.25f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 199, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(77.25f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 145, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(77.25f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 168, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(77.25f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(84.9375f, -15.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0)
			.setRotationPoint(82.4375f, -17.8125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 389, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(84.5625f, -16.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 349, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -1.125f, 0, 0)
			.setRotationPoint(83.9375f, -17.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 467, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(83.9375f, -18.3125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(77.4375f, -19.6875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0)
			.setRotationPoint(80.9375f, -18.9375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 105, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-76.5625f, -2.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 174, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-76.5625f, -2.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 456, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.25f, 0.375f, -0.75f, -0.25f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-76.5625f, -2.4375f, -5.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 91, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-75.9375f, -2.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 71, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-76.5625f, -3.4375f, -7.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 38, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-76.5625f, -3.4375f, -5).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 136, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -1, -0.75f, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-76.1875f, -3.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-76.5625f, -3.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 18, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-76.5625f, -3.6875f, -5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 127, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.375f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-75.1875f, -2.4375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 342, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0.375f, 0, 0, 0.625f, 0, 0.25f, 0.25f, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.375f, 0, 0.25f, 0.625f)
			.setRotationPoint(-75.1875f, -3.6875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 507, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.5625f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.4375f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 382, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.4375f, -4.4375f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.5625f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 304, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.4375f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 294, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.4375f, -4.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 222, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.5625f, -4.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 121, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, 0, -0.9375f, -0.4375f, 0, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.1875f, -4.4375f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 96, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-76.9375f, -4.3125f, -6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 283, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(3).setSegments(8, 16).setScale(1.25f, 1.375f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-75.0625f, -0.9375f, 9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 418, 20, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.625f).setLength(1).setSegments(8, 6).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.0625f, -1.0625f, 9).setRotationAngle(0, 45, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 262, 243, textureX, textureY).addCylinder(1, 0, 0, 1, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-76.1875f, -1.1875f, 9).setRotationAngle(0, 0, -100)
		);
		group4.add(new ModelRendererTurbo(group4, 257, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(3).setSegments(8, 16).setScale(1.25f, 1.375f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-75.0625f, -0.9375f, -9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 506, 13, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.625f).setLength(1).setSegments(8, 6).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.0625f, -1.0625f, -9).setRotationAngle(0, 45, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 231, 243, textureX, textureY).addCylinder(1, 0, 0, 1, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-76.1875f, -1.1875f, -9).setRotationAngle(0, 0, -100)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(1).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-76.0625f, -2.1875f, 5.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 189, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(2).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(-0.75, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-76.0625f, -1.6875f, 5.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 184, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(1).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-76.0625f, -2.1875f, -5.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 145, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(2).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(-0.75, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(-76.0625f, -1.6875f, -5.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-76.5625f, -2.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 10, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.25f, 0.375f, -0.75f, -0.25f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-76.5625f, -2.4375f, 5.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 86, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-76.5625f, -2.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 81, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-75.9375f, -2.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 76, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-76.5625f, -3.4375f, 3.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 62, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-76.5625f, -3.4375f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 118, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -1, -0.75f, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-76.1875f, -3.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.375f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-75.1875f, -2.4375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0.375f, 0, 0, 0.625f, 0, 0.25f, 0.25f, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.375f, 0, 0.25f, 0.625f)
			.setRotationPoint(-75.1875f, -3.6875f, 4.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-76.5625f, -3.6875f, 3.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 455, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-76.5625f, -3.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 332, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.5625f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 217, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, -0.75f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.5625f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 162, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.4375f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 101, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.4375f, -4.4375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 67, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.4375f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 47, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.4375f, -4.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 29, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.5625f, -4.6875f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, 0, -0.9375f, -0.4375f, 0, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.1875f, -4.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 473, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-76.9375f, -4.3125f, 4.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 120, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 19, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-76.5625f, -16.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 321, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 19, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-76.5625f, -16.6875f, -4).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 17, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-71.5625f, -16.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-71.5625f, -16.6875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 78, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-69.8125f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 114, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-69.8125f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 184, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-71.5625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 141, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-67.3125f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 7, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-71.5625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 248, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-67.3125f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 490, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-70.3125f, -10.5625f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 300, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-70.3125f, -10.5625f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-71.5625f, -0.6875f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 88, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-71.5625f, -0.6875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-65.75f, -13.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-65.75f, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 467, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(86.3125f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(84.0625f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 170, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.3125f, 1.5625f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 241, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.3125f, -11.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 118, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.3125f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 61, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.0625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 380, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.0625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 365, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-88.0625f, -11.9375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.3125f, -12.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.3125f, -12.6875f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 493, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.3125f, -13.9375f, -4.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 386, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.3125f, -14.4375f, -1.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 389, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.3125f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 68, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.4375f, 2.5625f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 436, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.4375f, 2.3125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 314, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.6875f, 2.5625f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.6875f, 2.3125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-84.4375f, 2.5625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 212, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-78.6875f, 2.5625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 237, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(79.1875f, 2.5625f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 226, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(79.1875f, 2.3125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 171, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.9375f, 2.5625f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 157, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.9375f, 2.3125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 78, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(79.1875f, 2.5625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 270, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(84.9375f, 2.5625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 202, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-84.4375f, 2.5625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 376, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-78.6875f, 2.5625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 130, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(-84.4375f, 2.5625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 72, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.4375f, 2.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 57, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(-78.6875f, 2.5625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 34, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.6875f, 2.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 473, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(79.1875f, 2.5625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 277, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(84.9375f, 2.5625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 24, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(79.1875f, 2.5625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 19, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(79.1875f, 2.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 9, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(84.9375f, 2.5625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 4, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.9375f, 2.3125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 96, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-84.4375f, 4.8125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 17, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.6875f, 4.8125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 342, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(79.1875f, 4.8125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(84.9375f, 4.8125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.4375f, 4.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 318, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-78.6875f, 4.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 240, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(79.1875f, 4.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 487, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.9375f, 4.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.4375f, 6.0625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.4375f, 4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.4375f, 2.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.4375f, 6.0625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.4375f, 4.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.4375f, 2.9375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 399, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(80.1875f, 6.0625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(80.1875f, 4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(80.1875f, 2.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 399, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(80.1875f, 6.0625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(80.1875f, 4.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 399, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(80.1875f, 2.9375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 1.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 206, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0)
			.setRotationPoint(-46.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -3.75f, 0)
			.setRotationPoint(-45.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 1.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 5.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 5.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 4, 9, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 498, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 483, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 2.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 460, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 346, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 304, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 2.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 289, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 257, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 430, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -3.75f, 0, 0, -3.75f, 0, 0, 0.25f, 0)
			.setRotationPoint(29.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 326, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 1.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 326, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 1.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 331, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(45.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 490, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.875f, 2.5625f, 5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 384, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.625f, 2.5625f, 5.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 399, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-22.875f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 356, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-14.875f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 477, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(22.625f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 221, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-23.125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 189, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-19.125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 166, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-15.125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 145, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-11.125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 82, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(22.375f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 63, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(25.375f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 210, textureX, textureY).addCylinder(0, 0, 0, 2, 6, 8, 1, 1, 3, null)
			.setRotationPoint(-36.625f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 404, 210, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-36.875f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 210, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-37.125f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 386, 210, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-31.375f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 199, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-31.125f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 52, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.125f, 2.5625f, 9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 42, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.875f, 2.5625f, 9).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 14, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.125f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 493, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.875f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 172, 1, 21, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, 2.0625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 345, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(52.5625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 375, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(72.0625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 345, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(65.4375f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 322, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(39.4375f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 299, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(26.3125f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 276, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.1875f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 253, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(0.0625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 230, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.0625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 184, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.1875f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 23, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.3125f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 184, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.4375f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 291, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(69.6875f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 282, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.9375f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 218, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(63.0625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 175, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(49.9375f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 109, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(36.8125f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 100, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.6875f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 91, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 82, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 73, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.6875f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 52, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.8125f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 32, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.9375f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 427, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 16, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.9375f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(52.5625f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(72.0625f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 334, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(65.4375f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(39.4375f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 415, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(26.3125f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 161, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(13.1875f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 138, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(0.0625f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 115, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-13.0625f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 92, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-26.1875f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 69, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-39.3125f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 46, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-52.4375f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 405, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.375f, 0.25f, -0.5f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-78.3125f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 11, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.3125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 461, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.3125f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.3125f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 16, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 168, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.3125f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-80.0625f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 183, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-82.5625f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 496, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-84.3125f, -0.6875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 390, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.3125f, 1.5625f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 503, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-83.0625f, -5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 502, 143, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.0625f, -6.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 358, 142, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.0625f, -11.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 488, 239, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-80.25f, -10.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 468, 239, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-82.5625f, -10.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 234, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(56.8125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 20, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(43.6875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(30.5625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 478, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17.4375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 457, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(4.3125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 450, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-8.8125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 443, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-21.9375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 436, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.0625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 429, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-48.1875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 229, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 69, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 486, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 77, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 193, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-86.5625f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 396, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-86.5625f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 161, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-86.5625f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 238, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(-86.5625f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-86.5625f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 387, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-86.5625f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 78, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-86.5625f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 455, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-86.5625f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 23, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(52.5625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(39.4375f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 438, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(26.3125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 415, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.1875f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 475, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(0.0625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 452, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.0625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 429, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.1875f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 54, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.9375f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 405, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.4375f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 428, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.0625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 361, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.3125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 220, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.3125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.3125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 469, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.8125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 364, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(49.9375f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 355, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(36.8125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 328, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.6875f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 319, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 273, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 264, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.6875f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 16, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(63.0625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 221, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 16, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.8125f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 502, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.9375f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 325, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 16, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.9375f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 422, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(56.8125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 402, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(43.6875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 395, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17.4375f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 388, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(4.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 344, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-8.8125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 309, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-21.9375f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 227, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-48.1875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 154, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.0625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 134, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(30.5625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 392, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(52.5625f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 369, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(39.4375f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 346, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(26.3125f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 323, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(13.1875f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 300, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(0.0625f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 277, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-13.0625f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 254, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-26.1875f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 231, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-52.4375f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 287, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-64.0625f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-39.3125f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 194, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(71.9375f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 209, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.1875f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 492, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(79.3125f, 1.5625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 494, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.375f, 0.25f, -0.5f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-78.3125f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 166, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.3125f, 1.5625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 127, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.3125f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-80.0625f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 197, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-82.5625f, -11.4375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 493, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-84.3125f, -0.6875f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 413, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-83.0625f, -5.5625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 405, 99, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.0625f, -6.625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 458, 75, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.0625f, -11.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 363, 239, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-82.5625f, -10.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 252, 239, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-80.25f, -10.0625f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 337, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 16, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, -6, 0, 0, -6, 0, 0, -6, -6, 0, -6, -6)
			.setRotationPoint(86.26001f, -4.9375f, -1.5f).setRotationAngle(0, 0, 0).setName("Logo_Back")
		);
		group4.add(new ModelRendererTurbo(group4, 43, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, -0.625f, 0.5f, -0.75f, -0.625f, 0.5f, -0.75f, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(76.9375f, -13.9375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 255, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 16, 1, 0, -0.625f, 0.5f, -0.75f, -0.625f, 0.5f, -0.75f, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(76.9375f, -13.9375f, -11.25f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 308, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(37.625f, -5.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 291, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(37.625f, -5.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 432, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(79.3125f, 1.5625f, 10).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 466, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(85.5625f, 1.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 478, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(73.6875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 446, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(77.1875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 274, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(76.1875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(73.6875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 183, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(73.6875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(73.6875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 443, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(73.6875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 389, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(73.6875f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 143, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(73.6875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 424, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(68.1875f, -0.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 354, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(64.6875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 257, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(64.6875f, -4.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 200, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(64.1875f, -2.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 158, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(64.1875f, -2.9375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 63, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(64.1875f, -3.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 143, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(64.1875f, -3.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 444, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(64.1875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 98, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(64.1875f, -1.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 140, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(73.6875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 135, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(77.1875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 180)
		);
		group4.add(new ModelRendererTurbo(group4, 240, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(76.1875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(73.6875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 32, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(73.6875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 382, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(73.6875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 177, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(73.6875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 263, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(73.6875f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 63, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(73.6875f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 116, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(68.1875f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 111, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(4, 5).build()
			.setRotationPoint(64.6875f, -4.4375f, -10.75f).setRotationAngle(0, 0, 270)
		);
		group4.add(new ModelRendererTurbo(group4, 390, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(64.1875f, -1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 365, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(64.1875f, -2.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 348, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(64.1875f, -2.9375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 296, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(64.1875f, -3.1875f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 398, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(64.1875f, -3.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 494, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(64.6875f, -4.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 382, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(64.1875f, -1.4375f, -3.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.5f, -13.4375f, 11.02f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 315, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.5f, -13.4375f, -11.02f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 47, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-40.9375f, -15.1875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 212, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-40.9375f, -15.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 502, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-40.9375f, -16.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 280, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-40.9375f, -14.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 245, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 118, 1, 4, 0, 0, -0.5f, 0.375f, 0.125f, -0.5f, 0.375f, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.375f, 0.125f, 0, 0.375f, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.9375f, -13.9375f, -10.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 118, 1, 4, 0, 0, -0.5f, 0.375f, 0.125f, -0.5f, 0.375f, 0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.375f, 0.125f, 0, 0.375f, 0.125f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-40.9375f, -13.4375f, -10.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 360, 90, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(51.375f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 437, 81, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(38.25f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 147, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(51.375f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 386, 147, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(38.25f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 410, 81, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-27.375f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 147, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-27.375f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 238, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 118, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-40.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 123, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 118, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-40.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 349, 58, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-40.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 383, 81, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-40.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 129, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 107, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-40.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 455, 145, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-40.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 106, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-41.125f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 356, 81, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-14.25f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 145, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-14.25f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 347, 145, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(25.125f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 16, 144, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(12, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 144, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-1.125f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 329, 81, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(25.125f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 465, 80, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(12, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 439, 78, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-1.125f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 55, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(64.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 170, 143, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(64.5f, -16.6875f, -5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 222, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-40.9375f, -15.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 207, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-40.9375f, -15.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 377, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-40.9375f, -16.6875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 471, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-40.9375f, -14.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 245, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 118, 1, 4, 0, 0, -0.5f, 0.25f, 0.125f, -0.5f, 0.25f, 0.125f, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-40.9375f, -13.9375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 118, 1, 4, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-40.9375f, -13.4375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 412, 78, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(51.375f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 385, 78, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(38.25f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 108, 143, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(51.375f, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 78, 143, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(38.25f, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 358, 78, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.375f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 216, 142, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-27.375f, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 239, 120, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 118, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-40.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 120, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 118, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-40.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 326, 32, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-40.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 331, 78, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-40.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 126, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 107, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-40.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 486, 141, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-40.5f, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 92, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0)
			.setRotationPoint(-41.125f, -16.6875f, 5.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 431, 75, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.25f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 400, 141, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-14.25f, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 170, 140, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(25.125f, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 470, 139, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(12, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 486, 138, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-1.125f, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 405, 73, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(25.125f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 73, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(12, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 405, 70, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 12, 1, 1, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.125f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 326, 29, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(64.5f, -16.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 470, 136, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(64.5f, -16.6875f, 5.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 156, 1, 13, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-78.5625f, -20.1875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-82.0625f, -19.6875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 476, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.5625f, -18.9375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 399, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.0625f, -17.8125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 451, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -18.3125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 373, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 333, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-86.1875f, -16.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 435, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0.625f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0.625f, 0, 0)
			.setRotationPoint(-85.5625f, -17.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -16.3125f, -9.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.3125f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 68, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -16.3125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 47, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.0625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 30, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 0, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.1875f, -17.3125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 504, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.0625f, -16.8125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 505, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.1875f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 487, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.1875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 241, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.0625f, -16.8125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 473, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(-85.0625f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 456, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(-85.1875f, -16.8125f, -8.5f).setRotationAngle(0, 90, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 457, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-85.5625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 366, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-85.0625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 501, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -14.4375f, -10.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 417, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, -15.9375f, -9.375f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 441, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 436, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		group4.add(new ModelRendererTurbo(group4, 33, 250, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.375f, 1.375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(85.9375f, -16.9375f, 0).setRotationAngle(0, 0, 0)
		);
		groups.add(group4);
	}

	private final void initGroup_stripe(){
		TurboList stripe = new TurboList("stripe");
		stripe.add(new ModelRendererTurbo(stripe, 0, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 157, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.0625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripe.add(new ModelRendererTurbo(stripe, 71, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripe.add(new ModelRendererTurbo(stripe, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 157, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.0625f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		stripe.add(new ModelRendererTurbo(stripe, 507, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(stripe);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 2, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 2, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 164, 1, 0, 0, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.3125f, 1.5625f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, 1.5625f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.5625f, -11.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.3125f, -11.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.3125f, -12.1875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 164, 1, 0, 0, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.3125f, 1.5625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, 1.5625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 509, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.5625f, -11.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.3125f, -11.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.3125f, -12.1875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.3125f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-82.5625f, -0.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-80.0625f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-82.5625f, -3.6875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.3125f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-82.5625f, -0.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-80.0625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-82.5625f, -3.6875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0)
			.setRotationPoint(84.9375f, -16.9375f, -1.5f).setRotationAngle(0, 0, 0).setName("Logo_Backcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(82.9375f, -18.4375f, -1.5f).setRotationAngle(0, 0, 0).setName("Logo_Backcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -2, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -2, -0.5f, 0)
			.setRotationPoint(82.9375f, -18.4375f, -0.5f).setRotationAngle(0, 0, 0).setName("Logo_Backcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 250, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.9375f).setLength(1).setSegments(8, 0).setScale(1.375f, 1.375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.8125, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(86, -16.9375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 255, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.3125f, 0.5625f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(86, -16.9375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 259, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(86.1875f, -16.9375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 2, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(77, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f)
			.setRotationPoint(77, -13.4375f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 2, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f)
			.setRotationPoint(77, -5.9375f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 2, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(77, -13.4375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f)
			.setRotationPoint(77, -13.4375f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 2, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f)
			.setRotationPoint(77, -5.9375f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, -0.8125f, -0.25f, 0.5f, -0.8125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(77.5f, -11.4375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(77.5f, -10.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, 0, 0, 0, 0, 0)
			.setRotationPoint(77.5f, -10.6875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(77.5f, -11.4375f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, 0, 0, 0, 0, 0)
			.setRotationPoint(77.5f, -10.6875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(77.5f, -10.6875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(77.5f, -6.9375f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 259, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.25f, 0.5f, -0.8125f, -0.25f, 0.5f, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, -0.8125f, 0, 0.5f, -0.8125f, 0, 0, 0, 0, 0)
				.setRotationPoint(77.5f, -6.9375f, 6).setRotationAngle(0, 0, 0)
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
