//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.tender;


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelNYCPT2TenderBogie;
import tcmodern.common.entities.tender.EntityNYCPT2Tender;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNYCPT2Tender extends FVTMFormatBase {

	public ModelNYCPT2Tender(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_CoalOverflow();
		initGroup_Coal();
		initGroup_new_group0();
		initGroup_FrameS1();
		initGroup_clipboard();
		initGroup_PaintingStuff();
		initGroup_FrameS2();
	}

	private final void initGroup_CoalOverflow(){
		TurboList CoalOverflow = new TurboList("CoalOverflow");
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 446, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(46.5625f, -9.8125f, -2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 446, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -0.5f, -1.75f, 0, -0.5f, -1.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 1.75f, 0, -0.5f, 1.75f, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(48.0625f, -9.0625f, -2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 240, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -1.75f, 0, -2, -1.75f, 0.5f, 1.25f, -1, 0.5f, 0, -1, 0, -0.5f, 0.75f, 0, -3.25f, 0.75f, 0.875f, 1.25f, 0, 0.5f)
			.setRotationPoint(48.0625f, -9.0625f, 2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 12, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.25f, -1, 0.5f, -2, -1.75f, 0.5f, -0.5f, -1.75f, 0, 0, 0, 0, 1.25f, 0, 0.5f, -3.25f, 0.75f, 0.875f, -0.5f, 0.75f, 0, 0, -1, 0)
			.setRotationPoint(48.0625f, -9.0625f, -3.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 240, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -1.75f, -1.75f, 0.5f, 0, -1.75f, 0.5f, 0, 0, 0, -0.5f, 0.75f, 0, -1.75f, 1.75f, 0.5f, 0, 1.75f, 0.5f)
			.setRotationPoint(46.5625f, -9.8125f, 2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 12, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 0, -1.75f, 0.5f, -1.75f, -1.75f, 0.5f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 1.75f, 0.5f, -1.75f, 1.75f, 0.5f, -0.5f, 0.75f, 0, 0, 0, 0)
			.setRotationPoint(46.5625f, -9.8125f, -3.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 499, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -0.75f, -1.25f, 0, -0.75f, -1.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 1.25f, 0, -0.75f, 1.25f, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(49.5625f, -7.3125f, -2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 240, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 1.5f, 0, 0.5f, -1.75f, -1.25f, 0.5f, -0.75f, -1.25f, 0, 0, 0, 0, 1.5f, 0, 0.5f, -1.75f, 1.25f, 0.5f, -0.75f, 1.25f, 0, 0, 0, 0)
			.setRotationPoint(49.5625f, -7.3125f, -3.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 12, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 0, 0, 0, -0.75f, -1.25f, 0, -1.75f, -1.25f, 0.5f, 1.5f, 0, 0.5f, 0, 0, 0, -0.75f, 1.25f, 0, -1.75f, 1.25f, 0.5f, 1.5f, 0, 0.5f)
			.setRotationPoint(49.5625f, -7.3125f, 2.25f).setRotationAngle(0, 0, 0)
		);
		CoalOverflow.add(new ModelRendererTurbo(CoalOverflow, 12, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 0, 0, 0, -0.25f, -1.25f, 0, -1.75f, -1.25f, -0.4375f, 1.25f, 0, -0.625f, 0, 0, 0, -0.25f, 1.25f, 0, -3.125f, 1.25f, -0.4375f, 1.25f, 0, -0.625f)
			.setRotationPoint(48.0625f, -7.3125f, 3.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(CoalOverflow);
	}

	private final void initGroup_Coal(){
		TurboList Coal = new TurboList("Coal");
		Coal.add(new ModelRendererTurbo(Coal, 245, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.5f, 0)
			.setRotationPoint(-1.875f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 229, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, -0.25f, 0, 0, 1, -0.1875f, 0, 0.75f, -0.1875f, 0, 0, 0, 0, 0.25f, 0, 0, -1, -0.1875f, 0, -0.75f, -0.1875f)
			.setRotationPoint(-1.875f, -18.625f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 107, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1.25f, 0)
			.setRotationPoint(3.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 91, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, 0.25f, 0, 0, 0.5f, 0, 0, -0.75f, -0.1875f, 0, -1, -0.1875f)
			.setRotationPoint(3.125f, -18.625f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 80, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(8.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 64, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, -0.1875f, 0, 0.75f, -0.1875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, -0.1875f, 0, -0.75f, -0.1875f)
			.setRotationPoint(8.125f, -18.625f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 48, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1, 0)
			.setRotationPoint(13.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 32, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1.5f, 0, 0, -1.25f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(13.125f, -19.625f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 16, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.25f, 0)
			.setRotationPoint(18.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1.25f, 0, 0, -1, 0, 0, 0.25f, -0.1875f, 0, 0, -0.1875f, 0, 1.25f, 0, 0, 1, 0, 0, -0.25f, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(18.125f, -19.625f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 411, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(23.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 400, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, 1, 0, 0, 1, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f)
			.setRotationPoint(23.125f, -19.625f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 384, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.5f, 0)
			.setRotationPoint(28.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 156, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.5f, 0, 0, -0.75f, 0, 0, 0.25f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, 0, 0, 0.75f, 0, 0, -0.25f, -0.1875f, 0, -0.5f, -0.1875f)
			.setRotationPoint(28.125f, -19.125f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 145, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1.25f, 0)
			.setRotationPoint(33.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 129, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.75f, 0, 0, -1.25f, 0, 0, -0.25f, -0.1875f, 0, 0.25f, -0.1875f, 0, 0.75f, 0, 0, 1.25f, 0, 0, 0.25f, -0.1875f, 0, -0.25f, -0.1875f)
			.setRotationPoint(33.125f, -19.125f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 118, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.75f, 0)
			.setRotationPoint(38.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 485, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, 0, -0.1875f, 0, 0.75f, -0.1875f, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0, -0.1875f, 0, -0.75f, -0.1875f)
			.setRotationPoint(38.125f, -18.125f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 228, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 5, 0, 0, 0, 0, 0.5f, -0.5f, 0.25f, 0.5f, -0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0.5f, 0.5f, 0.25f, 0.5f, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(43.125f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 5, 0, 0, 0.25f, 0, 0.5f, -0.5f, 0, 0.5f, 0.25f, -0.1875f, 0, 1, -0.1875f, 0, -0.25f, 0, 0.5f, 0.5f, 0, 0.5f, -0.25f, -0.1875f, 0, -1, -0.1875f)
			.setRotationPoint(43.125f, -17.125f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 107, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, -0.25f, 0, 0, 0.1875f, 0, 0, -0.75f, -0.1875f, 0, -1, -0.1875f, 0, 0.25f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-16.875f, -18.625f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 91, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, -0.1875f, 0, 1, -0.1875f, 0, 0, 0, 0, 0.25f, 0, 0, -1.5f, -0.1875f, 0, -1, -0.1875f, 0, 0, 0, 0, -0.25f, 0)
			.setRotationPoint(-11.875f, -18.125f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 80, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, -0.1875f, 0, 1.25f, -0.1875f, 0, 0.5f, 0, 0, 0, 0, 0, -1, -0.1875f, 0, -1.25f, -0.1875f, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-6.875f, -18.125f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 64, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, -0.25f, 0, 0, 0, 0, 0, -0.75f, -0.1875f, 0, -1, -0.1875f, 0, 0.25f, 0, 0, 0, 0)
			.setRotationPoint(-1.875f, -18.625f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 48, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, -0.1875f, 0, 0.75f, -0.1875f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -1, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, 0, 0, 0.25f, 0)
			.setRotationPoint(3.125f, -18.625f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 32, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.75f, -0.1875f, 0, -1, -0.1875f, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(8.125f, -18.625f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 16, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -1.25f, 0, 0, -1.5f, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 1.25f, 0, 0, 1.5f, 0)
			.setRotationPoint(13.125f, -19.625f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, -0.1875f, 0, 0.25f, -0.1875f, 0, -1, 0, 0, -1.25f, 0, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, 1, 0, 0, 1.25f, 0)
			.setRotationPoint(18.125f, -19.625f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 409, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, -0.1875f, 0, 0, -0.1875f, 0, -1, 0, 0, -1, 0, 0, -0.25f, -0.1875f, 0, 0, -0.1875f, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(23.125f, -19.625f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 393, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.5f, -0.1875f, 0, 0.25f, -0.1875f, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, -0.1875f, 0, -0.25f, -0.1875f, 0, 0.75f, 0, 0, 0.5f, 0)
			.setRotationPoint(28.125f, -19.125f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 377, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -1.25f, 0, 0, -0.75f, 0, 0, -0.25f, -0.1875f, 0, 0.25f, -0.1875f, 0, 1.25f, 0, 0, 0.75f, 0)
			.setRotationPoint(33.125f, -19.125f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 259, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, -0.1875f, 0, 0, -0.1875f, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.75f, -0.1875f, 0, 0, -0.1875f, 0, 0.75f, 0, 0, 0.25f, 0)
			.setRotationPoint(38.125f, -18.125f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 228, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 5, 0, 0, 1, -0.1875f, 0.5f, 0.25f, -0.1875f, 0.5f, -0.5f, 0, 0, 0.25f, 0, 0, -1, -0.1875f, 0.5f, -0.25f, -0.1875f, 0.5f, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(43.125f, -17.125f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 229, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.6875f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.6875f, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.875f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 159, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.875f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 135, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.875f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 159, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.875f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 111, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 235, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 135, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 177, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 108, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 135, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(33.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 235, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 5, 0, 0, 0.25f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0.25f, 0, 0, 0)
			.setRotationPoint(43.125f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 413, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1.25f, -0.1875f, 0, 1, -0.1875f, 0, 0, 0, 0, -0.5f, 0, 0, -1.25f, -0.1875f, 0, -1, -0.1875f)
			.setRotationPoint(-6.875f, -18.125f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.6875f, 0)
			.setRotationPoint(-16.875f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 235, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1.25f, 0)
			.setRotationPoint(-11.875f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1, 0)
			.setRotationPoint(-6.875f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 214, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.1875f, 0, 0, -0.25f, 0, 0, 1, -0.1875f, 0, 0.75f, -0.1875f, 0, -0.1875f, 0, 0, 0.25f, 0, 0, -1, -0.1875f, 0, -0.75f, -0.1875f)
			.setRotationPoint(-16.875f, -18.625f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 490, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.25f, 0, 0, 0, 0, 0, 1, -0.1875f, 0, 1.5f, -0.1875f, 0, -0.25f, 0, 0, 0, 0, 0, -1, -0.1875f, 0, -1.5f, -0.1875f)
			.setRotationPoint(-11.875f, -18.125f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 213, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, -0.1875f, 0, 0.75f, -0.1875f, 0, 0.1875f, 0, 0, -0.25f, 0, 0, -1, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.1875f, 0, 0, 0.25f, 0)
			.setRotationPoint(-21.875f, -18.625f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1, -0.1875f, 0, 1.5f, -0.1875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -1, -0.1875f, 0, -1.5f, -0.1875f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-26.875f, -18.125f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.6875f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.875f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.875f, -17.125f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 430, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.6875f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1.6875f, 0, 0, -1.25f, 0)
			.setRotationPoint(-21.875f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 430, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.375f, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.375f, 0)
			.setRotationPoint(-26.875f, -17.125f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 491, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, -0.25f, 0, 0, 0.1875f, 0, 0, 0.75f, -0.1875f, 0, 1, -0.1875f, 0, 0.25f, 0, 0, -0.1875f, 0, 0, -0.75f, -0.1875f, 0, -1, -0.1875f)
			.setRotationPoint(-21.875f, -18.625f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 491, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 5, 0, 0, 0.375f, 0, 0, 0.25f, 0, 0, 1.5f, -0.1875f, 0, 1, -0.1875f, 0, -0.375f, 0, 0, -0.25f, 0, 0, -1.5f, -0.1875f, 0, -1, -0.1875f)
			.setRotationPoint(-26.875f, -18.125f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Coal.add(new ModelRendererTurbo(Coal, 240, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 1, 0, 1.25f, 0, -0.625f, -1.75f, -1.25f, -0.4375f, -0.25f, -1.25f, 0, 0, 0, 0, 1.25f, 0, -0.625f, -3.125f, 1.25f, -0.4375f, -0.25f, 1.25f, 0, 0, 0, 0)
			.setRotationPoint(48.0625f, -7.3125f, -4.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(Coal);
	}

	private final void initGroup_new_group0(){
		TurboList new_group0 = new TurboList("new_group0");
		new_group0.add(new ModelRendererTurbo(new_group0, 432, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 20, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, -12.875f, -10).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 121, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-51.5f, -12.875f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 413, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f)
			.setRotationPoint(-51.5f, 1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 116, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-51.5f, -12.875f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 235, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f)
			.setRotationPoint(-51.5f, -2.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 135, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f)
			.setRotationPoint(-51.5f, -6.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 111, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f)
			.setRotationPoint(-51.5f, -10.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 66, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-47.9375f, -12.875f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 389, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f)
			.setRotationPoint(-47.9375f, 1.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 61, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-47.9375f, -12.875f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 344, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f)
			.setRotationPoint(-47.9375f, -2.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 299, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f)
			.setRotationPoint(-47.9375f, -6.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 211, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f)
			.setRotationPoint(-47.9375f, -10.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 278, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -12.5f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 189, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -12.5f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 171, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -7.5f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 119, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -7.5f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 63, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -10, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 18, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -5, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 493, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -5, -11.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 447, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, 0, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 382, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, 2.5f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 373, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -2.5f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 364, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -10, -11.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 355, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, 2.5f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 346, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, -2.5f, -11.0625f).setRotationAngle(0, 0, 0)
		);
		new_group0.add(new ModelRendererTurbo(new_group0, 337, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-50.8125f, 0, -11.0625f).setRotationAngle(0, 0, 0)
		);
		groups.add(new_group0);
	}

	private final void initGroup_FrameS1(){
		TurboList FrameS1 = new TurboList("FrameS1");
		FrameS1.add(new ModelRendererTurbo(FrameS1, 488, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-46.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 251, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0)
			.setRotationPoint(-47.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 235, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0)
			.setRotationPoint(-48.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 269, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-51.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 485, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(6, 2.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 135, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0.625f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0, 0.625f, 0)
			.setRotationPoint(17, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 145, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-36, 1.125f, 6).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 16, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-36, 1.5f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 0, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-36, 1.875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 507, 117, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 1, 1, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 3.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 193, 117, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 3.25f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 283, 143, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(5, 3.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 247, 159, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(5, 3.25f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 135, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(16, 1.5f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 251, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -1, 0)
			.setRotationPoint(16, 1.875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 507, 114, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 1, 1, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(16, 3.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 135, 114, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16, 3.25f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 180, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-39, 4.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 504, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-38, 5, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 284, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-37, 5.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 251, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, -0.75f, 0)
			.setRotationPoint(-37, 6.5f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 90, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-36, 5.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 368, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-34.5f, 8.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 347, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(-34.5f, 8, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 424, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-34, 7.6875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 323, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(-34.5625f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 391, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.875f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.875f, 0, 0, -0.125f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.125f, -0.5625f, 0)
			.setRotationPoint(-34.5625f, 6.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 110, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-39, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 368, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-23.5f, 8.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 347, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(-23.5f, 8, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 424, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-23, 7.6875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 323, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(-23.5625f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 368, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(-23.5625f, 6.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 429, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-12.5f, 8.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 368, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(-12.5f, 8, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 424, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-12, 7.6875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 182, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(-12.5625f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 113, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(-12.5625f, 6.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 269, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(9.5f, 8.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 429, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(9.5f, 8, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 424, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(10, 7.6875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 368, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(9.4375f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 269, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(9.4375f, 6.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 285, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-1.5f, 8.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 305, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(-1.5f, 8, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 446, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-1, 7.6875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 139, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(-1.5625f, 7.1875f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 305, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(-1.5625f, 6.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 501, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.8125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.8125f, -0.6875f, 0)
			.setRotationPoint(-28.25f, 6.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 101, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.3125f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.3125f, 0, 0, -0.6875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(-27.75f, 7.0625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 501, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.8125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.8125f, -0.6875f, 0)
			.setRotationPoint(-17.25f, 6.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 92, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.3125f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.3125f, 0, 0, -0.6875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(-16.75f, 7.0625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 83, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(-33, 7.4375f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 54, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f)
			.setRotationPoint(-33, 7.25f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 9, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-33, 7, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 26, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f)
			.setRotationPoint(-33, 5, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 484, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f)
			.setRotationPoint(-33, 3.75f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 438, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(-33, 4, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 405, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(-22, 7.4375f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 396, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f)
			.setRotationPoint(-22, 7.25f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 328, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-22, 7, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 319, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f)
			.setRotationPoint(-22, 5, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 310, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f)
			.setRotationPoint(-22, 3.75f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 301, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(-22, 4, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 260, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(-11, 7.4375f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 238, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f)
			.setRotationPoint(-11, 7.25f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 229, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f)
			.setRotationPoint(-11, 7, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 220, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f)
			.setRotationPoint(-11, 5, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 211, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f)
			.setRotationPoint(-11, 3.75f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 202, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(-11, 4, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 144, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(0, 7.4375f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 135, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f)
			.setRotationPoint(0, 7.25f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 74, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f)
			.setRotationPoint(0, 7, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 45, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f)
			.setRotationPoint(0, 5, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 36, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f)
			.setRotationPoint(0, 3.75f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 27, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(0, 4, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 501, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(11, 7.4375f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 429, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f)
			.setRotationPoint(11, 7.25f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 292, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f)
			.setRotationPoint(11, 7, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 283, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f)
			.setRotationPoint(11, 5, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 193, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f)
			.setRotationPoint(11, 3.75f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 172, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(11, 4, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 505, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-32.5f, 3.5625f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 505, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-21.5f, 3.5625f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 228, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-10.5f, 3.5625f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 504, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(0.5f, 3.5625f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 504, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(11.5f, 3.5625f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 348, 137, textureX, textureY)
			.addShapeBox(-4, -4, 0, 4, 1, 1, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.8125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.8125f, -0.6875f, 0)
			.setRotationPoint(-2.25f, 10.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 126, 157, textureX, textureY)
			.addShapeBox(-4, -4, 0, 3, 1, 1, 0, -0.3125f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.3125f, 0, 0, -0.6875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(-1.75f, 11.0625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 244, 137, textureX, textureY)
			.addShapeBox(-4, -4, 0, 4, 1, 1, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.8125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.8125f, -0.6875f, 0)
			.setRotationPoint(8.75f, 10.75f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 65, 157, textureX, textureY)
			.addShapeBox(-4, -4, 0, 3, 1, 1, 0, -0.3125f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.3125f, 0, 0, -0.6875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(9.25f, 11.0625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 18, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-33, 3, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 492, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-33, 1.1875f, 7.625f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 388, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(-33, 2.0625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 379, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-22, 3, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 184, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-22, 1.1875f, 7.625f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 94, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(-22, 2.0625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 85, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-11, 3, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 9, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-11, 1.1875f, 7.625f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 26, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(-11, 2.0625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 398, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(0, 3, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 330, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(0, 1.1875f, 7.625f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 321, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(0, 2.0625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 312, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(11, 3, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 303, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(11, 1.1875f, 7.625f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 234, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(11, 2.0625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 225, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f)
			.setRotationPoint(-33, 5.3125f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 216, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f)
			.setRotationPoint(-22, 5.3125f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 207, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f)
			.setRotationPoint(-11, 5.3125f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 148, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f)
			.setRotationPoint(0, 5.3125f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 139, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f)
			.setRotationPoint(11, 5.3125f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 76, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f)
			.setRotationPoint(-33, 5.6875f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 484, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f)
			.setRotationPoint(-22, 5.6875f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 294, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f)
			.setRotationPoint(-11, 5.6875f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 390, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f)
			.setRotationPoint(0, 5.6875f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 375, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f)
			.setRotationPoint(11, 5.6875f, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 270, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(-33, 6, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 408, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(-22, 6, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 217, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(-11, 6, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 171, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(0, 6, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 425, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(11, 6, 8).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 235, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(19, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 413, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(19.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 446, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.4375f, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(22.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 488, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(51, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 245, 134, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(5, 1, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 425, 134, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(5, 1.375f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 505, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-5, 2.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 245, 131, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-6, 3.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 413, 123, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-6, 3.25f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 398, 129, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-6, 1, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 413, 120, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(-6, 1.375f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-16, 2.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 259, 129, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-17, 3.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 413, 117, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17, 3.25f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 501, 109, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-17, 1, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 290, 107, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(-17, 1.375f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 0, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-27, 2.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 501, 106, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-28, 3.625f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 502, 88, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-28, 3.25f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 132, 103, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-28, 1, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 502, 85, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(-28, 1.375f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 16, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, 0.25f, 0)
			.setRotationPoint(17.875f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		FrameS1.add(new ModelRendererTurbo(FrameS1, 0, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.625f, -1, 0, -0.625f, -1, 0, 0, -0.375f, 0)
			.setRotationPoint(18.625f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		groups.add(FrameS1);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 134, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 131, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 129, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 128, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.5f, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 128, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 120, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 115, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 111, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 111, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 174, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(-20.5f, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 174, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(-9.5f, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 174, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(1.5f, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 174, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(12.5f, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 111, textureX, textureY)
			.addShapeBox(-4, -4, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 174, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 1.25f, 1.25f, 0, null)
			.setRotationPoint(-31.5f, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 104, 1, 19, 0, 0, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-51.5f, 0.125f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 8, 22, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, -12.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 22, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f)
			.setRotationPoint(-52.5f, 0.125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 95, 1, 22, 0, 0, 0.375f, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-45.5f, -4.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 99, 2, 22, 0, 0, -0.1875f, -0.375f, -0.5f, -0.1875f, -0.375f, -0.5f, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, 0, 0, -1.125f, -0.5f, 0, -1.125f, -0.5f, 0, -1.125f, 0, 0, -1.125f)
			.setRotationPoint(-45.5f, -3.6875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 99, 2, 20, 0, 0, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, 0, -1.125f, -0.5f, 0, -1.125f, -0.5f, 0, -1.125f, 0, 0, -1.125f)
			.setRotationPoint(-45.5f, -1.875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 20, 0, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, -1.125f)
			.setRotationPoint(-51.5f, -3.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 18, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, -1.125f)
			.setRotationPoint(-51.5f, -1.875f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 20, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-51.5f, -4.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.375f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-51.875f, -13.875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-47.1875f, -13.875f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-45.875f, -13.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.25f, -0.125f, -0.375f, -0.25f, -0.125f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.25f, -0.125f, -0.375f, -0.25f)
			.setRotationPoint(-45.25f, -13.875f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 72, 8, 1, 0, 0, 0.375f, 0, 0.5f, 0.375f, 0, 0.5f, 0.375f, -0.625f, 0, 0.375f, -0.625f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-25.5f, -12.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(52.875f, 0.625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 17, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -2.375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 7, 0, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0.5625f, -0.25f, -0.625f, 0.5625f, -0.25f, -0.625f, 0.5625f, -0.25f, 0, 0.5625f, -0.25f)
			.setRotationPoint(46.625f, -12.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 7, 0, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0.5625f, -0.25f, -0.625f, 0.5625f, -0.25f, -0.625f, 0.5625f, -0.25f, 0, 0.5625f, -0.25f)
			.setRotationPoint(46.625f, -12.4375f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 9, 0, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(46.625f, -6.375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 95, 1, 22, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-45.5f, -5.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0.4375f, 0, -0.625f, 0.4375f, 0, -0.625f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(46.625f, -18.875f, -5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0, -0.625f, -0.4375f, -0.125f, 0, -0.4375f, -0.125f)
			.setRotationPoint(46.625f, -19, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, 0.0625f, 0, -0.625f, 0.0625f, 0, -0.625f, 0.0625f, -0.125f, 0, 0.0625f, -0.125f)
			.setRotationPoint(46.625f, -18.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.875f, 0, -0.625f, -0.875f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -0.625f, 0.3125f, 0, -0.625f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(46.625f, -17.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1.125f, 0, -0.625f, -1.125f, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0.4375f, 0, -0.625f, 0.4375f, 0, -0.625f, 0.4375f, -0.375f, 0, 0.4375f, -0.375f)
			.setRotationPoint(46.625f, -16.875f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 1, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(47, -12.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, -0.625f, 0, -0.0625f, -0.625f)
			.setRotationPoint(47, -17.375f, -4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, -0.625f, 0, 0, -0.625f, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, -0.625f, 0, -0.0625f, -0.625f)
			.setRotationPoint(47.5f, -17.375f, -4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, -0.375f, -4.25f, 0, -0.375f, -4.25f, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(48, -17.0625f, -4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f, -0.3125f, -0.625f, 0, -0.3125f, -0.625f)
			.setRotationPoint(51.625f, -13.125f, -4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(52.625f, -13.125f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 1, 0, 0, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -12.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, -0.625f, -0.5f, -0.0625f, -0.625f, -0.5f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47, -17.375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.625f, -0.5f, -0.3125f, -0.625f, -0.5f, -0.3125f, 0, 0, 0, 0, 0, -0.0625f, -0.625f, -0.5f, -0.0625f, -0.625f, -0.5f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -17.375f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, -0.625f, -0.375f, -4.25f, -0.625f, -0.375f, -4.25f, 0, 0, 0, 0, 0, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48, -17.0625f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, -0.625f, 0.375f, -0.3125f, -0.625f, 0.375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0.375f, -0.3125f, -0.625f, 0.375f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(51.625f, -13.125f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(52.625f, -13.125f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 8, 0, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0.5f, 0, -0.3125f, 0.5f, 0, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0.5f, 0, -0.3125f, 0.5f)
			.setRotationPoint(46.625f, -18.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-38.3125f, -13.875f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.375f, 0, 0.1875f, -0.375f, 0, 0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f)
			.setRotationPoint(-37.3125f, -13.875f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.631f, -0.25f, -0.375f, -0.125f, 0, -0.625f, -0.125f, 0, 0, -0.631f, -0.25f, -0.25f, -0.631f, -0.75f, -0.375f, -0.125f, -0.75f, -0.375f, -0.125f, -0.75f, -0.25f, -0.631f, -0.75f, -0.25f)
			.setRotationPoint(-34.1875f, -17.125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.625f, -0.5f, 0.1875f, -0.938f, -0.5f, 0.1875f, 0.313f, 0, -0.125f, 0, 0, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.25f, 0, -0.625f, -0.25f)
			.setRotationPoint(-33.3125f, -17.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -0.938f, -0.375f, 0.375f, -1.125f, -0.375f, 0.375f, 0.5f, 0, 0.1875f, 0.313f, 0, -0.625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, 0, -0.625f, -0.25f)
			.setRotationPoint(-32.8125f, -17.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.1875f, 0, 0, 0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(47.5f, -17.625f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.375f, -0.25f, 0.0625f, -0.375f, -0.25f, 0.0625f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.25f, 0.0625f, -0.375f, -0.25f, 0.0625f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-47.1875f, -13.875f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-45.875f, -13.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.125f, -0.375f, -0.25f, -0.0625f, -0.375f, -0.25f, -0.0625f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.25f, -0.0625f, -0.375f, -0.25f, -0.0625f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f)
			.setRotationPoint(-45.25f, -13.875f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-38.3125f, -13.875f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.25f, 0, 0.1875f, -0.25f, 0, 0.1875f, -0.375f, 0, -0.1875f, -0.375f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-37.3125f, -13.875f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 72, 8, 1, 0, 0, 0.375f, -0.625f, 0.5f, 0.375f, -0.625f, 0.5f, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.5f, -12.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 6, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-36.125f, -19.625f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 6, 2, 0, 0, -0.4375f, 0, -0.25f, -0.4375f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-36.125f, -19.625f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 6, 2, 0, 0, -0.8125f, 0, -0.25f, -0.8125f, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-36.125f, -19.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.125f, -18.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-36.125f, -17.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.375f, 0, -0.25f, -1.375f, 0, -0.25f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-36.125f, -17.25f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 6, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-33.125f, -19.625f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 34, 11, 21, 0, 0, -0.5625f, 0.125f, -0.25f, -11.25f, 0.125f, -0.25f, -11.25f, 0.125f, 0, -0.5625f, 0.125f, 0, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, 0, 0.25f, 0.125f)
			.setRotationPoint(-25.5f, -16.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 66, 7, 6, 0, 0, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, -7.25f, 0.125f, 0, -7.25f, 0.125f, 0, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, 0, 0.25f, 0.125f)
			.setRotationPoint(-19.125f, -12.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 66, 7, 6, 0, 0, -7.25f, 0.125f, -0.25f, -7.25f, 0.125f, -0.25f, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, 0, 0.25f, 0.125f)
			.setRotationPoint(-19.125f, -12.625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 82, 2, 1, 0, 0.765f, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -0.375f, -0.25f, 0.765f, -0.375f, -0.25f, 0.765f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.25f, 0.765f, 0, -0.25f)
			.setRotationPoint(-34.75f, -15.25f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 83, 1, 1, 0, 0.223f, 0, -0.625f, 0.5905f, 0, -0.625f, 0.5905f, 0, 0, 0.223f, 0, 0, 1.2025f, 0, -0.375f, 1.4795f, 0, -0.375f, 1.4795f, 0, -0.25f, 1.2025f, 0, -0.25f)
			.setRotationPoint(-34.3125f, -15.875f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 1, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.375f, -0.3125f, -0.25f, -0.375f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-32.1875f, -17.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 1, 0, 0, -1.375f, 0, -0.25f, -1.375f, 0, -0.25f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-36.125f, -16.25f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0.4375f, 0, -0.625f, 0.4375f, 0, -0.625f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(46.625f, -18.875f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, -0.125f, -0.125f, -0.625f, -0.125f, -0.125f, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.4375f, -0.125f, -0.625f, -0.4375f, -0.125f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(46.625f, -19, 5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, -0.75f, 0, 0, -0.75f, 0, 0, 0.0625f, -0.125f, -0.625f, 0.0625f, -0.125f, -0.625f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(46.625f, -18.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.875f, 0, 0, -0.875f, 0, 0, 0.3125f, 0, -0.625f, 0.3125f, 0, -0.625f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(46.625f, -17.75f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, -1.125f, 0, 0, -1.125f, 0, 0, 0.4375f, -0.375f, -0.625f, 0.4375f, -0.375f, -0.625f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(46.625f, -16.875f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -1.1875f, -0.375f, 0.0475f, -0.375f, -0.375f, 0.0475f, -0.375f, -0.25f, -0.25f, -1.1875f, -0.25f, -0.25f, 0, -0.375f, 0.0475f, 0, -0.375f, 0.0475f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-36.5625f, -15.25f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 81, 1, 1, 0, 0.369f, 0, -1, 0.5765f, 0, -1, 0.5765f, 0, 0.375f, 0.369f, 0, 0.375f, 1.348f, 0, -0.375f, 1.4655f, 0, -0.375f, 1.4655f, 0, -0.25f, 1.348f, 0, -0.25f)
			.setRotationPoint(-33.1875f, -16.875f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.631f, -0.25f, -0.25f, -0.125f, 0, 0, -0.125f, 0, -0.625f, -0.631f, -0.25f, -0.375f, -0.631f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.375f, -0.631f, -0.75f, -0.375f)
			.setRotationPoint(-34.1875f, -17.125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.5f, 0.1875f, 0.313f, -0.5f, 0.1875f, -0.938f, 0, -0.125f, -0.625f, 0, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, -0.5f, -0.625f, -0.375f, 0, -0.625f, -0.375f)
			.setRotationPoint(-33.3125f, -17.25f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, 0.313f, -0.375f, 0.375f, 0.5f, -0.375f, 0.375f, -1.125f, 0, 0.1875f, -0.938f, 0, -0.625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, 0, -0.625f, -0.375f)
			.setRotationPoint(-32.8125f, -17.25f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -1.1875f, -0.25f, 0.0475f, -0.375f, -0.25f, 0.0475f, -0.375f, -0.375f, -0.25f, -1.1875f, -0.375f, -0.25f, 0, -0.25f, 0.0475f, 0, -0.25f, 0.0475f, 0, -0.375f, -0.25f, 0, -0.375f)
			.setRotationPoint(-36.5625f, -15.25f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0.167f, 0, 0, 0.167f, 0, -0.625f, 0, 0, -0.625f, 0, 0.0625f, 0, 2, 0.0625f, 0, 2, 0.0625f, -0.625f, 0, 0.0625f, -0.625f)
			.setRotationPoint(47, -14.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.4375f, -0.611f, -0.4375f, 0, -0.611f, -0.4375f, -0.625f, 0, 0, -0.1875f, 0, -0.5625f, 0, -0.611f, -0.5625f, 0, -0.611f, -0.5625f, -0.625f, 0, -0.5625f, -0.625f)
			.setRotationPoint(48, -17.3125f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.125f, -0.5f, -0.3125f, -0.1875f, -0.5f, -0.3125f, -0.4375f, 0, 0, -0.75f, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(47.5f, -17.625f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 82, 2, 1, 0, 0.765f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.375f, 0.765f, -0.375f, -0.375f, 0.765f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.375f, 0.765f, 0, -0.375f)
			.setRotationPoint(-34.75f, -15.25f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 83, 1, 1, 0, 0.223f, 0, 0, 0.5905f, 0, 0, 0.5905f, 0, -0.625f, 0.223f, 0, -0.625f, 1.2025f, 0, -0.25f, 1.4795f, 0, -0.25f, 1.4795f, 0, -0.375f, 1.2025f, 0, -0.375f)
			.setRotationPoint(-34.3125f, -15.875f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 1, 0, 0, 0, 0.5f, -0.3125f, 0, 0.5f, -0.3125f, 0, -1.125f, 0, 0, -1.125f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.375f, 0, -0.25f, -0.375f)
			.setRotationPoint(-32.1875f, -17.625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 81, 1, 1, 0, 0.369f, 0, 0.375f, 0.5765f, 0, 0.375f, 0.5765f, 0, -1, 0.369f, 0, -1, 1.348f, 0, -0.25f, 1.4655f, 0, -0.25f, 1.4655f, 0, -0.375f, 1.348f, 0, -0.375f)
			.setRotationPoint(-33.1875f, -16.875f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.625f, 0.167f, 0, -0.625f, 0.167f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.625f, 2, 0.0625f, -0.625f, 2, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(47, -14.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.611f, -0.4375f, -0.625f, -0.611f, -0.4375f, 0, 0, 0, -0.4375f, 0, -0.5625f, -0.625f, -0.611f, -0.5625f, -0.625f, -0.611f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(48, -17.3125f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5625f, 0, 1.875f, 0.5625f, 0, 1.875f, 0.5625f, 0, 0, 0.5625f, 0)
			.setRotationPoint(-27.375f, -19.625f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 2, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5625f, 0, 1.875f, 0.5625f, 0, 1.875f, 0.5625f, 0, 0, 0.5625f, 0)
			.setRotationPoint(-27.375f, -19.625f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 2, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 1.875f, 0.125f, 0, 1.875f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-27.375f, -19.1875f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.1875f, 0, 1.875f, 0.1875f, 0, 1.875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-27.375f, -18.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, 0.1875f, 0, 1.875f, 0.1875f, 0, 1.875f, 0.1875f, -0.25f, 0, 0.1875f, -0.25f)
			.setRotationPoint(-27.375f, -17.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -1.375f, 0, 0, -1.1875f, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0.1875f, 0, 1.875f, 0.1875f, 0, 1.875f, 0.1875f, -0.375f, 0, 0.1875f, -0.375f)
			.setRotationPoint(-27.375f, -17.25f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5625f, 0, 1.875f, 0.5625f, 0, 1.875f, 0.5625f, 0, 0, 0.5625f, 0)
			.setRotationPoint(-27.375f, -19.625f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 0, 1, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0.1875f, 0, 1.875f, 0.1875f, 0, 1.875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(-27.375f, -16.25f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 6, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-36.125f, -19.625f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 6, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.4375f, 0, 0, -0.4375f, 0, 0, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-36.125f, -19.625f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 6, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-36.125f, -19.1875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.125f, -18.25f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0.375f, -0.25f, -0.25f, 0.375f, -0.25f, -0.25f, -0.375f, 0, 0, -0.375f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.125f, -17.25f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, -1.375f, 0, 0, -1.375f, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.125f, -17.25f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 1, 0, 0, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, -1.375f, 0, 0, -1.375f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.125f, -16.25f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5625f, 0, 1.875f, 0.5625f, 0, 1.875f, 0.5625f, 0, 0, 0.5625f, 0)
			.setRotationPoint(-27.375f, -19.625f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0.5625f, 0, 1.875f, 0.5625f, 0, 1.875f, 0.5625f, 0, 0, 0.5625f, 0)
			.setRotationPoint(-27.375f, -19.625f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0.125f, 0, 1.875f, 0.125f, 0, 1.875f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-27.375f, -19.1875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0.1875f, 0, 1.875f, 0.1875f, 0, 1.875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-27.375f, -18.25f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0.1875f, -0.25f, 1.875f, 0.1875f, -0.25f, 1.875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-27.375f, -17.25f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -1.1875f, 0, 0, -1.375f, 0, 0, 0.1875f, -0.375f, 1.875f, 0.1875f, -0.375f, 1.875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-27.375f, -17.25f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 0, 1, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.1875f, -0.75f, 1.875f, 0.1875f, -0.75f, 1.875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-27.375f, -16.25f, 9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.0625f, -14.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47.625f, -13.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.0625f, -14.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47.625f, -13.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-45.75f, -13.375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 171, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-44.25f, -13.375f, -3.5f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 171, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-43.75f, -13.375f, -3.5f).setRotationAngle(0, 180, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0.5f, 0, -0.875f, 0.5f)
			.setRotationPoint(-44.25f, -13.375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0.5f, 0, -0.875f, 0.5f)
			.setRotationPoint(-44.25f, -13.375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 171, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-44.25f, -13.375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 171, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-43.75f, -13.375f, 3.5f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-45.75f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f)
			.setRotationPoint(-45.25f, -13.4375f, -2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.9375f, 0, -0.5f, -0.9375f, 0, -0.5f, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-45.75f, -13.4375f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0)
			.setRotationPoint(-45.25f, -13.4375f, 1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0.0625f, -0.875f, -0.6875f, -0.6875f, -0.875f, -0.6875f, -0.6875f, -0.875f, 0.0625f, 0.0625f, -0.875f, 0.0625f)
			.setRotationPoint(-43, -13.5f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0)
			.setRotationPoint(-43, -13.6875f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0.0625f, -0.6875f, -0.875f, 0.0625f, -0.6875f, -0.875f, -0.6875f, 0.0625f, -0.875f, -0.6875f)
			.setRotationPoint(-43, -13.5f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(-43, -13.6875f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-43, -13.9375f, -0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-51.375f, -14.25f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-51.375f, -16.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f)
			.setRotationPoint(-51.375f, -17.125f, -5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0)
			.setRotationPoint(-51.375f, -17.125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0)
			.setRotationPoint(-51.375f, -16.8125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0)
			.setRotationPoint(-51.375f, -16.375f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.25f, 0, -0.3125f, 0.25f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0)
			.setRotationPoint(-51.375f, -15.75f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f)
			.setRotationPoint(-51.375f, -14.875f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-51.375f, -14.25f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-51.375f, -16.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0)
			.setRotationPoint(-51.375f, -17.125f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(-51.375f, -17.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(-51.375f, -16.8125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-51.375f, -16.375f, 7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, 0.25f, 0, -0.3125f, 0.25f, 0)
			.setRotationPoint(-51.375f, -15.75f, 8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f)
			.setRotationPoint(-51.375f, -14.875f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-35.5f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-28.125f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0)
			.setRotationPoint(-36, 2.0625f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-24.5f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-17.125f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0)
			.setRotationPoint(-25, 2.0625f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-13.5f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-6.125f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0)
			.setRotationPoint(-14, 2.0625f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-2.5f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(4.875f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0)
			.setRotationPoint(-3, 2.0625f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(8.5f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(15.875f, 1.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0)
			.setRotationPoint(8, 2.0625f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(-35.5f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(-28.125f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f)
			.setRotationPoint(-36, 2.0625f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(-24.5f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(-17.125f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f)
			.setRotationPoint(-25, 2.0625f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(-13.5f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(-6.125f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f)
			.setRotationPoint(-14, 2.0625f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(-2.5f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(4.875f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f)
			.setRotationPoint(-3, 2.0625f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(8.5f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.375f, 0, 0.0625f, -0.375f)
			.setRotationPoint(15.875f, 1.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -2.0625f, 0, 0, -2.0625f, 0, 0, -2.0625f, 0, -0.25f, -2.0625f, 0, -0.25f)
			.setRotationPoint(8, 2.0625f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 7.0625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 4.5625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 4.8125f, -6.75f).setRotationAngle(0, 0, -10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 5.3125f, -6.75f).setRotationAngle(0, 0, -10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 5.8125f, -6.75f).setRotationAngle(0, 0, -10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 6.3125f, -6.75f).setRotationAngle(0, 0, -10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 6.8125f, -6.75f).setRotationAngle(0, 0, -10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 7.0625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 4.5625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 4.8125f, 6.75f).setRotationAngle(0, 0, 10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 5.3125f, 6.75f).setRotationAngle(0, 0, 10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 5.8125f, 6.75f).setRotationAngle(0, 0, 10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 6.3125f, 6.75f).setRotationAngle(0, 0, 10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-35.25f, 6.8125f, 6.75f).setRotationAngle(0, 0, 10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.1875f, 7.0625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.1875f, 4.5625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.1875f, 4.8125f, -6.75f).setRotationAngle(0, 0, -10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.1875f, 6.8125f, -6.75f).setRotationAngle(0, 0, -10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 168, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.1875f, 7.0625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 175, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.1875f, 4.5625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.1875f, 4.8125f, 6.75f).setRotationAngle(0, 0, 10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(16.1875f, 6.8125f, 6.75f).setRotationAngle(0, 0, 10)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(52.8125f, 1.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(52.8125f, -2.875f, -10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(52.8125f, -2.5625f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(55.0625f, 1.4375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(55.0625f, -2.875f, -10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0)
			.setRotationPoint(55.0625f, -2.5625f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(53.5f, 0.5f, -10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(53.5f, -2, -10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(53.5f, 3, -10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(52.8125f, -2.875f, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(55.0625f, -2.875f, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(53.5f, 0.5f, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(53.5f, -2, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(53.5f, 3, 9.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 9, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(47, -6.625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, -0.25f, -0.625f, 0.375f, -0.25f, -0.625f, 0.375f, -0.25f, 0, 0.375f, -0.25f)
			.setRotationPoint(46.625f, -9.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, -0.25f, -0.625f, 0.375f, -0.25f, -0.625f, 0.375f, -0.25f, 0, 0.375f, -0.25f)
			.setRotationPoint(46.625f, -9.75f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.4375f, 0, -0.5f, 0.0625f, 0, -0.5f, 0.0625f, 0, 0, -0.4375f, 0)
			.setRotationPoint(47, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0.25f, 1.25f, 0, 0.25f, 1.25f, 0, 0, 0.0625f, 0)
			.setRotationPoint(48.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, -0.75f, 0)
			.setRotationPoint(49.75f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.375f, 0)
			.setRotationPoint(50.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 164, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.4375, 0.0))
			.setRotationPoint(33.5625f, 1.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, 0, 0, -0.25f, 0)
			.setRotationPoint(20, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0.1875f, 0)
			.setRotationPoint(20.5f, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, 0, 0, -0.0625f, 0)
			.setRotationPoint(21, 1.125f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(7.625f, 2, -8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-3.375f, 2, -8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 167, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(18.625f, 2, -8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 166, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-25.375f, 2, -8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 166, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-36.375f, 2, -8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 166, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(7.625f, 2, 8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 166, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-3.375f, 2, 8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 166, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(18.625f, 2, 8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 166, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-25.375f, 2, 8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 166, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-36.375f, 2, 8.625f).setRotationAngle(0, 0, 43)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -3, 0.625f, 0, 2, -0.125f, 0, 2, -0.125f, 0, -3, 0.625f, 0)
			.setRotationPoint(-10.25f, 0.625f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -2.5f, 0.4375f, 0, 2.3125f, -0.4375f, 0, 2.3125f, -0.4375f, -0.5f, -2.5f, 0.4375f, -0.5f)
			.setRotationPoint(-10.25f, 0.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -2.5f, 0.4375f, 0, 2.3125f, -0.4375f, 0, 2.3125f, -0.4375f, -0.5f, -2.5f, 0.4375f, -0.5f)
			.setRotationPoint(-10.25f, 0.625f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, -0.25f, 0.125f, -0.375f)
			.setRotationPoint(0.75f, 0.625f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, -0.25f, 0.125f, -0.375f)
			.setRotationPoint(0.75f, 0.625f, 2.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 31, textureX, textureY)
			.addShapeBox(0, -0.125f, 0, 4, 1, 4, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 151, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 151, textureX, textureY)
			.addShapeBox(0, -0.5f, 4, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 151, textureX, textureY)
			.addShapeBox(3.875f, -0.125f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 165, textureX, textureY)
			.addShapeBox(3.875f, -0.5f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 165, textureX, textureY)
			.addShapeBox(3.875f, -0.5f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 151, textureX, textureY)
			.addShapeBox(5.625f, -0.375f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 165, textureX, textureY)
			.addShapeBox(5.625f, -0.75f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.375f, 0, -0.125f, 0.375f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 165, textureX, textureY)
			.addShapeBox(5.625f, -0.75f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.375f, 0, -0.125f, 0.375f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 146, textureX, textureY)
			.addShapeBox(7.375f, -0.75f, 0, 2, 1, 4, 0, -0.125f, -0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 181, textureX, textureY)
			.addShapeBox(7.375f, -1.125f, -0.5f, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 164, textureX, textureY)
			.addShapeBox(7.375f, -1.125f, 4, 2, 1, 1, 0, -0.125f, 0, 0, -0.125f, 0.625f, 0, -0.125f, 0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.25f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, -0.5f, -0.125f, 0.25f, -0.5f)
			.setRotationPoint(-7.25f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 166, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 6, 1, 0, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f)
			.setRotationPoint(1.375f, 4.375f, -3.125f).setRotationAngle(0, 0, 98)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 166, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 6, 1, 0, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f, -0.125f, -0.125f, -0.375f)
			.setRotationPoint(1.375f, 4.375f, 2.125f).setRotationAngle(0, 0, 98)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.1875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.1875f, 0, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-27.25f, 7.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.1875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.1875f, 0, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-16.25f, 7.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 155, textureX, textureY)
			.addShapeBox(-4, -4, 0, 2, 1, 1, 0, -0.1875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.1875f, 0, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-1.25f, 11.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 153, textureX, textureY)
			.addShapeBox(-4, -4, 0, 2, 1, 1, 0, -0.1875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.1875f, 0, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(9.75f, 11.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-51.5f, 0.125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-51.5f, 0.625f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 143, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(48.9375f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 19, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -3.375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-38.5f, 1.125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, -0.625f, 0, -0.5f, -0.25f, 0, -0.125f, -0.375f, 0, -0.625f, 0, 0, -0.625f, -0.875f, 0, -0.125f, -0.25f)
			.setRotationPoint(-39.5f, 1.125f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.125f, -0.625f, 0, -0.625f, 0, 0, -0.625f, -0.875f, 0, -0.125f, 0)
			.setRotationPoint(-41.5f, 1.625f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, -0.625f, 0, -0.5f, 0.25f, 0, -0.125f, -0.875f, 0, -0.625f, 0, 0, -0.625f, -0.875f, 0, -0.125f, 0.25f)
			.setRotationPoint(-43.5f, 2.125f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 143, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(40.9375f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 143, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(32.9375f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 142, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(24.9375f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 141, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(16.9375f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 141, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(8.9375f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 141, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(0.9375f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 140, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(-7.0625f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 140, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(-15.0625f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 140, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(-23.0625f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 140, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(-31.0625f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 140, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(-39.0625f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 140, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(-47.0625f, -1.9375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 39, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.5f, -0.875f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 39, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.5f, -0.375f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 138, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(48.9375f, -1.9375f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 137, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(40.9375f, -1.9375f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 136, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(32.9375f, -1.9375f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 136, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(24.9375f, -1.9375f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 136, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 3, 1, 0, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f)
			.setRotationPoint(16.9375f, -1.9375f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 156, textureX, textureY).addCylinder(0, 0, 0, 1, 94, 8, 0.5f, 0.5f, 3, null)
			.setRotationPoint(-44.375f, 0.625f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 136, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 0.5f, 0.5f, 3, new Vec3f(0.0, 0.0, -2.0))
			.setRotationPoint(49.625f, 0.625f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 136, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.5f, 0).setRadius(1, 0).setLength(1).setSegments(8, 0).setScale(0.5f, 0.5f).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(-44.375f, 1.125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 136, textureX, textureY).addCylinder(-1, -0.5f, 0, 1, 1, 8, 0.5f, 0.5f, 3, null)
			.setRotationPoint(-44.375f, 1.125f, 10).setRotationAngle(0, 0, -45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(49, -4.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(49, -4.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 6, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.51f, -9.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 164, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.75f).setLength(1).setSegments(10, 0).setScale(0.625f, 0.625f).setDirection(3)
			.setTopOffset(new Vec3f(-0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-51.75f, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 164, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.4375f, 0.5625f, 3, new Vec3f(-0.8125, 0.0, 0.0))
			.setRotationPoint(-51.6875f, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 164, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.1875f, 0.4375f, 3, new Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(-51.8125f, -10.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-57.5f, 0.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(55.875f, 0.75f, -1).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_PaintingStuff(){
		TurboList PaintingStuff = new TurboList("PaintingStuff");
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 235, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 8, 0, 0, 0, 0.375f, 0, 0.5f, 0.375f, 0, 0.5f, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.5f, -12.875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 235, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 8, 0, 0, 0, 0.375f, 0, 0.5f, 0.375f, 0, 0.5f, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.5f, -12.875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 0, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 2, 0, 0, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.5f, -15.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 0, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 2, 0, 0, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.5f, -15.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 332, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 82, 1, 0, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.5f, -15.875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 324, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 0, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, -16.875f, -10.76f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 0, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 79, 1, 0, 0, 0, -0.25f, -0.75f, 0.5f, -0.25f, -0.75f, 0.5f, -0.25f, 0.75f, 0, -0.25f, 0.75f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -17.875f, -10.135f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 167, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 82, 1, 0, 0, 0, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.5f, -15.875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 163, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 0, 0, 0, 0, 0.625f, 0.5f, 0, 0.625f, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, -16.875f, 10.76f).setRotationAngle(0, 0, 0)
		);
		PaintingStuff.add(new ModelRendererTurbo(PaintingStuff, 163, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 79, 1, 0, 0, 0, -0.25f, 0.75f, 0.5f, -0.25f, 0.75f, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -17.875f, 10.135f).setRotationAngle(0, 0, 0)
		);
		groups.add(PaintingStuff);
	}

	private final void initGroup_FrameS2(){
		TurboList FrameS2 = new TurboList("FrameS2");
		FrameS2.add(new ModelRendererTurbo(FrameS2, 488, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-46.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 275, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0)
			.setRotationPoint(-47.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 409, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0)
			.setRotationPoint(-48.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 317, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-51.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 427, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(6, 2.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 0, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0.625f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0, 0.625f, 0)
			.setRotationPoint(17, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 143, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-36, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 393, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-36, 1.5f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 377, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-36, 1.875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 229, 134, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 1, 1, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 3.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 175, 134, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 3.25f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 451, 151, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(5, 3.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 308, 164, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(5, 3.25f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 159, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(16, 1.5f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 275, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -1, 0)
			.setRotationPoint(16, 1.875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 259, 132, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 1, 1, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(16, 3.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 229, 131, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 1, 1, 0, -0.5f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16, 3.25f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 299, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-39, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 172, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-38, 5, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 428, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-37, 5.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 506, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, -0.75f, 0)
			.setRotationPoint(-37, 6.5f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 90, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-36, 5.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 463, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-34.5f, 8.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 437, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(-34.5f, 8, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 283, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-34, 7.6875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 300, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(-34.5625f, 7.1875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 261, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.875f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.875f, 0, 0, -0.125f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.125f, -0.5625f, 0)
			.setRotationPoint(-34.5625f, 6.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 290, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-39, 4.25f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 206, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-23.5f, 8.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 183, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(-23.5f, 8, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 348, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-23, 7.6875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 463, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(-23.5625f, 7.1875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 437, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(-23.5625f, 6.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 206, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-12.5f, 8.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 259, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(-12.5f, 8, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 283, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-12, 7.6875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 183, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(-12.5625f, 7.1875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 463, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(-12.5625f, 6.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 437, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(9.5f, 8.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 229, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(9.5f, 8, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 285, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(10, 7.6875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 135, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(9.4375f, 7.1875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 383, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(9.4375f, 6.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 368, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-1.5f, 8.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 413, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(-1.5f, 8, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 145, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-1, 7.6875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 235, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.5625f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.5625f, -0.5f, 0)
			.setRotationPoint(-1.5625f, 7.1875f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 391, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.125f, 0, 0, -0.375f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.5625f, 0)
			.setRotationPoint(-1.5625f, 6.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 440, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.8125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.8125f, -0.6875f, 0)
			.setRotationPoint(-28.25f, 6.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 251, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.3125f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.3125f, 0, 0, -0.6875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(-27.75f, 7.0625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 427, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.1875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.1875f, 0, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-27.25f, 7.5f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 429, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.8125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.8125f, -0.6875f, 0)
			.setRotationPoint(-17.25f, 6.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 233, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.3125f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.3125f, 0, 0, -0.6875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(-16.75f, 7.0625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 172, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.1875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.1875f, 0, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-16.25f, 7.5f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 224, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(-33, 7.4375f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 215, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0)
			.setRotationPoint(-33, 7.25f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 206, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0)
			.setRotationPoint(-33, 7, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 197, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0)
			.setRotationPoint(-33, 5, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 153, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-33, 3.75f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 144, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-33, 4, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 135, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(-22, 7.4375f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 126, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0)
			.setRotationPoint(-22, 7.25f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 72, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0)
			.setRotationPoint(-22, 7, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 45, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0)
			.setRotationPoint(-22, 5, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 36, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-22, 3.75f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 27, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-22, 4, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 500, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(-11, 7.4375f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 425, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0)
			.setRotationPoint(-11, 7.25f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 281, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0)
			.setRotationPoint(-11, 7, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 272, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0)
			.setRotationPoint(-11, 5, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 263, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-11, 3.75f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 188, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-11, 4, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 163, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(0, 7.4375f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 117, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0)
			.setRotationPoint(0, 7.25f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 63, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0)
			.setRotationPoint(0, 7, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 18, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0)
			.setRotationPoint(0, 5, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 491, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(0, 3.75f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 446, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(0, 4, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 377, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(11, 7.4375f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 368, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, -0.25f, -0.25f, -0.8125f, 0, -0.25f, -0.8125f, 0)
			.setRotationPoint(11, 7.25f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 359, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0)
			.setRotationPoint(11, 7, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 350, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0)
			.setRotationPoint(11, 5, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 341, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, -0.25f, -0.4375f, -0.8125f, 0, -0.4375f, -0.8125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(11, 3.75f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 332, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(11, 4, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 326, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, 3.5625f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 326, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.5f, 3.5625f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 282, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.5f, 3.5625f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 282, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.5f, 3.5625f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 192, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 3.5625f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 229, 150, textureX, textureY)
			.addShapeBox(-4, -4, 0, 4, 1, 1, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.8125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.8125f, -0.6875f, 0)
			.setRotationPoint(-2.25f, 10.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 243, 162, textureX, textureY)
			.addShapeBox(-4, -4, 0, 3, 1, 1, 0, -0.3125f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.3125f, 0, 0, -0.6875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(-1.75f, 11.0625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 175, 123, textureX, textureY)
			.addShapeBox(-4, -4, 0, 2, 1, 1, 0, -0.1875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.1875f, 0, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(-1.25f, 11.5f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 364, 149, textureX, textureY)
			.addShapeBox(-4, -4, 0, 4, 1, 1, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.8125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.3125f, -0.6875f, 0, -0.8125f, -0.6875f, 0)
			.setRotationPoint(8.75f, 10.75f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 179, 162, textureX, textureY)
			.addShapeBox(-4, -4, 0, 3, 1, 1, 0, -0.3125f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, -0.3125f, 0, 0, -0.6875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f, 0, -0.6875f, -0.5625f, 0)
			.setRotationPoint(9.25f, 11.0625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 282, 120, textureX, textureY)
			.addShapeBox(-4, -4, 0, 2, 1, 1, 0, -0.1875f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.1875f, 0, 0, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.875f, 0)
			.setRotationPoint(9.75f, 11.5f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 108, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-33, 3, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 99, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-33, 1.1875f, -8.625f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 90, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(-33, 2.0625f, -8.875f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 81, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-22, 3, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 54, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-22, 1.1875f, -8.625f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 9, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(-22, 2.0625f, -8.875f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 35, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-11, 3, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 482, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(-11, 1.1875f, -8.625f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 473, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(-11, 2.0625f, -8.875f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 464, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(0, 3, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 455, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(0, 1.1875f, -8.625f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 437, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(0, 2.0625f, -8.875f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 417, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(11, 3, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 408, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(11, 1.1875f, -8.625f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 399, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f)
			.setRotationPoint(11, 2.0625f, -8.875f).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 390, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0)
			.setRotationPoint(-33, 5.3125f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 323, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0)
			.setRotationPoint(-22, 5.3125f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 314, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0)
			.setRotationPoint(-11, 5.3125f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 305, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0)
			.setRotationPoint(0, 5.3125f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 296, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0)
			.setRotationPoint(11, 5.3125f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 255, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(-33, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 234, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(-22, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 225, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(-11, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 216, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(0, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 207, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, -0.25f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, 0, 0.1875f, 0, 0)
			.setRotationPoint(11, 5.6875f, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 198, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-33, 6, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 155, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-22, 6, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 146, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-11, 6, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 137, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(0, 6, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 128, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, -0.25f, 0.1875f, -0.6875f, 0, 0.1875f, -0.6875f, 0, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(11, 6, -9).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 175, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(19, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 159, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(19.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 135, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.8125f, 0, -0.5f, -0.8125f, 0, 0, -0.25f, 0)
			.setRotationPoint(20, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 250, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0.1875f, 0)
			.setRotationPoint(20.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 124, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.0625f, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, 0, 0, -0.0625f, 0)
			.setRotationPoint(21, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 446, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.4375f, 0, -0.5f, -0.4375f, 0, -0.5f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(22.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 124, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.4375f, 0, -0.5f, 0.0625f, 0, -0.5f, 0.0625f, 0, 0, -0.4375f, 0)
			.setRotationPoint(47, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 193, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.0625f, 0, 0.25f, 1.25f, 0, 0.25f, 1.25f, 0, 0, 0.0625f, 0)
			.setRotationPoint(48.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 111, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, -0.75f, 0)
			.setRotationPoint(49.75f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 159, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.375f, 0)
			.setRotationPoint(50.5f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 485, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(51, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 353, 149, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(5, 1, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 72, 161, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(5, 1.375f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 292, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-5, 2.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 342, 149, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-6, 3.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 45, 161, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-6, 3.25f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 148, 148, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-6, 1, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 36, 161, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(-6, 1.375f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 269, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-16, 2.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 266, 146, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-17, 3.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 27, 161, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17, 3.25f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 206, 146, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-17, 1, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 502, 160, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(-17, 1.375f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 269, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-27, 2.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 159, 146, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-28, 3.625f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 428, 160, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-28, 3.25f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 148, 145, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 4, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-28, 1, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 287, 160, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0)
			.setRotationPoint(-28, 1.375f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 127, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, 0.25f, 0)
			.setRotationPoint(17.875f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		FrameS2.add(new ModelRendererTurbo(FrameS2, 507, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.625f, -1, 0, -0.625f, -1, 0, 0, -0.375f, 0)
			.setRotationPoint(18.625f, 1.125f, -8).setRotationAngle(0, 0, 0)
		);
		groups.add(FrameS2);
	}

	ModelNYCPT2TenderBogie bogie = new ModelNYCPT2TenderBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		int cargo = ((EntityNYCPT2Tender) entity).getAmmountOfCargo();
		for (FVTMFormatBase.TurboList l : groups) {
			GL11.glPushMatrix();
			if (l.name.equals("Coal")) {
				GL11.glTranslatef(0,1- ((float) cargo / ((EntityNYCPT2Tender)entity).freightInventorySize),0);
			}
			else if (l.name.equals("CoalOverflow") && cargo < 4) {
				GL11.glPopMatrix();
				continue;
			}
			for (tmt.ModelRendererTurbo t : l) {
				t.render(f5);
			}
			GL11.glPopMatrix();
		}

		GL11.glPushMatrix();
		GL11.glTranslatef(2.09375f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
