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
public class ModelGEU18B extends FVTMFormatBase {

	public ModelGEU18B(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("Riggs64");
		//
		initGroup_group00();
		initGroup_group01();
		initGroup_clipboard();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group00(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 432, 86, textureX, textureY).addBox(0, 0, 0, 4, 3, 3)
			.setRotationPoint(-60.375f, 2.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, -2, 102, 3, 20)
			.setRotationPoint(-50.875f, -2.75f, -8).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 23, textureX, textureY).addBox(0, 0, -2, 102, 4, 1)
			.setRotationPoint(-50.875f, -2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 17, textureX, textureY).addBox(0, 0, -2, 102, 4, 1)
			.setRotationPoint(-50.875f, -2.75f, 12).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		group0.add(new ModelRendererTurbo(group0, 469, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.375f, -11.75f, -11).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.375f, -18.75f, -11).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 240, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-39.375f, -16.75f, -11).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-35.875f, -16.75f, -11).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 85, textureX, textureY).addBox(0, 0, 0, 15, 1, 6)
			.setRotationPoint(-43.375f, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-43.375f, -21, -7.5f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 5, 0, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-43.375f, -21, 2.5f).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 10, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.375f, -12.25f, -6).setRotationAngle(0, 0, 0).setName("Box 193")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 12, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.375f, -13.25f, -6).setRotationAngle(0, 0, 0).setName("Box 194")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, -0.25f, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, 0.75f, 0, 0.5f)
			.setRotationPoint(-51.375f, -12.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 196")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f)
			.setRotationPoint(-51.375f, -12.25f, -6).setRotationAngle(0, 0, 0).setName("Box 197")
		);
		group0.add(new ModelRendererTurbo(group0, 150, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.375f, -12.25f, 5).setRotationAngle(0, 0, 0).setName("Box 198")
		);
		group0.add(new ModelRendererTurbo(group0, 394, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-51.875f, -13, -1).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 128, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, -0.25f, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-51.375f, -13, -6).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		group0.add(new ModelRendererTurbo(group0, 118, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(-51.375f, -13, 5).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.8f, -0.85f, 0, -0.8f, -0.85f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.875f, -13.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1022")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.05f, -0.85f, 0, -0.75f, -1, 0, -0.75f, -1, -0.5f, 0.05f, -0.85f, -0.5f, 0.05f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.05f, 0, -0.5f)
			.setRotationPoint(-41.625f, -13.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1023")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.85f, 0, -0.8f, -0.85f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-41.875f, -16.25f, -11).setRotationAngle(0, 0, 0).setName("Box 286")
		);
		group0.add(new ModelRendererTurbo(group0, 28, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.05f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.05f, 0, -0.5f, 0.05f, -0.85f, 0, -0.75f, -1, 0, -0.75f, -1, -0.5f, 0.05f, -0.85f, -0.5f)
			.setRotationPoint(-41.625f, -16.25f, -11).setRotationAngle(0, 0, 0).setName("Box 287")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.85f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8f, -0.85f, -0.5f)
			.setRotationPoint(-40.375f, -16.25f, -11).setRotationAngle(0, 0, 0).setName("Box 288")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0.05f, 0, 0, 0.05f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -1, 0, 0.05f, -0.85f, 0, 0.05f, -0.85f, -0.5f, -0.75f, -1, -0.5f)
			.setRotationPoint(-40.625f, -16.25f, -11).setRotationAngle(0, 0, 0).setName("Box 289")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.85f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8f, -0.85f, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(-40.375f, -13.25f, -11).setRotationAngle(0, 0, 0).setName("Box 290")
		);
		group0.add(new ModelRendererTurbo(group0, 376, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0.05f, -0.85f, 0, 0.05f, -0.85f, -0.5f, -0.75f, -1, -0.5f, -0.75f, 0, 0, 0.05f, 0, 0, 0.05f, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-40.625f, -13.25f, -11).setRotationAngle(0, 0, 0).setName("Box 291")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -18.75f, 10).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 29, textureX, textureY)
			.addBox(0, 0, 0, 50, 18, 12)
			.setRotationPoint(-28.375f, -20, -6).setRotationAngle(0, 0, 0).setName("Box 327")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 1, 12, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.375f, -21, -6).setRotationAngle(0, 0, 0).setName("Box 331")
		);
		group0.add(new ModelRendererTurbo(group0, 104, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f)
			.setRotationPoint(-57.875f, 2, -2.5f).setRotationAngle(0, 0, 0).setName("Box 964")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f)
			.setRotationPoint(-57.875f, 5.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 965")
		);
		group0.add(new ModelRendererTurbo(group0, 371, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-57.625f, 2.25f, -2).setRotationAngle(0, 0, 0).setName("Box 966")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-57.625f, 2.25f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 967")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 85, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, -2.75f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 734")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 101, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, 6.25f, -9).setRotationAngle(0, 0, 0).setName("Box 952")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 101, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 953")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 100, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, 0.25f, -8).setRotationAngle(0, 0, 0).setName("Box 954")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, 5.75f, -10).setRotationAngle(0, 0, 0).setName("Box 1324")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, 2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 1325")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, -0.25f, -9).setRotationAngle(0, 0, 0).setName("Box 1326")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 100, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, 6.25f, 11).setRotationAngle(0, 0, 0).setName("Box 1329")
		);
		group0.add(new ModelRendererTurbo(group0, 246, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-55.875f, 5.75f, 9).setRotationAngle(0, 0, 0).setName("Box 1330")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 99, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, 3.25f, 10).setRotationAngle(0, 0, 0).setName("Box 1331")
		);
		group0.add(new ModelRendererTurbo(group0, 232, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-55.875f, 2.75f, 8).setRotationAngle(0, 0, 0).setName("Box 1332")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 99, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.875f, 0.25f, 10).setRotationAngle(0, 0, 0).setName("Box 1333")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-55.875f, -0.25f, 8).setRotationAngle(0, 0, 0).setName("Box 1334")
		);
		group0.add(new ModelRendererTurbo(group0, 407, 86, textureX, textureY).addBox(0, 0, -2, 1, 11, 22)
			.setRotationPoint(-51.875f, -2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 106, textureX, textureY).addBox(0, 0, -2, 1, 11, 20)
			.setRotationPoint(-56.875f, -2.75f, -8).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 154, textureX, textureY).addBox(0, 0, -2, 1, 8, 1)
			.setRotationPoint(-56.875f, -0.75f, -9).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.85f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8f, -0.85f, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(-30.875f, -13.25f, -11).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		group0.add(new ModelRendererTurbo(group0, 283, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.8f, -0.85f, 0, -0.8f, -0.85f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.375f, -13.25f, -11).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.05f, -0.85f, 0, -0.75f, -1, 0, -0.75f, -1, -0.5f, 0.05f, -0.85f, -0.5f, 0.05f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.05f, 0, -0.5f)
			.setRotationPoint(-32.125f, -13.25f, -11).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 267, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0.05f, -0.85f, 0, 0.05f, -0.85f, -0.5f, -0.75f, -1, -0.5f, -0.75f, 0, 0, 0.05f, 0, 0, 0.05f, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-31.125f, -13.25f, -11).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 258, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.85f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8f, -0.85f, -0.5f)
			.setRotationPoint(-30.875f, -16.25f, -11).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 250, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0.05f, 0, 0, 0.05f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -1, 0, 0.05f, -0.85f, 0, 0.05f, -0.85f, -0.5f, -0.75f, -1, -0.5f)
			.setRotationPoint(-31.125f, -16.25f, -11).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 235, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.05f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.05f, 0, -0.5f, 0.05f, -0.85f, 0, -0.75f, -1, 0, -0.75f, -1, -0.5f, 0.05f, -0.85f, -0.5f)
			.setRotationPoint(-32.125f, -16.25f, -11).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.85f, 0, -0.8f, -0.85f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-32.375f, -16.25f, -11).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.375f, -16.75f, -11).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-29.375f, -16.75f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-35.875f, -16.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.375f, -16.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		group0.add(new ModelRendererTurbo(group0, 98, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.05f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.05f, 0, -0.5f, 0.05f, -0.85f, 0, -0.75f, -1, 0, -0.75f, -1, -0.5f, 0.05f, -0.85f, -0.5f)
			.setRotationPoint(-41.625f, -16.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		group0.add(new ModelRendererTurbo(group0, 93, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.85f, 0, -0.8f, -0.85f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-41.875f, -16.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0.05f, 0, 0, 0.05f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -1, 0, 0.05f, -0.85f, 0, 0.05f, -0.85f, -0.5f, -0.75f, -1, -0.5f)
			.setRotationPoint(-40.625f, -16.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.85f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8f, -0.85f, -0.5f)
			.setRotationPoint(-40.375f, -16.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.8f, -0.85f, 0, -0.8f, -0.85f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.875f, -13.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.05f, -0.85f, 0, -0.75f, -1, 0, -0.75f, -1, -0.5f, 0.05f, -0.85f, -0.5f, 0.05f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.05f, 0, -0.5f)
			.setRotationPoint(-41.625f, -13.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0.05f, -0.85f, 0, 0.05f, -0.85f, -0.5f, -0.75f, -1, -0.5f, -0.75f, 0, 0, 0.05f, 0, 0, 0.05f, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-40.625f, -13.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.85f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8f, -0.85f, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(-40.375f, -13.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.05f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.05f, 0, -0.5f, 0.05f, -0.85f, 0, -0.75f, -1, 0, -0.75f, -1, -0.5f, 0.05f, -0.85f, -0.5f)
			.setRotationPoint(-32.125f, -16.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 484, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.8f, -0.85f, 0, -0.8f, -0.85f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-32.375f, -16.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		group0.add(new ModelRendererTurbo(group0, 429, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0.05f, 0, 0, 0.05f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -1, 0, 0.05f, -0.85f, 0, 0.05f, -0.85f, -0.5f, -0.75f, -1, -0.5f)
			.setRotationPoint(-31.125f, -16.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		group0.add(new ModelRendererTurbo(group0, 424, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, -0.85f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8f, -0.85f, -0.5f)
			.setRotationPoint(-30.875f, -16.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		group0.add(new ModelRendererTurbo(group0, 419, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1, 0, 0.05f, -0.85f, 0, 0.05f, -0.85f, -0.5f, -0.75f, -1, -0.5f, -0.75f, 0, 0, 0.05f, 0, 0, 0.05f, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-31.125f, -13.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 141")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, -0.85f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.8f, -0.85f, -0.5f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f)
			.setRotationPoint(-30.875f, -13.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.8f, -0.85f, 0, -0.8f, -0.85f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.375f, -13.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.05f, -0.85f, 0, -0.75f, -1, 0, -0.75f, -1, -0.5f, 0.05f, -0.85f, -0.5f, 0.05f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.05f, 0, -0.5f)
			.setRotationPoint(-32.125f, -13.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-29.375f, -16.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		group0.add(new ModelRendererTurbo(group0, 478, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.375f, -11.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 85, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 7, 22, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.875f, 1.25f, -9).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 105, textureX, textureY).addBox(0, 0, -2, 1, 1, 20)
			.setRotationPoint(-50.375f, 0.25f, -8).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, -0.25f, -9).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 98, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, 0.25f, -8).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, 2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 98, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, 3.25f, -8).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, 5.75f, -10).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		group0.add(new ModelRendererTurbo(group0, 302, 98, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, 6.25f, -9).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(52.125f, -0.25f, 8).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 97, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, 0.25f, 10).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(52.125f, 2.75f, 8).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 97, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, 3.25f, 10).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 464, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(52.125f, 5.75f, 9).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 93, 70, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, 6.25f, 11).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 104, textureX, textureY).addBox(0, 0, -2, 1, 11, 20)
			.setRotationPoint(56.125f, -2.75f, -8).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 85, textureX, textureY).addBox(0, 0, -2, 1, 11, 22)
			.setRotationPoint(51.125f, -2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 39, textureX, textureY)
			.addShapeBox(0, 0, -2, 4, 1, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.125f, -2.75f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 183")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-43.375f, -16.5f, -9.25f).setRotationAngle(0, 0, 0).setName("Box 1029")
		);
		group0.add(new ModelRendererTurbo(group0, 160, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f)
			.setRotationPoint(-43.375f, -16.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1030")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 21, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -10.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -16.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-43.375f, -13.75f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		group0.add(new ModelRendererTurbo(group0, 484, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -17.75f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -17.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-43.375f, -17.75f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 4, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-43.375f, -16.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f)
			.setRotationPoint(-43.375f, -16.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		group0.add(new ModelRendererTurbo(group0, 320, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -12.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f)
			.setRotationPoint(-43.375f, -12.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-43.375f, -12.5f, -9.25f).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(-43.375f, -12.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		group0.add(new ModelRendererTurbo(group0, 240, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-43.375f, -14.75f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(-43.375f, -14.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -14.75f, 3.75f).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f)
			.setRotationPoint(-43.375f, -14.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-43.375f, -17.75f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 221")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f)
			.setRotationPoint(-43.375f, -17.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f)
			.setRotationPoint(-43.375f, -17.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		group0.add(new ModelRendererTurbo(group0, 381, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-43.375f, -17.75f, 3.75f).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		group0.add(new ModelRendererTurbo(group0, 376, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -12.5f, 9).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		group0.add(new ModelRendererTurbo(group0, 371, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(-43.375f, -12.5f, 7).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-43.375f, -12.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f)
			.setRotationPoint(-43.375f, -12.5f, 8.75f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		group0.add(new ModelRendererTurbo(group0, 283, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-43.375f, -16.5f, 9).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f)
			.setRotationPoint(-43.375f, -16.5f, 8.75f).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		group0.add(new ModelRendererTurbo(group0, 124, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-43.375f, -16.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 231")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f)
			.setRotationPoint(-43.375f, -16.5f, 7).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -17.75f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 324")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.375f, -16.75f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		group0.add(new ModelRendererTurbo(group0, 98, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.875f, -11, -8.25f).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		group0.add(new ModelRendererTurbo(group0, 93, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.875f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.875f, -8.5f, -11).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.875f, -13, -11).setRotationAngle(0, 0, 0).setName("Box 1465")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -14.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 248")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f)
			.setRotationPoint(-43.375f, -14.75f, -1.75f).setRotationAngle(0, 0, 0).setName("Box 249")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(-43.375f, -14.75f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 250")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-43.375f, -14.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 251")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f)
			.setRotationPoint(-43.375f, -17.75f, -1.75f).setRotationAngle(0, 0, 0).setName("Box 252")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-43.375f, -17.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		group0.add(new ModelRendererTurbo(group0, 484, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-43.375f, -17.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 254")
		);
		group0.add(new ModelRendererTurbo(group0, 430, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f)
			.setRotationPoint(-43.375f, -17.75f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.375f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.375f, -13, -11).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.375f, -11, -8.25f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.375f, -8.5f, -11).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.324997f, -9.549999f, -2).setRotationAngle(0, 0, 0).setName("Box 945")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.324997f, -8.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		group0.add(new ModelRendererTurbo(group0, 160, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-43.324997f, -10.74f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 947")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 105, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(-43.775f, -13, -4.75f).setRotationAngle(0, 0, 0).setName("Box 948")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 108, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
			.setRotationPoint(-43.775f, -11, -4.75f).setRotationAngle(0, 0, 0).setName("Box 944")
		);
		group0.add(new ModelRendererTurbo(group0, 213, 77, textureX, textureY).addBox(0, 0, -2, 4, 3, 22)
			.setRotationPoint(-47.375f, -5.75f, -9).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 69, textureX, textureY).addBox(0, 0, -2, 15, 3, 21)
			.setRotationPoint(-43.375f, -5.75f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		group0.add(new ModelRendererTurbo(group0, 478, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.375f, -17.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 321")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.375f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 322")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 78, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 7, 22, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(50.125f, 1.25f, -9).setRotationAngle(0, 0, 0).setName("Box 325")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 78, textureX, textureY).addBox(0, 0, -2, 1, 1, 20)
			.setRotationPoint(49.625f, 0.25f, -8).setRotationAngle(0, 0, 0).setName("Box 326")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 64, textureX, textureY).addBox(0, 0, -2, 18, 3, 22)
			.setRotationPoint(-28.375f, -5.75f, -9).setRotationAngle(0, 0, 0).setName("Box 327")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 78, textureX, textureY).addBox(0, 0, -2, 2, 2, 22)
			.setRotationPoint(-10.375f, -4.75f, -9).setRotationAngle(0, 0, 0).setName("Box 328")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 97, textureX, textureY)
			.addShapeBox(0, 0, -2, 2, 1, 4, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-58.875f, -2.75f, 0).setRotationAngle(0, 0, 0).setName("Box 329")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 97, textureX, textureY)
			.addShapeBox(0, 0, -2, 2, 1, 4, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(57.125f, -2.75f, 0).setRotationAngle(0, 0, 0).setName("Box 332")
		);
		group0.add(new ModelRendererTurbo(group0, 140, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(-47.875f, -12.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		group0.add(new ModelRendererTurbo(group0, 119, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 1, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.5f, 1, 0, -0.5f, 2.5f, 0.5f, 0, -3, 0.5f, 0, -3, 0.5f, -0.5f, 2.5f, 0.5f, -0.5f)
			.setRotationPoint(-49.375f, -12.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 947")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-50.375f, -13.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 948")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, -0.5f, 0, -1)
			.setRotationPoint(-52.375f, -8.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 949")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-56.875f, -9.75f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 1027")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-56.875f, -9.75f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1030")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-52.375f, -2.75f, -12).setRotationAngle(0, 0, 0).setName("Box 1034")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1, 0, -0.5f)
			.setRotationPoint(-55.875f, -10.75f, -10).setRotationAngle(0, -90, 0).setName("Box 198")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(6.625f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 466")
		);
		group0.add(new ModelRendererTurbo(group0, 450, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(16.625f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		group0.add(new ModelRendererTurbo(group0, 445, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(27.125f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 468")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(35.125f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 470")
		);
		group0.add(new ModelRendererTurbo(group0, 395, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(46.875f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(-10.875f, -12.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(-18.875f, -12.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 474")
		);
		group0.add(new ModelRendererTurbo(group0, 325, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(-3.375f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		group0.add(new ModelRendererTurbo(group0, 320, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-52.375f, 0.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		group0.add(new ModelRendererTurbo(group0, 315, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-56.875f, 0.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		group0.add(new ModelRendererTurbo(group0, 310, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-56.875f, -2.75f, -12).setRotationAngle(0, 0, 0).setName("Box 367")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(51.125f, 0.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 368")
		);
		group0.add(new ModelRendererTurbo(group0, 221, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(51.125f, -2.75f, -12).setRotationAngle(0, 0, 0).setName("Box 369")
		);
		group0.add(new ModelRendererTurbo(group0, 216, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(55.625f, 0.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(55.625f, -2.75f, -12).setRotationAngle(0, 0, 0).setName("Box 371")
		);
		group0.add(new ModelRendererTurbo(group0, 200, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-47.875f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 372")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.25f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.375f, -13.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 1, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, 0, 1, 0, 0, 2.5f, 0.5f, -0.5f, -3, 0.5f, -0.5f, -3, 0.5f, 0, 2.5f, 0.5f, 0)
			.setRotationPoint(-49.375f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 374")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(-52.375f, -8.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 375")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-52.375f, -2.75f, 11).setRotationAngle(0, 0, 0).setName("Box 376")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-52.375f, 0.75f, 11).setRotationAngle(0, 0, 0).setName("Box 377")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-56.875f, 0.75f, 11).setRotationAngle(0, 0, 0).setName("Box 378")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-56.875f, -2.75f, 11).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(-56.875f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 380")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1, 0, -0.5f)
			.setRotationPoint(-55.875f, -10.75f, 4).setRotationAngle(0, -90, 0).setName("Box 381")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-56.875f, -9.75f, 3).setRotationAngle(0, 0, 0).setName("Box 382")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-56.875f, -9.75f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 383")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, -0.5f, 0, -1)
			.setRotationPoint(-56.875f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 384")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 97, textureX, textureY).addBox(0, 0, -2, 0, 2, 6)
			.setRotationPoint(-56.125f, -9.5f, -1).setRotationAngle(0, 0, 0).setName("Box 385")
		);
		group0.add(new ModelRendererTurbo(group0, 435, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(55.625f, -9.75f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(55.625f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 387")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(55.625f, -9.75f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1, 0, -0.5f)
			.setRotationPoint(56.625f, -10.75f, 4).setRotationAngle(0, -90, 0).setName("Box 389")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(55.625f, -9.75f, 3).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 97, textureX, textureY).addBox(0, 0, -2, 0, 2, 6)
			.setRotationPoint(56.375f, -9.5f, -1).setRotationAngle(0, 0, 0).setName("Box 391")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1, 0, -0.5f)
			.setRotationPoint(56.625f, -10.75f, -10).setRotationAngle(0, -90, 0).setName("Box 392")
		);
		group0.add(new ModelRendererTurbo(group0, 300, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(55.625f, -9.75f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 393")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, -0.5f, 0, -1)
			.setRotationPoint(55.625f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		group0.add(new ModelRendererTurbo(group0, 290, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, -0.5f, 0, -1)
			.setRotationPoint(51.125f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(51.125f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 396")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(51.125f, -2.75f, 11).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(51.125f, 0.75f, 11).setRotationAngle(0, 0, 0).setName("Box 398")
		);
		group0.add(new ModelRendererTurbo(group0, 240, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(55.625f, 0.75f, 11).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		group0.add(new ModelRendererTurbo(group0, 235, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(55.625f, -2.75f, 11).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		group0.add(new ModelRendererTurbo(group0, 230, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-10.875f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 401")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-18.875f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 402")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-3.375f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 405")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(6.625f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 407")
		);
		group0.add(new ModelRendererTurbo(group0, 170, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16.625f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 408")
		);
		group0.add(new ModelRendererTurbo(group0, 165, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(27.125f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 409")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(35.125f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 410")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(46.875f, -9.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 21, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.875f, -11.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 186")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.875f, -16.5f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 192")
		);
		group0.add(new ModelRendererTurbo(group0, 130, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-28.875f, -16.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 106, textureX, textureY).addBox(0, 0, 0, 1, 6, 4)
			.setRotationPoint(-28.974998f, -16.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 103, textureX, textureY).addBox(0, 0, 0, 1, 6, 4)
			.setRotationPoint(-28.974998f, -16.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 935")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 103, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(-28.974998f, -18.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 936")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 93, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(-28.974998f, -18.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 937")
		);
		group0.add(new ModelRendererTurbo(group0, 125, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.425003f, -12.25f, 3.75f).setRotationAngle(0, 0, 0).setName("Box 938")
		);
		group0.add(new ModelRendererTurbo(group0, 115, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.425003f, -15.450001f, 3.75f).setRotationAngle(0, 0, 0).setName("Box 939")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.425003f, -15.450001f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 940")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.425003f, -12.25f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 941")
		);
		group0.add(new ModelRendererTurbo(group0, 100, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.425003f, -13.75f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 942")
		);
		group0.add(new ModelRendererTurbo(group0, 95, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.425003f, -13.75f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 943")
		);
		group0.add(new ModelRendererTurbo(group0, 84, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-28.875f, -11, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1037")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.375f, -11, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1039")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.375f, -13, 9.5f).setRotationAngle(0, 0, 0).setName("Box 464")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.375f, -8.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 465")
		);
		group0.add(new ModelRendererTurbo(group0, 484, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-29.375f, -17, 9.5f).setRotationAngle(0, 0, 0).setName("Box 466")
		);
		group0.add(new ModelRendererTurbo(group0, 430, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-28.875f, -13, 9.5f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-28.875f, -8.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 468")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-28.875f, -17, 9.5f).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(-28.875f, -12.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 470")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-28.875f, -12.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.875f, -12.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f)
			.setRotationPoint(-28.875f, -12.5f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		group0.add(new ModelRendererTurbo(group0, 90, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f)
			.setRotationPoint(-28.875f, -16.5f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 474")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-28.875f, -16.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 475")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f)
			.setRotationPoint(-28.875f, -16.5f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-28.875f, -16.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 477")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(-28.875f, -12.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-28.875f, -12.5f, -9.25f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f)
			.setRotationPoint(-28.875f, -12.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.875f, -12.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.05f, 0, 0, 0.05f, 0, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, -0.85f, 0.05f, 0, -0.85f, 0.05f)
			.setRotationPoint(-28.875f, -16.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, -0.85f, -0.8f, -0.5f, -0.85f, -0.8f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-28.875f, -16.5f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.05f, -0.5f, 0, 0.05f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.85f, 0.05f, -0.5f, -0.85f, 0.05f, -0.5f, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-28.875f, -16.5f, -9.25f).setRotationAngle(0, 0, 0).setName("Box 484")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f, -0.8f, 0, -0.85f, -0.8f)
			.setRotationPoint(-28.875f, -16.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 485")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-39.375f, -16.75f, 11.01f).setRotationAngle(45, 0, 0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-39.375f, -16.75f, -11.01f).setRotationAngle(-45, 0, 0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-57.875f, 2.1499996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-57.875f, 2.1499996f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-57.875f, 2.1499996f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-59.875f, 1.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 681")
		);
		group0.add(new ModelRendererTurbo(group0, 160, 121, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.875f, 2.75f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 685")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 145, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-59.375f, 3.75f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 686")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 145, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-59.375f, 5.75f, -3.4f).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 145, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-57.875f, 6.6499996f, 5.85f).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		group0.add(new ModelRendererTurbo(group0, 395, 145, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-57.875f, 6.6499996f, 6.85f).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 145, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-57.875f, 6.6499996f, 4.85f).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		group0.add(new ModelRendererTurbo(group0, 220, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-58.375f, 0.25f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1382")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-59.875f, 1.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1385")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-58.375f, 0.25f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1388")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, 1.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1389")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, 1.25f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1390")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, 1.6499996f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1391")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, 1.6499996f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1392")
		);
		group0.add(new ModelRendererTurbo(group0, 170, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, 1.6499996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1393")
		);
		group0.add(new ModelRendererTurbo(group0, 165, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, 1.6499996f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1394")
		);
		group0.add(new ModelRendererTurbo(group0, 160, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-57.875f, 2.1499996f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1395")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, 1.6499996f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1396")
		);
		group0.add(new ModelRendererTurbo(group0, 150, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-57.875f, 2.1499996f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1397")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, 1.6499996f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1398")
		);
		group0.add(new ModelRendererTurbo(group0, 140, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-57.875f, 2.1499996f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1399")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 145, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-57.875f, 6.6499996f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1400")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 145, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-57.875f, 6.6499996f, -7.15f).setRotationAngle(0, 0, 0).setName("Box 1401")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 145, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-57.875f, 6.6499996f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1402")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, -0.25f, -7).setRotationAngle(0, 0, 0).setName("Box 867")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57.875f, -0.25f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 870")
		);
		group0.add(new ModelRendererTurbo(group0, 29, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, -0.75f, -0.4f, 0, -0.75f, -0.4f, -0.5f, 0, -0.4f, -0.5f)
			.setRotationPoint(-45.625f, -21.75f, -0.26f).setRotationAngle(0, 0, 0).setName("Box 872")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.4f, 0.2f, 0, -0.4f, 0.2f, 0, -0.4f, -0.5f, -0.75f, -0.4f, -0.5f, -0.75f, -0.8f, 0.2f, 0, -0.8f, 0.2f)
			.setRotationPoint(-45.625f, -21.75f, -0.26f).setRotationAngle(0, 0, 0).setName("Box 873")
		);
		group0.add(new ModelRendererTurbo(group0, 183, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-45.875f, -22, -0.26f).setRotationAngle(0, 0, 0).setName("Box 874")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.875f, -22, -0.26f).setRotationAngle(0, 0, 0).setName("Box 875")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, -0.4f, 0.2f, -0.75f, -0.4f, 0.2f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0.2f, -0.75f, -0.8f, 0.2f, -0.75f, -0.4f, -0.5f, 0, -0.4f, -0.5f)
			.setRotationPoint(-45.625f, -21.75f, -0.76f).setRotationAngle(0, 0, 0).setName("Box 876")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.875f, -22, -0.76f).setRotationAngle(0, 0, 0).setName("Box 877")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.875f, -20.5f, -0.76f).setRotationAngle(0, 0, 0).setName("Box 878")
		);
		group0.add(new ModelRendererTurbo(group0, 363, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.875f, -20.5f, -0.26f).setRotationAngle(0, 0, 0).setName("Box 879")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-45.875f, -20.5f, -0.26f).setRotationAngle(0, 0, 0).setName("Box 880")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 1, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 1)
			.setRotationPoint(-58.375f, 0.25f, -10).setRotationAngle(0, 0, 0).setName("Box 682")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 1, -0.5f)
			.setRotationPoint(-58.875f, -0.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1384")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-58.875f, -0.25f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1386")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f)
			.setRotationPoint(-58.375f, 0.25f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1387")
		);
		group0.add(new ModelRendererTurbo(group0, 283, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 12, 0, 0, 0.5f, -5, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5)
			.setRotationPoint(-45.375f, -20.7f, -6).setRotationAngle(0, 0, 0).setName("Box 855")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 120, textureX, textureY).addBox(0, 0, 0.75f, 0, 2, 4)
			.setRotationPoint(-43.375f, -21, -6).setRotationAngle(0, -22, 0).setName("Box 807")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 117, textureX, textureY).addBox(0, 0, 0.75f, 0, 2, 4)
			.setRotationPoint(-43.375f, -21, 6).setRotationAngle(0, 202, 0).setName("Box 808")
		);
		group0.add(new ModelRendererTurbo(group0, 198, 103, textureX, textureY).addBox(0, 0, 0, 4, 2, 18)
			.setRotationPoint(10.125f, 3.75f, -9).setRotationAngle(0, 0, 0).setName("Box 966")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(10.125f, 5.75f, -9).setRotationAngle(0, 0, 0).setName("Box 967")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 18, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.125f, 2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 968")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(11.375f, -0.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 863")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(11.375f, -0.25f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 866")
		);
		group0.add(new ModelRendererTurbo(group0, 469, 120, textureX, textureY)
			.addShapeBox(0, 0, -2, 2, 1, 12, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.125f, 1.75f, -4).setRotationAngle(0, 0, 0).setName("Box 978")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0, -0.4f, -0.5f)
			.setRotationPoint(-51.875f, -12.129999f, -1.8f).setRotationAngle(90, 0, 0).setName("Box 872")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0.2f, 0, -0.4f, 0.2f, 0, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.8f, 0.2f, 0, -0.8f, 0.2f)
			.setRotationPoint(-51.875f, -12.129999f, -1.8f).setRotationAngle(90, 0, 0).setName("Box 873")
		);
		group0.add(new ModelRendererTurbo(group0, 480, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-52.125f, -13.629999f, -1.05f).setRotationAngle(0, 0, 0).setName("Box 874")
		);
		group0.add(new ModelRendererTurbo(group0, 475, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-52.125f, -13.629999f, -1.05f).setRotationAngle(0, 0, 0).setName("Box 875")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.4f, 0.2f, -0.5f, -0.4f, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0.2f, -0.5f, -0.8f, 0.2f, -0.5f, -0.4f, -0.5f, 0, -0.4f, -0.5f)
			.setRotationPoint(-51.875f, -11.629999f, -1.8f).setRotationAngle(90, 0, 0).setName("Box 876")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-52.125f, -13.629999f, -1.55f).setRotationAngle(0, 0, 0).setName("Box 877")
		);
		group0.add(new ModelRendererTurbo(group0, 300, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-52.125f, -13.629999f, -0.05000001f).setRotationAngle(0, 0, 0).setName("Box 878")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-52.125f, -13.629999f, 0.45000005f).setRotationAngle(0, 0, 0).setName("Box 879")
		);
		group0.add(new ModelRendererTurbo(group0, 290, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-52.125f, -13.629999f, 0.45000005f).setRotationAngle(0, 0, 0).setName("Box 880")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.875f, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box 961")
		);
		group0.add(new ModelRendererTurbo(group0, 407, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-10.875f, 6.75f, -9).setRotationAngle(0, 0, 0).setName("Box 962")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 5, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.875f, 1.75f, 7).setRotationAngle(0, 0, 0).setName("Box 1089")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 5, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.875f, 1.75f, -7).setRotationAngle(0, 0, 0).setName("Box 1090")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 0, textureX, textureY).addBox(0, 0, -2, 102, 2, 14)
			.setRotationPoint(-49.875f, -0.25f, -5).setRotationAngle(0, 0, 0).setName("Box 963")
		);
		group0.add(new ModelRendererTurbo(group0, 413, 120, textureX, textureY)
			.addShapeBox(0, 0, -2, 2, 1, 12, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.875f, 1.75f, -4).setRotationAngle(0, 0, 0).setName("Box 466")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 18, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.875f, 2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		group0.add(new ModelRendererTurbo(group0, 248, 90, textureX, textureY).addBox(0, 0, 0, 4, 2, 18)
			.setRotationPoint(-14.875f, 3.75f, -9).setRotationAngle(0, 0, 0).setName("Box 468")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-14.875f, 5.75f, -9).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		group0.add(new ModelRendererTurbo(group0, 285, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-13.625f, -0.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 470")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-13.625f, -0.25f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-51.625f, -13.379999f, -2).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 85, textureX, textureY).addBox(0, 0, 0, 4, 3, 3)
			.setRotationPoint(56.375f, 2.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 968")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0)
			.setRotationPoint(57.125f, 2, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1012")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(56.875f, 2.25f, -2).setRotationAngle(0, 0, 0).setName("Box 1013")
		);
		group0.add(new ModelRendererTurbo(group0, 8, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0)
			.setRotationPoint(57.125f, 5.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1014")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(56.875f, 2.25f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 1015")
		);
		group0.add(new ModelRendererTurbo(group0, 215, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(59.125f, 1.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 1406")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 1.25f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1408")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(57.625f, 0.25f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1409")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(59.125f, 1.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1412")
		);
		group0.add(new ModelRendererTurbo(group0, 71, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(57.625f, 0.25f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1415")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 1.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1416")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 144, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(58.625f, 5.75f, 2.1f).setRotationAngle(0, 0, 0).setName("Box 1417")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 143, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.625f, 3.75f, 2).setRotationAngle(0, 0, 0).setName("Box 1418")
		);
		group0.add(new ModelRendererTurbo(group0, 246, 119, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 2.75f, 2).setRotationAngle(0, 0, 0).setName("Box 1419")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 1.6499996f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1420")
		);
		group0.add(new ModelRendererTurbo(group0, 338, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 1.6499996f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1421")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 1.6499996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1422")
		);
		group0.add(new ModelRendererTurbo(group0, 239, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(57.125f, 2.1499996f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1423")
		);
		group0.add(new ModelRendererTurbo(group0, 234, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(57.125f, 2.1499996f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1424")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(57.125f, 2.1499996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1425")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 143, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(57.125f, 6.6499996f, 6.85f).setRotationAngle(0, 0, 0).setName("Box 1426")
		);
		group0.add(new ModelRendererTurbo(group0, 198, 143, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(57.125f, 6.6499996f, 5.85f).setRotationAngle(0, 0, 0).setName("Box 1427")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 142, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(57.125f, 6.6499996f, 4.85f).setRotationAngle(0, 0, 0).setName("Box 1428")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 1.6499996f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1429")
		);
		group0.add(new ModelRendererTurbo(group0, 395, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 1.6499996f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1430")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.125f, 1.6499996f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1431")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(57.125f, 2.1499996f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1432")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(57.125f, 2.1499996f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1433")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(57.125f, 2.1499996f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1434")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 142, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(57.125f, 6.6499996f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1435")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 142, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(57.125f, 6.6499996f, -7.15f).setRotationAngle(0, 0, 0).setName("Box 1436")
		);
		group0.add(new ModelRendererTurbo(group0, 160, 142, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(57.125f, 6.6499996f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1437")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(56.625f, -0.25f, -7).setRotationAngle(0, 0, 0).setName("Box 871")
		);
		group0.add(new ModelRendererTurbo(group0, 150, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(56.625f, -0.25f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 872")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(57.625f, 0.25f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1410")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 1, -0.5f, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(58.125f, -0.25f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1411")
		);
		group0.add(new ModelRendererTurbo(group0, 140, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 1, 0, 0, 1, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(58.125f, -0.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1413")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1, 0, 0, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 1, 0, -0.5f, 0.5f)
			.setRotationPoint(57.625f, 0.25f, -10).setRotationAngle(0, 0, 0).setName("Box 1414")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.4f, 0.2f, -0.5f, -0.4f, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0.2f, -0.5f, -0.4f, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.574997f, -17.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 281")
		);
		group0.add(new ModelRendererTurbo(group0, 130, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.574997f, -17.5f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 282")
		);
		group0.add(new ModelRendererTurbo(group0, 125, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0.2f, 0, -0.4f, 0.2f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0.2f, 0, -0.4f, 0.2f)
			.setRotationPoint(51.574997f, -17.5f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 283")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(51.824997f, -15.75f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 284")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.824997f, -15.75f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 285")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.824997f, -15.75f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 286")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.824997f, -17.75f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 287")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(51.824997f, -17.75f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 288")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.824997f, -17.75f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 289")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.425003f, -13.75f, -4.6f).setRotationAngle(0, 0, 0).setName("Box 292")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.425003f, -13.75f, 3.6999998f).setRotationAngle(0, 0, 0).setName("Box 293")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.475f, -11.75f, 3.6999998f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.475f, -11.75f, -4.6f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.925003f, -16.75f, -5).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 204, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.925003f, -16.75f, -2).setRotationAngle(0, 0, 0).setName("Box 502")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.925003f, -16.75f, 2).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 121, textureX, textureY)
			.addShapeBox(0, 0, -3, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.925003f, -16.75f, -2).setRotationAngle(0, 5.5f, 0).setName("Box 963")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.925003f, -16.75f, 2).setRotationAngle(0, -5.5f, 0).setName("Box 964")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 35, textureX, textureY).addBox(0, 0, 0, 9, 4, 0)
			.setRotationPoint(-40.375f, -10.75f, 11.01f).setRotationAngle(0, 0, 0).setName("Box 960")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 58, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 3, 2, 5, 0, -1, 0, -1, -0.75f, 0, -1, -0.75f, 0, -1, -1, 0, -1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(12.625f, -21.65f, -1).setRotationAngle(0, 0, 0).setName("Box 750")
		);
		group0.add(new ModelRendererTurbo(group0, 323, 118, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 1, 2, 3, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.625f, -22.25f, 0).setRotationAngle(0, 0, 0).setName("Box 751")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-24.875f, -23, 0.5f).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 95, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-23.875f, -23, -1.5f).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0)
			.setRotationPoint(-21.875f, -23, -1.5f).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 115, 141, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-23.625f, -23, -0.5f).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 94, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-23.875f, -23, 0.5f).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.4f, 0.2f, -0.5f, -0.4f, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.375f, -4.75f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1450")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.375f, -4.75f, -6).setRotationAngle(0, 0, 0).setName("Box 1451")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-56.625f, -5, -6).setRotationAngle(0, 0, 0).setName("Box 1453")
		);
		group0.add(new ModelRendererTurbo(group0, 211, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.625f, -5, -6).setRotationAngle(0, 0, 0).setName("Box 1454")
		);
		group0.add(new ModelRendererTurbo(group0, 206, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.625f, -5, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1455")
		);
		group0.add(new ModelRendererTurbo(group0, 158, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0.2f, 0, -0.4f, 0.2f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0.2f, 0, 0, 0.2f)
			.setRotationPoint(-56.375f, -4.75f, -6).setRotationAngle(0, 0, 0).setName("Box 1456")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.375f, -4.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1457")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.625f, -5, 5).setRotationAngle(0, 0, 0).setName("Box 1458")
		);
		group0.add(new ModelRendererTurbo(group0, 143, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.625f, -5, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1459")
		);
		group0.add(new ModelRendererTurbo(group0, 138, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-56.625f, -5, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1460")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0.2f, 0, -0.4f, 0.2f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0.2f, 0, 0, 0.2f)
			.setRotationPoint(-56.375f, -4.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1461")
		);
		group0.add(new ModelRendererTurbo(group0, 128, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.4f, 0.2f, -0.5f, -0.4f, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56.375f, -4.75f, 5).setRotationAngle(0, 0, 0).setName("Box 1462")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0.2f, 0, -0.4f, 0.2f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0.2f, 0, 0, 0.2f)
			.setRotationPoint(56.125f, -4.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 578")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.125f, -4.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.4f, 0.2f, -0.5f, -0.4f, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.125f, -4.75f, 5).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.375f, -5, 5).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.375f, -5, 5.5f).setRotationAngle(0, 0, 0).setName("Box 582")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(56.375f, -5, 5.5f).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0.2f, 0, -0.4f, 0.2f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0.2f, 0, 0, 0.2f)
			.setRotationPoint(56.125f, -4.75f, -6).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.125f, -4.75f, -6).setRotationAngle(0, 0, 0).setName("Box 585")
		);
		group0.add(new ModelRendererTurbo(group0, 300, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.375f, -5, -6.5f).setRotationAngle(0, 0, 0).setName("Box 586")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.375f, -5, -6).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(56.375f, -5, -6).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		group0.add(new ModelRendererTurbo(group0, 419, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.4f, 0.2f, -0.5f, -0.4f, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.125f, -4.75f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 100, textureX, textureY).addBox(0, 0, 0.15f, 1, 2, 2)
			.setRotationPoint(-41.375f, -14.73f, 4).setRotationAngle(0, -10, 0).setName("Box 645")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 127, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-38.375f, -11.75f, 0.64f).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		group0.add(new ModelRendererTurbo(group0, 286, 99, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-35.875f, -12, 2.39f).setRotationAngle(0, -141, 0).setName("Box 657")
		);
		group0.add(new ModelRendererTurbo(group0, 367, 97, textureX, textureY)
			.addShapeBox(0, 0, 0.25f, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-35.875f, -11, 2.24f).setRotationAngle(0, -128, 0).setName("Box 921")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 127, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-38.375f, -10.75f, 0.94000006f).setRotationAngle(0, 0, 0).setName("Box 922")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f)
			.setRotationPoint(-37.925003f, -14, 1.3499999f).setRotationAngle(0, 0, -90).setName("Box 664")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 126, textureX, textureY).addBox(1.4f, 0, 1.05f, 1, 1, 1)
			.setRotationPoint(-42.875f, -14.25f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 323, 124, textureX, textureY).addBox(2.5f, 0, 1.05f, 1, 1, 1)
			.setRotationPoint(-42.875f, -14.25f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 930")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 124, textureX, textureY).addBox(3.6f, 0, 1.05f, 1, 1, 1)
			.setRotationPoint(-42.875f, -14.25f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 931")
		);
		group0.add(new ModelRendererTurbo(group0, 104, 124, textureX, textureY)
			.addShapeBox(2.85f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-42.875f, -12.049999f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 933")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 124, textureX, textureY)
			.addShapeBox(3.55f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-42.875f, -12.049999f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 124, textureX, textureY)
			.addShapeBox(3.55f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.875f, -12.799999f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 936")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 122, textureX, textureY)
			.addShapeBox(2.85f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.875f, -12.799999f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 937")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 122, textureX, textureY)
			.addShapeBox(4.25f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.875f, -12.799999f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 938")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 96, textureX, textureY)
			.addShapeBox(0, 0, -1.25f, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-40.375f, -11.25f, 5.85f).setRotationAngle(0, 39, 0).setName("Box 915")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 96, textureX, textureY)
			.addShapeBox(0, 0, -0.7f, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-39.875f, -13, 4.85f).setRotationAngle(0, 98, 0).setName("Box 653")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 85, textureX, textureY).addBox(0, 0, 1, 6, 9, 1)
			.setRotationPoint(-42.875f, -14.75f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 914")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 9, 1, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.875f, -14.75f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1058")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.6f, -0.75f, 0, -0.85f, -0.75f, -0.6f, 0.5f, 0, -0.6f, 0.5f, 0, -0.6f, -0.6f, -0.75f, -0.6f, -0.85f)
			.setRotationPoint(-37.925003f, -13, 1.3499999f).setRotationAngle(0, 0, -90).setName("Box 1088")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 119, textureX, textureY).addBox(0, 0, 1, 2, 6, 2)
			.setRotationPoint(-42.875f, -11.75f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1019")
		);
		group0.add(new ModelRendererTurbo(group0, 493, 120, textureX, textureY)
			.addShapeBox(0.25f, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.75f, 0, 0, 0.75f)
			.setRotationPoint(-42.875f, -12.75f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1020")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 134, textureX, textureY)
			.addShapeBox(2, 0, 1, 1, 6, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-42.875f, -11.75f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1021")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 106, textureX, textureY)
			.addShapeBox(-1, 0, 1, 1, 6, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-42.875f, -11.75f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1023")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 118, textureX, textureY)
			.addShapeBox(1.75f, 0, 1, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.75f)
			.setRotationPoint(-42.875f, -12.75f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1024")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 118, textureX, textureY)
			.addShapeBox(-0.75f, 0, 1.75f, 1, 1, 1, 0, -0.5f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-42.875f, -12.75f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1025")
		);
		group0.add(new ModelRendererTurbo(group0, 395, 117, textureX, textureY)
			.addShapeBox(2.1f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-42.875f, -12.049999f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1026")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 116, textureX, textureY)
			.addShapeBox(2.1f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.875f, -12.799999f, 3.6f).setRotationAngle(0, 45, 0).setName("Box 1027")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.375f, -9.25f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-31.505005f, -13, 10.25f).setRotationAngle(0, 180, -13).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.375f, -9.25f, -10.45f).setRotationAngle(0, 0, 0).setName("Box 2015")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-31.505005f, -13, -5.45f).setRotationAngle(0, 180, -13).setName("Box 2016")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.375f, -11.25f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.375f, -11.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.875f, -8.25f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.875f, -8.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 930")
		);
		group0.add(new ModelRendererTurbo(group0, 29, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.625f, -18.75f, -6.75f).setRotationAngle(0, 0, 0).setName("Box 612")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-27.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 975")
		);
		group0.add(new ModelRendererTurbo(group0, 413, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 976")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-27.375f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 977")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.375f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 978")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-27.375f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 979")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.375f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 980")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-40.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 627")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-40.375f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 628")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.375f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 629")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-40.375f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 630")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.375f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 631")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(24.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 632")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 633")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(24.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 635")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(24.625f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 636")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24.625f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 637")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(37.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(37.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(37.625f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37.625f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(49.525f, -14.65f, -6.9f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(35.625f, -14.65f, -6.9f).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 7, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35.875f, -14.5f, -6.87f).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		group0.add(new ModelRendererTurbo(group0, 478, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.75f, -0.65f, 0, -0.75f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(35.625f, -7.8500004f, -6.9f).setRotationAngle(0, 0, 0).setName("Box 738")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.75f, -0.65f, 0, -0.75f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(35.625f, -15, -6.9f).setRotationAngle(0, 0, 0).setName("Box 739")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(32.205f, -15, -6.95f).setRotationAngle(0, 0, 0).setName("Box 747")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(32.205f, -14.65f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 748")
		);
		group0.add(new ModelRendererTurbo(group0, 300, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.455f, -14.5f, -6.92f).setRotationAngle(0, 0, 0).setName("Box 754")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(34.205f, -14.65f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 755")
		);
		group0.add(new ModelRendererTurbo(group0, 386, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(32.205f, -7.8500004f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 757")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(25.705002f, -8.25f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 881")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(25.705002f, -8.6f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 883")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(27.705002f, -8.25f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 889")
		);
		group0.add(new ModelRendererTurbo(group0, 363, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(25.705002f, -4.45f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 890")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.955002f, -8.1f, 6.92f).setRotationAngle(0, 0, 0).setName("Box 891")
		);
		group0.add(new ModelRendererTurbo(group0, 290, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(32.205f, -14.65f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 892")
		);
		group0.add(new ModelRendererTurbo(group0, 285, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(34.205f, -14.65f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 896")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(32.205f, -7.8500004f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 897")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.455f, -14.5f, 6.92f).setRotationAngle(0, 0, 0).setName("Box 898")
		);
		group0.add(new ModelRendererTurbo(group0, 234, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(32.205f, -15, 5.95f).setRotationAngle(0, 0, 0).setName("Box 899")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(35.625f, -14.65f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 901")
		);
		groups.add(group0);
	}

	private final void initGroup_group01(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 478, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.75f, -0.65f, 0, -0.75f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(35.625f, -15, 5.9f).setRotationAngle(0, 0, 0).setName("Box 917")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(49.525f, -14.65f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 246, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 7, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35.875f, -14.5f, 6.87f).setRotationAngle(0, 0, 0).setName("Box 932")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.75f, -0.65f, 0, -0.75f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(35.625f, -7.8500004f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 933")
		);
		group0.add(new ModelRendererTurbo(group0, 395, 114, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.925003f, -10, 7.8999996f).setRotationAngle(0, 90, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-44.425003f, -10, 9.9f).setRotationAngle(0, 90, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 55, 108, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.925003f, -10, 10.4f).setRotationAngle(0, 90, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(-50.375f, -13.549999f, -1).setRotationAngle(0, 0, 0).setName("Box 1058")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(-50.375f, -13.549999f, -1).setRotationAngle(0, 0, 0).setName("Box 1059")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(-50.375f, -13.549999f, -1).setRotationAngle(0, 0, 0).setName("Box 1060")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(-50.375f, -13.549999f, -1).setRotationAngle(0, 0, 0).setName("Box 1061")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 93, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-48.525f, -10.75f, 6.51f).setRotationAngle(0, 0, 0).setName("Box 1066")
		);
		group0.add(new ModelRendererTurbo(group0, 499, 106, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-47.525f, -9.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1067")
		);
		group0.add(new ModelRendererTurbo(group0, 424, 105, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.925003f, -13.200001f, 5.9f).setRotationAngle(-90, 0, 0).setName("Box 1068")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-49.425003f, -13.700001f, 5.9f).setRotationAngle(-90, 0, 0).setName("Box 1070")
		);
		group0.add(new ModelRendererTurbo(group0, 389, 105, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.425003f, -13.200001f, 5.9f).setRotationAngle(-90, 0, 0).setName("Box 1071")
		);
		group0.add(new ModelRendererTurbo(group0, 288, 103, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -6, -4.1f).setRotationAngle(0, 90, 0).setName("Box 997")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 103, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -6, -1.5999999f).setRotationAngle(0, 90, 0).setName("Box 998")
		);
		group0.add(new ModelRendererTurbo(group0, 323, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(51.475f, -6, -2.1f).setRotationAngle(0, 90, 0).setName("Box 999")
		);
		group0.add(new ModelRendererTurbo(group0, 211, 103, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -9, -1.5999999f).setRotationAngle(0, 90, 0).setName("Box 1000")
		);
		group0.add(new ModelRendererTurbo(group0, 386, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(51.475f, -9, -2.1f).setRotationAngle(0, 90, 0).setName("Box 1001")
		);
		group0.add(new ModelRendererTurbo(group0, 187, 103, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -9, -4.1f).setRotationAngle(0, 90, 0).setName("Box 1002")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 100, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -12, -1.5999999f).setRotationAngle(0, 90, 0).setName("Box 1003")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(51.475f, -12, -2.1f).setRotationAngle(0, 90, 0).setName("Box 1004")
		);
		group0.add(new ModelRendererTurbo(group0, 162, 100, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -12, -4.1f).setRotationAngle(0, 90, 0).setName("Box 1005")
		);
		group0.add(new ModelRendererTurbo(group0, 134, 100, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -15, -1.5999999f).setRotationAngle(0, 90, 0).setName("Box 1006")
		);
		group0.add(new ModelRendererTurbo(group0, 363, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(51.475f, -15, -2.1f).setRotationAngle(0, 90, 0).setName("Box 1007")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 100, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -15, -4.1f).setRotationAngle(0, 90, 0).setName("Box 1008")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 98, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -18, -1.5999999f).setRotationAngle(0, 90, 0).setName("Box 1009")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(51.475f, -18, -2.1f).setRotationAngle(0, 90, 0).setName("Box 1010")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 96, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -18, -4.1f).setRotationAngle(0, 90, 0).setName("Box 1011")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 96, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -21, -1.5999999f).setRotationAngle(0, 90, 0).setName("Box 1012")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(51.475f, -21, -2.1f).setRotationAngle(0, 90, 0).setName("Box 1013")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 94, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.975f, -21, -4.1f).setRotationAngle(0, 90, 0).setName("Box 1014")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-27.125f, -18.65f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 762")
		);
		group0.add(new ModelRendererTurbo(group0, 163, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-19.125f, -18.65f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 769")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27.125f, -19, -6.15f).setRotationAngle(0, 0, 0).setName("Box 770")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.875f, -18.5f, -6.12f).setRotationAngle(0, 0, 0).setName("Box 771")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27.125f, -16.85f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 772")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-24.125f, -15.65f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 870")
		);
		group0.add(new ModelRendererTurbo(group0, 339, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.875f, -15.5f, 6.12f).setRotationAngle(0, 0, 0).setName("Box 871")
		);
		group0.add(new ModelRendererTurbo(group0, 125, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27.125f, -13.85f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 877")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-27.125f, -15.65f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 879")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27.125f, -16, 5.15f).setRotationAngle(0, 0, 0).setName("Box 880")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.875f, -15.5f, -6.12f).setRotationAngle(0, 0, 0).setName("Box 1030")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-27.125f, -15.65f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1031")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27.125f, -13.85f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1032")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27.125f, -16, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1033")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-24.125f, -15.65f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1034")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-23.125f, -13.85f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1035")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.875f, -15.5f, -6.12f).setRotationAngle(0, 0, 0).setName("Box 1036")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-23.125f, -16, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1037")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-23.125f, -15.65f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1038")
		);
		group0.add(new ModelRendererTurbo(group0, 261, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-19.125f, -15.65f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1039")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27.125f, -19, 5.15f).setRotationAngle(0, 0, 0).setName("Box 1062")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-27.125f, -18.65f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 1063")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27.125f, -16.85f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 1065")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.875f, -18.5f, 6.12f).setRotationAngle(0, 0, 0).setName("Box 1081")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-19.125f, -18.65f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 1083")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-23.125f, -16, 5.15f).setRotationAngle(0, 0, 0).setName("Box 1084")
		);
		group0.add(new ModelRendererTurbo(group0, 164, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-23.125f, -15.65f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 1085")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-23.125f, -13.85f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 1086")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(-19.125f, -15.65f, 5.15f).setRotationAngle(0, 0, 0).setName("Box 1087")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.875f, -15.5f, 6.12f).setRotationAngle(0, 0, 0).setName("Box 1096")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(12.625f, -21.45f, -2).setRotationAngle(0, 0, 0).setName("Box 955")
		);
		group0.add(new ModelRendererTurbo(group0, 430, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(-51.375f, -12.25f, -1).setRotationAngle(0, 0, 0).setName("Box 1109")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0.25f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, 0.75f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-51.375f, -12.25f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1110")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f)
			.setRotationPoint(-51.375f, -13, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1111")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, 0.25f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-51.375f, -13, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1112")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 5, 0, -0.5f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(50.625f, -18.5f, 1).setRotationAngle(0, 0, 0).setName("Box 1120")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.625f, -18.5f, -1).setRotationAngle(0, 0, 0).setName("Box 1121")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(50.625f, -18.75f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1127")
		);
		group0.add(new ModelRendererTurbo(group0, 498, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 5, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, 0.25f, 0, 0, -0.5f, 0, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, 0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(50.625f, -18.5f, -6).setRotationAngle(0, 0, 0).setName("Box 1128")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-43.375f, -20, -6.75f).setRotationAngle(0, 0, 0).setName("Box 679")
		);
		group0.add(new ModelRendererTurbo(group0, 284, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-32.375f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		group0.add(new ModelRendererTurbo(group0, 275, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-34.375f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(-32.375f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(-34.375f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(32.625f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(30.625f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		group0.add(new ModelRendererTurbo(group0, 204, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(32.625f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(30.625f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 183, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -6, 0, 0, -6, 0, -0.25f, 4.25f, -0.5f, -0.25f, 4.25f, -0.5f, -0.25f, -1.75f, 0, -0.25f, -1.75f)
			.setRotationPoint(-43.375f, -20.75f, -3).setRotationAngle(0, 0, 0).setName("Box 670")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -2.5f, -0.5f, 0, -2.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-43.375f, -20, -9.75f).setRotationAngle(0, 0, 0).setName("Box 681")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, -2.5f, 0, 0, -2.5f, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-43.375f, -20, 6.75f).setRotationAngle(0, 0, 0).setName("Box 675")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -17.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -17.75f, 7).setRotationAngle(0, 0, 0).setName("Box 677")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-28.875f, -20, -6.75f).setRotationAngle(0, 0, 0).setName("Box 671")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -2.5f, -0.5f, 0, -2.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-28.875f, -20, -9.75f).setRotationAngle(0, 0, 0).setName("Box 672")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2.5f, 0, 0, -2.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-28.875f, -20, 6.75f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -6, 0, 0, -6, 0, -0.25f, 4.25f, -0.5f, -0.25f, 4.25f, -0.5f, -0.25f, -1.75f, 0, -0.25f, -1.75f)
			.setRotationPoint(-28.875f, -20.75f, -3).setRotationAngle(0, 0, 0).setName("Box 675")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.875f, -16.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 677")
		);
		group0.add(new ModelRendererTurbo(group0, 239, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.875f, -16.5f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 678")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.875f, -17.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 679")
		);
		group0.add(new ModelRendererTurbo(group0, 147, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-28.875f, -16.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 680")
		);
		group0.add(new ModelRendererTurbo(group0, 286, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 2, 7, 0, 0, -1.625f, 0, 0, -1.625f, 0, 0, -1.625f, 0, 0, -1.625f, 0, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(-28.375f, -22.75f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 659")
		);
		group0.add(new ModelRendererTurbo(group0, 234, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-29.875f, -16.75f, -11).setRotationAngle(0, 0, 0).setName("Box 663")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-29.875f, -16.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-39.375f, -16.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 7, 0, 0, -1.625f, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, -1.625f, 0, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(-50.375f, -15, -3.5f).setRotationAngle(0, 0, 0).setName("Box 678")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.625f, -2, -1, -0.625f, -2, -1, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0.5f, 1, 0, 0.5f)
			.setRotationPoint(-50.375f, -14, -5.5f).setRotationAngle(0, 0, 0).setName("Box 680")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.625f, 0.5f, -1, -0.625f, 0.5f, -1, -0.625f, -2, 0, -0.625f, -2, 1, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-50.375f, -14, 1.5f).setRotationAngle(0, 0, 0).setName("Box 681")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, 0, -0.625f, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-50.375f, -14, -1).setRotationAngle(0, 0, 0).setName("Box 682")
		);
		group0.add(new ModelRendererTurbo(group0, 164, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-43.375f, -18.25f, -10).setRotationAngle(0, 0, 0).setName("Box 691")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-43.375f, -18.25f, -9.75f).setRotationAngle(0, 0, 0).setName("Box 692")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, -1.25f, 3.5f, 0, -1.25f, 3.5f, 0, -1.25f, -3.5f, 0, -1.25f, -3.5f)
			.setRotationPoint(-43.375f, -21, -7.5f).setRotationAngle(0, 0, 0).setName("Box 695")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 4, 1, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -3.5f, 0, -1.25f, -3.5f, 0, -1.25f, 3.5f, 0, -1.25f, 3.5f)
			.setRotationPoint(-43.375f, -21, 6.5f).setRotationAngle(0, 0, 0).setName("Box 696")
		);
		group0.add(new ModelRendererTurbo(group0, 228, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-43.375f, -16.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 697")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-43.375f, -11.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 698")
		);
		group0.add(new ModelRendererTurbo(group0, 454, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.375f, -11.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 664")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-43.375f, -16.75f, 7).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-43.375f, -11.75f, 10).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-43.375f, -18.25f, 9).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-43.375f, -17.75f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		group0.add(new ModelRendererTurbo(group0, 444, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.375f, -12.75f, -11).setRotationAngle(0, 0, 0).setName("Box 672")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-30.375f, -17.25f, -11).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 187, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.875f, -16.75f, -11).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-30.375f, -12.75f, -11).setRotationAngle(0, 0, 0).setName("Box 675")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.375f, -17.25f, -11).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.375f, -12.75f, -11).setRotationAngle(0, 0, 0).setName("Box 672")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.875f, -17.25f, -11).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-42.375f, -16.75f, -11).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.875f, -12.75f, -11).setRotationAngle(0, 0, 0).setName("Box 675")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.375f, -17.25f, -11).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.375f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 677")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.875f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 678")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-42.375f, -16.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 679")
		);
		group0.add(new ModelRendererTurbo(group0, 8, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.875f, -17.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 680")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-41.375f, -17.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 681")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.875f, -16.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 682")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-30.375f, -17.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.375f, -17.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 688")
		);
		group0.add(new ModelRendererTurbo(group0, 131, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-30.375f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 689")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.375f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 690")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 41, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.875f, 7.25f, -9).setRotationAngle(0, 0, 0).setName("Box 715")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 24, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-56.875f, 7.25f, 12).setRotationAngle(0, 0, 0).setName("Box 716")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 136, textureX, textureY).addBox(0, 0, -2, 1, 8, 1)
			.setRotationPoint(-56.875f, -0.75f, 12).setRotationAngle(0, 0, 0).setName("Box 717")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 135, textureX, textureY).addBox(0, 0, -2, 1, 8, 1)
			.setRotationPoint(56.125f, -0.75f, -9).setRotationAngle(0, 0, 0).setName("Box 718")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 12, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.125f, 7.25f, -9).setRotationAngle(0, 0, 0).setName("Box 719")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 12, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.125f, 7.25f, 12).setRotationAngle(0, 0, 0).setName("Box 720")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 134, textureX, textureY).addBox(0, 0, -2, 1, 8, 1)
			.setRotationPoint(56.125f, -0.75f, 12).setRotationAngle(0, 0, 0).setName("Box 721")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 9, 4, 0)
			.setRotationPoint(-40.375f, -10.75f, -11.01f).setRotationAngle(0, 0, 0).setName("Box 959")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 114, textureX, textureY).addBox(0, 0, -2, 3, 6, 1)
			.setRotationPoint(-22.375f, -12.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		group0.add(new ModelRendererTurbo(group0, 430, 120, textureX, textureY).addBox(0, 0, -2, 3, 10, 1)
			.setRotationPoint(-13.875f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 653")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 117, textureX, textureY).addBox(0, 0, -2, 3, 10, 1)
			.setRotationPoint(-10.625f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 654")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 130, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(-7.125f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 657")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 130, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(-3.875f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 130, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(-0.625f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 659")
		);
		group0.add(new ModelRendererTurbo(group0, 416, 134, textureX, textureY).addBox(0, 0, -2, 2, 15, 1)
			.setRotationPoint(3.625f, -18.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 660")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 134, textureX, textureY).addBox(0, 0, -2, 2, 15, 1)
			.setRotationPoint(5.875f, -18.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 661")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 134, textureX, textureY).addBox(0, 0, -2, 2, 15, 1)
			.setRotationPoint(10.375f, -18.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 664")
		);
		group0.add(new ModelRendererTurbo(group0, 362, 134, textureX, textureY).addBox(0, 0, -2, 2, 15, 1)
			.setRotationPoint(8.125f, -18.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 134, textureX, textureY).addBox(0, 0, -2, 2, 13, 1)
			.setRotationPoint(15.875f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		group0.add(new ModelRendererTurbo(group0, 463, 133, textureX, textureY).addBox(0, 0, -2, 2, 13, 1)
			.setRotationPoint(13.625f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 133, textureX, textureY).addBox(0, 0, -2, 2, 13, 1)
			.setRotationPoint(18.125f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 669")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 129, textureX, textureY).addBox(0, 0, -2, 3, 14, 1)
			.setRotationPoint(21.875f, -17.75f, -4.9f).setRotationAngle(0, 0, 0).setName("Box 670")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 129, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(28.625f, -16.75f, -4.9f).setRotationAngle(0, 0, 0).setName("Box 671")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 129, textureX, textureY).addBox(0, 0, -2, 3, 14, 1)
			.setRotationPoint(25.375f, -17.75f, -4.9f).setRotationAngle(0, 0, 0).setName("Box 672")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 129, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(31.875f, -16.75f, -4.9f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 55, textureX, textureY).addBox(0, 0, -2, 7, 4, 1)
			.setRotationPoint(-17.625f, -5.25f, -9.1f).setRotationAngle(0, 0, 0).setName("Box 845")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 54, textureX, textureY).addBox(0, 0, -2, 7, 4, 1)
			.setRotationPoint(-25.625f, -5.25f, -9.1f).setRotationAngle(0, 0, 0).setName("Box 846")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 48, textureX, textureY).addBox(0, 0, -2, 13, 4, 1)
			.setRotationPoint(-39.625f, -5.25f, -9.1f).setRotationAngle(0, 0, 0).setName("Box 847")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 38, textureX, textureY).addBox(0, 0, -2, 5, 4, 1)
			.setRotationPoint(-45.625f, -5.25f, -9.1f).setRotationAngle(0, 0, 0).setName("Box 849")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 28, textureX, textureY)
			.addShapeBox(0, 0, -1, 4, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.875f, -11.75f, -5.1f).setRotationAngle(0, 0, 0).setName("Box 793")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 113, textureX, textureY).addBox(0, 0, -2, 3, 6, 1)
			.setRotationPoint(-26.375f, -12.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 1054")
		);
		group0.add(new ModelRendererTurbo(group0, 198, 113, textureX, textureY).addBox(0, 0, -2, 3, 6, 1)
			.setRotationPoint(-22.375f, -12.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 300, 117, textureX, textureY).addBox(0, 0, -2, 3, 10, 1)
			.setRotationPoint(-13.875f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 935")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 117, textureX, textureY).addBox(0, 0, -2, 3, 10, 1)
			.setRotationPoint(-10.625f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 936")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 127, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(-7.125f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 937")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 127, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(-3.875f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 938")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 127, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(-0.625f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 939")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 132, textureX, textureY).addBox(0, 0, -2, 2, 15, 1)
			.setRotationPoint(3.625f, -18.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 940")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 132, textureX, textureY).addBox(0, 0, -2, 2, 15, 1)
			.setRotationPoint(5.875f, -18.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 941")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 132, textureX, textureY).addBox(0, 0, -2, 2, 15, 1)
			.setRotationPoint(8.125f, -18.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 942")
		);
		group0.add(new ModelRendererTurbo(group0, 326, 132, textureX, textureY).addBox(0, 0, -2, 2, 15, 1)
			.setRotationPoint(10.375f, -18.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 943")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 131, textureX, textureY).addBox(0, 0, -2, 2, 13, 1)
			.setRotationPoint(13.625f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 131, textureX, textureY).addBox(0, 0, -2, 2, 13, 1)
			.setRotationPoint(15.875f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 947")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 131, textureX, textureY).addBox(0, 0, -2, 2, 13, 1)
			.setRotationPoint(18.125f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 948")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 127, textureX, textureY).addBox(0, 0, -2, 3, 14, 1)
			.setRotationPoint(21.875f, -17.75f, 7.8999996f).setRotationAngle(0, 0, 0).setName("Box 950")
		);
		group0.add(new ModelRendererTurbo(group0, 197, 127, textureX, textureY).addBox(0, 0, -2, 3, 14, 1)
			.setRotationPoint(25.375f, -17.75f, 7.8999996f).setRotationAngle(0, 0, 0).setName("Box 951")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 124, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(28.625f, -16.75f, 7.8999996f).setRotationAngle(0, 0, 0).setName("Box 952")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 123, textureX, textureY).addBox(0, 0, -2, 3, 13, 1)
			.setRotationPoint(31.875f, -16.75f, 7.8999996f).setRotationAngle(0, 0, 0).setName("Box 953")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 41, textureX, textureY).addBox(0, 0, -2, 7, 4, 1)
			.setRotationPoint(-25.625f, -5.25f, 12.1f).setRotationAngle(0, 0, 0).setName("Box 954")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 35, textureX, textureY).addBox(0, 0, -2, 13, 4, 1)
			.setRotationPoint(-39.625f, -5.25f, 12.1f).setRotationAngle(0, 0, 0).setName("Box 955")
		);
		group0.add(new ModelRendererTurbo(group0, 499, 22, textureX, textureY).addBox(0, 0, -2, 5, 4, 1)
			.setRotationPoint(-45.625f, -5.25f, 12.1f).setRotationAngle(0, 0, 0).setName("Box 957")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 29, textureX, textureY).addBox(0, 0, -2, 7, 4, 1)
			.setRotationPoint(-17.625f, -5.25f, 12.1f).setRotationAngle(0, 0, 0).setName("Box 958")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, -1, 4, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.875f, -11.75f, 6.1f).setRotationAngle(0, 0, 0).setName("Box 1062")
		);
		group0.add(new ModelRendererTurbo(group0, 183, 113, textureX, textureY).addBox(0, 0, -2, 3, 6, 1)
			.setRotationPoint(-26.375f, -12.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 1058")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(28.915f, -7.8500004f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 745")
		);
		group0.add(new ModelRendererTurbo(group0, 437, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29.165f, -14.5f, -6.92f).setRotationAngle(0, 0, 0).setName("Box 746")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(28.915f, -14.65f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 747")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(28.915f, -15, -6.95f).setRotationAngle(0, 0, 0).setName("Box 748")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(30.915f, -14.65f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 749")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(28.915f, -14.65f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 750")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29.165f, -14.5f, 6.92f).setRotationAngle(0, 0, 0).setName("Box 751")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(30.915f, -14.65f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 752")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(28.915f, -15, 5.95f).setRotationAngle(0, 0, 0).setName("Box 753")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(28.915f, -7.8500004f, 5.95f).setRotationAngle(0, 0, 0).setName("Box 754")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(25.705002f, -8.25f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 755")
		);
		group0.add(new ModelRendererTurbo(group0, 98, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(25.705002f, -8.6f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 756")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0.8f, 0, -0.65f, 0.8f, 0, -0.65f, 0.8f, 0, 0, 0.8f, 0)
			.setRotationPoint(27.705002f, -8.25f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 757")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.955002f, -8.1f, -6.92f).setRotationAngle(0, 0, 0).setName("Box 758")
		);
		group0.add(new ModelRendererTurbo(group0, 98, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, -0.65f, 0, -0.65f, -0.65f, 0, -0.65f, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(25.705002f, -4.45f, -6.95f).setRotationAngle(0, 0, 0).setName("Box 759")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-43.375f, -11.75f, -7).setRotationAngle(0, 0, 0).setName("Box 757")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-43.375f, -11.75f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 758")
		);
		group0.add(new ModelRendererTurbo(group0, 424, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 16, 14, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.625f, -18.5f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 781")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 108, textureX, textureY).addBox(0, 0, -2, 3, 10, 1)
			.setRotationPoint(-17.125f, -16.75f, -4.1f).setRotationAngle(0, 0, 0).setName("Box 761")
		);
		groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-43.375f, -11.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 664cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 158, textureX, textureY).addBox(0, 0, -2, 3, 10, 1)
			.setRotationPoint(-17.125f, -16.75f, 7.1000004f).setRotationAngle(0, 0, 0).setName("Box 935cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.625f, -20.5f, -1).setRotationAngle(0, 0, 0).setName("Box 702")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(50.625f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 703")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.625f, -20.5f, -6).setRotationAngle(0, 0, 0).setName("Box 704")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(50.875f, -21.25f, -1).setRotationAngle(0, 0, 0).setName("Box 705")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 4, 3, 0, 0, -3.375f, -1, 0, -3.375f, -1, 0, -3.375f, 1, 0, -3.375f, 1, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, 4.5f, 0, 0, 4.5f)
			.setRotationPoint(21.625f, -25.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 757")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 2, 14, 0, 0, -1.25f, -2, 0, -1.25f, -2, 0, -1.25f, -2, 0, -1.25f, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.625f, -22.5f, -7).setRotationAngle(0, 0, 0).setName("Box 758")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.625f, -20.5f, -7).setRotationAngle(0, 0, 0).setName("Box 759")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(50.625f, -20.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 761")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, -1, 0, 0, -0.5f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, -1, 0, 0, -0.5f)
			.setRotationPoint(50.625f, -20.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 762")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -1.25f, -2, -0.25f, -1.25f, -2.25f, -0.25f, -1.25f, 0, 0, -1.25f, 0, 0, 0, 0, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.625f, -22.5f, -7).setRotationAngle(0, 0, 0).setName("Box 772")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -1.25f, 0, -0.25f, -1.25f, 0, -0.25f, -1.25f, -2.25f, 0, -1.25f, -2, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(50.625f, -22.5f, 1).setRotationAngle(0, 0, 0).setName("Box 773")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(52.625f, -19.63f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 760")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -1.8f, -0.5f, -0.25f, -0.75f, -0.5f, -0.7f, -0.75f, -0.5f, -0.7f, -1.8f, -0.5f, -0.25f, -2, 0, 0.1f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -2, 0, 0.1f)
			.setRotationPoint(52.125f, -19.63f, -1).setRotationAngle(0, 0, 0).setName("Box 762")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f)
			.setRotationPoint(52.625f, -21.13f, -1).setRotationAngle(0, 0, 0).setName("Box 764")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -1.2f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -1.3f, 0, -0.25f, -0.25f, 0, -0.7f, -0.25f, 0, -0.7f, -1.3f, 0, -0.25f)
			.setRotationPoint(52.625f, -21.13f, -1).setRotationAngle(0, 0, 0).setName("Box 765")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.8f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.25f, 0, -0.7f, -1.3f, 0, -0.25f, -1.3f, 0, -0.25f, -0.25f, 0, -0.7f)
			.setRotationPoint(52.625f, -21.13f, -1).setRotationAngle(0, 0, 0).setName("Box 766")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.75f, -0.5f, -0.7f, -1.8f, -0.5f, -0.25f, -1.8f, -0.5f, -0.25f, -0.75f, -0.5f, -0.7f, -0.4f, 0, -0.5f, -2, 0, 0.1f, -2, 0, 0.1f, -0.4f, 0, -0.5f)
			.setRotationPoint(52.125f, -19.63f, -1).setRotationAngle(0, 0, 0).setName("Box 767")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0.5f, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0.5f, 0)
			.setRotationPoint(51.875f, -21.13f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1470")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -3.375f, -1, -0.75f, -3.375f, -1, -0.75f, -3.375f, 0.75f, 0, -3.375f, 0.75f, 0, 0, 2.5f, -0.25f, 0, 2.25f, -0.25f, 0, 0.75f, 0, 0, 0.75f)
			.setRotationPoint(50.625f, -25.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 769")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -3.375f, 0.75f, -0.75f, -3.375f, 0.75f, -0.75f, -3.375f, -1, 0, -3.375f, -1, 0, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, 2.25f, 0, 0, 2.5f)
			.setRotationPoint(50.625f, -25.25f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 769cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f, -0.125f)
			.setRotationPoint(50.5f, -21.875f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 705cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-28.375f, -13.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 810")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -4, 0.5f, 0, 3.75f, 0.5f, 0, 3.75f, 0.5f, -0.5f, -4, 0.5f, -0.5f)
			.setRotationPoint(-9.875f, -12.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 812")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-5.875f, -10.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1071")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0.5f, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.375f, -13.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 403")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, -0.5f, 0, 0, -4, 0.5f, -0.5f, 3.75f, 0.5f, -0.5f, 3.75f, 0.5f, 0, -4, 0.5f, 0)
			.setRotationPoint(-9.875f, -12.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 404")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-5.875f, -10.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 406")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-28.875f, -18.25f, 9).setRotationAngle(0, 0, 0).setName("Box 686")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-28.875f, -18.25f, -10).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-28.875f, -18.25f, -10).setRotationAngle(0, 0, 0).setName("Box 688")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-28.875f, -18.25f, 9).setRotationAngle(0, 0, 0).setName("Box 686cp")
		);
		groups.add(clipboard);
	}

	ModelBlombergB truck = new ModelBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.modID,"textures/trains/bogies/BlombergB_bogie.png"));
		GL11.glTranslatef(-2.0234375f,0,0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glTranslatef(4.0625f, 0, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
