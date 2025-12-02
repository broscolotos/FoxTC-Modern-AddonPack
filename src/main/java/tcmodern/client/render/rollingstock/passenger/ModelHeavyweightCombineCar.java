//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.passenger;


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelPullmanPalaceBogie;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelHeavyweightCombineCar extends FVTMFormatBase {

	public ModelHeavyweightCombineCar(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_stripes();
		initGroup_clipboard0();
		initGroup_clipboard1();
		initGroup_clipboard2();
		initGroup_sidecovers();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_stripes(){
		TurboList stripes = new TurboList("stripes");
		stripes.add(new ModelRendererTurbo(stripes, 337, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.0625f, -2.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 368, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.0625f, -2.5f, -11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 187, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 2, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.5625f, -2.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 409, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -2.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 0, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 2, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.5625f, -2.5f, -11.01f).setRotationAngle(0, 0, 0)
		);
		stripes.add(new ModelRendererTurbo(stripes, 404, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -2.5f, -11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(stripes);
	}

	private final void initGroup_clipboard0(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-84.9375f, 3, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-79.1875f, 3, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.9375f, 5.25f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-79.1875f, 5.25f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 6.5f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 4.875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 3.375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -1.5f, -0.1875f, 0, -1.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f)
			.setRotationPoint(10.875f, -15.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f)
			.setRotationPoint(10.875f, -16.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -1, -0.1875f, 0, -1, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -1, -0.1875f, 0, -1)
			.setRotationPoint(10.875f, -19.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.1875f, 0, -1.5f, -0.1875f, 0, -1.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(10.875f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, -2, -0.1875f, 0, -2, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(10.875f, -16.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f)
			.setRotationPoint(10.875f, -19.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 8, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f)
			.setRotationPoint(10.875f, -14.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 66, 1, 4, 0, 0, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-54.5625f, -13.5f, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 66, 1, 4, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-54.5625f, -13, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(11.125f, -0.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(11.125f, -11, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(11.125f, -11, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(11.125f, -11, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(11.125f, -5.125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(11.125f, -9.75f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(11.125f, -9.75f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(11.125f, -9.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(11.125f, -5.3125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -1, -0.1875f, 0, -1, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -1, -0.1875f, -0.5f, -1)
			.setRotationPoint(10.875f, -19.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(14.6875f, -11, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(16.0625f, -11, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(28.6875f, -11, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.6875f, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.375f, 0.125f, -0.5f, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(30.0625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(21.6875f, -5, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(16.0625f, 0.5f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(23.0625f, 0.5f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(16.0625f, -6.5f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 6, 1, 0, 0, 0, -0.874f, -0.375f, 0, -0.874f, -0.375f, 0, -0.124f, 0, 0, -0.124f, 0, -0.5f, -0.874f, -0.375f, -0.5f, -0.874f, -0.375f, -0.5f, -0.124f, 0, -0.5f, -0.124f)
			.setRotationPoint(16.0625f, -5, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(18.0625f, -9.5f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(20.6875f, -9.5f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(23.4375f, -9.5f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(26.0625f, -9.5f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(14.6875f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(16.0625f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(28.6875f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.6875f, 2.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.625f, -0.5f, -0.6875f, -0.625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(21.6875f, -5, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(16.0625f, 0.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(23.0625f, 0.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.6875f, -0.375f, -0.5f, -0.6875f, -0.375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(16.0625f, -6.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 6, 1, 0, 0, 0, -0.874f, -0.375f, 0, -0.874f, -0.375f, 0, -0.124f, 0, 0, -0.124f, 0, -0.5f, -0.874f, -0.375f, -0.5f, -0.874f, -0.375f, -0.5f, -0.124f, 0, -0.5f, -0.124f)
			.setRotationPoint(16.0625f, -5, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(18.0625f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(20.6875f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(23.4375f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(26.0625f, -9.5f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(43.6875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(64.0625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(49.0625f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(43.6875f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(43.6875f, -3.125f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(43.6875f, -10.1875f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(69.4375f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(64.0625f, -9.375f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(64.0625f, -3.125f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(64.0625f, -10.1875f, 9.8438f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(43.6875f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(64.0625f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(49.0625f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(43.6875f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(43.6875f, -3.125f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(43.6875f, -10.1875f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(69.4375f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, -0.75f, 0.25f, -0.8125f, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(64.0625f, -9.375f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.8125f, -0.375f, 0, -0.8125f, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, -0.8125f, -0.375f, -0.75f, -0.8125f, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(64.0625f, -3.125f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5625f, -0.8125f, -0.375f, -0.5625f, -0.8125f, -0.375f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.1875f, -0.8125f, -0.375f, -0.1875f, -0.8125f, -0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(64.0625f, -10.1875f, -11.6562f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(30.0625f, 2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(29.0625f, 2, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f)
			.setRotationPoint(29.0625f, 2.49f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(29.0625f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 509, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(14.0625f, 2, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f)
			.setRotationPoint(14.0625f, 2.49f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(14.0625f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(14.6875f, -11, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(27.6875f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(22.3125f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(23.4375f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(23.4375f, 0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(20.6875f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(15.3125f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(16.4375f, -5, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(16.4375f, 0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(27.875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(25.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(25.25f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(23.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(22.625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(20.3125f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(19.875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(17.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(17.25f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(15.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(26.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(26.6875f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(24.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(24.0625f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(21.4375f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(21.4375f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(18.6875f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(18.6875f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.0625f, -9.875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.0625f, -6.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-78.8125f, 2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-87.0625f, 2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.0625f, -11.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.8125f, -11.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -11.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.0625f, -11.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.8125f, -11.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -11.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(30.0625f, 2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(29.0625f, 2, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(29.0625f, 2.49f, -11.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(29.0625f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 0, 0, -0.625f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, -0.625f, -0.49f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(14.0625f, 2, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(14.0625f, 2.49f, -11.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.49f, 0, 0, 0.49f, 0, 0, 0.49f, 0, -0.625f, 0.49f, 0)
			.setRotationPoint(14.0625f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0)
			.setRotationPoint(14.6875f, -11, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(27.6875f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(22.3125f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(23.4375f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(23.4375f, 0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(20.6875f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(15.3125f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(16.4375f, -5, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0)
			.setRotationPoint(16.4375f, 0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(27.875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(25.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(25.25f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(23.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(22.625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(20.3125f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(19.875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(17.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(17.25f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8125f, -0.25f, 0)
			.setRotationPoint(15.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(26.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(26.6875f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(24.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(24.0625f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(21.4375f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.125f, -0.625f, 0)
			.setRotationPoint(21.4375f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(18.6875f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(18.6875f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.0625f, -9.875f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.0625f, -6.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-78.8125f, 2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-87.0625f, 2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -13, 11.02f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -13, -11.02f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 116, textureX, textureY)
			.addShapeBox(-3, 0, -3, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 133, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 126, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 126, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 126, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 221, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, -3.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 221, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, 2.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 221, textureX, textureY)
			.addShapeBox(2.5f, 0.5f, -3.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 174, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 174, textureX, textureY)
			.addShapeBox(2.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 173, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 173, textureX, textureY)
			.addShapeBox(2.5f, 5.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 8, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.25f, 0.125f, -0.5f, -0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(49.3125f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 8, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(69.6875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 6, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(30.0625f, -2.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, -0.5f, 0, 0.125f, -0.5f)
			.setRotationPoint(30.0625f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 8, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, -0.5f, 0, 0.125f, -0.5f)
			.setRotationPoint(49.3125f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 8, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.5f, 0, 0.125f, -0.5f)
			.setRotationPoint(69.6875f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 57, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(30.0625f, -2.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 8, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(10.0625f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-3.0625f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-16.1875f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-29.3125f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-42.4375f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-71.4375f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 6, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-78.8125f, -3.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 2, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86.5625f, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86.5625f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 121, textureX, textureY)
			.addShapeBox(2.5f, 0.5f, 2.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.0625f, -4, 5).setRotationAngle(0, 40, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 116, textureX, textureY)
			.addShapeBox(-3, 0, -3, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 77, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 69, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 61, textureX, textureY)
			.addShapeBox(-2.5f, 5.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(82.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 58, textureX, textureY)
			.addShapeBox(-2.5f, 5.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(82.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 206, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, -3.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 206, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, 2.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 206, textureX, textureY)
			.addShapeBox(2.5f, 0.5f, 2.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 149, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 148, textureX, textureY)
			.addShapeBox(2.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 148, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, -3.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 139, textureX, textureY)
			.addShapeBox(-2.5f, 4.5f, 2.49f, 5, 1, 1, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 129, textureX, textureY)
			.addShapeBox(-2.5f, 4.5f, 2.5f, 5, 1, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 148, textureX, textureY)
			.addShapeBox(-3.5f, 4.5f, -2.5f, 1, 1, 5, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 148, textureX, textureY)
			.addShapeBox(-3.49f, 0.5f, -2.5f, 1, 1, 5, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 114, textureX, textureY)
			.addShapeBox(-3, 0, -3, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 55, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 32, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 15, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, -3.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 12, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, 2.5f, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 206, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, -3.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 205, textureX, textureY)
			.addShapeBox(-3.5f, 0.5f, 2.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 205, textureX, textureY)
			.addShapeBox(2.5f, 0.5f, -3.5f, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 139, textureX, textureY)
			.addShapeBox(-3.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 138, textureX, textureY)
			.addShapeBox(2.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 138, textureX, textureY)
			.addShapeBox(-3.5f, 5.5f, -2.5f, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 126, textureX, textureY)
			.addShapeBox(-2.5f, 4.5f, -3.49f, 5, 1, 1, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 123, textureX, textureY)
			.addShapeBox(-2.5f, 4.5f, -3.5f, 5, 1, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 122, textureX, textureY)
			.addShapeBox(-3.5f, 4.5f, -2.5f, 1, 1, 5, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 55, textureX, textureY)
			.addShapeBox(-3.49f, 0.5f, -2.5f, 1, 1, 5, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.0625f, -4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-54.4375f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-54.4375f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-54.4375f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-54.4375f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-54.4375f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-50.4375f, -0.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-54.4375f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-53.9375f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-53.9375f, -4, 3.5f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-54.75f, -5.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-44.9375f, -0.5f, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-41.4375f, -4, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-44.9375f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-44.9375f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-44.9375f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-44.9375f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-44.9375f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-42.4375f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-44.9375f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-41.625f, -5.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-41.3125f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-41.3125f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-41.3125f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-41.3125f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-37.3125f, -0.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-41.3125f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-40.8125f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-40.8125f, -4, 3.5f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-41.3125f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-31.8125f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.8125f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-31.8125f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-31.8125f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.8125f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-31.8125f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29.3125f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-31.8125f, -0.5f, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-28.3125f, -4, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-28.5f, -5.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-28.1875f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-28.1875f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-28.1875f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-28.1875f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-27.6875f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.1875f, -0.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-28.1875f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-27.6875f, -4, 3.5f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-28.1875f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.6875f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-18.6875f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-18.6875f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-18.6875f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-18.6875f, -0.5f, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-18.6875f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16.1875f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-15.1875f, -4, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.6875f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-15.375f, -5.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-15.0625f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-15.0625f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-15.0625f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-15.0625f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-11.0625f, -0.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-15.0625f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.5625f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-14.5625f, -4, 3.5f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-15.0625f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-5.5625f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.5625f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-5.5625f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-5.5625f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.5625f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-5.5625f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.0625f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 205, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.5625f, -0.5f, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 204, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-2.0625f, -4, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-2.25f, -5.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.4375f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 204, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(2.0625f, -0.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 204, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-1.4375f, -4, 3.5f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-1.9375f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-1.9375f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-1.9375f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-1.9375f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-1.9375f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-1.9375f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 204, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(7.5625f, -0.5f, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 204, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.0625f, -4, 3.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(10.0625f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(7.5625f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(7.5625f, -3, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(7.5625f, -2, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(7.5625f, -2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(7.5625f, -2.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(7.5625f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 8, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f)
			.setRotationPoint(10.875f, -14.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(7.5625f, -2, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(7.5625f, -2.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(7.5625f, -2.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(7.5625f, -3, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(7.5625f, -1, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(7.5625f, -1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 203, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(7.5625f, -0.5f, -10.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(10.0625f, -4.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 203, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(11.0625f, -4, -10.75f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-1.9375f, -2, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-1.9375f, -2.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-1.9375f, -2.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(-1.9375f, -1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-1.9375f, -1, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-1.9375f, -3, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 203, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(2.0625f, -0.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-1.4375f, -4.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 203, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-1.4375f, -4, -10.75f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-2.25f, -5.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-3.0625f, -4.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 199, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0))
			.removePolygons(3).build()
			.setRotationPoint(-2.0625f, -4, -10.75f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-5.5625f, -3, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.5625f, -2, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-5.5625f, -2.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-5.5625f, -2.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-5.5625f, -1, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 203, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.5625f, -0.5f, -10.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-5.5625f, -1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 203, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-11.0625f, -0.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 203, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-14.5625f, -4, -10.75f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(-15.0625f, -1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-15.0625f, -1, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-15.0625f, -2, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-15.0625f, -2.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-15.0625f, -2.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-15.0625f, -3, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-14.5625f, -4.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-15.375f, -5.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 203, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-18.6875f, -0.5f, -10.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 201, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-15.1875f, -4, -10.75f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-16.1875f, -4.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-18.6875f, -1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.6875f, -2, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-18.6875f, -2.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-18.6875f, -2.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-18.6875f, -3, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.6875f, -1, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-27.6875f, -4.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 201, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.1875f, -0.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 201, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-27.6875f, -4, -10.75f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-28.1875f, -3, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-28.1875f, -2, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-28.1875f, -2.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-28.1875f, -2.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(-28.1875f, -1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-28.1875f, -1, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-28.5f, -5.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 200, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-31.8125f, -0.5f, -10.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 200, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-28.3125f, -4, -10.75f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-29.3125f, -4.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.75f, 0, -0.75f, -0.375f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.375f, -0.75f, -0.75f)
			.setRotationPoint(-31.8125f, -3, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.8125f, -2, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-31.8125f, -2.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.375f, 0, -0.75f, -0.125f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f)
			.setRotationPoint(-31.8125f, -2.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-31.8125f, -1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-31.8125f, -1, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 200, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 4).setScale(1, 1).setDirection(1)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-37.3125f, -0.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 196, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(7).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-40.8125f, -4, -10.75f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-54.75f, -5.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0, 0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-53.9375f, -2.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-41.625f, -5.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-58.5625f, -3.25f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.5625f, -2.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 98, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.5)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-58.0625f, -2.25f, -4.5f).setRotationAngle(0, 0, 180)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 12, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 2).setScale(1, 1).setDirection(1)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.5)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-63.9375f, -2.25f, -4.5f).setRotationAngle(0, 0, 270)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-41.3125f, -2, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(-41.3125f, -2.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-41.3125f, -2.75f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f)
			.setRotationPoint(-41.3125f, -1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.5f, -0.75f)
			.setRotationPoint(-41.3125f, -1, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-40.8125f, -4.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f)
			.setRotationPoint(-41.3125f, -3, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 221, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-56.0625f, -2.75f, -8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 221, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-56.0625f, -2.75f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 221, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-56.0625f, -2.75f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.0625f, -3.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-57.5625f, -3, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-65.4375f, -2.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-65.9375f, -3.25f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-65.4375f, -3, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.875f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-64.4375f, -3, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.875f, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-64.4375f, -3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-65.4375f, -3, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 5, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-66.0625f, -2.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.25f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.6875f, -0.375f, 0, -0.6875f)
			.setRotationPoint(-58.3125f, -2.5f, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.8125f, -4.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.3125f, -4.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.3125f, -1.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.5625f, -4.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58.3125f, -2.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58.5625f, -5.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-59.0625f, -5, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -14, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.5625f, -15.5f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, -1, -0.5f, 0.5f, -1, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.5625f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(83.0625f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(82.5625f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0.5f, -1, -0.625f, 0.5f, -1, -0.625f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.1875f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.1875f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 194, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.1875f, -15.875f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 220, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.1875f, -15.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.0625f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(84.5625f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(82.8125f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 220, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 164, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 220, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 220, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(85.6875f, -16.375f, -9.375f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-83.1875f, -16.875f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -16.875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, -0.125f, -0.625f, -0.5f, -0.125f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 220, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(83.8125f, -16.875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -16.875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -15.875f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.8125f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -15.875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -15.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.6875f, -16.875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -16.375f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.6875f, -16.875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.6875f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -16.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(-85.5625f, -16.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(-85.6875f, -16.375f, -8.5f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-86.0625f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-85.5625f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -14, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.5f, -9.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-83.1875f, -16.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-83.1875f, -16.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-83.1875f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-84.6875f, -16.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-85.5625f, -16.375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-84.6875f, -16.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-84.6875f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-85.5625f, -16.375f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(-85.5625f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(-84.6875f, -16.375f, 8.5f).setRotationAngle(0, -90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-86.0625f, -15.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-86.0625f, -15.875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f)
			.setRotationPoint(-86.0625f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-83.1875f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-84.8125f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-85.5625f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-87.0625f, -14, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f)
			.setRotationPoint(-86.5625f, -15.5f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.5f, 0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-87.0625f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86.5625f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0.5f, 0.5f, -0.625f, 0.5f, 0.5f, -0.625f, 0.5f, -1, 0, 0.5f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-83.1875f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-83.1875f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-86.0625f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0.5f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-85.5625f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 219, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f)
			.setRotationPoint(83.8125f, -16.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 219, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f)
			.setRotationPoint(84.6875f, -16.375f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(82.6875f, -16.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f)
			.setRotationPoint(82.6875f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 141, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(84.6875f, -16.375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 219, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(84.6875f, -16.375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 219, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(84.6875f, -16.375f, 9.375f).setRotationAngle(0, 90, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f)
			.setRotationPoint(82.8125f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(84.5625f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(85.0625f, -15.875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 194, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f)
			.setRotationPoint(85.1875f, -15.875f, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 219, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(85.1875f, -15.875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f)
			.setRotationPoint(83.0625f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(82.5625f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -1, 0, 0.5f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(86.0625f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(85.5625f, -15.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f)
			.setRotationPoint(86.0625f, -14, 6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f)
			.setRotationPoint(85.5625f, -15.5f, 6.375f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard1(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-54.5625f, -14.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-54.5625f, -15.5f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-54.5625f, -16.25f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-54.5625f, -14, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-77.6875f, -14.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-77.6875f, -15.5f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, 0.375f, -0.375f, 0.125f, 0.375f, -0.375f, 0.125f, -2, 0, 0.125f, -2, 0, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.6875f, -16.25f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-77.6875f, -14, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-66.25f, -14.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f)
			.setRotationPoint(-66.25f, -15.375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 1.125f)
			.setRotationPoint(-66.25f, -16.375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-41.4375f, -14.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-41.4375f, -15.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-41.4375f, -16.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-41.4375f, -14, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-15.1875f, -14.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-15.1875f, -15.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-15.1875f, -16.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-15.1875f, -14, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-2.0625f, -14.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-2.0625f, -15.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-2.0625f, -16.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-2.0625f, -14, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.6875f, -14.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.25f, -0.375f, -0.25f, 0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.6875f, -15.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -2, -0.375f, 0.125f, -2, -0.375f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-77.6875f, -16.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-77.6875f, -14, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-66.25f, -14.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, -0.5f, -0.1875f, -0.125f, 0.5f, -0.1875f, -0.125f, 0.5f)
			.setRotationPoint(-66.25f, -15.375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.1875f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 1.125f, -0.1875f, 0, 1.125f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f)
			.setRotationPoint(-66.25f, -16.375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 1, 4, 0, 0, -0.5f, 0.375f, -0.25f, -0.5f, 0.375f, -0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.4375f, -13.5f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 1, 4, 0, 0, -0.5f, 0.375f, -0.25f, -0.5f, 0.375f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-41.4375f, -13, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 4, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0.125f, -0.1875f, 0, 0.125f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0.125f, -0.1875f, -0.5f, 0.125f)
			.setRotationPoint(-14.75f, -13.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-15.375f, -16.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 131, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-27.875f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 131, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-27.875f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 151, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-27.875f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 150, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-27.875f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 157, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-27.875f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 157, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-27.875f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 131, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-41, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 131, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-41, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 150, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-41, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 150, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-41, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 153, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-41, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 151, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-41, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-28.5f, -16.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-41.625f, -16.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 131, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-14.75f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 150, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-14.75f, -16.25f, -5.875f).setRotationAngle(60, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 150, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-14.75f, -16.25f, -5.875f).setRotationAngle(60, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 129, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-14.75f, -16.25f, -5.875f).setRotationAngle(60, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 151, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-14.75f, -16.25f, -5.875f).setRotationAngle(60, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 150, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-14.75f, -16.25f, -5.875f).setRotationAngle(60, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 129, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-1.625f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-2.25f, -16.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 149, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-1.625f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 150, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.125f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.875f, -0.1875f, -0.75f, -0.875f)
			.setRotationPoint(-1.625f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 129, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, -0.5f, -0.1875f, -0.75f, -0.5f)
			.setRotationPoint(-1.625f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 148, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f)
			.setRotationPoint(-1.625f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 150, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, -0.875f, -0.1875f, -0.5f, -0.875f)
			.setRotationPoint(-1.625f, -16.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-54.75f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 129, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-1.625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 128, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 148, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 148, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 149, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-1.625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 149, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-1.625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 126, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-14.75f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 126, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.75f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 148, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.75f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 147, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.75f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 148, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-14.75f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 147, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-14.75f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 124, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-27.875f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 101, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.875f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 146, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.875f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 143, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.875f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 145, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-27.875f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 144, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-27.875f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 98, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-41, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 37, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-41, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 140, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-41, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 138, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-41, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 143, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-41, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 140, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-41, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 98, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 13, 3, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-54.125f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 18, textureX, textureY)
			.addShapeBox(0, 2.75f, -0.5f, 13, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-54.125f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 138, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-54.125f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 138, textureX, textureY)
			.addShapeBox(7, 2.25f, -0.5f, 6, 1, 1, 0, -0.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.5f, -0.3125f, -0.5f, -0.5f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-54.125f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 140, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.5f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, -0.875f, -0.3125f, -0.5f, -0.875f, -0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-54.125f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 140, textureX, textureY)
			.addShapeBox(5.5f, 2.25f, -0.875f, 2, 1, 1, 0, -0.1875f, 0, -0.875f, -0.3125f, 0, -0.875f, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.875f, -0.3125f, -0.75f, -0.125f, -0.1875f, -0.75f, -0.125f)
			.setRotationPoint(-54.125f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-2.25f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-15.375f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-28.5f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, 0, -0.1875f, 0.25f, -0.5f, -0.1875f, 0.25f, -0.5f)
			.setRotationPoint(-41.625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.0625f, -18, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.553f, -0.625f, 0, -1.553f, -0.625f, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1.553f, -0.375f, 0, -1.553f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(85.5625f, -16.875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1.125f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.0625f, -18, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.553f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.553f, -0.625f, -0.625f, -1.553f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.553f, -0.375f, -0.625f)
			.setRotationPoint(-87.5625f, -16.875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-79.0625f, -19.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(79.0625f, -19.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(82.5625f, -18.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-83.0625f, -19.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.75f, -0.625f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f)
			.setRotationPoint(-84.5625f, -18.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -14.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -16.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.125f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -16.125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f)
			.setRotationPoint(-86.6875f, -16.625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -14.75f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -16.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0.875f, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(85.5625f, -16.125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.5f, 1.125f, -0.375f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.6875f, -16.625f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 12, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-77.0625f, -16.75f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-62.0625f, -16.75f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-61.0625f, -17, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(-60.0625f, -17.5f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-59.0625f, -18.25f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58.0625f, -18.75f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0.5f, -0.75f, -0.25f, 0.5f, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(-57.0625f, -19, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 12, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-55.5625f, -19.25f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-77.875f, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-77.875f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 13, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.25f, -0.1875f, -0.5f, -0.25f)
			.setRotationPoint(-77.875f, -16.5f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, -0.25f, -0.1875f, -0.25f, -0.25f)
			.setRotationPoint(-77.875f, -19.25f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-77.875f, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-77.625f, -0.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.625f, -11, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-77.625f, -11, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-77.625f, -11, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(-77.625f, -5.125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-77.625f, -9.75f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-77.625f, -9.75f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-77.625f, -9.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-77.625f, -5.3125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.0625f, -18, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.553f, -0.625f, 0, -1.553f, -0.625f, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1.553f, -0.375f, 0, -1.553f, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(85.5625f, -16.875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1.125f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.0625f, -18, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.553f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.553f, -0.625f, -0.625f, -1.553f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.553f, -0.375f, -0.625f)
			.setRotationPoint(-87.5625f, -16.875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-79.0625f, -19.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(79.0625f, -19.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(82.5625f, -18.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-83.0625f, -19.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.75f, -0.625f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f)
			.setRotationPoint(-84.5625f, -18.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -14.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -16.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.125f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -16.125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f)
			.setRotationPoint(-86.6875f, -16.625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -14.75f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0.5f, -0.875f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(86.0625f, -16.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0.875f, -0.25f, -0.5f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(85.5625f, -16.125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.5f, 1.125f, -0.375f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.6875f, -16.625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -15, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0)
			.setRotationPoint(83.5625f, -17.375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(85.6875f, -16, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -1.125f, 0, 0)
			.setRotationPoint(85.0625f, -17, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.0625f, -17.875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 1, 13, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-79.0625f, -19.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-82.5625f, -19.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.0625f, -18.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -17.375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(78.5625f, -19.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0)
			.setRotationPoint(82.0625f, -18.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, -17.875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -15, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-86.6875f, -16, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0.625f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0.625f, 0, 0)
			.setRotationPoint(-86.0625f, -17, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-77.0625f, -2, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-77.0625f, -2, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.25f, 0.375f, -0.75f, -0.25f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-77.0625f, -2, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-76.4375f, -2, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-77.0625f, -3, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-77.0625f, -3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -1, -0.75f, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-76.6875f, -3, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.0625f, -3.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.0625f, -3.25f, -5.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.375f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-75.6875f, -2, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0.375f, 0, 0, 0.625f, 0, 0.25f, 0.25f, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.375f, 0, 0.25f, 0.625f)
			.setRotationPoint(-75.6875f, -3.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4, -5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.9375f, -4, -5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.9375f, -4, -5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.9375f, -4, -5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.9375f, -4, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.9375f, -4, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.9375f, -4, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4.25f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, 0, -0.9375f, -0.4375f, 0, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.6875f, -4, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.4375f, -3.875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 216, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(3).setSegments(8, 16).setScale(1.25f, 1.375f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.5625f, -0.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 11, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.625f).setLength(1).setSegments(8, 6).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.5625f, -0.625f, 9).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 216, textureX, textureY).addCylinder(1, 0, 0, 1, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-76.6875f, -0.75f, 9).setRotationAngle(0, 0, -100)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 216, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.5f).setLength(3).setSegments(8, 16).setScale(1.25f, 1.375f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.5625f, -0.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.625f).setLength(1).setSegments(8, 6).setScale(1.125f, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-75.5625f, -0.625f, -9).setRotationAngle(0, 45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 216, textureX, textureY).addCylinder(1, 0, 0, 1, 1, 8, 1.125f, 1.125f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-76.6875f, -0.75f, -9).setRotationAngle(0, 0, -100)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 215, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(1).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-76.5625f, -1.75f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 215, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(2).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(-0.75, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-76.5625f, -1.25f, 5.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 215, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(1).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-76.5625f, -1.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 215, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 0.375f).setLength(2).setSegments(4, 16).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(-0.75, -0.5, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-76.5625f, -1.25f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-77.0625f, -2, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.25f, 0.375f, -0.75f, -0.25f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-77.0625f, -2, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, -0.625f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-77.0625f, -2, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, -0.25f, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-76.4375f, -2, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.375f, 0.375f, -0.75f, -0.375f, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-77.0625f, -3, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.625f, 0.375f, -0.75f, -0.625f, 0.375f, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, -0.375f)
			.setRotationPoint(-77.0625f, -3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, 0, -1, -0.75f, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-76.6875f, -3, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.375f, -0.75f, 0, -0.625f, -0.75f, 0, 0, 0, 0, 0.25f, 0, -0.75f, -0.625f, -1, -0.75f, -0.625f, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-75.6875f, -2, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0.375f, 0, 0, 0.625f, 0, 0.25f, 0.25f, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.375f, 0, 0.25f, 0.625f)
			.setRotationPoint(-75.6875f, -3.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.0625f, -3.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.75f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-77.0625f, -3.25f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.9375f, -4, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-76.9375f, -4, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.9375f, -4, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.9375f, -4, 5.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.90625f, 0, -0.46875f, -0.03125f, 0, -0.46875f, -0.03125f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.90625f, -0.75f, -0.46875f, -0.03125f, -0.75f, -0.46875f)
			.setRotationPoint(-76.9375f, -4, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.03125f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.90625f, -0.09375f, -0.375f, -0.03125f, -0.09375f, -0.375f, -0.03125f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.90625f, -0.84375f, -0.375f, -0.03125f, -0.84375f, -0.375f)
			.setRotationPoint(-76.9375f, -4, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, -0.875f, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, -0.875f, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f)
			.setRotationPoint(-77.0625f, -4.25f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, 0, -0.9375f, -0.4375f, 0, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.6875f, -4, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.1875f, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.75f, 0.1875f, -0.4375f, -0.75f, -1.0625f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.125f, -0.9375f, -0.4375f, -0.75f, -1.0625f, -0.4375f)
			.setRotationPoint(-77.4375f, -3.875f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 19, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-77.0625f, -16.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 19, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-77.0625f, -16.25f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-72.0625f, -16.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-72.0625f, -16.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-70.3125f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-70.3125f, -11, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-72.0625f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-67.8125f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-72.0625f, -11, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-67.8125f, -11, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-70.8125f, -10.125f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-70.8125f, -10.125f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-72.0625f, -0.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-72.0625f, -0.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0)
			.setRotationPoint(-66.25f, -13, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.5f, -0.1875f, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f)
			.setRotationPoint(-66.25f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(88.5625f, -11, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(88.5625f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -12, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.5625f, -12.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -13.5f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -14, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(86.8125f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(84.5625f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, 2, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(87.0625f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(87.0625f, -11, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(87.0625f, -11.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, 2, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.8125f, -11, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.8125f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.5625f, -11, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.5625f, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-88.5625f, -11.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -12, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.8125f, -12.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -13.5f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -14, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.8125f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 3, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 2.75f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 3, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 2.75f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-84.9375f, 3, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-79.1875f, 3, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 3, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 2.75f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 3, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 2.75f, 8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.6875f, 3, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(84.4375f, 3, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(-84.9375f, 3, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.9375f, 2.75f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(-79.1875f, 3, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-79.1875f, 2.75f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(78.6875f, 3, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(84.4375f, 3, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(78.6875f, 3, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.6875f, 2.75f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1)
			.setRotationPoint(84.4375f, 3, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(84.4375f, 2.75f, -9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-84.9375f, 5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-79.1875f, 5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(78.6875f, 5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(84.4375f, 5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(78.6875f, 5.25f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84.4375f, 5.25f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 3.375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-83.9375f, 6.5f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 6.5f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 3.375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(79.6875f, 6.5f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 4.875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 3.375f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 2.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0)
			.setRotationPoint(-46.625f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -3.75f, 0)
			.setRotationPoint(-45.625f, 3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 2.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 6.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 6.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 4, 9, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.625f, 3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 4, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 4, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 4, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 4, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -3.75f, 0, 0, -3.75f, 0, 0, 0.25f, 0)
			.setRotationPoint(29.625f, 3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 2.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 2.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0)
			.setRotationPoint(45.625f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.875f, 3, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.625f, 3, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-22.875f, 6, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-14.875f, 6, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(22.625f, 6, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-23.125f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-19.125f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-15.125f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-11.125f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(22.375f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(25.375f, 6, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 193, textureX, textureY).addCylinder(0, 0, 0, 2, 6, 8, 1, 1, 3, null)
			.setRotationPoint(-36.625f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 186, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-36.875f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 162, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-37.125f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 158, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-31.375f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 123, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-31.125f, 5.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.125f, 3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.875f, 3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36.125f, 3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31.875f, 3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 1, 21, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.5625f, 2.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(10.0625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-3.0625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-16.1875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-29.3125f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-42.4375f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-71.4375f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 6, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-78.8125f, -3.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.8125f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 2, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.8125f, -11, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-80.5625f, -11, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-83.0625f, -11, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-84.8125f, -0.25f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-83.5625f, -5.125f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 46, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -6.1875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 45, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -10.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 214, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-80.75f, -9.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 213, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-83.0625f, -9.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(3.8125f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-9.3125f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-22.4375f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.5625f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-48.6875f, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(5.8125f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.4375f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.5625f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.6875f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5625f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.8125f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.6875f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.9375f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.6875f, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(9.5f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(9.5f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(3.25f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(3.25f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-3.625f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-3.625f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-9.875f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-9.875f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-16.75f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-16.75f, -9.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-23, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-23, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-29.875f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-29.875f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-36.125f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-36.125f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-43, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-43, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-49.25f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-49.25f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-72, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-72, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(5.8125f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(5.8125f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-0.4375f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.4375f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-7.3125f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-13.5625f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.5625f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-20.4375f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.4375f, -9.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-26.6875f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.6875f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-33.5625f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5625f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-39.8125f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.8125f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-46.6875f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.6875f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-52.9375f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.9375f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-75.6875f, -7.9375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.6875f, -10.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(5.8125f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-0.4375f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-7.3125f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-13.5625f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-20.4375f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-26.6875f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-33.5625f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-39.8125f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-46.6875f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-52.9375f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-75.6875f, -4.4375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(5.8125f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-0.4375f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.5625f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.6875f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.5625f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.8125f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.6875f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.9375f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.6875f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(5.8125f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-0.4375f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.5625f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.6875f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.5625f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.8125f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.6875f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.9375f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.6875f, -8.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-20.4375f, -8.75f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-20.4375f, -7.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.4375f, -10, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -0.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-87.0625f, -11, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-87.0625f, -11, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-87.0625f, -11, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(-87.0625f, -5.125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-87.0625f, -9.75f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-87.0625f, -9.75f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-87.0625f, -9.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-87.0625f, -5.3125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(3.8125f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-9.3125f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-22.4375f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-48.6875f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.5625f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.125f, -0.25f, -0.5f, 0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.8125f, -11, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, 2, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.8125f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-80.5625f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-83.0625f, -11, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-84.8125f, -0.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-83.5625f, -5.125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 40, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -6.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 32, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -10.625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 195, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-80.75f, -9.625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 178, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-83.0625f, -9.625f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(5.8125f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-0.4375f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-7.3125f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-13.5625f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-20.4375f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-26.6875f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-52.9375f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-46.6875f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-33.5625f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-39.8125f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-75.6875f, -4.4375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(5.8125f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-0.4375f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.5625f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-20.4375f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.6875f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.9375f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.6875f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.5625f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.8125f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-39.8125f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard2(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(5.8125f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-0.4375f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-13.5625f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-20.4375f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-26.6875f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-52.9375f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-46.6875f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-33.5625f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(5.8125f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(5.8125f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-0.4375f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.4375f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-13.5625f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.5625f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-20.4375f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.4375f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-26.6875f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.6875f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-52.9375f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.9375f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-46.6875f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.6875f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-33.5625f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5625f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-39.8125f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.8125f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-75.6875f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.6875f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.6875f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-75.6875f, -8.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(9.5f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(9.5f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(3.25f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(3.25f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-3.625f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-3.625f, -9.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-9.875f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-9.875f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-16.75f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-16.75f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-23, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-23, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-49.25f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-49.25f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-43, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-43, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-29.875f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-29.875f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-36.125f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-36.125f, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-72, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-72, -10.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(5.8125f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.4375f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-13.5625f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-20.4375f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-26.6875f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.9375f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.6875f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5625f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-39.8125f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-75.6875f, -11, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, -0.4375f, 0.5f, -0.8125f, -0.4375f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-7.3125f, -7.9375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, -0.4375f, 0, -0.8125f, -0.4375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, -0.4375f, -0.375f, -0.8125f, -0.4375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -9.375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -8.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -7.75f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -10, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, -0.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.5625f, -11, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(86.5625f, -11, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.5625f, -11, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(86.5625f, -5.125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(86.5625f, -9.75f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(86.5625f, -9.75f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(86.5625f, -9.75f, -1).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_sidecovers(){
		TurboList sidecovers = new TurboList("sidecovers");
		sidecovers.add(new ModelRendererTurbo(sidecovers, 187, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 6, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.5625f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 493, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 222, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 6, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(30.0625f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 341, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(43.6875f, -2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 447, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(43.6875f, 2.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 33, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(49.3125f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 499, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.0625f, -2.75f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 499, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(64.0625f, 2.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 380, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(69.6875f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 451, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.0625f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 428, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(21.6875f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 29, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.6875f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 330, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.0625f, 0.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 447, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.0625f, 0.5f, -10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 268, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.3125f, -3.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 254, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.3125f, -3.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 457, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.3125f, -0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 446, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(23.3125f, -0.25f, -10.76f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 472, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 378, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-80.5625f, -3.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 451, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.0625f, -3.25f, -10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 419, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.0625f, -0.25f, -11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 0, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 93, 6, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.5625f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 124, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 193, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 6, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(30.0625f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 499, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(43.6875f, -2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 486, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(43.6875f, 2.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 421, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(49.3125f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.0625f, -2.75f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(64.0625f, 2.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 477, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(69.6875f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 374, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.0625f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 508, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(21.6875f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 508, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.6875f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.0625f, 0.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.0625f, 0.5f, 10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 114, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.3125f, -3.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 100, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(23.3125f, -3.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 499, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.3125f, -0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 432, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(23.3125f, -0.25f, 10.76f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 507, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 174, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-80.5625f, -3.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 505, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.0625f, -3.25f, 10.885f).setRotationAngle(0, 0, 0)
		);
		sidecovers.add(new ModelRendererTurbo(sidecovers, 505, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.0625f, -0.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(sidecovers);
	}


	ModelPullmanPalaceBogie bogie = new ModelPullmanPalaceBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/pullman_palace_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(3.875f,0.02734375f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(-3.875f,0.02734375f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
