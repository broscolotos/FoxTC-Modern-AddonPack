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
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.pathfinding.PathFindingHelper;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelHeavyweightDinerCar extends FVTMFormatBase {

	public ModelHeavyweightDinerCar(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_Roof();
		initGroup_Chair20();
		initGroup_Chair21();
		initGroup_stripe();
		initGroup_clipboard0();
		initGroup_clipboard1();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, true, true, true);
		}
	}

	private final void initGroup_Roof(){
		TurboList Roof = new TurboList("Roof");
		Roof.add(new ModelRendererTurbo(Roof, 390, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-72.4375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 441, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -15.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 158, 1, 13, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-79.0625f, -20.1875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 369, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(-82.5625f, -19.6875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 355, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.0625f, -18.9375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 391, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -17.8125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 365, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-86.6875f, -16.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 389, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0.625f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0.625f, 0, 0)
			.setRotationPoint(-86.0625f, -17.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 425, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.0625f, -18.3125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 333, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -15.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 470, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 13, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(78.5625f, -19.6875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 435, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.25f, 0)
			.setRotationPoint(82.0625f, -18.9375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 481, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 13, 0, -0.5f, 1.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1.125f, 0, -0.5f, -1.625f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1.625f, 0)
			.setRotationPoint(83.5625f, -17.8125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 471, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.875f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(85.6875f, -16.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 409, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -1.125f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -1.125f, 0, 0)
			.setRotationPoint(85.0625f, -17.4375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 373, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.0625f, -18.3125f, -6.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-83.1875f, -17.3125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 123, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.6875f, -17.3125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 107, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -16.8125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 314, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -14.4375f, -10.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 15, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.9375f, -9.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 319, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -16.3125f, -9.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 102, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 71, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 66, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 98, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-84.6875f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 91, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.6875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 505, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-85.5625f, -16.8125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 61, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(-85.5625f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 373, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-86.0625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 305, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-85.5625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 77, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-84.8125f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 56, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.0625f, -16.3125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 51, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-85.5625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 46, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(-85.6875f, -16.8125f, -8.5f).setRotationAngle(0, 90, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0.5f, -1, -0.625f, 0.5f, -1, -0.625f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.1875f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, -0.125f, -0.625f, -0.5f, -0.125f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.1875f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 29, 199, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(83.8125f, -17.3125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 24, 199, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.8125f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 224, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, -0.5f, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -14.4375f, -10.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 173, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, -0.5f, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.5625f, -15.9375f, -9.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 481, 177, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.1875f, -16.3125f, -9.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 19, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, -1, -0.5f, 0.5f, -1, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 9, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(85.5625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 495, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.0625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 19, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -17.3125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 439, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(82.6875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 432, 186, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.8125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 444, 198, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0)
			.setRotationPoint(84.6875f, -16.8125f, -9.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 296, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(83.0625f, -14.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 262, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(82.5625f, -15.9375f, -11).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 425, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(82.8125f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 429, 198, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(85.1875f, -16.3125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 418, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(84.5625f, -16.3125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 356, 198, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f)
			.setRotationPoint(85.6875f, -16.8125f, -9.375f).setRotationAngle(0, -90, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 243, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-79.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 464, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(79.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 406, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(82.5625f, -19.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 453, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-83.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 399, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.75f, -0.625f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f)
			.setRotationPoint(-84.5625f, -19.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 378, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1.125f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.0625f, -18.4375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 366, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.5f, -0.625f, -0.625f, -1.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.5f, -0.375f, -0.625f)
			.setRotationPoint(-87.5625f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 206, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-75.4375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 197, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-75.4375f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 105, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-69.4375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 9, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-69.4375f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 466, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-67.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 442, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-64.5625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 431, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-64.5625f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 457, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-61.1875f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 448, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-55.9375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 420, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-50.1875f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 119, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-45.4375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 383, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-36.3125f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 325, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-27.3125f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 410, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-17.9375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 330, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(13.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 403, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(40.9375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 477, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(74.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 411, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-58.3125f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 355, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-58.3125f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 377, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-53.4375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 210, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-53.4375f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 339, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-47.6875f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 164, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-47.6875f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 155, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-38.6875f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 59, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-38.6875f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 50, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-29.8125f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 41, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-29.8125f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-20.4375f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 382, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-20.4375f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 313, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(10.5625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 288, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(10.5625f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 279, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(38.1875f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 270, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(38.1875f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 361, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(67.0625f, -19.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 405, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(67.0625f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 253, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-79.0625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 41, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(79.0625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 359, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(82.5625f, -19.1875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 350, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-83.0625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 352, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -0.75f, -0.625f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.5f, 0.5f, -0.625f)
			.setRotationPoint(-84.5625f, -19.1875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 225, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-75.4375f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 216, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-75.4375f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 146, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-72.4375f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 137, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-69.4375f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 32, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-69.4375f, -17.3125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 23, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-67.0625f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 199, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-64.5625f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 484, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-64.5625f, -17.3125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 439, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-61.1875f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 430, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-55.9375f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 402, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-50.1875f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 308, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-45.4375f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 102, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-36.3125f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 433, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-27.3125f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 448, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-17.9375f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 458, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(13.0625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 453, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 3, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(40.9375f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 441, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(74.0625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 393, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-58.3125f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 373, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-58.3125f, -17.3125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 224, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-53.4375f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 270, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-53.4375f, -17.3125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 347, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-47.6875f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 304, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-47.6875f, -17.3125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 244, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-38.6875f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 207, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-38.6875f, -17.3125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 105, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-29.8125f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 262, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-29.8125f, -17.3125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 165, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-20.4375f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 56, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-20.4375f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 339, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(10.5625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 312, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(10.5625f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 253, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(38.1875f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 222, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(38.1875f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 381, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(67.0625f, -19.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 381, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(67.0625f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 322, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(86.0625f, -15.1875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 308, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.625f, 0.5f, -0.875f, -0.625f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(86.0625f, -16.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 239, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(86.0625f, -15.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 234, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.625f, 0.5f, -0.875f, -0.625f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(86.0625f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 229, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -15.1875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 118, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -16.6875f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 97, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -15.1875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 4, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.875f, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.625f, -0.5f, -0.875f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-87.0625f, -16.6875f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 424, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.125f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -16.5625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 338, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.375f, -0.25f, -0.625f)
			.setRotationPoint(-86.6875f, -17.0625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 142, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-78.3125f, -15.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 14, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-78.3125f, -15.9375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 461, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -1.75f, -0.5f, 0.125f, -1.75f, -0.5f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-78.3125f, -16.6875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 131, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-43.8125f, -15.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 452, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-43.8125f, -15.9375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 421, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -1.75f, -0.5f, 0.125f, -1.75f, -0.5f, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-43.8125f, -16.6875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 120, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-43.8125f, -14.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 477, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-78.3125f, -14.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 405, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 1, 0, 0, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, 1, 0, -0.25f, 1)
			.setRotationPoint(-23.5625f, -15.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 412, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1, 0, 0, 1, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 1, 0, -0.25f, 1)
			.setRotationPoint(-23.5625f, -15.9375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 156, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.125f, -1.75f, -0.5f, 0.125f, -1.75f, -0.5f, 0.125f, 1, 0, 0.125f, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 1, 0, -0.25f, 1)
			.setRotationPoint(-23.5625f, -16.6875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 217, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 1, 0, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1, 0, 0, 1)
			.setRotationPoint(-23.5625f, -14.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 168, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(84.0625f, -18.4375f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 161, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, -0.625f, 0, -1.5f, -0.625f, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -1.5f, -0.375f, 0, -1.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(85.5625f, -17.3125f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 413, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0.875f, -0.25f, -0.625f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(85.5625f, -16.5625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 154, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 1.125f, -0.375f, -0.625f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(84.6875f, -17.0625f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 119, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, -1.125f, 0, -0.5f, -1.125f, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(84.0625f, -18.4375f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 55, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, -0.625f, 0, -1.5f, -0.625f, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, -1.5f, -0.375f, 0, -1.5f, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(85.5625f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 408, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.875f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0.875f, -0.25f, -0.625f, 0, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(85.5625f, -16.5625f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 48, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 1.125f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 1.125f, -0.375f, -0.625f, 0, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(84.6875f, -17.0625f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 41, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -1.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.5f, -1.125f, -0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.5f, -0.25f, -0.625f)
			.setRotationPoint(-86.0625f, -18.4375f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 34, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -1.5f, -0.625f, -0.625f, -1.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, -1.5f, -0.375f, -0.625f)
			.setRotationPoint(-87.5625f, -17.3125f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 403, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.125f, -0.25f, -0.625f)
			.setRotationPoint(-86.5625f, -16.5625f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.625f, -0.375f, 0, 1.125f, -0.375f, 0, 1.125f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.375f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, -0.375f, -0.25f, -0.625f)
			.setRotationPoint(-86.6875f, -17.0625f, 6).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 1, 1, 0, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0.375f, -0.5f, -0.25f, 0.375f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.1875f, -17.3125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 398, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-84.6875f, -17.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 351, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-85.5625f, -16.8125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 105, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.375f, -0.5f, 0.5f, -0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-87.0625f, -14.4375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 47, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0.125f, -0.5f, -0.125f, 0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f)
			.setRotationPoint(-86.5625f, -15.9375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-86.0625f, -16.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 346, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.5f, 0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-87.0625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 337, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86.5625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 328, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0.25f, -0.25f, 0, 0.25f, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.125f, -0.5f, -0.625f)
			.setRotationPoint(-86.0625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 500, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-84.6875f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 392, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-84.6875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 331, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-85.5625f, -16.8125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 317, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(-85.5625f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 349, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.5f, 0.5f, -0.125f, 0.5f, 0.5f, -0.125f, 0.5f, -1, 0, 0.5f, -1, 0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-86.0625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 244, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0.5f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0.5f, 0, -0.5f)
			.setRotationPoint(-85.5625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 324, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-84.8125f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 303, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-86.0625f, -16.3125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 283, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-85.5625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 278, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(-84.6875f, -16.8125f, 8.5f).setRotationAngle(0, -90, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0.5f, 0.5f, -0.625f, 0.5f, 0.5f, -0.625f, 0.5f, -1, 0, 0.5f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-83.1875f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-83.1875f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-83.1875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, -0.125f, 0.5f, -0.625f, -0.125f, 0.5f, -0.625f, -0.125f, -1, 0, -0.125f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-83.1875f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 167, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-83.1875f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 245, 197, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f)
			.setRotationPoint(83.8125f, -17.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 198, 197, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f)
			.setRotationPoint(84.6875f, -16.8125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 307, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f)
			.setRotationPoint(86.0625f, -14.4375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 296, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f)
			.setRotationPoint(85.5625f, -15.9375f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 140, 173, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f)
			.setRotationPoint(85.1875f, -16.3125f, 6.375f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 193, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -1, 0, 0.5f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(86.0625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 172, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0.5f, -0.5f, -0.125f, 0.5f, -0.625f, -0.125f, -1.125f, 0, -0.125f, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(85.5625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 164, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, -0.125f, -0.5f, -0.625f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(85.0625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 321, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(82.6875f, -17.3125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 467, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f)
			.setRotationPoint(82.6875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 307, 185, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 2, 0, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, -0.5f, -0.5f)
			.setRotationPoint(84.6875f, -16.8125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 113, 197, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.25f, -0.5f, -0.625f, -0.75f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, 0, 0, 0, -0.875f, -0.75f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(84.6875f, -16.8125f, 8.625f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 41, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -1, -0.125f, 0.5f, -1, -0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.125f, 0, -0.5f)
			.setRotationPoint(83.0625f, -14.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 134, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.625f, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, -1, -0.625f, -0.125f, -1, -0.625f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(82.5625f, -15.9375f, 10).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 105, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f)
			.setRotationPoint(82.8125f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 87, 197, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(85.1875f, -16.3125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 82, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(84.5625f, -16.3125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 77, 197, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.625f, -0.125f, 0, 0, -0.125f, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(84.6875f, -16.8125f, 9.375f).setRotationAngle(0, 90, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 285, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.4375f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 441, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-43.3125f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Roof.add(new ModelRendererTurbo(Roof, 453, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-27.3125f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(Roof);
	}

	private final void initGroup_Chair20(){
		TurboList Chair2 = new TurboList("Chair2");
		Chair2.add(new ModelRendererTurbo(Chair2, 3, 210, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(6, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 0, 210, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(5.90625f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 508, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(5.90625f, -3.6875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 505, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(5.90625f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 476, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(5.90625f, -3.6875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 473, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(5.90625f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 470, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(5.90625f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 467, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 461, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 447, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 444, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 441, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(5.90625f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 432, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(5.90625f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 429, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(5.90625f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 402, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(5.90625f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 388, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(6, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 367, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(8.125f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 364, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(8.125f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 355, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(6, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 352, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(5.90625f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 332, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(5.90625f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 329, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 326, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 323, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 317, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 314, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(5.90625f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 311, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(5.90625f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 299, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(5.90625f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 190, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(5.90625f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 187, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(6, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 184, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(8.125f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 181, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(8.125f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 170, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(6, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 164, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(6, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 152, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(8.125f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 149, 209, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(8.125f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 146, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(5.90625f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 143, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(5.90625f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 140, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 96, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 93, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 78, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(5.90625f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 75, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(5.90625f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 63, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(5.90625f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 57, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(5.90625f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 9, 209, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(5.90625f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 493, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(4.96875f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 385, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(4.96875f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 372, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(4.96875f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 306, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(5.75f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 102, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(5.75f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 20, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(5.75f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 317, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(7.125f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 302, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(7.125f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 295, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(7.125f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 264, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(7.375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 257, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(7.375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 250, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(7.375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 6, 209, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(5.90625f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 494, 208, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(5.90625f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 488, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(5.90625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 485, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(5.90625f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 482, 208, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(5.90625f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 479, 208, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(5.90625f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 464, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(5.90625f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 453, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(5.90625f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 450, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(18.03125f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 438, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(18.03125f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 435, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 376, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 349, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 340, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 337, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(18.03125f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 277, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(18.03125f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 244, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(18.03125f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 214, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(18.03125f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 211, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(18.03125f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 208, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(18.03125f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 195, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 84, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 81, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 66, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 60, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(18.03125f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 48, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(18.03125f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 45, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(18.03125f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 42, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(18.03125f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 206, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(17.96875f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 199, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(17.96875f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 403, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(15.25f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 231, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(15.25f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 192, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(15.875f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 174, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(15.875f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 140, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(15.625f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 105, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(15.625f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 39, 208, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(18.03125f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 36, 208, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(18.03125f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 33, 208, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18.03125f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 497, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18.03125f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 491, 207, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(18.03125f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 458, 207, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(18.03125f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 414, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18.03125f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 399, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18.03125f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 396, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(15.875f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 393, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(15.875f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 385, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 382, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 379, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(15.875f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 373, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(15.875f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 370, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 361, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 358, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(15.875f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 346, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(18.03125f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 343, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(18.03125f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 320, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 308, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 283, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 280, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(18.03125f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 274, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(18.03125f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 271, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(18.03125f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 268, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(18.03125f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 265, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(18.03125f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 262, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(15.875f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 259, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 252, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 78, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(17.96875f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 425, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(15.25f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 22, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(15.875f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 7, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(15.625f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 241, 207, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(18.03125f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 238, 207, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(18.03125f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 235, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18.03125f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 232, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(18.03125f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 229, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.6875f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 226, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(19.59375f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 223, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(19.59375f, -3.6875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 220, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(19.59375f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 217, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(19.59375f, -3.6875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 198, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.59375f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 137, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.59375f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 127, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 106, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 103, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 100, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 90, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(19.59375f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 72, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(19.59375f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 69, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(19.59375f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 54, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(19.59375f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 51, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.6875f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 24, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(21.8125f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 21, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(21.8125f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 18, 207, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.6875f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 15, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(19.59375f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 0, 207, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(19.59375f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 473, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 470, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 467, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 447, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 444, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(19.59375f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 441, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(19.59375f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 432, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(19.59375f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 429, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(19.59375f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 426, 206, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.6875f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 423, 206, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(21.8125f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 420, 206, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(21.8125f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 417, 206, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.6875f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 411, 206, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.6875f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 408, 206, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(21.8125f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 405, 206, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(21.8125f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 402, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(19.59375f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 390, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(19.59375f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 367, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 364, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 334, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 331, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(19.59375f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 328, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(19.59375f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 325, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(19.59375f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 317, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(19.59375f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 314, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(19.59375f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 480, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(18.65625f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 441, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(18.65625f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 434, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(18.65625f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 139, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(19.4375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 345, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(19.4375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 161, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(19.4375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 427, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(20.8125f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 413, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(20.8125f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 406, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(20.8125f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 399, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(21.0625f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 365, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(21.0625f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 358, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(21.0625f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 305, 206, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(19.59375f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 302, 206, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(19.59375f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 296, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.59375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 293, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.59375f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 256, 206, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(19.59375f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 249, 206, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(19.59375f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 167, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.59375f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 130, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(19.59375f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 97, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(31.71875f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 94, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(31.71875f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 78, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 75, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 63, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 57, 206, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 485, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(31.71875f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 482, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(31.71875f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 479, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(31.71875f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 464, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(31.71875f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 455, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(31.71875f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 452, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(31.71875f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 438, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 435, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 277, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 246, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 214, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(31.71875f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 211, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(31.71875f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 208, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(31.71875f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 195, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(31.71875f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 351, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(31.65625f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 340, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(31.65625f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 46, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(28.9375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 454, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(28.9375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 167, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(29.5625f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 160, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(29.5625f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 153, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(29.3125f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 126, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(29.3125f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 192, 205, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(31.71875f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 189, 205, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(31.71875f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 178, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.71875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 175, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.71875f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 172, 205, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(31.71875f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 164, 205, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(31.71875f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 161, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.71875f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 158, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.71875f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 155, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(29.5625f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 134, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(29.5625f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 124, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.6875f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 121, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.6875f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 118, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(29.5625f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 115, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(29.5625f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 112, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.6875f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 109, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.6875f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 87, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(29.5625f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 84, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(31.71875f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 81, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(31.71875f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 66, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 60, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 48, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 45, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(31.71875f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 42, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(31.71875f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 39, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(31.71875f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 36, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(31.71875f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 33, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(31.71875f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 30, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(29.5625f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 27, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.6875f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 12, 205, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.6875f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 119, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(31.65625f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 392, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(28.9375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 58, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(29.5625f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 51, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(29.3125f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 9, 205, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(31.71875f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 6, 205, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(31.71875f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 3, 205, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.71875f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 508, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(31.71875f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 505, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.5625f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 497, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(33.46875f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 494, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(33.46875f, -3.6875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 491, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(33.46875f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 488, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(33.46875f, -3.6875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 476, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.46875f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 461, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.46875f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 458, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 414, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 393, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 382, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 379, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(33.46875f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 373, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(33.46875f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 361, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(33.46875f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 358, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(33.46875f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 355, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.5625f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 352, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(35.6875f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 311, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(35.6875f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 299, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.5625f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 284, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(33.46875f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 281, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(33.46875f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 274, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 271, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 268, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 265, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 262, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(33.46875f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 243, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(33.46875f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 223, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(33.46875f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 200, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(33.46875f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 186, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.5625f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 183, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(35.6875f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 152, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(35.6875f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 149, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.5625f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 146, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.5625f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 143, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(35.6875f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 140, 204, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(35.6875f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 137, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(33.46875f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 127, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(33.46875f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 0, 204, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 449, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 425, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 422, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(33.46875f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 411, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(33.46875f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 408, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(33.46875f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 405, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(33.46875f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 402, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(33.46875f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 44, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(32.53125f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 37, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(32.53125f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 0, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(32.53125f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 180, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(33.3125f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 161, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(33.3125f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 376, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(33.3125f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 380, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(34.6875f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 333, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(34.6875f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 326, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(34.6875f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 312, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(34.9375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 290, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(34.9375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 283, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(34.9375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 399, 203, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(33.46875f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 396, 203, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(33.46875f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 376, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.46875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 349, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.46875f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 346, 203, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(33.46875f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 343, 203, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(33.46875f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 340, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.46875f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 337, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(33.46875f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 334, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(45.59375f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 331, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(45.59375f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 328, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 325, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 319, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 316, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 305, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(45.59375f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 302, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(45.59375f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 296, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(45.59375f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 293, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(45.59375f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 256, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(45.59375f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 250, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(45.59375f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 169, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 78, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 75, 203, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 485, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 482, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(45.59375f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 479, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(45.59375f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 438, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(45.59375f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 435, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(45.59375f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 276, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(45.53125f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 269, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(45.53125f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 473, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(42.8125f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 454, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(42.8125f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 234, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(43.4375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 227, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(43.4375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 220, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(43.1875f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 213, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(43.1875f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 432, 202, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(45.59375f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 390, 202, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(45.59375f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 387, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.59375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 370, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.59375f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 367, 202, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(45.59375f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 364, 202, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(45.59375f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 322, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.59375f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 308, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.59375f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 259, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(43.4375f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 253, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(43.4375f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 240, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.5625f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 237, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.5625f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 234, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(43.4375f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 231, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(43.4375f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 228, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.5625f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 220, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.5625f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 217, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(43.4375f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 214, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(45.59375f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 211, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(45.59375f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 208, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 175, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 160, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 157, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(45.59375f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 124, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(45.59375f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 121, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(45.59375f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 118, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(45.59375f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 109, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(45.59375f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 106, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(43.4375f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 103, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.5625f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 100, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.5625f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 187, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(45.53125f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 326, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(42.8125f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 180, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(43.4375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 135, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(43.1875f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 97, 202, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(45.59375f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 94, 202, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(45.59375f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 91, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.59375f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 72, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(45.59375f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 69, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.1875f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 66, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(47.09375f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 63, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(47.09375f, -3.6875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 60, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(47.09375f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 57, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(47.09375f, -3.6875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 54, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.09375f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 51, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.09375f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 48, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 45, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 42, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 39, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 36, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(47.09375f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 33, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(47.09375f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 30, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(47.09375f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 27, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(47.09375f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 24, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.1875f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 21, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(49.3125f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 18, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(49.3125f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 15, 202, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.1875f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 12, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(47.09375f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 9, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(47.09375f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 6, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 3, 202, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 508, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 505, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 496, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(47.09375f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 493, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(47.09375f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 490, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(47.09375f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 476, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(47.09375f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 473, 201, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.1875f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 470, 201, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(49.3125f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 467, 201, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(49.3125f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 446, 201, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.1875f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 443, 201, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.1875f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 429, 201, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(49.3125f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 419, 201, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(49.3125f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 416, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(47.09375f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 393, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(47.09375f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 384, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 381, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 373, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 357, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(47.09375f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 354, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(47.09375f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 274, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(47.09375f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 271, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(47.09375f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 183, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(47.09375f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 73, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(46.15625f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 66, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(46.15625f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 30, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(46.15625f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 21, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(46.9375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 381, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(46.9375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 501, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(46.9375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 488, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(48.3125f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 475, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(48.3125f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 346, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(48.3125f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 114, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(48.5625f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 356, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(48.5625f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 321, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(48.5625f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 180, 201, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(47.09375f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 134, 201, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(47.09375f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 131, 201, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.09375f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 464, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.09375f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 461, 200, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(47.09375f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 458, 200, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(47.09375f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 455, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.09375f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 452, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(47.09375f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 426, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(59.21875f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 423, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(59.21875f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 413, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 410, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 407, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 404, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 401, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(59.21875f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 398, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(59.21875f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 378, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(59.21875f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 351, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(59.21875f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 348, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(59.21875f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 345, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(59.21875f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 339, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 336, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 330, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 327, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 319, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(59.21875f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 316, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(59.21875f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 305, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(59.21875f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 302, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(59.21875f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 231, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(59.15625f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 138, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(59.15625f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 487, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(56.4375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 389, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(56.4375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 127, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(57.0625f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 259, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(57.0625f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 409, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(56.8125f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 78, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(56.8125f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 284, 200, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(59.21875f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 281, 200, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(59.21875f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 278, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.21875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 247, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.21875f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 244, 200, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(59.21875f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 200, 200, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(59.21875f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 197, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.21875f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 194, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.21875f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 191, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(57.0625f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 172, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(57.0625f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		groups.add(Chair2);
	}

	private final void initGroup_Chair21(){
		TurboList Chair2 = new TurboList("Chair2");
		Chair2.add(new ModelRendererTurbo(Chair2, 166, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.1875f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 163, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.1875f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 115, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(57.0625f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 112, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(57.0625f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 88, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.1875f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 85, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.1875f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 82, 200, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(57.0625f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 79, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(59.21875f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 76, 200, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(59.21875f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 440, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 437, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 434, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 390, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(59.21875f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 387, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(59.21875f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 370, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(59.21875f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 367, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(59.21875f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 364, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(59.21875f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 361, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(57.0625f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 313, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.1875f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 299, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.1875f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 246, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(59.15625f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 501, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(56.4375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 414, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(57.0625f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 436, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(56.8125f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 296, 199, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(59.21875f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 293, 199, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(59.21875f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 268, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.21875f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 265, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(59.21875f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 262, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.8125f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 259, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 256, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(-7.90625f, -3.6875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 253, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 250, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(-7.90625f, -3.6875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 225, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.90625f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 188, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.90625f, -4.4375f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 177, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 160, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 157, 199, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 246, 193, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 60, 193, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-7.90625f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 435, 190, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-7.90625f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 415, 190, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(-7.90625f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 22, 190, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(-7.90625f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 154, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.8125f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 151, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-5.6875f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 148, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-5.6875f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 145, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.8125f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 370, 189, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 495, 180, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 325, 178, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 382, 175, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 231, 175, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 146, 173, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 0, 173, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-7.90625f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 296, 172, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-7.90625f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 105, 172, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(-7.90625f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 23, 172, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(-7.90625f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 142, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.8125f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 139, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-5.6875f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 128, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-5.6875f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 0, 199, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.8125f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 449, 198, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.8125f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 342, 198, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-5.6875f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 333, 198, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-5.6875f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 310, 171, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 195, 171, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 400, 170, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 394, 170, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 213, 170, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 207, 170, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-7.90625f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 391, 169, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-7.90625f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 495, 166, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(-7.90625f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 49, 164, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(-7.90625f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 41, 164, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(-7.90625f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 262, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-8.84375f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 36, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-8.84375f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 150, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0)
			.setRotationPoint(-8.84375f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 487, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(-8.0625f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 473, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(-8.0625f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 415, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0.625f, 0, 0, 0.375f, 0, -0.75f, 0, -0.875f, -0.75f, 0.25f, -0.875f, -0.75f, 0.625f, 0, -0.75f, 0.375f)
			.setRotationPoint(-8.0625f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 36, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(-6.6875f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 365, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(-6.6875f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 170, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.25f, 0, 0, 0.125f, 0, 0, 0.5f, -0.75f, 0, 0.625f, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.125f, 0, -0.75f, 0.5f, -0.75f, -0.75f, 0.625f)
			.setRotationPoint(-6.6875f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 463, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(-6.4375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 493, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(-6.4375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 46, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0.125f, 0, -0.75f, -0.125f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.5f)
			.setRotationPoint(-6.4375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 105, 166, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 339, 164, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 169, 198, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.90625f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 481, 197, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.90625f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 252, 164, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 146, 163, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(-7.90625f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 208, 197, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.90625f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 378, 195, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(-7.90625f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 90, 163, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(4.21875f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 83, 163, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(4.21875f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 57, 155, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.5625f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 218, 153, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.5625f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 205, 153, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.6875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 99, 153, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.6875f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 85, 153, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(4.21875f, -4.75f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 376, 152, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(4.21875f, -4.75f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 447, 147, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(4.21875f, -4.78125f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 441, 147, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(4.21875f, -4.78125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 331, 147, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(4.21875f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 403, 146, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(4.21875f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 221, 146, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.5625f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 99, 142, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.5625f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 132, 138, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 509, 136, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.6875f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 110, 131, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(4.21875f, -4.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 383, 102, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(4.21875f, -4.75f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 373, 102, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(4.21875f, -4.78125f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 379, 89, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(4.21875f, -4.78125f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 505, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(4.15625f, -4.375f, 3.5625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 457, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(4.15625f, -4.375f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 415, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(1.4375f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 376, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(1.4375f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 505, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(2.0625f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 457, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(2.0625f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 473, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(1.8125f, -1.1875f, 3.375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 504, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(1.8125f, -1.1875f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 435, 138, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(4.21875f, -4.125f, 4.9375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 422, 123, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(4.21875f, -4.125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 178, 194, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.21875f, -4.4375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 208, 192, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.21875f, -4.4375f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 405, 119, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(4.21875f, -4.125f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 375, 119, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(4.21875f, -4.125f, 7.3125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 443, 189, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.21875f, -4.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 208, 187, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.21875f, -4.4375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 484, 172, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(2.0625f, -0.9375f, 5.5625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 412, 165, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(2.0625f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 314, 163, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.1875f, -0.9375f, 5.5625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 307, 163, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.1875f, -0.9375f, 3.5625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 328, 159, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(2.0625f, -0.9375f, 8.6875f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 57, 150, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(2.0625f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 191, 146, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.1875f, -0.9375f, 8.6875f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 484, 144, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.1875f, -0.9375f, 6.6875f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 337, 143, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(2.0625f, -0.9375f, -6.0625f).setRotationAngle(7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 361, 89, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(4.21875f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 509, 88, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.5625, 0.0))
			.setRotationPoint(4.21875f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 370, 70, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.5625f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 343, 69, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.75f, 1, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.5625f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 400, 58, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.6875f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 509, 51, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.875f, 0.75f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(4.21875f, -4.6875f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 18, 0, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(4.21875f, -4.75f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 12, 0, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 0.6875f, 0.875f, 4, new Vec3f(0.0, -0.9375, 0.0))
			.setRotationPoint(4.21875f, -4.75f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 6, 0, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(4.21875f, -4.78125f, -8.125f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 0, 0, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 1, 6, 1.0E-15f, 0.6875f, 4, new Vec3f(0.0, -0.96875, 0.0))
			.setRotationPoint(4.21875f, -4.78125f, -6).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 450, 127, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(2.0625f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, 7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 398, 119, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.1875f, -0.9375f, -6.0625f).setRotationAngle(7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 508, 46, textureX, textureY).addCylinder(0, -0.0625f, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.1875f, -0.9375f, -8.0625f).setRotationAngle(-7, 0, -7)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 492, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(4.15625f, -4.375f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 398, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.875f, 0, 0.25f, 0, 0, 0, 0, 0, 0.375f, -0.875f, 0, 0.625f, -0.875f, -0.75f, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0.375f, -0.875f, -0.75f, 0.625f)
			.setRotationPoint(1.4375f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 504, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.125f, -0.75f, 0, 0.25f, -0.75f, 0, 0.625f, 0, 0, 0.5f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.625f, 0, -0.75f, 0.5f)
			.setRotationPoint(2.0625f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 505, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.5f, 0, 0, 0.25f, 0, -0.75f, -0.125f, -0.75f, -0.75f, 0.125f, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.25f)
			.setRotationPoint(1.8125f, -1.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 508, 42, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(4.21875f, -4.125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 471, 30, textureX, textureY).addCylinder(0, 0.4375f, 0, 0.125f, 2, 6, 1, 1, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(4.21875f, -4.125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Chair2.add(new ModelRendererTurbo(Chair2, 508, 25, textureX, textureY).addCylinder(0, 0, 0, 0.125f, 3, 6, 1, 1, 4, new Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(4.21875f, -4.4375f, -8.125f).setRotationAngle(0, 0, 0)
		);
		groups.add(Chair2);
	}

	private final void initGroup_stripe(){
		TurboList stripe = new TurboList("stripe");
		stripe.add(new ModelRendererTurbo(stripe, 0, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 2, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-78.8125f, -2.9375f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripe.add(new ModelRendererTurbo(stripe, 507, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -2.9375f, 11.01f).setRotationAngle(0, 0, 0)
		);
		stripe.add(new ModelRendererTurbo(stripe, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-86.8125f, -2.9375f, -11.01f).setRotationAngle(0, 0, 0)
		);
		groups.add(stripe);
	}

	private final void initGroup_clipboard0(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.5625f, -19.9375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-23.5625f, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-23.5625f, -19.9375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-23.5625f, -19.9375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-23.5625f, -19.9375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 6, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.5625f, -3.6875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 6, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -1, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-21.5625f, -3.6875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 6, 0, 0, -0.5f, -1, -0.5f, -0.5f, -1.75f, -0.5f, -0.5f, -1.25f, 0, -0.5f, -0.5f, 0, 0, -1, -0.5f, 0, -1.75f, -0.5f, 0, -1.25f, 0, 0, -0.5f)
			.setRotationPoint(-21.0625f, -3.6875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 6, 0, 0, -0.5f, -1.75f, -0.75f, -0.5f, -2.75f, -0.75f, -0.5f, -2.25f, 0, -0.5f, -1.25f, 0, 0, -1.75f, -0.75f, 0, -2.75f, -0.75f, 0, -2.25f, 0, 0, -1.25f)
			.setRotationPoint(-20.5625f, -3.6875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, -0.375f, -0.75f, -0.5f, -0.375f, -0.75f, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-25.8125f, -3.6875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 173, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 5, 3, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-25.3125f, -2.9375f, -4.625f).setRotationAngle(0, -4, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 196, textureX, textureY)
			.addShapeBox(-0.75f, 0, 2.375f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-25.3125f, -1.3125f, -4.625f).setRotationAngle(0, -4, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 196, textureX, textureY)
			.addShapeBox(-0.75f, 0, 2.375f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-25.3125f, -0.5625f, -4.625f).setRotationAngle(0, -4, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 196, textureX, textureY)
			.addShapeBox(-1, 0.25f, 2.375f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-25.3125f, -1.3125f, -4.625f).setRotationAngle(0, -4, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 173, textureX, textureY)
			.addShapeBox(-0.5f, 0, -3, 1, 5, 3, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f, -0.125f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.3125f, -2.9375f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 196, textureX, textureY)
			.addShapeBox(-0.75f, 0, -2.625f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-25.3125f, -1.3125f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 196, textureX, textureY)
			.addShapeBox(-0.75f, 0, -2.625f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-25.3125f, -0.5625f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 196, textureX, textureY)
			.addShapeBox(-1, 0.25f, -2.625f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-25.3125f, -1.3125f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.8125f, -3.6875f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3.875f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-24.5625f, -3.6875f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.875f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(-25.5625f, -2.9375f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -1, -0.875f, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f)
			.setRotationPoint(-25.5625f, -3.0625f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.875f, 0.25f, -0.875f, -0.875f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-26.6875f, -2.9375f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.125f, -0.875f, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f, -1, 0.125f, -0.875f, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-26.9375f, -3.0625f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, -0.875f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.6875f, -2.9375f, 3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.125f, -0.875f, -1, -0.625f, -0.875f, -1, -0.625f, -0.875f, 0, 0.125f, -0.875f, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.9375f, -3.0625f, 3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-27.0625f, -2.9375f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.875f, 0, -1, -0.875f, 0, -1, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-27.0625f, -3.0625f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 3, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-30.6875f, -2.1875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 2, 0, 0, -0.5f, -0.625f, 0.375f, -0.5f, -0.625f, 0.375f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.625f, 0.375f, 0, -0.625f, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.9375f, -3.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-26.4375f, -3.3125f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.625f, 0, 0, -0.5f, 0, -0.875f, 0, -0.875f, -0.875f, -0.125f, -0.875f, -0.875f, -0.625f, 0, -0.875f, -0.5f)
			.setRotationPoint(-25.1875f, -3.3125f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.125f, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.625f, -0.875f, -0.875f, -0.125f, 0, -0.875f, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.625f)
			.setRotationPoint(-27.4375f, -3.3125f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-29.3125f, -3.3125f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.625f, 0, 0, -0.5f, 0, -0.875f, 0, -0.875f, -0.875f, -0.125f, -0.875f, -0.875f, -0.625f, 0, -0.875f, -0.5f)
			.setRotationPoint(-28.0625f, -3.3125f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.125f, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.625f, -0.875f, -0.875f, -0.125f, 0, -0.875f, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.625f)
			.setRotationPoint(-30.3125f, -3.3125f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-25.375f, -3.5625f, 4.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f, -0.625f, 0, -0.9375f, -0.625f)
			.setRotationPoint(-25.34375f, -3.53125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 196, textureX, textureY)
			.addShapeBox(0, 0.03125f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.9375f, 0, -0.625f, -0.9375f, 0, -0.625f, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f)
			.setRotationPoint(-25.5f, -3.5625f, 4.34375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-26.375f, -3.5625f, 4.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f, -0.625f, 0, -0.9375f, -0.625f)
			.setRotationPoint(-26.34375f, -3.53125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 196, textureX, textureY)
			.addShapeBox(0, 0.03125f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.9375f, 0, -0.625f, -0.9375f, 0, -0.625f, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f)
			.setRotationPoint(-26.5f, -3.5625f, 4.34375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-28.25f, -3.5625f, 4.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f, -0.625f, 0, -0.9375f, -0.625f)
			.setRotationPoint(-28.21875f, -3.53125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 196, textureX, textureY)
			.addShapeBox(0, 0.03125f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.9375f, 0, -0.625f, -0.9375f, 0, -0.625f, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f)
			.setRotationPoint(-28.375f, -3.5625f, 4.34375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-29.25f, -3.5625f, 4.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f, -0.625f, 0, -0.9375f, -0.625f)
			.setRotationPoint(-29.21875f, -3.53125f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 196, textureX, textureY)
			.addShapeBox(0, 0.03125f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.9375f, 0, -0.625f, -0.9375f, 0, -0.625f, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f)
			.setRotationPoint(-29.375f, -3.5625f, 4.34375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-25.9375f, -4.4375f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-25.9375f, -4.9375f, 3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-25.9375f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-25.9375f, -4.9375f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-28.8125f, -4.4375f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-28.8125f, -4.9375f, 3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-28.8125f, -4.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-28.8125f, -4.9375f, 3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-25.9375f, -4.6875f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-28.8125f, -4.6875f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.09375f, 0, -0.75f, -0.09375f, 0, -0.75f, -0.09375f, -0.75f, 0, -0.09375f, -0.75f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-25.9375f, -5.1875f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.09375f, 0, -0.75f, -0.09375f, 0, -0.75f, -0.09375f, -0.75f, 0, -0.09375f, -0.75f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-28.8125f, -5.1875f, 3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-30.9375f, -3.6875f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, -0.5f, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.4375f, -3.6875f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.875f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(-28.4375f, -2.9375f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -1, -0.875f, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f)
			.setRotationPoint(-28.4375f, -3.0625f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, -0.875f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0.25f, -0.875f, 0, 0, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5625f, -2.9375f, 3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.125f, -0.875f, -1, -0.625f, -0.875f, -1, -0.625f, -0.875f, 0, 0.125f, -0.875f, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.8125f, -3.0625f, 3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-29.9375f, -2.9375f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.875f, 0, -1, -0.875f, 0, -1, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-29.9375f, -3.0625f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.875f, 0.25f, -0.875f, -0.875f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-29.5625f, -2.9375f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.125f, -0.875f, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f, -1, 0.125f, -0.875f, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-29.8125f, -3.0625f, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, -0.5f, -0.5f, 0.375f, -0.5f, -0.5f, 0.375f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.9375f, -3.6875f, 0.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 6, 1, 0, 0, -0.5f, -0.5f, -0.125f, -0.5f, -0.5f, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.8125f, -3.6875f, 0.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 6, 1, 0, 0, -0.5f, 0.25f, -0.125f, -0.5f, 0.25f, -0.125f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.8125f, -3.6875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-38.9375f, -1.1875f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(-39.8125f, -3.6875f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.75f, -0.375f, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, -0.75f, -0.375f, 0.25f, -0.75f, 0, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-40.0625f, -3.1875f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.75f, -0.625f, 0, -0.75f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, -0.75f, -0.625f, 0.25f, -0.75f, -0.375f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-40.0625f, -3.1875f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.625f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-40.0625f, -3.1875f, -0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, 0, 0, 0, -0.375f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0.25f, 0, 0, 0.25f, 0, -0.375f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f)
			.setRotationPoint(-40.0625f, -3.1875f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, -0.375f, 0, 0, -0.625f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0.25f, 0, -0.375f, 0.25f, 0, -0.625f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f)
			.setRotationPoint(-40.0625f, -3.1875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.75f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0.25f, 0, -0.625f, 0.25f, 0, -0.75f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f)
			.setRotationPoint(-40.0625f, -3.1875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 6, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-39.8125f, -3.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-43.8125f, -3.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.8125f, -3.6875f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-43.8125f, -3.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 194, textureX, textureY)
			.addShapeBox(0, 0, -2.75f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-39.8125f, -1.3125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 194, textureX, textureY)
			.addShapeBox(0, 0, -2.75f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-39.8125f, -0.5625f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 194, textureX, textureY)
			.addShapeBox(0.25f, 0.25f, -2.75f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-39.8125f, -1.3125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 194, textureX, textureY)
			.addShapeBox(0, 0, 2.5f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-39.8125f, -1.3125f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 194, textureX, textureY)
			.addShapeBox(0, 0, 2.5f, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-39.8125f, -0.5625f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 194, textureX, textureY)
			.addShapeBox(0.25f, 0.25f, 2.5f, 1, 1, 1, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-39.8125f, -1.3125f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.25f)
			.setRotationPoint(-30.8125f, -3.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-30.3125f, -3.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -1.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1.5f, 0, 0, -0.5f)
			.setRotationPoint(-29.8125f, -3.6875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 19, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-43.3125f, -16.6875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 7, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-43.8125f, -13.4375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.8125f, -13.4375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-43.8125f, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 12, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0.125f, 0, 0.25f, 0.125f)
			.setRotationPoint(-43.8125f, -19.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.375f, 0, -0.75f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.75f, -0.375f, 0.25f, -0.75f)
			.setRotationPoint(-46.9375f, -3.1875f, -5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.625f, 0, -0.75f, -0.375f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.75f, -0.625f, 0.25f, -0.75f)
			.setRotationPoint(-46.9375f, -3.1875f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.625f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f)
			.setRotationPoint(-46.9375f, -3.1875f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 11, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, 0.5f, 0, 0.25f, 0.5f)
			.setRotationPoint(-46.1875f, -3.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.875f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(-47.1875f, -2.9375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -1, -0.875f, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f)
			.setRotationPoint(-47.1875f, -3.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, -0.875f, 0.25f, -0.875f, -0.875f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-49.4375f, -2.9375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -1, 0.125f, -0.875f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-49.6875f, -3.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-49.8125f, -2.9375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.875f, 0, -1, -0.875f, 0, -1, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-49.8125f, -3.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, -0.875f, -0.875f, 0.125f, -0.875f, -0.875f, 0.125f, -0.875f, 0, 0.25f, -0.875f, 0, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.4375f, -2.9375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, -0.875f, -1, -0.5f, -0.875f, -1, -0.5f, -0.875f, 0, 0.125f, -0.875f, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.6875f, -3.0625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-53.25f, -4.4375f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-53.25f, -4.6875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-53.25f, -4.9375f, -8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-53.25f, -4.9375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-48.125f, -4.4375f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-48.125f, -4.6875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-48.125f, -4.9375f, -8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-48.125f, -4.9375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-53.25f, -4.6875f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.09375f, 0, -0.75f, -0.09375f, 0, -0.75f, -0.09375f, -0.75f, 0, -0.09375f, -0.75f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-53.25f, -5.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-48.125f, -4.6875f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.09375f, 0, -0.75f, -0.09375f, 0, -0.75f, -0.09375f, -0.75f, 0, -0.09375f, -0.75f, 0, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-48.125f, -5.1875f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-52.6875f, -3.5625f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f, -0.625f, 0, -0.9375f, -0.625f)
			.setRotationPoint(-52.65625f, -3.53125f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 193, textureX, textureY)
			.addShapeBox(0, 0.03125f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.9375f, 0, -0.625f, -0.9375f, 0, -0.625f, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f)
			.setRotationPoint(-52.8125f, -3.5625f, -8.78125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-53.6875f, -3.5625f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f, -0.625f, 0, -0.9375f, -0.625f)
			.setRotationPoint(-53.65625f, -3.53125f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 193, textureX, textureY)
			.addShapeBox(0, 0.03125f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.9375f, 0, -0.625f, -0.9375f, 0, -0.625f, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f)
			.setRotationPoint(-53.8125f, -3.5625f, -8.78125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-47.5f, -3.5625f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f, -0.625f, 0, -0.9375f, -0.625f)
			.setRotationPoint(-47.46875f, -3.53125f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 193, textureX, textureY)
			.addShapeBox(0, 0.03125f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.9375f, 0, -0.625f, -0.9375f, 0, -0.625f, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f)
			.setRotationPoint(-47.625f, -3.5625f, -8.78125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-48.5f, -3.5625f, -8.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f, -0.625f, 0, -0.9375f, -0.625f)
			.setRotationPoint(-48.46875f, -3.53125f, -8.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 193, textureX, textureY)
			.addShapeBox(0, 0.03125f, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.9375f, 0, -0.625f, -0.9375f, 0, -0.625f, -0.9375f, -0.9375f, 0, -0.9375f, -0.9375f)
			.setRotationPoint(-48.625f, -3.5625f, -8.78125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.625f, 0, 0, -0.5f, 0, -0.875f, 0, -0.875f, -0.875f, -0.125f, -0.875f, -0.875f, -0.625f, 0, -0.875f, -0.5f)
			.setRotationPoint(-52.5f, -3.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, -0.125f, -0.875f, 0, -0.625f, 0, 0, -0.5f, 0, -0.875f, 0, -0.875f, -0.875f, -0.125f, -0.875f, -0.875f, -0.625f, 0, -0.875f, -0.5f)
			.setRotationPoint(-47.3125f, -3.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-53.75f, -3.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.5f, 0, -0.875f, -0.5f)
			.setRotationPoint(-48.5625f, -3.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.125f, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.625f, -0.875f, -0.875f, -0.125f, 0, -0.875f, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.625f)
			.setRotationPoint(-54.75f, -3.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.125f, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.625f, -0.875f, -0.875f, -0.125f, 0, -0.875f, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.625f)
			.setRotationPoint(-49.5625f, -3.3125f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.9375f, -1.6875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, -0.875f, 0, 0.125f, -0.875f, 0, 0.125f, -0.875f, -0.875f, 0.25f, -0.875f, -0.875f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-54.5625f, -2.9375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -1, 0.125f, -0.875f, -1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-54.8125f, -3.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, -0.875f, -0.875f, 0.125f, -0.875f, -0.875f, 0.125f, -0.875f, 0, 0.25f, -0.875f, 0, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.5625f, -2.9375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, -0.875f, -1, -0.5f, -0.875f, -1, -0.5f, -0.875f, 0, 0.125f, -0.875f, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.8125f, -3.0625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.9375f, -2.9375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.875f, 0, -1, -0.875f, 0, -1, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54.9375f, -3.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.875f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -0.875f, -0.875f, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(-52.3125f, -2.9375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, -0.5f, -1, -0.875f, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f)
			.setRotationPoint(-52.3125f, -3.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-51.3125f, -3.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 5, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-55.9375f, -3.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(-54.9375f, -3.1875f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-55.9375f, -3.1875f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 5, 5, 0, -0.5f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0.25f, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f)
			.setRotationPoint(-73.0625f, -3.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 193, textureX, textureY)
			.addShapeBox(2.875f, -0.25f, 2, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-66.8125f, -3.1875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 193, textureX, textureY)
			.addShapeBox(3.625f, -0.25f, 2, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-66.8125f, -3.1875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 193, textureX, textureY)
			.addShapeBox(2.875f, -0.5f, 2, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-66.8125f, -3.1875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 192, textureX, textureY)
			.addShapeBox(2.875f, -0.25f, 2, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-77.6875f, -3.1875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 192, textureX, textureY)
			.addShapeBox(3.625f, -0.25f, 2, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-77.6875f, -3.1875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 192, textureX, textureY)
			.addShapeBox(2.875f, -0.5f, 2, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-77.6875f, -3.1875f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0.5f, -0.5f, -0.875f, 0.5f)
			.setRotationPoint(-69.9375f, -3.3125f, -8.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, -0.375f, 0, 0.25f, -0.375f)
			.setRotationPoint(-77.8125f, -3.1875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 1, 0, 0, 0, 0.125f, 0.25f, 0, 0.125f, 0.25f, 0, -0.5f, 0, 0, -1.125f, 0, 0.25f, 0.125f, 0.25f, 0.25f, 0.125f, 0.25f, 0.25f, -0.5f, 0, 0.25f, -1.125f)
			.setRotationPoint(-77.8125f, -3.1875f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 5, 5, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, -0.125f, 0.25f, -0.5f, -0.125f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-72.6875f, -3.1875f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 5, 0, -0.125f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.875f, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f)
			.setRotationPoint(-49.9375f, -3.3125f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.875f, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f)
			.setRotationPoint(-54.375f, -3.3125f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.125f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.875f, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.125f, -0.125f, -0.875f, -0.125f)
			.setRotationPoint(-52.0625f, -3.3125f, 1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-45.3125f, -3.4375f, 1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-47.1875f, -3.4375f, 1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-48.8125f, -3.4375f, 1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-47.1875f, -3.4375f, 3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-48.8125f, -3.4375f, 3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-47.1875f, -3.4375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 192, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.625f, 0.625f, 4, new Vec3f(0.0, -0.875, 0.0))
			.setRotationPoint(-48.8125f, -3.4375f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, -0.75f, 0, 0, 0, 0.5f, -0.5f, 0.125f, 0.5f, -0.5f, 0.125f, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-73.8125f, -3.1875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.75f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.625f, 0.125f, 0.5f, -0.625f, 0.125f, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-73.8125f, -3.1875f, 4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 3, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-77.8125f, -3.1875f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 19, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-72.0625f, -16.6875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 22, 1, 0, 0.25f, 0, -0.5f, -1.25f, 0, -0.5f, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, -0.5f, -1.25f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0)
			.setRotationPoint(-73.5625f, -19.6875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 22, 1, 0, 0.75f, 0, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 1.5f, 0, -1.25f, 0.75f, -0.25f, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, 0, 1.5f, -0.25f, -1.25f)
			.setRotationPoint(-72.3125f, -19.6875f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 22, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-77.8125f, -19.6875f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 4, 0, 0, 0, 0.625f, -0.5f, 0, 0.625f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0.625f, -0.5f, -0.25f, 0.625f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.3125f, -13.4375f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 11, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, 0, -0.125f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.125f, 0, 0.25f, -0.125f)
			.setRotationPoint(-78.3125f, -19.6875f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.3125f, -13.4375f, -5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.625f, 0, 0, 0.625f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.625f, 0, -0.25f, 0.625f)
			.setRotationPoint(-78.3125f, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-78.3125f, -10.4375f, -5.875f).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 191, textureX, textureY)
			.addShapeBox(-0.5f, 0, 5, 1, 1, 1, 0, 0, -0.25f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-78.3125f, -4.9375f, -5.875f).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 191, textureX, textureY)
			.addShapeBox(-0.25f, 0, 5, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-78.3125f, -4.9375f, -5.875f).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 191, textureX, textureY)
			.addShapeBox(-0.25f, 0.75f, 5, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-78.3125f, -4.9375f, -5.875f).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 6, 0.5f, 0.5f, 4, null)
			.setRotationPoint(12, -2.6875f, 2.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 6, 0.5f, 0.5f, 4, null)
			.setRotationPoint(39.5625f, -2.6875f, 2.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 6, 0.5f, 0.5f, 4, null)
			.setRotationPoint(25.6875f, -2.6875f, 2.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 6, 0.5f, 0.5f, 4, null)
			.setRotationPoint(53.1875f, -2.6875f, 2.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 191, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 6, 0.5f, 0.5f, 4, null)
			.setRotationPoint(-2, -2.6875f, 2.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-5.0625f, -2.9375f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(8.9375f, -2.9375f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(22.625f, -2.9375f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(36.5f, -2.9375f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 9, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(50.125f, -2.9375f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 6, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-5.0625f, -2.9375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 6, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(8.9375f, -2.9375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 6, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(22.625f, -2.9375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 6, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(36.5f, -2.9375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 6, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(50.125f, -2.9375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -1.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -1.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f)
			.setRotationPoint(-5.0625f, -2.9375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.25f, 0, 0, -0.75f, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.25f, -0.75f, 0, -0.75f, -0.75f, 0, -1.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(-4.5f, -2.9375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -1.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -1.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f)
			.setRotationPoint(8.9375f, -2.9375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.25f, 0, 0, -0.75f, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.25f, -0.75f, 0, -0.75f, -0.75f, 0, -1.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(9.5f, -2.9375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -1.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -1.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f)
			.setRotationPoint(36.5f, -2.9375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.25f, 0, 0, -0.75f, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.25f, -0.75f, 0, -0.75f, -0.75f, 0, -1.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(37.0625f, -2.9375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -1.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -1.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f)
			.setRotationPoint(22.625f, -2.9375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.25f, 0, 0, -0.75f, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.25f, -0.75f, 0, -0.75f, -0.75f, 0, -1.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(23.1875f, -2.9375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -1.1875f, 0, -0.5f, -0.3125f, 0, -0.5f, 0, -0.75f, 0, -0.875f, -0.75f, 0, -1.1875f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f)
			.setRotationPoint(50.125f, -2.9375f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.25f, 0, 0, -0.75f, 0, 0, -1.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.25f, -0.75f, 0, -0.75f, -0.75f, 0, -1.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(50.6875f, -2.9375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.625f, 0, -0.5f)
			.setRotationPoint(-71.4375f, -19.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-68.8125f, -4.8125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-55.5625f, -4.8125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0.375f, 0.125f, -0.5f, 0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-38.3125f, -4.8125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-21.3125f, -4.8125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-58.8125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 8, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-45.5625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-27.9375f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-16.3125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(3.3125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17.0625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(30.6875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(44.6875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(58.1875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 8, 1, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(75.6875f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-78.8125f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 2, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -11.4375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.8125f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-80.5625f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-83.0625f, -11.4375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-84.8125f, -0.6875f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-83.5625f, -5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 62, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -6.625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 5, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 3, 1, 1, 0, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.6875f, 0, -0.8125f, -0.6875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f)
			.setRotationPoint(-83.5625f, -11.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 191, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-83.0625f, -10.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 191, textureX, textureY)
			.addShapeBox(0, 0.0625f, 0, 1, 4, 1, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.6875f, 0, 0.25f, -0.6875f)
			.setRotationPoint(-80.75f, -10.0625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, 1.5625f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-79.6875f, 2.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-84.4375f, 2.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-79.6875f, 4.3125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-84.4375f, 4.3125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 4.3125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-83.9375f, 6.0625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(83.9375f, 2.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(79.1875f, 2.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(83.9375f, 4.3125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(79.1875f, 4.3125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 4.3125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(79.6875f, 6.0625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.125f, 0.3125f, -0.8125f, 0.125f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(71.5625f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.125f, -0.1875f, -0.8125f, 0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(71.5625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(71.5625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(74.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.125f, -0.1875f, -0.8125f, 0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(71.5625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.125f, -0.375f, -0.8125f, 0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(71.5625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(71.5625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(74.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(48.1875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(48.1875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 142, textureX, textureY)
			.addShapeBox(0, 2, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(48.1875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 142, textureX, textureY)
			.addShapeBox(0, 2, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48.1875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 190, textureX, textureY)
			.addShapeBox(0, 2, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48.1875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 190, textureX, textureY)
			.addShapeBox(0, 2, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(57, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(48.1875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(57, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(34.4375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.625f, 0.25f, -0.1875f, -0.625f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(34.4375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(34.4375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(43.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(34.4375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(34.4375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(43.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(20.6875f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(20.6875f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(20.6875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(29.5f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 141, textureX, textureY)
			.addShapeBox(0, 1, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(20.6875f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 141, textureX, textureY)
			.addShapeBox(0, 1, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(20.6875f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 189, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(20.6875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 189, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(29.5f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.125f, 0.3125f, -0.8125f, 0.125f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(6.9375f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.125f, -0.1875f, -0.8125f, 0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(6.9375f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(6.9375f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(15.875f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.125f, -0.1875f, -0.8125f, 0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(6.9375f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.125f, -0.375f, -0.8125f, 0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(6.9375f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(6.9375f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(15.875f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.625f, 0, -0.8125f, 0.625f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.625f, 0.3125f, -0.8125f, 0.625f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-7.3125f, -4.875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.625f, 0, -0.8125f, 0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.625f, -0.1875f, -0.8125f, 0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 140, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.625f, 0, -0.8125f, 0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.625f, -0.1875f, -0.8125f, 0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 140, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.625f, 0, -0.8125f, 0.625f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.625f, -0.375f, -0.8125f, 0.625f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-7.3125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 189, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(2.125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 189, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(2.125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.75f, 0, 0.3125f, -0.75f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-21.3125f, -6.125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-21.3125f, -11.4375f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.3125f, -0.75f, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-21.3125f, -10.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.3125f, -0.75f, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-17.5f, -10.8125f, 9.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-68.8125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-68.8125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-55.5625f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-55.5625f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-38.3125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-38.3125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-60, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-60, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-46.75f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.75f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.125f, -8.375f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-29.125f, -10.8125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-68.8125f, -6.125f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-68.8125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-68.8125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-68.8125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-55.5625f, -6.125f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-55.5625f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-55.5625f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-55.5625f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.375f, 0, -0.8125f, 0.375f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.375f, 0.3125f, -0.8125f, 0.375f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-38.3125f, -6.125f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.375f, 0, -0.8125f, 0.375f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.375f, -0.1875f, -0.8125f, 0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-38.3125f, -9.1875f, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.375f, 0, -0.8125f, 0.375f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.375f, -0.1875f, -0.8125f, 0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-38.3125f, -9.1875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.375f, 0, -0.8125f, 0.375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.375f, -0.375f, -0.8125f, 0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-38.3125f, -11.4375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 188, textureX, textureY)
			.addShapeBox(-4, 0, -1.25f, 1, 1, 1, 0, 0, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(64.875f, -1.1875f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 188, textureX, textureY)
			.addShapeBox(-4, 0, -1, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(64.875f, -1.1875f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 188, textureX, textureY)
			.addShapeBox(-4, 0.75f, -1, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(64.875f, -1.1875f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 188, textureX, textureY)
			.addShapeBox(-4, 0, -1.25f, 1, 1, 1, 0, 0, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(70, -1.1875f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 188, textureX, textureY)
			.addShapeBox(-4, 0, -1, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(70, -1.1875f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 188, textureX, textureY)
			.addShapeBox(-4, 0.75f, -1, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(70, -1.1875f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 7, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, 0, 0, 0, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(60.125f, -3.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 7, 0, 0, 0, -0.125f, -0.5f, 0, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.125f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(70, -3.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 7, 0, 0, 0, -0.375f, -0.5f, 0, -0.875f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.375f, -0.5f, -0.25f, -0.875f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(70.5f, -3.6875f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 6, 0, 0, 0, 0.125f, -0.75f, 0, -0.375f, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, 0.125f, -0.75f, -0.25f, -0.375f, -0.75f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(71, -3.6875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 6, 6, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.25f, -3.6875f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 3, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -13.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 187, textureX, textureY)
			.addShapeBox(-2.75f, 1.75f, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(64.4375f, -12.9375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 187, textureX, textureY)
			.addShapeBox(-2.75f, 2.5f, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(64.4375f, -12.9375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 187, textureX, textureY)
			.addShapeBox(-2.75f, 1.75f, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(64.4375f, -12.9375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 7, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(60, -4.1875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 7, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.875f, -0.5f, -0.5f, -0.875f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(60.5f, -2.8125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 10, 6, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.375f, -0.5f, 0, 0.375f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(65.625f, -7.4375f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 187, textureX, textureY)
			.addShapeBox(-3.75f, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(70.25f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 177, textureX, textureY)
			.addShapeBox(-3.75f, 0, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(70.25f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 176, textureX, textureY)
			.addShapeBox(-3.75f, 0.75f, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(70.25f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 175, textureX, textureY)
			.addShapeBox(-2.125f, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(74.75f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 174, textureX, textureY)
			.addShapeBox(-2.125f, 0, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(74.75f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 174, textureX, textureY)
			.addShapeBox(-2.125f, 0.75f, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(74.75f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 174, textureX, textureY)
			.addShapeBox(-2.125f, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(78.25f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 173, textureX, textureY)
			.addShapeBox(-2.125f, 0, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(78.25f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 172, textureX, textureY)
			.addShapeBox(-2.125f, 0.75f, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(78.25f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 172, textureX, textureY)
			.addShapeBox(-2.125f, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(82.875f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 172, textureX, textureY)
			.addShapeBox(-2.125f, 0, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(82.875f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 172, textureX, textureY)
			.addShapeBox(-2.125f, 0.75f, -0.25f, 1, 1, 1, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(82.875f, -3.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -14.4375f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-88.8125f, -12.6875f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -13.9375f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, -12.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.8125f, -11.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.8125f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.8125f, 1.5625f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.5625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-88.5625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-88.5625f, -11.9375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-87.0625f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(-87.0625f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-87.0625f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(-87.0625f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-87.0625f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-87.0625f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(-87.0625f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(-87.0625f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 1, 21, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86.5625f, 2.0625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.8125f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0)
			.setRotationPoint(-46.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 1.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -3.75f, 0)
			.setRotationPoint(-45.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-45.625f, 1.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 5.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 1.8125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 2.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 2.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.625f, 3.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 3.5625f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 1, 1, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.625f, 5.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(29.625f, 1.8125f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 4, 9, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -3.75f, 0, 0, -3.75f, 0, 0, 0.25f, 0)
			.setRotationPoint(29.625f, 2.5625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, -0.75f, 0, 0, -1, 0, 0, -1, 1, 0, -0.75f, 1)
			.setRotationPoint(45.625f, 2.5625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.1875f, 2.5625f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(23.6875f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(26.6875f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(23.9375f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.3125f, 2.5625f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-21.8125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-17.8125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-13.8125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-9.8125f, 5.5625f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-21.5625f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -1, 0, -0.75f, -0.5f, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.75f, -0.75f, -1, -0.75f, -0.75f)
			.setRotationPoint(-13.5625f, 5.5625f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 169, textureX, textureY).addCylinder(0, 0, 0, 2, 6, 8, 1, 1, 3, null)
			.setRotationPoint(-35.3125f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 97, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-35.5625f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 94, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-35.8125f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 89, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.875f, 1, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-30.0625f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 87, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.5f, 0.875f, 2, new Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-29.8125f, 5.0625f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-34.8125f, 2.5625f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-30.5625f, 2.5625f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-34.8125f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-30.5625f, 2.5625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(84.5625f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(86.8125f, 2.5625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-84.4375f, 2.5625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-84.4375f, 4.3125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-79.6875f, 2.5625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-79.6875f, 4.3125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.9375f, 4.3125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-83.9375f, 6.0625f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(83.9375f, 2.5625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(83.9375f, 4.3125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(79.1875f, 2.5625f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(79.1875f, 4.3125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(79.6875f, 4.3125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(79.6875f, 6.0625f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 8, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-86.5625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 2, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5625f, -13.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 8, 1, 0, 0, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.625f, -0.25f, -0.5f, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(58.1875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-58.8125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 8, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-45.5625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-27.9375f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-16.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(3.3125f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17.0625f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(30.6875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(44.6875f, -11.4375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0.375f, 0.125f, -0.5f, 0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-38.3125f, -4.8125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-21.3125f, -4.8125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 6, 1, 0, 0, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.125f, 0.25f, -0.5f, 0.125f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-86.5625f, -3.6875f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-68.8125f, -6.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-55.5625f, -6.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.375f, 0, -0.8125f, 0.375f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.375f, 0.3125f, -0.8125f, 0.375f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-38.3125f, -6.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.625f, 0, -0.8125f, 0.625f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.625f, 0.3125f, -0.8125f, 0.625f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-7.3125f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.125f, 0.3125f, -0.8125f, 0.125f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(6.9375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(20.6875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0.25f, 0.3125f, -0.8125f, 0.25f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(34.4375f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(48.1875f, -4.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, -0.75f, 0, 0.3125f, -0.75f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-21.3125f, -6.125f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-60, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 164, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-60, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-46.75f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 160, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-46.75f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-29.125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(2.125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(15.875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(15.875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(29.5f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(29.5f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(43.5f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 150, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(43.5f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(57, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(57, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.3125f, -0.75f, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-17.5f, -10.8125f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-68.8125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 144, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-68.8125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-55.5625f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 144, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-55.5625f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.25f, -0.8125f, 0.1875f, 0.25f, -0.8125f, 0.1875f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-38.3125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-38.3125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-7.3125f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(6.9375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(6.9375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(20.6875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(20.6875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(34.4375f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 102, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(34.4375f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.8125f, 0.1875f, 0.5f, -0.8125f, 0.1875f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(48.1875f, -8.375f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48.1875f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.3125f, -0.75f, 0.1875f, -0.3125f, -0.75f, 0.1875f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-21.3125f, -10.8125f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(48.1875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(48.1875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48.1875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(34.4375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 134, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.25f, -0.1875f, -0.8125f, 0.25f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(34.4375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 134, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.25f, 0, -0.8125f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.25f, -0.375f, -0.8125f, 0.25f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(34.4375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(20.6875f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	private final void initGroup_clipboard1(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(20.6875f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(20.6875f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.125f, -0.1875f, -0.8125f, 0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(6.9375f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.125f, -0.1875f, -0.8125f, 0.125f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(6.9375f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.125f, 0, -0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.125f, -0.375f, -0.8125f, 0.125f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(6.9375f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.625f, 0, -0.8125f, 0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.625f, -0.1875f, -0.8125f, 0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 131, textureX, textureY)
			.addShapeBox(0, 2, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.625f, 0, -0.8125f, 0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.625f, -0.1875f, -0.8125f, 0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-7.3125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 131, textureX, textureY)
			.addShapeBox(0, 2, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.625f, 0, -0.8125f, 0.625f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.625f, -0.375f, -0.8125f, 0.625f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 52, textureX, textureY)
			.addShapeBox(0, 2, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-7.3125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 41, textureX, textureY)
			.addShapeBox(0, 2, 0, 1, 2, 1, 0, 0, 0, -0.8125f, 0.1875f, 0, -0.8125f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.1875f, -0.375f, -0.8125f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(2.125f, -10.8125f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.375f, 0, -0.8125f, 0.375f, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0.375f, -0.375f, -0.8125f, 0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-38.3125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-21.3125f, -11.4375f, -11.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-68.8125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-55.5625f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.375f, 0, -0.8125f, 0.375f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.375f, -0.1875f, -0.8125f, 0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-38.3125f, -9.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0.375f, 0, -0.8125f, 0.375f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0.375f, -0.1875f, -0.8125f, 0.375f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-38.3125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 131, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-68.8125f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 120, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-68.8125f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 117, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.1875f, -0.8125f, 0, -0.1875f, -0.8125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-55.5625f, -9.1875f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 112, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 10, 1, 1, 0, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.8125f, 0, -0.375f, -0.8125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-55.5625f, -11.4375f, -11.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -13.4375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, -13.4375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(86.0625f, -13.4375f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -12.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.5625f, -12.6875f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -0.5f, -3, -0.75f, -0.5f, -3, -0.75f, -0.5f, -3.25f, 0, -0.5f, -3.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -13.9375f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(88.5625f, -14.4375f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(88.5625f, -11.4375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(88.5625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, 1.5625f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(87.0625f, -11.4375f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(87.0625f, -11.4375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(87.0625f, -11.9375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.5625f, -11.4375f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(86.5625f, -11.4375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.5625f, -11.4375f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(86.5625f, -10.1875f, 1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.1875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f, -0.375f, 0, -0.6875f, -0.375f, 0, -0.6875f, -0.375f, -0.8125f, -0.1875f, -0.375f, -0.8125f)
			.setRotationPoint(86.5625f, -10.1875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(86.5625f, -10.1875f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.6875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.6875f, -0.8125f, 0.0625f, -0.1875f, -0.8125f, 0.0625f)
			.setRotationPoint(86.5625f, -5.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
			.setRotationPoint(86.5625f, -5.5625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5625f, -0.6875f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-55.5625f, -4.8125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-68.8125f, -4.8125f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -13.4375f, -11.02f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -13.4375f, 11.02f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 2, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -13.4375f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.3125f, 0, -0.5f, -1.1875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, -0.3125f, -0.75f, -0.5f, -1.1875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-5.0625f, -2.9375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.3125f, 0, -0.5f, -1.1875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, -0.3125f, -0.75f, -0.5f, -1.1875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(8.9375f, -2.9375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.3125f, 0, -0.5f, -1.1875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, -0.3125f, -0.75f, -0.5f, -1.1875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(36.5f, -2.9375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.3125f, 0, -0.5f, -1.1875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, -0.3125f, -0.75f, -0.5f, -1.1875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(22.625f, -2.9375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.3125f, 0, -0.5f, -1.1875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, -0.3125f, -0.75f, -0.5f, -1.1875f, -0.75f, -0.5f, -0.875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(50.125f, -2.9375f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.75f, 0, 0, 0.25f, 0, 0, -0.5f, -0.75f, -0.5f, -1.5f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0.25f, -0.75f, 0)
			.setRotationPoint(-4.5f, -2.9375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.75f, 0, 0, 0.25f, 0, 0, -0.5f, -0.75f, -0.5f, -1.5f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0.25f, -0.75f, 0)
			.setRotationPoint(9.5f, -2.9375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.75f, 0, 0, 0.25f, 0, 0, -0.5f, -0.75f, -0.5f, -1.5f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0.25f, -0.75f, 0)
			.setRotationPoint(37.0625f, -2.9375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.75f, 0, 0, 0.25f, 0, 0, -0.5f, -0.75f, -0.5f, -1.5f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0.25f, -0.75f, 0)
			.setRotationPoint(23.1875f, -2.9375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.75f, 0, 0, 0.25f, 0, 0, -0.5f, -0.75f, -0.5f, -1.5f, -0.75f, -0.5f, -0.75f, -0.75f, 0, 0.25f, -0.75f, 0)
			.setRotationPoint(50.6875f, -2.9375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 1, 0, 0, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.8125f, 1.5625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, 1.5625f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.0625f, -11.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.8125f, -11.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -12.1875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 1, 0, 0, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, 1.5625f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 6, 1, 0, 0, 0, -0.5f, 0.375f, 0, -0.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0.375f, 0.25f, -0.5f, 0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-78.8125f, -3.6875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 6, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -3.6875f, -11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 166, 6, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-78.5625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.0625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.8125f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-80.5625f, -3.6875f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-83.0625f, -3.6875f, 10.885f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
	}

	ModelPullmanPalaceBogie bogie = new ModelPullmanPalaceBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/pullman_palace_bogie.png"));

		GL11.glPushMatrix();
		GL11.glTranslatef(3.875f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(-3.875f,0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

}
