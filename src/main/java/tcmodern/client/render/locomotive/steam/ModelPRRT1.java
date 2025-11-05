//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.steam;


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.locomotive.bogies.ModelPRRT1FrontBogie;
import tcmodern.client.render.locomotive.bogies.ModelPRRT1RearBogie;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelPRRT1 extends FVTMFormatBase {

	public ModelPRRT1(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("broscolotos");
		addToCreators("MrRailroadRunner");
		//
		initGroup_Frame();
		initGroup_Rest_of_locomotive();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Frame(){
		TurboList Frame = new TurboList("Frame");
		Frame.add(new ModelRendererTurbo(Frame, 102, 213, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 0, null)
			.setRotationPoint(-29.5f, 2.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 500, 212, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 0, null)
			.setRotationPoint(-29.5f, 2.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 486, 211, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 0, null)
			.setRotationPoint(-14, 2.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 276, 211, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 0, null)
			.setRotationPoint(-14, 2.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 249, 211, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 0, null)
			.setRotationPoint(11.5f, 2.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 7, 211, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 0, null)
			.setRotationPoint(11.5f, 2.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 211, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 0, null)
			.setRotationPoint(27, 2.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 385, 210, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 0, null)
			.setRotationPoint(27, 2.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 120, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(-31.5f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 84, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(-16, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(-31.5f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 217, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(-16, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(9.5f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 488, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(25, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(9.5f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 465, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(25, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 288, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-33.25f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 372, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-28.25f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 451, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-33.25f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-33.25f, 4.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 355, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-17.75f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 102, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-12.75f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 451, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.75f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.75f, 4.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 82, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-17.75f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 75, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-12.75f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.75f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 451, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.75f, 4.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 500, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-33.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 444, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-28.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-33.25f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-33.25f, 4.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 385, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(7.75f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 288, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(12.75f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 400, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(7.75f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(7.75f, 4.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(23.25f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 164, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(28.25f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 412, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.25f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.25f, 4.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(23.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 102, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(28.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.25f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.25f, 4.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 82, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(7.75f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 75, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(12.75f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(7.75f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(7.75f, 4.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, -0.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 451, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, 3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, -0.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 144, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, 3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, -0.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, 3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, -0.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, 3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 50, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 462, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.75f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 454, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-24.75f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 449, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-24.75f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.75f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 404, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.75f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 399, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-19.75f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 394, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-19.75f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 389, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.75f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-19.75f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.25f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-23.25f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-23.25f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 364, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.25f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 285, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-23.25f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-21.25f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 462, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-21.25f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 444, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.25f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 359, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.25f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 171, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 362, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.75f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 354, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-24.75f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 87, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-24.75f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.75f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 68, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.75f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-19.75f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 58, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-19.75f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.75f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 501, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-19.75f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 439, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.25f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 434, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-23.25f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 429, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-23.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.25f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 419, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-23.25f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 128, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-21.25f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 123, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-21.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.25f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 20, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.25f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 201, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 194, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(22.25f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 15, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(16.25f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 10, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.25f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 5, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.25f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.25f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 458, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(21.25f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 453, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(21.25f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 448, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(21.25f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 409, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 404, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(17.75f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 399, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(17.75f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 394, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.75f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 389, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(17.75f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(19.75f, 0.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19.75f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, 2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 187, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 57, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(22.25f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 364, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(16.25f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 285, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.25f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.25f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 464, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(21.25f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 359, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(21.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 354, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.25f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(21.25f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 73, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 68, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(17.75f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(17.75f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 58, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.75f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(17.75f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 501, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(19.75f, 0.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 444, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19.75f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 439, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 434, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, 2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 429, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f)
			.setRotationPoint(-22.25f, 1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f)
			.setRotationPoint(-22.25f, 1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 419, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f)
			.setRotationPoint(18.75f, 1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 87, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f)
			.setRotationPoint(18.75f, 1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 206, 83, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(20.875f, 1.875f, -5.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 177, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-21.125f, 1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 149, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.375f, 1.0E-15f).setLength(0.75f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-19.375f, 1.875f, -5.375f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 82, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-24.125f, 1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 468, 140, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.375f, 1.0E-15f).setLength(0.75f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.125f, 1.875f, -5.375f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 198, 83, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-19.375f, 1.875f, -5.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 427, 77, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.125f, 1.875f, -5.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 75, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-21.125f, 1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 468, 136, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.375f, 1.0E-15f).setLength(0.75f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-19.375f, 1.875f, 4.625f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 50, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-24.125f, 1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 129, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.375f, 1.0E-15f).setLength(0.75f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.125f, 1.875f, 4.625f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 431, 49, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-19.375f, 1.875f, 4.25f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 431, 46, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-24.125f, 1.875f, 4.25f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 135, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.25f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 11, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.25f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 235, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-9.125f, -1.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 20, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-9.125f, -1.875f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 15, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(-9.25f, -1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 10, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(-9.25f, -1.375f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 5, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-9.25f, -1.375f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(-9.875f, -1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 460, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(-9.875f, -1.375f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-9.875f, -1.375f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 450, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(-9.25f, -1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-9.25f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 409, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(-9.25f, -1.375f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 404, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(-9.875f, -1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 399, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-9.875f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 394, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(-9.875f, -1.375f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 389, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-9.875f, -1.3125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-9.25f, -1.3125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-9.875f, -1.3125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-9.25f, -1.3125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(-9.25f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-35.375f, -1.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 285, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-35.375f, -1.875f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(-35.5f, -1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 465, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(-35.5f, -1.375f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-35.5f, -1.375f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(-36.125f, -1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 73, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(-36.125f, -1.375f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 68, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-36.125f, -1.375f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(-35.5f, -1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 58, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-35.5f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(-35.5f, -1.375f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 20, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(-36.125f, -1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 15, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-36.125f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 10, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(-36.125f, -1.375f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 5, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-36.125f, -1.3125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-35.5f, -1.3125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 461, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-36.125f, -1.3125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 456, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-35.5f, -1.3125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 383, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(-35.5f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.75f, 0, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 401, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.75f, 4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 368, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-33.25f, 0, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 108, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-33.25f, 4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 134, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, 0, -4).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 328, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.25f, 4, -4).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 39, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(19.875f, 1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 500, 81, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.375f, 1.0E-15f).setLength(0.75f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(21.625f, 1.875f, -5.375f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 32, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(16.875f, 1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 198, 75, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.375f, 1.0E-15f).setLength(0.75f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(16.875f, 1.875f, -5.375f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 509, 44, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(21.625f, 1.875f, -5.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 501, 44, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(16.875f, 1.875f, -5.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(19.875f, 1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 35, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.375f, 1.0E-15f).setLength(0.75f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(21.625f, 1.875f, 4.625f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(16.875f, 1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 6, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.375f, 1.0E-15f).setLength(0.75f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(16.875f, 1.875f, 4.625f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 491, 44, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(21.625f, 1.875f, 4.25f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 483, 44, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.25f, 0).setLength(1.5f).setSegments(16, 8).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(16.875f, 1.875f, 4.25f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, -1.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 281, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.75f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 187, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 451, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(31.875f, -1.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(31.875f, -1.875f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 409, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(31.75f, -1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 404, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(31.75f, -1.375f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 399, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(31.75f, -1.375f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 394, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(31.125f, -1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 389, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(31.125f, -1.375f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(31.125f, -1.375f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(31.75f, -1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(31.75f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(31.75f, -1.375f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 285, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(31.125f, -1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(31.125f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(31.125f, -1.375f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 147, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(31.125f, -1.3125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 425, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(31.75f, -1.3125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 142, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(31.125f, -1.3125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 108, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(31.75f, -1.3125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 412, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(31.75f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 103, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(5.625f, -1.875f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 98, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(5.625f, -1.875f, 4.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 93, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(5.5f, -1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 88, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(5.5f, -1.375f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(5.5f, -1.375f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 68, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(4.875f, -1.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(4.875f, -1.375f, 4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 58, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(4.875f, -1.375f, 4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 24, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(5.5f, -1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(5.5f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(5.5f, -1.375f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 429, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(4.875f, -1.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 402, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(4.875f, -1.375f, -5.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 28, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(4.875f, -1.375f, -5.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 4, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(4.875f, -1.3125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 344, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(5.5f, -1.3125f, -4.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 282, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(4.875f, -1.3125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 255, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(5.5f, -1.3125f, 3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(5.5f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 226, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.25f, 0, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 193, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.25f, 4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 160, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(7.75f, 0, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 470, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(7.75f, 4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 59, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, 0, -4).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 249, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, 4, -4).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 234, 244, textureX, textureY).addBox(0, 0, 0, 15, 15, 0)
			.setRotationPoint(-21.5f, -5, 6).setRotationAngle(0, 0, 0).setName("Box 4")
		);
		Frame.add(new ModelRendererTurbo(Frame, 92, 244, textureX, textureY).addBox(0, 0, 0, 15, 15, 0)
			.setRotationPoint(-37, -5, 6).setRotationAngle(0, 0, 0).setName("Box 6")
		);
		Frame.add(new ModelRendererTurbo(Frame, 203, 243, textureX, textureY).addBox(0, 0, 0, 15, 15, 0)
			.setRotationPoint(-21.5f, -5, -6).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		Frame.add(new ModelRendererTurbo(Frame, 172, 243, textureX, textureY).addBox(0, 0, 0, 15, 15, 0)
			.setRotationPoint(-37, -5, -6).setRotationAngle(0, 0, 0).setName("Box 7")
		);
		Frame.add(new ModelRendererTurbo(Frame, 275, 244, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(11.5f, 2.5f, -6).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 270, 244, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(27, 2.5f, -6).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 265, 244, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-14, 2.5f, -6).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 141, 243, textureX, textureY).addBox(0, 0, 0, 15, 15, 0)
			.setRotationPoint(4, -5, 6).setRotationAngle(0, 0, 0).setName("Box 0")
		);
		Frame.add(new ModelRendererTurbo(Frame, 470, 242, textureX, textureY).addBox(0, 0, 0, 15, 15, 0)
			.setRotationPoint(19.5f, -5, 6).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		Frame.add(new ModelRendererTurbo(Frame, 133, 244, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 8, 1, 1, 0, null)
			.setRotationPoint(-29.5f, 2.5f, -6).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 323, 242, textureX, textureY).addBox(0, 0, 0, 15, 15, 0)
			.setRotationPoint(4, -5, -6).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 240, textureX, textureY).addBox(0, 0, 0, 15, 15, 0)
			.setRotationPoint(19.5f, -5, -6).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		Frame.add(new ModelRendererTurbo(Frame, 454, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.75f, 0, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 474, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-35.375f, -3.125f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 128, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-24.625f, -3.125f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-30, -4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 362, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -4.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 346, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 337, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 176, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-35.5f, -3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-34.5f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 462, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 135, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-27.5f, -3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 283, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-27.5f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 224, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-27.5f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 392, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f)
			.setRotationPoint(-35.375f, -3.125f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 123, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f)
			.setRotationPoint(-24.625f, -3.125f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 250, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-30, -4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 170, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -4.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 120, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 92, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-35.5f, -3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 496, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-34.5f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-33.5f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 49, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-27.5f, -3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 477, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-27.5f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 484, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-27.5f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 227, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-9.125f, -3.125f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 364, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-19.875f, -3.125f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 222, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-14.5f, -4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 458, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -4.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 421, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 406, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 11, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-12, -3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-12, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 411, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-12, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-20, -3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 325, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-19, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 404, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-18, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 264, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f)
			.setRotationPoint(-9.125f, -3.125f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 359, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f)
			.setRotationPoint(-19.875f, -3.125f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 217, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-14.5f, -4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -4.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 8, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 34, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-12, -3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-12, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(-12, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 49, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(-20, -3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 430, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(-19, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 383, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(-18, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 194, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(5.625f, -3.125f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 354, 242, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(16.375f, -3.125f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 189, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(11, -4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -4.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 362, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 346, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 11, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(5.5f, -3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 337, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(6.5f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 376, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(7.5f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(13.5f, -3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 170, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(13.5f, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(13.5f, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 184, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f)
			.setRotationPoint(5.625f, -3.125f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 502, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f)
			.setRotationPoint(16.375f, -3.125f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 162, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(11, -4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -4.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 496, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(5.5f, -3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 477, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(6.5f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 362, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(7.5f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 487, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(13.5f, -3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 458, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(13.5f, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 350, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(13.5f, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 157, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(31.875f, -3.125f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 152, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(21.125f, -3.125f, -5.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 147, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(26.5f, -4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 325, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.5f, -4.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.5f, -3.875f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 60, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.5f, -3.375f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 250, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(29, -3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 430, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(29, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 343, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(29, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 101, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(21, -3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(22, -3.25f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 171, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(23, -2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 142, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0.375f, -0.375f, -0.5f, 0.375f)
			.setRotationPoint(31.875f, -3.125f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 137, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f)
			.setRotationPoint(21.125f, -3.125f, 4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 132, 235, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(26.5f, -4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 362, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.5f, -4.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 743cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 346, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.5f, -3.875f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 749cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 337, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.5f, -3.375f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 755cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 375, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(29, -3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(29, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 14, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(29, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.875f, 0, 0, 0.25f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0.25f, 0)
			.setRotationPoint(21, -3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 740cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 217, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5625f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(22, -3.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 745cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 7, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.375f, 0)
			.setRotationPoint(23, -2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 751cp")
		);
		groups.add(Frame);
	}

	private final void initGroup_Rest_of_locomotive(){
		TurboList Rest_of_locomotive = new TurboList("Rest_of_locomotive");
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-38, -16, -9).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 3, 18, 0, 9, 0, -1, 0, 0, -1, 0, 0, -1, 9, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38, -19, -9).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 18, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38, -14, -9).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 57, textureX, textureY).addBox(0, 0, 0, 93, 1, 18)
			.setRotationPoint(-37, -15, -9).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 223, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 103, 2, 16, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -21, -8).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 176, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 16, 0, 0, 0, -3, -4, 0, -1.2f, -4, 0, -1.2f, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-59, -20, -8).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 424, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 3, 16, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3)
			.setRotationPoint(-59, -19, -8).setRotationAngle(0, 0, 0).setName("Box 24")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 195, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, -1, 0, 0, -1, 0, 0, -1, 9, 0, -1)
			.setRotationPoint(-38, -13, 6).setRotationAngle(0, 0, 0).setName("Box 25")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 303, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 3, 16, 0, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-59, -13, -8).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 381, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 16, 0, 0, 0, -3, 8, 0, 1, 8, 0, 1, 0, 0, -3, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3)
			.setRotationPoint(-59, -16, -8).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 92, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 16, 0, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3, 0, 0, -3, 8, 0, 1, 8, 0, 1, 0, 0, -3)
			.setRotationPoint(-59, -14, -8).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 49, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 16, 0, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3)
			.setRotationPoint(-59, -15, -8).setRotationAngle(0, 0, 0).setName("Box 31")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 77, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 16, 0, 0, 0, -1.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1.2f, 0, -1, -1.2f, 0, 0, 0, 0, 0, 0, 0, -1, -1.2f)
			.setRotationPoint(-51, -20, -8).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 2, 12, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -23, -6).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 14, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f)
			.setRotationPoint(-51, -21, -7).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 328, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 10, 0, 0, 0, -1, -8, 0, -1, -8, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 1.8f, 0, 0, 1.8f, 0, 0, 0)
			.setRotationPoint(-59, -21, -5).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 385, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 10, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, -1, -1, 0, 0, 1.8f, 0, 0, 1.8f, 0, -1, -1)
			.setRotationPoint(-59, -21, -5).setRotationAngle(0, 0, 0).setName("Box 47")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 344, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 8, 0, 0, -0.5f, -2.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -2.5f, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0)
			.setRotationPoint(-59, -23, -4).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 227, 25, textureX, textureY).addBox(0, 0, 0, 108, 4, 5)
			.setRotationPoint(-53, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 245, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 121, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-53, -6.5f, -11).setRotationAngle(0, 0, 0).setName("Box 56")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 114, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 22, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 459, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 7, 22, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -9.5f, -11).setRotationAngle(0, 0, 0).setName("Box 59")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 135, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 16, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-59, -10, -8).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 259, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 10, 0, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f)
			.setRotationPoint(-65, -20, -5).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-66, -20, -1.5f).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 182, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, 1, 0, 0, 1, 0, 0, -1, 0, -1)
			.setRotationPoint(-66, -16, -1.5f).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 437, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 10, 0, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f, -1, 0, -3.5f, 0, 0, 0, 0, 0, 0, -1, 0, -3.5f)
			.setRotationPoint(-65, -16, -5).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 424, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, 1, 0, 0.25f, 1, 0, 0.25f, -0.5f, 0, -1)
			.setRotationPoint(-65, -11, -1.5f).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 485, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0.5f, 0, -1, -1, 0, 0.25f, -1, 0, 0.25f, 0.5f, 0, -1, -2, 0, -1, 1, 0, 1.5f, 1, 0, 1.5f, -2, 0, -1)
			.setRotationPoint(-64, -10, -1.5f).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 485, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -1, 0, 0.25f, 3, 0, 3.5f, 3, 0, 3.5f, -1, 0, 0.25f, -3, 0, 1.5f, 1, 0, 1.5f, 1, 0, 1.5f, -3, 0, 1.5f)
			.setRotationPoint(-64, -10, -1.5f).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 185, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f, -1, 0, -3.25f, 0, 0, 0, 0, 0, 0, -1, 0, -3.25f)
			.setRotationPoint(-64, -11, -5).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 198, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -1, 1.5f, 0, 0, 3.5f, 0, 0, 3.5f, 0, -1, 1.5f, 0, 0, 1.5f, 0, 0, 3.5f, 0, 0, 3.5f, 0, 0, 1.5f)
			.setRotationPoint(-61, -10, -1.5f).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 84, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 10, 0, -1, 0, -3.5f, 0, 0, -1, 0, 0, -1, -1, 0, -3.5f, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f)
			.setRotationPoint(-65, -21, -5).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 388, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.375f, -0.25f, -1, 1, 0, 0, 1, 0, 0, -0.375f, -0.25f, -1, -0.375f, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.75f)
			.setRotationPoint(-66, -21, -1.5f).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 414, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 4, 0, 0, -1.25f, -1.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1.25f, -1.25f, 0, 0, -0.5f, 0, 0, 2, 0, 0, 2, 0, 0, -0.5f)
			.setRotationPoint(-64, -23, -2).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 501, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.375f, -1.125f, -1, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.375f, -1.125f, -1, -0.375f, 0.25f, -1, 0, 0, 0, 0, 0, 0, -0.375f, 0.25f, -1)
			.setRotationPoint(-66, -22, -1.5f).setRotationAngle(0, 0, 0).setName("Box 80")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 444, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 4, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f)
			.setRotationPoint(-64, -8.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 500, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, -0.25f, -1.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -1.1f, 0, 0, -1.1f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.1f)
			.setRotationPoint(-65, -8.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 412, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 4, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f)
			.setRotationPoint(-64, -8.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 198, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, -0.25f, -1.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -1.1f, 0, 0, -1.1f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.1f)
			.setRotationPoint(-65, -8.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 121, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -6.5f, 10).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 324, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-61, -8.5f, -3).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 281, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 12, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-60, -8.5f, -6).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 483, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, -1, -1, 0, 1.5f, -1, 0, 1.5f, 0, 0, -1, -1, -0.5f, -0.5f, 0, -0.5f, 1.5f, 0, -0.5f, 1.5f, -1, -0.5f, -0.5f)
			.setRotationPoint(-62, -9, -1.5f).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 82, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 12, 0, 1, -0.5f, -3, -5, -0.5f, -1, -5, -0.5f, -1, 1, -0.5f, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-60, -9.5f, -6).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 391, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 12, 0, 0, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -1, -5, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -5, -0.5f, 0)
			.setRotationPoint(-59, -9, -6).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 232, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 4, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 412, 35, textureX, textureY).addBox(0, 0, 0, 24, 2, 22)
			.setRotationPoint(-70, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 153, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(13, 5, 22)
			.setCorners(0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(5, new float[]{ 70.0f, 22.0f, 57.0f, 21.0f, 57.0f, 27.0f, 70.0f, 27.0f })
			.setPolygonUV(4, new float[]{ 35.0f, 21.0f, 22.0f, 22.0f, 22.0f, 27.0f, 35.0f, 27.0f }).build()
			.setRotationPoint(-70, -3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 320, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 22, 0, 0, 0, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -3, -1.25f, 0, -3, -1.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-70, -5.25f, -11).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 397, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 21, 0, 0, 0, -1, 0, 1.5f, -1, 0, 1.5f, -1, 0, 0, -1, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(-70, -6.25f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 183, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 19, 0, -0.5f, 0, -7.5f, 0, 1.5f, -5.5f, 0, 1.5f, -5.5f, -0.5f, 0, -7.5f, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(-70, -7.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 22, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-71, -3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 27, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 20, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -0.25f, -2, 0, 0, 0, 0, 0, 0, 0, -0.25f, -2)
			.setRotationPoint(-72, -0.5f, -10).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 253, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 4, 0, 0, 0, 0, -4, 0, 6, -4, 0, 6, 0, 0, 0, 0, -0.25f, 0, -4, -0.25f, 6, -4, -0.25f, 6, 0, -0.25f, 0)
			.setRotationPoint(-73, -0.5f, -2).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 4, 0, -0.5f, 0, 0, -3.5f, 0, 6, -3.5f, 0, 6, -0.5f, 0, 0, 0, 0, 0, -4, 0, 6, -4, 0, 6, 0, 0, 0)
			.setRotationPoint(-73, -4.5f, -2).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 21, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, -0.5f, 0, -6, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6)
			.setRotationPoint(-72.5f, -5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 201, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, -2.5f, 0.75f, -6, 1, -0.25f, 1.5f, 1, -0.25f, 1.5f, -2.5f, 0.75f, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6)
			.setRotationPoint(-72, -6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 258, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 22, 0, 0, -1, -1.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -1.5f, 0, -0.25f, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1)
			.setRotationPoint(-71, -5.25f, -11).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 164, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 20, 0, -0.5f, 0, -2, 0, -1, 0, 0, -1, 0, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-72, -4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 373, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.5f, -2.5f, 0, 0.25f, -1, 0, 0.25f, -1, 0, -0.5f, -2.5f, 0, 0.75f, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.75f, -1)
			.setRotationPoint(-71, -6, -10.5f).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 454, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 20, 0, -1, 0, -2, 0, -1.25f, -2, 0, -1.25f, -0.5f, -1, 0, -2, -0.5f, -1, -2, 0, 0, -2, 0, 0, 0, -0.5f, -1, -2)
			.setRotationPoint(-72, -5.5f, -10).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 505, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -1, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-72, -5.5f, -10).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 166, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, -0.5f, -0.25f, -6, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -6)
			.setRotationPoint(-73, 4.25f, -8).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 450, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 22, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-70, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 211, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f, -0.25f, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, -0.25f, -0.5f, -1.5f)
			.setRotationPoint(-71, 4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 339, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0.25f, -2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, -2, -0.5f, -0.5f, -2.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, -0.5f, -0.5f, -2.5f)
			.setRotationPoint(-72, 4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 50, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 21, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-70, 4.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 312, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f)
			.setRotationPoint(-71, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 398, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0.25f, -2, 0, 0, 0, 0, 0, 0, 0, 0.25f, -2, 0, -0.25f, -2, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -2)
			.setRotationPoint(-72, 3.5f, -10).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 285, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-70, 5, -9).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 423, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 18, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, -2, -1, 0, -0.75f, -1, 0, -0.75f, 1, 0, -2)
			.setRotationPoint(-71, 5, -9).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 290, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 16, 0, 0.5f, 0, -8, 0, 0, 0, 0, 0, 0, 0.5f, 0, -8, 2, 0, -8, -1, 0, -1, -1, 0, -1, 2, 0, -8)
			.setRotationPoint(-72, 5, -8).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 364, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 18, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -0.75f, 1, 0, 0, 1, 0, 0, 0, 0, -0.75f)
			.setRotationPoint(-71, 5, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 176, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -12.5f, 10).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 487, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57, -18.5f, -11).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 288, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57, -17, -11).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 23, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(67, -17, -11).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 246, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(58, -17, -11).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 112, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58, -16.5f, -11).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58, -13.5f, -11).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 393, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58, -14, -11).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 240, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(62.25f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 235, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 487, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57, -18.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 134")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 230, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(67, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 225, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(62.25f, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 14, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58, -13.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(58, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 217, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58, -16.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58, -14, 10.75f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 281, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 2, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, -1.75f, 0, 0, -1.75f, -0.6f, 0, -1, 0.6f, 0, -1, 0.6f, 0, -0.75f, -0.6f, 0, -0.75f)
			.setRotationPoint(56.399994f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 25, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 2, 3, 0, 0, -0.5f, -2, 0.75f, -0.5f, -2, 0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, -1.15f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -2.75f, -1.15f, 0, -2.75f)
			.setRotationPoint(55.25f, -22.5f, -10).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 131, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 4, 0, 0, 0.5f, -3.25f, -0.4f, 0.5f, -3.25f, -0.4f, 0.25f, -0.75f, -0.2f, 0.25f, -0.75f, -1.85f, 0, 0, -0.4f, 0, 0, -0.4f, 0, -3.75f, -1.85f, 0, -3.75f)
			.setRotationPoint(53.399994f, -23, -8).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 446, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 10, 0, 0, 0, -3, -0.4f, 0, -3, -0.4f, 0, -3, 0, 0, -3, 0, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(53.399994f, -24, -5).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 107, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 11, 0, 0, 0, -10.5f, 0, 0, 0, 0, 0, -10.75f, 0, 0, 0, 0, 0, -10.5f, 0, 0, 0, 0, 0, -10.75f, 0, 0, 0)
			.setRotationPoint(51, -18.5f, -11).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 375, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 2, 0, 0, 0, -1.75f, 0.6f, 0, -1.75f, 0.6f, 0, 0, 0, 0, 0, -0.6f, 0, -0.75f, 0.6f, 0, -0.75f, 0.6f, 0, -1, -0.6f, 0, -1)
			.setRotationPoint(56.399994f, -20.5f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 362, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 9, 0, 0, 0, -8.4375f, -0.6f, 0, 1, -0.6f, 0, -9.75f, 0, 0, 0, 0, 0, -8.5f, 0, 0, 2, 0, 0, -10.75f, 0, 0, 0)
			.setRotationPoint(51, -20.5f, -9).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 166, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -0.5f, -0.5f, -1.75f, -0.5f, 7, -1.75f, -0.5f, -7.75f, 0, -0.5f, 0, 0, 0, -0.5f, -0.6f, 0, 9, -0.6f, 0, -9.75f, 0, 0, 0)
			.setRotationPoint(51, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 236, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 2, 3, 0, 0, -0.5f, -0.75f, 0.75f, -0.5f, -0.75f, 0.75f, -0.5f, -2, 0, -0.5f, -2, -1.15f, 0, -2.75f, 0.75f, 0, -2.75f, 0.75f, 0, 0, -1.15f, 0, 0)
			.setRotationPoint(55.25f, -22.5f, 7).setRotationAngle(0, 0, 0).setName("Box 154")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -0.5f, 0, -1.75f, -0.5f, -7.75f, -1.75f, -0.5f, 7, 0, -0.5f, -0.5f, 0, 0, 0, -0.6f, 0, -9.75f, -0.6f, 0, 9, 0, 0, -0.5f)
			.setRotationPoint(51, -22.5f, 0).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 324, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -0.5f, -0.5f, -3.6f, -0.5f, 3.75f, -3.35f, -0.75f, -4.75f, 0, -0.5f, 0, 0, 0, -0.5f, -1.75f, 0, 7, -1.75f, 0, -7.75f, 0, 0, 0)
			.setRotationPoint(51, -24, -1).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 166, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -0.5f, 0, -3.35f, -0.75f, -4.75f, -3.6f, -0.5f, 3.75f, 0, -0.5f, -0.5f, 0, 0, 0, -1.75f, 0, -7.75f, -1.75f, 0, 7, 0, 0, -0.5f)
			.setRotationPoint(51, -24, 0).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 84, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 4, 0, -0.2f, 0.25f, -0.75f, -0.4f, 0.25f, -0.75f, -0.4f, 0.5f, -3.25f, 0, 0.5f, -3.25f, -1.85f, 0, -3.75f, -0.4f, 0, -3.75f, -0.4f, 0, 0, -1.85f, 0, 0)
			.setRotationPoint(53.399994f, -23, 4).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(68, -18.5f, -11).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 324, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(68, -18.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 33, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 25, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(73, -18, -11).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 320, 145, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 2, 1)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setPolygonUV(4, new float[]{ 6.0f, 1.125f, 1.0f, 1.125f, 1.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(68, -4, -11).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 507, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 25, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(73, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 183, 144, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 2, 1)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setPolygonUV(5, new float[]{ 12.0f, 1.125f, 7.0f, 1.125f, 7.0f, 3.0f, 12.0f, 3.0f }).build()
			.setRotationPoint(68, -4, 10.75f).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 270, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(68, -18, -10.875f).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 211, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(68, -17, -10.875f).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 206, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(72, -17, -10.875f).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 344, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(68, -12.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 190, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(68, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 185, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(72, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 270, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(68, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 306, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(68.5f, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 404, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(68.5f, -2.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 174")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 40, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -7, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -7, -0.75f)
			.setRotationPoint(68, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 175")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 377, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, 0, 0, -1, 0, 0, -1, -0.75f, 0, -3, -0.75f)
			.setRotationPoint(67, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 467, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, 0, 0, -2, 0, 0, -2, -0.75f, 0, -3, -0.75f)
			.setRotationPoint(65, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 220, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -7, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -7, -0.75f)
			.setRotationPoint(68, -2.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 372, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, 0, 0, -1, 0, 0, -1, -0.75f, 0, -3, -0.75f)
			.setRotationPoint(67, -2.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 226, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, 0, 0, -2, 0, 0, -2, -0.75f, 0, -3, -0.75f)
			.setRotationPoint(65, -2.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 263, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(57, -3, -10.75f).setRotationAngle(0, 0, 0).setName("Box 181")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 198, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 95, 3, 11, 0, 0, -0.5f, -1, 0.5f, -0.5f, -0.75f, 0.5f, -0.5f, -0.75f, 0, -0.5f, -1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -24, -5.5f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 483, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 11, 0, 0, -0.5f, -3, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45, -24, -5.5f).setRotationAngle(0, 0, 0).setName("Box 183")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 7, 0, -0.25f, -0.5f, -3, 0, -0.5f, -1, 0, -0.5f, -1, -0.25f, -0.5f, -3, 2.5f, 0, 0, 0, 0, 2, 0, 0, 2, 2.5f, 0, 0)
			.setRotationPoint(-46, -24, -3.5f).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 75, 1, 15, 0, -0.15f, 0, -3, -0.0725f, 0, -3, -0.0725f, 0, -3, -0.15f, 0, -3, -4.05f, 0, 0, -0.0725f, 0, 0, -0.0725f, 0, 0, -4.05f, 0, 0)
			.setRotationPoint(-19.43f, -23, -7.5f).setRotationAngle(0, 0, 0).setName("Box 185")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 165, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 16, 0, -0.05f, -0.5f, -0.5f, -0.0725f, -0.5f, -0.5f, -0.0725f, -0.5f, -0.5f, -0.05f, -0.5f, -0.5f, -0.91875f, 0, 0, -0.0725f, 0, 0, -0.0725f, 0, 0, -0.91875f, 0, 0)
			.setRotationPoint(-15.43f, -22.5f, -8).setRotationAngle(0, 0, 0).setName("Box 186")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 324, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 3, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, -21.5f, -8).setRotationAngle(0, 0, 0).setName("Box 187")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 89, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 16, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4)
			.setRotationPoint(-21.5f, -21.5f, -8).setRotationAngle(0, 0, 0).setName("Box 188")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 427, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 16, 0, 0, 0, -4, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, 0, 0, -4, 0, -0.5f, -4, -0.0078125f, -0.5f, 0, -0.0078125f, -0.5f, 0, 0, -0.5f, -4)
			.setRotationPoint(-21.5f, -22, -8).setRotationAngle(0, 0, 0).setName("Box 189")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 375, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 14, 0, 0, 0, -6, -4.85f, 0, -2.5f, -4.85f, 0, -2.5f, 0, 0, -6, 0, 0, -2.95f, -0.95f, 0, 0.5f, -0.95f, 0, 0.5f, 0, 0, -2.95f)
			.setRotationPoint(-21.43f, -23, -7).setRotationAngle(0, 0, 0).setName("Box 190")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 209, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 95, 1, 10, 0, 0, 0, -3, 0.4f, 0, -3, 0.4f, 0, -3, 0, 0, -3, 0, -0.5f, -0.5f, 0.4f, -0.5f, -0.25f, 0.4f, -0.5f, -0.25f, 0, -0.5f, -0.5f)
			.setRotationPoint(-42, -24, -5).setRotationAngle(0, 0, 0).setName("Box 191")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 355, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, -4, 0, 0, -3, 0, 0, -3, 0, 0, -4, 0, -0.5f, -2.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -2.5f)
			.setRotationPoint(-45, -24, -5).setRotationAngle(0, 0, 0).setName("Box 192")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 505, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1.25f, -0.5f, 2, -1.25f, -0.5f, 2, 0, -0.5f, 0)
			.setRotationPoint(-45.75f, -24, -0.5f).setRotationAngle(0, 0, 0).setName("Box 193")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 339, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 21, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0.4f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-5.5f, -3, -10.5f).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 202, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 5, 15, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, -3.5f, -0.1875f, 0, -1.5f, -1, 0, -1.5f, -1, 0, -3.5f, -0.1875f, 0)
			.setRotationPoint(36, -2.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 101, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 7, 19, 0, -2, -3.5f, 0, 0, -6, 0, 0, -6, 0, -2, -3.5f, 0, -4.5f, 0, 0, 0, -1, 0, 0, -1, 0, -4.5f, 0, 0)
			.setRotationPoint(31, -8.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 7, 19, 0, -4.5f, -6, 0, 0, -5, 0, 0, -5, 0, -4.5f, -6, 0, -4.5f, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -4.5f, 0, 0)
			.setRotationPoint(31, -7.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 400, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 7, 20, 0, -4.5f, -6.5f, 0, -0.5f, -5, 0, -0.5f, -5, 0, -4.5f, -6.5f, 0, -4.5f, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -4.5f, 0, 0)
			.setRotationPoint(30.75f, -7, -10).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 3, 21, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-53, -6.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 400, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.25f, -0.14999962f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 262")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 107, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, -0.45f, 0, 0, -0.45f, 0, 0, 0, 0)
			.setRotationPoint(-28.25f, -0.14999962f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 263")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 327, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-25, -1.3000002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 226, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-25, -2.5500002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 353, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-26, -1.3000002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 266")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 144, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-25.5f, -2.5500002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 267")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 198, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.25f, -0.14999962f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 283")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 107, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, -0.45f, 0, 0, -0.45f, 0, 0, 0, 0)
			.setRotationPoint(-28.25f, -0.14999962f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 285")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 176, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-25, -1.3000002f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 286")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 101, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-25, -2.5500002f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 287")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 58, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-26, -1.3000002f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 288")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 373, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-25.5f, -2.5500002f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 289")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 388, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.35f, -0.5f, 0, 0.35f, -0.5f, 0, 0.35f, 0, 0, 0.35f, 0, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, 0, 0.9f, 0.35f)
			.setRotationPoint(-34, 1.5f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 290")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 92, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -1, -0.1f, 0.35f, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f)
			.setRotationPoint(-34, 0.75f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 291")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 451, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f, -1, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -1, -0.5f, 0.35f)
			.setRotationPoint(-34, 3.1499996f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 292")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 75, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.35f, -0.75f, -1.25f, 0.35f, -0.75f, -1.25f, 0.35f, 0, 0.15f, 0.35f, 0, 1.65f, 0.35f, -0.75f, 0.25f, 0.35f, -0.75f, 0.25f, 0.35f, 0, 1.65f, 0.35f)
			.setRotationPoint(-31.5f, 1, 7.75f).setRotationAngle(0, 0, 0).setName("Box 293")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 236, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-30, 6, 6.125f).setRotationAngle(0, 0, 0).setName("Box 307")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 414, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-30, 5.25f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 363, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-30, 6.75f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 481, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, 0, 0.15f, 0, 0.5f, 0.15f, 0, 0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.75f, -0.14999962f, -9).setRotationAngle(0, 0, 0).setName("Box 300")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 497, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, -0.45f, 0, 0, -0.45f, 0, 0, 0, 0)
			.setRotationPoint(12.25f, -0.14999962f, -9).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 373, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(15.5f, -1.3000002f, -9).setRotationAngle(0, 0, 0).setName("Box 302")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 15, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(15.5f, -2.5500002f, -9).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 15, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(14.5f, -1.3000002f, -9).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(15, -2.5500002f, -9).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 52, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 18, 0, 3, 0, 0, 0, 0, 0, 0, 0, -0.5f, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-39.25f, -1.3000002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 328")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 501, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.25f, -3.3000002f, -9).setRotationAngle(0, 0, 0).setName("Box 329")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 88, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(11, 2.25f, -9.85f).setRotationAngle(0, 0, 0).setName("Box 335")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 10, 55, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 1, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(9, 2.5f, -10.1f).setRotationAngle(0, 0, 6).setName("Box 336")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 50, 208, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(4.34375f, -2, -10.1f).setRotationAngle(0, 0, -8).setName("Box 337")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 202, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(9.400002f, -2.6499996f, -9.85f).setRotationAngle(0, 0, 0).setName("Box 338")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 197, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(3.949997f, -2, -9.85f).setRotationAngle(0, 0, 0).setName("Box 339")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 192, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(3.8499985f, -2.6999998f, -9.85f).setRotationAngle(0, 0, 0).setName("Box 342")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 483, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.75f, -2.3000002f, -9).setRotationAngle(0, 0, 0).setName("Box 343")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 333, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(0.75f, -0.14999962f, -9).setRotationAngle(0, 0, 0).setName("Box 345")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 1, 1, 0, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-46, -19.6f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 346")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 1, 1, 0, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-46, -19.6f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 347")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 483, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, 2.1f, 0, -0.4f, -2.9f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, 2.1f, 0, -0.4f, -2.9f, 0, -0.4f, -0.4f)
			.setRotationPoint(-59, -16.6f, -5.75f).setRotationAngle(0, 0, 0).setName("Box 348")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 483, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -2.9f, 0, -0.4f, 2.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -2.9f, 0, -0.4f, 2.1f, 0, -0.4f, -0.4f)
			.setRotationPoint(-59, -16.6f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 349")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 166, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, 3.8f, 0, -0.4f, -4.6f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, 3.8f, 0, -0.4f, -4.6f, 0, -0.4f, -0.4f)
			.setRotationPoint(-65, -11.6f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 350")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -4.6f, 0, -0.4f, 3.8f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -4.6f, 0, -0.4f, 3.8f, 0, -0.4f, -0.4f)
			.setRotationPoint(-65, -11.6f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 351")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 187, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4f, -1, -0.5f, -0.4f, 0.1f, -0.5f, -0.4f, -0.9f, -0.2f, -0.4f, 0, 0, -0.4f, -1, -0.5f, -0.4f, 0.1f, -0.5f, -0.4f, -0.9f, -0.2f, -0.4f, 0)
			.setRotationPoint(-65.5f, -11.6f, -1).setRotationAngle(0, 0, 0).setName("Box 352")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 456, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.4f, 0, -0.5f, -0.4f, -0.9f, -0.5f, -0.4f, 0.1f, 0, -0.4f, -1, -0.2f, -0.4f, 0, -0.5f, -0.4f, -0.9f, -0.5f, -0.4f, 0.1f, 0, -0.4f, -1)
			.setRotationPoint(-65.5f, -11.6f, 0).setRotationAngle(0, 0, 0).setName("Box 353")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 462, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.35f, -0.5f, 0, 0.35f, -0.5f, 0, 0.35f, 0, 0, 0.35f, 0, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, 0, 0.9f, 0.35f)
			.setRotationPoint(8, 1.5f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 503, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -1, -0.1f, 0.35f, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f)
			.setRotationPoint(8, 0.75f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 371")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 481, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f, -1, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -1, -0.5f, 0.35f)
			.setRotationPoint(8, 3.1499996f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 372")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 451, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.35f, -0.75f, -1.25f, 0.35f, -0.75f, -1.25f, 0.35f, 0, 0.15f, 0.35f, 0, 1.65f, 0.35f, -0.75f, 0.25f, 0.35f, -0.75f, 0.25f, 0.35f, 0, 1.65f, 0.35f)
			.setRotationPoint(10.5f, 1, -8.75f).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 421, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58.5f, -11.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box 383")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 236, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58.5f, -11.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 384")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 187, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, -21.3f, -8.1f).setRotationAngle(0, 0, 0).setName("Box 385")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 236, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, -21.3f, 8.1f).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 217, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.5f, 6, -9.75f).setRotationAngle(0, 0, 0).setName("Box 387")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.5f, 6, 8.75f).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 333, 145, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(50, -24.25f, 0).setRotationAngle(0, 0, 0).setName("Box 389")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 354, 203, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(43, -24.25f, -3).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 349, 203, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(38, -24.25f, -3).setRotationAngle(0, 0, 0).setName("Box 391")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 344, 203, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(38, -24.25f, 2).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 227, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.25f, -3.3000002f, 7).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 339, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(-40, 2.25f, 8.85f).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 329, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(-14, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 324, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(-29.5f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 475, 75, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 17, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.5f, 2.5f, 7.8f).setRotationAngle(0, 0, 13).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 475, 72, textureX, textureY)
			.addShapeBox(0, -1.125f, 0, 17, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-31.5f, 2.5f, 7.8f).setRotationAngle(0, 0, 13).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 475, 69, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 17, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-31.5f, 2.5f, 7.8f).setRotationAngle(0, 0, 13).setName("Box 306cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 502, 221, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 0.5f, 0.5f, 2, null)
			.setRotationPoint(-50.5f, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 319, 213, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 5, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-41, -1.75f, 8.6f).setRotationAngle(0, 0, -19.375f).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 64, 202, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f)
			.setRotationPoint(-41, -1.75f, 9).setRotationAngle(0, 0, -19.375f).setName("Box 398cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39.5f, 2.5f, 8.6f).setRotationAngle(0, 0, -4.125f).setName("Box 396cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 10, 126, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 10, 1, 1, 2, null)
			.setRotationPoint(-66.5f, -19, 0).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 292, 180, textureX, textureY).addCylinder(0, 0, 0, 2, 7, 12, 1.25f, 1.25f, 2, null)
			.setRotationPoint(-52.5f, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 283, 180, textureX, textureY).addCylinder(0, 0, 0, 2, 7, 12, 1.25f, 1.25f, 2, null)
			.setRotationPoint(-6, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 300, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 7, 8, 1, 1, 2, null)
			.setRotationPoint(-6, -0.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 136, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-14, 6.5f, 7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 131, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(11.5f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 249, 208, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 16, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, 2.5f, 7.8f).setRotationAngle(0, 0, 13).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 249, 205, textureX, textureY)
			.addShapeBox(0, -1.125f, 0, 16, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(10.5f, 2.5f, 7.8f).setRotationAngle(0, 0, 13).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 50, 194, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 16, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(10.5f, 2.5f, 7.8f).setRotationAngle(0, 0, 13).setName("Box 306cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 109, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(27, 6.5f, 7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(11, 6, 6.125f).setRotationAngle(0, 0, 0).setName("Box 307cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 220, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11, 5.25f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 308cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 142, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11, 6.75f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 309cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 57, 206, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(27, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 300, 205, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 2, null)
			.setRotationPoint(-35, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 314, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 11, 8, 0.5f, 0.5f, 2, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-4, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 295, 205, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 2, null)
			.setRotationPoint(7, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 240, 204, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(-29.5f, 6.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 475, 66, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 17, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.5f, 2.5f, -8.8f).setRotationAngle(0, 0, 13).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 475, 63, textureX, textureY)
			.addShapeBox(0, -1.125f, 0, 17, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-31.5f, 2.5f, -8.8f).setRotationAngle(0, 0, 13).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 475, 60, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 17, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-31.5f, 2.5f, -8.8f).setRotationAngle(0, 0, 13).setName("Box 306cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 208, 204, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-14, 6.5f, -9).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 102, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-30, 6, -7.125f).setRotationAngle(0, 0, 0).setName("Box 307cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 183, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-30, 5.25f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 308cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 183, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-30, 6.75f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 309cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 469, 203, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(-14, 6.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 295, 212, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 5, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-41, -1.75f, -10.1125f).setRotationAngle(0, 0, -19.375f).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 487, 201, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f)
			.setRotationPoint(-41, -1.75f, -9.68125f).setRotationAngle(0, 0, -19.375f).setName("Box 398cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 446, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39.5f, 2.5f, -10.1125f).setRotationAngle(0, 0, -4.125f).setName("Box 396cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 503, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.35f, -0.5f, 0, 0.35f, -0.5f, 0, 0.35f, 0, 0, 0.35f, 0, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, 0, 0.9f, 0.35f)
			.setRotationPoint(-34, 1.5f, -8.775001f).setRotationAngle(0, 0, 0).setName("Box 290cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 481, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -1, -0.1f, 0.35f, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f)
			.setRotationPoint(-34, 0.75f, -8.775001f).setRotationAngle(0, 0, 0).setName("Box 291cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 503, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f, -1, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -1, -0.5f, 0.35f)
			.setRotationPoint(-34, 3.1499996f, -8.775001f).setRotationAngle(0, 0, 0).setName("Box 292cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 482, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.35f, -0.75f, -1.25f, 0.35f, -0.75f, -1.25f, 0.35f, 0, 0.15f, 0.35f, 0, 1.65f, 0.35f, -0.75f, 0.25f, 0.35f, -0.75f, 0.25f, 0.35f, 0, 1.65f, 0.35f)
			.setRotationPoint(-31.5f, 1, -8.775001f).setRotationAngle(0, 0, 0).setName("Box 293cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 389, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(-40, 2.25f, -9.8625f).setRotationAngle(0, 0, 0).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 497, 221, textureX, textureY).addCylinder(0, 0, 0, 1, 16, 8, 0.5f, 0.5f, 2, null)
			.setRotationPoint(-50.5f, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 506, 200, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 2, null)
			.setRotationPoint(-35, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 95, 180, textureX, textureY).addCylinder(0, 0, 0, 2, 7, 12, 1.25f, 1.25f, 2, null)
			.setRotationPoint(-52.5f, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 501, 200, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(11.5f, 6.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 25, 187, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 16, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, 2.5f, -8.7f).setRotationAngle(0, 0, 13).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 397, 182, textureX, textureY)
			.addShapeBox(0, -1.125f, 0, 16, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(10.5f, 2.5f, -8.7f).setRotationAngle(0, 0, 13).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 217, 171, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 16, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(10.5f, 2.5f, -8.7f).setRotationAngle(0, 0, 13).setName("Box 306cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 178, 203, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 2, 8, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(27, 6.5f, -9).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 183, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(11, 6, -7.125f).setRotationAngle(0, 0, 0).setName("Box 307cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 183, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11, 5.25f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 308cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 183, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11, 6.75f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 309cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 496, 200, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.125f, 1.125f, 0, new Vec3f(0.0, 0.0, 0.25))
			.setRotationPoint(27, 6.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 309, 213, textureX, textureY).addCylinder(0, 0, 0, 1, 11, 8, 0.5f, 0.5f, 2, new Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(-4, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 477, 200, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.75f, 0.75f, 2, null)
			.setRotationPoint(7, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 481, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.35f, -0.5f, 0, 0.35f, -0.5f, 0, 0.35f, 0, 0, 0.35f, 0, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, 0, 0.9f, 0.35f)
			.setRotationPoint(8, 1.5f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 370cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 410, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -1, -0.1f, 0.35f, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f)
			.setRotationPoint(8, 0.75f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 371cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 502, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f, -1, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -1, -0.5f, 0.35f)
			.setRotationPoint(8, 3.1499996f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 372cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 148, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.35f, -0.75f, -1.25f, 0.35f, -0.75f, -1.25f, 0.35f, 0, 0.15f, 0.35f, 0, 1.65f, 0.35f, -0.75f, 0.25f, 0.35f, -0.75f, 0.25f, 0.35f, 0, 1.65f, 0.35f)
			.setRotationPoint(10.5f, 1, 7.75f).setRotationAngle(0, 0, 0).setName("Box 373cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 507, 207, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 5, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(10, -1.75f, -10.1125f).setRotationAngle(0, 0, -19.375f).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 228, 192, textureX, textureY)
			.addShapeBox(-0.5f, 0.25f, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f)
			.setRotationPoint(10, -1.75f, -9.68125f).setRotationAngle(0, 0, -19.375f).setName("Box 398cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 166, 120, textureX, textureY)
			.addShapeBox(-5, -0.5f, 0, 5, 1, 1, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(9.5f, -2.1125002f, -10.1f).setRotationAngle(0, 0, -7).setName("Box 340cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 109, 203, textureX, textureY).addCylinder(0, 0, 0, 1, 7, 8, 1, 1, 2, null)
			.setRotationPoint(-6, -0.75f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 119, textureX, textureY)
			.addShapeBox(-5, -0.5f, 0, 5, 1, 1, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(9.5f, -2.8000002f, -10.1f).setRotationAngle(0, 0, -7).setName("Box 340cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 469, 196, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 5, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(10, -1.75f, 8.578125f).setRotationAngle(0, 0, -19.375f).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 179, 192, textureX, textureY)
			.addShapeBox(-0.5f, 0.25f, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f)
			.setRotationPoint(10, -1.75f, 9.009376f).setRotationAngle(0, 0, -19.375f).setName("Box 398cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 499, 13, textureX, textureY)
			.addShapeBox(-5, -0.5f, 0, 5, 1, 1, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(9.5f, -2.1125002f, 8.590625f).setRotationAngle(0, 0, -7).setName("Box 340cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 499, 10, textureX, textureY)
			.addShapeBox(-5, -0.5f, 0, 5, 1, 1, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(9.5f, -2.8000002f, 8.590625f).setRotationAngle(0, 0, -7).setName("Box 340cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 438, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(11, 2.25f, 8.840625f).setRotationAngle(0, 0, 0).setName("Box 335cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 35, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 1, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(9, 2.5f, 8.590625f).setRotationAngle(0, 0, 6).setName("Box 336cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 17, 190, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(4.34375f, -2, 8.590625f).setRotationAngle(0, 0, -8).setName("Box 337cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 228, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(9.400002f, -2.6499996f, 8.840625f).setRotationAngle(0, 0, 0).setName("Box 338cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 179, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(3.949997f, -2, 8.840625f).setRotationAngle(0, 0, 0).setName("Box 339cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 170, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(3.8499985f, -2.6999998f, 8.840625f).setRotationAngle(0, 0, 0).setName("Box 342cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 485, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, 0, 0.15f, 0, 0.5f, 0.15f, 0, 0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(1.75f, -0.14999962f, 7).setRotationAngle(0, 0, 0).setName("Box 300cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 499, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, -0.45f, 0, 0, -0.45f, 0, 0, 0, 0)
			.setRotationPoint(12.25f, -0.14999962f, 7).setRotationAngle(0, 0, 0).setName("Box 301cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 505, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(15.5f, -1.3000002f, 7).setRotationAngle(0, 0, 0).setName("Box 302cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 393, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(15.5f, -2.5500002f, 7).setRotationAngle(0, 0, 0).setName("Box 303cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 505, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(14.5f, -1.3000002f, 7).setRotationAngle(0, 0, 0).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 14, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(15, -2.5500002f, 7).setRotationAngle(0, 0, 0).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 227, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.75f, -2.3000002f, 7).setRotationAngle(0, 0, 0).setName("Box 343cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(0.75f, -0.14999962f, 7).setRotationAngle(0, 0, 0).setName("Box 345cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 488, 158, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 7, 16, 1, 1, 2, null)
			.setRotationPoint(-6, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 409, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 21, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(35, -3.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 226cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 462, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 11, 0, 0, 0, 0, 0, 0, -10.75f, 0, 0, 0, 0, 0, -10.5f, 0, 0, 0, 0, 0, -10.75f, 0, 0, 0, 0, 0, -10.5f)
			.setRotationPoint(51, -18.5f, 0).setRotationAngle(0, 0, 0).setName("Box 149cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 481, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 9, 0, 0, 0, 0, -0.6f, 0, -9.75f, -0.6f, 0, 1, 0, 0, -8.4375f, 0, 0, 0, 0, 0, -10.75f, 0, 0, 2, 0, 0, -8.5f)
			.setRotationPoint(51, -20.5f, 0).setRotationAngle(0, 0, 0).setName("Box 152cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 394, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(52, -23.5f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 158cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 373, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(52, -23.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 158cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 422, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(55, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 486, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 2.578125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, 2.578125f)
			.setRotationPoint(55, -10.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 412, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -10.5f, 10).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 129, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 2.578125f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 2.578125f, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55, -10.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 21, textureX, textureY).addBox(0, 0, 0, 108, 4, 5)
			.setRotationPoint(-53, -10.5f, 6).setRotationAngle(0, 0, 0).setName("Box 55cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 267, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(56, -16, -9).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 228, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, -1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56, -19, -9).setRotationAngle(0, 0, 0).setName("Box 18cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 477, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, -2, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -2, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(56, -21, -8).setRotationAngle(0, 0, 0).setName("Box 22cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 485, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, -3, 0, -0.5f, -3.5f, 0, -0.5f, -3.5f, 0, 0, -3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(56, -23, -6).setRotationAngle(0, 0, 0).setName("Box 35cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 143, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 18, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56, -8, -9).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(56, -11, -9).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(56, -11, 2).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, -1, 0, 0, -1, 0, 0, -1, 9, 0, -1)
			.setRotationPoint(-38, -13, -9).setRotationAngle(0, 0, 0).setName("Box 25cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 410, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(53, -11.25f, -3.25f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -12.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 411, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(53, -11.25f, 2.25f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 373, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -7.75f, -4).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(53, -11.25f, -2).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 487, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(57, -12.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 375, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(68, -12.5f, -10.875f).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 148, 189, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 2, null)
			.setRotationPoint(56.5f, -12.25f, -1).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 148, 185, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 8, 1, 1, 2, null)
			.setRotationPoint(56.5f, -12.25f, 1).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 148, 182, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.75f, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 131, 182, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 65, 181, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 391, 168, textureX, textureY)
			.addShapeBox(0, 0, -0.75f, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 217, 57, textureX, textureY)
			.addShapeBox(0, 0.25f, -1, 1, 1, 2, 0, -0.75f, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 57, textureX, textureY)
			.addShapeBox(0, 0.25f, -1.25f, 1, 1, 2, 0, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.125f, -0.75f, -0.625f, -0.125f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.125f, -0.75f, 0, 0.125f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 10, 51, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 1, 2, 0, -0.75f, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 197, 166, textureX, textureY)
			.addShapeBox(0, 1.25f, -1, 1, 1, 1, 0, -0.75f, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, -1.125f, -0.75f, -0.25f, -1.125f, -0.75f, 0, 0.625f, 0, 0, 0.625f, 0, 0, -1.125f, -0.75f, 0, -1.125f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 435, 164, textureX, textureY)
			.addShapeBox(0, 2.25f, -1.5f, 1, 1, 1, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0.125f, 0.3125f, 0, 0.125f, 0.3125f, 0, 0.125f, -0.625f, -0.75f, 0.125f, -0.625f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 51, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.75f, 1, 3, 2, 0, -0.75f, 0, -1.25f, 0, 0, -1.25f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f, 0, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 146, 164, textureX, textureY)
			.addShapeBox(0, 1.25f, -1, 1, 1, 1, 0, -0.75f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.875f, -0.75f, -0.25f, -0.875f, -0.75f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.875f, -0.75f, -0.25f, -0.875f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 476, 167, textureX, textureY)
			.addShapeBox(0, 1, -1, 1, 3, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.25f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 60, 161, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.75f, 1, 1, 1, 0, -0.75f, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 196, 144, textureX, textureY)
			.addShapeBox(0, 2.25f, -1.125f, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 217, 35, textureX, textureY)
			.addShapeBox(0, 4, -1.125f, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 337, 139, textureX, textureY)
			.addShapeBox(0, 2.25f, 0.25f, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 35, textureX, textureY)
			.addShapeBox(0, 0.5f, -1.25f, 1, 1, 2, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.125f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0.375f, -0.75f, 0, 0.375f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 506, 124, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.25f, 1, 1, 1, 0, -0.75f, -0.25f, -1.125f, 0, -0.25f, -1.125f, 0, -0.25f, 0.375f, -0.75f, -0.25f, 0.375f, -0.75f, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0.625f, -0.75f, 0, 0.625f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 192, 102, textureX, textureY)
			.addShapeBox(0, 2.25f, 0.25f, 1, 1, 1, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0.125f, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, 0.3125f, -0.75f, 0.125f, 0.3125f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 10, 31, textureX, textureY)
			.addShapeBox(0, 1.25f, -1.5f, 1, 3, 2, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -1.25f, -0.75f, -0.25f, -1.25f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 507, 81, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.25f, 1, 1, 1, 0, -0.75f, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, 0.125f, -0.75f, -0.25f, 0.125f, -0.75f, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, 0.125f, -0.75f, -0.25f, 0.125f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 324, 118, textureX, textureY)
			.addShapeBox(0, 1, -0.25f, 1, 3, 1, 0, -0.75f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 429, 35, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.5f, 1, 1, 1, 0, -0.75f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, -1, -0.75f, -0.25f, -1, -0.75f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, -1, -0.75f, -0.25f, -1)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 449, 25, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.125f, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 31, textureX, textureY)
			.addShapeBox(0, 4, -1.125f, 1, 1, 2, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 227, 25, textureX, textureY)
			.addShapeBox(0, 2.25f, -1.5f, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 502, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(54, -11.25f, -2.25f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 502, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54, -11.25f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 446, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54, -8.75f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 446, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(54, -8.75f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 21, textureX, textureY)
			.addShapeBox(0, 3.5f, -1.5f, 1, 1, 1, 0, -0.75f, 0.125f, 0.3125f, 0, 0.125f, 0.3125f, 0, 0.125f, -0.625f, -0.75f, 0.125f, -0.625f, -0.75f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.625f, -0.75f, 0, -0.625f)
			.setRotationPoint(56.25f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 7, 6, textureX, textureY)
			.addShapeBox(0, 3.5f, 0.25f, 1, 1, 1, 0, -0.75f, 0.125f, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, 0.3125f, -0.75f, 0.125f, 0.3125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0.375f, -0.75f, 0, 0.375f)
			.setRotationPoint(56.25f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 446, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(54, -11.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(55, -5.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 181cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 299, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(55, -5.5f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 181cp")
		);
		groups.add(Rest_of_locomotive);
	}

	ModelPRRT1FrontBogie front = new ModelPRRT1FrontBogie();
	ModelPRRT1RearBogie rear = new ModelPRRT1RearBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3 ,f4 ,f5);

		front.render(entity, f, f1, f2, f3, f4, f5);
		rear.render(entity, f, f1, f2, f3, f4, f5);
	}
}
