//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.steam;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.locomotive.bogies.ModelAlleghenyBogieRear;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelAlleghenyMain extends FVTMFormatBase {

	public ModelAlleghenyMain(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		addToCreators("Riggs64");
		//
		initGroup_Firebox();
		initGroup_ValveGearBackRight();
		initGroup_Boiler_Area0();
		initGroup_Boiler_Area1();
		initGroup_ValveGearBackLeft();
		initGroup_Frame_Main();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Firebox(){
		TurboList Firebox = new TurboList("Firebox");
		Firebox.add(new ModelRendererTurbo(Firebox, 104, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -5.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 231, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.0625f, -5.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 257, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-54.1875f, -2.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-55.1875f, -2.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 445, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-56.1875f, -2.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 205, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-57.1875f, -2.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 419, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-58.1875f, -2.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 78, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-59.1875f, -3, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 335, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-60.1875f, -3.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 393, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-61.1875f, -3.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 367, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-62.1875f, -3.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 179, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-63.1875f, -3.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 26, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-64.1875f, -3.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 283, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-65.1875f, -3.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 153, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-66.1875f, -3.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 52, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-53.6875f, -1.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 309, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-54.6875f, -1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 104, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-55.6875f, -1.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 231, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-56.6875f, -1.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 257, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-57.6875f, -1.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-58.6875f, -2, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 205, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-59.6875f, -2.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 441, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-60.6875f, -2.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 78, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-61.6875f, -2.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 341, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-62.6875f, -2.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 415, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-63.6875f, -2.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 389, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-64.6875f, -2.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 179, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-65.6875f, -2.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 26, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-67.1875f, -4, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 283, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-68.1875f, -4.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 153, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-69.1875f, -4.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 52, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-70.1875f, -4.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 315, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-71.1875f, -4.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 104, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-72.1875f, -4.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 231, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-73.1875f, -4.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 257, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-74.1875f, -4.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-75.1875f, -5, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 205, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-76.1875f, -5.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 453, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-77.1875f, -5.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 78, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-78.1875f, -5.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 363, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-79.1875f, -5.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 427, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-80.1875f, -5.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 401, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-81.1875f, -5.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 179, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-82.1875f, -5.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 26, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-83.1875f, -6, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 289, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-84.1875f, -6.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 153, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-85.1875f, -6.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 52, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-86.1875f, -6.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 337, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-87.1875f, -6.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 104, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-66.6875f, -3, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 231, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-67.6875f, -3.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 263, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-68.6875f, -3.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-69.6875f, -3.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 205, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-70.6875f, -3.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 460, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-71.6875f, -3.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 78, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-72.6875f, -3.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 375, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-73.6875f, -3.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 434, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-74.6875f, -4, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 408, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-75.6875f, -4.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 179, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-76.6875f, -4.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 26, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-77.6875f, -4.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 311, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-78.6875f, -4.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 153, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-79.6875f, -4.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 52, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-80.6875f, -4.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 349, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-81.6875f, -4.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 104, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-82.6875f, -5, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 237, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-83.6875f, -5.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 285, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-84.6875f, -5.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-85.6875f, -5.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 211, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-86.6875f, -5.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 78, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -6.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 382, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-88.1875f, -6.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 441, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-89.1875f, -6.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 415, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-87.6875f, -5.625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 185, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-88.6875f, -5.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 26, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -6.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 323, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -7.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 159, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -8.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 52, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -9.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 356, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -7.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 110, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -8.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 259, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -10.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 297, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -11.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -12.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 233, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -13.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 84, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -11.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 389, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -12.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 463, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -9.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 437, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -10.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 207, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -14.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 26, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -15.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 330, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -13.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 181, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-49.6875f, -14.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 58, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.6875f, -15.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 363, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-51.1875f, -4.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 132, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-51.6875f, -4, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 271, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-50.5625f, -4.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 304, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-52.3125f, -3.125f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-51.0625f, -3.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 106, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-53.1875f, -2.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 411, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-51.8125f, -2.375f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 32, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-52.625f, -1.5625f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 337, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 23, 0, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f, -0.25f, -0.25f, -0.40625f)
			.setRotationPoint(-89.6875f, -5.875f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 272, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, -3.5625f, 0.3125f, 0, -3.5625f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-53.3125f, -5.3125f, -11).setRotationAngle(0, 0, 0)
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 129, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 10, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.3125f, -15.3125f, -11).setRotationAngle(0, 0, 0)
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 254, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 5, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4.125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -4.125f, 0)
			.setRotationPoint(-90.3125f, -5.3125f, -11).setRotationAngle(0, 0, 0)
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 245, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 22, 0, -1.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -1.6875f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.3125f, -15.3125f, -11).setRotationAngle(0, 0, 0)
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 49, 9, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-100.8125f, -8.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Firebox.add(new ModelRendererTurbo(Firebox, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 42, 2, 10, 0, 0, 0, 1, 0, 0.5f, 1, 0, 0.5f, 1, 0, 0, 1, -2.5f, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0)
			.setRotationPoint(-94.8125f, 0.5f, -5).setRotationAngle(0, 0, 0)
		);
		groups.add(Firebox);
	}

	private final void initGroup_ValveGearBackRight(){
		TurboList ValveGearBackRight = new TurboList("ValveGearBackRight");
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 136, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-42.3125f, 6.8125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 78, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(-43.0625f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 57, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-40.5625f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 158, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-27.8125f, 6.8125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 41, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(-28.5625f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 410, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-26.0625f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 148, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-27.5625f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 136, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-13.3125f, 6.8125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 353, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(-14.0625f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 301, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-11.5625f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 259, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-13.0625f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 242, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0.1875f, -0.1875f, 0, 0.1875f, -0.1875f, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.1875f, 0, 0.1875f, -0.1875f, 0, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-41.3125f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 434, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f)
			.setRotationPoint(-42.3125f, 5.5625f, -10.09375f).setRotationAngle(0, 0, 0).setName("Box 807cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 489, 127, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 3, 1, 1, 0, -0.25f, 0.3125f, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, -0.25f, 0.3125f, -0.25f, -0.25f, 0.3125f, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, -0.25f, 0.3125f, -0.25f)
			.setRotationPoint(-41.3125f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 1092cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 259, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-42.0625f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 385, 171, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 5, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 167, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-11.3125f, -3, -11.4375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 147, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-30.3125f, 6.8125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 147, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-30.3125f, 4.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 445, 256, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 7, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-10.75f, -2.625f, -10.59375f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 233, 127, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 2, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(-14.375f, 2.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 463, 126, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-14.375f, 2.5625f, -10.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 207, 126, textureX, textureY)
			.addShapeBox(-1.5f, -2.3125f, 0, 3, 1, 1, 0, 1.6875f, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 1.6875f, -0.6875f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f)
			.setRotationPoint(-14.375f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 88, 169, textureX, textureY)
			.addShapeBox(-3.5f, -2.6875f, 0, 5, 1, 1, 0, -0.3125f, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, -0.3125f, -0.6875f, 0.375f, -0.3125f, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, -0.3125f, 0.0625f, 0.375f)
			.setRotationPoint(-14.375f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 363, 105, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(-17.375f, 2.5625f, -10.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 385, 168, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 5, 1, 1, 0, -0.3125f, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.3125f, -0.625f, 0.1875f, -0.3125f, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, -0.3125f, -0.1875f, 0.1875f)
			.setRotationPoint(-14.375f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 181, 126, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 2, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(-14.375f, 2.5625f, -8.8125f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 264, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0, 0.125f, -0.25f)
			.setRotationPoint(-41.3125f, 5.5625f, -9.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 405, 256, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-14.6875f, 2.8125f, -10.3125f).setRotationAngle(0, 0, 9)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 147, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0.3125f, -0.5f, 0)
			.setRotationPoint(-30.0625f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 172, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0.3125f, -0.5f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-30.0625f, 5.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 400, 256, textureX, textureY).addCylinder(3.5f, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-41.3125f, 6.0625f, -10.1875f).setRotationAngle(0, 0, -60)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 324, 256, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(-39.5625f, 3.03125f, -10.875f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 193, 128, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 4, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 191, 256, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(-26.8125f, 1.90625f, -10.46875f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 94, 256, textureX, textureY)
			.addShapeBox(12, -0.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 89, 256, textureX, textureY)
			.addShapeBox(11, -0.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 65, 256, textureX, textureY)
			.addShapeBox(11, -0.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 52, 256, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 36, 256, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 31, 256, textureX, textureY)
			.addShapeBox(12.125f, -0.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 319, 255, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 266, 255, textureX, textureY)
			.addShapeBox(12.125f, -0.5f, 0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 462, 255, textureX, textureY).addCylinder(-3.1875f, 0, 0, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-26, -4.5f, -10.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 457, 255, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-26, -4.5f, -10.5625f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 452, 255, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.625f, 0.625f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-26, -4.5f, -10.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 233, 124, textureX, textureY)
			.addShapeBox(-3.0625f, 0, 0, 3, 1, 1, 0, -0.25f, -0.4375f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.25f, -0.375f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.375f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 197, 255, textureX, textureY)
			.addShapeBox(-3.5625f, 0.6875f, 0, 1, 1, 1, 0, -0.3125f, 0.03125f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.3125f, 0.03125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.8125f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 70, 255, textureX, textureY)
			.addShapeBox(0.25f, 0.375f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.25f, -1.25f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.25f, -1.25f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 15, 255, textureX, textureY)
			.addShapeBox(0.4375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.4375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.4375f, 0, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 10, 255, textureX, textureY)
			.addShapeBox(0.625f, 1.6875f, 0, 1, 2, 1, 0, -0.25f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 5, 255, textureX, textureY)
			.addShapeBox(0.5625f, 3.5f, 0, 1, 1, 1, 0, -0.25f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.25f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 434, 254, textureX, textureY)
			.addShapeBox(-0.375f, 3.1875f, 0, 1, 1, 1, 0, -0.25f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.25f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 429, 254, textureX, textureY)
			.addShapeBox(-0.4375f, 2.375f, 0, 1, 1, 1, 0, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 424, 254, textureX, textureY)
			.addShapeBox(-0.5625f, 1.75f, 0, 1, 1, 1, 0, 0.0625f, 0, -0.38f, -0.875f, 0, -0.38f, -0.875f, 0, -0.38f, 0.0625f, 0, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 419, 254, textureX, textureY)
			.addShapeBox(-0.9375f, 1.125f, 0, 1, 1, 1, 0, 0.25f, -0.1875f, -0.38f, -1.25f, 0, -0.38f, -1.25f, 0, -0.38f, 0.25f, -0.1875f, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 349, 254, textureX, textureY)
			.addShapeBox(-1.9375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.125f, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0.125f, -0.38f, -0.25f, -0.9375f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.9375f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 248, 254, textureX, textureY)
			.addShapeBox(-3.125f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.0625f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.0625f, -0.38f, -0.1875f, -0.875f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.875f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 243, 254, textureX, textureY)
			.addShapeBox(-2.5f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 238, 254, textureX, textureY)
			.addShapeBox(-0.125f, 1.8125f, 0, 1, 2, 1, 0, 0.125f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0.125f, -0.3125f, -0.4375f, -0.1875f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.1875f, 0, -0.4375f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 205, 254, textureX, textureY)
			.addShapeBox(-0.125f, 0.125f, 0, 1, 2, 1, 0, 0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.125f, 0, -0.4375f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 207, 123, textureX, textureY)
			.addShapeBox(-2.125f, -0.4375f, 0, 3, 1, 1, 0, -1.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -1.375f, -0.375f, -0.4375f, 0.5f, 0, -0.4375f, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, 0.5f, 0, -0.4375f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 167, 254, textureX, textureY)
			.addShapeBox(-1.1875f, 0.125f, 0, 1, 2, 1, 0, 0, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -1, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, 0, -1, -0.4375f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 147, 122, textureX, textureY)
			.addShapeBox(-3.125f, 0.125f, 0, 2, 1, 1, 0, -0.25f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.25f, 0, -0.4375f)
			.setRotationPoint(-26, -4.5f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 120, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.9375f, 0, -0.25f, 0.4375f, 0, -0.25f, 0.4375f, 0, -0.25f, -0.9375f, 0, -0.25f)
			.setRotationPoint(-28, 0.21875f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 115, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.4375f, 0.5f, -0.25f)
			.setRotationPoint(-28.1875f, -1.28125f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 104, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -1.4375f, -0.125f, -0.25f, 0.9375f, -0.125f, -0.25f, 0.9375f, -0.125f, -0.25f, -1.4375f, -0.125f, -0.25f)
			.setRotationPoint(-29.375f, -3.15625f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 410, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.4375f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.5625f, -0.4375f, -0.4375f, -0.5625f)
			.setRotationPoint(-29.5625f, -3.71875f, -10.6875f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 405, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.4375f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.25f, -0.0625f, -0.4375f, -0.5625f, -0.4375f, -0.4375f, -0.5625f)
			.setRotationPoint(-29.5625f, -3.71875f, -10.25f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 26, 165, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 5, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(-14.375f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 220, 105, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, -0.8125f, 0, -0.625f, -0.8125f, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(-17.375f, 2.375f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 58, 104, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.3125f, -0.625f, 0.1875f, -0.3125f, -0.1875f, 0.375f, 0, -0.1875f, 0.375f, 0, -0.1875f, 0.375f, -0.3125f, -0.1875f, 0.375f)
			.setRotationPoint(-17.375f, 2.375f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 437, 102, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 17, 1, 1, 0, -0.375f, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, -0.375f, -0.4375f, 0.1875f, -0.3125f, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, -0.3125f, -0.1875f, 0.1875f)
			.setRotationPoint(-17.375f, 2.1875f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 351, 16, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 16, 1, 1, 0, 0.0625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.625f, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0.625f, -0.25f, 0.1875f)
			.setRotationPoint(-16.375f, 1.875f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 400, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(-27.3125f, 1.21875f, -10.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 285, 99, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-14.375f, 2.5625f, -8.8125f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 363, 102, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, -0.625f, 0, -0.1875f, -0.625f, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(-17.375f, 2.5625f, -9.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 58, 101, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, -0.8125f, 0, -0.625f, -0.8125f, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(-17.375f, 2.375f, -9.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 221, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-26.875f, -4.0625f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 314, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.625f, 0, -0.5f, 0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-28.0625f, -4.0625f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 84, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.125f, 0, 0, -1, 0, 0, -1, 0, 0.1875f, -0.125f, 0)
			.setRotationPoint(-26.875f, -2.0625f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 309, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(-28.5625f, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 283, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-27.5625f, -4.0625f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 272, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.375f, 0, -0.5f, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.0625f, 0)
			.setRotationPoint(-29.0625f, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 186, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.3125f, -0.0625f, 0)
			.setRotationPoint(-29.5625f, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 489, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(-32.875f, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 162, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f)
			.setRotationPoint(-33, -3.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 245, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(-36.25f, -3.75f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 501, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-36.25f, -3.125f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 10, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f)
			.setRotationPoint(-22.875f, -4.0625f, -10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 110, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-22.875f, -2.0625f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 147, 119, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.6875f, 1.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 389, 118, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 1, 0, 0.125f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0.125f, -0.25f, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16.6875f, 1.0625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 463, 122, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 2, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, -0.5f, 0)
			.setRotationPoint(-16.6875f, 0.8125f, -9.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 297, 252, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 3, 1, 0, 0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5625f, 0.375f, -0.5f, -0.5625f, 0.375f, -1, -0.0625f, 0, -1, -0.0625f, 0, 0, -0.5625f, 0.375f, 0, -0.5625f)
			.setRotationPoint(-15.6875f, 0.4375f, -5.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 219, 126, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 4, 0, 0.4375f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0.4375f, 0.4375f, 0, 0.4375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0.375f, 0, 0.4375f)
			.setRotationPoint(-15.6875f, -0.0625f, -9.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 246, 158, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 5, 0, 0.4375f, -0.75f, 0, 0.0625f, -0.75f, 0, 0.0625f, -0.75f, -0.0625f, 0.4375f, -0.75f, -0.0625f, 0.4375f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.0625f, 0.4375f, 0, -0.0625f)
			.setRotationPoint(-15.6875f, -1.0625f, -10.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 267, 252, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 1, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f)
			.setRotationPoint(-16.4375f, -0.5625f, -10.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 507, 238, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 1, 0, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f)
			.setRotationPoint(-16.4375f, -0.0625f, -10.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 181, 122, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 2, 0, 0.3125f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0.3125f, 0, 0.0625f, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0)
			.setRotationPoint(-18.0625f, -0.0625f, -9.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 0, 255, textureX, textureY).addCylinder(-1, 0, 0, 1, 11, 8, 0.5f, 0.5f, 3, new Vec3f(0.4375, 0.0, 0.0))
			.setRotationPoint(-11, 2.625f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 262, 252, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, null)
			.setRotationPoint(-12.875f, 2.625f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 437, 99, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 17, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(-25.476562f, -0.25f, -11).setRotationAngle(0, 0, -7).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 257, 252, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5625f, 0.5625f).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-26, -4.5f, -11.9375f).setRotationAngle(0, 0, 90)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 395, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-26.5625f, -4.5f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 193, 252, textureX, textureY).addCylinder(-2.6875f, 2.5f, -0.1875f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-26, -4.5f, -10.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 95, 252, textureX, textureY).addCylinder(-2.6875f, 2.5f, 0.375f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5625))
			.setRotationPoint(-26, -4.5f, -11.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 90, 252, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-29, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 85, 252, textureX, textureY)
			.addShapeBox(-0.5f, -3, 0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(-29, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 66, 252, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-29, -0.9375f, -10.9375f).setRotationAngle(0, 0, -4)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 41, 252, textureX, textureY)
			.addShapeBox(-0.5f, -3, 0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f)
			.setRotationPoint(-29, -0.9375f, -10.75f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 96, 233, textureX, textureY)
			.addShapeBox(-0.5f, -4.125f, 0.0625f, 1, 1, 1, 0, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.1875f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f)
			.setRotationPoint(-29, -0.9375f, -11.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 275, 230, textureX, textureY)
			.addShapeBox(-0.5f, -4.625f, 0.0625f, 1, 1, 1, 0, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.1875f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f)
			.setRotationPoint(-29, -0.9375f, -11.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 467, 228, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.25f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0)
			.setRotationPoint(-29, -0.9375f, -11.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 113, 228, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -1, -0.125f, 0, -1, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-29, -0.9375f, -11.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 400, 227, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.25f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f)
			.setRotationPoint(-29, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 385, 227, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.375f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -1, -0.125f, 0, -1)
			.setRotationPoint(-29, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 171, 118, textureX, textureY)
			.addShapeBox(-0.5f, -5.4375f, 0.0625f, 1, 1, 2, 0, -0.125f, -0.875f, -0.1875f, -0.125f, -0.875f, -0.1875f, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, 0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f)
			.setRotationPoint(-29, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 359, 221, textureX, textureY)
			.addShapeBox(-0.5f, -5.5625f, 1.375f, 1, 1, 1, 0, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f)
			.setRotationPoint(-29, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 36, 252, textureX, textureY).addCylinder(0, -4.8125f, 1.6875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 31, 252, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-34.0625f, -2.25f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 26, 252, textureX, textureY)
			.addShapeBox(-0.5f, -4, 0, 1, 4, 1, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-34.0625f, -2.25f, -9.875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 170, 250, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(-29.335938f, -5.7421875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 507, 234, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-34.0625f, -5.75f, -9.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 18, 234, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-34.0625f, -5.7421875f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 62, 155, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 5, 1, 1, 0, 0, -0.375f, -0.4375f, -0.28125f, -0.375f, -0.4375f, -0.28125f, -0.375f, -0.40625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.4375f, -0.28125f, -0.375f, -0.4375f, -0.28125f, -0.375f, -0.40625f, 0, -0.375f, -0.375f)
			.setRotationPoint(-33.5625f, -6.25f, -10.5625f).setRotationAngle(0, 0, 0).setName(" aBox 1080cp 2")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 38, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-36.25f, -3.125f, -9.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 245, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(-36.25f, -3.75f, -9.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 499, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.375f, -0.75f, -0.1875f, -0.3125f, -0.75f, -0.1875f, -0.3125f, -0.75f, -0.1875f, -0.375f, -0.75f, -0.1875f, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f)
			.setRotationPoint(-36.25f, -2.125f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 100, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.375f, -0.25f, -0.1875f)
			.setRotationPoint(-36.25f, -3.125f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 197, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(-36.25f, -3.375f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 405, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.375f, -0.25f, -0.1875f)
			.setRotationPoint(-33.25f, -3.125f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 84, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(-33.25f, -3.375f, -11.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 285, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(-34.375f, -3.0625f, -8.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 407, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-34.375f, -2.0625f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 309, 233, textureX, textureY)
			.addShapeBox(-1, -1.0625f, 0, 1, 2, 1, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(-41.3125f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 223, 232, textureX, textureY)
			.addShapeBox(0, -1.0625f, 0, 1, 2, 1, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(-41.3125f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 809cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 455, 56, textureX, textureY)
			.addShapeBox(0, -0.6875f, 0, 26, 1, 1, 0, 0, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f, 0, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f)
			.setRotationPoint(-41.3125f, 5.5625f, -9.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 264, 56, textureX, textureY)
			.addShapeBox(0, 0.6875f, 0, 26, 1, 1, 0, 0, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f)
			.setRotationPoint(-41.3125f, 5.5625f, -9.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 63, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-41.3125f, 5.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 181, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-41.3125f, 6.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 18, 230, textureX, textureY)
			.addShapeBox(-1.25f, -1.5f, 0, 1, 2, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f)
			.setRotationPoint(-12.375f, 2.5625f, -9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 223, 228, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-14.6875f, 2.4375f, -9.3125f).setRotationAngle(0, 0, 9)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 170, 226, textureX, textureY).addCylinder(0, -2.4375f, 1.3125f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(-29, -0.9375f, -12.1875f).setRotationAngle(0, 0, -4)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 18, 226, textureX, textureY)
			.addShapeBox(-0.484375f, 0, 0.015625f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.625f)
			.setRotationPoint(-29.1875f, -3.375f, -11.125f).setRotationAngle(0, 0, -35).setName("Box 1082cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 223, 224, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-26, -4.5f, -10.9375f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 18, 222, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.625f, 0.625f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-26, -4.5f, -10.75f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 0, 15, textureX, textureY)
			.addShapeBox(4, -0.5f, 0, 6, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.5625f, 0, -0.1875f, 0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.5625f, 0, -0.1875f, 0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 389, 115, textureX, textureY)
			.addShapeBox(10, -0.5f, 0.375f, 2, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-39.5625f, 3.03125f, -11).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 249, 221, textureX, textureY)
			.addShapeBox(0.6875f, -0.5f, 0, 1, 1, 1, 0, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 223, 221, textureX, textureY)
			.addShapeBox(-0.5625f, 0.09375f, 0, 1, 1, 1, 0, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 476, 219, textureX, textureY)
			.addShapeBox(-0.5625f, -1.09375f, 0, 1, 1, 1, 0, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 458, 219, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 197, 219, textureX, textureY)
			.addShapeBox(-0.6875f, -0.875f, 0, 1, 1, 1, 0, 0, -0.6875f, -0.3125f, -0.9375f, -0.5f, -0.3125f, -0.9375f, -0.5f, -0.3125f, 0, -0.6875f, -0.3125f, 0, 0.0625f, -0.3125f, -0.9375f, 0.25f, -0.3125f, -0.9375f, 0.25f, -0.3125f, 0, 0.0625f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, -10.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 18, 217, textureX, textureY)
			.addShapeBox(-1, -0.625f, 0, 1, 1, 1, 0, 0.0625f, -0.625f, -0.1875f, -0.75f, -0.625f, -0.1875f, -0.75f, -0.625f, -0.1875f, 0.0625f, -0.625f, -0.1875f, 0, 0, -0.1875f, -0.75f, 0.375f, -0.1875f, -0.75f, 0.375f, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(-41.3125f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 44, 210, textureX, textureY)
			.addShapeBox(-1, -0.75f, 0, 1, 1, 1, 0, 0, -0.375f, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, 0, -0.375f, -0.1875f, 0.0625f, -0.25f, -0.1875f, -0.75f, -0.25f, -0.1875f, -0.75f, -0.25f, -0.1875f, 0.0625f, -0.25f, -0.1875f)
			.setRotationPoint(-41.3125f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 181, 115, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 1, 0, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f)
			.setRotationPoint(-41.3125f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearBackRight.add(new ModelRendererTurbo(ValveGearBackRight, 122, 219, textureX, textureY)
			.addShapeBox(0.125f, -1, 0, 1, 2, 1, 0, -0.625f, -0.25f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.625f, -0.25f, -0.1875f, -0.625f, -0.25f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.625f, -0.25f, -0.1875f)
			.setRotationPoint(-41.3125f, 6.0625f, -10.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		groups.add(ValveGearBackRight);
	}

	private final void initGroup_Boiler_Area0(){
		TurboList Boiler_Area = new TurboList("Boiler_Area");
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 361, 258, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(180, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 148, 246, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(165, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 311, 164, textureX, textureY)
			.addShapeBox(0, 0, -11, 15, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 164, textureX, textureY)
			.addShapeBox(0, 0, -11, 15, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 490, 163, textureX, textureY)
			.addShapeBox(0, 0, -11, 15, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 163, textureX, textureY)
			.addShapeBox(0, 0, -11, 15, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 162, textureX, textureY)
			.addShapeBox(0, 0, -11, 15, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 382, 156, textureX, textureY)
			.addShapeBox(0, 0, -11, 15, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 154, textureX, textureY)
			.addShapeBox(0, 0, -11, 15, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 304, 122, textureX, textureY)
			.addShapeBox(0, 0, -11, 15, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(45, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 148, 242, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(30, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 148, 238, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(15, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 198, 65, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(0, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 132, 65, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-15, 0, 0).setName("Box 940")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 66, 65, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-30, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 65, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-45, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 337, 62, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 198, 61, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 132, 61, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 66, 61, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 61, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 337, 58, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 198, 57, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 132, 57, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(-165, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 66, 57, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(180, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(165, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 337, 54, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 198, 53, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 132, 53, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 66, 53, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 337, 50, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 237, 49, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 171, 49, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(45, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 105, 49, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(30, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 337, 46, textureX, textureY)
			.addShapeBox(0, 0, -11, 65, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-51.3125f, -16, 0).setRotationAngle(15, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 196, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(0, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 389, 193, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-15, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 315, 193, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-30, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 192, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-45, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 315, 189, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 188, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 363, 187, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 337, 181, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 289, 180, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 180, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 289, 176, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 176, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(-165, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 289, 172, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(180, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 263, 163, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(165, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 311, 155, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 311, 151, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 311, 147, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 285, 139, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 285, 135, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 259, 129, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 259, 125, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 259, 121, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(45, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 95, 40, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(30, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 351, 28, textureX, textureY)
			.addShapeBox(0, 0, -10, 33, 3, 10, 0, 0, 2.4913f, -0.7025f, 0, 2.85f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -3, -0.375f, 0, -3, 1, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-84.3125f, -16, 0).setRotationAngle(15, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 335, 237, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(0, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 309, 229, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-15, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 485, 227, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-30, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 485, 223, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-45, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 485, 219, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 401, 183, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 205, 165, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 375, 162, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 408, 158, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 349, 154, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 138, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 382, 137, textureX, textureY)
			.addShapeBox(0, 0, -11, 26, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(13.6875f, -16, 0).setRotationAngle(-165, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 289, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(0, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 54, 287, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-15, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 279, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-30, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 18, 276, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-45, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 257, 272, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 18, 272, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 196, 265, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 254, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 467, 236, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 229, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 341, 212, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 479, 211, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-165, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 315, 204, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(180, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 132, 102, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(165, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 297, 110, textureX, textureY)
			.addShapeBox(0, 0, -8, 19, 3, 8, 0, 0, 2.087f, -0.212f, 0, 2.087f, -0.212f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 330, 108, textureX, textureY)
			.addShapeBox(0, 0, -8, 19, 3, 8, 0, 0, 4.31f, 0.3565f, 0, 4.31f, 0.3565f, 0, 0, 0, 0, 0, 0, 0, -3, 0.0625f, 0, -3, 0.0625f, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 108, textureX, textureY)
			.addShapeBox(0, 0, -8, 19, 3, 8, 0, 0, 5.5f, 1.526f, 0, 5.5f, 1.526f, 0, 0, 0, 0, 0, 0, 0, -5, 1.1875f, 0, -5, 1.1875f, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 132, 98, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(30, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 132, 94, textureX, textureY)
			.addShapeBox(0, 0, -11, 19, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.85f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, false, true })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(15, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 330, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 5.5f, 1.526f, 0, 5.5f, 1.526f, 0, -3, 0, 0, -3, 0, 0, -5, 1.1875f, 0, -5, 1.1875f,
				new boolean[]{ false, true, true, true, true, false })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-60, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 4.31f, 0.3565f, 0, 4.31f, 0.3565f, 0, -3, 0, 0, -3, 0, 0, -3, 0.0625f, 0, -3, 0.0625f,
				new boolean[]{ false, true, true, true, true, false })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-75, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 330, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 2.087f, -0.212f, 0, 2.087f, -0.212f, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ false, true, true, true, true, false })
			.setRotationPoint(39.6875f, -16, 0).setRotationAngle(-90, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 60, 190, textureX, textureY)
			.addShapeBox(0, 0, -11, 11, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.864f, -2.045f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(28.6875f, -16, 0).setRotationAngle(150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 190, textureX, textureY)
			.addShapeBox(0, 0, -11, 11, 3, 11, 0, 0, 2.85f, -0.375f, 0, 1.8167f, -2.53f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3.4475f, -1.609f, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(28.6875f, -16, 0).setRotationAngle(135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 164, 188, textureX, textureY)
			.addShapeBox(0, 0, -11, 11, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.0865f, -3.2125f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -2.5625f, -2.348f, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(28.6875f, -16, 0).setRotationAngle(120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 164, 176, textureX, textureY)
			.addShapeBox(0, 0, -11, 11, 3, 11, 0, 0, 2.85f, -0.375f, 0, 2.071f, -3.273f, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, -2.9375f, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(28.6875f, -16, 0).setRotationAngle(105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 285, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 3, 11, 0, 0, 0, 0, 0, 0, 0, 0, 2.071f, -3.273f, 0, 2.85f, -0.375f, 0, -3, 0, 0, -3, 0, 0, -3, -2.9375f, 0, -3, 0,
				new boolean[]{ true, true, true, true, true, false })
			.setRotationPoint(28.6875f, -16, 0).setRotationAngle(-105, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 170, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 3, 11, 0, 0, 0, 0, 0, 0, 0, 0, 2.864f, -2.045f, 0, 2.85f, -0.375f, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0,
				new boolean[]{ true, true, true, true, true, false })
			.setRotationPoint(28.6875f, -16, 0).setRotationAngle(-150, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 233, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 3, 11, 0, 0, 0, 0, 0, 0, 0, 0, 1.8167f, -2.53f, 0, 2.85f, -0.375f, 0, -3, 0, 0, -3, 0, 0, -3.4475f, -1.609f, 0, -3, 0,
				new boolean[]{ true, true, true, true, true, false })
			.setRotationPoint(28.6875f, -16, 0).setRotationAngle(-135, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 233, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 3, 11, 0, 0, 0, 0, 0, 0, 0, 0, 2.0865f, -3.2125f, 0, 2.85f, -0.375f, 0, -3, 0, 0, -3, 0, 0, -2.5625f, -2.348f, 0, -3, 0,
				new boolean[]{ true, true, true, true, true, false })
			.setRotationPoint(28.6875f, -16, 0).setRotationAngle(-120, 0, 0).setName("Box 940cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 220, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 5, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(49.4375f, -11.75f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 350, 216, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -23, -8.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 341, 216, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -18.3125f, -4.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 415, 215, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -23, -4.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 188, 215, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -18.3125f, 4.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 179, 215, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -23, 4.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 61, 215, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -18.3125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 215, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -23, 8.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 165, 213, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -18.3125f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 282, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 98, 1, 3, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-48.3125f, -15, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 474, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(49.5625f, -14.25f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 143, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-48.3125f, -15.5f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 220, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 5, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(49.4375f, -11.75f, 8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 285, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 98, 1, 3, 0, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-48.3125f, -15, 10).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 437, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, false })
			.setRotationPoint(49.5625f, -14.25f, 8).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 379, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-48.3125f, -15.5f, 10).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 361, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 40, 1, 26, 0, -0.4375f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.3125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-87.3125f, -16.3125f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 257, 185, textureX, textureY)
			.addBox(0, 0, 0, 7, 2.5f, 6, 0, 1f, new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(58.6875f, -10.75f, -3).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 463, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 9, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(64.6875f, -14, -4.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 224, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, true, false, false })
			.setRotationPoint(65.1875f, -14, -4.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 508, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, true, false, false })
			.setRotationPoint(65.1875f, -14, 4.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 490, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2.5f, 0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, true, false, false })
			.setRotationPoint(65.1875f, -13.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 148, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0.5f, 8.5f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, true, true })
			.setRotationPoint(65.1875f, -14, -4.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 486, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.5f, 1, 11, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(58.4375f, -11.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 297, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6.5f, 3, 8, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, true, false, false })
			.setRotationPoint(58.6875f, -14, -4).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 484, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(63.1875f, -14.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.75f, 1, 6, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(58.4375f, -15.25f, -3).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 464, 194, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -17.2625f, -2.0625f).setRotationAngle(0, 0, 0).setName("Box 862")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 123, 194, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -19.5f, -2.0625f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 453, 192, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -17.2625f, 1.125f).setRotationAngle(0, 0, 0).setName("Box 862")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 164, 192, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -19.5f, 1.125f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 198, 190, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -21.5f, 1.125f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 356, 189, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -15.2625f, 1.125f).setRotationAngle(0, 0, 0).setName("Box 862")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 349, 189, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -21.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 307, 187, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -15.2625f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 250, 185, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -21.5f, -2.0625f).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 479, 183, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(57.887497f, -15.2625f, -2.0625f).setRotationAngle(0, 0, 0).setName("Box 862")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 139, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2.75f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(58.6875f, -22, -1.375f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 43, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6.5f, 3.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(58.4375f, -22.25f, -1.625f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 137, 242, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -21, -8.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 407, 240, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -21, -4.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 400, 240, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -21, 4.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 393, 240, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 3, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(61.8125f, -21, 8.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 46, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(62.9375f, -16, -9.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 251, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(62.9375f, -22.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 153, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(62.9375f, -16, 9.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 98, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(62.9375f, -22.25f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 369, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.75f, 6.5f, 0.25f, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(63.9375f, -22.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 364, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.75f, 6.5f, 0.25f, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(63.9375f, -22.25f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 101, 130, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 2, 3, 0, -0.4f, 0, -0.35f, -0.4f, 0, -0.35f, -0.4f, 0, -0.3f, -0.4f, 0, -0.3f, -0.4f, -1.25f, -0.35f, -0.4f, -1.25f, -0.35f, -0.4f, -0.25f, -0.3f, -0.4f, -0.25f, -0.3f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(59.287506f, -25.75f, 1.6f).setRotationAngle(0, 0, 0).setName("Box 743")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 17, 122, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 2, 3, 0, -0.4f, 0, -0.3f, -0.4f, 0, -0.3f, -0.4f, 0, -0.35f, -0.4f, 0, -0.35f, -0.4f, -0.25f, -0.3f, -0.4f, -0.25f, -0.3f, -0.4f, -1.25f, -0.35f, -0.4f, -1.25f, -0.35f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(59.287506f, -25.75f, -4.6f).setRotationAngle(0, 0, 0).setName("Box 759")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 205, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(57.1875f, -24.5f, -2).setRotationAngle(0, 0, -45).setName("Box 740")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 38, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(57.1875f, -24.5f, 1).setRotationAngle(0, 0, -45).setName("Box 741")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 158, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, -0.35f, 0, 0, -0.35f, -2.75f, 0, -0.05f, 0, 0, -0.3f, 0, -0.8f, -0.35f, 0, -0.8f, -0.35f, -2.75f, -0.8f, -0.05f, 0, -0.8f, -0.3f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(58.887497f, -25.75f, 1.6f).setRotationAngle(0, 0, 0).setName("Box 745")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 158, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, -0.3f, -2.75f, 0, -0.05f, 0, 0, -0.35f, 0, 0, -0.35f, 0, -0.8f, -0.3f, -2.75f, -0.8f, -0.05f, 0, -0.8f, -0.35f, 0, -0.8f, -0.35f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(58.887497f, -25.75f, -4.6f).setRotationAngle(0, 0, 0).setName("Box 750")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 323, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.4f, 0, -0.25f, -0.4f, 0, -0.25f, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0.25f, -0.25f, -0.4f, 0.25f, -0.25f, -0.4f, 0.25f, 0, -0.4f, 0.25f, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(58.487503f, -27, -4.25f).setRotationAngle(0, 47, 0).setName("Box 738")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 12, 164, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 1, 4, 0, -0.4f, 0, -0.25f, -0.4f, 0, -0.25f, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0.25f, -0.25f, -0.4f, 0.25f, -0.25f, -0.4f, 0.25f, 0, -0.4f, 0.25f, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(58.487503f, -27, 4.25f).setRotationAngle(0, 133, 0).setName("Box 739")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, -0.5f, 0.1f, -0.5f, -0.5f, 0.1f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(60.6875f, -27.75f, -1.75f).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 434, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0.1f, 0, 0, 0.1f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0.1f, 0, -0.5f, 0.1f,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(60.6875f, -27.75f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 742")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 508, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(60.6875f, -28.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 768")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 375, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(60.6875f, -28.25f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 769")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 9, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(60.6875f, -28.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 770")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 465, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0.25f, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(58.212494f, -24.875f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 1025cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 413, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0.25f, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(58.212494f, -24.875f, -6.375f).setRotationAngle(0, 0, 0).setName("Box 1025cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 359, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0.75f, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(58.712494f, -25.375f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 1025cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 160, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0.75f, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, -0.25f,
				new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(58.712494f, -25.375f, -6.375f).setRotationAngle(0, 0, 0).setName("Box 1025cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 235, 310, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(58.712494f, -26.357f, -6.375f).setRotationAngle(0, 0, 0).setName("Box 1024")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 230, 310, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(58.712494f, -26.375f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 1025")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 193, 240, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 3, 8, 1, 1, 4, null)
			.setRotationPoint(0.875f, -6.5f, -10).setRotationAngle(0, -90, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 186, 240, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 9, 8, 1, 1, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(-4.8125f, -6.5f, -10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 409, 294, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 31, 8, 1, 1, 3, new Vec3f(0.5546875, 0.0, 0.0))
			.setRotationPoint(14.3984375f, -12, -10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 179, 240, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 16, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-10.8125f, -5.625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 66, 240, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 3, 8, 1, 1, 4, null)
			.setRotationPoint(0.875f, -6.5f, 10).setRotationAngle(0, -90, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 59, 240, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 2, 8, 1, 1, 2, new Vec3f(0.0, 0.875, 0.0))
			.setRotationPoint(-6.8125f, -6.5f, 10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 240, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 3, null)
			.setRotationPoint(4.6875f, -2.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 402, 294, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 25, 8, 1, 1, 3, new Vec3f(-0.25, 0.0, 0.0))
			.setRotationPoint(15.6875f, -8, -8.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 239, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 13, 8, 1, 1, 0, new Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(42.1875f, -8, -6.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 323, 239, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 3, null)
			.setRotationPoint(4.6875f, -2.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 395, 294, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 25, 8, 1, 1, 3, new Vec3f(-0.25, 0.0, 0.0))
			.setRotationPoint(15.6875f, -8, 8.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 316, 239, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 2, 8, 1, 1, 2, new Vec3f(0.0, 0.875, 0.0))
			.setRotationPoint(-6.8125f, -6.5f, -10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 309, 239, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 2, 8, 1, 1, 3, new Vec3f(0.25, 0.0, 0.0))
			.setRotationPoint(-9.0625f, -5.625f, -10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 297, 239, textureX, textureY).addCylinder(0, 0, 4, 1.75f, 2, 8, 1, 1, 3, new Vec3f(0.25, 0.0, 0.0))
			.setRotationPoint(-9.0625f, -5.625f, 6).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 290, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(45.9375f, -12, -8.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 283, 239, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(45.9375f, -12, -8.25f).setRotationAngle(0, -45, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 16, 238, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(-45.0, 0.0, 0.0)).build()
			.setRotationPoint(45.9375f, -12, 8.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 9, 238, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(-45.0, 0.0, 0.0)).build()
			.setRotationPoint(45.9375f, -12, 8.25f).setRotationAngle(0, 45, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 137, 237, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.0625f, -5.625f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 118, 237, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.0625f, -5.625f, 8.25f).setRotationAngle(0, -45, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 111, 237, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(-45.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.0625f, -5.625f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 237, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(-45.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.0625f, -5.625f, -8.25f).setRotationAngle(0, 45, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 450, 235, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(40.4375f, -8, -6.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 381, 235, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, -1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(45.0, 0.0, 0.0)).build()
			.setRotationPoint(40.4375f, -8, -6.75f).setRotationAngle(0, -45, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 374, 235, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(-45.0, 0.0, 0.0)).build()
			.setRotationPoint(40.4375f, -8, 6.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 367, 235, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1.75f).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(-45.0, 0.0, 0.0)).build()
			.setRotationPoint(40.4375f, -8, 6.75f).setRotationAngle(0, 45, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 271, 235, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 43.0, 0.0)).build()
			.setRotationPoint(7.625f, -8.71875f, -10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 264, 235, textureX, textureY).addCylinder(0, 1.75f, 0, 1.75f, 6, 8, 1, 1, 3, null)
			.setRotationPoint(7.625f, -8.71875f, -10).setRotationAngle(0, 0, -43)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 245, 235, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, -43.0, 0.0)).build()
			.setRotationPoint(14.3984375f, -10.25f, -10).setRotationAngle(0, 0, -43)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 238, 235, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 3, 8, 1, 1, 3, new Vec3f(-0.0625, -0.46875, 0.0))
			.setRotationPoint(4.6875f, -6.5f, -10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 237, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 9, 8, 1, 1, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(-4.8125f, -6.5f, 10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 388, 294, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 31, 8, 1, 1, 3, new Vec3f(0.5546875, 0.0, 0.0))
			.setRotationPoint(14.3984375f, -12, 10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 231, 235, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 43.0, 0.0)).build()
			.setRotationPoint(7.625f, -8.71875f, 10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 257, 235, textureX, textureY).addCylinder(0, 1.75f, 0, 1.75f, 6, 8, 1, 1, 3, null)
			.setRotationPoint(7.625f, -8.71875f, 10).setRotationAngle(0, 0, -43)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 400, 233, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new Vec3f(-1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, -43.0, 0.0)).build()
			.setRotationPoint(14.3984375f, -10.25f, 10).setRotationAngle(0, 0, -43)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 500, 234, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 3, 8, 1, 1, 3, new Vec3f(-0.0625, -0.46875, 0.0))
			.setRotationPoint(4.6875f, -6.5f, 10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 422, 232, textureX, textureY).newCylinderBuilder()
			.setPosition(1.75f, 0, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(5.6875f, -4.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 35, 232, textureX, textureY).newCylinderBuilder()
			.setPosition(1.75f, 0, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(5.6875f, -4.25f, 6.5f).setRotationAngle(0, 0, 45)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 179, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(9.1875f, -4.3203125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 168, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(9.1875f, -4.3203125f, 6.5f).setRotationAngle(0, 0, -45)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 161, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, 1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 18.0, 0.0)).build()
			.setRotationPoint(9.199219f, -7.8203125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 59, 231, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 18.0, 0.0)).build()
			.setRotationPoint(15.6875f, -6.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 457, 230, textureX, textureY).addCylinder(-5.6875f, -1.75f, 0, 1.75f, 5, 8, 1, 1, 3, new Vec3f(0.6875, 0.0, 2.0))
			.setRotationPoint(15.6875f, -6.25f, 6.5f).setRotationAngle(0, 0, -18)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 450, 230, textureX, textureY).addCylinder(1.75f, 0, 0, 1.75f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.9296875, 0.0))
			.setRotationPoint(5.6875f, -4.3203125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 297, 230, textureX, textureY).addCylinder(-1, -1.75f, 0, 1.75f, 1, 8, 1, 1, 3, new Vec3f(-0.98828125, 0.0, 0.0))
			.setRotationPoint(10.1875f, -4.3203125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 290, 230, textureX, textureY).newCylinderBuilder()
			.setPosition(1.75f, 0, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(5.6875f, -4.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 42, 230, textureX, textureY).newCylinderBuilder()
			.setPosition(1.75f, 0, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -1.0, 0.0)).setTopRotation(new Vec3f(0.0, -45.0, 0.0)).build()
			.setRotationPoint(5.6875f, -4.25f, -6.5f).setRotationAngle(0, 0, 45)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 193, 229, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(9.1875f, -4.3203125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 66, 229, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 45.0, 0.0)).build()
			.setRotationPoint(9.1875f, -4.3203125f, -6.5f).setRotationAngle(0, 0, -45)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 229, textureX, textureY).addCylinder(1.75f, 0, 0, 1.75f, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.9296875, 0.0))
			.setRotationPoint(5.6875f, -4.3203125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 355, 228, textureX, textureY).addCylinder(-1, -1.75f, 0, 1.75f, 1, 8, 1, 1, 3, new Vec3f(-0.98828125, 0.0, 0.0))
			.setRotationPoint(10.1875f, -4.3203125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 348, 228, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, 1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 18.0, 0.0)).build()
			.setRotationPoint(9.199219f, -7.8203125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 431, 229, textureX, textureY).addCylinder(-5.6875f, -1.75f, 0, 1.75f, 5, 8, 1, 1, 3, new Vec3f(0.6875, 0.0, -2.0))
			.setRotationPoint(15.6875f, -6.25f, -6.5f).setRotationAngle(0, 0, -18)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 257, 228, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, -1.75f, 0).setRadius(1.75f, 0).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setTopOffset(new Vec3f(1.0, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 18.0, 0.0)).build()
			.setRotationPoint(15.6875f, -6.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 253, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, 3.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 3.5f, 0, 0, 2, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0, -0.4f, 2, 0, -0.4f)
			.setRotationPoint(-102.3125f, -23, -13.1f).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 497, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, -0.25f, -0.6f, 0, -0.25f, -0.6f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.8125f, -21, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1008")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-92.3125f, -21, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1009")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 415, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.8125f, -16, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1010")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 236, 285, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-103.8125f, -16, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1011")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 341, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-103.8125f, -21, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1012")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 218, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-103.8125f, -16, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1013")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-103.8125f, -21, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1014")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 283, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.8125f, -16, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1015")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 479, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, -0.25f, -0.6f, 0, -0.25f, -0.6f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -2, 0, -0.25f, -2, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.8125f, -21, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1016")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 266, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-92.3125f, -21, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1017")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 367, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 2, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0.95f, 0.25f, 0, 0.95f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.6f, 0.25f, 0, -1.6f, 0.25f)
			.setRotationPoint(-111.8125f, -26.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1018")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 180, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 2, 1, 0, 0, -0.65f, -1.8f, 0, -0.65f, -1.8f, 0, -1, 0.8f, 0, -1, 0.8f, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, 0, -0.25f)
			.setRotationPoint(-111.8125f, -27, -11.3f).setRotationAngle(0, 0, 0).setName("Box 1021")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 46, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 2, 1, 0, 0.5f, 0, -1.8f, 0.5f, 0, -1.8f, 0.5f, 0, 1.3f, 0.5f, 0, 1.3f, -4.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, -4.5f, 0, -0.25f)
			.setRotationPoint(-110.3125f, -25, -12.85f).setRotationAngle(0, 0, 0).setName("Box 1022")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0.55f, 0.25f, 0, 0.55f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.2f, 0.25f, 0, -1.2f, 0.25f)
			.setRotationPoint(-111.8125f, -27.6f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1026")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 426, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(-111.8125f, -28.3f, -4).setRotationAngle(0, 0, 0).setName("Box 1027")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 351, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 2, 1, 0, 0.5f, 0, 1.3f, 0.5f, 0, 1.3f, 0.5f, 0, -1.8f, 0.5f, 0, -1.8f, -4.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, -4.5f, 0, -0.25f)
			.setRotationPoint(-110.3125f, -25, 11.85f).setRotationAngle(0, 0, 0).setName("Box 977")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 59, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 2, 1, 0, 0, -1, 0.8f, 0, -1, 0.8f, 0, -0.65f, -1.8f, 0, -0.65f, -1.8f, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, 0, -0.25f)
			.setRotationPoint(-111.8125f, -27, 10.3f).setRotationAngle(0, 0, 0).setName("Box 978")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 306, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 2, 0, 0, 0.95f, 0.25f, 0, 0.95f, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -1.6f, 0.25f, 0, -1.6f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-111.8125f, -26.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 979")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 363, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 3, 0, 0, 0.55f, 0.25f, 0, 0.55f, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -1.2f, 0.25f, 0, -1.2f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-111.8125f, -27.6f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 980")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 190, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-111.8125f, -28.3f, 1).setRotationAngle(0, 0, 0).setName("Box 981")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 449, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 25, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-88.8125f, -16, -12.5f).setRotationAngle(0, 0, 0).setName("Box 972")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 466, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, 3.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 3.5f, 0, -0.5f, 2, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.1f, 2, 0, -0.1f)
			.setRotationPoint(-102.3125f, -23, 12.1f).setRotationAngle(0, 0, 0).setName("Box 974")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 398, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.1375f, -0.5f, 0, -0.1375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-103.8125f, -9, -13).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 464, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 4, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -16, 8.75f).setRotationAngle(0, 0, 0).setName("Box 1952")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 453, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 4, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -16, -12.75f).setRotationAngle(0, 0, 0).setName("Box 1953")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 164, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -23, -12.75f).setRotationAngle(0, 0, 0).setName("Box 1954")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 225, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -21, -12.75f).setRotationAngle(0, 0, 0).setName("Box 1955")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 220, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -21, -9.75f).setRotationAngle(0, 0, 0).setName("Box 1956")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 215, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -21, 11.75f).setRotationAngle(0, 0, 0).setName("Box 1957")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 210, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -21, 8.75f).setRotationAngle(0, 0, 0).setName("Box 1958")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 349, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -23, 8.75f).setRotationAngle(0, 0, 0).setName("Box 1959")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 192, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 25, 0, -0.5f, 0, -1.75f, 0, 0, -1.75f, 0, 0, -1.75f, -0.5f, 0, -1.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -25, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1960")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 169, 287, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.5f, 0, -3.25f, 0, 0, -3.25f, 0, 0, -3.25f, -0.5f, 0, -3.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f)
			.setRotationPoint(-104.3125f, -28, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1962")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 153, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-104.3125f, -26, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1966")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 136, 287, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 2, 0, 0, 2, 0, 0, 2.25f, -0.5f, 0, 2.25f)
			.setRotationPoint(-104.3125f, -27, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1967")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 245, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 2, 0, 0, -0.15f, -0.45f, 0, -0.15f, -0.45f, 0, -0.15f, -0.05f, 0, -0.15f, -0.05f, 0, -0.5f, -0.45f, 0, -0.5f, -0.45f, 0, -0.5f, -0.05f, 0, -0.5f, -0.05f)
			.setRotationPoint(-111.8125f, -28.45f, -1.2f).setRotationAngle(0, 0, 0).setName("Box 1975")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 35, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, -0.5f, -1, -0.25f)
			.setRotationPoint(-104.3125f, -23, -9.25f).setRotationAngle(0, 0, 0).setName("Box 1976")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 472, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-104.3125f, -23, 7.25f).setRotationAngle(0, 0, 0).setName("Box 1977")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 169, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f)
			.setRotationPoint(-102.3125f, -20.5f, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1991")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 233, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f)
			.setRotationPoint(-102.3125f, -21, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1993")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 145, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f)
			.setRotationPoint(-93.3125f, -20.5f, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1994")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 75, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f)
			.setRotationPoint(-97.8125f, -20.5f, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1995")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.5f, -0.25f, -0.4f, 0, -0.25f, -0.4f, 0, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f)
			.setRotationPoint(-103.3125f, -19.1f, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1996")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 61, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f)
			.setRotationPoint(-100.0625f, -21.25f, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1997")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 474, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f)
			.setRotationPoint(-95.5625f, -21.25f, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1998")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 207, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f)
			.setRotationPoint(-102.3125f, -21, -13.25f).setRotationAngle(0, 0, 0).setName("Box 2000")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 469, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f)
			.setRotationPoint(-102.3125f, -20.5f, -13.25f).setRotationAngle(0, 0, 0).setName("Box 2001")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 426, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f)
			.setRotationPoint(-93.3125f, -20.5f, -13.25f).setRotationAngle(0, 0, 0).setName("Box 2005")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f)
			.setRotationPoint(-102.3125f, -16.5f, -13.25f).setRotationAngle(0, 0, 0).setName("Box 2006")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 254, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-102.3125f, -21, -13).setRotationAngle(-45, 0, 0).setName("Box 2015")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 129, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-102.3125f, -21, 13).setRotationAngle(45, 0, 0).setName("Box 2016")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 354, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, -0.375f, -0.34375f, -0.34375f, -0.375f, -0.34375f, -0.34375f, -0.375f, -0.34375f, -0.34375f, -0.375f, -0.34375f)
			.setRotationPoint(56.3125f, -17.625f, 11.25f).setRotationAngle(0, 0, 0).setName("Box 825")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 349, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(56.3125f, -16, 11.25f).setRotationAngle(0, 0, 0).setName("Box 827")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 58, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5625f, -29.3f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1081cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 389, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 5, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.0625f, -28.3f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 289, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.0625f, -29.3f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 363, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 5, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5625f, -28.3f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1084cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 305, 83, textureX, textureY).addBox(0, 0, 0, 18, 4, 9)
			.setRotationPoint(-24.5625f, -28.3f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1085cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 109, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 9, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.5625f, -29.3f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1086cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 58, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 5, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-24.5625f, -28.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1093cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 363, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-24.5625f, -29.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1094cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 5, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(-23.0625f, -28.3f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1095cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 263, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(-23.0625f, -29.3f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1096cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 257, 210, textureX, textureY).addBox(0, 0, 0, 0, 3, 4)
			.setRotationPoint(-55.3125f, -29, -2).setRotationAngle(0, 0, 0).setName("Box 323")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 245, 210, textureX, textureY).addBox(0, 0, 0, 0, 3, 4)
			.setRotationPoint(-51.3125f, -29, -2).setRotationAngle(0, 0, 0).setName("Box 326")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 344, 309, textureX, textureY).addBox(0, 0, 0, 2, 3, 0)
			.setRotationPoint(-54.3125f, -29, -3).setRotationAngle(0, 0, 0).setName("Box 327")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 339, 309, textureX, textureY).addBox(0, 0, 0, 2, 3, 0)
			.setRotationPoint(-54.3125f, -29, 3).setRotationAngle(0, 0, 0).setName("Box 328")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 439, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(-52.3125f, -29, 3).setRotationAngle(0, 0, 0).setName("Box 329")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 124, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.3125f, -29, 2).setRotationAngle(0, 0, 0).setName("Box 330")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 277, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-52.3125f, -29, -3).setRotationAngle(0, 0, 0).setName("Box 331")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 251, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-55.3125f, -29, -3).setRotationAngle(0, 0, 0).setName("Box 332")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 284, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-11.5625f, -24.2f, 7.2f).setRotationAngle(0, 0, 0).setName("Box 335")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 275, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-17.5625f, -24.2f, 7.2f).setRotationAngle(0, 0, 0).setName("Box 339")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 266, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-20.5625f, -24.2f, 7.2f).setRotationAngle(0, 0, 0).setName("Box 340")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 205, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-14.5625f, -24.2f, 7.2f).setRotationAngle(0, 0, 0).setName("Box 341")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 200, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(-11.5625f, -25, 6.75f).setRotationAngle(0, 0, 0).setName("Box 362")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 174, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.2f, -0.25f, -0.25f, -0.4f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(-17.5625f, -25, 6.75f).setRotationAngle(0, 0, 0).setName("Box 363")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 159, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(-14.5625f, -25, 6.75f).setRotationAngle(0, 0, 0).setName("Box 364")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 154, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(-20.5625f, -25, 6.75f).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 129, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(-20.5625f, -22, 9.5f).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 124, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(-11.5625f, -22, 9.5f).setRotationAngle(0, 0, 0).setName("Box 368")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 119, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(-17.5625f, -22, 9.5f).setRotationAngle(0, 0, 0).setName("Box 369")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 114, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(-14.5625f, -22, 9.5f).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 84, 116, textureX, textureY).addBox(0, 0, 0, 4, 3, 7)
			.setRotationPoint(53.9375f, -28, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1163")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 389, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, 0.2f, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0.2f, 0, 0, 0.2f, -0.8f, 0.2f, 0, -0.8f, 0.2f, 0, -0.8f, 0, 0.2f, -0.8f, 0)
			.setRotationPoint(54.037506f, -28.2f, -3.4f).setRotationAngle(0, 0, 0).setName("Box 1498")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.8125f, -29.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1091")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 441, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.3125f, -29.5f, -4).setRotationAngle(0, 0, 0).setName("Box 1092")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 330, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-3.8125f, -29.5f, 1).setRotationAngle(0, 0, 0).setName("Box 1093")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 185, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(-2.3125f, -29.5f, 3).setRotationAngle(0, 0, 0).setName("Box 1094")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 489, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-3.8125f, -28.5f, 1).setRotationAngle(0, 0, 0).setName("Box 1095")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(-2.3125f, -28.5f, 3).setRotationAngle(0, 0, 0).setName("Box 1096")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 463, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.8125f, -28.5f, -3).setRotationAngle(0, 0, 0).setName("Box 1097")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.3125f, -28.5f, -4).setRotationAngle(0, 0, 0).setName("Box 1098")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 207, 113, textureX, textureY).addBox(0, 0, 0, 9, 4, 2)
			.setRotationPoint(-3.8125f, -28.5f, -1).setRotationAngle(0, 0, 0).setName("Box 1099")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 132, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.8125f, -29.5f, -1).setRotationAngle(0, 0, 0).setName("Box 1100")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 109, 309, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(61.4375f, -23.5f, 8).setRotationAngle(-90, 0, 0).setName("Box 1440")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 309, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, 0, -1, 1.1f, -0.5f, -1, 1.1f, -0.5f, -0.55f, -1.9f, 0, -0.55f, -1.9f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(54.6875f, -25, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1443")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 99, 309, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, -2, 0, 0, -2, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(54.6875f, -22.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1444")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 95, 46, textureX, textureY)
			.addShapeBox(0, -1, 0, 39, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(16.6875f, -18, 11).setRotationAngle(0, 0, 0).setName("Box 1445")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 70, 309, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0.1f, -0.03f, -0.5f, 0.1f, -0.03f, -0.5f, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(55.1875f, -26.65f, 4.31f).setRotationAngle(-70, 180, 0).setName("Box 1446")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 143, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-31.0625f, -20.75f, -11.7f).setRotationAngle(0, 0, 0).setName("Box 2026")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 35, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.2f, -0.7f, 0, 0.2f, -0.7f, 0, 0.2f, 1.4f, -0.5f, 0.2f, 1.4f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, 1.2f, -0.5f, -0.7f, 1.2f)
			.setRotationPoint(38.3375f, -20.65f, -11.8f).setRotationAngle(0, 0, 0).setName("Box 2031")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 30, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-81.0625f, -17.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 330, 97, textureX, textureY)
			.addShapeBox(-3, 0, 0, 13, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-90.5625f, -8, -11.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 10, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-82.1875f, -14.75f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 158, textureX, textureY)
			.addShapeBox(-3, 0, 0, 6, 1, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-85.1875f, -12.25f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 5, 309, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-66.1875f, -27, 1.25f).setRotationAngle(-90, 0, 0).setName("Box 1440")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 309, textureX, textureY).addCylinder(2.25f, -1, -1, 1, 4, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-54.8125f, -27.5f, 3).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 504, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-73.8125f, -26.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1176")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 178, 151, textureX, textureY)
			.addBox(0, 0, 0, 1, 1, 1, 0, 1f, new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(-72.8125f, -26.3f, 5).setRotationAngle(0, 0, 0).setName("Box 1177")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 456, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-71.8125f, -26.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1178")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 373, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-71.8125f, -25.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1179")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 296, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-71.8125f, -27.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1180")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 464, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-73.8125f, -27.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1181")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 459, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-73.8125f, -25.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1182")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 32, 168, textureX, textureY)
			.addBox(0, 0, 0, 1, 1, 0, 0, 1f, new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(-70.8125f, -24.8f, 6).setRotationAngle(0, 0, 0).setName("Box 1183")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 29, 168, textureX, textureY)
			.addBox(0, 0, 0, 1, 1, 0, 0, 1f, new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(-73.8125f, -24.8f, 6).setRotationAngle(0, 0, 0).setName("Box 1185")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 454, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.8125f, -27.8f, 5).setRotationAngle(0, 0, 0).setName("Box 1187")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 446, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4f, 0.5f, 0, -0.4f, 0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.8125f, -28.3f, 5).setRotationAngle(0, 0, 0).setName("Box 1559")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 441, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-90.4375f, -26.6f, -8.375f).setRotationAngle(0, 0, 0).setName("Box 1045")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 379, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.4375f, -20.6f, -9.375f).setRotationAngle(0, 0, 0).setName("Box 1046")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 89, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.4375f, -21.5f, -9.375f).setRotationAngle(0, 0, 0).setName("Box 1047")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 84, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-92.3125f, -14.75f, -12.25f).setRotationAngle(0, 0, 0).setName("Box 1049")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 65, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, -0.1f, 0, 0, -0.3f, 0, -0.4f, -0.3f, 0, -0.4f, -0.3f, 0, 0, -0.3f, 0, 0)
			.setRotationPoint(-92.5125f, -14.75f, -12.25f).setRotationAngle(0, 0, 0).setName("Box 1055")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 436, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, -0.7f, 0, -0.4f, -0.3f, 0, -0.4f, -0.3f, 0, 0, -0.7f, 0, 0)
			.setRotationPoint(-92.5125f, -14.25f, -12.25f).setRotationAngle(0, 0, 0).setName("Box 1056")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 431, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.3f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, 0.2f, -0.3f, 0, 0.2f)
			.setRotationPoint(-92.3125f, -9.75f, -12.25f).setRotationAngle(0, 0, 0).setName("Box 1075")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 269, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-92.8125f, -15.8f, -6.25f).setRotationAngle(0, 40, 0).setName("Box 1871")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 118, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-91.8125f, -14.8f, -9).setRotationAngle(0, 40, 0).setName("Box 1872")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 374, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, -0.5f, -0.2f, -0.3f, -0.5f, -0.2f, -0.3f, 0, 0.2f, 0.2f, 0, 0.2f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-90.4375f, -27, -8.775f).setRotationAngle(0, 0, 0).setName("Box 1926")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 369, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-87.7375f, -25.49f, -8.625f).setRotationAngle(0, 0, 0).setName("Box 1927")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 494, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-93.7375f, -26.49f, -8.625f).setRotationAngle(0, 0, 0).setName("Box 1930")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 364, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.05f, 0, -0.5f, -0.05f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-93.1875f, -26.99f, -8.625f).setRotationAngle(0, 0, 0).setName("Box 1932")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 359, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.05f, 0, -0.5f, -0.05f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-88.7375f, -26.99f, -8.625f).setRotationAngle(0, 0, 0).setName("Box 1933")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-92.7375f, -25.49f, -8.625f).setRotationAngle(0, 0, 0).setName("Box 1934")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 271, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-87.7375f, -25.49f, -9.365f).setRotationAngle(0, 0, 0).setName("Box 1936")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 289, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-92.7375f, -25.49f, -9.365f).setRotationAngle(0, 0, 0).setName("Box 1937")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 237, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-93.7375f, -25.49f, -9.365f).setRotationAngle(0, 0, 0).setName("Box 1938")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 468, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-93.7375f, -26.49f, -9.365f).setRotationAngle(0, 0, 0).setName("Box 1939")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 465, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.7275f, -25.99f, -8.625f).setRotationAngle(0, 0, 0).setName("Box 1941")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 439, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-93.7475f, -25.99f, -8.625f).setRotationAngle(0, 0, 0).setName("Box 1942")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 232, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-90.0125f, -11, -12.83f).setRotationAngle(0, 0, 0).setName("Box 1943")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-94.0125f, -10, -12.83f).setRotationAngle(0, 0, 0).setName("Box 1944")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 465, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-93.0125f, -11, -12.83f).setRotationAngle(0, 0, 0).setName("Box 1945")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 460, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-94.0125f, -10, -12.09f).setRotationAngle(0, 0, 0).setName("Box 1947")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 166, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-93.0125f, -11, -12.09f).setRotationAngle(0, 0, 0).setName("Box 1948")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 227, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-94.0125f, -11, -12.09f).setRotationAngle(0, 0, 0).setName("Box 1949")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 222, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -0.5f, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-94.0125f, -11, -12.83f).setRotationAngle(0, 0, 0).setName("Box 1950")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 168, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-94.0225f, -10.5f, -12.09f).setRotationAngle(0, 0, 0).setName("Box 1951")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 217, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-93.0125f, -9.5f, -12.09f).setRotationAngle(0, 0, 0).setName("Box 1952")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 188, textureX, textureY).addBox(0, 0, 0, 2, 3, 3)
			.setRotationPoint(-90.3125f, -13, 0).setRotationAngle(0, 0, 0).setName("Box 1956")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 299, 187, textureX, textureY).addBox(0, 0, 0, 2, 3, 3)
			.setRotationPoint(-90.3125f, -13, -3).setRotationAngle(0, 0, 0).setName("Box 1957")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 114, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.3125f, -14, -3).setRotationAngle(0, 0, 0).setName("Box 1958")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 114, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.3125f, -14, 0).setRotationAngle(0, 0, 0).setName("Box 1959")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 466, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.3125f, -15, -1).setRotationAngle(0, 0, 0).setName("Box 1960")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 212, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1, -0.5f, 0, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 1, 0, 0.5f)
			.setRotationPoint(-89.3125f, -15.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1961")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 179, 307, textureX, textureY)
			.addShapeBox(0, -2, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-91.3125f, -14.25f, 1.8125f).setRotationAngle(106, 0, 0).setName("Box 1962")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 272, 94, textureX, textureY).addBox(0, 0, 0, 2, 1, 8)
			.setRotationPoint(-90.3125f, -10, -4).setRotationAngle(0, 0, 0).setName("Box 1963")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 98, 258, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -22.9375f, -1).setRotationAngle(0, 0, 0).setName("Box 1899")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 41, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -22.9375f, -1).setRotationAngle(0, 0, 0).setName("Box 1900")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 87, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-98.8125f, -11.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 2014")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-99.8125f, -12.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 2015")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 150, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.5625f, -0.625f, -0.0625f, -0.5625f, -0.625f, -0.0625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.625f, -0.0625f, -0.0625f, -0.625f, -0.0625f, -0.0625f, 0, -0.5625f, -0.0625f, 0)
			.setRotationPoint(-103.1875f, -9.8125f, -14).setRotationAngle(0, 0, 0).setName("Box 1461")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 145, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.5625f, -0.625f, -0.0625f, -0.5625f, -0.625f, -0.0625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.625f, -0.0625f, -0.0625f, -0.625f, -0.0625f, -0.0625f, 0, -0.5625f, -0.0625f, 0)
			.setRotationPoint(-103.1875f, -15.8125f, -14).setRotationAngle(0, 0, 0).setName("Box 1462")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 140, 307, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 20, 1, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, 0, -1, 0)
			.setRotationPoint(61.6875f, -15.8125f, 10).setRotationAngle(-90, 0, 0).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 135, 307, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 18, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(60.4375f, -23.5f, 8).setRotationAngle(-90, 0, 0).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 240, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.6875f, -17.75f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 231, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.6875f, -22.5f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 436, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.6875f, -17.75f, -5.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 427, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.6875f, -22.5f, -5.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 251, 46, textureX, textureY)
			.addShapeBox(0, -1, 0, 34, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(27.4375f, -19.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 94, 307, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(60.4375f, -21, 10.5f).setRotationAngle(-90, 0, 0).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 9, textureX, textureY)
			.addShapeBox(0, -1, 0, 70, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-11.3125f, -8.8125f, 11.8125f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 25, 307, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(57.6875f, -13.3125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 271, 185, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(57.6875f, -13.8125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 6, textureX, textureY)
			.addShapeBox(0, -1, 0, 90, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-40.8125f, -11.3125f, 11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 20, 307, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 7, 1, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, 0, -1, 0)
			.setRotationPoint(60.6875f, -14.8125f, 10.25f).setRotationAngle(-90, 0, 0).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 500, 306, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(56.6875f, -12.3125f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 205, 185, textureX, textureY)
			.addShapeBox(0, -1, 0, 5, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(56.6875f, -12.8125f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 495, 306, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(60.6875f, -14.8125f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 324, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.6875f, -17.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 315, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.6875f, -22.5f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 179, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.6875f, -17.75f, 4.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 490, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.34375f, 0, -0.03125f, -0.34375f, 0, -0.03125f, -0.34375f, 0, -0.65625f, -0.34375f, 0, -0.65625f, -0.34375f, -0.5f, -0.34375f, -0.34375f, -0.5f, -0.34375f, -0.34375f, -0.5f, -0.34375f, -0.34375f, -0.5f, -0.34375f)
			.setRotationPoint(56.3125f, -19.125f, 11.25f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 485, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f)
			.setRotationPoint(56.3125f, -17.96875f, 10.65625f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 480, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.34375f, 0, 0.34375f, -0.34375f, 0, 0.34375f, -0.34375f, 0, -1.03125f, -0.34375f, 0, -1.03125f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f)
			.setRotationPoint(56.3125f, -21.09375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 475, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, 0, 0.5f, -0.34375f, 0, 0.5f, -0.34375f, 0, -1.1875f, -0.34375f, 0, -1.1875f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f)
			.setRotationPoint(56.3125f, -22.0625f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 426, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.34375f, -0.21875f, -0.34375f, -0.65625f, -0.34375f, -0.34375f, -0.65625f, -0.34375f, -0.34375f, -0.34375f, -0.46875f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f)
			.setRotationPoint(56.3125f, -22.71875f, 9.40625f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 383, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.34375f, 0.6875f, -0.0625f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0.34375f, 0.6875f, -0.625f, 0.34375f, -1.375f, -0.0625f, 0, -0.34375f, -0.46875f, 0, -0.34375f, -0.21875f, 0.34375f, -1.375f, -0.625f)
			.setRotationPoint(55.65625f, -22.71875f, 9.28125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 141, 1, 1, 0, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f)
			.setRotationPoint(-85.34375f, -23.75f, 9).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 280, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.34375f, 0, -0.65625f, -0.34375f, 0, -0.65625f, -0.34375f, 0, -0.03125f, -0.34375f, 0, -0.03125f, -0.34375f, -0.5f, -0.34375f, -0.34375f, -0.5f, -0.34375f, -0.34375f, -0.5f, -0.34375f, -0.34375f, -0.5f, -0.34375f)
			.setRotationPoint(56.3125f, -19.125f, -12.25f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 266, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f, -0.375f, -0.375f, -0.0625f)
			.setRotationPoint(56.3125f, -17.96875f, -11.65625f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 470, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.34375f, 0, -1.03125f, -0.34375f, 0, -1.03125f, -0.34375f, 0, 0.34375f, -0.34375f, 0, 0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f)
			.setRotationPoint(56.3125f, -21.09375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 465, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, 0, -1.1875f, -0.34375f, 0, -1.1875f, -0.34375f, 0, 0.5f, -0.34375f, 0, 0.5f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f)
			.setRotationPoint(56.3125f, -22.0625f, -11.25f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 460, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.34375f, -0.46875f, -0.34375f, -0.65625f, -0.34375f, -0.34375f, -0.65625f, -0.34375f, -0.34375f, -0.34375f, -0.21875f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f)
			.setRotationPoint(56.3125f, -22.71875f, -10.40625f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 455, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.34375f, 0.6875f, -0.625f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0.34375f, 0.6875f, -0.0625f, 0.34375f, -1.375f, -0.625f, 0, -0.34375f, -0.21875f, 0, -0.34375f, -0.46875f, 0.34375f, -1.375f, -0.0625f)
			.setRotationPoint(55.65625f, -22.71875f, -10.28125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 450, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, -0.375f, -0.34375f, -0.34375f, -0.375f, -0.34375f, -0.34375f, -0.375f, -0.34375f, -0.34375f, -0.375f, -0.34375f)
			.setRotationPoint(56.3125f, -17.625f, -12.25f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 445, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(56.3125f, -16, -12.25f).setRotationAngle(0, 0, 0).setName("Box 827cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 208, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(52.1875f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 141, 1, 1, 0, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f)
			.setRotationPoint(-85.34375f, -23.75f, -10).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 440, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(48.6875f, -11.3125f, 11.25f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 195, 94, textureX, textureY)
			.addShapeBox(0, -1, 0, 9, 1, 1, 0, -0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.75f, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(48.6875f, -11.3125f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 275, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.25f, 0, 0.3125f, -0.25f, 0, 0.3125f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.1875f, -0.25f, -0.5f, -0.1875f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(57.4375f, -8.8125f, 11.0625f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 181, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -3.75f, -0.5f, -0.25f, -3.75f, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, -3.75f)
			.setRotationPoint(53.9375f, -29, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1163cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 7, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -3.75f, -0.5f, -0.25f, -3.75f, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, -3.75f)
			.setRotationPoint(53.9375f, -29, 0).setRotationAngle(0, 0, 0).setName("Box 1163cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 261, 305, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20.3125f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 308, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-17.3125f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 195, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.3125f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 190, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-11.3125f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 403, 61, textureX, textureY)
			.addShapeBox(0, -1, 0, 9, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0.6875f, -12.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 315, 294, textureX, textureY).addCylinder(0, 0, 0, 2, 29, 8, 1, 1, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(-39.8125f, -10, 11).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 185, 304, textureX, textureY).addCylinder(0, 0, 0, 1, 28, 8, 1, 1, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(-63.0625f, -25.5f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 176, 46, textureX, textureY)
			.addShapeBox(0, -1, 0, 36, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-42.8125f, -7.4375f, 9.375f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 130, textureX, textureY)
			.addShapeBox(0, -1, 0, 8, 1, 1, 0, 0, 0, 0, -0.5f, 5.5f, 0, -0.5f, 5.5f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -6, 0, -0.5f, -6, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(9.1875f, -12.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 220, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-74.8125f, -6.25f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 403, 58, textureX, textureY)
			.addShapeBox(0, -1, 0, 9, 1, 1, 0, 0, -4.0625f, 1.625f, -1, 1, 0, -1, 1, -0.5f, 0, -4.0625f, -2.125f, 0, 3.5625f, 1.625f, -1, -1.5f, 0, -1, -1.5f, -0.5f, 0, 3.5625f, -2.125f)
			.setRotationPoint(-7.3125f, -11.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 434, 184, textureX, textureY)
			.addShapeBox(1, 0, 0, 5, 1, 1, 0, 0, -1, 0, 0, 0.1875f, 1.625f, 0, 0.1875f, -2.125f, 0, -1, -0.5f, 0, 0.5f, 0, 0, -0.6875f, 1.625f, 0, -0.6875f, -2.125f, 0, 0.5f, -0.5f)
			.setRotationPoint(-48.8125f, -8.25f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 220, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0.75f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -1.25f, 0, -0.5f, 0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -1.25f)
			.setRotationPoint(-102.3125f, -4.25f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 285, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 2, 0, 0, 2, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -2.5f, 0, 0, -2.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-80.8125f, -4.25f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 431, 226, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(25.9375f, -19.5f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 180, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-40.8125f, -12.3125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 175, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, -0.4375f, 0, -0.5f, 0.0625f, 0, -0.5f, 0.0625f, -0.5f, 0, -0.4375f, -0.5f)
			.setRotationPoint(-40.3125f, -10.8125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 170, 304, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1.1875f, 1.1875f, 4, null)
			.setRotationPoint(51.8125f, -28.75f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 165, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-26.3125f, -18.375f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 160, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.1375f, -0.25f, -0.25f, -0.1375f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(-26.5625f, -25.375f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 365cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 155, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(-26.5625f, -22.375f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 366cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 339, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 41, 1, 1, 0, -0.125f, 0, -0.5f, -0.75f, 0, -0.5f, -0.5f, 0, 0, -0.625f, 0, 0, -0.125f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.625f, -0.5f, 0)
			.setRotationPoint(-66.3125f, -25.75f, 6).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 91, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(58.6875f, -22.5f, 4.25f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 11, 208, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-82.3125f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 459, 206, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-69.5625f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 58, 206, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-44.3125f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 160, 205, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-56.3125f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 497, 204, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-32.3125f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 479, 204, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(27.1875f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 453, 204, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(40.1875f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 189, 204, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(27.1875f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 204, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(40.1875f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 266, 203, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(52.1875f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 501, 174, textureX, textureY)
			.addShapeBox(1, 0, 0, 4, 1, 1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-52.3125f, -7.25f, 11).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 468, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 2, 0, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.4375f, -29.3f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1081cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 389, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 5, 1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.9375f, -28.3f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 311, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, -2, -1, 0, -2, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.9375f, -29.3f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 232, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 5, 2, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.4375f, -28.3f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1084cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 83, textureX, textureY).addBox(0, 0, 0, 18, 4, 9)
			.setRotationPoint(7.4375f, -28.3f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1085cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 419, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 9, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.4375f, -29.3f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1086cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 468, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 5, 2, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(7.4375f, -28.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1093cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 232, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(7.4375f, -29.3f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1094cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 315, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 5, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(8.9375f, -28.3f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1095cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 479, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0)
			.setRotationPoint(8.9375f, -29.3f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1096cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 150, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(20.4375f, -24.2f, 7.2f).setRotationAngle(0, 0, 0).setName("Box 335cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 145, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(14.4375f, -24.2f, 7.2f).setRotationAngle(0, 0, 0).setName("Box 339cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 140, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(11.4375f, -24.2f, 7.2f).setRotationAngle(0, 0, 0).setName("Box 340cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 135, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(17.4375f, -24.2f, 7.2f).setRotationAngle(0, 0, 0).setName("Box 341cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.2f, -0.25f, -0.25f, -0.19999999f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(20.4375f, -25, 6.75f).setRotationAngle(0, 0, 0).setName("Box 362cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 125, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.2f, -0.25f, -0.25f, -0.4f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(14.4375f, -25, 6.75f).setRotationAngle(0, 0, 0).setName("Box 363cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 120, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.2f, -0.25f, -0.25f, -0.19999999f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(17.4375f, -25, 6.75f).setRotationAngle(0, 0, 0).setName("Box 364cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 115, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, -0.2f, -0.25f, -0.25f, -0.19999999f, -0.25f, -0.25f, 0.4f, -0.75f, -0.25f, 0.4f, -0.75f, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f)
			.setRotationPoint(11.4375f, -25, 6.75f).setRotationAngle(0, 0, 0).setName("Box 365cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 110, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(11.4375f, -22, 9.5f).setRotationAngle(0, 0, 0).setName("Box 366cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 105, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(20.4375f, -22, 9.5f).setRotationAngle(0, 0, 0).setName("Box 368cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 100, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(14.4375f, -22, 9.5f).setRotationAngle(0, 0, 0).setName("Box 369cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 61, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
			.setRotationPoint(17.4375f, -22, 9.5f).setRotationAngle(0, 0, 0).setName("Box 370cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0.55f, 0.25f, 0, 0.55f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.2f, 0.25f, 0, -1.2f, 0.25f)
			.setRotationPoint(-84.7125f, -27.4f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1026cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 382, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 3, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(-84.7125f, -28.099998f, -4).setRotationAngle(0, 0, 0).setName("Box 1027cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 211, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 3, 0, 0, 0.55f, 0.25f, 0, 0.54999995f, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -1.2f, 0.25f, 0, -1.2f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.7125f, -27.4f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 980cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 489, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.7125f, -28.099998f, 1).setRotationAngle(0, 0, 0).setName("Box 981cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 231, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 2, 0, 0, -0.15f, -0.45f, 0, -0.15f, -0.45f, 0, -0.15f, -0.05f, 0, -0.15f, -0.05f, 0, -0.5f, -0.45f, 0, -0.5f, -0.45f, 0, -0.5f, -0.05f, 0, -0.5f, -0.05f)
			.setRotationPoint(-84.7125f, -28.25f, -1.2f).setRotationAngle(0, 0, 0).setName("Box 1975cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 415, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 2, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f)
			.setRotationPoint(-79.7125f, -28.099998f, -3).setRotationAngle(0, 0, 0).setName("Box 1027cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 415, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, 0.25f, 0, -0.65f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-79.7125f, -28.099998f, 1).setRotationAngle(0, 0, 0).setName("Box 981cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 56, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(11.6875f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 51, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(14.6875f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 46, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(17.6875f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 41, 304, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(20.6875f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 231, 185, textureX, textureY).addBox(0, 0, 0, 4, 4, 2)
			.setRotationPoint(-65.3125f, -29, -1).setRotationAngle(0, 0, 0).setName("Box 326cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 424, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 1, 0, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.3125f, -29, 1).setRotationAngle(0, 0, 0).setName("Box 326cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 186, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0)
			.setRotationPoint(-64.3125f, -29, -2).setRotationAngle(0, 0, 0).setName("Box 326cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 471, 299, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(20.4375f, -24.2f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 335cp")
		);
		groups.add(Boiler_Area);
	}

	private final void initGroup_Boiler_Area1(){
		TurboList Boiler_Area = new TurboList("Boiler_Area");
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 466, 299, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(14.4375f, -24.2f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 339cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 461, 299, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(11.4375f, -24.2f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 340cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 46, 299, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(17.4375f, -24.2f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 341cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 36, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(20.4375f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 362cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 435, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.4f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(14.4375f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 363cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 430, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(17.4375f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 364cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 379, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(11.4375f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 365cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 374, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(11.4375f, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Box 366cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 369, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(20.4375f, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Box 368cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 364, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(14.4375f, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Box 369cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 359, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(17.4375f, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Box 370cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 354, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-20.3125f, -18, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 349, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17.3125f, -18, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 344, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.3125f, -18, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 339, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-11.3125f, -18, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 334, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(11.6875f, -18, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 329, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.6875f, -18, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 324, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.6875f, -18, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 242, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(20.6875f, -18, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 41, 299, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-11.5625f, -24.2f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 335cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 36, 299, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-17.5625f, -24.2f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 339cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 100, 298, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-20.5625f, -24.2f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 340cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.25f, 0, 0.1f, 0.25f, 0, 0.1f, 1.25f, 0, 0.1f, 1.25f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-14.5625f, -24.2f, -8.2f).setRotationAngle(0, 0, 0).setName("Box 341cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 237, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(-11.5625f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 362cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 232, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.4f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(-17.5625f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 363cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 227, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(-14.5625f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 364cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 222, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(-20.5625f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 365cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 217, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(-20.5625f, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Box 366cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 25, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(-11.5625f, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Box 368cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 20, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(-17.5625f, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Box 369cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 108, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(-14.5625f, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Box 370cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 15, 302, textureX, textureY).addCylinder(0, 0, 0, 1, 28, 8, 1, 1, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(-63.0625f, -25.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 55, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-85.5625f, -21.75f, -10.7f).setRotationAngle(0, 0, 0).setName("Box 2026cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 54, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0.25f, 0, -0.75f)
			.setRotationPoint(-30.8125f, -21.75f, -10.95f).setRotationAngle(0, 0, 0).setName("Box 2026cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.2f, -0.7f, 0, 0.19999999f, -0.7f, 0, 0.2f, 1.4f, -0.5f, 0.2f, 1.4f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, 1.2f, -0.5f, -0.7f, 1.2f)
			.setRotationPoint(-31.662498f, -20.65f, -11.8f).setRotationAngle(0, 0, 0).setName("Box 2031cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 99, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.2f, -0.7f, 0, 0.19999999f, -0.7f, 0, 0.2f, 1.4f, -0.5f, 0.2f, 1.4f, -0.5f, -0.7f, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, 1.2f, -0.5f, -0.7f, 1.2f)
			.setRotationPoint(-31.412498f, -21.65f, -10.8f).setRotationAngle(0, 0, 0).setName("Box 2031cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 504, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(-81.3125f, -23.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 365cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 494, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(-81.3125f, -20.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 366cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 10, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.3125f, -18.375f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 225, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0.4f, -0.75f, -0.25f, 0.39999998f, -0.75f, -0.25f, -0.1375f, -0.25f, -0.25f, -0.1375f, -0.25f, -0.25f, 0, 2.5f, -0.25f, 0, 2.5f, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(-26.5625f, -25.375f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 365cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 324, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
			.setRotationPoint(-26.5625f, -22.375f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 366cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 254, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 41, 1, 1, 0, -0.625f, 0, 0, -0.5f, 0, 0, -0.75f, 0, -0.5f, -0.125f, 0, -0.5f, -0.625f, -0.5f, 0, -0.5f, -0.5f, 0, -0.75f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-66.3125f, -25.75f, -7).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 5, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -1.25f, -0.5f, -0.75f, -1.25f, -0.5f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
			.setRotationPoint(-66.1875f, -27, -3.25f).setRotationAngle(-90, 0, 0).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 302, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0.75f, -0.5f, -0.75f, 0.75f, -0.5f, -0.75f, -1.25f, 0, -0.75f, -1.25f)
			.setRotationPoint(-66.1875f, -26.25f, 5.5f).setRotationAngle(-90, 0, 0).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 212, 300, textureX, textureY).addCylinder(2.25f, -1, -1, 1, 4, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-56.3125f, -27.5f, 1.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 291, 296, textureX, textureY).addCylinder(2.25f, -1, -1, 1, 4, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-56.3125f, -27.5f, -0.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 286, 296, textureX, textureY).addCylinder(2.25f, -1, -1, 1, 4, 8, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.8125, 0.0))
			.setRotationPoint(-54.8125f, -27.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 257, 203, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-4.5625f, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 65, 203, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(11, -23.25f, 9.5f).setRotationAngle(45, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 203, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-82.3125f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 203, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-69.5625f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 11, 203, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-44.3125f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 240, 202, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-56.3125f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 231, 202, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-32.3125f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 503, 201, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(-4.5625f, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 485, 201, textureX, textureY)
			.addShapeBox(0, -0.5f, -2.6875f, 1, 1, 3, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(11, -23.25f, -9.5f).setRotationAngle(135, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 348, 202, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 7, 0.125f, 0.625f, 4, null)
			.setRotationPoint(-50.4375f, 3.25f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 207, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-51.1875f, -3, -10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 373, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 45, 1, 1, 0, -0.125f, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.5625f, -0.125f, -0.0625f, -0.5625f, -0.125f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f)
			.setRotationPoint(-48.3125f, -12.75f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 373, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 52, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-43.3125f, -11.5f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 65, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 1, 1, 0, 0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0.375f, -0.5f, -0.5f)
			.setRotationPoint(-81.3125f, -14.75f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 163, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -1.25f, 0, -0.375f, -1.25f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.375f, 0.75f, 0, -0.375f, 0.75f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-50.8125f, -14.75f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 497, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.0625f, -0.375f, -1.0625f, -0.0625f, -0.375f, -1.0625f, -0.5625f, 0, 0, -0.5625f, 0, -0.625f, -0.0625f, -0.375f, 0.4375f, -0.0625f, -0.375f, 0.4375f, -0.5625f, 0, -0.625f, -0.5625f)
			.setRotationPoint(-50.8125f, -13.75f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 184, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, -0.0625f, -0.0625f, -0.0625f, -0.5f, -0.0625f, -0.0625f, -0.5f, -0.0625f, -0.5625f, -0.0625f, -0.0625f, -0.5625f, -0.0625f, -0.5625f, -0.0625f, -0.5f, -0.5625f, -0.0625f, -0.5f, -0.5625f, -0.5625f, -0.0625f, -0.5625f, -0.5625f)
			.setRotationPoint(-79.3125f, -13.8125f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 202, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.0625f, -0.5f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.5f, -0.5625f, -0.0625f, 0.125f, -0.0625f, -0.5625f, -0.25f, -0.0625f, -0.5625f, -0.25f, -0.5625f, -0.0625f, 0.125f, -0.5625f)
			.setRotationPoint(-79.6875f, -13.75f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 356, 132, textureX, textureY)
			.addShapeBox(-3, 0, 0, 12, 1, 1, 0, 0, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f)
			.setRotationPoint(-88.1875f, -7.0625f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 79, 300, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-0.3125f, -13.5f, -5.5f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 74, 300, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, -0.0625f, 0.5f, -0.0625f, -0.5625f, 0.5f, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, 0, -0.5625f, -0.0625f, -0.9375f, -0.0625f, -0.5625f, -0.9375f, -0.0625f, -0.5625f, -0.5625f, -0.5625f, -0.0625f, -0.5625f, -0.5625f)
			.setRotationPoint(-3.3125f, -12.75f, -5.5f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 69, 300, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 8, 1, 1, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(-18.5625f, -5, -9).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0.375f, -0.5f, -0.5f)
			.setRotationPoint(-12.1875f, -8.75f, -9).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 31, 299, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-7.1875f, -8.75f, -2.5f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 95, 298, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(8.1875f, -18.25f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 351, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(8.5625f, -18.25f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 90, 298, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(23.5625f, -18.25f, -5.5f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 246, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.375f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.375f, -0.5625f, -0.0625f, 0.1875f, -0.0625f, -0.5625f, -0.125f, -0.0625f, -0.5625f, -0.125f, -0.5625f, -0.0625f, 0.1875f, -0.5625f)
			.setRotationPoint(-91.625f, -7, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 85, 298, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, 0, -1, 0)
			.setRotationPoint(-92.9375f, -8, -4.75f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 281, 296, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, -0.0625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0.5f, -0.0625f, -0.0625f, 0.5f, -0.0625f, -0.0625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.875f, -0.0625f, -0.0625f, -0.875f, -0.0625f)
			.setRotationPoint(-91, -5.25f, -5.5f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 130, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-80.3125f, -5.5f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 84, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, -0.125f, 0, 0, -0.25f, 6, 0, -0.25f, 6, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.25f, -6.5f, 0, -0.25f, -6.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-50.9375f, -5.5f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 460, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.125f, 0, 0, -0.25f, 2.5f, 0, -0.25f, 2.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.25f, -3, 0, -0.25f, -3, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-84.9375f, -3, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 409, 96, textureX, textureY)
			.addShapeBox(-3, 0, 0, 11, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-92.3125f, -3, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 276, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-96.1875f, -3, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 286, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 45, 1, 1, 0, -0.125f, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.5625f, -0.125f, -0.0625f, -0.5625f, -0.125f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f)
			.setRotationPoint(-48.3125f, -12.25f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 271, 296, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, -0.0625f, 0.5f, -0.0625f, -0.5625f, 0.5f, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, 0, -0.5625f, -0.0625f, -0.9375f, -0.0625f, -0.5625f, -0.9375f, -0.0625f, -0.5625f, -0.5625f, -0.5625f, -0.0625f, -0.5625f, -0.5625f)
			.setRotationPoint(-3.3125f, -12.25f, -5.5f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 479, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.0625f, -0.375f, -1.0625f, -0.0625f, -0.375f, -1.0625f, -0.5625f, 0, 0, -0.5625f, 0, -0.625f, -0.0625f, -0.375f, 0.4375f, -0.0625f, -0.375f, 0.4375f, -0.5625f, 0, -0.625f, -0.5625f)
			.setRotationPoint(-50.8125f, -13.25f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 121, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, -0.0625f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5625f, -0.0625f, -0.0625f, -0.5625f, -0.0625f, -0.5625f, -0.0625f, 0, -0.5625f, -0.0625f, 0, -0.5625f, -0.5625f, -0.0625f, -0.5625f, -0.5625f)
			.setRotationPoint(-78.8125f, -13.3125f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 451, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.0625f, -0.5f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.5f, -0.5625f, -0.0625f, 0.125f, -0.0625f, -0.5625f, -0.25f, -0.0625f, -0.5625f, -0.25f, -0.5625f, -0.0625f, 0.125f, -0.5625f)
			.setRotationPoint(-79.1875f, -13.25f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 130, textureX, textureY)
			.addShapeBox(-3, 0, 0, 12, 1, 1, 0, 0, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f)
			.setRotationPoint(-87.6875f, -6.5625f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 70, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, -0.875f, -0.0625f, -0.5625f, -0.5f, -0.0625f, -0.5625f, -0.5f, -0.5625f, -0.0625f, -0.875f, -0.5625f, -0.0625f, 0.1875f, -0.0625f, -0.5625f, -0.125f, -0.0625f, -0.5625f, -0.125f, -0.5625f, -0.0625f, 0.1875f, -0.5625f)
			.setRotationPoint(-91.125f, -7, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 266, 296, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, -0.0625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0.5f, -0.0625f, -0.0625f, 0.5f, -0.0625f, -0.0625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.875f, -0.0625f, -0.0625f, -0.875f, -0.0625f)
			.setRotationPoint(-90.5f, -5.25f, -5.5f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 94, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.375f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.375f, -0.5625f, -0.0625f, 0.1875f, -0.0625f, -0.5625f, -0.125f, -0.0625f, -0.5625f, -0.125f, -0.5625f, -0.0625f, 0.1875f, -0.5625f)
			.setRotationPoint(-90.625f, -6, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 261, 295, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 8, 1, 0, -0.0625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0.5f, -0.0625f, -0.0625f, 0.5f, -0.0625f, -0.0625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.875f, -0.0625f, -0.0625f, -0.875f, -0.0625f)
			.setRotationPoint(-90, -5.25f, -5.5f).setRotationAngle(-90, 0, 90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 446, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.0625f, -0.5f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.5f, -0.5625f, -0.0625f, 0.125f, -0.0625f, -0.5625f, -0.25f, -0.0625f, -0.5625f, -0.25f, -0.5625f, -0.0625f, 0.125f, -0.5625f)
			.setRotationPoint(-78.6875f, -12.75f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 356, 129, textureX, textureY)
			.addShapeBox(-3, 0, 0, 12, 1, 1, 0, 0, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.0625f, -0.4375f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f)
			.setRotationPoint(-87.1875f, -6.0625f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 192, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.0625f, -0.375f, -1.0625f, -0.0625f, -0.375f, -1.0625f, -0.5625f, 0, 0, -0.5625f, 0, -0.625f, -0.0625f, -0.375f, 0.4375f, -0.0625f, -0.375f, 0.4375f, -0.5625f, 0, -0.625f, -0.5625f)
			.setRotationPoint(-50.8125f, -12.75f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, -0.5625f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5625f, -0.5625f, -0.0625f, -0.5625f, -0.5625f, -0.5625f, -0.0625f, 0, -0.5625f, -0.0625f, 0, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f)
			.setRotationPoint(-78.8125f, -12.8125f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 241, 294, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 3, 1, 0, -0.0625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0.5f, -0.0625f, -0.0625f, 0.5f, -0.0625f, -0.0625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.5625f, -0.875f, -0.0625f, -0.0625f, -0.875f, -0.0625f)
			.setRotationPoint(-48.75f, -11.25f, -10.5f).setRotationAngle(-90, 0, -90).setName("Box 1440cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 236, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-13.0625f, -8.75f, -9).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 183, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(-48.3125f, -13.5f, -12).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 91, 200, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 7, 0.125f, 0.625f, 4, null)
			.setRotationPoint(-95.4375f, 3.25f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 271, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, -0.5f, -0.35f, 0, -0.5f, -0.35f, 0, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f)
			.setRotationPoint(-102.3125f, -16.5f, 12.25f).setRotationAngle(0, 0, 0).setName("Box 2006")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 232, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-103.8125f, -22, 12.25f).setRotationAngle(0, 0, 0).setName("Box 1011")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 232, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-103.8125f, -22, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1011")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 76, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 25, 0, -0.5f, 0, -1.75f, 0, 0, -1.75f, 0, 0, -1.75f, -0.5f, 0, -1.75f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-85.3125f, -25, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1960cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 103, 287, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.5f, 0, -3.25f, 0, 0, -3.25f, 0, 0, -3.25f, -0.5f, 0, -3.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f)
			.setRotationPoint(-85.3125f, -28, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1962cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 53, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.75f, -0.5f, 0, -0.75f)
			.setRotationPoint(-85.3125f, -26, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1966cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 36, 287, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 2, 0, 0, 2, 0, 0, 2.25f, -0.5f, 0, 2.25f)
			.setRotationPoint(-85.3125f, -27, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1967cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 284, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 22, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, 1, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 1, 0, 0)
			.setRotationPoint(-86.3125f, -23, -11).setRotationAngle(0, 0, 0).setName("Box 972cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 179, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5625f, 0, 0, -1.125f, 0, 0, -1.0625f, 0, -0.5f, 0.5625f, 0, -0.5f)
			.setRotationPoint(-85.3125f, -23, -12.5f).setRotationAngle(0, 0, 0).setName("Box 972cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 163, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0.5625f, 0, -0.5f, -1.0625f, 0, -0.5f, -1.125f, 0, 0, 0.5625f, 0, 0)
			.setRotationPoint(-85.3125f, -23, 10.5f).setRotationAngle(0, 0, 0).setName("Box 972cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 471, 244, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(10, 0).setLength(4).setSegments(24, 0).setScale(0.9625f, 0.9625f).setDirection(2)
			.setTopOffset(new Vec3f(-0.1875, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, -9.0, 0.0)).build()
			.setRotationPoint(-88.3125f, -16, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 220, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, 0, 0, -0.35f, 0, 0, -0.35f, -0.5f, 0, -0.35f)
			.setRotationPoint(-97.8125f, -20.5f, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1995cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.5f, -0.25f, -0.4f, 0, -0.25f, -0.4f, 0, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f)
			.setRotationPoint(-103.3125f, -19.1f, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1996cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 441, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f)
			.setRotationPoint(-100.0625f, -21.25f, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1997cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 436, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.6f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.1f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f, -0.1f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f)
			.setRotationPoint(-95.5625f, -21.25f, -13.25f).setRotationAngle(0, 0, 0).setName("Box 1998cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 476, 286, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 15, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.7125f, -25, -7.75f).setRotationAngle(0, 0, 0).setName("Box 1085cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 26, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-93.7375f, -25.49f, -8.615f).setRotationAngle(0, 0, 0).setName("Box 1938cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 21, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-90.0125f, -11, -12.08f).setRotationAngle(0, 0, 0).setName("Box 1943cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 46, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.0225f, -10.5f, -12.09f).setRotationAngle(0, 0, 0).setName("Box 1951cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 16, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.05f, -0.5f, -0.5f, -0.05f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-90.5125f, -9.5f, -12.09f).setRotationAngle(0, 0, 0).setName("Box 1952cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 352, 293, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(-89.6875f, -14.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 347, 293, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 0.9375f, 0.9375f, 4, null)
			.setRotationPoint(-90.6875f, -15.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 342, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-89.9375f, -13.6f, -8.0625f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 431, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-90.9375f, -14.6f, -5.8125f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 293, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.9375f, 4, null)
			.setRotationPoint(-89.6875f, -9.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 478, 292, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.9375f, 4, null)
			.setRotationPoint(-90.6875f, -9.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 148, 213, textureX, textureY).addBox(0, 0, 0, 3, 2, 10)
			.setRotationPoint(-89.3125f, -23, -5).setRotationAngle(0, 0, 0).setName("Box 1963cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 323, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.3125f, -13, 6).setRotationAngle(0, 0, 0).setName("Box 1956cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 323, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-90.3125f, -10, 6).setRotationAngle(0, 0, 0).setName("Box 1956cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 59, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.3125f, -17, 10).setRotationAngle(0, 0, 0).setName("Box 1956cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 405, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.3125f, -17, 8).setRotationAngle(0, 0, 0).setName("Box 1956cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 390, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.3125f, -19, 9).setRotationAngle(0, 0, 0).setName("Box 1956cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 195, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.3125f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 1956cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 68, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.3125f, -18, -8).setRotationAngle(0, 0, 0).setName("Box 1956cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-99.8125f, -16.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 2015cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 8, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-99.8125f, -16.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2015cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 384, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-98.8125f, -11.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 2014cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 158, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-99.8125f, -12.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 2015cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 20, 254, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -22, -2.1875f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -22, -2.1875f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 355, 253, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.759995f, -22, -4.875f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 467, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.75f, -22, -4.875f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 419, 248, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -22.9375f, 1.5625f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 450, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -22.9375f, 1.5625f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 124, 248, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -22.1875f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 290, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -22.1875f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 248, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -17.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 283, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -17.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 439, 247, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-90.822495f, -12.75f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 264, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-90.8125f, -12.75f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 400, 247, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-90.822495f, -12.5f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 257, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-90.8125f, -12.5f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 413, 246, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-90.822495f, -11.5f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 113, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-90.8125f, -11.5f, 6.25f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 98, 244, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-90.822495f, -11.25f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-90.8125f, -11.25f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 78, 244, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.322495f, -19.5f, 7).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 35, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.3125f, -19.5f, 7).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 277, 242, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -18.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 400, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -18.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 46, 242, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -17.75f, 7).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 385, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -17.75f, 7).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 426, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.0625f, -0.875f, -0.5625f, -0.5625f, -0.875f, -0.5625f, -0.5625f, -0.5f, -0.0625f, -0.0625f, -0.5f, -0.0625f, -0.0625f, -0.5f, -0.5625f, -0.5625f, -0.5f, -0.5625f, -0.5625f, -0.125f, -0.0625f, -0.0625f, -0.125f, -0.0625f)
			.setRotationPoint(-102.6875f, -15.75f, -14.3125f).setRotationAngle(0, 0, 0).setName("Box 1459cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 499, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.0625f, -0.5f, -0.0625f, -0.5625f, -0.5f, -0.0625f, -0.5625f, -0.875f, -0.5625f, -0.0625f, -0.875f, -0.5625f, -0.0625f, -0.125f, -0.0625f, -0.5625f, -0.125f, -0.0625f, -0.5625f, -0.5f, -0.5625f, -0.0625f, -0.5f, -0.5625f)
			.setRotationPoint(-102.6875f, -15.75f, 13.3125f).setRotationAngle(0, 0, 0).setName("Box 1459cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 461, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, -0.625f, -0.5625f, -0.5625f, -0.625f, -0.5625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.625f, -0.5625f, -0.0625f, -0.625f)
			.setRotationPoint(-103.1875f, -9.8125f, 13).setRotationAngle(0, 0, 0).setName("Box 1461cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 225, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, -0.625f, -0.5625f, -0.5625f, -0.625f, -0.5625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.625f, -0.5625f, -0.0625f, -0.625f)
			.setRotationPoint(-103.1875f, -15.8125f, 13).setRotationAngle(0, 0, 0).setName("Box 1462cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 80, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.5625f, -0.0625f, 0, -0.5625f, -0.0625f, 0, -0.5625f, -0.5625f, -0.625f, -0.5625f, -0.5625f, -0.625f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5625f, -0.625f, -0.0625f, -0.5625f)
			.setRotationPoint(-104.8125f, -15.8125f, 11.3125f).setRotationAngle(0, 0, 0).setName("Box 1462cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 75, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.5625f, -0.0625f, 0, -0.5625f, -0.0625f, 0, -0.5625f, -0.5625f, -0.625f, -0.5625f, -0.5625f, -0.625f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5625f, -0.625f, -0.0625f, -0.5625f)
			.setRotationPoint(-104.8125f, -9.8125f, 11.3125f).setRotationAngle(0, 0, 0).setName("Box 1462cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 486, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.0625f, -0.875f, -0.0625f, -0.5625f, -0.5f, -0.0625f, -0.5625f, -0.5f, -0.5625f, -0.0625f, -0.875f, -0.5625f, -0.0625f, -0.5f, -0.0625f, -0.5625f, -0.125f, -0.0625f, -0.5625f, -0.125f, -0.5625f, -0.0625f, -0.5f, -0.5625f)
			.setRotationPoint(-104.625f, -15.75f, 11.3125f).setRotationAngle(0, 0, 0).setName("Box 1459cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 70, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.625f, -0.5625f, -0.0625f, -0.625f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.0625f, -0.0625f, -0.625f, -0.0625f, -0.0625f)
			.setRotationPoint(-104.8125f, -15.8125f, -12.3125f).setRotationAngle(0, 0, 0).setName("Box 1462cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 284, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.0625f, -0.625f, -0.5625f, -0.0625f, -0.625f, -0.0625f, -0.5625f, 0, -0.0625f, -0.5625f, 0, -0.0625f, -0.0625f, -0.625f, -0.0625f, -0.0625f)
			.setRotationPoint(-104.8125f, -9.8125f, -12.3125f).setRotationAngle(0, 0, 0).setName("Box 1462cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 113, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.0625f, -0.875f, -0.5625f, -0.5625f, -0.5f, -0.5625f, -0.5625f, -0.5f, -0.0625f, -0.0625f, -0.875f, -0.0625f, -0.0625f, -0.5f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.0625f, -0.0625f, -0.5f, -0.0625f)
			.setRotationPoint(-104.625f, -15.75f, -12.3125f).setRotationAngle(0, 0, 0).setName("Box 1459cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 54, 291, textureX, textureY).addCylinder(0, -2.3125f, 0, 1, 1, 6, 0.375f, 0.375f, 5, new Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 109, 289, textureX, textureY).addCylinder(0, -3.5625f, 0, 1, 1, 6, 0.375f, 0.28333333f, 5, new Vec3f(0.0, 0.9375, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 104, 289, textureX, textureY).addCylinder(0, -3.625f, 0, 1, 1, 6, 0.28333333f, 0.15625f, 5, new Vec3f(0.0, 0.859375, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 99, 289, textureX, textureY).addCylinder(0, -3.765625f, 0, 1, 1, 6, 0.15625f, 0.09875f, 5, new Vec3f(0.0, 0.921875, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 94, 289, textureX, textureY).addCylinder(0, -3.84375f, 0, 1, 1, 6, 0.09875f, 0.16125f, 5, new Vec3f(0.0, 0.921875, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 483, 288, textureX, textureY).addCylinder(0, -3.921875f, 0, 1, 1, 6, 0.16125f, 0.13f, 5, new Vec3f(0.0, 0.921875, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 478, 288, textureX, textureY).addCylinder(0, -4, 0, 1, 1, 6, 0.13f, 0.13f, 5, new Vec3f(0.0, 0.890625, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 461, 288, textureX, textureY).addCylinder(0, -4.109375f, 0, 1, 1, 6, 0.13f, 0.09375f, 5, new Vec3f(0.0, 0.96875, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 225, 288, textureX, textureY).addCylinder(0, -4.140625f, 0, 1, 1, 6, 0.09375f, 0, 5, new Vec3f(0.0, 0.953125, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 463, 282, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(6, 0).setScale(0.375f, 0.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.71875, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 35.0)).build()
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 458, 282, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 1, 0, -0.15625f, -0.03125f, 0, -0.15625f, -0.03125f, 0, -0.15625f, -0.03125f, 0.015625f, -0.15625f, -0.03125f, 0.015625f, -0.15625f, 0, 0, -0.15625f, 0, 0, -0.15625f, 0, 0.015625f, -0.15625f, 0, 0.015625f)
			.setRotationPoint(43.03125f, -24.0625f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 59, 200, textureX, textureY)
			.addShapeBox(0.61f, 0, 0, 0, 1, 4, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(58.487503f, -27, -4.25f).setRotationAngle(0, 47, 0).setName("Box 738cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 451, 130, textureX, textureY)
			.addShapeBox(-0.61f, 0, 0, 0, 1, 4, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(58.487503f, -27, 4.25f).setRotationAngle(0, 133, 0).setName("Box 739cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 376, 199, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.625f).setLength(3).setSegments(10, 0).setScale(1.1875f, 1.1875f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(42.9375f, -29.0001f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 440, 198, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.625f).setLength(3).setSegments(10, 0).setScale(1.1875f, 1.1875f).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.3125f, -29, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 403, 46, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5429688f).setLength(1).setSegments(10, 5).setScale(1.25f, 1.25f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.625, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(47.3125f, -29.375f, 0).setRotationAngle(0, 180, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 40, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5429688f).setLength(1).setSegments(10, 5).setScale(1.25f, 1.25f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.625, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(42.9375f, -29.375f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 474, 223, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 2, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(7.4375f, -19, 9.8125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 457, 223, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 2, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(5.9375f, -19, 9.8125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 117, 197, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 2, 0, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f)
			.setRotationPoint(6.1875f, -19.125f, 9.8125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 299, 223, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 2, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(5.4375f, -17, 9.9375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 273, 223, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 2, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f)
			.setRotationPoint(3.9375f, -17, 9.9375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 65, 194, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 2, 0, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f)
			.setRotationPoint(4.1875f, -17.125f, 9.9375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 120, 223, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 2, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, 0.15625f, -0.28125f)
			.setRotationPoint(7.4375f, -19, -11.8125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 42, 223, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 2, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, 0.15625f, -0.28125f)
			.setRotationPoint(5.9375f, -19, -11.8125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 289, 190, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 2, 0, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f)
			.setRotationPoint(6.1875f, -19.125f, -11.8125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 42, 216, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 2, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, 0.15625f, -0.28125f)
			.setRotationPoint(5.4375f, -17, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 238, 215, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 2, 0, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, -0.34375f, -0.28125f, -0.34375f, 0.15625f, -0.28125f, -0.34375f, 0.15625f, -0.28125f)
			.setRotationPoint(3.9375f, -17, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 91, 188, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 2, 0, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f, -0.40625f, -0.46875f, -0.28125f)
			.setRotationPoint(4.1875f, -17.125f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 378, 269, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(11, 0).setLength(2).setSegments(24, 4).setScale(0.96875f, 0.9609375f).setDirection(2)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-65.625f, -16, 0).setRotationAngle(90, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 333, 268, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(11, 0).setLength(2).setSegments(24, 5).setScale(0.96875f, 0.9609375f).setDirection(2)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-65.625f, -16, 0).setRotationAngle(210, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 203, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.17578125f, -0.03125f, -0.34375f, -0.17578125f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.734375f, -0.03125f, -0.34375f, -0.734375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f)
			.setRotationPoint(-65.59375f, -25.625f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 198, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.59375f, -0.02734375f, 0.21875f, 0.90625f, -0.02734375f, 0.21875f, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, -1.59375f, -0.890625f, 0.21875f, 0.90625f, -0.890625f, 0.21875f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f)
			.setRotationPoint(-65.59375f, -26.015625f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 193, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.59375f, -0.37109375f, -0.53125f, -0.09375f, -0.37109375f, -0.53125f, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.55859375f, -0.03125f, -0.59375f, -0.53125f, -0.53125f, -0.09375f, -0.53125f, -0.53125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f)
			.setRotationPoint(-64.34375f, -26.546875f, 2.1875f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 188, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.44921875f, -0.234375f, -0.34375f, -0.44921875f, -0.234375f, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.453125f, -0.234375f, -0.34375f, -0.453125f, -0.234375f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f)
			.setRotationPoint(-64.09375f, -26.734375f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 183, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.17578125f, -0.03125f, -0.34375f, -0.17578125f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.734375f, -0.03125f, -0.34375f, -0.734375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f)
			.setRotationPoint(-64.65625f, -25.679688f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 178, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.59375f, -0.02734375f, 0.21875f, 0.90625f, -0.02734375f, 0.21875f, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, -1.59375f, -0.890625f, 0.21875f, 0.90625f, -0.890625f, 0.21875f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f)
			.setRotationPoint(-64.65625f, -26.070312f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 122, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.59375f, -0.37109375f, -0.53125f, -0.09375f, -0.37109375f, -0.53125f, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.55859375f, -0.03125f, -0.59375f, -0.53125f, -0.53125f, -0.09375f, -0.53125f, -0.53125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f)
			.setRotationPoint(-63.40625f, -26.601562f, 2.1875f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 82, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.44921875f, -0.234375f, -0.34375f, -0.44921875f, -0.234375f, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.453125f, -0.234375f, -0.34375f, -0.453125f, -0.234375f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f)
			.setRotationPoint(-63.15625f, -26.789062f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 61, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.17578125f, -0.03125f, -0.34375f, -0.17578125f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.734375f, -0.03125f, -0.34375f, -0.734375f, -0.03125f)
			.setRotationPoint(-65.53125f, -25.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 56, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, 0.90625f, -0.02734375f, 0.21875f, -1.59375f, -0.02734375f, 0.21875f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, 0.90625f, -0.890625f, 0.21875f, -1.59375f, -0.890625f, 0.21875f)
			.setRotationPoint(-65.53125f, -26.015625f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 51, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.55859375f, -0.03125f, -0.09375f, -0.37109375f, -0.53125f, -0.59375f, -0.37109375f, -0.53125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.09375f, -0.53125f, -0.53125f, -0.59375f, -0.53125f, -0.53125f)
			.setRotationPoint(-64.28125f, -26.546875f, -3.1875f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 248, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.44921875f, -0.234375f, -0.34375f, -0.44921875f, -0.234375f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.453125f, -0.234375f, -0.34375f, -0.453125f, -0.234375f)
			.setRotationPoint(-64.03125f, -26.734375f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 243, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.17578125f, -0.03125f, -0.34375f, -0.17578125f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.734375f, -0.03125f, -0.34375f, -0.734375f, -0.03125f)
			.setRotationPoint(-64.65625f, -25.679688f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 238, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.56640625f, -0.03125f, -0.34375f, -0.56640625f, -0.03125f, 0.90625f, -0.02734375f, 0.21875f, -1.59375f, -0.02734375f, 0.21875f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, 0.90625f, -0.890625f, 0.21875f, -1.59375f, -0.890625f, 0.21875f)
			.setRotationPoint(-64.65625f, -26.070312f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 233, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.55859375f, -0.03125f, -0.09375f, -0.37109375f, -0.53125f, -0.59375f, -0.37109375f, -0.53125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.09375f, -0.53125f, -0.53125f, -0.59375f, -0.53125f, -0.53125f)
			.setRotationPoint(-63.40625f, -26.601562f, -3.1875f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 228, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.55859375f, -0.03125f, -0.34375f, -0.44921875f, -0.234375f, -0.34375f, -0.44921875f, -0.234375f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.34375f, -0.03125f, -0.34375f, -0.453125f, -0.234375f, -0.34375f, -0.453125f, -0.234375f)
			.setRotationPoint(-63.15625f, -26.789062f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 192, 195, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0).setLength(1).setSegments(8, 1).setScale(0.875f, 0.875f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-62.0625f, -24.75f, 5.625f).setRotationAngle(91, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 91, 194, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0).setLength(1).setSegments(8, 1).setScale(0.875f, 0.875f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-62.0625f, -24.75f, -5.625f).setRotationAngle(-46, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 376, 193, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0).setLength(1).setSegments(8, 1).setScale(0.875f, 0.875f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-36.0625f, -24.75f, 5.625f).setRotationAngle(91, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 440, 192, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0).setLength(1).setSegments(8, 1).setScale(0.875f, 0.875f).setDirection(3)
			.setTopOffset(new Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-36.0625f, -24.75f, -5.625f).setRotationAngle(-46, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 201, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.265625f, 0, 0, -0.265625f, 0, 0, -0.265625f, 0, -0.5f, -0.265625f, 0, -0.5f, -0.265625f, -0.25f, 0, -0.265625f, -0.25f, 0, -0.265625f, -0.25f, -0.5f, -0.265625f, -0.25f, -0.5f)
			.setRotationPoint(-65.640625f, -16, 10.0625f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 183, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.265625f, 0, 0, -0.265625f, 0, 0, -0.265625f, 0, -0.5f, -0.265625f, 0, -0.5f, -0.265625f, -0.25f, 0, -0.265625f, -0.25f, 0, -0.265625f, -0.25f, -0.5f, -0.265625f, -0.25f, -0.5f)
			.setRotationPoint(-64.609375f, -16, 10.0625f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 220, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.265625f, 0, 0, -0.265625f, 0, 0, -0.265625f, 0, -0.5f, -0.265625f, 0, -0.5f, -0.265625f, 0.5f, 0, -0.265625f, 0, 0, -0.265625f, 0, -0.5f, -0.265625f, 0.5f, -0.5f)
			.setRotationPoint(-65.640625f, -15.3125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 187, 287, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.265625f, 0, 0, -0.265625f, 0, 0, -0.265625f, 0, -0.5f, -0.265625f, 0, -0.5f, -0.265625f, 0, 0, -0.265625f, 0.5f, 0, -0.265625f, 0.5f, -0.5f, -0.265625f, 0, -0.5f)
			.setRotationPoint(-64.609375f, -15.3125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 351, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.265625f, 0, 0.1875f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -0.265625f, -0.5f, 0, -0.265625f, 0, 0.1875f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -0.265625f, -0.5f)
			.setRotationPoint(-63.875f, -11.578125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 120, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.265625f, -0.265625f, 0, -0.265625f, -0.265625f, 0, -0.265625f, -0.265625f, 0, -0.265625f, -0.265625f, 0, -0.265625f, -0.265625f, 0, -0.265625f, -0.265625f, 0, -0.265625f, -0.265625f, 0, -0.265625f, -0.265625f, 0)
			.setRotationPoint(-48.421875f, -11.578125f, 8.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 323, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -0.265625f, -0.5f, 0, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -0.265625f, -0.5f)
			.setRotationPoint(-69.09375f, -11.578125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 39, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.515625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -1.515625f, -0.5f, 0, 0.984375f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, 0.984375f, -0.5f)
			.setRotationPoint(-71.8125f, -11.578125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 409, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -0.265625f, -0.5f, 0, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -0.265625f, -0.5f)
			.setRotationPoint(-82.53125f, -10.328125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 326, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.265625f, 0, 0, -0.265625f, 0.5f, 0, -0.265625f, 0.5f, -0.5f, -0.265625f, 0, -0.5f, -0.265625f, 0.21875f, 0, -0.265625f, -0.21875f, 0, -0.265625f, -0.21875f, -0.5f, -0.265625f, 0.21875f, -0.5f)
			.setRotationPoint(-83.265625f, -9.59375f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 305, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0.4375f, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -0.265625f, -0.5f, 0.4375f, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, -0.5f, 0, -0.265625f, -0.5f)
			.setRotationPoint(-90.71875f, -7.078125f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 192, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, 0, -0.28125f, -0.265625f, 0)
			.setRotationPoint(-91.4375f, -7.078125f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 1445cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-89.1875f, -15.1f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 288, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-89.1875f, -14.1f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 244, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.6875f, -0.5f, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-89.1875f, -14.1f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 7, 242, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -22.0625f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 138, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -22.0625f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 303, 234, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -22.25f, 0.375f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 420, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -22.25f, 0.375f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 199, 233, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.759995f, -22, -3.6875f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 169, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.75f, -22, -3.6875f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 72, 233, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -23, -2.9375f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 67, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -23, -2.9375f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 361, 232, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-88.759995f, -22, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 503, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-88.75f, -22, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 335, 232, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-88.759995f, -20, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 52, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-88.75f, -20, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 303, 227, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-88.759995f, -23, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 179, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-88.75f, -23, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 504, 286, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-87.6875f, -20.1f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 473, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.6875f, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-87.6875f, -21.1f, 7.25f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 499, 286, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-89.1875f, -15.1f, 11.25f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 389, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.6875f, -0.5f, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-89.1875f, -11.1f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 494, 286, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.1875f, -23.1f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 274, 285, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.1875f, -23.1f, -5.55f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 503, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.1875f, -24.1f, -5.55f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.1875f, -24.1f, 5.2625f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 277, 276, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.1875f, -15.1f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 269, 285, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.1875f, -16.6f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 40, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, -0.6875f, 0, -0.5f, -0.5f)
			.setRotationPoint(-89.1875f, -14.1f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 1045cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 210, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-88.8125f, -19.5f, 1).setRotationAngle(0, 0, 0).setName("Box 1956cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 479, 222, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-88.822495f, -19.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 195, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-88.8125f, -19.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 409, 222, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-90.322495f, -14, 10.25f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 272, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-90.3125f, -14, 10.25f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 173, 220, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-90.322495f, -13.75f, 9).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 246, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-90.3125f, -13.75f, 9).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 421, 210, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-90.322495f, -15, 8).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 473, 208, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-90.322495f, -14.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 120, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-90.3125f, -14.75f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 345, 207, textureX, textureY).addBox(0, 0, 0, 0, 1, 1)
			.setRotationPoint(-89.822495f, -17.75f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 1899cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 486, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-89.8125f, -17.75f, -4.25f).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 283, 281, textureX, textureY).addCylinder(0, -1, 0, 1, 1, 6, 0.375f, 0.28333333f, 5, new Vec3f(0.0, 0.71875, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 108, 281, textureX, textureY).addCylinder(0, -1.28125f, 0, 1, 1, 6, 0.28333333f, 0.28333333f, 5, new Vec3f(0.0, 0.71875, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 103, 281, textureX, textureY).addCylinder(0, -1.5625f, 0, 1, 1, 6, 0.28333333f, 0.375f, 5, new Vec3f(0.0, 0.75, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 93, 281, textureX, textureY).addCylinder(0, -1.8125f, 0, 1, 1, 6, 0.375f, 0.375f, 5, new Vec3f(0.0, 0.75, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 88, 281, textureX, textureY).addCylinder(0, -2.0625f, 0, 1, 1, 6, 0.125f, 0.125f, 5, new Vec3f(0.0, 0.75, 0.0))
			.setRotationPoint(43.53125f, -24.8125f, 7.25f).setRotationAngle(35, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 468, 280, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.625f, 0.5f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.25, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.9375f, -27.3125f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 321, 280, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0.75f, 0).setRadius(0.625f, 0.5f).setLength(1).setSegments(8, 0).setScale(1, 1.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.9375f, -27.3125f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 316, 280, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 1, 0).setRadius(0.625f, 0.5f).setLength(1).setSegments(8, 0).setScale(1.125f, 1.375f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.9375f, -27.3125f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 311, 280, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 1.25f, 0).setRadius(0.625f, 0.5f).setLength(1).setSegments(8, 0).setScale(1.375f, 1.5f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.75, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.9375f, -27.3125f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 293, 280, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.125f, 0).setRadius(0.625f, 0.5f).setLength(1).setSegments(8, 0).setScale(0.875f, 1).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.9375f, -27.3125f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 223, 280, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.25f, 0).setRadius(0.625f, 0.5f).setLength(1).setSegments(8, 0).setScale(0.625f, 0.875f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.9375f, -27.3125f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 218, 280, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.375f, 0).setRadius(0.625f, 0.5f).setLength(1).setSegments(8, 0).setScale(0.125f, 0.625f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.875, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.9375f, -27.3125f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 28, 280, textureX, textureY).newCylinderBuilder()
			.setPosition(0, -0.4375f, 0).setRadius(0.625f, 0.5f).setLength(1).setSegments(8, 0).setScale(0.125f, 0.125f).setDirection(4)
			.setTopOffset(new Vec3f(0.0, -0.9375, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.9375f, -27.3125f, 0).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 381, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 25, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-102.8125f, -8.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 985")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 139, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 25, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, -3)
			.setRotationPoint(-102.8125f, -5.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 986")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 136, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 19, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -6, -0.5f, 0, -6, -0.5f, 0, -6, 0, 0, -6)
			.setRotationPoint(-102.8125f, -2.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 987")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 23, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0.2f, 0, -0.5f, 0.2f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-91.8125f, -27.125f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 454")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 158, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.4f, 0.1f, -0.4f, 0.4f, 0.1f, -0.4f, 0.4f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0, 0.1f, -0.4f, 0, 0.1f, -0.4f, 0, -0.4f, 0.1f, 0, -0.4f)
			.setRotationPoint(-91.8125f, -22.125f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 1077")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 153, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.4f, 0.1f, -0.4f, 0.4f, 0.1f, -0.4f, 0.4f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0, 0.1f, -0.4f, 0, 0.1f, -0.4f, 0, -0.4f, 0.1f, 0, -0.4f)
			.setRotationPoint(-91.8125f, -23.125f, -6.875f).setRotationAngle(0, 0, 0).setName("Box 1078")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 18, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.2f, -0.5f, 0, 0.2f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-91.8125f, -27.125f, -6.875f).setRotationAngle(0, 0, 0).setName("Box 1868")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 172, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 5, 3, 2, 0, -0.3125f, 0.001f, 0, -0.3125f, 0.001f, 0, -2.5f, 0.001f, -0.4375f, -2.5f, 0.001f, -0.4375f, -0.3125f, 0, 0, -0.3125f, 0, 0, -2.5f, 0, -0.4375f, -2.5f, 0, -0.4375f)
			.setRotationPoint(42.625f, -28.5f, -2.375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 497, 93, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 5, 3, 2, 0, -2.5f, 0.001f, -0.4375f, -2.5f, 0.001f, -0.4375f, -0.3125f, 0.001f, 0, -0.3125f, 0.001f, 0, -2.5f, 0, -0.4375f, -2.5f, 0, -0.4375f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(42.625f, -28.5f, 0.375f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 163, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, 0.001f, -0.4285f, -0.3125f, 0.001f, -0.4285f, -0.3125f, 0.001f, 0, -0.3125f, 0.001f, 0, -0.3125f, -0.625f, -0.4285f, -0.3125f, -0.625f, -0.4285f, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0)
			.setRotationPoint(42.625f, -29.375f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 205, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, 0.001f, 0, -0.3125f, 0.001f, 0, -0.3125f, 0.001f, -0.4285f, -0.3125f, 0.001f, -0.4285f, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, -0.4285f, -0.3125f, -0.625f, -0.4285f)
			.setRotationPoint(42.625f, -29.375f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 825cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 94, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-90.3125f, -15, 8).setRotationAngle(0, 0, 0).setName("Box 1900cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 423, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 15, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -2, 0, 0, 0, 0, 0, 0, 0, -1, -2, 0)
			.setRotationPoint(-102.8125f, -8.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 421, 294, textureX, textureY).addCylinder(0, 0, 0, 1, 18, 8, 1, 1, 0, null)
			.setRotationPoint(-96.8125f, -4, -9).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 167, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-102.3125f, -8.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 468, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-94.3125f, -4.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 10, 280, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 8, 1, 1, 3, null)
			.setRotationPoint(-101.8125f, -7, -10).setRotationAngle(0, 0, 0)
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-101.8125f, -15, 13.01f).setRotationAngle(0, 0, 0).setName("Box 1011cp")
		);
		Boiler_Area.add(new ModelRendererTurbo(Boiler_Area, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-101.8125f, -15, -13.01f).setRotationAngle(0, 0, 0).setName("Box 1011cp")
		);
		groups.add(Boiler_Area);
	}

	private final void initGroup_ValveGearBackLeft(){
		TurboList ValveGearBackLeft = new TurboList("ValveGearBackLeft");
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 171, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-42.3125f, 6.8125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 376, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(-43.0625f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 433, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-40.5625f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 197, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-27.8125f, 6.8125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 359, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(-28.5625f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 223, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-26.0625f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 121, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-27.5625f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 426, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-13.3125f, 6.8125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 197, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0)
			.setRotationPoint(-14.0625f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 301, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.6875f, -1, 0, -0.6875f, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-11.5625f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 181, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-13.0625f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 121, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.1875f, 0, 0.1875f, -0.1875f, 0, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.1875f, 0, 0.1875f, -0.1875f)
			.setRotationPoint(-41.3125f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 9, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f, -0.25f, 0.25f, -0.53125f)
			.setRotationPoint(-42.3125f, 5.5625f, 6.09375f).setRotationAngle(0, 0, 0).setName("Box 807cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 46, 89, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 3, 1, 1, 0, -0.25f, 0.3125f, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, -0.25f, 0.3125f, -0.25f, -0.25f, 0.3125f, -0.25f, 0, 0.0625f, -0.25f, 0, 0.0625f, -0.25f, -0.25f, 0.3125f, -0.25f)
			.setRotationPoint(-41.3125f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 1092cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 171, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-42.0625f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 451, 154, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 5, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.5f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 409, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-11.3125f, -3, 9.4375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 0, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0)
			.setRotationPoint(-30.3125f, 6.8125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 504, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -1, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-30.3125f, 4.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 70, 215, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 7, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-10.75f, -2.625f, 9.59375f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 305, 88, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 2, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(-14.375f, 2.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 465, 87, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-14.375f, 2.5625f, 9.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 351, 87, textureX, textureY)
			.addShapeBox(-1.5f, -2.3125f, 0, 3, 1, 1, 0, 1.6875f, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 1.6875f, -0.6875f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f)
			.setRotationPoint(-14.375f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 221, 153, textureX, textureY)
			.addShapeBox(-3.5f, -2.6875f, 0, 5, 1, 1, 0, -0.3125f, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, -0.3125f, -0.6875f, 0.375f, -0.3125f, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, 0, 0.0625f, 0.375f, -0.3125f, 0.0625f, 0.375f)
			.setRotationPoint(-14.375f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 363, 99, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.625f, -0.3125f, -0.1875f, -0.625f)
			.setRotationPoint(-17.375f, 2.5625f, 9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 499, 152, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 5, 1, 1, 0, -0.3125f, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.3125f, -0.625f, 0.1875f, -0.3125f, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, -0.3125f, -0.1875f, 0.1875f)
			.setRotationPoint(-14.375f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 155, 87, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 2, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(-14.375f, 2.5625f, 7.8125f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 455, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0.25f, 0.125f, -0.25f, 0, 0.125f, -0.25f)
			.setRotationPoint(-41.3125f, 5.5625f, 8.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 275, 214, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-14.6875f, 2.8125f, 10.1875f).setRotationAngle(0, 0, 9)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 16, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0.3125f, -0.5f, 0)
			.setRotationPoint(-30.0625f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 132, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.3125f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0.3125f, -0.5f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-30.0625f, 5.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 1169cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 96, 213, textureX, textureY).addCylinder(3.5f, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-41.3125f, 6.0625f, 9.5625f).setRotationAngle(0, 0, -60)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 18, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(-39.5625f, 3.03125f, 10.1875f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 219, 123, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 4, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-39.5625f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 381, 212, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.3125))
			.setRotationPoint(-26.8125f, 1.90625f, 9.78125f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 197, 208, textureX, textureY)
			.addShapeBox(12, -0.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0.125f, -0.1875f, -0.4375f, -0.125f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(-39.5625f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 52, 208, textureX, textureY)
			.addShapeBox(11, -0.5f, 0, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.5625f)
			.setRotationPoint(-39.5625f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 17, 208, textureX, textureY)
			.addShapeBox(11, -0.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, 8.5f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 506, 206, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.75f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.125f, -0.1875f, -0.3125f, 0.125f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, 8.5f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 488, 206, textureX, textureY)
			.addShapeBox(12, -0.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f)
			.setRotationPoint(-39.5625f, 3.03125f, 8.75f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 249, 205, textureX, textureY)
			.addShapeBox(12.125f, -0.5f, 0.625f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, 8.75f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 263, 203, textureX, textureY)
			.addShapeBox(12, -0.5f, -0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.3125f, -0.875f, -0.1875f, -0.4375f, -0.875f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 32, 203, textureX, textureY)
			.addShapeBox(12.125f, -0.5f, -0.125f, 1, 1, 1, 0, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, -0.75f, -0.1875f, -0.5625f, -0.75f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f)
			.setRotationPoint(-39.5625f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 275, 210, textureX, textureY).addCylinder(-3.1875f, 0, 0, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-26, -4.5f, 10).setRotationAngle(0, 0, -18)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 249, 210, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-26, -4.5f, 9.9375f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 445, 209, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.625f, 0.625f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-26, -4.5f, 10).setRotationAngle(0, 0, -18)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 0, 87, textureX, textureY)
			.addShapeBox(-3.0625f, 0, 0, 3, 1, 1, 0, -0.25f, -0.4375f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.25f, -0.375f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.375f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 17, 203, textureX, textureY)
			.addShapeBox(-3.5625f, 0.6875f, 0, 1, 1, 1, 0, -0.3125f, 0.03125f, -0.38f, -0.25f, 0.25f, -0.38f, -0.25f, 0.25f, -0.38f, -0.3125f, 0.03125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -1.0625f, -0.38f, -0.25f, -0.8125f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 237, 202, textureX, textureY)
			.addShapeBox(0.25f, 0.375f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.375f, -0.1875f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.25f, -1.25f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.5625f, -0.8125f, -0.38f, -0.25f, -1.25f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 257, 194, textureX, textureY)
			.addShapeBox(0.4375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.5625f, 0.5625f, -0.38f, -0.25f, 0.5625f, -0.38f, -0.4375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.375f, 0, -0.38f, -0.4375f, 0, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 471, 194, textureX, textureY)
			.addShapeBox(0.625f, 1.6875f, 0, 1, 2, 1, 0, -0.25f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.5625f, -0.4375f, -0.38f, -0.25f, -0.4375f, -0.38f, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 104, 194, textureX, textureY)
			.addShapeBox(0.5625f, 3.5f, 0, 1, 1, 1, 0, -0.25f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.5625f, -0.1875f, -0.38f, -0.25f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.625f, -0.1875f, -0.38f, -0.1875f, -0.1875f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 171, 192, textureX, textureY)
			.addShapeBox(-0.375f, 3.1875f, 0, 1, 1, 1, 0, -0.25f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.5625f, 0, -0.38f, -0.25f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 52, 190, textureX, textureY)
			.addShapeBox(-0.4375f, 2.375f, 0, 1, 1, 1, 0, -0.1875f, 0, -0.38f, -0.625f, 0, -0.38f, -0.625f, 0, -0.38f, -0.1875f, 0, -0.38f, -0.3125f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.5f, -0.1875f, -0.38f, -0.3125f, -0.1875f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 257, 188, textureX, textureY)
			.addShapeBox(-0.5625f, 1.75f, 0, 1, 1, 1, 0, 0.0625f, 0, -0.38f, -0.875f, 0, -0.38f, -0.875f, 0, -0.38f, 0.0625f, 0, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 122, 187, textureX, textureY)
			.addShapeBox(-0.9375f, 1.125f, 0, 1, 1, 1, 0, 0.25f, -0.1875f, -0.38f, -1.25f, 0, -0.38f, -1.25f, 0, -0.38f, 0.25f, -0.1875f, -0.38f, -0.3125f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.5f, -0.375f, -0.38f, -0.3125f, -0.375f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 257, 185, textureX, textureY)
			.addShapeBox(-1.9375f, 1.125f, 0, 1, 1, 1, 0, -0.25f, 0.125f, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0, -0.38f, -0.25f, 0.125f, -0.38f, -0.25f, -0.9375f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.8125f, -0.38f, -0.25f, -0.9375f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 122, 180, textureX, textureY)
			.addShapeBox(-3.125f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.0625f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.0625f, -0.38f, -0.1875f, -0.875f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.875f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 197, 179, textureX, textureY)
			.addShapeBox(-2.5f, 1.125f, 0, 1, 1, 1, 0, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, 0.125f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f, -0.1875f, -0.9375f, -0.38f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 96, 180, textureX, textureY)
			.addShapeBox(-0.125f, 1.8125f, 0, 1, 2, 1, 0, 0.125f, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0.125f, -0.3125f, -0.4375f, -0.1875f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.1875f, 0, -0.4375f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 393, 179, textureX, textureY)
			.addShapeBox(-0.125f, 0.125f, 0, 1, 2, 1, 0, 0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, -0.125f, -0.4375f, -0.4375f, 0.125f, -0.4375f, -0.4375f, 0.125f, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.125f, 0, -0.4375f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 403, 53, textureX, textureY)
			.addShapeBox(-2.125f, -0.4375f, 0, 3, 1, 1, 0, -1.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -0.375f, -0.375f, -0.4375f, -1.375f, -0.375f, -0.4375f, 0.5f, 0, -0.4375f, -0.125f, 0, -0.4375f, -0.125f, 0, -0.4375f, 0.5f, 0, -0.4375f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 70, 179, textureX, textureY)
			.addShapeBox(-1.1875f, 0.125f, 0, 1, 2, 1, 0, 0, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -1, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, 0, -1, -0.4375f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 16, 107, textureX, textureY)
			.addShapeBox(-3.125f, 0.125f, 0, 2, 1, 1, 0, -0.25f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.0625f, -0.4375f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.0625f, 0, -0.4375f, -0.25f, 0, -0.4375f)
			.setRotationPoint(-26, -4.5f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 197, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.9375f, 0, -0.25f, 0.4375f, 0, -0.25f, 0.4375f, 0, -0.25f, -0.9375f, 0, -0.25f)
			.setRotationPoint(-28, 0.21875f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 477, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.0625f, 0.5f, -0.25f, -0.4375f, 0.5f, -0.25f)
			.setRotationPoint(-28.1875f, -1.28125f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 281, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -0.25f, 0, -0.1875f, -1.4375f, -0.125f, -0.25f, 0.9375f, -0.125f, -0.25f, 0.9375f, -0.125f, -0.25f, -1.4375f, -0.125f, -0.25f)
			.setRotationPoint(-29.375f, -3.15625f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 196, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f)
			.setRotationPoint(-29.5625f, -3.71875f, 9.6875f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 69, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5625f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.5625f, -0.0625f, -0.4375f, -0.25f, -0.4375f, -0.4375f, -0.25f)
			.setRotationPoint(-29.5625f, -3.71875f, 9.25f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 451, 151, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 5, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.3125f, -0.1875f, 0)
			.setRotationPoint(-14.375f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 437, 96, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.8125f, -0.3125f, -0.625f, -0.8125f, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.8125f, -0.3125f, -0.1875f, -0.8125f)
			.setRotationPoint(-17.375f, 2.375f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 437, 93, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, 0, -0.625f, 0.1875f, -0.3125f, -0.625f, 0.1875f, -0.3125f, -0.1875f, 0.375f, 0, -0.1875f, 0.375f, 0, -0.1875f, 0.375f, -0.3125f, -0.1875f, 0.375f)
			.setRotationPoint(-17.375f, 2.375f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 114, 22, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 17, 1, 1, 0, -0.375f, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, 0, -0.4375f, 0.1875f, -0.375f, -0.4375f, 0.1875f, -0.3125f, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, 0.1875f, -0.3125f, -0.1875f, 0.1875f)
			.setRotationPoint(-17.375f, 2.1875f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 351, 13, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 16, 1, 1, 0, 0.0625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.0625f, -0.4375f, 0, 0.625f, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0.625f, -0.25f, 0.1875f)
			.setRotationPoint(-16.375f, 1.875f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 18, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(-27.3125f, 1.21875f, 9.625f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 0, 47, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0, 3, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-14.375f, 2.5625f, 7.8125f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 114, 19, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.3125f, -0.625f, -0.625f, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.625f, -0.3125f, -0.1875f, -0.625f)
			.setRotationPoint(-17.375f, 2.5625f, 8.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 114, 16, textureX, textureY)
			.addShapeBox(-3.5f, -2.8125f, 0, 17, 1, 1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.8125f, -0.3125f, -0.625f, -0.8125f, -0.3125f, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.8125f, -0.3125f, -0.1875f, -0.8125f)
			.setRotationPoint(-17.375f, 2.375f, 8.0625f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 62, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-26.875f, -4.0625f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 179, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.625f, 0, -0.5f, 0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-28.0625f, -4.0625f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 272, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.125f, 0, 0, -1, 0, 0, -1, 0, 0.1875f, -0.125f, 0)
			.setRotationPoint(-26.875f, -2.0625f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 122, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(-28.5625f, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 451, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-27.5625f, -4.0625f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 44, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.375f, 0, -0.5f, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.0625f, 0)
			.setRotationPoint(-29.0625f, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 18, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.3125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.3125f, -0.0625f, 0)
			.setRotationPoint(-29.5625f, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 305, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(-32.875f, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 477, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f, -0.375f, -0.375f, 0.0625f)
			.setRotationPoint(-33, -3.4375f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 256, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(-36.25f, -3.75f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 501, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-36.25f, -3.125f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 114, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.875f, -4.0625f, 5.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 451, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-22.875f, -2.0625f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 487, 80, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.6875f, 1.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 486, 71, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 1, 0, 0.125f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0.125f, -0.25f, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16.6875f, 1.0625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 155, 83, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 2, 0, 0.375f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, -0.5f, 0)
			.setRotationPoint(-16.6875f, 0.8125f, 7.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 196, 165, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 3, 1, 0, 0.375f, -0.5f, -0.5625f, 0, -0.5f, -0.5625f, 0, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, 0, -0.5625f, 0, 0, -0.5625f, 0, -1, -0.0625f, 0.375f, -1, -0.0625f)
			.setRotationPoint(-15.6875f, 0.4375f, 4.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 193, 122, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 4, 0, 0.4375f, 0, 0.4375f, 0.0625f, 0, 0.4375f, 0.0625f, 0, 0, 0.4375f, 0, 0, 0.375f, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-15.6875f, -0.0625f, 5.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 195, 149, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 5, 0, 0.4375f, -0.75f, -0.0625f, 0.0625f, -0.75f, -0.0625f, 0.0625f, -0.75f, 0, 0.4375f, -0.75f, 0, 0.4375f, 0, -0.0625f, 0.0625f, 0, -0.0625f, 0.0625f, 0, 0, 0.4375f, 0, 0)
			.setRotationPoint(-15.6875f, -1.0625f, 5.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 228, 160, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 1, 0, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f)
			.setRotationPoint(-16.4375f, -0.5625f, 9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 104, 159, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 1, 1, 1, 0, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f)
			.setRotationPoint(-16.4375f, -0.0625f, 9.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 0, 83, textureX, textureY)
			.addShapeBox(-3.5f, -3, 0, 2, 1, 2, 0, 0.3125f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0.3125f, 0, 0.0625f, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0)
			.setRotationPoint(-18.0625f, -0.0625f, 7.9375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 96, 219, textureX, textureY).addCylinder(-1, 0, 0, 1, 11, 8, 0.5f, 0.5f, 3, new Vec3f(0.4375, 0.0, 0.0))
			.setRotationPoint(-11, 2.625f, 8.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 69, 165, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.6875f, 0.6875f, 3, null)
			.setRotationPoint(-12.875f, 2.625f, 8.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 114, 13, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 17, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(-25.476562f, -0.25f, 10).setRotationAngle(0, 0, -7).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 329, 164, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.5625f, 0.5625f).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-26, -4.5f, 10.9375f).setRotationAngle(0, 0, 90)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 69, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-26.5625f, -4.5f, 10.9375f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 506, 163, textureX, textureY).addCylinder(-2.6875f, 2.5f, -0.1875f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-26, -4.5f, 10).setRotationAngle(0, 0, -18)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 18, 161, textureX, textureY).addCylinder(-2.6875f, 2.5f, 0.375f, 1, 1, 8, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5625))
			.setRotationPoint(-26, -4.5f, 10.0625f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 254, 158, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-29, -0.9375f, 11.9375f).setRotationAngle(0, 0, -4)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 246, 158, textureX, textureY)
			.addShapeBox(-0.5f, -3, -0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-29, -0.9375f, 11.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 43, 157, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-29, -0.9375f, 10.4375f).setRotationAngle(0, 0, -4)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 177, 156, textureX, textureY)
			.addShapeBox(-0.5f, -3, -0.0625f, 1, 3, 1, 0, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, -0.8125f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.8125f, -0.125f, 0, -0.8125f, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-29, -0.9375f, 9.75f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 18, 155, textureX, textureY)
			.addShapeBox(-0.5f, -4.125f, -0.0625f, 1, 1, 1, 0, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.1875f, -0.125f, -0.5f, 0.0625f, -0.125f, -0.5f, 0.0625f, -0.125f, 0, 0.375f, -0.125f, 0, 0.375f, -0.125f, 0, 0.25f, -0.125f, 0, 0.25f)
			.setRotationPoint(-29, -0.9375f, 10.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 302, 151, textureX, textureY)
			.addShapeBox(-0.5f, -4.625f, -0.0625f, 1, 1, 1, 0, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.1875f, -0.125f, -0.1875f, 0.0625f, -0.125f, -0.1875f, 0.0625f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.0625f, -0.125f, 0, 0.0625f)
			.setRotationPoint(-29, -0.9375f, 10.9375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 228, 150, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f)
			.setRotationPoint(-29, -0.9375f, 10.5625f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 506, 149, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0, 1, 1, 1, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -1, -0.125f, 0, -1)
			.setRotationPoint(-29, -0.9375f, 10.8125f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 432, 138, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.125f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, -0.875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0)
			.setRotationPoint(-29, -0.9375f, 10.8125f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 480, 135, textureX, textureY)
			.addShapeBox(-0.5f, -3.9375f, 0.25f, 1, 1, 1, 0, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, -0.6875f, -0.125f, -0.8125f, 0, -0.125f, -0.8125f, 0, -0.125f, 0, -1, -0.125f, 0, -1, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-29, -0.9375f, 10.5625f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 0, 107, textureX, textureY)
			.addShapeBox(-0.5f, -5.4375f, -0.0625f, 1, 1, 2, 0, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, 0.1875f, -0.125f, -0.875f, -0.1875f, -0.125f, -0.875f, -0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, 0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f)
			.setRotationPoint(-29, -0.9375f, 10.1875f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 250, 135, textureX, textureY)
			.addShapeBox(-0.5f, -5.5625f, 1.375f, 1, 1, 1, 0, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f)
			.setRotationPoint(-29, -0.9375f, 8.4375f).setRotationAngle(0, 0, -4).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 17, 151, textureX, textureY).addCylinder(0, -4.8125f, 1.6875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, -0.9375f, 8.4375f).setRotationAngle(0, 0, -4)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 399, 150, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.0625f, 1.0625f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-34.0625f, -2.25f, 9.375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 203, 148, textureX, textureY)
			.addShapeBox(-0.5f, -4, 0, 1, 4, 1, 0, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, -0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.0625f, -2.25f, 8.875f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 195, 149, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(-29.335938f, -5.7421875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 302, 147, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.3125f, 0.3125f, 0, new Vec3f(0.0, 0.0, -0.375))
			.setRotationPoint(-34.0625f, -5.75f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 95, 147, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-34.0625f, -5.7421875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 481, 68, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 5, 1, 1, 0, 0, -0.375f, -0.375f, -0.28125f, -0.375f, -0.40625f, -0.28125f, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.375f, -0.28125f, -0.375f, -0.40625f, -0.28125f, -0.375f, -0.4375f, 0, -0.375f, -0.4375f)
			.setRotationPoint(-33.5625f, -6.25f, 9.5625f).setRotationAngle(0, 0, 0).setName(" aBox 1080cp 3")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 38, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-36.25f, -3.125f, 8.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 311, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.25f, -0.375f, 0.0625f, -0.3125f, -0.375f, 0.0625f)
			.setRotationPoint(-36.25f, -3.75f, 8.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 269, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, -0.375f, -0.75f, -0.1875f, -0.3125f, -0.75f, -0.1875f, -0.3125f, -0.75f, -0.1875f, -0.375f, -0.75f, -0.1875f, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f)
			.setRotationPoint(-36.25f, -2.125f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 504, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.375f, -0.25f, -0.1875f)
			.setRotationPoint(-36.25f, -3.125f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 260, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(-36.25f, -3.375f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 272, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.375f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.1875f, -0.375f, 0, -0.1875f, -0.375f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.3125f, -0.25f, -0.1875f, -0.375f, -0.25f, -0.1875f)
			.setRotationPoint(-33.25f, -3.125f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 260, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.3125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(-33.25f, -3.375f, 9.125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 465, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.375f, -3.0625f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 17, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.125f, -0.6875f, 0, 0.125f, -0.6875f)
			.setRotationPoint(-34.375f, -2.0625f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1080cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 399, 146, textureX, textureY)
			.addShapeBox(-1, -1.0625f, 0, 1, 2, 1, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(-41.3125f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 228, 146, textureX, textureY)
			.addShapeBox(0, -1.0625f, 0, 1, 2, 1, 0, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(-41.3125f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 809cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 264, 53, textureX, textureY)
			.addShapeBox(0, -0.6875f, 0, 26, 1, 1, 0, 0, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f, 0, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f)
			.setRotationPoint(-41.3125f, 5.5625f, 8.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 455, 50, textureX, textureY)
			.addShapeBox(0, 0.6875f, 0, 26, 1, 1, 0, 0, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0.25f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0.25f, -0.4375f, -0.1875f, 0, -0.4375f, -0.1875f)
			.setRotationPoint(-41.3125f, 5.5625f, 8.4375f).setRotationAngle(0, 0, -7.625f).setName("Box 798cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 60, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-41.3125f, 5.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 250, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f)
			.setRotationPoint(-41.3125f, 6.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 798cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 506, 145, textureX, textureY)
			.addShapeBox(-1.25f, -1.5f, 0, 1, 2, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f)
			.setRotationPoint(-12.375f, 2.5625f, 8.4375f).setRotationAngle(0, 0, 0).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 340, 139, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-14.6875f, 2.4375f, 8.5625f).setRotationAngle(0, 0, 9)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 43, 134, textureX, textureY).addCylinder(0, -2.4375f, 1.1875f, 1, 1, 8, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.8125))
			.setRotationPoint(-29, -0.9375f, 9.5f).setRotationAngle(0, 0, -4)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 0, 133, textureX, textureY)
			.addShapeBox(-0.484375f, 0, -0.015625f, 1, 2, 1, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.625f, -0.375f, 0.375f, -0.25f, -0.375f, 0.375f, -0.25f)
			.setRotationPoint(-29.1875f, -3.375f, 10.125f).setRotationAngle(0, 0, -35).setName("Box 1082cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 455, 128, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5625f, 0.5625f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-26, -4.5f, 10.5625f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 455, 124, textureX, textureY).addCylinder(-0.875f, 4.1875f, 0, 1, 1, 8, 0.625f, 0.625f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-26, -4.5f, 10.25f).setRotationAngle(0, 0, -18)
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 0, 12, textureX, textureY)
			.addShapeBox(4, -0.5f, 0, 6, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, 0.1875f, 0, -0.1875f, -0.5625f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-39.5625f, 3.03125f, 10).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 505, 40, textureX, textureY)
			.addShapeBox(10, -0.5f, 0.375f, 2, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-39.5625f, 3.03125f, 9.25f).setRotationAngle(0, 0, -5).setName("Box 1081cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 158, 124, textureX, textureY)
			.addShapeBox(0.6875f, -0.5f, 0, 1, 1, 1, 0, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, 0.1875f, -0.125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, -0.9375f, -0.3125f, -0.3125f, 0.1875f, -0.125f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 481, 122, textureX, textureY)
			.addShapeBox(-0.5625f, 0.09375f, 0, 1, 1, 1, 0, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 474, 122, textureX, textureY)
			.addShapeBox(-0.5625f, -1.09375f, 0, 1, 1, 1, 0, -0.40625f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.59375f, -0.65625f, -0.3125f, -0.40625f, -0.65625f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f, 0.0625f, -0.28125f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 444, 107, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0, -0.125f, -0.3125f, 0.125f, -0.125f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 437, 107, textureX, textureY)
			.addShapeBox(-0.6875f, -0.875f, 0, 1, 1, 1, 0, 0, -0.6875f, -0.3125f, -0.9375f, -0.5f, -0.3125f, -0.9375f, -0.5f, -0.3125f, 0, -0.6875f, -0.3125f, 0, 0.0625f, -0.3125f, -0.9375f, 0.25f, -0.3125f, -0.9375f, 0.25f, -0.3125f, 0, 0.0625f, -0.3125f)
			.setRotationPoint(-14.6875f, 2.8125f, 9.53125f).setRotationAngle(0, 0, 9).setName("Box 1083cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 220, 98, textureX, textureY)
			.addShapeBox(-1, -0.625f, 0, 1, 1, 1, 0, 0.0625f, -0.625f, -0.1875f, -0.75f, -0.625f, -0.1875f, -0.75f, -0.625f, -0.1875f, 0.0625f, -0.625f, -0.1875f, 0, 0, -0.1875f, -0.75f, 0.375f, -0.1875f, -0.75f, 0.375f, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(-41.3125f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 220, 91, textureX, textureY)
			.addShapeBox(-1, -0.75f, 0, 1, 1, 1, 0, 0, -0.375f, -0.1875f, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, 0, -0.375f, -0.1875f, 0.0625f, -0.25f, -0.1875f, -0.75f, -0.25f, -0.1875f, -0.75f, -0.25f, -0.1875f, 0.0625f, -0.25f, -0.1875f)
			.setRotationPoint(-41.3125f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 486, 76, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 1, 0, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f, -0.25f, -0.125f, -0.1875f)
			.setRotationPoint(-41.3125f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		ValveGearBackLeft.add(new ModelRendererTurbo(ValveGearBackLeft, 104, 90, textureX, textureY)
			.addShapeBox(0.125f, -1, 0, 1, 2, 1, 0, -0.625f, -0.25f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.625f, -0.25f, -0.1875f, -0.625f, -0.25f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.25f, -0.625f, -0.1875f, -0.625f, -0.25f, -0.1875f)
			.setRotationPoint(-41.3125f, 6.0625f, 9.375f).setRotationAngle(0, 0, -60).setName("Box 807cp")
		);
		groups.add(ValveGearBackLeft);
	}

	private final void initGroup_Frame_Main(){
		TurboList Frame_Main = new TurboList("Frame_Main");
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 104, 144, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-41.3125f, 3, -6.01f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 408, 143, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-26.8125f, 3, -6.01f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 349, 139, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-12.3125f, 3, -6.01f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 323, 122, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-41.3125f, 3, 6.01f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 52, 115, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-26.8125f, 3, 6.01f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 356, 114, textureX, textureY)
			.addShapeBox(-7, -7, 0, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-12.3125f, 3, 6.01f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 416, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-1.8125f, 2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 257")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 416, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-1.8125f, 2.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 258")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 78, 244, textureX, textureY)
			.addBox(0, 0, 0, 1, 3, 3, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(0.1875f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 259")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 179, 173, textureX, textureY).addBox(0, 0, 0, 2, 3, 5)
			.setRotationPoint(-3.8125f, 2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 260")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 0, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 11, 0, 0, 3, -10, 0.25f, 0, -7, 0.25f, 0, -3, 0, 3, 0, 0, -3, -10, 0.25f, 0, -7, 0.25f, 0, -3, 0, -3, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-9.0625f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 216, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 11, 0, 0, 0, -10, 0.25f, 0, -7, 0.25f, 0, -3, 0, 0, 0, 0, 0, -10, 0.25f, 0, -7, 0.25f, 0, -3, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-9.0625f, 4.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 254")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 205, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 11, 0, 0, 0, 0, 0.25f, 0, -3, 0.25f, 0, -7, 0, 0, -10, 0, 0, 0, 0.25f, 0, -3, 0.25f, 0, -7, 0, 0, -10,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-9.0625f, 4.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 37, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 11, 0, 0, 3, 0, 0.25f, 0, -3, 0.25f, 0, -7, 0, 3, -10, 0, -3, 0, 0.25f, 0, -3, 0.25f, 0, -7, 0, -3, -10,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-9.0625f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 129, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-7.4375f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 124, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-7.4375f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 119, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-7.4375f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 114, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-7.4375f, -1.375f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 104, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-7.5625f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 94, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-8.1875f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 55, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-7.5625f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 50, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-8.1875f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 356, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-7.5625f, -0.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 444, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-8.1875f, -0.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 123, 279, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-7.5625f, -0.875f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 135, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-8.1875f, -0.875f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 302, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-8.1875f, -0.8125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 5, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-7.5625f, -0.8125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 215, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-7.5625f, -0.875f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 45, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-8.1875f, -0.875f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 292, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-8.1875f, -0.8125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 123, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-7.5625f, -0.8125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 440, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-7.5625f, -0.875f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 436, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-8.1875f, -0.875f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 52, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(-7.5625f, -0.8125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 45, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0)
			.setRotationPoint(-18.1875f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 40, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0)
			.setRotationPoint(-21.9375f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 25, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0)
			.setRotationPoint(-18.1875f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 10, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0)
			.setRotationPoint(-21.9375f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 436, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-47.1875f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 71, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-47.1875f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 431, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0)
			.setRotationPoint(-32.6875f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 359, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0)
			.setRotationPoint(-36.4375f, -2.625f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 354, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0)
			.setRotationPoint(-32.6875f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 344, 325, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0.375f, -0.375f, -0.1875f, 0, -0.375f, -0.1875f, 0)
			.setRotationPoint(-36.4375f, -2.625f, 4.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 339, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-47.1875f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 283, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-47.1875f, -1.375f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 274, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-47.3125f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 266, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-47.9375f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 150, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-47.3125f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 378, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-47.9375f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 223, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-47.3125f, -0.875f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 219, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-47.9375f, -0.875f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 19, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-47.3125f, -0.875f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 172, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-47.9375f, -0.875f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 198, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-47.9375f, -0.8125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 71, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-47.3125f, -0.8125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 185, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(-47.3125f, -0.8125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 432, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-47.3125f, -0.875f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 425, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-47.9375f, -0.875f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 406, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-47.9375f, -0.8125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 276, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-47.3125f, -0.8125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 215, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-47.3125f, -0.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 211, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-47.9375f, -0.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 233, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.0625f, -0.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 207, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.5625f, -0.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 489, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.0625f, 4.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 181, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.5625f, 4.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 349, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-26.8125f, 3, -5.5625f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 342, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-26.8125f, 3, 4.4375f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 335, 243, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-12.3125f, 3, -5.5625f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 433, 242, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-12.3125f, 3, 4.4375f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 235, 313, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-12.3125f, 3, -6).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 230, 313, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-26.8125f, 3, -6).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 426, 242, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-41.3125f, 3, -5.5625f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 419, 242, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, 0.125)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-41.3125f, 3, 4.4375f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 349, 312, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-41.3125f, 3, -6).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 40, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-33.0625f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 33, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-38.0625f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 92, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-33.0625f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 85, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-38.0625f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 78, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-18.5625f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 388, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-23.5625f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 264, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-18.5625f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 462, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-23.5625f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 285, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-16.0625f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 26, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-16.0625f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 0, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-30.5625f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 158, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-45.0625f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 136, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-45.0625f, -0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 334, 312, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-35.9375f, 2.375f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 329, 312, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-32.1875f, 2.375f, 4.25f).setRotationAngle(0, 0, 180)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 324, 312, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-35.9375f, 2.375f, 4.25f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 240, 312, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-17.6875f, 2.375f, 4.25f).setRotationAngle(0, 0, 180)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 205, 312, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-21.4375f, 2.375f, 4.25f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 35, 312, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-17.6875f, 2.375f, -5.75f).setRotationAngle(0, 0, 180)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 460, 311, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-21.4375f, 2.375f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 80, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-31.0625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 247, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-31.0625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 384, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-16.5625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 247, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-16.5625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 329, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-38.0625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 109, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-38.0625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 123, 275, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-23.5625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 302, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-23.5625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 455, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-34.5625f, 2, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 491, 280, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-34.5625f, 2.125f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 303, 278, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.125f, 0, 0.125f, -0.125f, 0, -0.125f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.125f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-33.4375f, 2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 491, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.125f, 0.25f, 0.125f, -0.125f, 0.25f, 0.125f, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.125f, -0.125f, 0.25f, -0.125f, -0.125f, 0, -0.5f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-35.9375f, 2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 251, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-34.5625f, 2.125f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 72, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.125f, 0, 0.125f, -0.125f, 0, -0.125f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.125f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-33.4375f, 2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 465, 275, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.125f, 0.25f, 0.125f, -0.125f, 0.25f, 0.125f, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.125f, -0.125f, 0.25f, -0.125f, -0.125f, 0, -0.5f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-35.9375f, 2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 303, 275, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-20.0625f, 2.125f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 491, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.125f, 0, 0.125f, -0.125f, 0, -0.125f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.125f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-18.9375f, 2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 448, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.125f, 0.25f, 0.125f, -0.125f, 0.25f, 0.125f, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.125f, -0.125f, 0.25f, -0.125f, -0.125f, 0, -0.5f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-21.4375f, 2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 251, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-20.0625f, 2.125f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 72, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.125f, -0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.125f, 0, 0.125f, -0.125f, 0, -0.125f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0, -0.125f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-18.9375f, 2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 303, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.125f, 0.25f, 0.125f, -0.125f, 0.25f, 0.125f, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, 0.25f, -0.125f, -0.125f, 0.25f, -0.125f, -0.125f, 0, -0.5f, -0.125f,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-21.4375f, 2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 416, 311, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 0.375f, 0.375f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-32.1875f, 2.375f, -5.75f).setRotationAngle(0, 0, 180)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 233, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-38.0625f, 0.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 26, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-38.0625f, 4.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 489, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-38.0625f, 0.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 84, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-38.0625f, 4.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 84, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-23.5625f, 0.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 58, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-23.5625f, 4.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 363, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-23.5625f, 0.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 494, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-23.5625f, 4.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 104, 219, textureX, textureY).addCylinder(0, 0, 0, 2, 11, 12, 0.9375f, 0.9375f, 3, new Vec3f(-0.25, 0.0, 0.0))
			.setRotationPoint(-4.96875f, -2, -10.4375f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 427, 192, textureX, textureY).addCylinder(-1, 0, 0, 3, 10, 12, 1, 1, 3, new Vec3f(0.4375, 0.0, 0.0))
			.setRotationPoint(-4.21875f, 2.625f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 87, 219, textureX, textureY).addCylinder(0, 0, 0, 2, 11, 12, 0.9375f, 0.9375f, 3, new Vec3f(-0.25, 0.0, 0.0))
			.setRotationPoint(-4.96875f, -2, 10.4375f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 179, 190, textureX, textureY).addCylinder(-1, 0, 0, 3, 10, 12, 1, 1, 3, new Vec3f(0.4375, 0.0, 0.0))
			.setRotationPoint(-4.21875f, 2.625f, 8.9375f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 303, 311, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(0.71875f, 0.0078125f, -12).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 298, 311, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(0.71875f, 0.0078125f, 11.75f).setRotationAngle(0, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 231, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 9, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-3.03125f, -2.5625f, -12.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 437, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 9, 0, 0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-3.03125f, -3.1875f, -12.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 104, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.125f, 0.5f, -0.375f, 0.125f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-3.03125f, -3.8125f, -12.5625f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 409, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0.5f, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.5f, 0.5f, -0.1875f, -0.5f, 0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-3.03125f, -4.4375f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 54, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 7, 0, 0.5f, -0.25f, -3.4375f, 0, -0.25f, -3.4375f, 0, -0.25f, -1.125f, 0.5f, -0.25f, -1.125f, 0.5f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-3.03125f, -4.875f, -10.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 148, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 8, 0, 0.5f, 0, 0.4375f, 0, 0, 0.4375f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.5f, 0.5f, -0.5625f, -0.5f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(-3.03125f, 1.1875f, -11.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 195, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5625f, 0.5f, -0.125f, -0.5625f, 0.5f, -0.125f, -0.5f, 0, -0.125f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-3.53125f, -0.6875f, -12.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 402, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(1.96875f, -0.6875f, -12.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 510, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(0.21875f, 0.1875f, -12.375f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 510, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, -1, 0.25f, -0.5f, -1, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(0.21875f, -0.3125f, -11.875f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 510, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(0.21875f, -0.3125f, -10.875f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 510, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, false, true, true })
			.setRotationPoint(0.21875f, -1.0625f, -11.625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 468, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.375f, 0.3125f, 0.25f, -0.375f, 0.3125f, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.625f, 0.3125f, 0.25f, -0.625f, 0.3125f, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, 0,
				new boolean[]{ true, true, true, false, true, true })
			.setRotationPoint(0.21875f, -1.0625f, -12.625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 400, 104, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-0.78125f, 0.0078125f, -12.0625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 110, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.125f, -0.5625f, -0.75f, -0.125f, -0.5625f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-0.28125f, -0.6875f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 172, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.125f, -0.5625f, -0.75f, -0.125f, -0.5625f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(1.46875f, -0.6875f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 32, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(-0.03125f, -0.9375f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 491, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.9375f, -0.0625f, -0.0625f, -0.9375f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f,
				new boolean[]{ true, false, false, true, false, true })
			.setRotationPoint(-0.28125f, -0.9375f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 470, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, -0.9375f, -0.75f, 0, -0.9375f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, -0.75f, -0.75f, -0.9375f,
				new boolean[]{ false, true, false, true, false, true })
			.setRotationPoint(0.71875f, -0.9375f, -13).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 459, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, 0, -0.07421875f, -0.5f, 0, -0.07421875f, -0.5f, 0, -0.86328125f, 0, 0, -0.86328125f,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(-0.03125f, 0.4375f, -12.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 448, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.0625f, -0.0546875f, -0.75f, 0, -0.07421875f, -0.75f, 0, -0.86328125f, -0.0625f, -0.0625f, -0.8828125f,
				new boolean[]{ true, false, true, false, false, true })
			.setRotationPoint(-0.28125f, 0.4375f, -12.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 251, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, -0.75f, -0.75f, -0.9375f, -0.75f, 0, -0.07421875f, -0.0625f, -0.0625f, -0.0546875f, -0.0625f, -0.0625f, -0.8828125f, -0.75f, 0, -0.86328125f,
				new boolean[]{ false, true, true, false, false, true })
			.setRotationPoint(0.71875f, 0.4375f, -12.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 52, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 9, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, 0, 0.5f, -0.125f, 0,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-3.03125f, -2.5625f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 95, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 9, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0, 0.5f, -0.375f, 0,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-3.03125f, -3.1875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 104, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, -0.375f, 0, 0.5f, -0.375f, 0,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-3.03125f, -3.8125f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 409, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0.5f, -0.1875f, -0.5f, 0, -0.1875f, -0.5f, 0, -0.1875f, -0.875f, 0.5f, -0.1875f, -0.875f, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.125f, 0.5f, -0.375f, -0.125f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-3.03125f, -4.4375f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 78, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 7, 0, 0.5f, -0.25f, -1.125f, 0, -0.25f, -1.125f, 0, -0.25f, -3.4375f, 0.5f, -0.25f, -3.4375f, 0.5f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, 0.125f, 0.5f, -0.375f, 0.125f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-3.03125f, -4.875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 486, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 8, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.4375f, 0.5f, 0, 0.4375f, 0.5f, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, -0.5625f, 0, 0.5f, -0.5625f, 0,
				new boolean[]{ false, false, true, false, true, false })
			.setRotationPoint(-3.03125f, 1.1875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 289, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 7, 9, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0.5f, -0.125f, -0.125f,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-3.03125f, -4.25f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 129, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0.5f, -0.125f, -0.5f, 0.5f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-3.53125f, -0.6875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 271, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, true, false })
			.setRotationPoint(0.21875f, 0.1875f, 10.375f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 232, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -1, 0.25f, -0.5f, -1, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, true, false })
			.setRotationPoint(0.21875f, -0.3125f, 10.875f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 468, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, true, true, true, false })
			.setRotationPoint(0.21875f, -0.3125f, 9.875f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 311, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, 0,
				new boolean[]{ true, true, false, false, true, true })
			.setRotationPoint(0.21875f, -1.0625f, 10.625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 35, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0.3125f, 0.25f, -0.375f, 0.3125f, 0.25f, -0.4375f, 0, 0.25f, -0.4375f, 0, 0.25f, -0.625f, 0.3125f, 0.25f, -0.625f, 0.3125f,
				new boolean[]{ true, true, false, false, true, true })
			.setRotationPoint(0.21875f, -1.0625f, 11.625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 423, 71, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-0.78125f, 0.0078125f, 11.0625f).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 71, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.9375f, -0.75f, 0, -0.9375f, -0.75f, 0, 0, 0, 0, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-0.28125f, -0.6875f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 490, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.9375f, -0.75f, 0, -0.9375f, -0.75f, 0, 0, 0, 0, 0, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f, -0.75f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(1.46875f, -0.6875f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 78, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.9375f, -0.5f, 0, -0.9375f, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.9375f, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(-0.03125f, -0.9375f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 153, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -0.0625f, -0.9375f, -0.75f, 0, -0.9375f, -0.75f, 0, 0, -0.0625f, -0.0625f, 0, 0, -0.75f, -0.9375f, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ true, false, false, true, true, false })
			.setRotationPoint(-0.28125f, -0.9375f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 15, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.9375f, -0.0625f, -0.0625f, -0.9375f, -0.0625f, -0.0625f, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, -0.75f, -0.75f, 0,
				new boolean[]{ false, true, false, true, true, false })
			.setRotationPoint(0.71875f, -0.9375f, 12).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 382, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, -0.9375f, -0.5f, -0.75f, -0.9375f, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.86328125f, -0.5f, 0, -0.86328125f, -0.5f, 0, -0.07421875f, 0, 0, -0.07421875f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(-0.03125f, 0.4375f, 11.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 277, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.9375f, -0.75f, -0.75f, -0.9375f, -0.75f, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.0625f, -0.8828125f, -0.75f, 0, -0.86328125f, -0.75f, 0, -0.07421875f, -0.0625f, -0.0625f, -0.0546875f,
				new boolean[]{ true, false, true, false, true, false })
			.setRotationPoint(-0.28125f, 0.4375f, 11.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 303, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.86328125f, -0.0625f, -0.0625f, -0.8828125f, -0.0625f, -0.0625f, -0.0546875f, -0.75f, 0, -0.07421875f,
				new boolean[]{ false, true, true, false, true, false })
			.setRotationPoint(0.71875f, 0.4375f, 11.4375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 129, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 9, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5625f, 0.5f, -0.125f, -0.5625f,
				new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(1.96875f, -0.6875f, 3.9375f).setRotationAngle(0, 0, 0).setName("Box 640cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 130, 162, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5f).setLength(1).setSegments(12, 4).setScale(0.9375f, 0.9375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.25, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.71875f, -2, -10.4375f).setRotationAngle(-120, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 293, 311, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, 0.25f, -0.4375f, -0.125f, 0.25f, -0.4375f, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.015625f, -0.15625f, -0.875f, -0.3125f, -0.1875f, -0.125f, -0.3125f, -0.1875f, -0.125f, -0.3125f, -0.34375f, -0.875f, -0.3125f, -0.34375f)
			.setRotationPoint(-6.34375f, -2.1875f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 288, 311, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.25f, -0.4375f, -0.125f, 0.25f, -0.4375f, -0.875f, -0.3125f, -0.34375f, -0.125f, -0.3125f, -0.34375f, -0.125f, -0.3125f, -0.1875f, -0.875f, -0.3125f, -0.1875f)
			.setRotationPoint(-6.34375f, -2.1875f, -9.375f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 26, 122, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.5f).setLength(1).setSegments(12, 4).setScale(0.9375f, 0.9375f).setDirection(3)
			.setTopOffset(new Vec3f(-0.25, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-5.71875f, -2, 10.4375f).setRotationAngle(-120, 0, 0)
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 279, 311, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, 0.25f, -0.4375f, -0.125f, 0.25f, -0.4375f, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.015625f, -0.15625f, -0.875f, -0.3125f, -0.1875f, -0.125f, -0.3125f, -0.1875f, -0.125f, -0.3125f, -0.34375f, -0.875f, -0.3125f, -0.34375f)
			.setRotationPoint(-6.34375f, -2.1875f, 8.375f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 270, 311, textureX, textureY)
			.addShapeBox(0.5f, -0.5f, 0, 1, 1, 1, 0, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.015625f, -0.15625f, -0.125f, 0.25f, -0.4375f, -0.125f, 0.25f, -0.4375f, -0.875f, -0.3125f, -0.34375f, -0.125f, -0.3125f, -0.34375f, -0.125f, -0.3125f, -0.1875f, -0.875f, -0.3125f, -0.1875f)
			.setRotationPoint(-6.34375f, -2.1875f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1082cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 246, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-12.8125f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 26, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-18.3125f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 78, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.8125f, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 400, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-17.3125f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 385, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.8125f, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 42, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-16.3125f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 367, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.8125f, -2.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 11, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-10.3125f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 441, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-10.3125f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 153, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-10.3125f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 164, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-27.3125f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 424, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.3125f, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 292, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.3125f, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 283, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.3125f, -2.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 0, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-32.8125f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 265, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-31.8125f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 186, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-30.8125f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 348, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-24.8125f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 9, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-24.8125f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 474, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-24.8125f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 89, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-41.8125f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 0, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.8125f, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 502, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.8125f, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 214, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.8125f, -2.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 242, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-47.3125f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 205, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-46.3125f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 467, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-45.3125f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 231, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-39.3125f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 35, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-39.3125f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 120, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-39.3125f, -2.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 479, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-12.8125f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 216, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-18.3125f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 26, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.8125f, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 292, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-17.3125f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 283, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.8125f, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 113, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-16.3125f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 231, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.8125f, -2.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 205, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-10.3125f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 87, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-10.3125f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 374, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-10.3125f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 450, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-27.3125f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 78, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.3125f, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 9, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.3125f, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 0, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.3125f, -2.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 112, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-32.8125f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 372, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-31.8125f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 367, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-30.8125f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 243, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-24.8125f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 113, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-24.8125f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 245, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-24.8125f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 383, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-41.8125f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 104, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.8125f, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 453, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.8125f, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 389, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.8125f, -2.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 11, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-47.3125f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 257, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-46.3125f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 238, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-45.3125f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 216, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-39.3125f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 35, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-39.3125f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 231, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-39.3125f, -2.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 207, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-37.0625f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 408, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-37.0625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 455, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-32.0625f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 237, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-32.0625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 104, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-34.5625f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 159, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-34.5625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 436, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-34.5625f, 2, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 233, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-37.0625f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 174, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-37.0625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 170, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-32.0625f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 166, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-32.0625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 469, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-34.5625f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 464, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-34.5625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 431, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-20.0625f, 2, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 162, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-22.5625f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 158, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-22.5625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 42, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-17.5625f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 38, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-17.5625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 262, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-20.0625f, 3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 257, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-20.0625f, 1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 374, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-20.0625f, 2, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 467, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-22.5625f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 463, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, true, true, true, false, false })
			.setRotationPoint(-22.5625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 172, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-17.5625f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 158, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -0.25f, 0,
				new boolean[]{ true, false, true, true, false, false })
			.setRotationPoint(-17.5625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 220, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-20.0625f, 3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 489, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0,
				new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-20.0625f, 1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame_Main.add(new ModelRendererTurbo(Frame_Main, 110, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-30.5625f, -0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		groups.add(Frame_Main);
	}

	ModelAlleghenyBogieRear bogie = new ModelAlleghenyBogieRear();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		/*for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			ModelRenderHelper.renderModelWithRollingStockLightControls(l.toArray(arr), entity, f5);
		}*/
		GL11.glPushMatrix();
		GL11.glTranslatef(0,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
