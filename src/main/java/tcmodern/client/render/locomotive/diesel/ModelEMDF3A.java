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
public class ModelEMDF3A extends FVTMFormatBase {

	public ModelEMDF3A(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("Riggs64");
		//
		initGroup_group0();
		initGroup_clipboard();
		initGroup_group01();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 104, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-48.45f, 1.25f, -11).setRotationAngle(0, 0, 0).setName("Box0")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 109, textureX, textureY).addBox(0, 0, 0, 9, 15, 1)
			.setRotationPoint(-48.45f, -13.75f, -11).setRotationAngle(0, 0, 0).setName("Box1")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 18, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0)
			.setRotationPoint(-51.45f, -14.75f, -9).setRotationAngle(0, 0, 0).setName("Box2")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 131, textureX, textureY).addBox(0, 0, 0, 2, 19, 1)
			.setRotationPoint(-39.45f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box3")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -3, 0, 0, 2, 0, 0, 2, 0, 0, -3, 0, 0, -1, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, -1, -0.3f, 0)
			.setRotationPoint(-46.45f, -19.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box4")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 4, 1, 0, 0, 0.5f, -3, 0, 0.5f, -3, 0, -1, 3, 0, -1, 3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-40.45f, -19.75f, -11).setRotationAngle(0, 0, 0).setName("Box5")
		);
		group0.add(new ModelRendererTurbo(group0, 248, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 2, 5, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.45f, -21.75f, -8).setRotationAngle(0, 0, 0).setName("Box6")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.45f, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Box7")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -2, -1.5f, 1, 1.5f, -1.5f, 1, 2, 0, 0, -2, 0, 0, -2, 1, 0, 1.5f, 1, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(53.55f, -21.75f, -7).setRotationAngle(0, 0, 0).setName("Box8")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 110, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
			.setRotationPoint(55.55f, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Box9")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 102, textureX, textureY).addBox(0, 0, 0, 1, 15, 20)
			.setRotationPoint(-46.45f, -13.75f, -10).setRotationAngle(0, 0, 0).setName("Box10")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.5f, -3, -0.5f, 0.5f, -3, -0.5f, -1, 3, 0, -1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, -19.75f, -11).setRotationAngle(0, 0, 0).setName("Box11")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -2, 0, 0, 2, 0, 0, 1.5f, -1.5f, 1, -2, -1.5f, 1, -2, 0, 0, 2, 0, 0, 1.5f, 1, 0, -2, 1, 0)
			.setRotationPoint(53.55f, -21.75f, 3).setRotationAngle(0, 0, 0).setName("Box12")
		);
		group0.add(new ModelRendererTurbo(group0, 215, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 3, -0.5f, -1, 3, -0.5f, 0.5f, -3, 0, 0.5f, -3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, -19.75f, 10).setRotationAngle(0, 0, 0).setName("Box13")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 22, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -2)
			.setRotationPoint(-52.45f, 1.25f, -11).setRotationAngle(0, 0, 0).setName("Box14")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 11, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.45f, -14.75f, -11).setRotationAngle(0, 0, 0).setName("Box15")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 141, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-33.45f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box16")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 34, textureX, textureY).addBox(0, 0, 0, 88, 15, 1)
			.setRotationPoint(-33.45f, -13.75f, -11).setRotationAngle(0, 0, 0).setName("Box17")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 141, textureX, textureY).addBox(0, 0, 0, 1, 19, 1)
			.setRotationPoint(54.55f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box18")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 102, textureX, textureY).addBox(0, 0, 0, 9, 15, 1)
			.setRotationPoint(-48.45f, -13.75f, 10).setRotationAngle(0, 0, 0).setName("Box19")
		);
		group0.add(new ModelRendererTurbo(group0, 141, 141, textureX, textureY).addBox(0, 0, 0, 1, 19, 1)
			.setRotationPoint(54.55f, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box20")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 130, textureX, textureY).addBox(0, 0, 0, 2, 19, 1)
			.setRotationPoint(-39.45f, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box21")
		);
		group0.add(new ModelRendererTurbo(group0, 174, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 15, 1, 0, 0, 0, -4, -2, 0, 0, -2, 0, 0, 0, 0, 4, 2, 0, -4, -3, 0, 0, -2, 0, 0, 0, 0, 4)
			.setRotationPoint(-54.45f, -13.75f, -9).setRotationAngle(0, 0, 0).setName("Box22")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 15, 1, 0, 0, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 2, 1, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 2)
			.setRotationPoint(-51.45f, -13.75f, -11).setRotationAngle(0, 0, 0).setName("Box23")
		);
		group0.add(new ModelRendererTurbo(group0, 319, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 15, 1, 0, 0, 0, 2, -1, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 2, -1, 0, 0, -1, 0, 0, 1, 0, -2)
			.setRotationPoint(-51.45f, -13.75f, 10).setRotationAngle(0, 0, 0).setName("Box24")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0)
			.setRotationPoint(-43.45f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box25")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.45f, -14.75f, -11).setRotationAngle(0, 0, 0).setName("Box26")
		);
		group0.add(new ModelRendererTurbo(group0, 288, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, -3, 0, -2, 0, -0.5f, -2, 0, -0.5f, -2, 0, 0, -2, 0)
			.setRotationPoint(-46.45f, -15.75f, -10).setRotationAngle(0, 0, 0).setName("Box27")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -6, -0.5f, 0, -6, -0.5f, 0, 6, 0, 0, 6, 0, -5, 0, -0.5f, -5, 0, -0.5f, -5, 12, 0, -5, 12)
			.setRotationPoint(-46.45f, -16.75f, -7).setRotationAngle(0, 0, 0).setName("Box28")
		);
		group0.add(new ModelRendererTurbo(group0, 178, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, -1, 0, 2, -1, 0, 2, -1, 0, 0, -1, 0)
			.setRotationPoint(-43.45f, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Box29")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -1, -1.5f, 1, 1, -1.5f, 1, 1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 1, -1, 0, 1, -1, 0)
			.setRotationPoint(-42.45f, -21.75f, -7).setRotationAngle(0, 0, 0).setName("Box30")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 4, 0, -1, 0.5f, -3, 0, 0.5f, -3, 0, -1, 0, 1, -1, 0, 1, -1, 0, 0, -1, 0, 0, -1, -3, 1, -1, -3)
			.setRotationPoint(-42.45f, -19.75f, -11).setRotationAngle(0, 0, 0).setName("Box31")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -1, 0, 0, 1, 0, 0, 1, -1.5f, 1, -1, -1.5f, 1, 1, -1, 0, 1, -1, 0, 1, 0, 0, 1, 0, 0)
			.setRotationPoint(-42.45f, -21.75f, 3).setRotationAngle(0, 0, 0).setName("Box32")
		);
		group0.add(new ModelRendererTurbo(group0, 250, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, -4, -2, 0, 0, -2, 0, 0, 0, 0, 4, 1, 0, -4, -3, 0, 0, -2, 0, 0, 0, 0, 4)
			.setRotationPoint(-55.95f, 2.75f, -9).setRotationAngle(0, 0, 0).setName("Box33")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, -1, 0, -5, -3, 0, 0, -3, 0, 0, -2, 0, 4, 0, 0, -5, -4, 0, 0, -3, 0, 0, -1.5f, 0, 4)
			.setRotationPoint(-57.95f, 2.75f, -5).setRotationAngle(0, 0, 0).setName("Box34")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, -2, 0, 4, -3, 0, 0, -3, 0, 0, -1, 0, -5, -1.5f, 0, 4, -3, 0, 0, -4, 0, 0, 0, 0, -5)
			.setRotationPoint(-57.95f, 2.75f, 4).setRotationAngle(0, 0, 0).setName("Box35")
		);
		group0.add(new ModelRendererTurbo(group0, 418, 113, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(54.55f, -17.75f, -10).setRotationAngle(0, 0, 0).setName("Box36")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 109, textureX, textureY).addBox(0, -2, 0, 1, 18, 8)
			.setRotationPoint(54.55f, -14.75f, -4).setRotationAngle(0, 0, 0).setName("Box37")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.55f, -19.75f, -10).setRotationAngle(0, 0, 0).setName("Box38")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 113, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(54.55f, -17.75f, 4).setRotationAngle(0, 0, 0).setName("Box39")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.55f, -19.75f, 4).setRotationAngle(0, 0, 0).setName("Box40")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 109, textureX, textureY).addBox(0, -2, 0, 1, 18, 8)
			.setRotationPoint(-33.45f, -14.75f, -4).setRotationAngle(0, 0, 0).setName("Box41")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 113, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(-33.45f, -17.75f, -10).setRotationAngle(0, 0, 0).setName("Box42")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 109, textureX, textureY).addBox(0, 0, 0, 1, 19, 6)
			.setRotationPoint(-33.45f, -17.75f, 4).setRotationAngle(0, 0, 0).setName("Box43")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.45f, -19.75f, 4).setRotationAngle(0, 0, 0).setName("Box44")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.45f, -19.75f, -10).setRotationAngle(0, 0, 0).setName("Box45")
		);
		group0.add(new ModelRendererTurbo(group0, 131, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.05f, 3.1499996f, -5.75f).setRotationAngle(0, 0, 0).setName("Box46")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.05f, 3.1499996f, 5.25f).setRotationAngle(0, 0, 0).setName("Box47")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.05f, 3.1499996f, 4.25f).setRotationAngle(0, 0, 0).setName("Box48")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.05f, 3.1499996f, -6.75f).setRotationAngle(0, 0, 0).setName("Box49")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, 6.75f, -11).setRotationAngle(0, 0, 0).setName("Box50")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 102, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(54.55f, 1.75f, -11).setRotationAngle(0, 0, 0).setName("Box51")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.05f, 3.1499996f, 6.25f).setRotationAngle(0, 0, 0).setName("Box52")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.05f, 3.1499996f, -7.75f).setRotationAngle(0, 0, 0).setName("Box53")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 123, textureX, textureY).addBox(0, 0, -4, 1, 2, 4)
			.setRotationPoint(-52.05f, -10.75f, 9.12f).setRotationAngle(0, 37, 0).setName("Box54")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-37.95f, -16.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box55")
		);
		group0.add(new ModelRendererTurbo(group0, 35, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-37.95f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box56")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-37.95f, -16.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box57")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-33.45f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box58")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-33.45f, -16.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box59")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-33.45f, -16.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box60")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(37.55f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box61")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(37.55f, -12.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box62")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(37.55f, -12.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box63")
		);
		group0.add(new ModelRendererTurbo(group0, 324, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(33.05f, -12.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box64")
		);
		group0.add(new ModelRendererTurbo(group0, 319, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(33.05f, -12.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box65")
		);
		group0.add(new ModelRendererTurbo(group0, 248, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(33.05f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box66")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(37.55f, -12.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box67")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(37.55f, -12.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box68")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(37.55f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box69")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(33.05f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box70")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(33.05f, -12.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box71")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(33.05f, -12.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box72")
		);
		group0.add(new ModelRendererTurbo(group0, 472, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.45f, -16.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box73")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-33.45f, -16.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box74")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.45f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box75")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.95f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box76")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-37.95f, -16.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box77")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.95f, -16.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box78")
		);
		group0.add(new ModelRendererTurbo(group0, 285, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.05f, -12.75f, -9.6f).setRotationAngle(0, 0, 0).setName("Box79")
		);
		group0.add(new ModelRendererTurbo(group0, 264, 123, textureX, textureY)
			.addShapeBox(-0.25f, 0, 1.85f, 1, 1, 4, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-57.95f, -2.75f, 3.8000002f).setRotationAngle(0, 42, 0).setName("Box80")
		);
		group0.add(new ModelRendererTurbo(group0, 416, 139, textureX, textureY)
			.addShapeBox(0.25f, 0, 1.85f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.95f, -2.75f, 3.8000002f).setRotationAngle(0, 42, 0).setName("Box81")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 139, textureX, textureY)
			.addShapeBox(0.25f, 0, 5.35f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.95f, -2.75f, 3.8000002f).setRotationAngle(0, 42, 0).setName("Box82")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 123, textureX, textureY)
			.addShapeBox(-0.5f, 0, -1.45f, 1, 1, 4, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-54.95f, -2.75f, -7).setRotationAngle(0, -38, 0).setName("Box83")
		);
		group0.add(new ModelRendererTurbo(group0, 339, 139, textureX, textureY)
			.addShapeBox(0, 0, -1.45f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.95f, -2.75f, -7).setRotationAngle(0, -38, 0).setName("Box84")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 139, textureX, textureY)
			.addShapeBox(0, 0, 2.05f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.95f, -2.75f, -7).setRotationAngle(0, -38, 0).setName("Box85")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, -15.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box86")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 101, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(55.55f, 0.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box87")
		);
		group0.add(new ModelRendererTurbo(group0, 290, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, -15.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box88")
		);
		group0.add(new ModelRendererTurbo(group0, 242, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(55.55f, -16.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box89")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, -16.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box90")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 92, textureX, textureY).addBox(0, -2, 0, 1, 3, 8)
			.setRotationPoint(54.55f, -17.75f, -4).setRotationAngle(0, 0, 0).setName("Box91")
		);
		group0.add(new ModelRendererTurbo(group0, 285, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, -16.75f, -8.6f).setRotationAngle(0, 0, 0).setName("Box92")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, -16.75f, 7.7f).setRotationAngle(0, 0, 0).setName("Box93")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.05f, -8.75f, 2.1499996f).setRotationAngle(0, 0, 0).setName("Box94")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 130, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 1, -0.5f, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(56.05f, 2.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box95")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 139, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.55f, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box96")
		);
		group0.add(new ModelRendererTurbo(group0, 238, 139, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(57.55f, 5.75f, 0.6000004f).setRotationAngle(0, 0, 0).setName("Box97")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.05f, 2.25f, -1).setRotationAngle(0, 0, 0).setName("Box98")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.05f, 1.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box99")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(57.05f, 1.25f, -7).setRotationAngle(0, 0, 0).setName("Box100")
		);
		group0.add(new ModelRendererTurbo(group0, 228, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -2.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -2.5f, 0, 0)
			.setRotationPoint(55.05f, 0.25f, 6).setRotationAngle(0, 0, 0).setName("Box101")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -2.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -2.5f, 0, 0)
			.setRotationPoint(55.05f, 0.25f, -7.5f).setRotationAngle(0, 0, 0).setName("Box102")
		);
		group0.add(new ModelRendererTurbo(group0, 348, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, 0.75f, -0.75f).setRotationAngle(0, 0, 0).setName("Box103")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.05f, 2.25f, -1).setRotationAngle(0, 0, 0).setName("Box104")
		);
		group0.add(new ModelRendererTurbo(group0, 196, 139, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.95f, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box105")
		);
		group0.add(new ModelRendererTurbo(group0, 170, 139, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-57.95f, 5.75f, 0.6000004f).setRotationAngle(0, 0, 0).setName("Box106")
		);
		group0.add(new ModelRendererTurbo(group0, 98, 139, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.95f, 2.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box107")
		);
		group0.add(new ModelRendererTurbo(group0, 93, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-40.95f, -21.25f, -7.8f).setRotationAngle(0, 0, 0).setName("Box108")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-40.95f, -22.25f, -3.6f).setRotationAngle(0, 0, 0).setName("Box109")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.95f, -22.25f, 2.6000004f).setRotationAngle(0, 0, 0).setName("Box110")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.95f, -21.25f, 6.8f).setRotationAngle(0, 0, 0).setName("Box111")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.4f, -0.5f, -1, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.95f, -22.75f, 2.6000004f).setRotationAngle(0, 0, 0).setName("Box112")
		);
		group0.add(new ModelRendererTurbo(group0, 68, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.95f, -21.75f, 6.8f).setRotationAngle(0, 0, 0).setName("Box113")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 1, 0, 0, 1, 0)
			.setRotationPoint(-40.95f, -22.75f, 3.1999998f).setRotationAngle(0, 0, 0).setName("Box114")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.4f, 0, -1, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-40.95f, -22.75f, -3.6f).setRotationAngle(0, 0, 0).setName("Box115")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-40.95f, -21.75f, -7.8f).setRotationAngle(0, 0, 0).setName("Box116")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 1, 0, -0.5f, 1, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-40.95f, -22.75f, -7.2f).setRotationAngle(0, 0, 0).setName("Box117")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-33.2f, -23.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box118")
		);
		group0.add(new ModelRendererTurbo(group0, 499, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-31.45f, -22.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box119")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 17, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-32.2f, -23.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box120")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-31.45f, -22.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box121")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 17, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-32.2f, -23.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box122")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-33.2f, -23.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box123")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 74, textureX, textureY).addBox(0, 0, 0, 5, 4, 4)
			.setRotationPoint(0.54999924f, -2.75f, -2).setRotationAngle(0, 0, 0).setName("Box124")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(4.049999f, -3.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box125")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(1.0499992f, -3.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box126")
		);
		group0.add(new ModelRendererTurbo(group0, 490, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.54999924f, -3.75f, -2).setRotationAngle(0, 0, 0).setName("Box127")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(4.049999f, -2.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box128")
		);
		group0.add(new ModelRendererTurbo(group0, 216, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(2.5499992f, -2.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box129")
		);
		group0.add(new ModelRendererTurbo(group0, 211, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(1.0499992f, -2.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box130")
		);
		group0.add(new ModelRendererTurbo(group0, 370, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(0.54999924f, -2.75f, 2).setRotationAngle(0, 0, 0).setName("Box131")
		);
		group0.add(new ModelRendererTurbo(group0, 206, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(2.5499992f, -2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box132")
		);
		group0.add(new ModelRendererTurbo(group0, 141, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(1.0499992f, -2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box133")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(4.049999f, -2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box134")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.54999924f, -2.75f, -3).setRotationAngle(0, 0, 0).setName("Box135")
		);
		group0.add(new ModelRendererTurbo(group0, 509, 4, textureX, textureY).addBox(0, 0, 0, 1, 2, 0)
			.setRotationPoint(5.549999f, -0.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box136")
		);
		group0.add(new ModelRendererTurbo(group0, 131, 138, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(5.549999f, -1.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box137")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 0, textureX, textureY).addBox(0, 0, 0, 1, 2, 0)
			.setRotationPoint(5.549999f, -0.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box138")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(33.05f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box139")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(33.05f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box140")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(35.05f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box141")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(35.05f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box142")
		);
		group0.add(new ModelRendererTurbo(group0, 286, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-33.95f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box143")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.95f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box144")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 15, 1, 0, -1, 0, -5, -3, 0, 0, -3, 0, 0, -2, 0, 4, 1, 0, -5, -5, 0, 0, -3, 0, 0, -2, 0, 4)
			.setRotationPoint(-56.45f, -13.75f, -5).setRotationAngle(0, 0, 0).setName("Box145")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 15, 1, 0, -2, 0, 4, -3, 0, 0, -3, 0, 0, -1, 0, -5, -2, 0, 4, -3, 0, 0, -5, 0, 0, 1, 0, -5)
			.setRotationPoint(-56.45f, -13.75f, 4).setRotationAngle(0, 0, 0).setName("Box146")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 15, 1, 0, 0, 0, 4, -2, 0, 0, -2, 0, 0, 0, 0, -4, 0, 0, 4, -2, 0, 0, -3, 0, 0, 2, 0, -4)
			.setRotationPoint(-54.45f, -13.75f, 8).setRotationAngle(0, 0, 0).setName("Box147")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.45f, -14.75f, 10).setRotationAngle(0, 0, 0).setName("Box148")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, 0, 4, -2, 0, 0, -2, 0, 0, 0, 0, -4, 0, 0, 4, -2, 0, 0, -3, 0, 0, 1, 0, -4)
			.setRotationPoint(-55.95f, 2.75f, 8).setRotationAngle(0, 0, 0).setName("Box149")
		);
		group0.add(new ModelRendererTurbo(group0, 126, 138, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-33.45f, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box150")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 31, textureX, textureY).addBox(0, 0, 0, 88, 15, 1)
			.setRotationPoint(-33.45f, -13.75f, 10).setRotationAngle(0, 0, 0).setName("Box151")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 103, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-48.45f, 1.75f, -11).setRotationAngle(0, 0, 0).setName("Box152")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 2, 1, 0, -2, -1, -6, 0, -1, -6, 0, 0, 0, 2)
			.setRotationPoint(-51.95f, 2.75f, -11).setRotationAngle(0, 0, 0).setName("Box153")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-18.45f, 3.75f, -11).setRotationAngle(0, 0, 0).setName("Box154")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.45f, 2.75f, -11).setRotationAngle(0, 0, 0).setName("Box155")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, 0, 2, -1, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 2, -1, -6, 0, -1, -6, 0, 1, 0, -2)
			.setRotationPoint(-51.95f, 2.75f, 10).setRotationAngle(0, 0, 0).setName("Box156")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 83, textureX, textureY).addBox(0, 0, 0, 1, 6, 9)
			.setRotationPoint(54.55f, 1.75f, 2).setRotationAngle(0, 0, 0).setName("Box157")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.55f, 6.75f, 2).setRotationAngle(0, 0, 0).setName("Box158")
		);
		group0.add(new ModelRendererTurbo(group0, 430, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.45f, 2.75f, 10).setRotationAngle(0, 0, 0).setName("Box159")
		);
		group0.add(new ModelRendererTurbo(group0, 430, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-18.45f, 3.75f, 10).setRotationAngle(0, 0, 0).setName("Box160")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.05f, -12.75f, 8.4f).setRotationAngle(0, 0, 0).setName("Box161")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-32.45f, -14.049999f, -10.95f).setRotationAngle(0, 0, 0).setName("Box162")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-32.45f, -17.65f, -10.95f).setRotationAngle(0, 0, 0).setName("Box163")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(53.55f, -6.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box164")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(53.55f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box165")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(51.05f, -0.25f, -11.6f).setRotationAngle(0, 0, 0).setName("Box166")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.05f, -6.25f, -12.1f).setRotationAngle(0, 0, 0).setName("Box167")
		);
		group0.add(new ModelRendererTurbo(group0, 35, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(51.05f, -6.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box168")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(53.55f, -6.75f, -11.6f).setRotationAngle(0, 0, 0).setName("Box169")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(-33.95f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box170")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(-35.95f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box171")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(53.55f, -6.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box172")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(53.55f, -6.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box173")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(53.55f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box174")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.05f, -0.25f, 10.6f).setRotationAngle(0, 0, 0).setName("Box175")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(51.05f, -6.25f, 11.1f).setRotationAngle(0, 0, 0).setName("Box176")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.05f, -6.75f, 10.6f).setRotationAngle(0, 0, 0).setName("Box177")
		);
		group0.add(new ModelRendererTurbo(group0, 220, 123, textureX, textureY).addBox(0, 0, 0, 4, 5, 1)
			.setRotationPoint(-37.45f, -3.75f, -11).setRotationAngle(0, 0, 0).setName("Box178")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 123, textureX, textureY).addBox(0, 0, 0, 4, 5, 1)
			.setRotationPoint(-37.45f, -3.75f, 10).setRotationAngle(0, 0, 0).setName("Box179")
		);
		group0.add(new ModelRendererTurbo(group0, 198, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 11, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.45f, -14.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box180")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.600002f, -14.74f, -2).setRotationAngle(0, 0, 0).setName("Box181")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.600002f, -16.74f, -2).setRotationAngle(0, 0, 0).setName("Box182")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.600002f, -16.74f, 0).setRotationAngle(0, 0, 0).setName("Box183")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-55.600002f, -14.74f, 0).setRotationAngle(0, 0, 0).setName("Box184")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.55f, -9.75f, -2).setRotationAngle(0, 0, 0).setName("Box185")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.55f, -7.75f, -2).setRotationAngle(0, 0, 0).setName("Box186")
		);
		group0.add(new ModelRendererTurbo(group0, 370, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-56.55f, -7.75f, 0).setRotationAngle(0, 0, 0).setName("Box187")
		);
		group0.add(new ModelRendererTurbo(group0, 339, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.55f, -9.75f, 0).setRotationAngle(0, 0, 0).setName("Box188")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 18, 0, 0, 0, -4, 1, 0, 0, 1, 0, 0, 0, 0, -4, -0.5f, 0, -4, 1.5f, 0, 0, 1.5f, 0, 0, -0.5f, 0, -4)
			.setRotationPoint(-56.45f, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box189")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 103, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-48.45f, 1.75f, 10).setRotationAngle(0, 0, 0).setName("Box190")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.45f, -14.75f, -11).setRotationAngle(0, 0, 0).setName("Box191")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, -2)
			.setRotationPoint(-52.45f, 1.75f, 7).setRotationAngle(0, 0, 0).setName("Box192")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -2, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-52.45f, 1.75f, -11).setRotationAngle(0, 0, 0).setName("Box193")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.95f, 1.75f, -7).setRotationAngle(0, 0, 0).setName("Box194")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-47.95f, 1.75f, -10).setRotationAngle(0, 0, 0).setName("Box195")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 126, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(5.049999f, -22.75f, 0).setRotationAngle(0, 0, 0).setName("Box196")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.0499992f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box197")
		);
		group0.add(new ModelRendererTurbo(group0, 378, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(1.0499992f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box198")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f)
			.setRotationPoint(-1.9500008f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box199")
		);
		group0.add(new ModelRendererTurbo(group0, 352, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.9500008f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box200")
		);
		group0.add(new ModelRendererTurbo(group0, 352, 126, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(22.05f, -22.75f, 0).setRotationAngle(0, 0, 0).setName("Box201")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 99, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 8, 2, 8, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.9500008f, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box202")
		);
		group0.add(new ModelRendererTurbo(group0, 427, 113, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(38.05f, -22.75f, 0).setRotationAngle(0, 0, 0).setName("Box203")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 99, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 8, 2, 8, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.049999f, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box204")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 99, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 8, 2, 8, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.049999f, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box205")
		);
		group0.add(new ModelRendererTurbo(group0, 178, 99, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 8, 2, 8, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.05f, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box206")
		);
		group0.add(new ModelRendererTurbo(group0, 203, 99, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.049999f, -22.25f, -1).setRotationAngle(0, 0, 0).setName("Box207")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 94, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.05f, -22.25f, -1).setRotationAngle(0, 0, 0).setName("Box208")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 92, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37.05f, -22.25f, -1).setRotationAngle(0, 0, 0).setName("Box209")
		);
		group0.add(new ModelRendererTurbo(group0, 447, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.45f, -8.25f, -2.65f).setRotationAngle(-8, 90, 0).setName("Box210")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 130, textureX, textureY)
			.addShapeBox(0, 0.01f, 0.07f, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.95f, -8.700001f, -2.65f).setRotationAngle(-8, 90, 0).setName("Box211")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 126, textureX, textureY)
			.addShapeBox(0, 5.51f, 0.07f, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.95f, -8.700001f, -2.65f).setRotationAngle(-8, 90, 0).setName("Box212")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.45f, -8.25f, 3.1499996f).setRotationAngle(-8, 90, 0).setName("Box213")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 123, textureX, textureY)
			.addShapeBox(0, 5.51f, 0.07f, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.95f, -8.700001f, 3.1499996f).setRotationAngle(-8, 90, 0).setName("Box214")
		);
		group0.add(new ModelRendererTurbo(group0, 293, 123, textureX, textureY)
			.addShapeBox(0, 0.01f, 0.07f, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-55.95f, -8.700001f, 3.1499996f).setRotationAngle(-8, 90, 0).setName("Box215")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(55.05f, 1.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box216")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 123, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(54.05f, 1.25f, -1).setRotationAngle(0, 0, 0).setName("Box217")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-34.45f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box218")
		);
		group0.add(new ModelRendererTurbo(group0, 208, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-36.45f, 2.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box219")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-36.45f, 3.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box220")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-36.45f, 4.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box221")
		);
		group0.add(new ModelRendererTurbo(group0, 378, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-36.95f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box222")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(36.55f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box223")
		);
		group0.add(new ModelRendererTurbo(group0, 368, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(34.05f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box224")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(34.55f, 2.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box225")
		);
		group0.add(new ModelRendererTurbo(group0, 90, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(34.55f, 3.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box226")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(34.55f, 4.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box227")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(53.55f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box228")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(51.05f, 1.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box229")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.55f, 2.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box230")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.55f, 3.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box231")
		);
		group0.add(new ModelRendererTurbo(group0, 258, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.55f, 4.75f, -10.9f).setRotationAngle(0, 0, 0).setName("Box232")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.95f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box233")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.45f, 2.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box234")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-34.45f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box235")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.45f, 3.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box236")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.45f, 4.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box237")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.55f, 4.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box238")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.55f, 3.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box239")
		);
		group0.add(new ModelRendererTurbo(group0, 270, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(34.05f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box240")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(36.55f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box241")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.55f, 2.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box242")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.55f, 4.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box243")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.55f, 3.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box244")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(51.05f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box245")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(53.55f, 1.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box246")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.55f, 2.75f, 9.9f).setRotationAngle(0, 0, 0).setName("Box247")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 102, textureX, textureY).addBox(0, 0, 0, 9, 4, 6)
			.setRotationPoint(-18.45f, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box248")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-18.45f, 5.75f, -9).setRotationAngle(0, 0, 0).setName("Box249")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(-18.45f, 6.75f, -8).setRotationAngle(0, 0, 0).setName("Box250")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 51, textureX, textureY).addBox(0, 0, 0, 28, 4, 18)
			.setRotationPoint(-8.450001f, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box251")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(-8.450001f, 6.75f, -8).setRotationAngle(0, 0, 0).setName("Box252")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-8.450001f, 5.75f, -9).setRotationAngle(0, 0, 0).setName("Box253")
		);
		group0.add(new ModelRendererTurbo(group0, 402, 92, textureX, textureY).addBox(0, 0, 0, 1, 4, 16)
			.setRotationPoint(-9.450001f, 1.75f, -8).setRotationAngle(0, 0, 0).setName("Box254")
		);
		group0.add(new ModelRendererTurbo(group0, 468, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.45f, -2.75f, -11.4f).setRotationAngle(0, 0, 0).setName("Box255")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.45f, -1.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box256")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.45f, 0.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box257")
		);
		group0.add(new ModelRendererTurbo(group0, 359, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-36.45f, 0.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box258")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-36.45f, -1.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box259")
		);
		group0.add(new ModelRendererTurbo(group0, 472, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-36.45f, -2.75f, 10.4f).setRotationAngle(0, 0, 0).setName("Box260")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.55f, 0.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box261")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(34.55f, 0.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box262")
		);
		group0.add(new ModelRendererTurbo(group0, 429, 37, textureX, textureY).addBox(0, 0, 0, 12, 5, 20)
			.setRotationPoint(-45.45f, -3.75f, -10).setRotationAngle(0, 0, 0).setName("Box263")
		);
		group0.add(new ModelRendererTurbo(group0, 402, 92, textureX, textureY).addBox(0, 0, 0, 3, 9, 4)
			.setRotationPoint(-44.45f, -12.75f, -2).setRotationAngle(0, 0, 0).setName("Box264")
		);
		group0.add(new ModelRendererTurbo(group0, 187, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 4, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(-41.45f, -12.75f, -2).setRotationAngle(0, 0, 0).setName("Box265")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 4, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-45.45f, -12.75f, -2).setRotationAngle(0, 0, 0).setName("Box266")
		);
		group0.add(new ModelRendererTurbo(group0, 246, 110, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(-43.95f, -14.75f, -1).setRotationAngle(0, 0, 0).setName("Box267")
		);
		group0.add(new ModelRendererTurbo(group0, 216, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-41.95f, -14.75f, -1).setRotationAngle(0, 0, 0).setName("Box268")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-44.95f, -14.75f, -1).setRotationAngle(0, 0, 0).setName("Box269")
		);
		group0.add(new ModelRendererTurbo(group0, 386, 129, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-43.95f, -16.75f, -1).setRotationAngle(0, -39, 0).setName("Box270")
		);
		group0.add(new ModelRendererTurbo(group0, 264, 129, textureX, textureY).addBox(0, 0, 0, 1, 5, 2)
			.setRotationPoint(-43.95f, -8.75f, 5).setRotationAngle(0, 0, 0).setName("Box271")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-44.95f, -8.75f, 5).setRotationAngle(0, 0, 0).setName("Box272")
		);
		group0.add(new ModelRendererTurbo(group0, 250, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-42.95f, -8.75f, 5).setRotationAngle(0, 0, 0).setName("Box273")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-43.95f, -10.75f, 7).setRotationAngle(0, 0, 0).setName("Box274")
		);
		group0.add(new ModelRendererTurbo(group0, 236, 129, textureX, textureY).addBox(0, 0, 0, 1, 7, 2)
			.setRotationPoint(-44.95f, -10.75f, 7).setRotationAngle(0, 0, 0).setName("Box275")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-45.95f, -10.75f, 7).setRotationAngle(0, 0, 0).setName("Box276")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-43.7f, -14.75f, 1).setRotationAngle(0, 0, 0).setName("Box277")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-43.7f, -11.75f, 1.8000002f).setRotationAngle(0, 22, 0).setName("Box278")
		);
		group0.add(new ModelRendererTurbo(group0, 167, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-43.95f, -11.75f, 6).setRotationAngle(0, -34, 0).setName("Box279")
		);
		group0.add(new ModelRendererTurbo(group0, 250, 137, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-44.95f, -11.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box280")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 137, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-43.95f, -9.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box281")
		);
		group0.add(new ModelRendererTurbo(group0, 336, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-43.45f, -9.75f, 4).setRotationAngle(0, -16, 0).setName("Box282")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 127, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-46.149998f, -13.75f, 6.5f).setRotationAngle(0, 0, 0).setName("Box283")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 126, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-46.149998f, -13.75f, 4).setRotationAngle(0, 0, 0).setName("Box284")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 110, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-46.149998f, -11.25f, 3).setRotationAngle(0, 0, 0).setName("Box285")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 107, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-46.149998f, -15.25f, 3).setRotationAngle(0, 0, 0).setName("Box286")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-40.95f, -14.5f, 0.6499996f).setRotationAngle(0, 0, -90).setName("Box287")
		);
		group0.add(new ModelRendererTurbo(group0, 187, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f)
			.setRotationPoint(-41.05f, -15.25f, 0.5500002f).setRotationAngle(0, 0, -90).setName("Box288")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0.8f, 0, 0, 0.8f, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -1.6f, 0, 0, -1.6f, -0.8f, 0, -0.8f, -0.8f)
			.setRotationPoint(-40.95f, -18.5f, 0.6499996f).setRotationAngle(0, 0, -90).setName("Box289")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.8f, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0.8f, -0.8f, 0, -1.6f, 0, 0, -0.8f, 0, 0, -0.8f, -0.8f, 0, -1.6f, -0.8f)
			.setRotationPoint(-40.95f, -12.5f, 0.6499996f).setRotationAngle(0, 0, -90).setName("Box290")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.850002f, -9.25f, 6.6499996f).setRotationAngle(0, 0, 0).setName("Box291")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.850002f, -10.25f, 5.6499996f).setRotationAngle(0, 0, 0).setName("Box292")
		);
		group0.add(new ModelRendererTurbo(group0, 344, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-35.98f, -14, 10.65f).setRotationAngle(0, 180, -13).setName("Box293")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-39.850002f, -9.25f, -9.95f).setRotationAngle(0, 0, 0).setName("Box294")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.850002f, -10.25f, -9.95f).setRotationAngle(0, 0, 0).setName("Box295")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-35.98f, -14, -4.95f).setRotationAngle(0, 180, -13).setName("Box296")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.850002f, -12.25f, 4.6499996f).setRotationAngle(0, 0, 0).setName("Box297")
		);
		group0.add(new ModelRendererTurbo(group0, 453, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.850002f, -12.25f, -4.95f).setRotationAngle(0, 0, 0).setName("Box298")
		);
		group0.add(new ModelRendererTurbo(group0, 58, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-34.45f, -11.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box299")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(36.55f, -8.25f, -11.4f).setRotationAngle(0, 0, 0).setName("Box300")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-34.45f, -11.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box301")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(36.55f, -8.25f, 10.4f).setRotationAngle(0, 0, 0).setName("Box302")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.45f, -12.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box303")
		);
		group0.add(new ModelRendererTurbo(group0, 238, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.45f, -12.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box304")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-21.45f, -10.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box305")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-23.45f, -10.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box306")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.55f, -12.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box307")
		);
		group0.add(new ModelRendererTurbo(group0, 128, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(26.55f, -10.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box308")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(24.55f, -10.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box309")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.55f, -12.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box310")
		);
		group0.add(new ModelRendererTurbo(group0, 484, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.549999f, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box311")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.549999f, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box312")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(15.549999f, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box313")
		);
		group0.add(new ModelRendererTurbo(group0, 469, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(14.549999f, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box314")
		);
		group0.add(new ModelRendererTurbo(group0, 464, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47.55f, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box315")
		);
		group0.add(new ModelRendererTurbo(group0, 459, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(47.55f, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box316")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(46.55f, -0.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box317")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46.55f, -1.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box318")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(54.8f, -12.25f, 0).setRotationAngle(0, 0, 0).setName("Box319")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.8f, -12.25f, -2).setRotationAngle(0, 0, 0).setName("Box320")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.8f, -14.25f, -2).setRotationAngle(0, 0, 0).setName("Box321")
		);
		group0.add(new ModelRendererTurbo(group0, 301, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.8f, -14.25f, 0).setRotationAngle(0, 0, 0).setName("Box322")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(24.55f, -10.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box323")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(26.55f, -10.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box324")
		);
		group0.add(new ModelRendererTurbo(group0, 178, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.55f, -12.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box325")
		);
		group0.add(new ModelRendererTurbo(group0, 335, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.549999f, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box326")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.549999f, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box327")
		);
		group0.add(new ModelRendererTurbo(group0, 285, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(15.549999f, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box328")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(14.549999f, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box329")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46.55f, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box330")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47.55f, -1.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box331")
		);
		group0.add(new ModelRendererTurbo(group0, 197, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(47.55f, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box332")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(46.55f, -0.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box333")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.45f, -12.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box334")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.45f, -12.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box335")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-23.45f, -10.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box336")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-21.45f, -10.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box337")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.55f, -12.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box338")
		);
		group0.add(new ModelRendererTurbo(group0, 139, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(0.049999237f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box339")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(0.049999237f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box340")
		);
		group0.add(new ModelRendererTurbo(group0, 139, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(0.049999237f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box341")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(0.049999237f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box342")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(9.049999f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box343")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(9.049999f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box344")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(9.049999f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box345")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(9.049999f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box346")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(10.049999f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box347")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.049999f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box348")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.049999f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box349")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f)
			.setRotationPoint(7.049999f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box350")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(17.05f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box351")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(17.05f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box352")
		);
		group0.add(new ModelRendererTurbo(group0, 483, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(17.05f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box353")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(17.05f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box354")
		);
		group0.add(new ModelRendererTurbo(group0, 294, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(18.05f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box355")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.05f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box356")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.049999f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box357")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f)
			.setRotationPoint(15.049999f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box358")
		);
		group0.add(new ModelRendererTurbo(group0, 502, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(26.05f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box359")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(26.05f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box360")
		);
		group0.add(new ModelRendererTurbo(group0, 228, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(26.05f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box361")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(26.05f, -22.849998f, -1).setRotationAngle(0, 0, 0).setName("Box362")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(27.05f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box363")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.05f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box364")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.75f, -0.3f, -0.75f, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.05f, -22.849998f, -3).setRotationAngle(0, 0, 0).setName("Box365")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -0.75f, -0.3f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f)
			.setRotationPoint(24.05f, -22.849998f, 0).setRotationAngle(0, 0, 0).setName("Box366")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-32.45f, -15.25f, -10.95f).setRotationAngle(0, 0, 0).setName("Box367")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-32.45f, -16.45f, -10.95f).setRotationAngle(0, 0, 0).setName("Box368")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-32.45f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box369")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-32.45f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box370")
		);
		group0.add(new ModelRendererTurbo(group0, 495, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-32.45f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box371")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.45f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box372")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(54.2f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box373")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(54.2f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box374")
		);
		group0.add(new ModelRendererTurbo(group0, 364, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(54.2f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box375")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -16.83f, -10.93f).setRotationAngle(0, 0, 0).setName("Box376")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -16.63f, -10.93f).setRotationAngle(0, 0, 0).setName("Box377")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -17.03f, -10.93f).setRotationAngle(0, 0, 0).setName("Box378")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -17.23f, -10.93f).setRotationAngle(0, 0, 0).setName("Box379")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -15.83f, -10.93f).setRotationAngle(0, 0, 0).setName("Box380")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -15.43f, -10.93f).setRotationAngle(0, 0, 0).setName("Box381")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -15.629999f, -10.93f).setRotationAngle(0, 0, 0).setName("Box382")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -16.03f, -10.93f).setRotationAngle(0, 0, 0).setName("Box383")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -14.629999f, -10.93f).setRotationAngle(0, 0, 0).setName("Box384")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -14.23f, -10.93f).setRotationAngle(0, 0, 0).setName("Box385")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -14.43f, -10.93f).setRotationAngle(0, 0, 0).setName("Box386")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -14.83f, -10.93f).setRotationAngle(0, 0, 0).setName("Box387")
		);
		group0.add(new ModelRendererTurbo(group0, 359, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-9.880001f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box388")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-9.880001f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box389")
		);
		group0.add(new ModelRendererTurbo(group0, 349, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-9.880001f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box390")
		);
		group0.add(new ModelRendererTurbo(group0, 218, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(10.119999f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box391")
		);
		group0.add(new ModelRendererTurbo(group0, 213, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(10.119999f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box392")
		);
		group0.add(new ModelRendererTurbo(group0, 208, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(10.119999f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box393")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(24.119999f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box394")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(24.119999f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box395")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(24.119999f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box396")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.619999f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box397")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.619999f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box398")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.619999f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box399")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.62f, -16.1f, -10.95f).setRotationAngle(0, 0, 0).setName("Box400")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.62f, -17.3f, -10.95f).setRotationAngle(0, 0, 0).setName("Box401")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.62f, -14.9f, -10.95f).setRotationAngle(0, 0, 0).setName("Box402")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.45f, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box403")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-32.45f, -14.9f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box404")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-32.45f, -16.1f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box405")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-32.45f, -17.3f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box406")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-32.45f, -17.65f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box407")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-32.45f, -16.45f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box408")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-32.45f, -15.25f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box409")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-32.45f, -14.049999f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box410")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-9.880001f, -16.1f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box411")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-9.880001f, -17.3f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box412")
		);
		group0.add(new ModelRendererTurbo(group0, 335, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(-9.880001f, -14.9f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box413")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(10.119999f, -17.3f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box414")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(10.119999f, -16.1f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box415")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(10.119999f, -14.9f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box416")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(24.119999f, -17.3f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box417")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(24.119999f, -16.1f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box418")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(24.119999f, -14.9f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box419")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.62f, -17.3f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box420")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.62f, -16.1f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box421")
		);
		group0.add(new ModelRendererTurbo(group0, 358, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(47.62f, -14.9f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box422")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(54.2f, -14.9f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box423")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(54.2f, -16.1f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box424")
		);
		group0.add(new ModelRendererTurbo(group0, 375, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(54.2f, -17.3f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box425")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -17.23f, 9.93f).setRotationAngle(0, 0, 0).setName("Box426")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -17.03f, 9.93f).setRotationAngle(0, 0, 0).setName("Box427")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -16.83f, 9.93f).setRotationAngle(0, 0, 0).setName("Box428")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -16.63f, 9.93f).setRotationAngle(0, 0, 0).setName("Box429")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -16.03f, 9.93f).setRotationAngle(0, 0, 0).setName("Box430")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -15.83f, 9.93f).setRotationAngle(0, 0, 0).setName("Box431")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -15.629999f, 9.93f).setRotationAngle(0, 0, 0).setName("Box432")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -15.43f, 9.93f).setRotationAngle(0, 0, 0).setName("Box433")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -14.83f, 9.93f).setRotationAngle(0, 0, 0).setName("Box434")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -14.629999f, 9.93f).setRotationAngle(0, 0, 0).setName("Box435")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -14.43f, 9.93f).setRotationAngle(0, 0, 0).setName("Box436")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 86, 1, 1, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0.3f, -0.9f, 0, 0.3f, -0.9f, 0, 0, -0.9f, 0)
			.setRotationPoint(-32.100002f, -14.23f, 9.93f).setRotationAngle(0, 0, 0).setName("Box437")
		);
		group0.add(new ModelRendererTurbo(group0, 362, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.619999f, -16.1f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box438")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.619999f, -17.3f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box439")
		);
		group0.add(new ModelRendererTurbo(group0, 215, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(28.619999f, -14.9f, 9.950001f).setRotationAngle(0, 0, 0).setName("Box440")
		);
		group0.add(new ModelRendererTurbo(group0, 178, 99, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(14.549999f, -1.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box441")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 96, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(46.55f, -1.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box442")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 96, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(14.549999f, -1.5f, 10.1f).setRotationAngle(0, 0, 0).setName("Box443")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 92, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(46.55f, -1.5f, 10.1f).setRotationAngle(0, 0, 0).setName("Box444")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 2, 0, 0, 0, -6, 0, 0, -6, 0, 0, 6, 0, 0, 6, 0, -5, 0, 0, -5, 0, 0, -5, 12, 0, -5, 12)
			.setRotationPoint(-48.45f, -16.75f, -7).setRotationAngle(0, 0, 0).setName("Box445")
		);
		group0.add(new ModelRendererTurbo(group0, 200, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 20, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-48.45f, -15.75f, -10).setRotationAngle(0, 0, 0).setName("Box446")
		);
		group0.add(new ModelRendererTurbo(group0, 328, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 22, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.45f, -14.75f, -11).setRotationAngle(0, 0, 0).setName("Box447")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1, -0.5f, 0.3f, -1, -0.5f, 0.3f, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.95f, -14.75f, -11).setRotationAngle(0, 0, 0).setName("Box448")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, -6, -0.5f, 0.3f, -6, -0.5f, 0.3f, 6, 0, 0, 6, 0, -5, 0, -0.5f, -5.2f, 0, -0.5f, -5.3f, 12, 0, -5, 12)
			.setRotationPoint(-45.95f, -16.75f, -7).setRotationAngle(0, 0, 0).setName("Box449")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -3, -0.5f, 0.2f, -3, -0.5f, 0.3f, -3, 0, 0, -3, 0, -2, 0, -0.5f, -2.3f, 0, -0.5f, -2.3f, 0, 0, -2, 0)
			.setRotationPoint(-45.95f, -15.75f, -10).setRotationAngle(0, 0, 0).setName("Box450")
		);
		group0.add(new ModelRendererTurbo(group0, 90, 116, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55.55f, 6.6499996f, 4.3500004f).setRotationAngle(0, 0, 0).setName("Box451")
		);
		group0.add(new ModelRendererTurbo(group0, 178, 113, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55.55f, 6.6499996f, 6.3500004f).setRotationAngle(0, 0, 0).setName("Box452")
		);
		group0.add(new ModelRendererTurbo(group0, 104, 113, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55.55f, 6.6499996f, 5.3500004f).setRotationAngle(0, 0, 0).setName("Box453")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 113, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55.55f, 6.6499996f, -6.65f).setRotationAngle(0, 0, 0).setName("Box454")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55.55f, 6.6499996f, -5.65f).setRotationAngle(0, 0, 0).setName("Box455")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 110, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(55.55f, 6.6499996f, -7.6499996f).setRotationAngle(0, 0, 0).setName("Box456")
		);
		group0.add(new ModelRendererTurbo(group0, 251, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55.55f, -10.75f, -10).setRotationAngle(0, 0, 0).setName("Box457")
		);
		group0.add(new ModelRendererTurbo(group0, 238, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55.55f, -8.75f, -10).setRotationAngle(0, 0, 0).setName("Box458")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55.55f, -6.75f, -10).setRotationAngle(0, 0, 0).setName("Box459")
		);
		group0.add(new ModelRendererTurbo(group0, 469, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55.55f, -10.75f, 5).setRotationAngle(0, 0, 0).setName("Box460")
		);
		group0.add(new ModelRendererTurbo(group0, 498, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55.55f, -8.75f, 5).setRotationAngle(0, 0, 0).setName("Box461")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(55.55f, -6.75f, 5).setRotationAngle(0, 0, 0).setName("Box462")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(30.55f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box463")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(11.549999f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box464")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, -0.2f, -2, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(9.549999f, -15.700001f, -10.8f).setRotationAngle(0, 0, 0).setName("Box465")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(16.55f, -15.700001f, -10.8f).setRotationAngle(0, 0, 0).setName("Box466")
		);
		group0.add(new ModelRendererTurbo(group0, 336, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-9.450001f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box467")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-32.45f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box468")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, -0.05f, 0, 2.5f, -0.05f, 0, 2.5f, -0.05f, -0.2f, -3, -0.05f, -0.2f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-26.45f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box469")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, -0.05f, 0, 2.5f, -0.05f, 0, 2.5f, -0.05f, -0.2f, -3, -0.05f, -0.2f, -1.5f, 0, 0, 1, 0, 0, 1, 0, -0.2f, -1.5f, 0, -0.2f)
			.setRotationPoint(-12.950001f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box470")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.05f, 0, -0.5f, -0.05f, 0, -0.5f, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-0.95000076f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box471")
		);
		group0.add(new ModelRendererTurbo(group0, 374, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1.5f, -1.5f, 0, 0.5f, -1, 0, 0.5f, -1, -0.2f, -1.5f, -1.5f, -0.2f, -3.9f, 0, 0, 3.35f, 0, 0, 3.35f, 0, -0.2f, -3.9f, 0, -0.2f)
			.setRotationPoint(32.05f, -17.7f, -10.8f).setRotationAngle(0, 0, 0).setName("Box472")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.45f, -17.7f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box473")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, -0.05f, -0.2f, 2.5f, -0.05f, -0.2f, 2.5f, -0.05f, 0, -3, -0.05f, 0, 0, 0, -0.2f, -0.5f, 0, -0.2f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.45f, -17.7f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box474")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, -0.05f, -0.2f, 2.5f, -0.05f, -0.2f, 2.5f, -0.05f, 0, -3, -0.05f, 0, -1.5f, 0, -0.2f, 1, 0, -0.2f, 1, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-12.950001f, -17.7f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box475")
		);
		group0.add(new ModelRendererTurbo(group0, 293, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.450001f, -17.7f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box476")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.05f, -0.2f, -0.5f, -0.05f, -0.2f, -0.5f, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, -0.5f, 0, -0.2f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.95000076f, -17.7f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box477")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -2, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, -2, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.549999f, -15.700001f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box478")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.549999f, -17.7f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box479")
		);
		group0.add(new ModelRendererTurbo(group0, 468, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.2f, -2, 0, -0.2f, -2, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.55f, -15.700001f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box480")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1.5f, -1.5f, -0.2f, 0.5f, -1, -0.2f, 0.5f, -1, 0, -1.5f, -1.5f, 0, -3.9f, 0, -0.2f, 3.35f, 0, -0.2f, 3.35f, 0, 0, -3.9f, 0, 0)
			.setRotationPoint(32.05f, -17.7f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box481")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, -0.05f, -0.2f, 0, -0.05f, -0.2f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.55f, -17.7f, 9.799999f).setRotationAngle(0, 0, 0).setName("Box482")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 85, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-33.499996f, -4.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box483")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0.5f, 0, 0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-33.499996f, -16.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box484")
		);
		group0.add(new ModelRendererTurbo(group0, 160, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.499996f, -15.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box485")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.75f, 0.5f, 0, 0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.499996f, -16.75f, 6.5f).setRotationAngle(0, 0, 0).setName("Box486")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.499996f, -15.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box487")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-33.499996f, -11.75f, 4.1499996f).setRotationAngle(0, 0, 0).setName("Box488")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.3f, -12.25f, -2).setRotationAngle(0, 0, 0).setName("Box489")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(54.3f, -12.25f, 0).setRotationAngle(0, 0, 0).setName("Box490")
		);
		group0.add(new ModelRendererTurbo(group0, 359, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.3f, -14.25f, 0).setRotationAngle(0, 0, 0).setName("Box491")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.3f, -14.25f, -2).setRotationAngle(0, 0, 0).setName("Box492")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.55f, -16.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box493")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(53.55f, -16.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box494")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.55f, -15.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box495")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(54.05f, -8.75f, 2.1499996f).setRotationAngle(0, 0, 0).setName("Box496")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.55f, -15.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box497")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 37, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(53.55f, 0.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box498")
		);
		group0.add(new ModelRendererTurbo(group0, 448, 15, textureX, textureY).addBox(0, -2, 0, 1, 3, 8)
			.setRotationPoint(-33.45f, -17.75f, -4).setRotationAngle(0, 0, 0).setName("Box499")
		);
		groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -1, 0, 0, -0.2f, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-54.45f, -16.75f, -1).setRotationAngle(0, 0, 0).setName("Box 551cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -1, 0, 0, 0, 0, 0, -0.2f, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-54.45f, -16.75f, 0).setRotationAngle(0, 0, 0).setName("Box 551cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.875f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0, -0.52f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.45f, -16.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0125f, -1, -1.625f, 0, -1, 0, 0, -0.8f, 0, 0, -1, 0.625f, 0, 0, -1.625f, 0, 0, 0, 0, 0.1875f, 0, 0, 0, 0.625f)
			.setRotationPoint(-52.45f, -16.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -1, 0, 0, -0.698f, 0, 0, -0.52f, 0, 0.5f, -1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-53.45f, -16.75f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.875f, 0, 0, -0.698f, 0, -0.125f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-53.45f, -16.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -1, -0.6f, 0, -1, -0.625f, 0, -0.875f, 0, -0.75f, -1, 0, -1, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-53.45f, -16.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, -0.6f, 0, 0, -0.8f, 0, 0, -1, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f)
			.setRotationPoint(-52.45f, -16.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.52f, 0, 0, -0.2f, 0, 0, -0.6f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.45f, -16.75f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -1, 0, 0, -0.52f, 0, 0, -0.698f, 0, -0.125f, -1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-53.45f, -16.75f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -1, 0, 0, -0.698f, 0, 0, -0.875f, 0, -0.75f, -1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-53.45f, -16.75f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0, -0.875f, 0, 0, -1, -0.625f, -1, -1, -0.625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -1, 0, -0.625f)
			.setRotationPoint(-53.45f, -16.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-55.45f, -15.75f, -1).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, -1).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.5625f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1.1f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.7f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, -3).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, -1.5f, 0, 0, -1.3f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.1f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, -4).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, -1, 0, 0.5f, -1, 0, 0.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.3f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, -5).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.5f, 0, 0, -1.5f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0.0625f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-55.45f, -15.75f, -2).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -1, 0, 0, -1, 0, 0.25f, -0.5f, 0, -1.25f, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-55.45f, -15.75f, -3).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, 0).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, 0, 0, 0.5f, 0, 0, 0.5625f, 0, 0, -1.5f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0.5f, 0, 0, -1.1f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, 1).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.1f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.3f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, 3).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -1, 0, -1.5f, -1, 0, -1.3f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, 4).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.25f, -0.5f, 0, -1.25f, -0.5f, 0, -0.5f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-55.45f, -15.75f, 1).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -1, 0, -1, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-55.45f, -15.75f, 2).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -1.125f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-54.45f, -15.75f, 1).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.125f, 0, 0, 0.125f, 0, 0, 0.75f, 0, 0, -1.75f, 0, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.45f, -15.75f, 2).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0.625f, 0, -0.8f, 0, 0, -1, 0, 0, -1, -1.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -1.625f)
			.setRotationPoint(-52.45f, -16.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(-54.45f, -15.75f, -2).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.75f, 0, 0, 0.75f, 0, 0, 0.125f, 0, 0, -1.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-54.45f, -15.75f, -3).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.75f, 0, 0, 0.75f, 0, 0, 0.125f, 0, 0, -0.5f, 0, 0, 0.05f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 1.25f, 0, 0)
			.setRotationPoint(-53.2f, -15.75f, -5).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0.125f, 0, 0, 0.75f, 0, 0, -1.75f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.05f, 0, 0)
			.setRotationPoint(-53.2f, -15.75f, 3).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.75f, -1, 1, 0.75f, -1, 1, 0.75f, 0, 0, -1.75f, 0, 0, -1.75f, 0, 1, 0.75f, 0, 1, 0.75f, 0, 0, 0.05f, 0, 0)
			.setRotationPoint(-53.2f, -15.75f, -7).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0, 0, -0.3f, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, -1, -0.5f, 0, -1, -1, 0, 0.5f, -1, 0)
			.setRotationPoint(-53.95f, -14.75f, -4).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -2.7f, 0, 0, 2.5f, 0, 0, 1.5f, 0, 0, -2.1f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 1.5f, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(-55.95f, -14.75f, -5).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.55f, 0, 0, 1, 0, 0, 0, 0, 0, -0.95f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-54.2f, -14.75f, -6).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.4f, 0, 0, 1, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-53.45f, -14.75f, -7).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, 0, 1, -1, 0, 0, 0, 0, -0.65f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-52.7f, -14.75f, -8).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, -1, 0, 0.25f, -1, 0, 0.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0.25f, 0, 0, 0.1875f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-52.7f, -14.75f, -9).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -1, 0, 0, -0.3f, 0, 0, -0.1f, 0, 0, 0.5f, -1, 0, -1, -1, 0, -1, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-53.95f, -14.75f, 3).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -2.1f, 0, 0, 1.5f, 0, 0, 2.5f, 0, 0, -2.7f, 0, 0, -1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 0.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-55.95f, -14.75f, 4).setRotationAngle(0, 0, 0).setName("Box 578cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.95f, 0, 0, 0, 0, 0, 1, 0, 0, -1.55f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-54.2f, -14.75f, 5).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, 0, 0, 0, 1, 0, 0, -1.4f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-53.45f, -14.75f, 6).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, 0, 0, 0, 0, 0, 1, -0.125f, 0, -1.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-52.7f, -14.75f, 7).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, 0, 0.25f, 0, 0, 0.25f, -1, 0, -1.25f, -1, 0, -0.5f, 0, 0, 0.1875f, 0, 0, 0.25f, 0, 0, -1.25f, 0, 0)
			.setRotationPoint(-52.7f, -14.75f, 8).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -3, 0, 0, -1, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.45f, -15.75f, -8).setRotationAngle(0, 0, 0).setName("Box 131cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.75f, 0, 0, 0.75f, 0, 0, 0.75f, -1, 1, -1.75f, -1, 1, 0.05f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 1, -1.75f, 0, 1)
			.setRotationPoint(-53.2f, -15.75f, 5).setRotationAngle(0, 0, 0).setName("Box 573cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -1, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0)
			.setRotationPoint(-51.45f, -15.75f, 7).setRotationAngle(0, 0, 0).setName("Box 131cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 154, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-33.499996f, -4.75f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1272cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0.5f, 0, 0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-33.499996f, -16.75f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1273cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.499996f, -15.75f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1274cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.75f, 0.5f, 0, 0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.499996f, -16.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1275cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.499996f, -15.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1276cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-33.499996f, -11.75f, -7.8500004f).setRotationAngle(0, 0, 0).setName("Box 1285cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 18, 0, 0, 0, -4, -2, 0, 0, -2, 0, 0, 0, 0, -4, 0, -0.5f, -4, -2, -0.5f, 0, -2, -0.5f, 0, 0, -0.5f, -4)
			.setRotationPoint(-56.45f, 1.25f, -9).setRotationAngle(0, 0, 0).setName("Box 698")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, -4, 0, -5, 0, 0, 0, 0, 0, 0, -4, 0, -5, -4, -0.5f, -5, 0, -0.5f, 0, 0, -0.5f, 0, -4, -0.5f, -5)
			.setRotationPoint(-61.449993f, 1.25f, -5).setRotationAngle(0, 0, 0).setName("Box 700")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, -3.5f, 0, -5, -0.5f, 0, 0, -0.5f, 0, 0, -3.5f, 0, -5, -4, 0, -5, 0, 0, 0, 0, 0, 0, -4, 0, -5)
			.setRotationPoint(-60.949993f, 1.75f, -5).setRotationAngle(0, 0, 0).setName("Box 701")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 123, textureX, textureY).addBox(0, 0, 0, 1, 2, 4)
			.setRotationPoint(-52.05f, -10.75f, -9.12f).setRotationAngle(0, -37, 0).setName("Box 381cp")
		);
		groups.add(clipboard);
	}

	private final void initGroup_group01(){
		TurboList group01 = new TurboList("group01");
		group01.add(new ModelRendererTurbo(group01, 48, 102, textureX, textureY).addBox(0, 0, 0, 9, 4, 6)
			.setRotationPoint(-18.45f, 1.75f, 3).setRotationAngle(0, 0, 0).setName("Box500")
		);
		group01.add(new ModelRendererTurbo(group01, 486, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-18.45f, 4.25f, -3).setRotationAngle(0, 0, 0).setName("Box501")
		);
		group01.add(new ModelRendererTurbo(group01, 486, 17, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-18.45f, 3.25f, -3).setRotationAngle(0, 0, 0).setName("Box502")
		);
		group01.add(new ModelRendererTurbo(group01, 231, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.45f, 2.25f, -3).setRotationAngle(0, 0, 0).setName("Box503")
		);
		group01.add(new ModelRendererTurbo(group01, 486, 12, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-18.45f, 3.25f, 0).setRotationAngle(0, 0, 0).setName("Box504")
		);
		group01.add(new ModelRendererTurbo(group01, 465, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.45f, 2.25f, 0).setRotationAngle(0, 0, 0).setName("Box505")
		);
		group01.add(new ModelRendererTurbo(group01, 440, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-18.45f, 4.25f, 0).setRotationAngle(0, 0, 0).setName("Box506")
		);
		group01.add(new ModelRendererTurbo(group01, 472, 67, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-7.450001f, 2.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box507")
		);
		group01.add(new ModelRendererTurbo(group01, 214, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.450001f, 2.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box508")
		);
		group01.add(new ModelRendererTurbo(group01, 194, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.450001f, 2.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box509")
		);
		group01.add(new ModelRendererTurbo(group01, 178, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-6.450001f, 3.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box510")
		);
		group01.add(new ModelRendererTurbo(group01, 469, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-7.450001f, 3.5f, -11.15f).setRotationAngle(0, 0, 0).setName("Box511")
		);
		group01.add(new ModelRendererTurbo(group01, 462, 67, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-7.450001f, 2.5f, 10.1f).setRotationAngle(0, 0, 0).setName("Box512")
		);
		group01.add(new ModelRendererTurbo(group01, 15, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-6.450001f, 3.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box513")
		);
		group01.add(new ModelRendererTurbo(group01, 393, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-7.450001f, 3.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box514")
		);
		group01.add(new ModelRendererTurbo(group01, 214, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.450001f, 2.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box515")
		);
		group01.add(new ModelRendererTurbo(group01, 113, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.450001f, 2.5f, 10.15f).setRotationAngle(0, 0, 0).setName("Box516")
		);
		group01.add(new ModelRendererTurbo(group01, 253, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, -1)
			.setRotationPoint(-40.45f, -21.75f, 3).setRotationAngle(0, 0, 0).setName("Box517")
		);
		group01.add(new ModelRendererTurbo(group01, 474, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 4, 0, 1, -1, 0, 0, -1, 0, 0, 0.5f, -3, -1, 0.5f, -3, 1, -1, -3, 0, -1, -3, 0, -1, 0, 1, -1, 0)
			.setRotationPoint(-42.45f, -19.75f, 7).setRotationAngle(0, 0, 0).setName("Box518")
		);
		group01.add(new ModelRendererTurbo(group01, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 4, 1, 0, 0, -1, 3, 0, -1, 3, 0, 0.5f, -3, 0, 0.5f, -3, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-40.45f, -19.75f, 10).setRotationAngle(0, 0, 0).setName("Box519")
		);
		group01.add(new ModelRendererTurbo(group01, 169, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0)
			.setRotationPoint(-43.45f, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box520")
		);
		group01.add(new ModelRendererTurbo(group01, 233, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -1, 0, 0, -0.666f, 0, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.45f, -16.75f, -5).setRotationAngle(0, 0, 0).setName("Box521")
		);
		group01.add(new ModelRendererTurbo(group01, 12, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.45f, -16.75f, -1).setRotationAngle(0, 0, 0).setName("Box522")
		);
		group01.add(new ModelRendererTurbo(group01, 104, 105, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, -0.95f, 0, 0, -0.83299994f, 0, 0, -0.666f, 0, 0, -0.7773f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.45f, -16.75f, -7).setRotationAngle(0, 0, 0).setName("Box523")
		);
		group01.add(new ModelRendererTurbo(group01, 363, 64, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0, -0.67f, 0, 0, 0, 0, 0.167f, 0, 0, 0.05f, 0, 0, 0, -0.67f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.45f, -15.75f, -8).setRotationAngle(0, 0, 0).setName("Box524")
		);
		group01.add(new ModelRendererTurbo(group01, 353, 62, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0, -0.33f, 0, 0.05f, 0, 0, 0.2227f, 0, 0, 0.1113f, 0, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.45f, -15.75f, -7).setRotationAngle(0, 0, 0).setName("Box525")
		);
		group01.add(new ModelRendererTurbo(group01, 507, 59, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0, -1, 0, 0, -0.33f, 0, 0.1113f, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.45f, -15.75f, -7).setRotationAngle(0, 0, 0).setName("Box526")
		);
		group01.add(new ModelRendererTurbo(group01, 353, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -1.325f, 0, 0, -0.67f, 0, 0.05f, 0, 0, 0, 0.33f, 0, 0, -1.325f, 0, 0, -0.67f, 0, 0, 0, 0, 0, 0.33f)
			.setRotationPoint(-50.45f, -15.75f, -7).setRotationAngle(0, 0, 0).setName("Box527")
		);
		group01.add(new ModelRendererTurbo(group01, 500, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -0.2f, 0, 0, 0, 0, 0, -0.6667f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-51.45f, -16.75f, 1).setRotationAngle(0, 0, 0).setName("Box528")
		);
		group01.add(new ModelRendererTurbo(group01, 353, 56, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0.1113f, 0, 0, 0, -0.33f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -1)
			.setRotationPoint(-51.45f, -15.75f, 4).setRotationAngle(0, 0, 0).setName("Box529")
		);
		group01.add(new ModelRendererTurbo(group01, 195, 27, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0.1113f, 0, 0, 0.2227f, 0, 0, 0.05f, 0, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f)
			.setRotationPoint(-50.45f, -15.75f, 4).setRotationAngle(0, 0, 0).setName("Box530")
		);
		group01.add(new ModelRendererTurbo(group01, 48, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7773f, 0, 0, -0.6667f, 0, 0, -0.8333f, 0, 0, -0.95f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.45f, -16.75f, 5).setRotationAngle(0, 0, 0).setName("Box531")
		);
		group01.add(new ModelRendererTurbo(group01, 248, 20, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 0, 1, 0, 0, 0.05f, 0, 0, 0.1667f, 0, 0, 0, 0, 0, 0, -0.67f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.67f)
			.setRotationPoint(-49.45f, -15.75f, 5).setRotationAngle(0, 0, 0).setName("Box532")
		);
		group01.add(new ModelRendererTurbo(group01, 451, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0.33f, 0, 0.05f, 0, 0, 0, -0.67f, 0, 0, -1.325f, 0, 0, 0.33f, 0, 0, 0, 0, 0, -0.67f, 0, 0, -1.325f)
			.setRotationPoint(-50.45f, -15.75f, 6).setRotationAngle(0, 0, 0).setName("Box533")
		);
		group01.add(new ModelRendererTurbo(group01, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.45f, -16.75f, 0).setRotationAngle(0, 0, 0).setName("Box534")
		);
		group01.add(new ModelRendererTurbo(group01, 23, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.6f, 0, -0.8f, 0, 0, -0.6f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.45f, -16.75f, -4).setRotationAngle(0, 0, 0).setName("Box535")
		);
		groups.add(group01);
	}

	ModelBlombergB truck = new ModelBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.modID,"textures/trains/bogies/BlombergB_bogie.png"));
		GL11.glTranslatef(-2.121875f,0,0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glTranslatef(4.3125f, 0, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
