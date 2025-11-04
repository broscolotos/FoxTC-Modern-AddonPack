//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.tender;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelCnOTenderFrontBogie;
import tcmodern.client.render.rollingstock.bogies.ModelCnOTenderRearBogie;
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
public class ModelCnOTender extends FVTMFormatBase {

	public ModelCnOTender(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("Riggs64");
		//
		initGroup_Tender();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Tender(){
		TurboList Tender = new TurboList("Tender");
		Tender.add(new ModelRendererTurbo(Tender, 139, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 21, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-16, -19, 12.5f).setRotationAngle(0, 0, 0).setName("Box 1165")
		);
		Tender.add(new ModelRendererTurbo(Tender, 231, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-48.5f, 1.5f, 12.5f).setRotationAngle(0, 0, 0).setName("Box 1456")
		);
		Tender.add(new ModelRendererTurbo(Tender, 109, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-1, -25.5f, 12.5f).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		Tender.add(new ModelRendererTurbo(Tender, 378, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 7, 1, 0, 0, -4.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -4.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-16, -25.5f, 12.5f).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		Tender.add(new ModelRendererTurbo(Tender, 406, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 26, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-48, -21, -13).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		Tender.add(new ModelRendererTurbo(Tender, 347, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 28, 0, 0, 0, -1, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -1, 0, -0.5f, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -1)
			.setRotationPoint(-49, 1.5f, -14).setRotationAngle(0, 0, 0).setName("Box 412")
		);
		Tender.add(new ModelRendererTurbo(Tender, 232, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 47, 1, 25, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, -0.5f, 0)
			.setRotationPoint(-48, -20.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1218")
		);
		Tender.add(new ModelRendererTurbo(Tender, 308, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48, -21, 12).setRotationAngle(0, 0, 0).setName("Box 417")
		);
		Tender.add(new ModelRendererTurbo(Tender, 438, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -21, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1473")
		);
		Tender.add(new ModelRendererTurbo(Tender, 378, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-37.5f, -21, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1474")
		);
		Tender.add(new ModelRendererTurbo(Tender, 356, 130, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-46, 3, 12.5f).setRotationAngle(0, -90, 0).setName("Box 571")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 110, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-46.5f, 5.25f, 13).setRotationAngle(0, -90, 0).setName("Box 572")
		);
		Tender.add(new ModelRendererTurbo(Tender, 351, 130, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-48, 3, 12.5f).setRotationAngle(0, -90, 0).setName("Box 573")
		);
		Tender.add(new ModelRendererTurbo(Tender, 398, 109, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-46.5f, 7, 13).setRotationAngle(0, -90, 0).setName("Box 574")
		);
		Tender.add(new ModelRendererTurbo(Tender, 391, 109, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.05f, 2, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-47.25f, -22.5f, 12.5f).setRotationAngle(0, -135, 0).setName("Box 624")
		);
		Tender.add(new ModelRendererTurbo(Tender, 362, 109, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.05f, 2, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-47.25f, -1.5f, 12.5f).setRotationAngle(0, -135, 0).setName("Box 625")
		);
		Tender.add(new ModelRendererTurbo(Tender, 69, 131, textureX, textureY)
			.addShapeBox(0.75f, 0, -0.05f, 1, 22, 1, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-47.25f, -22.5f, 12.5f).setRotationAngle(0, -135, 0).setName("Box 627")
		);
		Tender.add(new ModelRendererTurbo(Tender, 355, 109, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-46.5f, 3.25f, 13).setRotationAngle(0, -90, 0).setName("Box 608")
		);
		Tender.add(new ModelRendererTurbo(Tender, 493, 129, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-35.5f, -21.150002f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 633")
		);
		Tender.add(new ModelRendererTurbo(Tender, 455, 129, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-28, -21.150002f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		Tender.add(new ModelRendererTurbo(Tender, 450, 129, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14, -21.150002f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 635")
		);
		Tender.add(new ModelRendererTurbo(Tender, 445, 129, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-20.5f, -21.150002f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 636")
		);
		Tender.add(new ModelRendererTurbo(Tender, 29, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 7, 1, 0, 0, -4.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -4.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-16, -25.5f, -13).setRotationAngle(0, 0, 0).setName("Box 409")
		);
		Tender.add(new ModelRendererTurbo(Tender, 435, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 23, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-48, -21, -13).setRotationAngle(0, 0, 0).setName("Box 410")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 21, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16, -19, -13.5f).setRotationAngle(0, 0, 0).setName("Box 418")
		);
		Tender.add(new ModelRendererTurbo(Tender, 380, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.5f, -22.5f, 5).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		Tender.add(new ModelRendererTurbo(Tender, 366, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -1, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -1, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49.5f, -23, 5.5f).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		Tender.add(new ModelRendererTurbo(Tender, 278, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 1, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -21, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1475")
		);
		Tender.add(new ModelRendererTurbo(Tender, 435, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-32.5f, -22.25f, -3).setRotationAngle(0, -90, 0).setName("Box 1480")
		);
		Tender.add(new ModelRendererTurbo(Tender, 328, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-35.5f, -21.75f, -3).setRotationAngle(0, -90, 0).setName("Box 1481")
		);
		Tender.add(new ModelRendererTurbo(Tender, 175, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-32.5f, -21.75f, -3).setRotationAngle(0, -90, 0).setName("Box 1482")
		);
		Tender.add(new ModelRendererTurbo(Tender, 165, 129, textureX, textureY)
			.addShapeBox(-0.75f, 0, -0.05f, 1, 3, 1, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-47.25f, -22.5f, 12.5f).setRotationAngle(0, -135, 0).setName("Box 629")
		);
		Tender.add(new ModelRendererTurbo(Tender, 272, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-28.5f, -21.75f, -3).setRotationAngle(0, -90, 0).setName("Box 624")
		);
		Tender.add(new ModelRendererTurbo(Tender, 248, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-25.5f, -21.75f, -3).setRotationAngle(0, -90, 0).setName("Box 625")
		);
		Tender.add(new ModelRendererTurbo(Tender, 137, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-25.5f, -22.25f, -3).setRotationAngle(0, -90, 0).setName("Box 626")
		);
		Tender.add(new ModelRendererTurbo(Tender, 466, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-14.5f, -21.75f, -3).setRotationAngle(0, -90, 0).setName("Box 627")
		);
		Tender.add(new ModelRendererTurbo(Tender, 399, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-11.5f, -21.75f, -3).setRotationAngle(0, -90, 0).setName("Box 628")
		);
		Tender.add(new ModelRendererTurbo(Tender, 126, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-11.5f, -22.25f, -3).setRotationAngle(0, -90, 0).setName("Box 629")
		);
		Tender.add(new ModelRendererTurbo(Tender, 390, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-21.5f, -21.75f, -3).setRotationAngle(0, -90, 0).setName("Box 630")
		);
		Tender.add(new ModelRendererTurbo(Tender, 69, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-18.5f, -22.25f, -3).setRotationAngle(0, -90, 0).setName("Box 631")
		);
		Tender.add(new ModelRendererTurbo(Tender, 385, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-18.5f, -21.75f, -3).setRotationAngle(0, -90, 0).setName("Box 632")
		);
		Tender.add(new ModelRendererTurbo(Tender, 198, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 22, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-49, -22.5f, 5).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		Tender.add(new ModelRendererTurbo(Tender, 376, 127, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f)
			.setRotationPoint(-51.5f, 5.25f, 1.4000001f).setRotationAngle(0, 0, 0).setName("Box 1427")
		);
		Tender.add(new ModelRendererTurbo(Tender, 361, 127, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-51.5f, 3.25f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1428")
		);
		Tender.add(new ModelRendererTurbo(Tender, 356, 127, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1.5f, 0, -0.5f, 2, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 2, -0.5f, -0.5f)
			.setRotationPoint(-49, 2.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1429")
		);
		Tender.add(new ModelRendererTurbo(Tender, 84, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-50.5f, -0.5f, -9).setRotationAngle(0, 0, 0).setName("Box 1430")
		);
		Tender.add(new ModelRendererTurbo(Tender, 351, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, 1, -0.5f, 0, -1.5f, 0, 0, -1.5f, 0, -0.5f, 1, -0.5f, -0.5f)
			.setRotationPoint(-49, 0.5f, -9).setRotationAngle(0, 0, 0).setName("Box 1433")
		);
		Tender.add(new ModelRendererTurbo(Tender, 346, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-50.5f, 0, -0.25f).setRotationAngle(0, 0, 0).setName("Box 1436")
		);
		Tender.add(new ModelRendererTurbo(Tender, 411, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-49.009995f, 1.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1437")
		);
		Tender.add(new ModelRendererTurbo(Tender, 231, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, -0.5f, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -1, 0, 0, -1, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -1)
			.setRotationPoint(-49, -11, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1510")
		);
		Tender.add(new ModelRendererTurbo(Tender, 341, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -11, -5).setRotationAngle(0, 0, 0).setName("Box 1511")
		);
		Tender.add(new ModelRendererTurbo(Tender, 27, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-49, -19.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 502")
		);
		Tender.add(new ModelRendererTurbo(Tender, 333, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -10.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		Tender.add(new ModelRendererTurbo(Tender, 305, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -10.5f, 8).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		Tender.add(new ModelRendererTurbo(Tender, 262, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -7.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		Tender.add(new ModelRendererTurbo(Tender, 257, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -7.5f, 8).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		Tender.add(new ModelRendererTurbo(Tender, 193, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		Tender.add(new ModelRendererTurbo(Tender, 188, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		Tender.add(new ModelRendererTurbo(Tender, 183, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -1.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		Tender.add(new ModelRendererTurbo(Tender, 170, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -1.5f, 8).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		Tender.add(new ModelRendererTurbo(Tender, 147, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49.5f, -10.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		Tender.add(new ModelRendererTurbo(Tender, 421, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49.5f, -7.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49.5f, -4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		Tender.add(new ModelRendererTurbo(Tender, 177, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49.5f, -2, 5.5f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		Tender.add(new ModelRendererTurbo(Tender, 343, 109, textureX, textureY)
			.addShapeBox(0.5f, 0, -0.05f, 2, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-47, -1.5f, -11.75f).setRotationAngle(0, -224, 0).setName("Box 641")
		);
		Tender.add(new ModelRendererTurbo(Tender, 22, 129, textureX, textureY)
			.addShapeBox(1.5f, 0, -0.05f, 1, 22, 1, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-47, -22.5f, -11.75f).setRotationAngle(0, -224, 0).setName("Box 642")
		);
		Tender.add(new ModelRendererTurbo(Tender, 147, 127, textureX, textureY)
			.addShapeBox(0, 0, -0.05f, 1, 3, 1, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-47, -22.5f, -11.75f).setRotationAngle(0, -224, 0).setName("Box 643")
		);
		Tender.add(new ModelRendererTurbo(Tender, 336, 108, textureX, textureY)
			.addShapeBox(0.5f, 0, -0.05f, 2, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-47, -22.5f, -11.75f).setRotationAngle(0, -224, 0).setName("Box 644")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-48.5f, 1.5f, -13).setRotationAngle(0, 0, 0).setName("Box 1163")
		);
		Tender.add(new ModelRendererTurbo(Tender, 139, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -19.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1200")
		);
		Tender.add(new ModelRendererTurbo(Tender, 125, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -19.5f, 8).setRotationAngle(0, 0, 0).setName("Box 1201")
		);
		Tender.add(new ModelRendererTurbo(Tender, 93, 96, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(-51, 2.1499996f, -1).setRotationAngle(0, 0, 0).setName("Box 1426")
		);
		Tender.add(new ModelRendererTurbo(Tender, 120, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, 1, -0.5f, 0, -1.5f, 0, 0, -1.5f, 0, -0.5f, 1, -0.5f, -0.5f)
			.setRotationPoint(-49, 0.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1431")
		);
		Tender.add(new ModelRendererTurbo(Tender, 115, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-50.5f, 0, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1432")
		);
		Tender.add(new ModelRendererTurbo(Tender, 10, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-50.5f, 0, -9).setRotationAngle(0, 0, 0).setName("Box 1434")
		);
		Tender.add(new ModelRendererTurbo(Tender, 220, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-49.009995f, 1.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1435")
		);
		Tender.add(new ModelRendererTurbo(Tender, 207, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, -1, -1, 0, -1, -1, 0, 0, 0.25f, 0)
			.setRotationPoint(-49.25f, 1.2600002f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1438")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-49.25f, 1.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1439")
		);
		Tender.add(new ModelRendererTurbo(Tender, 493, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-49.25f, 3.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1440")
		);
		Tender.add(new ModelRendererTurbo(Tender, 455, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(-49.25f, 1.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1441")
		);
		Tender.add(new ModelRendererTurbo(Tender, 450, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(-49.25f, 1.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1442")
		);
		Tender.add(new ModelRendererTurbo(Tender, 328, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(-49.25f, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1444")
		);
		Tender.add(new ModelRendererTurbo(Tender, 191, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f)
			.setRotationPoint(-49.009995f, 4, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1445")
		);
		Tender.add(new ModelRendererTurbo(Tender, 252, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.2f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(-49.25f, 4, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1446")
		);
		Tender.add(new ModelRendererTurbo(Tender, 221, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, -0.2f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(-49.25f, 4, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1447")
		);
		Tender.add(new ModelRendererTurbo(Tender, 243, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -11, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1512")
		);
		Tender.add(new ModelRendererTurbo(Tender, 157, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -16.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 503")
		);
		Tender.add(new ModelRendererTurbo(Tender, 315, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -16.5f, 8).setRotationAngle(0, 0, 0).setName("Box 504")
		);
		Tender.add(new ModelRendererTurbo(Tender, 310, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -13.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		Tender.add(new ModelRendererTurbo(Tender, 297, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-48.5f, -13.5f, 8).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		Tender.add(new ModelRendererTurbo(Tender, 84, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49.5f, -19, 5.5f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		Tender.add(new ModelRendererTurbo(Tender, 419, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49.5f, -16.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		Tender.add(new ModelRendererTurbo(Tender, 280, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49.5f, -13.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		Tender.add(new ModelRendererTurbo(Tender, 231, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-48.5f, 1.5f, -14).setRotationAngle(0, 0, 0).setName("Box 406")
		);
		Tender.add(new ModelRendererTurbo(Tender, 325, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-46.5f, 5.25f, -13.5f).setRotationAngle(0, -90, 0).setName("Box 609")
		);
		Tender.add(new ModelRendererTurbo(Tender, 315, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-46.5f, 7, -13.5f).setRotationAngle(0, -90, 0).setName("Box 610")
		);
		Tender.add(new ModelRendererTurbo(Tender, 134, 126, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-46, 3, -14).setRotationAngle(0, -90, 0).setName("Box 611")
		);
		Tender.add(new ModelRendererTurbo(Tender, 308, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-46.5f, 3.25f, -13.5f).setRotationAngle(0, -90, 0).setName("Box 612")
		);
		Tender.add(new ModelRendererTurbo(Tender, 488, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-48, 3, -14).setRotationAngle(0, -90, 0).setName("Box 613")
		);
		Tender.add(new ModelRendererTurbo(Tender, 324, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 3, 9, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.75f, -6.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		Tender.add(new ModelRendererTurbo(Tender, 278, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 3, 9, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.25f, -6.5f, -12.25f).setRotationAngle(0, -90, 0).setName("Box 515")
		);
		Tender.add(new ModelRendererTurbo(Tender, 352, 10, textureX, textureY).addBox(0, 0, 0, 45, 24, 25)
			.setRotationPoint(-0.5f, -23, -12.5f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		Tender.add(new ModelRendererTurbo(Tender, 213, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-1, -25.5f, -13).setRotationAngle(0, 0, 0).setName("Box 404")
		);
		Tender.add(new ModelRendererTurbo(Tender, 55, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 28, 26, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-1, -25.5f, -13).setRotationAngle(0, 0, 0).setName("Box 408")
		);
		Tender.add(new ModelRendererTurbo(Tender, 266, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0, -6.5f, 0, 0, -6.5f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(45, -25.5f, -13).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		Tender.add(new ModelRendererTurbo(Tender, 213, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 3, 9, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.75f, -6.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		Tender.add(new ModelRendererTurbo(Tender, 102, 58, textureX, textureY).addBox(0, 0, 0, 46, 5, 9)
			.setRotationPoint(-0.75f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 51, textureX, textureY).addBox(0, 0, 0, 46, 5, 9)
			.setRotationPoint(-0.75f, -3.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 66, textureX, textureY).addBox(0, 0, 0, 46, 1, 8)
			.setRotationPoint(-0.75f, 0.5f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		Tender.add(new ModelRendererTurbo(Tender, 161, 82, textureX, textureY).addBox(0, 0, 0, 8, 4, 9)
			.setRotationPoint(8.25f, -3.5f, -4.25f).setRotationAngle(0, -90, 0).setName("Box 517")
		);
		Tender.add(new ModelRendererTurbo(Tender, 176, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 28, 0, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, -0.5f, -0.5f)
			.setRotationPoint(53.5f, 1.5f, -14).setRotationAngle(0, 0, 0).setName("Box 413")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 26, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(44.5f, -25.5f, -13).setRotationAngle(0, 0, 0).setName("Box 409")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(51.5f, -19, -12.5f).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		Tender.add(new ModelRendererTurbo(Tender, 423, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 21, 1, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(45, -19, 5.5f).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		Tender.add(new ModelRendererTurbo(Tender, 488, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(44.5f, -19, 4.5f).setRotationAngle(0, 0, 0).setName("Box 413")
		);
		Tender.add(new ModelRendererTurbo(Tender, 493, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 8, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(44.5f, -19, -12).setRotationAngle(0, 0, 0).setName("Box 414")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45, -18.849998f, -12).setRotationAngle(0, 0, 0).setName("Box 416")
		);
		Tender.add(new ModelRendererTurbo(Tender, 210, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 25, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(44.5f, -6.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 420")
		);
		Tender.add(new ModelRendererTurbo(Tender, 301, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.5f, -0.5f, -0.5f, -1.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(44.5f, -19, 3).setRotationAngle(0, 0, 0).setName("Box 421")
		);
		Tender.add(new ModelRendererTurbo(Tender, 285, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1.5f, 0, -0.5f, -1.5f)
			.setRotationPoint(44.5f, -19, -5).setRotationAngle(0, 0, 0).setName("Box 422")
		);
		Tender.add(new ModelRendererTurbo(Tender, 17, 129, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 16, 1, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(50, -16.5f, -14).setRotationAngle(0, -90, 0).setName("Box 499")
		);
		Tender.add(new ModelRendererTurbo(Tender, 292, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(50, -1.5f, -13.5f).setRotationAngle(0, -90, 0).setName("Box 500")
		);
		Tender.add(new ModelRendererTurbo(Tender, 287, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(50, -16.5f, -13.5f).setRotationAngle(0, -90, 0).setName("Box 501")
		);
		Tender.add(new ModelRendererTurbo(Tender, 426, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -19, -11.5f).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		Tender.add(new ModelRendererTurbo(Tender, 138, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(41.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		Tender.add(new ModelRendererTurbo(Tender, 129, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(43.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		Tender.add(new ModelRendererTurbo(Tender, 110, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(39.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		Tender.add(new ModelRendererTurbo(Tender, 336, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(37.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		Tender.add(new ModelRendererTurbo(Tender, 319, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(35.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		Tender.add(new ModelRendererTurbo(Tender, 310, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(33.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		Tender.add(new ModelRendererTurbo(Tender, 301, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(31.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 532")
		);
		Tender.add(new ModelRendererTurbo(Tender, 286, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(29.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		Tender.add(new ModelRendererTurbo(Tender, 277, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(27.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		Tender.add(new ModelRendererTurbo(Tender, 247, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(25.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		Tender.add(new ModelRendererTurbo(Tender, 238, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(23.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		Tender.add(new ModelRendererTurbo(Tender, 468, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(21.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		Tender.add(new ModelRendererTurbo(Tender, 71, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(19.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		Tender.add(new ModelRendererTurbo(Tender, 62, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(17.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		Tender.add(new ModelRendererTurbo(Tender, 10, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(15.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		Tender.add(new ModelRendererTurbo(Tender, 480, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(13.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 541")
		);
		Tender.add(new ModelRendererTurbo(Tender, 503, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(11.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		Tender.add(new ModelRendererTurbo(Tender, 454, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(9.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 543")
		);
		Tender.add(new ModelRendererTurbo(Tender, 139, 28, textureX, textureY).addBox(0, 0, 0, 37, 1, 1)
			.setRotationPoint(7.5f, -2, -0.5f).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		Tender.add(new ModelRendererTurbo(Tender, 471, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(53.25f, 3, -14).setRotationAngle(0, -90, 0).setName("Box 614")
		);
		Tender.add(new ModelRendererTurbo(Tender, 323, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(51.25f, 3, -14).setRotationAngle(0, -90, 0).setName("Box 615")
		);
		Tender.add(new ModelRendererTurbo(Tender, 278, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52.75f, 3.25f, -13.5f).setRotationAngle(0, -90, 0).setName("Box 616")
		);
		Tender.add(new ModelRendererTurbo(Tender, 271, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52.75f, 5.25f, -13.5f).setRotationAngle(0, -90, 0).setName("Box 617")
		);
		Tender.add(new ModelRendererTurbo(Tender, 183, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52.75f, 7, -13.5f).setRotationAngle(0, -90, 0).setName("Box 618")
		);
		Tender.add(new ModelRendererTurbo(Tender, 406, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 21, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(45, -19, -6).setRotationAngle(0, 0, 0).setName("Box 412")
		);
		Tender.add(new ModelRendererTurbo(Tender, 282, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52, -3.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 1469")
		);
		Tender.add(new ModelRendererTurbo(Tender, 277, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52, -14.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 1470")
		);
		Tender.add(new ModelRendererTurbo(Tender, 498, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(52, -14.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 1471")
		);
		Tender.add(new ModelRendererTurbo(Tender, 149, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(47.5f, -20.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -19, -10.5f).setRotationAngle(0, 0, 0).setName("Box 524")
		);
		Tender.add(new ModelRendererTurbo(Tender, 356, 124, textureX, textureY).addBox(0, 0, 0, 3, 5, 13)
			.setRotationPoint(50.5f, -3.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 598")
		);
		Tender.add(new ModelRendererTurbo(Tender, 292, 90, textureX, textureY).addBox(0, 0, 0, 2, 1, 4)
			.setRotationPoint(51.5f, 0.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		Tender.add(new ModelRendererTurbo(Tender, 272, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(47.5f, -19.75f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		Tender.add(new ModelRendererTurbo(Tender, 230, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(47.5f, -19.75f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		Tender.add(new ModelRendererTurbo(Tender, 389, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 7, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(51.5f, -19, 5.5f).setRotationAngle(0, 0, 0).setName("Box 410")
		);
		Tender.add(new ModelRendererTurbo(Tender, 468, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(44.5f, -7, -4.5f).setRotationAngle(0, 0, 0).setName("Box 417")
		);
		Tender.add(new ModelRendererTurbo(Tender, 352, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 11, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51, -6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 419")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(51.25f, -6.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 423")
		);
		Tender.add(new ModelRendererTurbo(Tender, 231, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.05f, 0, 0, 0, 0, 0, -1, 0, 0, -0.05f, 0, 0, -0.05f, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.05f, -0.5f, 0)
			.setRotationPoint(44.5f, -7, 4.5f).setRotationAngle(0, 0, 0).setName("Box 424")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.05f, 0, 0, -1, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, -0.05f, -0.5f, 0)
			.setRotationPoint(44.5f, -7, -5.5f).setRotationAngle(0, 0, 0).setName("Box 425")
		);
		Tender.add(new ModelRendererTurbo(Tender, 440, 126, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 16, 1, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(50, -16.5f, 13).setRotationAngle(0, -90, 0).setName("Box 1459")
		);
		Tender.add(new ModelRendererTurbo(Tender, 175, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(50, -1.5f, 13).setRotationAngle(0, -90, 0).setName("Box 1461")
		);
		Tender.add(new ModelRendererTurbo(Tender, 165, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(50, -16.5f, 13).setRotationAngle(0, -90, 0).setName("Box 1462")
		);
		Tender.add(new ModelRendererTurbo(Tender, 102, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(47, -19, -7.5f).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		Tender.add(new ModelRendererTurbo(Tender, 84, 81, textureX, textureY).addBox(0, 0, 0, 4, 3, 3)
			.setRotationPoint(53.5f, -3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 546")
		);
		Tender.add(new ModelRendererTurbo(Tender, 152, 125, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(53.25f, 3, 12.5f).setRotationAngle(0, -90, 0).setName("Box 619")
		);
		Tender.add(new ModelRendererTurbo(Tender, 148, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52.75f, 3.25f, 13).setRotationAngle(0, -90, 0).setName("Box 620")
		);
		Tender.add(new ModelRendererTurbo(Tender, 483, 124, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(51.25f, 3, 12.5f).setRotationAngle(0, -90, 0).setName("Box 621")
		);
		Tender.add(new ModelRendererTurbo(Tender, 141, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52.75f, 5.25f, 13).setRotationAngle(0, -90, 0).setName("Box 622")
		);
		Tender.add(new ModelRendererTurbo(Tender, 117, 108, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52.75f, 7, 13).setRotationAngle(0, -90, 0).setName("Box 623")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(45, -18.849998f, 6).setRotationAngle(0, 0, 0).setName("Box 415")
		);
		Tender.add(new ModelRendererTurbo(Tender, 507, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(52, -14.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 1466")
		);
		Tender.add(new ModelRendererTurbo(Tender, 161, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(47.5f, -20.25f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -19, 6.5f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		Tender.add(new ModelRendererTurbo(Tender, 464, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -19, 7.5f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		Tender.add(new ModelRendererTurbo(Tender, 278, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(47, -19, 10.5f).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		Tender.add(new ModelRendererTurbo(Tender, 66, 88, textureX, textureY).addBox(0, 0, 0, 2, 1, 4)
			.setRotationPoint(51.5f, 0.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		Tender.add(new ModelRendererTurbo(Tender, 466, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(47.5f, -19.75f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		Tender.add(new ModelRendererTurbo(Tender, 399, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(47.5f, -19.75f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		Tender.add(new ModelRendererTurbo(Tender, 391, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(51.5f, -14.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 646")
		);
		Tender.add(new ModelRendererTurbo(Tender, 386, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(51.5f, -3.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		Tender.add(new ModelRendererTurbo(Tender, 500, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0, -6.5f, 0, 0, -6.5f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(45, -25.5f, 12.5f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		Tender.add(new ModelRendererTurbo(Tender, 56, 81, textureX, textureY).addBox(0, 0, 0, 5, 1, 3)
			.setRotationPoint(4.5f, 3, 0).setRotationAngle(0, 0, 0).setName("Box 1485")
		);
		Tender.add(new ModelRendererTurbo(Tender, 84, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(4.5f, 4, 0).setRotationAngle(0, 0, 0).setName("Box 1486")
		);
		Tender.add(new ModelRendererTurbo(Tender, 204, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, 2, 0).setRotationAngle(0, 0, 0).setName("Box 1487")
		);
		Tender.add(new ModelRendererTurbo(Tender, 207, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-3.5f, 4, -2).setRotationAngle(0, 0, 0).setName("Box 1491")
		);
		Tender.add(new ModelRendererTurbo(Tender, 56, 76, textureX, textureY).addBox(0, 0, 0, 7, 1, 3)
			.setRotationPoint(-3.5f, 3, -2).setRotationAngle(0, 0, 0).setName("Box 1492")
		);
		Tender.add(new ModelRendererTurbo(Tender, 352, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, 2, -2).setRotationAngle(0, 0, 0).setName("Box 1493")
		);
		Tender.add(new ModelRendererTurbo(Tender, 278, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-10.25f, 2, 1.25f).setRotationAngle(0, 0, 0).setName("Box 1494")
		);
		Tender.add(new ModelRendererTurbo(Tender, 278, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-10.25f, 2, -0.75f).setRotationAngle(0, 0, 0).setName("Box 1495")
		);
		Tender.add(new ModelRendererTurbo(Tender, 381, 124, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 3, null)
			.setRotationPoint(-49, -18, 0).setRotationAngle(0, 0, 0)
		);
		Tender.add(new ModelRendererTurbo(Tender, 0, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1).setLength(1).setSegments(8, 4).setScale(1, 1).setDirection(3)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-50, -18, 0).setRotationAngle(-90, 0, 0)
		);
		Tender.add(new ModelRendererTurbo(Tender, 203, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 56, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 26.02f, 0, 0, 26.02f, 0, 0, 0, 0, 0, 0, 0, 0, 26.02f, 0, 0, 26.02f)
			.setRotationPoint(-30, -16, -13.01f).setRotationAngle(0, 0, 0)
		);
		Tender.add(new ModelRendererTurbo(Tender, 494, 77, textureX, textureY).addBox(0, 0, 0, 0, 2, 8)
			.setRotationPoint(-48.020004f, -14, -4).setRotationAngle(0, 0, 0).setName("Box 608cp")
		);
		groups.add(Tender);
	}


	ModelCnOTenderFrontBogie bogieF = new ModelCnOTenderFrontBogie();
	ModelCnOTenderRearBogie bogieR = new ModelCnOTenderRearBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		/*int cargo = ((EntityNYC40ft3inTender) entity).getAmmountOfCargo();
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
		}*/
		GL11.glPushMatrix();
		bogieF.render(entity, f, f1, f2, f3, f4, f5);
		bogieR.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

}
