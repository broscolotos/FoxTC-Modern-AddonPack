//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.tender;


import net.minecraft.entity.Entity;
import tcmodern.client.render.rollingstock.bogies.ModelNWTenderFrontBogie;
import tcmodern.client.render.rollingstock.bogies.ModelNWTenderRearBogie;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWTender extends FVTMFormatBase {

	public ModelNWTender(){
		super();
		textureX = 512;
		textureY = 256;
		//
		initGroup_group0();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 201, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 72, 21, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-48.75f, -19, -13).setRotationAngle(0, 0, -0).setName("Box 1165")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-50.25f, 1.5f, -13).setRotationAngle(0, 0, -0).setName("Box 1456")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 1, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-50.25f, 1.5f, -12.5f).setRotationAngle(0, 0, -0).setName("Box 1163")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 7, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-41.75f, -25.5f, -13).setRotationAngle(0, 0, -0).setName("Box 399")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 7, 1, 0, 0, 0, -0.5f, 0, -4.5f, -0.5f, 0, -4.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.25f, -25.5f, -13).setRotationAngle(0, 0, -0).setName("Box 400")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -3.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-42.75f, -25.5f, -13).setRotationAngle(0, 0, -0).setName("Box 408")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1.25f, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-43.75f, -22, -13).setRotationAngle(0, 0, -0).setName("Box 409")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.25f, 0, -0.5f, -1.6f, -0.5f, 0, -1.6f, -0.5f, 0, -1.6f, 0, 0, -1.6f, 0)
			.setRotationPoint(-48.75f, -19.400002f, -13).setRotationAngle(0, 0, -0).setName("Box 412")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -1.6f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -1.6f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.75f, -21, -13).setRotationAngle(0, 0, -0).setName("Box 413")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 7, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-41.75f, -25.5f, 11.5f).setRotationAngle(0, 0, -0).setName("Box 404")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -3.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-42.75f, -25.5f, 11.5f).setRotationAngle(0, 0, -0).setName("Box 405")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1.25f, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-43.75f, -22, 11.5f).setRotationAngle(0, 0, -0).setName("Box 406")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -1.6f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -1.6f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.75f, -21, 11.5f).setRotationAngle(0, 0, -0).setName("Box 407")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 7, 1, 0, 0, 0, -0.5f, 0, -4.5f, -0.5f, 0, -4.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.25f, -25.5f, 11.5f).setRotationAngle(0, 0, -0).setName("Box 409")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 23, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(23.25f, -21, 11.5f).setRotationAngle(0, 0, -0).setName("Box 410")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 23, 25, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(50.25f, -21, -12.5f).setRotationAngle(0, 0, -0).setName("Box 411")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 27, 0, -0.5f, 0, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(51.25f, 1.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 412")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 27, 0, -0.5f, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f, -0.5f, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -1)
			.setRotationPoint(-51.25f, 1.5f, -13.5f).setRotationAngle(0, 0, -0).setName("Box 413")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-50.25f, 1.5f, 12.5f).setRotationAngle(0, 0, -0).setName("Box 406")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 47, 1, 24, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.25f, -20.5f, -12).setRotationAngle(0, 0, -0).setName("Box 1218")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 28, 25, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f)
			.setRotationPoint(3.25f, -25.5f, -12.5f).setRotationAngle(0, 0, -0).setName("Box 408")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 25, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-42.25f, -25.5f, -12.5f).setRotationAngle(0, 0, -0).setName("Box 409")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 7, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(-49.25f, -19, -12.5f).setRotationAngle(0, 0, -0).setName("Box 410")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 7, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
			.setRotationPoint(-49.25f, -19, 5.5f).setRotationAngle(0, 0, -0).setName("Box 411")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 21, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-48.75f, -19, -6.5f).setRotationAngle(0, 0, -0).setName("Box 411")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 21, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-48.75f, -19, 5).setRotationAngle(0, 0, -0).setName("Box 412")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 8, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.25f, -19, -12.5f).setRotationAngle(0, 0, -0).setName("Box 413")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 8, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-42.25f, -19, 4).setRotationAngle(0, 0, -0).setName("Box 414")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-47.75f, -18.849998f, -12).setRotationAngle(0, 0, -0).setName("Box 415")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0)
			.setRotationPoint(-47.75f, -18.849998f, 6).setRotationAngle(0, 0, -0).setName("Box 416")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 23, 1, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(23.25f, -21, -12.5f).setRotationAngle(0, 0, -0).setName("Box 417")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 72, 21, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-48.75f, -19, 12).setRotationAngle(0, 0, -0).setName("Box 418")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, 0, -1.6f, 0, 0, -1.6f, 0, 0, -1.6f, -0.5f, -0.5f, -1.6f, -0.5f)
			.setRotationPoint(-48.75f, -19.400002f, 12).setRotationAngle(0, 0, -0).setName("Box 419")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-52.25f, -7, -4.5f).setRotationAngle(0, 0, -0).setName("Box 417")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 11, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-48.75f, -6.5f, -5.5f).setRotationAngle(0, 0, -0).setName("Box 419")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 25, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-42.25f, -6.5f, -12.5f).setRotationAngle(0, 0, -0).setName("Box 420")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1.5f, -0.5f, -0.5f, -1.5f)
			.setRotationPoint(-42.25f, -19, -5).setRotationAngle(0, 0, -0).setName("Box 421")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-42.25f, -19, 3).setRotationAngle(0, 0, -0).setName("Box 422")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setRotationPoint(-52, -6.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 423")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, -1, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, -1, -0.5f, 0, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-52.25f, -7, -5.5f).setRotationAngle(0, 0, -0).setName("Box 424")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -1, 0, 0, 0, -0.5f, 0, -0.05f, -0.5f, 0, -0.05f, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-52.25f, -7, 4.5f).setRotationAngle(0, 0, -0).setName("Box 425")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 22, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(51.25f, -22.5f, 7).setRotationAngle(0, 0, -0).setName("Box 379")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 105, textureX, textureY)
			.addShapeBox(0, 0, -0.1f, 1, 22, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(51.25f, -22.5f, 13.5f).setRotationAngle(0, -225, -0).setName("Box 389")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(48.75f, -22.5f, 7).setRotationAngle(0, 0, -0).setName("Box 394")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(48.75f, -23, 6.5f).setRotationAngle(0, 0, -0).setName("Box 395")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -19.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 1200")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -19.5f, 4).setRotationAngle(0, 0, -0).setName("Box 1201")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 73, textureX, textureY)
			.addShapeBox(0, 0, -0.1f, 2, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(51.25f, -1.5f, 13.5f).setRotationAngle(0, -225, -0).setName("Box 1204")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 73, textureX, textureY)
			.addShapeBox(0, 0, -0.1f, 2, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(51.25f, -22.5f, 13.5f).setRotationAngle(0, -225, -0).setName("Box 1205")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 73, textureX, textureY)
			.addShapeBox(1.5f, 0, -0.1f, 1, 3, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(51.25f, -22.5f, 13.5f).setRotationAngle(0, -225, -0).setName("Box 1206")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(46.75f, -22, -3.75f).setRotationAngle(0, 0, -0).setName("Box 1230")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(46.75f, -22, 3.25f).setRotationAngle(0, 0, -0).setName("Box 1231")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(46.75f, -22.5f, -3.75f).setRotationAngle(0, 0, -0).setName("Box 1232")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 81, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(52.25f, 2.1499996f, -1).setRotationAngle(0, 0, -0).setName("Box 1426")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 81, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(53.75f, 5.25f, -2.4f).setRotationAngle(0, 0, -0).setName("Box 1427")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 81, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(53.75f, 3.25f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1428")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 81, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.5f, 1.5f, 0, -0.5f, 1.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 2, -0.5f, -0.5f, 2, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(51.25f, 2.75f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1429")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(52.75f, -0.5f, -9).setRotationAngle(0, 0, -0).setName("Box 1430")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -1.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -1.5f, 0, 0)
			.setRotationPoint(51.25f, 0.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1431")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(52.75f, 0, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1432")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, -1.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -1.5f, 0, 0)
			.setRotationPoint(51.25f, 0.5f, 8).setRotationAngle(0, 0, -0).setName("Box 1433")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(52.75f, 0, 8).setRotationAngle(0, 0, -0).setName("Box 1434")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(51.259995f, 1.25f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1435")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(52.75f, 0, -0.75f).setRotationAngle(0, 0, -0).setName("Box 1436")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(51.259995f, 1.25f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1437")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, -1, -1, 0)
			.setRotationPoint(49.5f, 1.2600002f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1438")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(51.5f, 1.5f, 1.5f).setRotationAngle(0, 0, -0).setName("Box 1439")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(51.5f, 3.5f, 1.5f).setRotationAngle(0, 0, -0).setName("Box 1440")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f)
			.setRotationPoint(51.5f, 1.25f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 1441")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f)
			.setRotationPoint(51.5f, 1.25f, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1442")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(51.5f, 1.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1443")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(51.5f, 3.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1444")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f)
			.setRotationPoint(51.259995f, 4, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1445")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f)
			.setRotationPoint(51.5f, 4, 0.5f).setRotationAngle(0, 0, -0).setName("Box 1446")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.2f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, -0.2f, -0.4f, -0.5f, 0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, -0.5f, 0.5f, -0.4f)
			.setRotationPoint(51.5f, 4, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1447")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 105, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 16, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-46.75f, -16.5f, -13.5f).setRotationAngle(0, -90, -0).setName("Box 1459")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 81, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-46.75f, -1.5f, -13.5f).setRotationAngle(0, -90, -0).setName("Box 1461")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 81, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-46.75f, -16.5f, -13.5f).setRotationAngle(0, -90, -0).setName("Box 1462")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 97, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 12, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-49.75f, -14.5f, -7.7799997f).setRotationAngle(0, 0, -0).setName("Box 1466")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-49.75f, -14.5f, -8).setRotationAngle(0, 0, -0).setName("Box 1467")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-49.75f, -3.5f, -8).setRotationAngle(0, 0, -0).setName("Box 1468")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-49.75f, -3.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 1469")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-49.75f, -14.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 1470")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 113, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 12, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(-49.75f, -14.5f, 6.7200003f).setRotationAngle(0, 0, -0).setName("Box 1471")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(34.25f, -21, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1473")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(34.25f, -21, -3.5f).setRotationAngle(0, 0, -0).setName("Box 1474")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f)
			.setRotationPoint(34.25f, -21, 2.5f).setRotationAngle(0, 0, -0).setName("Box 1475")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(40.25f, -21, -1.5f).setRotationAngle(0, 0, -0).setName("Box 1476")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(40.25f, -21, -2.5f).setRotationAngle(0, 0, -0).setName("Box 1477")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f)
			.setRotationPoint(40.25f, -21, 1.5f).setRotationAngle(0, 0, -0).setName("Box 1478")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(35.75f, -22.25f, -1.75f).setRotationAngle(0, 0, -0).setName("Box 1480")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(35.75f, -21.75f, -1.75f).setRotationAngle(0, 0, -0).setName("Box 1481")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(35.75f, -21.75f, 1.25f).setRotationAngle(0, 0, -0).setName("Box 1482")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(41.75f, -22.25f, -1.25f).setRotationAngle(0, 0, -0).setName("Box 1483")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(41.75f, -21.75f, -1.25f).setRotationAngle(0, 0, -0).setName("Box 1484")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(41.75f, -21.75f, 0.75f).setRotationAngle(0, 0, -0).setName("Box 1485")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, 0, -0.5f)
			.setRotationPoint(51.25f, -9, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1510")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -9, 0).setRotationAngle(0, 0, -0).setName("Box 1511")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -9, -9.5f).setRotationAngle(0, 0, -0).setName("Box 1512")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 121, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 16, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.75f, -16.5f, 12.5f).setRotationAngle(0, -90, -0).setName("Box 499")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 113, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-46.75f, -1.5f, 12).setRotationAngle(0, -90, -0).setName("Box 500")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 113, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-46.75f, -16.5f, 12).setRotationAngle(0, -90, -0).setName("Box 501")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, -0.5f, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(51.25f, -19.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 502")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -16.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 503")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -16.5f, 4).setRotationAngle(0, 0, -0).setName("Box 504")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -13.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 505")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -13.5f, 4).setRotationAngle(0, 0, -0).setName("Box 506")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -10.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 507")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -10.5f, 4).setRotationAngle(0, 0, -0).setName("Box 508")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -7.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 509")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -7.5f, 4).setRotationAngle(0, 0, -0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -4.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -4.5f, 4).setRotationAngle(0, 0, -0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -1.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, -1.5f, 4).setRotationAngle(0, 0, -0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.75f, -19, 4.5f).setRotationAngle(0, 0, -0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.75f, -16.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 516")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.75f, -13.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.75f, -10.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 518")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.75f, -7.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 519")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.75f, -4.5f, 4.5f).setRotationAngle(0, 0, -0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.75f, -2, 4.5f).setRotationAngle(0, 0, -0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 129, textureX, textureY)
			.addShapeBox(0, 0, -0.05f, 2, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(52.25f, -1.5f, -12.5f).setRotationAngle(0, -135, -0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 145, textureX, textureY)
			.addShapeBox(0, 0, -0.05f, 1, 22, 1, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(52.25f, -22.5f, -12.5f).setRotationAngle(0, -135, -0).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 129, textureX, textureY)
			.addShapeBox(1.5f, 0, -0.05f, 1, 3, 1, 0, -0.5f, -0.5f, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0)
			.setRotationPoint(52.25f, -22.5f, -12.5f).setRotationAngle(0, -135, -0).setName("Box 524")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 129, textureX, textureY)
			.addShapeBox(0, 0, -0.05f, 2, 2, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(52.25f, -22.5f, -12.5f).setRotationAngle(0, -135, -0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 3, 9, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -6.5f, -12.25f).setRotationAngle(0, 0, -0).setName("Box 510")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 3, 9, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -6.5f, 3.25f).setRotationAngle(0, 0, -0).setName("Box 511")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 169, textureX, textureY).addBox(0, 0, 0, 46, 5, 9)
			.setRotationPoint(-42, -3.5f, -12.25f).setRotationAngle(0, 0, -0).setName("Box 512")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 177, textureX, textureY).addBox(0, 0, 0, 46, 5, 9)
			.setRotationPoint(-42, -3.5f, 3.25f).setRotationAngle(0, 0, -0).setName("Box 513")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 185, textureX, textureY).addBox(0, 0, 0, 46, 1, 7)
			.setRotationPoint(-42, 0.5f, -3.75f).setRotationAngle(0, 0, -0).setName("Box 514")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 3, 9, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, -6.5f, -11.75f).setRotationAngle(0, -90, -0).setName("Box 515")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 145, textureX, textureY).addBox(0, 0, 0, 7, 4, 9)
			.setRotationPoint(4, -3.5f, -3.75f).setRotationAngle(0, -90, -0).setName("Box 517")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.25f, -20.25f, -10.25f).setRotationAngle(0, 0, -0).setName("Box 518")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f)
			.setRotationPoint(-46.75f, -19, -7.5f).setRotationAngle(0, 0, -0).setName("Box 519")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.75f, -19, -10.5f).setRotationAngle(0, 0, -0).setName("Box 520")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.75f, -19, -11.5f).setRotationAngle(0, 0, -0).setName("Box 521")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.25f, -20.25f, 7.75f).setRotationAngle(0, 0, -0).setName("Box 522")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f)
			.setRotationPoint(-46.75f, -19, 10.5f).setRotationAngle(0, 0, -0).setName("Box 523")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.75f, -19, 7.5f).setRotationAngle(0, 0, -0).setName("Box 524")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.75f, -19, 6.5f).setRotationAngle(0, 0, -0).setName("Box 525")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 526")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 527")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 528")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 529")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 530")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 531")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 532")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 533")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 534")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 535")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 536")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 537")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 538")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 539")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 540")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 541")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 542")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 543")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 185, textureX, textureY).addBox(0, 0, 0, 37, 1, 1)
			.setRotationPoint(-41.25f, -2, -0.5f).setRotationAngle(0, 0, -0).setName("Box 544")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 169, textureX, textureY).addBox(0, 0, 0, 4, 3, 3)
			.setRotationPoint(-54.25f, -3, -1.5f).setRotationAngle(0, 0, -0).setName("Box 546")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 129, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(51.25f, -16, -0.5f).setRotationAngle(0, 0, -0).setName("Box 1233")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(51.25f, -16, -1).setRotationAngle(0, 0, -0).setName("Box 1234")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(51.25f, -16, 0).setRotationAngle(0, 0, -0).setName("Box 1235")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 49, textureX, textureY).addBox(0, 0, 0, 1, 0, 1)
			.setRotationPoint(52.25f, -16, -0.5f).setRotationAngle(0, 0, -0).setName("Box 1236")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(52.25f, -16, 0).setRotationAngle(0, 0, -0).setName("Box 1237")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(52.25f, -16, -1).setRotationAngle(0, 0, -0).setName("Box 1238")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 169, textureX, textureY).addBox(0, 0, 0, 5, 1, 3)
			.setRotationPoint(-6.25f, 3, -3).setRotationAngle(0, 0, -0).setName("Box 1485")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-6.25f, 4, -3).setRotationAngle(0, 0, -0).setName("Box 1486")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.25f, 2, -3).setRotationAngle(0, 0, -0).setName("Box 1487")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-0.25f, 4, -1).setRotationAngle(0, 0, -0).setName("Box 1491")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 185, textureX, textureY).addBox(0, 0, 0, 7, 1, 3)
			.setRotationPoint(-0.25f, 3, -1).setRotationAngle(0, 0, -0).setName("Box 1492")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.25f, 2, -1).setRotationAngle(0, 0, -0).setName("Box 1493")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-14.5f, 2, -2.25f).setRotationAngle(0, 0, -0).setName("Box 1494")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-14.5f, 2, -0.25f).setRotationAngle(0, 0, -0).setName("Box 1495")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 153, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(49.25f, 2, 12.3f).setRotationAngle(0, -90, -0).setName("Box 1502")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 161, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, 4, 11.8f).setRotationAngle(0, -90, -0).setName("Box 1503")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 161, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.25f, 2, 12.3f).setRotationAngle(0, -90, -0).setName("Box 1504")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 169, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, 6, 11.8f).setRotationAngle(0, -90, -0).setName("Box 1505")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 169, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-49.25f, 2, 12.3f).setRotationAngle(0, -90, -0).setName("Box 563")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 177, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-47.75f, 4, 11.8f).setRotationAngle(0, -90, -0).setName("Box 564")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 177, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.25f, 2, 12.3f).setRotationAngle(0, -90, -0).setName("Box 565")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-47.75f, 6, 11.8f).setRotationAngle(0, -90, -0).setName("Box 566")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-49.25f, 2, -12.799999f).setRotationAngle(0, -90, -0).setName("Box 567")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-47.75f, 4, -13.299999f).setRotationAngle(0, -90, -0).setName("Box 568")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.25f, 2, -12.799999f).setRotationAngle(0, -90, -0).setName("Box 569")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-47.75f, 6, -13.299999f).setRotationAngle(0, -90, -0).setName("Box 570")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(49.25f, 2, -12.799999f).setRotationAngle(0, -90, -0).setName("Box 571")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, 4, -13.299999f).setRotationAngle(0, -90, -0).setName("Box 572")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.25f, 2, -12.799999f).setRotationAngle(0, -90, -0).setName("Box 573")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 185, textureX, textureY)
			.addShapeBox(0, 0, -0.22f, 1, 2, 2, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(50.75f, 6, -13.299999f).setRotationAngle(0, -90, -0).setName("Box 574")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 10, 0, 0, 0, -0.25f, -0.4f, 0.3f, -0.25f, -0.4f, 0.3f, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(4.25f, -28.5f, -5).setRotationAngle(0, 0, -0).setName("Box 575")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4.75f, -28, -4.5f).setRotationAngle(0, 0, -0).setName("Box 578")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4.75f, -24, -4.5f).setRotationAngle(0, 0, -0).setName("Box 579")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4.75f, -26.5f, -4.5f).setRotationAngle(0, 0, -0).setName("Box 580")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(12.75f, -26.5f, -4.5f).setRotationAngle(0, 0, -0).setName("Box 581")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(9.25f, -26.5f, -4.5f).setRotationAngle(0, 0, -0).setName("Box 582")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4.75f, -24, 4).setRotationAngle(0, 0, -0).setName("Box 583")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4.75f, -26.5f, 4).setRotationAngle(0, 0, -0).setName("Box 584")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4.75f, -28, 4).setRotationAngle(0, 0, -0).setName("Box 585")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(9.25f, -26.5f, 4).setRotationAngle(0, 0, -0).setName("Box 586")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(12.75f, -26.5f, 4).setRotationAngle(0, 0, -0).setName("Box 587")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 9, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(4.25f, -28, -4.5f).setRotationAngle(0, 0, -0).setName("Box 588")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 3, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(13.25f, -28, -4.5f).setRotationAngle(0, 0, -0).setName("Box 589")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 3, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(13.25f, -28, 1.5f).setRotationAngle(0, 0, -0).setName("Box 590")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(13.25f, -28, -2.5f).setRotationAngle(0, 0, -0).setName("Box 591")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(13.399994f, -24.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 592")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(13.75f, -24, 1).setRotationAngle(0, 0, -0).setName("Box 593")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(13.399994f, -27.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 594")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(13.399994f, -26.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 595")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(13.399994f, -26.5f, 0.5f).setRotationAngle(0, 0, -0).setName("Box 596")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.3f, -0.75f, 0, -0.3f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(13.649994f, -21, -2.25f).setRotationAngle(0, 0, -0).setName("Box 597")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.3f, -0.75f, 0, -0.3f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(13.649994f, -24, -2.25f).setRotationAngle(0, 0, -0).setName("Box 599")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.3f, -0.75f, 0, -0.3f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(13.649994f, -27, -2.25f).setRotationAngle(0, 0, -0).setName("Box 600")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 201, textureX, textureY).addBox(0, 0, 0, 3, 5, 13)
			.setRotationPoint(-50.25f, -3.5f, -6.5f).setRotationAngle(0, 0, -0).setName("Box 598")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 41, textureX, textureY).addBox(0, 0, 0, 2, 1, 4)
			.setRotationPoint(-50.25f, 0.5f, -10.5f).setRotationAngle(0, 0, -0).setName("Box 601")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 49, textureX, textureY).addBox(0, 0, 0, 2, 1, 4)
			.setRotationPoint(-50.25f, 0.5f, 6.5f).setRotationAngle(0, 0, -0).setName("Box 602")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.25f, -19.75f, -10.25f).setRotationAngle(0, 0, -0).setName("Box 603")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.25f, -19.75f, -8.25f).setRotationAngle(0, 0, -0).setName("Box 604")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.25f, -19.75f, 7.75f).setRotationAngle(0, 0, -0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-45.25f, -19.75f, 9.75f).setRotationAngle(0, 0, -0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 201, textureX, textureY).addBox(0, 0, 0, 45, 24, 24)
			.setRotationPoint(-41.25f, -23, -12).setRotationAngle(0, 0, -0).setName("Box 605")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 209, textureX, textureY).addBox(0, 0, 0, 90, 11, 0)
			.setRotationPoint(-43.25f, -15.5f, -12.52f).setRotationAngle(0, 0, -0).setName("Box 606")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 225, textureX, textureY).addBox(0, 0, 0, 90, 11, 0)
			.setRotationPoint(-43.25f, -15.5f, 12.52f).setRotationAngle(0, 0, -0).setName("Box 607")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 201, textureX, textureY).addBox(0, 0, 0, 0, 2, 8)
			.setRotationPoint(51.270004f, -19, -4).setRotationAngle(0, 0, -0).setName("Box 608")
		);
		groups.add(group0);
	}

	ModelNWTenderFrontBogie bogie = new ModelNWTenderFrontBogie();
	ModelNWTenderRearBogie bogie2 = new ModelNWTenderRearBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		bogie2.render(entity, f, f1, f2, f3, f4, f5);
	}
}
