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
public class ModelF40ph extends FVTMFormatBase {

	public ModelF40ph(){
		super();
		textureX = 512;
		textureY = 512;
		addToCreators("Riggs64");
		//
		initGroup_group00();
		initGroup_group01();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group00(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-34.625f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-36.625f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(-34.625f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(-36.625f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 1, textureX, textureY).addBox(0, 0, 0, 109, 1, 20)
			.setRotationPoint(-54.625f, -1.25f, -10).setRotationAngle(0, 0, 0).setName("Box 1120")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 11, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.625f, -1.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1121")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setRotationPoint(-57.625f, -1.25f, 0).setRotationAngle(0, 0, 0).setName("Box 1123")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 1, textureX, textureY).addBox(0, 0, 0, 19, 16, 9)
			.setRotationPoint(-32.625f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1125")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 3, 22, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, -20.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1126")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 33, textureX, textureY).addBox(0, 0, 0, 109, 2, 1)
			.setRotationPoint(-54.625f, -1.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1127")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 41, textureX, textureY).addBox(0, 0, 0, 109, 2, 1)
			.setRotationPoint(-54.625f, -1.25f, 10).setRotationAngle(0, 0, 0).setName("Box 1128")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 105, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-54.625f, -1.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1129")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 8, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1130")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(50.375f, -1.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1131")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 11, 8, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -12.75f, 3).setRotationAngle(0, 0, 0).setName("Box 1132")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -3, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(50.375f, -1.75f, 3).setRotationAngle(0, 0, 0).setName("Box 1133")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 9, textureX, textureY).addBox(0, 0, 0, 17, 9, 1)
			.setRotationPoint(-53.625f, -10.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1137")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-36.625f, -16.75f, -10.85f).setRotationAngle(0, 0, 0).setName("Box 1139")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-36.625f, -11.75f, -10.85f).setRotationAngle(0, 0, 0).setName("Box 1140")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-36.625f, -15.75f, -10.85f).setRotationAngle(0, 0, 0).setName("Box 1141")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-33.125f, -15.75f, -10.85f).setRotationAngle(0, 0, 0).setName("Box 1142")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3375f, 0, 0)
			.setRotationPoint(-44.625f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1143")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.125f, -15.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1145")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 1, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-36.625f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1147")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.125f, -15.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1148")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 11, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(-56.625f, -11.75f, -11).setRotationAngle(0, 0, 0).setName("Box 1149")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 17, textureX, textureY).addBox(0, 0, 0, 17, 9, 1)
			.setRotationPoint(-53.625f, -10.75f, 10).setRotationAngle(0, 0, 0).setName("Box 772")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-56.625f, -11.75f, 0).setRotationAngle(0, 0, 0).setName("Box 773")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.625f, -11.75f, 9.85f).setRotationAngle(0, 0, 0).setName("Box 774")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.625f, -15.75f, 9.85f).setRotationAngle(0, 0, 0).setName("Box 775")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.125f, -15.75f, 10).setRotationAngle(0, 0, 0).setName("Box 776")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.625f, -16.75f, 9.85f).setRotationAngle(0, 0, 0).setName("Box 777")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 9, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-36.625f, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box 778")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.125f, -15.75f, 10).setRotationAngle(0, 0, 0).setName("Box 781")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.125f, -15.75f, 9.85f).setRotationAngle(0, 0, 0).setName("Box 782")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 41, textureX, textureY).addBox(0, 0, 0, 4, 4, 22)
			.setRotationPoint(-36.625f, -5.75f, -11).setRotationAngle(0, 0, 0).setName("Box 784")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 11, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-57.625f, -1.75f, -11).setRotationAngle(0, 0, 0).setName("Box 789")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -3, -0.5f, 0)
			.setRotationPoint(-57.625f, -1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 790")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -2.855f, 0, 0, -0.142f, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-48.625f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 797")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 10, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -5, -1.25f, 0, -5, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setRotationPoint(-48.625f, -20.75f, 1).setRotationAngle(0, 0, 0).setName("Box 800")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, -0.2f, 0, -0.5f, -0.25f, 0, 0, -0.5f, 0, 0, -0.1f, 0.125f, -0.5f, -0.6f, 0.125f, -0.5f, -0.75f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-49.625f, -16.75f, -1).setRotationAngle(0, 0, 0).setName("Box 801")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.125f, -20.75f, -1).setRotationAngle(0, 0, 0).setName("Box 804")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 10, 0, -1.25f, 0, -5, 0, 0, -5, 0, 0, 0, 0.5f, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-48.625f, -20.75f, -11).setRotationAngle(0, 0, 0).setName("Box 805")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.2f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.6f, 0.125f, -0.5f, -0.1f, 0.125f, -0.5f)
			.setRotationPoint(-49.625f, -16.75f, 0).setRotationAngle(0, 0, 0).setName("Box 822")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-45.625f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 802")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 11, 0, -2.5f, -0.5f, -0.25f, 3.55f, -0.5f, -0.25f, 0.25f, 1, 0, 0.5f, 0.5f, 0, -2, 0, 0, 3.55f, 0, 0, 0.25f, 0, 0, 1, 0, 0)
			.setRotationPoint(-55.625f, -12.75f, -11).setRotationAngle(0, 0, 0).setName("Box 806")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 11, 0, 0.5f, 0.5f, 0, 0.25f, 1, 0, 3.55f, -0.5f, -0.25f, -2.5f, -0.5f, -0.25f, 1, 0, 0, 0.25f, 0, 0, 3.55f, 0, 0, -2, 0, 0)
			.setRotationPoint(-55.625f, -12.75f, 0).setRotationAngle(0, 0, 0).setName("Box 809")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.625f, -11.75f, -11).setRotationAngle(0, 0, 0).setName("Box 810")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 10, 10, 0, 0.5f, 0, 0, 0.25f, 0, 0, 3.2575f, 0, 0.025f, -2.5f, -0.5f, -0.25f, 1, 0, 0, 0.25f, 0, 0, 3.55f, 0, 0, -2, 0, 0)
			.setRotationPoint(-55.625f, -11.75f, 0).setRotationAngle(0, 0, 0).setName("Box 814")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 10, 10, 0, -2.5f, -0.5f, -0.25f, 3.2575f, 0, 0.025f, 0.25f, 0, 0, 0.5f, 0, 0, -2, 0, 0, 3.55f, 0, 0, 0.25f, 0, 0, 1, 0, 0)
			.setRotationPoint(-55.625f, -11.75f, -10).setRotationAngle(0, 0, 0).setName("Box 815")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 8, 0, 0, 0, -5, -1.25f, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -20.75f, -11).setRotationAngle(0, 0, 0).setName("Box 816")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 8, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -20.75f, 3).setRotationAngle(0, 0, 0).setName("Box 818")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 25, textureX, textureY).addBox(0, 0, 0, 3, 3, 6)
			.setRotationPoint(50.375f, -20.75f, -3).setRotationAngle(0, 0, 0).setName("Box 819")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 49, textureX, textureY).addBox(0, 0, 0, 3, 3, 6)
			.setRotationPoint(50.375f, -17.75f, -3).setRotationAngle(0, 0, 0).setName("Box 820")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.625f, -11.75f, -11).setRotationAngle(0, 0, 0).setName("Box 821")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.142f, 0, 0, -2.855f, 0, 0)
			.setRotationPoint(-48.625f, -17.75f, 1).setRotationAngle(0, 0, 0).setName("Box 822")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.625f, -11.75f, 10).setRotationAngle(0, 0, 0).setName("Box 823")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-45.625f, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box 824")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3375f, 0, 0)
			.setRotationPoint(-44.625f, -17.75f, 10).setRotationAngle(0, 0, 0).setName("Box 825")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.625f, -11.75f, 10).setRotationAngle(0, 0, 0).setName("Box 826")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 73, textureX, textureY).addBox(0, 0, 0, 13, 4, 20)
			.setRotationPoint(-49.625f, -5.75f, -10).setRotationAngle(0, 0, 0).setName("Box 827")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 25, textureX, textureY).addBox(0, 0, 0.15f, 1, 2, 2)
			.setRotationPoint(-46.625f, -13.73f, 3.8999996f).setRotationAngle(0, -10, 0).setName("Box 645")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 17, textureX, textureY).addBox(-0.04f, 0, 0, 1, 1, 1)
			.setRotationPoint(-44.625f, -11.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 25, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-42.875f, -11.75f, 3.25f).setRotationAngle(0, -162, 0).setName("Box 657")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.625f, -9.25f, 5).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-36.754997f, -13, 10).setRotationAngle(0, 180, -13).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.625f, -9.25f, -10).setRotationAngle(0, 0, 0).setName("Box 2015")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.15f, 0)
			.setRotationPoint(-36.754997f, -13, -5).setRotationAngle(0, 180, -13).setName("Box 2016")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.625f, -11.25f, 4).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.625f, -11.25f, -5).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 25, textureX, textureY)
			.addShapeBox(0, 0, 0.25f, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-41.125f, -11, 2.1f).setRotationAngle(0, -128, 0).setName("Box 921")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 25, textureX, textureY).addBox(-0.04f, 0, 0, 1, 1, 1)
			.setRotationPoint(-43.625f, -10.75f, 0.8000002f).setRotationAngle(0, 0, 0).setName("Box 922")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f)
			.setRotationPoint(-43.175003f, -12.75f, 1.25f).setRotationAngle(0, 0, -90).setName("Box 664")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 25, textureX, textureY).addBox(1.4f, 0, 1.05f, 1, 1, 1)
			.setRotationPoint(-48.125f, -13.5f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 25, textureX, textureY).addBox(2.5f, 0, 1.05f, 1, 1, 1)
			.setRotationPoint(-48.125f, -13.5f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 930")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 25, textureX, textureY).addBox(3.6f, 0, 1.05f, 1, 1, 1)
			.setRotationPoint(-48.125f, -13.5f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 931")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 25, textureX, textureY)
			.addShapeBox(-0.2f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-48.125f, -11.049999f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 933")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 25, textureX, textureY)
			.addShapeBox(0.5f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-48.125f, -11.049999f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 25, textureX, textureY)
			.addShapeBox(2.8f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -12.25f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 936")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 33, textureX, textureY)
			.addShapeBox(2.1f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -12.25f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 937")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 33, textureX, textureY)
			.addShapeBox(3.5f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -12.25f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 938")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 73, textureX, textureY).addBox(0, 0, 0, 6, 10, 2)
			.setRotationPoint(-48.125f, -13.75f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 914")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.6f, -0.75f, 0, -0.85f, -0.75f, -0.6f, 0.5f, 0, -0.6f, 0.5f, 0, -0.6f, -0.6f, -0.75f, -0.6f, -0.85f)
			.setRotationPoint(-43.175003f, -11.75f, 1.25f).setRotationAngle(0, 0, -90).setName("Box 1088")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.125f, -8.25f, 7).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.125f, -8.25f, -8.05f).setRotationAngle(0, 0, 0).setName("Box 930")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 41, textureX, textureY)
			.addShapeBox(3.05f, 1, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -11.25f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 1026")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 41, textureX, textureY)
			.addShapeBox(1.35f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -12.25f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 1027")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 41, textureX, textureY).addBox(-0.04f, 0, 0, 1, 1, 1)
			.setRotationPoint(-43.625f, -9.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 829")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 25, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-41.125f, -10, 2.25f).setRotationAngle(0, -141, 0).setName("Box 830")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 41, textureX, textureY).addBox(-0.04f, 0, 0, 1, 1, 1)
			.setRotationPoint(-45.625f, -9.75f, 2.8000002f).setRotationAngle(0, 0, 0).setName("Box 864")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 49, textureX, textureY).addBox(-0.04f, 0, 0, 1, 1, 1)
			.setRotationPoint(-45.625f, -10.75f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 865")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 57, textureX, textureY)
			.addShapeBox(0, 0, 0.5f, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-43.375f, -11, 4.25f).setRotationAngle(0, -149, 0).setName("Box 866")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 57, textureX, textureY)
			.addShapeBox(0, 0, 0.25f, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-43.125f, -10, 4.1000004f).setRotationAngle(0, -128, 0).setName("Box 867")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 57, textureX, textureY)
			.addShapeBox(-3, 0, 0.25f, 3, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.375f, -14.75f, -0.75f).setRotationAngle(0, 45, 0).setName("Box 924")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 57, textureX, textureY)
			.addShapeBox(-2.5f, 0, 1.3f, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.375f, -14.5f, -0.75f).setRotationAngle(0, 45, 0).setName("Box 932")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 57, textureX, textureY).addBox(0, 0, 0, 1, 6, 4)
			.setRotationPoint(-32.775f, -14.75f, -8.4f).setRotationAngle(0, 0, 0).setName("Box 934")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 57, textureX, textureY).addBox(0, 0, 0, 1, 6, 4)
			.setRotationPoint(-32.775f, -14.75f, 4.6000004f).setRotationAngle(0, 0, 0).setName("Box 935")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(-32.775f, -16.75f, -8.4f).setRotationAngle(0, 0, 0).setName("Box 936")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(-32.775f, -16.75f, 4.6000004f).setRotationAngle(0, 0, 0).setName("Box 937")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-33.225f, -10.75f, 7.8500004f).setRotationAngle(0, 0, 0).setName("Box 938")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-33.225f, -13.950001f, 7.8500004f).setRotationAngle(0, 0, 0).setName("Box 939")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-33.225f, -13.950001f, -5.15f).setRotationAngle(0, 0, 0).setName("Box 940")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-33.225f, -10.75f, -5.15f).setRotationAngle(0, 0, 0).setName("Box 941")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-33.225f, -12.25f, 4.3500004f).setRotationAngle(0, 0, 0).setName("Box 942")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-33.225f, -12.25f, -8.65f).setRotationAngle(0, 0, 0).setName("Box 943")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 8, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.375f, -1.25f, -11).setRotationAngle(0, 0, 0).setName("Box 852")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 8, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(54.375f, -1.25f, 3).setRotationAngle(0, 0, 0).setName("Box 853")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 73, textureX, textureY).addBox(0, 0, 0, 3, 2, 6)
			.setRotationPoint(54.375f, -1.25f, -3).setRotationAngle(0, 0, 0).setName("Box 854")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 73, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 10, 2, 10, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(37.375f, -21.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 723")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.375f, -21.85f, -4).setRotationAngle(0, 0, 0).setName("Box 726")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(41.375f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 727")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(41.375f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 728")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(41.375f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 729")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(41.375f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 730")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, 0, 0, 0)
			.setRotationPoint(42.375f, -21.85f, 0).setRotationAngle(0, 0, 0).setName("Box 864")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1)
			.setRotationPoint(38.375f, -21.85f, 0).setRotationAngle(0, 0, 0).setName("Box 865")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.375f, -21.85f, -4).setRotationAngle(0, 0, 0).setName("Box 866")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(31.875f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 867")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(31.875f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 868")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(31.875f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 869")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(31.875f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 870")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32.875f, -21.85f, -4).setRotationAngle(0, 0, 0).setName("Box 871")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, 0, 0, 0)
			.setRotationPoint(32.875f, -21.85f, 0).setRotationAngle(0, 0, 0).setName("Box 872")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1)
			.setRotationPoint(28.875f, -21.85f, 0).setRotationAngle(0, 0, 0).setName("Box 873")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.875f, -21.85f, -4).setRotationAngle(0, 0, 0).setName("Box 874")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 73, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 10, 2, 10, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.875f, -21.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 875")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(22.125f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 876")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(22.125f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 877")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(22.125f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 878")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(22.125f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 879")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.125f, -21.85f, -4).setRotationAngle(0, 0, 0).setName("Box 880")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, 0, 0, 0)
			.setRotationPoint(23.125f, -21.85f, 0).setRotationAngle(0, 0, 0).setName("Box 881")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1)
			.setRotationPoint(19.125f, -21.85f, 0).setRotationAngle(0, 0, 0).setName("Box 882")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.125f, -21.85f, -4).setRotationAngle(0, 0, 0).setName("Box 883")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 81, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 10, 2, 10, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.125f, -21.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 884")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 81, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 10, 2, 10, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.625f, -21.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 885")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.375f, -21.85f, -4).setRotationAngle(0, 0, 0).setName("Box 886")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.3f, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1)
			.setRotationPoint(0.375f, -21.85f, 0).setRotationAngle(0, 0, 0).setName("Box 887")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, 0, 0, 0)
			.setRotationPoint(4.375f, -21.85f, 0).setRotationAngle(0, 0, 0).setName("Box 888")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1)
			.setRotationPoint(3.375f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 889")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0.1f, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0, -1, 0, -1, 0, 0, -1, -0.2f, 0, -0.2f, -1, 0, 0)
			.setRotationPoint(3.375f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 890")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1)
			.setRotationPoint(3.375f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 891")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1, -1, 0.1f, -1, -1, 0, 0, -0.2f, 0, -0.2f, 0, 0, -1, -1, 0, -1, -1, 0, 0, -0.2f, 0, -0.2f)
			.setRotationPoint(3.375f, -21.85f, -1).setRotationAngle(0, 0, 0).setName("Box 892")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -0.3f, 0, -1.25f, -0.3f, -1, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.375f, -21.85f, -4).setRotationAngle(0, 0, 0).setName("Box 893")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 9, textureX, textureY).addBox(0, 0, -1.5f, 1, 2, 3)
			.setRotationPoint(13.375f, -21.25f, 0).setRotationAngle(0, 0, 0).setName("Box 897")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 57, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 2, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.875f, -22.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 898")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 81, textureX, textureY).addBox(0, 0, -1.5f, 10, 2, 10)
			.setRotationPoint(-18.375f, -21.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 899")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 89, textureX, textureY).addBox(0, 0, -1.5f, 10, 2, 10)
			.setRotationPoint(-29.375f, -21.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 900")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 89, textureX, textureY)
			.addShapeBox(0, 0, -1.5f, 9, 2, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(-28.875f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Box 901")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 73, textureX, textureY).addBox(0, 0, -1.5f, 2, 2, 5)
			.setRotationPoint(-11.875f, -21.75f, -1).setRotationAngle(0, 0, 0).setName("Box 902")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 97, textureX, textureY).addBox(0, 0, 0, 60, 16, 22)
			.setRotationPoint(-9.625f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 903")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 89, textureX, textureY).addBox(0, 0, 0, 4, 4, 22)
			.setRotationPoint(-13.625f, -17.75f, -11).setRotationAngle(0, 0, 0).setName("Box 904")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 81, textureX, textureY).addBox(0, 0, 0, 4, 12, 1)
			.setRotationPoint(-13.625f, -13.75f, -10.85f).setRotationAngle(0, 0, 0).setName("Box 905")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 81, textureX, textureY).addBox(0, 0, 0, 4, 12, 1)
			.setRotationPoint(-13.625f, -13.75f, 10).setRotationAngle(0, 0, 0).setName("Box 906")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 89, textureX, textureY).addBox(0, 0, 0, 1, 14, 6)
			.setRotationPoint(52.225f, -14.75f, -3).setRotationAngle(0, 0, 0).setName("Box 907")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 89, textureX, textureY).addBox(0, 0, 0, 6, 12, 1)
			.setRotationPoint(-6.625f, -13.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 911")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 8, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -17.75f, 3).setRotationAngle(0, 0, 0).setName("Box 912")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 11, 8, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -12.75f, -11).setRotationAngle(0, 0, 0).setName("Box 913")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, -1.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -14.75f, 3).setRotationAngle(0, 0, 0).setName("Box 914")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0.125f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -14.75f, 8).setRotationAngle(0, 0, 0).setName("Box 915")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0, -1.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.125f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -14.75f, -6).setRotationAngle(0, 0, 0).setName("Box 916")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -1, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -14.75f, -11).setRotationAngle(0, 0, 0).setName("Box 917")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -14.75f, -8).setRotationAngle(0, 0, 0).setName("Box 918")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -13.75f, -8).setRotationAngle(0, 0, 0).setName("Box 920")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -13.75f, 6).setRotationAngle(0, 0, 0).setName("Box 921")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(50.375f, -14.75f, 6).setRotationAngle(0, 0, 0).setName("Box 922")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(50.375f, -13.75f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 923")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(50.375f, -13.75f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 924")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(51.375f, -18.75f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 925")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.375f, -18.25f, 7).setRotationAngle(0, 0, 0).setName("Box 926")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.375f, -18.75f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 927")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.375f, -18.25f, -8).setRotationAngle(0, 0, 0).setName("Box 928")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 97, textureX, textureY).addBox(0, 0, 0, 3, 2, 4)
			.setRotationPoint(50.625f, -17.75f, -2).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(52.375f, -8.75f, -3).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(52.375f, -11.25f, 0).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.375f, -11.25f, -2).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.375f, -13.25f, -2).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.375f, -13.25f, 0).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-37.125f, -16, -12).setRotationAngle(0, 0, 0).setName("Box 286")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-37.125f, -2, -11.5f).setRotationAngle(0, 0, 0).setName("Box 287")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-37.125f, -16.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 288")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-33.625f, 0.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.187f, -0.5f, 0, 0.187f, -0.5f, 0, 0.187f, -0.5f, -0.5f, 0.187f, -0.5f, -0.5f, 0.16f, 0, 0, 0.16f, 0, 0, 0.16f, 0, -0.5f, 0.16f, 0, -0.5f)
			.setRotationPoint(-35.625f, 0.75f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.11f, -0.5f, 0, 0.11f, -0.5f, 0, 0.11f, -0.5f, -0.5f, 0.11f, -0.5f, -0.5f, 0.08f, 0, 0, 0.08f, 0, 0, 0.08f, 0, -0.5f, 0.08f, 0, -0.5f)
			.setRotationPoint(-35.625f, 2, -10.75f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0325f, -0.5f, 0, 0.0325f, -0.5f, 0, 0.0325f, -0.5f, -0.5f, 0.0325f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-35.625f, 3.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.625f, -16, -12).setRotationAngle(0, 0, 0).setName("Box 946")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.625f, -16.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 947")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.625f, -2, -11.5f).setRotationAngle(0, 0, 0).setName("Box 948")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-14.125f, -2.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 949")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.625f, -2.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 950")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.625f, -13.75f, -12).setRotationAngle(0, 0, 0).setName("Box 951")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-14.125f, -13.75f, -12).setRotationAngle(0, 0, 0).setName("Box 952")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-14.125f, -14.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 953")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.625f, -14.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 954")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.625f, -1.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.625f, -3.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 956")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.625f, -4.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 957")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.625f, -0.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 958")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.625f, -0.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 964")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.625f, -1.7399998f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 965")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 137, textureX, textureY).addBox(0, 0, 0, 109, 2, 12)
			.setRotationPoint(-54.625f, -0.25f, -6).setRotationAngle(0, 0, 0).setName("Box 966")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-33.625f, 0.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 969")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-36.625f, 0.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 970")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-13.625f, 0.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 971")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.187f, -0.5f, 0, 0.187f, -0.5f, 0, 0.187f, -0.5f, -0.5f, 0.187f, -0.5f, -0.5f, 0.16f, 0, 0, 0.16f, 0, 0, 0.16f, 0, -0.5f, 0.16f, 0, -0.5f)
			.setRotationPoint(-12.625f, 0.75f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 972")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-10.625f, 0.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 973")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.11f, -0.5f, 0, 0.11f, -0.5f, 0, 0.11f, -0.5f, -0.5f, 0.11f, -0.5f, -0.5f, 0.08f, 0, 0, 0.08f, 0, 0, 0.08f, 0, -0.5f, 0.08f, 0, -0.5f)
			.setRotationPoint(-12.625f, 2, -10.75f).setRotationAngle(0, 0, 0).setName("Box 974")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0325f, -0.5f, 0, 0.0325f, -0.5f, 0, 0.0325f, -0.5f, -0.5f, 0.0325f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-12.625f, 3.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 975")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.0325f, -0.5f, 0, 0.0325f, -0.5f, 0, 0.0325f, -0.5f, -0.5f, 0.0325f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-35.625f, 3.25f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 976")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.187f, -0.5f, 0, 0.187f, -0.5f, 0, 0.187f, -0.5f, -0.5f, 0.187f, -0.5f, -0.5f, 0.16f, 0, 0, 0.16f, 0, 0, 0.16f, 0, -0.5f, 0.16f, 0, -0.5f)
			.setRotationPoint(-35.625f, 0.75f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 977")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-36.625f, 0.25f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 978")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.11f, -0.5f, 0, 0.11f, -0.5f, 0, 0.11f, -0.5f, -0.5f, 0.11f, -0.5f, -0.5f, 0.08f, 0, 0, 0.08f, 0, 0, 0.08f, 0, -0.5f, 0.08f, 0, -0.5f)
			.setRotationPoint(-35.625f, 2, 10.25f).setRotationAngle(0, 0, 0).setName("Box 979")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-33.625f, 0.25f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 980")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-35.625f, -0.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 981")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-35.625f, -1.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 982")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-35.625f, -3.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 983")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-35.625f, -4.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 984")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-37.125f, -2, 11).setRotationAngle(0, 0, 0).setName("Box 985")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.625f, -2, 11).setRotationAngle(0, 0, 0).setName("Box 986")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-32.625f, -16, 11).setRotationAngle(0, 0, 0).setName("Box 987")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-37.125f, -16, 11).setRotationAngle(0, 0, 0).setName("Box 988")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-37.125f, -16.5f, 11).setRotationAngle(0, 0, 0).setName("Box 989")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.625f, -16.5f, 11).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 105, textureX, textureY).addBox(0, 0, 0, 6, 12, 1)
			.setRotationPoint(17.375f, -13.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 973")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 105, textureX, textureY).addBox(0, 0, 0, 6, 12, 1)
			.setRotationPoint(23.375f, -13.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 974")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 105, textureX, textureY).addBox(0, 0, 0, 6, 12, 1)
			.setRotationPoint(-0.625f, -13.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 975")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-50.775f, 0.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-52.775f, 0.75f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-52.775f, 2.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-52.775f, 3.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-53.275f, 0.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(53.625f, 0.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 981")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.625f, 0.75f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 982")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(51.125f, 0.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 983")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.625f, 2.25f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 984")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.625f, 3.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 985")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(53.625f, 0.5f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 986")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.625f, 0.75f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 987")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(51.125f, 0.5f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 988")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.625f, 2.25f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 989")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.625f, 3.5f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-53.625f, 0.5f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 991")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.125f, 0.75f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-51.125f, 0.5f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.125f, 2.25f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.125f, 3.5f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 995")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(52.875f, -18, 0.5f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(52.875f, -18, 0.5f).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(52.875f, -18, 0).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(52.875f, -18, -1).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(52.875f, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(52.875f, -18, -1).setRotationAngle(0, 0, 0).setName("Box 1001")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-57.225f, -10.75f, -0.26000023f).setRotationAngle(0, 0, 0).setName("Box 874")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.225f, -10.75f, -0.26000023f).setRotationAngle(0, 0, 0).setName("Box 875")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.225f, -10.75f, -0.7600002f).setRotationAngle(0, 0, 0).setName("Box 877")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.225f, -9.25f, -0.7600002f).setRotationAngle(0, 0, 0).setName("Box 878")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.225f, -9.25f, -0.26000023f).setRotationAngle(0, 0, 0).setName("Box 879")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-57.225f, -9.25f, -0.26000023f).setRotationAngle(0, 0, 0).setName("Box 880")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, -0.25f, 0.15f, -0.05f, 0, 0.15f, -0.05f, 0, 0.15f, -0.05f, -0.25f, 0.15f, -0.05f, 0, 0.15f, -0.05f, 0, 0.15f, -0.05f, 0, 0.15f, -0.05f, 0, 0.15f, -0.05f)
			.setRotationPoint(-57.125f, -10.25f, -1).setRotationAngle(0, 0, 0).setName("Box 1008")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 113, textureX, textureY).addBox(0, 0, 0, 16, 3, 18)
			.setRotationPoint(1.375f, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box 1009")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 17, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(1.375f, 4.75f, -8).setRotationAngle(0, 0, 0).setName("Box 1010")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 14, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.375f, 6.75f, -7).setRotationAngle(0, 0, 0).setName("Box 1011")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.375f, 0.75f, -9).setRotationAngle(0, 0, 0).setName("Box 1012")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.375f, 0.75f, 6).setRotationAngle(0, 0, 0).setName("Box 1013")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 121, textureX, textureY).addBox(0, 0, 0, 8, 5, 18)
			.setRotationPoint(-7.625f, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box 1014")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 8, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.125f, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 121, textureX, textureY).addBox(0, 0, 0, 4, 2, 8)
			.setRotationPoint(-12.125f, 2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 468")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-12.125f, 4.75f, -9).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-10.875f, -1.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 470")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-10.875f, -1.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-15.875f, -1.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1021")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 8, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.125f, 1.75f, -9).setRotationAngle(0, 0, 0).setName("Box 1022")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 137, textureX, textureY).addBox(0, 0, 0, 4, 2, 8)
			.setRotationPoint(-17.125f, 2.75f, -9).setRotationAngle(0, 0, 0).setName("Box 1023")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-17.125f, 4.75f, -9).setRotationAngle(0, 0, 0).setName("Box 1024")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-15.875f, -1.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1025")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.675f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.625f, -4.25f, -10).setRotationAngle(0, 0, 0).setName("Box 1026")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.575f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.475f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-55.625f, -3.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1030")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.675f, 0, 0)
			.setRotationPoint(-55.625f, -4.25f, 8).setRotationAngle(0, 0, 0).setName("Box 1031")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.575f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.475f, 0, 0)
			.setRotationPoint(-55.625f, -3.75f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1032")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.375f, -19.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1033")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.375f, -18.75f, -8).setRotationAngle(0, 0, 0).setName("Box 1034")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-47.375f, -18.75f, 7).setRotationAngle(0, 0, 0).setName("Box 1035")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-47.375f, -19.25f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1036")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.375f, -19.25f, -1).setRotationAngle(0, 0, 0).setName("Box 1037")
		);
		group0.add(new ModelRendererTurbo(group0, 319, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.625f, -18.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1038")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 121, textureX, textureY).addBox(0, 0, 0, 5, 3, 3)
			.setRotationPoint(-59.375f, 0.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1053")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-54.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1054")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 2.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 2.25f, 0, 0)
			.setRotationPoint(-54.625f, -0.25f, -10).setRotationAngle(0, 0, 0).setName("Box 1055")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 129, textureX, textureY).addBox(0, 0, 0, 5, 3, 3)
			.setRotationPoint(54.375f, 0.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1057")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(53.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1058")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, 2.25f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 2.25f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-54.625f, -0.25f, 0).setRotationAngle(0, 0, 0).setName("Box 1059")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.625f, 2, -11).setRotationAngle(0, 0, 0).setName("Box 1060")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, -2.5f, 0, 0, 1.75f, 0, 0, -0.75f, -0.5f, -1, 0, -0.5f, -1, -2.5f, 0, 0, 1.75f, 0, 0, -0.65f, 0, 0, -0.1f, 0, 0)
			.setRotationPoint(-57.125f, 2, -10).setRotationAngle(0, 0, 0).setName("Box 1061")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, -0.75f, 0, 0, 0, 0, 0, -3, 0, 0, 2.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -2.5f, 0, 0, 1.75f, 0, 0)
			.setRotationPoint(-55.375f, 4, -10).setRotationAngle(0, 0, 0).setName("Box 1062")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 10, 0, -0.75f, 0, 0, 0, 0, 0, -2.5f, 0, 0, 1.75f, 0, 0, -0.25f, -0.5f, -1, -0.5f, -0.5f, -1, -3, 0, 0, 2.25f, 0, 0)
			.setRotationPoint(-55.375f, 6, -10).setRotationAngle(0, 0, 0).setName("Box 1063")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -1, -0.75f, -0.5f, -1, 1.75f, 0, 0, -2.5f, 0, 0, -0.1f, 0, 0, -0.65f, 0, 0, 1.75f, 0, 0, -2.5f, 0, 0)
			.setRotationPoint(-57.125f, 2, 2).setRotationAngle(0, 0, 0).setName("Box 1064")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 2.25f, 0, 0, -3, 0, 0, 0, 0, 0, -0.75f, 0, 0, 1.75f, 0, 0, -2.5f, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-55.375f, 4, 0).setRotationAngle(0, 0, 0).setName("Box 1065")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 10, 0, 1.75f, 0, 0, -2.5f, 0, 0, 0, 0, 0, -0.75f, 0, 0, 2.25f, 0, 0, -3, 0, 0, -0.5f, -0.5f, -1, -0.25f, -0.5f, -1)
			.setRotationPoint(-55.375f, 6, 0).setRotationAngle(0, 0, 0).setName("Box 1066")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-54.625f, 2, 10).setRotationAngle(0, 0, 0).setName("Box 1067")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 10, 0, -3, 0, 0, 2.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -2.5f, 0, 0, 1.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.375f, 4, 0).setRotationAngle(0, 0, 0).setName("Box 1070")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 10, 0, 0, 0, 0, -0.75f, 0, 0, 2.25f, 0, 0, -3, 0, 0, 0, 0, 0, -0.75f, 0, 0, 1.75f, 0, 0, -2.5f, 0, 0)
			.setRotationPoint(54.375f, 4, -10).setRotationAngle(0, 0, 0).setName("Box 1071")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(53.625f, 2, 10).setRotationAngle(0, 0, 0).setName("Box 1074")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, -1, 0, 0, -1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(53.625f, 2, -11).setRotationAngle(0, 0, 0).setName("Box 1075")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-48.875f, -22.25f, 1).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 129, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-47.375f, -21, -3.5f).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 129, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-47.875f, -22.25f, 1).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 129, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-47.875f, -22.25f, -2).setRotationAngle(0, 0, 0).setName("Box 1079")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-48.875f, -22.25f, -2).setRotationAngle(0, 0, 0).setName("Box 1080")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 129, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-48.125f, -22.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1081")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-49.125f, -22.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1082")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-48.625f, -22, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1083")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 137, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-47.625f, -22, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1084")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f)
			.setRotationPoint(-48.625f, -22, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1085")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 137, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-47.625f, -22, -3.5f).setRotationAngle(0, 0, 0).setName("Box 1086")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-47.875f, -21.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1087")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-47.625f, -21.25f, -2).setRotationAngle(0, 0, 0).setName("Box 1088")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-47.625f, -21.25f, 1).setRotationAngle(0, 0, 0).setName("Box 1089")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-47.375f, -21, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1090")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 153, textureX, textureY).addBox(0, 0, -1.5f, 8, 2, 8)
			.setRotationPoint(-43.375f, -21, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1092")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-45.875f, -21.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1093")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-45.875f, -21.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1094")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 137, textureX, textureY).addBox(0, 0, -1.5f, 4, 2, 1)
			.setRotationPoint(-34.375f, -21, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1096")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 137, textureX, textureY).addBox(0, 0, -1.5f, 4, 2, 1)
			.setRotationPoint(-34.375f, -21, 3.5f).setRotationAngle(0, 0, 0).setName("Box 1097")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, -1.75f, 0, 0, 2.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1.75f, 0, 0, 2.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.275f, -19.25f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1099")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 2.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0, 2.5f, 0, 0, -1.75f, 0, 0)
			.setRotationPoint(-49.275f, -19.25f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 1100")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, -0.25f, 0, 0, -0.25f, 0, 0, 2.25f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 2.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(53.625f, -0.25f, -10).setRotationAngle(0, 0, 0).setName("Box 1101")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, 0, 0, 0, 2.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 2.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(53.625f, -0.25f, 0).setRotationAngle(0, 0, 0).setName("Box 1102")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 145, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(-46.375f, -21, -6).setRotationAngle(0, 0, 0).setName("Box 1107")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 145, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(-46.375f, -21, 4).setRotationAngle(0, 0, 0).setName("Box 1108")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-52.875f, -12.75f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1109")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-52.875f, -12.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1111")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 145, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.775f, -12.549999f, 10.5f).setRotationAngle(-90, 0, 0).setName("Box 1068")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.275f, -13.049999f, 10.5f).setRotationAngle(-90, 0, 0).setName("Box 1070")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 145, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.275f, -12.549999f, 10.5f).setRotationAngle(-90, 0, 0).setName("Box 1071")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.775f, -12.549999f, -9).setRotationAngle(-90, 0, 0).setName("Box 1115")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.275f, -12.549999f, -9).setRotationAngle(-90, 0, 0).setName("Box 1116")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.275f, -13.049999f, -9).setRotationAngle(-90, 0, 0).setName("Box 1117")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(-53.375f, -2, -10.75f).setRotationAngle(0, 90, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 3.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.375f, -2, -9.75f).setRotationAngle(0, 90, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -2, -9.75f).setRotationAngle(0, 90, 0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(-53.375f, -5, -10.75f).setRotationAngle(0, 90, 0).setName("Box 1121")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -5, -9.75f).setRotationAngle(0, 90, 0).setName("Box 1122")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 3.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.375f, -5, -9.75f).setRotationAngle(0, 90, 0).setName("Box 1123")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(-53.375f, -8, -10.75f).setRotationAngle(0, 90, 0).setName("Box 1124")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -8, -9.75f).setRotationAngle(0, 90, 0).setName("Box 1125")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 3.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.375f, -8, -9.75f).setRotationAngle(0, 90, 0).setName("Box 1126")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(-53.375f, -11, -10.75f).setRotationAngle(0, 90, 0).setName("Box 1127")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -11, -9.75f).setRotationAngle(0, 90, 0).setName("Box 1128")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 3.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.375f, -11, -9.75f).setRotationAngle(0, 90, 0).setName("Box 1129")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -2, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1130")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 3.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.375f, -2, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1131")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -2, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1132")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 3.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.375f, -5, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1133")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -5, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1134")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -5, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1135")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -8, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1136")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -8, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1137")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 3.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.375f, -8, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1138")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -11, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1139")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-53.375f, -11, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1140")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 153, textureX, textureY)
			.addShapeBox(0.5f, 0, 3.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.375f, -11, 11.75f).setRotationAngle(0, 90, 0).setName("Box 1141")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-10.375f, -9.25f, -11.25f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-33.375f, -11.25f, -11.25f).setRotationAngle(0, 0, 0).setName("Box 1145")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(22.625f, -9.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1146")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(23.625f, -9.25f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 1147")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-0.375f, -9.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1148")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.375f, -9.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1149")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-33.375f, -11.25f, 10.25f).setRotationAngle(0, 0, 0).setName("Box 1150")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 153, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -4.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 471")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 73, textureX, textureY)
			.addShapeBox(1, 0, 1, 1, 1, 4, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(50.875f, -4.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 472")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 153, textureX, textureY)
			.addShapeBox(0, 0, 4.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -4.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 473")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 153, textureX, textureY)
			.addShapeBox(0.75f, 0, -1, 1, 1, 4, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(52.125f, -4.5f, 4).setRotationAngle(0, -21, 0).setName("Box 447")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 153, textureX, textureY)
			.addShapeBox(0.25f, 0, -1, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(52.125f, -4.5f, 4).setRotationAngle(0, -21, 0).setName("Box 448")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 153, textureX, textureY)
			.addShapeBox(0.25f, 0, 2.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(52.125f, -4.5f, 4).setRotationAngle(0, -21, 0).setName("Box 449")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 153, textureX, textureY)
			.addShapeBox(0, 0, 4.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -8.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1160")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 161, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -8.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1161")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 161, textureX, textureY)
			.addShapeBox(1, 0, 1, 1, 1, 4, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(50.875f, -8.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1162")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 161, textureX, textureY)
			.addShapeBox(0, 0, 4.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -12.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1163")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 161, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -12.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1164")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 161, textureX, textureY)
			.addShapeBox(1, 0, 1, 1, 1, 4, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(50.875f, -12.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1165")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 161, textureX, textureY)
			.addShapeBox(0, 0, 4.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -16.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1166")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 161, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -16.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1167")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 161, textureX, textureY)
			.addShapeBox(1, 0, 1, 1, 1, 4, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(50.875f, -16.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1168")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 161, textureX, textureY)
			.addShapeBox(0, 0, 4.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -20.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1169")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 161, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -20.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1170")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 161, textureX, textureY)
			.addShapeBox(1, 0, 1, 1, 1, 4, 0, 0, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(50.875f, -20.5f, -7.7f).setRotationAngle(0, 21, 0).setName("Box 1171")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 161, textureX, textureY)
			.addShapeBox(0.75f, 0, -1, 1, 1, 4, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(52.125f, -12.5f, 4).setRotationAngle(0, -21, 0).setName("Box 1172")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 161, textureX, textureY)
			.addShapeBox(0.25f, 0, -1, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(52.125f, -12.5f, 4).setRotationAngle(0, -21, 0).setName("Box 1173")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 161, textureX, textureY)
			.addShapeBox(0.25f, 0, 2.5f, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(52.125f, -12.5f, 4).setRotationAngle(0, -21, 0).setName("Box 1174")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-56.775f, 3.1499996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-56.775f, 3.1499996f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-56.775f, 3.1499996f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.625f, 1.75f, 1).setRotationAngle(0, 0, 0).setName("Box 685")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-58.125f, 2.75f, 1).setRotationAngle(0, 0, 0).setName("Box 686")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(-58.125f, 4.75f, 1.0999999f).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-56.775f, 7.6499996f, 5.8500004f).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-56.775f, 7.6499996f, 6.8500004f).setRotationAngle(0, 0, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-56.775f, 7.6499996f, 4.8500004f).setRotationAngle(0, 0, 0).setName("Box 559")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-56.775f, 2.6499996f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1391")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-56.775f, 2.6499996f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1392")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-56.775f, 2.6499996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1393")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-56.775f, 3.1499996f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1395")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-56.775f, 3.1499996f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1397")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-56.775f, 3.1499996f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1399")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-56.775f, 7.6499996f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1400")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-56.775f, 7.6499996f, -7.15f).setRotationAngle(0, 0, 0).setName("Box 1401")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-56.775f, 7.6499996f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1402")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-56.775f, 2.6499996f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1193")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-56.775f, 2.6499996f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1194")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-56.775f, 2.6499996f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1195")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-54.824997f, 2.75f, -8).setRotationAngle(0, 0, 0).setName("Box 1196")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-54.824997f, 2.75f, 5).setRotationAngle(0, 0, 0).setName("Box 1197")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.775f, 2.6499996f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1198")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.775f, 2.6499996f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1199")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.775f, 2.6499996f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1200")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.775f, 3.1499996f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 1201")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.775f, 3.1499996f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1202")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.775f, 3.1499996f, -8.25f).setRotationAngle(0, 0, 0).setName("Box 1203")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(55.775f, 7.6499996f, -8.15f).setRotationAngle(0, 0, 0).setName("Box 1204")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(55.775f, 7.6499996f, -7.15f).setRotationAngle(0, 0, 0).setName("Box 1205")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(55.775f, 7.6499996f, -6.15f).setRotationAngle(0, 0, 0).setName("Box 1206")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 161, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(55.775f, 7.6499996f, 6.8500004f).setRotationAngle(0, 0, 0).setName("Box 1207")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.775f, 3.1499996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1208")
		);
		group0.add(new ModelRendererTurbo(group0, 57, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(55.775f, 7.6499996f, 5.8500004f).setRotationAngle(0, 0, 0).setName("Box 1209")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.775f, 3.1499996f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1210")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f)
			.setRotationPoint(55.775f, 7.6499996f, 4.8500004f).setRotationAngle(0, 0, 0).setName("Box 1211")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(55.775f, 3.1499996f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1212")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.775f, 2.6499996f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 1213")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.775f, 2.6499996f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 1214")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.775f, 2.6499996f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1215")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(53.824997f, 2.75f, -8).setRotationAngle(0, 0, 0).setName("Box 1216")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(53.824997f, 2.75f, 5).setRotationAngle(0, 0, 0).setName("Box 1217")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(57.375f, 4.75f, -2.4f).setRotationAngle(0, 0, 0).setName("Box 1218")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.875f, 1.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1219")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 169, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.375f, 2.75f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1220")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(53.375f, -7.25f, -11).setRotationAngle(0, 0, 0).setName("Box 1028")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(53.375f, -7.25f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 1222")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(56.375f, -7.25f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 1223")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(56.375f, -7.25f, -3).setRotationAngle(0, 0, 0).setName("Box 1224")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.5f, 0, 0.5f, -0.5f, 3, 0.5f, -0.5f, -3.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0.5f, 0, 3, 0.5f, 0, -3.5f, 0, 0, -0.5f)
			.setRotationPoint(54.375f, -7.75f, -10.5f).setRotationAngle(0, -90, 0).setName("Box 859")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -3.5f, 0.5f, -0.5f, 3, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -3.5f, 0.5f, 0, 3, 0, 0, 0)
			.setRotationPoint(57.875f, -7.75f, 3).setRotationAngle(0, -90, 0).setName("Box 1226")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 169, textureX, textureY)
			.addShapeBox(-0.6f, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.25f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(55.375f, -7.25f, -7).setRotationAngle(0, -5, 0).setName("Box 1228")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 169, textureX, textureY)
			.addShapeBox(-0.6f, 0, 0, 1, 6, 1, 0, -0.75f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(55.375f, -7.25f, 6).setRotationAngle(0, -5, 0).setName("Box 1229")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 25, textureX, textureY).addBox(0, 0, 0, 0, 2, 5)
			.setRotationPoint(57.125f, -6.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 1230")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 169, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
			.setRotationPoint(-28.625f, -17.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 1084")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -3.25f, 0, 0, -3.25f, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.625f, -19.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 1085")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.625f, -18.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 1086")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 169, textureX, textureY).addBox(0, 0, 0, 12, 3, 1)
			.setRotationPoint(-1.625f, -17.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 1087")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 169, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
			.setRotationPoint(-28.625f, -17.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 1091")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 169, textureX, textureY).addBox(0, 0, 0, 12, 3, 1)
			.setRotationPoint(-1.625f, -17.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 1092")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.625f, -18.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 1093")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3.25f, 0, 0, -3.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.625f, -19.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 1094")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-46.525f, -17.5f, 2.6f).setRotationAngle(0, 0, 0).setName("Box 1096")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-46.525f, -17.5f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1097")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-46.525f, -17.5f, -1.4000001f).setRotationAngle(0, 0, 0).setName("Box 1098")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(32.375f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 1112")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(32.375f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 1113")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(34.375f, 1.75f, -2).setRotationAngle(0, 0, 0).setName("Box 1114")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, 0)
			.setRotationPoint(34.375f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 1115")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-29.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 975")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 976")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-29.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 977")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 978")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-29.625f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 979")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 980")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.625f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 474")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.625f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 475")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.625f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(26.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 477")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(26.375f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.375f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(26.375f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.375f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(39.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39.375f, 1.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 484")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(39.375f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 485")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39.375f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 486")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(39.375f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 487")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39.375f, 3.75f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 1.75f, 0, 0, -2.5f, 0, 0, 0, -0.5f, -1, -0.75f, -0.5f, -1, 1.75f, 0, 0, -2.5f, 0, 0, -0.1f, 0, 0, -0.65f, 0, 0)
			.setRotationPoint(56.125f, 2, -10).setRotationAngle(0, 0, 0).setName("Box 489")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, -0.75f, -0.5f, -1, 0, -0.5f, -1, -2.5f, 0, 0, 1.75f, 0, 0, -0.65f, 0, 0, -0.1f, 0, 0, -2.5f, 0, 0, 1.75f, 0, 0)
			.setRotationPoint(56.125f, 2, 2).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 169, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
			.setRotationPoint(-13.125f, 2.75f, -8).setRotationAngle(0, 0, 0).setName("Box 489")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 177, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
			.setRotationPoint(17.625f, -17.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -3.25f, 0, 0, -3.25f, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.625f, -19.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 185, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
			.setRotationPoint(17.625f, -17.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3.25f, 0, 0, -3.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.625f, -19.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 185, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
			.setRotationPoint(27.875f, -17.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -3.25f, 0, 0, -3.25f, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.875f, -19.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 495")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 185, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
			.setRotationPoint(27.875f, -17.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 496")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3.25f, 0, 0, -3.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.875f, -19.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 497")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 185, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
			.setRotationPoint(38.125f, -17.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -3.25f, 0, 0, -3.25f, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.125f, -19.75f, -11.15f).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 185, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
			.setRotationPoint(38.125f, -17.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3.25f, 0, 0, -3.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.125f, -19.75f, 10.15f).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.7f, -0.5f, -0.75f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f)
			.setRotationPoint(-19.875f, 0.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 760")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -1.8f, -0.5f, -0.25f, -0.75f, -0.5f, -0.7f, -0.75f, -0.5f, -0.7f, -1.8f, -0.5f, -0.25f, -2, 0, 0.1f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -2, 0, 0.1f)
			.setRotationPoint(-20.375f, 0.75f, -9).setRotationAngle(0, 0, 0).setName("Box 762")
		);
		groups.add(group0);
	}

	private final void initGroup_group01(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 489, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f, -0.7f, 0, -0.25f)
			.setRotationPoint(-19.875f, -0.75f, -9).setRotationAngle(0, 0, 0).setName("Box 764")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -1.2f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -1.3f, 0, -0.25f, -0.25f, 0, -0.7f, -0.25f, 0, -0.7f, -1.3f, 0, -0.25f)
			.setRotationPoint(-19.875f, -0.75f, -9).setRotationAngle(0, 0, 0).setName("Box 765")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.8f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -1.2f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.25f, 0, -0.7f, -1.3f, 0, -0.25f, -1.3f, 0, -0.25f, -0.25f, 0, -0.7f)
			.setRotationPoint(-19.875f, -0.75f, -9).setRotationAngle(0, 0, 0).setName("Box 766")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.75f, -0.5f, -0.7f, -1.8f, -0.5f, -0.25f, -1.8f, -0.5f, -0.25f, -0.75f, -0.5f, -0.7f, -0.4f, 0, -0.5f, -2, 0, 0.1f, -2, 0, 0.1f, -0.4f, 0, -0.5f)
			.setRotationPoint(-20.375f, 0.75f, -9).setRotationAngle(0, 0, 0).setName("Box 767")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 169, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.875f, -20.9f, -4.75f).setRotationAngle(-90, 90, 0).setName("Box 608")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50.875f, -21.4f, -1.75f).setRotationAngle(-90, 90, 0).setName("Box 610")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 177, textureX, textureY)
			.addShapeBox(0.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.875f, -20.9f, -1.25f).setRotationAngle(-90, 90, 0).setName("Box 611")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 185, textureX, textureY)
			.addShapeBox(0.6f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.125f, -13, -5.75f).setRotationAngle(-90, 75, 6).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 185, textureX, textureY)
			.addShapeBox(-2.9f, 0, -0.5f, 4, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53.125f, -13, -5.75f).setRotationAngle(-90, 75, 6).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.625f, -11.5f, -11).setRotationAngle(0, 0, 0).setName("Box 487")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.625f, -11.5f, -11).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-11.625f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 489")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-12.625f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 185, textureX, textureY)
			.addShapeBox(-2.9f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.125f, -13, -5.75f).setRotationAngle(-90, 75, 6).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 185, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.725f, -13, 5.75f).setRotationAngle(-90, -75, 6).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 185, textureX, textureY)
			.addShapeBox(-2.5f, 0, -0.5f, 4, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.725f, -13, 5.75f).setRotationAngle(-90, -75, 6).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 185, textureX, textureY)
			.addShapeBox(-2.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.725f, -13, 5.75f).setRotationAngle(-90, -75, 6).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 185, textureX, textureY)
			.addShapeBox(-2.9f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.525f, -20.9f, -4.25f).setRotationAngle(-90, 71, 0).setName("Box 524")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 185, textureX, textureY)
			.addShapeBox(0.6f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.525f, -20.9f, -4.25f).setRotationAngle(-90, 71, 0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 193, textureX, textureY)
			.addShapeBox(-2.9f, 0, -0.5f, 4, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-46.525f, -20.9f, -4.25f).setRotationAngle(-90, 71, 0).setName("Box 526")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 185, textureX, textureY)
			.addShapeBox(-2.5f, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.125f, -20.9f, 4.25f).setRotationAngle(-90, -71, 0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 193, textureX, textureY)
			.addShapeBox(-2.5f, 0, -0.5f, 4, 1, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-48.125f, -20.9f, 4.25f).setRotationAngle(-90, -71, 0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 193, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.125f, -20.9f, 4.25f).setRotationAngle(-90, -71, 0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 193, textureX, textureY).addBox(0, 0, 0, 19, 16, 9)
			.setRotationPoint(-32.625f, -17.75f, 2).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 193, textureX, textureY).addBox(0, 0, 0, 19, 1, 4)
			.setRotationPoint(-32.625f, -17.75f, -2).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-32.625f, -14.25f, 0).setRotationAngle(0, 90, 0).setName("Box 533")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.625f, -15.25f, 0).setRotationAngle(0, 90, 0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-32.625f, -14.25f, 1).setRotationAngle(0, 90, 0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.625f, -15.25f, 1).setRotationAngle(0, 90, 0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 185, textureX, textureY).addBox(0, 0, 0, 1, 11, 4)
			.setRotationPoint(-32.525f, -16.75f, -2).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-54.574997f, 0.9499998f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-54.975f, 0.9499998f, -8).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-55.375f, 0.9499998f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.975f, 0.9499998f, 7).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.574997f, 0.9499998f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.375f, 0.9499998f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.425003f, 0.9499998f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(54.425003f, 0.9499998f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(54.824997f, 0.9499998f, 7).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(55.225f, 0.9499998f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(55.225f, 0.9499998f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.824997f, 0.9499998f, -8).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 193, textureX, textureY)
			.addShapeBox(2.5f, 1, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -11.25f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 558")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 193, textureX, textureY)
			.addShapeBox(3.05f, 1, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -10.700001f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 559")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 193, textureX, textureY)
			.addShapeBox(2.5f, 1, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -10.700001f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 560")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 193, textureX, textureY)
			.addShapeBox(-0.2f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -9.950001f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 561")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 193, textureX, textureY)
			.addShapeBox(0.5f, 0, 1.05f, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.125f, -9.950001f, 3.5f).setRotationAngle(0, 45, 0).setName("Box 562")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 193, textureX, textureY).addBox(0, 0, 0, 9, 5, 9)
			.setRotationPoint(-17.125f, 1.75f, 0).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 193, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(2.375f, 1, -9).setRotationAngle(-28, 0, 0).setName("Box 565")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-7.125f, 3.25f, -9.25f).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16.375f, 3.25f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6.875f, 3.25f, 8.25f).setRotationAngle(0, 0, 0).setName("Box 570")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(49.875f, -2.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(49.875f, -7.25f, -12).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(49.875f, -7.75f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(49.875f, -1.75f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, 0, -1, 0)
			.setRotationPoint(49.875f, -7.25f, 11).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		groups.add(group0);
	}


	ModelBlombergB truck = new ModelBlombergB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.modID,"textures/trains/bogies/BlombergB_bogie.png"));
		GL11.glTranslatef(-2.1640625f,0,0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glTranslatef(4.3125f, 0, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
