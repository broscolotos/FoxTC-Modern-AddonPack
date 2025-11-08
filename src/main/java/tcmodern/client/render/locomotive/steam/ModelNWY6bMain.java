//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.steam;


import net.minecraft.entity.Entity;
import tcmodern.client.render.locomotive.bogies.ModelNWY6bRearBogie;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWY6bMain extends FVTMFormatBase {

	public ModelNWY6bMain(){
		super();
		textureX = 512;
		textureY = 1024;
		addToCreators("Riggs64");
		//
		initGroup_group00();
		initGroup_group01();
		initGroup_group02();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group00(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 177, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 44, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 0.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 263")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(23.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(29.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 265")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(42, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 266")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(36, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 267")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(54.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 268")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(48.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 269")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(24.5f, 2, -9.5f).setRotationAngle(0, 0, -0).setName("Box 270")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(28.5f, 2, -9.5f).setRotationAngle(0, 0, -0).setName("Box 271")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.5f, 5, -9.5f).setRotationAngle(0, 0, -0).setName("Box 272")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.5f, 5, -9.5f).setRotationAngle(0, 0, -0).setName("Box 273")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, 5, -9.5f).setRotationAngle(0, 0, -0).setName("Box 274")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(53.5f, 2, -9.5f).setRotationAngle(0, 0, -0).setName("Box 275")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(49.5f, 2, -9.5f).setRotationAngle(0, 0, -0).setName("Box 276")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49.5f, 5, -9.5f).setRotationAngle(0, 0, -0).setName("Box 277")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, 5, -9.5f).setRotationAngle(0, 0, -0).setName("Box 278")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(41, 2, -9.5f).setRotationAngle(0, 0, -0).setName("Box 279")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(37, 2, -9.5f).setRotationAngle(0, 0, -0).setName("Box 280")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37, 5, -9.5f).setRotationAngle(0, 0, -0).setName("Box 281")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(11, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 282")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 33, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(17, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 283")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 5, -9.5f).setRotationAngle(0, 0, -0).setName("Box 284")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(16, 2, -9.5f).setRotationAngle(0, 0, -0).setName("Box 285")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(12, 2, -9.5f).setRotationAngle(0, 0, -0).setName("Box 286")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 5, -9.5f).setRotationAngle(0, 0, -0).setName("Box 287")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 33, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(12, 6, -9.5f).setRotationAngle(0, 0, -0).setName("Box 288")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 33, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(24.5f, 6, -9.5f).setRotationAngle(0, 0, -0).setName("Box 289")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 33, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(37, 6, -9.5f).setRotationAngle(0, 0, -0).setName("Box 290")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 33, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(49.5f, 6, -9.5f).setRotationAngle(0, 0, -0).setName("Box 291")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(43.5f, 4.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 292")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(31, 4.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 293")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(18.5f, 4.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 294")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(47.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 295")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(43, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 296")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47.5f, 3.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 297")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43, 3.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 298")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.5f, 3.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 299")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, 3.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 300")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(35, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 301")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(30.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 302")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 3.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 303")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.5f, 3.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(22.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 305")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(18, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 306")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(45.25f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 307")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(32.75f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 308")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(20.25f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 309")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(47.5f, 7.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 310")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(56.5f, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 311")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47.5f, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 313")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(46.5f, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 314")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(35, 7.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 315")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(44, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 317")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 318")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(34, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 319")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.5f, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 320")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(21.5f, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 321")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.5f, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 322")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(22.5f, 7.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 323")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(31.5f, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 324")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(10, 7.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 325")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(19, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 326")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 327")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 328")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(9, 6.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 329")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(39, -0.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 330")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 41, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(35.49f, -3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 331")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(39, -2.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 332")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 41, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(42.51f, -3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 333")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(42.5f, -1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 334")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(35.5f, -1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 335")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(26.5f, -0.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 337")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(26.5f, -2.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 338")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 49, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(30.009998f, -3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 340")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(30, -1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 341")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(23, -1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 342")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 49, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(22.989998f, -3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 343")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 49, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(51.5f, -0.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 344")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(51.5f, -2.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 345")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 49, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(55.010002f, -3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 347")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(55, -1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 348")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(48, -1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 349")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 49, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(47.99f, -3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 350")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 49, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(14, -0.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 351")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(10.5f, -1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 352")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 49, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(10.49f, -3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 353")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(14, -2.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 355")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(17.5f, -1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 356")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 49, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(17.51f, -3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 357")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 44, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 0.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 359")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(23.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 360")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(29.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 361")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(42, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 362")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(36, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 363")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(54.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 364")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(48.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 365")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(24.5f, 2, 0.5f).setRotationAngle(0, 0, -0).setName("Box 366")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(28.5f, 2, 0.5f).setRotationAngle(0, 0, -0).setName("Box 367")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.5f, 5, 0.5f).setRotationAngle(0, 0, -0).setName("Box 368")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.5f, 5, 0.5f).setRotationAngle(0, 0, -0).setName("Box 369")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, 5, 0.5f).setRotationAngle(0, 0, -0).setName("Box 370")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(53.5f, 2, 0.5f).setRotationAngle(0, 0, -0).setName("Box 371")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(49.5f, 2, 0.5f).setRotationAngle(0, 0, -0).setName("Box 372")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49.5f, 5, 0.5f).setRotationAngle(0, 0, -0).setName("Box 373")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, 5, 0.5f).setRotationAngle(0, 0, -0).setName("Box 374")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(41, 2, 0.5f).setRotationAngle(0, 0, -0).setName("Box 375")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(37, 2, 0.5f).setRotationAngle(0, 0, -0).setName("Box 376")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37, 5, 0.5f).setRotationAngle(0, 0, -0).setName("Box 377")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(11, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 378")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(17, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 379")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 5, 0.5f).setRotationAngle(0, 0, -0).setName("Box 380")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(16, 2, 0.5f).setRotationAngle(0, 0, -0).setName("Box 381")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(12, 2, 0.5f).setRotationAngle(0, 0, -0).setName("Box 382")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 5, 0.5f).setRotationAngle(0, 0, -0).setName("Box 383")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 49, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(12, 6, 0.5f).setRotationAngle(0, 0, -0).setName("Box 384")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 49, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(24.5f, 6, 0.5f).setRotationAngle(0, 0, -0).setName("Box 385")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 49, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(37, 6, 0.5f).setRotationAngle(0, 0, -0).setName("Box 386")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 49, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(49.5f, 6, 0.5f).setRotationAngle(0, 0, -0).setName("Box 387")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(43.5f, 4.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 388")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(31, 4.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 389")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(18.5f, 4.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 390")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(47.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 391")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(43, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 392")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47.5f, 3.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 393")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43, 3.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 394")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.5f, 3.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 395")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, 3.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 396")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(35, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 397")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(30.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 398")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 3.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 399")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.5f, 3.75f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 400")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(22.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 401")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(18, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 402")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(45.25f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 403")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(32.75f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 404")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(20.25f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 405")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(47.5f, 7.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 406")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(56.5f, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 407")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 408")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47.5f, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 409")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(46.5f, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 410")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(35, 7.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 411")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(44, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 412")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 413")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 414")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(34, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 415")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.5f, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 416")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(21.5f, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 417")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.5f, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 418")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(22.5f, 7.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 419")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(31.5f, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 420")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(10, 7.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 421")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(19, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 422")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 423")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 424")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(9, 6.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 425")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(39, -0.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 426")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 57, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(35.49f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 427")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(39, -2.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 428")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 57, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(42.51f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 429")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(42.5f, -1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 430")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(35.5f, -1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 431")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(26.5f, -0.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 433")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(26.5f, -2.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 434")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 57, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(30.009998f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 436")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(30, -1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 437")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(23, -1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 438")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 57, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(22.989998f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 439")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(51.5f, -0.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 440")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(51.5f, -2.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 441")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 57, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(55.010002f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 443")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(55, -1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 444")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(48, -1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 445")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 57, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(47.99f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 446")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(14, -0.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 447")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(10.5f, -1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 448")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 65, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(10.49f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 449")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(14, -2.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 451")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(17.5f, -1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 452")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 65, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(17.51f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 453")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(10.5f, 0.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 465")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(10.5f, 5.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 466")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(10.299999f, 0.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 467")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(10.299999f, 0.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 468")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 65, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(0.5f, 2.5f, -5.5f).setRotationAngle(0, 0, -0).setName("Box 413")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, 3.5f, -4.5f).setRotationAngle(0, 0, -0).setName("Box 417")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(0.5f, 6.5f, -5.5f).setRotationAngle(0, 0, -0).setName("Box 418")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 1, 1, -4, 0, 3, 0, 0, 3, -10, 1, 1, -6, 1, -1, -4, 0, -3, 0, 0, -3, -10, 1, -1, -6)
			.setRotationPoint(6.5f, 3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 422")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 1, 0, -4, 0, 0, 0, 0, 0, -10, 1, 0, -6, 1, 0, -4, 0, 0, 0, 0, 0, -10, 1, 0, -6)
			.setRotationPoint(6.5f, 5.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 423")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 65, textureX, textureY).addBox(0, 0, 0, 2, 4, 3)
			.setRotationPoint(3.5f, 2.5f, -5.5f).setRotationAngle(0, 0, -0).setName("Box 424")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 1, 0, -6, 0, 0, -10, 0, 0, 0, 1, 0, -4, 1, 0, -6, 0, 0, -10, 0, 0, 0, 1, 0, -4)
			.setRotationPoint(6.5f, 5.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 426")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 1, 1, -6, 0, 3, -10, 0, 3, 0, 1, 1, -4, 1, -1, -6, 0, -3, -10, 0, -3, 0, 1, -1, -4)
			.setRotationPoint(6.5f, 3.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 427")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(12, 2.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 449")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(24.5f, 2.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 458")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(37, 2.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 463")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(49.5f, 2.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 468")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(37, 2.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 489")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39.5f, 3, -10).setRotationAngle(0, 0, -0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, 3, -10).setRotationAngle(0, 0, -0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(38.5f, 4, -10).setRotationAngle(0, 0, -0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(39.5f, 4, -10).setRotationAngle(0, 0, -0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, 3, -10).setRotationAngle(0, 0, -0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52, 3, -10).setRotationAngle(0, 0, -0).setName("Box 495")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(52, 4, -10).setRotationAngle(0, 0, -0).setName("Box 496")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(51, 4, -10).setRotationAngle(0, 0, -0).setName("Box 497")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(49.5f, 2.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 498")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, 3, -10).setRotationAngle(0, 0, -0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27, 3, -10).setRotationAngle(0, 0, -0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(27, 4, -10).setRotationAngle(0, 0, -0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(26, 4, -10).setRotationAngle(0, 0, -0).setName("Box 502")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(24.5f, 2.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 503")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, 3, -10).setRotationAngle(0, 0, -0).setName("Box 504")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.5f, 3, -10).setRotationAngle(0, 0, -0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(13.5f, 4, -10).setRotationAngle(0, 0, -0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(14.5f, 4, -10).setRotationAngle(0, 0, -0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(12, 2.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 508")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 81, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(54.5f, 5.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 81, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(54.5f, -6.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(55.300003f, 0.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 545")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(55.300003f, 0.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 546")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(46, -2, -10.01f).setRotationAngle(0, 0, -0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 97, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(33.5f, -2, -10.01f).setRotationAngle(0, 0, -0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 105, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(21, -2, -10.01f).setRotationAngle(0, 0, -0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 105, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(8.5f, -2, -10.01f).setRotationAngle(0, 0, -0).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 105, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(8.5f, -2, 2.01f).setRotationAngle(0, 0, -0).setName("Box 524")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 105, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(21, -2, 2.01f).setRotationAngle(0, 0, -0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 105, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(33.5f, -2, 2.01f).setRotationAngle(0, 0, -0).setName("Box 526")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 105, textureX, textureY).addBox(0, 0, 0, 12, 12, 0)
			.setRotationPoint(46, -2, 2.01f).setRotationAngle(0, 0, -0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 793")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 794")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 795")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 796")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 797")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 798")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 799")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 800")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 801")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 802")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 803")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 804")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(10.5f, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 805")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(10.5f, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 806")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(11.5f, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 807")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(11.5f, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 808")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(12.5f, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 809")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(12.5f, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 810")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 811")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 812")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 813")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 814")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 815")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 816")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 817")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 818")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 819")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 820")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 821")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(15.5f, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 822")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(10.5f, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 823")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(10.5f, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 824")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(11.5f, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 825")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(11.5f, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 826")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(12.5f, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 827")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(12.5f, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 828")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 829")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 830")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 831")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 832")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 833")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 834")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 835")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 836")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 837")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 838")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 839")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 840")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(23, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 841")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(23, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 842")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(24, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 843")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(24, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 844")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(25, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 845")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(25, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 846")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 847")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 848")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 849")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 850")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 851")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 852")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 853")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 854")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 855")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 856")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 857")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(28, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 858")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(23, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 859")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(23, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 860")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(24, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 861")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(24, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 862")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(25, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 863")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(25, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 864")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 865")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 866")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 867")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 868")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 869")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 870")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 871")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 872")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 873")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 874")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 875")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 876")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(35.5f, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 877")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(35.5f, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 878")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(36.5f, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 879")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(36.5f, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 880")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(37.5f, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 881")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(37.5f, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 882")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 883")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 884")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 885")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 886")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 887")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 888")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 889")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 890")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 891")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 892")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 893")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 894")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(35.5f, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 895")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(35.5f, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 896")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(36.5f, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 897")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(36.5f, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 898")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(37.5f, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 899")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(37.5f, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 900")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 901")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 902")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 903")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 904")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 905")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 906")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 907")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 908")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 909")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 910")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 911")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 912")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(48, -3.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 913")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(48, -3, -9.45f).setRotationAngle(0, 0, -0).setName("Box 914")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(49, -2.75f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 915")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(49, -2.5f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 916")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(50, -2.25f, -9.45f).setRotationAngle(0, 0, -0).setName("Box 917")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(50, -2, -9.45f).setRotationAngle(0, 0, -0).setName("Box 918")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 919")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 920")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 921")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 922")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 923")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 924")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 925")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 926")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 927")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 928")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(53, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 930")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(48, -3.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 931")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(48, -3, 0.45f).setRotationAngle(0, 0, -0).setName("Box 932")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(49, -2.75f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 933")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(49, -2.5f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(50, -2.25f, 0.45f).setRotationAngle(0, 0, -0).setName("Box 935")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(50, -2, 0.45f).setRotationAngle(0, 0, -0).setName("Box 936")
		);
		group0.add(new ModelRendererTurbo(group0, 174, 546, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 4, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-57, -17.25f, -14).setRotationAngle(0, 0, -0).setName("Box 950")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 559, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 4, 6, 0, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(-57, -23.5f, -7).setRotationAngle(0, 0, -0).setName("Box 951")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 564, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 4, 2, 0, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f)
			.setRotationPoint(-57, -22.25f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 952")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 549, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 4, 16, 0, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 0.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2)
			.setRotationPoint(-57, -19.5f, -12).setRotationAngle(0, 0, -0).setName("Box 953")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 4, 2, 0, 0, -2.25f, 3.125f, 1, -2.25f, 3.125f, 1, -2.25f, 12.125f, 0, -2.25f, 12.125f, -3, 0.875f, 0.5f, 1, 0.875f, 0.5f, 1, 0.875f, 9.5f, -3, 0.875f, 9.5f)
			.setRotationPoint(-57, -11.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 957")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-39, -17.25f, -14).setRotationAngle(0, 0, -0).setName("Box 917")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 2, 0, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16)
			.setRotationPoint(-39, -19.5f, -12).setRotationAngle(0, 0, -0).setName("Box 918")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 2, 0, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f)
			.setRotationPoint(-39, -22.25f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 920")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 2, 0, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f)
			.setRotationPoint(-39, -14.5f, -12).setRotationAngle(0, 0, -0).setName("Box 921")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f)
			.setRotationPoint(-39, -11.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 922")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 41, 4, 6, 0, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1)
			.setRotationPoint(-37, -10.5f, -7).setRotationAngle(0, 0, -0).setName("Box 923")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 2, 0, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f)
			.setRotationPoint(4, -22.25f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 935")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 2, 0, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16)
			.setRotationPoint(4, -19.5f, -12).setRotationAngle(0, 0, -0).setName("Box 936")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 6, 0, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1)
			.setRotationPoint(4, -10.5f, -7).setRotationAngle(0, 0, -0).setName("Box 937")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f)
			.setRotationPoint(4, -11.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 938")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 2, 0, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f)
			.setRotationPoint(4, -14.5f, -12).setRotationAngle(0, 0, -0).setName("Box 939")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 18, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 18, 0, 0.5f, 18)
			.setRotationPoint(4, -17.25f, -14).setRotationAngle(0, 0, -0).setName("Box 940")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 4, 2, 0, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16)
			.setRotationPoint(29, -19.5f, -12).setRotationAngle(0, 0, -0).setName("Box 945")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 4, 2, 0, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f)
			.setRotationPoint(29, -22.25f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 946")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0.62f, 0, 0, 0.12f, 0)
			.setRotationPoint(-39, -6.870001f, -10).setRotationAngle(0, 0, -0).setName("Box 966")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, -0.48f, 0, 0, 0.02f, 0, 0, 0.02f, 0, 0, -0.48f, 0)
			.setRotationPoint(-39, -6.2700005f, -6).setRotationAngle(0, 0, -0).setName("Box 967")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 4, 6, 0, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, -1.5f, 0.75f, -1, 0, 0.75f, -1, 0, 0.75f, -1, -1.5f, 0.75f, -1)
			.setRotationPoint(-54, -10.5f, -7).setRotationAngle(0, 0, -0).setName("Box 971")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.12f, 0, 0, 0.62f, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-39, -6.870001f, -2).setRotationAngle(0, 0, -0).setName("Box 972")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 6, 0, 0, 1.25f, -1, 0, 1.75f, -1, 0, 1.75f, -1, 0, 1.25f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(-39, -23.5f, -7).setRotationAngle(0, 0, -0).setName("Box 919")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 6, 0, 0, 1.75f, -1, 0, 1.75f, -1, 0, 1.75f, -1, 0, 1.75f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(4, -23.5f, -7).setRotationAngle(0, 0, -0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 4, 6, 0, 0, 1.75f, -1, 0, 0.75f, -1, 0, 0.75f, -1, 0, 1.75f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(29, -23.5f, -7).setRotationAngle(0, 0, -0).setName("Box 947")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, -0.1f, 2, 0, -0.1f, 2, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(60, -21.5f, -16.85f).setRotationAngle(0, 0, -0).setName("Box 990")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, -0.6f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6f, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(60.5f, -20.5f, 8).setRotationAngle(0, 0, -0).setName("Box 1008")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(65, -20.5f, 8).setRotationAngle(0, 0, -0).setName("Box 1009")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(62.5f, -15.5f, 8).setRotationAngle(0, 0, -0).setName("Box 1010")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(64.5f, -15.5f, 8).setRotationAngle(0, 0, -0).setName("Box 1011")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(74.5f, -20.5f, 8).setRotationAngle(0, 0, -0).setName("Box 1012")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(64.5f, -15.5f, -17).setRotationAngle(0, 0, -0).setName("Box 1013")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(74.5f, -20.5f, -17).setRotationAngle(0, 0, -0).setName("Box 1014")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(62.5f, -15.5f, -17).setRotationAngle(0, 0, -0).setName("Box 1015")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, -0.6f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6f, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(60.5f, -20.5f, -17).setRotationAngle(0, 0, -0).setName("Box 1016")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(65, -20.5f, -17).setRotationAngle(0, 0, -0).setName("Box 1017")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 2, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0.95f, 0.25f, 0, 0.95f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.6f, 0.25f, 0, -1.6f, 0.25f)
			.setRotationPoint(59.5f, -25, -13.25f).setRotationAngle(0, 0, -0).setName("Box 1018")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, -0.65f, -1.8f, 0, -0.65f, -1.8f, 0, -1, 0.8f, 0, -1, 0.8f, 0, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(59.5f, -25.5f, -15.05f).setRotationAngle(0, 0, -0).setName("Box 1021")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 2, 1, 0, 0.5f, 0, -1.8f, 0.5f, 0, -1.8f, 0.5f, 0, 1.3f, 0.5f, 0, 1.3f, 0.5f, 0, -0.25f, -4.5f, 0, -0.25f, -4.5f, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(60, -23.5f, -16.6f).setRotationAngle(0, 0, -0).setName("Box 1022")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0.55f, 0.25f, 0, 0.55f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.2f, 0.25f, 0, -1.2f, 0.25f)
			.setRotationPoint(59.5f, -26.099998f, -11).setRotationAngle(0, 0, -0).setName("Box 1026")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(59.5f, -26.8f, -7.75f).setRotationAngle(0, 0, -0).setName("Box 1027")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 2, 1, 0, 0.5f, 0, 1.3f, 0.5f, 0, 1.3f, 0.5f, 0, -1.8f, 0.5f, 0, -1.8f, 0.5f, 0, -0.25f, -4.5f, 0, -0.25f, -4.5f, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(60, -23.5f, 7.6f).setRotationAngle(0, 0, -0).setName("Box 977")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, -1, 0.8f, 0, -1, 0.8f, 0, -0.65f, -1.8f, 0, -0.65f, -1.8f, 0, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(59.5f, -25.5f, 6.05f).setRotationAngle(0, 0, -0).setName("Box 978")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 2, 0, 0, 0.95f, 0.25f, 0, 0.95f, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -1.6f, 0.25f, 0, -1.6f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(59.5f, -25, 3.25f).setRotationAngle(0, 0, -0).setName("Box 979")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 3, 0, 0, 0.55f, 0.25f, 0, 0.55f, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -1.2f, 0.25f, 0, -1.2f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(59.5f, -26.099998f, 0).setRotationAngle(0, 0, -0).setName("Box 980")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(59.5f, -26.8f, -3.25f).setRotationAngle(0, 0, -0).setName("Box 981")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 25, 0, 0, 0, -0.25f, -1.5f, 0, -0.25f, -1.5f, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(62.5f, -15.5f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 972")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 23, 0, -0.6f, 0, -0.75f, -3, 0, -0.75f, -3, 0, -0.75f, -0.6f, 0, -0.75f, -2, 0, -0.25f, -1.5f, 0, -0.25f, -1.5f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(60.5f, -20.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 973")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0.5f, 0, 0, 3.5f, 0, 0, 3.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 2, 0, -0.4f, 2, 0, -0.1f, -0.5f, 0, -0.1f)
			.setRotationPoint(60, -21.5f, 7.85f).setRotationAngle(0, 0, -0).setName("Box 974")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 21, 0, -1.55f, 0, -2.75f, -1.95f, 0, -2.75f, -1.95f, 0, -2.75f, -1.55f, 0, -2.75f, -2, 0, 0.25f, -1.5f, 0, 0.25f, -1.5f, 0, 0.25f, -2, 0, 0.25f)
			.setRotationPoint(58.550003f, -25.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 975")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 15, 0, -1.6f, -0.05f, -3, -1.9f, -0.05f, -3, -1.9f, -0.05f, -3, -1.6f, -0.05f, -3, -2, 0, -0.25f, -1.5f, 0, -0.25f, -1.5f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(58.1f, -26.5f, -11.5f).setRotationAngle(0, 0, -0).setName("Box 976")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 4, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -8.25f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 979")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 24, 0, 0, 0, -1.5f, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1)
			.setRotationPoint(29, -13.25f, -16).setRotationAngle(0, 0, -0).setName("Box 980")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 22, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(29, -17.25f, -15).setRotationAngle(0, 0, -0).setName("Box 981")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 23, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f)
			.setRotationPoint(29, -9.25f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 982")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f)
			.setRotationPoint(64.5f, -8.5f, -16.75f).setRotationAngle(0, 0, -0).setName("Box 207")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 45, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(30, -7.25f, -9).setRotationAngle(0, 0, -0).setName("Box 984")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 25, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -8.25f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 985")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 25, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, -3)
			.setRotationPoint(75, -0.25f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 986")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 19, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -6, -0.5f, 0, -6, -0.5f, 0, -6, 0, 0, -6)
			.setRotationPoint(75, 2.75f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 987")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 6, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -8.25f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 992")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 19, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(62, -1.25f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 993")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 19, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -2.25f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 994")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 209, textureX, textureY)
			.addShapeBox(0, 1, 0, 2, 1, 10, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(69, 0.75f, -9).setRotationAngle(0, 0, -0).setName("Box 1004")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 209, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 10, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1, 0, 0, 1, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(70, 1.75f, -9).setRotationAngle(0, 0, -0).setName("Box 1005")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 217, textureX, textureY)
			.addShapeBox(0, 1, 0, 4, 1, 10, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(71, 2.75f, -9).setRotationAngle(0, 0, -0).setName("Box 1006")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 217, textureX, textureY)
			.addShapeBox(0, 1, 0, 7, 1, 10, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(55.75f, 2.75f, -9).setRotationAngle(0, 0, -0).setName("Box 1007")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 217, textureX, textureY)
			.addShapeBox(0, 1, 0, 2, 1, 10, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, 0, 0)
			.setRotationPoint(61.75f, 1.75f, -9).setRotationAngle(0, 0, -0).setName("Box 1008")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 225, textureX, textureY)
			.addShapeBox(0, 1, 0, 3, 1, 10, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(61.75f, 0.75f, -9).setRotationAngle(0, 0, -0).setName("Box 1009")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 23, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -4.25f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 1010")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 23, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0)
			.setRotationPoint(65, -8.25f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 997")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 249, textureX, textureY).addBox(0, 0, 0, 11, 5, 5)
			.setRotationPoint(-3, 1.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1052")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 0.5f, -9.5f).setRotationAngle(-90, 0, -0).setName("Box 1053")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 1.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 1055")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(-3, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1058")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(-3, 6.5f, -9.5f).setRotationAngle(-90, 0, -0).setName("Box 1059")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -0.5f, -15.5f).setRotationAngle(90, 0, -0).setName("Box 1060")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-4, -0.5f, -11.5f).setRotationAngle(90, 0, -0).setName("Box 1061")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 273, textureX, textureY).addBox(0, 0, 0, 14, 3, 3)
			.setRotationPoint(-4, -3.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1062")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-4, -0.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1063")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -4.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1064")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 0.5f, 6.5f).setRotationAngle(-90, 0, -0).setName("Box 1066")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(-3, 1.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 1067")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(-3, 6.5f, 6.5f).setRotationAngle(-90, 0, -0).setName("Box 1068")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 273, textureX, textureY).addBox(0, 0, 0, 11, 5, 5)
			.setRotationPoint(-3, 1.5f, 1.5f).setRotationAngle(0, 0, -0).setName("Box 1069")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 1070")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 24, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-2.75f, -2.5f, -16).setRotationAngle(0, 0, -0).setName("Box 1078")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 22, 0, 0, 0, -0.2f, -0.5f, 0, -0.2f, -0.5f, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-2.75f, -4, -15).setRotationAngle(0, 0, -0).setName("Box 1079")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 21, 0, 0, 0.3f, -2.1f, -0.5f, 0.3f, -2.1f, -0.5f, 0.3f, -1.3f, 0, 0.3f, -1.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.6f, 0, 0, 0.6f)
			.setRotationPoint(-2.75f, -5, -14.8f).setRotationAngle(0, 0, -0).setName("Box 1080")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -0.5f, 2.5f).setRotationAngle(90, 0, -0).setName("Box 1095")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -4.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1096")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 289, textureX, textureY).addBox(0, 0, 0, 14, 3, 3)
			.setRotationPoint(-4, -3.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1097")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-4, -0.5f, 6.5f).setRotationAngle(90, 0, -0).setName("Box 1098")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-4, -0.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1099")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 209, textureX, textureY).addBox(0, 0, 0, 2, 5, 5)
			.setRotationPoint(-31.25f, -7.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1035")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 5, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-32.25f, -7.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1036")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 5, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.25f, -7.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1037")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 249, textureX, textureY).addBox(0, 1, 0, 1, 2, 10)
			.setRotationPoint(74, 0.75f, -9).setRotationAngle(0, 0, -0).setName("Box 1040")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 6, 0, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f)
			.setRotationPoint(-32.25f, -10.5f, -7).setRotationAngle(0, 0, -0).setName("Box 1041")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, 0.875f, 0.7f, 0, 0.875f, 0.7f, 0, 0.875f, 9.7f, 0, 0.875f, 9.7f)
			.setRotationPoint(-32.25f, -11.75f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1042")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 297, textureX, textureY).addBox(0, 1, 0, 3, 2, 10)
			.setRotationPoint(55.75f, 0.75f, -9).setRotationAngle(0, 0, -0).setName("Box 1048")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, -26.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 1069")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, -26.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1071")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(16.75f, -26.5f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1072")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(18.25f, -26.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 1073")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, -27.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1066")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, -27.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 1067")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, -27.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1068")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, -1, 0, 0, -1, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, -1, 0, 0, -1, -0.5f, 0, 1, -0.5f, 0, 1)
			.setRotationPoint(16.75f, -26.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1069")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 305, textureX, textureY).addBox(0, 0, 0, 9, 4, 1)
			.setRotationPoint(16.75f, -26.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1070")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, -1, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(16.75f, -27.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1071")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 305, textureX, textureY).addBox(0, 0, 0, 9, 4, 1)
			.setRotationPoint(16.75f, -26.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1073")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, -27.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1074")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(16.75f, -27.5f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1076")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(18.25f, -27.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 1077")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(16.75f, -27.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1079")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, -1, 0, 0, -1, -0.5f, 0, 1, -0.5f, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(16.75f, -26.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1080")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.25f, -27.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 1081")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.75f, -26.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1082")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.75f, -27.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1083")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.25f, -26.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 1084")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 305, textureX, textureY).addBox(0, 0, 0, 9, 4, 5)
			.setRotationPoint(-33.25f, -26.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1085")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.25f, -27.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1086")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-33.25f, -26.5f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1093")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-33.25f, -27.5f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1094")
		);
		groups.add(group0);
	}

	private final void initGroup_group01(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 1, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(-31.75f, -26.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 1095")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(-31.75f, -27.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 1096")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 6, 0, 0, 1.95f, -0.8f, 0, 1.95f, -0.8f, 0, 1.95f, -0.8f, 0, 1.95f, -0.8f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f)
			.setRotationPoint(15.75f, -23.5f, -7).setRotationAngle(0, 0, -0).setName("Box 1097")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 2, 0, 0, 0.875f, 0.7f, 0, 0.875f, 0.7f, 0, 0.875f, 9.7f, 0, 0.875f, 9.7f, 0, -2.25f, 3.325f, 0, -2.25f, 3.325f, 0, -2.25f, 12.325f, 0, -2.25f, 12.325f)
			.setRotationPoint(15.75f, -22.25f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1098")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 2, 0, 0, 1, 0.825f, 0, 1, 0.825f, 0, 1, 14.825f, 0, 1, 14.825f, 0, -1.75f, 2.2f, 0, -1.75f, 2.2f, 0, -1.75f, 16.2f, 0, -1.75f, 16.2f)
			.setRotationPoint(15.75f, -19.5f, -12).setRotationAngle(0, 0, -0).setName("Box 1099")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 2, 0, 0, 1, 0.825f, 0, 1, 0.825f, 0, 1, 14.825f, 0, 1, 14.825f, 0, -1.75f, 2.2f, 0, -1.75f, 2.2f, 0, -1.75f, 16.2f, 0, -1.75f, 16.2f)
			.setRotationPoint(-34.25f, -19.5f, -12).setRotationAngle(0, 0, -0).setName("Box 1100")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 2, 0, 0, 0.875f, 0.7f, 0, 0.875f, 0.7f, 0, 0.875f, 9.7f, 0, 0.875f, 9.7f, 0, -2.25f, 3.325f, 0, -2.25f, 3.325f, 0, -2.25f, 12.325f, 0, -2.25f, 12.325f)
			.setRotationPoint(-34.25f, -22.25f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1101")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 6, 0, 0, 1.45f, -0.8f, 0, 1.65f, -0.8f, 0, 1.65f, -0.8f, 0, 1.45f, -0.8f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f)
			.setRotationPoint(-34.25f, -23.5f, -7).setRotationAngle(0, 0, -0).setName("Box 1102")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.75f, -27.5f, -7).setRotationAngle(0, 0, -0).setName("Box 1091")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.25f, -27.5f, -8).setRotationAngle(0, 0, -0).setName("Box 1092")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(2.75f, -27.5f, -3).setRotationAngle(0, 0, -0).setName("Box 1093")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(4.25f, -27.5f, -1).setRotationAngle(0, 0, -0).setName("Box 1094")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(2.75f, -26.5f, -3).setRotationAngle(0, 0, -0).setName("Box 1095")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(4.25f, -26.5f, -1).setRotationAngle(0, 0, -0).setName("Box 1096")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.75f, -26.5f, -7).setRotationAngle(0, 0, -0).setName("Box 1097")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.25f, -26.5f, -8).setRotationAngle(0, 0, -0).setName("Box 1098")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 313, textureX, textureY).addBox(0, 0, 0, 9, 4, 2)
			.setRotationPoint(2.75f, -26.5f, -5).setRotationAngle(0, 0, -0).setName("Box 1099")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.75f, -27.5f, -5).setRotationAngle(0, 0, -0).setName("Box 1100")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-49.75f, -27.5f, -5).setRotationAngle(0, 0, -0).setName("Box 1098")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-49.75f, -27.5f, -6).setRotationAngle(0, 0, -0).setName("Box 1104")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, -1.5f, 0, -0.2f, -1.5f, 0, -0.2f, 0, 0, 0, 0, 0, 0, -2, 0, -0.2f, -1.5f, 0, -0.2f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-49.25f, -27.5f, -7).setRotationAngle(0, 0, -0).setName("Box 1106")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(-49.75f, -27.5f, -3).setRotationAngle(0, 0, -0).setName("Box 1107")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, -0.2f, -1.5f, 0, -0.2f, -0.5f, 0, 0, 0, 0, 0, -1.5f, 0, -0.2f, -2, 0, -0.2f)
			.setRotationPoint(-49.25f, -27.5f, -2).setRotationAngle(0, 0, -0).setName("Box 1109")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-50.25f, -25, -5.5f).setRotationAngle(0, 0, -0).setName("Box 1158")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 1, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-50.25f, -25, -6.5f).setRotationAngle(0, 0, -0).setName("Box 1159")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -1.5f, -0.5f, -0.2f, -1.5f, -0.5f, -0.2f, 0, -0.2f, 0, 0, -0.2f, 0, -2, 0, -0.2f, -1.5f, 0, -0.2f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-49.75f, -25, -7.5f).setRotationAngle(0, 0, -0).setName("Box 1160")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(-50.25f, -25, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1161")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, -0.2f, 0, 0, -0.2f, 0, -1.5f, -0.5f, -0.2f, -1.5f, -0.5f, -0.2f, -0.5f, 0, 0, 0, 0, 0, -1.5f, 0, -0.2f, -2, 0, -0.2f)
			.setRotationPoint(-49.75f, -25, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1162")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 321, textureX, textureY).addBox(0, 0, 0, 4, 3, 7)
			.setRotationPoint(-55.75f, -26.5f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 1163")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.25f, -18, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1149")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 11, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.25f, -21, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1150")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.25f, -22, -8).setRotationAngle(0, 0, -0).setName("Box 1151")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f)
			.setRotationPoint(-58.25f, -16, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1160")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f)
			.setRotationPoint(-58.25f, -13, -8).setRotationAngle(0, 0, -0).setName("Box 1163")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 13, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-57.75f, -18.5f, -10.5f).setRotationAngle(0, 0, -0).setName("Box 1166")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 13, 0, 0, 0, -2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-57.75f, -21.5f, -10.5f).setRotationAngle(0, 0, -0).setName("Box 1167")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0.45f, -2.8f, 0, 0.7f, -2.3f, 0, 0.7f, -2.3f, 0, 0.45f, -2.8f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-57.75f, -22.5f, -9).setRotationAngle(0, 0, -0).setName("Box 1168")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 13, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -2)
			.setRotationPoint(-57.75f, -15.5f, -10.5f).setRotationAngle(0, 0, -0).setName("Box 1169")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.45f, -2.8f, 0, 0.3f, -2.3f, 0, 0.3f, -2.3f, 0, 0.45f, -2.8f)
			.setRotationPoint(-57.75f, -12.5f, -9).setRotationAngle(0, 0, -0).setName("Box 1170")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 114, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-53, -23, -12.25f).setRotationAngle(0, 0, -0).setName("Box 1213")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.5f, -22, -12.25f).setRotationAngle(0, 0, -0).setName("Box 1215")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-55, -22, -12.25f).setRotationAngle(0, 0, -0).setName("Box 1216")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.75f, -21.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1218")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-49.75f, -22.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1219")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-33.75f, -22.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1220")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-17.75f, -22.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1221")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-3.75f, -22.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1222")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(11.25f, -22.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1223")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(28.25f, -22.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1224")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(44.25f, -22.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1225")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(57.25f, -22.900002f, -12.15f).setRotationAngle(0, 0, -0).setName("Box 1226")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-49.65f, -22.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1227")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-33.65f, -22.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1229")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-17.65f, -22.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1230")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-3.65f, -22.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1231")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(11.35f, -22.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1232")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(28.349998f, -22.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1233")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(44.35f, -22.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1234")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(57.35f, -22.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1235")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.66f, -21.849998f, -12.15f).setRotationAngle(45, 0, -0).setName("Box 1236")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 114, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-53, -23, 3.95f).setRotationAngle(0, 0, -0).setName("Box 1237")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.75f, -21.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1238")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.5f, -22, 3.95f).setRotationAngle(0, 0, -0).setName("Box 1239")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-55, -22, 3.95f).setRotationAngle(0, 0, -0).setName("Box 1240")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-49.75f, -22.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1241")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-33.75f, -22.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1242")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-17.75f, -22.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1243")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-3.75f, -22.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1244")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(28.25f, -22.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1245")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(11.25f, -22.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1246")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(44.25f, -22.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1247")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(57.25f, -22.900002f, 4.05f).setRotationAngle(0, 0, -0).setName("Box 1248")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.66f, -22.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1249")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-49.65f, -23.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1250")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-33.65f, -23.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1251")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-17.65f, -23.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1252")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-3.65f, -23.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1253")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(11.35f, -23.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1254")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(28.349998f, -23.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1255")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(44.35f, -23.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1256")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(57.35f, -23.05f, 3.9f).setRotationAngle(-45, 0, -0).setName("Box 1257")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, -0.005f, -0.7f, 0, 0.4f, -0.71f, 0, 0.4f, -0.71f, -0.7f, -0.005f, -0.7f, -0.7f)
			.setRotationPoint(-56.65f, -25.5f, -1.75f).setRotationAngle(0, 90, -0).setName("Box 1255")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.75f, -24.599998f, -8.55f).setRotationAngle(0, 0, -0).setName("Box 1257")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.6f, -0.65f, 0, 0.6f, -0.65f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.65f, -25.5f, -6.25f).setRotationAngle(0, 90, 19).setName("Box 1258")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.02f, -0.005f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0.02f, -0.005f, -0.7f, -0.21f, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, -0.21f, -0.7f, -0.7f)
			.setRotationPoint(-56.35f, -23.82f, 2.45f).setRotationAngle(0, -90, 45).setName("Box 1263")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0.02f, 0, 0.5f, 0.02f, -0.7f, 0, 0, -0.7f, -0.1f, -0.71f, 0, 0.6f, -0.65f, 0, 0.6f, -0.65f, -0.7f, -0.1f, -0.71f, -0.7f)
			.setRotationPoint(-56.35f, -25.5f, -1.75f).setRotationAngle(0, -90, 19).setName("Box 1265")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.75f, -24.599998f, 0.55f).setRotationAngle(0, 0, -0).setName("Box 1266")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.3f, -0.01f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0.3f, -0.01f, -0.7f, -0.01f, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, -0.01f, -0.7f, -0.7f)
			.setRotationPoint(-56.65f, -21.82f, -12.42f).setRotationAngle(0, 90, 59).setName("Box 1267")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.22f, -0.005f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0.22f, -0.005f, -0.7f, -0.01f, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, -0.01f, -0.7f, -0.7f)
			.setRotationPoint(-56.35f, -21.82f, 4.45f).setRotationAngle(0, -90, 58).setName("Box 1268")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.75f, -19.75f, -13.55f).setRotationAngle(0, 0, -0).setName("Box 1269")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-56.75f, -19.75f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1270")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, -0.2f, -0.7f, 0, -0.2f, -0.7f)
			.setRotationPoint(-56.65f, -19.55f, -13.3f).setRotationAngle(90, 0, -0).setName("Box 1271")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 337, textureX, textureY)
			.addShapeBox(2.5f, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0, 1, 0.02f, 0, 1, 0.02f, -0.7f, 0, 0.15f, -0.7f, -0.1f, -0.81f, 0, 1.1f, -0.65f, 0, 1.1f, -0.65f, -0.7f, -0.1f, -0.81f, -0.7f)
			.setRotationPoint(-56.35f, -25.5f, -1.75f).setRotationAngle(0, -90, 22).setName("Box 1273")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.02f, -0.005f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0.02f, -0.005f, -0.7f, -0.21f, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, -0.21f, -0.7f, -0.7f)
			.setRotationPoint(-56.65f, -23.82f, -10.45f).setRotationAngle(0, 90, 45).setName("Box 1274")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 337, textureX, textureY)
			.addShapeBox(2.5f, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0, 1, 0.02f, 0, 1, 0.02f, -0.7f, 0, 0.15f, -0.7f, -0.1f, -0.81f, 0, 1.1f, -0.65f, 0, 1.1f, -0.65f, -0.7f, -0.1f, -0.81f, -0.7f)
			.setRotationPoint(-56.65f, -25.5f, -6.25f).setRotationAngle(0, 90, 22).setName("Box 1275")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.7f, 0.25f, 0, -0.7f, 0, 0, -0.7f, 0.25f, 0, -0.7f, 0.25f)
			.setRotationPoint(-56.5f, -10.700001f, 4.75f).setRotationAngle(0, 0, -0).setName("Box 1269")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 119, 1, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-56.5f, -13.700001f, -16).setRotationAngle(0, 0, -0).setName("Box 1270")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 98, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0.05f, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-35.5f, -13.700001f, 4.72f).setRotationAngle(0, 0, -0).setName("Box 1271")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 22, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-42.5f, -9.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1272")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 22, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-42.5f, -7.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1273")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 361, textureX, textureY).addBox(0, 0, 0, 1, 3, 22)
			.setRotationPoint(-42.5f, -8.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1274")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0)
			.setRotationPoint(0.5f, -6.299999f, 4.5f).setRotationAngle(0, 180, -180).setName("Box 1303")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(0.5f, -5.299999f, 4.5f).setRotationAngle(0, 180, -180).setName("Box 1304")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1)
			.setRotationPoint(0.5f, -7.299999f, 4.5f).setRotationAngle(90, 180, -90).setName("Box 1305")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(0.5f, -5.299999f, 2.5f).setRotationAngle(0, 180, -180).setName("Box 1306")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 361, textureX, textureY).addBox(0, 0, 0, 1, 3, 18)
			.setRotationPoint(-17.5f, -7.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1311")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-17.5f, -8.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1312")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -6.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1313")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, -7.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1314")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, -6.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1315")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-20.5f, -8.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1316")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1)
			.setRotationPoint(0.5f, -7.299999f, -9.3f).setRotationAngle(90, 180, -90).setName("Box 1317")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(0.5f, -5.299999f, -11.3f).setRotationAngle(0, 180, -180).setName("Box 1318")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0)
			.setRotationPoint(0.5f, -6.299999f, -9.3f).setRotationAngle(0, 180, -180).setName("Box 1319")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(0.5f, -5.299999f, -9.3f).setRotationAngle(0, 180, -180).setName("Box 1320")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-17.5f, -8.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1321")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 361, textureX, textureY).addBox(0, 0, 0, 1, 3, 18)
			.setRotationPoint(-17.5f, -7.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1322")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -6.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1323")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-20.5f, -8.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1324")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, -7.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1325")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-20.5f, -6.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1326")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 22, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-42.5f, -7.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1327")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 369, textureX, textureY).addBox(0, 0, 0, 1, 3, 22)
			.setRotationPoint(-42.5f, -8.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1328")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 22, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-42.5f, -9.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1329")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 3, 0, 0, 4, 0, 0, -1, 0, 0, 0, 0, 0, -4, 0, 0, -5, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-44.5f, -7.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1330")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-44.5f, -9.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1331")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.5f, -8.299999f, 1.5f).setRotationAngle(90, 0, 90).setName("Box 1332")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-44.5f, -9.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1351")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -3, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.5f, -8.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1352")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -4, 0, 0, -5, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0, 4, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-44.5f, -7.299999f, -12.3f).setRotationAngle(90, 0, 90).setName("Box 1353")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 345, textureX, textureY).addBox(0, 0, 0, 5, 3, 3)
			.setRotationPoint(-54.5f, -13, -15.5f).setRotationAngle(0, 0, -0).setName("Box 1335")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 345, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-12.5f, -6.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 314")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -7.5f, -14).setRotationAngle(0, 0, -0).setName("Box 325")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, -7.5f, -14).setRotationAngle(0, 0, -0).setName("Box 326")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -7.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 327")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, -7.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 328")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, -7.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 497")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, -7.5f, -14).setRotationAngle(0, 0, -0).setName("Box 498")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 369, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-16.5f, -6.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -7.5f, -14).setRotationAngle(0, 0, -0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -7.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1)
			.setRotationPoint(-8, -10.5f, -15.4f).setRotationAngle(0, 0, -0).setName("Box 604")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 5, 2, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, -11.5f, -15.4f).setRotationAngle(0, 0, -0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 401, textureX, textureY).addBox(0, 0, 0, 27, 2, 4)
			.setRotationPoint(-8, -9.5f, -16.4f).setRotationAngle(0, 0, -0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 401, textureX, textureY).addBox(0, 0, 0, 27, 1, 3)
			.setRotationPoint(-8, -12.5f, -16.4f).setRotationAngle(0, 0, -0).setName("Box 1375")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1)
			.setRotationPoint(-8, -13.5f, -15.4f).setRotationAngle(0, 0, -0).setName("Box 1376")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 5, 1, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, -15.5f, -15.4f).setRotationAngle(0, 0, -0).setName("Box 1377")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -7.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1394")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -7.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1395")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, -7.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1396")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, -7.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1397")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 369, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-12.5f, -6.5f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1398")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -7.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1399")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -7.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1400")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, -7.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1401")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 369, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-16.5f, -6.5f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1402")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, -7.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1403")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 377, textureX, textureY).addBox(0, 0, 0, 17, 2, 4)
			.setRotationPoint(-8, -10.5f, 3.6f).setRotationAngle(0, 0, -0).setName("Box 1418")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1)
			.setRotationPoint(-8, -11.5f, 4.6f).setRotationAngle(0, 0, -0).setName("Box 1419")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 5, 2, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, -12.5f, 4.6f).setRotationAngle(0, 0, -0).setName("Box 1420")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 401, textureX, textureY)
			.addShapeBox(0, -1, 0, 37, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-9, -5, -14.5f).setRotationAngle(0, 0, -0).setName("Box 590")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(28, -4.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1425")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 45, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(28.5f, -2, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1427")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(73.5f, -1.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1429")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(74, 0, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1431")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-9.5f, -11.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1433")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 11, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20.5f, -12, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1435")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -16.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1437")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 1.5f, 0, 0, 1.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -21, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1438")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -25.5f, -2.75f).setRotationAngle(-90, 0, -0).setName("Box 1440")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0.1f, -0.03f, -0.5f, 0.1f, -0.03f, -0.5f, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -25.150002f, -7.3f).setRotationAngle(-70, 0, -0).setName("Box 1441")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, -0.55f, -1.9f, -0.5f, -0.55f, -1.9f, -0.5f, -1, 1.1f, 0, -1, 1.1f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -23.5f, -12.5f).setRotationAngle(0, 0, -0).setName("Box 1442")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, -1, 1.1f, -0.5f, -1, 1.1f, -0.5f, -0.55f, -1.9f, 0, -0.55f, -1.9f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-21, -23.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1443")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -2, 0, 0, -2, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-21, -21, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1444")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 393, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0.1f, -0.03f, -0.5f, 0.1f, -0.03f, -0.5f, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20.5f, -25.150002f, -0.69f).setRotationAngle(-70, 180, -0).setName("Box 1446")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(74, 0, 6).setRotationAngle(0, 0, -0).setName("Box 1447")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(73.5f, -1.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1449")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 45, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(28.5f, -2, 6).setRotationAngle(0, 0, -0).setName("Box 1451")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 401, textureX, textureY)
			.addShapeBox(0, -1, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(9, -9, 6).setRotationAngle(0, 0, -0).setName("Box 1455")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 385, textureX, textureY).addBox(0, -1, 0, 2, 1, 2)
			.setRotationPoint(-49, -10, -14.5f).setRotationAngle(0, 0, -0).setName("Box 590")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, -11, -14.5f).setRotationAngle(0, 0, -0).setName("Box 591")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-49, -9, -14.5f).setRotationAngle(0, 0, -0).setName("Box 592")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 393, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-53, -16.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1464")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 393, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0.1f, -0.03f, -0.5f, 0.1f, -0.03f, -0.5f, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-53, -25.150002f, -7.3f).setRotationAngle(-70, 0, -0).setName("Box 1465")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, -0.55f, -1.9f, -0.5f, -0.55f, -1.9f, -0.5f, -1, 1.1f, 0, -1, 1.1f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-53, -23.5f, -12.5f).setRotationAngle(0, 0, -0).setName("Box 1466")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 401, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 1.5f, 0, 0, 1.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-53, -21, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1467")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-12.25f, -2.5f, -15).setRotationAngle(0, 0, -0).setName("Box 1473")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, 2, 0, -0.5f, 2, 0, -0.5f, 2, -0.5f, 0, 2, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-10.25f, -5, -15).setRotationAngle(0, 0, -0).setName("Box 1475")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-10.25f, -7.5f, -15).setRotationAngle(0, 0, -0).setName("Box 1476")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 28, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-8.5f, -10, -16.5f).setRotationAngle(0, 0, -0).setName("Box 1477")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 44, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(19.5f, -12, -16.5f).setRotationAngle(0, 0, -0).setName("Box 1478")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(19.5f, -11.5f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 1479")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -1, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -1)
			.setRotationPoint(-8.5f, -10, -16).setRotationAngle(0, 0, -0).setName("Box 1480")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 39, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-49.5f, -11, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1482")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-55.5f, -10, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1483")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-56, -11.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1485")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-56, -12, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1486")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-11, -10, 6.5f).setRotationAngle(0, 0, -0).setName("Box 1489")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 1.5f, 0, -0.5f, 2, 0, -0.5f, 2, -0.5f, 0, 1.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.5f, -7, 6.5f).setRotationAngle(0, 0, -0).setName("Box 1491")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18, -2.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 1493")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, 1.5f, 0, -0.5f, 1.5f, 0, -0.5f, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-10.25f, -5.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1494")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-10.25f, -7.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1495")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-12.25f, -3, 6).setRotationAngle(0, 0, -0).setName("Box 1497")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0.2f, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0.2f, 0, 0, 0.2f, -0.8f, 0.2f, 0, -0.8f, 0.2f, 0, -0.8f, 0, 0.2f, -0.8f, 0)
			.setRotationPoint(-55.65f, -26.7f, -7.4f).setRotationAngle(0, 0, -0).setName("Box 1498")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 6, 0, 0, 1.45f, -1, 0, 1.45f, -1, 0, 1.45f, -1, 0, 1.45f, -1, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f)
			.setRotationPoint(-42, -23.5f, -7).setRotationAngle(0, 0, -0).setName("Box 1496")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.54f, -26.599998f, -4).setRotationAngle(0, 0, -0).setName("Part 128")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(10.5f, -25.5f, -4.5f).setRotationAngle(0, 0, -90).setName("Box 585")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(10.5f, -25.5f, -4.5f).setRotationAngle(0, 0, -90).setName("Box 586")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(10.5f, -25.5f, -4.5f).setRotationAngle(0, 0, -90).setName("Box 587")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(10.5f, -25.5f, -4.5f).setRotationAngle(0, 0, -90).setName("Box 588")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 28, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(28.490002f, -25.5f, -4.5f).setRotationAngle(0, 0, -88).setName("Box 1504")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 28, 1, 0, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(28.490002f, -25.5f, -4.5f).setRotationAngle(0, 0, -88).setName("Box 1505")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 28, 1, 0, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(28.490002f, -25.5f, -4.5f).setRotationAngle(0, 0, -88).setName("Box 1506")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 28, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(28.490002f, -25.5f, -4.5f).setRotationAngle(0, 0, -88).setName("Box 1507")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.5f, -25.599998f, -4.5f).setRotationAngle(0, 0, -0).setName("Box 1508")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(57.5f, -24.5f, -3.5f).setRotationAngle(0, 0, -90).setName("Box 1509")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(57.5f, -24.5f, -3.5f).setRotationAngle(0, 0, -90).setName("Box 1510")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(57.5f, -24.5f, -3.5f).setRotationAngle(0, 0, -90).setName("Box 1511")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(57.5f, -24.5f, -3.5f).setRotationAngle(0, 0, -90).setName("Box 1512")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(57.5f, -24.5f, -5.5f).setRotationAngle(0, 0, -90).setName("Box 1513")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(57.5f, -24.5f, -5.5f).setRotationAngle(0, 0, -90).setName("Box 1514")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(57.5f, -24.5f, -5.5f).setRotationAngle(0, 0, -90).setName("Box 1515")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(57.5f, -24.5f, -5.5f).setRotationAngle(0, 0, -90).setName("Box 1516")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(0.5f, -27, -6.7f).setRotationAngle(10, 0, -0).setName("Box 585")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(0.5f, -27, -6.7f).setRotationAngle(10, 0, -0).setName("Box 586")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(0.5f, -27, -6.7f).setRotationAngle(10, 0, -0).setName("Box 587")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(0.5f, -27, -6.7f).setRotationAngle(10, 0, -0).setName("Box 588")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(0.5f, -27.2f, -3.8f).setRotationAngle(0, 0, -0).setName("Box 1523")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(0.5f, -27.2f, -3.8f).setRotationAngle(0, 0, -0).setName("Box 1524")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(0.5f, -27.2f, -3.8f).setRotationAngle(0, 0, -0).setName("Box 1525")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(0.5f, -27.2f, -3.8f).setRotationAngle(0, 0, -0).setName("Box 1526")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(0.5f, -27.2f, -2.3f).setRotationAngle(-10, 0, -0).setName("Box 1527")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(0.5f, -27.2f, -2.3f).setRotationAngle(-10, 0, -0).setName("Box 1528")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(0.5f, -27.2f, -2.3f).setRotationAngle(-10, 0, -0).setName("Box 1529")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(0.5f, -27.2f, -2.3f).setRotationAngle(-10, 0, -0).setName("Box 1530")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(0.5f, -27.2f, -5.2f).setRotationAngle(0, 0, -0).setName("Box 1531")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(0.5f, -27.2f, -5.2f).setRotationAngle(0, 0, -0).setName("Box 1532")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(0.5f, -27.2f, -5.2f).setRotationAngle(0, 0, -0).setName("Box 1533")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(0.5f, -27.2f, -5.2f).setRotationAngle(0, 0, -0).setName("Box 1534")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-0.5f, -26.2f, -9.2f).setRotationAngle(0, 0, -60).setName("Box 1537")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-0.5f, -26.2f, -9.2f).setRotationAngle(0, 0, -60).setName("Box 1538")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(-0.5f, -26.2f, -9.2f).setRotationAngle(0, 0, -60).setName("Box 1539")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(-0.5f, -26.2f, -9.2f).setRotationAngle(0, 0, -60).setName("Box 1540")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(-1.25f, -26.5f, -8.95f).setRotationAngle(0, 0, -0).setName("Box 1541")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(2, -25.5f, -8.85f).setRotationAngle(0, 0, 30).setName("Box 1543")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 425, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-0.5f, -26.2f, -9.2f).setRotationAngle(0, 0, -60).setName("Box 1544")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(1.75f, -25.5f, -8.95f).setRotationAngle(0, 0, -0).setName("Box 1545")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, -25.3f, -9).setRotationAngle(0, 0, -0).setName("Box 1176")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 425, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(52, -25.3f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1177")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -25.3f, -9).setRotationAngle(0, 0, -0).setName("Box 1178")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(53, -24.3f, -9).setRotationAngle(0, 0, -0).setName("Box 1179")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -26.3f, -9).setRotationAngle(0, 0, -0).setName("Box 1180")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, -26.3f, -9).setRotationAngle(0, 0, -0).setName("Box 1181")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(51, -24.3f, -9).setRotationAngle(0, 0, -0).setName("Box 1182")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(54, -23.8f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1183")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(54, -23.8f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 1184")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(51, -23.8f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1185")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(51, -23.8f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 1186")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, -26.8f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1187")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, 0.5f, 0, -0.4f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, -27.3f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1559")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(57.5f, -24.7f, -9.3f).setRotationAngle(0, 0, -0).setName("Box 1561")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(57.5f, -24.7f, -9.3f).setRotationAngle(0, 0, -0).setName("Box 1562")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(57.5f, -24.7f, -9.3f).setRotationAngle(0, 0, -0).setName("Box 1563")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(57.5f, -24.7f, -9.3f).setRotationAngle(0, 0, -0).setName("Box 1564")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -23, -7).setRotationAngle(0, 0, -90).setName("Box 1565")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -23, -7).setRotationAngle(0, 0, -90).setName("Box 1566")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(59, -23, -7).setRotationAngle(0, 0, -90).setName("Box 1567")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.2f, -0.5f, 0, -0.2f, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(47.5f, -26.75f, -8.25f).setRotationAngle(0, 0, -0).setName("Box 200")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.2f, 0, 0, -0.2f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.2f, 0, -0.5f, -0.2f)
			.setRotationPoint(47.5f, -26.75f, -5.75f).setRotationAngle(0, 0, -0).setName("Box 742")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(47.5f, -27.25f, -7).setRotationAngle(0, 0, -0).setName("Box 768")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(47.5f, -27.25f, -6).setRotationAngle(0, 0, -0).setName("Box 769")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(47.5f, -27.25f, -8).setRotationAngle(0, 0, -0).setName("Box 770")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(46.75f, -25.75f, -8).setRotationAngle(0, 0, -0).setName("Box 760")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -1.8f, -0.5f, -0.25f, -0.75f, -0.5f, -0.7f, -0.75f, -0.5f, -0.7f, -1.8f, -0.5f, -0.25f, -2, 0, 0.1f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -2, 0, 0.1f)
			.setRotationPoint(46.25f, -25.75f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 762")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f)
			.setRotationPoint(46.75f, -27.25f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 764")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -1.2f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -1.3f, 0, -0.25f, -0.25f, 0, -0.7f, -0.25f, 0, -0.7f, -1.3f, 0, -0.25f)
			.setRotationPoint(46.75f, -27.25f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 765")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.8f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.25f, 0, -0.7f, -1.3f, 0, -0.25f, -1.3f, 0, -0.25f, -0.25f, 0, -0.7f)
			.setRotationPoint(46.75f, -27.25f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 766")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.75f, -0.5f, -0.7f, -1.8f, -0.5f, -0.25f, -1.8f, -0.5f, -0.25f, -0.75f, -0.5f, -0.7f, -0.4f, 0, -0.5f, -2, 0, 0.1f, -2, 0, 0.1f, -0.4f, 0, -0.5f)
			.setRotationPoint(46.25f, -25.75f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 767")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 433, textureX, textureY).addBox(0, 0, 0, 5, 1, 3)
			.setRotationPoint(69.5f, -6.5f, -16).setRotationAngle(0, 0, -0).setName("Box 361")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(69.5f, -7.5f, -16).setRotationAngle(0, 0, -0).setName("Box 362")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(69.5f, -5.5f, -16).setRotationAngle(0, 0, -0).setName("Box 363")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 433, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 21, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(71, -0.5f, -19.5f).setRotationAngle(0, 0, -0).setName("Box 560")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 433, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 21, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0)
			.setRotationPoint(70.5f, 0.25f, -19.5f).setRotationAngle(0, 0, -0).setName("Box 561")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 433, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 21, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(68.5f, -0.5f, -19.5f).setRotationAngle(0, 0, -0).setName("Box 562")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 433, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 21, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(70.5f, -1.25f, -19.5f).setRotationAngle(0, 0, -0).setName("Box 563")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 433, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 21, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(68, -1.25f, -19.5f).setRotationAngle(0, 0, -0).setName("Box 564")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 433, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 21, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0)
			.setRotationPoint(68, 0.25f, -19.5f).setRotationAngle(0, 0, -0).setName("Box 565")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 433, textureX, textureY).addBox(0, 0, 0, 5, 1, 3)
			.setRotationPoint(69.5f, -6.5f, 5).setRotationAngle(0, 0, -0).setName("Box 1590")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(69.5f, -7.5f, 5).setRotationAngle(0, 0, -0).setName("Box 1591")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(69.5f, -5.5f, 5).setRotationAngle(0, 0, -0).setName("Box 1592")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, -0.8f, -1, 0, -0.8f, 0, 0, 0, 0, 0, 0, -1, 0, -0.8f, -1, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.5f, -19, -6).setRotationAngle(0, 0, -0).setName("Box 1602")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.5f, -19, -5).setRotationAngle(0, 0, -0).setName("Box 1603")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -1, 0, 0, -1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -1, 0, 0, -1, 0)
			.setRotationPoint(-59.5f, -19, -3).setRotationAngle(0, 0, -0).setName("Box 1620")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-59.4f, -17, -5).setRotationAngle(0, 0, -0).setName("Box 1621")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-59.4f, -18.5f, -5).setRotationAngle(0, 0, -0).setName("Box 1622")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.3f, -19.5f, -12).setRotationAngle(0, 0, -0).setName("Box 186")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.3f, -15.5f, -12).setRotationAngle(0, 0, -0).setName("Box 187")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 441, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-58, -21, 4).setRotationAngle(0, 0, -0).setName("Box 1025")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1.35f, -0.35f, -1.05f, -0.35f, -0.35f, -0.85f, -0.35f, -0.35f, -0.35f, -1.35f, -0.35f, -0.35f, -1.35f, -0.35f, -1.05f, -0.35f, -0.35f, -0.85f, -0.35f, -0.35f, -0.55f, -1.35f, -0.35f, -0.55f)
			.setRotationPoint(-58.65f, -20.400002f, 2.95f).setRotationAngle(0, 0, -0).setName("Box 1166")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -17.7f, 1).setRotationAngle(0, 0, -0).setName("Box 1650")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -19.5f, 0.1f).setRotationAngle(0, 0, -0).setName("Box 1654")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -21.099998f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1657")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -22, -3.25f).setRotationAngle(0, 0, -0).setName("Box 1660")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -15.299999f, 1).setRotationAngle(0, 0, -0).setName("Box 1664")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -22, -5.75f).setRotationAngle(0, 0, -0).setName("Box 1665")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -13.5f, 0.1f).setRotationAngle(0, 0, -0).setName("Box 1668")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -12.1f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1669")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -21.099998f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 1672")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -19.5f, -8.9f).setRotationAngle(0, 0, -0).setName("Box 1673")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -17.7f, -10).setRotationAngle(0, 0, -0).setName("Box 1674")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -15.299999f, -10).setRotationAngle(0, 0, -0).setName("Box 1675")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -13.5f, -8.9f).setRotationAngle(0, 0, -0).setName("Box 1676")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -12.1f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 1677")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -11, -5.75f).setRotationAngle(0, 0, -0).setName("Box 1678")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 441, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-58.45f, -11, -3.25f).setRotationAngle(0, 0, -0).setName("Box 1679")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 441, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-58, -21, -13).setRotationAngle(0, 0, -0).setName("Box 1680")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.85f, -1.35f, -0.35f, -1.05f, -1.35f, -0.35f, -0.55f, -0.35f, -0.35f, -0.55f, -0.35f, -0.35f, -0.85f, -1.35f, -0.35f, -1.05f)
			.setRotationPoint(-58.65f, -20.400002f, -13.05f).setRotationAngle(0, 0, -0).setName("Box 1681")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.75f, 5, -14.1f).setRotationAngle(0, 0, -0).setName("Box 1767")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.75f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1768")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(37.75f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1769")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(39, 8.25f, -10.9f).setRotationAngle(0, 0, -90).setName("Box 1770")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(40.25f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1771")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 458, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(38.5f, 6, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1772")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(40.25f, 6, -14.1f).setRotationAngle(0, 0, -0).setName("Box 1773")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(37.75f, 6, -14.1f).setRotationAngle(0, 0, -0).setName("Box 1774")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(39, 8.25f, -14.1f).setRotationAngle(0, 0, -90).setName("Box 1775")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(25.25f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1776")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(26.25f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1777")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(27.75f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1778")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(26.5f, 8.25f, -10.9f).setRotationAngle(0, 0, -90).setName("Box 1779")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(12.75f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1780")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(13.75f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1781")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(15.25f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1782")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(14, 8.25f, -10.9f).setRotationAngle(0, 0, -90).setName("Box 1783")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(50.25f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1784")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(51.25f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1785")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(51.5f, 8.25f, -10.9f).setRotationAngle(0, 0, -90).setName("Box 1786")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(52.75f, 6, -10.9f).setRotationAngle(0, 0, -0).setName("Box 1787")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 465, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(4, 3.5f, -13).setRotationAngle(0, 0, -0).setName("Box 1788")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f)
			.setRotationPoint(15, 2.75f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1791")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, -0.25f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.25f, -0.5f, -0.35f)
			.setRotationPoint(15, 3.75f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1792")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f)
			.setRotationPoint(15, 4.25f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1793")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(17, 3.5f, -13).setRotationAngle(0, 0, 6.32f).setName("Box 1794")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 465, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(14.4f, -2.3999996f, -14.3f).setRotationAngle(0, -180, -8).setName("Box 1796")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(7, -3, -14.55f).setRotationAngle(0, 0, -0).setName("Box 1797")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(14, 6, -10.8f).setRotationAngle(0, 0, -0).setName("Box 1805")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 473, textureX, textureY)
			.addShapeBox(0, -1, 0, 4, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(16.5f, 4, -12.9f).setRotationAngle(0, -180, -0).setName("Box 1795")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(51.25f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1796")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(50.25f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1797")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(52.75f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1798")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(51.5f, 8.25f, 1.8f).setRotationAngle(0, 0, -90).setName("Box 1799")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(14, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1800")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(37.75f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1801")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(39, 8.25f, 1.8f).setRotationAngle(0, 0, -90).setName("Box 1802")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(40.25f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1803")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.75f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1804")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 474, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(38.5f, 6, 2.5f).setRotationAngle(0, 0, -0).setName("Box 1805")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(40.25f, 6, 5.1f).setRotationAngle(0, 0, -0).setName("Box 1807")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.75f, 5, 5.1f).setRotationAngle(0, 0, -0).setName("Box 1808")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(37.75f, 6, 5.1f).setRotationAngle(0, 0, -0).setName("Box 1809")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(39, 8.25f, 5.1f).setRotationAngle(0, 0, -90).setName("Box 1810")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(17, 3.5f, 4).setRotationAngle(0, 0, 6.32f).setName("Box 1811")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(7, -3, 4.55f).setRotationAngle(0, 0, -0).setName("Box 1819")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 473, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(14.4f, -2.3999996f, 5.3f).setRotationAngle(0, -180, -8).setName("Box 1820")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 473, textureX, textureY)
			.addShapeBox(1, -1, 0, 4, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(17.5f, 4, 5.9f).setRotationAngle(0, -180, -0).setName("Box 1821")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f)
			.setRotationPoint(15, 2.75f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1822")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, -0.25f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.25f, -0.5f, -0.35f)
			.setRotationPoint(15, 3.75f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1823")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f)
			.setRotationPoint(15, 4.25f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1824")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 481, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(4, 3.5f, 4).setRotationAngle(0, 0, -0).setName("Box 1825")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(27.75f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1828")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(26.25f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1829")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(25.25f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1830")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(26.5f, 8.25f, 1.8f).setRotationAngle(0, 0, -90).setName("Box 1831")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(15.25f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1832")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(13.75f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1833")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(12.75f, 6, 1.8f).setRotationAngle(0, 0, -0).setName("Box 1834")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(14, 8.25f, 1.8f).setRotationAngle(0, 0, -90).setName("Box 1835")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(13.25f, 5.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1830")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(7.75f, 1.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1831")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(13.25f, 1.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1832")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(7.75f, 5.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1833")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(13.25f, 5.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1834")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(7.75f, 5.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1835")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(7.75f, 1.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1836")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(13.25f, 1.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1837")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 481, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(21, -2.5f, -9.5f).setRotationAngle(0, 0, 90).setName("Box 1846")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(19.99f, -3.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1847")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 489, textureX, textureY)
			.addShapeBox(2, -1, 0, 9, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(24.5f, 0.5f, -13).setRotationAngle(0, -180, -15).setName("Box 1858")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(21, -3.5f, -14.5f).setRotationAngle(0, 0, 90).setName("Box 1859")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(21, -3.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1860")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -2.5f, -14.5f).setRotationAngle(0, 0, 90).setName("Box 1861")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(21, 0.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1862")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 489, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(21, -2.5f, 0.5f).setRotationAngle(0, 0, 90).setName("Box 1864")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 489, textureX, textureY)
			.addShapeBox(2, -1, 0, 9, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(24.5f, 0.5f, 6).setRotationAngle(0, -180, -15).setName("Box 1872")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(21, 0.5f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1875")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(21, -3.5f, 5.5f).setRotationAngle(0, 0, 90).setName("Box 1876")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(21, -3.5f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1877")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -2.5f, 5.5f).setRotationAngle(0, 0, 90).setName("Box 1878")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(19.99f, -3.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 1879")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.15f, 0, -1, -0.15f)
			.setRotationPoint(39.25f, 5, -14.7f).setRotationAngle(0, 0, -0).setName("Box 1843")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 489, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(22, -1.3999996f, -14).setRotationAngle(0, -180, -10).setName("Box 1844")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 489, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 19, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.75f, 0.25f, -0.25f, -0.75f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(22.75f, 2, -14.5f).setRotationAngle(0, 0, 9).setName("Box 1845")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.15f, 0, -1, -0.15f)
			.setRotationPoint(39.25f, 5, 5.7f).setRotationAngle(0, 0, -0).setName("Box 1849")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 489, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(22, -1.3999996f, 5.1f).setRotationAngle(0, -180, -10).setName("Box 1850")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 489, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 19, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.75f, 0.25f, -0.25f, -0.75f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(22.75f, 2, 5.6f).setRotationAngle(0, 0, 9).setName("Box 1851")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 4, 24, 0, 0, 0, -1, 0.3f, 0, -1, 0.3f, 0, -1, 0, 0, -1, 0, 0, -0.5f, 1.7f, 0, -0.5f, 1.7f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(30, -13.25f, -16).setRotationAngle(0, 0, -0).setName("Box 1848")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 34, 4, 22, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 1.3f, 0, 0, 1.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -17.25f, -15).setRotationAngle(0, 0, -0).setName("Box 1850")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 6, 0, 0, 0.75f, -1, -0.5f, 0.75f, -1, -0.5f, 0.75f, -1, 0, 0.75f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(57, -23.5f, -7).setRotationAngle(0, 0, -0).setName("Box 1854")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.2f, 0, 0, 0.2f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, -25.5f, 1.5f).setRotationAngle(0, 0, -0).setName("Box 454")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.75f, -24.599998f, 4.25f).setRotationAngle(0, 0, -0).setName("Box 1045")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.75f, -18.599998f, 5.25f).setRotationAngle(0, 0, -0).setName("Box 1046")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.75f, -19.5f, 5.25f).setRotationAngle(0, 0, -0).setName("Box 1047")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(67.75f, -14.25f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 1049")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.5f, 0, -0.4f, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.4f, -0.3f, 0, -0.4f)
			.setRotationPoint(67.95f, -14.25f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 1055")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.4f, -0.3f, 0, -0.4f)
			.setRotationPoint(67.95f, -13.75f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 1056")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0.2f, 0, 0.2f, -0.3f, 0, 0.2f, -0.3f, 0, -0.2f, 0.2f, 0, -0.2f)
			.setRotationPoint(67.75f, -9.25f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 1075")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, 0.1f, 0.1f, 0, 0.1f)
			.setRotationPoint(64.5f, -20.5f, 1.5f).setRotationAngle(0, 0, -0).setName("Box 1077")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, 0.1f, 0.1f, 0, 0.1f)
			.setRotationPoint(64.5f, -21.5f, 2.5f).setRotationAngle(0, 0, -0).setName("Box 1078")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0.2f, -0.5f, -0.5f, 0.2f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, -25.5f, 2.5f).setRotationAngle(0, 0, -0).setName("Box 1868")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 449, textureX, textureY).addBox(0, 0, 0, 2, 5, 2)
			.setRotationPoint(65, -13.5f, 2.75f).setRotationAngle(0, 0, -0).setName("Box 1869")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 449, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
			.setRotationPoint(66, -12.5f, 4.75f).setRotationAngle(0, 0, -0).setName("Box 1870")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(66, -13.799999f, 4).setRotationAngle(0, 40, -0).setName("Box 1871")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(67, -12.799999f, 5.75f).setRotationAngle(0, 40, -0).setName("Box 1872")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65, -14.5f, 2.75f).setRotationAngle(0, 0, -0).setName("Box 1873")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66, -13.5f, 4.75f).setRotationAngle(0, 0, -0).setName("Box 1874")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(65.75f, -14.25f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1875")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.5f, 0, -0.4f, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.4f, -0.3f, 0, -0.4f)
			.setRotationPoint(65.95f, -14.25f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1876")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.4f, -0.3f, 0, -0.4f)
			.setRotationPoint(65.95f, -13.75f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1877")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 449, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(64, -16.5f, 1.5f).setRotationAngle(0, 0, -0).setName("Box 1878")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 449, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(64, -16.5f, 3.5f).setRotationAngle(0, 0, -0).setName("Box 1879")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 497, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(64, -16.5f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 1880")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 497, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(63, -20, 2.5f).setRotationAngle(0, 0, -0).setName("Box 1881")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 497, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(64, -19.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1882")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 497, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(64, -17.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1883")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 497, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(64, -17.5f, -12.5f).setRotationAngle(0, 0, -0).setName("Box 1884")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65, -13.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 1885")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65, -14.5f, -15).setRotationAngle(0, 0, -0).setName("Box 1886")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(64.51f, -18.5f, 1.25f).setRotationAngle(0, 0, -0).setName("Box 1887")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 449, textureX, textureY).addBox(0, 0, 0, 0, 1, 2)
			.setRotationPoint(65.01f, -16, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1888")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(62.5f, -18.5f, 1.25f).setRotationAngle(0, 0, -0).setName("Box 1889")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(63, -16, -0.5f).setRotationAngle(0, 0, -0).setName("Box 1890")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(61, -24.5f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1891")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(63.010002f, -24.5f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1892")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(61, -24.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 1893")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(63.010002f, -24.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 1894")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(61, -24.5f, -5.5f).setRotationAngle(0, 0, -0).setName("Box 1895")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(63.010002f, -24.5f, -5.5f).setRotationAngle(0, 0, -0).setName("Box 1896")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(61, -24.5f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 1897")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 33, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(63.010002f, -24.5f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 1898")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 33, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(67.51f, -10.5f, -15).setRotationAngle(0, 0, -0).setName("Box 1899")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(65.5f, -10.5f, -15).setRotationAngle(0, 0, -0).setName("Box 1900")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 41, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(67.51f, -11.5f, -14.75f).setRotationAngle(0, 0, -0).setName("Box 1901")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(65.5f, -11.5f, -14.75f).setRotationAngle(0, 0, -0).setName("Box 1902")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 41, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(67.51f, -12.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1903")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(65.5f, -12.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1904")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(65.5f, -11.5f, -12.75f).setRotationAngle(0, 0, -0).setName("Box 1905")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 41, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(67.51f, -11.5f, -12.75f).setRotationAngle(0, 0, -0).setName("Box 1906")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(65.5f, -10.5f, -11.75f).setRotationAngle(0, 0, -0).setName("Box 1907")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 41, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(67.51f, -10.5f, -11.75f).setRotationAngle(0, 0, -0).setName("Box 1908")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(65.5f, -11.5f, -10.75f).setRotationAngle(0, 0, -0).setName("Box 1909")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 65, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(67.51f, -11.5f, -10.75f).setRotationAngle(0, 0, -0).setName("Box 1910")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 65, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(66.01f, -13.5f, 0.75f).setRotationAngle(0, 0, -0).setName("Box 1911")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(64, -13.5f, 0.75f).setRotationAngle(0, 0, -0).setName("Box 1912")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 497, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(65, -12.5f, -9.25f).setRotationAngle(0, 0, -0).setName("Box 1913")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.6f, -0.5f, 0, -0.6f, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f)
			.setRotationPoint(65.95f, -13.25f, -8.25f).setRotationAngle(0, 0, -0).setName("Box 1914")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.6f, -0.1f, 0, -0.6f, -0.1f, 0, 0, -0.5f, 0, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.3f, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(65.95f, -13.25f, -10.25f).setRotationAngle(0, 0, -0).setName("Box 1915")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 65, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(64.01f, -19.5f, -1.25f).setRotationAngle(0, 0, -0).setName("Box 1916")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(62, -19.5f, -1.25f).setRotationAngle(0, 0, -0).setName("Box 1917")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 65, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(63.559998f, -20.75f, -1.25f).setRotationAngle(0, 0, -0).setName("Box 1918")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(61.550003f, -20.75f, -1.25f).setRotationAngle(0, 0, -0).setName("Box 1919")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 65, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(63.260002f, -22, -0.75f).setRotationAngle(0, 0, -0).setName("Box 1920")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(61.25f, -22, -0.75f).setRotationAngle(0, 0, -0).setName("Box 1921")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(61, -22.5f, -10.5f).setRotationAngle(0, 0, -0).setName("Box 1922")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 65, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(63.010002f, -22.5f, -10.5f).setRotationAngle(0, 0, -0).setName("Box 1923")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(61.5f, -21.5f, -11.5f).setRotationAngle(0, 0, -0).setName("Box 1924")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 65, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(63.510002f, -21.5f, -11.5f).setRotationAngle(0, 0, -0).setName("Box 1925")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, 0.2f, -0.3f, 0, 0.2f, -0.3f, -0.5f, -0.2f, 0.2f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(64.75f, -25, 4.65f).setRotationAngle(0, 0, -0).setName("Box 1926")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(67.45f, -23.490002f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1927")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(61.449997f, -24.490002f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1930")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f)
			.setRotationPoint(62, -24.990002f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1932")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f)
			.setRotationPoint(66.45f, -24.990002f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1933")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(62.449997f, -23.490002f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1934")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(61.449997f, -23.490002f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1935")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(67.45f, -23.490002f, 5.24f).setRotationAngle(0, 0, -0).setName("Box 1936")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(62.449997f, -23.490002f, 5.24f).setRotationAngle(0, 0, -0).setName("Box 1937")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(61.449997f, -23.490002f, 5.24f).setRotationAngle(0, 0, -0).setName("Box 1938")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(61.449997f, -24.490002f, 5.24f).setRotationAngle(0, 0, -0).setName("Box 1939")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f)
			.setRotationPoint(68.46f, -23.990002f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1941")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f)
			.setRotationPoint(61.440002f, -23.990002f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1942")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(65.45f, -10.5f, 8.08f).setRotationAngle(0, 0, -0).setName("Box 1943")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(65.45f, -9.5f, 8.08f).setRotationAngle(0, 0, -0).setName("Box 1944")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(66.45f, -10.5f, 8.08f).setRotationAngle(0, 0, -0).setName("Box 1945")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(65.45f, -10.5f, 7.34f).setRotationAngle(0, 0, -0).setName("Box 1946")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(65.45f, -9.5f, 7.34f).setRotationAngle(0, 0, -0).setName("Box 1947")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(66.45f, -10.5f, 7.34f).setRotationAngle(0, 0, -0).setName("Box 1948")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(69.45f, -10.5f, 7.34f).setRotationAngle(0, 0, -0).setName("Box 1949")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(69.45f, -10.5f, 8.08f).setRotationAngle(0, 0, -0).setName("Box 1950")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f)
			.setRotationPoint(70.46f, -10, 7.34f).setRotationAngle(0, 0, -0).setName("Box 1951")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f)
			.setRotationPoint(68.45f, -9, 7.34f).setRotationAngle(0, 0, -0).setName("Box 1952")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f)
			.setRotationPoint(66, -9, 7.34f).setRotationAngle(0, 0, -0).setName("Box 1953")
		);
		groups.add(group0);
	}

	private final void initGroup_group02(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 489, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f)
			.setRotationPoint(65.44f, -10, 7.34f).setRotationAngle(0, 0, -0).setName("Box 1954")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.1f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, 0.1f, 0.1f, 0, 0.1f)
			.setRotationPoint(64.25f, -18.5f, -9).setRotationAngle(0, 0, -0).setName("Box 1955")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 145, textureX, textureY).addBox(0, 0, 0, 2, 3, 3)
			.setRotationPoint(65, -12.5f, -6.75f).setRotationAngle(0, 0, -0).setName("Box 1956")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 145, textureX, textureY).addBox(0, 0, 0, 2, 3, 3)
			.setRotationPoint(65, -12.5f, -3.75f).setRotationAngle(0, 0, -0).setName("Box 1957")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65, -13.5f, -3.75f).setRotationAngle(0, 0, -0).setName("Box 1958")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65, -13.5f, -6.75f).setRotationAngle(0, 0, -0).setName("Box 1959")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65, -14.5f, -4.75f).setRotationAngle(0, 0, -0).setName("Box 1960")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1, -0.5f, 0, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 1, 0, 0.5f)
			.setRotationPoint(65, -15, -4.25f).setRotationAngle(0, 0, -0).setName("Box 1961")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 505, textureX, textureY)
			.addShapeBox(0, -2, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(66.75f, -14, -8.5f).setRotationAngle(80, 0, -0).setName("Box 1962")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 513, textureX, textureY).addBox(0, 0, 0, 2, 1, 8)
			.setRotationPoint(65, -9.5f, -7.75f).setRotationAngle(0, 0, -0).setName("Box 1963")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(67, -9.25f, -4.75f).setRotationAngle(0, 0, -0).setName("Box 1964")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 23, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -9.25f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 1847")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 513, textureX, textureY)
			.addShapeBox(-1, -1.5f, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(66.75f, -14, -8.5f).setRotationAngle(80, 0, -0).setName("Box 1949")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 513, textureX, textureY)
			.addShapeBox(-1, -2, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(66.75f, -14, -8.5f).setRotationAngle(80, 0, -0).setName("Box 1950")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -15.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1952")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -15.5f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 1953")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -21.5f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 1954")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -20.5f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 1955")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -20.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 1956")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -20.5f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 1957")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -20.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1958")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -21.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 1959")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 25, 0, 0, 0, -1.75f, -0.5f, 0, -1.75f, -0.5f, 0, -1.75f, 0, 0, -1.75f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -23.5f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 1960")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -3.25f, -0.5f, 0, -3.25f, -0.5f, 0, -3.25f, 0, 0, -3.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -26.5f, -11.5f).setRotationAngle(0, 0, -0).setName("Box 1962")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(75.5f, -26.8f, -7.75f).setRotationAngle(0, 0, -0).setName("Box 1963")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, -0.15f, -0.7f, 0, -0.15f, -0.7f, 0, -0.15f, -0.3f, 0, -0.15f, -0.3f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.3f, 0, -0.5f, -0.3f)
			.setRotationPoint(75.5f, -26.95f, -5.2f).setRotationAngle(0, 0, -0).setName("Box 1964")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(75.5f, -26.8f, -3.25f).setRotationAngle(0, 0, -0).setName("Box 1965")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(76, -24.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 1966")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1.75f, -0.5f, 0, 1.75f, -0.5f, 0, 1.75f, 0, 0, 1.75f)
			.setRotationPoint(76, -25.5f, -11.5f).setRotationAngle(0, 0, -0).setName("Box 1967")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(67.5f, -26.75f, -8.74f).setRotationAngle(0, 0, -0).setName("Box 1971")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(67.5f, -26.75f, -1.01f).setRotationAngle(0, 0, -0).setName("Box 1972")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(66.51f, -26.75f, 0).setRotationAngle(0, 90, -0).setName("Box 1973")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(74.74f, -26.75f, 0).setRotationAngle(0, 90, -0).setName("Box 1974")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, -0.15f, -0.7f, 0, -0.15f, -0.7f, 0, -0.15f, -0.3f, 0, -0.15f, -0.3f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.3f, 0, -0.5f, -0.3f)
			.setRotationPoint(59.5f, -26.95f, -5.2f).setRotationAngle(0, 0, -0).setName("Box 1975")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -1, -0.25f, 0, -1, -0.25f)
			.setRotationPoint(76, -21.5f, -13).setRotationAngle(0, 0, -0).setName("Box 1976")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76, -21.5f, 3).setRotationAngle(0, 0, -0).setName("Box 1977")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, -0.15f, -0.7f, 0, -0.15f, -0.7f, 0, -0.15f, -0.3f, 0, -0.15f, -0.3f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.3f, 0, -0.5f, -0.3f)
			.setRotationPoint(67.5f, -26.95f, -5.2f).setRotationAngle(0, 0, -7).setName("Box 1978")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(67.5f, -26.8f, -7.75f).setRotationAngle(0, 0, -7).setName("Box 1979")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(67.5f, -26.8f, -3.25f).setRotationAngle(0, 0, -7).setName("Box 1980")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(74, -20, 8).setRotationAngle(0, 0, -0).setName("Box 1991")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
			.setRotationPoint(67, -16, 8).setRotationAngle(0, 0, -0).setName("Box 1992")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
			.setRotationPoint(67, -20.5f, 8).setRotationAngle(0, 0, -0).setName("Box 1993")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(67, -20, 8).setRotationAngle(0, 0, -0).setName("Box 1994")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(70.25f, -20, 8).setRotationAngle(0, 0, -0).setName("Box 1995")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, 0, -0.25f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(66, -18.650002f, 8).setRotationAngle(0, 0, -0).setName("Box 1996")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f)
			.setRotationPoint(72.1f, -20.75f, 8).setRotationAngle(0, 0, -0).setName("Box 1997")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f)
			.setRotationPoint(68.6f, -20.75f, 8).setRotationAngle(0, 0, -0).setName("Box 1998")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(70.5f, -20, -17).setRotationAngle(0, 0, -0).setName("Box 1999")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
			.setRotationPoint(67, -20.5f, -17).setRotationAngle(0, 0, -0).setName("Box 2000")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(74, -20, -17).setRotationAngle(0, 0, -0).setName("Box 2001")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f)
			.setRotationPoint(72.25f, -20.75f, -17).setRotationAngle(0, 0, -0).setName("Box 2002")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, 0, -0.25f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(66, -18.650002f, -17).setRotationAngle(0, 0, -0).setName("Box 2003")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f)
			.setRotationPoint(68.75f, -20.75f, -17).setRotationAngle(0, 0, -0).setName("Box 2004")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(67, -20, -17).setRotationAngle(0, 0, -0).setName("Box 2005")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
			.setRotationPoint(67, -16, -17).setRotationAngle(0, 0, -0).setName("Box 2006")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(72.1f, -11.5f, 4.25f).setRotationAngle(0, 0, -0).setName("Box 533")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71.1f, -12.5f, 3.25f).setRotationAngle(0, 0, -0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(75.97f, -16.25f, 8.25f).setRotationAngle(0, 180, -13).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(72.1f, -11.5f, -16.25f).setRotationAngle(0, 0, -0).setName("Box 2014")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71.1f, -12.5f, -16.25f).setRotationAngle(0, 0, -0).setName("Box 2015")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(75.97f, -16.25f, -11.25f).setRotationAngle(0, 180, -13).setName("Box 2016")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 529, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 7, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(76, -15.75f, -17.75f).setRotationAngle(0, -90, -0).setName("Box 1459")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 529, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(76, -9.75f, -17.75f).setRotationAngle(0, -90, -0).setName("Box 1461")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 529, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(76, -15.75f, -17.75f).setRotationAngle(0, -90, -0).setName("Box 1462")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 529, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(76.5f, -15.75f, -15).setRotationAngle(0, 0, -0).setName("Box 1466")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(76, -15.75f, -15.22f).setRotationAngle(0, 0, -0).setName("Box 1467")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(76, -9.75f, -15.22f).setRotationAngle(0, 0, -0).setName("Box 1468")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 529, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(76.5f, -15.75f, 6).setRotationAngle(0, 0, -0).setName("Box 2000")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(76, -9.75f, 5.78f).setRotationAngle(0, 0, -0).setName("Box 2001")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(76, -15.75f, 5.78f).setRotationAngle(0, 0, -0).setName("Box 2002")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 529, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(76, -9.75f, 8.25f).setRotationAngle(0, -90, -0).setName("Box 2003")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 529, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(76, -15.75f, 8.25f).setRotationAngle(0, -90, -0).setName("Box 2004")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 529, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(76, -15.75f, 8.75f).setRotationAngle(0, -90, -0).setName("Box 2005")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 153, textureX, textureY).addBox(0, 0, 0, 0, 4, 4)
			.setRotationPoint(-59.52f, -19, -5.85f).setRotationAngle(0, 0, -0).setName("Box 2006")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 529, textureX, textureY).addBox(0, 0, 0, 11, 5, 0)
			.setRotationPoint(64.5f, -14.5f, -16.77f).setRotationAngle(0, 0, -0).setName("Box 2007")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 537, textureX, textureY).addBox(0, 0, 0, 11, 5, 0)
			.setRotationPoint(64.5f, -14.5f, 8.77f).setRotationAngle(0, 0, -0).setName("Box 2008")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 529, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(1, -2.25f, -15.52f).setRotationAngle(0, 0, -0).setName("Box 2010")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 537, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-44.5f, -17, -14.02f).setRotationAngle(0, 0, -0).setName("Box 2011")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 537, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-44.5f, -17, 6.02f).setRotationAngle(0, 0, -0).setName("Box 2012")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 537, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(1, -2.25f, 7.52f).setRotationAngle(0, 0, -0).setName("Box 2014")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(67, -20.5f, -16.75f).setRotationAngle(-45, 0, -0).setName("Box 2015")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(67, -20.5f, 8.75f).setRotationAngle(45, 0, -0).setName("Box 2016")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 549, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 4, 16, 0, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 0.625f)
			.setRotationPoint(-57, -14.5f, -12).setRotationAngle(0, 0, -0).setName("Box 2017")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 547, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 11, 0, 0, 0.875f, 0.5f, -1, 0.875f, 0.5f, -1, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, -2.25f, 3.125f, -0.05f, -2.25f, 3.125f, -0.05f, -2.25f, 3.125f, 0, -2.25f, 3.125f)
			.setRotationPoint(57, -22.25f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 2017")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 542, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 16, 0, 0, 1, 0.625f, -1.05f, 1, 0.625f, -1.05f, 1, 0.625f, 0, 1, 0.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2)
			.setRotationPoint(57, -19.5f, -12).setRotationAngle(0, 0, -0).setName("Box 2018")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.1f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, 0.1f, 0.1f, 0, 0.1f)
			.setRotationPoint(64.25f, -18.5f, 0).setRotationAngle(0, 0, -0).setName("Box 2017")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 356, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(53.5f, -16.7f, 3.72f).setRotationAngle(0, 0, -0).setName("Box 2018")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 356, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(39.5f, -19.7f, 2.72f).setRotationAngle(0, 0, -0).setName("Box 2019")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 356, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-17.5f, -16.7f, 3.72f).setRotationAngle(0, 0, -0).setName("Box 2020")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 356, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-17.5f, -16.7f, -14.72f).setRotationAngle(0, 0, -0).setName("Box 2021")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 356, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(39.5f, -19.7f, -13.72f).setRotationAngle(0, 0, -0).setName("Box 2022")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 356, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(53.5f, -16.7f, -14.72f).setRotationAngle(0, 0, -0).setName("Box 2023")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 577, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-56.5f, -11, 7.9f).setRotationAngle(0, 0, -0).setName("Box 2028")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-56.5f, -11, 4.71f).setRotationAngle(0, 0, -0).setName("Box 2029")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-35.6f, -11, 4.71f).setRotationAngle(0, 0, -0).setName("Box 2030")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-35.5f, -14, 4.71f).setRotationAngle(0, 0, -0).setName("Box 2031")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 571, textureX, textureY)
			.addShapeBox(0, 0, 0, 99, 1, 1, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-35.5f, -14, 7.92f).setRotationAngle(0, 0, -0).setName("Box 2032")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-56.5f, -14, -16).setRotationAngle(0, 0, -0).setName("Box 2037")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 574, textureX, textureY)
			.addShapeBox(0, 0, 0, 119, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-56.5f, -14, -16).setRotationAngle(0, 0, -0).setName("Box 2038")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 413, textureX, textureY)
			.addShapeBox(0, 0, 0, 44, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-37, -20, 5.95f).setRotationAngle(0, 0, -0).setName("Box 2026")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 413, textureX, textureY)
			.addShapeBox(0, 0, 0, 54, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(7, -21, 4.95f).setRotationAngle(0, 0, -0).setName("Box 2027")
		);
		group0.add(new ModelRendererTurbo(group0, 203, 413, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.3f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, -1, 0, -0.7f, 0.3f, 0, -0.7f, -0.7f)
			.setRotationPoint(7, -21, 4.95f).setRotationAngle(0, 0, 90).setName("Box 2028")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 332, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(6.6000004f, -20.900002f, 5.05f).setRotationAngle(0, 0, -0).setName("Box 2029")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(6.6000004f, -19.900002f, 6.05f).setRotationAngle(0, 0, -0).setName("Box 2030")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 326, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 1.4f, -0.5f, 0.2f, 1.4f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 1.2f, -0.5f, -0.7f, 1.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-37.4f, -19.900002f, 6.05f).setRotationAngle(0, 0, -0).setName("Box 2031")
		);
		group0.add(new ModelRendererTurbo(group0, 156, 329, textureX, textureY)
			.addShapeBox(0, 0, 0.9f, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(6.700001f, -21.05f, 4.9f).setRotationAngle(-45, 0, -0).setName("Box 2032")
		);
		group0.add(new ModelRendererTurbo(group0, 272, 581, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(35.4f, -5, -14.1f).setRotationAngle(0, -180, -13).setName("Box 2041")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 577, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(24, -5, -14.1f).setRotationAngle(0, -180, -13).setName("Box 2042")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 586, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 12, 1, 1, 0, -0.25f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(25, -3.2000008f, -14.6f).setRotationAngle(0, 0, -0).setName("Box 2043")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 574, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 20, 1, 1, 0, -0.25f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(34.65f, -1.8000002f, 4.3f).setRotationAngle(0, 90, -0).setName("Box 2044")
		);
		group0.add(new ModelRendererTurbo(group0, 272, 577, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(35.4f, -5, 5.1f).setRotationAngle(0, -180, -13).setName("Box 2045")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 583, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 12, 1, 1, 0, -0.25f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(25, -3.2000008f, 5.6f).setRotationAngle(0, 0, -0).setName("Box 2046")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 577, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(24, -5, 5.1f).setRotationAngle(0, -180, -13).setName("Box 2047")
		);
		group0.add(new ModelRendererTurbo(group0, 189, 580, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(18.5f, -8.5f, 5.75f).setRotationAngle(0, 0, -0).setName("Box 1109")
		);
		group0.add(new ModelRendererTurbo(group0, 189, 585, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(18.5f, -8.5f, 5.75f).setRotationAngle(0, 0, -0).setName("Box 1110")
		);
		group0.add(new ModelRendererTurbo(group0, 174, 583, textureX, textureY).addBox(0, 0, 0, 5, 1, 2)
			.setRotationPoint(18.5f, -8, 5.75f).setRotationAngle(0, 0, -0).setName("Box 1111")
		);
		group0.add(new ModelRendererTurbo(group0, 174, 587, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f)
			.setRotationPoint(14.25f, -7, 6.2f).setRotationAngle(0, 0, -0).setName("Box 1113")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 584, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, -0.675f, -0.175f, 0.1f, -0.675f, -0.175f, 0.1f, -0.675f, -0.175f, 0, -0.675f, -0.175f, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f)
			.setRotationPoint(15.5f, -8, 6.15f).setRotationAngle(0, 0, -0).setName("Box 1114")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 587, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0, -0.675f, -0.175f, 0.1f, -0.675f, -0.175f, 0.1f, -0.675f, -0.175f, 0, -0.675f, -0.175f)
			.setRotationPoint(15.5f, -6, 6.15f).setRotationAngle(0, 0, -0).setName("Box 1115")
		);
		group0.add(new ModelRendererTurbo(group0, 204, 586, textureX, textureY)
			.addShapeBox(0, -1, 0, 0, 2, 1, 0, 0, -0.025f, -0.175f, 0.1f, -0.025f, -0.175f, 0.1f, -0.025f, -0.175f, 0, -0.025f, -0.175f, 0, -0.025f, -0.175f, 0.1f, -0.025f, -0.175f, 0.1f, -0.025f, -0.175f, 0, -0.025f, -0.175f)
			.setRotationPoint(16.25f, -7.5f, 6.21f).setRotationAngle(0, 0, -0).setName("Box 1116")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 587, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 4, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 4, 0, -0.7f, 4, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 4, -0.7f, -0.7f)
			.setRotationPoint(27, -8, 7.4f).setRotationAngle(0, 0, -2).setName("Box 2064")
		);
		group0.add(new ModelRendererTurbo(group0, 220, 581, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(15.200001f, -8, 5).setRotationAngle(0, -180, -4).setName("Box 2066")
		);
		group0.add(new ModelRendererTurbo(group0, 154, 587, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0.2f, 0, -0.2f, 0.2f)
			.setRotationPoint(14.25f, -7, 5.2f).setRotationAngle(0, 0, -0).setName("Box 2069")
		);
		group0.add(new ModelRendererTurbo(group0, 174, 587, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f)
			.setRotationPoint(20.5f, -7, 6.2f).setRotationAngle(0, 90, -0).setName("Box 2065")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 583, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(64.9f, -12.5f, -1.75f).setRotationAngle(0, 0, -0).setName("Box 2070")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 578, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(64.9f, -12.5f, -6.75f).setRotationAngle(0, 0, -0).setName("Box 2071")
		);
		group0.add(new ModelRendererTurbo(group0, 288, 582, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, -0.4f, -1, 0, -0.4f, -1, 0, -0.4f, -1, 0, -0.4f, -1, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(64.9f, -13.5f, -6.75f).setRotationAngle(0, 0, -0).setName("Box 2072")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 581, textureX, textureY).addBox(0, 0, 0, 1, 3, 5)
			.setRotationPoint(65.65f, -12.5f, -6.25f).setRotationAngle(0, 0, -0).setName("Box 2073")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(49.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 2078")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 587, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(37, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 2079")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 587, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(24.5f, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 2080")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 581, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, 1.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 2081")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 584, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(49.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 2082")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 581, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(37, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 2083")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 581, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(24.5f, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 2084")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 587, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, 1.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 2085")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 25, 0, -1.5f, 0, -1.75f, -2, 0, -1.75f, -2, 0, -1.75f, -1.5f, 0, -1.75f, -2.05f, 0, 0.05f, -1.55f, 0, 0.05f, -1.55f, 0, 0.05f, -2.05f, 0, 0.05f)
			.setRotationPoint(59.050003f, -23.5f, -16.5f).setRotationAngle(0, 0, -0).setName("Box 974")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 566, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(64.25f, -18.5f, -8.5f).setRotationAngle(0, 0, -0).setName("Box 2108")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 574, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(64.25f, -18.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 2111")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 554, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 1, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.5f, 1, -0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(64.25f, -18.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 2112")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 586, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 1, 0, 1, -1.5f, 0, 1, -1.5f, 0, -1.5f, 1, 0, -1.5f, 0, 0.5f, -1, -0.5f, 0.5f, -1, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(65.25f, -16, -2.5f).setRotationAngle(0, 0, -0).setName("Box 2113")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 554, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -1, 0.5f, -1, 0.5f, 0.5f, -1, 0.5f, 0.5f, 0.5f, -1, 0.5f, 0.5f)
			.setRotationPoint(65.25f, -13.5f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 2114")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 558, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(63.25f, -18.5f, -3.5f).setRotationAngle(90, 0, -0).setName("Box 2115")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 570, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(66.25f, -11, -0.5f).setRotationAngle(0, 0, -0).setName("Box 2116")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 558, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(63.25f, -18.75f, -9).setRotationAngle(90, 0, -0).setName("Box 2117")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 570, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, -0.5f, 3, 0, 0, 3, 0, 0, 3, -0.5f, -0.5f, 3, -0.5f, -1.5f, -0.5f, 0, 1, -0.5f, 0, 1, -0.5f, -0.5f, -1.5f, -0.5f, -0.5f)
			.setRotationPoint(61.75f, -20, -4.25f).setRotationAngle(0, 0, -0).setName("Box 2118")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 578, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(64.25f, -17.75f, -11).setRotationAngle(90, 0, -0).setName("Box 2119")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 583, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, -1, -0.5f, -0.5f)
			.setRotationPoint(63.25f, -17.75f, -10).setRotationAngle(0, 0, -0).setName("Box 2120")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 574, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 2, 1.5f, 0, -2.5f, 1.5f, 0, -2.5f, 1.5f, -0.5f, 2, 1.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(64.25f, -21, -8.5f).setRotationAngle(0, 0, -0).setName("Box 2121")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 566, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(66.25f, -10.75f, 0).setRotationAngle(90, 0, -0).setName("Box 2123")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 578, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(61.75f, -23.5f, 0.5f).setRotationAngle(0, 0, -90).setName("Box 2128")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 562, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(61.75f, -23.5f, -8.5f).setRotationAngle(0, 0, -90).setName("Box 2129")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 582, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(61.75f, -24, -4.25f).setRotationAngle(0, 0, -90).setName("Box 2130")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 586, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 2, 1.5f, 0, -2.5f, 1.5f, 0, -2.5f, 1.5f, -0.5f, 2, 1.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(64.25f, -21, 0.5f).setRotationAngle(0, 0, -0).setName("Box 2131")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 582, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, 3, 0, -0.5f, 3, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(65.75f, -11.75f, -12).setRotationAngle(90, 0, -0).setName("Box 2132")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 562, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(62.75f, -21, 3.25f).setRotationAngle(0, 0, -90).setName("Box 2135")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 580, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(63.25f, -20, 3.25f).setRotationAngle(0, 0, -0).setName("Box 2136")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 574, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 1, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.5f, 1, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(64.25f, -17, 3.75f).setRotationAngle(0, 0, -0).setName("Box 2137")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 586, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 2, 1.5f, 0, -2.5f, 1.5f, 0, -2.5f, 1.5f, -0.5f, 2, 1.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(65.25f, -16.25f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 2139")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 577, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1.5f, -1, -0.5f, 1.5f, -1)
			.setRotationPoint(65.25f, -13.75f, -7.5f).setRotationAngle(0, 0, -0).setName("Box 2140")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 578, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(27.5f, -26.5f, -2.04f).setRotationAngle(0, 90, -0).setName("Box 2142")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 570, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(64.45f, -14, 6.75f).setRotationAngle(0, 0, -0).setName("Box 2144")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 500, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(27.5f, -26.5f, -2.05f).setRotationAngle(0, 90, -0).setName("Box 2145")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 587, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(39, 4.25f, 5.1f).setRotationAngle(0, 0, -90).setName("Box 2134")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 578, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(39, 4.25f, -14.1f).setRotationAngle(0, 0, -90).setName("Box 2137")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-17.5f, -8.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 2164")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -8.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 2165")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -8.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 2167")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-13.5f, -8.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 2169")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, -8.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 2170")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, -4.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 2171")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-13.5f, -4.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 2172")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-17.5f, -4.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 2173")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -4.5f, -15.5f).setRotationAngle(0, 0, -0).setName("Box 2174")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -4.5f, -14.5f).setRotationAngle(0, 0, -0).setName("Box 2175")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -4.5f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 2176")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-17.5f, -8.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 2177")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -8.5f, 5.5f).setRotationAngle(0, 0, -0).setName("Box 2178")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -8.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 2179")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-13.5f, -8.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 2180")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, -8.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 2181")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-17.5f, -4.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 2182")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -4.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 2183")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, -4.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 2184")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-13.5f, -4.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 2185")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 585, textureX, textureY)
			.addShapeBox(0, 0, 5, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22.5f, 0, 0, 22.5f, 0, 0, 0, 0, 0, 0, 0, 0, 22.5f, 0, 0, 22.5f)
			.setRotationPoint(60, -8, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2186")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 576, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f)
			.setRotationPoint(56, -6.75f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2187")
		);
		group0.add(new ModelRendererTurbo(group0, 335, 558, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f)
			.setRotationPoint(56.5f, -7.5f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2188")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 567, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f)
			.setRotationPoint(56, -8.25f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2189")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 579, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f)
			.setRotationPoint(51, -5.75f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2190")
		);
		group0.add(new ModelRendererTurbo(group0, 335, 561, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f)
			.setRotationPoint(51.5f, -6.5f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2191")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 570, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f)
			.setRotationPoint(51, -7.25f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2192")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 582, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f)
			.setRotationPoint(46, -6.75f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2193")
		);
		group0.add(new ModelRendererTurbo(group0, 335, 564, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f)
			.setRotationPoint(46.5f, -7.5f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2194")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 573, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f)
			.setRotationPoint(46, -8.25f, -20.75f).setRotationAngle(0, 0, -0).setName("Box 2195")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 1)
			.setRotationPoint(-0.5f, 6.5f, -5.5f).setRotationAngle(0, 0, -0).setName("Box 2206")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 1)
			.setRotationPoint(-0.5f, 2.5f, -5.5f).setRotationAngle(0, 0, -0).setName("Box 2207")
		);
		group0.add(new ModelRendererTurbo(group0, 188, 593, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(20, 2, 6.4f).setRotationAngle(0, 0, 90).setName("Box 2052")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 598, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(20, 1, 4.4f).setRotationAngle(0, 0, 90).setName("Box 2053")
		);
		group0.add(new ModelRendererTurbo(group0, 200, 598, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(20, 6, 4.4f).setRotationAngle(0, 0, 90).setName("Box 2054")
		);
		group0.add(new ModelRendererTurbo(group0, 200, 590, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(20, 6, -15.4f).setRotationAngle(0, 0, 90).setName("Box 2055")
		);
		group0.add(new ModelRendererTurbo(group0, 188, 590, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(20, 2, -15.4f).setRotationAngle(0, 0, 90).setName("Box 2056")
		);
		group0.add(new ModelRendererTurbo(group0, 200, 594, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(20, 1, -15.4f).setRotationAngle(0, 0, 90).setName("Box 2057")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(-21.25f, -26.75f, -4.5f).setRotationAngle(0, 0, -0).setName("Box 1521")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -26.5f, -4.25f).setRotationAngle(-90, 0, -0).setName("Box 1807")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 425, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-20.25f, -26.5f, -4.5f).setRotationAngle(0, 0, -0).setName("Box 1808")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-19.5f, -26.25f, -3.75f).setRotationAngle(-90, 90, -0).setName("Box 1809")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 2, 0, 0, -2.5f, 0, 0, -2.5f, 0, -0.5f, 2, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(28, -8.5f, 6).setRotationAngle(0, 0, -0).setName("Box 2059")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 413, textureX, textureY)
			.addShapeBox(0, -1, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18, -9, 6.5f).setRotationAngle(0, 0, -0).setName("Box 2060")
		);
		group0.add(new ModelRendererTurbo(group0, 237, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-15, -10, 6.5f).setRotationAngle(0, 0, -0).setName("Box 2061")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 597, textureX, textureY)
			.addShapeBox(0, -1, 0, 11, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(64.5f, -7, 7.5f).setRotationAngle(0, 0, -0).setName("Box 1849")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 594, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, -0.5f, 0, 5, -0.5f, 0, -5.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -5.5f, -0.5f)
			.setRotationPoint(59.5f, -7, 7.5f).setRotationAngle(0, 0, -0).setName("Box 1852")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 591, textureX, textureY)
			.addShapeBox(0, -1, 0, 50, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(9.5f, -12, 7.5f).setRotationAngle(0, 0, -0).setName("Box 1855")
		);
		group0.add(new ModelRendererTurbo(group0, 29, 594, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, -0.5f, 0, 5, -0.5f, 0, -5.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -5.5f, -0.5f)
			.setRotationPoint(59.5f, -6.25f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 2065")
		);
		group0.add(new ModelRendererTurbo(group0, 53, 597, textureX, textureY)
			.addShapeBox(0, -1, 0, 11, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(64.5f, -6.25f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 2066")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 600, textureX, textureY)
			.addShapeBox(0, -1, 0, 50, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(9.5f, -11.25f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 2070")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 603, textureX, textureY)
			.addShapeBox(0, -1, 0, 50, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(9.5f, -10.5f, 7.5f).setRotationAngle(0, 0, -0).setName("Box 2071")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 590, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(9, -12, 5).setRotationAngle(0, 0, -0).setName("Box 2072")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 590, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(9, -11.25f, 5).setRotationAngle(0, 0, -0).setName("Box 2073")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 590, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(9, -10.5f, 5).setRotationAngle(0, 0, -0).setName("Box 2074")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 590, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(58.5f, -10.5f, 5).setRotationAngle(0, 0, -0).setName("Box 2075")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 385, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -16.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1445")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 401, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-7.5f, -11.5f, 6).setRotationAngle(0, 0, -0).setName("Box 1457")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 13, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20.5f, -12, 6).setRotationAngle(0, 0, -0).setName("Box 1459")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-12, -11.5f, -15).setRotationAngle(0, 0, -0).setName("Box 1468")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 401, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 6, 1, 0, 0, 1, 0, -0.5f, 1.5f, 0, -0.5f, 1.5f, -0.5f, 0, 1, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.5f, -8, -15).setRotationAngle(0, 0, -0).setName("Box 1470")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 401, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18, -2.5f, -15).setRotationAngle(0, 0, -0).setName("Box 1472")
		);
		group0.add(new ModelRendererTurbo(group0, 208, 413, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18, -9.5f, -15).setRotationAngle(0, 0, -0).setName("Box 2086")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0.5f, 1, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 1, -0.5f, 0.5f, -1.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0.5f, -1.5f, -0.5f)
			.setRotationPoint(-11, -11, -15).setRotationAngle(0, 0, -90).setName("Box 2087")
		);
		groups.add(group0);
	}

	ModelNWY6bRearBogie bogie = new ModelNWY6bRearBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
	}
}
