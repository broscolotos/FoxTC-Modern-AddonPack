//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.tender;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelNYC3AxleTenderBogie;
import tcmodern.common.entities.tender.EntityNYC46ft4inTender;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNYC46ft4inTender extends FVTMFormatBase {

	public ModelNYC46ft4inTender(){
		super();
		textureX = 256;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_scoop();
		initGroup_scooppiping();
		initGroup_CoalOverflow();
		initGroup_Coal();
		initGroup_scoopBracket1();
		initGroup_clipboard();
		initGroup_PaintingStuff();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_scoop(){
		TurboList scoop = new TurboList("scoop");
		scoop.add(new ModelRendererTurbo(scoop, 215, 12, textureX, textureY)
			.addShapeBox(0, -0.125f, 0, 4, 1, 4, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 135, 107, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 156, 55, textureX, textureY)
			.addShapeBox(0, -0.5f, 4, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 171, 104, textureX, textureY)
			.addShapeBox(3.875f, -0.125f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 226, 49, textureX, textureY)
			.addShapeBox(3.875f, -0.5f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 248, 21, textureX, textureY)
			.addShapeBox(3.875f, -0.5f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 187, 103, textureX, textureY)
			.addShapeBox(5.625f, -0.375f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 249, 8, textureX, textureY)
			.addShapeBox(5.625f, -0.75f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.375f, 0, -0.125f, 0.375f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 227, 8, textureX, textureY)
			.addShapeBox(5.625f, -0.75f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.375f, 0, -0.125f, 0.375f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 242, 49, textureX, textureY)
			.addShapeBox(7.375f, -0.75f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 249, 5, textureX, textureY)
			.addShapeBox(7.375f, -1.125f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		scoop.add(new ModelRendererTurbo(scoop, 227, 5, textureX, textureY)
			.addShapeBox(7.375f, -1.125f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		groups.add(scoop);
	}

	private final void initGroup_scooppiping(){
		TurboList scooppiping = new TurboList("scooppiping");
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 1, 1, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-43.875f, 0.6875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 1, 1, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-43.875f, 1.1875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 179, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0.375f, 0, -0.625f, 0.0625f, 0, -0.625f, 0.0625f, 0, 0, 0.375f, 0, 0, 0.375f, -0.625f, -0.625f, 0.0625f, -0.625f, -0.625f, 0.0625f, -0.625f, 0, 0.375f, -0.625f, 0)
			.setRotationPoint(-21.875f, 1.6875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 189, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0)
			.setRotationPoint(-22.0625f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 181, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0)
			.setRotationPoint(-14.3125f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 250, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0)
			.setRotationPoint(-3.0625f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 234, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0)
			.setRotationPoint(8.1875f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 218, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(18.9375f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 200, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(25.9375f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 164, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(34.1875f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 250, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(42.3125f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 234, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(-32.6875f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 218, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(-26.9375f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, 0.5f, 0, -0.375f, 0.5f, 0, -0.25f, 0, 0, 0, 0, -0.625f, -0.625f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f, -0.25f, 0, -0.625f, 0)
			.setRotationPoint(44.625f, 0.6875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 235, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.75f, 0, -0.125f, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.75f, -0.625f, -0.125f, 0, -0.625f, 0)
			.setRotationPoint(46.125f, 0.6875f, 9.125f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, 0.4375f, 0.5f, -0.4375f, 0.4375f, 0.5f, -0.25f, 0, 0, 0, 0, -0.625f, -0.625f, 0.4375f, -1.125f, -0.4375f, 0.4375f, -1.125f, -0.25f, 0, -0.625f, 0)
			.setRotationPoint(44.625f, 1.1875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 235, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0)
			.setRotationPoint(-22.9375f, 0.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 222, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0)
			.setRotationPoint(-22.9375f, 1.0625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0)
			.setRotationPoint(-22.9375f, 1.5625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 235, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f)
			.setRotationPoint(-22.9375f, 2.3125f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0)
			.setRotationPoint(10.5625f, 0.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 235, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0)
			.setRotationPoint(10.5625f, 1.0625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0)
			.setRotationPoint(10.5625f, 1.5625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 235, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f)
			.setRotationPoint(10.5625f, 2.3125f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0)
			.setRotationPoint(9.875f, 0.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 235, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0)
			.setRotationPoint(9.875f, 1.0625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.625f, -0.3125f, 0.0625f, -0.625f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(9.875f, 1.5625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 222, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f)
			.setRotationPoint(9.875f, 2.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0)
			.setRotationPoint(-43.6875f, 0.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 145, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.625f, 0.375f, 0, -2.5f, 0.375f, 0, 1.875f, 0, 0, 0, 0, -0.625f, -0.625f, 0.375f, -0.625f, -2.5f, 0.375f, -0.625f, 1.875f, 0, -0.625f, 0)
			.setRotationPoint(-48.25f, 0.6875f, 7.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 237, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.625f, 0.375f, 0, -2.5f, 0.375f, 0, 1.875f, 0, 0, 0, 0, -0.625f, -0.625f, 0.375f, -0.625f, -2.5f, 0.375f, -0.625f, 1.875f, 0, -0.625f, 0)
			.setRotationPoint(-48.25f, 1.1875f, 7.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-43.875f, 0.6875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-43.875f, 1.1875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 179, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0.375f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.625f, 0.375f, 0, -0.625f, 0.375f, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, -0.625f, 0.375f, -0.625f, -0.625f)
			.setRotationPoint(-21.875f, 1.6875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 222, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f)
			.setRotationPoint(-22.0625f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 161, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f)
			.setRotationPoint(-14.3125f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f)
			.setRotationPoint(-3.0625f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 145, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, -0.375f, -0.3125f, -0.4375f, -0.375f)
			.setRotationPoint(8.1875f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 161, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(18.9375f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 145, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(25.9375f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 145, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(34.1875f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 145, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(42.3125f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 145, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(-32.6875f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 251, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(-26.9375f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 16, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, -0.25f, 0.5f, 0, -0.375f, 0, 0, -0.625f, 0, -0.625f, 0, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.375f, 0, -0.625f, -0.625f)
			.setRotationPoint(44.625f, 0.6875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, -0.125f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.75f, -0.625f, -0.125f, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(46.125f, 0.6875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.4375f, 0.5f, -0.25f, 0.4375f, 0.5f, -0.4375f, 0, 0, -0.625f, 0, -0.625f, 0, 0.4375f, -1.125f, -0.25f, 0.4375f, -1.125f, -0.4375f, 0, -0.625f, -0.625f)
			.setRotationPoint(44.625f, 1.1875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 166, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(46.125f, 0.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 250, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f)
			.setRotationPoint(-22.9375f, 0.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 237, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f)
			.setRotationPoint(-22.9375f, 1.0625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 215, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f)
			.setRotationPoint(-22.9375f, 1.5625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-22.9375f, 2.3125f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 237, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f)
			.setRotationPoint(10.5625f, 0.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 215, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f)
			.setRotationPoint(10.5625f, 1.0625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f)
			.setRotationPoint(10.5625f, 1.5625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 237, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(10.5625f, 2.3125f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 215, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, 0, -0.3125f, -0.9375f, -0.625f, -0.3125f, -0.9375f, -0.625f)
			.setRotationPoint(9.875f, 0.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, -0.875f, -0.625f)
			.setRotationPoint(9.875f, 1.0625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 237, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.625f, -0.3125f, 0.0625f, -0.625f)
			.setRotationPoint(9.875f, 1.5625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 215, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(9.875f, 2.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, 0, -0.3125f, 0.0625f, -0.375f, -0.3125f, 0.0625f, -0.375f)
			.setRotationPoint(-43.6875f, 0.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 11, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.375f, 0, 1.875f, 0.375f, 0, -2.5f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 1.875f, 0.375f, -0.625f, -2.5f, 0, -0.625f, -0.625f)
			.setRotationPoint(-48.25f, 0.6875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		scooppiping.add(new ModelRendererTurbo(scooppiping, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.375f, 0, 1.875f, 0.375f, 0, -2.5f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 1.875f, 0.375f, -0.625f, -2.5f, 0, -0.625f, -0.625f)
			.setRotationPoint(-48.25f, 1.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(scooppiping);
	}

	private final void initGroup_CoalOverflow(){
		TurboList CoalOverflow = new TurboList("CoalOverflow");
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 195, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0.1f, 0, -0.5f, 0.85f, 0, -0.5f, 0.85f, 0.5f, 0, 0.1f, 0.5f)
			.setRotationPoint(41.75f, -7.875f, -2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 195, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -0.5f, -1.75f, 0, -0.5f, -1.75f, 0.5f, 0, 0, 0.5f, 0, 0.1f, 0, -0.5f, 1.85f, 0, -0.5f, 1.85f, 0.5f, 0, 0.1f, 0.5f)
			.setRotationPoint(43.25f, -7.125f, -2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 198, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -1.75f, 0, -2, -1.75f, 0.5f, 1.25f, -1, 0.5f, 0, -1, 0, -0.5f, 0.75f, 0, -3.25f, 0.75f, 0.875f, 1.25f, 0, 0.5f)
			.setRotationPoint(43.25f, -7.125f, 2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 198, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.25f, -1, 0.5f, -2, -1.75f, 0.5f, -0.5f, -1.75f, 0, 0, 0, 0, 1.25f, 0, 0.5f, -3.25f, 0.75f, 0.875f, -0.5f, 0.75f, 0, 0, -1, 0)
			.setRotationPoint(43.25f, -7.125f, -3.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 198, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -1.75f, -1.75f, 0.5f, 0, -1.75f, 0.5f, 0, 0, 0, -0.5f, 0.75f, 0, -1.75f, 1.75f, 0.5f, 0, 1.75f, 0.5f)
			.setRotationPoint(41.75f, -7.875f, 2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 198, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 0, -1.75f, 0.5f, -1.75f, -1.75f, 0.5f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 1.75f, 0.5f, -1.75f, 1.75f, 0.5f, -0.5f, 0.75f, 0, 0, 0, 0)
			.setRotationPoint(41.75f, -7.875f, -3.25f).setRotationAngle(0, 0, 0)
		);
		groups.add(CoalOverflow);
	}

	private final void initGroup_Coal(){
		TurboList Coal = new TurboList("Coal");
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -1.15f, 0, 0, -1.4f, 0)
			.setRotationPoint(-6.6875f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, -0.25f, 0, 0, 1, -0.1875f, 0, 0.75f, -0.1875f, 0, 0.1f, 0, 0, 0.35f, 0, 0, -0.9f, -0.1875f, 0, -0.65f, -0.1875f)
			.setRotationPoint(-6.6875f, -19.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.9f, 0, 0, -1.15f, 0)
			.setRotationPoint(-1.6875f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, 0.35f, 0, 0, 0.6f, 0, 0, -0.65f, -0.1875f, 0, -0.9f, -0.1875f)
			.setRotationPoint(-1.6875f, -19.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(3.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, -0.1875f, 0, 0.75f, -0.1875f, 0, 0.6f, 0, 0, 0.6f, 0, 0, -0.9f, -0.1875f, 0, -0.65f, -0.1875f)
			.setRotationPoint(3.3125f, -19.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -1.15f, 0, 0, -0.9f, 0)
			.setRotationPoint(8.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1.5f, 0, 0, -1.25f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 1.6f, 0, 0, 1.35f, 0, 0, 0.1f, -0.1875f, 0, 0.1f, -0.1875f)
			.setRotationPoint(8.3125f, -20.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -1.4f, 0, 0, -1.15f, 0)
			.setRotationPoint(13.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1.25f, 0, 0, -1, 0, 0, 0.25f, -0.1875f, 0, 0, -0.1875f, 0, 1.35f, 0, 0, 1.1f, 0, 0, -0.15f, -0.1875f, 0, 0.1f, -0.1875f)
			.setRotationPoint(13.3125f, -20.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -1.4f, 0, 0, -1.4f, 0)
			.setRotationPoint(18.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, 1.1f, 0, 0, 1.1f, 0, 0, 0.1f, -0.1875f, 0, -0.15f, -0.1875f)
			.setRotationPoint(18.3125f, -20.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -1.15f, 0, 0, -1.4f, 0)
			.setRotationPoint(23.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.5f, 0, 0, -0.75f, 0, 0, 0.25f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.6f, 0, 0, 0.85f, 0, 0, -0.15f, -0.1875f, 0, -0.4f, -0.1875f)
			.setRotationPoint(23.3125f, -19.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 1.25f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.65f, 0, 0, -1.15f, 0)
			.setRotationPoint(28.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.75f, 0, 0, -1.25f, 0, 0, -0.25f, -0.1875f, 0, 0.25f, -0.1875f, 0, 0.85f, 0, 0, 1.35f, 0, 0, 0.35f, -0.1875f, 0, -0.15f, -0.1875f)
			.setRotationPoint(28.3125f, -19.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0, 0, -0.65f, 0)
			.setRotationPoint(33.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, 0, -0.1875f, 0, 0.75f, -0.1875f, 0, 0.35f, 0, 0, 0.85f, 0, 0, 0.1f, -0.1875f, 0, -0.65f, -0.1875f)
			.setRotationPoint(33.3125f, -18.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 193, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 5, 0, 0, 0, 0, 0.5f, -0.5f, 0.25f, 0.5f, -0.5f, 0, 0, 0.25f, 0, 0, 0.1f, 0, 0.5f, 0.6f, 0.25f, 0.5f, 0.6f, 0, 0, -0.15f, 0)
			.setRotationPoint(38.3125f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 193, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 5, 0, 0, 0.25f, 0, 0.5f, -0.5f, 0, 0.5f, 0.25f, -0.1875f, 0, 1, -0.1875f, 0, -0.15f, 0, 0.5f, 0.6f, 0, 0.5f, -0.15f, -0.1875f, 0, -0.9f, -0.1875f)
			.setRotationPoint(38.3125f, -17.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 1, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, -0.25f, 0, 0.625f, 0.1875f, 0, 1, -0.65f, -0.1875f, 0, -0.9f, -0.1875f, 0, 0.35f, 0, 0.625f, -0.0875f, 0)
			.setRotationPoint(-21.6875f, -19.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, -0.1875f, 0, 1, -0.1875f, 0, 0, 0, 0, 0.25f, 0, 0, -1.4f, -0.1875f, 0, -0.9f, -0.1875f, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-16.6875f, -18.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, -0.1875f, 0, 1.25f, -0.1875f, 0, 0.5f, 0, 0, 0, 0, 0, -0.9f, -0.1875f, 0, -1.15f, -0.1875f, 0, -0.4f, 0, 0, 0.1f, 0)
			.setRotationPoint(-11.6875f, -18.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, -0.25f, 0, 0, 0, 0, 0, -0.65f, -0.1875f, 0, -0.9f, -0.1875f, 0, 0.35f, 0, 0, 0.1f, 0)
			.setRotationPoint(-6.6875f, -19.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, -0.1875f, 0, 0.75f, -0.1875f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.9f, -0.1875f, 0, -0.65f, -0.1875f, 0, 0.6f, 0, 0, 0.35f, 0)
			.setRotationPoint(-1.6875f, -19.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, -0.1875f, 0, -0.9f, -0.1875f, 0, 0.6f, 0, 0, 0.6f, 0)
			.setRotationPoint(3.3125f, -19.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -1.25f, 0, 0, -1.5f, 0, 0, 0.1f, -0.1875f, 0, 0.1f, -0.1875f, 0, 1.35f, 0, 0, 1.6f, 0)
			.setRotationPoint(8.3125f, -20.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, -1, 0, 0, -1.25f, 0, 0, 0.1f, -0.1875f, 0, -0.15f, -0.1875f, 0, 1.1f, 0, 0, 1.35f, 0)
			.setRotationPoint(13.3125f, -20.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, -0.1875f, 0, 0, -0.1875f, 0, -1, 0, 0, -1, 0, 0, -0.15f, -0.1875f, 0, 0.1f, -0.1875f, 0, 1.1f, 0, 0, 1.1f, 0)
			.setRotationPoint(18.3125f, -20.375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.5f, -0.1875f, 0, 0.25f, -0.1875f, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.4f, -0.1875f, 0, -0.15f, -0.1875f, 0, 0.85f, 0, 0, 0.6f, 0)
			.setRotationPoint(23.3125f, -19.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -1.25f, 0, 0, -0.75f, 0, 0, -0.15f, -0.1875f, 0, 0.35f, -0.1875f, 0, 1.35f, 0, 0, 0.85f, 0)
			.setRotationPoint(28.3125f, -19.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 0, -0.1875f, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.65f, -0.1875f, 0, 0.1f, -0.1875f, 0, 0.85f, 0, 0, 0.35f, 0)
			.setRotationPoint(33.3125f, -18.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 193, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 5, 0, 0, 1, -0.1875f, 0.5f, 0.25f, -0.1875f, 0.5f, -0.5f, 0, 0, 0.25f, 0, 0, -0.9f, -0.1875f, 0.5f, -0.15f, -0.1875f, 0.5f, 0.6f, 0, 0, -0.15f, 0)
			.setRotationPoint(38.3125f, -17.875f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0.625f, 1.6875f, 0, 0, 1.25f, 0, 0, 0, 0, -0.125f, 0, 0, 0.625f, -1.5875f, 0, 0, -1.15f, 0, 0, 0.1f, 0, -0.125f, 0.1f, 0)
			.setRotationPoint(-21.6875f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.15f, 0, 0, -0.9f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(-16.6875f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -1.4f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(-11.6875f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.4f, 0, 0, -1.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(-6.6875f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.15f, 0, 0, -0.9f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(-1.6875f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(3.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -1.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(8.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.15f, 0, 0, -1.4f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(13.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.4f, 0, 0, -1.4f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(18.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.4f, 0, 0, -1.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(23.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1.15f, 0, 0, -0.65f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(28.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(33.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 193, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 5, 0, 0, 0.25f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.25f, 0, 0, 0, 0, -0.15f, 0, 0.5f, 0.6f, 0, 0.5f, 0.6f, 0.25f, 0, 0.1f, 0)
			.setRotationPoint(38.3125f, -17.875f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1.25f, -0.1875f, 0, 1, -0.1875f, 0, 0.1f, 0, 0, -0.4f, 0, 0, -1.15f, -0.1875f, 0, -0.9f, -0.1875f)
			.setRotationPoint(-11.6875f, -18.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, -0.125f, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0.625f, 1.6875f, 0, -0.125f, 0.1f, 0, 0, 0.1f, 0, 0, -1.15f, 0, 0.625f, -1.5875f, 0)
			.setRotationPoint(-21.6875f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.9f, 0, 0, -1.15f, 0)
			.setRotationPoint(-16.6875f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -1.4f, 0, 0, -0.9f, 0)
			.setRotationPoint(-11.6875f, -17.875f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0.625f, 0.1875f, 0, 0, -0.25f, 0, 0, 1, -0.1875f, 1, 0.75f, -0.1875f, 0.625f, -0.0875f, 0, 0, 0.35f, 0, 0, -0.9f, -0.1875f, 1, -0.65f, -0.1875f)
			.setRotationPoint(-21.6875f, -19.375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 191, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, 0, 0, 0, 0, 0, 1, -0.1875f, 0, 1.5f, -0.1875f, 0, -0.15f, 0, 0, 0.1f, 0, 0, -0.9f, -0.1875f, 0, -1.4f, -0.1875f)
			.setRotationPoint(-16.6875f, -18.875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		groups.add(Coal);
	}

	private final void initGroup_scoopBracket1(){
		TurboList scoopBracket1 = new TurboList("scoopBracket1");
		scoopBracket1.add(new ModelRendererTurbo(scoopBracket1, 181, 127, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 6, 1, 0, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f)
			.setRotationPoint(1.375f, 4.375f, -3.125f).setRotationAngle(0, 0, 98)
		);
		scoopBracket1.add(new ModelRendererTurbo(scoopBracket1, 205, 123, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 6, 1, 0, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f)
			.setRotationPoint(1.375f, 4.375f, 2.125f).setRotationAngle(0, 0, 98)
		);
		groups.add(scoopBracket1);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.75f, -13.1875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-46.75f, -13.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 12, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-45.75f, -13.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 42, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-45.75f, -13.4375f, -10).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 202, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(14).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.1875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-45.75f, -13.1875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 37, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-45.75f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 20, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.25f, -1.375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-45.75f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-45.75f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-28.75f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-28.75f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.308f, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.442f, 0, -0.5f, -0.308f, 0, -0.5f, -0.308f, 0, -0.5f, -0.442f, 0, -0.5f, -0.442f)
			.setRotationPoint(-22.75f, -18.1875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0.1875f, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(46.5f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.558f, -1, 0, -0.558f, -1, 0, -0.192f, 0, 0, -0.192f, 0, -0.6875f, -0.75f, -0.769f, -0.6875f, -0.75f, -0.769f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(42.5f, -17.6875f, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, -0.308f, 0, -0.5f, -0.442f, 0, 0, -0.75f, 0, -0.5f, -0.308f, 0, -0.5f, -0.308f, 0, -0.5f, -0.442f, 0, -0.5f, -0.442f)
			.setRotationPoint(42.5f, -18.1875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 12, 1, 0, -0.327f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.327f, 0, 0, -0.327f, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, 0, -0.327f, -0.1875f, 0)
			.setRotationPoint(45.25f, -13.1875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 201, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(12).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.1875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.25f, -13.1875f, -10).setRotationAngle(0, 180, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(47.25f, -13.1875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(48, -13.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 11, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.25f, -13.4375f, -10).setRotationAngle(0, 180, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 201, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(12).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.1875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.25f, -13.1875f, 10).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 10, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.25f, -13.4375f, 10).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(47.25f, -13.1875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(48, -13.4375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, 0, 0, -4.75f, 0, 0, -4.75f, -0.75f, 0, 0, -0.75f, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, -0.75f, 0, 0.3125f, -0.75f)
			.setRotationPoint(42, -18.1875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(48, -13.375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, -0.75f, 0, -4.75f, -0.75f, 0, -4.75f, 0, 0, 0, 0, 0, 0.3125f, -0.75f, 0, 0.3125f, -0.75f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(42, -18.1875f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, -0.25f, 0, 0.3125f, -0.25f)
			.setRotationPoint(41.75f, -18.1875f, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(48, -13.375f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 12, 6, 0, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.0625f, 0.25f, -0.1875f, -0.0625f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(42, -13.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 12, 6, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, 0.25f, -0.1875f, -0.0625f, 0, -0.1875f, -0.0625f)
			.setRotationPoint(42, -13.1875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(49, -0.375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 9, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, 0.5f, 0, 0.3125f, 0.5f)
			.setRotationPoint(41.75f, -18.1875f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(41.75f, -7.875f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, -0.75f, 0.5f, 0.5f, -0.75f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(41.75f, -7.875f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, -1, 0, 0, -1, 0, -0.3125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, 0.5f, 0, -0.3125f, 0.5f)
			.setRotationPoint(41.75f, -18.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, -3, -0.75f, 0, -3, -0.75f, 0, -3, 0, 0, -3, 0, -0.375f, -1, -0.75f, -0.375f, -1, -0.75f, -0.375f, -1, 0, -0.375f, -1)
			.setRotationPoint(41.75f, -19.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -4, -0.75f, 0, -4, -0.75f, 0, -4, 0, 0, -4, 0, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, 0, -0.625f, -1)
			.setRotationPoint(41.75f, -19.875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0.5f, 0, -0.125f, 0.5f)
			.setRotationPoint(-21.75f, -19.0625f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0.5f, 0, -3, -1.25f, 0, -3, -1.25f, 0, -3, 0.5f, 0, -3, 0, -0.125f, -1, -0.75f, -0.125f, -1, -0.75f, -0.125f, -1, 0, -0.125f, -1)
			.setRotationPoint(-22.25f, -19.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0.5f, 0, -4, -1.25f, 0, -4, -1.25f, 0, -4, 0.5f, 0, -4, 0, -0.125f, -1, -0.75f, -0.125f, -1, -0.75f, -0.125f, -1, 0, -0.125f, -1)
			.setRotationPoint(-22.75f, -20.8125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.5f, -16.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-45.75f, -16.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-46.625f, -17.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-46.375f, -17.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.5625f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, -0.75f, 0, -0.5625f, -0.75f)
			.setRotationPoint(-45.75f, -16.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-45.875f, -16.875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-47.625f, -17.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-48.25f, -16.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-48.125f, -16.875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.5f, -16.1875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-45.75f, -16.1875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-46.625f, -17.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-46.375f, -17.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.5625f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.5625f, -0.75f, 0, -0.5625f, -0.75f)
			.setRotationPoint(-45.75f, -16.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-45.875f, -16.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-47.625f, -17.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-48.25f, -16.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-48.125f, -16.875f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-46.625f, -4.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(-47.625f, -4.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-48.25f, -4.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(-48.125f, -4.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-46.625f, -4.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(-47.625f, -4.0625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-48.25f, -4.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(-48.125f, -4.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-47.5f, -4.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-47.5f, -6.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-47.5f, -10.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-47.5f, -8.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-47.5f, -12.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-47.5f, -14.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-44.5625f, -14.5f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-42.375f, -14.5f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-34.875f, -14.5f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-26.375f, -14.5f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-44.5f, -14.125f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-42.3125f, -14.125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.3125f, -14.4375f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-34.8125f, -14.125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-26.3125f, -14.125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-43.5f, -14.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-42.375f, -14.5f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-34.875f, -14.5f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-26.375f, -14.5f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, -0.75f, -0.0625f, -0.75f, -0.75f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-42.3125f, -14.125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, -0.75f, -0.0625f, -0.75f, -0.75f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-34.8125f, -14.125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, -0.75f, -0.0625f, -0.75f, -0.75f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-26.3125f, -14.125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.125f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-43.5f, -14.4375f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-44.5f, -14.4375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 5, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-43.5f, -14.4375f, -9).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-43.5f, -14.4375f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-44.5625f, -14.5f, 3.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f)
			.setRotationPoint(-44.5f, -14.125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-37.875f, -13.4375f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.3125f, -14.4375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-37.875f, -13.4375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-36, -13.3125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 185, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-34.5f, -13.3125f, -3.5f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 184, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-34, -13.3125f, -3.5f).setRotationAngle(0, 180, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0.5f, 0, -0.875f, 0.5f)
			.setRotationPoint(-34.5f, -13.3125f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0.5f, 0, -0.875f, 0.5f)
			.setRotationPoint(-34.5f, -13.3125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 179, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-34.5f, -13.3125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 179, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-34, -13.3125f, 3.5f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-36, -13.375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f)
			.setRotationPoint(-35.5f, -13.375f, -2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-36, -13.375f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-35.5f, -13.375f, 1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0.0625f, -0.875f, -0.6875f, -0.6875f, -0.875f, -0.6875f, -0.6875f, -0.875f, 0.0625f, 0.0625f, -0.875f, 0.0625f)
			.setRotationPoint(-33.25f, -13.4375f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(-33.25f, -13.625f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0.0625f, -0.6875f, -0.875f, 0.0625f, -0.6875f, -0.875f, -0.6875f, 0.0625f, -0.875f, -0.6875f)
			.setRotationPoint(-33.25f, -13.4375f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(-33.25f, -13.625f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-33.25f, -13.875f, -0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 66, 1, 1, 0, 0.385f, 0, -0.25f, 0.481f, 0, -0.25f, 0.481f, 0, -0.5f, 0.385f, 0, -0.5f, 1.769f, 0.125f, -0.75f, 1.3125f, 0.125f, -0.75f, 1.3125f, 0.125f, 0, 1.769f, 0.125f, 0)
			.setRotationPoint(-22.75f, -17.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 64, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -1.25f, 0.25f, -0.1875f, -1.25f, 0.25f, -0.1875f, 0.5f, 0, -0.1875f, 0.5f)
			.setRotationPoint(-21.75f, -18.1875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(41.75f, -18.1875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0.1875f, 0, -0.75f, 0.1875f, 0, -0.75f, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(41.75f, -17.1875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0.1875f, 0, -0.75f, 0.1875f, 0, -0.75f, -1.1875f, -0.75f, 0, -1.1875f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(41.75f, -16.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 5, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.25f, -0.75f, 0.3125f, -0.25f, -0.75f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(41.75f, -18.1875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, -0.8125f, -0.5f, -0.75f, -0.8125f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.75f, -18.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, -0.9375f, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.75f, -17.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, -1.1875f, -0.75f, -0.75f, -1.1875f, -0.75f, -0.75f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.75f, -16.0625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-21.75f, -18.1875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0.1875f, 0, -0.75f, 0.1875f, 0, -0.75f, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-21.75f, -17.1875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0.1875f, 0, -0.75f, 0.1875f, 0, -0.75f, -1.1875f, -0.75f, 0, -1.1875f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-21.75f, -16.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 19, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-21.75f, -18.1875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, -0.8125f, -0.5f, -0.75f, -0.8125f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.75f, -18.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, -0.9375f, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.75f, -17.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, -1.1875f, -0.75f, -0.75f, -1.1875f, -0.75f, -0.75f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.75f, -16.0625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 14, 1, 0, 0.462f, 0, -0.75f, 0.327f, 0, -0.75f, 0.327f, 0, 0, 0.462f, 0, 0, 0.462f, -0.5f, -0.75f, 0.327f, -0.5f, -0.75f, 0.327f, -0.5f, 0, 0.462f, -0.5f, 0)
			.setRotationPoint(-25.75f, -14.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.077f, 1.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.077f, 1.25f, 0, -0.077f, -0.5625f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.5625f, 0, -0.077f, -0.5625f, 0)
			.setRotationPoint(45.5f, -13.625f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, -0.558f, 0, 0, -0.558f, 0, 0, -0.192f, -1, 0, -0.192f, -0.615f, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, 0, -0.615f, -0.6875f, 0)
			.setRotationPoint(-23.75f, -17.6875f, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, -1.25f, -0.75f, -0.462f, 0, -0.75f, -0.462f, 0, 0, 0, -1.25f, 0, 0, 0.5f, -0.75f, -0.462f, 0.5f, -0.75f, -0.462f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-27.75f, -14.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 1, 1, 0, -0.231f, 0, -0.5f, 1.312f, 0, -0.5f, 1.312f, 0, -0.25f, -0.231f, 0, -0.25f, 1.462f, 0.375f, -0.75f, 2.327f, 0.375f, -0.75f, 2.327f, 0.375f, 0, 1.462f, 0.375f, 0)
			.setRotationPoint(-24.75f, -16.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.1875f, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(46.5f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 12, 1, 0, -0.327f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.327f, 0, -0.75f, -0.327f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.327f, -0.1875f, -0.75f)
			.setRotationPoint(45.25f, -13.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 14, 1, 0, 0.462f, 0, 0, 0.327f, 0, 0, 0.327f, 0, -0.75f, 0.462f, 0, -0.75f, 0.462f, -0.5f, 0, 0.327f, -0.5f, 0, 0.327f, -0.5f, -0.75f, 0.462f, -0.5f, -0.75f)
			.setRotationPoint(-25.75f, -14.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.077f, 1.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.077f, 1.25f, -0.75f, -0.077f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.077f, -0.5625f, -0.75f)
			.setRotationPoint(45.5f, -13.625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, -1.25f, 0, -0.462f, 0, 0, -0.462f, 0, -0.75f, 0, -1.25f, -0.75f, 0, 0.5f, 0, -0.462f, 0.5f, 0, -0.462f, 0.5f, -0.75f, 0, 0.5f, -0.75f)
			.setRotationPoint(-27.75f, -14.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.442f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, -0.308f, 0, -0.5f, -0.442f, 0, -0.5f, -0.442f, 0, -0.5f, -0.308f, 0, -0.5f, -0.308f)
			.setRotationPoint(-22.75f, -18.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, -0.192f, 0, 0, -0.192f, 0, 0, -0.558f, -1, 0, -0.558f, -0.615f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.615f, -0.6875f, -0.75f)
			.setRotationPoint(-23.75f, -17.6875f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 1, 1, 0, -0.231f, 0, -0.25f, 1.312f, 0, -0.25f, 1.312f, 0, -0.5f, -0.231f, 0, -0.5f, 1.462f, 0.375f, 0, 2.327f, 0.375f, 0, 2.327f, 0.375f, -0.75f, 1.462f, 0.375f, -0.75f)
			.setRotationPoint(-24.75f, -16.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.192f, -1, 0, -0.192f, -1, 0, -0.558f, 0, 0, -0.558f, 0, -0.6875f, 0, -0.769f, -0.6875f, 0, -0.769f, -0.6875f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(42.5f, -17.6875f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, -0.5f, -0.442f, 0, -0.5f, -0.308f, 0, 0, 0, 0, -0.5f, -0.442f, 0, -0.5f, -0.442f, 0, -0.5f, -0.308f, 0, -0.5f, -0.308f)
			.setRotationPoint(42.5f, -18.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 66, 1, 1, 0, 0.385f, 0, -0.5f, 0.481f, 0, -0.5f, 0.481f, 0, -0.25f, 0.385f, 0, -0.25f, 1.769f, 0.125f, 0, 1.3125f, 0.125f, 0, 1.3125f, 0.125f, -0.75f, 1.769f, 0.125f, -0.75f)
			.setRotationPoint(-22.75f, -17.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 64, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.1875f, 0.5f, 0.25f, -0.1875f, 0.5f, 0.25f, -0.1875f, -1.25f, 0, -0.1875f, -1.25f)
			.setRotationPoint(-21.75f, -18.1875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 12, 22, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f)
			.setRotationPoint(-27.75f, -13.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 9, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(41.75f, -5.375f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 63, 7, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, 7.25f, 0.25f, -0.5f, 7.25f, 0.25f, -0.5f, -8, 0, -0.5f, -8)
			.setRotationPoint(-21.5f, -11.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 63, 7, 1, 0, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -8, 0.25f, -0.5f, -8, 0.25f, -0.5f, 7.25f, 0, -0.5f, 7.25f)
			.setRotationPoint(-21.5f, -11.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 15, 22, 0, 0, 0, -0.125f, -0.75f, -9, 0, -0.75f, -9, -0.25f, 0, 0, -0.375f, 0, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, -0.25f, 0, 0.3125f, -0.25f)
			.setRotationPoint(-21.5f, -16.1875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 4, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.75f, -5.375f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 4, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.75f, -5.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 532")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 541")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.75f, -4.875f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 25, textureX, textureY).addBox(0, 0, 0, 35, 1, 1)
			.setRotationPoint(6.75f, -3.875f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 2, -0.75f, 0, -2.75f, -0.75f, 0, -2.75f, -0.75f, -0.75f, 2, -0.75f, -0.75f)
			.setRotationPoint(-23.5f, -19.1875f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 2, -0.75f, 0, -2.75f, -0.75f, 0, -2.75f, -0.75f, -0.75f, 2, -0.75f, -0.75f)
			.setRotationPoint(-23.5f, -19.1875f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-23.625f, -20.0625f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-24.25f, -19.625f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-24.125f, -19.875f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-23.625f, -20.0625f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-24.25f, -19.625f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-24.125f, -19.875f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.0625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.25f, 0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-24.9375f, -14.6875f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.0625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.25f, 0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-23.96875f, -17.6875f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.0625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.25f, 0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-24.453125f, -16.1875f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, -0.25f, 0, 0.75f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.75f, -0.25f, -0.25f, 0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0.75f)
			.setRotationPoint(49.75f, -1.375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 169, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-45.75f, -14.0625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 169, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-45.75f, -13.625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 168, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-45.75f, -13.875f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 168, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-45.75f, -14.0625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 164, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(-45.75f, -13.625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 164, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-45.75f, -13.875f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 191, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 11, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-45.75f, -13.1875f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 164, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(-45.75f, -2.875f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 164, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-45.75f, -3.3125f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 163, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(-45.75f, -3.0625f, -10).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 161, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(-45.75f, -14.0625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 161, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-45.75f, -13.625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 161, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-45.75f, -13.875f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 161, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-45.75f, -14.0625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 161, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(-45.75f, -13.625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 161, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-45.75f, -13.875f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 191, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 11, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(-45.75f, -13.1875f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 160, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(-45.75f, -2.875f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 158, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-45.75f, -3.3125f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 158, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(-45.75f, -3.0625f, 10).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 158, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -14.0625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 158, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -13.625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 158, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -13.875f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 158, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -14.0625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 158, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(47.25f, -13.625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 158, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -13.875f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 176, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 11, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -13.1875f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 157, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(47.25f, -2.875f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 153, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(47.25f, -3.3125f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 152, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(47.25f, -3.0625f, -10).setRotationAngle(0, -135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 151, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -14.0625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 151, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -13.625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 151, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -13.875f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 148, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -14.0625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 148, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(47.25f, -13.625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 148, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.125f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.25f, -13.875f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 171, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 11, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f)
			.setRotationPoint(47.25f, -13.1875f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 145, textureX, textureY)
			.addShapeBox(-1.75f, 0, -0.125f, 1, 1, 1, 0, -0.5f, -0.5625f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.5f, -0.5625f, -0.75f, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.1875f, -0.75f)
			.setRotationPoint(47.25f, -2.875f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 142, textureX, textureY)
			.addShapeBox(-2.375f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.875f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(47.25f, -3.3125f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 141, textureX, textureY)
			.addShapeBox(-2.25f, 0, -0.125f, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f)
			.setRotationPoint(47.25f, -3.0625f, 10).setRotationAngle(0, 135, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f)
			.setRotationPoint(46.375f, 0.875f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f)
			.setRotationPoint(48.625f, 0.875f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.625f, 0, -0.625f, 0.625f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, 0.625f, -0.75f, -0.625f)
			.setRotationPoint(47.625f, 0.625f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.375f, -0.625f, -0.625f)
			.setRotationPoint(46.625f, 2.3125f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f)
			.setRotationPoint(48.625f, 2.6875f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f)
			.setRotationPoint(46.375f, 2.6875f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.625f, -0.75f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f)
			.setRotationPoint(46.625f, 4.25f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0.4375f, -0.25f, -0.625f, 0.4375f, -0.25f)
			.setRotationPoint(46.375f, 0.875f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0.4375f, -0.25f, -0.625f, 0.4375f, -0.25f)
			.setRotationPoint(48.625f, 0.875f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.625f, 0, 0, 0.625f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, 0.625f, -0.75f, 0)
			.setRotationPoint(47.625f, 0.625f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.375f, -0.625f, 0)
			.setRotationPoint(46.625f, 2.3125f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0)
			.setRotationPoint(48.625f, 2.6875f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0)
			.setRotationPoint(46.375f, 2.6875f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.375f, 0, 0, -0.75f, -0.625f, -0.625f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(46.625f, 4.25f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f)
			.setRotationPoint(-48.75f, 0.875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f)
			.setRotationPoint(-46.5f, 0.875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0.625f, 0, -0.625f, 0.625f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, 0.625f, -0.75f, -0.625f)
			.setRotationPoint(-47.5f, 0.625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.375f, -0.625f, -0.625f)
			.setRotationPoint(-48.5f, 2.3125f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f)
			.setRotationPoint(-46.5f, 2.6875f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f)
			.setRotationPoint(-48.75f, 2.6875f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.625f, -0.75f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f)
			.setRotationPoint(-48.5f, 4.25f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0.4375f, -0.25f, -0.625f, 0.4375f, -0.25f)
			.setRotationPoint(-48.75f, 0.875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0.4375f, -0.25f, -0.625f, 0.4375f, -0.25f)
			.setRotationPoint(-46.5f, 0.875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.625f, 0, 0, 0.625f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, 0.625f, -0.75f, 0)
			.setRotationPoint(-47.5f, 0.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.375f, -0.625f, 0)
			.setRotationPoint(-48.5f, 2.3125f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0)
			.setRotationPoint(-46.5f, 2.6875f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0)
			.setRotationPoint(-48.75f, 2.6875f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.375f, 0, 0, -0.75f, -0.625f, -0.625f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-48.5f, 4.25f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 20, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-49.5f, -0.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 157, textureX, textureY).addCylinder(0, 0, 0, 2, 8, 10, 1, 1, 3, null)
			.setRotationPoint(-8.75f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 150, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.875f, 1, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-9.25f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 147, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.5f, 0.875f, 3, new Vec3f(-0.625, 0.0, 0.0))
			.setRotationPoint(-9.625f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 147, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.875f, 0.5f, 3, new Vec3f(-0.625, 0.0, 0.0))
			.setRotationPoint(-0.25f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 144, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 1, 0.875f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-0.75f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 141, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 1.0625f, 1.0625f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-5.5f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.25f, 0.125f, -0.125f)
			.setRotationPoint(-2.25f, 0.625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, -0.25f, 0.125f, -0.125f)
			.setRotationPoint(-8.5f, 0.625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -0.375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -3, 0.625f, 0, 2, -0.125f, 0, 2, -0.125f, 0, -3, 0.625f, 0)
			.setRotationPoint(-10.25f, 0.625f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -2.5f, 0.4375f, 0, 2.3125f, -0.4375f, 0, 2.3125f, -0.4375f, -0.5f, -2.5f, 0.4375f, -0.5f)
			.setRotationPoint(-10.25f, 0.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -2.5f, 0.4375f, 0, 2.3125f, -0.4375f, 0, 2.3125f, -0.4375f, -0.5f, -2.5f, 0.4375f, -0.5f)
			.setRotationPoint(-10.25f, 0.625f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 185, textureX, textureY).addCylinder(0, 0, 0, 1, 18, 8, 0.75f, 0.75f, 0, null)
			.setRotationPoint(46.375f, 0.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, -0.25f, 0.125f, -0.375f)
			.setRotationPoint(0.75f, 0.625f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, -0.25f, 0.125f, -0.375f)
			.setRotationPoint(0.75f, 0.625f, 2.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 2, 22, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-46, -1.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 135, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(14).setSegments(8, 2).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.1875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-45.75f, -13.1875f, -10).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 140, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.75f).setLength(1).setSegments(10, 0).setScale(0.625f, 0.625f).setDirection(3)
			.setTopOffset(new Vec3f(-0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-47, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 37, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.4375f, 0.5625f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(-46.9375f, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 28, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.1875f, 0.4375f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-47.0625f, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(42, -5.375f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 9, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, -2, 0, -0.75f, -1.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(44, -5.375f, -4.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_PaintingStuff(){
		TurboList PaintingStuff = new TurboList("PaintingStuff");
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-25.75f, -14.875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 0, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.75f, -12.875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-25.75f, -14.875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 23, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.75f, -12.875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 129, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 62, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-21.25f, -16.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 129, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 62, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-21.25f, -17.375f, 10.76f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 129, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 62, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-21.25f, -18.1875f, 10.26f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 131, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 62, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-21.25f, -16.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 131, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 62, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-21.25f, -17.375f, -10.76f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 131, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 62, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-21.25f, -18.1875f, -10.26f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 213, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 7, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-46.76f, -9.375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(PaintingStuff);
	}

	ModelNYC3AxleTenderBogie bogie = new ModelNYC3AxleTenderBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		int cargo = ((EntityNYC46ft4inTender) entity).getAmmountOfCargo();
		for (TurboList l : groups) {
			GL11.glPushMatrix();
			if (l.name.equals("Coal")) {
				GL11.glTranslatef(0,1- ((float) cargo / ((EntityNYC46ft4inTender)entity).freightInventorySize),0);
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
		GL11.glTranslatef(-1.875f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslatef(1.75f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
