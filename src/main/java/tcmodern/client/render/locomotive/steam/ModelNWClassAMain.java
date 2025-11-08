//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.steam;

import net.minecraft.entity.Entity;
import tcmodern.client.render.locomotive.bogies.ModelNWClassARearBogie;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWClassAMain extends FVTMFormatBase {

	public ModelNWClassAMain(){
		super();
		textureX = 512;
		textureY = 1024;
		addToCreators("Riggs64");
		//
		initGroup_Main0();
		initGroup_Main1();
		initGroup_Main2();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Main0(){
		TurboList Main = new TurboList("Main");
		Main.add(new ModelRendererTurbo(Main, 105, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(36.4f, -1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 330")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(32.89f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 331")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(36.4f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 332")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(39.91f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 333")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(39.9f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 334")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(32.9f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 335")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(23.9f, -1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 337")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(23.9f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 338")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(27.41f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 340")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(27.4f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 341")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(20.4f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 342")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(20.39f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 343")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(11.4f, -1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 351")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(7.9f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 352")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(7.89f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 353")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(11.4f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 355")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(14.9f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 356")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(14.91f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 357")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(36.4f, -1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 426")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(32.89f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 427")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(36.4f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 428")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(39.91f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 429")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(39.9f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 430")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(32.9f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 431")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(23.9f, -1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(23.9f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(27.41f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 436")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(27.4f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 437")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(20.4f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 438")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(20.39f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(11.4f, -1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 447")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(7.9f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 448")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(7.89f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 449")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(11.4f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(14.9f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 452")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 25, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(14.91f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 453")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 25, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-2.1f, 2.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 413")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-3.1f, 2.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 415")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.1f, 2.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 416")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 25, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-3.1f, 2.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 417")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.1f, 6.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 418")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-3.1f, 6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 419")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.1f, 6.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 421")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 11, 0, 1, 1, -4, 0.5f, 4, 0, 0.5f, 4, -10, 1, 1, -6, 1, -1, -4, 0.5f, -4, 0, 0.5f, -4, -10, 1, -1, -6)
			.setRotationPoint(3.9f, 3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 422")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 11, 0, 1, 0, -4, 0.5f, 1, 0, 0.5f, 1, -10, 1, 0, -6, 1, 0, -4, 0.5f, -1, 0, 0.5f, -1, -10, 1, 0, -6)
			.setRotationPoint(3.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 423")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 9, textureX, textureY).addBox(0, 0, 0, 2, 4, 3)
			.setRotationPoint(0.9f, 2.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 424")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 793")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 794")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 795")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 796")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 797")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 798")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 799")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 800")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 801")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 802")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 803")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 804")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(7.9f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 805")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(7.9f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 806")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(8.9f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 807")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(8.9f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 808")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(9.9f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 809")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(9.9f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 810")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 811")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 812")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 813")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 814")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 815")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 816")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 817")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 818")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 819")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 820")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 821")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(12.9f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 822")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(7.9f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 823")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(7.9f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 824")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(8.9f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 825")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(8.9f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 826")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(9.9f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 827")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(9.9f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 828")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 829")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 830")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 831")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 832")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 833")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 834")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 835")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 836")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 837")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 838")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 839")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 840")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(20.4f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 841")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(20.4f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 842")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(21.4f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 843")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(21.4f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 844")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(22.4f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 845")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(22.4f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 846")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 847")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 848")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 849")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 850")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 851")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.9f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 852")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 853")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 854")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 855")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 856")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 857")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(25.4f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 858")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(20.4f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 859")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(20.4f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 860")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(21.4f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 861")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(21.4f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 862")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(22.4f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 863")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(22.4f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 864")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 865")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 866")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 867")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 868")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 869")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 870")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 871")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 872")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 873")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 874")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 875")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 876")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(32.9f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 877")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(32.9f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 878")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(33.9f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 879")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(33.9f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 880")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(34.9f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 881")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(34.9f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 882")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 883")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 884")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 885")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 886")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 887")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.4f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 888")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 889")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 890")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 891")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 892")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 893")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(37.9f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 894")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(32.9f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 895")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(32.9f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 896")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(33.9f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 897")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(33.9f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 898")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(34.9f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 899")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(34.9f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 900")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 4, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-58.6f, -17.25f, -10).setRotationAngle(0, 0, 0).setName("Box 950")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 4, 6, 0, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(-58.6f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 951")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 4, 2, 0, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f)
			.setRotationPoint(-58.6f, -22.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 952")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 4, 16, 0, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 0.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2)
			.setRotationPoint(-58.6f, -19.5f, -8).setRotationAngle(0, 0, 0).setName("Box 953")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 4, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-26.6f, -17.25f, -10).setRotationAngle(0, 0, 0).setName("Box 917")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 2, 0, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16)
			.setRotationPoint(-26.6f, -19.5f, -8).setRotationAngle(0, 0, 0).setName("Box 918")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 2, 0, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f)
			.setRotationPoint(-26.6f, -22.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 920")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 4, 2, 0, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f)
			.setRotationPoint(-26.6f, -14.5f, -8).setRotationAngle(0, 0, 0).setName("Box 921")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f)
			.setRotationPoint(-26.6f, -11.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 922")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 68, 4, 6, 0, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1)
			.setRotationPoint(-26.6f, -10.5f, -3).setRotationAngle(0, 0, 0).setName("Box 923")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 2, 0, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f)
			.setRotationPoint(16.4f, -22.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 935")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 2, 0, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16)
			.setRotationPoint(16.4f, -19.5f, -8).setRotationAngle(0, 0, 0).setName("Box 936")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 4, 2, 0, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 14.625f, 0, 1, 14.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 16, 0, -1.75f, 16)
			.setRotationPoint(41.4f, -19.5f, -8).setRotationAngle(0, 0, 0).setName("Box 945")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 4, 2, 0, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f)
			.setRotationPoint(41.4f, -22.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 4, 6, 0, 0, 1.25f, -1, 0, 1.75f, -1, 0, 1.75f, -1, 0, 1.25f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(-26.6f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 919")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 6, 0, 0, 1.75f, -1, 0, 1.75f, -1, 0, 1.75f, -1, 0, 1.75f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(16.4f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 934")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 4, 6, 0, 0, 1.75f, -1, 0, 0.75f, -1, 0, 0.75f, -1, 0, 1.75f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(41.4f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 947")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, -0.095f, 2, 0, -0.095f, 2, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(72.4f, -21.5f, -12.85f).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, -0.6f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6f, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(72.9f, -20.5f, 12).setRotationAngle(0, 0, 0).setName("Box 1008")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(77.4f, -20.5f, 12).setRotationAngle(0, 0, 0).setName("Box 1009")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(74.9f, -15.5f, 12).setRotationAngle(0, 0, 0).setName("Box 1010")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76.9f, -15.5f, 12).setRotationAngle(0, 0, 0).setName("Box 1011")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(86.9f, -20.5f, 12).setRotationAngle(0, 0, 0).setName("Box 1012")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(76.9f, -15.5f, -13).setRotationAngle(0, 0, 0).setName("Box 1013")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(86.9f, -20.5f, -13).setRotationAngle(0, 0, 0).setName("Box 1014")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(74.9f, -15.5f, -13).setRotationAngle(0, 0, 0).setName("Box 1015")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, -0.6f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.6f, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(72.9f, -20.5f, -13).setRotationAngle(0, 0, 0).setName("Box 1016")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(77.4f, -20.5f, -13).setRotationAngle(0, 0, 0).setName("Box 1017")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 2, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0.95f, 0.25f, 0, 0.95f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.6f, 0.25f, 0, -1.6f, 0.25f)
			.setRotationPoint(71.9f, -25, -9.25f).setRotationAngle(0, 0, 0).setName("Box 1018")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, -0.65f, -1.8f, 0, -0.65f, -1.8f, 0, -1, 0.8f, 0, -1, 0.8f, 0, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(71.9f, -25.5f, -11.05f).setRotationAngle(0, 0, 0).setName("Box 1021")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 2, 1, 0, 0.5f, 0, -1.8f, 0.5f, 0, -1.8f, 0.5f, 0, 1.3f, 0.5f, 0, 1.3f, 0.5f, 0, -0.25f, -4.5f, 0, -0.25f, -4.5f, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(72.4f, -23.5f, -12.6f).setRotationAngle(0, 0, 0).setName("Box 1022")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0.55f, 0.25f, 0, 0.55f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.2f, 0.25f, 0, -1.2f, 0.25f)
			.setRotationPoint(71.9f, -26.1f, -7).setRotationAngle(0, 0, 0).setName("Box 1026")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(71.9f, -26.8f, -3.75f).setRotationAngle(0, 0, 0).setName("Box 1027")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 2, 1, 0, 0.5f, 0, 1.3f, 0.5f, 0, 1.3f, 0.5f, 0, -1.8f, 0.5f, 0, -1.8f, 0.5f, 0, -0.25f, -4.5f, 0, -0.25f, -4.5f, 0, -0.25f, 0.5f, 0, -0.25f)
			.setRotationPoint(72.4f, -23.5f, 11.6f).setRotationAngle(0, 0, 0).setName("Box 977")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, -1, 0.8f, 0, -1, 0.8f, 0, -0.65f, -1.8f, 0, -0.65f, -1.8f, 0, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(71.9f, -25.5f, 10.05f).setRotationAngle(0, 0, 0).setName("Box 978")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 2, 0, 0, 0.95f, 0.25f, 0, 0.95f, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -1.6f, 0.25f, 0, -1.6f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.9f, -25, 7.25f).setRotationAngle(0, 0, 0).setName("Box 979")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 3, 0, 0, 0.55f, 0.25f, 0, 0.55f, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -1.2f, 0.25f, 0, -1.2f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.9f, -26.1f, 4).setRotationAngle(0, 0, 0).setName("Box 980")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(71.9f, -26.8f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 981")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 25, 0, 0, 0, -0.25f, -1.5f, 0, -0.25f, -1.5f, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(74.9f, -15.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 972")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 23, 0, -0.6f, 0, -0.75f, -3, 0, -0.75f, -3, 0, -0.75f, -0.6f, 0, -0.75f, -2, 0, -0.25f, -1.5f, 0, -0.25f, -1.5f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(72.9f, -20.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 973")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0.5f, 0, 0, 3.5f, 0, 0, 3.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 2, 0, -0.4f, 2, 0, -0.095f, -0.5f, 0, -0.095f)
			.setRotationPoint(72.4f, -21.5f, 11.85f).setRotationAngle(0, 0, 0).setName("Box 974")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 21, 0, -1.55f, 0, -2.75f, -1.95f, 0, -2.75f, -1.95f, 0, -2.75f, -1.55f, 0, -2.75f, -2, 0, 0.25f, -1.5f, 0, 0.25f, -1.5f, 0, 0.25f, -2, 0, 0.25f)
			.setRotationPoint(70.95f, -25.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 975")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 15, 0, -1.6f, -0.05f, -3, -1.9f, -0.05f, -3, -1.9f, -0.05f, -3, -1.6f, -0.05f, -3, -2, 0, -0.25f, -1.5f, 0, -0.25f, -1.5f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(70.5f, -26.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 976")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 4, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.4f, -8.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 979")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 24, 0, 0, 0, -1.5f, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1)
			.setRotationPoint(41.4f, -13.25f, -12).setRotationAngle(0, 0, 0).setName("Box 980")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 22, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(41.4f, -17.25f, -11).setRotationAngle(0, 0, 0).setName("Box 981")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 23, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f)
			.setRotationPoint(41.4f, -9.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 982")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f)
			.setRotationPoint(76.9f, -8.5f, -12.75f).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 39, 8, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, -4, 0, 0, -4, 0, -4, 0, 0)
			.setRotationPoint(42.4f, -4.25f, -5).setRotationAngle(0, 0, 0).setName("Box 984")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 25, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.4f, -8.25f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 985")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 25, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, -3)
			.setRotationPoint(87.4f, -0.25f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 986")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 19, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -6, -0.5f, 0, -6, -0.5f, 0, -6, 0, 0, -6)
			.setRotationPoint(87.4f, 2.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 987")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(77.4f, -8.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 19, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(80.4f, -1.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 19, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.4f, -2.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 23, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.4f, -4.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1010")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 23, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0)
			.setRotationPoint(77.4f, -8.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 997")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 121, textureX, textureY).addBox(0, 0, 0, 2, 5, 5)
			.setRotationPoint(-35.85f, -7.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1035")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 5, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-36.85f, -7.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1036")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 5, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.85f, -7.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1037")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 6, 0, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f)
			.setRotationPoint(-36.85f, -10.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1041")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, 0.875f, 0.7f, 0, 0.875f, 0.7f, 0, 0.875f, 9.7f, 0, 0.875f, 9.7f)
			.setRotationPoint(-36.85f, -11.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1042")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.1f, -26.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1081")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.6f, -25.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1082")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.6f, -26.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1083")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.1f, -25.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1084")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 137, textureX, textureY).addBox(0, 0, 0, 9, 4, 5)
			.setRotationPoint(-32.1f, -25.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1085")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.1f, -26.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1086")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-32.1f, -25.75f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1093")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-32.1f, -26.75f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1094")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(-30.6f, -25.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1095")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(-30.6f, -26.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1096")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 2, 0, 0, 1, 0.825f, 0, 1, 0.825f, 0, 1, 14.825f, 0, 1, 14.825f, 0, -1.75f, 2.2f, 0, -1.75f, 2.2f, 0, -1.75f, 16.2f, 0, -1.75f, 16.2f)
			.setRotationPoint(-32.6f, -19.5f, -8).setRotationAngle(0, 0, 0).setName("Box 1100")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 2, 0, 0, 0.875f, 0.7f, 0, 0.875f, 0.7f, 0, 0.875f, 9.7f, 0, 0.875f, 9.7f, 0, -2.25f, 3.325f, 0, -2.25f, 3.325f, 0, -2.25f, 12.325f, 0, -2.25f, 12.325f)
			.setRotationPoint(-32.6f, -22.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1101")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 6, 0, 0, 1.45f, -0.8f, 0, 1.65f, -0.8f, 0, 1.65f, -0.8f, 0, 1.45f, -0.8f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f)
			.setRotationPoint(-32.6f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1102")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.15f, -27.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1091")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.65f, -27.5f, -4).setRotationAngle(0, 0, 0).setName("Box 1092")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(13.15f, -27.5f, 1).setRotationAngle(0, 0, 0).setName("Box 1093")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(14.65f, -27.5f, 3).setRotationAngle(0, 0, 0).setName("Box 1094")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 4, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(13.15f, -26.5f, 1).setRotationAngle(0, 0, 0).setName("Box 1095")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(14.65f, -26.5f, 3).setRotationAngle(0, 0, 0).setName("Box 1096")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 4, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.15f, -26.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1097")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.65f, -26.5f, -4).setRotationAngle(0, 0, 0).setName("Box 1098")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 153, textureX, textureY).addBox(0, 0, 0, 8, 4, 2)
			.setRotationPoint(13.15f, -26.5f, -1).setRotationAngle(0, 0, 0).setName("Box 1099")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.15f, -27.5f, -1).setRotationAngle(0, 0, 0).setName("Box 1100")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 161, textureX, textureY).addBox(0, 0, 0, 4, 2, 7)
			.setRotationPoint(-56.2f, -25.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1163")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.85f, -17, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1149")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 11, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.85f, -20, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1150")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.85f, -21, -4).setRotationAngle(0, 0, 0).setName("Box 1151")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f)
			.setRotationPoint(-59.85f, -15, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1160")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f, 0, 0.5f, -2.3f)
			.setRotationPoint(-59.85f, -12, -4).setRotationAngle(0, 0, 0).setName("Box 1163")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 13, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-59.35f, -17.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1166")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 13, 0, 0, 0, -2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-59.35f, -20.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1167")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0.45f, -2.8f, 0, 0.7f, -2.3f, 0, 0.7f, -2.3f, 0, 0.45f, -2.8f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-59.35f, -21.5f, -5).setRotationAngle(0, 0, 0).setName("Box 1168")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 13, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -2)
			.setRotationPoint(-59.35f, -14.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1169")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.45f, -2.8f, 0, 0.3f, -2.3f, 0, 0.3f, -2.3f, 0, 0.45f, -2.8f)
			.setRotationPoint(-59.35f, -11.5f, -5).setRotationAngle(0, 0, 0).setName("Box 1170")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 123, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-49.6f, -23, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1213")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.1f, -22, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1215")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-51.6f, -22, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1216")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.35f, -21.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1218")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-37.35f, -22.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1219")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-21.35f, -22.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1220")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-5.35f, -22.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1221")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(8.65f, -22.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1222")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(23.65f, -22.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1223")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(40.65f, -22.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1224")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(56.65f, -22.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1225")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(69.65f, -22.9f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1226")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-37.25f, -22.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1227")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-21.25f, -22.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1229")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-5.25f, -22.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1230")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(8.75f, -22.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1231")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(23.75f, -22.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1232")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(40.75f, -22.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1233")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(56.75f, -22.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1234")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(69.75f, -22.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1235")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.26f, -21.85f, -8.15f).setRotationAngle(45, 0, 0).setName("Box 1236")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 123, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-49.6f, -23, 7.95f).setRotationAngle(0, 0, 0).setName("Box 1237")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.35f, -21.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1238")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.1f, -22, 7.95f).setRotationAngle(0, 0, 0).setName("Box 1239")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -1.7f, 0, 0, -1.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-51.6f, -22, 7.95f).setRotationAngle(0, 0, 0).setName("Box 1240")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-37.35f, -22.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1241")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-21.35f, -22.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1242")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-5.35f, -22.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1243")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(8.65f, -22.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1244")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(40.65f, -22.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1245")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(23.65f, -22.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1246")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(56.65f, -22.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1247")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(69.65f, -22.9f, 8.05f).setRotationAngle(0, 0, 0).setName("Box 1248")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-37.25f, -23.05f, 7.9f).setRotationAngle(-45, 0, 0).setName("Box 1250")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-21.25f, -23.05f, 7.9f).setRotationAngle(-45, 0, 0).setName("Box 1251")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-5.25f, -23.05f, 7.9f).setRotationAngle(-45, 0, 0).setName("Box 1252")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(8.75f, -23.05f, 7.9f).setRotationAngle(-45, 0, 0).setName("Box 1253")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(23.75f, -23.05f, 7.9f).setRotationAngle(-45, 0, 0).setName("Box 1254")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(40.75f, -23.05f, 7.9f).setRotationAngle(-45, 0, 0).setName("Box 1255")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(56.75f, -23.05f, 7.9f).setRotationAngle(-45, 0, 0).setName("Box 1256")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(69.75f, -23.05f, 7.9f).setRotationAngle(-45, 0, 0).setName("Box 1257")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, -0.005f, -0.7f, 0, 0.4f, -0.71f, 0, 0.4f, -0.71f, -0.7f, -0.005f, -0.7f, -0.7f)
			.setRotationPoint(-58.25f, -25.5f, 2.25f).setRotationAngle(0, 90, 0).setName("Box 1255")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.35f, -24.6f, -4.55f).setRotationAngle(0, 0, 0).setName("Box 1257")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.6f, -0.65f, 0, 0.6f, -0.65f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.25f, -25.5f, -2.25f).setRotationAngle(0, 90, 19).setName("Box 1258")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.02f, -0.005f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0.02f, -0.005f, -0.7f, -0.21f, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, -0.21f, -0.7f, -0.7f)
			.setRotationPoint(-57.95f, -23.82f, 6.45f).setRotationAngle(0, -90, 45).setName("Box 1263")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0.02f, 0, 0.5f, 0.02f, -0.7f, 0, 0, -0.7f, -0.1f, -0.71f, 0, 0.6f, -0.65f, 0, 0.6f, -0.65f, -0.7f, -0.1f, -0.71f, -0.7f)
			.setRotationPoint(-57.95f, -25.5f, 2.25f).setRotationAngle(0, -90, 19).setName("Box 1265")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.35f, -24.6f, 4.55f).setRotationAngle(0, 0, 0).setName("Box 1266")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.3f, -0.01f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0.3f, -0.01f, -0.7f, -0.01f, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, -0.01f, -0.7f, -0.7f)
			.setRotationPoint(-58.25f, -21.82f, -8.42f).setRotationAngle(0, 90, 59).setName("Box 1267")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.22f, -0.005f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0.22f, -0.005f, -0.7f, -0.01f, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, -0.01f, -0.7f, -0.7f)
			.setRotationPoint(-57.95f, -21.82f, 8.45f).setRotationAngle(0, -90, 58).setName("Box 1268")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.35f, -19.75f, -9.55f).setRotationAngle(0, 0, 0).setName("Box 1269")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-58.35f, -19.75f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1270")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, -0.2f, -0.7f, 0, -0.2f, -0.7f)
			.setRotationPoint(-58.25f, -19.55f, -9.3f).setRotationAngle(90, 0, 0).setName("Box 1271")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 161, textureX, textureY)
			.addShapeBox(2.5f, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0, 1, 0.02f, 0, 1, 0.02f, -0.7f, 0, 0.15f, -0.7f, -0.1f, -0.81f, 0, 1.1f, -0.65f, 0, 1.1f, -0.65f, -0.7f, -0.1f, -0.81f, -0.7f)
			.setRotationPoint(-57.95f, -25.5f, 2.25f).setRotationAngle(0, -90, 22).setName("Box 1273")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.02f, -0.005f, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0.02f, -0.005f, -0.7f, -0.21f, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, -0.21f, -0.7f, -0.7f)
			.setRotationPoint(-58.25f, -23.82f, -6.45f).setRotationAngle(0, 90, 45).setName("Box 1274")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 169, textureX, textureY)
			.addShapeBox(2.5f, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0, 1, 0.02f, 0, 1, 0.02f, -0.7f, 0, 0.15f, -0.7f, -0.1f, -0.81f, 0, 1.1f, -0.65f, 0, 1.1f, -0.65f, -0.7f, -0.1f, -0.81f, -0.7f)
			.setRotationPoint(-58.25f, -25.5f, -2.25f).setRotationAngle(0, 90, 22).setName("Box 1275")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 1, 3, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.7f, -0.8f, 0, -0.7f, -0.8f, 0, -0.7f, 0.25f, 0, -0.7f, 0.25f)
			.setRotationPoint(-59.1f, -11.7f, 8.75f).setRotationAngle(0, 0, 0).setName("Box 1269")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 134, 1, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0, 0, -0.7f, 0, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0)
			.setRotationPoint(-59.1f, -13.7f, -12).setRotationAngle(0, 0, 0).setName("Box 1270")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0.05f, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-19.1f, -13.7f, 8.72f).setRotationAngle(0, 0, 0).setName("Box 1271")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 1.5f, 0, 0, 1.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.1f, -21, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1438")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.1f, -25.5f, 1.25f).setRotationAngle(-90, 0, 0).setName("Box 1440")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0.1f, -0.03f, -0.5f, 0.1f, -0.03f, -0.5f, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.1f, -25.15f, -3.3f).setRotationAngle(-70, 0, 0).setName("Box 1441")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, -0.55f, -1.9f, -0.5f, -0.55f, -1.9f, -0.5f, -1, 1.1f, 0, -1, 1.1f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.1f, -23.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1442")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, -1, 1.1f, -0.5f, -1, 1.1f, -0.5f, -0.55f, -1.9f, 0, -0.55f, -1.9f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.1f, -23.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1443")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -2, 0, 0, -2, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.1f, -21, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1444")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-14.1f, -16.5f, 10).setRotationAngle(0, 0, 0).setName("Box 1445")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0.1f, -0.03f, -0.5f, 0.1f, -0.03f, -0.5f, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-13.6f, -25.15f, 3.31f).setRotationAngle(-70, 180, 0).setName("Box 1446")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-54.6f, -16.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1464")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0.1f, -0.03f, -0.5f, 0.1f, -0.03f, -0.5f, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-54.6f, -25.15f, -3.3f).setRotationAngle(-70, 0, 0).setName("Box 1465")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 177, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, -0.55f, -1.9f, -0.5f, -0.55f, -1.9f, -0.5f, -1, 1.1f, 0, -1, 1.1f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-54.6f, -23.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1466")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 177, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 1.5f, 0, 0, 1.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-54.6f, -21, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1467")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0.2f, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0.2f, 0, 0, 0.2f, -0.8f, 0.2f, 0, -0.8f, 0.2f, 0, -0.8f, 0, 0.2f, -0.8f, 0)
			.setRotationPoint(-56.1f, -25.7f, -3.4f).setRotationAngle(0, 0, 0).setName("Box 1498")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.94f, -26.4f, -2.220446E-16f).setRotationAngle(0, 0, 0).setName("Part 128")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(10.9f, -27, -2.7f).setRotationAngle(10, 0, 0).setName("Box 585")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(10.9f, -27, -2.7f).setRotationAngle(10, 0, 0).setName("Box 586")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(10.9f, -27, -2.7f).setRotationAngle(10, 0, 0).setName("Box 587")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(10.9f, -27, -2.7f).setRotationAngle(10, 0, 0).setName("Box 588")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 177, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-14.35f, -26.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1521")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(10.9f, -27.2f, 0.2f).setRotationAngle(0, 0, 0).setName("Box 1523")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(10.9f, -27.2f, 0.2f).setRotationAngle(0, 0, 0).setName("Box 1524")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(10.9f, -27.2f, 0.2f).setRotationAngle(0, 0, 0).setName("Box 1525")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(10.9f, -27.2f, 0.2f).setRotationAngle(0, 0, 0).setName("Box 1526")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(10.9f, -27.2f, 1.7f).setRotationAngle(-10, 0, 0).setName("Box 1527")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(10.9f, -27.2f, 1.7f).setRotationAngle(-10, 0, 0).setName("Box 1528")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(10.9f, -27.2f, 1.7f).setRotationAngle(-10, 0, 0).setName("Box 1529")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(10.9f, -27.2f, 1.7f).setRotationAngle(-10, 0, 0).setName("Box 1530")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(10.9f, -27.2f, -1.2f).setRotationAngle(0, 0, 0).setName("Box 1531")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(10.9f, -27.2f, -1.2f).setRotationAngle(0, 0, 0).setName("Box 1532")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(10.9f, -27.2f, -1.2f).setRotationAngle(0, 0, 0).setName("Box 1533")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(10.9f, -27.2f, -1.2f).setRotationAngle(0, 0, 0).setName("Box 1534")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(11.9f, -26.2f, -5.2f).setRotationAngle(0, 0, -60).setName("Box 1537")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(11.9f, -26.2f, -5.2f).setRotationAngle(0, 0, -60).setName("Box 1538")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0)
			.setRotationPoint(11.9f, -26.2f, -5.2f).setRotationAngle(0, 0, -60).setName("Box 1539")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.2f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.2f, 0, -0.125f, -0.2f, -0.125f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.125f, 0, -0.125f)
			.setRotationPoint(11.9f, -26.2f, -5.2f).setRotationAngle(0, 0, -60).setName("Box 1540")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(11.15f, -26.5f, -4.95f).setRotationAngle(0, 0, 0).setName("Box 1541")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(14.4f, -25.5f, -4.85f).setRotationAngle(0, 0, 30).setName("Box 1543")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 185, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 2, 1, 0, -0.125f, -0.2f, -0.125f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, 0, -0.2f, -0.5f, -0.125f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(11.9f, -26.2f, -5.2f).setRotationAngle(0, 0, -60).setName("Box 1544")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(14.15f, -25.5f, -4.95f).setRotationAngle(0, 0, 0).setName("Box 1545")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(63.4f, -25.3f, -5).setRotationAngle(0, 0, 0).setName("Box 1176")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 185, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(64.4f, -25.3f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1177")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65.4f, -25.3f, -5).setRotationAngle(0, 0, 0).setName("Box 1178")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(65.4f, -24.3f, -5).setRotationAngle(0, 0, 0).setName("Box 1179")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(65.4f, -26.3f, -5).setRotationAngle(0, 0, 0).setName("Box 1180")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(63.4f, -26.3f, -5).setRotationAngle(0, 0, 0).setName("Box 1181")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(63.4f, -24.3f, -5).setRotationAngle(0, 0, 0).setName("Box 1182")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(66.4f, -23.8f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1183")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(66.4f, -23.8f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1184")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(63.4f, -23.8f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1185")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 0)
			.setRotationPoint(63.4f, -23.8f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1186")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(63.4f, -26.8f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1187")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, 0.5f, 0, -0.4f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(63.4f, -27.3f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1559")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.2f, -0.5f, 0, -0.2f, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(61.4f, -26.75f, -1.75f).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.2f, 0, 0, -0.2f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.2f, 0, -0.5f, -0.2f)
			.setRotationPoint(61.4f, -26.75f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 742")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(61.4f, -27.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 768")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(61.4f, -27.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 769")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(61.4f, -27.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 770")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(60.65f, -25.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 760")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -1.8f, -0.5f, -0.25f, -0.75f, -0.5f, -0.7f, -0.75f, -0.5f, -0.7f, -1.8f, -0.5f, -0.25f, -2, 0, 0.1f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -2, 0, 0.1f)
			.setRotationPoint(60.15f, -25.75f, -1).setRotationAngle(0, 0, 0).setName("Box 762")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f)
			.setRotationPoint(60.65f, -27.25f, -1).setRotationAngle(0, 0, 0).setName("Box 764")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -1.2f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -1.3f, 0, -0.25f, -0.25f, 0, -0.7f, -0.25f, 0, -0.7f, -1.3f, 0, -0.25f)
			.setRotationPoint(60.65f, -27.25f, -1).setRotationAngle(0, 0, 0).setName("Box 765")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.8f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.25f, 0, -0.7f, -1.3f, 0, -0.25f, -1.3f, 0, -0.25f, -0.25f, 0, -0.7f)
			.setRotationPoint(60.65f, -27.25f, -1).setRotationAngle(0, 0, 0).setName("Box 766")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.75f, -0.5f, -0.7f, -1.8f, -0.5f, -0.25f, -1.8f, -0.5f, -0.25f, -0.75f, -0.5f, -0.7f, -0.4f, 0, -0.5f, -2, 0, 0.1f, -2, 0, 0.1f, -0.4f, 0, -0.5f)
			.setRotationPoint(60.15f, -25.75f, -1).setRotationAngle(0, 0, 0).setName("Box 767")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 209, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 21, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(85.4f, -7.5f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 560")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 217, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 21, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0)
			.setRotationPoint(84.9f, -6.75f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 217, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 21, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(82.9f, -7.5f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 562")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 217, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 21, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(84.9f, -8.25f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 217, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 21, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(82.4f, -8.25f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 564")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 225, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 21, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0)
			.setRotationPoint(82.4f, -6.75f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 565")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, -0.8f, -1, 0, -0.8f, 0, 0, 0, 0, 0, 0, -1, 0, -0.8f, -1, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-61.1f, -18, -2).setRotationAngle(0, 0, 0).setName("Box 1602")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-61.1f, -18, -1).setRotationAngle(0, 0, 0).setName("Box 1603")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -1, 0, 0, -1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -1, 0, 0, -1, 0)
			.setRotationPoint(-61.1f, -18, 1).setRotationAngle(0, 0, 0).setName("Box 1620")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-61, -16, -1).setRotationAngle(0, 0, 0).setName("Box 1621")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
			.setRotationPoint(-61, -17.5f, -1).setRotationAngle(0, 0, 0).setName("Box 1622")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.9f, -18.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 186")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.9f, -14.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 187")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 193, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-59.6f, -20, 8).setRotationAngle(0, 0, 0).setName("Box 1025")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1.35f, -0.35f, -1.05f, -0.35f, -0.35f, -0.85f, -0.35f, -0.35f, -0.35f, -1.35f, -0.35f, -0.35f, -1.35f, -0.35f, -1.05f, -0.35f, -0.35f, -0.85f, -0.35f, -0.35f, -0.55f, -1.35f, -0.35f, -0.55f)
			.setRotationPoint(-60.25f, -19.4f, 6.95f).setRotationAngle(0, 0, 0).setName("Box 1166")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -16.7f, 5).setRotationAngle(0, 0, 0).setName("Box 1650")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -18.5f, 4.1f).setRotationAngle(0, 0, 0).setName("Box 1654")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -20.1f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1657")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -21, 0.75f).setRotationAngle(0, 0, 0).setName("Box 1660")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -14.3f, 5).setRotationAngle(0, 0, 0).setName("Box 1664")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -21, -1.75f).setRotationAngle(0, 0, 0).setName("Box 1665")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -12.5f, 4.1f).setRotationAngle(0, 0, 0).setName("Box 1668")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -11.1f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1669")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -20.1f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1672")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 193, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -18.5f, -4.9f).setRotationAngle(0, 0, 0).setName("Box 1673")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 201, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -16.7f, -6).setRotationAngle(0, 0, 0).setName("Box 1674")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 201, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -14.3f, -6).setRotationAngle(0, 0, 0).setName("Box 1675")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 201, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -12.5f, -4.9f).setRotationAngle(0, 0, 0).setName("Box 1676")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 201, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -11.1f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1677")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 201, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -10, -1.75f).setRotationAngle(0, 0, 0).setName("Box 1678")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 201, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f)
			.setRotationPoint(-60.05f, -10, 0.75f).setRotationAngle(0, 0, 0).setName("Box 1679")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 201, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-59.6f, -20, -9).setRotationAngle(0, 0, 0).setName("Box 1680")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.35f, -0.85f, -1.35f, -0.35f, -1.05f, -1.35f, -0.35f, -0.55f, -0.35f, -0.35f, -0.55f, -0.35f, -0.35f, -0.85f, -1.35f, -0.35f, -1.05f)
			.setRotationPoint(-60.25f, -19.4f, -9.05f).setRotationAngle(0, 0, 0).setName("Box 1681")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 4, 24, 0, 0, 0, -1, 0.3f, 0, -1, 0.3f, 0, -1, 0, 0, -1, 0, 0, -0.5f, 1.7f, 0, -0.5f, 1.7f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(42.4f, -13.25f, -12).setRotationAngle(0, 0, 0).setName("Box 1848")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 34, 4, 22, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 1.3f, 0, 0, 1.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(42.4f, -17.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1850")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 6, 0, 0, 0.75f, -1, -0.5f, 0.75f, -1, -0.5f, 0.75f, -1, 0, 0.75f, -1, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3)
			.setRotationPoint(69.4f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1854")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.2f, 0, 0, 0.2f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.9f, -25.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 454")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(77.15f, -24.6f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 1045")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(77.15f, -18.6f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 1046")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(77.15f, -19.5f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 1047")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(80.15f, -14.25f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1049")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.5f, 0, -0.4f, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.4f, -0.3f, 0, -0.4f)
			.setRotationPoint(80.35f, -14.25f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1055")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.4f, -0.3f, 0, -0.4f)
			.setRotationPoint(80.35f, -13.75f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1056")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0.2f, 0, 0.2f, -0.3f, 0, 0.2f, -0.3f, 0, -0.2f, 0.2f, 0, -0.2f)
			.setRotationPoint(80.15f, -9.25f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1075")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, 0.1f, 0.1f, 0, 0.1f)
			.setRotationPoint(76.9f, -20.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1077")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, 0.1f, 0.1f, 0, 0.1f)
			.setRotationPoint(76.9f, -21.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1078")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0.2f, -0.5f, -0.5f, 0.2f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(76.9f, -25.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1868")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 241, textureX, textureY).addBox(0, 0, 0, 2, 5, 2)
			.setRotationPoint(77.4f, -13.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1869")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 241, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
			.setRotationPoint(78.4f, -12.5f, 8.75f).setRotationAngle(0, 0, 0).setName("Box 1870")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(78.4f, -13.8f, 8).setRotationAngle(0, 40, 0).setName("Box 1871")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(79.4f, -12.8f, 9.75f).setRotationAngle(0, 40, 0).setName("Box 1872")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(77.4f, -14.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1873")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.4f, -13.5f, 8.75f).setRotationAngle(0, 0, 0).setName("Box 1874")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(78.15f, -14.25f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1875")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.5f, 0, -0.4f, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.4f, -0.3f, 0, -0.4f)
			.setRotationPoint(78.35f, -14.25f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1876")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.4f, -0.3f, 0, -0.4f)
			.setRotationPoint(78.35f, -13.75f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1877")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 233, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(76.4f, -16.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1878")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 233, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(76.4f, -16.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1879")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 233, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(76.4f, -16.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1880")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 233, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(75.4f, -20, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1881")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 233, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(76.4f, -19.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1882")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 241, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(76.4f, -17.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1883")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 241, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(76.4f, -17.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1884")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(77.4f, -13.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1885")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(77.4f, -14.5f, -11).setRotationAngle(0, 0, 0).setName("Box 1886")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 9, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(76.91f, -18.5f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 1887")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 233, textureX, textureY).addBox(0, 0, 0, 0, 1, 2)
			.setRotationPoint(77.41f, -16, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1888")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(74.9f, -18.5f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 1889")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(75.4f, -16, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1890")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(73.4f, -24.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1891")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 9, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(75.41f, -24.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1892")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(73.4f, -24.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1893")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 17, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(75.41f, -24.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1894")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(73.4f, -24.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1895")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 17, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(75.41f, -24.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1896")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(73.4f, -24.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1897")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 17, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(75.41f, -24.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1898")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 17, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(79.91f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 1899")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(77.9f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 1900")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 17, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(79.91f, -11.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 1901")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(77.9f, -11.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 1902")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 17, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(79.91f, -12.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1903")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(77.9f, -12.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1904")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(77.9f, -11.5f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 1905")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(79.91f, -11.5f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 1906")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(77.9f, -10.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 1907")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(79.91f, -10.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 1908")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(77.9f, -11.5f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 1909")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(79.91f, -11.5f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 1910")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(78.41f, -13.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1911")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(76.4f, -13.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1912")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 241, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(77.4f, -12.5f, -5.25f).setRotationAngle(0, 0, 0).setName("Box 1913")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.6f, -0.5f, 0, -0.6f, -0.3f, 0, 0, -0.3f, 0, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f)
			.setRotationPoint(78.35f, -13.25f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 1914")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.6f, -0.1f, 0, -0.6f, -0.1f, 0, 0, -0.5f, 0, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.3f, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(78.35f, -13.25f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1915")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 25, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(76.41f, -19.5f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 1916")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(74.4f, -19.5f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 1917")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 33, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(75.96f, -20.75f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 1918")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(73.95f, -20.75f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 1919")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 33, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(75.66f, -22, 3.25f).setRotationAngle(0, 0, 0).setName("Box 1920")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(73.65f, -22, 3.25f).setRotationAngle(0, 0, 0).setName("Box 1921")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(73.4f, -22.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1922")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 41, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(75.41f, -22.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1923")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(73.9f, -21.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1924")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 73, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(75.91f, -21.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1925")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, 0.2f, -0.3f, 0, 0.2f, -0.3f, -0.5f, -0.2f, 0.2f, -0.5f, -0.2f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(77.15f, -25, 8.65f).setRotationAngle(0, 0, 0).setName("Box 1926")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(79.85f, -23.49f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1927")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(73.85f, -24.49f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1930")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f)
			.setRotationPoint(74.4f, -24.99f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1932")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f)
			.setRotationPoint(78.85f, -24.99f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1933")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(74.85f, -23.49f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1934")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(73.85f, -23.49f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1935")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(79.85f, -23.49f, 9.24f).setRotationAngle(0, 0, 0).setName("Box 1936")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(74.85f, -23.49f, 9.24f).setRotationAngle(0, 0, 0).setName("Box 1937")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(73.85f, -23.49f, 9.24f).setRotationAngle(0, 0, 0).setName("Box 1938")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(73.85f, -24.49f, 9.24f).setRotationAngle(0, 0, 0).setName("Box 1939")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f)
			.setRotationPoint(80.86f, -23.99f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1941")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f)
			.setRotationPoint(73.84f, -23.99f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1942")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(77.85f, -10.5f, 12.08f).setRotationAngle(0, 0, 0).setName("Box 1943")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(77.85f, -9.5f, 12.08f).setRotationAngle(0, 0, 0).setName("Box 1944")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(78.85f, -10.5f, 12.08f).setRotationAngle(0, 0, 0).setName("Box 1945")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(77.85f, -10.5f, 11.34f).setRotationAngle(0, 0, 0).setName("Box 1946")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(77.85f, -9.5f, 11.34f).setRotationAngle(0, 0, 0).setName("Box 1947")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(78.85f, -10.5f, 11.34f).setRotationAngle(0, 0, 0).setName("Box 1948")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(81.85f, -10.5f, 11.34f).setRotationAngle(0, 0, 0).setName("Box 1949")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(81.85f, -10.5f, 12.08f).setRotationAngle(0, 0, 0).setName("Box 1950")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f)
			.setRotationPoint(82.86f, -10, 11.34f).setRotationAngle(0, 0, 0).setName("Box 1951")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f)
			.setRotationPoint(80.85f, -9, 11.34f).setRotationAngle(0, 0, 0).setName("Box 1952")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f)
			.setRotationPoint(78.4f, -9, 11.34f).setRotationAngle(0, 0, 0).setName("Box 1953")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f)
			.setRotationPoint(77.84f, -10, 11.34f).setRotationAngle(0, 0, 0).setName("Box 1954")
		);
		groups.add(Main);
	}

	private final void initGroup_Main1(){
		TurboList Main = new TurboList("Main");
		Main.add(new ModelRendererTurbo(Main, 321, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.1f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, 0.1f, 0.1f, 0, 0.1f)
			.setRotationPoint(76.65f, -18.5f, -5).setRotationAngle(0, 0, 0).setName("Box 1955")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 49, textureX, textureY).addBox(0, 0, 0, 2, 3, 3)
			.setRotationPoint(77.4f, -12.5f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 1956")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 49, textureX, textureY).addBox(0, 0, 0, 2, 3, 3)
			.setRotationPoint(77.4f, -12.5f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 1957")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(77.4f, -13.5f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 1958")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(77.4f, -13.5f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 1959")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(77.4f, -14.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 1960")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1, -0.5f, 0, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 1, 0, 0.5f)
			.setRotationPoint(77.4f, -15, -0.25f).setRotationAngle(0, 0, 0).setName("Box 1961")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 249, textureX, textureY)
			.addShapeBox(0, -2, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(79.15f, -14, -4.5f).setRotationAngle(80, 0, 0).setName("Box 1962")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 249, textureX, textureY).addBox(0, 0, 0, 2, 1, 8)
			.setRotationPoint(77.4f, -9.5f, -3.75f).setRotationAngle(0, 0, 0).setName("Box 1963")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(79.4f, -9.25f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 1964")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 23, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0, 0, 0)
			.setRotationPoint(42.4f, -9.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1847")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 249, textureX, textureY)
			.addShapeBox(-1, -1.5f, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(79.15f, -14, -4.5f).setRotationAngle(80, 0, 0).setName("Box 1949")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 249, textureX, textureY)
			.addShapeBox(-1, -2, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(79.15f, -14, -4.5f).setRotationAngle(80, 0, 0).setName("Box 1950")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -15.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1952")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -15.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1953")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -21.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1954")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -20.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1955")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -20.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1956")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -20.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1957")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -20.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1958")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -21.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1959")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 25, 0, 0, 0, -1.75f, -0.5f, 0, -1.75f, -0.5f, 0, -1.75f, 0, 0, -1.75f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -23.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1960")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -3.25f, -0.5f, 0, -3.25f, -0.5f, 0, -3.25f, 0, 0, -3.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -26.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1962")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(87.9f, -26.8f, -3.75f).setRotationAngle(0, 0, 0).setName("Box 1963")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(87.9f, -26.8f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 1965")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(88.4f, -24.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1966")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1.75f, -0.5f, 0, 1.75f, -0.5f, 0, 1.75f, 0, 0, 1.75f)
			.setRotationPoint(88.4f, -25.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1967")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(79.9f, -26.75f, -4.74f).setRotationAngle(0, 0, 0).setName("Box 1971")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(79.9f, -26.75f, 2.99f).setRotationAngle(0, 0, 0).setName("Box 1972")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(78.91f, -26.75f, 4).setRotationAngle(0, 90, 0).setName("Box 1973")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(87.14f, -26.75f, 4).setRotationAngle(0, 90, 0).setName("Box 1974")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 2, 0, 0, -0.15f, -0.7f, 0, -0.15f, -0.7f, 0, -0.15f, -0.3f, 0, -0.15f, -0.3f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.3f, 0, -0.5f, -0.3f)
			.setRotationPoint(71.9f, -26.95f, -1.2f).setRotationAngle(0, 0, 0).setName("Box 1975")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -1, -0.25f, 0, -1, -0.25f)
			.setRotationPoint(88.4f, -21.5f, -9).setRotationAngle(0, 0, 0).setName("Box 1976")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.4f, -21.5f, 7).setRotationAngle(0, 0, 0).setName("Box 1977")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(79.9f, -26.8f, -3.75f).setRotationAngle(0, 0, -7).setName("Box 1979")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(79.9f, -26.8f, 0.75f).setRotationAngle(0, 0, -7).setName("Box 1980")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(86.4f, -20, 12).setRotationAngle(0, 0, 0).setName("Box 1991")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
			.setRotationPoint(79.4f, -16, 12).setRotationAngle(0, 0, 0).setName("Box 1992")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
			.setRotationPoint(79.4f, -20.5f, 12).setRotationAngle(0, 0, 0).setName("Box 1993")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(79.4f, -20, 12).setRotationAngle(0, 0, 0).setName("Box 1994")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(82.65f, -20, 12).setRotationAngle(0, 0, 0).setName("Box 1995")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, 0, -0.25f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(78.4f, -18.65f, 12).setRotationAngle(0, 0, 0).setName("Box 1996")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f)
			.setRotationPoint(84.5f, -20.75f, 12).setRotationAngle(0, 0, 0).setName("Box 1997")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f)
			.setRotationPoint(81, -20.75f, 12).setRotationAngle(0, 0, 0).setName("Box 1998")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(82.9f, -20, -13).setRotationAngle(0, 0, 0).setName("Box 1999")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
			.setRotationPoint(79.4f, -20.5f, -13).setRotationAngle(0, 0, 0).setName("Box 2000")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(86.4f, -20, -13).setRotationAngle(0, 0, 0).setName("Box 2001")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f)
			.setRotationPoint(84.65f, -20.75f, -13).setRotationAngle(0, 0, 0).setName("Box 2002")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, 0, -0.25f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f)
			.setRotationPoint(78.4f, -18.65f, -13).setRotationAngle(0, 0, 0).setName("Box 2003")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f)
			.setRotationPoint(81.15f, -20.75f, -13).setRotationAngle(0, 0, 0).setName("Box 2004")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f)
			.setRotationPoint(79.4f, -20, -13).setRotationAngle(0, 0, 0).setName("Box 2005")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
			.setRotationPoint(79.4f, -16, -13).setRotationAngle(0, 0, 0).setName("Box 2006")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(84.5f, -11.5f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.5f, -12.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(88.37f, -16.25f, 12.25f).setRotationAngle(0, 180, -13).setName("Box 580")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(84.5f, -11.5f, -12.25f).setRotationAngle(0, 0, 0).setName("Box 2014")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.5f, -12.5f, -12.25f).setRotationAngle(0, 0, 0).setName("Box 2015")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(88.37f, -16.25f, -7.25f).setRotationAngle(0, 180, -13).setName("Box 2016")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 273, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 7, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(88.4f, -15.75f, -13.75f).setRotationAngle(0, -90, 0).setName("Box 1459")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 265, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(88.4f, -9.75f, -13.75f).setRotationAngle(0, -90, 0).setName("Box 1461")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 265, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(88.4f, -15.75f, -13.75f).setRotationAngle(0, -90, 0).setName("Box 1462")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 273, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(88.9f, -15.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1466")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(88.4f, -15.75f, -11.22f).setRotationAngle(0, 0, 0).setName("Box 1467")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(88.4f, -9.75f, -11.22f).setRotationAngle(0, 0, 0).setName("Box 1468")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 273, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(88.9f, -15.75f, 10).setRotationAngle(0, 0, 0).setName("Box 2000")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(88.4f, -9.75f, 9.78f).setRotationAngle(0, 0, 0).setName("Box 2001")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(88.4f, -15.75f, 9.78f).setRotationAngle(0, 0, 0).setName("Box 2002")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 273, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(88.4f, -9.75f, 12.25f).setRotationAngle(0, -90, 0).setName("Box 2003")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 273, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(88.4f, -15.75f, 12.25f).setRotationAngle(0, -90, 0).setName("Box 2004")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 273, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(88.4f, -15.75f, 12.75f).setRotationAngle(0, -90, 0).setName("Box 2005")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 25, textureX, textureY).addBox(0, 0, 0, 0, 4, 4)
			.setRotationPoint(-61.12f, -18, -2).setRotationAngle(0, 0, 0).setName("Box 2006")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 281, textureX, textureY).addBox(0, 0, 0, 11, 5, 0)
			.setRotationPoint(76.9f, -14.5f, -12.77f).setRotationAngle(0, 0, 0).setName("Box 2007")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 281, textureX, textureY).addBox(0, 0, 0, 11, 5, 0)
			.setRotationPoint(76.9f, -14.5f, 12.77f).setRotationAngle(0, 0, 0).setName("Box 2008")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(79.4f, -20.5f, -12.75f).setRotationAngle(-45, 0, 0).setName("Box 2015")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(79.4f, -20.5f, 12.75f).setRotationAngle(45, 0, 0).setName("Box 2016")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 4, 16, 0, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 0.625f, 0, 1, 0.625f)
			.setRotationPoint(-58.6f, -14.5f, -8).setRotationAngle(0, 0, 0).setName("Box 2017")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 11, 0, 0, 0.875f, 0.5f, -1, 0.875f, 0.5f, -1, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, -2.25f, 3.125f, -0.05f, -2.25f, 3.125f, -0.05f, -2.25f, 3.125f, 0, -2.25f, 3.125f)
			.setRotationPoint(69.4f, -22.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2017")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 16, 0, 0, 1, 0.625f, -1.05f, 1, 0.625f, -1.05f, 1, 0.625f, 0, 1, 0.625f, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2, 0, -1.75f, 2)
			.setRotationPoint(69.4f, -19.5f, -8).setRotationAngle(0, 0, 0).setName("Box 2018")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.1f, 0.4f, -0.4f, -0.4f, 0.4f, -0.4f, -0.4f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, 0.1f, 0.1f, 0, 0.1f)
			.setRotationPoint(76.65f, -18.5f, 4).setRotationAngle(0, 0, 0).setName("Box 2017")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0.05f, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(63.9f, -16.7f, 7.72f).setRotationAngle(0, 0, 0).setName("Box 2018")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0.05f, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-36.1f, -16.7f, -10.72f).setRotationAngle(0, 0, 0).setName("Box 2021")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0.05f, 0.6f, -0.7f, 0, 0.6f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(63.9f, -16.7f, -10.72f).setRotationAngle(0, 0, 0).setName("Box 2023")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-59.1f, -12, 11.9f).setRotationAngle(0, 0, 0).setName("Box 2028")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-19.2f, -12, 8.71f).setRotationAngle(0, 0, 0).setName("Box 2030")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-19.1f, -14, 8.71f).setRotationAngle(0, 0, 0).setName("Box 2031")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 95, 1, 1, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-19.1f, -14, 11.92f).setRotationAngle(0, 0, 0).setName("Box 2032")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 134, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-59.1f, -14, -12).setRotationAngle(0, 0, 0).setName("Box 2038")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-37.6f, -20, 9.95f).setRotationAngle(0, 0, 0).setName("Box 2026")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 52, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(21.4f, -21, 8.95f).setRotationAngle(0, 0, 0).setName("Box 2027")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.3f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, -1, 0, -0.7f, 0.3f, 0, -0.7f, -0.7f)
			.setRotationPoint(21.4f, -21, 8.95f).setRotationAngle(0, 0, 90).setName("Box 2028")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(21, -20.9f, 9.05f).setRotationAngle(0, 0, 0).setName("Box 2029")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 0.2f, -0.5f, -0.7f, 0.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(21, -19.9f, 10.05f).setRotationAngle(0, 0, 0).setName("Box 2030")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 1.4f, -0.5f, 0.2f, 1.4f, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, -0.7f, 1.2f, -0.5f, -0.7f, 1.2f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-38, -19.9f, 10.05f).setRotationAngle(0, 0, 0).setName("Box 2031")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 281, textureX, textureY)
			.addShapeBox(0, 0, 0.9f, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(21.1f, -21.05f, 8.9f).setRotationAngle(-45, 0, 0).setName("Box 2032")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(15.9f, -10.5f, 10).setRotationAngle(0, 0, 0).setName("Box 1109")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(15.9f, -10.5f, 10).setRotationAngle(0, 0, 0).setName("Box 1110")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 289, textureX, textureY).addBox(0, 0, 0, 5, 1, 2)
			.setRotationPoint(15.9f, -10, 10).setRotationAngle(0, 0, 0).setName("Box 1111")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 289, textureX, textureY)
			.addShapeBox(0, -1, 0, 14, 1, 1, 0, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f)
			.setRotationPoint(7.65f, -9, 10.45f).setRotationAngle(0, 0, 0).setName("Box 1113")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 289, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, -0.675f, -0.175f, 0.1f, -0.675f, -0.175f, 0.1f, -0.675f, -0.175f, 0, -0.675f, -0.175f, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f)
			.setRotationPoint(12.9f, -10, 10.4f).setRotationAngle(0, 0, 0).setName("Box 1114")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 289, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0, -0.675f, -0.175f, 0.1f, -0.675f, -0.175f, 0.1f, -0.675f, -0.175f, 0, -0.675f, -0.175f)
			.setRotationPoint(12.9f, -8, 10.4f).setRotationAngle(0, 0, 0).setName("Box 1115")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 105, textureX, textureY)
			.addShapeBox(0, -1, 0, 0, 2, 1, 0, 0, -0.025f, -0.175f, 0.1f, -0.025f, -0.175f, 0.1f, -0.025f, -0.175f, 0, -0.025f, -0.175f, 0, -0.025f, -0.175f, 0.1f, -0.025f, -0.175f, 0.1f, -0.025f, -0.175f, 0, -0.025f, -0.175f)
			.setRotationPoint(13.65f, -9.5f, 11.46f).setRotationAngle(0, 180, 0).setName("Box 1116")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 52, 1, 1, 0, 3.75f, 0, 0, 0, 0, 0, 0, 0, -0.7f, 3.75f, 0, -0.7f, 4, -0.7f, 0, 0.125f, -0.7f, 0, 0.125f, -0.7f, -0.7f, 4, -0.7f, -0.7f)
			.setRotationPoint(24.4f, -10.75f, 11.25f).setRotationAngle(0, 0, 0).setName("Box 2064")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 289, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(8.6f, -9.5f, 9).setRotationAngle(0, -180, -7).setName("Box 2066")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 289, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0.45f, 0, -0.2f, 0.45f, 0, -0.2f, 0, -0.3f, -0.2f, 0, -0.3f, -0.2f, 0.45f, 0, -0.2f, 0.45f)
			.setRotationPoint(7.65f, -9, 9.2f).setRotationAngle(0, 0, 0).setName("Box 2069")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 289, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0.1f, -0.175f, -0.175f, 0, -0.175f, -0.175f)
			.setRotationPoint(17.9f, -9.5f, 10.2f).setRotationAngle(0, 90, 0).setName("Box 2065")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(77.3f, -12.5f, 2.25f).setRotationAngle(0, 0, 0).setName("Box 2070")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(77.3f, -12.5f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 2071")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, -0.4f, -1, 0, -0.4f, -1, 0, -0.4f, -1, 0, -0.4f, -1, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(77.3f, -13.5f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 2072")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 185, textureX, textureY).addBox(0, 0, 0, 1, 3, 5)
			.setRotationPoint(78.05f, -12.5f, -2.25f).setRotationAngle(0, 0, 0).setName("Box 2073")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 25, 0, -1.5f, 0, -1.75f, -2, 0, -1.75f, -2, 0, -1.75f, -1.5f, 0, -1.75f, -2.05f, 0, 0.05f, -1.55f, 0, 0.05f, -1.55f, 0, 0.05f, -2.05f, 0, 0.05f)
			.setRotationPoint(71.45f, -23.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 974")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 297, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(76.65f, -18.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 2108")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 297, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(76.65f, -18.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 2111")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 1, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.5f, 1, -0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(76.65f, -18.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 2112")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 1, 0, 1, -1.5f, 0, 1, -1.5f, 0, -1.5f, 1, 0, -1.5f, 0, 0.5f, -1, -0.5f, 0.5f, -1, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(77.65f, -16, 1.5f).setRotationAngle(0, 0, 0).setName("Box 2113")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -1, 0.5f, -1, 0.5f, 0.5f, -1, 0.5f, 0.5f, 0.5f, -1, 0.5f, 0.5f)
			.setRotationPoint(77.65f, -13.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 2114")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.65f, -18.5f, 0.5f).setRotationAngle(90, 0, 0).setName("Box 2115")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(78.65f, -11, 3.5f).setRotationAngle(0, 0, 0).setName("Box 2116")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(75.65f, -18.75f, -5).setRotationAngle(90, 0, 0).setName("Box 2117")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, -0.5f, 3, 0, 0, 3, 0, 0, 3, -0.5f, -0.5f, 3, -0.5f, -1.5f, -0.5f, 0, 1, -0.5f, 0, 1, -0.5f, -0.5f, -1.5f, -0.5f, -0.5f)
			.setRotationPoint(74.15f, -20, -0.25f).setRotationAngle(0, 0, 0).setName("Box 2118")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(76.65f, -17.75f, -7).setRotationAngle(90, 0, 0).setName("Box 2119")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, -1, -0.5f, -0.5f)
			.setRotationPoint(75.65f, -17.75f, -6).setRotationAngle(0, 0, 0).setName("Box 2120")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 2, 1.5f, 0, -2.5f, 1.5f, 0, -2.5f, 1.5f, -0.5f, 2, 1.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(76.65f, -21, -4.5f).setRotationAngle(0, 0, 0).setName("Box 2121")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(78.65f, -10.75f, 4).setRotationAngle(90, 0, 0).setName("Box 2123")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(74.15f, -23.5f, 4.5f).setRotationAngle(0, 0, -90).setName("Box 2128")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(74.15f, -23.5f, -4.5f).setRotationAngle(0, 0, -90).setName("Box 2129")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(74.15f, -24, -0.25f).setRotationAngle(0, 0, -90).setName("Box 2130")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 2, 1.5f, 0, -2.5f, 1.5f, 0, -2.5f, 1.5f, -0.5f, 2, 1.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(76.65f, -21, 4.5f).setRotationAngle(0, 0, 0).setName("Box 2131")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, 3, 0, -0.5f, 3, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(78.15f, -11.75f, -8).setRotationAngle(90, 0, 0).setName("Box 2132")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(75.15f, -21, 7.25f).setRotationAngle(0, 0, -90).setName("Box 2135")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(75.65f, -20, 7.25f).setRotationAngle(0, 0, 0).setName("Box 2136")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 1, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.5f, 1, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(76.65f, -17, 7.75f).setRotationAngle(0, 0, 0).setName("Box 2137")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 2, 1.5f, 0, -2.5f, 1.5f, 0, -2.5f, 1.5f, -0.5f, 2, 1.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(77.65f, -16.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 2139")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 1.5f, -1, -0.5f, 1.5f, -1)
			.setRotationPoint(77.65f, -13.75f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 2140")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 129, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(32.9f, -26.3f, 1.96f).setRotationAngle(0, 90, 0).setName("Box 2142")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, 3.5f, -0.5f, 0, 3.5f, -0.5f)
			.setRotationPoint(76.85f, -14, 10.75f).setRotationAngle(0, 0, 0).setName("Box 2144")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(32.9f, -26.3f, 1.95f).setRotationAngle(0, 90, 0).setName("Box 2145")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, 0.875f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, 0.875f, 9.5f)
			.setRotationPoint(-36.6f, -11.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2166")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 6, 0, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, -3.625f, 3, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1, 0, 1.25f, -1)
			.setRotationPoint(-33.6f, -10.5f, -3).setRotationAngle(0, 0, 0).setName("Box 2167")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, -0.2f, -1.5f, 0, -0.2f, 0, 0, 0, 0, 0, 0, -1.5f, 0, -0.2f, -1.5f, 0, -0.2f)
			.setRotationPoint(-45.85f, -27.5f, 2).setRotationAngle(0, 0, 0).setName("Box 2168")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.35f, -27.5f, 1).setRotationAngle(0, 0, 0).setName("Box 2169")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.35f, -27.5f, -1).setRotationAngle(0, 0, 0).setName("Box 2170")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, -1.5f, 0, -0.2f, -1.5f, 0, -0.2f, 0, 0, 0, 0, 0, 0, -1.5f, 0, -0.2f, -1.5f, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.85f, -27.5f, -3).setRotationAngle(0, 0, 0).setName("Box 2171")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.35f, -27.5f, -2).setRotationAngle(0, 0, 0).setName("Box 2172")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 1, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.85f, -25, -2.5f).setRotationAngle(0, 0, 0).setName("Box 2173")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.85f, -25, -1.5f).setRotationAngle(0, 0, 0).setName("Box 2174")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(-46.85f, -25, 1.5f).setRotationAngle(0, 0, 0).setName("Box 2175")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, -0.2f, 0, 0, -0.2f, 0, -1.5f, -0.5f, -0.2f, -1.5f, -0.5f, -0.2f, -0.5f, 0, 0, 0, 0, 0, -1.5f, 0, -0.2f, -2, 0, -0.2f)
			.setRotationPoint(-46.35f, -25, 2.5f).setRotationAngle(0, 0, 0).setName("Box 2176")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -1.5f, -0.5f, -0.2f, -1.5f, -0.5f, -0.2f, 0, -0.2f, 0, 0, -0.2f, 0, -2, 0, -0.2f, -1.5f, 0, -0.2f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.35f, -25, -3.5f).setRotationAngle(0, 0, 0).setName("Box 2177")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 313, textureX, textureY).addBox(0, 0, 0, 9, 4, 4)
			.setRotationPoint(22.15f, -26.5f, -2).setRotationAngle(0, 0, 0).setName("Box 2178")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.15f, -26.5f, -4).setRotationAngle(0, 0, 0).setName("Box 2179")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.65f, -26.5f, -5).setRotationAngle(0, 0, 0).setName("Box 2180")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.65f, -27.5f, -5).setRotationAngle(0, 0, 0).setName("Box 2181")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.15f, -27.5f, -4).setRotationAngle(0, 0, 0).setName("Box 2182")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 4, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.15f, -27.5f, -2).setRotationAngle(0, 0, 0).setName("Box 2183")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(22.15f, -27.5f, 2).setRotationAngle(0, 0, 0).setName("Box 2184")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(22.15f, -26.5f, 2).setRotationAngle(0, 0, 0).setName("Box 2185")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(23.65f, -26.5f, 4).setRotationAngle(0, 0, 0).setName("Box 2186")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(23.65f, -27.5f, 4).setRotationAngle(0, 0, 0).setName("Box 2187")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 33, textureX, textureY).addBox(0, 0, 0, 1, 2, 4)
			.setRotationPoint(41.4f, -26.55f, -2).setRotationAngle(0, 0, 0).setName("Box 2188")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(40.4f, -26.55f, -2).setRotationAngle(0, 0, 0).setName("Box 2189")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(42.4f, -26.55f, -2).setRotationAngle(0, 0, 0).setName("Box 2190")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41.4f, -27.55f, -2).setRotationAngle(0, 0, 0).setName("Box 2191")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -1.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(40.4f, -27.55f, -2).setRotationAngle(0, 0, 0).setName("Box 2192")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(42.4f, -27.55f, -2).setRotationAngle(0, 0, 0).setName("Box 2194")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, -0.125f, 0.5f, 0, 0.875f, 0.5f, 0, 0.875f, 9.5f, 0, -0.125f, 9.5f)
			.setRotationPoint(-39.6f, -11.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1637")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 6, 0, 0, -3.625f, 3, 0, -4.625f, 3, 0, -4.625f, 3, 0, -3.625f, 3, 0, -0.325f, -1, 0, 2.25f, -1, 0, 2.25f, -1, 0, -0.325f, -1)
			.setRotationPoint(-39.6f, -11.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1638")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, 9.5f, 0, -0.125f, 9.5f)
			.setRotationPoint(-58.6f, -11.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1639")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0)
			.setRotationPoint(-1.1f, -6.3f, 8.5f).setRotationAngle(0, 180, -180).setName("Box 1303")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(-1.1f, -5.3f, 8.5f).setRotationAngle(0, 180, -180).setName("Box 1304")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1)
			.setRotationPoint(-1.1f, -7.3f, 8.5f).setRotationAngle(90, 180, -90).setName("Box 1305")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-1.1f, -5.3f, 6.5f).setRotationAngle(0, 180, -180).setName("Box 1306")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 321, textureX, textureY).addBox(0, 0, 0, 1, 3, 18)
			.setRotationPoint(-19.1f, -7.3f, 5.5f).setRotationAngle(90, 0, 90).setName("Box 1311")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-19.1f, -8.3f, 5.5f).setRotationAngle(90, 0, 90).setName("Box 1312")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-19.1f, -6.3f, 5.5f).setRotationAngle(90, 0, 90).setName("Box 1313")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.1f, -7.3f, 5.5f).setRotationAngle(90, 0, 90).setName("Box 1314")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-22.1f, -6.3f, 5.5f).setRotationAngle(90, 0, 90).setName("Box 1315")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-22.1f, -8.3f, 5.5f).setRotationAngle(90, 0, 90).setName("Box 1316")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 17, 0, 1, 0, 0, -1, 0, 0, 1, 2, 0, -1, 2, 0, 1, 0, 0, -1, 0, 0, 1, -2, 0, -1, -2, 0)
			.setRotationPoint(-39.1f, -9.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1665")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 17, 0, 1, -1, 0, -1, 0, 0, 1, 2, 0, -1, 1, 0, 1, -1, 0, -1, 0, 0, 1, -2, 0, -1, -3, 0)
			.setRotationPoint(-39.1f, -10.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1666")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 17, 0, 1, 0, 0, -1, -1, 0, 1, 1, 0, -1, 2, 0, 1, 0, 0, -1, -1, 0, 1, -3, 0, -1, -2, 0)
			.setRotationPoint(-39.1f, -8.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1667")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 321, textureX, textureY).addBox(0, 0, 0, 1, 3, 6)
			.setRotationPoint(-45.1f, -10.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1668")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-45.1f, -11.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1669")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-45.1f, -9.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1670")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-44.6f, -10.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1675")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0)
			.setRotationPoint(-44.6f, -11.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1676")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0)
			.setRotationPoint(-44.6f, -9.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1677")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0)
			.setRotationPoint(-42.6f, -7.3f, 7.5f).setRotationAngle(90, 0, 0).setName("Box 1678")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-43.6f, -7.3f, 7.5f).setRotationAngle(90, 0, 0).setName("Box 1679")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0)
			.setRotationPoint(-44.6f, -7.3f, 7.5f).setRotationAngle(90, 0, 0).setName("Box 1680")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0)
			.setRotationPoint(-1.1f, -6.3f, -5.5f).setRotationAngle(0, 180, -180).setName("Box 1691")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1)
			.setRotationPoint(-1.1f, -7.3f, -5.5f).setRotationAngle(90, 180, -90).setName("Box 1692")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(-1.1f, -5.3f, -5.5f).setRotationAngle(0, 180, -180).setName("Box 1693")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-1.1f, -5.3f, -7.5f).setRotationAngle(0, 180, -180).setName("Box 1694")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-22.1f, -6.3f, -8.5f).setRotationAngle(90, 0, 90).setName("Box 1695")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.1f, -7.3f, -8.5f).setRotationAngle(90, 0, 90).setName("Box 1696")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-22.1f, -8.3f, -8.5f).setRotationAngle(90, 0, 90).setName("Box 1697")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-19.1f, -8.3f, -8.5f).setRotationAngle(90, 0, 90).setName("Box 1698")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 345, textureX, textureY).addBox(0, 0, 0, 1, 3, 18)
			.setRotationPoint(-19.1f, -7.3f, -8.5f).setRotationAngle(90, 0, 90).setName("Box 1699")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-19.1f, -6.3f, -8.5f).setRotationAngle(90, 0, 90).setName("Box 1700")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 17, 0, 1, 0, 0, -1, 0, 0, 1, -2, 0, -1, -2, 0, 1, 0, 0, -1, 0, 0, 1, 2, 0, -1, 2, 0)
			.setRotationPoint(-39.1f, -9.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1701")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 17, 0, 1, -1, 0, -1, 0, 0, 1, -2, 0, -1, -3, 0, 1, -1, 0, -1, 0, 0, 1, 2, 0, -1, 1, 0)
			.setRotationPoint(-39.1f, -10.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1702")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 17, 0, 1, 0, 0, -1, -1, 0, 1, -3, 0, -1, -2, 0, 1, 0, 0, -1, -1, 0, 1, 1, 0, -1, 2, 0)
			.setRotationPoint(-39.1f, -8.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1703")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0)
			.setRotationPoint(-44.6f, -11.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1704")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-44.6f, -10.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1705")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0)
			.setRotationPoint(-44.6f, -9.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1706")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-45.1f, -11.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1707")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 321, textureX, textureY).addBox(0, 0, 0, 1, 3, 6)
			.setRotationPoint(-45.1f, -10.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1708")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-45.1f, -9.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1709")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0)
			.setRotationPoint(-42.6f, -7.3f, -10.5f).setRotationAngle(90, 0, 0).setName("Box 1710")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-43.6f, -7.3f, -10.5f).setRotationAngle(90, 0, 0).setName("Box 1711")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0)
			.setRotationPoint(-44.6f, -7.3f, -10.5f).setRotationAngle(90, 0, 0).setName("Box 1712")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 2, 0, 0, 1, 0.825f, 0, 1, 0.825f, 0, 1, 14.825f, 0, 1, 14.825f, 0, -1.75f, 2.2f, 0, -1.75f, 2.2f, 0, -1.75f, 16.2f, 0, -1.75f, 16.2f)
			.setRotationPoint(21.65f, -19.5f, -8).setRotationAngle(0, 0, 0).setName("Box 1722")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 2, 0, 0, 0.875f, 0.7f, 0, 0.875f, 0.7f, 0, 0.875f, 9.7f, 0, 0.875f, 9.7f, 0, -2.25f, 3.325f, 0, -2.25f, 3.325f, 0, -2.25f, 12.325f, 0, -2.25f, 12.325f)
			.setRotationPoint(21.65f, -22.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1723")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 6, 0, 0, 1.85f, -0.8f, 0, 1.95f, -0.8f, 0, 2.05f, -0.8f, 0, 2.1f, -0.8f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f)
			.setRotationPoint(21.65f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1724")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, 0, 0, -0.7f, 0)
			.setRotationPoint(-60.3f, -11.6f, -12).setRotationAngle(0, 0, 0).setName("Box 1315")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, -1.2f, 0, -0.7f, -1.2f, 0, -0.7f, -1.2f, 0, 0, -1.2f, 0)
			.setRotationPoint(-59.1f, -13.4f, -12).setRotationAngle(0, 0, 0).setName("Box 1316")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.15f, 0.5f, 0, 0.15f, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0.15f, 0.5f, -0.7f, 0.15f, 0.5f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-60.3f, -9.6f, 9.7f).setRotationAngle(0, 0, 0).setName("Box 1635")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0.15f, -0.7f, 0, 0.15f, -0.7f, 0, 0.3f, 0, 0, 0.3f, 0, -1.2f, 0.15f, -0.7f, -1.2f, 0.15f, -0.7f, -1.2f, 0.3f, 0, -1.2f, 0.3f)
			.setRotationPoint(-59.1f, -11.4f, 9.7f).setRotationAngle(0, 0, 0).setName("Box 1636")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22.5f, 0, 0, 22.5f, 0, 0, 0, 0, 0, 0, 0, 0, 22.5f, 0, 0, 22.5f)
			.setRotationPoint(72.4f, -8, -16.75f).setRotationAngle(0, 0, 0).setName("Box 2186")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f)
			.setRotationPoint(42.4f, -4.25f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 2187")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f)
			.setRotationPoint(42.9f, -5, -16.75f).setRotationAngle(0, 0, 0).setName("Box 2188")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f)
			.setRotationPoint(42.4f, -5.75f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 2189")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f)
			.setRotationPoint(58.4f, -5.25f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1641")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f)
			.setRotationPoint(58.9f, -6, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1642")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f)
			.setRotationPoint(58.4f, -6.75f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1643")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f)
			.setRotationPoint(53.9f, -10.5f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1644")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f)
			.setRotationPoint(53.4f, -9.75f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1645")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, -0.25f, -1.125f, -0.25f, -0.25f, -1.125f, -0.25f, 22.25f, -1.125f, -0.25f, 22.25f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f)
			.setRotationPoint(53.4f, -11.25f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1646")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 22.25f, 0, -0.125f, 22.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 22.25f, 0, -0.125f, 22.25f)
			.setRotationPoint(59.9f, -12.5f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1647")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 22.25f, -0.5f, -0.125f, 22.25f, -1.125f, -0.25f, -0.25f, -1.125f, -0.25f, -0.25f, -1.125f, -0.25f, 22.25f, -1.125f, -0.25f, 22.25f)
			.setRotationPoint(59.4f, -11.75f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1648")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, -0.5f, -1.125f, -0.25f, -0.5f, -1.125f, -0.25f, 22, -1.125f, -0.25f, 22, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 22.25f, -0.5f, -0.125f, 22.25f)
			.setRotationPoint(59.4f, -13.25f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1649")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 22.25f, 0, -0.125f, 22.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 22.25f, 0, -0.125f, 22.25f)
			.setRotationPoint(56.9f, -11.5f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1650")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 22.25f, -0.5f, -0.125f, 22.25f, -1.125f, -0.25f, -0.25f, -1.125f, -0.25f, -0.25f, -1.125f, -0.25f, 22.25f, -1.125f, -0.25f, 22.25f)
			.setRotationPoint(56.4f, -10.75f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1651")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, -0.5f, -1.125f, -0.25f, -0.5f, -1.125f, -0.25f, 22, -1.125f, -0.25f, 22, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 22.25f, -0.5f, -0.125f, 22.25f)
			.setRotationPoint(56.4f, -12.25f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1652")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f)
			.setRotationPoint(50.9f, -9.5f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1653")
		);
		Main.add(new ModelRendererTurbo(Main, 409, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f)
			.setRotationPoint(50.4f, -10.25f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1654")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f)
			.setRotationPoint(50.4f, -8.75f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1655")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 2, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 22.5f, 0, -0.125f, 22.5f)
			.setRotationPoint(47.9f, -8.5f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1656")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 345, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f)
			.setRotationPoint(47.4f, -7.75f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1657")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 353, textureX, textureY)
			.addShapeBox(0, 0, 5, 3, 1, 1, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 0, -1.125f, -0.25f, 22.5f, -1.125f, -0.25f, 22.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 22.5f, -0.5f, -0.125f, 22.5f)
			.setRotationPoint(47.4f, -9.25f, -16.75f).setRotationAngle(0, 0, 0).setName("Box 1658")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.1f, -9.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1394")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.1f, -9.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1395")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.6f, -9.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1396")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.6f, -9.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1397")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 353, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-10.1f, -8.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1398")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.1f, -9.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1399")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.1f, -9.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1400")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6f, -9.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1401")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 353, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-14.1f, -8.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1402")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6f, -9.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1403")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.1f, -6.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 2176")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-15.1f, -10.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 2177")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.1f, -10.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 2178")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.1f, -10.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 2179")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-11.1f, -10.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 2180")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.1f, -10.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 2181")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-15.1f, -6.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 2182")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.1f, -6.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 2183")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.1f, -6.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 2184")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-11.1f, -6.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 2185")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.1f, -9.5f, -11).setRotationAngle(0, 0, 0).setName("Box 1681")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.1f, -9.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1682")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.6f, -9.5f, -11).setRotationAngle(0, 0, 0).setName("Box 1683")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.6f, -9.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1684")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 361, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-10.1f, -8.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1685")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.1f, -9.5f, -11).setRotationAngle(0, 0, 0).setName("Box 1686")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.1f, -9.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1687")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6f, -9.5f, -11).setRotationAngle(0, 0, 0).setName("Box 1688")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 361, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-14.1f, -8.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1689")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6f, -9.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1690")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.1f, -6.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1691")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-15.1f, -10.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1692")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.1f, -10.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1693")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.1f, -10.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1694")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-11.1f, -10.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1695")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.1f, -10.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1696")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-15.1f, -6.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1697")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.1f, -6.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1698")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.1f, -6.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1699")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-11.1f, -6.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1700")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.2f, -26.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1701")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.45f, 0, -0.45f, -0.25f, 0, -0.45f, -0.25f, 0, -0.25f, -0.45f, 0, -0.25f, -0.45f, 0, -0.45f, -0.25f, 0, -0.45f, -0.25f, 0, -0.25f, -0.45f, 0, -0.25f)
			.setRotationPoint(-60.05f, -17.5f, 7.15f).setRotationAngle(0, 0, 0).setName("Box 825")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.45f, 0.5f, 0.1f, -0.25f, 0.5f, 0.1f, -0.25f, 0.5f, -0.8f, -0.45f, 0.5f, -0.8f, -0.45f, 0, -0.45f, -0.25f, 0, -0.45f, -0.25f, 0, -0.25f, -0.45f, 0, -0.25f)
			.setRotationPoint(-60.05f, -18.5f, 7.15f).setRotationAngle(0, 0, 0).setName("Box 826")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-59.96f, -19.5f, 6.7f).setRotationAngle(0, 0, 0).setName("Box 1770")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.45f, 0, -0.45f, -0.25f, 0, -0.45f, -0.25f, 0, -0.25f, -0.45f, 0, -0.25f, -0.45f, 0.5f, 0.1f, -0.25f, 0.5f, 0.1f, -0.25f, 0.5f, -0.8f, -0.45f, 0.5f, -0.8f)
			.setRotationPoint(-60.05f, -14.5f, 7.15f).setRotationAngle(0, 0, 0).setName("Box 1771")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-59.96f, -13, 6.7f).setRotationAngle(0, 0, 0).setName("Box 1772")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.45f, 0, -0.45f, -0.25f, 0, -0.45f, -0.25f, 0, -0.25f, -0.45f, 0, -0.25f, -0.45f, 0, -0.45f, -0.25f, 0, -0.45f, -0.25f, 0, -0.25f, -0.45f, 0, -0.25f)
			.setRotationPoint(-60.05f, -17.5f, -8.35f).setRotationAngle(0, 0, 0).setName("Box 1773")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.45f, 0.5f, -0.8f, -0.25f, 0.5f, -0.8f, -0.25f, 0.5f, 0.1f, -0.45f, 0.5f, 0.1f, -0.45f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.45f, -0.45f, 0, -0.45f)
			.setRotationPoint(-60.05f, -18.5f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1775")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.45f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0.5f, -0.8f, -0.25f, 0.5f, -0.8f, -0.25f, 0.5f, 0.1f, -0.45f, 0.5f, 0.1f)
			.setRotationPoint(-60.05f, -14.5f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1776")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-59.96f, -19.5f, -7.7f).setRotationAngle(0, 0, 0).setName("Box 1777")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-59.96f, -13, -7.7f).setRotationAngle(0, 0, 0).setName("Box 1778")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(60.9f, 2.5f, -5).setRotationAngle(0, 0, 0).setName("Box 1805")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.1f, -26.5f, -0.25f).setRotationAngle(-90, 0, 0).setName("Box 1807")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 377, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-13.35f, -26.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1808")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-12.6f, -26.25f, 0.25f).setRotationAngle(-90, 90, 0).setName("Box 1809")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.1f, -10.9f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1694")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.1f, -10.9f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1695")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 1, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-59.1f, -10.9f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1696")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(-59.1f, -10.9f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1697")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59.1f, -10.9f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1698")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-59.1f, -10.9f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1699")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.1f, -11.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1700")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, 0.875f, 0, 0, 0)
			.setRotationPoint(-49.1f, -10.9f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1702")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -1.375f, 0, 0, 0.875f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -1.375f, 0, 0, 0.875f, 0, 0, 0)
			.setRotationPoint(-49.1f, -10.9f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1703")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0.875f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -1.375f, 0, 0, 0.875f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -1.375f)
			.setRotationPoint(-49.1f, -10.9f, -8.63f).setRotationAngle(0, 0, 0).setName("Box 1704")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60.1f, -10.9f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1705")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, -0.5f, -0.5f, -1, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -1)
			.setRotationPoint(-61.1f, -10.9f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1706")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, 0, 0)
			.setRotationPoint(-59.1f, -10.9f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1707")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 6, 0, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, -3.625f, 3.2f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f, 0, 1.45f, -0.8f)
			.setRotationPoint(-3, -10.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1804")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 2, 0, 0, -2.25f, 3.125f, 0, -2.25f, 3.125f, 0, -2.25f, 12.125f, 0, -2.25f, 12.125f, 0, 0.875f, 0.7f, 0, 0.875f, 0.7f, 0, 0.875f, 9.7f, 0, 0.875f, 9.7f)
			.setRotationPoint(-3, -11.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1805")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1)
			.setRotationPoint(-5.6f, -13.5f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 5, 1, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.6f, -15, -11.4f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5.6f, -12.5f, -12.4f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.35f, -15, 10).setRotationAngle(0, 0, 0).setName("Box 1832")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4.35f, -12.5f, 9).setRotationAngle(0, 0, 0).setName("Box 1833")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1)
			.setRotationPoint(-4.35f, -13.5f, 10).setRotationAngle(0, 0, 0).setName("Box 1834")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.4f, -11.5f, -12.4f).setRotationAngle(0, 0, 0).setName("Box 1835")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1)
			.setRotationPoint(16.4f, -12.5f, -11.4f).setRotationAngle(0, 0, 0).setName("Box 1836")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 5, 1, 0, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.4f, -14, -11.4f).setRotationAngle(0, 0, 0).setName("Box 1837")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.1f, -16.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1838")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 40, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-54.1f, -12, -10.5f).setRotationAngle(0, 0, 0).setName("Box 2086")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 50, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-9.1f, -12.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1840")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(38.9f, -10, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1473")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 1, 0, -0.5f, 1, 0, -0.5f, 1, -0.5f, 0, 1, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(40.9f, -10.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1475")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 409, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 2, 0, -0.5f, 2, 0, -0.5f, 2, -0.5f, 0, 2, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.6f, -9.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1843")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 47, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-15.6f, -8, -10.5f).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 45, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(40.9f, -2, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1427")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(85.9f, -1.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1429")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(86.4f, 0, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1431")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 9, 1, 1, 0, 0, 0, 0, 0.5f, -6, 0, 0.5f, -6, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, 5.5f, 0, 0.5f, 5.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(31.4f, -8, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1849")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, -3.25f, 0, 0.5f, -3.25f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, 2.75f, 0, 0.5f, 2.75f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-22.1f, -11.25f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1850")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 31, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-52.6f, -11.25f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1851")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 417, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-53.6f, -10.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1852")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(86.4f, 0, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1841")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(85.9f, -1.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1842")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 45, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(40.9f, -2, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1843")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 35, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-3.6f, -8, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1844")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 9, 1, 1, 0, 0, 0, 0, 0.5f, -6, 0, 0.5f, -6, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, 5.5f, 0, 0.5f, 5.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(31.4f, -8, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1845")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 4, 1, 1, 0, 0.5f, 0, 0.5f, 0.5f, -3.25f, 0, 0.5f, -3.25f, -0.5f, 0.5f, 0, -1, 0.5f, -0.5f, 0.5f, 0.5f, 2.75f, 0, 0.5f, 2.75f, -0.5f, 0.5f, -0.5f, -1)
			.setRotationPoint(-8.1f, -11.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1846")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-13.6f, -11.25f, 10).setRotationAngle(0, 0, 0).setName("Box 1848")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 11, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(76.9f, -7, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1849")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 11, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(76.9f, -6.25f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1850")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 11, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(76.9f, -5.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1851")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, -0.5f, 0, 5, -0.5f, 0, -5.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -5.5f, -0.5f)
			.setRotationPoint(71.9f, -7, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1852")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, -0.5f, 0, 5, -0.5f, 0, -5.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -5.5f, -0.5f)
			.setRotationPoint(71.9f, -6.25f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1853")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, -0.5f, 0, 5, -0.5f, 0, -5.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -5.5f, -0.5f)
			.setRotationPoint(71.9f, -5.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1854")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 433, textureX, textureY)
			.addShapeBox(0, -1, 0, 81, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-9.1f, -12, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1855")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 433, textureX, textureY)
			.addShapeBox(0, -1, 0, 68, 1, 1, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.75f)
			.setRotationPoint(3.9f, -11.25f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1856")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 433, textureX, textureY)
			.addShapeBox(0, -1, 0, 66, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(5.9f, -10.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1857")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 185, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(5.4f, -10.5f, 9).setRotationAngle(0, 0, 0).setName("Box 1858")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 425, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.6f, -11.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1859")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 433, textureX, textureY).addBox(0, 0, 0, 2, 3, 9)
			.setRotationPoint(43.9f, 3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1863")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.45f, 0, -0.45f, -0.25f, 0, -0.45f, -0.25f, 0, -0.25f, -0.45f, 0, -0.25f, -0.45f, -0.75f, -0.45f, -0.25f, -0.75f, -0.45f, -0.25f, -0.75f, -0.25f, -0.45f, -0.75f, -0.25f)
			.setRotationPoint(-61.05f, -20, -2.1f).setRotationAngle(0, 0, 0).setName("Box 1871")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 433, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-57.6f, -19.4f, -7.35f).setRotationAngle(0, 0, 0).setName("Box 1872")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 433, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-57.6f, -12.9f, -7.35f).setRotationAngle(0, 0, 0).setName("Box 1873")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 441, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-57.6f, -12.9f, 7.05f).setRotationAngle(0, 0, 0).setName("Box 1874")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 441, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f)
			.setRotationPoint(-57.6f, -19.4f, 7.05f).setRotationAngle(0, 0, 0).setName("Box 1875")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 441, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-58.6f, -20, -1.9f).setRotationAngle(0, 0, 0).setName("Box 1876")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 441, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f)
			.setRotationPoint(-58.6f, -20, 1.65f).setRotationAngle(0, 0, 0).setName("Box 1877")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(33.9f, -25.75f, -0.25f).setRotationAngle(0, 0, -99).setName("Box 1876")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(33.9f, -25, -0.25f).setRotationAngle(0, 0, -99).setName("Box 1877")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 441, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(4.25f, -4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1886")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 441, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(18.25f, -4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1887")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 441, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(32.25f, -4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1888")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(24.4f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1945")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.4f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1946")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.4f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1947")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(25.4f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1948")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.4f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1949")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.4f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1950")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(11.4f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1951")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(10.4f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1952")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.4f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1953")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39.4f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1954")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(39.4f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1955")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(38.4f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1956")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(34.9f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1959")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1960")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(33.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1961")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(29.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1962")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1963")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(20.9f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1964")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1965")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1966")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(15.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1967")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1968")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(6.9f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1969")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1970")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1971")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(7.2f, -0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1972")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 457, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(7.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1973")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(8.9f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1974")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.9f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1975")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 457, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(8.9f, 5, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1976")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.9f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1977")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(8.9f, 1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1978")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(12.9f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1979")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1980")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.9f, -0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1981")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 457, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(13.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1982")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.9f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1983")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(14.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1984")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(16.65f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1985")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.65f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1986")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 457, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(14.9f, 3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1987")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0)
			.setRotationPoint(17.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1988")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(18.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1989")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.9f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1990")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(20.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1991")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.9f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1992")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 465, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(21.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1993")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.9f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1994")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 457, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(22.9f, 5, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1995")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.9f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1996")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(22.9f, 1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1997")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 457, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(26.9f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1998")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(22.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1999")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(22.9f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2000")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 465, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(27.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2001")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(28.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2002")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.9f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2003")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 465, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(28.9f, 3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2004")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.65f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2005")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(30.65f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2006")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0)
			.setRotationPoint(31.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2007")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(32.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2008")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.9f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2009")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.9f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2010")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(34.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2011")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 465, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(35.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2012")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(36.9f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2013")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(36.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2014")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.9f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2015")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(36.9f, 1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2016")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 465, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(36.9f, 5, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2017")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40.9f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2018")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(40.9f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2019")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 465, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(41.9f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2020")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(42.7f, -0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2021")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 457, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(7.65f, -0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 2022")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 465, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(42.4f, -0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 2023")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 465, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(42.4f, 5.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 2024")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 465, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(7.4f, 4.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 2025")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(22.9f, 1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1859")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(42.7f, -0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1860")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.9f, -0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1861")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 465, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(41.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1862")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(34.9f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1863")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1864")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(33.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1865")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 465, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(35.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1866")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(40.9f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1867")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(36.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1868")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(36.9f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1869")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.9f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1870")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(36.9f, 1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1871")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 465, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40.9f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1872")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 473, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(36.9f, 5, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1873")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.9f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1874")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 473, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(28.9f, 3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1875")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.9f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1876")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(32.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1877")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(34.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1878")
		);
		Main.add(new ModelRendererTurbo(Main, 153, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0)
			.setRotationPoint(31.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1879")
		);
		Main.add(new ModelRendererTurbo(Main, 161, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(30.65f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1880")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.65f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1881")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.9f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1882")
		);
		Main.add(new ModelRendererTurbo(Main, 185, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(28.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1883")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 473, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(27.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1884")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(29.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1885")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1886")
		);
		Main.add(new ModelRendererTurbo(Main, 217, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(20.9f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1887")
		);
		Main.add(new ModelRendererTurbo(Main, 241, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1888")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1889")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 473, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(21.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1890")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 473, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(22.9f, 5, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1891")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.9f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1892")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.9f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1893")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(26.9f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1894")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(22.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1895")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(22.9f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1896")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(20.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1897")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.9f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1898")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.9f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1899")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(18.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1900")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(16.65f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1901")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.65f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1902")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0)
			.setRotationPoint(17.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1903")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(14.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1904")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.9f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1905")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 473, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(14.9f, 3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1906")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 473, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(13.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1907")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1908")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 473, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(12.9f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1909")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(8.9f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1910")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(8.9f, 1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1911")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.9f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1912")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 481, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(8.9f, 5, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1913")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.9f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1914")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(15.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1915")
		);
		groups.add(Main);
	}

	private final void initGroup_Main2(){
		TurboList Main = new TurboList("Main");
		Main.add(new ModelRendererTurbo(Main, 81, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1916")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(6.9f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1917")
		);
		Main.add(new ModelRendererTurbo(Main, 113, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(7.2f, -0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1918")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 481, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(7.9f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1919")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1920")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.9f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1921")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 4, 1, 0, -0.2f, 0, 0, -0.3f, 0, -0.5f, -0.3f, 0, 0.5f, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, -1, -0.5f, -0.3f, -1, 0.5f, -0.2f, 0, 0)
			.setRotationPoint(43.2f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1923")
		);
		Main.add(new ModelRendererTurbo(Main, 177, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 11, 0, 1, 0, -6, 0.5f, 1, -10, 0.5f, 1, 0, 1, 0, -4, 1, 0, -6, 0.5f, -1, -10, 0.5f, -1, 0, 1, 0, -4)
			.setRotationPoint(3.9f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1925")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 11, 0, 1, 1, -6, 0.5f, 4, -10, 0.5f, 4, 0, 1, 1, -4, 1, -1, -6, 0.5f, -4, -10, 0.5f, -4, 0, 1, -1, -4)
			.setRotationPoint(3.9f, 3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1926")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 481, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(4.25f, -4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 1930")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 481, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(18.25f, -4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 1931")
		);
		Main.add(new ModelRendererTurbo(Main, 401, 481, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(32.25f, -4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 1932")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 24, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.35f, -2.5f, -12).setRotationAngle(0, 0, 0).setName("Box 1977")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 23, 0, 0, 0.1f, -0.5f, -0.5f, 0.1f, -0.5f, -0.5f, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-4.35f, -4.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1978")
		);
		Main.add(new ModelRendererTurbo(Main, 121, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 25, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-4.35f, -3.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1979")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-4.6f, -1, -8.95f).setRotationAngle(90, 0, 0).setName("Box 1980")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6f, -5, -11.95f).setRotationAngle(0, 0, 0).setName("Box 1981")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6f, -1, -12.45f).setRotationAngle(90, 0, 0).setName("Box 1982")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4.6f, -4, -11.95f).setRotationAngle(0, 0, 0).setName("Box 1983")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-4.6f, -1.5f, -11.95f).setRotationAngle(0, 0, 0).setName("Box 1984")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f)
			.setRotationPoint(-4.6f, 1, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1985")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 505, textureX, textureY).addBox(0, 0, 0, 9, 4, 4)
			.setRotationPoint(-4.6f, 1, -11.25f).setRotationAngle(0, 0, 0).setName("Box 1986")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f)
			.setRotationPoint(-4.6f, 5, -7.25f).setRotationAngle(-90, 0, 0).setName("Box 1987")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6f, 0, -7.25f).setRotationAngle(-90, 0, 0).setName("Box 1988")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6f, 1, -12.25f).setRotationAngle(0, 0, 0).setName("Box 1989")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6f, -5, 8.45f).setRotationAngle(0, 0, 0).setName("Box 1992")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6f, -1, 7.95f).setRotationAngle(90, 0, 0).setName("Box 1993")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4.6f, -4, 8.45f).setRotationAngle(0, 0, 0).setName("Box 1994")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-4.6f, -1, 11.45f).setRotationAngle(90, 0, 0).setName("Box 1995")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-4.6f, -1.5f, 8.45f).setRotationAngle(0, 0, 0).setName("Box 1996")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6f, 0, 11.25f).setRotationAngle(-90, 0, 0).setName("Box 1997")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6f, 1, 6.25f).setRotationAngle(0, 0, 0).setName("Box 1998")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f)
			.setRotationPoint(-4.6f, 1, 11.25f).setRotationAngle(0, 0, 0).setName("Box 1999")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 513, textureX, textureY).addBox(0, 0, 0, 9, 4, 4)
			.setRotationPoint(-4.6f, 1, 7.25f).setRotationAngle(0, 0, 0).setName("Box 2000")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f)
			.setRotationPoint(-4.6f, 5, 11.25f).setRotationAngle(-90, 0, 0).setName("Box 2001")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 21, 0, 0, -0.3f, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-4.35f, -5.6f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 2004")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 513, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(2.9f, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 2015")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(4.15f, 0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2016")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(4.15f, 4.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2017")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(11.65f, 4.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2018")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f)
			.setRotationPoint(13.9f, 3.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2019")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, -0.25f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.25f, -0.5f, -0.35f)
			.setRotationPoint(13.9f, 2.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2020")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f)
			.setRotationPoint(13.9f, 1.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2021")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(17.9f, 5, -11.4f).setRotationAngle(0, 0, 90).setName("Box 2022")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 489, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(17.9f, 1, -11.4f).setRotationAngle(0, 0, 90).setName("Box 2023")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(17.9f, 0, -11.4f).setRotationAngle(0, 0, 90).setName("Box 2024")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 513, textureX, textureY)
			.addShapeBox(-3, -1, 0, 16, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(23.3f, -1.5f, -9).setRotationAngle(0, -180, -9).setName("Box 2025")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(3.9f, -4, -10.55f).setRotationAngle(0, 0, 0).setName("Box 2026")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 513, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(11.3f, -3.4f, -10.3f).setRotationAngle(0, -180, -8).setName("Box 2027")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 489, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(15.4f, 3, -8.9f).setRotationAngle(0, -180, 0).setName("Box 2028")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(16.9f, -3.5f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 2029")
		);
		Main.add(new ModelRendererTurbo(Main, 105, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17.9f, -2.25f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 2030")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17.9f, -3.5f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 2031")
		);
		Main.add(new ModelRendererTurbo(Main, 169, 521, textureX, textureY).addBox(0, 0, 0, 11, 2, 1)
			.setRotationPoint(19.9f, -3.5f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 2032")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 489, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(25.8f, -5, -10.3f).setRotationAngle(0, 0, 90).setName("Box 2033")
		);
		Main.add(new ModelRendererTurbo(Main, 137, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(25.8f, -3, -10.3f).setRotationAngle(0, 0, 0).setName("Box 2034")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 497, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(25.8f, -2.4f, -10.1f).setRotationAngle(0, -180, -10).setName("Box 2035")
		);
		Main.add(new ModelRendererTurbo(Main, 385, 513, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(27.8f, -8, -10.1f).setRotationAngle(0, -180, -9).setName("Box 2036")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 521, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 8, 1, 1, 0, -0.25f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(28.8f, -6.2f, -10.6f).setRotationAngle(0, 0, 0).setName("Box 2037")
		);
		Main.add(new ModelRendererTurbo(Main, 393, 513, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(35.05f, -8, -10.1f).setRotationAngle(0, -180, -9).setName("Box 2038")
		);
		Main.add(new ModelRendererTurbo(Main, 201, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(30.9f, -3.5f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 2040")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 521, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(2.9f, 2.5f, 8).setRotationAngle(0, 0, 0).setName("Box 2041")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(11.65f, 0.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2042")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(4.15f, 0.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2043")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(4.15f, 4.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2044")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(11.65f, 4.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2045")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f)
			.setRotationPoint(13.9f, 3.25f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2046")
		);
		Main.add(new ModelRendererTurbo(Main, 129, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, -0.25f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.25f, -0.5f, -0.35f)
			.setRotationPoint(13.9f, 2.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2047")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f)
			.setRotationPoint(13.9f, 1.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2048")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 529, textureX, textureY)
			.addShapeBox(1, -1, 0, 6, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(16.4f, 3, 9.9f).setRotationAngle(0, -180, 0).setName("Box 2049")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 521, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(11.3f, -3.4f, 9.3f).setRotationAngle(0, -180, -8).setName("Box 2050")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 529, textureX, textureY)
			.addShapeBox(-3, -1, 0, 16, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(23.25f, -1.5f, 10).setRotationAngle(0, -180, -9).setName("Box 2051")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(3.9f, -4, 9.55f).setRotationAngle(0, 0, 0).setName("Box 2052")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 529, textureX, textureY).addBox(0, 0, 0, 11, 2, 1)
			.setRotationPoint(19.9f, -3.5f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 2053")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17.9f, -3.5f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 2054")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17.9f, -2.25f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 2055")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(16.9f, -3.5f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 2056")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(17.9f, 0, 8.4f).setRotationAngle(0, 0, 90).setName("Box 2057")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 497, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(17.9f, 1, 10.4f).setRotationAngle(0, 0, 90).setName("Box 2058")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(17.9f, 5, 8.4f).setRotationAngle(0, 0, 90).setName("Box 2059")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 529, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(25.8f, -5, 9.3f).setRotationAngle(0, 0, 90).setName("Box 2060")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 521, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(25.8f, -3, 9.3f).setRotationAngle(0, 0, 0).setName("Box 2061")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 529, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 8, 1, 1, 0, -0.25f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(28.75f, -6.2f, 9.6f).setRotationAngle(0, 0, 0).setName("Box 2062")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 529, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(27.75f, -8, 9.1f).setRotationAngle(0, -180, -9).setName("Box 2063")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 529, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(35, -8, 9.1f).setRotationAngle(0, -180, -9).setName("Box 2064")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 529, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 20, 1, 1, 0, -0.25f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(34.05f, -2.8f, 8.3f).setRotationAngle(0, 90, 0).setName("Box 2065")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(30.9f, -3.5f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 2066")
		);
		Main.add(new ModelRendererTurbo(Main, 417, 529, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(25.75f, -2.4f, 9.1f).setRotationAngle(0, -180, -10).setName("Box 2067")
		);
		Main.add(new ModelRendererTurbo(Main, 425, 529, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-1.6f, -2.25f, -12.02f).setRotationAngle(0, 0, 0).setName("Box 2068")
		);
		Main.add(new ModelRendererTurbo(Main, 433, 529, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-1.6f, -2.25f, 12.02f).setRotationAngle(0, 0, 0).setName("Box 2069")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(11.65f, 0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2083")
		);
		Main.add(new ModelRendererTurbo(Main, 225, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(24.9f, 8.25f, -6.9f).setRotationAngle(0, 0, -90).setName("Box 2088")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(23.65f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2089")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(24.65f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2090")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(26.15f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2091")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(21.4f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2092")
		);
		Main.add(new ModelRendererTurbo(Main, 193, 513, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(22.4f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2093")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(23.9f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2094")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(22.65f, 8.25f, -6.9f).setRotationAngle(0, 0, -90).setName("Box 2095")
		);
		Main.add(new ModelRendererTurbo(Main, 489, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(9.65f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2096")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(10.65f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2097")
		);
		Main.add(new ModelRendererTurbo(Main, 505, 529, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(12.15f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2098")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(10.9f, 8.25f, -6.9f).setRotationAngle(0, 0, -90).setName("Box 2099")
		);
		Main.add(new ModelRendererTurbo(Main, 9, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(37.65f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2100")
		);
		Main.add(new ModelRendererTurbo(Main, 17, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(38.9f, 8.25f, -6.9f).setRotationAngle(0, 0, -90).setName("Box 2101")
		);
		Main.add(new ModelRendererTurbo(Main, 25, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.65f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2102")
		);
		Main.add(new ModelRendererTurbo(Main, 33, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(40.15f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2103")
		);
		Main.add(new ModelRendererTurbo(Main, 497, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(38.4f, 6, -9.5f).setRotationAngle(0, 0, 0).setName("Box 2104")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(40.15f, 6, -10.1f).setRotationAngle(0, 0, 0).setName("Box 2105")
		);
		Main.add(new ModelRendererTurbo(Main, 49, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.65f, 5, -10.1f).setRotationAngle(0, 0, 0).setName("Box 2106")
		);
		Main.add(new ModelRendererTurbo(Main, 57, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(37.65f, 6, -10.1f).setRotationAngle(0, 0, 0).setName("Box 2107")
		);
		Main.add(new ModelRendererTurbo(Main, 65, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(38.9f, 8.25f, -10.1f).setRotationAngle(0, 0, -90).setName("Box 2108")
		);
		Main.add(new ModelRendererTurbo(Main, 73, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.9f, 4.25f, -10.1f).setRotationAngle(0, 0, -90).setName("Box 2109")
		);
		Main.add(new ModelRendererTurbo(Main, 81, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.15f, 0, -1, -0.15f)
			.setRotationPoint(39.15f, 5, -10.7f).setRotationAngle(0, 0, 0).setName("Box 2110")
		);
		Main.add(new ModelRendererTurbo(Main, 89, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(15.9f, 2.5f, -9).setRotationAngle(0, 0, 8.4f).setName("Box 2112")
		);
		Main.add(new ModelRendererTurbo(Main, 145, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(11.9f, 6, -6.8f).setRotationAngle(0, 0, 0).setName("Box 2113")
		);
		Main.add(new ModelRendererTurbo(Main, 209, 537, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 15, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(26.55f, 1, -10.6f).setRotationAngle(0, 0, 15.4f).setName("Box 2114")
		);
		Main.add(new ModelRendererTurbo(Main, 249, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(24.9f, 8.25f, 5.8f).setRotationAngle(0, 0, -90).setName("Box 2115")
		);
		Main.add(new ModelRendererTurbo(Main, 257, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(26.15f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2116")
		);
		Main.add(new ModelRendererTurbo(Main, 265, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(24.65f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2117")
		);
		Main.add(new ModelRendererTurbo(Main, 273, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(23.65f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2118")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(23.9f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2119")
		);
		Main.add(new ModelRendererTurbo(Main, 289, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(22.4f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2120")
		);
		Main.add(new ModelRendererTurbo(Main, 297, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(21.4f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2121")
		);
		Main.add(new ModelRendererTurbo(Main, 305, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(22.65f, 8.25f, 5.8f).setRotationAngle(0, 0, -90).setName("Box 2122")
		);
		Main.add(new ModelRendererTurbo(Main, 313, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(12.15f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2123")
		);
		Main.add(new ModelRendererTurbo(Main, 321, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(9.65f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2124")
		);
		Main.add(new ModelRendererTurbo(Main, 329, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(10.65f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2125")
		);
		Main.add(new ModelRendererTurbo(Main, 337, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(10.9f, 8.25f, 5.8f).setRotationAngle(0, 0, -90).setName("Box 2126")
		);
		Main.add(new ModelRendererTurbo(Main, 345, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(37.65f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2127")
		);
		Main.add(new ModelRendererTurbo(Main, 353, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.65f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2128")
		);
		Main.add(new ModelRendererTurbo(Main, 361, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(40.15f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2129")
		);
		Main.add(new ModelRendererTurbo(Main, 369, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(38.9f, 8.25f, 5.8f).setRotationAngle(0, 0, -90).setName("Box 2130")
		);
		Main.add(new ModelRendererTurbo(Main, 377, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(11.9f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 2131")
		);
		Main.add(new ModelRendererTurbo(Main, 233, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(38.4f, 6, 6.5f).setRotationAngle(0, 0, 0).setName("Box 2132")
		);
		Main.add(new ModelRendererTurbo(Main, 441, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(40.15f, 6, 9.1f).setRotationAngle(0, 0, 0).setName("Box 2133")
		);
		Main.add(new ModelRendererTurbo(Main, 449, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(37.65f, 6, 9.1f).setRotationAngle(0, 0, 0).setName("Box 2134")
		);
		Main.add(new ModelRendererTurbo(Main, 457, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(38.9f, 8.25f, 9.1f).setRotationAngle(0, 0, -90).setName("Box 2135")
		);
		Main.add(new ModelRendererTurbo(Main, 465, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.65f, 5, 9.1f).setRotationAngle(0, 0, 0).setName("Box 2136")
		);
		Main.add(new ModelRendererTurbo(Main, 473, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(38.9f, 4.25f, 9.1f).setRotationAngle(0, 0, -90).setName("Box 2137")
		);
		Main.add(new ModelRendererTurbo(Main, 1, 545, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 15, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(26.55f, 1, 9.6f).setRotationAngle(0, 0, 15.4f).setName("Box 2138")
		);
		Main.add(new ModelRendererTurbo(Main, 481, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.15f, 0, -1, -0.15f)
			.setRotationPoint(39.15f, 5, 9.7f).setRotationAngle(0, 0, 0).setName("Box 2139")
		);
		Main.add(new ModelRendererTurbo(Main, 41, 545, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(15.9f, 2.5f, 8).setRotationAngle(0, 0, 8.4f).setName("Box 2140")
		);
		Main.add(new ModelRendererTurbo(Main, 97, 545, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 4, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0.5f, -0.3f, 0, -0.5f, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, -1, 0.5f, -0.3f, -1, -0.5f, -0.2f, 0, 0)
			.setRotationPoint(43.2f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1900")
		);
		Main.add(new ModelRendererTurbo(Main, 281, 381, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-45, -17, 10.02f).setRotationAngle(0, 0, 0).setName("Box 1900")
		);
		groups.add(Main);
	}

	ModelNWClassARearBogie bogie = new ModelNWClassARearBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
	}
}
