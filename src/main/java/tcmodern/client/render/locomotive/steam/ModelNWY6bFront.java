//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.steam;


import net.minecraft.entity.Entity;
import tcmodern.client.render.locomotive.bogies.ModelNWY6bFrontBogie;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWY6bFront extends FVTMFormatBase {

	public ModelNWY6bFront(){
		super();
		textureX = 512;
		textureY = 1024;
		addToCreators("Riggs64");
		//
		initGroup_FrontEngine0();
		initGroup_FrontEngine1();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_FrontEngine0(){
		TurboList FrontEngine = new TurboList("FrontEngine");
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -7, 0, 0, 7, 0, 0, 7, 0, -0.7f, -7, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-76, -8, -15).setRotationAngle(0, 0, 0).setName("Box 1104")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -7, 0, -0.7f, 7, 0, -0.7f, 7, 0, 0, -7, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76, -8, 6).setRotationAngle(0, 0, 0).setName("Box 1105")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -7, 0, 0, 7, 0, 0, 7, 0, -0.7f, -7, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-76, -8, -12).setRotationAngle(0, 0, 0).setName("Box 1106")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -7, 0, -0.7f, 7, 0, -0.7f, 7, 0, 0, -7, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76, -8, 3).setRotationAngle(0, 0, 0).setName("Box 1107")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-76.25f, -5.200001f, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1123")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.25f, 0.32f, 0, 0.25f, -0.15f, 0, 0.25f, -0.15f, -0.7f, -1.25f, 0.32f, -0.7f, 0, -0.01f, 0, -0.7f, -0.01f, 0, -0.7f, -0.01f, -0.7f, 0, -0.01f, -0.7f)
			.setRotationPoint(-76.25f, -7.1900005f, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1127")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, -5.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, -5.5f, -0.7f, 0, -0.05f, 0, 0.5f, -5.65f, 0, 0.5f, -5.65f, -0.7f, 0, -0.05f, -0.7f)
			.setRotationPoint(-75, -13, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1135")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-70.2f, -6.299999f, -14.7f).setRotationAngle(0, 0, 0).setName("Box 1146")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-72.1f, -4.1000004f, -14.7f).setRotationAngle(0, 0, 0).setName("Box 1147")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-74, -1.8999996f, -14.7f).setRotationAngle(0, 0, 0).setName("Box 1148")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-72.1f, -4.1000004f, 3.8f).setRotationAngle(0, 0, 0).setName("Box 1149")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-70.2f, -6.299999f, 3.8f).setRotationAngle(0, 0, 0).setName("Box 1150")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-74, -1.8999996f, 3.8f).setRotationAngle(0, 0, 0).setName("Box 1151")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, -15, -0.8f, 0, -15, -0.8f, 0, 14.3f, 0, 0, 14.3f, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-73.25f, -9.200001f, -11.65f).setRotationAngle(0, 0, 17).setName("Box 1152")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.95f, 0, 0, -0.95f, 0, -0.8f, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f, -0.95f, 0, -0.8f, -0.95f)
			.setRotationPoint(-73.25f, -9.200001f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1153")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 14.3f, -0.8f, 0, 14.3f, -0.8f, 0, -15, 0, 0, -15, 0, -0.5f, -0.7f, -0.8f, -0.5f, -0.7f, -0.8f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-73.25f, -9.200001f, 2.65f).setRotationAngle(0, 0, 17).setName("Box 1154")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-76.25f, -5.200001f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1267")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, -5.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, -5.5f, -0.7f, 0, -0.05f, 0, 0.5f, -5.65f, 0, 0.5f, -5.65f, -0.7f, 0, -0.05f, -0.7f)
			.setRotationPoint(-75, -13, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1269")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.25f, 0.32f, 0, 0.25f, -0.15f, 0, 0.25f, -0.15f, -0.7f, -1.25f, 0.32f, -0.7f, 0, -0.01f, 0, -0.7f, -0.01f, 0, -0.7f, -0.01f, -0.7f, 0, -0.01f, -0.7f)
			.setRotationPoint(-76.25f, -7.1900005f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1270")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-69, -8.299999f, 3.71f).setRotationAngle(0, 0, 0).setName("Box 1323")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 30, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-56.6f, -8.6f, 3.71f).setRotationAngle(0, 0, 0).setName("Box 2024")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 75, 577, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-69, -8.6f, 6.91f).setRotationAngle(0, 0, 0).setName("Box 2025")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 102, 577, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-69, -8.6f, 3.71f).setRotationAngle(0, 0, 0).setName("Box 2026")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 39, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-69, -8.6f, 3.71f).setRotationAngle(0, 0, 0).setName("Box 2027")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-77.5f, 3, -12).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-77.5f, 3, 3).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 33, textureX, textureY).addBox(0, 0, 0, 0, 5, 1)
			.setRotationPoint(-77.45f, 3.8000002f, -4.5f).setRotationAngle(0, 0, 15).setName("Box 1087")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.25f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.75f, 1.25f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-77.75f, 1.25f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 393")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(-78.25f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(-78.25f, 1.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(-78.25f, 1.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(-78.25f, 3.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 398")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 441, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(-79.5f, 2, -5).setRotationAngle(0, 0, 0).setName("Box 414")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79, 3.75f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-79, 5.75f, -2.65f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 2, -0.5f, -0.5f, 2, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 2, 0, -0.5f, 2, 0, 0, 0, 0, 0)
			.setRotationPoint(-79, 2.75f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79, -0.25f, -13).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -1.5f, 0, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(-79, 1.25f, 4).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -1.5f, 0, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(-79, 1.25f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79, 0.25f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79, 0.25f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1086")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79, 0.25f, 4).setRotationAngle(0, 0, 0).setName("Box 1087")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-77.5f, 3, -14).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-79.5f, 7.5f, -14).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-77.5f, 7, -13).setRotationAngle(0, 0, 0).setName("Box 1670")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-79.5f, 7.5f, 4).setRotationAngle(0, 0, 0).setName("Box 1672")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-77.5f, 3, 5).setRotationAngle(0, 0, 0).setName("Box 1673")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, -1.6f, 0, 0, 1.6f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.6f, -0.5f, 0, 1.6f, -0.5f, 0)
			.setRotationPoint(-77.5f, 8.5f, -11).setRotationAngle(0, 0, 0).setName("Box 2086")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 0, 0, -0.9f, 0, 0, -0.9f, -1.3f, 0, 0, 1.3f, 0, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f, -1.3f, -0.3f, 0, 1.3f, -0.3f, 0)
			.setRotationPoint(-77.45f, 7.5f, -12).setRotationAngle(0, 0, 0).setName("Box 2091")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 1.6f, 0, 0, -1.6f, 0, 0, 0, 0, 0, 0, 0, 0, 1.6f, -0.5f, 0, -1.6f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-77.5f, 8.5f, -4).setRotationAngle(0, 0, 0).setName("Box 2098")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 1.3f, 0, 0, -1.3f, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 1.3f, -0.3f, 0, -1.3f, -0.3f, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f)
			.setRotationPoint(-77.45f, 7.5f, -4).setRotationAngle(0, 0, 0).setName("Box 2100")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 0, 0, -0.9f, 0, 0, -0.9f, -1.3f, 0, 0, 1.3f, 0, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f, -1.3f, -0.3f, 0, 1.3f, -0.3f, 0)
			.setRotationPoint(-77.15f, 6.3999996f, -12).setRotationAngle(0, 0, 0).setName("Box 2101")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 1.3f, 0, 0, -1.3f, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 1.3f, -0.3f, 0, -1.3f, -0.3f, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f)
			.setRotationPoint(-76.85f, 5.3f, -4).setRotationAngle(0, 0, 0).setName("Box 2102")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 1.3f, 0, 0, -1.3f, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 1.3f, -0.3f, 0, -1.3f, -0.3f, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f)
			.setRotationPoint(-77.15f, 6.3999996f, -4).setRotationAngle(0, 0, 0).setName("Box 2103")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 0, 0, -0.9f, 0, 0, -0.9f, -1.3f, 0, 0, 1.3f, 0, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f, -1.3f, -0.3f, 0, 1.3f, -0.3f, 0)
			.setRotationPoint(-76.85f, 5.3f, -12).setRotationAngle(0, 0, 0).setName("Box 2104")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 1.3f, 0, 0, -1.3f, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 1.3f, -0.3f, 0, -1.3f, -0.3f, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f)
			.setRotationPoint(-76.55f, 4.2f, -4).setRotationAngle(0, 0, 0).setName("Box 2105")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 0, 0, -0.9f, 0, 0, -0.9f, -1.3f, 0, 0, 1.3f, 0, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f, -1.3f, -0.3f, 0, 1.3f, -0.3f, 0)
			.setRotationPoint(-76.55f, 4.2f, -12).setRotationAngle(0, 0, 0).setName("Box 2106")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-74.5f, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 11)
			.setRotationPoint(-75.5f, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, 0, 0)
			.setRotationPoint(-76.5f, 3, -9.5f).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 313, textureX, textureY).addBox(0, 0, 0, 1, 3, 26)
			.setRotationPoint(-76.5f, 0, -17).setRotationAngle(0, 0, 0).setName("Box 1103")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 26, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-77.5f, 0, -17).setRotationAngle(0, 0, 0).setName("Box 1108")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0.24f, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-75.5f, 0, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1111")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.25f, 0, -0.7f, 0.05f, 0.5f, -0.7f, 0, 0.5f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-75.5f, 0, 3.75f).setRotationAngle(0, 0, 0).setName("Box 1115")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-78.25f, 3.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-78.25f, 1.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-77.5f, 7, 4).setRotationAngle(0, 0, 0).setName("Box 2023")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 1.3f, 0, 0, -1.3f, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 1.3f, -0.3f, 0, -1.3f, -0.3f, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f)
			.setRotationPoint(-76.25f, 3.1000004f, -4).setRotationAngle(0, 0, 0).setName("Box 2108")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 8, 0, 0, 0, -0.9f, 0, 0, -0.9f, -1.3f, 0, 0, 1.3f, 0, 0, 0, -0.3f, -0.9f, 0, -0.3f, -0.9f, -1.3f, -0.3f, 0, 1.3f, -0.3f, 0)
			.setRotationPoint(-76.25f, 3.1000004f, -12).setRotationAngle(0, 0, 0).setName("Box 2109")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 11, 0, 0, 0, 0, 0.5f, 1, 0, 0.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-75.5f, 0, -9.5f).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0.24f, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-75.5f, 0, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1110")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-75.5f, 0, -15).setRotationAngle(0, 0, 0).setName("Box 1113")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, 0, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1212")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 305, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-72.5f, 0, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1213")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-73.5f, 0, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1214")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-68, 3, -9.5f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-69, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 11, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-68, 4, -9.5f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 225, textureX, textureY).addBox(0, 0, 0, 11, 6, 6)
			.setRotationPoint(-66.5f, 1, -15.5f).setRotationAngle(0, 0, 0).setName("Box 1005")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, 1, -16.5f).setRotationAngle(0, 0, 0).setName("Box 1010")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-66.5f, 1, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1011")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, 8, -15.5f).setRotationAngle(90, 0, 0).setName("Box 1012")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, 0, -9.5f).setRotationAngle(-90, 0, 0).setName("Box 1013")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, 1, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1021")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, 0, 7.5f).setRotationAngle(-90, 0, 0).setName("Box 1022")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 249, textureX, textureY).addBox(0, 0, 0, 11, 6, 6)
			.setRotationPoint(-66.5f, 1, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1023")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, 8, 1.5f).setRotationAngle(90, 0, 0).setName("Box 1024")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-66.5f, 1, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1025")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 273, textureX, textureY).addBox(0, 0, 0, 14, 4, 4)
			.setRotationPoint(-67.5f, -4.5f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 1081")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 4, 0, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.5f, -5.5f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 1082")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 4, 0, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.5f, -0.5f, -16.5f).setRotationAngle(90, 0, 0).setName("Box 1084")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f)
			.setRotationPoint(-67.5f, -0.5f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 1088")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f)
			.setRotationPoint(-67.5f, -0.5f, -11.5f).setRotationAngle(90, 0, 0).setName("Box 1089")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 281, textureX, textureY).addBox(0, 0, 0, 14, 4, 4)
			.setRotationPoint(-67.5f, -4.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1090")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f)
			.setRotationPoint(-67.5f, -0.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1091")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f)
			.setRotationPoint(-67.5f, -0.5f, 7.5f).setRotationAngle(90, 0, 0).setName("Box 1092")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 4, 0, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.5f, -5.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1093")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 4, 0, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, -0.4f, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.5f, -0.5f, 2.5f).setRotationAngle(90, 0, 0).setName("Box 1094")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 1, 0.5f, 0, 1, 0.5f, 1, 0, 0, 1, 0)
			.setRotationPoint(-66.25f, -4, 2).setRotationAngle(0, 0, 0).setName("Box 1108")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 6, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.25f, -5, 3).setRotationAngle(0, 0, 0).setName("Box 1109")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 3, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.25f, -7, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1110")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 5, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -1, 0, 0, -1, 0, 0, 1, 0.5f, 0, 1, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.25f, -6, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1111")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0.1f, 0, 0.5f, 0.1f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-66.25f, 3, 8).setRotationAngle(0, 0, 0).setName("Box 1112")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 121, textureX, textureY).addBox(0, 0, 0, 1, 1, 11)
			.setRotationPoint(-68, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1049")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 297, textureX, textureY).addBox(0, 1, 0, 9, 5, 4)
			.setRotationPoint(-65, -5.83f, 0.45f).setRotationAngle(45, 0, 0).setName("Box 1058")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 217, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 5, 4, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-66, -5.83f, 0.45f).setRotationAngle(45, 0, 0).setName("Box 1060")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 292, 231, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 5, 4, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-56, -5.83f, 0.45f).setRotationAngle(45, 0, 0).setName("Box 1065")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-66.5f, -1, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1220")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-64.5f, -1, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1221")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 129, textureX, textureY).addBox(0, 0, 0, 1, 3, 4)
			.setRotationPoint(-65.5f, -1, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1222")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, -3, -6.5f).setRotationAngle(90, 0, 0).setName("Box 1323")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, -3, -2.5f).setRotationAngle(90, 0, 0).setName("Box 1324")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-66.5f, -3.5f, -6.7f).setRotationAngle(0, 0, 0).setName("Box 1327")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-66.5f, -3.5f, -2.7f).setRotationAngle(0, 0, 0).setName("Box 1328")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, -0.9f, -0.4f, -0.2f, -0.9f, -0.4f, -0.2f, -0.9f, -0.2f, -0.2f, -0.9f, -0.2f)
			.setRotationPoint(-66.5f, -3, -6.1f).setRotationAngle(0, 0, 0).setName("Box 1330")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67, -1, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1331")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67, -1, -3.5f).setRotationAngle(90, 0, 0).setName("Box 1332")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-67, -1.5f, -5.7f).setRotationAngle(0, 0, 0).setName("Box 1333")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-67, -1.5f, -3.7f).setRotationAngle(0, 0, 0).setName("Box 1334")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 537, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-62.5f, -3, 9.02f).setRotationAngle(0, 0, 0).setName("Box 2013")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 17, textureX, textureY).addBox(0, 0, 0, 14, 4, 11)
			.setRotationPoint(-67, -1, -9.5f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 1, 0, 0.5f, 1, 0, 0.5f, 0, 1, 0, 0, 1)
			.setRotationPoint(-66.25f, -4, -17).setRotationAngle(0, 0, 0).setName("Box 1103")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 6, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 1, 0, 0, 1)
			.setRotationPoint(-66.25f, -5, -17).setRotationAngle(0, 0, 0).setName("Box 1104")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 5, 0, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 1, 0, 0, 1)
			.setRotationPoint(-66.25f, -6, -16.5f).setRotationAngle(0, 0, 0).setName("Box 1105")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 3, 0, 0, -0.5f, -1, 0.5f, -0.5f, -1, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 1, 0, 0, 1)
			.setRotationPoint(-66.25f, -7, -15.5f).setRotationAngle(0, 0, 0).setName("Box 1106")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 113, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 4, 3, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-66, -5.5f, -14.5f).setRotationAngle(45, 0, 0).setName("Box 1055")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 161, textureX, textureY)
			.addShapeBox(0, 0, 3.5f, 1, 4, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -1, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -1, -0.5f)
			.setRotationPoint(-66, -5.5f, -14.5f).setRotationAngle(45, 0, 0).setName("Box 1058")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 297, textureX, textureY).addBox(0, 0, 0.5f, 9, 4, 3)
			.setRotationPoint(-65, -5.5f, -14.5f).setRotationAngle(45, 0, 0).setName("Box 1060")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 233, textureX, textureY)
			.addShapeBox(0, 0, 3.5f, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-65, -5.5f, -14.5f).setRotationAngle(45, 0, 0).setName("Box 1061")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 4, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65, -5.83f, 0.45f).setRotationAngle(45, 0, 0).setName("Box 1062")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.5f, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-66, -5.83f, 0.45f).setRotationAngle(45, 0, 0).setName("Box 1066")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-56, -5.83f, 0.45f).setRotationAngle(45, 0, 0).setName("Box 1067")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 147, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -1, 0, 0, 0, 0, 0, -3, 0, 0, -4, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0)
			.setRotationPoint(-62.5f, -10.5f, 0).setRotationAngle(0, 0, 0).setName("Box 2143")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 147, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, 0, -4, 0, 0, -3, 0, 0, 0, 0, 0, -1, 0, 0, 2, 0, 0, 3, 0)
			.setRotationPoint(-60.5f, -10.5f, 0).setRotationAngle(0, 0, 0).setName("Box 2145")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 147, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0)
			.setRotationPoint(-61.5f, -10.5f, 0).setRotationAngle(0, 0, 0).setName("Box 2148")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.1f, 0, 0, 0.1f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.25f, 3, -17).setRotationAngle(0, 0, 0).setName("Box 1107")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-68, -13.200001f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1142")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-68, -13.5f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1143")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.3f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.3f, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-58, -9.200001f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1144")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.5f, -4, 0, 0.5f, -4, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, 3.3f, 0, 0.5f, 3.3f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-61.5f, -13.5f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1145")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.05f, -0.1f, 0, 0.75f, -4.1f, 0, 0.75f, -4.1f, -0.7f, -0.05f, -0.1f, -0.7f, -0.05f, -0.7f, 0, 0.75f, 3.3f, 0, 0.75f, 3.3f, -0.7f, -0.05f, -0.7f, -0.7f)
			.setRotationPoint(-67.75f, -12.75f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1156")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-62.5f, -5, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1170")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-60.5f, -5, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1171")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61.5f, -5, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1172")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-62.5f, -11, -8).setRotationAngle(0, 0, 0).setName("Box 1177")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61.5f, -11, -8).setRotationAngle(0, 0, 0).setName("Box 1196")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 15, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-59.5f, -5, -5.5f).setRotationAngle(90, 0, 90).setName("Box 1226")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 329, textureX, textureY).addBox(0, 0, 0, 1, 3, 15)
			.setRotationPoint(-59.5f, -4, -5.5f).setRotationAngle(90, 0, 90).setName("Box 1227")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 15, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-59.5f, -3, -5.5f).setRotationAngle(90, 0, 90).setName("Box 1228")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 2, 0, -1, -3, -1, 0, 0, -1, 0, 0, 0, 0, 2, 0, -1, -3, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-62.5f, -3, -5.5f).setRotationAngle(90, 0, 90).setName("Box 1245")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, -2, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0)
			.setRotationPoint(-60.5f, -4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1247")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-60.5f, -5, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1253")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.15f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.15f, -0.7f)
			.setRotationPoint(-69.5f, -13.5f, 3.35f).setRotationAngle(0, 0, 0).setName("Box 1268")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 529, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-62.5f, -3, -17.02f).setRotationAngle(0, 0, 0).setName("Box 2009")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 147, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -4, 0, 0, -3, 0, 0, 0, 0, 0, -1, 0, 0, 2, 0, 0, 3, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-62.5f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 2142")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 147, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -3, 0, 0, -4, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-60.5f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 2144")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 147, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61.5f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 2147")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 217, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 1, 4, 5, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-56, -5.5f, -14.5f).setRotationAngle(45, 0, 0).setName("Box 1057")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 161, textureX, textureY)
			.addShapeBox(0, 0, 3.5f, 1, 4, 1, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-56, -5.5f, -14.5f).setRotationAngle(45, 0, 0).setName("Box 1059")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0.5f, 0, -1, 0.5f, 0, -1, 0, 0, 0, 0, 0, 0, 0.5f, 0, -1, 0.5f)
			.setRotationPoint(-62.5f, -11, -7).setRotationAngle(0, 0, 0).setName("Box 1160")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 321, textureX, textureY).addBox(0, 0, 0, 1, 3, 6)
			.setRotationPoint(-61.5f, -11, -7).setRotationAngle(0, 0, 0).setName("Box 1162")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-60.5f, -11, -8).setRotationAngle(0, 0, 0).setName("Box 1195")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-62.5f, -11, -1).setRotationAngle(0, 0, 0).setName("Box 1200")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-60.5f, -11, -1).setRotationAngle(0, 0, 0).setName("Box 1201")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-61.5f, -11, -1).setRotationAngle(0, 0, 0).setName("Box 1202")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -1, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, -1, 0, 0, -1, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-62.5f, -11, -3).setRotationAngle(0, 0, 0).setName("Box 1215")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-62.5f, -11, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1216")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60.5f, -11, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1217")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0.5f, 0, -1, 0.5f, 0, -1, 0, 0, 0, 0, 0, 0, 0.5f, 0, -1, 0.5f, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-60.5f, -11, -3).setRotationAngle(0, 0, 0).setName("Box 1218")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, -1, 0, 0, -1, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-60.5f, -11, -7).setRotationAngle(0, 0, 0).setName("Box 1219")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1)
			.setRotationPoint(-60.5f, -5, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1250")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-69, -8.299999f, -15).setRotationAngle(0, 0, 0).setName("Box 1116")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.5f, -4, 0, 0.5f, -4, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, 3.3f, 0, 0.5f, 3.3f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-61.5f, -13.5f, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1120")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-68, -13.200001f, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1121")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.3f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.3f, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-58, -9.200001f, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1122")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-68, -13.5f, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1128")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.15f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.15f, -0.7f)
			.setRotationPoint(-69.5f, -13.5f, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1134")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.05f, -0.1f, 0, 0.75f, -4.1f, 0, 0.75f, -4.1f, -0.7f, -0.05f, -0.1f, -0.7f, -0.05f, -0.7f, 0, 0.75f, 3.3f, 0, 0.75f, 3.3f, -0.7f, -0.05f, -0.7f, -0.7f)
			.setRotationPoint(-67.75f, -12.75f, -11.65f).setRotationAngle(0, 0, 0).setName("Box 1155")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.95f, 0, 0, -0.95f, 0, -0.8f, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f, -0.95f, 0, -0.8f, -0.95f)
			.setRotationPoint(-58.25f, -9.700001f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1157")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-60.75f, -10.299999f, -14.5f).setRotationAngle(0, 0, 0).setName("Box 1315")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0.3f, 0, 0, 0.3f, 0, -1.2f, 0, -0.7f, -1.2f, 0, -0.7f, -1.2f, 0.3f, 0, -1.2f, 0.3f)
			.setRotationPoint(-60.75f, -10, -14.5f).setRotationAngle(0, 0, 0).setName("Box 1316")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0.3f, 0, 0, 0.3f, 0, -1.2f, 0, -0.7f, -1.2f, 0, -0.7f, -1.2f, 0.3f, 0, -1.2f, 0.3f)
			.setRotationPoint(-57.55f, -10, -14.5f).setRotationAngle(0, 0, 0).setName("Box 1317")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0)
			.setRotationPoint(-66.5f, -9.9f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1584")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0)
			.setRotationPoint(-62.5f, -11.4f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1585")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0.9f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0.9f, 0)
			.setRotationPoint(-63.5f, -11.4f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1586")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-66.5f, -13.4f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1609")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(-65.5f, -12.9f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1614")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-64.5f, -12.9f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1617")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.25f, -10.9f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1618")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.25f, -10.9f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1619")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 217, textureX, textureY).addBox(0, 0, 0, 3, 1, 0)
			.setRotationPoint(-66.5f, -12.4f, -2.5f).setRotationAngle(0, -10, 0).setName("Box 1843")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 577, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-69, -8.6f, -11.8f).setRotationAngle(0, 0, 0).setName("Box 2033")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 66, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-69, -8.6f, -15).setRotationAngle(0, 0, 0).setName("Box 2034")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 48, 577, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-69, -8.6f, -15).setRotationAngle(0, 0, 0).setName("Box 2035")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 48, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-56.6f, -8.6f, -15).setRotationAngle(0, 0, 0).setName("Box 2036")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 433, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-66.5f, -13.4f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1608")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, -13.4f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1613")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.5f, -12.9f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1615")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66.5f, -13.4f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1607")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0)
			.setRotationPoint(-65.5f, -12.9f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1611")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.5f, -12.9f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1616")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 161, textureX, textureY).addBox(0, 0, 0, 3, 1, 0)
			.setRotationPoint(-66.5f, -12.4f, -5.5f).setRotationAngle(0, 10, 0).setName("Box 1842")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 11, 0, 0, 3, -10, 0, 0, -7, 0, 0, -3, 0, 3, 0, 0, 2, -10, 0, 2, -7, 0, 2, -3, 0, 2, 0)
			.setRotationPoint(-7.5f, 3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 11, 0, 0, 3, 0, 0, 0, -3, 0, 0, -7, 0, 3, -10, 0, 2, 0, 0, 2, -3, 0, 2, -7, 0, 2, -10)
			.setRotationPoint(-7.5f, 3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, 3.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 257")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, 3.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 258")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 17, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(1.5f, 3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 259")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 33, textureX, textureY).addBox(0, 0, 0, 2, 3, 5)
			.setRotationPoint(-2.5f, 3.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 260")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(-55, -2, 2.01f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(-42.5f, -2, 2.01f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(-17.5f, -2, 2.01f).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(-30, -2, 2.01f).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(-55, -2, -10.01f).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(-42.5f, -2, -10.01f).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(-30, -2, -10.01f).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(-17.5f, -2, -10.01f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f)
			.setRotationPoint(-48.5f, 4.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1756")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, -0.25f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.25f, -0.5f, -0.35f)
			.setRotationPoint(-48.5f, 3.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1757")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f)
			.setRotationPoint(-48.5f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1758")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 318, 465, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-59.5f, 3.5f, 4).setRotationAngle(0, 0, 0).setName("Box 1759")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-56.5f, -3, 4.55f).setRotationAngle(0, 0, 0).setName("Box 1784")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 473, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-49.1f, -2.3999996f, 5.3f).setRotationAngle(0, -180, -8).setName("Box 1793")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 473, textureX, textureY)
			.addShapeBox(1, -1, 0, 4, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-46, 4, 5.9f).setRotationAngle(0, -180, 0).setName("Box 1794")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-56.25f, 1.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1838")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-50.75f, 1.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1839")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-50.75f, 5.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1840")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 489, textureX, textureY)
			.addShapeBox(2, -1, 0, 9, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-39, 0.5f, 6).setRotationAngle(0, -180, -15).setName("Box 1865")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-42.5f, -3.5f, 5.5f).setRotationAngle(0, 0, 90).setName("Box 1866")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-42.5f, 0.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1867")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-42.5f, -3.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1868")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.5f, -2.5f, 5.5f).setRotationAngle(0, 0, 90).setName("Box 1869")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 188, 596, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-43.5f, 2, 6.4f).setRotationAngle(0, 0, 90).setName("Box 2061")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 207, 594, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(-43.5f, 1, 4.4f).setRotationAngle(0, 0, 90).setName("Box 2062")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 214, 598, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-43.5f, 6, 4.4f).setRotationAngle(0, 0, 90).setName("Box 2063")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-49.5f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1762")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-10.75f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1767")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-13.25f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1768")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-12.25f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1769")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-12, 8.25f, 1.8f).setRotationAngle(0, 0, -90).setName("Box 1770")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-35.75f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1771")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-37, 8.25f, 1.8f).setRotationAngle(0, 0, -90).setName("Box 1772")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-37.25f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1773")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-38.25f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1774")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-48.25f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1775")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-49.75f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1776")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-50.75f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1777")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-49.5f, 8.25f, 1.8f).setRotationAngle(0, 0, -90).setName("Box 1778")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-23.25f, 6, 5.1f).setRotationAngle(0, 0, 0).setName("Box 1780")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-25.75f, 6, 5.1f).setRotationAngle(0, 0, 0).setName("Box 1781")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-24.5f, 8.25f, 5.1f).setRotationAngle(0, 0, -90).setName("Box 1782")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-24.75f, 5, 5.1f).setRotationAngle(0, 0, 0).setName("Box 1783")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-56.25f, 5.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1841")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-46.5f, 3.5f, 4).setRotationAngle(0, 0, 6.32f).setName("Box 1761")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-24.75f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1763")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-23.25f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1764")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 98, 474, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-25, 6, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1779")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(-43.51f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1880")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.15f, 0, -1, -0.15f)
			.setRotationPoint(-24.25f, 5, 5.7f).setRotationAngle(0, 0, 0).setName("Box 1846")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 489, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 19, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.75f, 0.25f, -0.25f, -0.75f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-40.75f, 2, 5.6f).setRotationAngle(0, 0, 9).setName("Box 1847")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 489, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-41.5f, -1.3999996f, 5.1f).setRotationAngle(0, -180, -10).setName("Box 1848")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 245, 577, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 12, 1, 1, 0, -0.25f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-38.5f, -3.2000008f, 5.6f).setRotationAngle(0, 0, 0).setName("Box 2033")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 277, 581, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-39.5f, -5, 5.1f).setRotationAngle(0, -180, -13).setName("Box 2034")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 277, 585, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-28.1f, -5, 5.1f).setRotationAngle(0, -180, -13).setName("Box 2035")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 366, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-24.5f, 4.25f, 5.1f).setRotationAngle(0, 0, -90).setName("Box 2135")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 44, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.5f, 0.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-21.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-9, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 141")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-15, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 5, 0.5f).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-10, 2, 0.5f).setRotationAngle(0, 0, 0).setName("Box 148")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-14, 2, 0.5f).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14, 5, 0.5f).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 17, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-14, 6, 0.5f).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-20, 4.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-16, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 174")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 175")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-18.25f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-16, 7.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 187")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-7, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 188")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 189")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 190")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 191")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-28.5f, 7.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 192")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-19.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 193")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 194")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-12, -0.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 221")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-12, -2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-8.49f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-8.5f, -1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-8.2f, 0.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 462")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-14, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 448")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.5f, 3, -10).setRotationAngle(0, 0, 0).setName("Box 484")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, 3, -10).setRotationAngle(0, 0, 0).setName("Box 485")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, 4, -10).setRotationAngle(0, 0, 0).setName("Box 486")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-12.5f, 4, -10).setRotationAngle(0, 0, 0).setName("Box 487")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 775")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-15.5f, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 776")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 777")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 778")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 779")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-15.5f, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 780")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-14.5f, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 781")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 782")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 783")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 784")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 785")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-14.5f, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 786")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-13.5f, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 787")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 788")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 789")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 790")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 791")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-13.5f, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 792")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 94, 587, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 2075")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-34, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-27.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.5f, 5, 0.5f).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-22.5f, 2, 0.5f).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-26.5f, 2, 0.5f).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.5f, 5, 0.5f).setRotationAngle(0, 0, 0).setName("Box 154")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 17, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-26.5f, 6, 0.5f).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-32.5f, 4.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.5f, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-28.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-33, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-30.75f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 185")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 195")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 196")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 197")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-41, 7.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-32, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 201")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-26.5f, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, 3, -10).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, 3, -10).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-25, 4, -10).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-24, 4, -10).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-24.5f, 8.25f, 1.8f).setRotationAngle(0, 0, -90).setName("Box 1765")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-25.75f, 6, 1.8f).setRotationAngle(0, 0, 0).setName("Box 1766")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 107, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-26.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 2074")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-40, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-39, 2, 0.5f).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-35, 2, 0.5f).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35, 5, 0.5f).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, 5, 0.5f).setRotationAngle(0, 0, 0).setName("Box 146")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 17, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-52.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 17, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-46.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.5f, 5, 0.5f).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-47.5f, 2, 0.5f).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, 2, 0.5f).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, 5, 0.5f).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 17, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-51.5f, 6, 0.5f).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 17, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-39, 6, 0.5f).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-45, 4.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, 3.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 181")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-41, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 183")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-43.25f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 186")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-42, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 198")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-53.5f, 7.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-44.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-54.5f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-39, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 429")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-51.5f, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, 3, -10).setRotationAngle(0, 0, 0).setName("Box 470")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, 3, -10).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-50, 4, -10).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-49, 4, -10).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, 3, -10).setRotationAngle(0, 0, 0).setName("Box 474")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.5f, 3, -10).setRotationAngle(0, 0, 0).setName("Box 475")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-36.5f, 4, -10).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-37.5f, 4, -10).setRotationAngle(0, 0, 0).setName("Box 477")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-53.2f, 0.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 94, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 2076")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 107, 581, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-51.5f, 1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 2077")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-24.5f, -0.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-28.01f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-24.5f, -2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 209")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-20.99f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 210")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-21, -1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 211")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-28, -1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 212")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-37, -0.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 214")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-37, -2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-33.489998f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-33.5f, -1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-40.5f, -1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-40.510002f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-15.5f, -1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-15.51f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-49.5f, -0.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-53, -1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 33, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-53.01f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-49.5f, -2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-46, -1.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 233")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 33, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-45.99f, -3.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(-8.5f, 0.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 463")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(-8.5f, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 464")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 81, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(-53, 0.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 81, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(-53, 5.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 721")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 722")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-53, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 723")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-53, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 724")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 725")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 726")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 727")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 728")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-52, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 729")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-52, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 730")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 731")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 732")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 733")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 734")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-51, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 735")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-51, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 736")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 737")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 738")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 739")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-40.5f, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 740")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 741")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 742")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 743")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-40.5f, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 744")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-39.5f, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 745")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 746")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 747")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 748")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 749")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-39.5f, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 750")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-38.5f, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 751")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 752")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 753")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 754")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 755")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-38.5f, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 756")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 757")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-28, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 758")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -3.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 759")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 760")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 761")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-28, -3, 0.45f).setRotationAngle(0, 0, 0).setName("Box 762")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-27, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 763")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 764")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -2.75f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 765")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 766")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 767")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-27, -2.5f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 768")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-26, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 769")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 770")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -2.25f, 0.45f).setRotationAngle(0, 0, 0).setName("Box 771")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 772")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 773")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-26, -2, 0.45f).setRotationAngle(0, 0, 0).setName("Box 774")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 489, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-42.5f, -2.5f, 0.5f).setRotationAngle(0, 0, 90).setName("Box 1863")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 245, 571, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 20, 1, 1, 0, -0.25f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-28.85f, -1.8000002f, 4.3f).setRotationAngle(0, 90, 0).setName("Box 2039")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 44, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.5f, 0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-9, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-15, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 24")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-10, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 31")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-14, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 1, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-14, 6, -9.5f).setRotationAngle(0, 0, 0).setName("Box 56")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-20, 4.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-16, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 61")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 62")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 3.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 3.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 64")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-18.25f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-16, 7.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-7, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-12, -0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-12, -2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-8.49f, -3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-8.5f, -1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 148")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-15.5f, -1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-15.51f, -3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-8.2f, 0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-14, 2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 703")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 704")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-13.5f, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 705")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-13.5f, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 706")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 707")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 708")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 709")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 710")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-14.5f, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 711")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-14.5f, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 712")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 713")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 714")
		);
		groups.add(FrontEngine);
	}

	private final void initGroup_FrontEngine1(){
		TurboList FrontEngine = new TurboList("FrontEngine");
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 715")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 716")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-15.5f, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 717")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-15.5f, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 718")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 719")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-10.5f, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 720")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-12.25f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1710")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-10.75f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1711")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-12, 8.25f, -10.9f).setRotationAngle(0, 0, -90).setName("Box 1712")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-13.25f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1713")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-49.5f, 6, -10.8f).setRotationAngle(0, 0, 0).setName("Box 1718")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 282, 585, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 2, 1, 1, 0, -0.25f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-28.25f, -1.8000002f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 2047")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 581, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2073")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-21.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-27.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.5f, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-22.5f, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-26.5f, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.5f, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 1, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-26.5f, 6, -9.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-28.5f, 7.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-19.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-26.5f, 2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-23.25f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1714")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-24.75f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1716")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-46.5f, 3.5f, -13).setRotationAngle(0, 0, 6.32f).setName("Box 1734")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 90, 458, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-25, 6, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1735")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 457, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 19, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.75f, 0.25f, -0.25f, -0.75f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-40.75f, 2, -14.5f).setRotationAngle(0, 0, 9).setName("Box 1752")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-24.75f, 5, -14.1f).setRotationAngle(0, 0, 0).setName("Box 1763")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-25.75f, 6, -14.1f).setRotationAngle(0, 0, 0).setName("Box 1764")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-24.5f, 8.25f, -14.1f).setRotationAngle(0, 0, -90).setName("Box 1765")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-23.25f, 6, -14.1f).setRotationAngle(0, 0, 0).setName("Box 1766")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.15f, 0, -1, -0.15f)
			.setRotationPoint(-24.25f, 5, -14.7f).setRotationAngle(0, 0, 0).setName("Box 1842")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-26.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2072")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 366, 581, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-24.5f, 4.25f, -14.1f).setRotationAngle(0, 0, -90).setName("Box 2136")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-34, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-35, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 1, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-39, 6, -9.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-32.5f, 4.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 58")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, 3.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.5f, 3.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-28.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-33, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-30.75f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-41, 7.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-32, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-24.5f, -0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-28.01f, -3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-24.5f, -2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-20.99f, -3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-21, -1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 134")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-28, -1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-37, -0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-37, -2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-33.489998f, -3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-33.5f, -1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 141")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-40.5f, -1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-40.510002f, -3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-39, 2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 668")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-38.5f, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 669")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-38.5f, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 670")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 671")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 672")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-39.5f, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 675")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-39.5f, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 677")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 678")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 679")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 680")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-40.5f, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 681")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-40.5f, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 682")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 683")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-35.5f, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 684")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 685")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 686")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-26, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-26, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 688")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 689")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 690")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 691")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 692")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-27, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 693")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-27, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 694")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 695")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 696")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 697")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 698")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-28, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 699")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-28, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 700")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5f, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 701")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-23, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 702")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-24.5f, 8.25f, -10.9f).setRotationAngle(0, 0, -90).setName("Box 1715")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-25.75f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1717")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-37.25f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1723")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-35.75f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1724")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-38.25f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1725")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-37, 8.25f, -10.9f).setRotationAngle(0, 0, -90).setName("Box 1726")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 282, 581, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-28.1f, -5, -14.1f).setRotationAngle(0, -180, -13).setName("Box 2037")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 245, 580, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 12, 1, 1, 0, -0.25f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-38.5f, -3.2000008f, -14.6f).setRotationAngle(0, 0, 0).setName("Box 2040")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 94, 581, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2071")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-40, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-39, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 25")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-46.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-45, 4.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 59")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, 3.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, 3.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-41, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-43.25f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-42, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-53.5f, 7.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-44.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-56.25f, 1.5f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1727")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-56.25f, 5.5f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1728")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f)
			.setRotationPoint(-48.5f, 2.75f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1730")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f)
			.setRotationPoint(-48.5f, 4.25f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1736")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, -0.25f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.25f, -0.5f, -0.35f)
			.setRotationPoint(-48.5f, 3.75f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1737")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 134, 457, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-59.5f, 3.5f, -13).setRotationAngle(0, 0, 0).setName("Box 1742")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.5f, -2.5f, -14.5f).setRotationAngle(0, 0, 90).setName("Box 1743")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-42.5f, 0.5f, -14.5f).setRotationAngle(0, 0, 0).setName("Box 1744")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-42.5f, -3.5f, -14.5f).setRotationAngle(0, 0, 90).setName("Box 1745")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-42.5f, -3.5f, -14.5f).setRotationAngle(0, 0, 0).setName("Box 1746")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 457, textureX, textureY)
			.addShapeBox(0, -1, 0, 4, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-47, 4, -12.9f).setRotationAngle(0, -180, 0).setName("Box 1754")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 457, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-49.1f, -2.3999996f, -14.3f).setRotationAngle(0, -180, -8).setName("Box 1755")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-56.5f, -3, -14.55f).setRotationAngle(0, 0, 0).setName("Box 1756")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 457, textureX, textureY)
			.addShapeBox(2, -1, 0, 9, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-39, 0.5f, -13).setRotationAngle(0, -180, -15).setName("Box 1757")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 457, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-41.5f, -1.3999996f, -14).setRotationAngle(0, -180, -10).setName("Box 1761")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-50.75f, 5.5f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1828")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-50.75f, 1.5f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1829")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 272, 585, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-39.5f, -5, -14.1f).setRotationAngle(0, -180, -13).setName("Box 2036")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 188, 599, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-43.5f, 2, -15.4f).setRotationAngle(0, 0, 90).setName("Box 2058")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 207, 590, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(-43.5f, 1, -15.4f).setRotationAngle(0, 0, 90).setName("Box 2059")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 214, 594, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-43.5f, 6, -15.4f).setRotationAngle(0, 0, 90).setName("Box 2060")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-52.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.5f, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-47.5f, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, 2, -9.5f).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, 5, -9.5f).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 1, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-51.5f, 6, -9.5f).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-54.5f, 6.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-49.5f, -0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-53, -1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-53.01f, -3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-49.5f, -2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-46, -1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-45.99f, -3.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-51.5f, 2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-53.2f, 0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 646")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 649")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 650")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 653")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 657")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-48, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 660")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-52, -2.5f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 661")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-51, -2.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 662")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-51, -2, -9.45f).setRotationAngle(0, 0, 0).setName("Box 663")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-52, -2.75f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 664")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-53, -3, -9.45f).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-53, -3.25f, -9.45f).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-48.25f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1719")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-49.75f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1720")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-50.75f, 6, -10.9f).setRotationAngle(0, 0, 0).setName("Box 1721")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-49.5f, 8.25f, -10.9f).setRotationAngle(0, 0, -90).setName("Box 1722")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 587, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-51.5f, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2070")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(-43.51f, -3.5f, -13.5f).setRotationAngle(0, 0, 0).setName("Box 1762")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 481, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-42.5f, -2.5f, -9.5f).setRotationAngle(0, 0, 90).setName("Box 1838")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.75f, -1.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1033")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 9, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, -1, 0)
			.setRotationPoint(-31.25f, -2, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1034")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.25f, 0.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1039")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(-44.5f, -5, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1254")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-44.5f, -5, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1255")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0)
			.setRotationPoint(-44.5f, -4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1259")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1)
			.setRotationPoint(-44.5f, -3, -5.5f).setRotationAngle(90, 0, 90).setName("Box 1260")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-44.5f, -4.75f, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1261")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.5f, -4.75f, -5.5f).setRotationAngle(90, 0, 0).setName("Box 1262")
		);
		groups.add(FrontEngine);
	}

	ModelNWY6bFrontBogie bogie = new ModelNWY6bFrontBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
	}
}
