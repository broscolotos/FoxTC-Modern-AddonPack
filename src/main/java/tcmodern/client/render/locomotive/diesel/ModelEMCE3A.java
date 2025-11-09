//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.diesel;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.DetailRegistry;
import tcmodern.client.render.locomotive.bogies.Model3aBlomberg;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelEMCE3A extends FVTMFormatBase {

	public ModelEMCE3A(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("Riggs64");
		//
		initGroup_group0();
		initGroup_clipboard();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 143, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-66.45f, 1, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 82, textureX, textureY).addBox(0, 0, 0, 12, 15, 1)
			.setRotationPoint(-66.45f, -14, -11).setRotationAngle(0, 0, 0).setName("Box 459")
		);
		group0.add(new ModelRendererTurbo(group0, 115, 126, textureX, textureY).addBox(0, 0, 0, 2, 19, 1)
			.setRotationPoint(-54.449997f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 283")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -3, 0, 0, 2, 0, 0, 2, 0, 0, -3, 0, 0, -1, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, -1, -0.3f, 0)
			.setRotationPoint(-61.449997f, -20, -0.5f).setRotationAngle(0, 0, 0).setName("Box 302")
		);
		group0.add(new ModelRendererTurbo(group0, 55, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -2, -1.5f, 1, 1.5f, -1.5f, 1, 2, 0, 0, -2, 0, 0, -2, 1, 0, 1.5f, 1, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(74.55f, -22, -7).setRotationAngle(0, 0, 0).setName("Box 333")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 105, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
			.setRotationPoint(76.55f, -22, -3).setRotationAngle(0, 0, 0).setName("Box 334")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 105, textureX, textureY).addBox(0, 0, 0, 1, 15, 20)
			.setRotationPoint(-61.449997f, -14, -10).setRotationAngle(0, 0, 0).setName("Box 337")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.5f, -3, -0.5f, 0.5f, -3, -0.5f, -1, 3, 0, -1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, -20, -11).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -2, 0, 0, 2, 0, 0, 1.5f, -1.5f, 1, -2, -1.5f, 1, -2, 0, 0, 2, 0, 0, 1.5f, 1, 0, -2, 1, 0)
			.setRotationPoint(74.55f, -22, 3).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 3, -0.5f, -1, 3, -0.5f, 0.5f, -3, 0, 0.5f, -3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, -20, 10).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 11, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.449997f, -15, -11).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 136, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-48.449997f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 65, textureX, textureY).addBox(0, 0, 0, 125, 15, 1)
			.setRotationPoint(-48.449997f, -14, -11).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 82, textureX, textureY).addBox(0, 0, 0, 12, 15, 1)
			.setRotationPoint(-66.45f, -14, 10).setRotationAngle(0, 0, 0).setName("Box 185")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 126, textureX, textureY).addBox(0, 0, 0, 2, 19, 1)
			.setRotationPoint(-54.449997f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		group0.add(new ModelRendererTurbo(group0, 381, 108, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(75.55f, -18, -10).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 106, textureX, textureY).addBox(0, -2, 0, 1, 18, 8)
			.setRotationPoint(75.55f, -15, -4).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.55f, -20, -10).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 108, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(75.55f, -18, 4).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.55f, -20, 4).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 105, textureX, textureY).addBox(0, -2, 0, 1, 18, 8)
			.setRotationPoint(-48.449997f, -15, -4).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 108, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(-48.449997f, -18, -10).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 106, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(-48.449997f, -18, 4).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.449997f, -20, 4).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.449997f, -20, -10).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(76.05f, 2.8999996f, -5.75f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(76.05f, 2.8999996f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(76.05f, 2.8999996f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(76.05f, 2.8999996f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, 6.5f, -11).setRotationAngle(0, 0, 0).setName("Box 261")
		);
		group0.add(new ModelRendererTurbo(group0, 406, 85, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(75.55f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(76.05f, 2.8999996f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 269")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(76.05f, 2.8999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 270")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-52.949997f, -16.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 286")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-52.949997f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 287")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-52.949997f, -17, -11.6f).setRotationAngle(0, 0, 0).setName("Box 288")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-48.449997f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 289")
		);
		group0.add(new ModelRendererTurbo(group0, 490, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-48.449997f, -17, -11.6f).setRotationAngle(0, 0, 0).setName("Box 290")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-48.449997f, -16.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 291")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(18.549995f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 292")
		);
		group0.add(new ModelRendererTurbo(group0, 466, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(18.549995f, -13, -11.6f).setRotationAngle(0, 0, 0).setName("Box 293")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(18.549995f, -12.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 294")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(14.049995f, -13, -11.6f).setRotationAngle(0, 0, 0).setName("Box 295")
		);
		group0.add(new ModelRendererTurbo(group0, 420, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(14.049995f, -12.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 296")
		);
		group0.add(new ModelRendererTurbo(group0, 336, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(14.049995f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 297")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(18.549995f, -12.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 298")
		);
		group0.add(new ModelRendererTurbo(group0, 296, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(18.549995f, -13, 10.6f).setRotationAngle(0, 0, 0).setName("Box 299")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(18.549995f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 300")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(14.049995f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.049995f, -12.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 302")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(14.049995f, -13, 10.6f).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		group0.add(new ModelRendererTurbo(group0, 461, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.449997f, -17, 10.6f).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-48.449997f, -16.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.449997f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 306")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.949997f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 307")
		);
		group0.add(new ModelRendererTurbo(group0, 382, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-52.949997f, -16.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.949997f, -17, 10.6f).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, -16, 3.5f).setRotationAngle(0, 0, 0).setName("Box 358")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 103, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(76.55f, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 359")
		);
		group0.add(new ModelRendererTurbo(group0, 367, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, -16, -4.5f).setRotationAngle(0, 0, 0).setName("Box 360")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(76.55f, -17, -4.5f).setRotationAngle(0, 0, 0).setName("Box 361")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, -17, 0.5f).setRotationAngle(0, 0, 0).setName("Box 362")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 102, textureX, textureY).addBox(0, -2, 0, 1, 3, 8)
			.setRotationPoint(75.55f, -18, -4).setRotationAngle(0, 0, 0).setName("Box 363")
		);
		group0.add(new ModelRendererTurbo(group0, 362, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, -17, -8.6f).setRotationAngle(0, 0, 0).setName("Box 364")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, -17, 7.7f).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		group0.add(new ModelRendererTurbo(group0, 352, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(76.05f, -9, 2.15f).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 120, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 1, -0.5f, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(77.05f, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 504")
		);
		group0.add(new ModelRendererTurbo(group0, 326, 134, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.55f, 3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 134, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(78.55f, 5.5f, 0.5999999f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 343, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.05f, 2, -1).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.05f, 1, -0.75f).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		group0.add(new ModelRendererTurbo(group0, 480, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(78.05f, 1, -7).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -2.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -2.5f, 0, 0)
			.setRotationPoint(76.05f, 0, 6).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 270, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -2.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -2.5f, 0, 0)
			.setRotationPoint(76.05f, 0, -7.5f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, 0.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.949997f, -21.5f, -7.8f).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		group0.add(new ModelRendererTurbo(group0, 251, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.949997f, -22.5f, -3.6f).setRotationAngle(0, 0, 0).setName("Box 389")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.949997f, -22.5f, 2.6000004f).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.949997f, -21.5f, 6.8f).setRotationAngle(0, 0, 0).setName("Box 391")
		);
		group0.add(new ModelRendererTurbo(group0, 92, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.4f, -0.5f, -1, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.949997f, -23, 2.6000004f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.949997f, -22, 6.8f).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		group0.add(new ModelRendererTurbo(group0, 483, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 1, 0, 0, 1, 0)
			.setRotationPoint(-55.949997f, -23, 3.1999998f).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.4f, 0, -1, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.949997f, -23, -3.6f).setRotationAngle(0, 0, 0).setName("Box 398")
		);
		group0.add(new ModelRendererTurbo(group0, 416, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.949997f, -22, -7.8f).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 1, 0, -0.5f, 1, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.949997f, -23, -7.2f).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		group0.add(new ModelRendererTurbo(group0, 411, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-48.199997f, -23.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		group0.add(new ModelRendererTurbo(group0, 406, 133, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-46.450005f, -22.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 88, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-47.200005f, -23.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 133, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-46.450005f, -22.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 367")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 87, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-47.200005f, -23.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 368")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-48.199997f, -23.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 369")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(47.549995f, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(47.549995f, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(49.550003f, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(49.550003f, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 419, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47.450005f, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-49.449997f, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		group0.add(new ModelRendererTurbo(group0, 359, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60.449997f, -15, 10).setRotationAngle(0, 0, 0).setName("Box 409")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 65, textureX, textureY).addBox(0, 0, 0, 125, 15, 1)
			.setRotationPoint(-48.449997f, -14, 10).setRotationAngle(0, 0, 0).setName("Box 430")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 142, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-66.45f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-22.980003f, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 438")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.980003f, 2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 82, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(75.55f, 1.5f, 2).setRotationAngle(0, 0, 0).setName("Box 441")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.55f, 6.5f, 2).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.980003f, 2.5f, 10).setRotationAngle(0, 0, 0).setName("Box 443")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-22.980003f, 3.5f, 10).setRotationAngle(0, 0, 0).setName("Box 444")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-47.450005f, -14.299999f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 420")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-47.450005f, -17.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 421")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(73.55f, -6.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 487")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(73.55f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(71.05f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 489")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(71.05f, -6.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(71.05f, -7, -11.6f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(73.55f, -7, -11.6f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(-47.450005f, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 320, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(-49.449997f, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 22, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(73.55f, -6.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(73.55f, -7, 10.6f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(73.55f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.05f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.05f, -6.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		group0.add(new ModelRendererTurbo(group0, 427, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.05f, -7, 10.6f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		group0.add(new ModelRendererTurbo(group0, 22, 126, textureX, textureY).addBox(0, 0, 0, 4, 5, 1)
			.setRotationPoint(-52.449997f, -4, -11).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 114, textureX, textureY).addBox(0, 0, 0, 4, 5, 1)
			.setRotationPoint(-52.449997f, -4, 10).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 126, textureX, textureY).addBox(0, 0, 0, 4, 11, 1)
			.setRotationPoint(-52.449997f, -15, 9.9f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 142, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-66.45f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 398, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60.449997f, -15, -11).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 114, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(-19.450005f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 065")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 112, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(-9.950005f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		group0.add(new ModelRendererTurbo(group0, 403, 108, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(-5.9500046f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 104, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.450005f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 104, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.950005f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 102, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.9500046f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 422, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.05f, 1, 0.5f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 116, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(75.05f, 1, -1).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 396, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-49.449997f, 1.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-51.449997f, 2.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-51.449997f, 3.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-51.449997f, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-51.949997f, 1.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(17.549995f, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(15.049995f, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 323, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(15.549995f, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 316, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(73.55f, 1.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(71.05f, 1.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 316, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(71.55f, 2.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(71.55f, 3.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(71.55f, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-51.949997f, 1.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		group0.add(new ModelRendererTurbo(group0, 284, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.449997f, 2.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		group0.add(new ModelRendererTurbo(group0, 301, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-49.449997f, 1.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		group0.add(new ModelRendererTurbo(group0, 234, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.449997f, 3.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.449997f, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.549995f, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 296, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(15.049995f, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(17.549995f, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 324, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71.55f, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71.55f, 3.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(71.05f, 1.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(73.55f, 1.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71.55f, 2.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 359, 48, textureX, textureY).addBox(0, 0, 0, 9, 4, 6)
			.setRotationPoint(-21.950005f, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-21.950005f, 5.5f, -9).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(-21.950005f, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 532")
		);
		group0.add(new ModelRendererTurbo(group0, 164, 82, textureX, textureY).addBox(0, 0, 0, 20, 4, 18)
			.setRotationPoint(4.0499954f, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(4.0499954f, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(4.0499954f, 5.5f, -9).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 105, textureX, textureY).addBox(0, 0, 0, 1, 4, 16)
			.setRotationPoint(3.0499954f, 1.5f, -8).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.449997f, -3, -11.4f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.449997f, -1.5f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.449997f, 0, -11.4f).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-51.449997f, 0, 10.4f).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-51.449997f, -1.5f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 541")
		);
		group0.add(new ModelRendererTurbo(group0, 412, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-51.449997f, -3, 10.4f).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.549995f, 0, -11.4f).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(15.549995f, 0, 10.4f).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 82, textureX, textureY).addBox(0, 0, 0, 12, 5, 20)
			.setRotationPoint(-60.449997f, -4, -10).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 105, textureX, textureY).addBox(0, 0, 0, 3, 9, 4)
			.setRotationPoint(-59.449997f, -13, -2).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 4, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(-56.449997f, -13, -2).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 4, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-60.449997f, -13, -2).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 104, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(-58.949997f, -15, -1).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-56.949997f, -15, -1).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-59.949997f, -15, -1).setRotationAngle(0, 0, 0).setName("Box 644")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 115, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-58.949997f, -17, -1).setRotationAngle(0, -39, 0).setName("Box 645")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 126, textureX, textureY).addBox(0, 0, 0, 1, 5, 2)
			.setRotationPoint(-58.949997f, -9, 5).setRotationAngle(0, 0, 0).setName("Box 646")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-59.949997f, -9, 5).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-57.949997f, -9, 5).setRotationAngle(0, 0, 0).setName("Box 648")
		);
		group0.add(new ModelRendererTurbo(group0, 80, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-58.949997f, -11, 7).setRotationAngle(0, 0, 0).setName("Box 649")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 126, textureX, textureY).addBox(0, 0, 0, 1, 7, 2)
			.setRotationPoint(-59.949997f, -11, 7).setRotationAngle(0, 0, 0).setName("Box 650")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-60.949997f, -11, 7).setRotationAngle(0, 0, 0).setName("Box 651")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-58.699997f, -15, 1).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		group0.add(new ModelRendererTurbo(group0, 460, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-58.699997f, -12, 1.8000002f).setRotationAngle(0, 22, 0).setName("Box 653")
		);
		group0.add(new ModelRendererTurbo(group0, 447, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-58.949997f, -12, 6).setRotationAngle(0, -34, 0).setName("Box 654")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 132, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-59.949997f, -12, 7.5f).setRotationAngle(0, 0, 0).setName("Box 655")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 132, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-58.949997f, -10, 5.5f).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-58.449997f, -10, 4).setRotationAngle(0, -16, 0).setName("Box 657")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 112, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-61.15001f, -14, 6.5f).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 112, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-61.15001f, -14, 4).setRotationAngle(0, 0, 0).setName("Box 659")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 104, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-61.15001f, -11.5f, 3).setRotationAngle(0, 0, 0).setName("Box 661")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 93, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-61.15001f, -15.5f, 3).setRotationAngle(0, 0, 0).setName("Box 662")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-55.949997f, -14.75f, 0.6500001f).setRotationAngle(0, 0, -90).setName("Box 663")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f)
			.setRotationPoint(-56.050003f, -15.5f, 0.5500002f).setRotationAngle(0, 0, -90).setName("Box 664")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0.8f, 0, 0, 0.8f, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -1.6f, 0, 0, -1.6f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-55.949997f, -18.75f, 0.6500001f).setRotationAngle(0, 0, -90).setName("Box 665")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.8f, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0.8f, -0.8f, 0, -1.6f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -1.6f, -0.8f)
			.setRotationPoint(-55.949997f, -12.75f, 0.6500001f).setRotationAngle(0, 0, -90).setName("Box 666")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.850006f, -9.5f, 6.6499996f).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.850006f, -10.5f, 5.6499996f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-50.979996f, -14.25f, 10.65f).setRotationAngle(0, 180, -13).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-54.850006f, -9.5f, -9.95f).setRotationAngle(0, 0, 0).setName("Box 2014")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.850006f, -10.5f, -9.95f).setRotationAngle(0, 0, 0).setName("Box 2015")
		);
		group0.add(new ModelRendererTurbo(group0, 58, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-50.979996f, -14.25f, -4.95f).setRotationAngle(0, 180, -13).setName("Box 2016")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.850006f, -12.5f, 4.6499996f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 336, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.850006f, -12.5f, -4.95f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-49.449997f, -11.5f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(17.549995f, -8.5f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-49.449997f, -11.5f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 675")
		);
		group0.add(new ModelRendererTurbo(group0, 466, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.549995f, -8.5f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		group0.add(new ModelRendererTurbo(group0, 461, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.549995f, 1.25f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(11.549995f, 2.25f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(10.549995f, 2.25f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.549995f, 1.25f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 131, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(75.8f, -12.5f, 0).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		group0.add(new ModelRendererTurbo(group0, 156, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.8f, -12.5f, -2).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.8f, -14.5f, -2).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.8f, -14.5f, 0).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.549995f, 1.25f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.549995f, 1.25f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 270, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(11.549995f, 2.25f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(10.549995f, 2.25f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 270, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-47.450005f, -15.5f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-47.450005f, -16.7f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 256, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-47.450005f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 251, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-47.450005f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-47.450005f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-47.450005f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(60.199997f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(60.199997f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(60.199997f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 411, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-47.450005f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 301, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-47.450005f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 578")
		);
		group0.add(new ModelRendererTurbo(group0, 296, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-47.450005f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-47.450005f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-47.450005f, -17.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-47.450005f, -16.7f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 582")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-47.450005f, -15.5f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-47.450005f, -14.299999f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(60.199997f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(60.199997f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(60.199997f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 105, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(10.549995f, 1.25f, -11.1f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 102, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(10.549995f, 1.25f, 10.1f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(76.55f, 6.3999996f, 4.3500004f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(76.55f, 6.3999996f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(76.55f, 6.3999996f, 5.3500004f).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		group0.add(new ModelRendererTurbo(group0, 466, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(76.55f, 6.3999996f, -6.65f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		group0.add(new ModelRendererTurbo(group0, 461, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(76.55f, 6.3999996f, -5.65f).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(76.55f, 6.3999996f, -7.6499996f).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(76.55f, -11, -10).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(76.55f, -9, -10).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		group0.add(new ModelRendererTurbo(group0, 316, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(76.55f, -7, -10).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(76.55f, -11, 5).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(76.55f, -9, 5).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		group0.add(new ModelRendererTurbo(group0, 324, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(76.55f, -7, 5).setRotationAngle(0, 0, 0).setName("Box 627")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.3f, -12.5f, -2).setRotationAngle(0, 0, 0).setName("Box 1281")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(75.3f, -12.5f, 0).setRotationAngle(0, 0, 0).setName("Box 1282")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.3f, -14.5f, 0).setRotationAngle(0, 0, 0).setName("Box 1283")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.3f, -14.5f, -2).setRotationAngle(0, 0, 0).setName("Box 1284")
		);
		group0.add(new ModelRendererTurbo(group0, 288, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(74.55f, -17, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1285")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(74.55f, -17, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1286")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(74.55f, -16, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1287")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(75.05f, -9, 2.15f).setRotationAngle(0, 0, 0).setName("Box 1288")
		);
		group0.add(new ModelRendererTurbo(group0, 286, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(74.55f, -16, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1289")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 102, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(74.55f, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1290")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 100, textureX, textureY).addBox(0, -2, 0, 1, 3, 8)
			.setRotationPoint(-48.449997f, -18, -4).setRotationAngle(0, 0, 0).setName("Box 677")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 6, textureX, textureY).addBox(0, 0, 0, 9, 4, 6)
			.setRotationPoint(-21.950005f, 1.5f, 3).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 267, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-21.950005f, 4, -3).setRotationAngle(0, 0, 0).setName("Box 1491")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 56, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-21.950005f, 3, -3).setRotationAngle(0, 0, 0).setName("Box 1492")
		);
		group0.add(new ModelRendererTurbo(group0, 412, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.950005f, 2, -3).setRotationAngle(0, 0, 0).setName("Box 1493")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 56, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-21.950005f, 3, 0).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.950005f, 2, 0).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-21.950005f, 4, 0).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 114, textureX, textureY).addBox(0.4f, 0, -0.45f, 1, 2, 4)
			.setRotationPoint(-71.65001f, -11, -9).setRotationAngle(0, -37, 0).setName("Box 381")
		);
		group0.add(new ModelRendererTurbo(group0, 216, 114, textureX, textureY).addBox(0.45f, 0, 0, 1, 2, 4)
			.setRotationPoint(-73.65001f, -11, 6.1000004f).setRotationAngle(0, 37, 0).setName("Box 382")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.40001f, -13, -9.6f).setRotationAngle(0, 0, 0).setName("Box 290")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 114, textureX, textureY)
			.addShapeBox(-0.5f, 0, 1.85f, 1, 1, 4, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-77.95f, -3, 3.8000002f).setRotationAngle(0, 44, 0).setName("Box 465")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 128, textureX, textureY)
			.addShapeBox(0, 0, 1.85f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-77.95f, -3, 3.8000002f).setRotationAngle(0, 44, 0).setName("Box 466")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 128, textureX, textureY)
			.addShapeBox(0, 0, 5.35f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-77.95f, -3, 3.8000002f).setRotationAngle(0, 44, 0).setName("Box 467")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 97, textureX, textureY)
			.addShapeBox(-0.5f, 0, -1.45f, 1, 1, 4, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-74.95f, -3, -7).setRotationAngle(0, -42, 0).setName("Box 444")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 128, textureX, textureY)
			.addShapeBox(0, 0, -1.45f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-74.95f, -3, -7).setRotationAngle(0, -42, 0).setName("Box 445")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 128, textureX, textureY)
			.addShapeBox(0, 0, 2.05f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-74.95f, -3, -7).setRotationAngle(0, -42, 0).setName("Box 446")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-80.05f, 2, -1).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		group0.add(new ModelRendererTurbo(group0, 261, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.95f, 3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 256, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-78.95f, 5.5f, 0.5999999f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 251, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.95f, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.40001f, -13, 8.4f).setRotationAngle(0, 0, 0).setName("Box 446")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.95f, -14.99f, -2).setRotationAngle(0, 0, 0).setName("Box 273")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.95f, -16.99f, -2).setRotationAngle(0, 0, 0).setName("Box 274")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.95f, -16.99f, 0).setRotationAngle(0, 0, 0).setName("Box 275")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-73.95f, -14.99f, 0).setRotationAngle(0, 0, 0).setName("Box 276")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-75.55f, -12, -2).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-75.55f, -10, -2).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-75.55f, -10, 0).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-75.55f, -12, 0).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.95f, 1.5f, -7).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-65.95f, 1.5f, -10).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 126, textureX, textureY)
			.addShapeBox(0, 0.01f, 0.15f, 1, 6, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-75.91f, -8.58f, -2.65f).setRotationAngle(-17.9f, 90, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 502, 98, textureX, textureY)
			.addShapeBox(0, 0.01f, 0.32f, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-75.45f, -8.950001f, -2.65f).setRotationAngle(-18, 90, 0).setName("Box 531")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 98, textureX, textureY)
			.addShapeBox(0, 5.5f, 0.32f, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-75.44f, -8.950001f, -2.65f).setRotationAngle(-18, 90, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 322, 126, textureX, textureY)
			.addShapeBox(0, 0.01f, 0.15f, 1, 6, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-75.91f, -8.58f, 3.1499996f).setRotationAngle(-17.9f, 90, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 98, textureX, textureY)
			.addShapeBox(0, 5.5f, 0.32f, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-75.44f, -8.950001f, 3.1499996f).setRotationAngle(-18, 90, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 98, textureX, textureY)
			.addShapeBox(0, 0.01f, 0.32f, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-75.45f, -8.950001f, 3.1499996f).setRotationAngle(-18, 90, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 144, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 15, 1, 0, 0, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 2, 4, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 2)
			.setRotationPoint(-69.45f, -14, -11).setRotationAngle(0, 0, 0).setName("Box 657")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 15, 1, 0, 0, 0, -4, -2, 0, 0, -2, 0, 0, 0, 0, 4, 5, 0, -4, -6, 0, 0, -2, 0, 0, 0, 0, 4)
			.setRotationPoint(-72.45f, -14, -9).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 15, 1, 0, -1, 0, -5, -3, 0, 0, -3, 0, 0, -2, 0, 4, 4, 0, -5, -8, 0, 0, -3, 0, 0, -2, 0, 4)
			.setRotationPoint(-74.45f, -14, -5).setRotationAngle(0, 0, 0).setName("Box 659")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 15, 1, 0, -2, 0, 4, -3, 0, 0, -3, 0, 0, -1, 0, -5, -2, 0, 4, -3, 0, 0, -8, 0, 0, 4, 0, -5)
			.setRotationPoint(-74.45f, -14, 4).setRotationAngle(0, 0, 0).setName("Box 660")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 15, 1, 0, 0, 0, 4, -2, 0, 0, -2, 0, 0, 0, 0, -4, 0, 0, 4, -2, 0, 0, -6, 0, 0, 5, 0, -4)
			.setRotationPoint(-72.45f, -14, 8).setRotationAngle(0, 0, 0).setName("Box 661")
		);
		group0.add(new ModelRendererTurbo(group0, 240, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 15, 1, 0, 0, 0, 2, -1, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 2, -1, 0, 0, -1, 0, 0, 4, 0, -2)
			.setRotationPoint(-69.45f, -14, 10).setRotationAngle(0, 0, 0).setName("Box 662")
		);
		group0.add(new ModelRendererTurbo(group0, 412, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 22, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -2)
			.setRotationPoint(-73.45f, 1, -11).setRotationAngle(0, 0, 0).setName("Box 694")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 4, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -2, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-73.45f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 695")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 6, 1, 0, 0, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 2, 2, 0, -2, -1, -6, 0, -1, -6, 0, 1, 0, 2)
			.setRotationPoint(-72.95f, 2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 696")
		);
		group0.add(new ModelRendererTurbo(group0, 418, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, -4, -2, 0, 0, -2, 0, 0, 0, 0, 4, 2, 0, -4, -4, 0, 0, -3, 0, 0, 1, 0, 4)
			.setRotationPoint(-76.95f, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 697")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 18, 0, 0, 0, -4, 1, 0, 0, 1, 0, 0, 0, 0, -4, -0.5f, 0, -4, 1.5f, 0, 0, 1.5f, 0, 0, -0.5f, 0, -4)
			.setRotationPoint(-77.45f, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 699")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, -1, 0, -5, -3, 0, 0, -3, 0, 0, -2, 0, 4, 1, 0, -5, -5, 0, 0, -4, 0, 0, -0.5f, 0, 4)
			.setRotationPoint(-78.95f, 2.5f, -5).setRotationAngle(0, 0, 0).setName("Box 702")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, -2, 0, 4, -3, 0, 0, -3, 0, 0, -1, 0, -5, -0.5f, 0, 4, -4, 0, 0, -5, 0, 0, 1, 0, -5)
			.setRotationPoint(-78.95f, 2.5f, 4).setRotationAngle(0, 0, 0).setName("Box 703")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 4, -2, 0, 0, -2, 0, 0, 0, 0, -4, 1, 0, 4, -3, 0, 0, -4, 0, 0, 2, 0, -4)
			.setRotationPoint(-76.95f, 2.5f, 8).setRotationAngle(0, 0, 0).setName("Box 704")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, -2)
			.setRotationPoint(-73.45f, 1.5f, 7).setRotationAngle(0, 0, 0).setName("Box 705")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 6, 1, 0, 0, 0, 2, -1, 0, 0, -1, 0, 0, 0, 0, -2, 1, 0, 2, -1, -6, 0, -1, -6, 0, 2, 0, -2)
			.setRotationPoint(-72.95f, 2.5f, 10).setRotationAngle(0, 0, 0).setName("Box 706")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 82, textureX, textureY).addBox(0, 0, 0, 16, 4, 18)
			.setRotationPoint(-12.950005f, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 546")
		);
		group0.add(new ModelRendererTurbo(group0, 427, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.549995f, 1.5f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(15.549995f, 1.5f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		group0.add(new ModelRendererTurbo(group0, 411, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.549995f, 3, -11.4f).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(15.549995f, 3, 10.4f).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 102, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.450005f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 82, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(-15.450005f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 102, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.049995f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 82, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(39.049995f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 82, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(35.049995f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 102, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.049995f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 82, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(29.549995f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 90, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.549995f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 82, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(25.549995f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.549995f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 560")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 132, 4, 1, 0, 0, 0.5f, -3, 0, 0.5f, -3, 0, -1, 3, 0, -1, 3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-55.449997f, -20, -11).setRotationAngle(0, 0, 0).setName("Box 315")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 132, 2, 5, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.449997f, -22, -8).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 132, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.449997f, -22, -3).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		group0.add(new ModelRendererTurbo(group0, 317, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0)
			.setRotationPoint(-58.449997f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, -1, 0, 2, -1, 0, 2, -1, 0, 0, -1, 0)
			.setRotationPoint(-58.449997f, -22, -3).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -1, -1.5f, 1, 1, -1.5f, 1, 1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 1, -1, 0, 1, -1, 0)
			.setRotationPoint(-57.449997f, -22, -7).setRotationAngle(0, 0, 0).setName("Box 146")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 4, 0, -1, 0.5f, -3, 0, 0.5f, -3, 0, -1, 0, 1, -1, 0, 1, -1, 0, 0, -1, 0, 0, -1, -3, 1, -1, -3)
			.setRotationPoint(-57.449997f, -20, -11).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		group0.add(new ModelRendererTurbo(group0, 460, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -1, 0, 0, 1, 0, 0, 1, -1.5f, 1, -1, -1.5f, 1, 1, -1, 0, 1, -1, 0, 1, 0, 0, 1, 0, 0)
			.setRotationPoint(-57.449997f, -22, 3).setRotationAngle(0, 0, 0).setName("Box 148")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 132, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, -1)
			.setRotationPoint(-55.449997f, -22, 3).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 4, 0, 1, -1, 0, 0, -1, 0, 0, 0.5f, -3, -1, 0.5f, -3, 1, -1, -3, 0, -1, -3, 0, -1, 0, 1, -1, 0)
			.setRotationPoint(-57.449997f, -20, 7).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 132, 4, 1, 0, 0, -1, 3, 0, -1, 3, 0, 0.5f, -3, 0, 0.5f, -3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-55.449997f, -20, 10).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		group0.add(new ModelRendererTurbo(group0, 312, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0)
			.setRotationPoint(-58.449997f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 398, 12, textureX, textureY).addBox(0, 0, 0, 39, 4, 1)
			.setRotationPoint(-35.450005f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 48, textureX, textureY).addBox(0, 0, 0, 33, 4, 1)
			.setRotationPoint(15.549995f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 12, textureX, textureY).addBox(0, 0, 0, 16, 4, 1)
			.setRotationPoint(60.550003f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 307, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(15.199997f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		group0.add(new ModelRendererTurbo(group0, 302, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(15.199997f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(15.199997f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-35.800003f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-35.800003f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-35.800003f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(3.5499954f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(3.5499954f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(3.5499954f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(48.550003f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 560")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(48.550003f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(48.550003f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 562")
		);
		group0.add(new ModelRendererTurbo(group0, 398, 6, textureX, textureY).addBox(0, 0, 0, 39, 4, 1)
			.setRotationPoint(-35.450005f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 126, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-48.449997f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 564")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 18, textureX, textureY).addBox(0, 0, 0, 33, 4, 1)
			.setRotationPoint(15.549995f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 565")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 6, textureX, textureY).addBox(0, 0, 0, 16, 4, 1)
			.setRotationPoint(60.550003f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(3.5499954f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 567")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(3.5499954f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		group0.add(new ModelRendererTurbo(group0, 211, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(3.5499954f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		group0.add(new ModelRendererTurbo(group0, 206, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(48.550003f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 570")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(48.550003f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 571")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(48.550003f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 572")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(15.199997f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(15.199997f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(15.199997f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-35.800003f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 582")
		);
		group0.add(new ModelRendererTurbo(group0, 307, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-35.800003f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-35.800003f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(3.5499954f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 585")
		);
		group0.add(new ModelRendererTurbo(group0, 483, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(3.5499954f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 586")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(48.550003f, -18, 10).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		group0.add(new ModelRendererTurbo(group0, 483, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(48.550003f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		group0.add(new ModelRendererTurbo(group0, 300, 54, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(-47.450005f, -18, 10.93f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 54, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(3.5499954f, -18, 10.93f).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 51, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(48.550003f, -18, 10.93f).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 51, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(-47.450005f, -18, -10.93f).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 51, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(3.5499954f, -18, -10.93f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 48, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(48.550003f, -18, -10.93f).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 114, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(-14.450005f, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 114, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(-9.450005f, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 600")
		);
		group0.add(new ModelRendererTurbo(group0, 375, 108, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(36.549995f, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 108, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(31.549995f, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		group0.add(new ModelRendererTurbo(group0, 301, 105, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(57.550003f, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		group0.add(new ModelRendererTurbo(group0, 286, 105, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(31.549995f, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		group0.add(new ModelRendererTurbo(group0, 218, 105, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(36.549995f, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 203, 105, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(-14.450005f, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 102, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(-9.450005f, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 100, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(57.550003f, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 459, 60, textureX, textureY).addBox(0, 0, -1.5f, 5, 1, 3)
			.setRotationPoint(57.050003f, -22.5f, 0).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 59, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 5, 1, 3, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57.050003f, -23.5f, 0).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 316, 105, textureX, textureY).addBox(0, 0, -1.5f, 3, 1, 3)
			.setRotationPoint(64.05f, -22.5f, 0).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 18, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0)
			.setRotationPoint(-69.45f, -15, -9).setRotationAngle(0, 0, 0).setName("Box 263")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-61.449997f, -15, -11).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, -3, 0, -2, 0, -0.5f, -2, 0, -0.5f, -2, 0, 0, -2, 0)
			.setRotationPoint(-61.449997f, -16, -10).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -6, -0.5f, 0, -6, -0.5f, 0, 6, 0, 0, 6, 0, -5, 0, -0.5f, -5, 0, -0.5f, -5, 12, 0, -5, 12)
			.setRotationPoint(-61.449997f, -17, -7).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 2, 0, 0, 0, -6, 0, 0, -6, 0, 0, 6, 0, 0, 6, 0, -5, 0, 0, -5, 0, 0, -5, 12, 0, -5, 12)
			.setRotationPoint(-66.45f, -17, -7).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 20, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-66.45f, -16, -10).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 22, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.45f, -15, -11).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1, -0.5f, 0.3f, -1, -0.5f, 0.3f, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-60.949997f, -15, -11).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -6, -0.5f, 0.3f, -6, -0.5f, 0.3f, 6, 0, 0, 6, 0, -5, 0, -0.5f, -5.2f, 0, -0.5f, -5.3f, 12, 0, -5, 12)
			.setRotationPoint(-60.949997f, -17, -7).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -3, -0.5f, 0.2f, -3, -0.5f, 0.3f, -3, 0, 0, -3, 0, -2, 0, -0.5f, -2.3f, 0, -0.5f, -2.3f, 0, 0, -2, 0)
			.setRotationPoint(-60.949997f, -16, -10).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -1, 0, 0, -0.666f, 0, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.45f, -17, -5).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.45f, -17, -1).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 110, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, -0.95f, 0, 0, -0.83299994f, 0, 0, -0.666f, 0, 0, -0.7773f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.45f, -17, -7).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 51, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0, -0.67f, 0, 0, 0, 0, 0.167f, 0, 0, 0.05f, 0, 0, 0, -0.67f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.45f, -16, -8).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 51, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0, -0.33f, 0, 0.05f, 0, 0, 0.2227f, 0, 0, 0.1113f, 0, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-68.45f, -16, -7).setRotationAngle(0, 0, 0).setName("Box 564")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 51, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0, -1, 0, 0, -0.33f, 0, 0.1113f, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.45f, -16, -7).setRotationAngle(0, 0, 0).setName("Box 565")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -1.325f, 0, 0, -0.67f, 0, 0.05f, 0, 0, 0, 0.33f, 0, 0, -1.325f, 0, 0, -0.67f, 0, 0, 0, 0, 0, 0.33f)
			.setRotationPoint(-68.45f, -16, -7).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -0.2f, 0, 0, 0, 0, 0, -0.6667f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-69.45f, -17, 1).setRotationAngle(0, 0, 0).setName("Box 560")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 42, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0.1113f, 0, 0, 0, -0.33f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -1)
			.setRotationPoint(-69.45f, -16, 4).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 32, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0.1113f, 0, 0, 0.2227f, 0, 0, 0.05f, 0, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f)
			.setRotationPoint(-68.45f, -16, 4).setRotationAngle(0, 0, 0).setName("Box 562")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7773f, 0, 0, -0.6667f, 0, 0, -0.8333f, 0, 0, -0.95f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.45f, -17, 5).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 32, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0.05f, 0, 0, 0.1667f, 0, 0, 0, 0, 0, 0, -0.67f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.67f)
			.setRotationPoint(-67.45f, -16, 5).setRotationAngle(0, 0, 0).setName("Box 564")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0.33f, 0, 0.05f, 0, 0, 0, -0.67f, 0, 0, -1.325f, 0, 0, 0.33f, 0, 0, 0, 0, 0, -0.67f, 0, 0, -1.325f)
			.setRotationPoint(-68.45f, -16, 6).setRotationAngle(0, 0, 0).setName("Box 565")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.45f, -17, 0).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.6f, 0, -0.8f, 0, 0, -0.6f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.45f, -17, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -1, 0, 0, -0.2f, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-72.45f, -17, -1).setRotationAngle(0, 0, 0).setName("Box 551cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -1, 0, 0, 0, 0, 0, -0.2f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-72.45f, -17, 0).setRotationAngle(0, 0, 0).setName("Box 551cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.875f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0, -0.52f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.45f, -17, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0125f, -1, -1.625f, 0, -1, 0, 0, -0.8f, 0, 0, -1, 0.625f, 0, 0, -1.625f, 0, 0, 0, 0, 0.1875f, 0, 0, 0, 0.625f)
			.setRotationPoint(-70.45f, -17, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -1, 0, 0, -0.698f, 0, 0, -0.52f, 0, 0.5f, -1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-71.45f, -17, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.875f, 0, 0, -0.698f, 0, -0.125f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-71.45f, -17, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -1, -0.6f, 0, -1, -0.625f, 0, -0.875f, 0, -0.75f, -1, 0, -1, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-71.45f, -17, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, -0.6f, 0, 0, -0.8f, 0, 0, -1, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f)
			.setRotationPoint(-70.45f, -17, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.52f, 0, 0, -0.2f, 0, 0, -0.6f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.45f, -17, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -1, 0, 0, -0.52f, 0, 0, -0.698f, 0, -0.125f, -1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-71.45f, -17, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -1, 0, 0, -0.698f, 0, 0, -0.875f, 0, -0.75f, -1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-71.45f, -17, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.875f, 0, 0, -1, -0.625f, -1, -1, -0.625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -1, 0, -0.625f)
			.setRotationPoint(-71.45f, -17, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-73.45f, -16, -1).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-73.95f, -15, -1).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.5625f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1.1f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.7f, 0, 0)
			.setRotationPoint(-73.95f, -15, -3).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, -1.5f, 0, 0, -1.3f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.1f, 0, 0)
			.setRotationPoint(-73.95f, -15, -4).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, -1, 0, 0.5f, -1, 0, 0.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.3f, 0, 0)
			.setRotationPoint(-73.95f, -15, -5).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.5f, 0, 0, -1.5f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0.0625f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-73.45f, -16, -2).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -1, 0, 0, -1, 0, 0.25f, -0.5f, 0, -1.25f, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-73.45f, -16, -3).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0)
			.setRotationPoint(-73.95f, -15, 0).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, 0, 0, 0.5f, 0, 0, 0.5625f, 0, 0, -1.5f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0.5f, 0, 0, -1.1f, 0, 0)
			.setRotationPoint(-73.95f, -15, 1).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.1f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.3f, 0, 0)
			.setRotationPoint(-73.95f, -15, 3).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -1, 0, -1.5f, -1, 0, -1.3f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-73.95f, -15, 4).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.25f, -0.5f, 0, -1.25f, -0.5f, 0, -0.5f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-73.45f, -16, 1).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -1, 0, -1, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-73.45f, -16, 2).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -1.125f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-72.45f, -16, 1).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.125f, 0, 0, 0.125f, 0, 0, 0.75f, 0, 0, -1.75f, 0, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.45f, -16, 2).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0.625f, 0, -0.8f, 0, 0, -1, 0, 0, -1, -1.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -1.625f)
			.setRotationPoint(-70.45f, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(-72.45f, -16, -2).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.75f, 0, 0, 0.75f, 0, 0, 0.125f, 0, 0, -1.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-72.45f, -16, -3).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.75f, 0, 0, 0.75f, 0, 0, 0.125f, 0, 0, -0.5f, 0, 0, 0.05f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 1.25f, 0, 0)
			.setRotationPoint(-71.2f, -16, -5).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0.125f, 0, 0, 0.75f, 0, 0, -1.75f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.05f, 0, 0)
			.setRotationPoint(-71.2f, -16, 3).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.75f, -1, 1, 0.75f, -1, 1, 0.75f, 0, 0, -1.75f, 0, 0, -1.75f, 0, 1, 0.75f, 0, 1, 0.75f, 0, 0, 0.05f, 0, 0)
			.setRotationPoint(-71.2f, -16, -7).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0, 0, -0.3f, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, -1, -0.5f, 0, -1, -1, 0, 0.5f, -1, 0)
			.setRotationPoint(-71.95f, -15, -4).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -2.7f, 0, 0, 2.5f, 0, 0, 1.5f, 0, 0, -2.1f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-73.95f, -15, -5).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.55f, 0, 0, 1, 0, 0, 0, 0, 0, -0.95f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-72.2f, -15, -6).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.4f, 0, 0, 1, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-71.45f, -15, -7).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, 0, 1, -1, 0, 0, 0, 0, -0.65f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-70.7f, -15, -8).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, -1, 0, 0.25f, -1, 0, 0.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0.25f, 0, 0, 0.1875f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-70.7f, -15, -9).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -1, 0, 0, -0.3f, 0, 0, -0.1f, 0, 0, 0.5f, -1, 0, -1, -1, 0, -1, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-71.95f, -15, 3).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -2.1f, 0, 0, 1.5f, 0, 0, 2.5f, 0, 0, -2.7f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 0.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-73.95f, -15, 4).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.95f, 0, 0, 0, 0, 0, 1, 0, 0, -1.55f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-72.2f, -15, 5).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, 0, 0, 0, 1, 0, 0, -1.4f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-71.45f, -15, 6).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, 0, 0, 0, 0, 0, 1, -0.125f, 0, -1.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-70.7f, -15, 7).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, 0, 0.25f, 0, 0, 0.25f, -1, 0, -1.25f, -1, 0, -0.5f, 0, 0, 0.1875f, 0, 0, 0.25f, 0, 0, -1.25f, 0, 0)
			.setRotationPoint(-70.7f, -15, 8).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -3, 0, 0, -1, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.45f, -16, -8).setRotationAngle(0, 0, 0).setName("Box 131cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.75f, 0, 0, 0.75f, 0, 0, 0.75f, -1, 1, -1.75f, -1, 1, 0.05f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 1, -1.75f, 0, 1)
			.setRotationPoint(-71.2f, -16, 5).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -1, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0)
			.setRotationPoint(-69.45f, -16, 7).setRotationAngle(0, 0, 0).setName("Box 131cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-48.5f, -5, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1272")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0.5f, 0, 0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-48.5f, -17, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1273")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -16, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1274")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.75f, 0.5f, 0, 0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -17, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1275")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -16, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1276")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -12, 4.1499996f).setRotationAngle(0, 0, 0).setName("Box 1285")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-48.5f, -5, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1272cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0.5f, 0, 0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-48.5f, -17, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1273cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -16, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1274cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.75f, 0.5f, 0, 0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -17, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1275cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -16, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1276cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -12, -7.8500004f).setRotationAngle(0, 0, 0).setName("Box 1285cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 82, textureX, textureY).addBox(0, 0, 0, 5, 4, 4)
			.setRotationPoint(-14.450005f, -3, -2).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 39, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-10.950005f, -4, -0.5f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 39, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-13.950005f, -4, -0.5f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.450005f, -4, -2).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 36, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-10.950005f, -3, 1.5f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 33, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-12.450005f, -3, 1.5f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 30, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-13.950005f, -3, 1.5f).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-14.450005f, -3, 2).setRotationAngle(0, 0, 0).setName("Box 524")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 23, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-12.450005f, -3, -2.5f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-13.950005f, -3, -2.5f).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 6, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-10.950005f, -3, -2.5f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.450005f, -3, -3).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 0, textureX, textureY).addBox(0, 0, 0, 1, 2, 0)
			.setRotationPoint(-9.450005f, -1, -0.5f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-9.450005f, -2, -0.5f).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 2, 0)
			.setRotationPoint(-9.450005f, -1, 0.5f).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 18, 0, 0, 0, -4, -2, 0, 0, -2, 0, 0, 0, 0, -4, 0, -0.5f, -4, -2, -0.5f, 0, -2, -0.5f, 0, 0, -0.5f, -4)
			.setRotationPoint(-77.45f, 1, -9).setRotationAngle(0, 0, 0).setName("Box 698")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, -4, 0, -5, 0, 0, 0, 0, 0, 0, -4, 0, -5, -4, -0.5f, -5, 0, -0.5f, 0, 0, -0.5f, 0, -4, -0.5f, -5)
			.setRotationPoint(-82.45f, 1, -5).setRotationAngle(0, 0, 0).setName("Box 700")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, -3.5f, 0, -5, -0.5f, 0, 0, -0.5f, 0, 0, -3.5f, 0, -5, -4, 0, -5, 0, 0, 0, 0, 0, 0, -4, 0, -5)
			.setRotationPoint(-81.95f, 1.5f, -5).setRotationAngle(0, 0, 0).setName("Box 701")
		);
		groups.add(clipboard);
	}

	Model3aBlomberg truck = new Model3aBlomberg();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(f,0,0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glTranslatef(6.0625f, 0, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
