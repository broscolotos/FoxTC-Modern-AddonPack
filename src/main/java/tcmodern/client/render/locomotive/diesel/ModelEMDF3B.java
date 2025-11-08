//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.diesel;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.locomotive.bogies.ModelBlombergB;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelEMDF3B extends FVTMFormatBase {

	public ModelEMDF3B(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("Riggs64");
		//
		initGroup_group0();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 110, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-55, 1.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 4, 1, 0, 1, 0.5f, -3, 1, 0.5f, -3, 1, -1, 3, 1, -1, 3, 1, -2, 0, 1, -2, 0, 1, -2, 0, 1, -2, 0)
			.setRotationPoint(-54, -19.75f, -11).setRotationAngle(0, 0, 0).setName("Box 315")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 2, 5, 0, 1, -1.5f, 0, 1, -1.5f, 0, 1, 0, 0, 1, 0, 0, 1, 1, -1, 1, 1, -1, 1, 0, 0, 1, 0, 0)
			.setRotationPoint(-54, -21.75f, -8).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 110, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -2, -1.5f, 1, 1.5f, -1.5f, 1, 2, 0, 0, -2, 0, 0, -2, 1, 0, 1.5f, 1, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(53, -21.75f, -7).setRotationAngle(0, 0, 0).setName("Box 333")
		);
		group0.add(new ModelRendererTurbo(group0, 141, 109, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
			.setRotationPoint(55, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Box 334")
		);
		group0.add(new ModelRendererTurbo(group0, 246, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.5f, -3, -0.5f, 0.5f, -3, -0.5f, -1, 3, 0, -1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -19.75f, -11).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -2, 0, 0, 2, 0, 0, 1.5f, -1.5f, 1, -2, -1.5f, 1, -2, 0, 0, 2, 0, 0, 1.5f, 1, 0, -2, 1, 0)
			.setRotationPoint(53, -21.75f, 3).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 3, -0.5f, -1, 3, -0.5f, 0.5f, -3, 0, 0.5f, -3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -19.75f, 10).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 53, textureX, textureY).addBox(0, 0, 0, 108, 15, 1)
			.setRotationPoint(-54, -13.75f, -11).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		group0.add(new ModelRendererTurbo(group0, 236, 133, textureX, textureY).addBox(0, 0, 0, 1, 19, 1)
			.setRotationPoint(54, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 133, textureX, textureY).addBox(0, 0, 0, 1, 19, 1)
			.setRotationPoint(54, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 108, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(54, -17.75f, -10).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 106, textureX, textureY).addBox(0, -2, 0, 1, 18, 8)
			.setRotationPoint(54, -14.75f, -4).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54, -19.75f, -10).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 106, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(54, -17.75f, 4).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54, -19.75f, 4).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		group0.add(new ModelRendererTurbo(group0, 226, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(54.5f, 3.1499996f, -5.75f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(54.5f, 3.1499996f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(54.5f, 3.1499996f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(54.5f, 3.1499996f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, 6.75f, -11).setRotationAngle(0, 0, 0).setName("Box 261")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 105, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(54, 1.75f, -11).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(54.5f, 3.1499996f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 269")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(54.5f, 3.1499996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 270")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(37, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 292")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(37, -12.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 293")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(37, -12.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 294")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(32.5f, -12.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 295")
		);
		group0.add(new ModelRendererTurbo(group0, 480, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(32.5f, -12.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 296")
		);
		group0.add(new ModelRendererTurbo(group0, 475, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(32.5f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 297")
		);
		group0.add(new ModelRendererTurbo(group0, 447, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(37, -12.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 298")
		);
		group0.add(new ModelRendererTurbo(group0, 376, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(37, -12.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 299")
		);
		group0.add(new ModelRendererTurbo(group0, 371, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(37, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 300")
		);
		group0.add(new ModelRendererTurbo(group0, 322, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(32.5f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		group0.add(new ModelRendererTurbo(group0, 317, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(32.5f, -12.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 302")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(32.5f, -12.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		group0.add(new ModelRendererTurbo(group0, 301, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -15.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 358")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 105, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(55, 0.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 359")
		);
		group0.add(new ModelRendererTurbo(group0, 296, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -15.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 360")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(55, -16.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 361")
		);
		group0.add(new ModelRendererTurbo(group0, 126, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -16.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 362")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 106, textureX, textureY).addBox(0, -2, 0, 1, 3, 8)
			.setRotationPoint(54, -17.75f, -4).setRotationAngle(0, 0, 0).setName("Box 363")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -16.75f, -8.6f).setRotationAngle(0, 0, 0).setName("Box 364")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -16.75f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(54.5f, -8.75f, 2.15f).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 123, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 1, -0.5f, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(55.5f, 2.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 504")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 132, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 154, 132, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(57, 5.75f, 0.5999999f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.5f, 2.25f, -1).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(56.5f, 1.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(56.5f, 1.25f, -7).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -2.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -2.5f, 0, 0)
			.setRotationPoint(54.5f, 0.25f, 6).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -2.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -2.5f, 0, 0)
			.setRotationPoint(54.5f, 0.25f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 322, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(55, 0.75f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 472, 5, textureX, textureY).addBox(0, 0, 0, 5, 4, 4)
			.setRotationPoint(0, -2.75f, -2).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 132, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(3.5f, -3.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		group0.add(new ModelRendererTurbo(group0, 71, 132, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(0.5f, -3.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -3.75f, -2).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 132, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(3.5f, -2.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 132, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(2, -2.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 56, 132, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(0.5f, -2.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 367, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(0, -2.75f, 2).setRotationAngle(0, 0, 0).setName("Box 524")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 131, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(2, -2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 131, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(0.5f, -2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 131, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(3.5f, -2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -2.75f, -3).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 0, textureX, textureY).addBox(0, 0, 0, 1, 2, 0)
			.setRotationPoint(5, -0.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 460, 131, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(5, -1.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 0, textureX, textureY).addBox(0, 0, 0, 1, 2, 0)
			.setRotationPoint(5, -0.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		group0.add(new ModelRendererTurbo(group0, 464, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(32.5f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(32.5f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(34.5f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(34.5f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-34.5f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-36.5f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, 1.75f, -11).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-19, 3.75f, -11).setRotationAngle(0, 0, 0).setName("Box 438")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 2.75f, -11).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		group0.add(new ModelRendererTurbo(group0, 434, 105, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(54, 1.75f, 2).setRotationAngle(0, 0, 0).setName("Box 441")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, 6.75f, 2).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 2.75f, 10).setRotationAngle(0, 0, 0).setName("Box 443")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-19, 3.75f, 10).setRotationAngle(0, 0, 0).setName("Box 444")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-54, -14.049999f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 420")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-54, -17.65f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 421")
		);
		group0.add(new ModelRendererTurbo(group0, 424, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(53, -6.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 487")
		);
		group0.add(new ModelRendererTurbo(group0, 419, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(53, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(50.5f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 489")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.5f, -6.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(50.5f, -6.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 222, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(53, -6.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(-34.5f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 374, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(-36.5f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(53, -6.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -6.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.5f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 168, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(50.5f, -6.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		group0.add(new ModelRendererTurbo(group0, 131, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.5f, -6.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, 1.75f, 10).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 121, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(4.5f, -22.75f, 0).setRotationAngle(0, 0, 0).setName("Box 065")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.5f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(0.5f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f)
			.setRotationPoint(-2.5f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 100, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 121, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(21.5f, -22.75f, 0).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		group0.add(new ModelRendererTurbo(group0, 434, 63, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 8, 2, 8, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 168, 121, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(37.5f, -22.75f, 0).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 56, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 8, 2, 8, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 45, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 8, 2, 8, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.5f, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 546")
		);
		group0.add(new ModelRendererTurbo(group0, 475, 30, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 8, 2, 8, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.5f, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 105, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5f, -22.25f, -1).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 105, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.5f, -22.25f, -1).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 74, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.5f, -22.25f, -1).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.5f, 1.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 123, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(53.5f, 1.25f, -1).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-34, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-36, 2.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 301, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-36, 3.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 294, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-36, 4.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-36.5f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(36, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(33.5f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(34, 2.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(34, 3.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(34, 4.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(53, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(50.5f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51, 2.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51, 3.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51, 4.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.5f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 2.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-34, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 3.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 4.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		group0.add(new ModelRendererTurbo(group0, 435, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, 4.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, 3.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(33.5f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(36, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, 2.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 524")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, 4.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 141, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, 3.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		group0.add(new ModelRendererTurbo(group0, 386, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(50.5f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(53, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, 2.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 199, 100, textureX, textureY).addBox(0, 0, 0, 28, 4, 18)
			.setRotationPoint(-9, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(-9, 6.75f, -8).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 416, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-9, 5.75f, -9).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 16)
			.setRotationPoint(-10, 1.75f, -8).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 434, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, 0.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(34, 0.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(36, -8.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(36, -8.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, -12.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -12.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-22, -10.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-24, -10.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -12.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		group0.add(new ModelRendererTurbo(group0, 238, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(26, -10.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 484")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(24, -10.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 485")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -12.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 486")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 487")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		group0.add(new ModelRendererTurbo(group0, 328, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(15, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 489")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(14, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 272, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(47, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 267, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(46, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 262, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(54.25f, -12.25f, 0).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.25f, -12.25f, -2).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 203, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.25f, -14.25f, -2).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.25f, -14.25f, 0).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(24, -10.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(26, -10.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -12.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 247, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(15, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 242, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(14, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 237, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 232, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(47, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(46, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 502, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -12.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, -12.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		group0.add(new ModelRendererTurbo(group0, 422, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-24, -10.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		group0.add(new ModelRendererTurbo(group0, 411, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-22, -10.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -12.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 186, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(-0.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 504")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(-0.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(-0.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(-0.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(8.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(8.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(8.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 480, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(8.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(9.5f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.5f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f)
			.setRotationPoint(6.5f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(16.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(16.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(16.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(16.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(17.5f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.5f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f)
			.setRotationPoint(14.5f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(25.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 524")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(25.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(25.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(25.5f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(26.5f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 100, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.5f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f)
			.setRotationPoint(23.5f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-54, -15.25f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-54, -16.45f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-33, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 450, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-33, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 375, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-33, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-54, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 370, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(53.649994f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 323, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(53.649994f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(53.649994f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -16.83f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -16.63f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 586")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -17.03f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -17.23f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -15.83f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -15.43f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -15.629999f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 595")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -16.03f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 596")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -14.629999f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 597")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -14.23f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 598")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -14.43f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -14.83f, -10.93f).setRotationAngle(0, 0, 0).setName("Box 600")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-10.43f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-10.43f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		group0.add(new ModelRendererTurbo(group0, 298, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-10.43f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		group0.add(new ModelRendererTurbo(group0, 293, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(9.57f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(9.57f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(9.57f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 164, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(23.57f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(23.57f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 154, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(23.57f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.07f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.07f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 418, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.07f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		group0.add(new ModelRendererTurbo(group0, 413, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.07f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		group0.add(new ModelRendererTurbo(group0, 395, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.07f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.07f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-54, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-33, -14.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 578")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-33, -16.1f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-33, -17.3f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-54, -17.65f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-54, -16.45f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 582")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-54, -15.25f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-54, -14.049999f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-10.43f, -16.1f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 595")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-10.43f, -17.3f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 596")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-10.43f, -14.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 597")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(9.57f, -17.3f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 598")
		);
		group0.add(new ModelRendererTurbo(group0, 436, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(9.57f, -16.1f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(9.57f, -14.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 600")
		);
		group0.add(new ModelRendererTurbo(group0, 403, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(23.57f, -17.3f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(23.57f, -16.1f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(23.57f, -14.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.07f, -17.3f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.07f, -16.1f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 258, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.07f, -14.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(53.649994f, -14.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 248, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(53.649994f, -16.1f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(53.649994f, -17.3f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -17.23f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -17.03f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -16.83f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -16.63f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -16.03f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -15.83f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -15.629999f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -15.43f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -14.83f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -14.629999f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -14.43f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-53.65f, -14.23f, 9.93f).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		group0.add(new ModelRendererTurbo(group0, 238, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.07f, -16.1f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 622")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.07f, -17.3f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		group0.add(new ModelRendererTurbo(group0, 228, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.07f, -14.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 114, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(14, -1.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 110, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(46, -1.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 110, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(14, -1.5f, 10.1f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 108, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(46, -1.5f, 10.1f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 106, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
			.setRotationPoint(-56, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 2, 0, 0, -2, 0, 0, -2, -1.5f, 1, 1.5f, -1.5f, 1, 2, 0, 0, -2, 0, 0, -2, 1, 0, 1.5f, 1, 0)
			.setRotationPoint(-54, -21.75f, 3).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 1.5f, -1.5f, 1, -2, -1.5f, 1, -2, 0, 0, 2, 0, 0, 1.5f, 1, 0, -2, 1, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-54, -21.75f, -7).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0.5f, -3, 0, 0.5f, -3, 0, -1, 3, -0.5f, -1, 3, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-56, -19.75f, -11).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -1, 3, 0, -1, 3, 0, 0.5f, -3, -0.5f, 0.5f, -3, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-56, -19.75f, 10).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 127, textureX, textureY).addBox(0, 0, 0, 1, 19, 1)
			.setRotationPoint(-55, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		group0.add(new ModelRendererTurbo(group0, 72, 106, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(-55, -17.75f, -10).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -19.75f, -10).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 106, textureX, textureY).addBox(0, -2, 0, 1, 3, 8)
			.setRotationPoint(-55, -17.75f, -4).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -19.75f, 4).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 106, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(-55, -17.75f, 4).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 127, textureX, textureY).addBox(0, 0, 0, 1, 19, 1)
			.setRotationPoint(-55, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 105, textureX, textureY).addBox(0, -2, 0, 1, 18, 8)
			.setRotationPoint(-55, -14.75f, -4).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		group0.add(new ModelRendererTurbo(group0, 445, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 0.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 622")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-37.5f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 628")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-37.5f, -12.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 629")
		);
		group0.add(new ModelRendererTurbo(group0, 386, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-33, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 630")
		);
		group0.add(new ModelRendererTurbo(group0, 381, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-33, -12.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 631")
		);
		group0.add(new ModelRendererTurbo(group0, 376, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-33, -12.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 632")
		);
		group0.add(new ModelRendererTurbo(group0, 371, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-37.5f, -12.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 633")
		);
		group0.add(new ModelRendererTurbo(group0, 413, 105, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(-55, 1.75f, -11).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 69, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(-55, 1.75f, 2).setRotationAngle(0, 0, 0).setName("Box 635")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56, 6.75f, 2).setRotationAngle(0, 0, 0).setName("Box 636")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56, 6.75f, -11).setRotationAngle(0, 0, 0).setName("Box 637")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-55.5f, 3.1499996f, -5.75f).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-55.5f, 3.1499996f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-55.5f, 3.1499996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-55.5f, 3.1499996f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-55.5f, 3.1499996f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-55.5f, 3.1499996f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-34, -8.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 649")
		);
		group0.add(new ModelRendererTurbo(group0, 326, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-54, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 650")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-54, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 651")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-54, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.5f, 2.25f, -1).setRotationAngle(0, 0, 0).setName("Box 679")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57, 0.75f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 680")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.5f, 1.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 681")
		);
		group0.add(new ModelRendererTurbo(group0, 349, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-57.5f, 1.25f, -7).setRotationAngle(0, 0, 0).setName("Box 682")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, 1, -0.5f, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, 0, 1, -0.5f, 0)
			.setRotationPoint(-55.5f, 0.25f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 683")
		);
		group0.add(new ModelRendererTurbo(group0, 294, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-55.5f, 1.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 684")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 50, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.5f, 2.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 685")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 126, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-58, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 686")
		);
		group0.add(new ModelRendererTurbo(group0, 284, 126, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-58, 5.75f, 0.5999999f).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		group0.add(new ModelRendererTurbo(group0, 279, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, 1, -0.5f, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, 0, 1, -0.5f, 0)
			.setRotationPoint(-55.5f, 0.25f, 6).setRotationAngle(0, 0, 0).setName("Box 688")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 105, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(-56, 0.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 689")
		);
		group0.add(new ModelRendererTurbo(group0, 197, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56, -15.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 690")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56, -15.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 691")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-56, -16.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 692")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56, -16.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 693")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.25f, -14.25f, -2.1f).setRotationAngle(0, 0, 0).setName("Box 694")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.25f, -14.25f, -0.0999999f).setRotationAngle(0, 0, 0).setName("Box 695")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-55.25f, -12.25f, -0.0999999f).setRotationAngle(0, 0, 0).setName("Box 696")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.25f, -12.25f, -2.1f).setRotationAngle(0, 0, 0).setName("Box 697")
		);
		group0.add(new ModelRendererTurbo(group0, 164, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-56, -16.75f, -8.6f).setRotationAngle(0, 0, 0).setName("Box 698")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-56, -16.75f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 699")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 106, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-54.5f, 1.25f, -1).setRotationAngle(0, 0, 0).setName("Box 700")
		);
		group0.add(new ModelRendererTurbo(group0, 154, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-54, -17.3f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 702")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-54, -16.1f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 703")
		);
		group0.add(new ModelRendererTurbo(group0, 165, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-54, -14.9f, 9.95f).setRotationAngle(0, 0, 0).setName("Box 704")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 25, textureX, textureY).addBox(0, 0, 0, 108, 15, 1)
			.setRotationPoint(-54, -13.75f, 10).setRotationAngle(0, 0, 0).setName("Box 705")
		);
		group0.add(new ModelRendererTurbo(group0, 475, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-36, 0.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 706")
		);
		group0.add(new ModelRendererTurbo(group0, 152, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 708")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-33, -12.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 709")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 711")
		);
		group0.add(new ModelRendererTurbo(group0, 144, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-37.5f, -12.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 712")
		);
		group0.add(new ModelRendererTurbo(group0, 328, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -12.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 715")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -12.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 716")
		);
		group0.add(new ModelRendererTurbo(group0, 139, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-34, -8.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box 717")
		);
		group0.add(new ModelRendererTurbo(group0, 302, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-53.5f, -6.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 727")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.5f, -6.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 728")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-51, -6.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 729")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-51, -6.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box 730")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-53.5f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 731")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-51, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box 732")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-51, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 733")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53, 2.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 734")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-53.5f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 735")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53, 3.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 736")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53, 4.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box 737")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-51, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 738")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, 2.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 739")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, 3.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 740")
		);
		group0.add(new ModelRendererTurbo(group0, 460, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-53.5f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 741")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, 4.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box 742")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 744")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-51, -6.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 745")
		);
		group0.add(new ModelRendererTurbo(group0, 172, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -6.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 746")
		);
		group0.add(new ModelRendererTurbo(group0, 397, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, -6.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 747")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-53.5f, -6.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 748")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box 749")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-55.5f, -8.75f, -3.6f).setRotationAngle(0, 0, 0).setName("Box 751")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-47, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 752")
		);
		group0.add(new ModelRendererTurbo(group0, 141, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 753")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 754")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 106, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-48, -1.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box 755")
		);
		group0.add(new ModelRendererTurbo(group0, 118, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-48, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 756")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 105, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-48, -1.5f, 10.1f).setRotationAngle(0, 0, 0).setName("Box 757")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 758")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 759")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-47, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 760")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-48, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 761")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 106, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55, 6.6499996f, 4.3500004f).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 105, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55, 6.6499996f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 105, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55, 6.6499996f, 5.3500004f).setRotationAngle(0, 0, 0).setName("Box 617")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 105, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55, 6.6499996f, -6.65f).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 105, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55, 6.6499996f, -5.65f).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 105, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55, 6.6499996f, -7.65f).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 105, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-55.5f, 6.6499996f, 4.3500004f).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 103, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-55.5f, 6.6499996f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		group0.add(new ModelRendererTurbo(group0, 448, 79, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-55.5f, 6.6499996f, 5.3500004f).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 70, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-55.5f, 6.6499996f, -6.65f).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		group0.add(new ModelRendererTurbo(group0, 459, 63, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-55.5f, 6.6499996f, -5.65f).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 51, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-55.5f, 6.6499996f, -7.65f).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55, -10.75f, -10).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		group0.add(new ModelRendererTurbo(group0, 164, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55, -8.75f, -10).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		group0.add(new ModelRendererTurbo(group0, 151, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55, -6.75f, -10).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		group0.add(new ModelRendererTurbo(group0, 397, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55, -10.75f, 5).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55, -8.75f, 5).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55, -6.75f, 5).setRotationAngle(0, 0, 0).setName("Box 627")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-56, -8.75f, -10).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-56, -6.75f, -10).setRotationAngle(0, 0, 0).setName("Box 567")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-56, -10.75f, -10).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-56, -10.75f, 5).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		group0.add(new ModelRendererTurbo(group0, 459, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-56, -8.75f, 5).setRotationAngle(0, 0, 0).setName("Box 570")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f)
			.setRotationPoint(-56, -6.75f, 5).setRotationAngle(0, 0, 0).setName("Box 571")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(30, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(11, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 435, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, -0.2f, -2, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(9, -15.700001f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(16, -15.700001f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-10, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-33, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, -0.05f, 0, 2.5f, -0.05f, 0, 2.5f, -0.05f, -0.2f, -3, -0.05f, -0.2f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-27, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, -0.05f, 0, 2.5f, -0.05f, 0, 2.5f, -0.05f, -0.2f, -3, -0.05f, -0.2f, -1.5f, 0, 0, 1, 0, 0, 1, 0, -0.2f, -1.5f, 0, -0.2f)
			.setRotationPoint(-13.5f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 541")
		);
		group0.add(new ModelRendererTurbo(group0, 92, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.05f, 0, -0.5f, -0.05f, 0, -0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-1.5f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1.5f, -1.5f, 0, 0.5f, -1, 0, 0.5f, -1, -0.2f, -1.5f, -1.5f, -0.2f, -3.9f, 0, 0, 3.35f, 0, 0, 3.35f, 0, -0.2f, -3.9f, 0, -0.2f)
			.setRotationPoint(31.5f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -17.7f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 585")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, -0.05f, -0.2f, 2.5f, -0.05f, -0.2f, 2.5f, -0.05f, 0, -3, -0.05f, 0, 0, 0, -0.2f, -0.5f, 0, -0.2f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -17.7f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 586")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, -0.05f, -0.2f, 2.5f, -0.05f, -0.2f, 2.5f, -0.05f, 0, -3, -0.05f, 0, -1.5f, 0, -0.2f, 1, 0, -0.2f, 1, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-13.5f, -17.7f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, -17.7f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, -0.5f, 0, -0.2f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.5f, -17.7f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, -2, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9, -15.700001f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, -17.7f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.2f, -2, 0, -0.2f, -2, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, -15.700001f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		group0.add(new ModelRendererTurbo(group0, 436, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1.5f, -1.5f, -0.2f, 0.5f, -1, -0.2f, 0.5f, -1, 0, -1.5f, -1.5f, 0, -3.9f, 0, -0.2f, 3.35f, 0, -0.2f, 3.35f, 0, 0, -3.9f, 0, 0)
			.setRotationPoint(31.5f, -17.7f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -17.7f, 9.8f).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		group0.add(new ModelRendererTurbo(group0, 283, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.75f, -12.25f, -2).setRotationAngle(0, 0, 0).setName("Box 1281")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(53.75f, -12.25f, 0).setRotationAngle(0, 0, 0).setName("Box 1282")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.75f, -14.25f, 0).setRotationAngle(0, 0, 0).setName("Box 1283")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.75f, -14.25f, -2).setRotationAngle(0, 0, 0).setName("Box 1284")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -16.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1285")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(53, -16.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1286")
		);
		group0.add(new ModelRendererTurbo(group0, 26, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -15.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1287")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -8.75f, 2.15f).setRotationAngle(0, 0, 0).setName("Box 1288")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -15.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1289")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 16, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(53, 0.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -15.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -16.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-54, -16.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 336, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -15.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 7, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(-54, 0.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-54.5f, -8.75f, -3.6f).setRotationAngle(0, 0, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-54.75f, -12.25f, 0).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		group0.add(new ModelRendererTurbo(group0, 475, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.75f, -14.25f, 0).setRotationAngle(0, 0, 0).setName("Box 613")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.75f, -14.25f, -2).setRotationAngle(0, 0, 0).setName("Box 614")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.75f, -12.25f, -2).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		group0.add(new ModelRendererTurbo(group0, 152, 103, textureX, textureY).addBox(0, 0, 0, 9, 4, 6)
			.setRotationPoint(-19, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-19, 5.75f, -9).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		group0.add(new ModelRendererTurbo(group0, 436, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(-19, 6.75f, -8).setRotationAngle(0, 0, 0).setName("Box 532")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 67, textureX, textureY).addBox(0, 0, 0, 9, 4, 6)
			.setRotationPoint(-19, 1.75f, 3).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 397, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-19, 4.25f, -3).setRotationAngle(0, 0, 0).setName("Box 1491")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 105, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-19, 3.25f, -3).setRotationAngle(0, 0, 0).setName("Box 1492")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 2.25f, -3).setRotationAngle(0, 0, 0).setName("Box 1493")
		);
		group0.add(new ModelRendererTurbo(group0, 434, 74, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-19, 3.25f, 0).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 2.25f, 0).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-19, 4.25f, 0).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 7, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-8, 2.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box 546")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 2.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 2.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-7, 3.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-8, 3.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 7, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-8, 2.5f, 10.1f).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-7, 3.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-8, 3.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 2.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 2.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 110, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, -1)
			.setRotationPoint(-55, -21.75f, 3).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 110, 4, 1, 0, 0, -1, 3, 0, -1, 3, 0, 0.5f, -3, 0, 0.5f, -3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-55, -19.75f, 10).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		groups.add(group0);
	}

	ModelBlombergB truck = new ModelBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.modID,"textures/trains/bogies/BlombergB_bogie.png"));
		GL11.glTranslatef(-2.15625f,0,0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glTranslatef(4.3125f, 0, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
