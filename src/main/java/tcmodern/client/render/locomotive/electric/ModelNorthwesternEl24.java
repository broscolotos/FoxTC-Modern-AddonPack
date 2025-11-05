//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.electric;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.locomotive.bogies.ModelNorthwesternEl24Bogie;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNorthwesternEl24 extends FVTMFormatBase {

	public ModelNorthwesternEl24(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("BigFish496");
		//
		initGroup_clipboard0();
		initGroup_clipboard1();
		initGroup_clipboard2();
		initGroup_clipboard3();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_clipboard0(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(56.25f, -9.375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(55.5f, -8.25f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(55.75f, -6.875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(54.375f, -4.75f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(55.25f, -9.375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(55.25f, -4.5f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(55.75f, -2.75f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0.875f, 0, -0.4375f, 0.875f, -0.75f, 0, 0, -0.75f, -0.125f, -0.875f, 0, -0.25f, -1.875f, 0, -0.25f, -1.875f, -0.75f, -0.125f, -0.875f, -0.75f)
			.setRotationPoint(55.5f, -7.125f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(55.5f, -7.125f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(55.5f, -3, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51.25f, -9.625f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, -0.375f, 0, -0.75f, 0, -0.625f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(50.75f, -9.625f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, -0.625f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(50.75f, -9.125f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.125f, -0.75f, -0.375f, -0.75f, 0, -0.5f, -1, 0, -0.5f, -1, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(50.75f, -1.625f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(51.25f, -1.625f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(54.375f, -2.5f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(52.875f, -2.5f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f)
			.setRotationPoint(53, -8.5f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f)
			.setRotationPoint(54.5f, -8.5f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f)
			.setRotationPoint(52.625f, -8.5f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f)
			.setRotationPoint(54.125f, -8.5f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(54.375f, -9.375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(52.875f, -9.375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f)
			.setRotationPoint(52.875f, -8.75f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f)
			.setRotationPoint(54.375f, -8.75f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(53.875f, -8.25f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(52.25f, -8.25f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(51.75f, -7.125f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(55, -7.125f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(51.75f, -3, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(55, -3, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51, -4.75f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(53.875f, -6.875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(53.875f, -2.75f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(52.5f, -6.875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(52.5f, -2.75f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(52.25f, -7.125f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(52.25f, -3, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51, -8.25f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(52, -9.375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51, -2.75f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51, -6.875f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(52, -4.5f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(53.625f, -9.375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, -0.75f, 0, 0.375f, -0.75f)
			.setRotationPoint(53.625f, -4, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(54.125f, -5.25f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(53.125f, -5.25f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(53.375f, -5.25f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0.125f, 0, -0.875f, 0.125f, -0.75f, 0, 0, -0.75f, -0.9375f, 0.1875f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, -0.75f, -0.9375f, 0.1875f, -0.75f)
			.setRotationPoint(54.125f, -4, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.125f, 0.125f, -0.75f, 0.8125f, 0.0625f, 0, -1.6875f, 0.1875f, 0, -1.6875f, 0.1875f, -0.75f, 0.8125f, 0.0625f, -0.75f)
			.setRotationPoint(53.125f, -4, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.1875f, 0.1875f, 0, 0.3125f, 0.0625f, 0, 0.3125f, 0.0625f, -0.75f, -1.1875f, 0.1875f, -0.75f, -0.25f, 0.125f, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, -0.75f, -0.25f, 0.125f, -0.75f)
			.setRotationPoint(53.875f, -6.375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.0625f, 0.0625f, 0, -1.9375f, 0.1875f, 0, -1.9375f, 0.1875f, -0.75f, 1.0625f, 0.0625f, -0.75f, 0.125f, 0.25f, 0, -1, 0.125f, 0, -1, 0.125f, -0.75f, 0.125f, 0.25f, -0.75f)
			.setRotationPoint(53.375f, -6.375f, -10.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(56.25f, -9.375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(55.5f, -8.25f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(55.75f, -6.875f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(54.375f, -4.75f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(55.25f, -9.375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(55.25f, -4.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(55.75f, -2.75f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0.875f, 0, -0.4375f, 0.875f, -0.75f, 0, 0, -0.75f, -0.125f, -0.875f, 0, -0.25f, -1.875f, 0, -0.25f, -1.875f, -0.75f, -0.125f, -0.875f, -0.75f)
			.setRotationPoint(55.5f, -7.125f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(55.5f, -7.125f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(55.5f, -3, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51.25f, -9.625f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, -0.375f, 0, -0.75f, 0, -0.625f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(50.75f, -9.625f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, -0.625f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(50.75f, -9.125f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.125f, -0.75f, -0.375f, -0.75f, 0, -0.5f, -1, 0, -0.5f, -1, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(50.75f, -1.625f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f)
			.setRotationPoint(51.25f, -1.625f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(54.375f, -2.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(52.875f, -2.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f)
			.setRotationPoint(53, -8.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f)
			.setRotationPoint(54.5f, -8.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f)
			.setRotationPoint(52.625f, -8.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f)
			.setRotationPoint(54.125f, -8.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(54.375f, -9.375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(52.875f, -9.375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f)
			.setRotationPoint(52.875f, -8.75f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f)
			.setRotationPoint(54.375f, -8.75f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(53.875f, -8.25f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(52.25f, -8.25f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(51.75f, -7.125f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(55, -7.125f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(51.75f, -3, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(55, -3, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51, -4.75f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(53.875f, -6.875f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(53.875f, -2.75f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(52.5f, -6.875f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(52.5f, -2.75f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(52.25f, -7.125f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(52.25f, -3, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51, -8.25f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(52, -9.375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51, -2.75f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(51, -6.875f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(52, -4.5f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(53.625f, -9.375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, -0.75f, 0, 0.375f, -0.75f)
			.setRotationPoint(53.625f, -4, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(54.125f, -5.25f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(53.125f, -5.25f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(53.375f, -5.25f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0.125f, 0, -0.875f, 0.125f, -0.75f, 0, 0, -0.75f, -0.9375f, 0.1875f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, -0.75f, -0.9375f, 0.1875f, -0.75f)
			.setRotationPoint(54.125f, -4, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.125f, 0.125f, -0.75f, 0.8125f, 0.0625f, 0, -1.6875f, 0.1875f, 0, -1.6875f, 0.1875f, -0.75f, 0.8125f, 0.0625f, -0.75f)
			.setRotationPoint(53.125f, -4, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.1875f, 0.1875f, 0, 0.3125f, 0.0625f, 0, 0.3125f, 0.0625f, -0.75f, -1.1875f, 0.1875f, -0.75f, -0.25f, 0.125f, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, -0.75f, -0.25f, 0.125f, -0.75f)
			.setRotationPoint(53.875f, -6.375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.0625f, 0.0625f, 0, -1.9375f, 0.1875f, 0, -1.9375f, 0.1875f, -0.75f, 1.0625f, 0.0625f, -0.75f, 0.125f, 0.25f, 0, -1, 0.125f, 0, -1, 0.125f, -0.75f, 0.125f, 0.25f, -0.75f)
			.setRotationPoint(53.375f, -6.375f, 10.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 180, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.75f, 0.75f, 3, new Vec3f(-0.125, 0.0, 0.0))
			.setRotationPoint(58.609375f, -2.625f, 4.75f).setRotationAngle(0, -14, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.5f, 2.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -1, 0.25f, 0)
			.setRotationPoint(54.5f, 1.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 22, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(50.75f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(57.375f, 0, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0.125f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.375f, 0, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.375f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, -0.5f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.375f, 0, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(52.875f, 0.875f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(54.375f, 0.875f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(52.875f, 0.875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(54.375f, 0.875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(52.9375f, 1.875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.875f, 0.0625f, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(54.4375f, 1.875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f)
			.setRotationPoint(52.9375f, 2.125f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0.25f, 0.5f, 0, -1.125f, 0.5f, 0, -1.125f, 0.5f, -0.75f, 0.25f, 0.5f, -0.75f)
			.setRotationPoint(54.4375f, 2.125f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f)
			.setRotationPoint(52.9375f, 2.125f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0.25f, 0.5f, 0, -1.125f, 0.5f, 0, -1.125f, 0.5f, -0.75f, 0.25f, 0.5f, -0.75f)
			.setRotationPoint(54.4375f, 2.125f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(52.9375f, 1.875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(54.4375f, 1.875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.4375f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, -0.75f, -0.125f, -0.4375f, -0.75f)
			.setRotationPoint(54.1875f, 3.625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.4375f, 0, -1, -0.4375f, 0, -1, -0.4375f, -0.75f, 0.125f, -0.4375f, -0.75f)
			.setRotationPoint(53.1875f, 3.625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.4375f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, -0.75f, -0.125f, -0.4375f, -0.75f)
			.setRotationPoint(54.1875f, 3.625f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.4375f, 0, -1, -0.4375f, 0, -1, -0.4375f, -0.75f, 0.125f, -0.4375f, -0.75f)
			.setRotationPoint(53.1875f, 3.625f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.8125f, 0, -1, -0.75f, 0, -1, -0.75f, -0.75f, 0.125f, -0.8125f, -0.75f)
			.setRotationPoint(54.3125f, 4.1875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(53.0625f, 4.1875f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.8125f, 0, -1, -0.75f, 0, -1, -0.75f, -0.75f, 0.125f, -0.8125f, -0.75f)
			.setRotationPoint(54.3125f, 4.1875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(53.0625f, 4.1875f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, -0.75f, 0, 0, -0.75f, -0.125f, -0.875f, 0, -0.8125f, -1, 0, -0.8125f, -1, -0.75f, -0.125f, -0.875f, -0.75f)
			.setRotationPoint(53.1875f, 4.4375f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.0625f, -0.75f, 0.0625f, -1, 0, -1, -0.875f, 0, -1, -0.875f, -0.75f, 0.0625f, -1, -0.75f)
			.setRotationPoint(54.1875f, 4.4375f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, -0.75f, 0, 0, -0.75f, -0.125f, -0.875f, 0, -0.8125f, -1, 0, -0.8125f, -1, -0.75f, -0.125f, -0.875f, -0.75f)
			.setRotationPoint(53.1875f, 4.4375f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.0625f, -0.75f, 0.0625f, -1, 0, -1, -0.875f, 0, -1, -0.875f, -0.75f, 0.0625f, -1, -0.75f)
			.setRotationPoint(54.1875f, 4.4375f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, -0.75f, 0.0625f, -0.875f, -0.75f)
			.setRotationPoint(53.375f, 4.4375f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, -0.75f, 0.0625f, -0.875f, -0.75f)
			.setRotationPoint(53.375f, 4.4375f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(57, -10, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(57, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(57.03125f, -9.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(57.03125f, -4.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(57.03125f, -1.5625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(57.03125f, -9.75f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(57.03125f, -4.75f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(57.03125f, -1.5625f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(57.03125f, -8.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(57.03125f, -8.25f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(57, -17.5f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(57, -17.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(58.625f, -17.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(58.625f, -17.5f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1.0625f, 0, 0, -1.0625f, 0, 0, -0.6875f, 0, -0.75f, -0.6875f, 0, -0.75f, 0.25f, -0.125f, 0, 0.25f, -0.125f)
			.setRotationPoint(58.6875f, -9.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.0625f, 0.5f, -0.75f, -1.0625f, 0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0.375f, -0.75f, 0.25f, 0.375f, -0.75f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(58.6875f, -9.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.8125f, 0.125f, -0.75f, -0.8125f, 0.125f, -0.75f, -0.25f, -0.3125f, 0, -0.25f, -0.3125f)
			.setRotationPoint(58.6875f, -8.6875f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.1875f, -0.75f, -0.25f, 0.1875f, -0.75f, -0.8125f, -0.375f, 0, -0.8125f, -0.375f)
			.setRotationPoint(58.6875f, -8.6875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1.0625f, 0, 0, -1.0625f, 0, 0, -0.6875f, 0, -0.75f, -0.6875f, 0, -0.75f, 0.25f, -0.125f, 0, 0.25f, -0.125f)
			.setRotationPoint(58.6875f, -6.875f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.0625f, 0.5f, -0.75f, -1.0625f, 0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0.375f, -0.75f, 0.25f, 0.375f, -0.75f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(58.6875f, -6.875f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.8125f, 0.125f, -0.75f, -0.8125f, 0.125f, -0.75f, -0.25f, -0.3125f, 0, -0.25f, -0.3125f)
			.setRotationPoint(58.6875f, -5.8125f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.1875f, -0.75f, -0.25f, 0.1875f, -0.75f, -0.8125f, -0.375f, 0, -0.8125f, -0.375f)
			.setRotationPoint(58.6875f, -5.8125f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1.0625f, 0, 0, -1.0625f, 0, 0, -0.6875f, 0, -0.75f, -0.6875f, 0, -0.75f, 0.25f, -0.125f, 0, 0.25f, -0.125f)
			.setRotationPoint(58.6875f, -4.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.0625f, 0.5f, -0.75f, -1.0625f, 0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0.375f, -0.75f, 0.25f, 0.375f, -0.75f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f)
			.setRotationPoint(58.6875f, -4.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.8125f, 0.125f, -0.75f, -0.8125f, 0.125f, -0.75f, -0.25f, -0.3125f, 0, -0.25f, -0.3125f)
			.setRotationPoint(58.6875f, -3.6875f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.1875f, -0.75f, -0.25f, 0.1875f, -0.75f, -0.8125f, -0.375f, 0, -0.8125f, -0.375f)
			.setRotationPoint(58.6875f, -3.6875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(59, -8.375f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, 0.3125f, 0, -0.75f, 0.3125f)
			.setRotationPoint(58.6875f, -8.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.75f, -0.625f, 0.25f, 0, -0.625f, 0.25f)
			.setRotationPoint(58.6875f, -8.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, 0.3125f, 0, -0.75f, 0.3125f)
			.setRotationPoint(58.6875f, -5.3125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.75f, -0.625f, 0.25f, 0, -0.625f, 0.25f)
			.setRotationPoint(58.6875f, -5.3125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, 0.3125f, 0, -0.75f, 0.3125f)
			.setRotationPoint(58.6875f, -3.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.75f, -0.625f, 0.25f, 0, -0.625f, 0.25f)
			.setRotationPoint(58.6875f, -3.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.28125f, 0, 0, -1.03125f, 0, 0, -0.75f, 0, 0.1875f, 0, 0, 0.1875f, 0.28125f, -0.75f, 0, -1.03125f, -0.75f, 0, -0.75f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f)
			.setRotationPoint(58.6875f, -6.875f, -4.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.28125f, 0, 0, -1.03125f, 0, 0, -0.75f, 0, 0.1875f, 0, 0, 0.1875f, 0.28125f, -0.75f, 0, -1.03125f, -0.75f, 0, -0.75f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f)
			.setRotationPoint(58.6875f, -2.75f, -4.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.28125f, 0, 0, -0.46875f, 0, 0, -0.75f, 0, 0.1875f, 0, 0, 0.1875f, -0.28125f, -0.75f, 0, -0.46875f, -0.75f, 0, -0.75f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f)
			.setRotationPoint(58.40625f, -6.875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.28125f, 0, 0, -0.46875f, 0, 0, -0.75f, 0, 0.1875f, 0, 0, 0.1875f, -0.28125f, -0.75f, 0, -0.46875f, -0.75f, 0, -0.75f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f)
			.setRotationPoint(58.40625f, -2.75f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.34375f, 0, 0, -1.09375f, 0, 0, -0.75f, 0, 0.4375f, 0, 0, 0.4375f, 0.34375f, -0.75f, 0, -1.09375f, -0.75f, 0, -0.75f, -0.75f, 0.4375f, 0, -0.75f, 0.4375f)
			.setRotationPoint(58.6875f, -8.25f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.34375f, 0, 0, -1.09375f, 0, 0, -0.75f, 0, 0.4375f, 0, 0, 0.4375f, 0.34375f, -0.75f, 0, -1.09375f, -0.75f, 0, -0.75f, -0.75f, 0.4375f, 0, -0.75f, 0.4375f)
			.setRotationPoint(58.6875f, -4.75f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, 0, 0, -0.40625f, 0, 0, -0.75f, 0, 0.4375f, 0, 0, 0.4375f, -0.34375f, -0.75f, 0, -0.40625f, -0.75f, 0, -0.75f, -0.75f, 0.4375f, 0, -0.75f, 0.4375f)
			.setRotationPoint(58.34375f, -8.25f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, 0, 0, -0.40625f, 0, 0, -0.75f, 0, 0.4375f, 0, 0, 0.4375f, -0.34375f, -0.75f, 0, -0.40625f, -0.75f, 0, -0.75f, -0.75f, 0.4375f, 0, -0.75f, 0.4375f)
			.setRotationPoint(58.34375f, -4.75f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, -0.25f, 0, -0.78125f, -0.25f, 0, -0.71875f, -0.25f, -0.75f, -0.03125f, -0.25f, -0.75f)
			.setRotationPoint(58.3125f, -9.375f, -5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, -0.25f, 0, -0.71875f, -0.25f, 0, -0.78125f, -0.25f, -0.75f, 0.03125f, -0.25f, -0.75f)
			.setRotationPoint(58.3125f, -9.375f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, -0.25f, 0, -0.78125f, -0.25f, 0, -0.71875f, -0.25f, -0.75f, -0.03125f, -0.25f, -0.75f)
			.setRotationPoint(57.3125f, -9.375f, -9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, -0.25f, 0, -0.71875f, -0.25f, 0, -0.78125f, -0.25f, -0.75f, 0.03125f, -0.25f, -0.75f)
			.setRotationPoint(57.3125f, -9.375f, 8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.6875f, -0.25f, -0.75f, -0.0625f, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.6875f, -0.5f, -0.75f, -0.0625f, -0.5f, -0.75f)
			.setRotationPoint(57.34375f, -7.125f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(57.28125f, -7.125f, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.6875f, -0.25f, -0.75f, -0.0625f, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.6875f, -0.5f, -0.75f, -0.0625f, -0.5f, -0.75f)
			.setRotationPoint(57.34375f, -3, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(57.28125f, -3, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.0625f, -0.25f, 0, -0.6875f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57.21875f, -7.125f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.0625f, -0.25f, 0, -0.6875f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57.21875f, -3, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.8125f, -0.25f, -0.75f, 0.0625f, -0.25f, -0.75f)
			.setRotationPoint(57.40625f, -7.125f, 8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.8125f, -0.25f, -0.75f, 0.0625f, -0.25f, -0.75f)
			.setRotationPoint(57.40625f, -3, 8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.0625f, -0.25f, 0, -0.6875f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(58.21875f, -7.125f, 5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.0625f, -0.25f, 0, -0.6875f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(58.21875f, -3, 5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.8125f, -0.25f, -0.75f, 0.0625f, -0.25f, -0.75f)
			.setRotationPoint(58.40625f, -7.125f, 4.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.8125f, -0.25f, -0.75f, 0.0625f, -0.25f, -0.75f)
			.setRotationPoint(58.40625f, -3, 4.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.6875f, -0.25f, -0.75f, -0.0625f, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.6875f, -0.5f, -0.75f, -0.0625f, -0.5f, -0.75f)
			.setRotationPoint(58.34375f, -7.125f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(58.28125f, -7.125f, -5.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.6875f, -0.25f, -0.75f, -0.0625f, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.6875f, -0.5f, -0.75f, -0.0625f, -0.5f, -0.75f)
			.setRotationPoint(58.34375f, -3, -4.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.5f, 0, -0.8125f, -0.5f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(58.28125f, -3, -5.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.625f, 0, 0, 1, 0, -0.375f, -1.625f, 0, -0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0, 1, -0.625f, -0.375f, -1.625f, -0.625f, -0.375f)
			.setRotationPoint(57, -9.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.625f, 0, 0, 1, 0, -0.375f, -1.625f, 0, -0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0, 1, -0.625f, -0.375f, -1.625f, -0.625f, -0.375f)
			.setRotationPoint(57, -1.625f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -1.625f, 0, 0, 1, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, -1.625f, -0.625f, 0, 1, -0.625f, 0, -0.625f, -0.625f, -0.375f, 0, -0.625f, -0.375f)
			.setRotationPoint(57, -9.75f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -1.625f, 0, 0, 1, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, -1.625f, -0.625f, 0, 1, -0.625f, 0, -0.625f, -0.625f, -0.375f, 0, -0.625f, -0.375f)
			.setRotationPoint(57, -1.625f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 133, textureX, textureY)
			.addShapeBox(-1.1875f, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.875f, -0.0625f, 0, -0.875f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, -0.875f, -0.0625f, -0.875f, -0.875f)
			.setRotationPoint(57.75f, -10.953125f, -5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 133, textureX, textureY)
			.addShapeBox(-1.1875f, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.875f, -0.0625f, 0, -0.875f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, -0.875f, -0.0625f, -0.875f, -0.875f)
			.setRotationPoint(57.74f, -10.953125f, -4.91625f).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 133, textureX, textureY)
			.addShapeBox(-1.1875f, 0, 0, 2, 1, 1, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.875f, -0.0625f, 0, -0.875f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, -0.875f, -0.0625f, -0.875f, -0.875f)
			.setRotationPoint(57.64625f, -10.953125f, -5.1775f).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 133, textureX, textureY)
			.addShapeBox(0, 0, -0.1875f, 1, 1, 2, 0, 0, 0, -0.0625f, -0.875f, 0, -0.0625f, -0.875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.875f, -0.0625f, -0.875f, -0.875f, -0.0625f, -0.875f, -0.875f, -0.0625f, 0, -0.875f, -0.0625f)
			.setRotationPoint(57.5f, -10.953125f, -5.796875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 177, textureX, textureY).addCylinder(0, 0, 0, 1, 11, 8, 0.1875f, 0.1875f, 4, null)
			.setRotationPoint(57.5625f, -11, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.21875f, 0, 0, -0.96875f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0.21875f, -0.75f, 0, -0.96875f, -0.75f, 0, -0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f)
			.setRotationPoint(57.28125f, -8.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.21875f, 0, 0, -0.96875f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0.21875f, -0.75f, 0, -0.96875f, -0.75f, 0, -0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f)
			.setRotationPoint(57.28125f, -4.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.21875f, 0, 0, -0.53125f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.21875f, -0.75f, 0, -0.53125f, -0.75f, 0, -0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f)
			.setRotationPoint(57.0625f, -8.25f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.21875f, 0, 0, -0.53125f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.21875f, -0.75f, 0, -0.53125f, -0.75f, 0, -0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f)
			.setRotationPoint(57.0625f, -4.75f, 9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.15625f, 0, 0, -0.90625f, 0, 0, -0.75f, 0, -0.3125f, 0, 0, -0.3125f, 0.15625f, -0.75f, 0, -0.90625f, -0.75f, 0, -0.75f, -0.75f, -0.3125f, 0, -0.75f, -0.3125f)
			.setRotationPoint(57.21875f, -6.875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.15625f, 0, 0, -0.90625f, 0, 0, -0.75f, 0, -0.3125f, 0, 0, -0.3125f, 0.15625f, -0.75f, 0, -0.90625f, -0.75f, 0, -0.75f, -0.75f, -0.3125f, 0, -0.75f, -0.3125f)
			.setRotationPoint(57.21875f, -2.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.90625f, 0, -0.3125f, 0.15625f, 0, -0.3125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.90625f, -0.75f, -0.3125f, 0.15625f, -0.75f, -0.3125f)
			.setRotationPoint(57.21875f, -6.875f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.90625f, 0, -0.3125f, 0.15625f, 0, -0.3125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.90625f, -0.75f, -0.3125f, 0.15625f, -0.75f, -0.3125f)
			.setRotationPoint(57.21875f, -2.75f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0.125f, 0, -0.78125f, 0.125f, 0, -0.71875f, 0.125f, -0.75f, -0.03125f, 0.125f, -0.75f)
			.setRotationPoint(57.5625f, -9.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0.125f, 0, -0.78125f, 0.125f, 0, -0.71875f, 0.125f, -0.75f, -0.03125f, 0.125f, -0.75f)
			.setRotationPoint(58.0625f, -9.375f, -6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0.125f, 0, -0.71875f, 0.125f, 0, -0.78125f, 0.125f, -0.75f, 0.03125f, 0.125f, -0.75f)
			.setRotationPoint(57.5625f, -9.375f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0.125f, 0, -0.71875f, 0.125f, 0, -0.78125f, 0.125f, -0.75f, 0.03125f, 0.125f, -0.75f)
			.setRotationPoint(58.0625f, -9.375f, 5.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0.375f, 0, -0.78125f, 0.375f, 0, -0.71875f, 0.375f, -0.75f, -0.03125f, 0.375f, -0.75f)
			.setRotationPoint(57.8125f, -4, -7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0.375f, 0, -0.71875f, 0.375f, 0, -0.78125f, 0.375f, -0.75f, 0.03125f, 0.375f, -0.75f)
			.setRotationPoint(57.8125f, -4, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, -0.125f, 0, -0.78125f, -0.125f, 0, -0.71875f, -0.125f, -0.75f, -0.03125f, -0.125f, -0.75f)
			.setRotationPoint(57.5625f, -2.5f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, -0.125f, 0, -0.78125f, -0.125f, 0, -0.71875f, -0.125f, -0.75f, -0.03125f, -0.125f, -0.75f)
			.setRotationPoint(58.0625f, -2.5f, -6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, -0.125f, 0, -0.71875f, -0.125f, 0, -0.78125f, -0.125f, -0.75f, 0.03125f, -0.125f, -0.75f)
			.setRotationPoint(57.5625f, -2.5f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, -0.125f, 0, -0.71875f, -0.125f, 0, -0.78125f, -0.125f, -0.75f, 0.03125f, -0.125f, -0.75f)
			.setRotationPoint(58.0625f, -2.5f, 5.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.375f, -0.75f, 0.5f, -0.375f, -0.75f, 0.5f)
			.setRotationPoint(57.40625f, -6.875f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.375f, -0.75f, 0.5f, -0.375f, -0.75f, 0.5f)
			.setRotationPoint(57.40625f, -2.75f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.375f, -0.75f, 0.5f, -0.375f, -0.75f, 0.5f)
			.setRotationPoint(57.84375f, -6.875f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.375f, -0.75f, 0.5f, -0.375f, -0.75f, 0.5f)
			.setRotationPoint(57.84375f, -2.75f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(57.84375f, -6.875f, 5.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(57.84375f, -2.75f, 5.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(57.40625f, -6.875f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(57.40625f, -2.75f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.40625f, 0, 0.25f, -0.34375f, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.40625f, -0.75f, 0.25f, -0.34375f, -0.75f, 0.25f)
			.setRotationPoint(57.9375f, -4.75f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.40625f, 0, 0.25f, -0.34375f, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.40625f, -0.75f, 0.25f, -0.34375f, -0.75f, 0.25f)
			.setRotationPoint(57.34375f, -4.75f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, 0, 0, -0.40625f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, -0.34375f, -0.75f, 0, -0.40625f, -0.75f, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(57.9375f, -4.75f, 5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, 0, 0, -0.40625f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, -0.34375f, -0.75f, 0, -0.40625f, -0.75f, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(57.34375f, -4.75f, 7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.59375f, -0.25f, -0.75f, -0.03125f, -0.25f, -0.75f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.59375f, 0, -0.75f, -0.03125f, 0, -0.75f)
			.setRotationPoint(57.84375f, -5.25f, -6.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.03125f, -0.25f, 0, -0.65625f, -0.25f, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0.03125f, 0, 0, -0.65625f, 0, 0, -0.625f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(57.65625f, -5.25f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.65625f, -0.25f, -0.75f, 0.03125f, -0.25f, -0.75f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.65625f, 0, -0.75f, 0.03125f, 0, -0.75f)
			.setRotationPoint(57.65625f, -5.25f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.25f, 0, -0.59375f, -0.25f, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, -0.03125f, 0, 0, -0.59375f, 0, 0, -0.625f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(57.84375f, -5.25f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.09375f, 0, 0, -0.71875f, 0, 0, -0.53125f, 0, -0.25f, -0.09375f, 0, -0.25f, 0.09375f, 0.25f, 0, -0.71875f, 0.25f, 0, -0.53125f, 0.25f, -0.25f, -0.09375f, 0.25f, -0.25f)
			.setRotationPoint(57.75f, -5.25f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.09375f, 0, 0, -0.53125f, 0, 0, -0.71875f, 0, -0.25f, 0.09375f, 0, -0.25f, -0.09375f, 0.25f, 0, -0.53125f, 0.25f, 0, -0.71875f, 0.25f, -0.25f, 0.09375f, 0.25f, -0.25f)
			.setRotationPoint(57.75f, -5.25f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.328125f, 0.1875f, -1.3125f, -0.421875f, 0.1875f, -1.3125f, -0.390625f, 0.0625f, 0.4375f, -0.359375f, 0.0625f, 0.4375f, 0, 0.1875f, -0.0625f, -0.75f, 0.1875f, -0.0625f, -0.75f, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f)
			.setRotationPoint(57.90625f, -6.375f, -6.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -1.0625f, -0.75f, 0.1875f, -1.0625f, -0.75f, 0.0625f, 0.1875f, 0, 0.0625f, 0.1875f, 0.359375f, 0.0625f, 0.1875f, -1.109375f, 0.0625f, 0.1875f, -1.078125f, 0.1875f, -1.0625f, 0.328125f, 0.1875f, -1.0625f)
			.setRotationPoint(57.71875f, -4, -8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.328125f, 0.1875f, -1.3125f, -1.078125f, 0.1875f, -1.3125f, -1.109375f, 0.0625f, 0.4375f, 0.359375f, 0.0625f, 0.4375f, 0, 0.1875f, -0.0625f, -0.75f, 0.1875f, -0.0625f, -0.75f, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f)
			.setRotationPoint(57.71875f, -6.375f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1875f, -1.0625f, -0.75f, 0.1875f, -1.0625f, -0.75f, 0.0625f, 0.1875f, 0, 0.0625f, 0.1875f, -0.359375f, 0.0625f, 0.1875f, -0.390625f, 0.0625f, 0.1875f, -0.421875f, 0.1875f, -1.0625f, -0.328125f, 0.1875f, -1.0625f)
			.setRotationPoint(57.90625f, -4, 5.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.359375f, 0.1875f, 0.9375f, -1.109375f, 0.1875f, 0.9375f, -1.078125f, 0.3125f, -1.8125f, 0.328125f, 0.3125f, -1.8125f, 0, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f, -0.75f, 0.0625f, -0.5625f, 0, 0.0625f, -0.5625f)
			.setRotationPoint(57.71875f, -6.25f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3125f, 0.0625f, 0.9375f, -1.0625f, 0.0625f, 0.9375f, -1.0625f, 0.1875f, -1.8125f, 0.3125f, 0.1875f, -1.8125f, 0, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f, -0.71875f, 0.0625f, -0.5625f, -0.03125f, 0.0625f, -0.5625f)
			.setRotationPoint(58.234375f, -4, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0.0625f, 0.9375f, -0.375f, 0.0625f, 0.9375f, -0.375f, 0.1875f, -1.8125f, -0.375f, 0.1875f, -1.8125f, -0.0625f, 0.1875f, -0.3125f, -0.6875f, 0.1875f, -0.3125f, -0.71875f, 0.0625f, -0.5625f, -0.03125f, 0.0625f, -0.5625f)
			.setRotationPoint(57.328125f, -4, 8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.328125f, 0.1875f, 0.9375f, -0.421875f, 0.1875f, 0.9375f, -0.453125f, 0.3125f, -1.8125f, -0.296875f, 0.3125f, -1.8125f, 0, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f, -0.75f, 0.0625f, -0.5625f, 0, 0.0625f, -0.5625f)
			.setRotationPoint(57.9375f, -6.25f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0.125f, 0, -0.78125f, 0.125f, 0, -0.71875f, 0.125f, -0.75f, -0.03125f, 0.125f, -0.75f)
			.setRotationPoint(57.8125f, -9.375f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0.125f, 0, -0.71875f, 0.125f, 0, -0.78125f, 0.125f, -0.75f, 0.03125f, 0.125f, -0.75f)
			.setRotationPoint(57.8125f, -9.375f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.3125f, 0, -0.25f, -0.4375f, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.3125f, -0.75f, -0.25f, -0.4375f, -0.75f, -0.25f)
			.setRotationPoint(57.84375f, -8.25f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.3125f, 0, -0.25f, -0.4375f, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.3125f, -0.75f, -0.25f, -0.4375f, -0.75f, -0.25f)
			.setRotationPoint(57.34375f, -8.25f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, 0, 0, -0.3125f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, -0.4375f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(57.84375f, -8.25f, 5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, 0, 0, -0.3125f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, -0.4375f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(57.34375f, -8.25f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 175, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.8125f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(57.5625f, -11, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 175, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 3, new Vec3f(0.25, 0.0, 0.0))
			.setRotationPoint(51, -5.25f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-57.25f, -9.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.125f, -0.75f, 0)
			.setRotationPoint(-56.375f, -4.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-56.25f, -4.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-56.75f, -2.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-56.5f, -3, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-51.75f, -9.125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.25f, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, 0, -0.75f, 0.25f, 0, -0.5f, -1, -0.75f, -0.375f, -0.75f, -0.75f, -0.375f, -0.75f, 0, -0.5f, -1, 0)
			.setRotationPoint(-51.75f, -1.625f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.125f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-57.25f, -1.625f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-55.375f, -2.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-53.875f, -2.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-52.75f, -3, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-56, -3, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-54.875f, -2.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-53.5f, -2.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-53.25f, -3, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-52, -2.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-53, -4.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, 0, -0.75f, 0.375f, 0)
			.setRotationPoint(-54.625f, -4, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, -0.75f, 0, 0)
			.setRotationPoint(-55.125f, -5.25f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-54.375f, -5.25f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0.125f, 0, 0.0625f, 0.0625f, -0.75f, -0.9375f, 0.1875f, -0.75f, -0.9375f, 0.1875f, 0, 0.0625f, 0.0625f, 0)
			.setRotationPoint(-55.125f, -4, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f, 0, -0.75f, 0, 0, -1.6875f, 0.1875f, -0.75f, 0.8125f, 0.0625f, -0.75f, 0.8125f, 0.0625f, 0, -1.6875f, 0.1875f, 0)
			.setRotationPoint(-54.125f, -4, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61.5f, 2.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 22, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0)
			.setRotationPoint(-57.75f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-59.375f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0)
			.setRotationPoint(-59.375f, 0, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-59.375f, 0, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-53.875f, 0.875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-55.375f, 0.875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, 0, -0.8125f, 0, 0, -0.875f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-53.9375f, 1.875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, 0, -0.8125f, 0, 0, -0.875f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-55.4375f, 1.875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -0.625f, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f, 0.5f, 0, -0.625f, 0.5f, 0)
			.setRotationPoint(-53.9375f, 2.125f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -1.125f, 0.5f, -0.75f, 0.25f, 0.5f, -0.75f, 0.25f, 0.5f, 0, -1.125f, 0.5f, 0)
			.setRotationPoint(-55.4375f, 2.125f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -0.75f, -0.4375f, -0.75f, -0.125f, -0.4375f, -0.75f, -0.125f, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-55.1875f, 3.625f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -1, -0.4375f, -0.75f, 0.125f, -0.4375f, -0.75f, 0.125f, -0.4375f, 0, -1, -0.4375f, 0)
			.setRotationPoint(-54.1875f, 3.625f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -1, -0.75f, -0.75f, 0.125f, -0.8125f, -0.75f, 0.125f, -0.8125f, 0, -1, -0.75f, 0)
			.setRotationPoint(-55.3125f, 4.1875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -0.75f, -0.8125f, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, 0, -0.75f, -0.8125f, 0)
			.setRotationPoint(-54.0625f, 4.1875f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0.0625f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0.0625f, 0, -0.8125f, -1, -0.75f, -0.125f, -0.875f, -0.75f, -0.125f, -0.875f, 0, -0.8125f, -1, 0)
			.setRotationPoint(-54.1875f, 4.4375f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0.0625f, -0.75f, 0, 0.0625f, 0, -0.875f, 0, 0, -1, -0.875f, -0.75f, 0.0625f, -1, -0.75f, 0.0625f, -1, 0, -1, -0.875f, 0)
			.setRotationPoint(-55.1875f, 4.4375f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.1875f, -0.875f, -0.75f, 0.0625f, -0.875f, -0.75f, 0.0625f, -0.875f, 0, -0.1875f, -0.875f, 0)
			.setRotationPoint(-54.375f, 4.4375f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-58, -10, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
			.setRotationPoint(-58, -17.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
			.setRotationPoint(-59.625f, -17.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, -0.25f, -0.75f, 0.03125f, -0.25f, -0.75f, -0.03125f, -0.25f, 0, -0.71875f, -0.25f, 0)
			.setRotationPoint(-58.3125f, -9.375f, -9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.0625f, -0.25f, 0, -0.6875f, -0.25f, 0)
			.setRotationPoint(-58.21875f, -3, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, -1.625f, 0, 0, 1, 0, 0, -0.625f, -0.625f, -0.375f, 0, -0.625f, -0.375f, -1.625f, -0.625f, 0, 1, -0.625f, 0)
			.setRotationPoint(-58, -1.625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0.375f, -0.75f, 0.03125f, 0.375f, -0.75f, -0.03125f, 0.375f, 0, -0.71875f, 0.375f, 0)
			.setRotationPoint(-58.8125f, -4, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, -0.125f, -0.75f, 0.03125f, -0.125f, -0.75f, -0.03125f, -0.125f, 0, -0.71875f, -0.125f, 0)
			.setRotationPoint(-58.5625f, -2.5f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-58.40625f, -2.75f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-56.5f, -8.25f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-56.75f, -6.875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-56.25f, -9.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0.875f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.4375f, 0.875f, 0, -0.25f, -1.875f, -0.75f, -0.125f, -0.875f, -0.75f, -0.125f, -0.875f, 0, -0.25f, -1.875f, 0)
			.setRotationPoint(-56.5f, -7.125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-56.5f, -7.125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.375f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-54, -8.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.375f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-55.5f, -8.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.875f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-53.625f, -8.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.875f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-55.125f, -8.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-55.375f, -9.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-53.875f, -9.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-53.875f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-55.375f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.375f, 0, 0, 0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.375f, -0.75f, 0)
			.setRotationPoint(-54.875f, -8.25f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.375f, 0, 0, 0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.375f, -0.75f, 0)
			.setRotationPoint(-53.25f, -8.25f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-52.75f, -7.125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-56, -7.125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-53, -4.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-54.875f, -6.875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-53.5f, -6.875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-53.25f, -7.125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-52, -8.25f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-53, -9.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-52, -6.875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0)
			.setRotationPoint(-54.625f, -9.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0.25f, 0)
			.setRotationPoint(-54.125f, -5.25f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3125f, 0.0625f, -0.75f, -1.1875f, 0.1875f, -0.75f, -1.1875f, 0.1875f, 0, 0.3125f, 0.0625f, 0, -0.625f, 0.25f, -0.75f, -0.25f, 0.125f, -0.75f, -0.25f, 0.125f, 0, -0.625f, 0.25f, 0)
			.setRotationPoint(-54.875f, -6.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.9375f, 0.1875f, -0.75f, 1.0625f, 0.0625f, -0.75f, 1.0625f, 0.0625f, 0, -1.9375f, 0.1875f, 0, -1, 0.125f, -0.75f, 0.125f, 0.25f, -0.75f, 0.125f, 0.25f, 0, -1, 0.125f, 0)
			.setRotationPoint(-54.375f, -6.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, -1, 0.25f, 0, -1, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-55.5f, 1.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.03125f, -1.5625f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, 0, -0.3125f, 0.15625f, 0, -0.3125f, 0, 0, 0, -0.75f, 0, 0, -0.90625f, -0.75f, -0.3125f, 0.15625f, -0.75f, -0.3125f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.21875f, -2.75f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-57.25f, -9.625f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.5f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-51.75f, -9.625f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.03125f, -9.75f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.03125f, -4.75f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.03125f, -8.25f, -11.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.0625f, -0.25f, 0, -0.6875f, -0.25f, 0)
			.setRotationPoint(-58.21875f, -7.125f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.8125f, -0.25f, -0.75f, 0.0625f, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-58.40625f, -7.125f, -9.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.8125f, -0.25f, -0.75f, 0.0625f, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-58.40625f, -3, -9.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, -1.625f, 0, 0, 1, 0, 0, -0.625f, -0.625f, -0.375f, 0, -0.625f, -0.375f, -1.625f, -0.625f, 0, 1, -0.625f, 0)
			.setRotationPoint(-58, -9.75f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.21875f, 0, 0, -0.53125f, 0, 0, -0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.21875f, -0.75f, 0, -0.53125f, -0.75f, 0)
			.setRotationPoint(-58.0625f, -8.25f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.21875f, 0, 0, -0.53125f, 0, 0, -0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, -0.21875f, -0.75f, 0, -0.53125f, -0.75f, 0)
			.setRotationPoint(-58.0625f, -4.75f, -10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.90625f, 0, -0.3125f, 0.15625f, 0, -0.3125f, 0, 0, 0, -0.75f, 0, 0, -0.90625f, -0.75f, -0.3125f, 0.15625f, -0.75f, -0.3125f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.21875f, -6.875f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-58.40625f, -6.875f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, -0.34375f, 0, 0, -0.40625f, 0, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.34375f, -0.75f, 0, -0.40625f, -0.75f, 0)
			.setRotationPoint(-58.34375f, -4.75f, -8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0.1875f, -1.8125f, -0.375f, 0.1875f, -1.8125f, -0.375f, 0.0625f, 0.9375f, -0.375f, 0.0625f, 0.9375f, -0.71875f, 0.0625f, -0.5625f, -0.03125f, 0.0625f, -0.5625f, -0.0625f, 0.1875f, -0.3125f, -0.6875f, 0.1875f, -0.3125f)
			.setRotationPoint(-58.328125f, -4, -9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, -0.4375f, 0, 0, -0.3125f, 0, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.4375f, -0.75f, 0, -0.3125f, -0.75f, 0)
			.setRotationPoint(-58.34375f, -8.25f, -9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.1875f, 0, 0, 0.1875f, -0.28125f, 0, 0, -0.46875f, 0, 0, -0.75f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, -0.28125f, -0.75f, 0, -0.46875f, -0.75f, 0)
			.setRotationPoint(-59.40625f, -6.875f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.1875f, 0, 0, 0.1875f, -0.28125f, 0, 0, -0.46875f, 0, 0, -0.75f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, -0.28125f, -0.75f, 0, -0.46875f, -0.75f, 0)
			.setRotationPoint(-59.40625f, -2.75f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.4375f, 0, 0, 0.4375f, -0.34375f, 0, 0, -0.40625f, 0, 0, -0.75f, -0.75f, 0.4375f, 0, -0.75f, 0.4375f, -0.34375f, -0.75f, 0, -0.40625f, -0.75f, 0)
			.setRotationPoint(-59.34375f, -8.25f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.4375f, 0, 0, 0.4375f, -0.34375f, 0, 0, -0.40625f, 0, 0, -0.75f, -0.75f, 0.4375f, 0, -0.75f, 0.4375f, -0.34375f, -0.75f, 0, -0.40625f, -0.75f, 0)
			.setRotationPoint(-59.34375f, -4.75f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, -0.25f, -0.75f, 0.03125f, -0.25f, -0.75f, -0.03125f, -0.25f, 0, -0.71875f, -0.25f, 0)
			.setRotationPoint(-59.3125f, -9.375f, -5.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.0625f, -0.25f, 0, -0.6875f, -0.25f, 0)
			.setRotationPoint(-59.21875f, -7.125f, -6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.8125f, -0.25f, -0.75f, 0.0625f, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-59.40625f, -7.125f, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0.125f, -0.75f, 0.03125f, 0.125f, -0.75f, -0.03125f, 0.125f, 0, -0.71875f, 0.125f, 0)
			.setRotationPoint(-58.5625f, -9.375f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0.125f, -0.75f, 0.03125f, 0.125f, -0.75f, -0.03125f, 0.125f, 0, -0.71875f, 0.125f, 0)
			.setRotationPoint(-59.0625f, -9.375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, -0.125f, -0.75f, 0.03125f, -0.125f, -0.75f, -0.03125f, -0.125f, 0, -0.71875f, -0.125f, 0)
			.setRotationPoint(-59.0625f, -2.5f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-58.84375f, -6.875f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-58.84375f, -2.75f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, -0.34375f, 0, 0, -0.40625f, 0, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.34375f, -0.75f, 0, -0.40625f, -0.75f, 0)
			.setRotationPoint(-58.9375f, -4.75f, -6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65625f, -0.25f, -0.75f, 0.03125f, -0.25f, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.65625f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, 0.25f, 0, -0.625f, 0.25f, 0)
			.setRotationPoint(-58.65625f, -5.25f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, -0.03125f, -0.25f, 0, -0.59375f, -0.25f, 0, -0.625f, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.03125f, 0, 0, -0.59375f, 0, 0)
			.setRotationPoint(-58.84375f, -5.25f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.71875f, 0, -0.25f, 0.09375f, 0, -0.25f, -0.09375f, 0, 0, -0.53125f, 0, 0, -0.71875f, 0.25f, -0.25f, 0.09375f, 0.25f, -0.25f, -0.09375f, 0.25f, 0, -0.53125f, 0.25f, 0)
			.setRotationPoint(-58.75f, -5.25f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.109375f, 0.0625f, 0.4375f, 0.359375f, 0.0625f, 0.4375f, 0.328125f, 0.1875f, -1.3125f, -1.078125f, 0.1875f, -1.3125f, -0.75f, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.1875f, -0.0625f, -0.75f, 0.1875f, -0.0625f)
			.setRotationPoint(-58.71875f, -6.375f, -8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.0625f, 0.1875f, 0, 0.0625f, 0.1875f, 0, 0.1875f, -1.0625f, -0.75f, 0.1875f, -1.0625f, -0.421875f, 0.1875f, -1.0625f, -0.328125f, 0.1875f, -1.0625f, -0.359375f, 0.0625f, 0.1875f, -0.390625f, 0.0625f, 0.1875f)
			.setRotationPoint(-58.90625f, -4, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.453125f, 0.3125f, -1.8125f, -0.296875f, 0.3125f, -1.8125f, -0.328125f, 0.1875f, 0.9375f, -0.421875f, 0.1875f, 0.9375f, -0.75f, 0.0625f, -0.5625f, 0, 0.0625f, -0.5625f, 0, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f)
			.setRotationPoint(-58.9375f, -6.25f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.78125f, 0, -0.75f, 0.03125f, 0, -0.75f, -0.03125f, 0, 0, -0.71875f, 0, 0, -0.78125f, 0.125f, -0.75f, 0.03125f, 0.125f, -0.75f, -0.03125f, 0.125f, 0, -0.71875f, 0.125f, 0)
			.setRotationPoint(-58.8125f, -9.375f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, -0.4375f, 0, 0, -0.3125f, 0, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.4375f, -0.75f, 0, -0.3125f, -0.75f, 0)
			.setRotationPoint(-58.84375f, -8.25f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1.0625f, 0, 0, -1.0625f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.6875f, 0, -0.75f, -0.6875f, 0)
			.setRotationPoint(-59.6875f, -9.75f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -1.0625f, 0.5f, -0.75f, -1.0625f, 0.5f, -0.75f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, 0, 0.25f, 0.375f, -0.75f, 0.25f, 0.375f)
			.setRotationPoint(-59.6875f, -9.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.8125f, 0.125f, -0.75f, -0.8125f, 0.125f)
			.setRotationPoint(-59.6875f, -8.6875f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, -0.25f, 0.1875f, -0.75f, -0.25f, 0.1875f)
			.setRotationPoint(-59.6875f, -8.6875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1.0625f, 0, 0, -1.0625f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.6875f, 0, -0.75f, -0.6875f, 0)
			.setRotationPoint(-59.6875f, -6.875f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -1.0625f, 0.5f, -0.75f, -1.0625f, 0.5f, -0.75f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, 0, 0.25f, 0.375f, -0.75f, 0.25f, 0.375f)
			.setRotationPoint(-59.6875f, -6.875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.8125f, 0.125f, -0.75f, -0.8125f, 0.125f)
			.setRotationPoint(-59.6875f, -5.8125f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, -0.25f, 0.1875f, -0.75f, -0.25f, 0.1875f)
			.setRotationPoint(-59.6875f, -5.8125f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -1.0625f, 0, 0, -1.0625f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.6875f, 0, -0.75f, -0.6875f, 0)
			.setRotationPoint(-59.6875f, -4.75f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -1.0625f, 0.5f, -0.75f, -1.0625f, 0.5f, -0.75f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, 0, 0.25f, 0.375f, -0.75f, 0.25f, 0.375f)
			.setRotationPoint(-59.6875f, -4.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.8125f, 0.125f, -0.75f, -0.8125f, 0.125f)
			.setRotationPoint(-59.6875f, -3.6875f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, -0.25f, 0.1875f, -0.75f, -0.25f, 0.1875f)
			.setRotationPoint(-59.6875f, -3.6875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.625f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-59.6875f, -8.1875f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, 0.25f, 0, -0.625f, 0.25f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f)
			.setRotationPoint(-59.6875f, -8.1875f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.625f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-59.6875f, -5.3125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, 0.25f, 0, -0.625f, 0.25f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f)
			.setRotationPoint(-59.6875f, -5.3125f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, 0.3125f, 0, -0.75f, 0.3125f, 0, -0.625f, 0, -0.75f, -0.625f, 0)
			.setRotationPoint(-59.6875f, -3.1875f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, 0.25f, 0, -0.625f, 0.25f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f)
			.setRotationPoint(-59.6875f, -3.1875f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.0625f, -0.25f, 0, -0.6875f, -0.25f, 0)
			.setRotationPoint(-59.21875f, -3, -6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.8125f, -0.25f, -0.75f, 0.0625f, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-59.40625f, -3, -5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-59.375f, 0, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-53.875f, 0.875f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-55.375f, 0.875f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -0.625f, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f, 0.5f, 0, -0.625f, 0.5f, 0)
			.setRotationPoint(-53.9375f, 2.125f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -1.125f, 0.5f, -0.75f, 0.25f, 0.5f, -0.75f, 0.25f, 0.5f, 0, -1.125f, 0.5f, 0)
			.setRotationPoint(-55.4375f, 2.125f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.875f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-53.9375f, 1.875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.875f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-55.4375f, 1.875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -0.75f, -0.4375f, -0.75f, -0.125f, -0.4375f, -0.75f, -0.125f, -0.4375f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-55.1875f, 3.625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -1, -0.4375f, -0.75f, 0.125f, -0.4375f, -0.75f, 0.125f, -0.4375f, 0, -1, -0.4375f, 0)
			.setRotationPoint(-54.1875f, 3.625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -1, -0.75f, -0.75f, 0.125f, -0.8125f, -0.75f, 0.125f, -0.8125f, 0, -1, -0.75f, 0)
			.setRotationPoint(-55.3125f, 4.1875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0, 0, -0.75f, -0.8125f, -0.75f, -0.125f, -0.75f, -0.75f, -0.125f, -0.75f, 0, -0.75f, -0.8125f, 0)
			.setRotationPoint(-54.0625f, 4.1875f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0.0625f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0.0625f, 0, -0.8125f, -1, -0.75f, -0.125f, -0.875f, -0.75f, -0.125f, -0.875f, 0, -0.8125f, -1, 0)
			.setRotationPoint(-54.1875f, 4.4375f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.75f, 0, 0.0625f, -0.75f, 0, 0.0625f, 0, -0.875f, 0, 0, -1, -0.875f, -0.75f, 0.0625f, -1, -0.75f, 0.0625f, -1, 0, -1, -0.875f, 0)
			.setRotationPoint(-55.1875f, 4.4375f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.1875f, -0.875f, -0.75f, 0.0625f, -0.875f, -0.75f, 0.0625f, -0.875f, 0, -0.1875f, -0.875f, 0)
			.setRotationPoint(-54.375f, 4.4375f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
			.setRotationPoint(-58, -17.5f, 9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
			.setRotationPoint(-59.625f, -17.5f, 2.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.1875f, 0, 0, 0.1875f, 0.28125f, 0, 0, -1.03125f, 0, 0, -0.75f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0.28125f, -0.75f, 0, -1.03125f, -0.75f, 0)
			.setRotationPoint(-59.6875f, -6.875f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.1875f, 0, 0, 0.1875f, 0.28125f, 0, 0, -1.03125f, 0, 0, -0.75f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0.28125f, -0.75f, 0, -1.03125f, -0.75f, 0)
			.setRotationPoint(-59.6875f, -2.75f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.4375f, 0, 0, 0.4375f, 0.34375f, 0, 0, -1.09375f, 0, 0, -0.75f, -0.75f, 0.4375f, 0, -0.75f, 0.4375f, 0.34375f, -0.75f, 0, -1.09375f, -0.75f, 0)
			.setRotationPoint(-59.6875f, -4.75f, 3.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, -0.25f, -0.75f, -0.03125f, -0.25f, -0.75f, 0.03125f, -0.25f, 0, -0.78125f, -0.25f, 0)
			.setRotationPoint(-59.3125f, -9.375f, 4.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, -0.25f, -0.75f, -0.03125f, -0.25f, -0.75f, 0.03125f, -0.25f, 0, -0.78125f, -0.25f, 0)
			.setRotationPoint(-58.3125f, -9.375f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.25f, -0.75f, -0.0625f, -0.25f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.6875f, -0.5f, -0.75f, -0.0625f, -0.5f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-58.34375f, -7.125f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0.0625f, -0.5f, 0, -0.8125f, -0.5f, 0)
			.setRotationPoint(-58.28125f, -7.125f, 8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.25f, -0.75f, -0.0625f, -0.25f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.6875f, -0.5f, -0.75f, -0.0625f, -0.5f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-58.34375f, -3, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0.0625f, -0.5f, 0, -0.8125f, -0.5f, 0)
			.setRotationPoint(-58.28125f, -3, 8.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.25f, -0.75f, -0.0625f, -0.25f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.6875f, -0.5f, -0.75f, -0.0625f, -0.5f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-59.34375f, -7.125f, 3.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0.0625f, -0.5f, 0, -0.8125f, -0.5f, 0)
			.setRotationPoint(-59.28125f, -7.125f, 4.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, -0.25f, -0.75f, -0.0625f, -0.25f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.6875f, -0.5f, -0.75f, -0.0625f, -0.5f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-59.34375f, -3, 3.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.25f, 0, -0.8125f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0.0625f, -0.5f, 0, -0.8125f, -0.5f, 0)
			.setRotationPoint(-59.28125f, -3, 4.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 1, 0, -0.375f, -1.625f, 0, -0.375f, 0, 0, 0, -0.625f, 0, 0, 1, -0.625f, -0.375f, -1.625f, -0.625f, -0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-58, -1.625f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0.21875f, 0, 0, -0.96875f, 0, 0, -0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, 0.21875f, -0.75f, 0, -0.96875f, -0.75f, 0)
			.setRotationPoint(-58.28125f, -4.75f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.3125f, 0, 0, -0.3125f, 0.15625f, 0, 0, -0.90625f, 0, 0, -0.75f, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, 0.15625f, -0.75f, 0, -0.90625f, -0.75f, 0)
			.setRotationPoint(-58.21875f, -6.875f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.3125f, 0, 0, -0.3125f, 0.15625f, 0, 0, -0.90625f, 0, 0, -0.75f, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, 0.15625f, -0.75f, 0, -0.90625f, -0.75f, 0)
			.setRotationPoint(-58.21875f, -2.75f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0.375f, -0.75f, -0.03125f, 0.375f, -0.75f, 0.03125f, 0.375f, 0, -0.78125f, 0.375f, 0)
			.setRotationPoint(-58.8125f, -4, 6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, -0.125f, -0.75f, -0.03125f, -0.125f, -0.75f, 0.03125f, -0.125f, 0, -0.78125f, -0.125f, 0)
			.setRotationPoint(-58.5625f, -2.5f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, -0.125f, -0.75f, -0.03125f, -0.125f, -0.75f, 0.03125f, -0.125f, 0, -0.78125f, -0.125f, 0)
			.setRotationPoint(-59.0625f, -2.5f, 5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.375f, -0.75f, 0.5f, -0.375f, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.40625f, -6.875f, 7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.375f, -0.75f, 0.5f, -0.375f, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.40625f, -2.75f, 7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.375f, -0.75f, 0.5f, -0.375f, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.84375f, -6.875f, 5.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.375f, -0.75f, 0.5f, -0.375f, -0.75f, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.84375f, -2.75f, 5.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, 0.25f, -0.34375f, 0, 0.25f, 0, 0, 0, -0.75f, 0, 0, -0.40625f, -0.75f, 0.25f, -0.34375f, -0.75f, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.9375f, -4.75f, 5.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, 0.25f, -0.34375f, 0, 0.25f, 0, 0, 0, -0.75f, 0, 0, -0.40625f, -0.75f, 0.25f, -0.34375f, -0.75f, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.34375f, -4.75f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.59375f, -0.25f, -0.75f, -0.03125f, -0.25f, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.59375f, 0, -0.75f, -0.03125f, 0, -0.75f, 0, 0.25f, 0, -0.625f, 0.25f, 0)
			.setRotationPoint(-58.84375f, -5.25f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.25f, 0, -0.65625f, -0.25f, 0, -0.625f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0.03125f, 0, 0, -0.65625f, 0, 0)
			.setRotationPoint(-58.65625f, -5.25f, 6.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.53125f, 0, -0.25f, -0.09375f, 0, -0.25f, 0.09375f, 0, 0, -0.71875f, 0, 0, -0.53125f, 0.25f, -0.25f, -0.09375f, 0.25f, -0.25f, 0.09375f, 0.25f, 0, -0.71875f, 0.25f, 0)
			.setRotationPoint(-58.75f, -5.25f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, 0.0625f, 0.4375f, -0.359375f, 0.0625f, 0.4375f, -0.328125f, 0.1875f, -1.3125f, -0.421875f, 0.1875f, -1.3125f, -0.75f, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.1875f, -0.0625f, -0.75f, 0.1875f, -0.0625f)
			.setRotationPoint(-58.90625f, -6.375f, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.0625f, 0.1875f, 0, 0.0625f, 0.1875f, 0, 0.1875f, -1.0625f, -0.75f, 0.1875f, -1.0625f, -1.078125f, 0.1875f, -1.0625f, 0.328125f, 0.1875f, -1.0625f, 0.359375f, 0.0625f, 0.1875f, -1.109375f, 0.0625f, 0.1875f)
			.setRotationPoint(-58.71875f, -4, 7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.078125f, 0.3125f, -1.8125f, 0.328125f, 0.3125f, -1.8125f, 0.359375f, 0.1875f, 0.9375f, -1.109375f, 0.1875f, 0.9375f, -0.75f, 0.0625f, -0.5625f, 0, 0.0625f, -0.5625f, 0, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f)
			.setRotationPoint(-58.71875f, -6.25f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.0625f, 0.1875f, -1.8125f, 0.3125f, 0.1875f, -1.8125f, 0.3125f, 0.0625f, 0.9375f, -1.0625f, 0.0625f, 0.9375f, -0.71875f, 0.0625f, -0.5625f, -0.03125f, 0.0625f, -0.5625f, 0, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f)
			.setRotationPoint(-59.234375f, -4, 4.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0.125f, -0.75f, -0.03125f, 0.125f, -0.75f, 0.03125f, 0.125f, 0, -0.78125f, 0.125f, 0)
			.setRotationPoint(-58.8125f, -9.375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-57.25f, -9.375f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-56.5f, -8.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-56.25f, -9.375f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-57.25f, -9.625f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.375f, 0, 0, 0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.375f, -0.75f, 0)
			.setRotationPoint(-54.875f, -8.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.375f, 0, 0, 0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.375f, -0.75f, 0)
			.setRotationPoint(-53.25f, -8.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-52, -8.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-53, -9.375f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0)
			.setRotationPoint(-54.625f, -9.375f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-58, -10, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.03125f, -9.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.03125f, -4.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.03125f, -1.5625f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.03125f, -8.25f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.4375f, 0, 0, 0.4375f, 0.34375f, 0, 0, -1.09375f, 0, 0, -0.75f, -0.75f, 0.4375f, 0, -0.75f, 0.4375f, 0.34375f, -0.75f, 0, -1.09375f, -0.75f, 0)
			.setRotationPoint(-59.6875f, -8.25f, 3.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 1, 0, -0.375f, -1.625f, 0, -0.375f, 0, 0, 0, -0.625f, 0, 0, 1, -0.625f, -0.375f, -1.625f, -0.625f, -0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-58, -9.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0.21875f, 0, 0, -0.96875f, 0, 0, -0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, 0.21875f, -0.75f, 0, -0.96875f, -0.75f, 0)
			.setRotationPoint(-58.28125f, -8.25f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0.125f, -0.75f, -0.03125f, 0.125f, -0.75f, 0.03125f, 0.125f, 0, -0.78125f, 0.125f, 0)
			.setRotationPoint(-58.5625f, -9.375f, 7.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.71875f, 0, -0.75f, -0.03125f, 0, -0.75f, 0.03125f, 0, 0, -0.78125f, 0, 0, -0.71875f, 0.125f, -0.75f, -0.03125f, 0.125f, -0.75f, 0.03125f, 0.125f, 0, -0.78125f, 0.125f, 0)
			.setRotationPoint(-59.0625f, -9.375f, 5.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.4375f, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.4375f, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.84375f, -8.25f, 4.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.4375f, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.4375f, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-58.34375f, -8.25f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-56.75f, -6.875f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.125f, -0.75f, 0)
			.setRotationPoint(-56.375f, -4.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-56.25f, -4.5f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-56.75f, -2.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0.875f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.4375f, 0.875f, 0, -0.25f, -1.875f, -0.75f, -0.125f, -0.875f, -0.75f, -0.125f, -0.875f, 0, -0.25f, -1.875f, 0)
			.setRotationPoint(-56.5f, -7.125f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-56.5f, -7.125f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-56.5f, -3, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.5f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-51.75f, -9.625f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-51.75f, -9.125f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.25f, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, 0, -0.75f, 0.25f, 0, -0.5f, -1, -0.75f, -0.375f, -0.75f, -0.75f, -0.375f, -0.75f, 0, -0.5f, -1, 0)
			.setRotationPoint(-51.75f, -1.625f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.125f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-57.25f, -1.625f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-55.375f, -2.5f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-53.875f, -2.5f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.375f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-54, -8.5f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.375f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(-55.5f, -8.5f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.875f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-53.625f, -8.5f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.625f, 0, 0, -0.875f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-55.125f, -8.5f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-55.375f, -9.375f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0)
			.setRotationPoint(-53.875f, -9.375f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-53.875f, -8.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0)
			.setRotationPoint(-55.375f, -8.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-52.75f, -7.125f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-56, -7.125f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-52.75f, -3, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(-56, -3, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-53, -4.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-54.875f, -6.875f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-54.875f, -2.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-53.5f, -6.875f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(-53.5f, -2.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard1(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-53.25f, -7.125f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-53.25f, -3, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-52, -2.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0)
			.setRotationPoint(-52, -6.875f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(-53, -4.5f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, 0, -0.75f, 0.375f, 0)
			.setRotationPoint(-54.625f, -4, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, -0.75f, 0, 0)
			.setRotationPoint(-55.125f, -5.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0.25f, 0)
			.setRotationPoint(-54.125f, -5.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-54.375f, -5.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.875f, 0.125f, 0, 0.0625f, 0.0625f, -0.75f, -0.9375f, 0.1875f, -0.75f, -0.9375f, 0.1875f, 0, 0.0625f, 0.0625f, 0)
			.setRotationPoint(-55.125f, -4, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.75f, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f, 0, -0.75f, 0, 0, -1.6875f, 0.1875f, -0.75f, 0.8125f, 0.0625f, -0.75f, 0.8125f, 0.0625f, 0, -1.6875f, 0.1875f, 0)
			.setRotationPoint(-54.125f, -4, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3125f, 0.0625f, -0.75f, -1.1875f, 0.1875f, -0.75f, -1.1875f, 0.1875f, 0, 0.3125f, 0.0625f, 0, -0.625f, 0.25f, -0.75f, -0.25f, 0.125f, -0.75f, -0.25f, 0.125f, 0, -0.625f, 0.25f, 0)
			.setRotationPoint(-54.875f, -6.375f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.9375f, 0.1875f, -0.75f, 1.0625f, 0.0625f, -0.75f, 1.0625f, 0.0625f, 0, -1.9375f, 0.1875f, 0, -1, 0.125f, -0.75f, 0.125f, 0.25f, -0.75f, 0.125f, 0.25f, 0, -1, 0.125f, 0)
			.setRotationPoint(-54.375f, -6.375f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 165, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.75f, 0.75f, 3, new Vec3f(-0.125, 0.0, 0.0))
			.setRotationPoint(-59.390625f, -2.625f, -5.25f).setRotationAngle(0, -14, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, -0.078125f, 0, 0, -0.75f, 3.375f, 0, -0.75f, 3.375f, -0.5f, -0.078125f, 0, -0.5f, -0.015625f, -0.5f, 0, 1.75f, -4.375f, 0, 1.75f, -4.375f, -0.5f, -0.015625f, -0.5f, -0.5f)
			.setRotationPoint(11.5f, 5.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, -1, 3.375f, 0, 0.015625f, 0.125f, 0, 0.015625f, 0.125f, -0.5f, -1, 3.375f, -0.5f, 1.5f, -4.375f, 0, 0.09375f, -0.5f, 0, 0.09375f, -0.5f, -0.5f, 1.5f, -4.375f, -0.5f)
			.setRotationPoint(-32.5f, 5.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, -0.078125f, 0, 0, -0.75f, 3.375f, 0, -0.75f, 3.375f, -0.5f, -0.078125f, 0, -0.5f, -0.015625f, -0.5f, 0, 1.75f, -4.375f, 0, 1.75f, -4.375f, -0.5f, -0.015625f, -0.5f, -0.5f)
			.setRotationPoint(11.5f, 5.125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, -1, 3.375f, 0, 0.015625f, 0.125f, 0, 0.015625f, 0.125f, -0.5f, -1, 3.375f, -0.5f, 1.5f, -4.375f, 0, 0.09375f, -0.5f, 0, 0.09375f, -0.5f, -0.5f, 1.5f, -4.375f, -0.5f)
			.setRotationPoint(-32.5f, 5.125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 0.5f, 0.5f, 0, 0, 0, 0, 0.28125f, 0, 0, 0.28125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.359375f, 0, 0, 0.359375f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.625f, 5.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 0.5f, 0.5f, 0, 0, 0, 0, 0.28125f, 0, 0, 0.28125f, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.28125f, 0, 0, 0.28125f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-10.78125f, 5.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 0.5f, 0.5f, 0, 0, 0, 0, 0.28125f, 0, 0, 0.28125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.359375f, 0, 0, 0.359375f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.625f, 5.125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 0.5f, 0.5f, 0, 0, 0, 0, 0.28125f, 0, 0, 0.28125f, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.28125f, 0, 0, 0.28125f, 0, 0, 0.0625f, 0, 0)
			.setRotationPoint(-10.78125f, 5.125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-3.5625f, 1.75f, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-7.6875f, 1.75f, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-11.8125f, 1.75f, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(0.5625f, 1.75f, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(4.6875f, 1.75f, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(8.8125f, 1.75f, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(-3.3125f, 4, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(-7.4375f, 4, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(-11.5625f, 4, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(0.8125f, 4, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(4.9375f, 4, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(9.0625f, 4, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-3.5625f, 6.75f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-7.6875f, 6.75f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-11.8125f, 6.75f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(0.5625f, 6.75f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(4.6875f, 6.75f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(8.8125f, 6.75f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-1.5f, 4.875f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(0.625f, 4.875f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-1.5f, 4.875f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(0.625f, 4.875f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.25f, 0, -0.6875f, -0.25f)
			.setRotationPoint(-0.5f, 4.875f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.25f, 0, -0.6875f, -0.25f)
			.setRotationPoint(-0.5f, 5.5625f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.25f, 0, -0.6875f, -0.25f)
			.setRotationPoint(-0.5f, 4.875f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, -0.25f, 0, -0.6875f, -0.25f)
			.setRotationPoint(-0.5f, 5.5625f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-0.5f, 5.1875f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-0.5f, 5.1875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 127, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 0.875f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-10.5f, 3.75f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 127, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 0.875f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-0.1875f, 3.75f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 127, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 0.875f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(10.125f, 3.75f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 164, textureX, textureY).addCylinder(0, 0, 0, 1, 20, 8, 1.5f, 1.5f, 3, new Vec3f(0.125, 0.0, 0.0))
			.setRotationPoint(-10, 3.75f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 3, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-18.875f, 3.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 3, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-24.25f, 3.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-13.75f, 1.75f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-24.5f, 1.75f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-3.5625f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-1.1875f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-7.6875f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-5.3125f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-11.8125f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-9.4375f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(0.5625f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(2.9375f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(4.6875f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(7.0625f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(8.8125f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(11.1875f, 2.5f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-2.8125f, 6.375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-6.9375f, 6.375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-11.0625f, 6.375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(1.3125f, 6.375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(5.4375f, 6.375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(9.5625f, 6.375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-2.8125f, 3.75f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-6.9375f, 3.75f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-11.0625f, 3.75f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(1.3125f, 3.75f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(5.4375f, 3.75f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.375f, 0.25f, 0, -0.375f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(9.5625f, 3.75f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0.125f, 0, 0, 0.125f, -0.375f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.125f, -0.375f, -0.25f, -0.125f)
			.setRotationPoint(-11.75f, 3, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0.125f, 0, 0, 0.125f, -0.375f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.125f, -0.375f, -0.25f, -0.125f)
			.setRotationPoint(10.625f, 3, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0.125f, 0, 0, 0.125f, -0.375f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.125f, -0.375f, -0.25f, -0.125f)
			.setRotationPoint(-11.75f, 3, 8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0.125f, 0, 0, 0.125f, -0.375f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.125f, -0.375f, -0.25f, -0.125f)
			.setRotationPoint(10.625f, 3, 8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, 0.25f, 0, 0.125f, 0.25f)
			.setRotationPoint(10.625f, 1.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, 0.25f, 0, 0.125f, 0.25f)
			.setRotationPoint(-10.875f, 1.75f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-19.125f, 3.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-19.125f, 5.625f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 162, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-20.125f, 4.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 162, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 4, null)
			.setRotationPoint(-22, 4.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 162, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.125f, 0.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-19.75f, 4.375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-22.125f, 4.125f, -3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-19.875f, 4.125f, -3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 162, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.125f, 0.125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-22, 4.25f, -2.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 162, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.125f, 0.125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-19.75f, 4.25f, -2.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 162, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.125f, 0.125f, 3, null)
			.setRotationPoint(-21.875f, 4.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 162, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.125f, 0.125f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-22, 4.375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 6, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-30.375f, 2.25f, -7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-25.5f, 5.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-30.625f, 5.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-25.5f, 1.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-30.625f, 1.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-25.5f, 1.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-30.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(-30.625f, 5.25f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(-25.5f, 2.5f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(-30.625f, 2.5f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(-25.5f, 5.25f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -0.375f, 2.75f, 0, -0.375f, 2.75f, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, -0.375f, -3.25f, 0, -0.375f, -3.25f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(-30.625f, 5.25f, -8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 2.75f, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, 0, 2.75f, -0.875f, 0, -3.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.875f, 0, -3.25f, -0.875f)
			.setRotationPoint(-30.625f, 5.25f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -0.375f, 2.75f, 0, -0.375f, 2.75f, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, -0.375f, -3.25f, 0, -0.375f, -3.25f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(-30.625f, 5.25f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 2.75f, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, 0, 2.75f, -0.875f, 0, -3.25f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.875f, 0, -3.25f, -0.875f)
			.setRotationPoint(-30.625f, 5.25f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 20, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-43.75f, 1.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f)
			.setRotationPoint(-25.125f, 1.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-22.25f, 1.75f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.375f, -0.5f, 3.75f, -1.375f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 3.75f, -1.375f, -0.5f)
			.setRotationPoint(-20.875f, 2.125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0.375f, 0, 0.5f, 0.375f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 4.25f, -1.375f, 0, 4.25f, -1.375f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(16.375f, 2.125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.375f, -0.5f, 3.75f, -1.375f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 3.75f, -1.375f, -0.5f)
			.setRotationPoint(-20.875f, 2.125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0.375f, 0, 0.5f, 0.375f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 4.25f, -1.375f, 0, 4.25f, -1.375f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(16.375f, 2.125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-16.375f, 2.125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-16.375f, 2.125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0.375f, 0, 0.25f, 0.375f)
			.setRotationPoint(-11.75f, 1.75f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0.375f, 0, 0.25f, 0.375f)
			.setRotationPoint(10.625f, 1.75f, -10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0.375f, 0, 0.25f, 0.375f)
			.setRotationPoint(-11.75f, 1.75f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.375f, 0, 0, 0.375f, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0.375f, 0, 0.25f, 0.375f)
			.setRotationPoint(10.625f, 1.75f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 2, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(13, 1.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 2, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(22.5f, 1.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-3.5625f, 2, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-7.6875f, 2, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-11.8125f, 2, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(0.5625f, 2, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(4.6875f, 2, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(8.8125f, 2, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-3.5625f, 1.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-7.6875f, 1.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-11.8125f, 1.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(0.5625f, 1.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(4.6875f, 1.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(8.8125f, 1.75f, -6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 20, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(41.25f, 1.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 161, textureX, textureY).addCylinder(32.5625f, 0, 0.125f, 1, 1, 8, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(27.4375f, -25, 0).setRotationAngle(0, 0, -25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 161, textureX, textureY).addCylinder(32.5625f, 0, 0.125f, 1, 1, 8, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(27.4375f, -25, -0.375f).setRotationAngle(0, 0, -25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 161, textureX, textureY).addCylinder(32.5625f, 0, 0.125f, 1, 1, 8, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(27.4375f, -25, -0.25f).setRotationAngle(0, 0, -25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 161, textureX, textureY).addCylinder(4.0625f, 0, 0, 1, 27, 8, 0.1875f, 0.1875f, 2, null)
			.setRotationPoint(27.4375f, -25, 0).setRotationAngle(0, 0, -25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 111, textureX, textureY)
			.addShapeBox(31.068125f, -0.1875f, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(27.4375f, -25, 0.25f).setRotationAngle(0, 0, -25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 104, textureX, textureY)
			.addShapeBox(31.068125f, -0.1875f, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(27.4375f, -25, -0.375f).setRotationAngle(0, 0, -25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 160, textureX, textureY)
			.addShapeBox(31.068125f, -0.1875f, 0, 0.5625f, 0.375f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.4375f, -25, -0.25f).setRotationAngle(0, 0, -25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 160, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.25f, 0.25f, 1, null)
			.setRotationPoint(27.4375f, -25, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 109, textureX, textureY)
			.addShapeBox(-0.375f, -0.375f, 0, 4, 1, 1, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(27.4375f, -25, -0.375f).setRotationAngle(0, 0, -25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(27.0625f, -25.375f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(27.0625f, -25.375f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-28.4375f, -25.375f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-28.4375f, -25.375f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 160, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 4, 8, 0.25f, 0.25f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(23.5f, -25, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 160, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 4, 8, 0.25f, 0.25f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(23.5f, -25, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 160, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 4, 8, 0.25f, 0.25f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(-27.6875f, -25, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 160, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 4, 8, 0.25f, 0.25f, 3, new Vec3f(-0.4375, 0.0, 0.0))
			.setRotationPoint(-27.6875f, -25, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(23.5f, -25.375f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-27.125f, -25.375f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 160, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(25.4375f, -24.625f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 160, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.6875f, 0.6875f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-26.0625f, -24.625f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.125f, 0, 0, -0.375f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.375f, 0)
			.setRotationPoint(22.75f, -25.375f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0)
			.setRotationPoint(-24.125f, -25.375f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 160, textureX, textureY).addCylinder(-32.5625f, 0, 0.125f, 1, 1, 8, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-28.0625f, -25, 0).setRotationAngle(0, 0, 25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 160, textureX, textureY).addCylinder(-32.5625f, 0, 0.125f, 1, 1, 8, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-28.0625f, -25, -0.375f).setRotationAngle(0, 0, 25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 160, textureX, textureY).addCylinder(-32.5625f, 0, 0.125f, 1, 1, 8, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-28.0625f, -25, -0.25f).setRotationAngle(0, 0, 25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 103, textureX, textureY)
			.addShapeBox(-32.875f, -0.1875f, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-28.0625f, -25, 0.25f).setRotationAngle(0, 0, 25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 103, textureX, textureY)
			.addShapeBox(-32.875f, -0.1875f, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-28.0625f, -25, -0.375f).setRotationAngle(0, 0, 25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 160, textureX, textureY).addCylinder(-31.0625f, 0, 0, 1, 27, 8, 0.1875f, 0.1875f, 2, null)
			.setRotationPoint(-28.0625f, -25, 0).setRotationAngle(0, 0, 25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 160, textureX, textureY)
			.addShapeBox(-31.625f, -0.1875f, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.4375f, -0.625f, 0, -0.4375f, -0.625f, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-28.0625f, -25, -0.25f).setRotationAngle(0, 0, 25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 160, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.25f, 0.25f, 1, null)
			.setRotationPoint(-28.0625f, -25, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 75, textureX, textureY)
			.addShapeBox(-4.0625f, -0.375f, 0, 4, 1, 1, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0.4375f, -0.25f, 0, 0.4375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-28.0625f, -25, -0.375f).setRotationAngle(0, 0, 25)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.5f)
			.setRotationPoint(-51, -8.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.5f)
			.setRotationPoint(-51, -9.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.5f)
			.setRotationPoint(-51, -11, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.25f)
			.setRotationPoint(50.75f, -8.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.25f)
			.setRotationPoint(50.75f, -9.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.25f)
			.setRotationPoint(50.75f, -11, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-47, -22.125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-47, -22.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-46.75f, -12.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-46.75f, -12.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.75f, -15.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.75f, -15.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(41.75f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(33.75f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(25.75f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(17, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(9, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(1.25f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-7.5f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-15.5f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-23.25f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-32.25f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-40.25f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-46.75f, -13.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(41.75f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(33.75f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(25.75f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(17, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(9, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(1.25f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-7.5f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-15.5f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-23.25f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-32.25f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-40.25f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-46.75f, -13.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(40.25f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(32.25f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(7.5f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(15.5f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(23.25f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-17, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-9, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-1.25f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-25.75f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-33.75f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-41.75f, -15.5f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-46.75f, -8, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-46.75f, -8, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(32.25f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(7.5f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(40.25f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(15.5f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(23.25f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-17, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-9, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-1.25f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-25.75f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-33.75f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-41.75f, -15.5f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(46.75f, -15.75f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-47.25f, -15.75f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-47.25f, -15.75f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(46.75f, -15.75f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-46.75f, -15.75f, 10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-46.75f, -15.75f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47.25f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47.25f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-32.75f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-40.75f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-32.75f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-40.75f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.75f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.75f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(25.25f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(33.25f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(8.5f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-16, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(25.25f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(33.25f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(8.5f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-16, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(41.25f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(41.25f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(0.75f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(16.5f, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-8, -13.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(0.75f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(16.5f, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-8, -13.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-50.75f, -7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-50.75f, -7, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(47.25f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-50.75f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(47.25f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-50.75f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(32.75f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(40.75f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(8, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-8.5f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-16.5f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-41.25f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-33.25f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(32.75f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(40.75f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(8, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-8.5f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-16.5f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-41.25f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-33.25f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(23.75f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-25.25f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-0.75f, -15.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(23.75f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-25.25f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-0.75f, -15.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-40.5f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-33.125f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-24.625f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-16.375f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-8.375f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-0.125f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(8.125f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(16.125f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(24.375f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(32.25f, -1.75f, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-40.5f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-33.125f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-24.625f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-16.375f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-8.375f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-0.125f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(8.125f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(16.125f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(24.375f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(32.25f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.25f, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(40.25f, -1.75f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-40.5f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-33.125f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-24.625f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-16.375f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-8.375f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-0.125f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(8.125f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(16.125f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(24.375f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(32.25f, -0.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-40.5f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-33.125f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-24.625f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-16.375f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-8.375f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-0.125f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(8.125f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(16.125f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(24.375f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(32.25f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(40.25f, -0.5f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-40.5f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-33.125f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-24.625f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-16.375f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-8.375f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-0.125f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(8.125f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(16.125f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(24.375f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(32.25f, -1.75f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-40.5f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-33.125f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-24.625f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-16.375f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-8.375f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-0.125f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(8.125f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(16.125f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(24.375f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(32.25f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(40.25f, -1.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 73, 1, 1, 0, 0, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-40.75f, -2.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 81, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-40.5f, -2.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 73, 1, 5, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-40.75f, -2.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 81, 1, 5, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-40.5f, -2.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 73, 4, 1, 0, 0, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, 0, 0, 0, 0, 0, 0, 0.453125f, 0, 0.25f, 0.453125f, 0, 0.25f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-40.75f, -7, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 81, 4, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.453125f, 0, 0, 0.453125f, 0)
			.setRotationPoint(-40.5f, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-41, -7, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(40.75f, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.11125f, 0, 0, 0.11125f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.04125f, 0, -0.5f, 0.04125f)
			.setRotationPoint(-41, -4.375f, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.06999999f, -0.75f, 0, 0.06999999f, -0.75f, 0, 0.29125f, 0, 0, 0.29125f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.04125f, 0, -0.5f, 0.04125f)
			.setRotationPoint(40.75f, -4.375f, -9.1675f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-41, -4.375f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, 0, -1, 0, 0, -1, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(40.75f, -4.375f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-41, -3.625f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(40.75f, -3.625f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-41, -2.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(40.75f, -2.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 2, 20, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-50.75f, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 1, 3, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0.375f, -0.3125f, 0, 0.375f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-48.5f, -24.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(48, -25.25f, 1.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(-48.875f, -25.25f, -1.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(47.5625f, -25.25f, 1.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(-48.4375f, -25.25f, -1.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f, -0.75f, 0, -1.0625f, 0, 0, -1.0625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(48, -25.5f, 2.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(48, -25.5f, 1.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-48.875f, -25.5f, -2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f, -0.75f, 0, -1.0625f, 0, 0, -1.0625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(-48.875f, -25.5f, -1.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f, -0.75f, 0, -1.0625f, 0, 0, -1.0625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(47.5625f, -25.5f, 2.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(47.5625f, -25.5f, 1.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-48.4375f, -25.5f, -2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f, -0.75f, 0, -1.0625f, 0, 0, -1.0625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(-48.4375f, -25.5f, -1.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f)
			.setRotationPoint(48, -25.5f, 1.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f)
			.setRotationPoint(-48.875f, -25.5f, -1.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f)
			.setRotationPoint(47.5625f, -25.5f, 1.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f)
			.setRotationPoint(-48.4375f, -25.5f, -1.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.125f, -0.75f, -1, 0.125f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(48, -24.75f, 2.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-48.875f, -24.75f, -2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.125f, -0.75f, -1, 0.125f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(47.5625f, -24.5f, 2.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-48.4375f, -24.5f, -2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.5625f, -0.875f, 0, -0.5625f, -0.875f)
			.setRotationPoint(48, -25.25f, 2.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.5625f, 0, -0.75f, -0.5625f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-48.875f, -25.25f, -2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.3125f, -0.875f, 0, -0.3125f, -0.875f)
			.setRotationPoint(47.5625f, -25.25f, 2.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.3125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-48.4375f, -25.25f, -2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(48, -25.6875f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.0625f, -0.75f, -0.125f, 0.0625f, -0.75f, 0, -1, 0, 0, -1, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.875f, 0, -0.875f, -0.875f)
			.setRotationPoint(48, -25.6875f, 0.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -0.875f, -0.125f, -0.75f, -0.875f, -0.125f, -0.75f, -1, -0.8125f, 0, -1, -0.8125f)
			.setRotationPoint(48, -24.75f, 0.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -1, 0.0625f, -0.75f, -1, 0.0625f, -0.75f, -0.875f, -1, 0, -0.875f, -1)
			.setRotationPoint(48, -24.75f, -1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.0625f, -0.75f, -0.125f, 0.0625f, -0.75f, 0, -1, 0, 0, -1, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.875f, 0, -0.875f, -0.875f)
			.setRotationPoint(-48.875f, -25.6875f, 0.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.875f, 0, -0.8125f, -0.875f)
			.setRotationPoint(-48.875f, -25.6875f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -1, 0.0625f, -0.75f, -1, 0.0625f, -0.75f, -0.875f, -1, 0, -0.875f, -1)
			.setRotationPoint(-48.875f, -24.75f, -1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -0.875f, -0.125f, -0.75f, -0.875f, -0.125f, -0.75f, -1, -0.8125f, 0, -1, -0.8125f)
			.setRotationPoint(-48.875f, -24.75f, 0.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.4375f, 0, -0.875f, -0.4375f)
			.setRotationPoint(48, -24.75f, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0.0625f, -0.75f, -0.875f, 0.0625f, -0.75f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-48.875f, -24.75f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.875f, 0.0625f, -0.75f, -0.875f, 0.0625f, -0.75f, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(48, -24.75f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.875f, 0.0625f, -0.75f, -0.875f, 0.0625f, -0.75f, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-48.875f, -24.75f, -1.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0.203125f, 0, -0.5f, 0.203125f, 0, -0.5f, 0.203125f, -0.25f, 0, 0.203125f, -0.25f)
			.setRotationPoint(47.875f, -24.625f, -4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0.203125f, 0, -0.5f, 0.203125f, 0, -0.5f, 0.203125f, -0.25f, 0, 0.203125f, -0.25f)
			.setRotationPoint(-49, -24.625f, -4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0.203125f, 0, -0.5f, 0.203125f, 0, -0.5f, 0.20875001f, -0.75f, 0, 0.20875001f, -0.75f)
			.setRotationPoint(47.875f, -24.625f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.20875001f, 0, -0.5f, 0.20875001f, 0, -0.5f, 0.203125f, -0.75f, 0, 0.203125f, -0.75f)
			.setRotationPoint(47.875f, -24.625f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0.203125f, 0, -0.5f, 0.203125f, 0, -0.5f, 0.20875001f, -0.75f, 0, 0.20875001f, -0.75f)
			.setRotationPoint(-49, -24.625f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.20875001f, 0, -0.5f, 0.20875001f, 0, -0.5f, 0.203125f, -0.75f, 0, 0.203125f, -0.75f)
			.setRotationPoint(-49, -24.625f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.875f, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(47.5f, -24.375f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.875f, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-48.5f, -24.375f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0.125f, 0, -0.875f, 0.125f)
			.setRotationPoint(47.5625f, -24.5f, 0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.875f, 0.0625f, -0.75f, -0.875f, 0.0625f, -0.75f, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-48.4375f, -24.5f, -1.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.3125f, 0.375f, -0.75f, -0.3125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(48, -25.5f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f)
			.setRotationPoint(48, -25.5f, 0.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f)
			.setRotationPoint(-48.875f, -25.5f, 0.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.3125f, 0.375f, -0.75f, -0.3125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-48.875f, -25.5f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0.0625f, -0.5f, 0, 0.0625f, -0.5f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.9375f, -0.5f, 0, -0.9375f, -0.5f)
			.setRotationPoint(48, -25.6875f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(48, -25.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-48.875f, -25.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0.0625f, -0.5f, 0, 0.0625f, -0.5f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.9375f, -0.5f, 0, -0.9375f, -0.5f)
			.setRotationPoint(-48.875f, -25.6875f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 1, 6, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, -23.625f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-50.75f, -23.625f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 1, 1, 0, 0, -0.0625f, 0, 0.5f, -0.0625f, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.5625f, 0, 0.5f, -0.5625f, 0, 0.5f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-50.75f, -23.375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.0625f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.5625f, -0.625f, 0, -0.5625f, -0.625f)
			.setRotationPoint(-50.75f, -23.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -3.5f, -0.625f, 0, 2.5f, -1.625f, 0, 2.5f, -1.875f, 0, -3.5f, -0.875f, 0, 0.625f, 0, 0, -1.375f, 0.875f, 0, -0.75f, 0.875f, 0, 0, 0, 0)
			.setRotationPoint(-54.25f, -24.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -3.5f, -0.875f, 0, 2.5f, -1.875f, 0, 2.5f, -1.625f, 0, -3.5f, -0.625f, 0, 0, 0, 0, -0.75f, 0.875f, 0, -1.375f, 0.875f, 0, 0.625f, 0, 0)
			.setRotationPoint(-54.25f, -24.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -1.875f, -0.125f, 0, 1.125f, -1, 0, 1.75f, -1, 0, -2.5f, -0.125f, 0, 0.625f, 0, 0, -1, 0.625f, 0, -0.375f, 0.625f, 0, 0, 0, 0)
			.setRotationPoint(-56.75f, -22.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -2.5f, -0.125f, 0, 1.75f, -1, 0, 1.125f, -1, 0, -1.875f, -0.125f, 0, 0, 0, 0, -0.375f, 0.625f, 0, -1, 0.625f, 0, 0.625f, 0, 0)
			.setRotationPoint(-56.75f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 2.5f, -1.625f, 0, -3.5f, -0.625f, 0, -3.5f, -0.875f, 0, 2.5f, -1.875f, 0, -1.375f, 0.875f, 0, 0.625f, 0, 0, 0, 0, 0, -0.75f, 0.875f, 0)
			.setRotationPoint(53.25f, -24.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 2.5f, -1.875f, 0, -3.5f, -0.875f, 0, -3.5f, -0.625f, 0, 2.5f, -1.625f, 0, -0.75f, 0.875f, 0, 0, 0, 0, 0.625f, 0, 0, -1.375f, 0.875f, 0)
			.setRotationPoint(53.25f, -24.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 1.125f, -1, 0, -1.875f, -0.125f, 0, -2.5f, -0.125f, 0, 1.75f, -1, 0, -1, 0.625f, 0, 0.625f, 0, 0, 0, 0, 0, -0.375f, 0.625f, 0)
			.setRotationPoint(55.75f, -22.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 1.75f, -1, 0, -2.5f, -0.125f, 0, -1.875f, -0.125f, 0, 1.125f, -1, 0, -0.375f, 0.625f, 0, 0, 0, 0, 0.625f, 0, 0, -1, 0.625f, 0)
			.setRotationPoint(55.75f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 1.125f, 0, 0, -1.5f, 0.625f, 0, -2.125f, 0.625f, 0, 1.75f, 0, 0, -0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57.875f, -19.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 1.75f, 0, 0, -2.125f, 0.625f, 0, -1.5f, 0.625f, 0, 1.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(57.875f, -19.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -1.5f, 0.625f, 0, 1.125f, 0, 0, 1.75f, 0, 0, -2.125f, 0.625f, 0, 0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.875f, -19.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -2.125f, 0.625f, 0, 1.75f, 0, 0, 1.125f, 0, 0, -1.5f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, 0.625f, 0, 0)
			.setRotationPoint(-58.875f, -19.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0.5625f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.75f, 0)
			.setRotationPoint(50.75f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.5625f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.5625f, 0)
			.setRotationPoint(50.75f, -19.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0.5625f, 0, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.75f, 0, 0, -0.25f, 0)
			.setRotationPoint(-54.75f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0.5625f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.5625f, 0, 0, 0, 0)
			.setRotationPoint(-54.75f, -19.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0.75f, 0, -0.25f, -1.5f, 0, -0.765625f, -1.5f, 0, 0, 0.5f, 0, 0, -0.75f, 0, -0.25f, 0.5f, 0, -0.765625f, 0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(54.75f, -19.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0.75f, 0, -0.765625f, -1.75f, 0, -0.25f, -1.75f, 0, 0, 0.5f, 0, 0, -0.25f, 0, -0.765625f, 0.75f, 0, -0.25f, 0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(54.75f, -19.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, -0.515625f, -1.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.75f, 0, 0, -1.5f, 0, -0.515625f, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.75f, 0, 0, 0.5f, 0)
			.setRotationPoint(-58.5f, -19.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f, 0.5f, 0, -0.515625f, -1.5f, 0, 0, 0.5f, 0, -0.25f, -0.75f, 0, -0.25f, -0.5f, 0, -0.515625f, 0.5f, 0)
			.setRotationPoint(-58.5f, -19.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-50.75f, -17.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-50.75f, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 8, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(-50.25f, -15.75f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-50.75f, -17.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-50.75f, -17.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-50.75f, -17.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-50.375f, -15.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-50.375f, -15.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-50.375f, -8, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(-50.375f, -16, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-51, -6.25f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-49.75f, -10.375f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 153, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-49.5f, -9.75f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-50.75f, -0.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.1875f, 0, -0.75f, 0.25f)
			.setRotationPoint(-48.75f, -0.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-48.75f, -6.75f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 4, 0, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, -0.25f, 0)
			.setRotationPoint(-46.75f, -6.75f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47.75f, -0.25f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.125f, 0, -0.875f, 0.125f)
			.setRotationPoint(-48.75f, -6.875f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.625f, 0, 0, 0.125f, 0, -0.875f, 0, -0.1875f, -0.875f, -0.75f, -0.1875f, -0.875f, -0.625f, 0, -0.875f, 0.125f)
			.setRotationPoint(-46.75f, -6.875f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 153, textureX, textureY).addCylinder(0, 0, 2.125f, 1, 1, 8, 0.12890625f, 0.1875f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-47.5625f, -7.6875f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 153, textureX, textureY).addCylinder(0, 0, 2.125f, 1, 1, 8, 0.19921875f, 0.12890625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(-47.5625f, -8.4375f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 153, textureX, textureY).addCylinder(0, 0, 2.125f, 1, 1, 8, 0.09375f, 0.19921875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-47.5625f, -8.5f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 153, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-47.5625f, -7.25f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 153, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.3125f, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.5625f, -7.5f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 153, textureX, textureY)
			.addShapeBox(-0.25f, 0, 2.125f, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-47.5625f, -7.5f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 110, textureX, textureY)
			.addShapeBox(-0.25f, 0, -0.0625f, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f)
			.setRotationPoint(-47.5625f, -7.5f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 153, textureX, textureY).addCylinder(0, 0, -1.8125f, 1, 1, 8, 0.125f, 0.09375f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(-47.1875f, -7.125f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 153, textureX, textureY).addCylinder(0, 0, -1.875f, 1, 1, 8, 0.0703125f, 0.125f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-47.1875f, -7.125f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 153, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(-47.1875f, -6.5f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 152, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 8, 0.1875f, 0.1875f, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(-47.1875f, -5.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 152, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 8, 0.1875f, 0.1875f, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(-47.1875f, -5.5f, -7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 152, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(-47.1875f, -7, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 152, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.125f, 0.125f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(-47.1875f, -7.25f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 152, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0.0625f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.8125f, 0, -0.875f, -0.0625f, 0, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.8125f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f)
			.setRotationPoint(-47.1875f, -7.5f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 152, textureX, textureY)
			.addShapeBox(-0.125f, 0, -0.1875f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0.1875f, -0.75f, -0.75f, 0.1875f, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.1875f, -7.5f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 152, textureX, textureY)
			.addShapeBox(-0.125f, 0, -0.5625f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.1875f, -7.25f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.25f, -16.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-41, -16.75f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-49.75f, -16.5f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.75f, -16.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-49.75f, -17.5f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-49.75f, -12.5f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0.400625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.400625f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(-48.75f, -0.25f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(-48.75f, -18.75f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.953125f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.953125f)
			.setRotationPoint(-41.5f, -12.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.546875f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.546875f)
			.setRotationPoint(-41.5f, -16.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.5f, -16.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.953125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.953125f)
			.setRotationPoint(-41.5f, -18.75f, -10).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard2(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-41.5f, -19.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-41.5f, -19.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.046875f, 0.5f, 0, 0.078125f, 0.953125f, 0, -0.328125f, 0, 0, -0.328125f, 0, 0, -0.328125f, 0.5f, 0, -0.328125f, 0.953125f)
			.setRotationPoint(-41.5f, -22.421875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.625f, 0, -0.6875f, -0.625f)
			.setRotationPoint(-57.875f, -15.0625f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.625f, 0, -0.6875f, -0.625f)
			.setRotationPoint(-57.875f, -15.0625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.125f, 0, -0.25f, -0.125f)
			.setRotationPoint(-58.25f, -16.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.125f, 0, -0.25f, -0.125f)
			.setRotationPoint(-58.25f, -16.8125f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.1875f, 0.375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-58.375f, -16.0625f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.1875f, 0.375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-58.375f, -16.0625f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.40625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-58.3125f, -16.0625f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.40625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-58.3125f, -16.0625f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.34570312f, 0.375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-57.8125f, -17, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.34570312f, 0.375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-57.8125f, -17, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.34375f, 0.34375f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-57.8125f, -17.0625f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.34375f, 0.34375f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-57.8125f, -17.0625f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.2578125f, 0.34375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-57.8125f, -17.25f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 152, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.2578125f, 0.34375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-57.8125f, -17.25f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 151, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.28125f, 0.25f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-57.8125f, -17.375f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 151, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.28125f, 0.25f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-57.8125f, -17.375f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 151, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.28125f, 0.28125f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-57.8125f, -17.4375f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 151, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.28125f, 0.28125f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-57.8125f, -17.4375f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.625f, -0.75f, 0, -0.625f, -0.75f, 0)
			.setRotationPoint(-59.5f, -17.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0, 0.625f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-59.5f, -17.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.75f, 0, 1.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-58.875f, -17.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 1.5f, -0.75f, 0, -1.5f, -0.75f, 0)
			.setRotationPoint(-58.875f, -17.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.5f, 0, 0.3125f, -0.25f, 0, 0.015625f, 0.25f, 0, -0.015625f, -0.5f, 0, -0.3125f, -0.5f, 0, 0.3125f, -0.5f, 0, 0.015625f, -0.5f, 0, -0.015625f, -0.5f, 0)
			.setRotationPoint(-57.6875f, -18.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.015625f, -0.5f, 0, 0.015625f, 0.25f, 0, 0.3125f, -0.25f, 0, -0.3125f, -0.5f, 0, -0.015625f, -0.5f, 0, 0.015625f, -0.5f, 0, 0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(-57.6875f, -18.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0.578125f, -1, 0, -1.578125f, 0, 0, -0.375f, -0.25f, 0, -0.625f, -1, 0, 0.578125f, 0, 0, -1.578125f, 0, 0, -0.375f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-58.296875f, -18.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.625f, -1, 0, -0.375f, -0.25f, 0, -1.578125f, 0, 0, 0.578125f, -1, 0, -0.625f, 0, 0, -0.375f, 0, 0, -1.578125f, 0, 0, 0.578125f, 0, 0)
			.setRotationPoint(-58.296875f, -18.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.109375f, -1.203125f, 0, -0.140625f, 0, 0, -0.140625f, 0, -0.625f, 0, -1.203125f, -0.625f, 0.109375f, 0.203125f, 0, -0.109375f, -0.796875f, 0, 0.015625f, -0.78125f, -0.625f, 0, 0.203125f, -0.625f)
			.setRotationPoint(-58.765625f, -18.953125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.203125f, 0, -0.140625f, 0, 0, -0.140625f, 0, -0.625f, 0.109375f, -1.203125f, -0.625f, 0, 0.203125f, 0, 0.015625f, -0.78125f, 0, -0.109375f, -0.796875f, -0.625f, 0.109375f, 0.203125f, -0.625f)
			.setRotationPoint(-58.765625f, -18.953125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.21875f, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.32125002f, 0, -0.21875f, -1, 0, 0, -0.953125f, -0.25f, -0.25f, -0.35687503f, -0.25f)
			.setRotationPoint(-58.125f, -18.640625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, -0.21875f, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.36687505f, 0, 0, -0.953125f, 0, -0.21875f, -1, -0.25f, 0, -0.34125003f, -0.25f)
			.setRotationPoint(-58.125f, -18.640625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 151, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-57.625f, -19.015625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 151, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-57.625f, -19.015625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-41.5f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-33.5f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-33.5f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-8.75f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-8.75f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(15.75f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(15.75f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(32.5f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(32.5f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(40.5f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(40.5f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(7.75f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(7.75f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-16.75f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-16.75f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-41.5f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-47.25f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-47.25f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-25.5f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-25.5f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(23.5f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(23.5f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-1, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-1, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.25f, -22.375f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.25f, -20.5f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.25f, -22.375f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-47.25f, -20.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(47, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(47, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(43.125f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(45.125f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(43.125f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(45.125f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-45.375f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-43.375f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-45.375f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-43.375f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-38.375f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-35.875f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-38.375f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-35.875f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-30.375f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-27.875f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-30.375f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-27.875f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-13.625f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-11.125f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-13.625f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-11.125f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(10.875f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(13.375f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(10.875f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(13.375f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(27.625f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(30.125f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(27.625f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(30.125f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(35.625f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(38.125f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(35.625f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(38.125f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(18.75f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(21.25f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(18.75f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(21.25f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(3, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(5.5f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(3, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(5.5f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-5.75f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-3.25f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-5.75f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-3.25f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-21.5f, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-19, -22.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-21.5f, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-19, -22.125f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, -0.5f, 0.041249998f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(32.75f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, -0.5f, 0.041249998f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(40.75f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, -0.5f, 0.041249998f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(16, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, -0.5f, 0.041249998f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(8, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, -0.5f, 0.041249998f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-8.5f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, -0.5f, 0.041249998f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-16.5f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, -0.5f, 0.041249998f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-41.25f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, -0.5f, 0.041249998f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-33.25f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(32.75f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(40.75f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(16, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(8, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-8.5f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-16.5f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-41.25f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-33.25f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, 0.5f, 0.041249998f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(23.75f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, 0.5f, 0.041249998f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-25.25f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.041249998f, 0, 0.5f, 0.041249998f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-0.75f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(23.75f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-25.25f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-0.75f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.625f, 0, -0.6875f, -0.625f)
			.setRotationPoint(57.375f, -15.0625f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, -0.5f, -0.6875f, -0.625f, 0, -0.6875f, -0.625f)
			.setRotationPoint(57.375f, -15.0625f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.125f, 0, -0.25f, -0.125f)
			.setRotationPoint(57.375f, -16.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.125f, 0, -0.25f, -0.125f)
			.setRotationPoint(57.375f, -16.8125f, -10.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 147, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.375f, 0.1875f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(58.3125f, -16.0625f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 147, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.375f, 0.1875f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(58.3125f, -16.0625f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 147, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.40625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(58.25f, -16.0625f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 147, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.40625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(58.25f, -16.0625f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 147, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.34570312f, 0.375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(57.8125f, -17, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 147, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.34570312f, 0.375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(57.8125f, -17, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 147, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.34375f, 0.34375f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(57.8125f, -17.0625f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 147, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.34375f, 0.34375f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(57.8125f, -17.0625f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 146, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.2578125f, 0.34375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(57.8125f, -17.25f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 146, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.2578125f, 0.34375f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(57.8125f, -17.25f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 146, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.28125f, 0.25f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(57.8125f, -17.375f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 146, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.28125f, 0.25f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(57.8125f, -17.375f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 146, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.28125f, 0.28125f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(57.8125f, -17.4375f, 10.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 146, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.28125f, 0.28125f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(57.8125f, -17.4375f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, 0, 0, 0.25f, 0, 0.558125f, 0.25f, 0, -0.558125f, 0, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0.558125f, 0.25f, -0.25f, -0.558125f, 0, -0.25f, 0)
			.setRotationPoint(-48.75f, -18.75f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, 0, -0.6875f, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0.6775f, 0, -0.25f, -0.6875f, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0.6775f)
			.setRotationPoint(-42, -18.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 19, 1, 0, 0, 0, 0, 0.5f, 0, 2.5f, 0.5f, 0, -2.51f, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 2.5f, 0.5f, -0.25f, -2.51f, 0, -0.25f, 0)
			.setRotationPoint(-47.5f, -18.75f, -0.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 146, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 0.4375f, 0.4375f, 4, new Vec3f(0.0, -0.4375, 0.0))
			.setRotationPoint(-40.0625f, -16, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-40.5f, -13.4375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-40.5f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 146, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25390625f, 0.3125f, 4, new Vec3f(0.0, -0.4375, 0.0))
			.setRotationPoint(-40.0625f, -16.5625f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49.25f, -16.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(33, -16.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(32.5f, -12.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.5f, -16.75f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(31.25f, -18.375f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(32, -18, 2.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.5f, -16.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 19, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(33.5f, -18.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18.75f, 1, 0, 0, 0, 0, 0.5f, 0, 0.609375f, 0.5f, 0, -0.609375f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.609375f, 0.5f, 0, -0.609375f, 0, 0, 0)
			.setRotationPoint(39.5f, -18.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 19, 1, 0, 0, 0, 0, 0, 0, 2.4375f, 0, 0, -2.4375f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 2.4375f, 0, -0.25f, -2.4375f, 0, -0.25f, 0)
			.setRotationPoint(41, -18.75f, 1.890625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 19, 1, 0, 0, 0, -0.703125f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.703125f, 0, -0.25f, -0.703125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0.703125f)
			.setRotationPoint(47, -18.75f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(32.5f, -18.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(32.5f, -19.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(32.5f, -19.25f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0.09375f, 0, 0, 0.09375f, 0, 0, -0.01f, 0.5f, 0, -0.01f, 0.5f, 0, -0.328125f, 0, 0, -0.328125f, 0, 0, -0.328125f, 0.5f, 0, -0.328125f, 0.5f)
			.setRotationPoint(32.5f, -22.421875f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.036875002f, 0, 0, -0.036875002f, 0, 0, -0.234375f, 0, 0, -0.234375f, 0, 0, -0.234375f, 0, 0, -0.234375f, 0)
			.setRotationPoint(33.5f, -22.515625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0.25f, 0.046875f, 3.75f, 0.25f, 0.09375f, -3.75f, 0, -0.031249998f, 0, 0, -0.234375f, 0, 0.25f, -0.234375f, 3.75f, 0.25f, -0.234375f, -3.75f, 0, -0.234375f, 0)
			.setRotationPoint(39.5f, -22.515625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(48.75f, -12.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(48.75f, -16.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48.75f, -16.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(48.75f, -17.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.650625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.650625f)
			.setRotationPoint(47.75f, -0.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, -0.40625f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, -0.40625f, 0, -0.75f, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(47.75f, -0.25f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(49.75f, -0.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0.5f, 0, 0.1875f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(47.75f, -18.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(49.75f, -17.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(49.75f, -7, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 8, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(50.25f, -15.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(50.125f, -8, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(50.125f, -15.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(50.125f, -15.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(50.125f, -16, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(49.75f, -17.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(49.75f, -17.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(49.75f, -17.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.375f, 0, 0, 0.375f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.375f, 0, -0.375f, 0.375f)
			.setRotationPoint(34.5625f, -16, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.375f, 0, 0, 0.375f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0.375f, 0, -0.375f, 0.375f)
			.setRotationPoint(34.5625f, -12.875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(34.6875f, -16, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(34.6875f, -12.875f, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(34.625f, -16, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(34.625f, -12.875f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(34.6875f, -16.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(33.75f, -7.25f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(33.75f, -7, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.875f, 0, 0, -0.875f, 0, -0.6875f, 0, 0.0625f, -0.6875f, 0, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(34.25f, -7.375f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, -0.6875f, 0, 0, -0.6875f, 0, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(35.625f, -7.375f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, -0.125f, 0, -1, 0, 0, -1, 0, -0.6875f, 0.0625f, -0.125f, -0.6875f, 0, -0.8125f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(35.625f, -7.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, -0.6875f, -0.125f, 0, -0.6875f, 0, -0.875f, 0, -0.875f, -0.8125f, 0, -0.875f, -0.8125f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(34.25f, -7.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.6875f, 0.0625f, 0, -0.6875f, 0, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(34.4375f, -7.5625f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(33.5f, -6, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(39.875f, -5.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(33.5f, -5.75f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(33.5f, -5.75f, 8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(33.5f, -3.25f, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(33.5f, -3.25f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(33.5f, -3, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(40, -5, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(42.9375f, -5, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 4, 0, 0, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, -0.25f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, -0.75f)
			.setRotationPoint(46, -6.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(46.75f, -6.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(46.75f, -0.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.125f, 0, -0.875f, 0.125f)
			.setRotationPoint(46.75f, -6.875f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.1875f, 0, 0, -0.1875f, 0, 0.125f, 0, 0, -0.625f, 0, -0.875f, -0.75f, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0.125f, 0, -0.875f, -0.625f)
			.setRotationPoint(45.9375f, -6.875f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(50.75f, -6.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 145, textureX, textureY)
			.addShapeBox(-0.25f, 0, 0.0625f, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.625f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(47.5625f, -7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 145, textureX, textureY)
			.addShapeBox(-0.25f, 0, -2.375f, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.75f, 0, -0.625f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.5625f, -7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 96, textureX, textureY)
			.addShapeBox(-0.25f, 0, -2.125f, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0.1875f, 0, -0.75f, 0.1875f)
			.setRotationPoint(47.5625f, -7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 8, 0.1875f, 0.1875f, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(47.0625f, -5.5f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 8, 0.1875f, 0.1875f, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(47.0625f, -5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(47.0625f, -6.5f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(47.0625f, -7, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.125f, 0.125f, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(47.0625f, -7.25f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 145, textureX, textureY).addCylinder(0, 0, 0.5625f, 1, 1, 8, 0.09375f, 0.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(47.0625f, -7.125f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 145, textureX, textureY).addCylinder(0, 0, 1.8125f, 1, 1, 8, 0.125f, 0.0703125f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(47.0625f, -7.125f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 145, textureX, textureY)
			.addShapeBox(-0.125f, 0, -0.0625f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5625f, 0, -0.75f, -0.5625f)
			.setRotationPoint(47.0625f, -7.5f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 145, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0.3125f, 1, 1, 1, 0, 0, 0, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(47.0625f, -7.25f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 145, textureX, textureY)
			.addShapeBox(-0.125f, 0, -0.1875f, 1, 1, 1, 0, -0.0625f, 0, 0, -0.8125f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, -0.0625f, -0.75f, 0, -0.8125f, -0.75f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(47.0625f, -7.5f, 7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.25f, 0.25f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(47.5625f, -7.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 145, textureX, textureY).addCylinder(0, 0, -2.1875f, 1, 1, 8, 0.12890625f, 0.1875f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(47.5625f, -7.6875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 145, textureX, textureY).addCylinder(0, 0, -2.1875f, 1, 1, 8, 0.19921875f, 0.12890625f, 4, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(47.5625f, -8.4375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 145, textureX, textureY).addCylinder(0, 0, -2.1875f, 1, 1, 8, 0.09375f, 0.19921875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(47.5625f, -8.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 145, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.625f, 0.625f, 3, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(49, -9.75f, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(49.5f, -10.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 1, 4, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, -20.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 1, 4, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-50.75f, -20.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 2, 1, 0, 0, -1, 0, 0.5f, -1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, -19.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0, -1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, -19.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.25f, -20.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.25f, -20.25f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.1875f, -0.5f, 0, 0.1875f, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -2.1875f, -0.5f, 0, -2.1875f, -0.5f)
			.setRotationPoint(-40.5f, -18.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 2, 2, 0, 0, 0.1875f, -0.5f, 0.25f, 0.1875f, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -2.1875f, -0.5f, 0.25f, -2.1875f, -0.5f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.75f, -18.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 113, 1, 1, 0, 0.296875f, 0, 0, 0.046875f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0.296875f, -0.75f, 0, 0.046875f, -0.75f, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-56.375f, -17.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 113, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, 0.046875f, 0, 0, 0.296875f, 0, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, 0.046875f, -0.75f, 0, 0.296875f, -0.75f, 0)
			.setRotationPoint(-56.375f, -17.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 1.75f, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, -17.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 1.75f, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, -17.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 82, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-49.75f, -19.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 90, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-40.5f, -19.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(24.375f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(16.125f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(8.125f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-0.125f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-8.375f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-16.375f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-24.625f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-33.125f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(32.875f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(40.875f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(24.375f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(16.125f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(8.125f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-0.125f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-8.375f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-16.375f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-24.625f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-33.125f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-41.125f, -19.75f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(24.375f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(16.125f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(8.125f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-0.125f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-8.375f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-16.375f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-24.625f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-33.125f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(32.875f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(40.875f, -19.875f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(40.875f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(24.375f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(16.125f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(8.125f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-0.125f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-8.375f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-16.375f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-24.625f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-33.125f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-41.125f, -19.875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.75f, 0, -0.875f, -0.75f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-41.125f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(24.375f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(16.125f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(8.125f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-0.125f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-8.375f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-16.375f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-24.625f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-33.125f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(32.875f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(24.375f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(16.125f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(8.125f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-0.125f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-8.375f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-16.375f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-24.625f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-33.125f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(32.875f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(40.875f, -19.75f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(40.875f, -19.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(24.375f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(16.125f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(8.125f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-0.125f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-8.375f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-16.375f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-24.625f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-33.125f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.875f, 0, 0.125f, -0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-41.125f, -19.75f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(24.375f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(16.125f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(8.125f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-0.125f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-8.375f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-16.375f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-24.625f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-33.125f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-41.125f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(24.375f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(24.375f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(16.125f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(16.125f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(8.125f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(8.125f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-0.125f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-0.125f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-8.375f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-8.375f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-16.375f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-16.375f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-24.625f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-24.625f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-33.125f, -19.5f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-33.125f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(32.875f, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(24.375f, -19.0625f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-0.125f, -19.0625f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-24.625f, -19.0625f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.75f, 0, 0.03125f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(24.375f, -19.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.75f, 0, 0.03125f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-0.125f, -19.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.75f, 0, 0.03125f, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-24.625f, -19.0625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.375f, 0.25f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, -0.5f, 0.25f, -0.375f, -0.5f)
			.setRotationPoint(-24.625f, -18.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.375f, 0.25f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, -0.5f, 0.25f, -0.375f, -0.5f)
			.setRotationPoint(-0.125f, -18.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.375f, 0.25f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, -0.5f, 0.25f, -0.375f, -0.5f)
			.setRotationPoint(24.375f, -18.3125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 142, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.375f, 0.25f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, -0.5f, 0.25f, -0.375f, -0.5f)
			.setRotationPoint(-24.625f, -18.3125f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 142, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.375f, 0.25f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, -0.5f, 0.25f, -0.375f, -0.5f)
			.setRotationPoint(-0.125f, -18.3125f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 142, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0.25f, -0.375f, 0.25f, -0.5f, -0.375f, 0.25f, -0.5f, -0.375f, -0.5f, 0.25f, -0.375f, -0.5f)
			.setRotationPoint(24.375f, -18.3125f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-24.875f, -17.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-0.375f, -17.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(24.125f, -17.6875f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 141, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-24.875f, -17.6875f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 141, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-0.375f, -17.6875f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 141, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(24.125f, -17.6875f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f)
			.setRotationPoint(-24.875f, -17.4375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f)
			.setRotationPoint(-0.375f, -17.4375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f)
			.setRotationPoint(24.125f, -17.4375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 141, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f)
			.setRotationPoint(-24.875f, -17.4375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 141, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f)
			.setRotationPoint(-0.375f, -17.4375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 141, textureX, textureY)
			.addShapeBox(0, 0, 6.5f, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.5f, -0.25f, -0.75f, -0.5f)
			.setRotationPoint(24.125f, -17.4375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-33.125f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-33.125f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-33.125f, -18.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-33.125f, -18.75f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-24.625f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-24.625f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-24.625f, -18.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-24.625f, -18.75f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-16.375f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-16.375f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-16.375f, -18.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-16.375f, -18.75f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-8.375f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-8.375f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-8.375f, -18.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-8.375f, -18.75f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-0.125f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-0.125f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(-0.125f, -18.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(-0.125f, -18.75f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(8.125f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(8.125f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(8.125f, -18.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(8.125f, -18.75f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(16.125f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(16.125f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(16.125f, -18.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(16.125f, -18.75f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(24.375f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(24.375f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(24.375f, -18.75f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(24.375f, -18.75f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.28125f, 0.375f, -0.75f, -0.28125f, 0.375f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f)
			.setRotationPoint(32.875f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.75f, -0.28125f, -0.5f, 0, -0.28125f, -0.5f)
			.setRotationPoint(32.875f, -18.75f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-33.125f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-33.125f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-33.125f, -18, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-33.125f, -18, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-24.625f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-24.625f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-24.625f, -18, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-24.625f, -18, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-16.375f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-16.375f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-16.375f, -18, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-16.375f, -18, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-8.375f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-8.375f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-8.375f, -18, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-8.375f, -18, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-0.125f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-0.125f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-0.125f, -18, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(-0.125f, -18, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(8.125f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(8.125f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(8.125f, -18, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(8.125f, -18, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(16.125f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(16.125f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(16.125f, -18, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(16.125f, -18, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(24.375f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(24.375f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(24.375f, -18, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(24.375f, -18, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.03125f, 0, -0.75f, 0.03125f, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.34375f, 0, -0.75f, -0.34375f, 0, -0.75f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(32.875f, -18, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.03125f, -0.875f, 0, 0.03125f, -0.875f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.34375f, -0.875f, 0, -0.34375f, -0.875f)
			.setRotationPoint(32.875f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-33.125f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-33.125f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-33.125f, -17.28125f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-33.125f, -17.28125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-24.625f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-24.625f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-24.625f, -17.28125f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-24.625f, -17.28125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-16.375f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-16.375f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-16.375f, -17.28125f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-16.375f, -17.28125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-8.375f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-8.375f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-8.375f, -17.28125f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-8.375f, -17.28125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-0.125f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-0.125f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(-0.125f, -17.28125f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(-0.125f, -17.28125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(8.125f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(8.125f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(8.125f, -17.28125f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(8.125f, -17.28125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(16.125f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(16.125f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(16.125f, -17.28125f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(16.125f, -17.28125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(24.375f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(24.375f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(24.375f, -17.28125f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(24.375f, -17.28125f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.0625f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.09375f, -0.875f, 0, 0.09375f, -0.875f, 0, -0.875f, -0.1875f, -0.75f, -0.875f, -0.1875f, -0.75f, -1, -0.78125f, 0, -1, -0.78125f)
			.setRotationPoint(32.875f, -17.28125f, -4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.09375f, 0, -0.75f, 0.09375f, 0, -0.75f, 0.0625f, -0.875f, 0, 0.0625f, -0.875f, 0, -1, 0.09375f, -0.75f, -1, 0.09375f, -0.75f, -0.875f, -1.0625f, 0, -0.875f, -1.0625f)
			.setRotationPoint(32.875f, -17.28125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-33.125f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-33.125f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-33.125f, -17.28125f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-33.125f, -17.28125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-24.625f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-24.625f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-24.625f, -17.28125f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-24.625f, -17.28125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-16.375f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-16.375f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-16.375f, -17.28125f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-16.375f, -17.28125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-8.375f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-8.375f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-8.375f, -17.28125f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-8.375f, -17.28125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-0.125f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-0.125f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(-0.125f, -17.28125f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(-0.125f, -17.28125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(8.125f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(8.125f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard3(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(8.125f, -17.28125f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(8.125f, -17.28125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(16.125f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(16.125f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(16.125f, -17.28125f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(16.125f, -17.28125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(24.375f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(24.375f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(24.375f, -17.28125f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(24.375f, -17.28125f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.03125f, -0.75f, 0, -0.03125f, -0.75f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f)
			.setRotationPoint(32.875f, -17.28125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.71875f, 0, 0, -0.71875f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.875f, -0.6875f, 0, -0.875f, -0.6875f)
			.setRotationPoint(32.875f, -17.28125f, -3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1.375f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.75f, -19.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1, 0, 0, 0.5f, 0)
			.setRotationPoint(50.75f, -20.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49.75f, -18.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(49.75f, -17.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(49.75f, -19.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0.041249998f, 0, 0.5f, 0.041249998f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(47.25f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 1, 0, -0.078125f, 0.25f, 0, -0.375f, -0.25f, 0, 0, 0.125f, 0, 0, -0.5f, 0, -0.078125f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(54.75f, -18.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0.125f, -1, 0, -1.078125f, -1.25f, 0, 0, -0.5f, 0, 0, 0, 0, 0.125f, 1, 0, -1.078125f, 1, 0, 0, 0.5f, 0)
			.setRotationPoint(54.75f, -19.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.015625f, 0.25f, 0, -0.015625f, -0.5f, 0, -0.3125f, -0.5f, 0, 0.3125f, -0.25f, 0, 0.015625f, -0.5f, 0, -0.015625f, -0.5f, 0, -0.3125f, -0.5f, 0, 0.3125f, -0.5f, 0)
			.setRotationPoint(56.6875f, -18.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, -1.203125f, 0, 0, 0.203125f, -1, 0, -1, -1, 0, 0, -0.25f, 0, -1.203125f, 0, 0, 0.203125f, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(56.671875f, -18.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.75f, 0, 1.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(56.375f, -17.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.203125f, 0, 0, 0.203125f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0)
			.setRotationPoint(49.75f, -22.41625f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0.203125f, 0, 0, 0.203125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.16625f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0)
			.setRotationPoint(49.75f, -22.41625f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.046875f, 0, 0, 0.046875f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48.75f, -22.5f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(47.25f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 1.04125f, 0, 0.359375f, 0, 0, 0.25f, 0, 0, 0, 1, 0, 0, 0.0625f, 0, 0.359375f, 0.53125f, 0, 0.25f, 0.53125f, 0, 0, 0.125f, 0)
			.setRotationPoint(50.75f, -21.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 1, 0, 0.25f, 0, 0, 0.359375f, 0, 0, 0, 1.04125f, 0, 0, 0.125f, 0, 0.25f, 0.53125f, 0, 0.359375f, 0.53125f, 0, 0, 0.0625f, 0)
			.setRotationPoint(50.75f, -21.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(57.375f, -23.125f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.421875f, 0, 0, 0.8125f, 0, 0, 0.21875f, 0.5f, 0, -1, 0.5f)
			.setRotationPoint(57.375f, -20.375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -1, 0, 0, 0.21875f, 0, 0, 0.8125f, 0.5f, 0, -0.421875f, 0.5f)
			.setRotationPoint(57.375f, -20.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0, 0.625f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(57.875f, -17.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.625f, -0.75f, 0, -0.625f, -0.75f, 0)
			.setRotationPoint(57.875f, -17.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, -0.25f, 0, -1, -1, 0, 0.203125f, -1, 0, -1.203125f, 0, 0, 0, 0, 0, -1, 0, 0, 0.203125f, 0, 0, -1.203125f, 0, 0)
			.setRotationPoint(56.671875f, -18.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -0.5f, 0, -1.078125f, -1.25f, 0, 0.125f, -1, 0, 0, 0, 0, 0, 0.5f, 0, -1.078125f, 1, 0, 0.125f, 1, 0, 0, 0, 0)
			.setRotationPoint(54.75f, -19.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.5f, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(50.75f, -20.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49.75f, -18.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -1, 0, 0, -1.375f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.75f, -19.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.125f, 0, -0.375f, -0.25f, 0, -0.078125f, 0.25f, 0, 0, 1, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.078125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(54.75f, -18.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3125f, -0.25f, 0, -0.3125f, -0.5f, 0, -0.015625f, -0.5f, 0, 0.015625f, 0.25f, 0, 0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.015625f, -0.5f, 0, 0.015625f, -0.5f, 0)
			.setRotationPoint(56.6875f, -18.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 1.5f, -0.75f, 0, -1.5f, -0.75f, 0)
			.setRotationPoint(56.375f, -17.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.15625f, -1.203125f, 0, -0.265625f, -1.203125f, -0.625f, 0, 0, -0.625f, 0.03125f, -0.796875f, 0, -0.15625f, 0.203125f, 0, -0.265625f, 0.203125f, -0.625f, 0.15625f, -0.78125f, -0.625f)
			.setRotationPoint(57.90625f, -18.953125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.265625f, -1.203125f, 0, -0.15625f, -1.203125f, -0.625f, 0, 0, -0.625f, 0.15625f, -0.78125f, 0, -0.265625f, 0.203125f, 0, -0.15625f, 0.203125f, -0.625f, 0.03125f, -0.796875f, -0.625f)
			.setRotationPoint(57.90625f, -18.953125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.0625f, 0, -0.84375f, -1.359375f, 0, -0.84375f, -1.359375f, -0.625f, 0, 0, -0.625f, 0.25f, -0.8125f, 0, -0.875f, 0.5625f, 0, -1, 0.578125f, -0.625f, 0.25f, -0.75f, -0.625f)
			.setRotationPoint(56.75f, -20.3125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.84375f, -1.359375f, 0, -0.84375f, -1.359375f, -0.625f, 0, 0.0625f, -0.625f, 0.25f, -0.75f, 0, -1, 0.578125f, 0, -0.875f, 0.5625f, -0.625f, 0.25f, -0.8125f, -0.625f)
			.setRotationPoint(56.75f, -20.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.25f, -2, 0, -0.14625001f, -2, 0, -0.10375f, 0, 0, 0, 0.4375f, 0, -0.25f, 1, 0, -0.14625001f, 1, 0, -0.10375f, 0.453125f, 0)
			.setRotationPoint(56.125f, -19.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.10375f, 0, 0, -0.14625001f, -2, 0, -0.25f, -2, 0, 0, 0, 0, -0.10375f, 0.453125f, 0, -0.14625001f, 1, 0, -0.25f, 1, 0, 0, 0.4375f, 0)
			.setRotationPoint(56.125f, -19.75f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 1.130625f, 0, 0.47875f, 0, 0, 0.375f, 0, 0, 0, 1.0525f, 0, 0, 0, 0, 0.47875f, 0.453125f, 0, 0.375f, 0.4375f, 0, 0, 0, 0)
			.setRotationPoint(54.75f, -19.75f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 1.0525f, 0, 0.375f, 0, 0, 0.47875f, 0, 0, 0, 1.130625f, 0, 0, 0, 0, 0.375f, 0.4375f, 0, 0.47875f, 0.453125f, 0, 0, 0, 0)
			.setRotationPoint(54.75f, -19.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.578125f, 0, -0.25f, 0.0043749996f, 0, -0.25f, 0.08375f, 0, -0.109375f, 0.578125f, 0, 0, -0.046875f, 0, -0.25f, 0.046875f, 0, -0.25f, 0.046875f, 0, -0.109375f, -0.046875f, 0)
			.setRotationPoint(54, -20.796875f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.109375f, 0.578125f, 0, -0.25f, 0.08375f, 0, -0.25f, 0.0043749996f, 0, 0, 0.578125f, 0, -0.109375f, -0.046875f, 0, -0.25f, 0.046875f, 0, -0.25f, 0.046875f, 0, 0, -0.046875f, 0)
			.setRotationPoint(54, -20.796875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(57, -24.375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.625f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(57, -24.375f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0.5f, 0, 0.25f, 0.5f)
			.setRotationPoint(57, -24.375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(57.125f, -25.375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.5f, -1.125f, 0, 0.484375f, -1.1875f, -0.625f, 0, -0.0625f, -0.625f, 0, -0.625f, 0, 0.390625f, 0.5f, 0, 0.375f, 0.5625f, -0.625f, 0, -0.5625f, -0.625f)
			.setRotationPoint(50.75f, -23.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.0625f, 0, 0.5f, -1.1875f, 0, 0.484375f, -1.125f, -0.625f, 0, 0, -0.625f, 0, -0.5625f, 0, 0.390625f, 0.5625f, 0, 0.375f, 0.5f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(50.75f, -23.375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, -1.875f, 0, 0.5f, -1.9375f, -0.625f, 0.015625f, -0.0625f, -0.625f, 0.109375f, -0.625f, 0, 0.25f, 1.125f, 0, 0.25f, 1.1875f, -0.625f, 0.125f, -0.5625f, -0.625f)
			.setRotationPoint(54.25f, -22.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.0625f, 0, 0.5f, -1.9375f, 0, 0.5f, -1.875f, -0.625f, 0.015625f, 0, -0.625f, 0.109375f, -0.5625f, 0, 0.25f, 1.1875f, 0, 0.25f, 1.125f, -0.625f, 0.125f, -0.625f, -0.625f)
			.setRotationPoint(54.25f, -22.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(55.875f, -21.765625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(55.875f, -21.765625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.08562499f, 0, -0.75f, -0.00749999f, 0, -0.75f, 0.02937502f, -0.75f, 0, -0.05f, -0.75f)
			.setRotationPoint(55.625f, -23.140625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.00999999f, 0, -0.75f, 0.10937501f, 0, -0.75f, 0.0625f, -0.75f, 0, -0.02562499f, -0.75f)
			.setRotationPoint(55.625f, -23.140625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(55.625f, -22.890625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, -0.161875f, 0, -0.75f, -0.161875f, 0, -0.75f, -0.151875f, -0.75f, 0, -0.151875f, -0.75f)
			.setRotationPoint(57.453125f, -22.213125f, 5).setRotationAngle(0, 0, 36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.151875f, 0, -0.75f, -0.151875f, 0, -0.75f, -0.161875f, -0.75f, 0, -0.161875f, -0.75f)
			.setRotationPoint(57.453125f, -22.213125f, -5.25f).setRotationAngle(0, 0, 36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.125f, -0.75f, -0.25f, 0.125f, -0.75f, 0, -1, 0, 0, -1, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(57.671875f, -22.515625f, 5).setRotationAngle(0, 0, 36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(57.671875f, -22.515625f, -5.25f).setRotationAngle(0, 0, 36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(57.671875f, -22.515625f, 4.5f).setRotationAngle(0, 0, 36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(57.671875f, -22.515625f, -4.875f).setRotationAngle(0, 0, 36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.03125f, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0.03125f, -1, 0, -0.25f, -0.28125f, 0, -0.5f, -0.296875f, -0.25f, 0.25f, -0.953125f, -0.25f)
			.setRotationPoint(57.375f, -18.640625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.25f, 0, -0.25f, 0.03125f, 0, -0.25f, 0.25f, -0.953125f, 0, -0.5f, -0.36687505f, 0, -0.25f, -0.34125003f, -0.25f, 0.03125f, -1, -0.25f)
			.setRotationPoint(57.375f, -18.640625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(57.625f, -19.015625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.375f, 0.375f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(57.625f, -19.015625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.359375f, 0.359375f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(57.625f, -21.390625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.359375f, 0.359375f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(57.625f, -21.390625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.13476562f, 0.359375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(57.625f, -21.515625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.13476562f, 0.359375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(57.625f, -21.515625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(57.875f, -21.015625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(57.875f, -21.015625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(57.125f, -21.015625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(57.125f, -21.015625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(57.375f, -21.015625f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(57.375f, -21.015625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(57.125f, -20.765625f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(57.125f, -20.765625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(58.125f, -20.203125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(57.0625f, -20.203125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(58.125f, -20.203125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(57.0625f, -20.203125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.203125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(58.1875f, -20.203125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.203125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(58.1875f, -20.203125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.203125f, 0.40625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(57, -20.203125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.203125f, 0.40625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(57, -20.203125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 135, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57.625f, -20.203125f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57.625f, -20.203125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57.625f, -20.203125f, 7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57.625f, -20.203125f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.203125f, 0.40625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57.625f, -20.203125f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.203125f, 0.40625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57.625f, -20.203125f, 7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.203125f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57.625f, -20.203125f, -7.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.203125f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57.625f, -20.203125f, 8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 3, 8, 0.21875f, 0.21875f, 2, null)
			.setRotationPoint(48.171875f, -21.140625f, 6.5625f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 134, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.125f, 0.125f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(47.875f, -21, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4375f, -0.125f, 0, -0.5625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4375f, -0.125f, -0.5f, -0.5625f)
			.setRotationPoint(47.625f, -21.296875f, 6.375f).setRotationAngle(0, 0, -11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, -0.0625f, -0.5f, 0.25f, -0.0625f, -0.75f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, 0.25f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, -0.75f, -0.5625f, -0.8125f, 0, -0.5625f, -0.8125f)
			.setRotationPoint(24.375f, -21.5625f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.03125f, -0.75f, -0.0625f, 0.03125f, -0.5f, 0.25f, -0.8125f, 0.25f, 0.25f, -0.8125f, 0, -0.5625f, -0.0625f, -0.75f, -0.5625f, -0.0625f, -0.5f, -0.375f, -0.625f, 0.25f, -0.375f, -0.625f)
			.setRotationPoint(24.375f, -21.5625f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, -0.0625f, -0.5f, 0.25f, -0.0625f, -0.75f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, 0.25f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, -0.75f, -0.5625f, -0.8125f, 0, -0.5625f, -0.8125f)
			.setRotationPoint(-0.125f, -21.5625f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.03125f, -0.75f, -0.0625f, 0.03125f, -0.5f, 0.25f, -0.8125f, 0.25f, 0.25f, -0.8125f, 0, -0.5625f, -0.0625f, -0.75f, -0.5625f, -0.0625f, -0.5f, -0.375f, -0.625f, 0.25f, -0.375f, -0.625f)
			.setRotationPoint(-0.125f, -21.5625f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.125f, 0.125f, -0.25f, -0.125f, 0.125f, -0.25f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f)
			.setRotationPoint(24.125f, -21.875f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.0625f, -0.125f, -0.25f, -0.0625f, -0.125f, -0.25f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(24.125f, -21.875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.125f, 0.125f, -0.25f, -0.125f, 0.125f, -0.25f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f)
			.setRotationPoint(-0.375f, -21.875f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.0625f, -0.125f, -0.25f, -0.0625f, -0.125f, -0.25f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(-0.375f, -21.875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, 0.25f, -0.5625f, 0.25f, 0.25f, -0.5625f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.5f, -0.375f, -0.75f, 0.25f, -0.375f, -0.75f)
			.setRotationPoint(24.375f, -21.625f, 0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, 0.0625f, -0.5f, 0.25f, 0.0625f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.75f, -0.75f, -0.5625f, 0, -0.75f, -0.5625f)
			.setRotationPoint(24.375f, -21.625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, 0.25f, -0.5625f, 0.25f, 0.25f, -0.5625f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.5f, -0.375f, -0.75f, 0.25f, -0.375f, -0.75f)
			.setRotationPoint(-0.125f, -21.625f, 0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, 0.0625f, -0.5f, 0.25f, 0.0625f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.75f, -0.75f, -0.5625f, 0, -0.75f, -0.5625f)
			.setRotationPoint(-0.125f, -21.625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f)
			.setRotationPoint(24.375f, -21.875f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(24.375f, -21.875f, -0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f)
			.setRotationPoint(-0.125f, -21.875f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-0.125f, -21.875f, -0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, -0.0625f, -0.5f, 0.25f, -0.0625f, -0.75f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, 0.25f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, -0.75f, -0.5625f, -0.8125f, 0, -0.5625f, -0.8125f)
			.setRotationPoint(26, -21.5625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.03125f, -0.75f, -0.0625f, 0.03125f, -0.5f, 0.25f, -0.8125f, 0.25f, 0.25f, -0.8125f, 0, -0.5625f, -0.0625f, -0.75f, -0.5625f, -0.0625f, -0.5f, -0.375f, -0.625f, 0.25f, -0.375f, -0.625f)
			.setRotationPoint(22.75f, -21.5625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.125f, 0.125f, -0.25f, -0.125f, 0.125f, -0.25f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f)
			.setRotationPoint(1.25f, -21.875f, 0.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.03125f, -0.75f, -0.0625f, 0.03125f, -0.5f, 0.25f, -0.8125f, 0.25f, 0.25f, -0.8125f, 0, -0.5625f, -0.0625f, -0.75f, -0.5625f, -0.0625f, -0.5f, -0.375f, -0.625f, 0.25f, -0.375f, -0.625f)
			.setRotationPoint(-1.75f, -21.5625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, -0.0625f, -0.5f, 0.25f, -0.0625f, -0.75f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, 0.25f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, -0.75f, -0.5625f, -0.8125f, 0, -0.5625f, -0.8125f)
			.setRotationPoint(-23, -21.5625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.03125f, -0.75f, -0.0625f, 0.03125f, -0.5f, 0.25f, -0.8125f, 0.25f, 0.25f, -0.8125f, 0, -0.5625f, -0.0625f, -0.75f, -0.5625f, -0.0625f, -0.5f, -0.375f, -0.625f, 0.25f, -0.375f, -0.625f)
			.setRotationPoint(-26.25f, -21.5625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, -0.0625f, -0.5f, 0.25f, -0.0625f, -0.75f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, 0.25f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, -0.75f, -0.5625f, -0.8125f, 0, -0.5625f, -0.8125f)
			.setRotationPoint(1.5f, -21.5625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.125f, 0.125f, -0.25f, -0.125f, 0.125f, -0.25f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f)
			.setRotationPoint(25.75f, -21.875f, 0.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.0625f, -0.125f, -0.25f, -0.0625f, -0.125f, -0.25f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(23, -21.875f, 0.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.0625f, -0.125f, -0.25f, -0.0625f, -0.125f, -0.25f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(-1.5f, -21.875f, 0.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.125f, 0.125f, -0.25f, -0.125f, 0.125f, -0.25f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f)
			.setRotationPoint(-23.25f, -21.875f, 0.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.0625f, -0.125f, -0.25f, -0.0625f, -0.125f, -0.25f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(-26, -21.875f, 0.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, 0.25f, -0.5625f, 0.25f, 0.25f, -0.5625f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.5f, -0.375f, -0.75f, 0.25f, -0.375f, -0.75f)
			.setRotationPoint(25.375f, -21.625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, 0.0625f, -0.5f, 0.25f, 0.0625f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.75f, -0.75f, -0.5625f, 0, -0.75f, -0.5625f)
			.setRotationPoint(23.25f, -21.625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, 0.25f, -0.5625f, 0.25f, 0.25f, -0.5625f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.5f, -0.375f, -0.75f, 0.25f, -0.375f, -0.75f)
			.setRotationPoint(0.875f, -21.625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, 0.0625f, -0.5f, 0.25f, 0.0625f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.75f, -0.75f, -0.5625f, 0, -0.75f, -0.5625f)
			.setRotationPoint(-1.25f, -21.625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, 0.25f, -0.5625f, 0.25f, 0.25f, -0.5625f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.5f, -0.375f, -0.75f, 0.25f, -0.375f, -0.75f)
			.setRotationPoint(-23.625f, -21.625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, 0.0625f, -0.5f, 0.25f, 0.0625f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.75f, -0.75f, -0.5625f, 0, -0.75f, -0.5625f)
			.setRotationPoint(-25.75f, -21.625f, 0.125f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(24.625f, -21.875f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, -0.0625f, -0.5f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, -0.0625f, -0.5f, -0.75f)
			.setRotationPoint(23.625f, -21.875f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(0.125f, -21.875f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, -0.0625f, -0.5f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, -0.0625f, -0.5f, -0.75f)
			.setRotationPoint(-0.875f, -21.875f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-24.375f, -21.875f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, -0.0625f, -0.5f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, -0.0625f, -0.5f, -0.75f)
			.setRotationPoint(-25.375f, -21.875f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(24.375f, -22.625f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-0.125f, -22.625f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-24.625f, -22.625f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, -0.0625f, -0.5f, 0.25f, -0.0625f, -0.75f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, 0.25f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, -0.75f, -0.5625f, -0.8125f, 0, -0.5625f, -0.8125f)
			.setRotationPoint(-24.625f, -21.5625f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.03125f, -0.75f, -0.0625f, 0.03125f, -0.5f, 0.25f, -0.8125f, 0.25f, 0.25f, -0.8125f, 0, -0.5625f, -0.0625f, -0.75f, -0.5625f, -0.0625f, -0.5f, -0.375f, -0.625f, 0.25f, -0.375f, -0.625f)
			.setRotationPoint(-24.625f, -21.5625f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, -0.0625f, -0.6875f, 0, -0.0625f, -0.6875f, 0, -0.125f, 0.125f, -0.25f, -0.125f, 0.125f, -0.25f, -0.0625f, -0.875f, 0, -0.0625f, -0.875f)
			.setRotationPoint(-24.875f, -21.875f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0.0625f, -0.25f, -0.0625f, 0.0625f, -0.25f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.0625f, -0.125f, -0.25f, -0.0625f, -0.125f, -0.25f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(-24.875f, -21.875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, 0.25f, -0.5625f, 0.25f, 0.25f, -0.5625f, 0, -0.75f, 0.0625f, -0.75f, -0.75f, 0.0625f, -0.5f, -0.375f, -0.75f, 0.25f, -0.375f, -0.75f)
			.setRotationPoint(-24.625f, -21.625f, 0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0.25f, 0.0625f, -0.5f, 0.25f, 0.0625f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.75f, -0.75f, -0.5625f, 0, -0.75f, -0.5625f)
			.setRotationPoint(-24.625f, -21.625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f)
			.setRotationPoint(-24.625f, -21.875f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-24.625f, -21.875f, -0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-58.375f, -23.125f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.8125f, 0, 0, -0.421875f, 0, 0, -1, 0.5f, 0, 0.234375f, 0.5f)
			.setRotationPoint(-58.375f, -20.375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.234375f, 0, 0, -1, 0, 0, -0.421875f, 0.5f, 0, 0.8125f, 0.5f)
			.setRotationPoint(-58.375f, -20.375f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, -0.703125f, -1.25f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0, 0.5f, -1, 0, -0.703125f, 1, 0, -0.375f, 0.5f, 0, -0.375f, 0, 0, 0.5f, 1, 0)
			.setRotationPoint(-57.375f, -19.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0.5f, -1, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0, -0.703125f, -1.25f, 0, 0.5f, 1, 0, -0.375f, 0, 0, -0.375f, 0.5f, 0, -0.703125f, 1, 0)
			.setRotationPoint(-57.375f, -19.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, -0.375f, 0.125f, 0, -0.375f, 1, 0, 0.296875f, 0.25f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0.296875f, -0.5f, 0)
			.setRotationPoint(-56.375f, -18.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.296875f, 0.25f, 0, -0.375f, 1, 0, -0.375f, 0.125f, 0, 0, -0.25f, 0, 0.296875f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-56.375f, -18.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -1.375f, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.75f, -19.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, -1.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.75f, -19.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0)
			.setRotationPoint(-54.75f, -20.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1, 0)
			.setRotationPoint(-54.75f, -20.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, -18.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, -18.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-50.75f, -17.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-50.75f, -19.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0.203125f, 0, 0, 0.203125f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0)
			.setRotationPoint(-50.75f, -22.41625f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0.203125f, 0, 0, 0.203125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.16625f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0, 0, 0.16625f, 0)
			.setRotationPoint(-50.75f, -22.41625f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.10375f, -2, 0, -0.35375f, 0, 0, -0.25f, 0, 0, 0, -2, 0, 0.10374999f, 1, 0, -0.35375f, 0.453125f, 0, -0.25f, 0.4375f, 0, 0, 1, 0)
			.setRotationPoint(-57.875f, -19.75f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -2, 0, -0.25f, 0, 0, -0.35375f, 0, 0, 0.10375f, -2, 0, 0, 1, 0, -0.25f, 0.4375f, 0, -0.35375f, 0.453125f, 0, 0.10375f, 1, 0)
			.setRotationPoint(-57.875f, -19.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.10375f, 0, 0, 0.375f, 1.130625f, 0, 0.375f, 1.0525f, 0, 0, 0, 0, 0.10375f, 0.453125f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0.4375f, 0)
			.setRotationPoint(-56.125f, -19.75f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 1.0525f, 0, 0.375f, 1.130625f, 0, 0.10375f, 0, 0, 0, 0.4375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.10375f, 0.453125f, 0)
			.setRotationPoint(-56.125f, -19.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.08375f, 0, -0.359375f, 0.578125f, 0, -0.25f, 0.578125f, 0, 0, 0.0043749996f, 0, 0, 0.046875f, 0, -0.359375f, -0.046875f, 0, -0.25f, -0.046875f, 0, 0, 0.046875f, 0)
			.setRotationPoint(-54.75f, -20.796875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.0043749996f, 0, -0.25f, 0.578125f, 0, -0.359375f, 0.578125f, 0, 0, 0.08375f, 0, 0, 0.046875f, 0, -0.25f, -0.046875f, 0, -0.359375f, -0.046875f, 0, 0, 0.046875f, 0)
			.setRotationPoint(-54.75f, -20.796875f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0.109375f, 0, 0, 0.25f, 1.04125f, 0, 0.25f, 1, 0, 0, 0, 0, 0.109375f, 0.53125f, 0, 0.25f, 0.0625f, 0, 0.25f, 0.125f, 0, 0, 0.53125f, 0)
			.setRotationPoint(-54, -21.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0.25f, 1, 0, 0.25f, 1.04125f, 0, 0.109375f, 0, 0, 0, 0.53125f, 0, 0.25f, 0.125f, 0, 0.25f, 0.0625f, 0, 0.109375f, 0.53125f, 0)
			.setRotationPoint(-54, -21.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-50.75f, -22.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0.041249998f, 0, 0.5f, 0.041249998f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-50.75f, -22.375f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-57.375f, -24.375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.625f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-57.375f, -24.375f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-57.5f, -25.375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-57.375f, -24.375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0.041249998f, 0, 0, 0.041249998f, 0, 0, 0, 0, 0, 0, 0, 0, 0.056875f, 0, 0, 0.056875f, 0, 0, 0.056875f, 0, 0, 0.056875f, 0)
			.setRotationPoint(-49.75f, -22.5625f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 4, 1, 0, 0, 0.08999999f, 0, 0.25f, -0.046875f, 3.75f, 0.25f, 0, -3.75f, 0, 0.049999997f, 0, 0, -0.234375f, 0, 0.25f, -0.234375f, 3.75f, 0.25f, -0.234375f, -3.75f, 0, -0.234375f, 0)
			.setRotationPoint(-48.75f, -22.515625f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15625f, -1.359375f, 0, 0.3125f, 0.0625f, 0, 0.3125f, 0, -0.625f, -0.15625f, -1.359375f, -0.625f, -0.1875f, 0.5625f, 0, 0.5625f, -0.8125f, 0, 0.5625f, -0.75f, -0.625f, -0.3125f, 0.578125f, -0.625f)
			.setRotationPoint(-58.0625f, -20.3125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15625f, -1.359375f, 0, 0.3125f, 0, 0, 0.3125f, 0.0625f, -0.625f, -0.15625f, -1.359375f, -0.625f, -0.3125f, 0.578125f, 0, 0.5625f, -0.75f, 0, 0.5625f, -0.8125f, -0.625f, -0.1875f, 0.5625f, -0.625f)
			.setRotationPoint(-58.0625f, -20.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.125f, 0, 0.5f, 0, 0, 0.5f, -0.0625f, -0.625f, -0.015625f, -1.1875f, -0.625f, -0.109375f, 0.5f, 0, 0.5f, -0.625f, 0, 0.5f, -0.5625f, -0.625f, -0.125f, 0.5625f, -0.625f)
			.setRotationPoint(-54.25f, -23.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1.875f, 0, 0.5f, 0, 0, 0.515625f, -0.0625f, -0.625f, 0, -1.9375f, -0.625f, -0.25f, 1.125f, 0, 0.609375f, -0.625f, 0, 0.625f, -0.5625f, -0.625f, -0.25f, 1.1875f, -0.625f)
			.setRotationPoint(-56.75f, -22.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.1875f, 0, 0.5f, -0.0625f, 0, 0.5f, 0, -0.625f, -0.015625f, -1.125f, -0.625f, -0.109375f, 0.5625f, 0, 0.5f, -0.5625f, 0, 0.5f, -0.625f, -0.625f, -0.125f, 0.5f, -0.625f)
			.setRotationPoint(-54.25f, -23.375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1.9375f, 0, 0.5f, -0.0625f, 0, 0.515625f, 0, -0.625f, 0, -1.875f, -0.625f, -0.25f, 1.1875f, 0, 0.609375f, -0.5625f, 0, 0.625f, -0.625f, -0.625f, -0.25f, 1.125f, -0.625f)
			.setRotationPoint(-56.75f, -22.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, -0.16187501f, 0, -0.75f, -0.16187501f, 0, -0.75f, -0.15187502f, -0.75f, 0, -0.15187502f, -0.75f)
			.setRotationPoint(-57.65625f, -22.0725f, 5).setRotationAngle(0, 0, -36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.15187502f, 0, -0.75f, -0.15187502f, 0, -0.75f, -0.16187501f, -0.75f, 0, -0.16187501f, -0.75f)
			.setRotationPoint(-57.65625f, -22.0725f, -5.25f).setRotationAngle(0, 0, -36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.125f, -0.75f, -0.25f, 0.125f, -0.75f, 0, -1, 0, 0, -1, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-57.875f, -22.375f, 5).setRotationAngle(0, 0, -36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-57.875f, -22.375f, -5.25f).setRotationAngle(0, 0, -36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-57.875f, -22.375f, 4.5f).setRotationAngle(0, 0, -36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-57.875f, -22.375f, -4.875f).setRotationAngle(0, 0, -36)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-55.875f, -22.890625f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.078125f, 0, -0.75f, -0.01f, 0, -0.75f, 0.025625f, -0.75f, 0, 0.115f, -0.75f)
			.setRotationPoint(-55.875f, -23.140625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.035000026f, 0, -0.75f, -0.03437501f, 0, -0.75f, -0.069999985f, -0.75f, 0, 0.008125009f, -0.75f)
			.setRotationPoint(-55.875f, -23.140625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-57.75f, -21.765625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-57.75f, -21.765625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 112, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 3, 8, 0.21875f, 0.21875f, 2, null)
			.setRotationPoint(-51, -21.625f, -6.75f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, -0.125f, -0.5f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.5f, 0, -0.625f, -0.5f, -0.125f, -0.5f, -0.5f, -0.4375f, 0, -0.5f, -0.4375f)
			.setRotationPoint(-48, -21.296875f, -6.9375f).setRotationAngle(0, 0, 11)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 96, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.125f, 0.125f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-47.875f, -21, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 96, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.13476562f, 0.359375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-57.625f, -21.515625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 96, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.13476562f, 0.359375f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-57.625f, -21.515625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 96, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.359375f, 0.359375f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-57.625f, -21.390625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 96, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.359375f, 0.359375f, 4, new Vec3f(0.0, -0.625, 0.0))
			.setRotationPoint(-57.625f, -21.390625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-58.125f, -21.015625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, -0.25f, 0, 0, -0.5f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-58.125f, -21.015625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.5f, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-57.875f, -21.015625f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.5f, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-57.875f, -21.015625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-57.375f, -21.015625f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.25f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-57.375f, -21.015625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-58.125f, -20.765625f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-58.125f, -20.765625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 69, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-57.625f, -20.203125f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 69, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-57.625f, -20.203125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 67, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-57.625f, -20.203125f, 7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 62, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-57.625f, -20.203125f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 61, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-57.125f, -20.203125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 61, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-58.1875f, -20.203125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 59, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-57.125f, -20.203125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 59, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.4375f, 0.4375f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-58.1875f, -20.203125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 59, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.203125f, 0.40625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-58.25f, -20.203125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 49, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.203125f, 0.40625f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-58.25f, -20.203125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 28, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.203125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-57.0625f, -20.203125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 18, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.203125f, 3, new Vec3f(-0.9375, 0.0, 0.0))
			.setRotationPoint(-57.0625f, -20.203125f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 16, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.203125f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-57.625f, -20.203125f, -7.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 12, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.40625f, 0.203125f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-57.625f, -20.203125f, 8.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 12, textureX, textureY).addCylinder(0, 0, 0.125f, 1, 1, 8, 0.203125f, 0.40625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-57.625f, -20.203125f, -8.875f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	ModelNorthwesternEl24Bogie bogie = new ModelNorthwesternEl24Bogie();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		/*for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			ModelRenderHelper.renderModelWithRollingStockLightControls(l.toArray(arr), entity, f5);
		}*/
		super.render(entity, f, f1, f2, f3, f4, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/NorthwesternEl24_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-2.65625f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslatef(2.65625f,0,0);
		GL11.glRotatef(180, 0, 1, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

}
