//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWTenderFrontBogie extends FVTMFormatBase {

	public ModelNWTenderFrontBogie(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("Riggs64");
		//
		initGroup_Frontbogie();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Frontbogie(){
		TurboList Frontbogie = new TurboList("Frontbogie");
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 33, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.25f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 1253")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 97, 1, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-45.25f, 4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1275")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 193, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-42.25f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 346")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 225, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 347")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 257, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 348")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 289, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-43.25f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 349")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 217, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.75f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 358")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 225, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 362")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 233, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 363")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 297, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 5.1100006f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 371")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 313, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 4.75f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 372")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 321, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 4.3999996f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 329, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 4.0600014f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 374")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 345, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 3.6800003f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 375")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 353, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 3.3100014f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 376")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 361, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-38.149994f, 3.83f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 377")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 457, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.75f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 473, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 389")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 489, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 390")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 505, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 391")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 65, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 685")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 73, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-41.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 686")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 81, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-44.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 89, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-44.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 688")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 97, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 689")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 105, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-41.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 690")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 113, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-41.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 691")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 121, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 692")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 129, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-45.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 693")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 137, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-45.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 694")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 145, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 695")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 153, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-41.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 696")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 329, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.5f, 4, -7.1000004f).setRotationAngle(0, 0, 0).setName("Box 441")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 57, 17, textureX, textureY).addBox(0, 0, 0, 25, 4, 0)
			.setRotationPoint(-44.75f, 4, -6.5f).setRotationAngle(0, 0, 0).setName("Box 450")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 89, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 327")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 97, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.75f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 328")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 105, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.25f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 329")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 129, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 330")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 1, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.25f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 1241")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 81, 1, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-35.25f, 4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1274")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 321, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-32.25f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 350")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 353, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 351")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 385, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 352")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 417, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-33.25f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 353")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 449, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-22.25f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 354")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 481, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 355")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 356")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 33, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-23.25f, 7, -7).setRotationAngle(0, 0, 0).setName("Box 357")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 249, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 364")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 257, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 365")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 265, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 366")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 281, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 367")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 385, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 5.1100006f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 381")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 393, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 4.75f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 382")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 409, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 4.3999996f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 383")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 417, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 4.0600014f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 384")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 425, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 3.6800003f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 385")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 441, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 3.3100014f, -6.8999996f).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 449, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-28.149994f, 3.83f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 387")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 392")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 9, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 393")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 25, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 41, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 57, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.75f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 396")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 161, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 422")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 169, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 423")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 177, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 424")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 185, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 425")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 193, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-34.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 426")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 201, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-34.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 427")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 217, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-35.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 428")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 225, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 429")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 249, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 430")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 233, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 431")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 257, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 265, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-21.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 281, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-21.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 289, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-24.25f, 4.25f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 435")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 297, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-24.25f, 4.5f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 436")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 313, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-25.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 437")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 321, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 438")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 345, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-21.25f, 4, -7.05f).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 353, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 442")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 361, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 443")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 377, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-35.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 444")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 385, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-21.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 445")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 393, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 446")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 409, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-25.25f, 3.75f, -7.05f).setRotationAngle(0, 0, 0).setName("Box 447")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 417, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, 4, -7.1000004f).setRotationAngle(0, 0, 0).setName("Box 448")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 425, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.5f, 4, -7.1000004f).setRotationAngle(0, 0, 0).setName("Box 449")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 65, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.75f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 324")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 105, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43.25f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 325")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 137, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.25f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 331")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 161, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 332")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 169, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.75f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 333")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 161, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(-19.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 334")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 321, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.75f, 6, -6).setRotationAngle(0, 0, 0).setName("Box 343")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 281, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, -1, 0)
			.setRotationPoint(-45.25f, 8, -7).setRotationAngle(0, 0, 0).setName("Box 349")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 337, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.7f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.7f, 0)
			.setRotationPoint(-32.25f, 8, -7).setRotationAngle(0, 0, 0).setName("Box 350")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 65, 1, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-25.25f, 4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1273")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 361, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.75f, 2, -2.5f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 337, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.25f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 137, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.25f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 326")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 193, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-46.75f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 335")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 201, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 336")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 209, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.75f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 337")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 217, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.25f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 338")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 377, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.25f, 4, -5).setRotationAngle(0, 0, 0).setName("Box 345")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 409, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.25f, 4, -5).setRotationAngle(0, 0, 0).setName("Box 346")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 241, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-16.25f, 5, -5).setRotationAngle(0, 0, 0).setName("Box 347")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 265, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-17.25f, 5, -5).setRotationAngle(0, 0, 0).setName("Box 348")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 161, 1, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-45.25f, 4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 349")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 177, 1, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-25.25f, 4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 350")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 193, 1, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-35.25f, 4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 351")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 425, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, -1, 0)
			.setRotationPoint(-45.25f, 8, 6).setRotationAngle(0, 0, 0).setName("Box 351")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 457, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.7f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.7f, 0)
			.setRotationPoint(-32.25f, 8, 6).setRotationAngle(0, 0, 0).setName("Box 352")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 9, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 25, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-45.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 470")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 33, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-41.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 113, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-41.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 41, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 121, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-45.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 474")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 129, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-44.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 475")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 137, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 145, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-41.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 477")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 153, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-41.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 161, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 169, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-44.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 177, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 185, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-35.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 193, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 201, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 484")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 209, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 485")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 217, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-35.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 486")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 225, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-34.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 487")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 233, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 241, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 489")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 249, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-31.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 257, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 265, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-34.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 369, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 377, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.75f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 393, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 306")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 433, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.75f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 310")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 441, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.75f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 465, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 314")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 473, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 315")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 481, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 489, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 1, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, 4, 6.1f).setRotationAngle(0, 0, 0).setName("Box 320")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 17, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.5f, 4, 6.1f).setRotationAngle(0, 0, 0).setName("Box 322")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 25, 49, textureX, textureY).addBox(0, 0, 0, 25, 4, 0)
			.setRotationPoint(-44.75f, 4, 6.5f).setRotationAngle(0, 0, 0).setName("Box 323")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 113, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 5.1100006f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 1397")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 121, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 4.75f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 1398")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 129, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 4.3999996f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 1399")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 137, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 4.0600014f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 1400")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 145, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 3.6800003f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 1401")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 153, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, 3.3100014f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 1402")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 441, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 3.3100014f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 461")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 449, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 3.6800003f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 462")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 457, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 4.0600014f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 463")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 473, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 4.3999996f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 464")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 481, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 4.75f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 465")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 489, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-37.75f, 5.1100006f, 5.9f).setRotationAngle(0, 0, 0).setName("Box 466")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 505, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-28.149994f, 3.83f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 467")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 1, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-38.149994f, 3.83f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 468")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 273, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 281, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-25.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 289, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-21.25f, 3.75f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 495")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 297, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-21.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 496")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 305, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 497")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 313, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-25.25f, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 321, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-24.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 329, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 337, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-21.25f, 4.25f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 345, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-21.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 502")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 353, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 503")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 361, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-24.25f, 4.5f, 6.05f).setRotationAngle(0, 0, 0).setName("Box 504")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 305, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.25f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 298")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 401, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 307")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 409, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.75f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 425, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 449, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.75f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 457, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 313")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 497, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 318")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 505, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 319")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 9, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.5f, 4, 6.1f).setRotationAngle(0, 0, 0).setName("Box 321")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 225, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.25f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 339")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 233, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.75f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 340")
		);
		Frontbogie.add(new ModelRendererTurbo(Frontbogie, 241, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 341")
		);
		groups.add(Frontbogie);
	}

}
