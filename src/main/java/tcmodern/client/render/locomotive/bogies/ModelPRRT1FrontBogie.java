//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelPRRT1FrontBogie extends FVTMFormatBase {

	public ModelPRRT1FrontBogie(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		addToCreators("MrRailroadRunner");
		//
		initGroup_Front_Bogie();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Front_Bogie(){
		TurboList Front_Bogie = new TurboList("Front_Bogie");
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 139, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 14, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-54, 4.75f, -7).setRotationAngle(0, 0, 0).setName("Box 219cp")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 465, 158, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(3, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-50, 3.75f, 0).setRotationAngle(0, 0, 0)
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 120, 186, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 1.25f, 1.25f, 4, null)
			.setRotationPoint(-50, 3.25f, 0).setRotationAngle(0, 0, 0)
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 235, 158, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-45, 3, -6).setRotationAngle(0, 0, 0).setName("Box 8")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 424, 156, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-62, 3, -6).setRotationAngle(0, 0, 0).setName("Box 10")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 135, 156, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-45, 3, 6).setRotationAngle(0, 0, 0).setName("Box 11")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 92, 156, textureX, textureY).addBox(0, 0, 0, 7, 7, 0)
			.setRotationPoint(-62, 3, 6).setRotationAngle(0, 0, 0).setName("Box 12")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 414, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-54, 6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 461, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-60.5f, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 201")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 84, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-43, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 112, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(-57, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 107, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -2.375f, 0, 0, -2.375f, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, 1.5f, 0)
			.setRotationPoint(-56, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 102, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1.375f, 0, 0, -2, 0, 0, -2, 0, 0, -1.375f, 0, 0, 1.5f, 0, 0, 1.75f, 0, 0, 1.75f, 0, 0, 1.5f, 0)
			.setRotationPoint(-55, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 97, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, -2, 0, 0, 1.75f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.75f, 0)
			.setRotationPoint(-46, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 92, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2.375f, 0, 0, 2.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 2.5f, 0)
			.setRotationPoint(-45, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 421, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f)
			.setRotationPoint(-43, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 209")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 406, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f)
			.setRotationPoint(-60, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 210")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 87, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0)
			.setRotationPoint(-39.5f, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 211")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 82, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0)
			.setRotationPoint(-61.5f, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 212")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 281, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-43.5f, 5.5f, -7.875f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 498, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-60.5f, 5.5f, -7.875f).setRotationAngle(0, 0, 0).setName("Box 214")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 164, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.375f, 0, -3, -0.375f, 0, -3, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-56.5f, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 216")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 153, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -3, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.125f, 0, -3, -0.125f)
			.setRotationPoint(-45.5f, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 490, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-54.5f, 5.25f, -8).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 485, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-56, 4.75f, -8).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 465, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-53.5f, 5.25f, -8).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 460, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47.5f, 5.25f, -8).setRotationAngle(0, 0, 0).setName("Box 221")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 207, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-54, 6.5f, 7).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 442, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1.375f, 0, 0, -2, 0, 0, -2, 0, 0, -1.375f, 0, 0, 1.5f, 0, 0, 1.75f, 0, 0, 1.75f, 0, 0, 1.5f, 0)
			.setRotationPoint(-55, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 437, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -2.375f, 0, 0, -2.375f, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, 1.5f, 0)
			.setRotationPoint(-56, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 425, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(-57, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 487, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-60.5f, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 369, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0)
			.setRotationPoint(-61.5f, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 302, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, -2, 0, 0, 1.75f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.75f, 0)
			.setRotationPoint(-46, 4.5f, 7).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 297, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2.375f, 0, 0, 2.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 2.5f, 0)
			.setRotationPoint(-45, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 292, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1.5f, 0)
			.setRotationPoint(-44, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 451, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-43, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 231")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 287, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0)
			.setRotationPoint(-39.5f, 3.5f, 7).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 397, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0.25f, -0.875f, 0, 0.25f, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-43, 5.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 233")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 9, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0.25f, -0.875f, 0, 0.25f, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-60, 5.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 82, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-60.5f, 5.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 235")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 82, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-43.5f, 5.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 236")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 146, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -3, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.125f, 0, -3, -0.125f)
			.setRotationPoint(-45.5f, 5.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 237")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 139, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.375f, 0, -3, -0.375f, 0, -3, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-56.5f, 5.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 238")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 490, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-54.5f, 5.25f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 239")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 483, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-56, 4.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 240")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 24, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-53.5f, 5.25f, 7).setRotationAngle(0, 0, 0).setName("Box 241")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 0, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-47.5f, 5.25f, 7).setRotationAngle(0, 0, 0).setName("Box 242")
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 53, 239, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(-41.5f, 6.75f, -7).setRotationAngle(0, 0, 0)
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 48, 239, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(-58.5f, 6.75f, -7).setRotationAngle(0, 0, 0)
		);
		Front_Bogie.add(new ModelRendererTurbo(Front_Bogie, 402, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1.5f, 0)
			.setRotationPoint(-44, 3.5f, -8).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		groups.add(Front_Bogie);
	}

}
