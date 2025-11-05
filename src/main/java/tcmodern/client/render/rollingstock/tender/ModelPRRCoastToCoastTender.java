//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.tender;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelCoastToCoastTenderBogie;
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
public class ModelPRRCoastToCoastTender extends FVTMFormatBase {

	public ModelPRRCoastToCoastTender(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_T1_CTC_Tender();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_T1_CTC_Tender(){
		TurboList T1_CTC_Tender = new TurboList("T1_CTC_Tender");
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 235, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 116, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-60, -18.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 389, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 22, 22, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(56, -17, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 127, 86, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(22).setSegments(8, 2).setScale(1.5f, 1.5f).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(56, -17, -11).setRotationAngle(0, 0, 180)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 174, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 6, 20, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.5f, -0.5f, -10).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 461, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 20, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(57.5f, 6, -10).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 116, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-60, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 236, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 25, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60, -18.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 127, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 20, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.25f, -18.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 221, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 25, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60, -18.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 452, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 20, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.75f, -18.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 42, 19, 21, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.75f, -17.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 449, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 21, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-59.5f, -4.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-60, -4.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 140, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -18.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 327, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.75f, -18.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 314, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37.5f, -18.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 301, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.75f, -19.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 463, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(25.75f, -20.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.75f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 486, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(38.5f, -20.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 456, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 501, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(54, -20.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 153, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 451, 84, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(3).setSegments(8, 4).setScale(1.5f, 1.5f).setDirection(3)
			.setTopOffset(new Vec3f(0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(13.75f, -19.5f, 0).setRotationAngle(-90, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 434, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(17.75f, -17.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 500, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.25f, -18, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 446, 84, textureX, textureY).addCylinder(0, 0, 0, 1, 9, 8, 1.5f, 1.5f, 3, null)
			.setRotationPoint(13.75f, -19, 3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 441, 84, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.5f, 1.40625f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(22.75f, -19, 3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 436, 84, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.40625f, 1.125f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(23, -19, 3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 431, 84, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 0, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(23.25f, -19, 3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 426, 84, textureX, textureY).addCylinder(0, 0, 0, 1, 9, 8, 1.5f, 1.5f, 3, null)
			.setRotationPoint(13.75f, -19, -3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 406, 84, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.5f, 1.40625f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(22.75f, -19, -3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 401, 84, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.40625f, 1.125f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(23, -19, -3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 277, 84, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 0, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(23.25f, -19, -3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 402, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(24.875f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 491, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.375f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(24.375f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 486, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(23.875f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 310, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f)
			.setRotationPoint(23.875f, -21.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 272, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(23.75f, -20.375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 506, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.25f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(56.875f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 501, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f)
			.setRotationPoint(57.375f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 507, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f)
			.setRotationPoint(57.375f, -21.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 421, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f)
			.setRotationPoint(57.5f, -20.375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 434, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(32.125f, -18.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 402, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -19.25f, 7).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 402, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(32.125f, -18.5f, -10.125f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 470, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -19.25f, -10).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 432, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, -19.5f, 7.125f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 470, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, -19.5f, -8.125f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 480, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.75f, -0.5f, -0.375f, -0.75f, -0.25f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.25f, -0.375f)
			.setRotationPoint(56.375f, -21.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 506, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.625f, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(56.625f, -21.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 497, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.875f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, -0.875f, -0.25f, -0.375f)
			.setRotationPoint(56.625f, -21.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 416, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(56.75f, -20.375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 306, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.625f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.25f, -0.625f, -0.375f, -0.25f, -0.125f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.125f, -0.375f)
			.setRotationPoint(55.75f, -21.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 301, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.25f, -0.875f, -0.375f, -0.25f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.25f, -0.125f, -0.375f)
			.setRotationPoint(55.5f, -21.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 334, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f)
			.setRotationPoint(55.5f, -21.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 329, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(56.25f, -21.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 500, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(54.875f, -20.375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 324, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.75f, -0.5f, -0.375f, -0.75f, -0.25f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.25f, -0.375f)
			.setRotationPoint(56.375f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 319, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.625f, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(56.625f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 150, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.875f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, -0.875f, -0.25f, -0.375f)
			.setRotationPoint(56.625f, -21.125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 507, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(56.75f, -20.375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 324, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.625f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.25f, -0.625f, -0.375f, -0.25f, -0.125f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.125f, -0.375f)
			.setRotationPoint(55.75f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 311, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.25f, -0.875f, -0.375f, -0.25f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.25f, -0.125f, -0.375f)
			.setRotationPoint(55.5f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f)
			.setRotationPoint(55.5f, -21.125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 459, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, 0, -0.25f, -0.375f)
			.setRotationPoint(56.25f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 164, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(54.875f, -20.375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 314, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(57.125f, -19.9375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 490, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(57.125f, -17.1875f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 312, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(57.125f, -14.4375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 497, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(57.125f, -11.6875f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 503, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(57.125f, -8.9375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 173, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(57.125f, -6.1875f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 501, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(57.125f, -3.4375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 161, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 6, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-51.25f, -4.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 498, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60, 0.5f, -1).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 483, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-60, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 454, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-52, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 449, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-51, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 444, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -1, 0, 0, -1, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-50, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 483, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-60, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 439, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-52, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 466, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-51, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 477, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -1, 0, 0, -1, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-50, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 472, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, -1.75f, 0.25f, 0, -1.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 5, 0, -0.75f, 5, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(13.75f, -20.5f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 151cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 501, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, -3.25f, -1, 0.5f, -3.25f, -1, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, -3.75f)
			.setRotationPoint(13.75f, -23, -8).setRotationAngle(0, 0, 0).setName("Box 145cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 461, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -1.75f, 0, 0, -1.75f, 0, 0, -0.75f, 5, 0, -0.75f, 5, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(13.75f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 151cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 301, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, -1.75f, 0, -0.25f, -1.75f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -2.75f, 0, 0, -2.75f)
			.setRotationPoint(13.75f, -22.25f, -9).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 153, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.25f, -1, -0.25f, -0.25f, -1, -0.25f, -0.25f, -1.75f, 0, -0.25f, -1.75f, 0, 0, 0, 1.25f, 0, 0, 1.25f, 0, -2.75f, 0, 0, -2.75f)
			.setRotationPoint(13.75f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 490, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.25f, -0.75f, -1, 0.25f, -0.75f, -1, 0.5f, -3.25f, 0, 0.5f, -3.25f, 0, 0, -3.75f, 0, 0, -3.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.75f, -23, 4).setRotationAngle(0, 0, 0).setName("Box 145cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 301, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, -1.75f, 0, -0.25f, -1.75f, 0, -0.25f, -1, 0, -0.25f, -1, 0, 0, -2.75f, 0.75f, 0, -2.75f, 0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.75f, -22.25f, 6).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 469, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.25f, -1.75f, -0.25f, -0.25f, -1.75f, -0.25f, -0.25f, -1, 0, -0.25f, -1, 0, 0, -2.75f, 1.25f, 0, -2.75f, 1.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.75f, -21.5f, 7).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 158, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 2, 3, 0, 0, -0.5f, -2, -0.25f, -0.5f, -2, -0.25f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -2.75f, 0, 0, -2.75f)
			.setRotationPoint(-60, -22.5f, -10).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 161, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 1, 4, 0, 0, 0.5f, -3.25f, -0.25f, 0.5f, -3.25f, -0.25f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -3.75f, 0, 0, -3.75f)
			.setRotationPoint(-60, -23, -8).setRotationAngle(0, 0, 0).setName("Box 145cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 2, 2, 0, 0, 0, -1.75f, -0.25f, 0, -1.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -1, 0, 0, -1)
			.setRotationPoint(-60, -20.5f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 151cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 318, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 2, 3, 0, 0, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -2, 0, -0.5f, -2, 0, 0, -2.75f, -0.25f, 0, -2.75f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -22.5f, 7).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 322, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 1, 4, 0, 0, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f, 0.5f, -3.25f, 0, 0.5f, -3.25f, 0, 0, -3.75f, -0.25f, 0, -3.75f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -23, 4).setRotationAngle(0, 0, 0).setName("Box 145cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 313, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 2, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.75f, 0, 0, -1.75f, 0, 0, -1, -0.25f, 0, -1, -0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-60, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 151cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 301, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 10, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(7.75f, -24, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 140, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 10, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(7.75f, -23.5f, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 163, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 3, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.75f, -23.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 461, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(7.75f, -22, -9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 488, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.75f, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 461, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.75f, -23.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 324, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(7.75f, -22, 7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 324, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.75f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 288, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.25f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 272, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-51.25f, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 16, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.25f, -18.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 322, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-51.25f, -20.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 137, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 2, 0, -0.5f, 2, 0, -0.5f, 1.5f, 0, -0.5f, 1.5f)
			.setRotationPoint(-51.25f, -22, -7.75f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 272, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 2.75f, 0, 0.25f, 2.75f, 0, 0.25f, 2.75f, 0, 0.25f, 2.75f)
			.setRotationPoint(-51.25f, -23.25f, -5).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 486, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-53.25f, -24, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 475, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-60, -24, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 488, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 10, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-60, -23.5f, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 140, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -23.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 493, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60, -22, -9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 337, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 12, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -23.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 486, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60, -22, 7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 444, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, -2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 483, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 10, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-53.25f, -23.5f, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 170, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 3, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.25f, -23.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-53.25f, -22, -9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 504, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.25f, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 501, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.25f, -23.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 488, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-53.25f, -22, 7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 505, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.25f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 417, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, -2, 0, 0, -2, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.5f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 402, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -2, 0, 0.25f, -2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-59.5f, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 201, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 100, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -18.5f, -11.05f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 100, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -18.5f, 11.05f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 498, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64, 0.5f, -1).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 502, 21, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-32, 1.5f, 0).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 483, 5, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(32, 1.5f, 0).setRotationAngle(0, 0, 0)
		);
		groups.add(T1_CTC_Tender);
	}

	ModelCoastToCoastTenderBogie bogie = new ModelCoastToCoastTenderBogie();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
		super.render(entity, f, f1, f2, f3, f4, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/CoastToCoastTruck.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-2f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslatef(2,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
