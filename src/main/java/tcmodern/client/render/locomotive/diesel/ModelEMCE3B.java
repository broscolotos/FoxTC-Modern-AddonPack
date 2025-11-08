//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.diesel;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.locomotive.bogies.Model3aBlomberg;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelEMCE3B extends FVTMFormatBase {

	public ModelEMCE3B(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("Riggs64");
		//
		initGroup_group0();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 146, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-73, 1, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -2, -1.5f, 1, 1.5f, -1.5f, 1, 2, 0, 0, -2, 0, 0, -2, 1, 0, 1.5f, 1, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(71, -22, -7).setRotationAngle(0, 0, 0).setName("Box 333")
		);
		group0.add(new ModelRendererTurbo(group0, 60, 110, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
			.setRotationPoint(73, -22, -3).setRotationAngle(0, 0, 0).setName("Box 334")
		);
		group0.add(new ModelRendererTurbo(group0, 402, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.5f, -3, -0.5f, 0.5f, -3, -0.5f, -1, 3, 0, -1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(73, -20, -11).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -2, 0, 0, 2, 0, 0, 1.5f, -1.5f, 1, -2, -1.5f, 1, -2, 0, 0, 2, 0, 0, 1.5f, 1, 0, -2, 1, 0)
			.setRotationPoint(71, -22, 3).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		group0.add(new ModelRendererTurbo(group0, 397, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 3, -0.5f, -1, 3, -0.5f, 0.5f, -3, 0, 0.5f, -3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(73, -20, 10).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 110, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(72, -18, -10).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 101, textureX, textureY).addBox(0, -2, 0, 1, 18, 8)
			.setRotationPoint(72, -15, -4).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(72, -20, -10).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 110, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(72, -18, 4).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(72, -20, 4).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 101, textureX, textureY).addBox(0, -2, 0, 1, 18, 8)
			.setRotationPoint(-73, -15, -4).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 101, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(-73, -18, -10).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 101, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(-73, -18, 4).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73, -20, 4).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73, -20, -10).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(72.5f, 2.8999996f, -5.75f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(72.5f, 2.8999996f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 382, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(72.5f, 2.8999996f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(72.5f, 2.8999996f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(73, 6.5f, -11).setRotationAngle(0, 0, 0).setName("Box 261")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 78, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(72, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(72.5f, 2.8999996f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 269")
		);
		group0.add(new ModelRendererTurbo(group0, 367, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(72.5f, 2.8999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 270")
		);
		group0.add(new ModelRendererTurbo(group0, 362, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(73, -16, 3.5f).setRotationAngle(0, 0, 0).setName("Box 358")
		);
		group0.add(new ModelRendererTurbo(group0, 344, 83, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(73, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 359")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(73, -16, -4.5f).setRotationAngle(0, 0, 0).setName("Box 360")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(73, -17, -4.5f).setRotationAngle(0, 0, 0).setName("Box 361")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(73, -17, 0.5f).setRotationAngle(0, 0, 0).setName("Box 362")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 79, textureX, textureY).addBox(0, -2, 0, 1, 3, 8)
			.setRotationPoint(72, -18, -4).setRotationAngle(0, 0, 0).setName("Box 363")
		);
		group0.add(new ModelRendererTurbo(group0, 352, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(73, -17, -8.6f).setRotationAngle(0, 0, 0).setName("Box 364")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(73, -17, 7.7f).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(72.5f, -9, 2.15f).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 66, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 1, -0.5f, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(73.5f, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 504")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(75, 3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(75, 5.5f, 0.5999999f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 370, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(72.5f, 2, -1).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(74.5f, 1, -0.75f).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(74.5f, 1, -7).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 322, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -2.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -2.5f, 0, 0)
			.setRotationPoint(72.5f, 0, 6).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 317, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -2.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -2.5f, 0, 0)
			.setRotationPoint(72.5f, 0, -7.5f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(73, 0.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(54.25f, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 363, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(54.25f, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(56.25f, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(56.25f, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-44.25f, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		group0.add(new ModelRendererTurbo(group0, 324, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-46.25f, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 144, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		group0.add(new ModelRendererTurbo(group0, 358, 74, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(72, 1.5f, 2).setRotationAngle(0, 0, 0).setName("Box 441")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(73, 6.5f, 2).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		group0.add(new ModelRendererTurbo(group0, 312, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(70, -6.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 487")
		);
		group0.add(new ModelRendererTurbo(group0, 307, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(70, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		group0.add(new ModelRendererTurbo(group0, 302, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(67.5f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 489")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(67.5f, -6.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(67.5f, -7, -11.6f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(70, -7, -11.6f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(-44.25f, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 413, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(-46.25f, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(70, -6.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(70, -7, 10.6f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 272, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(70, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 267, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(67.5f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 262, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(67.5f, -6.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(67.5f, -7, 10.6f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 144, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(72.5f, 1, 0.5f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 480, 87, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(71.5f, 1, -1).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 247, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-68, 1.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-70, 2.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-70, 3.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 320, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-70, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 242, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-70.5f, 1.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 237, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(70, 1.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 232, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(67.5f, 1.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(68, 2.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(68, 3.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(68, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-70.5f, 1.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		group0.add(new ModelRendererTurbo(group0, 349, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-70, 2.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		group0.add(new ModelRendererTurbo(group0, 222, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-68, 1.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-70, 3.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		group0.add(new ModelRendererTurbo(group0, 364, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-70, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(68, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(68, 3.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(67.5f, 1.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(70, 1.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(68, 2.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(72.25f, -12.5f, 0).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(72.25f, -12.5f, -2).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(72.25f, -14.5f, -2).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 472, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(72.25f, -14.5f, 0).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(73, 6.3999996f, 4.3500004f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(73, 6.3999996f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		group0.add(new ModelRendererTurbo(group0, 197, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(73, 6.3999996f, 5.3500004f).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(73, 6.3999996f, -6.65f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		group0.add(new ModelRendererTurbo(group0, 187, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(73, 6.3999996f, -5.65f).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		group0.add(new ModelRendererTurbo(group0, 182, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(73, 6.3999996f, -7.6499996f).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(73, -11, -10).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(73, -9, -10).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(73, -7, -10).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		group0.add(new ModelRendererTurbo(group0, 472, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(73, -11, 5).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		group0.add(new ModelRendererTurbo(group0, 459, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(73, -9, 5).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(73, -7, 5).setRotationAngle(0, 0, 0).setName("Box 627")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.25f, -12.5f, -2).setRotationAngle(0, 0, 0).setName("Box 1281")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-73.25f, -12.5f, 0).setRotationAngle(0, 0, 0).setName("Box 1282")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.25f, -14.5f, 0).setRotationAngle(0, 0, 0).setName("Box 1283")
		);
		group0.add(new ModelRendererTurbo(group0, 343, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.25f, -14.5f, -2).setRotationAngle(0, 0, 0).setName("Box 1284")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-74, -17, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1285")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-74, -17, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1286")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-74, -16, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1287")
		);
		group0.add(new ModelRendererTurbo(group0, 172, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-73.5f, -9, 2.15f).setRotationAngle(0, 0, 0).setName("Box 1288")
		);
		group0.add(new ModelRendererTurbo(group0, 167, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-74, -16, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1289")
		);
		group0.add(new ModelRendererTurbo(group0, 296, 42, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(-74, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1290")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 78, textureX, textureY).addBox(0, -2, 0, 1, 3, 8)
			.setRotationPoint(-73, -18, -4).setRotationAngle(0, 0, 0).setName("Box 677")
		);
		group0.add(new ModelRendererTurbo(group0, 298, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-76.5f, 2, -1).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-75.399994f, 3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-75.399994f, 5.5f, 0.5999999f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 6, textureX, textureY)
			.addShapeBox(0, -1, 0, 3, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0.9f, -0.5f, -0.5f, 0.9f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-75.399994f, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 66, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(-73, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 24, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(-73, 1.5f, 2).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-74, 6.5f, 2).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-74, 6.5f, -11).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		group0.add(new ModelRendererTurbo(group0, 95, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-72.5f, 1, 0.5f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 42, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-72.5f, 1, -1).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, 1, -0.5f, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, 0, 1, -0.5f, 0)
			.setRotationPoint(-73.3f, 0, -7.5f).setRotationAngle(0, 0, 0).setName("Box 595")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-74.8f, 0.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 596")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-75.3f, 1, -7).setRotationAngle(0, 0, 0).setName("Box 597")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-75.3f, 1, -0.75f).setRotationAngle(0, 0, 0).setName("Box 598")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, 1, -0.5f, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, 0, 1, -0.5f, 0)
			.setRotationPoint(-73.3f, 0, 6).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-73.5f, 2.8999996f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 600")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-73.5f, 2.8999996f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-73.5f, 2.8999996f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-74, 6.3999996f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 92, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-74, 6.3999996f, 5.3500004f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 92, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-74, 6.3999996f, 4.3500004f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 92, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-74, 6.3999996f, -7.6499996f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 92, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-74, 6.3999996f, -6.65f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 92, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-74, 6.3999996f, -5.65f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-73.5f, 2.8999996f, -5.75f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-73.5f, 2.8999996f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-73.5f, 2.8999996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0.5f, -3, 0, 0.5f, -3, 0, -1, 3, -0.5f, -1, 3, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-74, -20, -11).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 1.5f, -1.5f, 1, -2, -1.5f, 1, -2, 0, 0, 2, 0, 0, 1.5f, 1, 0, -2, 1, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-72, -22, -7).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 33, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
			.setRotationPoint(-74, -22, -3).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 2, 0, 0, -2, 0, 0, -2, -1.5f, 1, 1.5f, -1.5f, 1, 2, 0, 0, -2, 0, 0, -2, 1, 0, 1.5f, 1, 0)
			.setRotationPoint(-72, -22, 3).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -1, 3, 0, -1, 3, 0, 0.5f, -3, -0.5f, 0.5f, -3, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-74, -20, 10).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		group0.add(new ModelRendererTurbo(group0, 427, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-74, -7, 5).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-74, -11, -10).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-74, -9, -10).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-74, -7, -10).setRotationAngle(0, 0, 0).setName("Box 622")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-74, -11, 5).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		group0.add(new ModelRendererTurbo(group0, 376, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-74, -9, 5).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-74, -17, 7.7f).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-74, -17, -8.6f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 78, textureX, textureY).addBox(0, 0, 0, 146, 15, 1)
			.setRotationPoint(-73, -14, -11).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 61, textureX, textureY).addBox(0, 0, 0, 146, 15, 1)
			.setRotationPoint(-73, -14, 10).setRotationAngle(0, 0, 0).setName("Box 430")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-68, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 449")
		);
		group0.add(new ModelRendererTurbo(group0, 418, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-70.5f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 450")
		);
		group0.add(new ModelRendererTurbo(group0, 162, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-70.5f, -6.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		group0.add(new ModelRendererTurbo(group0, 157, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-68, -6.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 452")
		);
		group0.add(new ModelRendererTurbo(group0, 381, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-70.5f, -7, -11.6f).setRotationAngle(0, 0, 0).setName("Box 453")
		);
		group0.add(new ModelRendererTurbo(group0, 376, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-68, -7, -11.6f).setRotationAngle(0, 0, 0).setName("Box 454")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -7, 10.6f).setRotationAngle(0, 0, 0).setName("Box 455")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.5f, -7, 10.6f).setRotationAngle(0, 0, 0).setName("Box 456")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-70.5f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 457")
		);
		group0.add(new ModelRendererTurbo(group0, 371, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 458")
		);
		group0.add(new ModelRendererTurbo(group0, 152, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-68, -6.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 459")
		);
		group0.add(new ModelRendererTurbo(group0, 147, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-70.5f, -6.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 460")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(15, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 292")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(15, -13, -11.6f).setRotationAngle(0, 0, 0).setName("Box 293")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(15, -12.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 294")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(10.5f, -13, -11.6f).setRotationAngle(0, 0, 0).setName("Box 295")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(10.5f, -12.5f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 296")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(10.5f, -0.5f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 297")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(15, -12.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 298")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -13, 10.6f).setRotationAngle(0, 0, 0).setName("Box 299")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 300")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -0.5f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(10.5f, -12.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 302")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -13, 10.6f).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		group0.add(new ModelRendererTurbo(group0, 413, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-24.029999f, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 438")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.029999f, 2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		group0.add(new ModelRendererTurbo(group0, 413, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.029999f, 2.5f, 10).setRotationAngle(0, 0, 0).setName("Box 443")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-24.029999f, 3.5f, 10).setRotationAngle(0, 0, 0).setName("Box 444")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-51, -14.299999f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 420")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-51, -17.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 421")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 87, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(-23, -23, 0).setRotationAngle(0, 0, 0).setName("Box 065")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 66, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(-13.5f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 11, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(-9.5f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 83, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 83, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 82, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.5f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(14, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 343, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(11.5f, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(12, 4.5f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(11.5f, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(14, 4.5f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 33, textureX, textureY).addBox(0, 0, 0, 9, 4, 6)
			.setRotationPoint(-23, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		group0.add(new ModelRendererTurbo(group0, 319, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-23, 5.5f, -9).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		group0.add(new ModelRendererTurbo(group0, 406, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(-23, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 532")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 33, textureX, textureY).addBox(0, 0, 0, 20, 4, 18)
			.setRotationPoint(3, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(3, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(3, 5.5f, -9).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 62, textureX, textureY).addBox(0, 0, 0, 1, 4, 16)
			.setRotationPoint(2, 1.5f, -8).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 0, -11.4f).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(12, 0, 10.4f).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 435, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(14, -8.5f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 427, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(14, -8.5f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		group0.add(new ModelRendererTurbo(group0, 420, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 1.25f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(8, 2.25f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(7, 2.25f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7, 1.25f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7, 1.25f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 335, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 1.25f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 323, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(8, 2.25f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(7, 2.25f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-51, -15.5f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-51, -16.7f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 435, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-51, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-51, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 339, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-51, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-51, -18, -11).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(56.649994f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(56.649994f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(56.649994f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-51, -18, 10).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-51, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 578")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-51, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-51, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-51, -17.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-51, -16.7f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 582")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-51, -15.5f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-51, -14.299999f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(56.649994f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(56.649994f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(56.649994f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 24, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(7, 1.25f, -11.1f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 18, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(7, 1.25f, 10.1f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 7, textureX, textureY).addBox(0, 0, 0, 9, 4, 6)
			.setRotationPoint(-23, 1.5f, 3).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-23, 4, -3).setRotationAngle(0, 0, 0).setName("Box 1491")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 74, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-23, 3, -3).setRotationAngle(0, 0, 0).setName("Box 1492")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, 2, -3).setRotationAngle(0, 0, 0).setName("Box 1493")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 73, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-23, 3, 0).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 317, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, 2, 0).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-23, 4, 0).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 1.5f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(12, 1.5f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 3, -11.4f).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(12, 3, 10.4f).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 403, 80, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(-19, -23, 0).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 79, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.5f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 7, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(35.5f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 7, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(31.5f, -23, 0).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		group0.add(new ModelRendererTurbo(group0, 460, 79, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.5f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 0, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(26, -23, 0).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 79, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(22, -23, 0).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		group0.add(new ModelRendererTurbo(group0, 323, 78, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 560")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 146, 4, 1, 0, 0, 0.5f, -3, 0, 0.5f, -3, 0, -1, 3, 0, -1, 3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-73, -20, -11).setRotationAngle(0, 0, 0).setName("Box 315")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 146, 2, 5, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73, -22, -8).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 146, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73, -22, -3).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 146, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, -1)
			.setRotationPoint(-73, -22, 3).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 146, 4, 1, 0, 0, -1, 3, 0, -1, 3, 0, 0.5f, -3, 0, 0.5f, -3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-73, -20, 10).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		group0.add(new ModelRendererTurbo(group0, 386, 27, textureX, textureY).addBox(0, 0, 0, 39, 4, 1)
			.setRotationPoint(-39, -18, -11).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 364, 56, textureX, textureY).addBox(0, 0, 0, 33, 4, 1)
			.setRotationPoint(12, -18, -11).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 15, textureX, textureY).addBox(0, 0, 0, 16, 4, 1)
			.setRotationPoint(57, -18, -11).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(11.650002f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(11.650002f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(11.650002f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-39.35f, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-39.35f, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-39.35f, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(0, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(0, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(0, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(45, -16.35f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 560")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(45, -17.55f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		group0.add(new ModelRendererTurbo(group0, 298, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(45, -15.15f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 562")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 27, textureX, textureY).addBox(0, 0, 0, 39, 4, 1)
			.setRotationPoint(-39, -18, 10).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 53, textureX, textureY).addBox(0, 0, 0, 33, 4, 1)
			.setRotationPoint(12, -18, 10).setRotationAngle(0, 0, 0).setName("Box 565")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 9, textureX, textureY).addBox(0, 0, 0, 16, 4, 1)
			.setRotationPoint(57, -18, 10).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(0, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 567")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(0, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(0, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(45, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 570")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(45, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 571")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(45, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 572")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(11.650002f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(11.650002f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(11.650002f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-39.35f, -16.35f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 582")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-39.35f, -17.55f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-39.35f, -15.15f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(0, -18, 10).setRotationAngle(0, 0, 0).setName("Box 585")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(0, -18, -11).setRotationAngle(0, 0, 0).setName("Box 586")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(45, -18, 10).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(45, -18, -11).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 68, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(-51, -18, 10.93f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		group0.add(new ModelRendererTurbo(group0, 320, 68, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(0, -18, 10.93f).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 65, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(45, -18, 10.93f).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 61, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(-51, -18, -10.93f).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 56, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(0, -18, -10.93f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 51, textureX, textureY).addBox(0, 0, 0, 12, 4, 0)
			.setRotationPoint(45, -18, -10.93f).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 110, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(-18, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 101, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(-13, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 600")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 101, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(33, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		group0.add(new ModelRendererTurbo(group0, 468, 101, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(28, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 89, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(54, -12, -11.15f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 80, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(28, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 56, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(33, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 33, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(-18, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 27, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(-13, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 21, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(54, -12, 10.15f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 370, 68, textureX, textureY).addBox(0, 0, -1.5f, 5, 1, 3)
			.setRotationPoint(53.5f, -22.5f, 0).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 40, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 5, 1, 3, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -23.5f, 0).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 42, textureX, textureY).addBox(0, 0, -1.5f, 3, 1, 3)
			.setRotationPoint(60.5f, -22.5f, 0).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 62, textureX, textureY).addBox(0, 0, 0, 22, 4, 1)
			.setRotationPoint(-73, -18, -11).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 59, textureX, textureY).addBox(0, 0, 0, 22, 4, 1)
			.setRotationPoint(-73, -18, 10).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 51, textureX, textureY).addBox(0, 0, 0, 16, 4, 18)
			.setRotationPoint(-14, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		groups.add(group0);
	}

	Model3aBlomberg truck = new Model3aBlomberg();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.modID,"textures/trains/bogies/3a_blomberg_bogie.png"));
		GL11.glTranslatef(-2.96875f,0,0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslatef(2.96875f,0,0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		/*
		GL11.glTranslatef(6.28125f, 0, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);*/
		GL11.glPopMatrix();
	}
}
