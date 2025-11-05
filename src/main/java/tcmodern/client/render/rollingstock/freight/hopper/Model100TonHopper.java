//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.freight.hopper;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tcmodern.client.render.rollingstock.bogies.ModelGenericFreightBogie;
import tcmodern.common.entities.freight.hoppers.Entity40TonWoodenHopper;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model100TonHopper extends FVTMFormatBase {

	public Model100TonHopper(){
		super();
		textureX = 512;
		textureY = 128;
		addToCreators("broscolotos");
		//
		initGroup_Coal();
		initGroup_clipboard();
		initGroup_Coal2();
		for (TurboList l : groups) {
			ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, false, true);
		}
	}

	private final void initGroup_Coal(){
		TurboList Coal = new TurboList("Coal");
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -1.24f, 0, 0, -0.99f, 0)
			.setRotationPoint(-58, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal0")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.010000005f, 0, 0, -0.24f, 0)
			.setRotationPoint(-58, -22.5f, -3).setRotationAngle(0, 0, 0).setName("Coal1")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, -1.24f, 0, 0, -0.99f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-58, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal2")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 0.25f, 0, 0.5f, 1.25f, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, -0.24f, 0, 0.5f, -1.24f, 0, 0.5f, 0.010000005f, 0, 0, -0.49f, 0)
			.setRotationPoint(-64.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal3")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 1, 0, 0, 0.5f, 0, 0, 0.01f, 0, 0.5f, 0.01f, 0, 0.5f, -0.99f, 0, 0, -0.49f, 0)
			.setRotationPoint(-64.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal4")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.5f, 0, 0.5f, 1, 0, 0.5f, 1.25f, 0, 0, 0.25f, 0, 0, -0.49f, 0, 0.5f, -0.99f, 0, 0.5f, -1.24f, 0, 0, -0.24f, 0)
			.setRotationPoint(-64.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal5")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -0.75f, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, 1.625f, 0, 0, 0.76f, 0, 0, 0.51f, 0, 0, -1.49f, 0, 0, -1.615f, 0)
			.setRotationPoint(-31, -22.5f, -10).setRotationAngle(0, 0, 0).setName("Coal6")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.625f, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0, -0.615f, 0, 0, -0.49f, 0, 0, -0.24f, 0, 0, -0.49f, 0)
			.setRotationPoint(-31, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Coal7")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -1.49f, 0, 0, -1.24f, 0, 0, 1.26f, 0, 0, 0.51f, 0)
			.setRotationPoint(-31, -22.5f, 4).setRotationAngle(0, 0, 0).setName("Coal8")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 0, 0, 0.5f, 1.5f, 0, 0.5f, -0.5f, 0, 0, -0.75f, 0, 0, 0.00999999f, 0, 0.5f, -1.49f, 0, 0.5f, 0.51f, 0, 0, 0.76f, 0)
			.setRotationPoint(-37.5f, -22.5f, 4).setRotationAngle(0, 0, 0).setName("Coal9")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 1.625f, 0, 0, 0.25f, 0, 0, 0.76f, 0, 0.5f, 0.76f, 0, 0.5f, -1.615f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(-37.5f, -22.5f, -10).setRotationAngle(0, 0, 0).setName("Coal10")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, -0.75f, 0, 0.5f, 0.625f, 0, 0.5f, 0.5f, 0, 0, -1, 0, 0, 0.76f, 0, 0.5f, -0.615f, 0, 0.5f, -0.49f, 0, 0, 1.01f, 0)
			.setRotationPoint(-37.5f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Coal11")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0.25f, 0, 0, 1.25f, 0, 0, 0.75f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, -1.24f, 0, 0, -0.74f, 0)
			.setRotationPoint(-44.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal12")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.26f, 0, 0, -0.24000001f, 0, 0, 0.00999999f, 0, 0, 0.01f, 0)
			.setRotationPoint(-44.5f, -22.5f, -3).setRotationAngle(0, 0, 0).setName("Coal13")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1, 0, 0, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.99f, 0, 0, -0.99f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-44.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal14")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 1.25f, 0, 0.5f, 1.25f, 0, 0.5f, 0.25f, 0, 0, 0.5f, 0, 0, -1.24f, 0, 0.5f, -1.24f, 0, 0.5f, -0.24f, 0, 0, -0.49f, 0)
			.setRotationPoint(-51, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal15")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.75f, 0, 0, 1.25f, 0, 0, 0.01f, 0, 0.5f, 0.01f, 0, 0.5f, -0.74f, 0, 0, -1.24f, 0)
			.setRotationPoint(-51, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal16")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.24f, 0, 0.5f, 0.26f, 0, 0.5f, 0.010000005f, 0, 0, 0.01f, 0)
			.setRotationPoint(-51, -22.5f, -3).setRotationAngle(0, 0, 0).setName("Coal17")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 1.5f, 0, 0.5f, 1.25f, 0, 0.5f, -0.5f, 0, 0, -0.25f, 0, 0, -1.49f, 0, 0.5f, -1.24f, 0, 0.5f, 0.51f, 0, 0, 0.26f, 0)
			.setRotationPoint(-10.5f, -22.25f, 4).setRotationAngle(0, 0, 0).setName("Coal18")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, -0.25f, 0, 0.5f, -0.5f, 0, 0.5f, 1, 0, 0, 1.5f, 0, 0, 0.26f, 0, 0.5f, 0.51f, 0, 0.5f, -0.99f, 0, 0, -1.49f, 0)
			.setRotationPoint(-10.5f, -22.25f, -10).setRotationAngle(0, 0, 0).setName("Coal19")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0, 0.5f, 0, 0, -0.49f, 0, 0.5f, 0.01f, 0, 0.5f, -0.24f, 0, 0, -0.49f, 0)
			.setRotationPoint(-10.5f, -23.25f, -3).setRotationAngle(0, 0, 0).setName("Coal20")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -1, 0, 0, -0.75f, 0, 0, 1, 0, 0, 0.75f, 0, 0, 1.01f, 0, 0, 0.76f, 0, 0, -0.99f, 0, 0, -0.74f, 0)
			.setRotationPoint(-17.5f, -22.75f, -10).setRotationAngle(0, 0, 0).setName("Coal21")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.26f, 0, 0, 0.01f, 0, 0, 0.010000005f, 0, 0, 0.01f, 0)
			.setRotationPoint(-17.5f, -23.75f, -3).setRotationAngle(0, 0, 0).setName("Coal22")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1, 0, 0, 1, 0, 0, -0.75f, 0, 0, -1, 0, 0, -0.99f, 0, 0, -0.99f, 0, 0, 0.76f, 0, 0, 1.01f, 0)
			.setRotationPoint(-17.5f, -22.75f, 4).setRotationAngle(0, 0, 0).setName("Coal23")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 1.5f, 0, 0.5f, 1.5f, 0, 0.5f, -0.5f, 0, 0, -1, 0, 0, -1.49f, 0, 0.5f, -1.49f, 0, 0.5f, 0.51f, 0, 0, 1.01f, 0)
			.setRotationPoint(-24, -22.25f, 4).setRotationAngle(0, 0, 0).setName("Coal24")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, -0.5f, 0, 0.5f, -0.75f, 0, 0.5f, 1, 0, 0, 1.5f, 0, 0, 0.51f, 0, 0.5f, 0.76f, 0, 0.5f, -0.99f, 0, 0, -1.49f, 0)
			.setRotationPoint(-24, -22.5f, -10).setRotationAngle(0, 0, 0).setName("Coal25")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, -0.49f, 0, 0.5f, 0.01f, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0)
			.setRotationPoint(-24, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Coal26")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.5f, 0, 0, 0, 0, 0, 1.5f, 0, 0, 2, 0, 0, -0.49f, 0, 0, 0.01f, 0, 0, -1.49f, 0, 0, -1.99f, 0)
			.setRotationPoint(-4, -21.25f, -10).setRotationAngle(0, 0, 0).setName("Coal27")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 1.25f, 0, 0, -0.99f, 0, 0, -0.49f, 0, 0, 0.010000005f, 0, 0, -1.24f, 0)
			.setRotationPoint(-4, -22.25f, -3).setRotationAngle(0, 0, 0).setName("Coal28")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 2.25f, 0, 0, 1, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0, -2.24f, 0, 0, -0.99f, 0, 0, -0.24f, 0, 0, -0.49f, 0)
			.setRotationPoint(-4, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal29")
		);
		Coal.add(new ModelRendererTurbo(Coal, 16, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1.25f, 0, 0.5f, 1.75f, 0, 0.5f, 0.875f, 0, 0, 0.5f, 0, 0, -1.24f, 0, 0.5f, -1.74f, 0, 0.5f, -0.875f, 0, 0, -0.49f, 0)
			.setRotationPoint(3, -21, 4).setRotationAngle(0, 0, 0).setName("Coal30")
		);
		Coal.add(new ModelRendererTurbo(Coal, 15, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 1.75f, 0, 0, 1.5f, 0, 0, 0.01f, 0, 0.5f, -0.49f, 0, 0.5f, -1.74f, 0, 0, -1.49f, 0)
			.setRotationPoint(3, -21.25f, -10).setRotationAngle(0, 0, 0).setName("Coal31")
		);
		Coal.add(new ModelRendererTurbo(Coal, 15, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.5f, 0, 0.5f, 0.75f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.75f, 0, 0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(3, -22.25f, -3).setRotationAngle(0, 0, 0).setName("Coal32")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(51, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal0cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.010000005f, 0)
			.setRotationPoint(51, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal1cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(51, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal2cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0, 0, -0.44f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(58.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal3cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.01f, 0, 0, 0.01f, 0, 0, -0.49f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(58.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal4cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.01f, 0, 0, -0.49f, 0, 0, -0.24f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(58.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal5cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.625f, 0, 0, 0.5f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, -0.615f, 0, 0, -0.49f, 0)
			.setRotationPoint(24, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal6cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.5f, 0, 0, 0.625f, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0, -0.49f, 0, 0, -0.615f, 0, 0, -0.49f, 0, 0, -0.24f, 0)
			.setRotationPoint(24, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal7cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0, -0.49f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(24, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal8cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f, -0.49f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(31.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal9cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.625f, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0.5f, -0.615f, 0)
			.setRotationPoint(31.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal10cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.5f, 0, 0.5f, -0.615f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0.5f, -0.49f, 0)
			.setRotationPoint(31.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal11cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, 0.26f, 0, 0, -0.24f, 0)
			.setRotationPoint(37.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal12cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0, 0.26f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(37.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal13cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(37.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal14cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0.5f, 0.25f, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0, 0, -0.49f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(45, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal15cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0.5f, 0.26f, 0)
			.setRotationPoint(45, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal16cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.26f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(45, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal17cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0.00999999f, 0, 0, -1.24f, 0)
			.setRotationPoint(10.5f, -21.75f, -10).setRotationAngle(0, 0, 0).setName("Coal21cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1.24f, 0, 0, 0.01999998f, 0, 0, 0.00999999f, 0, 0, -0.99f, 0)
			.setRotationPoint(10.5f, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Coal22cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.99f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.114999995f, 0)
			.setRotationPoint(10.5f, -21.75f, 4).setRotationAngle(0, 0, 0).setName("Coal23cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, 0.5f, -0.49f, 0)
			.setRotationPoint(18, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal24cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.25f, 0, 0, 0, 0, 0, 0.5f, 0, 0.5f, 0.25f, 0, 0.5f, -0.24f, 0, 0, 0.01f, 0, 0, -0.49f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(18, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal25cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.25f, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, -0.24f, 0, 0, -0.49f, 0, 0, -0.24f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(18, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal26cp")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -0.5f, 0, 0, -0.75f, 0, 0, 1.625f, 0, 0, 1.5f, 0, 0, 0.51f, 0, 0, 0.76f, 0, 0, -1.615f, 0, 0, -1.49f, 0)
			.setRotationPoint(44, -22.5f, -10).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 0")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.5f, 0, 0, 0.625f, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0, -0.49f, 0, 0, -0.615f, 0, 0, -0.49f, 0, 0, -0.24f, 0)
			.setRotationPoint(44, -23.5f, -3).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 1")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1.25f, 0, 0, 1.5f, 0, 0, -0.5f, 0, 0, -1.25f, 0, 0, -1.24f, 0, 0, -1.49f, 0, 0, 0.51f, 0, 0, 1.26f, 0)
			.setRotationPoint(44, -22.5f, 4).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 2")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 1.5f, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.5f, 0, 0.5f, -1.49f, 0, 0, 0.00999999f, 0, 0, 0.76f, 0, 0.5f, 0.51f, 0)
			.setRotationPoint(51.5f, -22.5f, 4).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 3")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0.25f, 0, 0.5f, 1.625f, 0, 0.5f, 0.76f, 0, 0, 0.76f, 0, 0, -0.24000001f, 0, 0.5f, -1.615f, 0)
			.setRotationPoint(51.5f, -22.5f, -10).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 4")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.625f, 0, 0, -0.75f, 0, 0, -1, 0, 0.5f, 0.5f, 0, 0.5f, -0.615f, 0, 0, 0.76f, 0, 0, 1.01f, 0, 0.5f, -0.49f, 0)
			.setRotationPoint(51.5f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 5")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 1.25f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, 0.26f, 0, 0, -1.24f, 0)
			.setRotationPoint(57.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 6")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 1.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 1, 0, 0, -1.24f, 0, 0, 0.26f, 0, 0, 0.01f, 0, 0, -0.99f, 0)
			.setRotationPoint(57.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 7")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.99f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(57.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 8")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 1.25f, 0, 0, 1.5f, 0, 0, -0.25f, 0, 0.5f, -0.5f, 0, 0.5f, -1.24f, 0, 0, -1.49f, 0, 0, 0.26f, 0, 0.5f, 0.51f, 0)
			.setRotationPoint(24.5f, -22.25f, 4).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 9")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, -0.5f, 0, 0, -0.25f, 0, 0, 1.5f, 0, 0.5f, 1, 0, 0.5f, 0.51f, 0, 0, 0.26f, 0, 0, -1.49f, 0, 0.5f, -0.99f, 0)
			.setRotationPoint(24.5f, -22.25f, -10).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 10")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0.25f, 0, 0.5f, 0.01f, 0, 0, -0.49f, 0, 0, -0.49f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(24.5f, -23.25f, -3).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 11")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -0.75f, 0, 0, -1, 0, 0, 0.75f, 0, 0, 1, 0, 0, 0.76f, 0, 0, 1.01f, 0, 0, -0.74f, 0, 0, -0.99f, 0)
			.setRotationPoint(30.5f, -22.75f, -10).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 12")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.26f, 0, 0, 0.01f, 0, 0, 0.010000005f, 0)
			.setRotationPoint(30.5f, -23.75f, -3).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 13")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.99f, 0, 0, -0.99f, 0, 0, 1.01f, 0, 0, 0.76f, 0)
			.setRotationPoint(30.5f, -22.75f, 4).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 14")
		);
		Coal.add(new ModelRendererTurbo(Coal, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 1.5f, 0, 0, 1.5f, 0, 0, -1, 0, 0.5f, -0.5f, 0, 0.5f, -1.49f, 0, 0, -1.49f, 0, 0, 1.01f, 0, 0.5f, 0.51f, 0)
			.setRotationPoint(38, -22.25f, 4).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 15")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, -0.75f, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0.5f, 1, 0, 0.5f, 0.76f, 0, 0, 0.51f, 0, 0, -1.49f, 0, 0.5f, -0.99f, 0)
			.setRotationPoint(38, -22.5f, -10).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 16")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.01f, 0, 0, -0.49f, 0, 0, -0.24f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(38, -23.5f, -3).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 17")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0.5f, 0, 0, 2, 0, 0, 1.5f, 0, 0, 0.01f, 0, 0, -0.49f, 0, 0, -1.99f, 0, 0, -1.49f, 0)
			.setRotationPoint(17, -21.25f, -10).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 18")
		);
		Coal.add(new ModelRendererTurbo(Coal, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.5f, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, -0.49f, 0, 0, -0.99f, 0, 0, -1.24f, 0, 0, 0.010000005f, 0)
			.setRotationPoint(17, -22.25f, -3).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 19")
		);
		Coal.add(new ModelRendererTurbo(Coal, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 1, 0, 0, 2.25f, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0, -0.99f, 0, 0, -2.24f, 0, 0, -0.49f, 0, 0, -0.24f, 0)
			.setRotationPoint(17, -21.25f, 4).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 20")
		);
		Coal.add(new ModelRendererTurbo(Coal, 16, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 1.75f, 0, 0, 1.25f, 0, 0, 0.5f, 0, 0.5f, 0.875f, 0, 0.5f, -1.74f, 0, 0, -1.24f, 0, 0, -0.49f, 0, 0.5f, -0.875f, 0)
			.setRotationPoint(11, -21, 4).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 21")
		);
		Coal.add(new ModelRendererTurbo(Coal, 15, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 1.5f, 0, 0.5f, 1.75f, 0, 0.5f, -0.49f, 0, 0, 0.01f, 0, 0, -1.49f, 0, 0.5f, -1.74f, 0)
			.setRotationPoint(11, -21.25f, -10).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 22")
		);
		Coal.add(new ModelRendererTurbo(Coal, 15, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, -0.75f, 0, 0, -0.5f, 0, 0, 0, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(11, -22.25f, -3).setRotationAngle(0, 0, 0).setName("waawno polygon/s selected 23")
		);
		groups.add(Coal);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 131, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, 1.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 131, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, 1.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, 1.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, -21.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, -21.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, 1.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, -21.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, -21.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, -21.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-65.5f, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(64.5f, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 129, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-64.5f, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 129, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-64.5f, -22, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, -21.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 21, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-65.5f, -21.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 20, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-54.5f, -2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.5f, 1.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 20, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -11.25f, -1, 0, 10.75f, -1, 0, 10.75f, -1, 0, -11.25f, -1, 0)
			.setRotationPoint(-65.25f, -11.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 19, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -9, 0, 0, 0, 0, 0, 0, -0.5f, 0, -9, -0.5f)
			.setRotationPoint(-65, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 19, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -9, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -9, 0)
			.setRotationPoint(-65, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 21, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(64.5f, -21.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 20, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, 1.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 20, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 10.75f, 0, 0, -11.25f, 0, 0, -11.25f, 0, 0, 10.75f, 0, 0)
			.setRotationPoint(64.25f, -11.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 19, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -9, 0, 0, -9, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(54, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 19, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -9, -0.5f, 0, -9, 0, 0, 0, 0)
			.setRotationPoint(54, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 108, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -21.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 0, 20, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, 1.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 0, 20, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, 1.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.5f, 1.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, 1.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 20, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 1.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 20, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(6.25f, 1.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 10, 20, 0, -9.875f, 0, 0, -9.875f, 0, 0, -9.875f, 0, 0, -9.875f, 0, 0, 0.125f, -5, 0, 0.125f, -5, 0, 0.125f, -5, 0, 0.125f, -5, 0)
			.setRotationPoint(-27.625f, -3.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 8, 20, 0, -8.875f, 0, 0, -8.875f, 0, 0, -8.875f, 0, 0, -8.875f, 0, 0, 0.25f, -3, 0, 0.25f, -3, 0, 0.25f, -3, 0, 0.25f, -3, 0)
			.setRotationPoint(6.5f, -3.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 101, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.5f, -1.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 2, 2, 0, 1.25f, 0, -2, 1.25f, 0, -2, 1.25f, 0, 0, 1.25f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-53.5f, -3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 2, 2, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -2, 1.25f, 0, -2, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-53.5f, -3.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, -12, 2, 0, -12, 2, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 10, 0)
			.setRotationPoint(16.625f, -15.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, -12, 2, 0, -12, 2, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 10, 0)
			.setRotationPoint(-17.125f, -15.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, -12, 2, 0, -12, 2, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.625f, -15.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, -12, 2, 0, -12, 2, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.125f, -15.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-54, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(52, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.5f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-37, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-28.25f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-19, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.5f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-1, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(7.5f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(17, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(26.5f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(35, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(43.5f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.25f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7.5f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.5f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.5f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.875f, 0, 0, 0.75f, 0, -0.5f, -1.75f, 0, -0.5f, -1.75f, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(28.5f, 3.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.75f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.75f, 0, 0, -2.53125f, 0.125f, -0.5f, -5.46875f, 0.125f, -0.5f, -5.46875f, 0.125f, 0, -2.53125f, 0.125f, 0)
			.setRotationPoint(28.5f, 4.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.875f, 0, 0, 0.75f, 0, -0.5f, -1.75f, 0, -0.5f, -1.75f, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(28.5f, 3.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.75f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.75f, 0, 0, -2.53125f, 0.125f, -0.5f, -5.46875f, 0.125f, -0.5f, -5.46875f, 0.125f, 0, -2.53125f, 0.125f, 0)
			.setRotationPoint(28.5f, 4.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 1, 0, 0.875f, 1, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.875f, 0, 0)
			.setRotationPoint(28.5f, 2.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, 2.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(27.625f, 2.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 1.75f, -1, -0.5f, -2.75f, -1, -0.5f, -2.75f, -1, 0, 1.75f, -1, 0)
			.setRotationPoint(38.5f, 3.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 8, 0, -0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.25f, 0, 0, 5.46875f, -1.875f, -0.5f, -6.46875f, -1.875f, -0.5f, -6.46875f, -1.875f, 0, 5.46875f, -1.875f, 0)
			.setRotationPoint(36.5f, 4.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, -0.125f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(27.625f, 3.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 85, textureX, textureY)
			.addShapeBox(-0.375f, 0, 0, 1, 5, 8, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0)
			.setRotationPoint(27.75f, 4.5f, 1.5f).setRotationAngle(0, 0, -46.4f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.875f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.75f, 0, 0, -1.75f, 0, 0, -1.75f, 0, -0.5f, 0.75f, 0, -0.5f)
			.setRotationPoint(28.5f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.75f, 0, -0.5f, -2.53125f, 0.125f, 0, -5.46875f, 0.125f, 0, -5.46875f, 0.125f, -0.5f, -2.53125f, 0.125f, -0.5f)
			.setRotationPoint(28.5f, 4.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.875f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.75f, 0, 0, -1.75f, 0, 0, -1.75f, 0, -0.5f, 0.75f, 0, -0.5f)
			.setRotationPoint(28.5f, 3.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.75f, 0, -0.5f, -2.53125f, 0.125f, 0, -5.46875f, 0.125f, 0, -5.46875f, 0.125f, -0.5f, -2.53125f, 0.125f, -0.5f)
			.setRotationPoint(28.5f, 4.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.875f, 1, 0, 0.25f, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f)
			.setRotationPoint(28.5f, 2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(38.5f, 2.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(27.625f, 2.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 1.75f, -1, 0, -2.75f, -1, 0, -2.75f, -1, -0.5f, 1.75f, -1, -0.5f)
			.setRotationPoint(38.5f, 3.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 8, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, 5.46875f, -1.875f, 0, -6.46875f, -1.875f, 0, -6.46875f, -1.875f, -0.5f, 5.46875f, -1.875f, -0.5f)
			.setRotationPoint(36.5f, 4.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f)
			.setRotationPoint(27.625f, 3.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 82, textureX, textureY)
			.addShapeBox(-0.375f, 0, 0, 1, 5, 8, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, -0.5f)
			.setRotationPoint(27.75f, 4.5f, -9.5f).setRotationAngle(0, 0, -46.4f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, -1.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, -1.75f, 0, -0.5f)
			.setRotationPoint(-38.5f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -5.46875f, 0.125f, 0, -2.53125f, 0.125f, 0, -2.53125f, 0.125f, -0.5f, -5.46875f, 0.125f, -0.5f)
			.setRotationPoint(-36.5f, 4.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, -1.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, -1.75f, 0, -0.5f)
			.setRotationPoint(-38.5f, 3.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -5.46875f, 0.125f, 0, -2.53125f, 0.125f, 0, -2.53125f, 0.125f, -0.5f, -5.46875f, 0.125f, -0.5f)
			.setRotationPoint(-36.5f, 4.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 1, 0, 0.875f, 1, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f)
			.setRotationPoint(-38.5f, 2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-39.5f, 2.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-28.625f, 2.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -2.75f, -1, 0, 1.75f, -1, 0, 1.75f, -1, -0.5f, -2.75f, -1, -0.5f)
			.setRotationPoint(-39.5f, 3.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 8, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -6.46875f, -1.875f, 0, 5.46875f, -1.875f, 0, 5.46875f, -1.875f, -0.5f, -6.46875f, -1.875f, -0.5f)
			.setRotationPoint(-37.5f, 4.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(-28.625f, 3.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 75, textureX, textureY)
			.addShapeBox(-0.625f, 0, 0, 1, 5, 8, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, -0.5f)
			.setRotationPoint(-27.75f, 4.5f, -9.5f).setRotationAngle(0, 0, 46.4f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, 0, 0.25f, 0, 0, -1.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, -1.75f, 0, 0)
			.setRotationPoint(-38.5f, 3.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.25f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.25f, 0, 0, -5.46875f, 0.125f, -0.5f, -2.53125f, 0.125f, -0.5f, -2.53125f, 0.125f, 0, -5.46875f, 0.125f, 0)
			.setRotationPoint(-36.5f, 4.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, 0, 0.25f, 0, 0, -1.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, -1.75f, 0, 0)
			.setRotationPoint(-38.5f, 3.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.25f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.25f, 0, 0, -5.46875f, 0.125f, -0.5f, -2.53125f, 0.125f, -0.5f, -2.53125f, 0.125f, 0, -5.46875f, 0.125f, 0)
			.setRotationPoint(-36.5f, 4.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 1, 0, 0.25f, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-38.5f, 2.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-39.5f, 2.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.875f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-28.625f, 2.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -2.75f, -1, -0.5f, 1.75f, -1, -0.5f, 1.75f, -1, 0, -2.75f, -1, 0)
			.setRotationPoint(-39.5f, 3.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 8, 0, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.75f, 0, 0, -6.46875f, -1.875f, -0.5f, 5.46875f, -1.875f, -0.5f, 5.46875f, -1.875f, 0, -6.46875f, -1.875f, 0)
			.setRotationPoint(-37.5f, 4.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-28.625f, 3.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 73, textureX, textureY)
			.addShapeBox(-0.625f, 0, 0, 1, 5, 8, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0)
			.setRotationPoint(-27.75f, 4.5f, 1.5f).setRotationAngle(0, 0, 46.4f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, -1.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, -1.75f, 0, -0.5f)
			.setRotationPoint(-4.5f, 3.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -5.46875f, 0.125f, 0, -2.53125f, 0.125f, 0, -2.53125f, 0.125f, -0.5f, -5.46875f, 0.125f, -0.5f)
			.setRotationPoint(-2.5f, 4.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, -1.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, -1.75f, 0, -0.5f)
			.setRotationPoint(-4.5f, 3.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -5.46875f, 0.125f, 0, -2.53125f, 0.125f, 0, -2.53125f, 0.125f, -0.5f, -5.46875f, 0.125f, -0.5f)
			.setRotationPoint(-2.5f, 4.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 1, 0, 0.875f, 1, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, 0.25f, 0, -0.5f)
			.setRotationPoint(-4.5f, 2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-5.5f, 2.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(5.375f, 2.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -2.75f, -1, 0, 1.75f, -1, 0, 1.75f, -1, -0.5f, -2.75f, -1, -0.5f)
			.setRotationPoint(-5.5f, 3.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 8, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -6.46875f, -1.875f, 0, 5.46875f, -1.875f, 0, 5.46875f, -1.875f, -0.5f, -6.46875f, -1.875f, -0.5f)
			.setRotationPoint(-3.5f, 4.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.625f, 0, -0.5f)
			.setRotationPoint(5.375f, 3.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 72, textureX, textureY)
			.addShapeBox(-0.625f, 0, 0, 1, 5, 8, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, -0.5f)
			.setRotationPoint(6.25f, 4.5f, -9.5f).setRotationAngle(0, 0, 46.4f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, 0, 0.25f, 0, 0, -1.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, -1.75f, 0, 0)
			.setRotationPoint(-4.5f, 3.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.25f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.25f, 0, 0, -5.46875f, 0.125f, -0.5f, -2.53125f, 0.125f, -0.5f, -2.53125f, 0.125f, 0, -5.46875f, 0.125f, 0)
			.setRotationPoint(-2.5f, 4.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, 0, 0.25f, 0, 0, -1.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, -1.75f, 0, 0)
			.setRotationPoint(-4.5f, 3.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0.25f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.25f, 0, 0, -5.46875f, 0.125f, -0.5f, -2.53125f, 0.125f, -0.5f, -2.53125f, 0.125f, 0, -5.46875f, 0.125f, 0)
			.setRotationPoint(-2.5f, 4.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 1, 0, 0.25f, 1, 0, 0.25f, 0, -0.5f, 0.875f, 0, -0.5f, 0.875f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-4.5f, 2.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-5.5f, 2.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.875f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(5.375f, 2.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -2.75f, -1, -0.5f, 1.75f, -1, -0.5f, 1.75f, -1, 0, -2.75f, -1, 0)
			.setRotationPoint(-5.5f, 3.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 8, 0, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.75f, 0, 0, -6.46875f, -1.875f, -0.5f, 5.46875f, -1.875f, -0.5f, 5.46875f, -1.875f, 0, -6.46875f, -1.875f, 0)
			.setRotationPoint(-3.5f, 4.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.625f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(5.375f, 3.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 51, textureX, textureY)
			.addShapeBox(-0.625f, 0, 0, 1, 5, 8, 0, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, -0.5f, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0)
			.setRotationPoint(6.25f, 4.5f, 1.5f).setRotationAngle(0, 0, 46.4f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66, 2.625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 3, 0, 3, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 3, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f)
			.setRotationPoint(62.8125f, 2.125f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(66.8125f, 2.125f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-70, 2.625f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 3, 0, 0, -0.3125f, -0.25f, 3, -0.3125f, -0.25f, 3, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f)
			.setRotationPoint(-66.8125f, 2.125f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f)
			.setRotationPoint(-67.8125f, 2.125f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61.5f, -21.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60.5f, -21.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -20.875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -20.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.5625f, -20.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -17.375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -17.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.5625f, -17.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -13.875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -13.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.5625f, -13.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -10.375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -10.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.5625f, -10.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -6.875f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -6.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.5625f, -6.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -3.375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, -3.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.5625f, -3.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, 0.125f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.1875f, 0.125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(65.5625f, 0.125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(64.5f, -20.875f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(64.5f, -17.375f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(64.5f, -13.875f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(64.5f, -10.375f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(64.5f, -6.875f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(64.5f, -3.375f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(64.5f, 0.125f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -20.875f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -17.375f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -13.875f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -10.375f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -6.875f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -3.375f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, 0.125f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -20.875f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -13.875f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -6.875f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, 0.125f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -17.375f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -10.375f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, -3.375f, -12.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -20.875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -20.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f)
			.setRotationPoint(-66.5625f, -20.875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -17.375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f)
			.setRotationPoint(-66.5625f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -13.875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -13.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f)
			.setRotationPoint(-66.5625f, -13.875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -10.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -10.375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f)
			.setRotationPoint(-66.5625f, -10.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -6.875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -6.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f)
			.setRotationPoint(-66.5625f, -6.875f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -3.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, -3.375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f)
			.setRotationPoint(-66.5625f, -3.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, 0.125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-66.1875f, 0.125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f)
			.setRotationPoint(-66.5625f, 0.125f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -20.875f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -17.375f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -13.875f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -10.375f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -6.875f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -3.375f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, 0.125f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-61.5f, -20.875f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-61.5f, -17.375f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-61.5f, -13.875f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-61.5f, -10.375f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-61.5f, -6.875f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-61.5f, -3.375f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-61.5f, 0.125f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -20.875f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -13.875f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -6.875f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, 0.125f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -17.375f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -10.375f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, -3.375f, 11.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 8, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0)
			.setRotationPoint(64.5f, -7, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 1, 1, 0, 0, 0, -0.3125f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, -0.375f, -0.25f, -0.75f, -0.5f, -0.25f, -0.6875f, -0.25f, 0, -0.5625f, -0.25f)
			.setRotationPoint(65.4375f, -5.1875f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 0, textureX, textureY)
			.addShapeBox(0, -1, -0.5f, 1, 1, 1, 0, 0, -0.625f, -0.375f, -0.25f, -0.75f, -0.5f, -0.25f, -0.6875f, -0.25f, 0, -0.5625f, -0.25f, 0, 0, -0.3125f, -0.25f, 0, -0.4375f, -0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(65.4375f, -5.1875f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.4375f, 0, 0, -0.3125f, 0, -0.5625f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.75f, -0.5f, 0, -0.625f, -0.375f)
			.setRotationPoint(65.4375f, -5.1875f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 0, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, -0.5625f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, -0.75f, -0.5f, 0, -0.625f, -0.375f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.4375f, 0, 0, -0.3125f)
			.setRotationPoint(65.4375f, -5.1875f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 2, textureX, textureY)
			.addShapeBox(0, -2.125f, -1, 1, 1, 1, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 0, textureX, textureY)
			.addShapeBox(0, -1, -2.625f, 1, 1, 1, 0, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 2, textureX, textureY)
			.addShapeBox(0, -1.8125f, -2.0625f, 1, 1, 1, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 0, textureX, textureY)
			.addShapeBox(0, 1.125f, -1, 1, 1, 1, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 2, textureX, textureY)
			.addShapeBox(0, 0, -2.625f, 1, 1, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 0, textureX, textureY)
			.addShapeBox(0, 0.8125f, -2.0625f, 1, 1, 1, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 2, textureX, textureY)
			.addShapeBox(0, -2.125f, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 2, textureX, textureY)
			.addShapeBox(0, -1, 1.625f, 1, 1, 1, 0, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 0, textureX, textureY)
			.addShapeBox(0, -1.8125f, 1.0625f, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 0, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 1, 1, 1, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 1.625f, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 2, textureX, textureY)
			.addShapeBox(0, 0.8125f, 1.0625f, 1, 1, 1, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 0, textureX, textureY)
			.addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 0, textureX, textureY)
			.addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 0, textureX, textureY)
			.addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 0, textureX, textureY)
			.addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 0, textureX, textureY)
			.addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 0, textureX, textureY)
			.addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 0, textureX, textureY)
			.addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(135, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 0, textureX, textureY)
			.addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(135, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 0, textureX, textureY)
			.addShapeBox(0, 0, -0.75f, 1, 1, 1, 0, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 2, textureX, textureY)
			.addShapeBox(0, -1, -0.75f, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 0, textureX, textureY)
			.addShapeBox(0, 0, -0.25f, 1, 1, 1, 0, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 2, textureX, textureY)
			.addShapeBox(0, -1, -0.25f, 1, 1, 1, 0, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f)
			.setRotationPoint(65.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 8, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0)
			.setRotationPoint(-65.5f, -7, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 0, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 1, 1, 0, -0.25f, 0, -0.4375f, 0, 0, -0.3125f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, -0.5f, 0, -0.625f, -0.375f, 0, -0.5625f, -0.25f, -0.25f, -0.6875f, -0.25f)
			.setRotationPoint(-66.4375f, -5.1875f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 2, textureX, textureY)
			.addShapeBox(0, -1, -0.5f, 1, 1, 1, 0, -0.25f, -0.75f, -0.5f, 0, -0.625f, -0.375f, 0, -0.5625f, -0.25f, -0.25f, -0.6875f, -0.25f, -0.25f, 0, -0.4375f, 0, 0, -0.3125f, 0, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-66.4375f, -5.1875f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3125f, -0.25f, 0, -0.4375f, -0.25f, -0.6875f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.625f, -0.375f, -0.25f, -0.75f, -0.5f)
			.setRotationPoint(-66.4375f, -5.1875f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 2, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.25f, -0.6875f, -0.25f, 0, -0.5625f, -0.25f, 0, -0.625f, -0.375f, -0.25f, -0.75f, -0.5f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3125f, -0.25f, 0, -0.4375f)
			.setRotationPoint(-66.4375f, -5.1875f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 0, textureX, textureY)
			.addShapeBox(0, -2.125f, -1, 1, 1, 1, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 2, textureX, textureY)
			.addShapeBox(0, -1, -2.625f, 1, 1, 1, 0, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 0, textureX, textureY)
			.addShapeBox(0, -1.8125f, -2.0625f, 1, 1, 1, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 2, textureX, textureY)
			.addShapeBox(0, 1.125f, -1, 1, 1, 1, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 0, textureX, textureY)
			.addShapeBox(0, 0, -2.625f, 1, 1, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 0, textureX, textureY)
			.addShapeBox(0, 0.8125f, -2.0625f, 1, 1, 1, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 2, textureX, textureY)
			.addShapeBox(0, -2.125f, 0, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 0, textureX, textureY)
			.addShapeBox(0, -1, 1.625f, 1, 1, 1, 0, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 2, textureX, textureY)
			.addShapeBox(0, -1.8125f, 1.0625f, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 0, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 1, 1, 1, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.1875f, 0.0625f, -0.3125f, -0.1875f, 0.0625f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.3125f, 0.0625f, -0.3125f, -0.3125f, 0.0625f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 2, textureX, textureY)
			.addShapeBox(0, 0, 1.625f, 1, 1, 1, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, 0.3125f, -0.3125f, 0.0625f, -0.8125f, -0.3125f, 0.0625f, -0.8125f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 0, textureX, textureY)
			.addShapeBox(0, 0.8125f, 1.0625f, 1, 1, 1, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.25f, -0.75f, -0.3125f, -0.25f, -0.75f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.75f, -0.25f, -0.3125f, -0.75f, -0.25f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 0, textureX, textureY)
			.addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 0, textureX, textureY)
			.addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 0, textureX, textureY)
			.addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 0, textureX, textureY)
			.addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 0, textureX, textureY)
			.addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 0, textureX, textureY)
			.addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 0, textureX, textureY)
			.addShapeBox(0, 0.25f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, -0.4375f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(135, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 0, textureX, textureY)
			.addShapeBox(0, -1.75f, -0.5f, 1, 2, 1, 0, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f, -0.375f, -0.5f, -0.4375f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(135, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 2, textureX, textureY)
			.addShapeBox(0, 0, -0.75f, 1, 1, 1, 0, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 0, textureX, textureY)
			.addShapeBox(0, -1, -0.75f, 1, 1, 1, 0, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 2, textureX, textureY)
			.addShapeBox(0, 0, -0.25f, 1, 1, 1, 0, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 0, textureX, textureY)
			.addShapeBox(0, -1, -0.25f, 1, 1, 1, 0, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.6875f, -0.25f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f)
			.setRotationPoint(-66.8125f, -5.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.5f, 3.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.5f, 3.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.5f, 1.49f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.5f, 1.49f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 113, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 0.75f, 0.875f, 3, new Vec3f(-0.25, 0.0, 0.0))
			.setRotationPoint(-58.25f, -0.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 107, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.625f, 0.75f, 3, new Vec3f(-0.75, 0.0, 0.0))
			.setRotationPoint(-58.5f, -0.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 100, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 0.875f, 1.0625f, 0, null)
			.setRotationPoint(-62.25f, -0.5f, 3.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 106, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 1.0625f, 0.875f, 0, null)
			.setRotationPoint(-62.25f, -0.5f, 7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 113, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 1.0625f, 1.0625f, 0, null)
			.setRotationPoint(-62.25f, -0.5f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 99, textureX, textureY).addCylinder(0, 0, 0, 1, 6, 8, 1.1875f, 1.1875f, 0, null)
			.setRotationPoint(-56.0625f, -1.0625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 100, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.625f, 0.625f, 3, new Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(54, -0.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 100, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.625f, 0.625f, 3, null)
			.setRotationPoint(-55, -0.25f, -1.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(58, -7.375f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(53, -2.375f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f)
			.setRotationPoint(58, -7.375f, 10.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f)
			.setRotationPoint(-59, -7.375f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65, -2.375f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, 0.1875f, -0.3125f, -0.3125f)
			.setRotationPoint(-65, -7.375f, -11.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(64.5f, 3.5f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(60.5f, 3.5f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(64.5f, 4.875f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(60.5f, 4.875f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, 4.1875f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, 5.5625f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(64.5f, 3.5f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(60.5f, 3.5f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(64.5f, 4.875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(60.5f, 4.875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, 4.1875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f)
			.setRotationPoint(60.5f, 5.5625f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-65.5f, 3.5f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-61.5f, 3.5f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-65.5f, 4.875f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-61.5f, 4.875f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, 4.1875f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, 5.5625f, -11.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-65.5f, 3.5f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-61.5f, 3.5f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-65.5f, 4.875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.3125f)
			.setRotationPoint(-61.5f, 4.875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, 4.1875f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f, -0.625f, -0.3125f, -0.3125f)
			.setRotationPoint(-65.5f, 5.5625f, 10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 129, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.5f, 1.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 99, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 8, 0.875f, 0.875f, 3, new Vec3f(-0.0625, 0.0, 0.0))
			.setRotationPoint(-56.5f, -0.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 98, textureX, textureY).addBox(0, 0, 0, 4, 1, 0)
			.setRotationPoint(-60.75f, -0.75f, 3).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 107, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(-57.0625f, -3.0625f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, -0.125f, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.125f, 0.375f, 0, -3, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -3, -0.875f, 0)
			.setRotationPoint(-57, 0.125f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 320")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63.75f, -0.5f, 9.875f).setRotationAngle(0, 0, 0).setName("Box 321")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63.75f, -0.5f, 3.875f).setRotationAngle(0, 0, 0).setName("Box 322")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 98, textureX, textureY).addBox(-0.5f, 0, -4, 1, 0, 8)
			.setRotationPoint(-59.5f, -0.5f, -1).setRotationAngle(0, -11, 0).setName("Box 196")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 92, textureX, textureY).addBox(-0.5f, -1, -0.5f, 1, 2, 1)
			.setRotationPoint(-59.5f, 0.5f, -1).setRotationAngle(0, -11, 0).setName("Box 199")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 100, textureX, textureY).addBox(-0.5f, 0, 0, 7, 1, 0)
			.setRotationPoint(-59.5f, -0.5f, -1).setRotationAngle(0, 0, 0).setName("Box 326")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 87, textureX, textureY).addBox(-0.5f, 0, -4, 1, 4, 0)
			.setRotationPoint(-59.5f, -0.5f, -1).setRotationAngle(0, -11, 26).setName("Box 327")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 82, textureX, textureY).addBox(-0.5f, 0, -2, 1, 0, 6)
			.setRotationPoint(61, -0.5f, 0).setRotationAngle(0, -11, 0).setName("Box 329")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 99, textureX, textureY).addBox(-0.5f, -1, -0.5f, 1, 2, 1)
			.setRotationPoint(61, 0.5f, 0).setRotationAngle(0, -11, 0).setName("Box 330")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 98, textureX, textureY).addBox(-6.5f, 0, 0, 7, 1, 0)
			.setRotationPoint(61, -0.5f, 0).setRotationAngle(0, 0, 0).setName("Box 331")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 87, textureX, textureY).addBox(-0.5f, 0, 4, 1, 4, 0)
			.setRotationPoint(61, -0.5f, 0).setRotationAngle(0, -11, -26).setName("Box 332")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 82, textureX, textureY).addBox(-0.5f, -1, -0.5f, 3, 3, 1)
			.setRotationPoint(60, 0.5f, -2).setRotationAngle(0, 0, 0).setName("Box 333 cull")
		);
		groups.add(clipboard);
	}

	private final void initGroup_Coal2(){
		TurboList Coal2 = new TurboList("Coal2");
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-58, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal0")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.010000005f, 0, 0, -0.24f, 0)
			.setRotationPoint(-58, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal1")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-58, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal2")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, -0.24f, 0, 0.5f, -0.24f, 0, 0.5f, 0.010000005f, 0, 0, -0.49f, 0)
			.setRotationPoint(-64.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal3")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.01f, 0, 0.5f, 0.01f, 0, 0.5f, 0.010000005f, 0, 0, -0.49f, 0)
			.setRotationPoint(-64.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal4")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, -0.49f, 0, 0.5f, 0.01f, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0)
			.setRotationPoint(-64.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal5")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.625f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, -0.49f, 0, 0, -0.615f, 0)
			.setRotationPoint(-31, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal6")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.625f, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0, -0.615f, 0, 0, -0.49f, 0, 0, -0.24f, 0, 0, -0.49f, 0)
			.setRotationPoint(-31, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal7")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.49f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-31, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal8")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 0.25f, 0, 0.5f, 0.5f, 0, 0.5f, 0, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0.5f, -0.49f, 0, 0.5f, 0.010000005f, 0, 0, -0.24f, 0)
			.setRotationPoint(-37.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal9")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.625f, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0.5f, -0.24f, 0, 0.5f, -0.615f, 0, 0, -0.24f, 0)
			.setRotationPoint(-37.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal10")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.25f, 0, 0.5f, 0.625f, 0, 0.5f, 0.5f, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0.5f, -0.615f, 0, 0.5f, -0.49f, 0, 0, -0.24f, 0)
			.setRotationPoint(-37.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal11")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0, 0.26f, 0)
			.setRotationPoint(-44.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal12")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.26f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-44.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal13")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-44.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal14")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.5f, 0, 0, -0.24f, 0, 0.5f, -0.24f, 0, 0.5f, -0.24f, 0, 0, -0.49f, 0)
			.setRotationPoint(-51, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal15")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0.5f, 0.01f, 0, 0.5f, 0.26f, 0, 0, -0.24f, 0)
			.setRotationPoint(-51, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal16")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.24f, 0, 0.5f, 0.26f, 0, 0.5f, 0.010000005f, 0, 0, 0.01f, 0)
			.setRotationPoint(-51, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal17")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 0.5f, 0, 0.5f, 0.25f, 0, 0.5f, 0, 0, 0, 0.75f, 0, 0, -0.49f, 0, 0.5f, -0.24f, 0, 0.5f, 0.010000005f, 0, 0, -0.74f, 0)
			.setRotationPoint(-10.5f, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal18")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, -0.49f, 0, 0.5f, 0.01f, 0, 0.5f, 0.010000005f, 0, 0, -0.49f, 0)
			.setRotationPoint(-10.5f, -21.25f, -10).setRotationAngle(0, 0, 0).setName("Coal19")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0, 0.5f, 0, 0, -0.49f, 0, 0.5f, 0.01f, 0, 0.5f, -0.24f, 0, 0, -0.49f, 0)
			.setRotationPoint(-10.5f, -21.25f, -3).setRotationAngle(0, 0, 0).setName("Coal20")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0.010000005f, 0, 0, 0.26f, 0)
			.setRotationPoint(-17.5f, -21.75f, -10).setRotationAngle(0, 0, 0).setName("Coal21")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.26f, 0, 0, 0.01f, 0, 0, 0.010000005f, 0, 0, 0.01f, 0)
			.setRotationPoint(-17.5f, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Coal22")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-17.5f, -21.75f, 4).setRotationAngle(0, 0, 0).setName("Coal23")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0, 0, -0.49f, 0, 0.5f, -0.49f, 0, 0.5f, -0.49f, 0, 0, -0.49f, 0)
			.setRotationPoint(-24, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal24")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0, 0, 0.5f, 0.25f, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.01f, 0, 0.5f, -0.24f, 0, 0.5f, 0.010000005f, 0, 0, -0.49f, 0)
			.setRotationPoint(-24, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal25")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, -0.49f, 0, 0.5f, 0.01f, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0)
			.setRotationPoint(-24, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal26")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.49f, 0, 0, 0.01f, 0)
			.setRotationPoint(-4, -21.25f, -10).setRotationAngle(0, 0, 0).setName("Coal27")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0, -0.49f, 0, 0, 0.010000005f, 0, 0, -0.24f, 0)
			.setRotationPoint(-4, -21.25f, -3).setRotationAngle(0, 0, 0).setName("Coal28")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.01f, 0)
			.setRotationPoint(-4, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal29")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 16, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0.25f, 0, 0.5f, 0.75f, 0, 0.5f, 0.875f, 0, 0, 0.5f, 0, 0, -0.24f, 0, 0.5f, -0.74f, 0, 0.5f, -0.875f, 0, 0, -0.49f, 0)
			.setRotationPoint(3, -21, 4).setRotationAngle(0, 0, 0).setName("Coal30")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 15, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.75f, 0, 0, 0.5f, 0, 0, 0.01f, 0, 0.5f, -0.49f, 0, 0.5f, -0.74f, 0, 0, -0.49f, 0)
			.setRotationPoint(3, -21.25f, -10).setRotationAngle(0, 0, 0).setName("Coal31")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 15, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.5f, 0, 0.5f, 0.75f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.75f, 0, 0.5f, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(3, -21.25f, -3).setRotationAngle(0, 0, 0).setName("Coal32")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(51, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal0cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.010000005f, 0)
			.setRotationPoint(51, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal1cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(51, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal2cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0, 0, -0.44f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(58.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal3cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.01f, 0, 0, 0.01f, 0, 0, -0.49f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(58.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal4cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.01f, 0, 0, -0.49f, 0, 0, -0.24f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(58.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal5cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.625f, 0, 0, 0.5f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0, -0.615f, 0, 0, -0.49f, 0)
			.setRotationPoint(24, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal6cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.5f, 0, 0, 0.625f, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0, -0.49f, 0, 0, -0.615f, 0, 0, -0.49f, 0, 0, -0.24f, 0)
			.setRotationPoint(24, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal7cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0, -0.49f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(24, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal8cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f, -0.49f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(31.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal9cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.625f, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0.5f, -0.615f, 0)
			.setRotationPoint(31.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal10cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.625f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.5f, 0, 0.5f, -0.615f, 0, 0, -0.24f, 0, 0, -0.24f, 0, 0.5f, -0.49f, 0)
			.setRotationPoint(31.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal11cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, 0.26f, 0, 0, -0.24f, 0)
			.setRotationPoint(37.5f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal12cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0, 0.26f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(37.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal13cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0)
			.setRotationPoint(37.5f, -21.5f, 4).setRotationAngle(0, 0, 0).setName("Coal14cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.5f, 0, 0.5f, 0.25f, 0, 0.5f, -0.24f, 0, 0, -0.24f, 0, 0, -0.49f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(45, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal15cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0.01f, 0, 0, 0.01f, 0, 0, -0.24f, 0, 0.5f, 0.26f, 0)
			.setRotationPoint(45, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal16cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.26f, 0, 0, -0.24f, 0, 0, 0.01f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(45, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal17cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0.26f, 0, 0, -0.24f, 0)
			.setRotationPoint(10.5f, -21.75f, -10).setRotationAngle(0, 0, 0).setName("Coal21cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 12, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 7, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.24f, 0, 0, 0.26999998f, 0, 0, 0.01f, 0, 0, 0.010000005f, 0)
			.setRotationPoint(10.5f, -21.75f, -3).setRotationAngle(0, 0, 0).setName("Coal22cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, 0.01f, 0, 0, -0.114999995f, 0)
			.setRotationPoint(10.5f, -21.75f, 4).setRotationAngle(0, 0, 0).setName("Coal23cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 14, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 6, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -0.49f, 0, 0, -0.49f, 0, 0, -0.49f, 0, 0.5f, -0.49f, 0)
			.setRotationPoint(18, -21.25f, 4).setRotationAngle(0, 0, 0).setName("Coal24cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0.25f, 0, 0, 0, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, -0.24f, 0, 0, 0.01f, 0, 0, -0.49f, 0, 0.5f, 0.010000005f, 0)
			.setRotationPoint(18, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Coal25cp")
		);
		Coal2.add(new ModelRendererTurbo(Coal2, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 0, 7, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.01f, 0, 0, -0.49f, 0, 0, -0.24f, 0, 0.5f, -0.24f, 0)
			.setRotationPoint(18, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Coal26cp")
		);
		groups.add(Coal2);
	}


	ModelGenericFreightBogie bogie = new ModelGenericFreightBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		int id = entity.getEntityId();
		for (TurboList l : groups) {
			boolean cont = true;
			if (l.name.contains("Coal")) {
				if ((l.name.equals("Coal2") && id % 2 == 0) || (l.name.equals("Coal") && id % 2 == 1)) {
					cont = false;
				}
			}
			if (cont) {
				for (ModelRendererTurbo t : l) {
					t.render(f5);
				}
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/bogies/GenericFreightTruck.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(3.21875f,0.09375f,0f);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(-3.21875f,0.09375f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
