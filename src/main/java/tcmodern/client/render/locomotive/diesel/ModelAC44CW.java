//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.diesel;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.locomotive.bogies.ModelGEHIAD;
import tcmodern.client.render.locomotive.parts.ModelAC44CWCompressor;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;
import train.client.renderhelper.ModelRenderHelper;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelAC44CW extends FVTMFormatBase {

	public ModelAC44CW(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_doors();
		initGroup_KCSAC44CW();
		initGroup_new_group0_();
		initGroup_AC44CW();
		initGroup_CMQAC44CW();
		initGroup_new_group0();
		initGroup_Ferromex();
		initGroup_FECGM();
		initGroup_clipboard0();
		initGroup_clipboard1();
		initGroup_clipboard2();
		initGroup_SP();
		initGroup_nums();
		initGroup_Dash944cw();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_doors(){
		TurboList doors = new TurboList("doors");
		doors.add(new ModelRendererTurbo(doors, 208, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14.02f, 0, 0, 14.02f, 0, 0, 0, 0, 0, 0, 0, 0, 14.02f, 0, 0, 14.02f)
			.setRotationPoint(-66.5f, -12.5f, -7.01f).setRotationAngle(0, 0, 0)
		);
		doors.add(new ModelRendererTurbo(doors, 387, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35.375f, -7.8125f, -11.02f).setRotationAngle(0, 0, 0)
		);
		doors.add(new ModelRendererTurbo(doors, 387, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.375f, -7.8125f, -11.02f).setRotationAngle(0, 0, 0)
		);
		doors.add(new ModelRendererTurbo(doors, 372, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.9375f, -8.75f, -11.02f).setRotationAngle(0, 0, 0)
		);
		doors.add(new ModelRendererTurbo(doors, 343, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.4375f, -8.75f, -11.02f).setRotationAngle(0, 0, 0)
		);
		doors.add(new ModelRendererTurbo(doors, 267, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5f, -9.5f, 11.02f).setRotationAngle(0, 0, 0)
		);
		groups.add(doors);
	}

	private final void initGroup_KCSAC44CW(){
		TurboList KCSAC44CW = new TurboList("KCSAC44CW");
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 363, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -14.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 363, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.25f, -14.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 383, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.24f, -14.75f, -11).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 363, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.365f, -4.75f, -11).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 363, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.24f, -14.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 363, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 42, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.375f, -4.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 424, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.25f, -11.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 429, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.25f, -11.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 383, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.24f, -11.75f, -11).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 363, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.24f, -11.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 0, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 6, 0, 0, 0, 0, 0, -47, 0, 0, -47, 0, 0, 0, 0, 0, 0, -3, 0, -47, -3, 0, -47, -3, 0, 0, -3, 0)
			.setRotationPoint(-37.6875f, -10, 7.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 363, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -14.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 424, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, -14.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 374, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.24f, -14.75f, 10).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 424, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, -11.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 424, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.25f, -11.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 424, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, -4.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 433, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.25f, -4.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 409, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.24f, -11.75f, 10).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 424, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.24f, -4.75f, 10).setRotationAngle(0, 0, 0)
		);
		KCSAC44CW.add(new ModelRendererTurbo(KCSAC44CW, 19, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 6, 0, 0, 0, 0, 0, -47, 0, 0, -47, 0, 0, 0, 0, 0, 0, -3, 0, -47, -3, 0, -47, -3, 0, 0, -3, 0)
			.setRotationPoint(-37.6875f, -10, -7.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(KCSAC44CW);
	}

	private final void initGroup_new_group0_(){
		TurboList new_group0_ = new TurboList("new_group0_");
		new_group0_.add(new ModelRendererTurbo(new_group0_, 368, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.050625f, 0, 0, 0.1689f, 0, 0, 0, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, -1.050625f, -0.5f, 0, 0.1689f, -0.5f, 0, 0, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f)
			.setRotationPoint(70.90625f, -15, 5.375f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 304, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.89f, -0.0625f, -0.125f, -0.046f, -0.0625f, -0.125f, -0.1689f, 0, -0.5f, -0.762f, 0, -0.5f, -0.9375f, -0.5f, 0, 0, -0.5f, 0, -0.1689f, -0.5f, -0.5f, -0.762f, -0.5f, -0.5f)
			.setRotationPoint(72.46875f, -16.125f, 1.25f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 183, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -1.8245f, 0, 0, 0.893575f, 0, 0, -0.3311f, -1.125f, -1.375f, -0.550625f, -1.125f, -1.375f, -1.8245f, 0.625f, 0, 0.893575f, 0.625f, 0, -0.3311f, 0.625f, -1.375f, -0.550625f, 0.625f, -1.375f)
			.setRotationPoint(71.40625f, -16.125f, 1.75f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 293, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, -0.1689f, 0, -0.5f, -0.762f, 0, -0.5f, -0.9375f, 0.125f, 0, 0, 0.125f, 0, -0.1689f, 0.125f, -0.5f, -0.762f, 0.125f, -0.5f)
			.setRotationPoint(72.46875f, -15.625f, 1.25f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 6, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.9375f, 0, 0, 0, 0, 0, -1.5625f, 0, -0.375f, 0.6875f, 0, -0.375f, -0.9375f, -0.25f, 0, 0, -0.25f, 0, -1.5625f, -0.25f, -0.375f, 0.6875f, -0.25f, -0.375f)
			.setRotationPoint(72.46875f, -14.5f, 1.25f).setRotationAngle(0, 0, 0)
		);
		new_group0_.add(new ModelRendererTurbo(new_group0_, 18, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 5, 0, -0.9375f, 0, 0, 0, 0, 0, -1.5625f, 0, -0.375f, 0.6875f, 0, -0.375f, -0.9375f, 0, 0, 0, 0, 0, -1.5625f, 0, -0.375f, 0.6875f, 0, -0.375f)
			.setRotationPoint(72.46875f, -13.75f, 1.25f).setRotationAngle(0, 0, 0)
		);
		groups.add(new_group0_);
	}

	private final void initGroup_AC44CW(){
		TurboList AC44CW = new TurboList("AC44CW");
		AC44CW.add(new ModelRendererTurbo(AC44CW, 401, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 12, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(18.25f, -15.1875f, 7).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 300, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 12, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.25f, -15, 7).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 125, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.4375f, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(18.4375f, -20.1875f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 253, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.4375f, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(26.25f, -20.1875f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 325, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.3125f, -0.625f, 0, 0.3125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(16.625f, -20.125f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 345, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.4375f, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(34.75f, -20.1875f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 15, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, -0.5f, -0.5f, 0.375f, -0.5f, -0.5f, 0.375f, -0.5f, 0, 0.375f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(18.4375f, -16.1875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 248, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, -0.5f, -0.5f, 0.375f, -0.5f, -0.5f, 0.375f, -0.5f, 0, 0.375f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(26.25f, -16.1875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 380, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, -0.5f, -0.5f, 0.375f, -0.5f, -0.5f, 0.375f, -0.5f, 0, 0.375f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(34.75f, -16.1875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 34, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.125f, -0.625f, 0, -0.5f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(16.125f, -20.125f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 498, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.375f, -0.5f, 0, -0.625f, 5.375f, 0, -0.625f, 5.375f, -0.625f, 0.375f, -0.5f, -0.625f, 0, -0.5f, 0, -0.625f, -6, 0, -0.625f, -6, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(11.75f, -14.625f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 324, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.3125f, 0, -0.625f, 0.3125f, 0, -0.625f, 0.3125f, -0.625f, 0, 0.3125f, -0.625f)
			.setRotationPoint(11.1875f, -13.5625f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 316, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1875f, -0.1875f, 0, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f, -0.625f, -0.1875f, -0.1875f, -0.625f, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(11.1875f, -14.3125f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 203, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(18, -10, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 195, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(18.375f, -10.0625f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 203, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.875f, 0, -0.0625f, -0.875f, 0, -0.6875f, 0, -0.8125f, -0.625f, 0, -0.8125f, -0.625f, -0.875f, 0, -0.6875f, -0.875f)
			.setRotationPoint(18.1875f, -10.0625f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 195, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.6875f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.6875f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(11.25f, -11.25f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 371, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.875f, -0.0625f, 0, -0.875f, 0, -0.8125f, 0, -0.625f, -0.8125f, 0, -0.625f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(11.1875f, -11.0625f, 11.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 506, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, -0.875f, 0, -0.25f, -0.875f)
			.setRotationPoint(11.1875f, -10.875f, 11.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 338, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0.25f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, -0.875f, 0.25f, -0.1875f, -0.875f)
			.setRotationPoint(11.1875f, -10.875f, 11).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 501, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(20.0625f, -21.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 501, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(20.0625f, -19.4375f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 257, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(20.0625f, -20.8125f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 255, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(20.0625f, -20.125f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 319, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(20.0625f, -22.1875f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 156, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.375f, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, -0.8125f, 0, 0.375f, -0.8125f)
			.setRotationPoint(9.75f, -22.375f, 7).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 305, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.375f, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, -0.8125f, 0, 0.375f, -0.8125f)
			.setRotationPoint(16, -22.375f, 7).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 279, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8125f, 0, -0.5f, -0.8125f)
			.setRotationPoint(10.25f, -22.375f, 7).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 233, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8125f, 0, -0.5f, -0.8125f)
			.setRotationPoint(10.25f, -18.5f, 7).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 40, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(10.5f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 199, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(11, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 272, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(11.5f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 263, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(12, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 61, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(12.5f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 501, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(13, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 315, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(13.5f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 61, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(14, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 508, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(14.5f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 294, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(15, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 315, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(15.5f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 377, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(10.25f, -21.875f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 331, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, 0, 0, 0, 0.375f, -0.8125f, -0.5f, 0.375f, -0.8125f, -0.5f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(9.75f, -22.375f, -8).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 59, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, 0, 0, 0, 0.375f, -0.8125f, -0.5f, 0.375f, -0.8125f, -0.5f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(16, -22.375f, -8).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 160, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.8125f, -0.25f, -0.5f, -0.8125f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(10.25f, -22.375f, -8).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 135, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.8125f, -0.25f, -0.5f, -0.8125f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(10.25f, -18.5f, -8).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 61, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(10.5f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 452, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(11, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 345, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(11.5f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 294, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(12, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 315, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(12.5f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 23, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(13, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 452, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(13.5f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 406, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(14, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 322, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(14.5f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 294, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(15, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 93, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(15.5f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(10.25f, -21.875f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.9375f, 0, 0, 0, 0, 0, -1.28125f, 0, -0.375f, 0.34375f, 0, -0.375f, -0.9375f, 0.5f, 0, 0, 0.5f, 0, -1.28125f, 0.5f, -0.375f, 0.34375f, 0.5f, -0.375f)
			.setRotationPoint(70.59375f, -12.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.34375f, 0, -0.375f, -1.28125f, 0, -0.375f, 0, 0, 0, -0.9375f, 0, 0, 0.34375f, 0.5f, -0.375f, -1.28125f, 0.5f, -0.375f, 0, 0.5f, 0, -0.9375f, 0.5f, 0)
			.setRotationPoint(70.59375f, -12.75f, -10.625f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 462, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(19.5625f, -22.71875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 278, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.375f, -0.4375f, -0.875f, -0.375f, -0.4375f, -0.875f, -0.375f, -0.53125f, 0, -0.375f, -0.53125f)
			.setRotationPoint(23.875f, -22.71875f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 377, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.4375f, -0.46875f, 0, -0.4375f, -0.46875f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.875f, -0.4375f, -0.46875f, -0.875f, -0.4375f, -0.46875f, -0.875f, -0.53125f, 0, -0.875f, -0.53125f)
			.setRotationPoint(19.46875f, -22.84375f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 81, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.375f, -0.4375f, -0.875f, -0.375f, -0.4375f, -0.875f, -0.375f, -0.53125f, 0, -0.375f, -0.53125f)
			.setRotationPoint(19.46875f, -22.71875f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 498, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.4375f, -0.46875f, 0, -0.4375f, -0.46875f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.875f, -0.4375f, -0.46875f, -0.875f, -0.4375f, -0.46875f, -0.875f, -0.53125f, 0, -0.875f, -0.53125f)
			.setRotationPoint(19.46875f, -18.09375f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 439, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.375f, -0.28125f, 0, -0.375f, -0.28125f, 0, -0.375f, 0, 0, -0.375f, 0, -0.59375f, -0.375f, -0.28125f, -0.59375f, -0.375f, -0.28125f, -0.59375f, -0.375f, 0, -0.59375f, -0.375f)
			.setRotationPoint(19.1875f, -23.125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 401, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.375f, -0.28125f, 0, -0.375f, -0.28125f, 0, -0.375f, 0, 0, -0.375f, 0, -0.15625f, -0.375f, -0.28125f, -0.15625f, -0.375f, -0.28125f, -0.15625f, -0.375f, 0, -0.15625f, -0.375f)
			.setRotationPoint(19.1875f, -18.09375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 360, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(19.1875f, -22.71875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		AC44CW.add(new ModelRendererTurbo(AC44CW, 224, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, 0.03125f, 0, -0.375f, 0.03125f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0.03125f, -0.375f, -0.375f, 0.03125f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(23.875f, -22.71875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		groups.add(AC44CW);
	}

	private final void initGroup_CMQAC44CW(){
		TurboList CMQAC44CW = new TurboList("CMQAC44CW");
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 363, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.9375f, -16.25f, 7.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 372, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.01f, 0, 0.184f, 0.01f, 0, 0.184f, 0, 0, 0, 0, 0, 0, -0.01f, 0, -0.293f, 0.01f, 0, -0.293f)
			.setRotationPoint(-45.49f, -16.25f, 7.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 375, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0.01f, 0, 0.184f, -0.01f, 0, 0.184f, 0, 0, 0, 0, 0, 0, 0.01f, 0, -0.293f, -0.01f, 0, -0.293f)
			.setRotationPoint(-66.4475f, -16.25f, 7.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 424, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 0, 0, 0, 0, -0.184f, -0.0625f, 0, -0.184f, -0.0625f, 0, 0.184f, 0, 0, 0.184f, 0, 0, 0.293f, -0.0625f, 0, 0.293f, -0.0625f, 0, -0.293f, 0, 0, -0.293f)
			.setRotationPoint(-66.4375f, -16.25f, 8.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 382, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.9375f, -16.25f, -7.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 370, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0.01f, 0, 0.184f, -0.01f, 0, 0.184f, 0, 0, 0, 0, 0, 0, 0.01f, 0, -0.293f, -0.01f, 0, -0.293f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.49f, -16.25f, -8.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 373, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, -0.01f, 0, 0.184f, 0.01f, 0, 0.184f, 0, 0, 0, 0, 0, 0, -0.01f, 0, -0.293f, 0.01f, 0, -0.293f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.4475f, -16.25f, -8.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 467, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 0, 0, 0, 0, 0.184f, -0.0625f, 0, 0.184f, -0.0625f, 0, -0.184f, 0, 0, -0.184f, 0, 0, -0.293f, -0.0625f, 0, -0.293f, -0.0625f, 0, 0.293f, 0, 0, 0.293f)
			.setRotationPoint(-66.4375f, -16.25f, -8.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 448, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.25f, -16, 11.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 363, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.24f, -16, 10).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 366, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.24f, -9.75f, 10).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 363, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, -9.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 473, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.25f, -16, -11.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 400, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.24f, -16, -10.5f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 401, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.24f, -16, -11).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 479, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.25f, -9.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 406, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.24f, -9.75f, -11).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 401, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.24f, -9.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 406, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.24f, -9.25f, -11).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 189, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 6, 0, 0, 0, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0, 0, -3, 0, -7, -3, 0, -7, -3, 0, 0, -3, 0)
			.setRotationPoint(48.1875f, -14, -11.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 218, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 6, 0, 0, 0, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0, 0, -3, 0, -7, -3, 0, -7, -3, 0, 0, -3, 0)
			.setRotationPoint(48.1875f, -14, 11.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 189, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 6, 0, 0, 0, 0, 0, -47, 0, 0, -47, 0, 0, 0, 0, 0, 0, -3, 0, -47, -3, 0, -47, -3, 0, 0, -3, 0)
			.setRotationPoint(-36.5625f, -14, 7.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 0, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 6, 0, 0, 0, 0, 0, -47, 0, 0, -47, 0, 0, 0, 0, 0, 0, -3, 0, -47, -3, 0, -47, -3, 0, 0, -3, 0)
			.setRotationPoint(-36.5625f, -14, -7.01f).setRotationAngle(0, 0, 0)
		);
		CMQAC44CW.add(new ModelRendererTurbo(CMQAC44CW, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.25f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.1875f, 0.25f, 0)
			.setRotationPoint(55.9375f, -21.8125f, -11.0625f).setRotationAngle(-45, 0, 0)
		);
		groups.add(CMQAC44CW);
	}

	private final void initGroup_new_group0(){
	}

	private final void initGroup_Ferromex(){
		TurboList Ferromex = new TurboList("Ferromex");
		Ferromex.add(new ModelRendererTurbo(Ferromex, 264, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.9375f, -23.5f, 7.01f).setRotationAngle(0, 0, 0)
		);
		Ferromex.add(new ModelRendererTurbo(Ferromex, 335, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, -2, 0, -6, -2, 0, -6, -2, 0, 0, -2, 0)
			.setRotationPoint(64, -11.125f, 11.01f).setRotationAngle(0, 0, 0)
		);
		Ferromex.add(new ModelRendererTurbo(Ferromex, 312, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, -2, 0, -6, -2, 0, -6, -2, 0, 0, -2, 0)
			.setRotationPoint(64, -11.125f, -11.01f).setRotationAngle(0, 0, 0)
		);
		Ferromex.add(new ModelRendererTurbo(Ferromex, 0, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 106, 16, 0, 0, 0, 0, 0, -53, 0, 0, -53, 0, 0.0625f, 0, 0, 0.0625f, 0, -8, 0, -53, -8, 0, -53, -8, 0.0625f, 0, -8, 0.0625f)
			.setRotationPoint(-39.6875f, -17.375f, -7.02f).setRotationAngle(0, 0, 0)
		);
		Ferromex.add(new ModelRendererTurbo(Ferromex, 213, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 106, 16, 0, 0, 0, 0, 0.0625f, -53, 0, 0.0625f, -53, 0, 0, 0, 0, 0, 0, -8, 0.0625f, -53, -8, 0.0625f, -53, -8, 0, 0, -8, 0)
			.setRotationPoint(-39.6875f, -17.375f, 7.02f).setRotationAngle(0, 0, 0)
		);
		Ferromex.add(new ModelRendererTurbo(Ferromex, 438, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.625f, -19.25f, 7.01f).setRotationAngle(0, 0, 0)
		);
		Ferromex.add(new ModelRendererTurbo(Ferromex, 447, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39.0625f, -22.5625f, 7.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(Ferromex);
	}

	private final void initGroup_FECGM(){
		TurboList FECGM = new TurboList("FECGM");
		FECGM.add(new ModelRendererTurbo(FECGM, 456, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 6, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, -2, 0, -6, -2, 0, -6, -2, 0, 0, -2, 0)
			.setRotationPoint(47.125f, -13.625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		FECGM.add(new ModelRendererTurbo(FECGM, 456, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 6, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, -2, 0, -6, -2, 0, -6, -2, 0, 0, -2, 0)
			.setRotationPoint(47.125f, -13.625f, -11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(FECGM);
	}

	private final void initGroup_clipboard0(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0)
			.setRotationPoint(65.0625f, -17, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(72.25f, -16, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, 0.0764f, 0, 0, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.0764f, 0, 0, -0.0625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(59.625f, -17, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, -1.685f, 0, 0, -1.875f, 0, -0.5f, 0, 0, -0.5f, 0, -0.0625f, 0, -0.426f, -0.0625f, 0, -0.5625f, -0.0625f, -0.5f, 0, -0.0625f, -0.5f)
			.setRotationPoint(59.625f, -21.9375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.4375f, 0, 0.4375f, 0.4375f, 0, 0.4375f, 0.4375f, -0.5f, 0, 0.4375f, -0.5f)
			.setRotationPoint(57.1875f, -16.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.4375f, 0, 0.4375f, 0.4375f, 0, 0.4375f, 0.4375f, -0.5f, 0, 0.4375f, -0.5f)
			.setRotationPoint(57.1875f, -21.9375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, -0.0625f, 0, -0.1875f, -0.0625f, 0, -0.1875f, -0.0625f, -0.5f, 0, -0.0625f, -0.5f)
			.setRotationPoint(56.375f, -21.9375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.4375f, 0, -0.5f, 0.4375f, 0, -0.5f, 0.4375f, -0.5f, 0, 0.4375f, -0.5f)
			.setRotationPoint(46.875f, -21.9375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 13, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(46.875f, -16, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 19, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, -0.5f, 0, -0.0625f, -0.5f)
			.setRotationPoint(45.25f, -21.9375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.5f, -0.0625f, 0, -0.5f, 0.0764f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.0625f, 0, -0.5f, 0.0764f, 0, 0, 0, 0, 0)
			.setRotationPoint(59.625f, -17, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, 0, -0.5f, 0.4375f, 0, -0.5f, 0.4375f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.5f, 0.4375f, 0.4375f, -0.5f, 0.4375f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(57.1875f, -16.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0.4375f, 0, -0.5f, 0.4375f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.5f, 0.4375f, 0.4375f, -0.5f, 0.4375f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(57.1875f, -21.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 1, 0, 0, -0.5625f, 3.5f, -0.5f, -0.5625f, 3.5f, -0.5f, -0.0625f, -4.5f, 0, -0.0625f, -4.5f, 0, 0.3125f, 0, -0.5f, 0.3125f, 0, -0.5f, 0.3125f, -0.5f, 0, 0.3125f, -0.5f)
			.setRotationPoint(45.25f, -24.25f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.25f, -24.1875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(73, -12, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 11, 10, 0, 0, 0, 0, -3, 0, 0, 0.5f, 0, 0, -3, 0, 0, 0, 0, 0, -3, 0, 0, 0.5f, 0, 0, -3, 0, 0)
			.setRotationPoint(70, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 10, 0, 0, 0, 0, -8, 0, 0, 3.375f, 0, 0, -2.5f, 0, 0, 0, 0, 0, -8, 0, 0, 3.375f, 0, 0, -2.5f, 0, 0)
			.setRotationPoint(62.125f, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.1875f, -16, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, -0.4375f, 0, 0, 2.0625f, 0, 0, -2.5f, 0, 0, 0, 0, 0, -0.4375f, 0, 0, 2.0625f, 0, 0, -2.5f, 0, 0)
			.setRotationPoint(61.5625f, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.4375f, 0, -0.5f, -0.8125f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, -0.8125f, -0.8125f, -0.5f)
			.setRotationPoint(58.625f, -20.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8125f, 0, -0.5f, -1, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -1, -0.625f, -0.5f)
			.setRotationPoint(58.625f, -20.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, -0.8125f, -0.8125f, 0, -0.8125f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(57.1875f, -20.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(57.1875f, -20.3125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, -0.8125f, -0.8125f, -0.5f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.4375f, 0, -0.5f)
			.setRotationPoint(58.625f, -17.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -1, -0.625f, -0.5f, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8125f, 0, -0.5f)
			.setRotationPoint(58.625f, -17.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, 0, -0.8125f, -0.8125f, 0, -0.8125f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(57.1875f, -17.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(57.1875f, -17.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4375f, 0, 0, -0.8125f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, -0.8125f, -0.8125f, 0)
			.setRotationPoint(58.625f, -20.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8125f, 0, 0, -1, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(58.625f, -20.3125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.5f, -0.8125f, -0.8125f, -0.5f, -0.8125f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(57.1875f, -20.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1, -0.625f, -0.5f, -1, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(57.1875f, -20.3125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, -0.8125f, -0.8125f, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4375f, 0, 0)
			.setRotationPoint(58.625f, -17.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -1, -0.625f, 0, -0.8125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8125f, 0, 0)
			.setRotationPoint(58.625f, -17.625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, -0.5f, -0.8125f, -0.8125f, -0.5f, -0.8125f, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.1875f, -17.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, -0.5f, -1, -0.625f, -0.5f, -1, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.1875f, -17.625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.875f, 0, 0.3125f, -0.875f, 0, 0.3125f, -0.875f, -0.4375f, 0, -0.875f, -0.4375f)
			.setRotationPoint(57.75f, -16.46875f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.875f, 0, 0.3125f, -0.875f, 0, 0.3125f, -0.875f, -0.4375f, 0, -0.875f, -0.4375f)
			.setRotationPoint(57.75f, -20.59375f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.0625f, 0, -0.875f, -0.0625f, 0, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f)
			.setRotationPoint(57.09375f, -19.9375f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.0625f, 0, -0.875f, -0.0625f, 0, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f)
			.setRotationPoint(59.59375f, -19.9375f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.046875f, 0.046875f, 0, -0.875f, -0.03125f, 0, -0.875f, -0.03125f, -0.4375f, -0.046875f, 0.046875f, -0.4375f, 0.1875f, -0.625f, 0, -1.0625f, -0.625f, 0, -1.0625f, -0.625f, -0.4375f, 0.1875f, -0.625f, -0.4375f)
			.setRotationPoint(57.28125f, -20.3125f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.046875f, -0.234375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.4375f, 0.046875f, -0.234375f, -0.4375f, -0.03125f, -0.6875f, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f, -0.4375f, -0.03125f, -0.6875f, -0.4375f)
			.setRotationPoint(57.375f, -20.59375f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.03125f, 0, -0.046875f, 0.046875f, 0, -0.046875f, 0.046875f, -0.4375f, -0.875f, -0.03125f, -0.4375f, -1.0625f, -0.625f, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, -0.4375f, -1.0625f, -0.625f, -0.4375f)
			.setRotationPoint(58.53125f, -20.3125f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0.046875f, -0.234375f, 0, 0.046875f, -0.234375f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, -0.875f, 0, -0.03125f, -0.6875f, 0, -0.03125f, -0.6875f, -0.4375f, -0.625f, -0.875f, -0.4375f)
			.setRotationPoint(58.4375f, -20.59375f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, -0.625f, 0, -1.0625f, -0.625f, 0, -1.0625f, -0.625f, -0.4375f, 0.1875f, -0.625f, -0.4375f, -0.046875f, 0.046875f, 0, -0.875f, -0.03125f, 0, -0.875f, -0.03125f, -0.4375f, -0.046875f, 0.046875f, -0.4375f)
			.setRotationPoint(57.28125f, -17.625f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.6875f, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f, -0.4375f, -0.03125f, -0.6875f, -0.4375f, 0.046875f, -0.234375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.4375f, 0.046875f, -0.234375f, -0.4375f)
			.setRotationPoint(57.375f, -17.34375f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.0625f, -0.625f, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, -0.4375f, -1.0625f, -0.625f, -0.4375f, -0.875f, -0.03125f, 0, -0.046875f, 0.046875f, 0, -0.046875f, 0.046875f, -0.4375f, -0.875f, -0.03125f, -0.4375f)
			.setRotationPoint(58.53125f, -17.625f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.875f, 0, -0.03125f, -0.6875f, 0, -0.03125f, -0.6875f, -0.4375f, -0.625f, -0.875f, -0.4375f, -0.625f, 0, 0, 0.046875f, -0.234375f, 0, 0.046875f, -0.234375f, -0.4375f, -0.625f, 0, -0.4375f)
			.setRotationPoint(58.4375f, -17.34375f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.4375f, 0.3125f, 0, -0.4375f, 0.3125f, 0, 0, 0, 0, 0, 0, -0.875f, -0.4375f, 0.3125f, -0.875f, -0.4375f, 0.3125f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(57.75f, -16.46875f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.4375f, 0.3125f, 0, -0.4375f, 0.3125f, 0, 0, 0, 0, 0, 0, -0.875f, -0.4375f, 0.3125f, -0.875f, -0.4375f, 0.3125f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(57.75f, -20.59375f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(57.09375f, -19.9375f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(59.59375f, -19.9375f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.046875f, 0.046875f, -0.4375f, -0.875f, -0.03125f, -0.4375f, -0.875f, -0.03125f, 0, -0.046875f, 0.046875f, 0, 0.1875f, -0.625f, -0.4375f, -1.0625f, -0.625f, -0.4375f, -1.0625f, -0.625f, 0, 0.1875f, -0.625f, 0)
			.setRotationPoint(57.28125f, -20.3125f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.046875f, -0.234375f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, 0, 0.046875f, -0.234375f, 0, -0.03125f, -0.6875f, -0.4375f, -0.625f, -0.875f, -0.4375f, -0.625f, -0.875f, 0, -0.03125f, -0.6875f, 0)
			.setRotationPoint(57.375f, -20.59375f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.03125f, -0.4375f, -0.046875f, 0.046875f, -0.4375f, -0.046875f, 0.046875f, 0, -0.875f, -0.03125f, 0, -1.0625f, -0.625f, -0.4375f, 0.1875f, -0.625f, -0.4375f, 0.1875f, -0.625f, 0, -1.0625f, -0.625f, 0)
			.setRotationPoint(58.53125f, -20.3125f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.4375f, 0.046875f, -0.234375f, -0.4375f, 0.046875f, -0.234375f, 0, -0.625f, 0, 0, -0.625f, -0.875f, -0.4375f, -0.03125f, -0.6875f, -0.4375f, -0.03125f, -0.6875f, 0, -0.625f, -0.875f, 0)
			.setRotationPoint(58.4375f, -20.59375f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, -0.625f, -0.4375f, -1.0625f, -0.625f, -0.4375f, -1.0625f, -0.625f, 0, 0.1875f, -0.625f, 0, -0.046875f, 0.046875f, -0.4375f, -0.875f, -0.03125f, -0.4375f, -0.875f, -0.03125f, 0, -0.046875f, 0.046875f, 0)
			.setRotationPoint(57.28125f, -17.625f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.6875f, -0.4375f, -0.625f, -0.875f, -0.4375f, -0.625f, -0.875f, 0, -0.03125f, -0.6875f, 0, 0.046875f, -0.234375f, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, 0, 0, 0.046875f, -0.234375f, 0)
			.setRotationPoint(57.375f, -17.34375f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.0625f, -0.625f, -0.4375f, 0.1875f, -0.625f, -0.4375f, 0.1875f, -0.625f, 0, -1.0625f, -0.625f, 0, -0.875f, -0.03125f, -0.4375f, -0.046875f, 0.046875f, -0.4375f, -0.046875f, 0.046875f, 0, -0.875f, -0.03125f, 0)
			.setRotationPoint(58.53125f, -17.625f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.875f, -0.4375f, -0.03125f, -0.6875f, -0.4375f, -0.03125f, -0.6875f, 0, -0.625f, -0.875f, 0, -0.625f, 0, -0.4375f, 0.046875f, -0.234375f, -0.4375f, 0.046875f, -0.234375f, 0, -0.625f, 0, 0)
			.setRotationPoint(58.4375f, -17.34375f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.4375f, 0, -0.875f, -0.4375f)
			.setRotationPoint(46.78125f, -16.03125f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.4375f, 0, -0.875f, 0.4375f, 0, -0.875f, 0.4375f, -0.4375f, 0, 0.4375f, -0.4375f)
			.setRotationPoint(56.34375f, -20.46875f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.4375f, 0, -0.875f, -0.4375f)
			.setRotationPoint(46.78125f, -20.59375f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.4375f, 0, -0.875f, 0.4375f, 0, -0.875f, 0.4375f, -0.4375f, 0, 0.4375f, -0.4375f)
			.setRotationPoint(46.78125f, -20.46875f, 10.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.4375f, 0, -0.75f, 0.4375f, 0, -0.75f, 0.4375f, -0.75f, 0, 0.4375f, -0.75f)
			.setRotationPoint(46.90625f, -20.46875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.4375f, 0, -0.75f, 0.4375f, 0, -0.75f, 0.4375f, -0.75f, 0, 0.4375f, -0.75f)
			.setRotationPoint(51.40625f, -20.46875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.4375f, 0, -0.75f, 0.4375f, 0, -0.75f, 0.4375f, -0.75f, 0, 0.4375f, -0.75f)
			.setRotationPoint(51.65625f, -20.46875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.4375f, 0, -0.75f, 0.4375f, 0, -0.75f, 0.4375f, -0.75f, 0, 0.4375f, -0.75f)
			.setRotationPoint(56.09375f, -20.46875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.15625f, -20.46875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.15625f, -16.28125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51.90625f, -20.46875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51.90625f, -16.28125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.15625f, -20.21875f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(51.90625f, -20.21875f, 10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.21875f, -20.46875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, 0, 0, 0, 0, 0, -0.875f, -0.4375f, -0.3125f, -0.875f, -0.4375f, -0.3125f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(46.78125f, -16.03125f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.375f, -0.4375f, -0.875f, -0.375f, -0.4375f, -0.875f, -0.375f, -0.53125f, 0, -0.375f, -0.53125f)
			.setRotationPoint(40.34375f, -22.71875f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.53125f, 0, -0.875f, -0.53125f)
			.setRotationPoint(35.90625f, -22.84375f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.4375f, -0.875f, 0.4375f, -0.4375f, -0.875f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(46.78125f, -20.46875f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.75f, -0.75f, 0.4375f, -0.75f, -0.75f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(46.90625f, -20.46875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.75f, -0.75f, 0.4375f, -0.75f, -0.75f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(51.40625f, -20.46875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.75f, -0.75f, 0.4375f, -0.75f, -0.75f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(51.65625f, -20.46875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.75f, -0.75f, 0.4375f, -0.75f, -0.75f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(56.09375f, -20.46875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(47.15625f, -20.46875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(47.15625f, -16.28125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.1875f, -0.75f, -0.75f, 0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(51.90625f, -20.46875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.1875f, -0.75f, -0.75f, 0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(51.90625f, -16.28125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.15625f, -20.21875f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0.1875f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(51.90625f, -20.21875f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.21875f, -20.46875f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.25f, -1.6875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.5f, -0.1875f, 0.4375f, -0.5f, -0.1875f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(-71.25f, 0.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.375f, -2, -0.5f, 0.375f, -2, 0, 0, 0, 0)
			.setRotationPoint(-70.4375f, 0.3125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 10, 0, 0, 0, 0, -0.125f, -3, 0, 3.375f, 0, 0, -11.375f, 0, 0, 0, -2, 0, -0.125f, 0, 0, 3.375f, -2, 0, -11.375f, -2, 0)
			.setRotationPoint(62.125f, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, -1.5909f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.1261f, -0.5f, 0, -1.4698f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(60.25f, -24.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0.5f, 0, 0, -1.5909f, 0, 0, -2.5f, -2.25f, 0, 0.5f, -2.25f, 0, 0.5f, -0.5f, 0, -1.4698f, -0.5f, 0, -2.25f, 1.25f, -0.5f, 0.5f, 1.25f, -0.5f)
			.setRotationPoint(60.25f, -24.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.727f, 0, 0, 0.227f, 0, 0, -1.8125f, 0.1875f, 0, 1.3125f, 0.1875f, 0, 1.04f, 0.1875f, 0, -1.54f, 0.1875f, 0)
			.setRotationPoint(62.25f, -24.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0.227f, 0, 0, -0.727f, 0, 0, -2.0909f, 0, 0, 1.5909f, 0, 0, -0.5259f, 0.0625f, 0, 0.0259f, 0.0625f, 0, -1.6609f, 0.0625f, 0, 1.1609f, 0.0625f, 0)
			.setRotationPoint(62.25f, -24.1875f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0.5909f, 0, 0, -1.0909f, 0, 0, -2, -2.25f, 0, 1.5f, -2.25f, 0, 0.161f, 0.0625f, 0, -0.661f, 0.0625f, 0, -1.7841f, 0.0625f, 0, 1.2841f, 0.0625f, 0)
			.setRotationPoint(61.25f, -24.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -0.47860003f, 0, 0, -0.0214f, 0, 0, -2.7539f, 0, 0, 2.2539f, 0, 0, -0.54f, -0.75f, 0, 0.04f, -0.75f, 0, -2.6875f, -0.75f, 0, 2.1875f, -0.75f, 0)
			.setRotationPoint(63.25f, -17.25f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -1.5909f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.4698f, -0.5f, 0, 0.1261f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(60.25f, -24.1875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0.227f, 0, 0, -0.727f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1.54f, 0.1875f, 0, 1.04f, 0.1875f, 0, 1.3125f, 0.1875f, 0, -1.8125f, 0.1875f, 0)
			.setRotationPoint(62.25f, -24.1875f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.5f, -1.875f, 0, -0.5f, -1.625f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.5f, -0.5625f, -0.0625f, -0.5f, -0.375f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(59.625f, -21.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 1, 0, 0, -0.0625f, -4.5f, -0.5f, -0.0625f, -4.5f, -0.5f, -0.5625f, 3.5f, 0, -0.5625f, 3.5f, 0, 0.3125f, -0.5f, -0.5f, 0.3125f, -0.5f, -0.5f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(45.25f, -24.25f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 2.2539f, 0, 0, -2.7539f, 0, 0, -0.0214f, 0, 0, -0.47860003f, 0, 0, 2.1875f, -0.75f, 0, -2.6875f, -0.75f, 0, 0.04f, -0.75f, 0, -0.54f, -0.75f, 0)
			.setRotationPoint(63.25f, -17.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.02399999f, 0, 0, -0.476f, 0, 0, -0.7216f, 0, -0.125f, 0.2216f, 0, -0.125f, -1.04765f, -0.125f, 0, 0.54765f, -0.125f, 0, 0.3089f, -0.125f, -0.125f, -0.8089f, -0.125f, -0.125f)
			.setRotationPoint(60.1875f, -21.125f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.037f, 0, 0, -0.5365f, 0, 0, -0.7135f, 0, -0.375f, 0.211f, 0, -0.375f, -0.0248f, -0.75f, 0, -0.4752f, -0.75f, 0, -0.5459f, -0.75f, -0.75f, 0.0435f, -0.75f, -0.75f)
			.setRotationPoint(62.8125f, -21.125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0248f, 0, 0, -0.4752f, 0, 0, -0.5459f, 0, -0.75f, 0.0435f, 0, -0.75f, -0.117f, -0.625f, 0, -0.3828f, -0.625f, 0, -0.3828f, -0.625f, -1, -0.117f, -0.625f, -1)
			.setRotationPoint(62.8125f, -20.875f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0.5f, -2.25f, 0, -2.5f, -2.25f, 0, -1.5909f, 0, 0, 0.5f, 0, 0, 0.5f, 1.25f, -0.5f, -2.25f, 1.25f, -0.5f, -1.4698f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(60.25f, -24.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 1.5909f, 0, 0, -2.0909f, 0, 0, -0.727f, 0, 0, 0.227f, 0, 0, 1.1609f, 0.0625f, 0, -1.6609f, 0.0625f, 0, 0.0259f, 0.0625f, 0, -0.5259f, 0.0625f, 0)
			.setRotationPoint(62.25f, -24.1875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 1.5f, -2.25f, 0, -2, -2.25f, 0, -1.0909f, 0, 0, 0.5909f, 0, 0, 1.2841f, 0.0625f, 0, -1.7841f, 0.0625f, 0, -0.661f, 0.0625f, 0, 0.161f, 0.0625f, 0)
			.setRotationPoint(61.25f, -24.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.211f, 0, -0.375f, -0.7135f, 0, -0.375f, -0.5365f, 0, 0, 0.037f, 0, 0, 0.0435f, -0.75f, -0.75f, -0.5459f, -0.75f, -0.75f, -0.4752f, -0.75f, 0, -0.0248f, -0.75f, 0)
			.setRotationPoint(62.8125f, -21.125f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0435f, 0, -0.75f, -0.5459f, 0, -0.75f, -0.4752f, 0, 0, -0.0248f, 0, 0, -0.117f, -0.625f, -1, -0.3828f, -0.625f, -1, -0.3828f, -0.625f, 0, -0.117f, -0.625f, 0)
			.setRotationPoint(62.8125f, -20.875f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0828f, -0.75f, 0, -0.5825f, -0.75f, 0, -0.6532f, -0.75f, -0.75f, 0.151f, -0.75f, -0.75f, 0.0215f, 0, 0, -0.525f, 0, 0, -0.693f, 0, -0.375f, 0.1921f, 0, -0.375f)
			.setRotationPoint(63.75f, -18.25f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.175f, -0.625f, 0, -0.675f, -0.625f, 0, -0.675f, -0.625f, -1, 0.175f, -0.625f, -1, 0.0828f, 0, 0, -0.5825f, 0, 0, -0.6532f, 0, -0.75f, 0.151f, 0, -0.75f)
			.setRotationPoint(63.75f, -18.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.151f, -0.75f, -0.75f, -0.6532f, -0.75f, -0.75f, -0.5825f, -0.75f, 0, 0.0828f, -0.75f, 0, 0.1921f, 0, -0.375f, -0.693f, 0, -0.375f, -0.525f, 0, 0, 0.0215f, 0, 0)
			.setRotationPoint(63.75f, -18.25f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.175f, -0.625f, -1, -0.675f, -0.625f, -1, -0.675f, -0.625f, 0, 0.175f, -0.625f, 0, 0.151f, 0, -0.75f, -0.6532f, 0, -0.75f, -0.5825f, 0, 0, 0.0828f, 0, 0)
			.setRotationPoint(63.75f, -18.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.2216f, 0, -0.125f, -0.7216f, 0, -0.125f, -0.476f, 0, 0, -0.02399999f, 0, 0, -0.8089f, -0.125f, -0.125f, 0.3089f, -0.125f, -0.125f, 0.54765f, -0.125f, 0, -1.04765f, -0.125f, 0)
			.setRotationPoint(60.1875f, -21.125f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0125f, -0.75f, -0.75f, -0.5125f, -0.75f, -0.75f, -0.5808f, -0.75f, 0, 0.0808f, -0.75f, 0, -0.15600002f, 0, -0.375f, -0.344f, 0, -0.375f, -0.5149f, 0, 0, 0.0215f, 0, 0)
			.setRotationPoint(61.25f, -18.25f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0125f, -1, -0.75f, -0.5125f, -1, -0.75f, -0.68f, -0.625f, 0, 0.18f, -0.625f, 0, 0.0125f, 0, -0.75f, -0.5125f, 0, -0.75f, -0.5808f, 0, 0, 0.0808f, 0, 0)
			.setRotationPoint(61.25f, -18.5f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0808f, -0.75f, 0, -0.5808f, -0.75f, 0, -0.5125f, -0.75f, -0.75f, 0.0125f, -0.75f, -0.75f, 0.0215f, 0, 0, -0.5149f, 0, 0, -0.344f, 0, -0.375f, -0.15600002f, 0, -0.375f)
			.setRotationPoint(61.25f, -18.25f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.18f, -0.625f, 0, -0.68f, -0.625f, 0, -0.5125f, -1, -0.75f, 0.0125f, -1, -0.75f, 0.0808f, 0, 0, -0.5808f, 0, 0, -0.5125f, 0, -0.75f, 0.0125f, 0, -0.75f)
			.setRotationPoint(61.25f, -18.5f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6995f, 0, -0.375f, 0.1995f, 0, -0.375f, 0.024f, 0, 0, -0.524f, 0, 0, -0.6584f, -0.75f, -0.75f, 0.1584f, -0.75f, -0.75f, 0.09f, -0.75f, 0, -0.59f, -0.75f, 0)
			.setRotationPoint(59.6875f, -21.125f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6584f, 0, -0.75f, 0.1584f, 0, -0.75f, 0.09f, 0, 0, -0.59f, 0, 0, -0.6584f, -1, -0.75f, 0.1584f, -1, -0.75f, 0.1892f, -0.625f, 0, -0.6892f, -0.625f, 0)
			.setRotationPoint(59.6875f, -20.875f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.524f, 0, 0, 0.024f, 0, 0, 0.1995f, 0, -0.375f, -0.6995f, 0, -0.375f, -0.59f, -0.75f, 0, 0.09f, -0.75f, 0, 0.1584f, -0.75f, -0.75f, -0.6584f, -0.75f, -0.75f)
			.setRotationPoint(59.6875f, -21.125f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.59f, 0, 0, 0.09f, 0, 0, 0.1584f, 0, -0.75f, -0.6584f, 0, -0.75f, -0.6892f, -0.625f, 0, 0.1892f, -0.625f, 0, 0.1584f, -1, -0.75f, -0.6584f, -1, -0.75f)
			.setRotationPoint(59.6875f, -20.875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.5f, -0.1875f, -0.0625f, -0.5f, -0.1875f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(56.375f, -21.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.5f, -0.5f, 0.4375f, -0.5f, -0.5f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(46.875f, -21.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(46.875f, -16, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 19, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.5f, -0.375f, -0.0625f, -0.5f, -0.375f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(45.25f, -21.9375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 199, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(73.25f, -15, 0).setRotationAngle(0, 0, 0).setName("HEADLIGHT0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 199, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(73.25f, -13, 0).setRotationAngle(0, 0, 0).setName("HEADLIGHT1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 4, 10, 0, 2.601f, 0, -0.875f, -2.601f, 0, -0.875f, -0.03649998f, 0, 0, 0.037f, 0, 0, 1.5773f, -0.125f, -0.875f, -1.5773001f, -0.125f, -0.875f, 0.91620004f, -0.125f, 0, -0.9162f, -0.125f, 0)
			.setRotationPoint(63.0625f, -21.125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 4, 10, 0, 0.037f, 0, 0, -0.03649998f, 0, 0, -2.601f, 0, -0.875f, 2.601f, 0, -0.875f, -0.9162f, -0.125f, 0, 0.91620004f, -0.125f, 0, -1.5773001f, -0.125f, -0.875f, 1.5773f, -0.125f, -0.875f)
			.setRotationPoint(63.0625f, -21.125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 18, 14, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.25f, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(2.1875f, -23.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 3, 22, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-70.75f, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 2, 11, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, -1.5f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-70.75f, -23.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 2, 11, 0, 0, -1.5f, 0, 0.0625f, -1.5f, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-70.75f, -23.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 2, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-70.75f, -18.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 2, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, -1, 0, 0, -1, 0)
			.setRotationPoint(-70.75f, -18.9375f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 2, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -1, 0, 0.0625f, -1, 0, 0.0625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-70.75f, -18.9375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 1, 1, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-37.6875f, -21.5f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 1, 6, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-37.6875f, -21.625f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 1, 3, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-37.6875f, -21.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 1, 1, 0, 0, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-37.6875f, -21.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 1, 3, 0, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-37.6875f, -21.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 7, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-29.6875f, -21.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, -0.0625f, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f)
			.setRotationPoint(-29.25f, -23.6875f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, -0.0625f, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f, -0.25f, 0, -0.0625f, -0.25f)
			.setRotationPoint(-25.625f, -23.6875f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 87, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.625f).setLength(2).setSegments(8, 4).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.0625, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-27.25f, -23.6875f, -1.375f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.375f, -0.875f, 0, -0.375f, -0.875f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-25.625f, -23.8125f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.375f, -0.875f, 0, -0.375f, -0.875f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-29.5f, -23.8125f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 48, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.44441f).setLength(1).setSegments(8, 4).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-27.25f, -23.8125f, 1.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 47, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.44441f).setLength(1).setSegments(8, 4).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-27.25f, -23.8125f, -1.375f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 171, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.21875f, 0.15625f, 3, new Vec3f(-0.71875, 0.0, 0.0))
			.setRotationPoint(-16.1875f, -23.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 170, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.15625f, 0.09375f, 3, new Vec3f(-0.40625, 0.0, 0.0))
			.setRotationPoint(-15.90625f, -23.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 170, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.09375f, 0.0625f, 3, new Vec3f(-0.40625, 0.0, 0.0))
			.setRotationPoint(-15.3125f, -23.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 168, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.09375f, 0.125f, 3, new Vec3f(-0.40625, 0.0, 0.0))
			.setRotationPoint(-13, -23.03125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 167, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.125f, 0.21875f, 3, new Vec3f(-0.40625, 0.0, 0.0))
			.setRotationPoint(-12.40625f, -23.03125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 167, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.21875f, 0.28125f, 3, new Vec3f(-0.71875, 0.0, 0.0))
			.setRotationPoint(-11.8125f, -23.03125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 167, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.28125f, 0.40625f, 3, new Vec3f(-0.78125, 0.0, 0.0))
			.setRotationPoint(-11.53125f, -23.03125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 165, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.125f, 0.15625f, 3, new Vec3f(-0.40625, 0.0, 0.0))
			.setRotationPoint(-12.28125f, -23.03125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 161, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.15625f, 0.25f, 3, new Vec3f(-0.40625, 0.0, 0.0))
			.setRotationPoint(-11.6875f, -23.03125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 157, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.25f, 0.34375f, 3, new Vec3f(-0.71875, 0.0, 0.0))
			.setRotationPoint(-11.09375f, -23.03125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 155, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.34375f, 0.46875f, 3, new Vec3f(-0.78125, 0.0, 0.0))
			.setRotationPoint(-10.8125f, -23.03125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 152, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 0.125f, 0.125f, 3, new Vec3f(-0.03125, 0.0, 0.0))
			.setRotationPoint(-14.25f, -23.03125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 150, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.09375f, 0.09375f, 3, new Vec3f(0.25, 0.0, 0.0))
			.setRotationPoint(-14.25f, -23.03125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.4375f, 0, -0.53125f, -0.4375f, 0, -0.53125f, -0.4375f, -0.5f, 0, -0.4375f, -0.5f)
			.setRotationPoint(-14.71875f, -23.3125f, -1.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.78125f, 0, -0.53125f, -0.78125f, 0, -0.53125f, -0.78125f, -0.5f, 0, -0.78125f, -0.5f)
			.setRotationPoint(-14.71875f, -23.53125f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -0.53125f, -0.375f, 0, -0.53125f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(-14.71875f, -22.75f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.34375f, 0, 0, -0.34375f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.46875f, 0, -0.34375f, -0.46875f, 0, -0.34375f, -0.46875f, -0.3125f, 0, -0.46875f, -0.3125f)
			.setRotationPoint(-14.8125f, -22.125f, -0.34375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.90625f, -0.625f, 0, -0.90625f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f)
			.setRotationPoint(-14.25f, -22.5f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, -0.90625f, -0.625f, 0, -0.90625f, -0.625f, -0.9375f, 0, -0.625f, -0.9375f)
			.setRotationPoint(-14.25f, -22.5f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.9375f, -1, 0, -0.9375f, -0.90625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.9375f, -0.90625f, -0.625f, -0.9375f)
			.setRotationPoint(-15.71875f, -22.5f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.9375f, -1, 0, -0.9375f, -0.90625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.9375f, -0.90625f, -0.625f, -0.9375f)
			.setRotationPoint(-15.71875f, -22.5f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -1, -0.9375f, 0, -1, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.90625f, -0.9375f, -0.625f, -0.90625f)
			.setRotationPoint(-15.5625f, -22.5f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, -1, -0.9375f, 0, -1, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.90625f, -0.9375f, -0.625f, -0.90625f)
			.setRotationPoint(-15.34375f, -22.5f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, -0.09375f, 0, 0, -0.09375f, 0, 0, -0.90625f, -0.9375f, 0, -0.90625f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.90625f, -0.9375f, -0.625f, -0.90625f)
			.setRotationPoint(-15.5625f, -22.5f, -0.34375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0, -0.09375f, 0, 0, -0.09375f, 0, 0, -0.90625f, -0.9375f, 0, -0.90625f, -0.9375f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.90625f, -0.9375f, -0.625f, -0.90625f)
			.setRotationPoint(-15.34375f, -22.5f, -0.34375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 37, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.625f).setLength(2).setSegments(8, 4).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.0625, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-27.25f, -23.6875f, 1.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 148, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.3125f, 0.21875f, 3, new Vec3f(-0.78125, 0.0, 0.0))
			.setRotationPoint(-16.40625f, -23.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-72.5f, -22.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 19, 6, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -3.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -3.25f, 0, 0)
			.setRotationPoint(-72.5f, -22, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 19, 6, 0, -3.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -3.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.5f, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -1.625f, -0.125f, 0)
			.setRotationPoint(-72.25f, -18.25f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 12, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.5f, -15, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 198, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, new Vec3f(0.0, 0.1875, 0.0))
			.setRotationPoint(-71.9375f, -16.125f, 0).setRotationAngle(0, 0, -30)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 198, textureX, textureY).addCylinder(0, -0.125f, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-71.9375f, -16.125f, 0).setRotationAngle(0, 0, -30)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0.5f, -0.5625f, 0, 0.5f, -1.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0.5f, -0.5625f, 0.3125f, 0.5f, -1.75f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(77.625f, -3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(77.625f, -3, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 153, 4, 12, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-76.375f, -3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 142, 1, 5, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0.1875f, 0.3125f, 0, 0.1875f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-71.75f, -3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0, -0.25f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.25f, 0.3125f, 0, -2, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(70.4375f, -3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 142, 1, 5, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0.1875f, 0.3125f, 0, 0.1875f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-71.75f, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0, -2, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -2, 0.3125f, 0, -0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(70.4375f, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 21, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(45.25f, -23.6875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, -0.5f, 0, -0.0625f, -0.5f)
			.setRotationPoint(45.25f, -21.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.75f, 0.5f, 0, -1.75f, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(45.25f, -23.6875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 13, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(20.0625f, -23.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 13, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(25.125f, -23.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 13, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(27.0625f, -23.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 13, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(32.125f, -23.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 13, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(34, -23.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 13, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(39.0625f, -23.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 16, 13, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0, 0)
			.setRotationPoint(20.0625f, -18.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 13, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, -0.5f, 0, 0.375f, -0.5f)
			.setRotationPoint(20.0625f, -23.125f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 13, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, -0.5f, 0, 0.375f, -0.5f)
			.setRotationPoint(27.0625f, -23.125f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 13, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, -0.5f, 0, 0.375f, -0.5f)
			.setRotationPoint(34, -23.125f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(27.0625f, -19.4375f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(34, -19.4375f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(27.0625f, -20.8125f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(34, -20.8125f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(27.0625f, -20.125f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(34, -20.125f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(27.0625f, -21.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(27.0625f, -22.1875f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(34, -21.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0.125f, 0.0625f, 0, 0.125f, 0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(34, -22.1875f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 4, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0.1875f, -2, 0.0625f, 0.1875f, -2, 0.0625f, 0.1875f, 2, 0, 0.1875f, 2)
			.setRotationPoint(-66, -17.9375f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-69.75f, -10.0625f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(44.9375f, -20.0625f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(45.3125f, -20.125f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.875f, 0, -0.0625f, -0.875f, 0, -0.6875f, 0, -0.8125f, -0.625f, 0, -0.8125f, -0.625f, -0.875f, 0, -0.6875f, -0.875f)
			.setRotationPoint(45.125f, -20.125f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(12.1875f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(1.875f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-9.1875f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-20.25f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-27.8125f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-37.9375f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-44.625f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-67.0625f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-55, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-69.75f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, -0.0625f, -0.8125f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, -0.0625f, -0.8125f, -0.75f)
			.setRotationPoint(-71.8125f, 3.375f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-71.5f, 3.3125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.75f, 0, -0.8125f, -0.625f, 0, -0.8125f, -0.625f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-71.6875f, 3.3125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, -0.75f, 0, -0.1875f, -0.75f)
			.setRotationPoint(-71.8125f, -9.4375f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-71.8125f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-71.5f, -9.9375f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-71.75f, -9.9375f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-71.25f, -10, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 22, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, 1.0625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 3, 22, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(14.875f, 1.0625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 175, textureX, textureY).addCylinder(0, 0, 0, 2, 12, 8, 1.03125f, 1.03125f, 3, new Vec3f(-0.125, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 3, 18, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-20.5f, 1.0625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 148, textureX, textureY).addCylinder(-0.625f, 0, 0, 2, 1, 8, 0.96875f, 1.03125f, 3, new Vec3f(-0.375, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 148, textureX, textureY).addCylinder(-0.9375f, 0, 0, 2, 1, 8, 0.78125f, 0.96875f, 3, new Vec3f(-0.6875, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 147, textureX, textureY).addCylinder(-1.1875f, 0, 0, 2, 1, 8, 0.40625f, 0.78125f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 197, textureX, textureY).addCylinder(-1.375f, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 197, textureX, textureY).addCylinder(-1.5625f, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 147, textureX, textureY).addCylinder(11.875f, 0, 0, 2, 1, 8, 1.03125f, 0.96875f, 3, new Vec3f(-0.375, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 142, textureX, textureY).addCylinder(12.5f, 0, 0, 2, 1, 8, 0.96875f, 0.78125f, 3, new Vec3f(-0.6875, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 142, textureX, textureY).addCylinder(12.8125f, 0, 0, 2, 1, 8, 0.78125f, 0.40625f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 197, textureX, textureY).addCylinder(13.0625f, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 197, textureX, textureY).addCylinder(13.25f, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(11.9375f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 178.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 175, textureX, textureY).addCylinder(0, 0, 0, 2, 12, 8, 1.03125f, 1.03125f, 3, new Vec3f(-0.125, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 135, textureX, textureY).addCylinder(-0.625f, 0, 0, 2, 1, 8, 0.96875f, 1.03125f, 3, new Vec3f(-0.375, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 134, textureX, textureY).addCylinder(-0.9375f, 0, 0, 2, 1, 8, 0.78125f, 0.96875f, 3, new Vec3f(-0.6875, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 134, textureX, textureY).addCylinder(-1.1875f, 0, 0, 2, 1, 8, 0.40625f, 0.78125f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 197, textureX, textureY).addCylinder(-1.375f, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 197, textureX, textureY).addCylinder(-1.5625f, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 132, textureX, textureY).addCylinder(11.875f, 0, 0, 2, 1, 8, 1.03125f, 0.96875f, 3, new Vec3f(-0.375, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 132, textureX, textureY).addCylinder(12.5f, 0, 0, 2, 1, 8, 0.96875f, 0.78125f, 3, new Vec3f(-0.6875, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 131, textureX, textureY).addCylinder(12.8125f, 0, 0, 2, 1, 8, 0.78125f, 0.40625f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 197, textureX, textureY).addCylinder(13.0625f, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 197, textureX, textureY).addCylinder(13.25f, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(-17.5625f, 2.03125f, -8.9375f).setRotationAngle(0, 0, 1.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 22, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0.3125f, -1.5f, 0.125f, 0.3125f, -1.5f, 0.125f, 0.3125f, -1.5f, 0, 0.3125f, -1.5f)
			.setRotationPoint(14.875f, 4.0625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 3, 0, 0, 0, 0.1148f, 0.375f, 0, 0.1148f, 0.375f, 0.625f, 0, 0, 0.625f, 0, 0, -0.4375f, -0.25f, 0.375f, -0.4375f, -0.25f, 0.375f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(-20.5f, 5.8125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 22, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.3125f, -1.5f, -0.5f, 0.3125f, -1.5f, -0.5f, 0.3125f, -1.5f, 0, 0.3125f, -1.5f)
			.setRotationPoint(-27, 4.0625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 2, 18, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, 0.3125f, 0, 0.375f, 0.3125f, 0, 0.375f, 0.3125f, -1.75f, 0, 0.3125f, -1.75f)
			.setRotationPoint(-20.5f, 4.0625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 54, 2, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, -2.5f, 0, -0.125f, -2.5f, 0, -0.125f, -2.5f, 0, -0.125f, -2.5f)
			.setRotationPoint(-27, 6.375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 54, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, -0.6875f, -1)
			.setRotationPoint(-27, 8.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 22, 0, 0, 0, -5, -0.5f, 0, -5, -0.5f, 0, -5, 0, 0, -5, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-27, 0.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 22, 0, 0, 0, -5, 0.125f, 0, -5, 0.125f, 0, -5, 0, 0, -5, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(14.875f, 0.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 18, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -5.25f, 0, 0, -5.25f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-20.5f, 0.8125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, 0, 0.804f, 0, 0, 0.804f, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.0625f, 0.1148f, 0, 0.0625f, 0.1148f, 0, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-20.5f, 4.75f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, 0, 0.804f, 0, 0, 0.804f, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.0625f, 0.1148f, 0, 0.0625f, 0.1148f, 0, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-1.125f, 4.75f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.9375f, 0, 0, 0.9375f, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0.1875f, 0.375f, 0, 0.1875f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(52.625f, -1.6875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(45.5f, -1.6875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.8125f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.8125f, 0)
			.setRotationPoint(44.5f, -1.6875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(18.25f, -1.6875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 85, 1, 1, 0, 0, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.3125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-69.75f, -10.0625f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(12.125f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.0625f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.1875f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.25f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.9375f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.8125f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.0625f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.0625f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.75f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, -0.0625f, -0.8125f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, -0.0625f, -0.8125f, 0)
			.setRotationPoint(-71.8125f, 3.375f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-71.5f, 3.3125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.75f, -0.75f, -0.8125f, -0.625f, -0.75f, -0.8125f, -0.625f, 0, 0, -0.75f, 0)
			.setRotationPoint(-71.6875f, 3.3125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.75f, -0.75f, -0.1875f, -0.75f, -0.75f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-71.8125f, -9.4375f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.6875f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-71.8125f, -9.6875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.8125f, -0.75f, -0.75f, -0.8125f, 0, 0, -0.75f, 0)
			.setRotationPoint(-71.5f, -9.9375f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-71.75f, -9.9375f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-71.25f, -10, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, -0.3125f, -0.625f, -0.5f, -0.3125f, -0.625f, -0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(19.25f, -14.125f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, -0.3125f, -0.625f, -0.5f, -0.3125f, -0.625f, -0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(34.625f, -14.125f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.625f, -0.5f, -0.125f, -0.625f, -0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(25.125f, -14.125f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.3125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(19.25f, -14.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.6875f, 0, -0.75f, -0.6875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.6875f, -0.75f, -0.75f, -0.6875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(44.9375f, -14.4375f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, 0, 0, 0, 0, 0, -0.625f, -0.875f, -0.25f, -0.625f, -0.875f, -0.25f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(45.3125f, -14.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.875f, -0.8125f, 0, -0.875f, -0.8125f, 0, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.875f, -0.8125f, -0.625f, -0.875f, -0.8125f, -0.625f, 0, 0, -0.6875f, 0)
			.setRotationPoint(45.125f, -14.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, -0.125f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0.125f, -0.125f, 0, -0.0625f, -0.5f, -0.625f, -0.5f, -0.625f, -0.625f, -0.5f, -0.625f, 0, -0.0625f, -0.5f, 0)
			.setRotationPoint(18.75f, -14.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, -0.125f, 0, 0, -0.5f, -0.625f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.9375f, -10.1875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -0.625f, 0.1875f, 4.0625f, -0.625f, 0.1875f, 4.0625f, 0, 0, -0.125f, 0, -0.125f, -0.5f, -0.625f, 0.375f, -4.6875f, -0.625f, 0.375f, -4.6875f, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(15.4375f, -10.3125f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 5, 4, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -0.125f, 0.1875f, 0, -0.125f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(18.375f, -8.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 2, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(2.0625f, -23.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 13, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(19.1875f, -21, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(19.1875f, -23.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.6875f, -0.125f, 0, -0.6875f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(24.90625f, -23.125f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(30.46875f, -23.125f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(41.375f, -23.125f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 14, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0)
			.setRotationPoint(19.1875f, -17.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0, 0, -0.375f, 0, -0.59375f, -0.375f, 0.25f, -0.59375f, -0.375f, 0.25f, -0.59375f, -0.375f, 0, -0.59375f, -0.375f)
			.setRotationPoint(25.21875f, -23.125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0, 0, -0.375f, 0, -0.15625f, -0.375f, 0.25f, -0.15625f, -0.375f, 0.25f, -0.15625f, -0.375f, 0, -0.15625f, -0.375f)
			.setRotationPoint(25.21875f, -18.09375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(25.21875f, -22.71875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(29.96875f, -22.71875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(25.65625f, -22.71875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.375f, -0.09375f, 0, -0.375f, -0.09375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.59375f, -0.375f, -0.09375f, -0.59375f, -0.375f, -0.09375f, -0.59375f, -0.375f, 0, -0.59375f, -0.375f)
			.setRotationPoint(35.46875f, -23.125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.375f, -0.09375f, 0, -0.375f, -0.09375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.15625f, -0.375f, -0.09375f, -0.15625f, -0.375f, -0.09375f, -0.15625f, -0.375f, 0, -0.15625f, -0.375f)
			.setRotationPoint(35.46875f, -18.09375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(35.46875f, -22.71875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, 0.03125f, 0, -0.375f, 0.03125f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0.03125f, -0.375f, -0.375f, 0.03125f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(40.34375f, -22.71875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(36.03125f, -22.71875f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, -0.6875f, -0.3125f, -0.0625f, -0.6875f, -0.3125f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.6875f, -0.6875f, -0.3125f, -0.6875f, -0.6875f, -0.3125f, -0.6875f, -0.0625f, -0.0625f, -0.6875f, -0.0625f)
			.setRotationPoint(-2.0625f, 2.1875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, -0.625f, 0, -0.0625f, -0.625f, 0)
			.setRotationPoint(-2, 2.1875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.625f, -0.625f, -0.0625f, -0.625f, -0.625f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.75f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-2.3125f, 1.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.0625f, -0.8125f, -0.6875f, -0.75f, -0.75f, -0.6875f, -0.75f, -0.75f, -0.0625f, -0.0625f, -0.8125f, -0.0625f)
			.setRotationPoint(-2.25f, 2.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.375f, -0.6875f, -0.75f, 0.375f, -0.6875f, -0.75f, 0.375f, -0.0625f, 0, 0.375f, -0.0625f)
			.setRotationPoint(-2.25f, -1.125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, -0.6875f, -0.3125f, -0.0625f, -0.6875f, -0.3125f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.6875f, -0.6875f, -0.3125f, -0.6875f, -0.6875f, -0.3125f, -0.6875f, -0.0625f, -0.0625f, -0.6875f, -0.0625f)
			.setRotationPoint(13.375f, 1.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, -0.625f, 0, -0.0625f, -0.625f, 0)
			.setRotationPoint(13.75f, 1.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, -0.8125f, -0.8125f, -0.6875f, -0.8125f, -0.8125f, -0.0625f, 0, -0.75f, -0.0625f)
			.setRotationPoint(14.0625f, 1.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, -0.6875f, -0.3125f, -0.0625f, -0.6875f, -0.3125f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.6875f, -0.6875f, -0.3125f, -0.6875f, -0.6875f, -0.3125f, -0.6875f, -0.0625f, -0.0625f, -0.6875f, -0.0625f)
			.setRotationPoint(-19.8125f, 1.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, -0.625f, 0, -0.0625f, -0.625f, 0)
			.setRotationPoint(-19.75f, 1.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.0625f, -0.8125f, -0.6875f, -0.75f, -0.75f, -0.6875f, -0.75f, -0.75f, -0.0625f, -0.0625f, -0.8125f, -0.0625f)
			.setRotationPoint(-20, 1.9375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -2.1875f, -0.75f, 0, -2.1875f, -0.75f, 0, 1.4375f, 0, 0, 1.4375f, 0, 0.0625f, -0.6875f, -0.75f, 0.0625f, -0.6875f, -0.75f, 0.0625f, -0.0625f, 0, 0.0625f, -0.0625f)
			.setRotationPoint(-20, -1.125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, -0.6875f, -0.0625f, -0.0625f, -0.6875f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.0625f, -0.6875f, -0.6875f, -0.0625f, -0.6875f, -0.6875f, -0.0625f, -0.6875f, -0.0625f, -0.0625f, -0.6875f, -0.0625f)
			.setRotationPoint(-4.25f, 2.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, -0.625f, 0, -0.0625f, -0.625f, 0)
			.setRotationPoint(-3.625f, 2.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.625f, -0.625f, -0.0625f, -0.625f, -0.625f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.75f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.375f, 2, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, -0.8125f, -0.8125f, -0.6875f, -0.8125f, -0.8125f, -0.0625f, 0, -0.75f, -0.0625f)
			.setRotationPoint(-3.3125f, 2.3125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-3.3125f, 0.3125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.625f, -0.625f, -0.0625f, -0.625f, -0.625f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.4375f, -0.625f, -0.625f, -0.4375f, -0.625f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(-3.375f, 0.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.625f, -0.625f, -0.0625f, -0.625f, -0.625f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.5f, -0.625f, -0.625f, -0.5f, -0.625f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.375f, -0.125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 18, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(76.375f, -3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.25f, 0.3125f, 0, -0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(76.875f, -3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 18, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0)
			.setRotationPoint(-77.375f, -3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 2, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(76.375f, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 2, 0, -0.5f, -1, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0)
			.setRotationPoint(-77.375f, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -1, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(76.375f, -3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0)
			.setRotationPoint(-77.375f, -3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.5f, 0, -0.1875f, 0.5f)
			.setRotationPoint(70.625f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, -1.1875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, 1, 6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, 3.1875f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, 5.375f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, 7.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.5f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, -1.5f, -0.5f, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(71.125f, -2.1875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.5f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, -1.5f, -0.375f, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(71.125f, 0, 6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.5f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, -1.5f, -0.125f, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(71.125f, 2.1875f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -1.5f, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(71.125f, 4.375f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(72.125f, 6.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, -1.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, 1, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, 3.1875f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, 5.375f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.125f, 7.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.5f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, 0, -1.5f, -0.5f, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.125f, -2.1875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.5f, -0.375f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f, -0.375f, 0, -1.5f, -0.375f, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.125f, 0, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.5f, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, 0, -1.5f, -0.125f, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.125f, 2.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -1.5f, 0, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.125f, 4.375f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(72.125f, 6.5625f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.5f, -0.5f, -0.1875f, 0.5f)
			.setRotationPoint(-72.25f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, -1.1875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, 1, 6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, 3.1875f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, 5.375f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, 7.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.375f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, -1.375f, -0.5f, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f)
			.setRotationPoint(-76.75f, -2.1875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.375f, -0.375f, 0, -1.5f, -0.375f, 0, -1.5f, -0.375f, -0.75f, -1.375f, -0.375f, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f)
			.setRotationPoint(-76.75f, 0, 6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.375f, -0.125f, 0, -1.5f, -0.125f, 0, -1.5f, -0.125f, -0.75f, -1.375f, -0.125f, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f)
			.setRotationPoint(-76.75f, 2.1875f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.375f, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, -1.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f)
			.setRotationPoint(-76.75f, 4.375f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.875f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0, -0.75f)
			.setRotationPoint(-76.75f, 6.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, -1.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, 1, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, 3.1875f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, 5.375f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-76.75f, 7.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.375f, -0.5f, -0.75f, -1.5f, -0.5f, -0.75f, -1.5f, -0.5f, 0, -1.375f, -0.5f, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-76.75f, -2.1875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.375f, -0.375f, -0.75f, -1.5f, -0.375f, -0.75f, -1.5f, -0.375f, 0, -1.375f, -0.375f, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-76.75f, 0, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.375f, -0.125f, -0.75f, -1.5f, -0.125f, -0.75f, -1.5f, -0.125f, 0, -1.375f, -0.125f, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-76.75f, 2.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.375f, 0, -0.75f, -1.5f, 0, -0.75f, -1.5f, 0, 0, -1.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-76.75f, 4.375f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.875f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.875f, 0.5f, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(-76.75f, 6.5625f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(68.625f, -1.6875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0.3125f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0.4375f, -0.5f, -0.5f, 0.4375f, -0.5f, -0.5f, 0.4375f, 0, 0.3125f, 0.4375f, 0)
			.setRotationPoint(70.125f, 0.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.375f, 0, 0, 0.375f, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.375f, -2, 0)
			.setRotationPoint(68.8125f, 0.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.1875f, 0, -0.5f)
			.setRotationPoint(68.625f, -1.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0.3125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.3125f, 0, -0.5f, 0.3125f, 0.4375f, 0, -0.5f, 0.4375f, 0, -0.5f, 0.4375f, -0.5f, 0.3125f, 0.4375f, -0.5f)
			.setRotationPoint(70.125f, 0.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, -2, 0, 0, 0, 0, 0, 0, -0.5f, 0.375f, -2, -0.5f)
			.setRotationPoint(68.8125f, 0.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.5f, 0, -0.1875f, 0.5f)
			.setRotationPoint(70.625f, -1.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.5f, -0.5f, -0.1875f, 0.5f)
			.setRotationPoint(-72.25f, -1.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.5625f, 0.3125f, 0.5f, 0, 0.3125f, 0.5f)
			.setRotationPoint(77.625f, -3, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, -1.75f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0.3125f, 0, -1.75f, 0.3125f, 0, -0.5625f, 0.3125f, 0.5f, 0, 0.3125f, 0.5f)
			.setRotationPoint(77.625f, -3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0.5f, -0.5625f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0.5f, -0.5625f, 0.3125f, 0.5f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(77.625f, -3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.875f, 2, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-80.875f, 2, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, -0.78125f, -0.75f, 0, -1.96875f, -0.75f, 0, 0.125f, -0.75f, 0, -2.875f, -0.75f, 0, -1.5f, 0, -1, -1.25f, 0, -1, 0.75f, 0, 0, -3.5f, 0, 0)
			.setRotationPoint(76.875f, 6, -9).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, -0.53125f, -0.25f, 1, -2.21875f, -0.25f, 1, 0, -0.25f, 0, -2.75f, -0.25f, 0, -1.03125f, 0, 0, -1.71875f, 0, 0, 0.375f, 0, 0, -3.125f, 0, 0)
			.setRotationPoint(76.625f, 5.75f, -9).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, -0.28125f, 0, 0, -2.46875f, 0, 0, 0, 0, 0, -2.75f, 0, 0, -0.53125f, 0, 0, -2.21875f, 0, 0, 0, 0, 0, -2.75f, 0, 0)
			.setRotationPoint(76.625f, 5, -10).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -0.25f, 0, 0, -2.5f, 0, 0, -0.48f, 0, 0, -2.27f, 0, 0, -0.25f, -0.5f, 0, -2.5f, -0.5f, 0, -0.48f, -0.5f, 0, -2.27f, -0.5f, 0)
			.setRotationPoint(76.65625f, 4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -0.75f, 0, -0.375f, -2, 0, -0.375f, 0.52f, -0.5f, 0, -3.27f, -0.5f, 0, -0.1875f, 0, -0.0625f, -2.5625f, 0, -0.0625f, -0.48f, 0, 0, -2.27f, 0, 0)
			.setRotationPoint(76.90625f, 1.5f, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -1.375f, 0, -0.625f, -1.375f, 0, -0.625f, 0.52f, -1, 0, -3.27f, -1, 0, -0.75f, -0.5f, -0.375f, -2, -0.5f, -0.375f, 0.52f, 0, 0, -3.27f, 0, 0)
			.setRotationPoint(76.90625f, 1, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 8, 0, -0.25f, 0, 0, -2.5f, 0, 0, -0.48f, 0, 0, -2.27f, 0, 0, -0.25f, -0.5f, 0, -2.5f, -0.5f, 0, -0.48f, -0.5f, 0, -2.27f, -0.5f, 0)
			.setRotationPoint(76.65625f, 3, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -0.4375f, -0.5f, -0.0625f, -2.3125f, -0.5f, -0.0625f, -0.23f, -0.5f, 0, -2.52f, -0.5f, 0, -0.25f, 0, 0, -2.5f, 0, 0, -0.48f, 0, 0, -2.27f, 0, 0)
			.setRotationPoint(76.65625f, 2, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.875f, 4, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.875f, 4, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-78.875f, 4, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(-78.875f, 4, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(70.65625f, -2.5f, -11.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -1.75f, -0.625f, 0, -1.75f, -0.625f, 0, 1.125f, 0, 0, 1.125f, 0.125f, -0.5f, -0.625f, -0.75f, -0.5f, -0.625f, -0.75f, -0.5f, 0, 0.125f, -0.5f, 0)
			.setRotationPoint(71.125f, -9.625f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.15625f, 0, -1.75f, -0.78125f, 0, -1.75f, -0.78125f, 0, 1.125f, 0.15625f, 0, 1.125f, 0.5f, -0.375f, -0.625f, -1.125f, -0.375f, -0.625f, -1.125f, -0.375f, 0, 0.5f, -0.375f, 0)
			.setRotationPoint(71.15625f, -6.125f, -11.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.125f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(70.625f, -10.0625f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.09375f, -0.71875f, 0, -0.09375f, -0.71875f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(70.03125f, 2.75f, -11.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(70.03125f, 2.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.0625f, 0, -0.5f, 0.0625f, 0, -0.5f, 0.0625f, -0.5f, 0, 0.0625f, -0.5f)
			.setRotationPoint(76.375f, -10.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.0625f, 0, -0.5f, 0.0625f, 0, -0.5f, 0.0625f, -0.5f, 0, 0.0625f, -0.5f)
			.setRotationPoint(76.375f, -10.0625f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.1875f, 0, -0.6875f, -0.1875f)
			.setRotationPoint(76.375f, -10.0625f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.5f, -0.5f, 0.0625f, -0.5f, -0.5f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(76.375f, -10.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.5f, -0.5f, 0.0625f, -0.5f, -0.5f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(76.375f, -10.0625f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f, -0.5f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(76.375f, -10.0625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(76.4375f, -3.125f, 11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.09375f, -0.71875f, -0.625f, -0.09375f, -0.71875f)
			.setRotationPoint(75.8125f, 2.75f, 11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.8125f, -0.625f, -0.625f, -0.8125f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.625f, 0, -0.8125f)
			.setRotationPoint(75.8125f, 2.75f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(76.4375f, -3.625f, 11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(76.4375f, -10.0625f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, -0.0625f, -3.5f, -0.625f, -0.0625f, -3.5f, -0.625f, -0.0625f, 2.875f, 0, -0.0625f, 2.875f)
			.setRotationPoint(76.4375f, -9.5625f, 7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, -0.625f, -0.5f, -0.625f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(76.4375f, -3.125f, -12.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.09375f, -0.71875f, 0, -0.09375f, -0.71875f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(75.8125f, 2.75f, -12.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, -0.8125f, 0, -0.625f, -0.8125f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(75.8125f, 2.75f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, -0.625f, -0.625f, -0.5f, -0.625f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(76.4375f, -3.625f, -12.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.625f, -0.1875f, -0.3125f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(76.4375f, -10.0625f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0.3125f, -0.8125f, -0.625f, 0.3125f, -0.8125f, -0.625f, 0, 0, 0, 0, 0, 0, -0.0625f, 2.875f, -0.625f, -0.0625f, 2.875f, -0.625f, -0.0625f, -3.5f, 0, -0.0625f, -3.5f)
			.setRotationPoint(76.4375f, -9.5625f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 79, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(76.625f, -9.8125f, -2.25f).setRotationAngle(-60, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 75, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(76.625f, -9.125f, -1.9375f).setRotationAngle(-90, 90, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 73, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(76.625f, -8.5f, -1.4375f).setRotationAngle(-18, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 73, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(76.625f, -9.8125f, 2.25f).setRotationAngle(-120, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 73, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(76.625f, -9.125f, 1.9375f).setRotationAngle(-90, 90, -45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 73, textureX, textureY)
			.addShapeBox(0, -0.5f, -1, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(76.625f, -8.5f, 1.4375f).setRotationAngle(18, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 70, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(76.625f, -8.1875f, -0.75f).setRotationAngle(0, 0, 90)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0.3125f, 0, -0.5f, 0.3125f, 0, -0.5f, 0.3125f, -0.125f, 0, 0.3125f, -0.125f)
			.setRotationPoint(78.71875f, -5.3125f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(79.21875f, -5.3125f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(78.71875f, -3, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, 0, -1, 0, 0, -1, -0.8125f, 0, -0.75f, -0.8125f)
			.setRotationPoint(78.71875f, -2.75f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 193, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.8125f, 0.8125f, 3, new Vec3f(-0.625, 0.0, 0.0))
			.setRotationPoint(79.25f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 193, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.8125f, 0.78125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(79.625f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 193, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(79.75f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 193, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.28125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(79.8125f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 193, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.28125f, 0, 3, new Vec3f(-0.96875, 0.0, 0.0))
			.setRotationPoint(79.875f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.125f, -0.5f, 0.3125f, -0.125f, -0.5f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(78.71875f, -5.3125f, -6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.875f, -0.125f, -0.5f, -0.875f, -0.125f, -0.5f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(79.21875f, -5.3125f, -6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.71875f, -3, -6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, 0, -1, -0.8125f, 0, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(78.71875f, -2.75f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.8125f, 0.8125f, 3, new Vec3f(-0.625, 0.0, 0.0))
			.setRotationPoint(79.25f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.8125f, 0.78125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(79.625f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(79.75f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.28125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(79.8125f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 3")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.28125f, 0, 3, new Vec3f(-0.96875, 0.0, 0.0))
			.setRotationPoint(79.875f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.3125f, 0, 0.5f, -0.6875f, 0, 0.5f, -0.6875f, 0.5f, 0, 0.3125f, 0.5f)
			.setRotationPoint(76.875f, -1.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.3125f, 0.5f, 0.5f, -0.6875f, 0.5f, 0.5f, -0.6875f, 0, 0, 0.3125f, 0)
			.setRotationPoint(76.875f, -1.6875f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, -0.5f, 0.0625f, -0.5f)
			.setRotationPoint(-77.375f, -10.0625f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.5f, -0.5f, 0.0625f, -0.5f)
			.setRotationPoint(-77.375f, -10.0625f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f)
			.setRotationPoint(-77.375f, -10.0625f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.0625f, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, -0.5f, 0.0625f, 0)
			.setRotationPoint(-77.375f, -10.0625f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.0625f, -0.5f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, -0.5f, 0.0625f, 0)
			.setRotationPoint(-77.375f, -10.0625f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.6875f, -0.1875f, 0, -0.6875f, -0.1875f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0)
			.setRotationPoint(-77.375f, -10.0625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.625f, -0.5f, -0.625f)
			.setRotationPoint(-77.4375f, -3.125f, 11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.09375f, -0.71875f, 0, -0.09375f, -0.71875f)
			.setRotationPoint(-76.8125f, 2.75f, 11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.8125f, 0, -0.625f, -0.8125f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.8125f, 0, 0, -0.8125f)
			.setRotationPoint(-76.8125f, 2.75f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.625f, -0.5f, -0.625f)
			.setRotationPoint(-77.4375f, -3.625f, 11.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.3125f, -0.625f, -0.1875f, -0.3125f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f)
			.setRotationPoint(-77.4375f, -10.0625f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, -0.625f, 0.3125f, -0.8125f, -0.625f, -0.0625f, -3.5f, 0, -0.0625f, -3.5f, 0, -0.0625f, 2.875f, -0.625f, -0.0625f, 2.875f)
			.setRotationPoint(-77.4375f, -9.5625f, 7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.625f, -0.5f, 0)
			.setRotationPoint(-77.4375f, -3.125f, -12.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.09375f, -0.71875f, -0.625f, -0.09375f, -0.71875f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-76.8125f, 2.75f, -12.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, -0.8125f, -0.625f, -0.625f, -0.8125f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.8125f, -0.625f, 0, -0.8125f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-76.8125f, 2.75f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.625f, -0.5f, 0)
			.setRotationPoint(-77.4375f, -3.625f, -12.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-77.4375f, -10.0625f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.0625f, 2.875f, 0, -0.0625f, 2.875f, 0, -0.0625f, -3.5f, -0.625f, -0.0625f, -3.5f)
			.setRotationPoint(-77.4375f, -9.5625f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 65, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-76.625f, -9.8125f, -2.25f).setRotationAngle(-60, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 65, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-76.625f, -9.125f, -1.9375f).setRotationAngle(-90, 90, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 51, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-76.625f, -8.5f, -1.4375f).setRotationAngle(-18, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 51, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-76.625f, -9.8125f, 2.25f).setRotationAngle(-120, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 509, 31, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-76.625f, -9.125f, 1.9375f).setRotationAngle(-90, 90, -45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 22, textureX, textureY)
			.addShapeBox(0, -0.5f, -1, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-76.625f, -8.5f, 1.4375f).setRotationAngle(18, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 509, 8, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 0, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(-76.625f, -8.1875f, -0.75f).setRotationAngle(0, 0, 90)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1.75f, 0, 0, -0.5625f, 0.3125f, 0.5f, 0, 0.3125f, 0.5f, 0, 0.3125f, 0, -1.75f, 0.3125f, 0)
			.setRotationPoint(-79.625f, -3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-79.625f, -3, -2).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard1(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.25f, 0.3125f, 0)
			.setRotationPoint(-77.875f, -3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5625f, 0, 0.5f, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0.5f, -0.5625f, 0.3125f, 0.5f)
			.setRotationPoint(-79.625f, -3, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5625f, 0, 0.5f, -1.75f, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0.5f, -0.5625f, 0.3125f, 0.5f)
			.setRotationPoint(-79.625f, -3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5625f, 0.3125f, 0.5f, 0, 0.3125f, 0.5f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-79.625f, -3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, -1.96875f, -0.75f, 0, -0.78125f, -0.75f, 0, -2.875f, -0.75f, 0, 0.125f, -0.75f, 0, -1.25f, 0, -1, -1.5f, 0, -1, -3.5f, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(-79.875f, 6, -9).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, -2.21875f, -0.25f, 1, -0.53125f, -0.25f, 1, -2.75f, -0.25f, 0, 0, -0.25f, 0, -1.71875f, 0, 0, -1.03125f, 0, 0, -3.125f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-79.625f, 5.75f, -9).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, -2.46875f, 0, 0, -0.28125f, 0, 0, -2.75f, 0, 0, 0, 0, 0, -2.21875f, 0, 0, -0.53125f, 0, 0, -2.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.625f, 5, -10).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -2.5f, 0, 0, -0.25f, 0, 0, -2.27f, 0, 0, -0.48f, 0, 0, -2.5f, -0.5f, 0, -0.25f, -0.5f, 0, -2.27f, -0.5f, 0, -0.48f, -0.5f, 0)
			.setRotationPoint(-79.65625f, 4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -2, 0, -0.375f, -0.75f, 0, -0.375f, -3.27f, -0.5f, 0, 0.52f, -0.5f, 0, -2.5625f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -2.27f, 0, 0, -0.48f, 0, 0)
			.setRotationPoint(-79.90625f, 1.5f, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -1.375f, 0, -0.625f, -1.375f, 0, -0.625f, -3.27f, -1, 0, 0.52f, -1, 0, -2, -0.5f, -0.375f, -0.75f, -0.5f, -0.375f, -3.27f, 0, 0, 0.52f, 0, 0)
			.setRotationPoint(-79.90625f, 1, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 8, 0, -2.5f, 0, 0, -0.25f, 0, 0, -2.27f, 0, 0, -0.48f, 0, 0, -2.5f, -0.5f, 0, -0.25f, -0.5f, 0, -2.27f, -0.5f, 0, -0.48f, -0.5f, 0)
			.setRotationPoint(-79.65625f, 3, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -2.3125f, -0.5f, -0.0625f, -0.4375f, -0.5f, -0.0625f, -2.52f, -0.5f, 0, -0.23f, -0.5f, 0, -2.5f, 0, 0, -0.25f, 0, 0, -2.27f, 0, 0, -0.48f, 0, 0)
			.setRotationPoint(-79.65625f, 2, -10).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, -0.125f, -0.5f, 0.3125f, -0.125f)
			.setRotationPoint(-79.71875f, -5.3125f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.5f, -0.875f, -0.125f)
			.setRotationPoint(-80.21875f, -5.3125f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-79.71875f, -3, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, -0.8125f, 0, -1, -0.8125f)
			.setRotationPoint(-79.71875f, -2.75f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.8125f, 0.8125f, 3, new Vec3f(-0.625, 0.0, 0.0))
			.setRotationPoint(-79.59375f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.78125f, 0.8125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-79.71875f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.75f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-79.78125f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.28125f, 0.625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-79.84375f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0E-15f, 0.28125f, 3, new Vec3f(-0.96875, 0.0, 0.0))
			.setRotationPoint(-79.875f, -4.25f, 5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.3125f, -0.125f, 0, 0.3125f, -0.125f, 0, 0.3125f, 0, -0.5f, 0.3125f, 0)
			.setRotationPoint(-79.71875f, -5.3125f, -6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-80.21875f, -5.3125f, -6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-79.71875f, -3, -6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.8125f, 0.8125f, 3, new Vec3f(-0.625, 0.0, 0.0))
			.setRotationPoint(-79.59375f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.78125f, 0.8125f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-79.71875f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.75f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-79.78125f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 3")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.28125f, 0.625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-79.84375f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 4")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0E-15f, 0.28125f, 3, new Vec3f(-0.96875, 0.0, 0.0))
			.setRotationPoint(-79.875f, -4.25f, -5.5625f).setRotationAngle(0, 0, 0).setName("DITCH LIGHT 5")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.6875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0.5f, 0.5f, -0.6875f, 0.5f)
			.setRotationPoint(-77.875f, -1.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.6875f, 0.5f, 0, 0.3125f, 0.5f, 0, 0.3125f, 0, 0.5f, -0.6875f, 0)
			.setRotationPoint(-77.875f, -1.6875f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0.125f, -0.75f, 0, -2.875f, -0.75f, 0, -0.78125f, -0.75f, 0, -1.96875f, -0.75f, 0, 0.75f, 0, 0, -3.5f, 0, 0, -1.5f, 0, -1, -1.25f, 0, -1)
			.setRotationPoint(-79.875f, 6, 0).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, 0, -0.25f, 0, -2.75f, -0.25f, 0, -0.53125f, -0.25f, 1, -2.21875f, -0.25f, 1, 0.375f, 0, 0, -3.125f, 0, 0, -1.03125f, 0, 0, -1.71875f, 0, 0)
			.setRotationPoint(-79.625f, 5.75f, 0).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, 0, -2.75f, 0, 0, -0.28125f, 0, 0, -2.46875f, 0, 0, 0, 0, 0, -2.75f, 0, 0, -0.53125f, 0, 0, -2.21875f, 0, 0)
			.setRotationPoint(-79.625f, 5, 0).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -0.48f, 0, 0, -2.27f, 0, 0, -0.25f, 0, 0, -2.5f, 0, 0, -0.48f, -0.5f, 0, -2.27f, -0.5f, 0, -0.25f, -0.5f, 0, -2.5f, -0.5f, 0)
			.setRotationPoint(-79.65625f, 4.5f, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, 0.52f, -0.5f, 0, -3.27f, -0.5f, 0, -0.75f, 0, -0.375f, -2, 0, -0.375f, -0.48f, 0, 0, -2.27f, 0, 0, -0.1875f, 0, -0.0625f, -2.5625f, 0, -0.0625f)
			.setRotationPoint(-79.90625f, 1.5f, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, 0.52f, -1, 0, -3.27f, -1, 0, -1.375f, 0, -0.625f, -1.375f, 0, -0.625f, 0.52f, 0, 0, -3.27f, 0, 0, -0.75f, -0.5f, -0.375f, -2, -0.5f, -0.375f)
			.setRotationPoint(-79.90625f, 1, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 8, 0, -0.48f, 0, 0, -2.27f, 0, 0, -0.25f, 0, 0, -2.5f, 0, 0, -0.48f, -0.5f, 0, -2.27f, -0.5f, 0, -0.25f, -0.5f, 0, -2.5f, -0.5f, 0)
			.setRotationPoint(-79.65625f, 3, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -0.23f, -0.5f, 0, -2.52f, -0.5f, 0, -0.4375f, -0.5f, -0.0625f, -2.3125f, -0.5f, -0.0625f, -0.48f, 0, 0, -2.27f, 0, 0, -0.25f, 0, 0, -2.5f, 0, 0)
			.setRotationPoint(-79.65625f, 2, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -1, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, 0, 0, -1, 0)
			.setRotationPoint(-79.71875f, -2.75f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0.1875f, -0.5f, 0, 0.1875f, -0.5f, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, -2, 0, 0, -2)
			.setRotationPoint(76.375f, 7.125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.5f, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.5f, 0, 0.1875f, -0.5f, 0, -2, 0, 0, -2, 0, 0, -2, -0.5f, 0, -2)
			.setRotationPoint(-77.375f, 7.125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.8125f, 0, 0, -0.8125f)
			.setRotationPoint(76.375f, 6.125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.5f, 0, -0.8125f)
			.setRotationPoint(-77.375f, 6.125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0.1875f, 0.28125f, 0, 0.1875f, 0.28125f, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76.375f, 5.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0.1875f, 0.28125f, 0, 0.1875f, 0.28125f, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.375f, 5.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0.1875f, 0.28125f, 0, 0.1875f, 0.28125f, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71.125f, 5.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0.1875f, 0.28125f, 0, 0.1875f, 0.28125f, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.75f, 5.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.5f, -0.5f, 0.4375f, -0.5f, -0.5f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(-71.25f, -1.6875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-71.25f, -1.6875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, 0.4375f, 0, -0.1875f, 0.4375f, 0, -0.1875f, 0.4375f, -0.5f, 0, 0.4375f, -0.5f)
			.setRotationPoint(-71.25f, 0.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.375f, -2, 0, 0.375f, -2, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-70.4375f, 0.3125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.4375f, 0, -0.5f, 0.4375f, 0, -0.5f, 0.4375f, -0.5f, 0, 0.4375f, -0.5f)
			.setRotationPoint(-71.25f, -1.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(70.65625f, -2.5f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 1.125f, -0.625f, 0, 1.125f, -0.625f, 0, -1.75f, 0, 0, -1.75f, 0.125f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.625f, 0.125f, -0.5f, -0.625f)
			.setRotationPoint(71.125f, -9.625f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.15625f, 0, 1.125f, -0.78125f, 0, 1.125f, -0.78125f, 0, -1.75f, 0.15625f, 0, -1.75f, 0.5f, -0.375f, 0, -1.125f, -0.375f, 0, -1.125f, -0.375f, -0.625f, 0.5f, -0.375f, -0.625f)
			.setRotationPoint(71.15625f, -6.125f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(70.625f, -10.0625f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.09375f, -0.71875f, -0.625f, -0.09375f, -0.71875f)
			.setRotationPoint(70.03125f, 2.75f, 10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.5625f, -0.625f, -0.625f, -0.5625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5625f, -0.625f, 0, -0.5625f)
			.setRotationPoint(70.03125f, 2.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, 0, 0.1875f, 0.28125f, 0, 0.1875f, 0.28125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76.375f, 5.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, 0, 0.1875f, 0.28125f, 0, 0.1875f, 0.28125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.375f, 5.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, 0, 0.1875f, 0.28125f, 0, 0.1875f, 0.28125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71.125f, 5.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 2, 0, 0, 0.1875f, -0.625f, 0, 0.1875f, -0.625f, 0, 0.1875f, 0.28125f, 0, 0.1875f, 0.28125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.75f, 5.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(18.5625f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(33.8125f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(41.78125f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(47.96875f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(10.6875f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(2.4375f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-7.4375f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-15.6875f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-24.375f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-32.875f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-39.1875f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, -0.625f, -0.5625f, 0, -0.625f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-43.125f, -1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 143, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-71.25f, -1.375f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.375f, -0.4375f, -0.875f, -0.375f, -0.4375f, -0.875f, -0.375f, -0.53125f, 0, -0.375f, -0.53125f)
			.setRotationPoint(35.90625f, -22.71875f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.53125f, 0, -0.875f, -0.53125f)
			.setRotationPoint(35.90625f, -18.09375f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.375f, -0.4375f, -0.875f, -0.375f, -0.4375f, -0.875f, -0.375f, -0.53125f, 0, -0.375f, -0.53125f)
			.setRotationPoint(29.96875f, -22.71875f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.53125f, 0, -0.875f, -0.53125f)
			.setRotationPoint(25.53125f, -22.84375f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.375f, -0.4375f, -0.875f, -0.375f, -0.4375f, -0.875f, -0.375f, -0.53125f, 0, -0.375f, -0.53125f)
			.setRotationPoint(25.53125f, -22.71875f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.53125f, 0, -0.875f, -0.53125f)
			.setRotationPoint(25.53125f, -18.09375f, -7.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f, -2, 0, 0.1875f, -2)
			.setRotationPoint(-66.4375f, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f, -2, 0, 0.1875f, -2)
			.setRotationPoint(-55.1875f, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -0.5625f, 0.1875f, 0, -0.5625f, 0.1875f, -2, 0, 0.1875f, -2)
			.setRotationPoint(-45.9375f, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 0, 0, 0, -0.4375f, 0.26865f, -0.1875f, -0.4375f, 0.26865f, -0.1875f, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -14.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 0, 0, 0, -0.4375f, 0.26865f, -0.1875f, -0.4375f, 0.26865f, -0.1875f, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.75f, -14.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 4, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0.1875f, 2, 0.0625f, 0.1875f, 2, 0.0625f, 0.1875f, -2, 0, 0.1875f, -2)
			.setRotationPoint(-66, -17.9375f, 8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, 0, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0, 0, 0, 0, 0, -0.78125f, -0.042f, 0.375f, -0.78125f, -0.042f, 0.375f, -0.78125f, 0, 0, -0.78125f, 0)
			.setRotationPoint(-65.78125f, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0.0625f, -0.78125f, 0, 0.0625f, -0.78125f, 0, 0, 0, 0, 0, 0, -0.375f, -1.66885f, -0.78125f, -0.375f, -1.66885f, -0.78125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-55.40625f, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0.0625f, -0.78125f, 0, 0.0625f, -0.78125f, 0, 0, 0, 0, 0, 0, -0.375f, -1.66885f, -0.78125f, -0.375f, -1.66885f, -0.78125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-54.75f, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0.0625f, -0.78125f, 0, 0.0625f, -0.78125f, 0, 0, 0, 0, 0, 0, -0.375f, -1.66885f, -0.78125f, -0.375f, -1.66885f, -0.78125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.15625f, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0.0625f, -0.78125f, 0, 0.0625f, -0.78125f, 0, 0, 0, 0, 0, 0, -0.375f, -1.66885f, -0.78125f, -0.375f, -1.66885f, -0.78125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-66, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0, 0, 0, 0, 0, -0.78125f, -0.042f, 0.375f, -0.78125f, -0.042f, 0.375f, -0.78125f, 0, 0, -0.78125f, 0)
			.setRotationPoint(-54.53125f, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.06435f, 0.375f, 0, -0.06435f, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.78125f, -0.1689f, 0.375f, -0.78125f, -0.1689f, 0.375f, -0.78125f, -0.5f, 0, -0.78125f, -0.5f)
			.setRotationPoint(-65.78125f, -14.53125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.06435f, 0.375f, 0, -0.06435f, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.78125f, -0.1689f, 0.375f, -0.78125f, -0.1689f, 0.375f, -0.78125f, -0.5f, 0, -0.78125f, -0.5f)
			.setRotationPoint(-54.53125f, -14.53125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 18, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.8125f, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 11, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-66.4375f, -13.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 11, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.4375f, -13.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 4, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.1875f, 0, -0.3125f, 0.1875f, 0, -0.3125f, 0.1875f, -0.5f, 0, 0.1875f, -0.5f)
			.setRotationPoint(-45.5f, -17.9375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 4, 1, 0, 0, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, 0, 0, 0, 0, 0.1875f, -0.5f, -0.3125f, 0.1875f, -0.5f, -0.3125f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-45.5f, -17.9375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.1875f, -2, -0.5625f, 0.1875f, -2, -0.5625f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-66.4375f, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.1875f, -2, -0.5625f, 0.1875f, -2, -0.5625f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-55.1875f, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0.1875f, -2, -0.5625f, 0.1875f, -2, -0.5625f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-45.9375f, -17.9375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.78125f, 0, 0, -0.78125f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.375f, 0, -0.78125f, -0.375f, 0, -0.78125f, -0.375f, -1.66885f, 0, -0.375f, -1.66885f)
			.setRotationPoint(-55.40625f, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.78125f, 0, 0, -0.78125f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.375f, 0, -0.78125f, -0.375f, 0, -0.78125f, -0.375f, -1.66885f, 0, -0.375f, -1.66885f)
			.setRotationPoint(-54.75f, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.78125f, 0, 0, -0.78125f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.375f, 0, -0.78125f, -0.375f, 0, -0.78125f, -0.375f, -1.66885f, 0, -0.375f, -1.66885f)
			.setRotationPoint(-46.15625f, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.78125f, 0, 0, -0.78125f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.375f, 0, -0.78125f, -0.375f, 0, -0.78125f, -0.375f, -1.66885f, 0, -0.375f, -1.66885f)
			.setRotationPoint(-66, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.78125f, 0, 0.375f, -0.78125f, 0, 0.375f, -0.78125f, -0.042f, 0, -0.78125f, -0.042f)
			.setRotationPoint(-65.78125f, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.78125f, 0, 0.375f, -0.78125f, 0, 0.375f, -0.78125f, -0.042f, 0, -0.78125f, -0.042f)
			.setRotationPoint(-54.53125f, -17.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, -0.06435f, 0, 0, -0.06435f, 0, -0.78125f, -0.5f, 0.375f, -0.78125f, -0.5f, 0.375f, -0.78125f, -0.1689f, 0, -0.78125f, -0.1689f)
			.setRotationPoint(-65.78125f, -14.53125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, -0.06435f, 0, 0, -0.06435f, 0, -0.78125f, -0.5f, 0.375f, -0.78125f, -0.5f, 0.375f, -0.78125f, -0.1689f, 0, -0.78125f, -0.1689f)
			.setRotationPoint(-54.53125f, -14.53125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 0, 0, 0, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0.26865f, 0, -0.4375f, 0.26865f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -14.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 0, 0, 0, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0.26865f, 0, -0.4375f, 0.26865f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.75f, -14.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 2, 0, 0, 0, 0.5f, 0.0625f, 0, 0.5f, 0.0625f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.0625f, 0, 0.5f, 0.0625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.75f, -18.9375f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, -0.78125f, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, 0, -0.78125f, -0.5f)
			.setRotationPoint(-66.4375f, -17.9375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, -0.21875f, 0, -0.0625f, -0.21875f, 0, -0.0625f, -0.21875f, -0.5f, 0, -0.21875f, -0.5f)
			.setRotationPoint(-66.4375f, -14.53125f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.75f, -18.9375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.34375f, 0, 0, -0.34375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.1875f, 0, -0.34375f, 0.1875f, 0, -0.34375f, 0.1875f, -0.5f, 0, 0.1875f, -0.5f)
			.setRotationPoint(-66.4375f, -17.71875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.1875f, 0, -0.125f, 0.1875f, 0, -0.125f, 0.1875f, -0.5f, 0, 0.1875f, -0.5f)
			.setRotationPoint(-55.40625f, -17.71875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.34375f, 0, 0, -0.34375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.1875f, 0, -0.34375f, 0.1875f, 0, -0.34375f, 0.1875f, -0.5f, 0, 0.1875f, -0.5f)
			.setRotationPoint(-46.15625f, -17.71875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0, 0, 0, 0, -0.78125f, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f, -0.78125f, 0, 0, -0.78125f, 0)
			.setRotationPoint(-66.4375f, -17.9375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0, 0, 0, 0, -0.21875f, -0.5f, -0.0625f, -0.21875f, -0.5f, -0.0625f, -0.21875f, 0, 0, -0.21875f, 0)
			.setRotationPoint(-66.4375f, -14.53125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, -0.34375f, 0, -0.5f, -0.34375f, 0, 0, 0, 0, 0, 0, 0.1875f, -0.5f, -0.34375f, 0.1875f, -0.5f, -0.34375f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-66.4375f, -17.71875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0.1875f, -0.5f, -0.125f, 0.1875f, -0.5f, -0.125f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-55.40625f, -17.71875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, -0.34375f, 0, -0.5f, -0.34375f, 0, 0, 0, 0, 0, 0, 0.1875f, -0.5f, -0.34375f, 0.1875f, -0.5f, -0.34375f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-46.15625f, -17.71875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.3125f, -0.75f, -0.75f, -0.3125f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(0.9375f, -1.375f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 1, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-22.75f, -1.375f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 1, 1, 0, 0, 0, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.0625f, -0.75f, -0.75f, -0.0625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-71.25f, -1.375f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.3125f, 0.875f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.0625f, 0.875f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.3125f, -0.625f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, -0.25f, 1.75f, -0.75f, -0.25f, 1.75f, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.25f, -2.5f, -0.75f, -0.25f, -2.5f, 0, 0, -0.75f, 0)
			.setRotationPoint(-1.3125f, 0.625f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.8125f, -0.75f, -0.8125f, -0.8125f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.3125f, 0.875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.8125f, -0.0625f, -0.75f, -0.8125f, -0.0625f, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.3125f, -1.375f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-3.3125f, -1.125f, -9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5625f, -0.75f, -0.75f, -0.5625f, -0.75f, -0.75f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-3.3125f, -0.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, -0.4375f, -0.75f, -0.75f, -0.4375f, -0.75f, -0.75f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(-3.3125f, -0.6875f, -9.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.8125f, -0.0625f, -0.75f, -0.8125f, -0.0625f, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-20, -1.375f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 51, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-71.25f, -1.375f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -2.1875f, 0, 0, -2.1875f, 0, 0, 1.4375f, -0.75f, 0, 1.4375f, -0.75f, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.0625f, -0.75f, 0.0625f, -0.0625f)
			.setRotationPoint(13.3125f, -1.125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.0625f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.8125f, -0.0625f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(13.3125f, -1.375f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 56, 1, 1, 0, 0.3125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.3125f, -0.75f, 0)
			.setRotationPoint(14.625f, -1.375f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.5f, -1, -0.75f, -0.5f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(-1.8125f, 0.875f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.5f, -1, -0.75f, -0.5f, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(0.4375f, -1.125f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(11, 3.6875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(0.125f, 3.6875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-6.75f, 3.6875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-17.625f, 3.6875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.0625f, 0, -0.6875f, -0.0625f)
			.setRotationPoint(-4.9375f, 3.625f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.6875f, 0, -0.6875f, -0.0625f, 0, -0.6875f, -0.0625f)
			.setRotationPoint(-1.75f, 3.625f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0.375f, -0.8125f, -0.375f, 0.375f, -0.8125f, -0.375f, 0.375f, -0.0625f, -0.5f, 0.375f, -0.0625f)
			.setRotationPoint(-3.3125f, 4.3125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.0625f, -0.6875f, -0.375f, -0.0625f, -0.6875f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.6875f, -0.6875f, -0.375f, -0.6875f, -0.6875f, -0.375f, -0.6875f, -0.0625f, -0.375f, -0.6875f, -0.0625f)
			.setRotationPoint(-1.875f, 3.375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.0625f, -0.6875f, -0.375f, -0.0625f, -0.6875f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.0625f, -0.0625f, -0.375f, -0.6875f, -0.6875f, -0.375f, -0.6875f, -0.6875f, -0.375f, -0.6875f, -0.0625f, -0.375f, -0.6875f, -0.0625f)
			.setRotationPoint(-4.8125f, 3.375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.0625f, -0.75f, -0.4375f, -0.0625f, -0.75f, -0.4375f, -0.0625f, -0.125f, -0.4375f, -0.0625f, -0.125f, -0.4375f, -0.6875f, -0.75f, -0.4375f, -0.6875f, -0.75f, -0.4375f, -0.6875f, -0.125f, -0.4375f, -0.6875f, -0.125f)
			.setRotationPoint(-2.125f, 3.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f)
			.setRotationPoint(-2.125f, 3.75f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
			.setRotationPoint(-2.6875f, 3.75f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f)
			.setRotationPoint(-3.25f, 3.75f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.0625f, -0.75f, -0.4375f, -0.0625f, -0.75f, -0.4375f, -0.0625f, -0.125f, -0.4375f, -0.0625f, -0.125f, -0.4375f, -0.6875f, -0.75f, -0.4375f, -0.6875f, -0.75f, -0.4375f, -0.6875f, -0.125f, -0.4375f, -0.6875f, -0.125f)
			.setRotationPoint(-4.5625f, 3.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.46875f, -0.46875f, -0.4375f)
			.setRotationPoint(-4.5625f, 3.75f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
			.setRotationPoint(-4, 3.75f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f)
			.setRotationPoint(-3.4375f, 3.75f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f)
			.setRotationPoint(-3.25f, 3.75f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f)
			.setRotationPoint(-3.4375f, 3.75f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f)
			.setRotationPoint(-1.875f, 3.0625f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, -0.625f, -0.46875f, -0.4375f, -0.625f, -0.46875f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.625f, -0.40625f, -0.4375f, -0.625f, -0.40625f, -0.4375f, 0, -0.4375f, -0.4375f)
			.setRotationPoint(-2.6875f, 3.75f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, -0.625f, -0.4375f, -0.4375f, -0.625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.625f, -0.4375f, -0.4375f, -0.625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
			.setRotationPoint(-2.3125f, 3.78125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, -0.6875f, -0.1875f, -0.4375f, -0.6875f, -0.1875f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.65625f, -0.6875f, -0.4375f, -0.65625f, -0.6875f, -0.4375f, 0, -0.4375f, -0.4375f)
			.setRotationPoint(-1.9375f, 3.78125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4375f, -0.4375f, -0.8125f, -0.09375f, -0.4375f, -0.8125f, -0.09375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.03125f, -0.4375f, -0.4375f, -0.6875f, -0.90625f, -0.4375f, -0.6875f, -0.90625f, -0.4375f, -0.03125f, -0.4375f, -0.4375f)
			.setRotationPoint(-1.625f, 3.53125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.46875f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f)
			.setRotationPoint(-4.8125f, 3.0625f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.46875f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.625f, -0.46875f, -0.4375f, -0.625f, -0.40625f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.625f, -0.40625f, -0.4375f)
			.setRotationPoint(-4, 3.75f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.625f, -0.4375f, -0.4375f, -0.625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.625f, -0.4375f, -0.4375f)
			.setRotationPoint(-4.375f, 3.78125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, -0.09375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.8125f, -0.09375f, -0.4375f, -0.6875f, -0.90625f, -0.4375f, -0.03125f, -0.4375f, -0.4375f, -0.03125f, -0.4375f, -0.4375f, -0.6875f, -0.90625f, -0.4375f)
			.setRotationPoint(-5.0625f, 3.53125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0.375f, -0.8125f, -0.375f, 0.375f, -0.8125f, -0.375f, 0.375f, -0.0625f, -0.5f, 0.375f, -0.0625f)
			.setRotationPoint(-3.3125f, 4.3125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0.375f, -0.8125f, -0.375f, 0.375f, -0.8125f, -0.375f, 0.375f, -0.0625f, -0.5f, 0.375f, -0.0625f)
			.setRotationPoint(-3.5f, 4.3125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0.375f, -0.8125f, -0.375f, 0.375f, -0.8125f, -0.375f, 0.375f, -0.0625f, -0.5f, 0.375f, -0.0625f)
			.setRotationPoint(-3.5f, 4.3125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.1875f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.6875f, -0.1875f, -0.4375f, -0.65625f, -0.6875f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.65625f, -0.6875f, -0.4375f)
			.setRotationPoint(-4.75f, 3.78125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 188, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 0.625f, 0.625f, 0, null)
			.setRotationPoint(-22.3125f, 0.28125f, -10.6875f).setRotationAngle(-35, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 187, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.625f, 1, 1, 1, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f)
			.setRotationPoint(-22.3125f, 0.28125f, -10.6875f).setRotationAngle(-35, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 187, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 0.5625f, 0.5625f, 0, null)
			.setRotationPoint(18.6875f, 0.28125f, -10.6875f).setRotationAngle(-35, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 187, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(16.4375f, 0.40625f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 114, textureX, textureY)
			.addShapeBox(-1, -0.5f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0.0625f)
			.setRotationPoint(16.4375f, 0.53125f, -10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 187, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.75f, 0.5f, 0.25f, -0.75f, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f)
			.setRotationPoint(23.8125f, 0.65625f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 187, textureX, textureY).addCylinder(0, 0, 0.0625f, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(23.8125f, 0.28125f, -10.0625f).setRotationAngle(-35, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 187, textureX, textureY).addCylinder(0, 0, -0.0625f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(23.8125f, 0.28125f, -10.0625f).setRotationAngle(-35, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(20.6875f, 0.09375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, -0.875f, -0.0625f, -0.125f, -0.875f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.875f, -0.0625f, 0, -0.875f)
			.setRotationPoint(20.6875f, 0.03125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 187, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.15625f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(21.1875f, 0.65625f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 187, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(63.3125f, -1.6875f, 6).setRotationAngle(-24, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(60.6875f, -0.3125f, 10.25f).setRotationAngle(-24, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 187, textureX, textureY)
			.addShapeBox(0.5625f, 0, 0.5f, 1, 1, 1, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, -0.75f)
			.setRotationPoint(60.6875f, -0.3125f, 10.25f).setRotationAngle(-24, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 187, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 0.5625f, 0.5625f, 0, null)
			.setRotationPoint(7.0625f, 0.28125f, 10.25f).setRotationAngle(-145, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 187, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(14.6875f, 0.40625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 113, textureX, textureY)
			.addShapeBox(-1, -0.5f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f)
			.setRotationPoint(14.6875f, 0.53125f, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 187, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.25f, -0.75f, 0.5f, 0.25f, -0.75f, 0.5f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(11.9375f, 0.65625f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 187, textureX, textureY).addCylinder(0, 0, 0.0625f, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(11.9375f, 0.28125f, 10.6875f).setRotationAngle(-145, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 187, textureX, textureY).addCylinder(0, 0, -0.0625f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(11.9375f, 0.28125f, 10.6875f).setRotationAngle(-145, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(16.6875f, 0.09375f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.125f, -0.875f, -0.0625f, -0.125f, -0.875f, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, 0, -0.875f, -0.0625f, 0, -0.875f, -0.0625f, 0, 0, -0.0625f, 0, 0)
			.setRotationPoint(16.6875f, 0.03125f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 186, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.15625f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(17.1875f, 0.65625f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 186, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(2.0625f, 0.78125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.09375f, -0.59375f, -0.375f, -0.71875f, -0.59375f, -0.375f, -0.71875f, -0.09375f, -0.09375f, -0.09375f, -0.09375f, -0.09375f, -0.09375f, -0.21875f, -0.375f, -0.71875f, -0.21875f, -0.375f, -0.71875f, -0.71875f, -0.09375f, -0.09375f, -0.71875f, -0.09375f)
			.setRotationPoint(-34.71875f, -1.4375f, -9.96875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.09375f, -0.71875f, -0.25f, 0, -0.90625f, -0.25f, 0, 0.09375f, 0, -0.09375f, -0.09375f, 0, -0.71875f, -0.71875f, -0.25f, -0.8125f, -0.90625f, -0.25f, -0.8125f, 0.09375f, 0, -0.71875f, -0.09375f)
			.setRotationPoint(-26.125f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.09375f, -0.78125f, -0.25f, 0.03125f, -0.9375f, -0.25f, 0.03125f, 0.1875f, 0, -0.09375f, -0.03125f, 0, -0.71875f, -0.78125f, -0.25f, -0.78125f, -0.9375f, -0.25f, -0.78125f, 0.1875f, 0, -0.71875f, -0.03125f)
			.setRotationPoint(-23.5f, -1.34375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.09375f, -0.71875f, -0.125f, 0.21875f, -1.59375f, -0.125f, 0.21875f, 0.78125f, 0, -0.09375f, -0.09375f, 0, -0.71875f, -0.71875f, -0.125f, -1.03125f, -1.59375f, -0.125f, -1.03125f, 0.78125f, 0, -0.71875f, -0.09375f)
			.setRotationPoint(-25.375f, -1.03125f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 1.25f, -0.25f, -0.5f, 1.25f, -0.25f, -0.5f, -1.75f, -0.25f, -0.5f, -1.75f)
			.setRotationPoint(26.75f, -1.6875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(26.75f, 1.8125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(26.75f, 3.3125f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(27, 1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(-31, 1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.25f, -0.0625f, -0.6875f, -0.25f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.6875f, -0.6875f, -0.25f, -0.6875f, -0.6875f, -0.25f, -0.6875f, -0.0625f, 0, -0.6875f, -0.0625f)
			.setRotationPoint(25.875f, -0.625f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.25f, -0.0625f, -0.6875f, -0.25f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.6875f, -0.6875f, -0.25f, -0.6875f, -0.6875f, -0.25f, -0.6875f, -0.0625f, 0, -0.6875f, -0.0625f)
			.setRotationPoint(25.875f, -0.625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.75f, -0.0625f, -0.6875f, -0.75f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.4375f, 0, -0.375f, -0.4375f)
			.setRotationPoint(25.625f, -1.1875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.75f, -0.0625f, -0.6875f, -0.75f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.4375f, 0, -0.375f, -0.4375f)
			.setRotationPoint(25.625f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.75f, -0.0625f, -0.6875f, -0.75f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.0625f, -0.75f, -0.6875f, -0.75f, -0.6875f, -0.6875f, -0.75f, -0.6875f, -0.0625f, -0.0625f, -0.75f, -0.0625f)
			.setRotationPoint(25.625f, -0.625f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.75f, -0.0625f, -0.6875f, -0.75f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.0625f, -0.75f, -0.6875f, -0.75f, -0.6875f, -0.6875f, -0.75f, -0.6875f, -0.0625f, -0.0625f, -0.75f, -0.0625f)
			.setRotationPoint(25.625f, -0.625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.25f, -0.625f, -0.625f, -0.25f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(28.125f, -0.625f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.25f, -0.625f, -0.625f, -0.25f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(28.125f, -0.625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.0625f, -0.0625f, -0.75f, -0.0625f, -0.0625f, -0.75f, -0.6875f, -0.6875f, -0.0625f, -0.75f, -0.6875f, -0.0625f, -0.75f, -0.0625f, -0.75f, -0.6875f, -0.0625f)
			.setRotationPoint(54.875f, -0.625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.0625f, -0.75f, 0.125f, -0.0625f)
			.setRotationPoint(54.875f, -1.6875f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.1875f, 0, -0.0625f, -0.0625f, 0, -0.6875f, -0.6875f, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.8125f, -0.1875f, 0, -0.6875f, -0.0625f)
			.setRotationPoint(30.625f, -0.625f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.25f, 0.0625f, -0.5625f, -0.25f, 0.0625f, -0.1875f, 0, -0.0625f, -0.0625f, 0, -0.6875f, -0.6875f, -0.25f, -0.8125f, -0.5625f, -0.25f, -0.8125f, -0.1875f, 0, -0.6875f, -0.0625f)
			.setRotationPoint(33, -1.3125f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.1875f, -0.0625f, -0.6875f, -0.1875f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.6875f, -0.6875f, -0.1875f, -0.6875f, -0.6875f, -0.1875f, -0.6875f, -0.0625f, 0, -0.6875f, -0.0625f)
			.setRotationPoint(33.75f, -1.4375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.0625f, -0.6875f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.4375f, 0, -0.0625f, -0.0625f, 0, -0.6875f, -0.6875f, -0.375f, -1.25f, -0.3125f, -0.375f, -1.25f, -0.4375f, 0, -0.6875f, -0.0625f)
			.setRotationPoint(31.375f, -0.75f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(28.75f, -0.25f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(28.75f, -0.25f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.25f, 0, -0.625f, -0.25f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.625f, -0.25f)
			.setRotationPoint(28.5f, -0.25f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.25f, 0, -0.625f, -0.25f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.625f, -0.25f)
			.setRotationPoint(28.5f, -0.25f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, 0, 0, -0.625f, 0, -0.75f, -0.625f, -0.25f, -0.75f, -0.625f, -0.25f, 0, -0.625f, 0)
			.setRotationPoint(29.25f, -0.25f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, 0, 0, -0.625f, 0, -0.75f, -0.625f, -0.25f, -0.75f, -0.625f, -0.25f, 0, -0.625f, 0)
			.setRotationPoint(29.25f, -0.25f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(29, 0.125f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.3125f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.3125f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(29, 1.3125f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(29, 0.125f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.3125f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.3125f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(29, 1.3125f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.4375f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.4375f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.5625f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.5625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.6875f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.6875f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.8125f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.8125f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 184, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.9375f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 183, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 0.9375f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 183, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 1.0625f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 183, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 1.0625f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 183, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 1.1875f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 183, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(29, 1.1875f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 183, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, new Vec3f(0.0, -0.0625, 0.0))
			.setRotationPoint(29, 0.375f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 183, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, new Vec3f(0.0, -0.0625, 0.0))
			.setRotationPoint(29, 0.375f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(28.75f, -0.875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(28.75f, -1.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(28.75f, -1.75f, -9.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(28.75f, -1.75f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-2.5625f, 0.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-1.5625f, 0.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(-1.8125f, -0.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2.8125f, -0.25f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(-31, 1, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(27, 1, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-27.25f, 3.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -1, 0, -0.75f, -1, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-27.25f, 3.5f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, -0.75f, -1, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-27.25f, 3.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -1, 0, 0, -1, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-27.25f, 2.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -1, 0, 0, -1, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-27.25f, 1, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.0625f, -0.8125f, 0, -0.0625f, -0.8125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-27.25f, 3.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-27.25f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.625f, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, -0.75f, 0.125f, -0.625f, -0.75f)
			.setRotationPoint(-27.25f, 5.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-27.75f, 1.0625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-27.75f, 0.3125f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-28, -0.1875f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-28.75f, -0.1875f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-29.5f, -0.1875f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 180, textureX, textureY)
			.addShapeBox(0, -4.5f, -0.5f, 1, 7, 1, 0, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f)
			.setRotationPoint(-30.125f, -0.1875f, 9).setRotationAngle(70, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.25f, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-29.5f, 0.25f, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.9375f, 0.1875f, -0.3125f, 0, 0.1875f, -0.3125f, 0, 0.1875f, -0.3125f, -0.9375f, 0.1875f, -0.3125f, -0.9375f, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, -0.9375f, -0.8125f, -0.3125f)
			.setRotationPoint(-29.4375f, 0.125f, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0.125f, -0.375f, 0, -0.875f, -0.375f, 0, -1.125f, -0.375f, 0, -1.125f, -0.375f, 0, -0.875f, -0.375f)
			.setRotationPoint(-28.4375f, 0.125f, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.125f, -0.375f, 0, 0.125f, -0.375f, -0.0625f, 0.125f, -0.4375f, -0.75f, 0.125f, -0.375f, -0.75f, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.0625f, -0.875f, -0.4375f, -0.75f, -0.875f, -0.375f)
			.setRotationPoint(-28.1875f, -0.125f, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.75f, 1.125f, 0.0625f, 0, 1.125f, 0.0625f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, -1.875f, 0.0625f, 0, -1.875f, 0.0625f, 0, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(-28.1875f, -0.125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-27.75f, 5.8125f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, -2.875f, -0.75f, 0, 0.125f, -0.75f, 0, -1.96875f, -0.75f, 0, -0.78125f, -0.75f, 0, -3.5f, 0, 0, 0.75f, 0, 0, -1.25f, 0, -1, -1.5f, 0, -1)
			.setRotationPoint(76.875f, 6, 0).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, -2.75f, -0.25f, 0, 0, -0.25f, 0, -2.21875f, -0.25f, 1, -0.53125f, -0.25f, 1, -3.125f, 0, 0, 0.375f, 0, 0, -1.71875f, 0, 0, -1.03125f, 0, 0)
			.setRotationPoint(76.625f, 5.75f, 0).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, -2.75f, 0, 0, 0, 0, 0, -2.46875f, 0, 0, -0.28125f, 0, 0, -2.75f, 0, 0, 0, 0, 0, -2.21875f, 0, 0, -0.53125f, 0, 0)
			.setRotationPoint(76.625f, 5, 0).setRotationAngle(0, 0, 0).setName("Box 4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -2.27f, 0, 0, -0.48f, 0, 0, -2.5f, 0, 0, -0.25f, 0, 0, -2.27f, -0.5f, 0, -0.48f, -0.5f, 0, -2.5f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(76.65625f, 4.5f, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -3.27f, -0.5f, 0, 0.52f, -0.5f, 0, -2, 0, -0.375f, -0.75f, 0, -0.375f, -2.27f, 0, 0, -0.48f, 0, 0, -2.5625f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(76.90625f, 1.5f, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -3.27f, -1, 0, 0.52f, -1, 0, -1.375f, 0, -0.625f, -1.375f, 0, -0.625f, -3.27f, 0, 0, 0.52f, 0, 0, -2, -0.5f, -0.375f, -0.75f, -0.5f, -0.375f)
			.setRotationPoint(76.90625f, 1, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 8, 0, -2.27f, 0, 0, -0.48f, 0, 0, -2.5f, 0, 0, -0.25f, 0, 0, -2.27f, -0.5f, 0, -0.48f, -0.5f, 0, -2.5f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(76.65625f, 3, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, -2.52f, -0.5f, 0, -0.23f, -0.5f, 0, -2.3125f, -0.5f, -0.0625f, -0.4375f, -0.5f, -0.0625f, -2.27f, 0, 0, -0.48f, 0, 0, -2.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(76.65625f, 2, 2).setRotationAngle(0, 0, 0).setName("Box 449cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.09375f, -0.71875f, -0.5f, -0.09375f, -0.71875f, -0.5f, -0.09375f, -0.09375f, 0, -0.09375f, -0.09375f, 0, -0.71875f, -0.71875f, -0.5f, -0.71875f, -0.71875f, -0.5f, -0.71875f, -0.09375f, 0, -0.71875f, -0.09375f)
			.setRotationPoint(-34.625f, -0.9375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-55, 1, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(51, 1, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 179, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, 0.0625, 0.0))
			.setRotationPoint(68, -16.875f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 179, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.875f, 0.875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(68, -17, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 179, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, 0.0625, 0.0))
			.setRotationPoint(68, -16.875f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 179, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.875f, 0.875f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(68, -17, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.6875f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.6875f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(62.75f, -17.1875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(68.25f, -15.875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0.25f, -1.3125f, 1.5f, 0.25f, -1.3125f, -2.3125f, 0, 0, -0.8125f, 0, -0.8125f, 0, 0.25f, 0.5f, 1.5f, 0.25f, 0.5f, -2.3125f, 0, -0.8125f, -0.8125f)
			.setRotationPoint(63, -17.15625f, 10.28125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(72.0625f, -17.1875f, 2.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8125f, 0, 0, -3.3125f, -1.3125f, 0.25f, 2.5f, -1.3125f, 0.25f, 0, -0.8125f, 0, -0.8125f, -0.8125f, 0, -3.3125f, 0.5f, 0.25f, 2.5f, 0.5f, 0.25f)
			.setRotationPoint(72.09375f, -17.15625f, 2.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(69.5625f, -15.875f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.6875f, -0.75f, -0.75f, -0.6875f, -0.75f, -0.75f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(62.75f, -17.1875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(68.25f, -15.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8125f, 0.25f, -1.3125f, -2.3125f, 0.25f, -1.3125f, 1.5f, 0, 0, 0, 0, -0.8125f, -0.8125f, 0.25f, 0.5f, -2.3125f, 0.25f, 0.5f, 1.5f, 0, -0.8125f, 0)
			.setRotationPoint(63, -17.15625f, -11.28125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(72.0625f, -17.1875f, -3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 2.5f, -1.3125f, 0.25f, -3.3125f, -1.3125f, 0.25f, -0.8125f, 0, 0, 0, 0, 0, 2.5f, 0.5f, 0.25f, -3.3125f, 0.5f, 0.25f, -0.8125f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(72.09375f, -17.15625f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69.5625f, -15.875f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(60.625f, -21.625f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(62.875f, -21.625f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.8125f, 0, 0, -3.0625f, 0, 0.125f, 2.25f, 0, 0.125f, 0, -0.8125f, 0, -0.8125f, -0.8125f, 0, -3.0625f, -0.8125f, 0.125f, 2.25f, -0.8125f, 0.125f)
			.setRotationPoint(63.15625f, -21.59375f, 1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(60.625f, -21.625f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(62.875f, -21.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 2.25f, 0, 0.125f, -3.0625f, 0, 0.125f, -0.8125f, 0, 0, 0, 0, 0, 2.25f, -0.8125f, 0.125f, -3.0625f, -0.8125f, 0.125f, -0.8125f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(63.15625f, -21.59375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, 0.0625f, 0.4375f, 0, 0.0625f, -0.625f, 0, 0.0625f, 0, 0, 0.0625f, -0.9375f, 0.5f, 0.0625f, 0.375f, 0.5f, 0.0625f, -0.625f, 0.5f, 0.0625f, 0, 0.5f, 0.0625f)
			.setRotationPoint(61.15625f, -24.171875f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.0625f, -0.625f, 0, 0.0625f, 0.4375f, 0, 0.0625f, -0.5f, 0, 0.0625f, 0, 0.5f, 0.0625f, -0.625f, 0.5f, 0.0625f, 0.375f, 0.5f, 0.0625f, -0.9375f, 0.5f, 0.0625f)
			.setRotationPoint(61.15625f, -24.171875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.125f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(46.40625f, -21.9375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.4375f, 0.25f, 0, -0.4375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(49.5625f, -21.8125f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, 0, -0.8125f, 0)
			.setRotationPoint(47.75f, -21.8125f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.25f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.1875f, 0.25f, 0)
			.setRotationPoint(55.9375f, -21.8125f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.4375f, 0.25f, 0, -0.4375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(49.5625f, -21.8125f, 11.0625f).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, 0, -0.8125f, 0)
			.setRotationPoint(47.75f, -21.8125f, 11.0625f).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.25f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.1875f, 0.25f, 0)
			.setRotationPoint(55.9375f, -21.8125f, 11.0625f).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.4375f, 0.25f, 0, -0.4375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(49.5625f, -21.8125f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, 0, -0.8125f, 0)
			.setRotationPoint(47.75f, -21.8125f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.25f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.1875f, 0.25f, 0)
			.setRotationPoint(55.9375f, -21.8125f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.4375f, 0.25f, 0, -0.4375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(49.5625f, -21.8125f, -11.0625f).setRotationAngle(-45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, 0, -0.8125f, 0)
			.setRotationPoint(47.75f, -21.8125f, -11.0625f).setRotationAngle(-45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, -0.875f, -0.5f, -0.125f, -0.875f, -0.5f, -0.125f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(46.40625f, -21.9375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(28.125f, 1.4375f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 500cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.40625f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.40625f, 0, -0.75f, 0.40625f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, 0.40625f, -0.6875f, -0.75f)
			.setRotationPoint(27.40625f, 1.40625f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 500cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.40625f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.40625f, 0, -0.75f, 0.40625f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, 0.40625f, -0.6875f, -0.75f)
			.setRotationPoint(27.40625f, 1.40625f, 9).setRotationAngle(0, 0, 0).setName("Box 500cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.09375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.09375f, 0, -0.75f, -0.09375f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.09375f, -0.6875f, -0.75f)
			.setRotationPoint(26.90625f, 1.09375f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 500cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.09375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.09375f, 0, -0.75f, -0.09375f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.09375f, -0.6875f, -0.75f)
			.setRotationPoint(26.90625f, 1.09375f, 9).setRotationAngle(0, 0, 0).setName("Box 500cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 140, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 3, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0.5f, 0)
			.setRotationPoint(56.40625f, -20.21875f, 11.03125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 138, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 3, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0.5f, 0)
			.setRotationPoint(56.40625f, -20.21875f, 11.03125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 138, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 3, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0.5f, 0)
			.setRotationPoint(56.40625f, -20.21875f, -11.03125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 138, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 3, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0.5f, 0)
			.setRotationPoint(56.40625f, -20.21875f, -11.03125f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.4375f, -0.875f, 0, -0.4375f, -0.875f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.4375f, -0.875f, 0.4375f, -0.4375f, -0.875f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(56.34375f, -20.46875f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, 0, 0, 0, 0, 0, -0.875f, -0.4375f, -0.3125f, -0.875f, -0.4375f, -0.3125f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(46.78125f, -20.59375f, -11.46875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 163, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.5f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(28.25f, 1.6875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 157, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.0625f, 0.4375f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(28.25f, 1.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 179, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.0625f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.5625f, 0.5f).setDirection(5)
			.setTopOffset(new Vec3f(0.0, 0.25, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(28.25f, 1.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 179, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.5625f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.8125f, 0.625f).setDirection(5)
			.setTopOffset(new Vec3f(0.0, 0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(28.25f, 1.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 179, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.8125f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(1, 0.8125f).setDirection(5)
			.setTopOffset(new Vec3f(0.0, 0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(28.25f, 1.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(28.125f, 1.75f, 9.375f).setRotationAngle(0, 0, 0).setName("Box 500cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 156, textureX, textureY)
			.addShapeBox(0, 1.625f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(28.0625f, 1.5625f, 9.3125f).setRotationAngle(0, 0, 0).setName("Box 500cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 169, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.3125f, 0).setRadius(1, 0.75f).setLength(1).setSegments(8, 0).setScale(0.625f, 0.5625f).setDirection(5)
			.setTopOffset(new Vec3f(0.0, 0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(28.25f, 1.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(45.25f, -23.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.25f, -16, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.1875f, 0.5f, -0.5f, 0.1875f, 0.5f, -0.5f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(45.25f, -8.1875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 5, 9, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0.4375f, 0.1875f, 0, 0.4375f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(45.75f, -9.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 5, 3, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0.25f, 0.1875f, 0)
			.setRotationPoint(46, -9.1875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 5, 9, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0.4375f, 0.1875f, 0, 0.4375f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(45.75f, -9.1875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0.5f, 0.1875f, 0, 0.5f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(58, -7.6875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0.5f, 0.1875f, 0, 0.5f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(59.5f, -6.1875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 21, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.75f, -4.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 9, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(60.125f, -17, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0.5f, 0, -1, 0.5f)
			.setRotationPoint(61.1875f, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 12, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(61.1875f, -16, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.5f, 0, 0, 1.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 1.75f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(61.1875f, -16.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.125f, 0)
			.setRotationPoint(64.0625f, -16.9375f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(64.0625f, -17, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 11, 1, 0, 0, 0, 0, -0.125f, 0, 0, 0.03125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, 0, 0, 0.03125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(62.125f, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(61.5625f, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 9, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(60.125f, -17, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 1.75f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 1.75f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(61.1875f, -16.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(61.1875f, -16, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.1875f, -16, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, -2, 0, -3, -2, 0, 0.5f, 0, 0, -3, 0, 0, 0, 0, 0, -3, 0, 0, 0.5f, 0, 0, -3, 0, 0)
			.setRotationPoint(70, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, -0.125f, -2, 0, 0.03125f, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, 0, 0, 0.03125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(62.125f, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 11, 10, 0, -3, 0, 0, 0.5f, 0, 0, -3, 0, 0, 0, 0, 0, -3, 0, 0, 0.5f, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(70, -14, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 10, 0, -2.5f, 0, 0, 3.375f, 0, 0, -8, 0, 0, 0, 0, 0, -2.5f, 0, 0, 3.375f, 0, 0, -8, 0, 0, 0, 0, 0)
			.setRotationPoint(62.125f, -17, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 10, 0, -11.375f, 0, 0, 3.375f, 0, 0, -0.125f, -3, 0, 0, 0, 0, -11.375f, -2, 0, 3.375f, -2, 0, -0.125f, 0, 0, 0, -2, 0)
			.setRotationPoint(62.125f, -17, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 11, 1, 0, 0, 0, -0.5f, 0.03125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.03125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(62.125f, -14, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, 0, 0, 0, 0, 0)
			.setRotationPoint(61.5625f, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 10, 0, -3, 0, 0, 0.5f, 0, 0, -3, -2, 0, 0, -2, 0, -3, 0, 0, 0.5f, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(70, -16, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, -0.5f, 0.03125f, -2, -0.5f, -0.125f, -2, 0, 0, 0, 0, 0, 0, -0.5f, 0.03125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(62.125f, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -2.5f, 0, 0, 2.0625f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, -2.5f, 0, 0, 2.0625f, 0, 0, -0.4375f, 0, 0, 0, 0, 0)
			.setRotationPoint(61.5625f, -17, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 21, 0, 0, 0, 0, -0.125f, 0, -9.5f, -0.125f, 0, -9.5f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -9.5f, -0.125f, 0, -9.5f, 0, 0, 0)
			.setRotationPoint(70.125f, -4.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(56.375f, -15.1875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.875f, -15.1875f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(57.25f, -14.1875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 9, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.375f, -15.6875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(59.625f, -17.6875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(59.625f, -17.6875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(56.375f, -15.1875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 9, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.375f, -15.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(59.625f, -17.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.375f, -17.6875f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.25f, 0, 1.75f, 0.25f, 0, -2.75f, 0, 0, -0.5f, 0, 0, 0.5f, -0.75f, 0, 1.75f, 0.25f, 0, -2.75f, 0, 0, -0.5f)
			.setRotationPoint(57.875f, -17.6875f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -2, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -2, 0.25f, 0.3125f, 0.25f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(57.875f, -17, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(52.375f, -10.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1.5f)
			.setRotationPoint(52.375f, -10.1875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 4, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(45.75f, -10.1875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -2.5f, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -2.5f, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(52.5f, -10.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(56.375f, -10.1875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(45.25f, -20.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 178, textureX, textureY)
			.addShapeBox(0, 0, 2.5f, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(45.25f, -20.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(45.25f, -21.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(45.25f, -22.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.25f, -23.6875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0.5f, -0.5f, -0.75f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, 0.5f, -0.5f, -0.0625f, 0.5f, -0.5f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(45.25f, -23.4375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0.5f, -0.5f, -0.75f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, 0.5f, -0.5f, -0.0625f, 0.5f, -0.5f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(45.25f, -22.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 156, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, -0.8125f, 0, -0.8125f, -0.8125f)
			.setRotationPoint(45.25f, -20.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 156, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -1, 0, -0.6875f, -1)
			.setRotationPoint(45.25f, -20.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 155, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.8125f, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(45.25f, -16.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 155, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.8125f, 0, -0.6875f, -0.8125f)
			.setRotationPoint(45.25f, -16.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 154, textureX, textureY)
			.addShapeBox(0, 0, 1.5f, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.8125f, -0.5f, -0.8125f, -0.8125f, -0.5f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(45.25f, -20.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 154, textureX, textureY)
			.addShapeBox(0, 0, 1.5f, 1, 1, 1, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.6875f, -1, -0.5f, -0.6875f, -1, -0.5f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(45.25f, -20.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 154, textureX, textureY)
			.addShapeBox(0, 0, 1.5f, 1, 1, 1, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.5f, -0.5f, -0.8125f, -0.5f, -0.5f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(45.25f, -16.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 152, textureX, textureY)
			.addShapeBox(0, 0, 1.5f, 1, 1, 1, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, -0.6875f, -0.8125f, -0.5f, -0.6875f, -0.8125f, -0.5f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(45.25f, -16.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(45.25f, -9.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 178, textureX, textureY)
			.addShapeBox(0.25f, 0, 0.5f, 0, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.25f, -20.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(63.4375f, -16.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(63.9375f, -16.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(64.0625f, -16.0625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.375f, -12.1875f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 154, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.375, 0.0))
			.setRotationPoint(53.875f, -12.8125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.375f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, 0.375f, 0, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f)
			.setRotationPoint(52.375f, -12.8125f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.375f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, 0.375f, 0, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f)
			.setRotationPoint(52.375f, -12.8125f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.3125f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.3125f, 0, 0, 0.0625f, 0, -0.625f, -0.3125f, -0.625f, -0.625f, -0.6875f, -0.625f, -0.625f, -0.3125f, 0, -0.625f, 0.0625f)
			.setRotationPoint(55.125f, -12.8125f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(52, -14.8125f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(52, -14.8125f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f)
			.setRotationPoint(52.375f, -13.8125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.125f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.25f, -0.25f, 1, -0.25f, -0.25f, 0.75f, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(51, -17.5625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(51, -17.5625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, -0.25f, -0.25f, 0, -0.25f, -1, -0.25f, 0, 0.75f, -0.25f, 0, 1, -0.25f, -0.25f, -1, -0.25f, -0.25f)
			.setRotationPoint(51, -17.5625f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.375f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.375f, 0, 0, -0.3125f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, 0, -0.3125f, 0.25f, 0)
			.setRotationPoint(51, -18.8125f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, -0.25f)
			.setRotationPoint(51.9375f, -15.3125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(53.5625f, -15.3125f, -5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.25f)
			.setRotationPoint(51.9375f, -15.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(53.5625f, -15.3125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.375f, -12.1875f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 154, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.375, 0.0))
			.setRotationPoint(53.875f, -12.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.375f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, 0.375f, 0, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f)
			.setRotationPoint(52.375f, -12.8125f, 7.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.375f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, 0.375f, 0, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f)
			.setRotationPoint(52.375f, -12.8125f, 4.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.0625f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.6875f, 0, 0, -0.3125f, 0, -0.625f, 0.0625f, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.6875f, 0, -0.625f, -0.3125f)
			.setRotationPoint(55.125f, -12.8125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(52, -14.8125f, 7.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(52, -14.8125f, 4.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f)
			.setRotationPoint(52.375f, -13.8125f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, -0.25f, -0.25f, 0, -0.25f, -1, -0.25f, 0, 0.75f, -0.25f, 0, 1, -0.25f, -0.25f, -1, -0.25f, -0.25f)
			.setRotationPoint(51, -17.5625f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -1, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, -0.5f, -1, -0.25f, -0.5f)
			.setRotationPoint(51, -17.5625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.125f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.25f, -0.25f, 1, -0.25f, -0.25f, 0.75f, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(51, -17.5625f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.375f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.375f, 0, -0.5f, -0.3125f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.5f, -0.3125f, 0.25f, -0.5f)
			.setRotationPoint(51, -18.8125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.25f)
			.setRotationPoint(51.9375f, -15.3125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(53.5625f, -15.3125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, -0.25f)
			.setRotationPoint(51.9375f, -15.3125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(53.5625f, -15.3125f, 8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48.375f, -11.1875f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 153, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.375, 0.0))
			.setRotationPoint(48.875f, -11.8125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.375f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, 0.375f, 0, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f)
			.setRotationPoint(47.375f, -11.8125f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.375f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, 0.375f, 0, -0.3125f, 0, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, -0.25f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f)
			.setRotationPoint(47.375f, -11.8125f, -2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.0625f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.6875f, 0, 0, -0.3125f, 0, -0.625f, 0.0625f, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.6875f, 0, -0.625f, -0.3125f)
			.setRotationPoint(50.125f, -11.8125f, -1.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(47, -13.8125f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(47, -13.8125f, -2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f)
			.setRotationPoint(47.375f, -12.8125f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, -0.25f, -0.25f, 0, -0.25f, -1, -0.25f, 0, 0.75f, -0.25f, 0, 1, -0.25f, -0.25f, -1, -0.25f, -0.25f)
			.setRotationPoint(46, -16.5625f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -1, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, -0.5f, -1, -0.25f, -0.5f)
			.setRotationPoint(46, -16.5625f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.125f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.25f, -0.25f, 1, -0.25f, -0.25f, 0.75f, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(46, -16.5625f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.25f)
			.setRotationPoint(46.9375f, -14.3125f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(48.5625f, -14.3125f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, -0.25f)
			.setRotationPoint(46.9375f, -14.3125f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(48.5625f, -14.3125f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.9375f, -0.3125f, -0.625f, -0.9375f, -0.3125f, -0.625f, -0.9375f, -0.3125f, 0, -0.9375f, -0.3125f)
			.setRotationPoint(56.625f, -15.875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, -0.875f, -0.375f, -0.6875f, -0.875f, -0.375f, -0.6875f, -0.875f, -0.375f, -0.0625f, -0.875f, -0.375f)
			.setRotationPoint(56.625f, -15.8125f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.9375f, -0.3125f, -0.625f, -0.9375f, -0.3125f, -0.625f, -0.9375f, -0.3125f, 0, -0.9375f, -0.3125f)
			.setRotationPoint(56.625f, -15.875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.6875f, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, -0.875f, -0.375f, -0.6875f, -0.875f, -0.375f, -0.6875f, -0.875f, -0.375f, -0.0625f, -0.875f, -0.375f)
			.setRotationPoint(56.625f, -15.8125f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.9375f, -0.25f, -0.25f, -0.9375f, -0.25f, -0.25f, -0.9375f, -0.25f, 0, -0.9375f, -0.25f)
			.setRotationPoint(56.75f, -15.75f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, -0.75f, -0.875f, -0.375f, -0.75f, -0.875f, -0.375f, 0, -0.875f, -0.375f)
			.setRotationPoint(56.9375f, -15.84375f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, -0.75f, -0.875f, -0.375f, -0.75f, -0.875f, -0.375f, 0, -0.875f, -0.375f)
			.setRotationPoint(57.3125f, -15.84375f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, -0.75f, -0.875f, -0.375f, -0.75f, -0.875f, -0.375f, 0, -0.875f, -0.375f)
			.setRotationPoint(57.6875f, -15.84375f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, -0.75f, -0.875f, -0.375f, -0.75f, -0.875f, -0.375f, 0, -0.875f, -0.375f)
			.setRotationPoint(58.0625f, -15.84375f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(57.5f, -15.75f, -8.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.1875f, -0.8125f, -0.5f, -0.1875f, -0.8125f, -0.5f, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0)
			.setRotationPoint(57.5f, -15.9375f, -7.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0, 0, -0.1875f, -0.8125f, -0.75f, -0.1875f, -0.8125f, -0.75f, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0)
			.setRotationPoint(57.5f, -15.9375f, -7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, 0, -0.1875f, -0.8125f, -0.625f, -0.1875f, -0.8125f, -0.625f, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0)
			.setRotationPoint(57.5f, -15.9375f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0)
			.setRotationPoint(57.5f, -15.875f, -7.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 138, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f)
			.setRotationPoint(58, -15.75f, -7.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 137, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, -0.5f, 1, 1, 1, 0, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, -0.75f, -0.46875f, -0.46875f, -0.75f, -0.46875f, -0.46875f, -0.75f, -0.46875f, -0.46875f, -0.75f, -0.46875f)
			.setRotationPoint(58, -15.75f, -6.78125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 137, textureX, textureY)
			.addShapeBox(-0.5f, -0.6875f, -0.5f, 1, 1, 1, 0, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.453125f, -0.8125f, -0.453125f, -0.453125f, -0.8125f, -0.453125f, -0.453125f, -0.8125f, -0.453125f, -0.453125f, -0.8125f, -0.453125f)
			.setRotationPoint(58, -15.75f, -7.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 137, textureX, textureY)
			.addShapeBox(-0.5f, -0.4375f, -0.5f, 1, 1, 1, 0, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.453125f, -0.8125f, -0.453125f, -0.453125f, -0.8125f, -0.453125f, -0.453125f, -0.8125f, -0.453125f, -0.453125f, -0.8125f, -0.453125f)
			.setRotationPoint(58, -15.75f, -6.78125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 137, textureX, textureY)
			.addShapeBox(-0.5f, -0.71875f, -0.5f, 1, 1, 1, 0, -0.453125f, 0, -0.453125f, -0.453125f, 0, -0.453125f, -0.453125f, 0, -0.453125f, -0.453125f, 0, -0.453125f, -0.4375f, -0.96875f, -0.4375f, -0.4375f, -0.96875f, -0.4375f, -0.4375f, -0.96875f, -0.4375f, -0.4375f, -0.96875f, -0.4375f)
			.setRotationPoint(58, -15.75f, -7.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 135, textureX, textureY)
			.addShapeBox(-0.5f, -0.46875f, -0.5f, 1, 1, 1, 0, -0.453125f, 0, -0.453125f, -0.453125f, 0, -0.453125f, -0.453125f, 0, -0.453125f, -0.453125f, 0, -0.453125f, -0.4375f, -0.96875f, -0.4375f, -0.4375f, -0.96875f, -0.4375f, -0.4375f, -0.96875f, -0.4375f, -0.4375f, -0.96875f, -0.4375f)
			.setRotationPoint(58, -15.75f, -6.78125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0.25f, 0, -0.9375f, 0.25f)
			.setRotationPoint(57.5f, -15.75f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(57.5f, -16, -9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0.125f, -0.3125f, 0, 0.125f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0.125f, -0.25f, -0.8125f, 0.125f)
			.setRotationPoint(57.5f, -15.9375f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 133, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f)
			.setRotationPoint(58, -15.75f, -8.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 129, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, 0, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.46875f)
			.setRotationPoint(58, -15.75f, -9.15625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 129, textureX, textureY)
			.addShapeBox(-0.5f, -1.0625f, -0.5f, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f)
			.setRotationPoint(58, -15.75f, -9.15625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 129, textureX, textureY)
			.addShapeBox(-0.5f, -1.0625f, -0.609375f, 1, 1, 1, 0, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.4375f, -0.4375f, -0.453125f, -0.4375f, -0.4375f, -0.453125f, -0.46875f, -0.46875f, -0.5f, -0.46875f, -0.46875f, -0.5f, -0.4375f, -0.4375f, -0.453125f, -0.4375f, -0.4375f, -0.453125f)
			.setRotationPoint(58, -15.75f, -9.15625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 127, textureX, textureY)
			.addShapeBox(-0.5f, -1.0625f, -0.25f, 1, 1, 1, 0, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.453125f, -0.453125f, -0.46875f, -0.453125f, -0.453125f, -0.46875f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.4375f, -0.453125f, -0.453125f, -0.46875f, -0.453125f, -0.453125f, -0.46875f)
			.setRotationPoint(58, -15.75f, -9.28125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 127, textureX, textureY)
			.addShapeBox(-0.5f, -0.59375f, -0.4375f, 1, 1, 1, 0, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.46875f, -0.03125f, -0.375f, -0.46875f, -0.03125f, -0.375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f, -0.46875f, -0.90625f, -0.375f, -0.46875f, -0.90625f, -0.375f)
			.setRotationPoint(58, -15.75f, -8.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 126, textureX, textureY)
			.addShapeBox(-0.5f, -0.59375f, -0.5625f, 1, 1, 1, 0, -0.46875f, -0.03125f, -0.375f, -0.46875f, -0.03125f, -0.375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.46875f, -0.90625f, -0.375f, -0.46875f, -0.90625f, -0.375f, -0.4375f, -0.875f, -0.4375f, -0.4375f, -0.875f, -0.4375f)
			.setRotationPoint(58, -15.75f, -8.21875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -3.25f, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, -3.25f, -0.5f, 0)
			.setRotationPoint(-72.5f, -22.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, -3.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -3.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-72.5f, -22.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.5f, -16, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.25f, -20.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 204, textureX, textureY)
			.addShapeBox(0, 0, 2.5f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.25f, -20.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 218, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14.02f, 0, 0, 14.02f, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 14.02f, 0, 0.1875f, 14.02f)
				.setRotationPoint(-45.5f, -17.9375f, -7.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard2(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.4375f, 0, -0.5f, 0.4375f, 0, -0.5f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(45.25f, -21.9375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.8125f, -0.5f, -0.8125f, -0.8125f, -0.5f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(45.25f, -20.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.6875f, -1, -0.5f, -0.6875f, -1, -0.5f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(45.25f, -20.3125f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.5f, -0.5f, -0.8125f, -0.5f, -0.5f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(45.25f, -16.1875f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, -0.6875f, -0.8125f, -0.5f, -0.6875f, -0.8125f, -0.5f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(45.25f, -16.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 208, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, -0.8125f, 0, -0.8125f, -0.8125f)
			.setRotationPoint(45.25f, -20.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 204, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -1, 0, -0.6875f, -1)
			.setRotationPoint(45.25f, -20.3125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 209, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.8125f, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, -0.5f, 0, -0.8125f, -0.5f)
			.setRotationPoint(45.25f, -16.1875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 206, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.8125f, 0, -0.6875f, -0.8125f)
			.setRotationPoint(45.25f, -16.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 178, textureX, textureY)
			.addShapeBox(0.25f, 0, 0, 0, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45.25f, -20.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(45.25f, -16, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 7, 0, -0.4375f, 0, 0.0625f, 0.4375f, 0, 0.0625f, -0.625f, 0, -2.9375f, 0.625f, 0, -2.9375f, -0.375f, -0.5f, 0.0625f, 0.375f, -0.5f, 0.0625f, -0.625f, -0.5f, -2.9375f, 0.625f, -0.5f, -2.9375f)
			.setRotationPoint(62.16625f, -24.171875f, 2.9375f).setRotationAngle(0, 0, 0).setName("NUMBERBOARD0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 7, 0, 0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, 0.4375f, 0, -2.9375f, -0.4375f, 0, -2.9375f, 0.625f, -0.5f, 0.0625f, -0.625f, -0.5f, 0.0625f, 0.375f, -0.5f, -2.9375f, -0.375f, -0.5f, -2.9375f)
			.setRotationPoint(62.16625f, -24.171875f, -6.9375f).setRotationAngle(0, 0, 0).setName("NUMBERBOARD1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, -2, 0, -6, -2, 0, -6, -2, 0, 0, -2, 0)
			.setRotationPoint(49.125f, -13.625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, -2, 0, -6, -2, 0, -6, -2, 0, 0, -2, 0)
			.setRotationPoint(49.125f, -13.625f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0.5f, 0)
			.setRotationPoint(1.1875f, -23.5f, -7).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_SP(){
		TurboList SP = new TurboList("SP");
		SP.add(new ModelRendererTurbo(SP, 298, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(34, -23.125f, 6).setRotationAngle(0, 0, 0)
		);
		groups.add(SP);
	}

	private final void initGroup_nums(){
		TurboList nums = new TurboList("nums");
		nums.add(new ModelRendererTurbo(nums, 337, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 9, 0, -2.4375f, 0, 0, 2.4375f, 0, 0, 0, 0, -4.5f, 0, 0, -4.5f, -2.4375f, -1.5f, 0, 2.4375f, -1.5f, 0, 0, -1.5f, -4.5f, 0, -1.5f, -4.5f)
			.setRotationPoint(-72.10375f, -16.9375f, -6.25f).setRotationAngle(0, 0, 0)
		);
		nums.add(new ModelRendererTurbo(nums, 337, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 9, 0, 0, 0, -4.5f, 0, 0, -4.5f, 2.4375f, 0, 0, -2.4375f, 0, 0, 0, -1.5f, -4.5f, 0, -1.5f, -4.5f, 2.4375f, -1.5f, 0, -2.4375f, -1.5f, 0)
			.setRotationPoint(-72.10375f, -16.9375f, -2.75f).setRotationAngle(0, 0, 0)
		);
		nums.add(new ModelRendererTurbo(nums, 71, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 8, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, -1.5f, -4, 0, -1.5f, -4, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(-70.76f, -21, 1.625f).setRotationAngle(0, 0, 0)
		);
		nums.add(new ModelRendererTurbo(nums, 0, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, -4, 0, -1.5f, -4)
			.setRotationPoint(-70.76f, -21, -9.625f).setRotationAngle(0, 0, 0)
		);
		groups.add(nums);
	}

	private final void initGroup_Dash944cw(){
		TurboList Dash944cw = new TurboList("Dash944cw");
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, -0.5f, 0, 0.375f, -0.5f)
			.setRotationPoint(20.0625f, -23.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 303, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(20.25f, -9.6875f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 325, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(18, -10.0625f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 248, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(24.75f, -10.0625f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 338, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.625f, -1, 0, -0.625f, -1, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(25.75f, -10.3125f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.625f, -0.25f, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(25.75f, -11.3125f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 26, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.625f, 0, 0.1875f, -0.625f)
			.setRotationPoint(26, -18.5f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.875f, -0.625f, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.25f, -0.625f)
			.setRotationPoint(26.625f, -20.75f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 7, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -1, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.625f, -1, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
			.setRotationPoint(25.625f, -20.5f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 7, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, -0.375f, 0, -0.625f)
			.setRotationPoint(25.625f, -19.5f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 439, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0.1875f, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, -0.25f, 0, 0.1875f, -0.25f)
			.setRotationPoint(27.625f, -20.125f, 10.625f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 464, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(28.125f, -20.125f, 11).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 360, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.375f, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, -0.8125f, 0, 0.375f, -0.8125f)
			.setRotationPoint(3.5f, -22.375f, 7).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 271, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.375f, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, -0.8125f, 0, 0.375f, -0.8125f)
			.setRotationPoint(9.75f, -22.375f, 7).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 50, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8125f, 0, -0.5f, -0.8125f)
			.setRotationPoint(4, -22.375f, 7).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 73, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8125f, 0, -0.5f, -0.8125f)
			.setRotationPoint(4, -18.5f, 7).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 76, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(4.25f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 154, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(4.75f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 413, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(5.25f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 111, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(5.75f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 304, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(6.25f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 460, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(6.75f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 401, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(7.25f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 332, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(7.75f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 509, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(8.25f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 129, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(8.75f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 139, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(9.25f, -21.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 377, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(4, -21.875f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 279, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, 0, 0, 0, 0.375f, -0.8125f, -0.5f, 0.375f, -0.8125f, -0.5f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(3.5f, -22.375f, -8).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 414, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.8125f, -0.5f, 0, -0.8125f, -0.5f, 0, 0, 0, 0, 0, 0, 0.375f, -0.8125f, -0.5f, 0.375f, -0.8125f, -0.5f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(9.75f, -22.375f, -8).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 114, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.8125f, -0.25f, -0.5f, -0.8125f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4, -22.375f, -8).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 325, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.25f, 0, -0.8125f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.8125f, -0.25f, -0.5f, -0.8125f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4, -18.5f, -8).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 139, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(4.25f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 132, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(4.75f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 85, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(5.25f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 78, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(5.75f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 7, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(6.25f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 0, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(6.75f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 325, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(7.25f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 265, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(7.75f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 162, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(8.25f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(8.75f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(9.25f, -21.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(4, -21.875f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 439, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 0, -0.28125f, 0, 0, -0.28125f, 0, 0, 0, 0, 0, 0, -0.125f, 0, -0.28125f, -0.125f, 0, -0.28125f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(19.1875f, -23.125f, -7).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 89, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f)
			.setRotationPoint(28.125f, -15.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 332, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 3, 4, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0.125f, 0.1875f, 0)
			.setRotationPoint(28.25f, -6.1875f, 7).setRotationAngle(0, 0, 0)
		);
		Dash944cw.add(new ModelRendererTurbo(Dash944cw, 413, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 4, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0)
			.setRotationPoint(43.25f, -15.1875f, 7).setRotationAngle(0, 0, 0)
		);
		groups.add(Dash944cw);
	}

	ModelGEHIAD truck = new ModelGEHIAD();
	ModelAC44CWCompressor comp = new ModelAC44CWCompressor();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			ModelRenderHelper.renderModelWithRollingStockLightControls(l.toArray(arr), entity, f5);
		}
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/parts/ac44cw_compressor.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.41015625f, -0.044921875f, -0.18164062f);
		GL11.glScalef(0.7f, 0.7f, 0.7f); //
		comp.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();


		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/ge_hi-ad_black.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-3.3125f,0,0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslatef(3.3125f,0,0);
		GL11.glRotatef(180, 0, 1, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
