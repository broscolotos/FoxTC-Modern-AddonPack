//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.tender;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelNYC3AxleTenderBogie;
import tcmodern.common.entities.tender.EntityNYC40ft3inTender;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNYC40ft3inTender extends FVTMFormatBase {

	public ModelNYC40ft3inTender(){
		super();
		textureX = 256;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_scoop();
		initGroup_scooppiping();
		initGroup_Coal();
		initGroup_scoopBracket1();
		initGroup_clipboard();
		initGroup_PaintingStuff();
		initGroup_CoalOverflow();
	}

	private final void initGroup_scoop(){
		TurboList scoop = new TurboList("scoop");
		scoop.add(new ModelRendererTurbo(scoop, 238, 49, textureX, textureY)
			.addShapeBox(0, -0.125f, 0, 4, 1, 4, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 242, 44, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 234, 32, textureX, textureY)
			.addShapeBox(0, -0.5f, 4, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 237, 86, textureX, textureY)
			.addShapeBox(3.875f, -0.125f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 249, 99, textureX, textureY)
			.addShapeBox(3.875f, -0.5f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 178, 99, textureX, textureY)
			.addShapeBox(3.875f, -0.5f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 241, 73, textureX, textureY)
			.addShapeBox(5.625f, -0.375f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 182, 89, textureX, textureY)
			.addShapeBox(5.625f, -0.75f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.375f, 0, -0.125f, 0.375f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 182, 86, textureX, textureY)
			.addShapeBox(5.625f, -0.75f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.375f, 0, -0.125f, 0.375f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 242, 38, textureX, textureY)
			.addShapeBox(7.375f, -0.75f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 230, 68, textureX, textureY)
			.addShapeBox(7.375f, -1.125f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 249, 27, textureX, textureY)
			.addShapeBox(7.375f, -1.125f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-4.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		groups.add(scoop);
	}

	private final void initGroup_scooppiping(){
		TurboList scooppiping = new TurboList("scooppiping");
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 1, 1, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-39.875f, 0.6875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 1, 1, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-39.875f, 1.1875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 171, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0.375f, 0, -0.625f, 0.0625f, 0, -0.625f, 0.0625f, 0, 0, 0.375f, 0, 0, 0.375f, -0.625f, -0.625f, 0.0625f, -0.625f, -0.625f, 0.0625f, -0.625f, 0, 0.375f, -0.625f, 0)
			.setRotationPoint(-21.875f, 1.6875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 228, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0)
			.setRotationPoint(-22.0625f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 178, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0)
			.setRotationPoint(-14.3125f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 236, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0)
			.setRotationPoint(-3.0625f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 228, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0)
			.setRotationPoint(8.1875f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 194, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(18.9375f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 178, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(25.9375f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 103, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(34.1875f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 119, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(42.3125f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 103, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(-26.9375f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 119, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, 0.5f, 0, -0.375f, 0.5f, 0, -0.25f, 0, 0, 0, 0, -0.625f, -0.625f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f, -0.25f, 0, -0.625f, 0)
			.setRotationPoint(44.625f, 0.6875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 103, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.75f, 0, -0.125f, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.75f, -0.625f, -0.125f, 0, -0.625f, 0)
			.setRotationPoint(46.125f, 0.6875f, 9.125f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 119, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, 0.4375f, 0.5f, -0.4375f, 0.4375f, 0.5f, -0.25f, 0, 0, 0, 0, -0.625f, -0.625f, 0.4375f, -1.125f, -0.4375f, 0.4375f, -1.125f, -0.25f, 0, -0.625f, 0)
			.setRotationPoint(44.625f, 1.1875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 81, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0)
			.setRotationPoint(-22.9375f, 0.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 16, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0)
			.setRotationPoint(-22.9375f, 1.0625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0)
			.setRotationPoint(-22.9375f, 1.5625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 233, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f)
			.setRotationPoint(-22.9375f, 2.3125f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 81, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0)
			.setRotationPoint(10.5625f, 0.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0)
			.setRotationPoint(10.5625f, 1.0625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0)
			.setRotationPoint(10.5625f, 1.5625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f)
			.setRotationPoint(10.5625f, 2.3125f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 250, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0)
			.setRotationPoint(9.875f, 0.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0)
			.setRotationPoint(9.875f, 1.0625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.625f, -0.3125f, 0.0625f, -0.625f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(9.875f, 1.5625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 217, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f)
			.setRotationPoint(9.875f, 2.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 250, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(-36.6875f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 11, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.625f, 0.375f, 0, -2.5f, 0.375f, 0, 1.875f, 0, 0, 0, 0, -0.625f, -0.625f, 0.375f, -0.625f, -2.5f, 0.375f, -0.625f, 1.875f, 0, -0.625f, 0)
			.setRotationPoint(-44.25f, 0.6875f, 7.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.625f, 0.375f, 0, -2.5f, 0.375f, 0, 1.875f, 0, 0, 0, 0, -0.625f, -0.625f, 0.375f, -0.625f, -2.5f, 0.375f, -0.625f, 1.875f, 0, -0.625f, 0)
			.setRotationPoint(-44.25f, 1.1875f, 7.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-39.875f, 0.6875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-39.875f, 1.1875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 171, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0.375f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.625f, 0.375f, 0, -0.625f, 0.375f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, -0.625f, 0.375f, -0.625f, -0.625f)
			.setRotationPoint(-21.875f, 1.6875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f)
			.setRotationPoint(-22.0625f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 241, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f)
			.setRotationPoint(-14.3125f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f)
			.setRotationPoint(-3.0625f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f)
			.setRotationPoint(8.1875f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 241, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(18.9375f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(25.9375f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(34.1875f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 16, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(42.3125f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(-26.9375f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 217, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, -0.25f, 0.5f, 0, -0.375f, 0, 0, -0.625f, 0, -0.625f, 0, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.375f, 0, -0.625f, -0.625f)
			.setRotationPoint(44.625f, 0.6875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 207, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, -0.125f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.75f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(46.125f, 0.6875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.4375f, 0.5f, -0.25f, 0.4375f, 0.5f, -0.4375f, 0, 0, -0.625f, 0, -0.625f, 0, 0.4375f, -1.125f, -0.25f, 0.4375f, -1.125f, -0.4375f, 0, -0.625f, -0.625f)
			.setRotationPoint(44.625f, 1.1875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 213, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(46.125f, 0.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f)
			.setRotationPoint(-22.9375f, 0.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 217, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f)
			.setRotationPoint(-22.9375f, 1.0625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 207, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f)
			.setRotationPoint(-22.9375f, 1.5625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-22.9375f, 2.3125f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f)
			.setRotationPoint(10.5625f, 0.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 217, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f)
			.setRotationPoint(10.5625f, 1.0625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 207, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f)
			.setRotationPoint(10.5625f, 1.5625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(10.5625f, 2.3125f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f)
			.setRotationPoint(9.875f, 0.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 217, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f)
			.setRotationPoint(9.875f, 1.0625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 207, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.625f, -0.3125f, 0.0625f, -0.625f)
			.setRotationPoint(9.875f, 1.5625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(9.875f, 2.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(-36.6875f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 225, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.375f, 0, 1.875f, 0.375f, 0, -2.5f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 1.875f, 0.375f, -0.625f, -2.5f, 0, -0.625f, -0.625f)
			.setRotationPoint(-44.25f, 0.6875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 207, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.375f, 0, 1.875f, 0.375f, 0, -2.5f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 1.875f, 0.375f, -0.625f, -2.5f, 0, -0.625f, -0.625f)
			.setRotationPoint(-44.25f, 1.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(scooppiping);
	}

	private final void initGroup_Coal(){
		TurboList Coal = new TurboList("Coal");
		Coal.add(new ModelRendererTurbo(Coal, 54, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(0.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 38, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, -0.1875f, 0, 0.625f, -0.1875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, -0.1875f, 0, -0.625f, -0.1875f)
			.setRotationPoint(0.3125f, -19.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 22, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1, 0)
			.setRotationPoint(5.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 235, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1.5f, 0, 0, -1.25f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(5.3125f, -20.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 219, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.25f, 0)
			.setRotationPoint(10.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 203, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1.25f, 0, 0, -1, 0, 0, 0.25f, -0.1875f, 0, 0, -0.1875f, 0, 1.25f, 0, 0, 1, 0, 0, -0.25f, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(10.3125f, -20.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 187, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(15.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 171, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, 1, 0, 0, 1, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f)
			.setRotationPoint(15.3125f, -20.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 155, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.5f, 0)
			.setRotationPoint(20.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 82, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.5f, 0, 0, -0.75f, 0, 0, 0.25f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, 0, 0, 0.75f, 0, 0, -0.25f, -0.1875f, 0, -0.5f, -0.1875f)
			.setRotationPoint(20.3125f, -19.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 66, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1.25f, 0)
			.setRotationPoint(25.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 232, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.75f, 0, 0, -1.25f, 0, 0, -0.25f, -0.1875f, 0, 0.25f, -0.1875f, 0, 0.75f, 0, 0, 1.25f, 0, 0, 0.25f, -0.1875f, 0, -0.25f, -0.1875f)
			.setRotationPoint(25.3125f, -19.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 166, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.75f, 0)
			.setRotationPoint(30.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 155, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, 0, -0.1875f, 0, 0.75f, -0.1875f, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0, -0.1875f, 0, -0.75f, -0.1875f)
			.setRotationPoint(30.3125f, -18.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 88, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.5f, 0.25f, 0, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(35.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 62, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0, 0.25f, -0.1875f, 0, 1, -0.1875f, 0, -0.25f, 0, 0, 0.5f, 0, 0, -0.25f, -0.1875f, 0, -1, -0.1875f)
			.setRotationPoint(35.3125f, -17.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 46, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 1, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, -0.25f, 0, 0.625f, 0.1875f, 0, 1, -0.75f, -0.1875f, 0, -1, -0.1875f, 0, 0.25f, 0, 0.625f, -0.1875f, 0)
			.setRotationPoint(-9.6875f, -19.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 208, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 0, 0, 0, 0.25f, 0, 0, -1.5f, -0.1875f, 0, -1.125f, -0.1875f, 0, 0, 0, 0, -0.25f, 0)
			.setRotationPoint(-4.6875f, -18.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 88, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.625f, -0.1875f, 0, 1, -0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.625f, -0.1875f, 0, -1, -0.1875f, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(0.3125f, -19.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 62, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -1.25f, 0, 0, -1.5f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 1.25f, 0, 0, 1.5f, 0)
			.setRotationPoint(5.3125f, -20.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 46, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, -1, 0, 0, -1.25f, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, 1, 0, 0, 1.25f, 0)
			.setRotationPoint(10.3125f, -20.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 136, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, -0.1875f, 0, 0, -0.1875f, 0, -1, 0, 0, -1, 0, 0, -0.25f, -0.1875f, 0, 0, -0.1875f, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(15.3125f, -20.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 136, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.5f, -0.1875f, 0, 0.25f, -0.1875f, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0.75f, 0, 0, 0.5f, 0)
			.setRotationPoint(20.3125f, -19.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 235, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -1.25f, 0, 0, -0.75f, 0, 0, -0.25f, -0.1875f, 0, 0.25f, -0.1875f, 0, 1.25f, 0, 0, 0.75f, 0)
			.setRotationPoint(25.3125f, -19.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 82, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 0, -0.1875f, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.75f, -0.1875f, 0, 0, -0.1875f, 0, 0.75f, 0, 0, 0.25f, 0)
			.setRotationPoint(30.3125f, -18.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 71, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, -0.1875f, 0, 0.25f, -0.1875f, 0, -0.5f, 0, 0, 0.25f, 0, 0, -1, -0.1875f, 0, -0.25f, -0.1875f, 0, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(35.3125f, -17.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 55, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0.625f, 1.6875f, 0, 0, 1.25f, 0, 0, 0, 0, -0.125f, 0, 0, 0.625f, -1.6875f, 0, 0, -1.25f, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-9.6875f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 178, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6875f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 103, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 103, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 233, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 97, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 81, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0, 0)
			.setRotationPoint(35.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 233, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, -0.125f, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0.625f, 1.6875f, 0, -0.125f, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0.625f, -1.6875f, 0)
			.setRotationPoint(-9.6875f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1.25f, 0)
			.setRotationPoint(-4.6875f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0.625f, 0.1875f, 0, 0, -0.25f, 0, 0, 1, -0.1875f, 1, 0.75f, -0.1875f, 0.625f, -0.1875f, 0, 0, 0.25f, 0, 0, -1, -0.1875f, 1, -0.75f, -0.1875f)
			.setRotationPoint(-9.6875f, -19.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, 0, 0, 0, 0, 0, 1.125f, -0.1875f, 0, 1.5f, -0.1875f, 0, -0.25f, 0, 0, 0, 0, 0, -1.125f, -0.1875f, 0, -1.5f, -0.1875f)
			.setRotationPoint(-4.6875f, -18.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		groups.add(Coal);
	}

	private final void initGroup_scoopBracket1(){
		TurboList scoopBracket1 = new TurboList("scoopBracket1");
		scoopBracket1.add(new ModelRendererTurbo(scoopBracket1, 228, 120, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 6, 1, 0, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f)
			.setRotationPoint(4.375f, 4.375f, -3.125f).setRotationAngle(0, 0, 98)
		);
		scoopBracket1.add(new ModelRendererTurbo(scoopBracket1, 236, 116, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 6, 1, 0, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f)
			.setRotationPoint(4.375f, 4.375f, 2.125f).setRotationAngle(0, 0, 98)
		);
		groups.add(scoopBracket1);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-42.75f, -13.1875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-42.75f, -13.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 12, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-41.75f, -13.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 96, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-41.75f, -13.4375f, -10).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 187, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(14).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.1875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-41.75f, -13.1875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 91, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-41.75f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 20, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.25f, -1.375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-41.75f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-41.75f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-16.75f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-16.75f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.308f, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.442f, 0, -0.5f, -0.308f, 0, -0.5f, -0.308f, 0, -0.5f, -0.442f, 0, -0.5f, -0.442f)
			.setRotationPoint(-10.75f, -18.1875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0.1875f, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(46.5f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.558f, -1, 0, -0.558f, -1, 0, -0.192f, 0, 0, -0.192f, 0, -0.6875f, -0.75f, -0.769f, -0.6875f, -0.75f, -0.769f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(42.5f, -17.6875f, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, -0.308f, 0, -0.5f, -0.442f, 0, 0, -0.75f, 0, -0.5f, -0.308f, 0, -0.5f, -0.308f, 0, -0.5f, -0.442f, 0, -0.5f, -0.442f)
			.setRotationPoint(42.5f, -18.1875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 12, 1, 0, -0.327f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.327f, 0, 0, -0.327f, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, 0, -0.327f, -0.1875f, 0)
			.setRotationPoint(45.25f, -13.1875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 187, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(12).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.1875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.25f, -13.1875f, -10).setRotationAngle(0, 180, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(47.25f, -13.1875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(48, -13.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 86, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.25f, -13.4375f, -10).setRotationAngle(0, 180, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 187, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(12).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.1875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.25f, -13.1875f, 10).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 10, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.25f, -13.4375f, 10).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(47.25f, -13.1875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(48, -13.4375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, 0, 0, -4.75f, 0, 0, -4.75f, -0.75f, 0, 0, -0.75f, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, -0.75f, 0, 0.3125f, -0.75f)
			.setRotationPoint(42, -18.1875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(48, -13.375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, -0.75f, 0, -4.75f, -0.75f, 0, -4.75f, 0, 0, 0, 0, 0, 0.3125f, -0.75f, 0, 0.3125f, -0.75f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(42, -18.1875f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, -0.25f, 0, 0.3125f, -0.25f)
			.setRotationPoint(41.75f, -18.1875f, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(48, -13.375f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 12, 6, 0, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.0625f, 0.25f, -0.1875f, -0.0625f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(42, -13.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 12, 6, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, 0.25f, -0.1875f, -0.0625f, 0, -0.1875f, -0.0625f)
			.setRotationPoint(42, -13.1875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(49, -0.375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 9, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, 0.5f, 0, 0.3125f, 0.5f)
			.setRotationPoint(41.75f, -18.1875f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(41.75f, -7.875f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, -0.75f, 0.5f, 0.5f, -0.75f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(41.75f, -7.875f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, -1, 0, 0, -1, 0, -0.3125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, 0.5f, 0, -0.3125f, 0.5f)
			.setRotationPoint(41.75f, -18.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, -3, -0.75f, 0, -3, -0.75f, 0, -3, 0, 0, -3, 0, -0.375f, -1, -0.75f, -0.375f, -1, -0.75f, -0.375f, -1, 0, -0.375f, -1)
			.setRotationPoint(41.75f, -19.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -4, -0.75f, 0, -4, -0.75f, 0, -4, 0, 0, -4, 0, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, 0, -0.625f, -1)
			.setRotationPoint(41.75f, -19.875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0.5f, 0, -0.125f, 0.5f)
			.setRotationPoint(-9.75f, -19.0625f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0.5f, 0, -3, -1.25f, 0, -3, -1.25f, 0, -3, 0.5f, 0, -3, 0, -0.125f, -1, -0.75f, -0.125f, -1, -0.75f, -0.125f, -1, 0, -0.125f, -1)
			.setRotationPoint(-10.25f, -19.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0.5f, 0, -4, -1.25f, 0, -4, -1.25f, 0, -4, 0.5f, 0, -4, 0, -0.125f, -1, -0.75f, -0.125f, -1, -0.75f, -0.125f, -1, 0, -0.125f, -1)
			.setRotationPoint(-10.75f, -20.8125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-43.5f, -16.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-41.75f, -16.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-42.625f, -17.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-42.375f, -17.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.5625f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, -0.75f, 0, -0.5625f, -0.75f)
			.setRotationPoint(-41.75f, -16.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-41.875f, -16.875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-43.625f, -17.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-44.25f, -16.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-44.125f, -16.875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-43.5f, -16.1875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-41.75f, -16.1875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-42.625f, -17.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-42.375f, -17.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.5625f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, -0.75f, 0, -0.5625f, -0.75f)
			.setRotationPoint(-41.75f, -16.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-41.875f, -16.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-43.625f, -17.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-44.25f, -16.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-44.125f, -16.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(-43.625f, -4.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-44.25f, -4.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(-44.125f, -4.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(-43.625f, -4.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-44.25f, -4.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(-44.125f, -4.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-43.5f, -4.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-43.5f, -6.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-43.5f, -10.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-43.5f, -8.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-43.5f, -12.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-43.5f, -14.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-40.5625f, -14.5f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-38.375f, -14.5f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-18.375f, -14.5f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-28.375f, -14.5f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-40.5f, -14.125f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-38.3125f, -14.125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.3125f, -14.4375f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-18.3125f, -14.125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-28.3125f, -14.125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-39.5f, -14.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-38.375f, -14.5f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-18.375f, -14.5f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-28.375f, -14.5f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, -0.75f, -0.0625f, -0.75f, -0.75f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-18.3125f, -14.125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, -0.75f, -0.0625f, -0.75f, -0.75f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-38.3125f, -14.125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, -0.75f, -0.0625f, -0.75f, -0.75f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-28.3125f, -14.125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 1, 1, 0, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-39.5f, -14.4375f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-40.5f, -14.4375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 5, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-39.5f, -14.4375f, -9).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-39.5f, -14.4375f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-40.5625f, -14.5f, 3.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-40.5f, -14.125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-29.875f, -13.4375f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.3125f, -14.4375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-29.875f, -13.4375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-28, -13.3125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 173, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-26.5f, -13.3125f, -3.5f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 173, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-26, -13.3125f, -3.5f).setRotationAngle(0, 180, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0.5f, 0, -0.875f, 0.5f)
			.setRotationPoint(-26.5f, -13.3125f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0.5f, 0, -0.875f, 0.5f)
			.setRotationPoint(-26.5f, -13.3125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 173, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-26.5f, -13.3125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 173, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-26, -13.3125f, 3.5f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-28, -13.375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f)
			.setRotationPoint(-27.5f, -13.375f, -2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-28, -13.375f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-27.5f, -13.375f, 1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0.0625f, -0.875f, -0.6875f, -0.6875f, -0.875f, -0.6875f, -0.6875f, -0.875f, 0.0625f, 0.0625f, -0.875f, 0.0625f)
			.setRotationPoint(-25.25f, -13.4375f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(-25.25f, -13.625f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0.0625f, -0.6875f, -0.875f, 0.0625f, -0.6875f, -0.875f, -0.6875f, 0.0625f, -0.875f, -0.6875f)
			.setRotationPoint(-25.25f, -13.4375f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(-25.25f, -13.625f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-25.25f, -13.875f, -0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 54, 1, 1, 0, 0.385f, 0, -0.25f, 0.481f, 0, -0.25f, 0.481f, 0, -0.5f, 0.385f, 0, -0.5f, 1.769f, 0.125f, -0.75f, 1.3125f, 0.125f, -0.75f, 1.3125f, 0.125f, 0, 1.769f, 0.125f, 0)
			.setRotationPoint(-10.75f, -17.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 52, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -1.25f, 0.25f, -0.1875f, -1.25f, 0.25f, -0.1875f, 0.5f, 0, -0.1875f, 0.5f)
			.setRotationPoint(-9.75f, -18.1875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(41.75f, -18.1875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0.1875f, 0, -0.75f, 0.1875f, 0, -0.75f, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(41.75f, -17.1875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0.1875f, 0, -0.75f, 0.1875f, 0, -0.75f, -1.1875f, -0.75f, 0, -1.1875f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(41.75f, -16.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 5, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.25f, -0.75f, 0.3125f, -0.25f, -0.75f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(41.75f, -18.1875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, -0.8125f, -0.5f, -0.75f, -0.8125f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.75f, -18.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, -0.9375f, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.75f, -17.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, -1.1875f, -0.75f, -0.75f, -1.1875f, -0.75f, -0.75f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.75f, -16.0625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.75f, -18.1875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0.1875f, 0, -0.75f, 0.1875f, 0, -0.75f, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.75f, -17.1875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0.1875f, 0, -0.75f, 0.1875f, 0, -0.75f, -1.1875f, -0.75f, 0, -1.1875f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-9.75f, -16.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 19, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-9.75f, -18.1875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, -0.8125f, -0.5f, -0.75f, -0.8125f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.75f, -18.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, -0.9375f, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.75f, -17.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, -1.1875f, -0.75f, -0.75f, -1.1875f, -0.75f, -0.75f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.75f, -16.0625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 14, 1, 0, 0.462f, 0, -0.75f, 0.327f, 0, -0.75f, 0.327f, 0, 0, 0.462f, 0, 0, 0.462f, -0.5f, -0.75f, 0.327f, -0.5f, -0.75f, 0.327f, -0.5f, 0, 0.462f, -0.5f, 0)
			.setRotationPoint(-13.75f, -14.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.077f, 1.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.077f, 1.25f, 0, -0.077f, -0.5625f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.5625f, 0, -0.077f, -0.5625f, 0)
			.setRotationPoint(45.5f, -13.625f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, -0.558f, 0, 0, -0.558f, 0, 0, -0.192f, -1, 0, -0.192f, -0.615f, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, 0, -0.615f, -0.6875f, 0)
			.setRotationPoint(-11.75f, -17.6875f, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, -1.25f, -0.75f, -0.462f, 0, -0.75f, -0.462f, 0, 0, 0, -1.25f, 0, 0, 0.5f, -0.75f, -0.462f, 0.5f, -0.75f, -0.462f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-15.75f, -14.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 56, 1, 1, 0, -0.231f, 0, -0.5f, 1.312f, 0, -0.5f, 1.312f, 0, -0.25f, -0.231f, 0, -0.25f, 1.462f, 0.375f, -0.75f, 2.327f, 0.375f, -0.75f, 2.327f, 0.375f, 0, 1.462f, 0.375f, 0)
			.setRotationPoint(-12.75f, -16.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.1875f, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(46.5f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 12, 1, 0, -0.327f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.327f, 0, -0.75f, -0.327f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.327f, -0.1875f, -0.75f)
			.setRotationPoint(45.25f, -13.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 14, 1, 0, 0.462f, 0, 0, 0.327f, 0, 0, 0.327f, 0, -0.75f, 0.462f, 0, -0.75f, 0.462f, -0.5f, 0, 0.327f, -0.5f, 0, 0.327f, -0.5f, -0.75f, 0.462f, -0.5f, -0.75f)
			.setRotationPoint(-13.75f, -14.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.077f, 1.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.077f, 1.25f, -0.75f, -0.077f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.077f, -0.5625f, -0.75f)
			.setRotationPoint(45.5f, -13.625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, -1.25f, 0, -0.462f, 0, 0, -0.462f, 0, -0.75f, 0, -1.25f, -0.75f, 0, 0.5f, 0, -0.462f, 0.5f, 0, -0.462f, 0.5f, -0.75f, 0, 0.5f, -0.75f)
			.setRotationPoint(-15.75f, -14.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.442f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, -0.308f, 0, -0.5f, -0.442f, 0, -0.5f, -0.442f, 0, -0.5f, -0.308f, 0, -0.5f, -0.308f)
			.setRotationPoint(-10.75f, -18.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, -0.192f, 0, 0, -0.192f, 0, 0, -0.558f, -1, 0, -0.558f, -0.615f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.615f, -0.6875f, -0.75f)
			.setRotationPoint(-11.75f, -17.6875f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 56, 1, 1, 0, -0.231f, 0, -0.25f, 1.312f, 0, -0.25f, 1.312f, 0, -0.5f, -0.231f, 0, -0.5f, 1.462f, 0.375f, 0, 2.327f, 0.375f, 0, 2.327f, 0.375f, -0.75f, 1.462f, 0.375f, -0.75f)
			.setRotationPoint(-12.75f, -16.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.192f, -1, 0, -0.192f, -1, 0, -0.558f, 0, 0, -0.558f, 0, -0.6875f, 0, -0.769f, -0.6875f, 0, -0.769f, -0.6875f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(42.5f, -17.6875f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, -0.5f, -0.442f, 0, -0.5f, -0.308f, 0, 0, 0, 0, -0.5f, -0.442f, 0, -0.5f, -0.442f, 0, -0.5f, -0.308f, 0, -0.5f, -0.308f)
			.setRotationPoint(42.5f, -18.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 54, 1, 1, 0, 0.385f, 0, -0.5f, 0.481f, 0, -0.5f, 0.481f, 0, -0.25f, 0.385f, 0, -0.25f, 1.769f, 0.125f, 0, 1.3125f, 0.125f, 0, 1.3125f, 0.125f, -0.75f, 1.769f, 0.125f, -0.75f)
			.setRotationPoint(-10.75f, -17.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 52, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.1875f, 0.5f, 0.25f, -0.1875f, 0.5f, 0.25f, -0.1875f, -1.25f, 0, -0.1875f, -1.25f)
			.setRotationPoint(-9.75f, -18.1875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 12, 22, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f)
			.setRotationPoint(-15.75f, -13.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 9, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(41.75f, -5.375f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 51, 7, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, 7.25f, 0.25f, -0.5f, 7.25f, 0.25f, -0.5f, -8, 0, -0.5f, -8)
			.setRotationPoint(-9.5f, -11.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 51, 7, 1, 0, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -8, 0.25f, -0.5f, -8, 0.25f, -0.5f, 7.25f, 0, -0.5f, 7.25f)
			.setRotationPoint(-9.5f, -11.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 15, 22, 0, 0, 0, -0.125f, -0.75f, -9, 0, -0.75f, -9, -0.25f, 0, 0, -0.375f, 0, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, -0.25f, 0, 0.3125f, -0.25f)
			.setRotationPoint(-9.5f, -16.1875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 4, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, -5.375f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 4, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, -5.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 532")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 541")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 0, textureX, textureY).addBox(0, 0, 0, 23, 1, 1)
			.setRotationPoint(18.75f, -3.875f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 2, -0.75f, 0, -2.75f, -0.75f, 0, -2.75f, -0.75f, -0.75f, 2, -0.75f, -0.75f)
			.setRotationPoint(-11.5f, -19.1875f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 2, -0.75f, 0, -2.75f, -0.75f, 0, -2.75f, -0.75f, -0.75f, 2, -0.75f, -0.75f)
			.setRotationPoint(-11.5f, -19.1875f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-11.625f, -20.0625f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-12.25f, -19.625f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-12.125f, -19.875f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-11.625f, -20.0625f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-12.25f, -19.625f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-12.125f, -19.875f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.0625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.25f, 0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-12.9375f, -14.6875f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.0625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.25f, 0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-11.96875f, -17.6875f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.0625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.25f, 0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-12.453125f, -16.1875f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, -0.25f, 0, 0.75f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.75f, -0.25f, -0.25f, 0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0.75f)
			.setRotationPoint(49.75f, -1.375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 160, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-41.75f, -14.0625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 160, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-41.75f, -13.625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 159, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-41.75f, -13.875f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 156, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-41.75f, -14.0625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 156, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(-41.75f, -13.625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 156, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-41.75f, -13.875f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 179, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 11, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-41.75f, -13.1875f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 156, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(-41.75f, -2.875f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 156, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-41.75f, -3.3125f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 155, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(-41.75f, -3.0625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 155, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-41.75f, -14.0625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 153, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-41.75f, -13.625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 153, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-41.75f, -13.875f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 153, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-41.75f, -14.0625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 152, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(-41.75f, -13.625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 152, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-41.75f, -13.875f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 179, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 11, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-41.75f, -13.1875f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 152, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(-41.75f, -2.875f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 152, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-41.75f, -3.3125f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 152, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(-41.75f, -3.0625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 150, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -14.0625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 150, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -13.625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 150, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -13.875f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 150, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -14.0625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 150, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(47.25f, -13.625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 149, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -13.875f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 179, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 11, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -13.1875f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 149, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(47.25f, -2.875f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 149, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(47.25f, -3.3125f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 149, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(47.25f, -3.0625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 147, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -14.0625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 147, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -13.625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 147, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -13.875f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 147, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -14.0625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 147, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(47.25f, -13.625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 146, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -13.875f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 172, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 11, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -13.1875f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 146, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(47.25f, -2.875f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 146, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(47.25f, -3.3125f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 146, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(47.25f, -3.0625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f)
			.setRotationPoint(46.375f, 0.875f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f)
			.setRotationPoint(48.625f, 0.875f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.625f, 0, -0.625f, 0.625f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, 0.625f, -0.75f, -0.625f)
			.setRotationPoint(47.625f, 0.625f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.375f, -0.625f, -0.625f)
			.setRotationPoint(46.625f, 2.3125f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f)
			.setRotationPoint(48.625f, 2.6875f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f)
			.setRotationPoint(46.375f, 2.6875f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.625f, -0.75f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f)
			.setRotationPoint(46.625f, 4.25f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0.4375f, -0.25f, -0.625f, 0.4375f, -0.25f)
			.setRotationPoint(46.375f, 0.875f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0.4375f, -0.25f, -0.625f, 0.4375f, -0.25f)
			.setRotationPoint(48.625f, 0.875f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.625f, 0, 0, 0.625f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, 0.625f, -0.75f, 0)
			.setRotationPoint(47.625f, 0.625f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.375f, -0.625f, 0)
			.setRotationPoint(46.625f, 2.3125f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0)
			.setRotationPoint(48.625f, 2.6875f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0)
			.setRotationPoint(46.375f, 2.6875f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.375f, 0, 0, -0.75f, -0.625f, -0.625f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(46.625f, 4.25f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f)
			.setRotationPoint(-44.75f, 0.875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f)
			.setRotationPoint(-42.5f, 0.875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.625f, 0, -0.625f, 0.625f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, 0.625f, -0.75f, -0.625f)
			.setRotationPoint(-43.5f, 0.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.375f, -0.625f, -0.625f)
			.setRotationPoint(-44.5f, 2.3125f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f)
			.setRotationPoint(-42.5f, 2.6875f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f)
			.setRotationPoint(-44.75f, 2.6875f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.625f, -0.75f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f)
			.setRotationPoint(-44.5f, 4.25f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0.4375f, -0.25f, -0.625f, 0.4375f, -0.25f)
			.setRotationPoint(-44.75f, 0.875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0.4375f, -0.25f, -0.625f, 0.4375f, -0.25f)
			.setRotationPoint(-42.5f, 0.875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.625f, 0, 0, 0.625f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, 0.625f, -0.75f, 0)
			.setRotationPoint(-43.5f, 0.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.375f, -0.625f, 0)
			.setRotationPoint(-44.5f, 2.3125f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0)
			.setRotationPoint(-42.5f, 2.6875f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0)
			.setRotationPoint(-44.75f, 2.6875f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.375f, 0, 0, -0.75f, -0.625f, -0.625f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-44.5f, 4.25f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 20, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-45.5f, -0.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 140, textureX, textureY).addCylinder(0, 0, 0, 2, 8, 10, 1, 1, 3, null)
			.setRotationPoint(-4.75f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 139, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.875f, 1, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-5.25f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 139, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.5f, 0.875f, 3, new Vec3f(-0.625, 0.0, 0.0))
			.setRotationPoint(-5.625f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 139, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.875f, 0.5f, 3, new Vec3f(-0.625, 0.0, 0.0))
			.setRotationPoint(3.75f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 137, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 1, 0.875f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(3.25f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 98, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 1.0625f, 1.0625f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-1.5f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.25f, 0.125f, -0.125f)
			.setRotationPoint(1.75f, 0.625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.25f, 0.125f, -0.125f)
			.setRotationPoint(-4.5f, 0.625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -0.375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -3, 0.625f, 0, 2, -0.125f, 0, 2, -0.125f, 0, -3, 0.625f, 0)
			.setRotationPoint(-7.25f, 0.625f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -2.5f, 0.4375f, 0, 2.3125f, -0.4375f, 0, 2.3125f, -0.4375f, -0.5f, -2.5f, 0.4375f, -0.5f)
			.setRotationPoint(-7.25f, 0.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -2.5f, 0.4375f, 0, 2.3125f, -0.4375f, 0, 2.3125f, -0.4375f, -0.5f, -2.5f, 0.4375f, -0.5f)
			.setRotationPoint(-7.25f, 0.625f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 160, textureX, textureY).addCylinder(0, 0, 0, 1, 18, 8, 0.75f, 0.75f, 0, null)
			.setRotationPoint(46.375f, 0.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, -0.25f, 0.125f, -0.375f)
			.setRotationPoint(3.75f, 0.625f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, -0.25f, 0.125f, -0.375f)
			.setRotationPoint(3.75f, 0.625f, 2.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 92, 2, 22, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-42, -1.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 156, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(14).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.1875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-41.75f, -13.1875f, -10).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 133, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.75f).setLength(1).setSegments(10, 0).setScale(0.625f, 0.625f).setDirection(3)
			.setTopOffset(new Vec3f(-0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-43, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 73, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.4375f, 0.5625f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(-42.9375f, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 3, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.1875f, 0.4375f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-43.0625f, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(42, -5.375f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 9, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, -2, 0, -0.75f, -1.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(44, -5.375f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 5, 0, 0, 0, 0.25f, 0, -0.5f, 0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.5f, 0.5f, 0, 0.25f, 0, 0, 0, 0)
			.setRotationPoint(40.3125f, -17.375f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 5, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.5f, 0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0.25f, 0, 0, 0.5f, 0.5f, 0, 0, 0.25f)
			.setRotationPoint(40.3125f, -17.375f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 5, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, -0.1875f, 0, 0.75f, -0.1875f, 0, 0, 0, 0, 0.5f, 0, 0, -0.25f, -0.1875f, 0, -0.75f, -0.1875f)
			.setRotationPoint(40.3125f, -17.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 0.25f, -0.1875f, 0, -0.25f, 0, 0, 0, 0, 0, -0.75f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(40.3125f, -17.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_PaintingStuff(){
		TurboList PaintingStuff = new TurboList("PaintingStuff");
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 119, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.75f, -14.875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 55, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-40.75f, -12.875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.75f, -14.875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 0, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-40.75f, -12.875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 81, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-9.25f, -16.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 81, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-9.25f, -17.375f, 10.76f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 81, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-9.25f, -18.1875f, 10.26f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 81, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-9.25f, -16.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 81, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-9.25f, -17.375f, -10.76f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 81, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-9.25f, -18.1875f, -10.26f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 136, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 7, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-42.76f, -9.375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(PaintingStuff);
	}

	private final void initGroup_CoalOverflow(){
		TurboList CoalOverflow = new TurboList("CoalOverflow");
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 242, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(41.75f, -7.875f, -2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 242, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -0.5f, -1.75f, 0, -0.5f, -1.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 1.75f, 0, -0.5f, 1.75f, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(43.25f, -7.125f, -2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 249, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -1.75f, 0, -2, -1.75f, 0.5f, 1.25f, -1, 0.5f, 0, -1, 0, -0.5f, 0.75f, 0, -3.25f, 0.75f, 0.875f, 1.25f, 0, 0.5f)
			.setRotationPoint(43.25f, -7.125f, 2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 249, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.25f, -1, 0.5f, -2, -1.75f, 0.5f, -0.5f, -1.75f, 0, 0, 0, 0, 1.25f, 0, 0.5f, -3.25f, 0.75f, 0.875f, -0.5f, 0.75f, 0, 0, -1, 0)
			.setRotationPoint(43.25f, -7.125f, -3.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 249, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -1.75f, -1.75f, 0.5f, 0, -1.75f, 0.5f, 0, 0, 0, -0.5f, 0.75f, 0, -1.75f, 1.75f, 0.5f, 0, 1.75f, 0.5f)
			.setRotationPoint(41.75f, -7.875f, 2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 249, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 0, -1.75f, 0.5f, -1.75f, -1.75f, 0.5f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 1.75f, 0.5f, -1.75f, 1.75f, 0.5f, -0.5f, 0.75f, 0, 0, 0, 0)
			.setRotationPoint(41.75f, -7.875f, -3.25f).setRotationAngle(0, 0, 0)
		);
		groups.add(CoalOverflow);
	}


	ModelNYC3AxleTenderBogie bogie = new ModelNYC3AxleTenderBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		int cargo = ((EntityNYC40ft3inTender) entity).getAmmountOfCargo();
		for (TurboList l : groups) {
			GL11.glPushMatrix();
			if (l.name.equals("Coal")) {
				GL11.glTranslatef(0,1- ((float) cargo / ((EntityNYC40ft3inTender)entity).freightInventorySize),0);
			}
			else if (l.name.equals("CoalOverflow") && cargo < 4) {
				GL11.glPopMatrix();
				continue;
			}
			for (ModelRendererTurbo t : l) {
				t.render(f5);
			}
			GL11.glPopMatrix();
		}

		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/nyc_3axle_tender_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.5625f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslatef(1.8125f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
